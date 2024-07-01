package cimerant.context.java.util;

import cimerant.context.ContextRoot;
import java.util.Collection;
import java.util.Map;
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
public interface MapContext<K, V>
    extends ContextRoot<Map<K, V>>, Map<ContextRoot<K>, ContextRoot<V>> {
  /**
   * Returns {@code true} if the context has a value to which the specified key is mapped.
   *
   * @param key key to find mapped value.
   * @return {@code true} if the context has a value to which the specified key is mapped.
   */
  boolean has(Object key);

  /**
   * Returns {@code true} if the context has a {@link Set} view of the mappings contained in this
   * context.
   *
   * @return {@code true} if the context has a {@link Set} view of the mappings contained in this
   *     context.
   */
  boolean hasEntrySet();

  /**
   * Returns {@code true} if the context has a {@link Set} view of the keys contained in this
   * context.
   *
   * @return {@code true} if the context has a {@link Set} view of the keys contained in this
   *     context.
   */
  boolean hasKeySet();

  /**
   * Returns {@code true} if the context has a {@link Collection} view of the values contained in
   * this context.
   *
   * @return {@code true} if the context has a {@link Collection} view of the values contained in
   *     this context.
   */
  boolean hasValues();
}
