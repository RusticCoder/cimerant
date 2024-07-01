package cimerant.context.java.util;

import cimerant.context.ContextRoot;
import cimerant.context.java.lang.IterableContext;
import java.util.Collection;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.Collection} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 *
 * @param <E> The base type of the context.
 * @param <T> The type of context.
 */
public interface CollectionContext<E extends Collection<?>, T extends ContextRoot<?>>
    extends IterableContext<E, T>, Collection<T> {}
