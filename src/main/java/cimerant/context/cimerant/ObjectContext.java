package cimerant.context.cimerant;

import cimerant.context.ContextRoot;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Interface describing the template data context. This set of routines is used by the template to
 * set and get 'named' data object to pass them to the template engine to use when rendering a
 * template.
 *
 * @param <E> The base type of the context.
 */
public interface ObjectContext<E extends Entry<String, Object>> extends ContextRoot<E> {
  /**
   * Returns the attribute to which the specified name is mapped, or {@code null} if this context
   * contains no mapping for the name.
   *
   * @param name the name whose associated attribute to be returned.
   * @return the attribute to which the specified name is mapped, or {@code null} if this context
   *     contains no mapping for the name.
   */
  Object getAttributeByName(String name);

  /**
   * Returns the attribute of this context by the name of the attribute supplying a default value if
   * the attribute is not found.
   *
   * @param name name the name whose associated attribute to be returned.
   * @param defaultValue the attribute that is returned when an explicit attribute is not available.
   * @return the attribute of this context by the name of the attribute supplying a default value if
   *     the attribute is not found.
   */
  Object getAttributeByName(String name, Object defaultValue);

  /**
   * Returns all attributes of this context.
   *
   * @return all attributes of this context.
   */
  Map<String, Object> getAttributes();

  /**
   * Returns the attribute for a field by the name of the field and attribute.
   *
   * @param fieldName the name of the field whose associated attribute to be returned.
   * @param attributeName the name whose associated attribute to be returned.
   * @return the attribute for a field by the name of the field and attribute.
   */
  Object getFieldAttributeByName(String fieldName, String attributeName);

  /**
   * Returns the attribute for a field by the name of the field and attribute supplying a default
   * value if the attribute is not found.
   *
   * @param fieldName the name of the field whose associated attribute to be returned.
   * @param attributeName the name whose associated attribute to be returned.
   * @param defaultValue the value that is returned when an explicit value is not available.
   * @return the attribute for a field by the name of the field and attribute supplying a default
   *     value if the attribute is not found.
   */
  Object getFieldAttributeByName(String fieldName, String attributeName, Object defaultValue);

  /**
   * Returns the field of this context by the name of the field.
   *
   * @param name name the name whose associated field to be returned.
   * @return the field of this context by the name of the field.
   */
  Object getFieldByName(String name);

  /**
   * Returns all fields of this context.
   *
   * @return all fields of this context.
   */
  Map<String, Object> getFields();

  /**
   * Returns the list of related object with a specific name.
   *
   * @param name name the name whose associated field to be returned.
   * @return the list of related object with a specific name.
   */
  List<? extends ObjectContext<?>> getRelatedObjectsByName(String name);

  /**
   * Returns the attribute for a relationship by the name of the relationship and attribute.
   *
   * @param relationshipName the name of the relationship whose associated attribute to be returned.
   * @param attributeName the name whose associated attribute to be returned.
   * @return the attribute for a relationship by the name of the relationship and attribute.
   */
  Object getRelationshipAttributeByName(String relationshipName, String attributeName);

  /**
   * Returns the attribute for a relationship by the name of the relationship and attribute
   * supplying a default value if the attribute is not found.
   *
   * @param relationshipName the name of the relationship whose associated attribute to be returned.
   * @param attributeName the name whose associated attribute to be returned.
   * @param defaultValue the value that is returned when an explicit value is not available.
   * @return the attribute for a relationship by the name of the relationship and attribute
   *     supplying a default value if the attribute is not found.
   */
  Object getRelationshipAttributeByName(
      String relationshipName, String attributeName, Object defaultValue);

  /**
   * Returns the relationship of this context by the name of the relationship.
   *
   * @param name name the name whose associated relationship to be returned.
   * @return the relationship of this context by the name of the relationship.
   */
  Object getRelationshipByName(String name);

  /**
   * Returns all relationship of this context.
   *
   * @return all relationship of this context.
   */
  Map<String, Object> getRelationships();

  /**
   * Returns the root object.
   *
   * @return the root object.
   */
  ObjectRootContext<?> getRoot();

  /**
   * Returns {@code true} if this context contains a attribute for the specified name.
   *
   * @param name name the name whose associated relationship to be returned.
   * @return {@code true} if this context contains a attribute for the specified name.
   */
  boolean hasAttributeByName(String name);

  /**
   * Returns {@code true} if the context has the value to which the specified key is mapped.
   *
   * @param fieldName the name of the field whose associated attribute to be determined.
   * @param attributeName the name whose associated attribute to be determined.
   * @return {@code true} if the context has the value to which the specified key is mapped.
   */
  boolean hasFieldAttributeByName(String fieldName, String attributeName);

  /**
   * Returns {@code true} if this context contains a field for the specified name.
   *
   * @param name name the name whose associated field to be determined.
   * @return {@code true} if this context contains a field for the specified name.
   */
  boolean hasFieldByName(String name);

  /**
   * Returns {@code true} if the context has the value to which the specified key is mapped.
   *
   * @param relationshipName the name of the relationship whose associated attribute to be
   *     determined.
   * @param attributeName the name whose associated attribute to be determined.
   * @return {@code true} if the context has the value to which the specified key is mapped.
   */
  boolean hasRelationshipAttributeByName(String relationshipName, String attributeName);

  /**
   * Returns {@code true} if this context contains a relationship for the specified name.
   *
   * @param name name the name whose associated relationship to be determined.
   * @return {@code true} if this context contains a relationship for the specified name.
   */
  boolean hasRelationshipByName(String name);
}
