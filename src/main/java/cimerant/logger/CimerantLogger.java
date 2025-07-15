package cimerant.logger;

import cimerant.SysError;
import java.util.Queue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The process of recording events, messages, or data points generated. */
public interface CimerantLogger extends Logger {
  /** Remove all the elements, effectively emptying it. */
  void clear();

  /**
   * Returns the list of logs messages.
   *
   * @return the list of logs messages.
   */
  Queue<LogRecord> getLogRecordQueue();

  /**
   * Returns the list of error messages.
   *
   * @return the list of error messages.
   */
  Queue<SysError> getSysErrorQueue();

  /**
   * Returns {@code true} if the log contains errors.
   *
   * @return if the log contains errors
   */
  boolean hasSysError();

  /**
   * Guarantee the instance is of type Cimerant logger.
   *
   * @param className The name of the logger.
   * @return Instance of Cimerant logger.
   */
  static CimerantLogger getLogger(final String className) {
    final var logger = LoggerFactory.getLogger(className);

    if (logger instanceof CimerantLogger) {
      return (CimerantLogger) logger;
    }
    return new CimerantLoggerFactory().getLogger(className);
  }
}
