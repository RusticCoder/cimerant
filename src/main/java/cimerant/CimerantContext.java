package cimerant;

import cimerant.context.ContextRoot;

/**
 * Interface describing the template data context. This set of routines is used by the template to
 * set and get 'named' data object to pass them to the template engine to use when rendering a
 * template.
 *
 * @param <E> The base type of the context.
 */
public interface CimerantContext<E> {
  /**
   * Get the associated context.
   *
   * @return the associated context.
   * @throws SysError error thrown when trying to get the associated context.
   */
  ContextRoot<E> getContext() throws SysError;
}
