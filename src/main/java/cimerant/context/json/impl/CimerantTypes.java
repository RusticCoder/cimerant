package cimerant.context.json.impl;

import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

enum CimerantTypes {
  ENTITY,
  FIELD,
  GROUPING,
  RELATIONSHIP,
  UNKNOWN;

  public static Stream<CimerantTypes> stream() {
    return Stream.of(CimerantTypes.values());
  }

  static CimerantTypes valueOf(final Entry<String, Object> entry) {
    CimerantTypes returnValue;

    try {
      if (entry.getValue() instanceof final Map map) {
        final var key = map.get(CimerantKeys.CIMERANT_TYPE.getKey());
        returnValue =
            CimerantTypes.valueOf(StringUtils.upperCase(key.toString(), Locale.getDefault()));
      } else {
        returnValue = CimerantTypes.UNKNOWN;
      }
    } catch (final Throwable t) {
      returnValue = CimerantTypes.UNKNOWN;
    }

    return returnValue;
  }
}
