package cimerant.context.java.util.impl;

import cimerant.Cimerant;
import cimerant.ModuleCode;
import cimerant.StatusCode;
import cimerant.SysError;
import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.util.ListIteratorContext;
import cimerant.logger.CimerantLogger;
import java.util.ListIterator;
import java.util.Objects;
import org.slf4j.LoggerFactory;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.ListIterator} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 *
 * @param <E> The base type of the context.
 * @param <T> The type of context.
 */
public final class ListIteratorContextImpl<E extends ListIterator<?>, T extends ContextRoot<?>>
    extends IteratorContextImpl<E, T> implements ListIteratorContext<E, T> {
  private static final CimerantLogger logger;
  private static final long serialVersionUID = 1L;

  static {
    logger = (CimerantLogger) LoggerFactory.getLogger(ListIteratorContextImpl.class.getName());
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param <E> The base type of the context.
   * @param <T> The type of context.
   * @param contextObject The base context object.
   * @return a instance of the context.
   */
  public static <E extends ListIterator<?>, T extends ContextRoot<?>>
      ListIteratorContext<E, T> getInstance(final E contextObject) {
    final var moduleCode = ModuleCode.ERR_M1000;

    try {
      Objects.requireNonNull(contextObject);

      return ContextRootImpl.registerInstance(new ListIteratorContextImpl<>(contextObject));
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (ListIteratorContextImpl.logger.isDebugEnabled()) {
        ListIteratorContextImpl.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  private ListIteratorContextImpl(final E contextObject) {
    super(contextObject);
  }

  /** Unsupported Operation. */
  @Override
  public void add(final T element) {
    throw new UnsupportedOperationException("add");
  }

  /**
   * Returns {@code true} if this context has more elements when traversing the context in the
   * reverse direction.
   */
  @Override
  public boolean hasPrevious() {
    return this.getContextObject().hasPrevious();
  }

  /** Returns the next element in the context and advances the cursor position. */
  @Override
  public int nextIndex() {
    return this.getContextObject().nextIndex();
  }

  /** Returns the previous element in the context and moves the cursor position backwards. */
  @Override
  @SuppressWarnings("unchecked")
  public T previous() {
    return (T) ContextRootImpl.getInstance(this.getContextObject().previous());
  }

  /**
   * Returns the index of the element that would be returned by a subsequent call to {@link
   * #previous}.
   */
  @Override
  public int previousIndex() {
    return this.getContextObject().previousIndex();
  }

  /** Unsupported Operation. */
  @Override
  public void set(final T e) {
    throw new UnsupportedOperationException("set");
  }
}
