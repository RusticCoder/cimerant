package cimerant;

import java.util.stream.Stream;

/** The {@code SystemCode} enumeration represents a set of predefined constants for applications. */
public enum SystemCode {
  ERR_CMA("CMA", "Cimerant");

  public static Stream<SystemCode> stream() {
    return Stream.of(SystemCode.values());
  }

  private final String code;

  private final String description;

  SystemCode(final String codeArg, final String descriptionArg) {
    this.code = codeArg;
    this.description = descriptionArg;
  }

  String getCode() {
    return this.code;
  }

  String getDescription() {
    return this.description;
  }
}
