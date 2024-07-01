package cimerant.context.java.util.impl;

import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.util.SetContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.Set} describing the template data context. This set of routines is used by the template
 * to set and get 'named' data object to pass them to the template engine to use when rendering a
 * template.
 *
 * @param <E> The base type of the context.
 */
public final class SetContextImpl<E> extends ContextRootImpl<Set<E>> implements SetContext<E> {
  private static final long serialVersionUID = 1L;

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param <E> The base type of the context.
   * @param contextObject The base context object.
   * @return a instance of the context.
   */
  public static <E> SetContext<E> getInstance(final Set<E> contextObject) {
    Objects.requireNonNull(contextObject);
    return ContextRootImpl.registerInstance(new SetContextImpl<>(contextObject));
  }

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  private SetContextImpl(final Set<E> contextObject) {
    super(contextObject);
  }

  /** Unsupported Operation. */
  @Override
  public boolean add(final ContextRoot<E> e) {
    throw new UnsupportedOperationException("add");
  }

  /** Unsupported Operation. */
  @Override
  public boolean addAll(final Collection<? extends ContextRoot<E>> c) {
    throw new UnsupportedOperationException("addAll");
  }

  /** Unsupported Operation. */
  @Override
  public void clear() {
    throw new UnsupportedOperationException("clear");
  }

  /** Returns {@code true} if this context contains the specified element. */
  @Override
  public boolean contains(final Object o) {
    return this.getContextObject().contains(o);
  }

  /**
   * Returns {@code true} if this context contains all of the elements of the specified collection.
   */
  @Override
  public boolean containsAll(final Collection<?> c) {
    return this.getContextObject().containsAll(c);
  }

  /** Returns {@code true} if the context has an iterator over the elements in this context. */
  @Override
  public boolean hasIterator() {
    return this.getContextObject().iterator() != null;
  }

  /** Returns {@code true} if this context contains no elements. */
  @Override
  public boolean isEmpty() {
    return this.getContextObject().isEmpty();
  }

  /** Returns an iterator over the elements in this context. */
  @Override
  public Iterator<ContextRoot<E>> iterator() {
    return IteratorContextImpl.getInstance(this.getContextObject().iterator());
  }

  /** Unsupported Operation. */
  @Override
  public boolean remove(final Object o) {
    throw new UnsupportedOperationException("remove");
  }

  /** Unsupported Operation. */
  @Override
  public boolean removeAll(final Collection<?> c) {
    throw new UnsupportedOperationException("removeAll");
  }

  /** Unsupported Operation. */
  @Override
  public boolean retainAll(final Collection<?> c) {
    throw new UnsupportedOperationException("retainAll");
  }

  /** Returns the number of elements in this context (its cardinality). */
  @Override
  public int size() {
    return this.getContextObject().size();
  }

  /** Unsupported Operation. */
  @Override
  public Object[] toArray() {
    throw new UnsupportedOperationException("toArray");
  }

  /** Unsupported Operation. */
  @Override
  public <T> T[] toArray(final T[] a) {
    throw new UnsupportedOperationException("toArray");
  }
}
