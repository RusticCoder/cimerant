package cimerant.context;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.StreamWriteConstraints;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at
 * most one value. Null values will be returned as empty strings.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public class NotNullMap<K, V> implements Map<K, V> {
  private final Map<K, V> map;

  /**
   * Creates an instance.
   *
   * @param map map to be wrapped.
   */
  public NotNullMap(final Map<K, V> map) {
    this.map = map;
  }

  /** Removes all of the mappings from this map (optional operation). */
  @Override
  public void clear() {
    this.map.clear();
  }

  /** Returns {@code true} if this map contains a mapping for the specified key. */
  @Override
  public boolean containsKey(final Object key) {
    return this.map.containsKey(key);
  }

  /** Returns {@code true} if this map maps one or more keys to the specified value. */
  @Override
  public boolean containsValue(final Object value) {
    return this.map.containsValue(value);
  }

  /** Returns a {@link Set} view of the mappings contained in this map. */
  @Override
  public Set<Entry<K, V>> entrySet() {
    return this.map.entrySet();
  }

  /**
   * Returns the value to which the specified key is mapped, or {@code null} if this map contains no
   * mapping for the key.
   */
  @SuppressWarnings("unchecked")
  @Override
  public V get(final Object key) {
    final var returnValue = this.map.get(key);
    if (returnValue == null) {
      try {
        return (V) "";
      } catch (final Exception e) {
        return null;
      }
    }
    return returnValue;
  }

  /** Returns {@code true} if this map contains no key-value mappings. */
  @Override
  public boolean isEmpty() {
    return this.map.isEmpty();
  }

  /** Returns a {@link Set} view of the keys contained in this map. */
  @Override
  public Set<K> keySet() {
    return this.map.keySet();
  }

  /** Associates the specified value with the specified key in this map (optional operation). */
  @Override
  public V put(final K key, final V value) {
    return this.map.put(key, value);
  }

  /** Copies all of the mappings from the specified map to this map (optional operation). */
  @Override
  public void putAll(final Map<? extends K, ? extends V> m) {
    this.map.putAll(m);
  }

  /** Removes the mapping for a key from this map if it is present (optional operation). */
  @Override
  public V remove(final Object key) {
    return this.map.remove(key);
  }

  /** Returns the number of key-value mappings in this map. */
  @Override
  public int size() {
    return this.map.size();
  }

  /**
   * Returns a JSON representation of the contents of this object.
   *
   * @return a JSON representation of the contents of this object.
   */
  public String toJson() {
    try {
      final var jsonFactory =
          new ObjectMapper()
              .getFactory()
              .setStreamWriteConstraints(
                  StreamWriteConstraints.builder().maxNestingDepth(5000).build());
      final var ow = new ObjectMapper(jsonFactory).writer().withDefaultPrettyPrinter();
      return ow.writeValueAsString(this);
    } catch (final JsonProcessingException e) {
      return super.toString() + System.lineSeparator() + e.getMessage();
    }
  }

  /** Returns a string representation of the object. */
  @Override
  public String toString() {
    if (this.map == null) {
      return null;
    }
    return this.map.toString();
  }

  /** Returns a {@link Collection} view of the values contained in this map. */
  @Override
  public Collection<V> values() {
    return this.map.values();
  }
}
