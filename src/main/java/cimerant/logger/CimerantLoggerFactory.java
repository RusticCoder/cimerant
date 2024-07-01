package cimerant.logger;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/** <code>CimerantLoggerFactory</code> instances manufacture {@link Logger} instances by name. */
public class CimerantLoggerFactory implements ILoggerFactory {
  private static final Map<String, CimerantLogger> LOGGER_MAP = new ConcurrentHashMap<>();

  /** Remove all the elements, effectively emptying it. */
  public static void clear() {
    for (final var cimerantLogger : CimerantLoggerFactory.LOGGER_MAP.values()) {
      cimerantLogger.clear();
    }
  }

  /**
   * Return an appropriate {@link Logger} instance as specified by the <code>name</code> parameter.
   */
  @Override
  public CimerantLogger getLogger(final String name) {
    Objects.requireNonNull(name);

    synchronized (CimerantLoggerFactory.LOGGER_MAP) {
      if (!CimerantLoggerFactory.LOGGER_MAP.containsKey(name)) {
        CimerantLoggerFactory.LOGGER_MAP.putIfAbsent(name, new CimerantLoggerImpl(name));
      }
    }

    return CimerantLoggerFactory.LOGGER_MAP.get(name);
  }
}
