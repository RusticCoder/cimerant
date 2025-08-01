package cimerant;

import cimerant.context.cimerant.ObjectRootContext;
import cimerant.context.sql.SqlRootContext;
import cimerant.context.sql.impl.SqlRootContextImpl;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

/** List of file types with methods to return context related objects. */
public enum FileType {
  /** AWS Athena database query language. */
  ATHENA {
    @Override
    public cimerant.context.SqlContext getInstance(
        final File file, final CliVariableList cliVariableList) {
      return new cimerant.context.SqlContext(file, this, cliVariableList);
    }

    @Override
    public SqlRootContext getRootContext(final File file, final CliVariableList cliVariableList) {
      return SqlRootContextImpl.getInstance(file, this, cliVariableList);
    }

    @Override
    public boolean isValid(final File file) {
      try {
        final var parser = cimerant.antlr.sql.athena.AthenaParserImpl.getInstance(file);
        parser.stmt();
        return 0 >= parser.getNumberOfSyntaxErrors();
      } catch (final Throwable t) {
        return false;
      }
    }
  },
  /** Hive Query Language database query language. */
  HIVE {
    @Override
    public cimerant.context.SqlContext getInstance(
        final File file, final CliVariableList cliVariableList) {
      return new cimerant.context.SqlContext(file, this, cliVariableList);
    }

    @Override
    public SqlRootContext getRootContext(final File file, final CliVariableList cliVariableList) {
      return SqlRootContextImpl.getInstance(file, this, cliVariableList);
    }

    @Override
    public boolean isValid(final File file) {
      try {
        final var parser = cimerant.antlr.sql.hive.v4.HiveParserImpl.getInstance(file);
        parser.statement();
        return 0 >= parser.getNumberOfSyntaxErrors();
      } catch (final Throwable t) {
        return false;
      }
    }
  },
  /** JSON data format. */
  JSON {
    @Override
    public cimerant.context.JsonContext getInstance(
        final File file, final CliVariableList cliVariableList) {
      return new cimerant.context.JsonContext(file, cliVariableList);
    }

    @Override
    public cimerant.context.json.JsonRootContext getRootContext(
        final File file, final CliVariableList cliVariableList) {
      return cimerant.context.json.impl.JsonRootContextImpl.getInstance(file, cliVariableList);
    }

    @Override
    public boolean isValid(final File file) {
      try {
        final var mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        mapper.readTree(file);
        return true;
      } catch (final IOException e) {
        return false;
      }
    }
  },
  /** MariaDB database query language. */
  MARIADB {
    @Override
    public cimerant.context.SqlContext getInstance(
        final File file, final CliVariableList cliVariableList) {
      return new cimerant.context.SqlContext(file, this, cliVariableList);
    }

    @Override
    public SqlRootContext getRootContext(final File file, final CliVariableList cliVariableList) {
      return SqlRootContextImpl.getInstance(file, this, cliVariableList);
    }

    @Override
    public boolean isValid(final File file) {
      try {
        final var parser = cimerant.antlr.sql.mariadb.MariaDBParserImpl.getInstance(file);
        parser.root();
        return 0 >= parser.getNumberOfSyntaxErrors();
      } catch (final Throwable t) {
        return false;
      }
    }
  },
  /** MySQL (Positive Technologies) database query language. */
  MYSQL {
    @Override
    public cimerant.context.SqlContext getInstance(
        final File file, final CliVariableList cliVariableList) {
      return new cimerant.context.SqlContext(file, this, cliVariableList);
    }

    @Override
    public SqlRootContext getRootContext(final File file, final CliVariableList cliVariableList) {
      return SqlRootContextImpl.getInstance(file, this, cliVariableList);
    }

    @Override
    public boolean isValid(final File file) {
      try {
        final var parser = cimerant.antlr.sql.mysql.positive.MySqlParserImpl.getInstance(file);
        parser.root();
        return 0 >= parser.getNumberOfSyntaxErrors();
      } catch (final Throwable t) {
        return false;
      }
    }
  },
  /** Apache Phoenix database query language. */
  PHOENIX {
    @Override
    public cimerant.context.SqlContext getInstance(
        final File file, final CliVariableList cliVariableList) {
      return new cimerant.context.SqlContext(file, this, cliVariableList);
    }

    @Override
    public SqlRootContext getRootContext(final File file, final CliVariableList cliVariableList) {
      return SqlRootContextImpl.getInstance(file, this, cliVariableList);
    }

    @Override
    public boolean isValid(final File file) {
      try {
        final var parser = cimerant.antlr.sql.phoenix.PhoenixParserImpl.getInstance(file);
        parser.phoenix_file();
        return 0 >= parser.getNumberOfSyntaxErrors();
      } catch (final Throwable t) {
        return false;
      }
    }
  },
  /** Oracle(c) PL/SQL 11g database query language. */
  PLSQL {
    @Override
    public cimerant.context.SqlContext getInstance(
        final File file, final CliVariableList cliVariableList) {
      return new cimerant.context.SqlContext(file, this, cliVariableList);
    }

    @Override
    public SqlRootContext getRootContext(final File file, final CliVariableList cliVariableList) {
      return SqlRootContextImpl.getInstance(file, this, cliVariableList);
    }

    @Override
    public boolean isValid(final File file) {
      try {
        final var parser = cimerant.antlr.sql.plsql.PlSqlParserImpl.getInstance(file);
        parser.sql_script();
        return 0 >= parser.getNumberOfSyntaxErrors();
      } catch (final Throwable t) {
        return false;
      }
    }
  },
  /** Postgres database query language. */
  POSTGRESQL {
    @Override
    public cimerant.context.SqlContext getInstance(
        final File file, final CliVariableList cliVariableList) {
      return new cimerant.context.SqlContext(file, this, cliVariableList);
    }

    @Override
    public SqlRootContext getRootContext(final File file, final CliVariableList cliVariableList) {
      return SqlRootContextImpl.getInstance(file, this, cliVariableList);
    }

    @Override
    public boolean isValid(final File file) {
      try {
        final var parser = cimerant.antlr.sql.postgresql.PostgreSQLParserImpl.getInstance(file);
        parser.root();
        return 0 >= parser.getNumberOfSyntaxErrors();
      } catch (final Throwable t) {
        return false;
      }
    }
  },
  /** Snowflake database query language. */
  SNOWFLAKE {
    @Override
    public cimerant.context.SqlContext getInstance(
        final File file, final CliVariableList cliVariableList) {
      return new cimerant.context.SqlContext(file, this, cliVariableList);
    }

    @Override
    public SqlRootContext getRootContext(final File file, final CliVariableList cliVariableList) {
      return SqlRootContextImpl.getInstance(file, this, cliVariableList);
    }

    @Override
    public boolean isValid(final File file) {
      try {
        final var parser = cimerant.antlr.sql.snowflake.SnowflakeParserImpl.getInstance(file);
        parser.snowflake_file();
        return 0 >= parser.getNumberOfSyntaxErrors();
      } catch (final Throwable t) {
        return false;
      }
    }
  },
  /** SQLite database query language. */
  SQLITE {
    @Override
    public cimerant.context.SqlContext getInstance(
        final File file, final CliVariableList cliVariableList) {
      return new cimerant.context.SqlContext(file, this, cliVariableList);
    }

    @Override
    public SqlRootContext getRootContext(final File file, final CliVariableList cliVariableList) {
      return SqlRootContextImpl.getInstance(file, this, cliVariableList);
    }

    @Override
    public boolean isValid(final File file) {
      try {
        final var parser = cimerant.antlr.sql.sqlite.SQLiteParserImpl.getInstance(file);
        parser.parse();
        return 0 >= parser.getNumberOfSyntaxErrors();
      } catch (final Throwable t) {
        return false;
      }
    }
  },
  /** T-SQL (Transact-SQL, MSSQL) database query language. */
  TSQL {
    @Override
    public cimerant.context.SqlContext getInstance(
        final File file, final CliVariableList cliVariableList) {
      return new cimerant.context.SqlContext(file, this, cliVariableList);
    }

    @Override
    public SqlRootContext getRootContext(final File file, final CliVariableList cliVariableList) {
      return SqlRootContextImpl.getInstance(file, this, cliVariableList);
    }

    @Override
    public boolean isValid(final File file) {
      try {
        final var parser = cimerant.antlr.sql.tsql.TSqlParserImpl.getInstance(file);
        parser.tsql_file();
        return 0 >= parser.getNumberOfSyntaxErrors();
      } catch (final Throwable t) {
        return false;
      }
    }
  },
  /** Unknown data format. */
  UNKNOWN {
    @Override
    public CimerantContext<Map<String, Object>> getInstance(
        final File file, final CliVariableList cliVariableList) {
      return null;
    }

    @Override
    public ObjectRootContext<Map<String, Object>> getRootContext(
        final File file, final CliVariableList cliVariableList) {
      return null;
    }

    @Override
    public boolean isValid(final File file) {
      return false;
    }
  };

  static FileType getEnum(final String inputFile, final String value) {
    if (StringUtils.isNotEmpty(value)) {
      try {
        return FileType.valueOf(StringUtils.upperCase(value, Locale.getDefault()));
      } catch (final Throwable t) {
        return UNKNOWN;
      }
    }

    if (inputFile.endsWith(".json")) {
      return FileType.JSON;
    }
    if (inputFile.endsWith(".sql")) {
      return FileType.TSQL;
    }

    return UNKNOWN;
  }

  /**
   * Returns a sequential ordered stream whose elements are the specified values.
   *
   * @return the new stream
   */
  public static Stream<FileType> stream() {
    return Stream.of(FileType.values());
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param file the path to the object model file.
   * @param cliVariableList the context list of command-line interface variables.
   * @return a instance of the context.
   */
  abstract CimerantContext<Map<String, Object>> getInstance(
      final File file, final CliVariableList cliVariableList);

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param file the context map.
   * @param cliVariableList the context list of command-line interface variables.
   * @return a instance of the context.
   */
  public abstract ObjectRootContext<Map<String, Object>> getRootContext(
      final File file, final CliVariableList cliVariableList);

  /**
   * Returns {@code true} if the object model is valid.
   *
   * @return {@code true} if the object model is valid.
   */
  abstract boolean isValid(final File file);
}
