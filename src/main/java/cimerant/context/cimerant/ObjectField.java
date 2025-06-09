package cimerant.context.cimerant;

import cimerant.context.NotNullSet;
import java.util.Map;

/** An object that represents an field. */
public interface ObjectField extends Map<String, NotNullSet> {
  /**
   * Returns the value to which the specified key is mapped, or {@code defaultValue} if this map
   * contains no mapping for the key.
   *
   * @param key the key whose associated value is to be returned
   * @param defaultValue the default mapping of the key
   * @return the value to which the specified key is mapped, or {@code defaultValue} if this map
   *     contains no mapping for the key
   */
  NotNullSet get(String key, Object defaultValue);
}
