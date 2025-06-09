package cimerant.context.sql.impl;

import cimerant.CliVariableList;
import cimerant.FileType;
import cimerant.context.cimerant.impl.ObjectAttributeListImpl;
import cimerant.context.cimerant.impl.ObjectRootContextImpl;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.sql.SqlRootContext;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import org.apache.commons.lang3.StringUtils;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 */
public final class SqlRootContextImpl extends ObjectRootContextImpl<Map<String, Object>>
    implements SqlRootContext {
  private static final long serialVersionUID = 1L;

  private static SqlRootContext associateOtherEntity(final SqlRootContext contextObject) {
    final var objects = contextObject.getObjects();
    for (final var object : objects) {
      for (final var relationship : object.getRelationships().values()) {
        final var otherEntityRelationshipName = relationship.get("foreignTable").first();
        objects.stream()
            .filter(
                otherEntity ->
                    StringUtils.equalsIgnoreCase(
                        otherEntityRelationshipName, otherEntity.getObjectName()))
            .forEach(
                otherEntity -> {
                  relationship.setOtherEntity(otherEntity);
                  relationship.remove("foreignTable");
                });
      }
    }
    return contextObject;
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param file the context map.
   * @param fileType the type of the file to be parsed.
   * @param cliVariableList the context list of command-line interface variables.
   * @return a instance of the context.
   * @throws IOException if an I/O error occurs
   */
  public static SqlRootContext getInstance(
      final File file, final FileType fileType, final CliVariableList cliVariableList)
      throws IOException {
    Objects.requireNonNull(file);
    Objects.requireNonNull(cliVariableList);

    return switch (fileType) {
      case ATHENA -> {
        yield ContextRootImpl.registerInstance(
            SqlRootContextImpl.associateOtherEntity(
                cimerant.antlr.sql.athena.AthenaParserImpl.getInstance(file).getRootContext()));
      }
      case HIVE -> {
        yield ContextRootImpl.registerInstance(
            SqlRootContextImpl.associateOtherEntity(
                cimerant.antlr.sql.hive.v4.HiveParserImpl.getInstance(file).getRootContext()));
      }
      case MARIADB -> {
        yield ContextRootImpl.registerInstance(
            SqlRootContextImpl.associateOtherEntity(
                cimerant.antlr.sql.mariadb.MariaDBParserImpl.getInstance(file).getRootContext()));
      }
      case MYSQL -> {
        yield ContextRootImpl.registerInstance(
            SqlRootContextImpl.associateOtherEntity(
                cimerant.antlr.sql.mysql.positive.MySqlParserImpl.getInstance(file)
                    .getRootContext()));
      }
      case PHOENIX -> {
        yield ContextRootImpl.registerInstance(
            SqlRootContextImpl.associateOtherEntity(
                cimerant.antlr.sql.phoenix.PhoenixParserImpl.getInstance(file).getRootContext()));
      }
      case PLSQL -> {
        yield ContextRootImpl.registerInstance(
            SqlRootContextImpl.associateOtherEntity(
                cimerant.antlr.sql.plsql.PlSqlParserImpl.getInstance(file).getRootContext()));
      }
      case POSTGRESQL -> {
        yield ContextRootImpl.registerInstance(
            SqlRootContextImpl.associateOtherEntity(
                cimerant.antlr.sql.postgresql.PostgreSQLParserImpl.getInstance(file)
                    .getRootContext()));
      }
      case SNOWFLAKE -> {
        yield ContextRootImpl.registerInstance(
            SqlRootContextImpl.associateOtherEntity(
                cimerant.antlr.sql.snowflake.SnowflakeParserImpl.getInstance(file)
                    .getRootContext()));
      }
      case SQLITE -> {
        yield ContextRootImpl.registerInstance(
            SqlRootContextImpl.associateOtherEntity(
                cimerant.antlr.sql.sqlite.SQLiteParserImpl.getInstance(file).getRootContext()));
      }
      case TSQL -> {
        yield ContextRootImpl.registerInstance(
            SqlRootContextImpl.associateOtherEntity(
                cimerant.antlr.sql.tsql.TSqlParserImpl.getInstance(file).getRootContext()));
      }
      default -> null;
    };
  }

  /** Creates an instance. */
  public SqlRootContextImpl() {
    super(new TreeMap<>(String.CASE_INSENSITIVE_ORDER), new ObjectAttributeListImpl());
  }
}
