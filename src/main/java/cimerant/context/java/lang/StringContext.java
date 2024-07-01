package cimerant.context.java.lang;

import cimerant.context.ContextRoot;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.lang.String} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 */
public interface StringContext extends ContextRoot<String> {
  /**
   * Returns the context value.
   *
   * @return the context value.
   */
  String getValue();

  /**
   * Returns {@code true} if the context has a value that is not empty (""), not null and not
   * whitespace only.
   *
   * @return {@code true} if the context has a value that is not empty (""), not null and not
   *     whitespace only.
   */
  boolean hasValue();
}
