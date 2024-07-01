package cimerant.context.cimerant.impl;

import cimerant.context.cimerant.ObjectRootContext;
import cimerant.context.impl.ContextRootImpl;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 *
 * @param <E> The base type of the context.
 */
public abstract class ObjectRootContextImpl<E> extends ContextRootImpl<E>
    implements ObjectRootContext<E> {
  private static final long serialVersionUID = 1L;

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  protected ObjectRootContextImpl(final E contextObject) {
    super(contextObject);
  }
}
