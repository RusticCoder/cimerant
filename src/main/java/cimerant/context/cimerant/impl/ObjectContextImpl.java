package cimerant.context.cimerant.impl;

import cimerant.context.NotNullSet;
import cimerant.context.cimerant.ObjectAttributeList;
import cimerant.context.cimerant.ObjectContext;
import cimerant.context.cimerant.ObjectField;
import cimerant.context.cimerant.ObjectFieldList;
import cimerant.context.cimerant.ObjectRelationship;
import cimerant.context.cimerant.ObjectRelationshipList;
import cimerant.context.cimerant.ObjectRootContext;
import cimerant.context.impl.ContextRootImpl;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 *
 * @param <E> The base type of the context.
 */
public abstract class ObjectContextImpl<E extends Entry<String, Object>> extends ContextRootImpl<E>
    implements ObjectContext<E> {
  private static final long serialVersionUID = 1L;

  /** The list of attributes. */
  private final ObjectAttributeList attributes;

  /** The list of fields. */
  private final ObjectFieldList fields;

  /** The object name. */
  private final String objectName;

  /** The list of relationships. */
  private final ObjectRelationshipList relationships;

  /** The root context. */
  private final ObjectRootContext<?> rootContext;

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   * @param rootContext A set of routines is used by the template.
   * @param parentGroupings An ordered collection of groupings for this object.
   * @param attributes Key value pair of attributes.
   * @param fields Key value pair of fields.
   * @param relationships Key value pair of relationships.
   */
  protected ObjectContextImpl(
      final E contextObject,
      final ObjectRootContext<?> rootContext,
      final List<String> parentGroupings,
      final ObjectAttributeList attributes,
      final ObjectFieldList fields,
      final ObjectRelationshipList relationships) {
    super(contextObject);
    Objects.requireNonNull(rootContext);
    Objects.requireNonNull(parentGroupings);
    Objects.requireNonNull(attributes);
    Objects.requireNonNull(fields);
    Objects.requireNonNull(relationships);

    this.objectName = contextObject.getKey();
    this.rootContext = rootContext;

    this.setGrouping(parentGroupings);

    this.attributes = attributes;
    this.fields = fields;
    this.relationships = relationships;
  }

  /**
   * Returns the attribute to which the specified name is mapped, or {@code null} if this context
   * contains no mapping for the name.
   */
  @Override
  public NotNullSet getAttributeByName(final String name) {
    if (this.attributes.containsKey(name)) {
      return NotNullSet.getInstance(this.attributes.get(name));
    }
    return NotNullSet.getInstance(null);
  }

  /**
   * Returns the attribute of this context by the name of the attribute supplying a default value if
   * the attribute is not found.
   */
  @Override
  public NotNullSet getAttributeByName(final String attributeName, final Object defaultValue) {
    return NotNullSet.getInstance(this.attributes.get(attributeName, defaultValue));
  }

  /** Returns all attributes of this context. */
  @Override
  public ObjectAttributeList getAttributes() {
    return this.attributes;
  }

  /** Returns the attribute for a field by the name of the field and attribute. */
  @Override
  public NotNullSet getFieldAttributeByName(final String fieldName, final String attributeName) {
    if (this.fields.containsKey(fieldName)) {
      final var map = this.fields.get(fieldName);
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
  public NotNullSet getFieldAttributeByName(
      final String fieldName, final String attributeName, final Object defaultValue) {
    if (this.fields.containsKey(fieldName)) {
      return this.fields.get(fieldName).get(attributeName, defaultValue);
    }
    return NotNullSet.getInstance(defaultValue);
  }

  /** Returns the field of this context by the name of the field. */
  @Override
  public ObjectField getFieldByName(final String name) {
    if (this.fields.containsKey(name)) {
      return this.fields.get(name);
    }
    return null;
  }

  /** Returns all fields of this context. */
  @Override
  public ObjectFieldList getFields() {
    return this.fields;
  }

  /**
   * Returns the name specified in the context, or {@code null} if this context contains no name.
   */
  @Override
  public String getObjectName() {
    return this.objectName;
  }

  /**
   * Returns a list of related objects with a specific name specified in the context, or {@code
   * null} if this context contains no related objects.
   */
  @Override
  public List<? extends ObjectContext<?>> getRelatedObjectsByName(final String name) {
    Objects.requireNonNull(name);

    return this.rootContext.getObjectsByName(name);
  }

  /** Returns the attribute for a relationship by the name of the relationship and attribute. */
  @Override
  public NotNullSet getRelationshipAttributeByName(
      final String relationshipName, final String attributeName) {
    if (this.relationships.containsKey(relationshipName)) {
      final var map = this.relationships.get(relationshipName);
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
  public NotNullSet getRelationshipAttributeByName(
      final String relationshipName, final String attributeName, final Object defaultValue) {
    if (this.relationships.containsKey(relationshipName)) {
      return this.relationships.get(relationshipName).get(attributeName, defaultValue);
    }
    return NotNullSet.getInstance(defaultValue);
  }

  /** Returns the relationship of this context by the name of the relationship. */
  @Override
  public ObjectRelationship getRelationshipByName(final String name) {
    if (this.relationships.containsKey(name)) {
      return this.relationships.get(name);
    }
    return null;
  }

  /** Returns all relationship of this context. */
  @Override
  public ObjectRelationshipList getRelationships() {
    return this.relationships;
  }

  /**
   * Returns the root object specified in the context, or {@code null} if this context contains no
   * root object.
   */
  @Override
  public ObjectRootContext<?> getRoot() {
    return this.rootContext;
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
  public boolean hasFieldAttributeByName(final String fieldName, final String attributeName) {
    if (this.fields.containsKey(fieldName)) {
      return this.fields.get(fieldName).containsKey(attributeName);
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
  public boolean hasRelationshipAttributeByName(
      final String relationshipName, final String attributeName) {
    if (this.relationships.containsKey(relationshipName)) {
      return this.relationships.get(relationshipName).containsKey(attributeName);
    }
    return false;
  }

  /** Returns {@code true} if this context contains a relationship for the specified name. */
  @Override
  public boolean hasRelationshipByName(final String name) {
    return this.relationships.containsKey(name);
  }
}
