package cimerant.logger;

import cimerant.SysError;
import java.util.Queue;
import org.slf4j.Logger;

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
}
