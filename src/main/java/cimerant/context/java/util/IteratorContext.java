package cimerant.context.java.util;

import cimerant.context.ContextRoot;
import java.util.Iterator;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.Iterator} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 *
 * @param <E> The base type of the context.
 * @param <T> The type of context.
 */
public interface IteratorContext<E extends Iterator<?>, T extends ContextRoot<?>>
    extends ContextRoot<E>, Iterator<T> {}
