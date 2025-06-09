package cimerant;

import java.util.stream.Stream;

/**
 * The {@code ModuleCode} enumeration represents a set of predefined constants for code locations.
 */
public enum ModuleCode {
  /** Cimerant.execute(String...) method. */
  ERR_M0100("Errors"),
  /** ParsedCommandLine.isValid() method. */
  ERR_M0200("Errors"),
  /** ParsedCommandLine.getCmd() method. */
  ERR_M0201("Invalid Command"),
  /** ParsedCommandLine.getCliValueList() method. */
  ERR_M0202("Invalid Command Line Values"),
  /** ParsedCommandLine.getCliVariableList() method. */
  ERR_M0203("Invalid Command Line Values"),
  /** CliValueList.addCliValue(List) method. */
  ERR_M0300("Duplicate"),
  /** CliValueList.addCliValuesByTemplateList(String) method. */
  ERR_M0301("Invalid Template List"),
  /** CliVariableList.ParseVariables.ParseVariables(String) method. */
  ERR_M0400("Invalid Variable List"),
  /** JsonContext.getContext() method. */
  ERR_M0500("JSON Validation Error"),
  /** JsonRootContextImpl.getInstance(Map, CliVariableList) method. */
  ERR_M0600("Get instance error"),
  /** ContextRootImpl.getInstance(File) method. */
  ERR_M0700("Get instance error"),
  /** CollectionContextImpl.getInstance(File) method. */
  ERR_M0800("Get instance error"),
  /** IteratorContextImpl.getInstance(File) method. */
  ERR_M0900("Get instance error"),
  /** ListIteratorContextImpl.getInstance(File) method. */
  ERR_M1000("Get instance error"),
  /** MapContextImpl.getInstance(File) method. */
  ERR_M1100("Get instance error"),
  /** MapEntryContextImpl.getInstance(File) method. */
  ERR_M1200("Get instance error"),
  /** MapEntrySetContextImpl.getInstance(File) method. */
  ERR_M1300("Get instance error"),
  /** SetContextImpl.getInstance(File) method. */
  ERR_M1400("Get instance error"),
  /** StringContextImpl.getInstance(File) method. */
  ERR_M1500("Get instance error"),
  /** StringMapContextImpl.getInstance(File) method. */
  ERR_M1600("Get instance error"),
  /** ListContextImpl.getInstance(E) method. */
  ERR_M1700("Get instance error"),
  /** MapEntryIteratorContextImpl.getInstance(Iterator) method. */
  ERR_M1800("Get instance error"),
  /** MapEntryListIteratorContextImpl.getInstance(ListIterator) method. */
  ERR_M1900("Get instance error"),
  /** JsonContextImpl.getInstance(JsonRootContext, List, Entry) method. */
  ERR_M2000("Get instance error"),
  /** SqlContext.getContext() method. */
  ERR_M2100("SQL Validation Error"),
  /** AthenaParserImpl.getInstance(File) method. */
  ERR_M2200("Get instance error"),
  /** HiveParserImpl.getInstance(File) method. */
  ERR_M2500("Get instance error"),
  /** MariaDBParserImpl.getInstance(File) method. */
  ERR_M2700("Get instance error"),
  /** MySqlParserImpl.getInstance(File) method. */
  ERR_M2800("Get instance error"),
  /** PhoenixParserImpl.getInstance(File) method. */
  ERR_M2900("Get instance error"),
  /** PlSqlParserImpl.getInstance(File) method. */
  ERR_M3000("Get instance error"),
  /** PostgreSQLParserImpl.getInstance(File) method. */
  ERR_M3100("Get instance error"),
  /** SnowflakeParserImpl.getInstance(File) method. */
  ERR_M3200("Get instance error"),
  /** SQLiteParserImpl.getInstance(File) method. */
  ERR_M3300("Get instance error"),
  /** TSqlParserImpl.getInstance(File) method. */
  ERR_M3500("Get instance error");

  public static Stream<ModuleCode> stream() {
    return Stream.of(ModuleCode.values());
  }

  private final String code;

  private final String description;

  ModuleCode(final String descriptionArg) {
    this.code = this.name().substring(this.name().lastIndexOf("_") + 1);
    this.description = descriptionArg;
  }

  String getCode() {
    return this.code;
  }

  String getDescription() {
    return this.description;
  }
}
