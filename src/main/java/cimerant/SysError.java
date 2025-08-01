package cimerant;

import java.io.Serial;
import java.util.Arrays;

/**
 * The class {@code SysError} is form of {@code Throwable} that indicates conditions that a
 * reasonable application might want to catch.
 */
public class SysError extends RuntimeException {
  @Serial private static final long serialVersionUID = 1L;

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param systemCodeArg {@code SystemCode} associated with the error.
   * @param moduleCodeArg {@code ModuleCode} associated with the error.
   * @param statusCodeArg {@code StatusCode} associated with the error.
   * @param lineNumberArg line number associated with the error.
   * @param args arguments associated with the error.
   * @return a instance of the context.
   */
  public static SysError getInstance(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final int lineNumberArg,
      final String... args) {
    return new SysError(systemCodeArg, moduleCodeArg, statusCodeArg, lineNumberArg, args);
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param systemCodeArg {@code SystemCode} associated with the error.
   * @param moduleCodeArg {@code ModuleCode} associated with the error.
   * @param statusCodeArg {@code StatusCode} associated with the error.
   * @param lineNumberArg line number associated with the error.
   * @param throwableArg error thrown.
   * @param args arguments associated with the error.
   * @return a instance of the context.
   */
  public static SysError getInstance(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final int lineNumberArg,
      final Throwable throwableArg,
      final String... args) {
    return new SysError(
        systemCodeArg, moduleCodeArg, statusCodeArg, lineNumberArg, throwableArg, args);
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param systemCodeArg {@code SystemCode} associated with the error.
   * @param moduleCodeArg {@code ModuleCode} associated with the error.
   * @param statusCodeArg {@code StatusCode} associated with the error.
   * @param args arguments associated with the error.
   * @return a instance of the context.
   */
  public static SysError getInstance(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final String... args) {
    return new SysError(systemCodeArg, moduleCodeArg, statusCodeArg, args);
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param systemCodeArg {@code SystemCode} associated with the error.
   * @param moduleCodeArg {@code ModuleCode} associated with the error.
   * @param statusCodeArg {@code StatusCode} associated with the error.
   * @param throwableArg error thrown.
   * @param args arguments associated with the error.
   * @return a instance of the context.
   */
  public static SysError getInstance(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final Throwable throwableArg,
      final String... args) {
    return new SysError(systemCodeArg, moduleCodeArg, statusCodeArg, throwableArg, args);
  }

  private static String message(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final int lineNumberArg,
      final String... args) {
    final var returnValue = new StringBuilder();

    final var output = Arrays.stream(args).toArray(Object[]::new);
    returnValue.append(systemCodeArg.getCode());
    returnValue.append('-');
    returnValue.append(moduleCodeArg.getCode());
    returnValue.append('-');
    returnValue.append(statusCodeArg.getCode());
    returnValue.append(": ");
    returnValue.append(statusCodeArg.getDescription().formatted(output));
    if (0 < lineNumberArg) {
      returnValue.append(" line ");
      returnValue.append(lineNumberArg);
    }

    return returnValue.toString();
  }

  private static String message(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final int lineNumberArg,
      final Throwable throwableArg,
      final String... args) {
    final String[] tempArgs;
    if (throwableArg == null) {
      tempArgs = Arrays.stream(args).toArray(String[]::new);
    } else {
      tempArgs = new String[args.length + 1];
      tempArgs[0] = throwableArg.getMessage();
      if (tempArgs[0] == null) {
        tempArgs[0] = throwableArg.getClass().getSimpleName();
      }
      System.arraycopy(args, 0, tempArgs, 1, args.length);
    }

    final var returnValue = new StringBuilder();
    returnValue.append(systemCodeArg.getCode());
    returnValue.append('-');
    returnValue.append(moduleCodeArg.getCode());
    returnValue.append('-');
    returnValue.append(statusCodeArg.getCode());
    returnValue.append(": ");
    returnValue.append(statusCodeArg.getDescription().formatted(tempArgs));
    if (0 < lineNumberArg) {
      returnValue.append(" line ");
      returnValue.append(lineNumberArg);
    }

    return returnValue.toString();
  }

  private static String message(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final String... args) {
    return message(systemCodeArg, moduleCodeArg, statusCodeArg, -1, null, args);
  }

  private static String message(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final Throwable throwableArg,
      final String... args) {
    final var tempArgs = new Object[args.length + 1];
    tempArgs[0] = throwableArg.getMessage();
    if (tempArgs[0] == null) {
      tempArgs[0] = throwableArg.getClass().getSimpleName();
    }
    System.arraycopy(args, 0, tempArgs, 1, args.length);

    return systemCodeArg.getCode()
        + '-'
        + moduleCodeArg.getCode()
        + '-'
        + statusCodeArg.getCode()
        + ": "
        + statusCodeArg.getDescription().formatted(tempArgs);
  }

  /** The status code associated with the error. */
  private final StatusCode statusCode;

  /**
   * Creates an instance.
   *
   * @param systemCodeArg {@code SystemCode} associated with the error.
   * @param moduleCodeArg {@code ModuleCode} associated with the error.
   * @param statusCodeArg {@code StatusCode} associated with the error.
   * @param lineNumberArg line number associated with the error.
   * @param args arguments associated with the error.
   */
  private SysError(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final int lineNumberArg,
      final String... args) {
    super(SysError.message(systemCodeArg, moduleCodeArg, statusCodeArg, lineNumberArg, args));
    this.statusCode = statusCodeArg;
  }

  /**
   * Creates an instance.
   *
   * @param systemCodeArg {@code SystemCode} associated with the error.
   * @param moduleCodeArg {@code ModuleCode} associated with the error.
   * @param statusCodeArg {@code StatusCode} associated with the error.
   * @param lineNumberArg line number associated with the error.
   * @param throwableArg error thrown.
   * @param args arguments associated with the error.
   */
  private SysError(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final int lineNumberArg,
      final Throwable throwableArg,
      final String... args) {
    super(
        SysError.message(
            systemCodeArg, moduleCodeArg, statusCodeArg, lineNumberArg, throwableArg, args),
        throwableArg);
    this.statusCode = statusCodeArg;
  }

  /**
   * Creates an instance.
   *
   * @param systemCodeArg {@code SystemCode} associated with the error.
   * @param moduleCodeArg {@code ModuleCode} associated with the error.
   * @param statusCodeArg {@code StatusCode} associated with the error.
   * @param args arguments associated with the error.
   */
  private SysError(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final String... args) {
    super(SysError.message(systemCodeArg, moduleCodeArg, statusCodeArg, args));

    this.statusCode = statusCodeArg;
  }

  /**
   * Creates an instance.
   *
   * @param systemCodeArg {@code SystemCode} associated with the error.
   * @param moduleCodeArg {@code ModuleCode} associated with the error.
   * @param statusCodeArg {@code StatusCode} associated with the error.
   * @param throwableArg error thrown.
   * @param args arguments associated with the error.
   */
  private SysError(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final Throwable throwableArg,
      final String... args) {
    super(
        SysError.message(systemCodeArg, moduleCodeArg, statusCodeArg, throwableArg, args),
        throwableArg);

    this.statusCode = statusCodeArg;
  }

  int getExitCode() {
    return this.statusCode.getExitCode();
  }
}
