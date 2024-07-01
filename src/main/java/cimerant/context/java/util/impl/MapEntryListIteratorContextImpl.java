package cimerant.context.java.util.impl;

import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.util.MapEntryListIteratorContext;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Objects;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.ListIterator} {@link java.util.Map.Entry} describing the template data context. This
 * set of routines is used by the template to set and get 'named' data object to pass them to the
 * template engine to use when rendering a template.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public final class MapEntryListIteratorContextImpl<K, V>
    extends ContextRootImpl<ListIterator<Entry<K, V>>>
    implements MapEntryListIteratorContext<K, V> {
  private static final long serialVersionUID = 1L;

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param <K> the type of keys maintained by this map
   * @param <V> the type of mapped values
   * @param contextObject The base context object.
   * @return a instance of the context.
   */
  public static <K, V> MapEntryListIteratorContext<K, V> getInstance(
      final ListIterator<Entry<K, V>> contextObject) {
    Objects.requireNonNull(contextObject);
    return ContextRootImpl.registerInstance(new MapEntryListIteratorContextImpl<>(contextObject));
  }

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  private MapEntryListIteratorContextImpl(final ListIterator<Entry<K, V>> contextObject) {
    super(contextObject);
  }

  /** Unsupported Operation. */
  @Override
  public void add(final Entry<ContextRoot<K>, ContextRoot<V>> e) {
    throw new UnsupportedOperationException("add");
  }

  /**
   * Returns {@code true} if this context has more elements when traversing the context in the
   * forward direction.
   */
  @Override
  public boolean hasNext() {
    return this.getContextObject().hasNext();
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
  public Entry<ContextRoot<K>, ContextRoot<V>> next() {
    return MapEntryContextImpl.getInstance(this.getContextObject().next());
  }

  /**
   * Returns the index of the element that would be returned by a subsequent call to {@link #next}.
   */
  @Override
  public int nextIndex() {
    return this.getContextObject().nextIndex();
  }

  /** Returns the previous element in the context and moves the cursor position backwards. */
  @Override
  public Entry<ContextRoot<K>, ContextRoot<V>> previous() {
    return MapEntryContextImpl.getInstance(this.getContextObject().previous());
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
  public void remove() {
    throw new UnsupportedOperationException("remove");
  }

  /** Unsupported Operation. */
  @Override
  public void set(final Entry<ContextRoot<K>, ContextRoot<V>> e) {
    throw new UnsupportedOperationException("set");
  }
}
