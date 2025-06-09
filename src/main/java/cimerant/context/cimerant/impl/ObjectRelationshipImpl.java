package cimerant.context.cimerant.impl;

import cimerant.context.NotNullMap;
import cimerant.context.NotNullSet;
import cimerant.context.cimerant.ObjectContext;
import cimerant.context.cimerant.ObjectRelationship;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/** An object that represents an relationship. */
public class ObjectRelationshipImpl extends NotNullMap<String, NotNullSet>
    implements ObjectRelationship {
  private static final long serialVersionUID = 1L;

  private ObjectContext<java.util.Map.Entry<String, Object>> otherEntity;

  /** Creates an instance. */
  public ObjectRelationshipImpl() {}

  /**
   * Creates an instance.
   *
   * @param map the map whose mappings are to be placed in this map
   */
  public ObjectRelationshipImpl(final Map<String, Object> map) {
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
  public ObjectRelationshipImpl(final SortedMap<String, NotNullSet> map) {
    map.forEach(
        (string, object) -> {
          if (string != null && object != null) {
            if (object instanceof NotNullSet) {
              this.put(string, object);
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

  @Override
  public ObjectContext<java.util.Map.Entry<String, Object>> getOtherEntity() {
    return otherEntity;
  }

  @Override
  public void setOtherEntity(ObjectContext<java.util.Map.Entry<String, Object>> otherEntity) {
    this.otherEntity = otherEntity;
  }
}
