package cimerant.context.java.util.impl;

import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.lang.impl.IterableContextImpl;
import cimerant.context.java.util.CollectionContext;
import java.util.Collection;
import java.util.Objects;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.Collection} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 *
 * @param <E> The base type of the context.
 * @param <T> The type of context.
 */
public class CollectionContextImpl<E extends Collection<?>, T extends ContextRoot<?>>
    extends IterableContextImpl<E, T> implements CollectionContext<E, T> {
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
  public static final <E extends Collection<?>, T extends ContextRoot<?>>
      CollectionContext<E, T> getInstance(final E contextObject) {
    Objects.requireNonNull(contextObject);
    return ContextRootImpl.registerInstance(new CollectionContextImpl<>(contextObject));
  }

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  protected CollectionContextImpl(final E contextObject) {
    super(contextObject);
  }

  /** Unsupported Operation. */
  @Override
  public final boolean add(final T element) {
    throw new UnsupportedOperationException("add");
  }

  /** Unsupported Operation. */
  @Override
  public final boolean addAll(final Collection<? extends T> collection) {
    throw new UnsupportedOperationException("add");
  }

  /** Unsupported Operation. */
  @Override
  public final void clear() {
    throw new UnsupportedOperationException("clear");
  }

  /** Returns {@code true} if this context contains the specified element. */
  @Override
  public final boolean contains(final Object object) {
    Objects.requireNonNull(object);
    return this.getContextObject().contains(object);
  }

  /**
   * Returns {@code true} if this context contains all of the elements in the specified collection.
   */
  @Override
  public final boolean containsAll(final Collection<?> collection) {
    return this.getContextObject().containsAll(collection);
  }

  /** Returns {@code true} if this context contains no elements. */
  @Override
  public final boolean isEmpty() {
    return this.getContextObject().isEmpty();
  }

  /** Unsupported Operation. */
  @Override
  public final boolean remove(final Object object) {
    throw new UnsupportedOperationException("remove");
  }

  /** Unsupported Operation. */
  @Override
  public final boolean removeAll(final Collection<?> collection) {
    throw new UnsupportedOperationException("removeAll");
  }

  /** Unsupported Operation. */
  @Override
  public final boolean retainAll(final Collection<?> collection) {
    throw new UnsupportedOperationException("retainAll");
  }

  /** Returns the number of elements in this context. */
  @Override
  public final int size() {
    return this.getContextObject().size();
  }

  /** Unsupported Operation. */
  @Override
  public final Object[] toArray() {
    throw new UnsupportedOperationException("toArray");
  }

  /** Unsupported Operation. */
  @Override
  public final <C> C[] toArray(final C[] array) {
    throw new UnsupportedOperationException("toArray");
  }
}
