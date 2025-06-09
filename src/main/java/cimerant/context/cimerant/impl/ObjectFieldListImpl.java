package cimerant.context.cimerant.impl;

import cimerant.context.NotNullMap;
import cimerant.context.cimerant.ObjectField;
import cimerant.context.cimerant.ObjectFieldList;
import java.util.Map;
import java.util.SortedMap;

/** An {@code Map} object that maps text descriptions to {@code ObjectField}. */
public class ObjectFieldListImpl extends NotNullMap<String, ObjectField>
    implements ObjectFieldList {
  private static final long serialVersionUID = 1L;

  /** Creates an instance. */
  public ObjectFieldListImpl() {
    super();
  }

  /**
   * Creates an instance.
   *
   * @param m the map whose mappings are to be placed in this map
   */
  public ObjectFieldListImpl(Map<String, ObjectField> m) {
    super(m);
  }

  /**
   * Creates an instance.
   *
   * @param m the map whose mappings are to be placed in this map
   */
  public ObjectFieldListImpl(SortedMap<String, ObjectField> m) {
    super(m);
  }
}
