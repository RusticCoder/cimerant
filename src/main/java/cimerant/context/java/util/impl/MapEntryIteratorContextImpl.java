package cimerant.context.java.util.impl;

import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.util.MapEntryIteratorContext;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.Iterator} {@link java.util.Map.Entry} describing the template data context. This set of
 * routines is used by the template to set and get 'named' data object to pass them to the template
 * engine to use when rendering a template.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public final class MapEntryIteratorContextImpl<K, V> extends ContextRootImpl<Iterator<Entry<K, V>>>
    implements MapEntryIteratorContext<K, V> {
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
  public static <K, V> MapEntryIteratorContext<K, V> getInstance(
      final Iterator<Entry<K, V>> contextObject) {
    Objects.requireNonNull(contextObject);
    return ContextRootImpl.registerInstance(new MapEntryIteratorContextImpl<>(contextObject));
  }

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  private MapEntryIteratorContextImpl(final Iterator<Entry<K, V>> contextObject) {
    super(contextObject);
  }

  /** Returns {@code true} if the context has more elements. */
  @Override
  public boolean hasNext() {
    return this.getContextObject().hasNext();
  }

  /** Returns the next element in the context. */
  @Override
  public Entry<ContextRoot<K>, ContextRoot<V>> next() {
    return MapEntryContextImpl.getInstance(this.getContextObject().next());
  }

  /** Unsupported Operation. */
  @Override
  public void remove() {
    throw new UnsupportedOperationException("remove");
  }
}
