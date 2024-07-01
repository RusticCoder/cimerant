package cimerant;

/** The {@code SystemCode} enumeration represents a set of predefined constants for errors. */
public enum StatusCode {
  /** Unknown error. */
  ERR_0001("Unknown error '%s'"),
  /** Invalid command-line argument. */
  ERR_0002("Invalid command-line argument '%s'"),
  /** Duplicate command-line arguments. */
  ERR_0003("Duplicate command-line arguments '%s' are not allowed"),
  /** Duplicate keys. */
  ERR_0004("Duplicate keys '%s' are not allowed"),
  /** Input file is required. */
  ERR_0005("Input file is required"),
  /** Template is required. */
  ERR_0006("Template is required"),
  /** File pattern is required. */
  ERR_0007("File pattern is required"),
  /** Single or multi is required. */
  ERR_0008("Single or multi is required"),
  /** Invalid input file path. */
  ERR_0009("Invalid input file path '%s'"),
  /** Invalid template path. */
  ERR_0010("Invalid template path '%s'"),
  /** Invalid template list path. */
  ERR_0011("Invalid template list path '%s'"),
  /** Invalid variable list path. */
  ERR_0012("Invalid variable list path '%s'"),
  /** Invalid template. */
  ERR_0013("Invalid template '%s'"),
  /** Invalid template list. */
  ERR_0014("Invalid template list '%s'"),
  /** Invalid file pattern. */
  ERR_0015("Invalid file pattern '%s'"),
  /** Invalid file pattern. */
  ERR_0016("Invalid file pattern ${CLASS_NAME} not allowed in single mode '%s'"),
  /** Invalid file pattern. */
  ERR_0017("Invalid file pattern ${CLASS_NAME} required in multi mode '%s'"),
  /** Single and multi cannot be used together. */
  ERR_0018("Single and multi cannot be used together"),
  /** Invalid variable list format. */
  ERR_0019("Invalid variable list format '%s'"),
  /** Invalid JSON file format. */
  ERR_0020("Invalid JSON file format for '%s'");

  private final String description;

  StatusCode(final String descriptionArg) {
    this.description = descriptionArg;
  }

  String getCode() {
    return this.name().substring(4);
  }

  String getDescription() {
    return this.description;
  }

  int getExitCode() {
    return -1 * Integer.parseInt(this.getCode());
  }

  SysError getSysError(final ModuleCode moduleCodeArg, final int lineNumber, final String... args) {
    return new SysError(Cimerant.SYSTEM_CODE, moduleCodeArg, this, lineNumber, args);
  }

  SysError getSysError(final ModuleCode moduleCodeArg, final String... args) {
    return new SysError(Cimerant.SYSTEM_CODE, moduleCodeArg, this, args);
  }
}
