package cimerant.context.cimerant;

import cimerant.context.ContextRoot;
import java.util.List;
import java.util.Map;

/**
 * Interface describing the template data context. This set of routines is used by the template to
 * set and get 'named' data object to pass them to the template engine to use when rendering a
 * template.
 *
 * @param <E> The base type of the context.
 */
public interface ObjectRootContext<E> extends ContextRoot<E> {
  /**
   * Returns the attribute to which the specified name is mapped, or {@code null} if this context
   * contains no mapping for the name.
   *
   * @param name name the name whose associated attribute to be returned.
   * @return the attribute to which the specified name is mapped, or {@code null} if this context
   *     contains no mapping for the name.
   */
  Object getAttributeByName(String name);

  /**
   * Returns the attribute of this context by the name of the attribute supplying a default value if
   * the attribute is not found.
   *
   * @param name name the name whose associated attribute is to be returned.
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
   * Returns the object that maps names to values, or {@code null} if this context contains no
   * object.
   *
   * @return the object that maps names to values, or {@code null} if this context contains no
   *     object.
   */
  List<? extends ObjectContext<?>> getObjects();

  /**
   * Returns the objects to which the specified name is mapped, or {@code null} if this context
   * contains no mapping for the name.
   *
   * @param name name the name whose associated value is to be returned.
   * @return the objects to which the specified name is mapped, or {@code null} if this context
   *     contains no mapping for the name.
   */
  List<? extends ObjectContext<?>> getObjectsByName(String name);

  /**
   * Returns {@code true} if this context contains a attribute for the specified name.
   *
   * @param name name the name whose associated attribute to be determined.
   * @return {@code true} if this context contains a attribute for the specified name.
   */
  boolean hasAttributeByName(String name);
}
