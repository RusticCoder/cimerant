package cimerant.context;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.StreamWriteConstraints;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import java.util.TreeMap;

/**
 * An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at
 * most one value. Null values will be returned as empty strings.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public class NotNullMap<K extends String, V> extends TreeMap<K, V> {
  private static final long serialVersionUID = 1L;

  /**
   * Constructs a new, empty tree map, using the natural ordering of its keys. All keys inserted
   * into the map must implement the {@link Comparable} interface. Furthermore, all such keys must
   * be <em>mutually comparable</em>: {@code k1.compareTo(k2)} must not throw a {@code
   * ClassCastException} for any keys {@code k1} and {@code k2} in the map. If the user attempts to
   * put a key into the map that violates this constraint (for example, the user attempts to put a
   * string key into a map whose keys are integers), the {@code put(Object key, Object value)} call
   * will throw a {@code ClassCastException}.
   */
  public NotNullMap() {
    super(String.CASE_INSENSITIVE_ORDER);
  }

  /**
   * Constructs a new tree map containing the same mappings as the given map, ordered according to
   * the <em>natural ordering</em> of its keys. All keys inserted into the new map must implement
   * the {@link Comparable} interface. Furthermore, all such keys must be <em>mutually
   * comparable</em>: {@code k1.compareTo(k2)} must not throw a {@code ClassCastException} for any
   * keys {@code k1} and {@code k2} in the map. This method runs in n*log(n) time.
   *
   * @param m the map whose mappings are to be placed in this map
   * @throws ClassCastException if the keys in m are not {@link Comparable}, or are not mutually
   *     comparable
   * @throws NullPointerException if the specified map is null
   */
  public NotNullMap(final Map<K, V> m) {
    super(String.CASE_INSENSITIVE_ORDER);
    super.putAll(m);
  }

  /**
   * Returns the value to which the specified key is mapped, or {@code null} if this map contains no
   * mapping for the key.
   */
  @SuppressWarnings("unchecked")
  @Override
  public V get(final Object key) {
    var returnValue = super.get(key);
    if (returnValue == null) {
      returnValue = (V) "";
    }
    return returnValue;
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
}
