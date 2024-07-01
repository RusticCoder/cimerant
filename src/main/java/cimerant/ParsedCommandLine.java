package cimerant;

import cimerant.CliValueList.CliValue;
import cimerant.CliValueList.CliValue.SingleMulti;
import cimerant.CliVariableList.CliVariable;
import cimerant.context.ContextRoot;
import cimerant.context.JsonContext;
import cimerant.context.json.impl.JsonContextImpl;
import cimerant.context.json.impl.JsonRootContextImpl;
import cimerant.logger.CimerantLogger;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

class ParsedCommandLine {
  enum CliOptions {
    DEBUG(
        Option.builder() //
            .longOpt("debug") //
            .hasArg(false) //
            .desc("Display debug logging.") //
            .required(false) //
            .build() //
        ),
    ERROR(
        Option.builder() //
            .longOpt("error") //
            .hasArg(false) //
            .desc("Display error logging.") //
            .required(false) //
            .build() //
        ),
    FILE_PATTERN(
        Option.builder() //
            .option("f")
            .longOpt("file") //
            .hasArg(true) //
            .argName("file") //
            .desc(
                """
            The pattern for the file name to be created allowing ${CLASS_NAME}\
             as a variable to be substituted when creating the file\
             (cannot be used in conjunction with -l, --list).

            ${CLASS_NAME} is required for multi and not allowed for\
             single.""") //
            .valueSeparator('=') //
            .required(false) //
            .build() //
        ),
    HELP(
        Option.builder() //
            .option("h")
            .longOpt("help") //
            .hasArg(false) //
            .desc("Display help and exit") //
            .required(false) //
            .build() //
        ),
    INFO(
        Option.builder() //
            .longOpt("info") //
            .hasArg(false) //
            .desc("Display info logging.") //
            .required(false) //
            .build() //
        ),
    INPUT_FILE(
        Option.builder() //
            .option("i")
            .longOpt("input") //
            .hasArg(true) //
            .argName("input-file") //
            .desc("The formatted input file to be transformed.") //
            .valueSeparator('=') //
            .required(false) //
            .build() //
        ),
    KEY(
        Option.builder() //
            .longOpt("key") //
            .hasArg(true) //
            .argName("key") //
            .desc("The key in a key value pair.") //
            .valueSeparator('=') //
            .required(false) //
            .build() //
        ),
    MULTI(
        Option.builder() //
            .longOpt("multi") //
            .hasArg(false) //
            .desc(
                """
            Transform the template once for each class (cannot be used in\
             conjunction with --single and cannot be used in conjunction\
             with -l, --list).""") //
            .required(false) //
            .build() //
        ),
    OUTPUT_PATH(
        Option.builder() //
            .option("p")
            .longOpt("path") //
            .hasArg(true) //
            .argName("path") //
            .desc(
                """
            The output path where to create the file/files relative to the\
             working directory (cannot be used in conjunction with -l,\
             --list).""") //
            .valueSeparator('=') //
            .required(false) //
            .build() //
        ),
    SINGLE(
        Option.builder() //
            .longOpt("single") //
            .hasArg(false) //
            .desc(
                """
            Transform the template once for the entire model (cannot be used\
             in conjunction with --multi and cannot be used in\
             conjunction with -l, --list).""") //
            .required(false) //
            .build() //
        ),
    TEMPLATE(
        Option.builder() //
            .option("t")
            .longOpt("template") //
            .hasArg(true) //
            .argName("template-file") //
            .desc("The template to use to transform the input file.") //
            .valueSeparator('=') //
            .required(false) //
            .build() //
        ),
    TEMPLATES(
        Option.builder() //
            .option("l")
            .longOpt("templates") //
            .hasArg(true) //
            .argName("template-list") //
            .desc(
                "A list of templates to use to transform the input file. (See file"
                    + " format below)") //
            .valueSeparator('=') //
            .required(false) //
            .build() //
        ),
    TRACE(
        Option.builder() //
            .longOpt("trace") //
            .hasArg(false) //
            .desc("Display trace logging.") //
            .required(false) //
            .build() //
        ),
    VALUE(
        Option.builder() //
            .longOpt("value") //
            .hasArg(true) //
            .argName("value") //
            .desc("The value in a key value pair.") //
            .valueSeparator('=') //
            .required(false) //
            .build() //
        ),
    VARIABLES(
        Option.builder() //
            .option("x")
            .longOpt("variables") //
            .hasArg(true) //
            .argName("variable-list") //
            .desc("A list of Key/Value pairs that will be accessible within the" + " template.") //
            .valueSeparator('=') //
            .required(false) //
            .build() //
        ),
    WARN(
        Option.builder() //
            .longOpt("warn") //
            .hasArg(false) //
            .desc("Display warn logging.") //
            .required(false) //
            .build() //
        );

    private static final Options OPTIONS = new Options();

    static Options getOptions() {
      if (CliOptions.OPTIONS.getOptions().isEmpty()) {
        for (final CliOptions cliOption : CliOptions.values()) {
          CliOptions.OPTIONS.addOption(cliOption.getOption());
        }
      }

      return CliOptions.OPTIONS;
    }

    private final Option option;

    CliOptions(final Option optionArg) {
      this.option = optionArg;
    }

    private Option getOption() {
      return this.option;
    }
  }

  private static final Character[] INVALID_OTHER = {};
  private static final Character[] INVALID_UNIX_SPECIFIC_CHARS = {
    Character.MIN_VALUE, '\000', '\0'
  };
  private static final Character[] INVALID_WINDOWS_SPECIFIC_CHARS = {'"', '*', '?', '|'};
  private static final ModuleCode MODULE_CODE = ModuleCode.ERR_M01;

  private static String stripToEmpty(final String str) {
    var returnValue =
        StringUtils.stripToEmpty(
            StringUtils.strip(
                StringUtils.stripToEmpty(StringUtils.strip(StringUtils.stripToEmpty(str), "'")),
                "\""));

    if ("null".equalsIgnoreCase(returnValue)) {
      returnValue = "";
    }

    return returnValue;
  }

  private final String[] args;
  private CliValueList cliValueList = null;
  private CliVariableList cliVariableList = null;
  private CommandLine cmd = null;
  private JsonContext context = null;

  private final CimerantLogger logger;

  ParsedCommandLine(final String... args) {
    this.args = args;
    this.logger = (CimerantLogger) LoggerFactory.getLogger(this.getClass().getName());
  }

  CliValueList getCliValueList() throws SysError {
    if (this.cliValueList == null) {
      final var inputFile =
          ParsedCommandLine.stripToEmpty(
              this.getCmd().getOptionValue(CliOptions.INPUT_FILE.getOption()));

      // Validate input file
      if (!this.getCmd().hasOption(CliOptions.INPUT_FILE.getOption())) {
        if (this.logger.isErrorEnabled()) {
          // 0005 | Input file is required
          final Exception e = StatusCode.ERR_0005.getSysError(ParsedCommandLine.MODULE_CODE);
          this.logger.error(e.getMessage(), e);
        }
      } else if (!this.isValidPath(inputFile) || !this.isReadableFile(inputFile)) {
        if (this.logger.isErrorEnabled()) {
          // 0009 | Invalid input file path
          final Exception e =
              StatusCode.ERR_0009.getSysError(ParsedCommandLine.MODULE_CODE, inputFile);
          this.logger.error(e.getMessage(), e);
        }
      } else if (inputFile.endsWith(".json")) {
        this.validateJson(inputFile);
      } else if (this.logger.isErrorEnabled()) {
        // 0020 | Invalid JSON file format
        final Exception e =
            StatusCode.ERR_0020.getSysError(ParsedCommandLine.MODULE_CODE, inputFile);
        this.logger.error(e.getMessage(), e);
      }

      final String outputPath;
      if (this.getCmd().hasOption(CliOptions.OUTPUT_PATH.getOption())) {
        outputPath =
            ParsedCommandLine.stripToEmpty(
                this.getCmd().getOptionValue(CliOptions.OUTPUT_PATH.getOption()));
      } else {
        outputPath = "";
      }

      // Initialize CliValueList with the input file
      this.cliValueList = new CliValueList(inputFile, outputPath);

      if (!this.getCmd().hasOption(CliOptions.TEMPLATE.getOption())
          && !this.getCmd().hasOption(CliOptions.TEMPLATES.getOption())
          && this.logger.isErrorEnabled()) {
        // 0006 | Template is required
        final Exception e = StatusCode.ERR_0006.getSysError(ParsedCommandLine.MODULE_CODE, 0);
        this.logger.error(e.getMessage(), e);
      }

      if (this.getCmd().hasOption(CliOptions.FILE_PATTERN.getOption())
          || this.getCmd().hasOption(CliOptions.SINGLE.getOption())
          || this.getCmd().hasOption(CliOptions.MULTI.getOption())
          || this.getCmd().hasOption(CliOptions.TEMPLATE.getOption())) {
        final var cliValue = this.cliValueList.new CliValue(0);

        if (this.getCmd().hasOption(CliOptions.FILE_PATTERN.getOption())) {
          cliValue.setFilePattern(
              ParsedCommandLine.stripToEmpty(
                  this.getCmd().getOptionValue(CliOptions.FILE_PATTERN.getOption())));
        }
        if (this.getCmd().hasOption(CliOptions.OUTPUT_PATH.getOption())) {
          cliValue.setOutputPath(
              ParsedCommandLine.stripToEmpty(
                  this.getCmd().getOptionValue(CliOptions.OUTPUT_PATH.getOption())));
        }
        if (this.getCmd().hasOption(CliOptions.SINGLE.getOption())) {
          cliValue.setSingleMulti("SINGLE");
        }
        if (this.getCmd().hasOption(CliOptions.MULTI.getOption())) {
          cliValue.setSingleMulti("MULTI");
        }
        if (this.getCmd().hasOption(CliOptions.TEMPLATE.getOption())) {
          cliValue.setTemplate(
              ParsedCommandLine.stripToEmpty(
                  this.getCmd().getOptionValue(CliOptions.TEMPLATE.getOption())));
        }

        this.cliValueList.add(cliValue);
      } else {
        this.cliValueList.increaseIndex();
      }

      final var templates =
          ParsedCommandLine.stripToEmpty(
              this.getCmd().getOptionValue(CliOptions.TEMPLATES.getOption()));

      // Initialize CliValueList with template list or command line parameters
      if (this.getCmd().hasOption(CliOptions.TEMPLATES.getOption())) {
        if (!this.isValidPath(templates) || !this.isReadableFile(templates)) {
          if (this.logger.isErrorEnabled()) {
            // 0011 | Invalid template list path
            final Exception e =
                StatusCode.ERR_0011.getSysError(ParsedCommandLine.MODULE_CODE, templates);
            this.logger.error(e.getMessage(), e);
          }
        } else {
          final var preAddSize = this.cliValueList.size();

          this.cliValueList.addCliValuesByTemplateList(templates);
          if (this.cliValueList.size() - preAddSize == 0 && this.logger.isErrorEnabled()) {
            // 0014 | Invalid template list
            final Exception e =
                StatusCode.ERR_0014.getSysError(ParsedCommandLine.MODULE_CODE, templates);
            this.logger.error(e.getMessage(), e);
          }
        }
      }
    }

    return this.cliValueList;
  }

  private CliVariableList getCliVariableList() throws SysError {
    if (this.cliVariableList == null) {
      this.cliVariableList = new CliVariableList();

      final List<String> keys = new ArrayList<>();
      final List<String> values = new ArrayList<>();
      for (final Option option : this.getCmd().getOptions()) {
        if (option.equals(CliOptions.KEY.getOption())) {
          keys.add(option.getValue());
        } else if (option.equals(CliOptions.VALUE.getOption())) {
          values.add(option.getValue());
        }
      }

      for (var i = 0; i < keys.size(); ++i) {
        final var cliVariable = new CliVariableList.CliVariable();

        cliVariable.setKey(ParsedCommandLine.stripToEmpty(keys.get(i)));
        if (i < values.size()) {
          cliVariable.setValue(ParsedCommandLine.stripToEmpty(values.get(i)));
        }

        this.cliVariableList.add(cliVariable);
      }

      // Initialize CliVariableList with variable list or command line parameters
      if (this.getCmd().hasOption(CliOptions.VARIABLES.getOption())) {
        final var variables =
            ParsedCommandLine.stripToEmpty(
                this.getCmd().getOptionValue(CliOptions.VARIABLES.getOption()));

        if (!this.isValidPath(variables) || !this.isReadableFile(variables)) {
          if (this.logger.isErrorEnabled()) {
            // 0012 | Invalid variable list path
            final Exception e =
                StatusCode.ERR_0012.getSysError(ParsedCommandLine.MODULE_CODE, variables);
            this.logger.error(e.getMessage(), e);
          }
        } else if (!this.cliVariableList.addCliVariablesByVariableList(variables)
            && this.logger.isErrorEnabled()) {
          // 0019 | Invalid variable list format
          final Exception e =
              StatusCode.ERR_0019.getSysError(ParsedCommandLine.MODULE_CODE, variables);
          this.logger.error(e.getMessage(), e);
        }
      }
    }

    final Set<String> existingOptions = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
    for (final CliVariable cliVariable : this.cliVariableList) {
      if (!existingOptions.add(cliVariable.getKey()) && this.logger.isErrorEnabled()) {
        // 0004 | Duplicate keys are not allowed
        final Exception e =
            StatusCode.ERR_0004.getSysError(ParsedCommandLine.MODULE_CODE, cliVariable.getKey());
        this.logger.error(e.getMessage(), e);
      }
    }

    return this.cliVariableList;
  }

  private CommandLine getCmd() throws SysError {
    final var moduleCode = ModuleCode.ERR_M00;

    if (this.cmd == null) {
      final CommandLineParser parser = new DefaultParser(false);
      try {
        this.cmd = parser.parse(CliOptions.getOptions(), this.args);
      } catch (final UnrecognizedOptionException e) {
        // 0002 | Invalid command-line argument
        if (this.logger.isDebugEnabled()) {
          this.logger.debug(e.getMessage(), e);
        }
        throw StatusCode.ERR_0002.getSysError(moduleCode, e.getOption());
      } catch (final MissingArgumentException e) {
        // 0001 | Unknown error
        if (this.logger.isDebugEnabled()) {
          this.logger.debug(e.getMessage(), e);
        }
        throw new SysError(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, e.getMessage());
      } catch (final Exception e) {
        try {
          this.cmd = parser.parse(new Options(), null);
        } catch (final Exception e1) {
          // 0001 | Unknown error
          if (this.logger.isDebugEnabled()) {
            this.logger.debug(e.getMessage(), e);
          }
          throw new SysError(
              Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, e1.getMessage());
        }

        if (!"CheckExitCalled".equals(e.getClass().getSimpleName())) {
          // 0001 | Unknown error
          if (this.logger.isDebugEnabled()) {
            this.logger.debug(e.getMessage(), e);
          }
          throw new SysError(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, e.getMessage());
        }
      }

      if (this.cmd.hasOption(CliOptions.TRACE.getOption())) {
        System.setProperty("slf4j.level", Level.TRACE.name());
      } else if (this.cmd.hasOption(CliOptions.DEBUG.getOption())) {
        System.setProperty("slf4j.level", Level.DEBUG.name());
      } else if (this.cmd.hasOption(CliOptions.INFO.getOption())) {
        System.setProperty("slf4j.level", Level.INFO.name());
      } else if (this.cmd.hasOption(CliOptions.WARN.getOption())) {
        System.setProperty("slf4j.level", Level.WARN.name());
      } else if (this.cmd.hasOption(CliOptions.ERROR.getOption())) {
        System.setProperty("slf4j.level", Level.ERROR.name());
      }

      final Set<Option> existingOptions = new HashSet<>();
      for (final Option option : this.cmd.getOptions()) {
        if (!CliOptions.KEY.getOption().getLongOpt().equals(option.getLongOpt())
            && !CliOptions.VALUE.getOption().getLongOpt().equals(option.getLongOpt())
            && !existingOptions.add(option)) {
          // 0003 | Duplicate command-line arguments are not allowed
          throw new SysError(
              Cimerant.SYSTEM_CODE,
              moduleCode,
              StatusCode.ERR_0003,
              option.getLongOpt() != null ? option.getLongOpt() : option.getOpt());
        }
      }
    }

    return this.cmd;
  }

  ContextRoot getContext() throws SysError {
    if (this.context == null && this.getCliValueList().getInputFile().endsWith(".json")) {
      this.context =
          new JsonContext(this.getCliValueList().getInputFile(), this.getCliVariableList());
    }

    return this.context.getContext();
  }

  boolean hasOptionHelp() {
    try {
      return this.getCmd().hasOption(CliOptions.HELP.getOption());
    } catch (final SysError e) {
      this.logger.error(e.getMessage(), e);
      return false;
    }
  }

  private boolean isReadableFile(final String pathname) {
    try {
      if (this.isValidFileName(pathname)) {
        final var file = new File(pathname);
        final var path = Paths.get(file.getCanonicalPath());
        if (file.exists()
            && Files.exists(path)
            && file.canRead()
            && Files.isReadable(path)
            && file.isFile()
            && Files.isRegularFile(path)) {
          return true;
        }
      }
      return false;
    } catch (final Exception e) {
      if (this.logger.isDebugEnabled()) {
        this.logger.debug(e.getMessage(), e);
      }
      return false;
    }
  }

  boolean isValid() {
    final var moduleCode = ModuleCode.ERR_M02;

    if (!this.logger.hasSysError()) {
      try {
        if (this.getCmd().hasOption(CliOptions.SINGLE.getOption())
            && this.getCmd().hasOption(CliOptions.MULTI.getOption())
            && this.logger.isErrorEnabled()) {
          // 0018 | Single and multi cannot be used together
          final Exception e = StatusCode.ERR_0018.getSysError(moduleCode);
          this.logger.error(e.getMessage(), e);
        }

        for (final CliValue cliValue : this.getCliValueList()) {
          if (cliValue.getSingleMulti() == null && this.logger.isErrorEnabled()) {
            // 0008 | Single or multi is required
            final Exception e =
                StatusCode.ERR_0008.getSysError(moduleCode, cliValue.getLineNumber());
            this.logger.error(e.getMessage(), e);
          }

          if (StringUtils.isBlank(cliValue.getTemplate())) {
            if (this.logger.isErrorEnabled()) {
              // 0006 | Template is required
              final Exception e =
                  StatusCode.ERR_0006.getSysError(moduleCode, cliValue.getLineNumber());
              this.logger.error(e.getMessage(), e);
            }
          } else if ((!this.isValidPath(cliValue.getTemplate())
                  || !this.isReadableFile(cliValue.getTemplate()))
              && this.logger.isErrorEnabled()) {
            // 0010 | Invalid template path
            final Exception e =
                StatusCode.ERR_0010.getSysError(
                    moduleCode, cliValue.getLineNumber(), cliValue.getTemplate());
            this.logger.error(e.getMessage(), e);
          }

          if (StringUtils.isBlank(cliValue.getFilePattern())) {
            if (this.logger.isErrorEnabled()) {
              // 0007 | File pattern is required
              final Exception e =
                  StatusCode.ERR_0007.getSysError(moduleCode, cliValue.getLineNumber());
              this.logger.error(e.getMessage(), e);
            }
          } else if (cliValue.getSingleMulti() == SingleMulti.SINGLE) {
            if (cliValue.getFilePattern().contains("${CLASS_NAME}")
                && this.logger.isErrorEnabled()) {
              // 0016 | Invalid file pattern ${CLASS_NAME} not allowed in single mode
              // file name
              final Exception e =
                  StatusCode.ERR_0016.getSysError(
                      moduleCode, cliValue.getLineNumber(), cliValue.getFilePattern());
              this.logger.error(e.getMessage(), e);
            }
          } else if (cliValue.getSingleMulti() == SingleMulti.MULTI
              && !cliValue.getFilePattern().contains("${CLASS_NAME}")
              && this.logger.isErrorEnabled()) {
            // 0017 | Invalid file pattern ${CLASS_NAME} required in multi mode
            final Exception e =
                StatusCode.ERR_0017.getSysError(
                    moduleCode, cliValue.getLineNumber(), cliValue.getFilePattern());
            this.logger.error(e.getMessage(), e);
          }

          if (cliValue.getSingleMulti() != SingleMulti.COPY
              && !this.isValidVelocity(
                  cliValue.getTemplate(),
                  this.getCliValueList().getInputFile(),
                  cliValue.getSingleMulti() == SingleMulti.SINGLE)
              && this.logger.isErrorEnabled()) {
            // 0013 | Invalid template
            final Exception e =
                StatusCode.ERR_0013.getSysError(
                    moduleCode, cliValue.getLineNumber(), cliValue.getTemplate());
            this.logger.error(e.getMessage(), e);
          }

          if (!this.isValidFileName(cliValue.getFilePattern()) && this.logger.isErrorEnabled()) {
            // 0015 | Invalid file name
            final Exception e =
                StatusCode.ERR_0015.getSysError(
                    moduleCode, cliValue.getLineNumber(), cliValue.getFilePattern());
            this.logger.error(e.getMessage(), e);
          }
        }

        // Validate Variable List
        this.getCliVariableList();

      } catch (final SysError e) {
        // 0001 | Unknown error
        this.logger.error(e.getMessage(), e);
      }
    }

    return !this.logger.hasSysError();
  }

  private boolean isValidFileName(final String filename) {
    if (StringUtils.isBlank(filename) || filename.isEmpty() || filename.length() > 255) {
      return false;
    }

    final var os = System.getProperty("os.name").toLowerCase(Locale.getDefault());
    if (os.contains("win")) {
      return Arrays.stream(ParsedCommandLine.INVALID_WINDOWS_SPECIFIC_CHARS)
          .noneMatch(ch -> filename.contains(ch.toString()));
    }
    if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
      return Arrays.stream(ParsedCommandLine.INVALID_UNIX_SPECIFIC_CHARS)
          .noneMatch(ch -> filename.contains(ch.toString()));
    }

    try {
      Paths.get(filename);
    } catch (final Exception e) {
      return false;
    }

    return Arrays.stream(ParsedCommandLine.INVALID_OTHER)
        .noneMatch(ch -> filename.contains(ch.toString()));
  }

  private boolean isValidPath(final String pathname) {
    try {
      if (this.isValidFileName(pathname)) {
        return Paths.get(new File(pathname).getCanonicalPath()) != null;
      }
      return false;
    } catch (final Exception e) {
      if (this.logger.isDebugEnabled()) {
        this.logger.debug(e.getMessage(), e);
      }
      return false;
    }
  }

  private boolean isValidVelocity(
      final String velocityTemplate, final String dataFile, final Boolean isSingle) {
    if (StringUtils.isBlank(velocityTemplate) || StringUtils.isBlank(dataFile)) {
      return false;
    }

    try {
      final var file = new File(velocityTemplate);
      final var velocityEngine = new VelocityEngine();
      velocityEngine.setProperty(RuntimeConstants.RUNTIME_REFERENCES_STRICT, true);
      velocityEngine.setProperty(
          RuntimeConstants.FILE_RESOURCE_LOADER_PATH, file.getParentFile().getAbsolutePath());
      velocityEngine.setProperty(RuntimeConstants.VM_MAX_DEPTH, 500);
      velocityEngine.init();

      final var velocityContext =
          JsonRootContextImpl.getInstance(new HashMap<>(), new CliVariableList());
      if (!isSingle) {
        velocityContext.put(
            "this",
            JsonContextImpl.getInstance(
                velocityContext,
                new LinkedList<>(),
                new AbstractMap.SimpleEntry<>("entity", new HashMap<>())));
      } else {
        velocityContext.put("this", velocityContext);
      }

      if (!dataFile.endsWith(".json")) {
        return false;
      }

      final var template = velocityEngine.getTemplate(file.getName());
      template.merge(velocityContext, new StringWriter());
    } catch (final Exception e) {
      if (this.logger.isDebugEnabled()) {
        this.logger.debug(e.getMessage(), e);
      }
      return false;
    }
    return true;
  }

  private void validateJson(final String jsonPath) {
    try {
      final var mapper = new ObjectMapper();
      mapper.readTree(new File(jsonPath));
    } catch (final IOException e) {
      // ERR_0020 | Invalid JSON file format
      final Exception se = StatusCode.ERR_0020.getSysError(ParsedCommandLine.MODULE_CODE, jsonPath);
      this.logger.error(se.getMessage(), se);

      if (this.logger.isDebugEnabled()) {
        this.logger.debug(e.getMessage(), e);
      }
    }
  }
}
