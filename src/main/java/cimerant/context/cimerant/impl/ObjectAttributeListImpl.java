package cimerant.context.cimerant.impl;

import cimerant.context.NotNullMap;
import cimerant.context.NotNullSet;
import cimerant.context.cimerant.ObjectAttributeList;
import java.io.Serial;
import java.util.Map;
import java.util.SortedMap;

/** An {@code Map} object that maps text descriptions to {@code ObjectAttribute}. */
public class ObjectAttributeListImpl extends NotNullMap<String, NotNullSet>
    implements ObjectAttributeList {
  @Serial private static final long serialVersionUID = 1L;

  /** Creates an instance. */
  public ObjectAttributeListImpl() {
    super();
  }

  /**
   * Creates an instance.
   *
   * @param m the map whose mappings are to be placed in this map
   */
  public ObjectAttributeListImpl(Map<String, NotNullSet> m) {
    super(m);
  }

  /**
   * Creates an instance.
   *
   * @param m the map whose mappings are to be placed in this map
   */
  public ObjectAttributeListImpl(SortedMap<String, NotNullSet> m) {
    super(m);
  }

  @Override
  public NotNullSet get(final String key, final Object defaultValue) {
    if (this.containsKey(key)) {
      return this.get(key);
    }
    return NotNullSet.getInstance(defaultValue);
  }
}
