package cimerant.context.java.util.impl;

import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.util.ListContext;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.List} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 *
 * @param <E> The base type of the context.
 * @param <T> The type of context.
 */
public class ListContextImpl<E extends List<?>, T extends ContextRoot<?>>
    extends CollectionContextImpl<E, T> implements ListContext<E, T> {
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
  public static <E extends List<?>, T extends ContextRoot<?>> ListContext<E, T> getInstance(
      final E contextObject) {
    Objects.requireNonNull(contextObject);
    return ContextRootImpl.registerInstance(new ListContextImpl<>(contextObject));
  }

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  protected ListContextImpl(final E contextObject) {
    super(contextObject);
  }

  /** Unsupported Operation. */
  @Override
  public void add(final int index, final T element) {
    throw new UnsupportedOperationException("add");
  }

  /** Unsupported Operation. */
  @Override
  public boolean addAll(final int index, final Collection<? extends T> c) {
    throw new UnsupportedOperationException("addAll");
  }

  /**
   * Returns a instance of a specific context specified in this context, or {@code null} if this
   * context contains no instance.
   */
  @Override
  @SuppressWarnings("unchecked")
  public T get(final int index) {
    return (T) ContextRootImpl.getInstance(this.getContextObject().get(index));
  }

  /**
   * Returns {@code true} if the context has a element at the specified position in this context.
   */
  @Override
  public boolean has(final int index) {
    return this.getContextObject().get(index) != null;
  }

  /**
   * Returns {@code true} if the context has a list iterator over the elements in this context (in
   * proper sequence).
   */
  @Override
  public final boolean hasListIterator() {
    return this.getContextObject().listIterator() != null;
  }

  /**
   * Returns {@code true} if the context has a list iterator over the elements in this context (in
   * proper sequence), starting at the specified position in the context.
   */
  @Override
  public final boolean hasListIterator(final int index) {
    return this.getContextObject().listIterator(index) != null;
  }

  /**
   * Returns {@code true} if the context has a view of the portion of this context between the
   * specified {@code fromIndex}, inclusive, and {@code toIndex}, exclusive.
   */
  @Override
  public final boolean hasSubList(final int fromIndex, final int toIndex) {
    return this.getContextObject().subList(fromIndex, toIndex) != null;
  }

  /**
   * Returns the index of the first occurrence of the specified element in this context, or -1 if
   * this context does not contain the element.
   */
  @Override
  public final int indexOf(final Object object) {
    Objects.requireNonNull(object);
    return this.getContextObject().indexOf(object);
  }

  /**
   * Returns the index of the last occurrence of the specified element in this context, or -1 if
   * this context does not contain the element.
   */
  @Override
  public final int lastIndexOf(final Object object) {
    Objects.requireNonNull(object);
    return this.getContextObject().lastIndexOf(object);
  }

  /** Returns a list iterator over the elements in this context (in proper sequence). */
  @Override
  public final ListIterator<T> listIterator() {
    return ListIteratorContextImpl.getInstance(this.getContextObject().listIterator());
  }

  /**
   * Returns a list iterator over the elements in this context (in proper sequence), starting at the
   * specified position in the context.
   */
  @Override
  public final ListIterator<T> listIterator(final int index) {
    return ListIteratorContextImpl.getInstance(this.getContextObject().listIterator(index));
  }

  /** Unsupported Operation. */
  @Override
  public T remove(final int index) {
    throw new UnsupportedOperationException("remove");
  }

  /** Unsupported Operation. */
  @Override
  public T set(final int index, final T element) {
    throw new UnsupportedOperationException("set");
  }

  /** Unsupported Operation. */
  @Override
  public List<T> subList(final int fromIndex, final int toIndex) {
    throw new UnsupportedOperationException("subList");
  }
}
