package cimerant.context.json.impl;

import cimerant.CliVariableList;
import cimerant.context.NotNullMap;
import cimerant.context.cimerant.impl.ObjectRootContextImpl;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.json.JsonContext;
import cimerant.context.json.JsonRootContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 */
public final class JsonRootContextImpl extends ObjectRootContextImpl<Map<String, Object>>
    implements JsonRootContext {
  private static final long serialVersionUID = 1L;

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param map the context map.
   * @param cliVariableList the context list of command-line interface variables.
   * @return a instance of the context.
   */
  public static JsonRootContext getInstance(
      final Map<String, Object> map, final CliVariableList cliVariableList) {
    Objects.requireNonNull(map);
    Objects.requireNonNull(cliVariableList);
    return ContextRootImpl.registerInstance(new JsonRootContextImpl(map, cliVariableList));
  }

  /** The list of attributes. */
  private final Map<String, Object> attributes;

  /** The list of objects. */
  private final List<JsonContext> objects = new ArrayList<>();

  /** Creates an instance. */
  @SuppressWarnings({"unchecked", "JdkObsolete"})
  private JsonRootContextImpl(
      final Map<String, Object> contextObject, final CliVariableList cliVariableList) {
    super(contextObject);
    Objects.requireNonNull(cliVariableList);

    final Map<String, Object> modifiableAttributes = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    final List<Entry<String, Object>> entities = new ArrayList<>();
    final List<Entry<String, Object>> groupings = new ArrayList<>();

    for (final Entry<String, Object> entry : this.getContextObject().entrySet()) {
      switch (CimerantKeys.valueOf(entry)) {
        case CIMERANT_ATTRIBUTES:
          modifiableAttributes.putAll((Map<String, Object>) entry.getValue());
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
              modifiableAttributes.put(entry.getKey(), entry.getValue());
              break;
          }
          break;
        default:
          modifiableAttributes.put(entry.getKey(), entry.getValue());
          break;
      }
    }

    for (final CliVariableList.CliVariable cliVariable : cliVariableList) {
      modifiableAttributes.put(cliVariable.getKey(), cliVariable.getValue());
    }

    this.attributes = new NotNullMap<>(Collections.unmodifiableMap(modifiableAttributes));

    for (final var entity : entities) {
      this.objects.add(JsonContextImpl.getInstance(this, new LinkedList<>(), entity));
    }

    for (final var grouping : groupings) {
      this.parseGroupings(new LinkedList<>(), new TreeMap<>(this.attributes), grouping);
    }
  }

  /**
   * Returns the attribute to which the specified name is mapped, or {@code null} if this context
   * contains no mapping for the name.
   */
  @Override
  public Object getAttributeByName(final String name) {
    if (this.attributes.containsKey(name)) {
      return this.attributes.get(name);
    }
    return null;
  }

  /**
   * Returns the attribute of this context by the name of the attribute supplying a default value if
   * the attribute is not found.
   */
  @Override
  public Object getAttributeByName(final String name, final Object defaultValue) {
    if (this.attributes.containsKey(name)) {
      return this.attributes.get(name);
    }
    return defaultValue;
  }

  /**
   * Returns the attribute object that maps names to values, or {@code null} if this context
   * contains no attribute object.
   */
  @Override
  public Map<String, Object> getAttributes() {
    return this.attributes;
  }

  /**
   * Returns the object that maps names to values, or {@code null} if this context contains no
   * object.
   */
  @Override
  public List<JsonContext> getObjects() {
    return this.objects;
  }

  /**
   * Returns the objects to which the specified name is mapped, or {@code null} if this context
   * contains no mapping for the name.
   */
  @Override
  public List<JsonContext> getObjectsByName(final String name) {
    Objects.requireNonNull(name);
    return this.objects.stream()
        .filter(object -> name.equalsIgnoreCase(object.getObjectName()))
        .collect(Collectors.toList());
  }

  /** Returns {@code true} if this context contains a attribute for the specified name. */
  @Override
  public boolean hasAttributeByName(final String name) {
    return this.attributes.containsKey(name);
  }

  @SuppressWarnings({"unchecked", "JdkObsolete"})
  private void parseGroupings(
      final List<String> parentGroupings,
      final Map<String, Object> parentAttributes,
      final Entry<String, Object> entry) {
    parentGroupings.add(entry.getKey());
    final var map = (Map<String, Object>) entry.getValue();

    final List<Entry<String, Object>> entities = new ArrayList<>();
    final List<Entry<String, Object>> groupings = new LinkedList<>();

    for (final Entry<String, Object> mapEntry : map.entrySet()) {
      switch (CimerantKeys.valueOf(mapEntry)) {
        case CIMERANT_ATTRIBUTES:
          if (Map.class.isAssignableFrom(mapEntry.getValue().getClass())) {
            parentAttributes.putAll((Map<String, Object>) mapEntry.getValue());
          } else {
            parentAttributes.put(mapEntry.getKey(), mapEntry.getValue());
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
              parentAttributes.put(mapEntry.getKey(), mapEntry.getValue());
              break;
          }
          break;
        default:
          parentAttributes.put(mapEntry.getKey(), mapEntry.getValue());
          break;
      }
    }
    for (final var entity : entities) {
      this.objects.add(
          JsonContextImpl.getInstance(this, new LinkedList<>(parentGroupings), entity));
    }
    for (final var grouping : groupings) {
      this.parseGroupings(
          new LinkedList<>(parentGroupings), new TreeMap<>(parentAttributes), grouping);
    }
  }
}
