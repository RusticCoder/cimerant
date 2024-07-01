package cimerant;

/**
 * The {@code ModuleCode} enumeration represents a set of predefined constants for code locations.
 */
public enum ModuleCode {
  /** ParsedCommandLine.getCmd() */
  ERR_M00("Invalid Command"),
  /**
   * ParsedCommandLine.getCliValueList()
   *
   * <p>ParsedCommandLine.getCliVariableList()
   */
  ERR_M01("Invalid Command Line Values"),
  /**
   * ParsedCommandLine.getErrors()
   *
   * <p>Cimerant.main(String...)
   */
  ERR_M02("Errors"),
  /** CliValueList.addCliValue(List) */
  ERR_M03("Duplicate"),
  /** CliValueList.addCliValuesByTemplateList(String) */
  ERR_M05("Invalid Template List"),
  /** CliVariableList.addCliVariablesByVariableList(String) */
  ERR_M06("Invalid Variable List"),
  /** ParsedCommandLine.validateJson(String) */
  ERR_M07("Invalid JSON Schema"),
  /** JsonContext.getContext() */
  ERR_M08("JSON Validation Error"),
  /** Unused. */
  ERR_P00("Invalid Parser");

  private final String code;
  private final String description;

  ModuleCode(final String descriptionArg) {
    this.code = this.name().substring(this.name().length() - 3);
    this.description = descriptionArg;
  }

  String getCode() {
    return this.code;
  }

  String getDescription() {
    return this.description;
  }
}
