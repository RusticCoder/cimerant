package cimerant.context.java.lang;

import cimerant.context.ContextRoot;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.lang.Iterable} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 *
 * @param <E> The base type of the context.
 * @param <T> The type of context.
 */
public interface IterableContext<E extends Iterable<?>, T extends ContextRoot<?>>
    extends ContextRoot<E>, Iterable<T> {
  /**
   * Returns {@code true} if the context has an iterator over elements of type {@code E}.
   *
   * @return {@code true} if the context has an iterator over elements of type {@code E}.
   */
  boolean hasIterator();
}
