package cimerant.context.java.lang.impl;

import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.lang.IterableContext;
import cimerant.context.java.util.impl.IteratorContextImpl;
import java.util.Iterator;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.lang.Iterable} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 *
 * @param <E> The base type of the context.
 * @param <T> The type of context.
 */
public abstract class IterableContextImpl<E extends Iterable<?>, T extends ContextRoot<?>>
    extends ContextRootImpl<E> implements IterableContext<E, T> {
  private static final long serialVersionUID = 1L;

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  protected IterableContextImpl(final E contextObject) {
    super(contextObject);
  }

  /** Returns {@code true} if the context has an iterator over elements of type {@code E}. */
  @Override
  public final boolean hasIterator() {
    return this.getContextObject().iterator() != null;
  }

  /** Returns an iterator over elements of type {@code T}. */
  @Override
  public final Iterator<T> iterator() {
    return IteratorContextImpl.getInstance(this.getContextObject().iterator());
  }
}
