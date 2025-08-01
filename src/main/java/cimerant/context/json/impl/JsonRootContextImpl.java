package cimerant.context.json.impl;

import cimerant.Cimerant;
import cimerant.CliVariableList;
import cimerant.ModuleCode;
import cimerant.StatusCode;
import cimerant.SysError;
import cimerant.context.NotNullSet;
import cimerant.context.cimerant.ObjectAttributeList;
import cimerant.context.cimerant.ObjectContext;
import cimerant.context.cimerant.impl.ObjectAttributeListImpl;
import cimerant.context.cimerant.impl.ObjectRootContextImpl;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.json.JsonRootContext;
import cimerant.logger.CimerantLogger;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.Serial;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import org.apache.commons.lang3.Strings;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 */
public final class JsonRootContextImpl extends ObjectRootContextImpl<Map<String, Object>>
    implements JsonRootContext {
  private static final CimerantLogger logger;
  @Serial private static final long serialVersionUID = 1L;

  static {
    logger = CimerantLogger.getLogger(JsonRootContextImpl.class.getName());
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param file the context map.
   * @param cliVariableList the context list of command-line interface variables.
   * @return a instance of the context.
   */
  public static JsonRootContext getInstance(
      final File file, final CliVariableList cliVariableList) {
    final var moduleCode = ModuleCode.ERR_M0600;

    try {
      Objects.requireNonNull(file);
      Objects.requireNonNull(cliVariableList);

      final var objectMapper = new ObjectMapper();
      final Map<String, Object> map = objectMapper.readValue(file, new TypeReference<>() {});

      final ObjectAttributeList attributes = new ObjectAttributeListImpl();
      final List<ObjectContext<Entry<String, Object>>> objects = new ArrayList<>();
      final List<Entry<String, Object>> entities = new ArrayList<>();
      final List<Entry<String, Object>> groupings = new ArrayList<>();

      JsonRootContextImpl.parseMap(map, cliVariableList, attributes, entities, groupings);

      return ContextRootImpl.registerInstance(
          new JsonRootContextImpl(map, attributes, entities, groupings, objects));
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (JsonRootContextImpl.logger.isDebugEnabled()) {
        JsonRootContextImpl.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  @SuppressWarnings({"unchecked"})
  private static void parseGroupings(
      final List<String> parentGroupings,
      final JsonRootContext parent,
      final ObjectAttributeList parentAttributes,
      final Entry<String, Object> contextObject,
      final List<ObjectContext<Entry<String, Object>>> objects) {
    parentGroupings.add(contextObject.getKey());
    final var map = (Map<String, Object>) contextObject.getValue();

    final List<Entry<String, Object>> entities = new ArrayList<>();
    final List<Entry<String, Object>> groupings = new ArrayList<>();

    for (final Entry<String, Object> mapEntry : map.entrySet()) {
      switch (CimerantKeys.valueOf(mapEntry)) {
        case CIMERANT_ATTRIBUTES:
          if (mapEntry.getValue() instanceof final Map mapEntryValue) {
            parentAttributes.putAll(mapEntryValue);
          } else {
            parentAttributes.put(mapEntry.getKey(), NotNullSet.getInstance(mapEntry.getValue()));
          }
          break;
        case CIMERANT_TYPE:
          switch (CimerantTypes.valueOf(mapEntry)) {
            case ENTITY:
              entities.add(mapEntry);
              break;
            case GROUPING:
              groupings.add(mapEntry);
              break;
            default:
              parentAttributes.put(mapEntry.getKey(), NotNullSet.getInstance(mapEntry.getValue()));
              break;
          }
          break;
        default:
          if (!"cimerant:type".equals(mapEntry.getKey())) {
            parentAttributes.put(mapEntry.getKey(), NotNullSet.getInstance(mapEntry.getValue()));
          }
          break;
      }
    }
    for (final var entity : entities) {
      objects.add(JsonContextImpl.getInstance(entity, parent, new ArrayList<>(parentGroupings)));
    }
    for (final var grouping : groupings) {
      JsonRootContextImpl.parseGroupings(
          new ArrayList<>(parentGroupings), parent, parentAttributes, grouping, objects);
    }
  }

  private static void parseMap(
      final Map<String, Object> contextObject,
      final CliVariableList cliVariableList,
      final ObjectAttributeList attributes,
      final List<Entry<String, Object>> entities,
      final List<Entry<String, Object>> groupings) {
    for (final Entry<String, Object> entry : contextObject.entrySet()) {
      switch (CimerantKeys.valueOf(entry)) {
        case CIMERANT_ATTRIBUTES:
          if (entry.getValue() instanceof final Map<?, ?> map) {
            attributes.putAll((Map<? extends String, ? extends NotNullSet>) map);
          }
          break;
        case CIMERANT_TYPE:
          switch (CimerantTypes.valueOf(entry)) {
            case ENTITY:
              entities.add(entry);
              break;
            case GROUPING:
              groupings.add(entry);
              break;
            default:
              attributes.put(entry.getKey(), NotNullSet.getInstance(entry.getValue()));
              break;
          }
          break;
        default:
          attributes.put(entry.getKey(), NotNullSet.getInstance(entry.getValue()));
          break;
      }
    }

    for (final CliVariableList.CliVariable cliVariable : cliVariableList) {
      attributes.put(cliVariable.getKey(), NotNullSet.getInstance(cliVariable.getValue()));
    }
  }

  /** Creates an instance. */
  private JsonRootContextImpl(
      final Map<String, Object> contextObject,
      final ObjectAttributeList attributes,
      final List<Entry<String, Object>> entities,
      final List<Entry<String, Object>> groupings,
      final List<ObjectContext<Entry<String, Object>>> objects) {
    super(contextObject, attributes);

    for (final var entity : entities) {
      objects.add(JsonContextImpl.getInstance(entity, this, new ArrayList<>()));
    }

    for (final var grouping : groupings) {
      JsonRootContextImpl.parseGroupings(new ArrayList<>(), this, attributes, grouping, objects);
    }

    for (var object : objects) {
      for (var relationship : object.getRelationships().values()) {
        var otherEntityRelationshipName = relationship.get("cimerant:otherEntity").first();
        objects.stream()
            .filter(
                otherEntity ->
                    Strings.CI.equals(otherEntityRelationshipName, otherEntity.getObjectName()))
            .forEach(
                otherEntity -> {
                  relationship.setOtherEntity(otherEntity);
                  relationship.remove("cimerant:otherEntity");
                });
      }
    }

    this.objects = objects;
  }
}
