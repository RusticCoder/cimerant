package cimerant.logger;

import cimerant.SysError;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import org.slf4j.helpers.LegacyAbstractLogger;
import org.slf4j.helpers.MessageFormatter;

/**
 * Provides minimal default implementations for {@link #isTraceEnabled(Marker)}, {@link
 * #isDebugEnabled(Marker)} and other similar methods.
 */
public class CimerantLoggerImpl extends LegacyAbstractLogger implements CimerantLogger {
  private static final Queue<LogRecord> LOG_RECORD_QUEUE = new ConcurrentLinkedQueue<>();
  private static final long serialVersionUID = 1L;
  private static final Queue<SysError> SYS_ERROR_QUEUE = new ConcurrentLinkedQueue<>();

  /**
   * Package access allows only {@link CimerantLoggerFactory} to instantiate CimerantLogger
   * instances.
   */
  CimerantLoggerImpl(final String name) {
    this.name = name;
  }

  /** Remove all the elements, effectively emptying it. */
  @Override
  public void clear() {
    CimerantLoggerImpl.LOG_RECORD_QUEUE.clear();
    CimerantLoggerImpl.SYS_ERROR_QUEUE.clear();
  }

  private Level getCurrentLogLevel() {
    try {
      return Level.valueOf(System.getProperty("slf4j.level"));
    } catch (final Exception e) {
      return Level.ERROR;
    }
  }

  /** Returns the fully qualified name of the calling object. */
  @Override
  protected String getFullyQualifiedCallerName() {
    return this.getClass().getName();
  }

  /** Returns the list of logs messages. */
  @Override
  public Queue<LogRecord> getLogRecordQueue() {
    return CimerantLoggerImpl.LOG_RECORD_QUEUE;
  }

  /** Returns the list of error messages. */
  @Override
  public Queue<SysError> getSysErrorQueue() {
    return CimerantLoggerImpl.SYS_ERROR_QUEUE;
  }

  /** Given various arguments passed as parameters, perform actual logging. */
  @Override
  protected void handleNormalizedLoggingCall(
      final Level level,
      final Marker marker,
      final String messagePattern,
      final Object[] arguments,
      final Throwable throwable) {
    if (throwable != null && SysError.class.isAssignableFrom(throwable.getClass())) {
      final var sysError = (SysError) throwable;
      synchronized (CimerantLoggerImpl.SYS_ERROR_QUEUE) {
        CimerantLoggerImpl.SYS_ERROR_QUEUE.add(sysError);
      }
      synchronized (CimerantLoggerImpl.LOG_RECORD_QUEUE) {
        if (this.isLevelEnabled(Level.ERROR)) {
          CimerantLoggerImpl.LOG_RECORD_QUEUE.add(
              new LogRecord(
                  System.nanoTime(),
                  this.getName(),
                  Level.ERROR,
                  marker,
                  MessageFormatter.basicArrayFormat(messagePattern, arguments),
                  throwable));
        }
      }
    } else {
      synchronized (CimerantLoggerImpl.LOG_RECORD_QUEUE) {
        if (this.isLevelEnabled(level)) {
          CimerantLoggerImpl.LOG_RECORD_QUEUE.add(
              new LogRecord(
                  System.nanoTime(),
                  this.getName(),
                  level,
                  marker,
                  MessageFormatter.basicArrayFormat(messagePattern, arguments),
                  throwable));
        }
      }
    }
  }

  /** Returns {@code true} if the log contains errors. */
  @Override
  public boolean hasSysError() {
    return !this.getSysErrorQueue().isEmpty();
  }

  /** Returns {@code true} if the logger instance is enabled for the DEBUG level. */
  @Override
  public boolean isDebugEnabled() {
    return this.isLevelEnabled(Level.DEBUG);
  }

  /** Returns {@code true} if the logger instance is enabled for the ERROR level. */
  @Override
  public boolean isErrorEnabled() {
    return this.isLevelEnabled(Level.ERROR);
  }

  /** Returns {@code true} if the logger instance is enabled for the INFO level. */
  @Override
  public boolean isInfoEnabled() {
    return this.isLevelEnabled(Level.INFO);
  }

  /** Returns {@code true} if the logger instance is enabled for a specific level. */
  private boolean isLevelEnabled(final Level logLevel) {
    return this.getCurrentLogLevel().toInt() <= logLevel.toInt();
  }

  /** Returns {@code true} if the logger instance is enabled for the TRACE level. */
  @Override
  public boolean isTraceEnabled() {
    return this.isLevelEnabled(Level.TRACE);
  }

  /** Returns {@code true} if the logger instance is enabled for the WARN level. */
  @Override
  public boolean isWarnEnabled() {
    return this.isLevelEnabled(Level.WARN);
  }
}
