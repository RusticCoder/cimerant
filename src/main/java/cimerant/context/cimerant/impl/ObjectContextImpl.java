package cimerant.context.cimerant.impl;

import cimerant.context.cimerant.ObjectContext;
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

  /** The object name. */
  private final String objectName;

  /** The root context. */
  private final ObjectRootContext<?> rootContext;

  /**
   * Creates an instance.
   *
   * @param rootContext the root context.
   * @param entry the context entry.
   */
  protected ObjectContextImpl(final ObjectRootContext<?> rootContext, final E entry) {
    super(entry);
    this.rootContext = rootContext;
    this.objectName = entry.getKey();
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

  /**
   * Returns the root object specified in the context, or {@code null} if this context contains no
   * root object.
   */
  @Override
  public ObjectRootContext<?> getRoot() {
    return this.rootContext;
  }
}
