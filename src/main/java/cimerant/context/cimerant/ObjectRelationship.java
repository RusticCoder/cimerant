package cimerant.context.cimerant;

import cimerant.context.NotNullSet;
import java.util.Map;

/** An object that represents an relationship. */
public interface ObjectRelationship extends Map<String, NotNullSet> {
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

  /**
   * Returns the other entity that is referenced.
   *
   * @return the other entity that is referenced.
   */
  ObjectContext<java.util.Map.Entry<String, Object>> getOtherEntity();

  /**
   * Associates the related other entity with this relationship.
   *
   * @param otherEntity value to be associated with this relationship.
   */
  void setOtherEntity(ObjectContext<Entry<String, Object>> otherEntity);
}
