package cimerant.context.json.impl;

import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

enum CimerantKeys {
  CIMERANT_ATTRIBUTES,
  CIMERANT_TYPE,
  UNKNOWN;

  public static boolean isValidKey(final String key) {
    try {
      CimerantKeys.valueByKey(key);
      return true;
    } catch (final Exception e) {
      return false;
    }
  }

  public static CimerantKeys valueByKey(final String key) {
    return CimerantKeys.valueOf(key.toUpperCase(Locale.getDefault()).replace(':', '_'));
  }

  @SuppressWarnings("unchecked")
  public static CimerantKeys valueOf(final Entry<String, Object> entry) {
    var returnValue = CimerantKeys.UNKNOWN;

    if (CimerantKeys.CIMERANT_ATTRIBUTES.getKey().equals(entry.getKey())) {
      returnValue = CimerantKeys.CIMERANT_ATTRIBUTES;
    } else if (Map.class.isAssignableFrom(entry.getValue().getClass())) {
      final var map = (Map<String, Object>) entry.getValue();
      if (map.containsKey(CimerantKeys.CIMERANT_TYPE.getKey())) {
        returnValue = CimerantKeys.CIMERANT_TYPE;
      }
    }

    return returnValue;
  }

  public String getKey() {
    return this.name().toLowerCase(Locale.getDefault()).replace('_', ':');
  }
}
