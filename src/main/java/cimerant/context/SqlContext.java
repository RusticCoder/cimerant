package cimerant.context;

import cimerant.Cimerant;
import cimerant.CimerantContext;
import cimerant.CliVariableList;
import cimerant.FileType;
import cimerant.ModuleCode;
import cimerant.StatusCode;
import cimerant.SysError;
import cimerant.context.sql.SqlRootContext;
import cimerant.logger.CimerantLogger;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import org.slf4j.LoggerFactory;

/**
 * Interface describing the template data context. This set of routines is used by the template to
 * set and get 'named' data object to pass them to the template engine to use when rendering a
 * template.
 */
public class SqlContext implements CimerantContext<Map<String, Object>> {
  private final CliVariableList cliVariableList;
  private SqlRootContext context = null;
  private final File file;
  private final FileType fileType;
  private final CimerantLogger logger;

  /**
   * Creates an instance.
   *
   * @param file location of the SQL file.
   * @param fileType the type of the file to be parsed.
   * @param cliVariableList {@code CliVariableList} of Command-line Interface Variables.
   */
  public SqlContext(
      final File file, final FileType fileType, final CliVariableList cliVariableList) {
    Objects.requireNonNull(file);
    Objects.requireNonNull(fileType);
    Objects.requireNonNull(cliVariableList);

    this.logger = (CimerantLogger) LoggerFactory.getLogger(this.getClass().getName());
    this.file = file;
    this.fileType = fileType;
    this.cliVariableList = cliVariableList;
  }

  /** Returns the associated context. */
  @Override
  public SqlRootContext getContext() {
    final var moduleCode = ModuleCode.ERR_M2100;

    if (this.context == null) {
      try {
        this.context =
            (SqlRootContext) this.fileType.getRootContext(this.file, this.cliVariableList);
      } catch (final SysError s) {
        throw s;
      } catch (final Throwable t) {
        // 0001 | Unknown error
        if (this.logger.isDebugEnabled()) {
          this.logger.debug(t.getMessage(), t);
        }
        throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
      }
    }
    return this.context;
  }
}
