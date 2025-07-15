package cimerant.context.json.impl;

import cimerant.Cimerant;
import cimerant.ModuleCode;
import cimerant.StatusCode;
import cimerant.SysError;
import cimerant.context.NotNullSet;
import cimerant.context.cimerant.ObjectAttributeList;
import cimerant.context.cimerant.ObjectFieldList;
import cimerant.context.cimerant.ObjectRelationshipList;
import cimerant.context.cimerant.ObjectRootContext;
import cimerant.context.cimerant.impl.ObjectAttributeListImpl;
import cimerant.context.cimerant.impl.ObjectContextImpl;
import cimerant.context.cimerant.impl.ObjectFieldImpl;
import cimerant.context.cimerant.impl.ObjectFieldListImpl;
import cimerant.context.cimerant.impl.ObjectRelationshipImpl;
import cimerant.context.cimerant.impl.ObjectRelationshipListImpl;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.json.JsonContext;
import cimerant.context.json.JsonRootContext;
import cimerant.logger.CimerantLogger;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 */
public final class JsonContextImpl extends ObjectContextImpl<Entry<String, Object>>
    implements JsonContext {
  private static final CimerantLogger logger;
  private static final long serialVersionUID = 1L;

  static {
    logger = CimerantLogger.getLogger(JsonContextImpl.class.getName());
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param parent the context parent.
   * @param parentGroupings the context parent grouping.
   * @param contextObject the context entry.
   * @return a instance of the context.
   */
  @SuppressWarnings("unchecked")
  public static JsonContext getInstance(
      final Entry<String, Object> contextObject,
      final JsonRootContext parent,
      final List<String> parentGroupings) {
    final var moduleCode = ModuleCode.ERR_M2000;

    try {
      Objects.requireNonNull(contextObject);
      Objects.requireNonNull(parent);
      Objects.requireNonNull(parentGroupings);

      final ObjectAttributeList attributes = new ObjectAttributeListImpl();
      final ObjectFieldList fields = new ObjectFieldListImpl();
      final ObjectRelationshipList relationships = new ObjectRelationshipListImpl();

      attributes.putAll(parent.getAttributes());

      if (contextObject.getValue() instanceof final Map entryValue) {
        JsonContextImpl.parseMap(entryValue, attributes, fields, relationships);
      }

      return ContextRootImpl.registerInstance(
          new JsonContextImpl(
              contextObject, parent, parentGroupings, attributes, fields, relationships));
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (JsonContextImpl.logger.isDebugEnabled()) {
        JsonContextImpl.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  @SuppressWarnings("unchecked")
  private static ObjectAttributeList parseMap(
      final Map<String, Object> map,
      final ObjectAttributeList attributes,
      final ObjectFieldList fields,
      final ObjectRelationshipList relationships) {
    for (final Entry<String, Object> mapEntry : map.entrySet()) {
      switch (CimerantKeys.valueOf(mapEntry)) {
        case CIMERANT_ATTRIBUTES:
          if (mapEntry.getValue() instanceof final Map mapEntryValue) {
            attributes.putAll(mapEntryValue);
          } else {
            attributes.put(mapEntry.getKey(), NotNullSet.getInstance(mapEntry.getValue()));
          }
          break;
        case CIMERANT_TYPE:
          switch (CimerantTypes.valueOf(mapEntry)) {
            case FIELD:
              fields.put(
                  mapEntry.getKey(),
                  new ObjectFieldImpl((Map<String, Object>) mapEntry.getValue()));
              break;
            case RELATIONSHIP:
              relationships.put(
                  mapEntry.getKey(),
                  new ObjectRelationshipImpl((Map<String, Object>) mapEntry.getValue()));
              break;
            default:
              if (mapEntry.getValue() instanceof final Map mapEntryValue) {
                attributes.putAll(
                    JsonContextImpl.parseMap(mapEntryValue, attributes, fields, relationships));
              } else {
                attributes.put(mapEntry.getKey(), NotNullSet.getInstance(mapEntry.getValue()));
              }
              break;
          }
          break;
        default:
          if (mapEntry.getValue() instanceof final Map mapEntryValue) {
            attributes.putAll(
                JsonContextImpl.parseMap(mapEntryValue, attributes, fields, relationships));
          } else if (!CimerantKeys.isValidKey(mapEntry.getKey())) {
            attributes.put(mapEntry.getKey(), NotNullSet.getInstance(mapEntry.getValue()));
          }
          break;
      }
    }

    return attributes;
  }

  /** Creates an instance. */
  private JsonContextImpl(
      final Entry<String, Object> contextObject,
      final ObjectRootContext<?> rootContext,
      final List<String> parentGroupings,
      final ObjectAttributeList attributes,
      final ObjectFieldList fields,
      final ObjectRelationshipList relationships) {
    super(contextObject, rootContext, parentGroupings, attributes, fields, relationships);
  }
}
