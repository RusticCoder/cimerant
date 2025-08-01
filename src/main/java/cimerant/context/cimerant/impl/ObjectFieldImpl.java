package cimerant.context.cimerant.impl;

import cimerant.context.NotNullMap;
import cimerant.context.NotNullSet;
import cimerant.context.cimerant.ObjectField;
import java.io.Serial;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/** An object that represents an field. */
public class ObjectFieldImpl extends NotNullMap<String, NotNullSet> implements ObjectField {
  @Serial private static final long serialVersionUID = 1L;

  /** Creates an instance. */
  public ObjectFieldImpl() {}

  /**
   * Creates an instance.
   *
   * @param map the map whose mappings are to be placed in this map
   */
  public ObjectFieldImpl(final Map<String, Object> map) {
    map.forEach(
        (string, object) -> {
          if (string != null && object != null) {
            if (object instanceof NotNullSet) {
              this.put(string, (NotNullSet) object);
            } else {
              this.put(string, NotNullSet.getInstance(Objects.toString(object, "")));
            }
          }
        });
  }

  /**
   * Creates an instance.
   *
   * @param map the map whose mappings are to be placed in this map
   */
  public ObjectFieldImpl(final SortedMap<String, Object> map) {
    map.forEach(
        (string, object) -> {
          if (string != null && object != null) {
            if (object instanceof NotNullSet) {
              this.put(string, (NotNullSet) object);
            } else {
              this.put(string, NotNullSet.getInstance(Objects.toString(object, "")));
            }
          }
        });
  }

  @Override
  public NotNullSet get(final String key, final Object defaultValue) {
    if (this.containsKey(key)) {
      return this.get(key);
    }
    return NotNullSet.getInstance(defaultValue);
  }
}
