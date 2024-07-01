package cimerant;

import cimerant.CliValueList.CliValue;
import cimerant.CliValueList.CliValue.SingleMulti;
import cimerant.ParsedCommandLine.CliOptions;
import cimerant.context.cimerant.ObjectRootContext;
import cimerant.context.impl.ContextRootImpl;
import cimerant.logger.CimerantLogger;
import cimerant.logger.CimerantLoggerFactory;
import cimerant.logger.CimerantServiceProvider;
import java.io.File;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.slf4j.helpers.Reporter;

/** Main class. */
public final class Cimerant {
  private static final String CMD_LINE_SYNTAX = "Cimerant";

  /** Predefined constants for application errors. */
  public static final SystemCode SYSTEM_CODE = SystemCode.ERR_CMA;

  static {
    System.setProperty(
        LoggerFactory.PROVIDER_PROPERTY_KEY, CimerantServiceProvider.class.getName());
    System.setProperty(Reporter.SLF4J_INTERNAL_VERBOSITY_KEY, Level.ERROR.name());
  }

  /**
   * Main method.
   *
   * @param args command line arguments used to specify how Cimerant works.
   */
  public static final void main(final String... args) {
    final var cimerant = new Cimerant();
    cimerant.execute(args);
  }

  private final CimerantLogger logger;

  private Cimerant() {
    this.clear();

    this.logger = (CimerantLogger) LoggerFactory.getLogger(this.getClass().getName());
  }

  /** Remove all the elements, effectively emptying it. */
  private void clear() {
    CimerantLoggerFactory.clear();
    ContextRootImpl.clearInstances();
  }

  private void execute(final String... args) {
    final var moduleCode = ModuleCode.ERR_M02;

    try {
      final var parsedCommandLine = new ParsedCommandLine(args);

      if (parsedCommandLine.hasOptionHelp()) {
        final var helpFormatter = new HelpFormatter();
        helpFormatter.printHelp(Cimerant.CMD_LINE_SYNTAX, CliOptions.getOptions());
        this.clear();
        System.exit(0);
      }

      if (parsedCommandLine.isValid()) {
        final var context = parsedCommandLine.getContext();
        final var contextGrouping = new LinkedList<>(context.getGrouping());
        for (final CliValue cliValue : parsedCommandLine.getCliValueList()) {
          final var templateFile = new File(cliValue.getTemplate());

          if (cliValue.getSingleMulti() == SingleMulti.COPY) {
            final var destFile = Paths.get(cliValue.getFilePattern(cliValue.getOutputPath()));

            if (destFile.getParent() != null) {
              Files.createDirectories(destFile.getParent());
            }

            FileUtils.copyFile(templateFile, destFile.toFile());
          } else {
            final var velocityEngine = new VelocityEngine();
            velocityEngine.setProperty(RuntimeConstants.RUNTIME_REFERENCES_STRICT, true);
            velocityEngine.setProperty(
                RuntimeConstants.FILE_RESOURCE_LOADER_PATH,
                templateFile.getParentFile().getAbsolutePath());
            velocityEngine.setProperty(RuntimeConstants.VM_MAX_DEPTH, 500);
            velocityEngine.init();

            final var template = velocityEngine.getTemplate(templateFile.getName());

            if (cliValue.getSingleMulti() == SingleMulti.MULTI
                && ObjectRootContext.class.isAssignableFrom(context.getClass())) {
              final var objectRootContext = (ObjectRootContext<?>) context;
              for (final var object : objectRootContext.getObjects()) {
                context.setGrouping(contextGrouping);
                final var objectGrouping = new LinkedList<>(object.getGrouping());
                final String mergedTemplate;
                try (final var stringWriter = new StringWriter()) {
                  object.put("this", object);

                  final var fileName =
                      Paths.get(cliValue.getFilePattern("", object.getObjectName())).toString();
                  final var filePath = Paths.get(cliValue.getOutputPath()).toString();

                  object.setFileName(FilenameUtils.removeExtension(fileName));
                  object.setFileExtension(FilenameUtils.getExtension(fileName));
                  object.setFilePath(Arrays.asList(filePath.replace("\\", "/").split("/")));

                  template.merge(object, stringWriter);

                  mergedTemplate = stringWriter.toString();
                  stringWriter.flush();
                }

                if (StringUtils.isNotBlank(mergedTemplate)) {
                  if (this.logger.isTraceEnabled()) {
                    System.out.println(mergedTemplate);
                  }

                  final String filePath;
                  if (CollectionUtils.isNotEmpty(object.getFilePath())) {
                    filePath = String.join(File.separator, object.getFilePath());
                  } else {
                    filePath = "";
                  }

                  final String grouping;
                  if (CollectionUtils.isNotEmpty(object.getGrouping())) {
                    grouping = String.join(File.separator, object.getGrouping());
                  } else {
                    grouping = "";
                  }
                  object.setGrouping(objectGrouping);

                  final var outputFilePattern =
                      Paths.get(
                          filePath,
                          grouping,
                          StringUtils.strip(
                              object.getFileName() + "." + object.getFileExtension()));

                  if (outputFilePattern.getParent() != null) {
                    Files.createDirectories(outputFilePattern.getParent());
                  }

                  Files.write(outputFilePattern, mergedTemplate.getBytes(Charset.defaultCharset()));
                }
              }
            } else {
              context.setGrouping(contextGrouping);
              final String mergedTemplate;
              try (final var stringWriter = new StringWriter()) {
                context.put("this", context);

                final var fileName =
                    Paths.get(cliValue.getFilePattern(cliValue.getOutputPath()))
                        .getFileName()
                        .toString();

                final var fileParent =
                    Paths.get(cliValue.getFilePattern(cliValue.getOutputPath())).getParent();

                final String filePath;
                if (fileParent == null) {
                  filePath = "";
                } else {
                  filePath = fileParent.toString();
                }

                context.setFileName(FilenameUtils.removeExtension(fileName));
                context.setFileExtension(FilenameUtils.getExtension(fileName));
                context.setFilePath(Arrays.asList(filePath.replace("\\", "/").split("/")));

                template.merge(context, stringWriter);

                mergedTemplate = stringWriter.toString();
                stringWriter.flush();
              }

              if (StringUtils.isNotBlank(mergedTemplate)) {
                if (this.logger.isTraceEnabled()) {
                  System.out.println(mergedTemplate);
                }

                final String filePath;
                if (CollectionUtils.isNotEmpty(context.getFilePath())) {
                  filePath = String.join(File.separator, context.getFilePath());
                } else {
                  filePath = "";
                }

                final String grouping;
                if (CollectionUtils.isNotEmpty(context.getGrouping())) {
                  grouping = String.join(File.separator, context.getGrouping().toString());
                } else {
                  grouping = "";
                }

                final var outputFilePattern =
                    Paths.get(
                        filePath,
                        grouping,
                        StringUtils.strip(
                            context.getFileName() + "." + context.getFileExtension()));

                if (outputFilePattern.getParent() != null) {
                  Files.createDirectories(outputFilePattern.getParent());
                }

                Files.write(outputFilePattern, mergedTemplate.getBytes(Charset.defaultCharset()));
              }
            }
          }
        }
      } else {
        for (final var error : this.logger.getLogRecordQueue()) {
          switch (error.level()) {
            case ERROR:
              // do not print stack trace
              break;
            case WARN:
              if (this.logger.isWarnEnabled()) {
                System.out.println(error.toString()); // NOPMD
                if (error.exception() != null) {
                  error.exception().printStackTrace(System.out);
                }
              }
              break;
            case INFO:
              if (this.logger.isInfoEnabled()) {
                System.out.println(error.toString()); // NOPMD
                if (error.exception() != null) {
                  error.exception().printStackTrace(System.out);
                }
              }
              break;
            case DEBUG:
              if (this.logger.isDebugEnabled()) {
                System.out.println(error.toString()); // NOPMD
                if (error.exception() != null) {
                  error.exception().printStackTrace(System.out);
                }
              }
              break;
            case TRACE:
              if (this.logger.isTraceEnabled()) {
                System.out.println(error.toString()); // NOPMD
                if (error.exception() != null) {
                  error.exception().printStackTrace(System.out);
                }
              }
              break;
            default:
          }
        }
        final var sysError = this.logger.getSysErrorQueue().peek();
        if (sysError != null) {
          System.err.println(sysError.getMessage()); // NOPMD
        } else {
          System.err.println("Unknown Error"); // NOPMD
        }
        if (sysError != null) {
          this.clear();
          System.exit(sysError.getExitCode());
        } else {
          this.clear();
          System.exit(-999);
        }
      }
    } catch (final Exception e) {
      final SysError sysError;

      if (this.logger.hasSysError()) {
        sysError = this.logger.getSysErrorQueue().peek();
      } else if (StringUtils.isBlank(e.getMessage())) {
        sysError =
            new SysError(
                Cimerant.SYSTEM_CODE,
                moduleCode,
                StatusCode.ERR_0001,
                e.getClass().getSimpleName());
      } else {
        sysError =
            new SysError(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, e.getMessage());
      }

      if (!"class com.github.stefanbirkner.systemlambda.SystemLambda$CheckExitCalled"
          .equals(e.getClass().toString())) {
        System.err.println(sysError.getMessage()); // NOPMD
        if (this.logger.isDebugEnabled()) {
          e.printStackTrace(System.err);
        }
      }

      this.clear();
      System.exit(sysError.getExitCode());
    }
    this.clear();
  }
}
