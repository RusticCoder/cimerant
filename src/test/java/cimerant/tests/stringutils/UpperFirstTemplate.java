package cimerant.tests.stringutils;

import cimerant.Cimerant;
import cimerant.util.DirUtils;
import com.github.stefanbirkner.systemlambda.SystemLambda;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.TemporaryFolder;

/**
 * The user will be able to combine a Velocity template and a XML formatted JSON file to transform
 * the JSON converting any variable to back slash lower case.
 */
public class UpperFirstTemplate {
  private static File cimerantPath;
  private static Path destinationFilePath;
  private static String modelPath;
  private static String rootPath;
  private static Path sourceFilePath;

  /**
   * Run before any scenario is run.
   *
   * @throws IOException temporary folder could not be created.
   * @see BeforeAll
   */
  @BeforeAll
  public static void beforeAll() throws IOException {
    if (UpperFirstTemplate.cimerantPath == null) {
      final var temporaryFolder = new TemporaryFolder();
      temporaryFolder.create();

      UpperFirstTemplate.cimerantPath = temporaryFolder.getRoot();
      // cimerantPath = new File("/tmp/cucumber_user_dir");

      System.setProperty("user.dir", UpperFirstTemplate.cimerantPath.getAbsolutePath());
    }

    if (UpperFirstTemplate.rootPath == null) {
      UpperFirstTemplate.rootPath =
          "src/test/resources/cucumber/" + UpperFirstTemplate.class.getSimpleName();
    }
    if (UpperFirstTemplate.modelPath == null) {
      UpperFirstTemplate.modelPath = UpperFirstTemplate.rootPath + "/model/Model.json";
    }
    if (UpperFirstTemplate.sourceFilePath == null) {
      UpperFirstTemplate.sourceFilePath = Paths.get(UpperFirstTemplate.rootPath, "result");
    }
    if (UpperFirstTemplate.destinationFilePath == null) {
      UpperFirstTemplate.destinationFilePath =
          Paths.get(
              UpperFirstTemplate.cimerantPath.getAbsolutePath(),
              "cucumber",
              UpperFirstTemplate.class.getSimpleName(),
              "result");
    }
  }

  /**
   * Run after all scenarios have been executed.
   *
   * @see AfterAll
   */
  @AfterAll
  public static void endAll() {
    try (var dirStream = Files.walk(UpperFirstTemplate.cimerantPath.toPath())) {
      dirStream //
          .filter(Files::isDirectory) //
          .map(Path::toFile) //
          .sorted(Comparator.reverseOrder()) //
          .forEach(File::delete);
    } catch (final Exception e) {
      // ignore
    }

    UpperFirstTemplate.cimerantPath = null;
    UpperFirstTemplate.destinationFilePath = null;
    UpperFirstTemplate.modelPath = null;
    UpperFirstTemplate.rootPath = null;
    UpperFirstTemplate.sourceFilePath = null;
  }

  private boolean contentEquals = true;
  private boolean optionF = false;
  private boolean optionFile = false;
  private boolean optionMulti = false;
  private boolean optionP = false;
  private boolean optionPath = false;
  private boolean optionSingle = false;
  private boolean optionT = false;
  private boolean optionTemplate = false;
  private int statusCode = 0;
  private String textWrittenToSystemErr = null;
  private Path uniqueDestinationFilePath;
  private final List<String> values = new ArrayList<>();

  /** Runs before the first step of each scenario. */
  @Before
  public void beforeScenario() {
    this.values.clear();
    // this.values.add("--debug");
  }

  /**
   * Runs after the last step of each scenario, even when the step result is failed, undefined,
   * pending, or skipped.
   *
   * @throws IOException temporary folder could not be deleted.
   */
  @After
  public void endScenario() throws IOException {
    if (this.uniqueDestinationFilePath != null && this.contentEquals) {
      FileUtils.deleteDirectory(this.uniqueDestinationFilePath.toFile());
    } else {
      this.contentEquals = true;
    }
    this.statusCode = 0;
    this.uniqueDestinationFilePath = null;
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argFile indicates whether to use the f or file command line argument.
   * @see Given
   */
  @Given("upperFirstTemplate.{int} file {string}")
  public void givenTheFile(final Integer argUnique, final String argFile) {
    if ("f".equals(argFile)) {
      this.optionF = true;
    } else if ("file".equals(argFile)) {
      this.optionFile = true;
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argInputFile indicates whether to use the i or input command line argument.
   * @see Given
   */
  @Given("upperFirstTemplate.{int} input file {string}")
  public void givenTheInputFile(final Integer argUnique, final String argInputFile) {
    if ("i".equals(argInputFile)) {
      this.values.add("-i '" + UpperFirstTemplate.modelPath + "'");
    } else if ("input".equals(argInputFile)) {
      this.values.add("--input='" + UpperFirstTemplate.modelPath + "'");
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argPath indicates whether to use the p or path command line argument.
   * @see Given
   */
  @Given("upperFirstTemplate.{int} path {string}")
  public void givenThePath(final Integer argUnique, final String argPath) {
    if ("p".equals(argPath)) {
      this.optionP = true;
    } else if ("path".equals(argPath)) {
      this.optionPath = true;
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argSinti indicates whether to use the single or multi command line argument.
   * @see Given
   */
  @Given("upperFirstTemplate.{int} single multi value {string}")
  public void givenTheSingleMultiValue(final Integer argUnique, final String argSinti) {
    if (StringUtils.isNotBlank(argSinti)) {
      if ("single".equals(argSinti)) {
        this.optionSingle = true;
      } else if ("multi".equals(argSinti)) {
        this.optionMulti = true;
      }
      this.values.add("--" + argSinti);
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argTemplate indicates whether to use the t or template command line argument.
   * @see Given
   */
  @Given("upperFirstTemplate.{int} template {string}")
  public void givenTheTemplate(final Integer argUnique, final String argTemplate) {
    if ("t".equals(argTemplate)) {
      this.optionT = true;
    } else if ("template".equals(argTemplate)) {
      this.optionTemplate = true;
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argTemplates indicates whether to use the l or templates command line argument.
   * @see Given
   */
  @Given("upperFirstTemplate.{int} templates {string}")
  public void givenTheTemplates(final Integer argUnique, final String argTemplates) {
    if ("l".equals(argTemplates)) {
      this.values.add("-l '" + UpperFirstTemplate.rootPath + "/list/TemplateList.md'");
    } else if ("templates".equals(argTemplates)) {
      this.values.add("--templates='" + UpperFirstTemplate.rootPath + "/list/TemplateList.md'");
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argVar indicates whether to add key/value pair command line arguments.
   * @see Given
   */
  @Given("upperFirstTemplate.{int} var {string}")
  public void givenTheVar(final Integer argUnique, final String argVar) {
    if ("keys".equals(argVar)) {
      this.values.add("--key='Command Line Key 1'");
      this.values.add("--value='Here's message #1'");
      this.values.add("--key='Command Line Key 2'");
      this.values.add("--value='Here's message #2'");
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argVars indicates whether to use the x or variables command line argument.
   * @see Given
   */
  @Given("upperFirstTemplate.{int} vars {string}")
  public void givenTheVars(final Integer argUnique, final String argVars) {
    if ("x".equals(argVars)) {
      this.values.add(
          "-x '" + Paths.get(UpperFirstTemplate.rootPath, "/list/VariableList.md") + "'");
    } else if ("variables".equals(argVars)) {
      this.values.add(
          "--variables='" + Paths.get(UpperFirstTemplate.rootPath, "/list/VariableList.md") + "'");
    }
  }

  /**
   * Describes the action or event that triggers the behavior.
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @throws Exception any exception thrown by the statement.
   * @see When
   */
  @When("upperFirstTemplate.{int} the values are passed into Cimerant")
  public void sinceWhenTheValuesArePassedIntoCimerant(final Integer argUnique) throws Exception {
    this.uniqueDestinationFilePath =
        Paths.get(UpperFirstTemplate.destinationFilePath.toString(), "" + argUnique);

    if (this.optionSingle || !this.optionMulti) {
      if (this.optionT || this.optionTemplate) {
        if (this.optionP) {
          this.values.add("-p '" + this.uniqueDestinationFilePath + "'");
        } else if (this.optionPath) {
          this.values.add("--path='" + this.uniqueDestinationFilePath + "'");
        }
      } else if (this.optionP) {
        this.values.add("-p '" + this.uniqueDestinationFilePath + "/single'");
      } else if (this.optionPath) {
        this.values.add("--path='" + this.uniqueDestinationFilePath + "/single'");
      }
      if (this.optionF) {
        this.values.add("-f 'Destination.xml'");
      }
      if (this.optionFile) {
        this.values.add("--file='Destination.xml'");
      }
      if (this.optionT) {
        this.values.add("-t '" + UpperFirstTemplate.rootPath + "/template/SingleTemplate.vm'");
      }
      if (this.optionTemplate) {
        this.values.add(
            "--template='" + UpperFirstTemplate.rootPath + "/template/SingleTemplate.vm'");
      }
    } else {
      if (this.optionT || this.optionTemplate) {
        if (this.optionP) {
          this.values.add("-p '" + this.uniqueDestinationFilePath + "'");
        } else if (this.optionPath) {
          this.values.add("--path='" + this.uniqueDestinationFilePath + "'");
        }
      } else if (this.optionP) {
        this.values.add("-p '" + this.uniqueDestinationFilePath + "/multi1'");
      } else if (this.optionPath) {
        this.values.add("--path='" + this.uniqueDestinationFilePath + "/multi2'");
      }
      if (this.optionF) {
        this.values.add("-f 'Destination_${CLASS_NAME}.xml'");
      }
      if (this.optionFile) {
        this.values.add("--file='Destination_${CLASS_NAME}.xml'");
      }
      if (this.optionT) {
        this.values.add("-t '" + UpperFirstTemplate.rootPath + "/template/MultiTemplate.vm'");
      }
      if (this.optionTemplate) {
        this.values.add(
            "--template='" + UpperFirstTemplate.rootPath + "/template/MultiTemplate.vm'");
      }
    }

    final var stockArr = this.values.toArray(String[]::new);
    this.values.clear();

    Files.createDirectories(UpperFirstTemplate.cimerantPath.toPath());

    try {
      this.textWrittenToSystemErr =
          SystemLambda.tapSystemErr(
              () -> {
                this.statusCode =
                    SystemLambda.catchSystemExit(
                        () -> {
                          Cimerant.main(stockArr);
                        });
              });
    } catch (final java.lang.AssertionError e) {
      if (!"System.exit has not been called.".equals(e.getMessage())) {
        throw e;
      }
    }
    this.textWrittenToSystemErr = StringUtils.stripToNull(this.textWrittenToSystemErr);

    // System.out.println(
    // "cimerant.exe "
    // + Arrays.toString(stockArr).replace(",", "").replace("[", "").replace("]", ""));
  }

  /**
   * Describes the expected outcome or result.
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @throws IOException folders cannot be compared.
   * @see Then
   */
  @Then("upperFirstTemplate.{int} values are converted according to the template")
  public void thenValuesAreConvertedAccordingToTheTemplate(final Integer argUnique)
      throws IOException {
    Assertions.assertTrue(
        StringUtils.isBlank(this.textWrittenToSystemErr),
        "#" + argUnique + " Unexpected Error: " + this.textWrittenToSystemErr);
    Assertions.assertEquals(
        0, this.statusCode, "#" + argUnique + " Unexpected Status Code: " + this.statusCode);

    final var uniqueSourceFilePath =
        Paths.get(UpperFirstTemplate.sourceFilePath.toString(), "" + argUnique);
    if (this.uniqueDestinationFilePath == null) {
      this.uniqueDestinationFilePath =
          Paths.get(UpperFirstTemplate.destinationFilePath.toString(), "" + argUnique);
    }
    this.contentEquals =
        DirUtils.contentEquals(uniqueSourceFilePath, this.uniqueDestinationFilePath);
    Assertions.assertTrue(
        this.contentEquals,
        "#"
            + argUnique
            + " '"
            + uniqueSourceFilePath
            + "' did not match '"
            + this.uniqueDestinationFilePath
            + "'");
  }
}
