package cimerant.context.java.util.impl;

import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.util.ListContext;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.List} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 */
public final class StringListContextImpl extends ListContextImpl<List<String>, ContextRoot<String>>
    implements ListContext<List<String>, ContextRoot<String>> {
  private static final long serialVersionUID = 1L;

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param contextObject The base context object.
   * @return a instance of the context.
   */
  public static ListContext<List<String>, ContextRoot<String>> getStringInstance(
      final List<String> contextObject) {
    Objects.requireNonNull(contextObject);
    return ContextRootImpl.registerInstance(new StringListContextImpl(contextObject));
  }

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  private StringListContextImpl(final List<String> contextObject) {
    super(contextObject);
  }

  /** Unsupported Operation. */
  @Override
  public void add(final int index, final ContextRoot<String> element) {
    throw new UnsupportedOperationException("add");
  }

  /** Unsupported Operation. */
  @Override
  public boolean addAll(final int index, final Collection<? extends ContextRoot<String>> c) {
    throw new UnsupportedOperationException("addAll");
  }

  /**
   * Returns a instance of a specific context specified in this context, or {@code null} if this
   * context contains no instance.
   */
  @Override
  public ContextRoot<String> get(final int index) {
    return ContextRootImpl.getInstance(this.getContextObject().get(index));
  }

  /**
   * Returns {@code true} if the context has a element at the specified position in this context.
   */
  @Override
  public boolean has(final int index) {
    return this.getContextObject().get(index) != null;
  }

  /** Unsupported Operation. */
  @Override
  public ContextRoot<String> remove(final int index) {
    throw new UnsupportedOperationException("remove");
  }

  /** Unsupported Operation. */
  @Override
  public ContextRoot<String> set(final int index, final ContextRoot<String> element) {
    throw new UnsupportedOperationException("set");
  }

  /** Unsupported Operation. */
  @Override
  public List<ContextRoot<String>> subList(final int fromIndex, final int toIndex) {
    throw new UnsupportedOperationException("subList");
  }
}
