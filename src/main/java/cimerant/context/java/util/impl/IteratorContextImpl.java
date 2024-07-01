package cimerant.context.java.util.impl;

import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.util.IteratorContext;
import java.util.Iterator;
import java.util.Objects;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.Iterator} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 *
 * @param <E> The base type of the context.
 * @param <T> The type of context.
 */
public class IteratorContextImpl<E extends Iterator<?>, T extends ContextRoot<?>>
    extends ContextRootImpl<E> implements IteratorContext<E, T> {
  private static final long serialVersionUID = 1L;

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param <E> The base type of the context.
   * @param <T> The type of context.
   * @param contextObject The base context object.
   * @return a instance of the context.
   */
  public static final <E extends Iterator<?>, T extends ContextRoot<?>>
      IteratorContext<E, T> getInstance(final E contextObject) {
    Objects.requireNonNull(contextObject);
    return ContextRootImpl.registerInstance(new IteratorContextImpl<>(contextObject));
  }

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  protected IteratorContextImpl(final E contextObject) {
    super(contextObject);
  }

  /** Returns {@code true} if the context has more elements. */
  @Override
  public final boolean hasNext() {
    return this.getContextObject().hasNext();
  }

  /** Returns the next element in the context. */
  @Override
  @SuppressWarnings("unchecked")
  public T next() {
    return (T) ContextRootImpl.getInstance(this.getContextObject().next());
  }

  /** Unsupported Operation. */
  @Override
  public final void remove() {
    throw new UnsupportedOperationException("remove");
  }
}
