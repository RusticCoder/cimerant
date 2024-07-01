package cimerant.context.java.util;

import cimerant.context.ContextRoot;
import java.util.ListIterator;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.ListIterator} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 *
 * @param <E> The base type of the context.
 * @param <T> The type of context.
 */
public interface ListIteratorContext<E extends ListIterator<?>, T extends ContextRoot<?>>
    extends IteratorContext<E, T>, ListIterator<T> {}
