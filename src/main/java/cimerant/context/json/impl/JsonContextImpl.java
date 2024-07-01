package cimerant.context.json.impl;

import cimerant.context.NotNullMap;
import cimerant.context.cimerant.ObjectRootContext;
import cimerant.context.cimerant.impl.ObjectContextImpl;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.json.JsonContext;
import cimerant.context.json.JsonRootContext;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 */
public final class JsonContextImpl extends ObjectContextImpl<Entry<String, Object>>
    implements JsonContext {
  private static final long serialVersionUID = 1L;

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param parent the context parent.
   * @param parentGroupings the context parent grouping.
   * @param entry the context entry.
   * @return a instance of the context.
   */
  public static JsonContext getInstance(
      final JsonRootContext parent,
      final List<String> parentGroupings,
      final Entry<String, Object> entry) {
    Objects.requireNonNull(entry);
    return ContextRootImpl.registerInstance(new JsonContextImpl(parent, parentGroupings, entry));
  }

  /** The list of attributes. */
  private final Map<String, Object> attributes;

  /** The list of fields. */
  private final Map<String, Object> fields = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

  /** The list of relationships. */
  private final Map<String, Object> relationships = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

  /** Creates an instance. */
  @SuppressWarnings("unchecked")
  private JsonContextImpl(
      final ObjectRootContext<?> rootContext,
      final List<String> parentGroupings,
      final Entry<String, Object> entry) {
    super(rootContext, entry);

    this.setGrouping(parentGroupings);

    final Map<String, Object> modifiableAttributes = new TreeMap<>(rootContext.getAttributes());
    modifiableAttributes.putAll(
        this.parseAttributes(new TreeMap<>((Map<String, Object>) entry.getValue())));
    this.attributes = new NotNullMap<>(Collections.unmodifiableMap(modifiableAttributes));
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

  /** Returns all attributes of this context. */
  @Override
  public Map<String, Object> getAttributes() {
    return this.attributes;
  }

  /** Returns the attribute for a field by the name of the field and attribute. */
  @Override
  @SuppressWarnings("unchecked")
  public Object getFieldAttributeByName(final String fieldName, final String attributeName) {
    if (this.fields.containsKey(fieldName)) {
      final var map = (Map<String, Object>) this.fields.get(fieldName);
      if (map.containsKey(attributeName)) {
        return map.get(attributeName);
      }
    }
    return null;
  }

  /**
   * Returns the attribute for a field by the name of the field and attribute supplying a default
   * value if the attribute is not found.
   */
  @Override
  @SuppressWarnings("unchecked")
  public Object getFieldAttributeByName(
      final String fieldName, final String attributeName, final Object defaultValue) {
    if (this.fields.containsKey(fieldName)) {
      final var map = (Map<String, Object>) this.fields.get(fieldName);
      if (map.containsKey(attributeName)) {
        return map.get(attributeName);
      }
    }
    return defaultValue;
  }

  /** Returns the field of this context by the name of the field. */
  @Override
  public Object getFieldByName(final String name) {
    if (this.fields.containsKey(name)) {
      return this.fields.get(name);
    }
    return null;
  }

  /** Returns all fields of this context. */
  @Override
  public Map<String, Object> getFields() {
    return this.fields;
  }

  /** Returns the attribute for a relationship by the name of the relationship and attribute. */
  @Override
  @SuppressWarnings("unchecked")
  public Object getRelationshipAttributeByName(
      final String relationshipName, final String attributeName) {
    if (this.relationships.containsKey(relationshipName)) {
      final var map = (Map<String, Object>) this.relationships.get(relationshipName);
      if (map.containsKey(attributeName)) {
        return map.get(attributeName);
      }
    }
    return null;
  }

  /**
   * Returns the attribute for a relationship by the name of the relationship and attribute
   * supplying a default value if the attribute is not found.
   */
  @Override
  @SuppressWarnings("unchecked")
  public Object getRelationshipAttributeByName(
      final String relationshipName, final String attributeName, final Object defaultValue) {
    if (this.relationships.containsKey(relationshipName)) {
      final var map = (Map<String, Object>) this.relationships.get(relationshipName);
      if (map.containsKey(attributeName)) {
        return map.get(attributeName);
      }
    }
    return defaultValue;
  }

  /** Returns the relationship of this context by the name of the relationship. */
  @Override
  public Object getRelationshipByName(final String name) {
    if (this.relationships.containsKey(name)) {
      return this.relationships.get(name);
    }
    return null;
  }

  /** Returns all relationship of this context. */
  @Override
  public Map<String, Object> getRelationships() {
    return this.relationships;
  }

  /** Returns {@code true} if this context contains a attribute for the specified name. */
  @Override
  public boolean hasAttributeByName(final String name) {
    return this.attributes.containsKey(name);
  }

  /**
   * Returns {@code true} if the context has the value to which the specified key is mapped, or
   * {@code null} if this context contains no mapping for the key.
   */
  @Override
  @SuppressWarnings("unchecked")
  public boolean hasFieldAttributeByName(final String fieldName, final String attributeName) {
    if (this.fields.containsKey(fieldName)) {
      final var map = (Map<String, Object>) this.fields.get(fieldName);
      return map.containsKey(attributeName);
    }
    return false;
  }

  /** Returns {@code true} if this context contains a field for the specified name. */
  @Override
  public boolean hasFieldByName(final String name) {
    return this.fields.containsKey(name);
  }

  /**
   * Returns {@code true} if the context has the value to which the specified key is mapped, or
   * {@code null} if this context contains no mapping for the key.
   */
  @Override
  @SuppressWarnings("unchecked")
  public boolean hasRelationshipAttributeByName(
      final String relationshipName, final String attributeName) {
    if (this.relationships.containsKey(relationshipName)) {
      final var map = (Map<String, Object>) this.relationships.get(relationshipName);
      return map.containsKey(attributeName);
    }
    return false;
  }

  /** Returns {@code true} if this context contains a relationship for the specified name. */
  @Override
  public boolean hasRelationshipByName(final String name) {
    return this.relationships.containsKey(name);
  }

  @SuppressWarnings("unchecked")
  private Map<String, Object> parseAttributes(final Map<String, Object> map) {
    final Map<String, Object> modifiableAttributes = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    for (final Entry<String, Object> mapEntry : map.entrySet()) {
      switch (CimerantKeys.valueOf(mapEntry)) {
        case CIMERANT_ATTRIBUTES:
          if (Map.class.isAssignableFrom(mapEntry.getValue().getClass())) {
            modifiableAttributes.putAll(new TreeMap<>((Map<String, Object>) mapEntry.getValue()));
          } else {
            modifiableAttributes.put(mapEntry.getKey(), mapEntry.getValue());
          }
          break;
        case CIMERANT_TYPE:
          switch (CimerantTypes.valueOf(mapEntry)) {
            case FIELD:
              this.fields.put(
                  mapEntry.getKey(),
                  new NotNullMap<>(
                      Collections.unmodifiableMap((Map<String, Object>) mapEntry.getValue())));
              break;
            case RELATIONSHIP:
              this.relationships.put(
                  mapEntry.getKey(),
                  new NotNullMap<>(
                      Collections.unmodifiableMap((Map<String, Object>) mapEntry.getValue())));
              break;
            default:
              if (Map.class.isAssignableFrom(mapEntry.getValue().getClass())) {
                modifiableAttributes.putAll(
                    this.parseAttributes(new TreeMap<>((Map<String, Object>) mapEntry.getValue())));
              } else {
                modifiableAttributes.put(mapEntry.getKey(), mapEntry.getValue());
              }
              break;
          }
          break;
        default:
          if (Map.class.isAssignableFrom(mapEntry.getValue().getClass())) {
            modifiableAttributes.putAll(
                this.parseAttributes(new TreeMap<>((Map<String, Object>) mapEntry.getValue())));
          } else if (!CimerantKeys.isValidKey(mapEntry.getKey())) {
            modifiableAttributes.put(mapEntry.getKey(), mapEntry.getValue());
          }
          break;
      }
    }

    return modifiableAttributes;
  }
}
