package cimerant.context.java.lang.impl;

import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.lang.StringContext;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

/**
 * Wrapper class bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.lang.String} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 */
public class StringContextImpl extends ContextRootImpl<String> implements StringContext {
  private static final long serialVersionUID = 1L;

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param contextObject The base context object.
   * @return a instance of the context.
   */
  public static ContextRoot<String> getInstance(final String contextObject) {
    Objects.requireNonNull(contextObject);
    return ContextRootImpl.registerInstance(new StringContextImpl(contextObject));
  }

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  protected StringContextImpl(final String contextObject) {
    super(contextObject);
  }

  /**
   * Returns the value specified in the context, or {@code null} if this context contains no value.
   */
  @Override
  public String getValue() {
    return this.getContextObject();
  }

  /**
   * Returns {@code true} if the context has a value that is not empty (""), not null and not
   * whitespace only.
   */
  @Override
  public boolean hasValue() {
    return StringUtils.isNotBlank(this.getContextObject());
  }
}
