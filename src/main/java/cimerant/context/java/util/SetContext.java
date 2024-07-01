package cimerant.context.java.util;

import cimerant.context.ContextRoot;
import java.util.Set;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.Set} describing the template data context. This set of routines is used by the template
 * to set and get 'named' data object to pass them to the template engine to use when rendering a
 * template.
 *
 * @param <E> The base type of the context.
 */
public interface SetContext<E> extends ContextRoot<Set<E>>, Set<ContextRoot<E>> {
  /**
   * Returns {@code true} if the context has an iterator over the elements in this context.
   *
   * @return {@code true} if the context has an iterator over the elements in this context.
   */
  boolean hasIterator();
}
