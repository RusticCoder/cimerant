package cimerant.context.json.impl;

import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

enum CimerantKeys {
  CIMERANT_ATTRIBUTES,
  CIMERANT_TYPE,
  UNKNOWN;

  public static boolean isValidKey(final String key) {
    try {
      CimerantKeys.valueByKey(key);
      return true;
    } catch (final Throwable t) {
      return false;
    }
  }

  public static Stream<CimerantKeys> stream() {
    return Stream.of(CimerantKeys.values());
  }

  public static CimerantKeys valueByKey(final String key) {
    return CimerantKeys.valueOf(StringUtils.upperCase(key, Locale.getDefault()).replace(':', '_'));
  }

  public static CimerantKeys valueOf(final Entry<String, Object> entry) {
    var returnValue = CimerantKeys.UNKNOWN;

    if (CimerantKeys.CIMERANT_ATTRIBUTES.getKey().equals(entry.getKey())) {
      returnValue = CimerantKeys.CIMERANT_ATTRIBUTES;
    } else if (entry.getValue() instanceof final Map<?, ?> map
        && map.containsKey(CimerantKeys.CIMERANT_TYPE.getKey())) {
      returnValue = CimerantKeys.CIMERANT_TYPE;
    }

    return returnValue;
  }

  public String getKey() {
    return StringUtils.lowerCase(this.name(), Locale.getDefault()).replace('_', ':');
  }
}
