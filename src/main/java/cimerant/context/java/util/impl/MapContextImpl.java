package cimerant.context.java.util.impl;

import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.util.MapContext;
import cimerant.context.java.util.MapEntrySetContext;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.Map} describing the template data context. This set of routines is used by the template
 * to set and get 'named' data object to pass them to the template engine to use when rendering a
 * template.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public final class MapContextImpl<K, V> extends ContextRootImpl<Map<K, V>>
    implements MapContext<K, V> {
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
  public static <K, V> MapContext<K, V> getInstance(final Map<K, V> contextObject) {
    Objects.requireNonNull(contextObject);
    return ContextRootImpl.registerInstance(new MapContextImpl<>(contextObject));
  }

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  private MapContextImpl(final Map<K, V> contextObject) {
    super(contextObject);
  }

  /** Unsupported Operation. */
  @Override
  public void clear() {
    throw new UnsupportedOperationException("clear");
  }

  /** Returns {@code true} if this context contains a mapping for the specified key. */
  @Override
  public boolean containsKey(final Object key) {
    Objects.requireNonNull(key);
    return this.getContextObject().containsKey(key);
  }

  /** Returns {@code true} if this context maps one or more keys to the specified value. */
  @Override
  public boolean containsValue(final Object value) {
    Objects.requireNonNull(value);
    return this.getContextObject().containsValue(value);
  }

  /** Returns a {@link Set} view of the mappings contained in this context. */
  @Override
  public MapEntrySetContext<K, V> entrySet() {
    return MapEntrySetContextImpl.getInstance(this.getContextObject().entrySet());
  }

  /**
   * Returns a instance of a specific context specified in this context, or {@code null} if this
   * context contains no instance.
   */
  @Override
  public ContextRoot<V> get(final Object key) {
    Objects.requireNonNull(key);
    return ContextRootImpl.getInstance(this.getContextObject().get(key));
  }

  /**
   * Get the associated context.
   *
   * @return the associated context.
   */
  public Map<K, V> getMap() {
    return this.getContextObject();
  }

  /**
   * Returns {@code true} if the context has a value to which the specified key is mapped, or {@code
   * null} if this context contains no mapping for the key.
   */
  @Override
  public boolean has(final Object key) {
    return this.getContextObject().get(key) != null;
  }

  /**
   * Returns {@code true} if the context has a {@link Set} view of the mappings contained in this
   * context.
   */
  @Override
  public boolean hasEntrySet() {
    return this.getContextObject().entrySet() != null;
  }

  /**
   * Returns {@code true} if the context has a {@link Set} view of the keys contained in this
   * context.
   */
  @Override
  public boolean hasKeySet() {
    return this.getContextObject().keySet() != null;
  }

  /**
   * Returns {@code true} if the context has a {@link Collection} view of the values contained in
   * this context.
   */
  @Override
  public boolean hasValues() {
    return this.getContextObject().values() != null;
  }

  /** Returns {@code true} if this context contains no key-value mappings. */
  @Override
  public boolean isEmpty() {
    return this.getContextObject().isEmpty();
  }

  /** Returns a {@link Set} view of the keys contained in this context. */
  @Override
  public Set<ContextRoot<K>> keySet() {
    return SetContextImpl.getInstance(this.getContextObject().keySet());
  }

  /** Unsupported Operation. */
  @Override
  public ContextRoot<V> put(final ContextRoot<K> key, final ContextRoot<V> value) {
    throw new UnsupportedOperationException("put");
  }

  /** Unsupported Operation. */
  @Override
  public void putAll(final Map<? extends ContextRoot<K>, ? extends ContextRoot<V>> map) {
    throw new UnsupportedOperationException("putAll");
  }

  /** Unsupported Operation. */
  @Override
  public ContextRoot<V> remove(final Object key) {
    throw new UnsupportedOperationException("remove");
  }

  /** Returns the number of key-value mappings in this context. */
  @Override
  public int size() {
    return this.getContextObject().size();
  }

  /** Returns a {@link Collection} view of the values contained in this context. */
  @Override
  public Collection<ContextRoot<V>> values() {
    return CollectionContextImpl.getInstance(this.getContextObject().values());
  }
}
