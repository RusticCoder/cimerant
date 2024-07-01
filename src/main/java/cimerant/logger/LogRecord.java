package cimerant.logger;

import org.slf4j.Marker;
import org.slf4j.event.Level;

/**
 * The {@code LogRecord} class represents the message and associated data at the time of logging.
 *
 * @param nanoTime message time in nanoseconds.
 * @param loggerName logger name associated with the message.
 * @param level {@code Level} associated with the message.
 * @param marker {@code Marker} associated with the message.
 * @param message message associated with the log.
 * @param exception {@code Throwable} associated with the log.
 */
public record LogRecord(
    long nanoTime,
    String loggerName,
    Level level,
    Marker marker,
    String message,
    Throwable exception) {
  /** Returns a string representation of the object. */
  @Override
  public String toString() {
    // final var message = new StringBuilder(32);

    // Append a readable representation of the log level
    // message.append('[');
    // message.append(this.level.name());
    // message.append(']');
    // message.append(' ');

    // if (this.marker != null) {
    // message.append(this.marker.getName());
    // message.append(' ');
    // }

    // Append the message
    // message.append(this.message);
    if (this.message == null) {
      if (this.exception != null) {
        return this.exception.getClass().getSimpleName();
      }
      return "null";
    }
    return this.message.toString();
  }
}
