package cimerant;

/**
 * The class {@code SysError} is form of {@code Throwable} that indicates conditions that a
 * reasonable application might want to catch.
 */
public class SysError extends Exception {
  private static final long serialVersionUID = 1L;

  private static String message(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final int lineNumber,
      final String... args) {
    final var returnValue = new StringBuilder();
    returnValue.append(systemCodeArg.getCode());
    returnValue.append('-');
    returnValue.append(moduleCodeArg.getCode());
    returnValue.append('-');
    returnValue.append(statusCodeArg.getCode());
    returnValue.append(": ");
    returnValue.append(statusCodeArg.getDescription().formatted(args));
    if (0 < lineNumber) {
      returnValue.append(" line ");
      returnValue.append(lineNumber);
    }

    return returnValue.toString();
  }

  private static String message(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final String... args) {
    final var returnValue = new StringBuilder();
    returnValue.append(systemCodeArg.getCode());
    returnValue.append('-');
    returnValue.append(moduleCodeArg.getCode());
    returnValue.append('-');
    returnValue.append(statusCodeArg.getCode());
    returnValue.append(": ");
    returnValue.append(statusCodeArg.getDescription().formatted(args));

    return returnValue.toString();
  }

  /** The status code associated with the error. */
  private final StatusCode statusCode;

  /**
   * Creates an instance.
   *
   * @param systemCodeArg {@code SystemCode} associated with the error.
   * @param moduleCodeArg {@code ModuleCode} associated with the error.
   * @param statusCodeArg {@code StatusCode} associated with the error.
   * @param lineNumber line number associated with the error.
   * @param args arguments associated with the error.
   */
  public SysError(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final int lineNumber,
      final String... args) {
    super(SysError.message(systemCodeArg, moduleCodeArg, statusCodeArg, lineNumber, args));

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
  public SysError(
      final SystemCode systemCodeArg,
      final ModuleCode moduleCodeArg,
      final StatusCode statusCodeArg,
      final String... args) {
    super(SysError.message(systemCodeArg, moduleCodeArg, statusCodeArg, args));

    this.statusCode = statusCodeArg;
  }

  int getExitCode() {
    return this.statusCode.getExitCode();
  }
}
