package cimerant.context.cimerant.impl;

import cimerant.context.NotNullSet;
import cimerant.context.cimerant.ObjectAttributeList;
import cimerant.context.cimerant.ObjectContext;
import cimerant.context.cimerant.ObjectRootContext;
import cimerant.context.impl.ContextRootImpl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 *
 * @param <E> The base type of the context.
 */
public abstract class ObjectRootContextImpl<E> extends ContextRootImpl<E>
    implements ObjectRootContext<E> {
  private static final long serialVersionUID = 1L;

  /** The list of attributes. */
  private final ObjectAttributeList attributes;

  /** The list of objects. */
  protected List<ObjectContext<Entry<String, Object>>> objects = new ArrayList<>();

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   * @param attributes Key value pair of attributes.
   */
  protected ObjectRootContextImpl(final E contextObject, final ObjectAttributeList attributes) {
    super(contextObject);

    this.attributes = attributes;
  }

  @Override
  public void addObject(final ObjectContext<Entry<String, Object>> objectContext) {
    final var count =
        this.objects.stream()
            .filter(object -> object.hashCode() == objectContext.hashCode())
            .count();
    if (count == 0) {
      this.objects.add(objectContext);
    }
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
  public NotNullSet getAttributeByName(final String name, final Object defaultValue) {
    if (this.attributes.containsKey(name)) {
      return NotNullSet.getInstance(this.attributes.get(name));
    }
    return NotNullSet.getInstance(defaultValue);
  }

  /**
   * Returns the attribute object that maps names to values, or {@code null} if this context
   * contains no attribute object.
   */
  @Override
  public ObjectAttributeList getAttributes() {
    return this.attributes;
  }

  /**
   * Returns the object that maps names to values, or {@code null} if this context contains no
   * object.
   */
  @Override
  public List<ObjectContext<Entry<String, Object>>> getObjects() {
    this.objects.sort(
        Comparator.comparing(
            ObjectContext<Entry<String, Object>>::getObjectName, String.CASE_INSENSITIVE_ORDER));
    return this.objects;
  }

  /**
   * Returns the objects to which the specified name is mapped, or {@code null} if this context
   * contains no mapping for the name.
   */
  @Override
  public List<ObjectContext<Entry<String, Object>>> getObjectsByName(final String name) {
    Objects.requireNonNull(name);

    return this.objects.stream()
        .filter(object -> StringUtils.equalsIgnoreCase(name, object.getObjectName()))
        .collect(Collectors.toList());
  }

  /** Returns {@code true} if this context contains a attribute for the specified name. */
  @Override
  public boolean hasAttributeByName(final String name) {
    return this.attributes.containsKey(name);
  }
}
