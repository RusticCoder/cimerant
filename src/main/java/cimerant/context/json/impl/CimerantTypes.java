package cimerant.context.json.impl;

import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

enum CimerantTypes {
  ENTITY,
  FIELD,
  GROUPING,
  RELATIONSHIP,
  UNKNOWN;

  @SuppressWarnings("unchecked")
  static CimerantTypes valueOf(final Entry<String, Object> entry) {
    CimerantTypes returnValue;

    try {
      final var map = (Map<String, Object>) entry.getValue();
      final var key = map.get(CimerantKeys.CIMERANT_TYPE.getKey());
      returnValue = CimerantTypes.valueOf(key.toString().toUpperCase(Locale.getDefault()));
    } catch (final Exception e) {
      returnValue = CimerantTypes.UNKNOWN;
    }

    return returnValue;
  }
}
