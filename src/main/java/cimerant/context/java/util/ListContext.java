package cimerant.context.java.util;

import cimerant.context.ContextRoot;
import java.util.List;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.List} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 *
 * @param <E> The base type of the context.
 * @param <T> The type of context.
 */
public interface ListContext<E extends List<?>, T extends ContextRoot<?>>
    extends CollectionContext<E, T>, List<T> {
  /**
   * Returns {@code true} if the context has a element at the specified position in this context.
   *
   * @param index index to determine the context has a element at.
   * @return {@code true} if the context has a element at the specified position in this context.
   */
  boolean has(int index);

  /**
   * Returns {@code true} if the context has a list iterator over the elements in this context (in
   * proper sequence).
   *
   * @return {@code true} if the context has a list iterator over the elements in this context (in
   *     proper sequence).
   */
  boolean hasListIterator();

  /**
   * Returns {@code true} if the context has a list iterator over the elements in this context (in
   * proper sequence), starting at the specified position in the context.
   *
   * @param index index to determine the context has a list iterator at.
   * @return {@code true} if the context has a list iterator over the elements in this context (in
   *     proper sequence), starting at the specified position in the context.
   */
  boolean hasListIterator(int index);

  /**
   * Returns {@code true} if the context has a view of the portion of this context between the
   * specified {@code fromIndex}, inclusive, and {@code toIndex}, exclusive.
   *
   * @param fromIndex low endpoint (inclusive) of the subList
   * @param toIndex high endpoint (exclusive) of the subList
   * @return {@code true} if the context has a view of the portion of this context between the
   *     specified {@code fromIndex}, inclusive, and {@code toIndex}, exclusive.
   */
  boolean hasSubList(int fromIndex, int toIndex);
}
