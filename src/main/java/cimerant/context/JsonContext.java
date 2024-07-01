package cimerant.context;

import cimerant.Cimerant;
import cimerant.CimerantContext;
import cimerant.CliVariableList;
import cimerant.ModuleCode;
import cimerant.StatusCode;
import cimerant.SysError;
import cimerant.context.json.JsonRootContext;
import cimerant.context.json.impl.JsonRootContextImpl;
import cimerant.logger.CimerantLogger;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import org.slf4j.LoggerFactory;

/**
 * Interface describing the template data context. This set of routines is used by the template to
 * set and get 'named' data object to pass them to the template engine to use when rendering a
 * template.
 */
public class JsonContext implements CimerantContext<Map<String, Object>> {
  private final CliVariableList cliVariableList;
  private JsonRootContext context = null;
  private final String jsonPath;
  private final CimerantLogger logger;

  /**
   * Creates an instance.
   *
   * @param jsonPath location of the JSON file.
   * @param cliVariableList {@code CliVariableList} of Command-line Interface Variables.
   */
  public JsonContext(final String jsonPath, final CliVariableList cliVariableList) {
    Objects.requireNonNull(jsonPath);
    Objects.requireNonNull(cliVariableList);

    this.logger = (CimerantLogger) LoggerFactory.getLogger(this.getClass().getName());
    this.jsonPath = jsonPath;
    this.cliVariableList = cliVariableList;
  }

  /** Returns the associated context. */
  @Override
  public JsonRootContext getContext() throws SysError {
    final var moduleCode = ModuleCode.ERR_M08;

    if (this.context == null) {
      try {
        final var objectMapper = new ObjectMapper();
        final var file = new File(this.jsonPath);
        final Map<String, Object> map = objectMapper.readValue(file, new TypeReference<>() {});
        this.context = JsonRootContextImpl.getInstance(map, this.cliVariableList);
      } catch (final Exception e) {
        // 0001 | Unknown error
        if (this.logger.isDebugEnabled()) {
          this.logger.debug(e.getMessage(), e);
        }
        throw new SysError(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, e.getMessage());
      }
    }
    return this.context;
  }
}
