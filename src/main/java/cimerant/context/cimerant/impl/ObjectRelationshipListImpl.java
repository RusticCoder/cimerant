package cimerant.context.cimerant.impl;

import cimerant.context.NotNullMap;
import cimerant.context.cimerant.ObjectRelationship;
import cimerant.context.cimerant.ObjectRelationshipList;
import java.util.Map;
import java.util.SortedMap;

/** An {@code Map} object that maps text descriptions to {@code ObjectRelationship}. */
public class ObjectRelationshipListImpl extends NotNullMap<String, ObjectRelationship>
    implements ObjectRelationshipList {
  private static final long serialVersionUID = 1L;

  /** Creates an instance. */
  public ObjectRelationshipListImpl() {
    super();
  }

  /**
   * Creates an instance.
   *
   * @param m the map whose mappings are to be placed in this map
   */
  public ObjectRelationshipListImpl(Map<String, ObjectRelationship> m) {
    super(m);
  }

  /**
   * Creates an instance.
   *
   * @param m the map whose mappings are to be placed in this map
   */
  public ObjectRelationshipListImpl(SortedMap<String, ObjectRelationship> m) {
    super(m);
  }
}
