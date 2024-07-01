package cimerant.tests.errors;

import cimerant.Cimerant;
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

/** 0003 | Duplicate command-line arguments are not allowed. */
public class Err0003Test {
  private static File cimerantPath;
  private static Path destinationFilePath;
  private static final String EXPECTED_REGEX =
      "CMA-M\\d{2}-0003: Duplicate command-line arguments '([^']*)' are not allowed([^']*)";
  private static final int EXPECTED_STATUS_CODE = -3;
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
    if (Err0003Test.cimerantPath == null) {
      final var temporaryFolder = new TemporaryFolder();
      temporaryFolder.create();

      Err0003Test.cimerantPath = temporaryFolder.getRoot();
      // cimerantPath = new File("/tmp/cucumber_user_dir");

      System.setProperty("user.dir", Err0003Test.cimerantPath.getAbsolutePath());
    }

    if (Err0003Test.rootPath == null) {
      Err0003Test.rootPath = "src/test/resources/cucumber/" + Err0003Test.class.getSimpleName();
    }
    if (Err0003Test.modelPath == null) {
      Err0003Test.modelPath = Err0003Test.rootPath + "/model/Model.json";
    }
    if (Err0003Test.sourceFilePath == null) {
      Err0003Test.sourceFilePath = Paths.get(Err0003Test.rootPath, "result");
    }
    if (Err0003Test.destinationFilePath == null) {
      Err0003Test.destinationFilePath =
          Paths.get(
              Err0003Test.cimerantPath.getAbsolutePath(),
              "cucumber",
              Err0003Test.class.getSimpleName(),
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
    try (var dirStream = Files.walk(Err0003Test.cimerantPath.toPath())) {
      dirStream //
          .filter(Files::isDirectory) //
          .map(Path::toFile) //
          .sorted(Comparator.reverseOrder()) //
          .forEach(File::delete);
    } catch (final Exception e) {
      // ignore
    }

    Err0003Test.cimerantPath = null;
    Err0003Test.destinationFilePath = null;
    Err0003Test.modelPath = null;
    Err0003Test.rootPath = null;
    Err0003Test.sourceFilePath = null;
  }

  private boolean contentEquals = true;
  private boolean optionF = false;
  private boolean optionF2 = false;
  private boolean optionFile = false;
  private boolean optionFile2 = false;
  private boolean optionMulti = false;
  private boolean optionP = false;
  private boolean optionP2 = false;
  private boolean optionPath = false;
  private boolean optionPath2 = false;
  private boolean optionSingle = false;
  private boolean optionT = false;
  private boolean optionT2 = false;
  private boolean optionTemplate = false;
  private boolean optionTemplate2 = false;
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
   */
  @After
  public void endScenario() {
    if (this.uniqueDestinationFilePath != null && this.contentEquals) {
      try {
        FileUtils.deleteDirectory(this.uniqueDestinationFilePath.toFile());
      } catch (final IOException e) {
        // ignore
      }
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
   * @param argParam indicates and additional command line argument for a specific testing
   *     condition.
   * @see Given
   */
  @Given("err0003.{int} param {string}")
  public void err0003_param(final Integer argUnique, final String argParam) {
    if ("f".equals(argParam) || "file".equals(argParam)) {
      this.givenTheFile(argUnique, argParam);
    } else if ("i".equals(argParam) || "input".equals(argParam)) {
      this.givenTheInputFile(argUnique, argParam);
    } else if ("l".equals(argParam) || "templates".equals(argParam)) {
      this.givenTheTemplates(argUnique, argParam);
    } else if ("multi".equals(argParam) || "single".equals(argParam)) {
      this.givenTheSingleMultiValue(argUnique, argParam);
    } else if ("p".equals(argParam) || "path".equals(argParam)) {
      this.givenThePath(argUnique, argParam);
    } else if ("t".equals(argParam) || "template".equals(argParam)) {
      this.givenTheTemplate(argUnique, argParam);
    } else if ("variables".equals(argParam) || "x".equals(argParam)) {
      this.givenTheVars(argUnique, argParam);
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argFile indicates whether to use the f or file command line argument.
   * @see Given
   */
  @Given("err0003.{int} file {string}")
  public void givenTheFile(final Integer argUnique, final String argFile) {
    if ("f".equals(argFile)) {
      if (this.optionF) {
        this.optionF2 = true;
      } else {
        this.optionF = true;
      }
    } else if ("file".equals(argFile)) {
      if (this.optionFile) {
        this.optionFile2 = true;
      } else {
        this.optionFile = true;
      }
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argInputFile indicates whether to use the i or input command line argument.
   * @see Given
   */
  @Given("err0003.{int} input file {string}")
  public void givenTheInputFile(final Integer argUnique, final String argInputFile) {
    if ("i".equals(argInputFile)) {
      this.values.add("-i '" + Err0003Test.modelPath + "'");
    } else if ("input".equals(argInputFile)) {
      this.values.add("--input='" + Err0003Test.modelPath + "'");
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argPath indicates whether to use the p or path command line argument.
   * @see Given
   */
  @Given("err0003.{int} path {string}")
  public void givenThePath(final Integer argUnique, final String argPath) {
    if ("p".equals(argPath)) {
      if (this.optionP) {
        this.optionP2 = true;
      } else {
        this.optionP = true;
      }
    } else if ("path".equals(argPath)) {
      if (this.optionPath) {
        this.optionPath2 = true;
      } else {
        this.optionPath = true;
      }
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argSinti indicates whether to use the single or multi command line argument.
   * @see Given
   */
  @Given("err0003.{int} single multi value {string}")
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
  @Given("err0003.{int} template {string}")
  public void givenTheTemplate(final Integer argUnique, final String argTemplate) {
    if ("t".equals(argTemplate)) {
      if (this.optionT) {
        this.optionT2 = true;
      } else {
        this.optionT = true;
      }
    } else if ("template".equals(argTemplate)) {
      if (this.optionTemplate) {
        this.optionTemplate2 = true;
      } else {
        this.optionTemplate = true;
      }
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argTemplates indicates whether to use the l or templates command line argument.
   * @see Given
   */
  @Given("err0003.{int} templates {string}")
  public void givenTheTemplates(final Integer argUnique, final String argTemplates) {
    if ("l".equals(argTemplates)) {
      this.values.add("-l '" + Err0003Test.rootPath + "/list/TemplateList001.md'");
    } else if ("templates".equals(argTemplates)) {
      this.values.add("--templates='" + Err0003Test.rootPath + "/list/TemplateList001.md'");
    } else if ("templates2".equals(argTemplates)) {
      this.values.add("--templates='" + Err0003Test.rootPath + "/list/TemplateList002.md'");
    } else if ("templates3".equals(argTemplates)) {
      this.values.add("--templates='" + Err0003Test.rootPath + "/list/TemplateList003.md'");
    } else if ("templates4".equals(argTemplates)) {
      this.values.add("--templates='" + Err0003Test.rootPath + "/list/TemplateList004.md'");
    } else if ("templates5".equals(argTemplates)) {
      this.values.add("--templates='" + Err0003Test.rootPath + "/list/TemplateList005.md'");
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argVar indicates whether to add key/value pair command line arguments.
   * @see Given
   */
  @Given("err0003.{int} var {string}")
  public void givenTheVar(final Integer argUnique, final String argVar) {
    if ("keys".equals(argVar)) {
      this.values.add("--key='Message5'");
      this.values.add("--value='Here's message #5'");
      this.values.add("--key='Message6'");
      this.values.add("--value='Here's message #6'");
    }
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argVars indicates whether to use the x or variables command line argument.
   * @see Given
   */
  @Given("err0003.{int} vars {string}")
  public void givenTheVars(final Integer argUnique, final String argVars) {
    if ("x".equals(argVars)) {
      this.values.add("-x '" + Paths.get(Err0003Test.rootPath, "/list/VariableList.md") + "'");
    } else if ("variables".equals(argVars)) {
      this.values.add(
          "--variables='" + Paths.get(Err0003Test.rootPath, "/list/VariableList.md") + "'");
    }
  }

  /**
   * Describes the action or event that triggers the behavior.
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @throws Exception any exception thrown by the statement.
   * @see When
   */
  @When("err0003.{int} the values are passed into Cimerant")
  public void sinceWhenErr0003TheValuesArePassedIntoCimerant(final Integer argUnique)
      throws Exception {
    this.uniqueDestinationFilePath =
        Paths.get(Err0003Test.destinationFilePath.toString(), "" + argUnique);

    if (this.optionSingle || !this.optionMulti) {
      if (this.optionT || this.optionTemplate) {
        if (this.optionP) {
          this.values.add("-p '" + this.uniqueDestinationFilePath + "'");
        }
        if (this.optionP2) {
          this.values.add("-p '" + this.uniqueDestinationFilePath + "'");
        }
        if (this.optionPath) {
          this.values.add("--path='" + this.uniqueDestinationFilePath + "'");
        }
        if (this.optionPath2) {
          this.values.add("--path='" + this.uniqueDestinationFilePath + "'");
        }
      } else {
        if (this.optionP) {
          this.values.add("-p '" + this.uniqueDestinationFilePath + "/single'");
        }
        if (this.optionP2) {
          this.values.add("-p '" + this.uniqueDestinationFilePath + "/single'");
        }
        if (this.optionPath) {
          this.values.add("--path='" + this.uniqueDestinationFilePath + "/single'");
        }
        if (this.optionPath2) {
          this.values.add("--path='" + this.uniqueDestinationFilePath + "/single'");
        }
      }
      if (this.optionF) {
        this.values.add("-f 'Destination.xml'");
      }
      if (this.optionF2) {
        this.values.add("-f 'Destination.xml'");
      }
      if (this.optionFile) {
        this.values.add("--file='Destination.xml'");
      }
      if (this.optionFile2) {
        this.values.add("--file='Destination.xml'");
      }
      if (this.optionT) {
        this.values.add("-t '" + Err0003Test.rootPath + "/template/SingleTemplate.vm'");
      }
      if (this.optionT2) {
        this.values.add("-t '" + Err0003Test.rootPath + "/template/SingleTemplate.vm'");
      }
      if (this.optionTemplate) {
        this.values.add("--template='" + Err0003Test.rootPath + "/template/SingleTemplate.vm'");
      }
      if (this.optionTemplate2) {
        this.values.add("--template='" + Err0003Test.rootPath + "/template/SingleTemplate.vm'");
      }
    } else {
      if (this.optionT || this.optionTemplate) {
        if (this.optionP) {
          this.values.add("-p '" + this.uniqueDestinationFilePath + "'");
        }
        if (this.optionP2) {
          this.values.add("-p '" + this.uniqueDestinationFilePath + "'");
        }
        if (this.optionPath) {
          this.values.add("--path='" + this.uniqueDestinationFilePath + "'");
        }
        if (this.optionPath2) {
          this.values.add("--path='" + this.uniqueDestinationFilePath + "'");
        }
      } else {
        if (this.optionP) {
          this.values.add("-p '" + this.uniqueDestinationFilePath + "/multi1'");
        }
        if (this.optionP2) {
          this.values.add("-p '" + this.uniqueDestinationFilePath + "/multi1'");
        }
        if (this.optionPath) {
          this.values.add("--path='" + this.uniqueDestinationFilePath + "/multi2'");
        }
        if (this.optionPath2) {
          this.values.add("--path='" + this.uniqueDestinationFilePath + "/multi2'");
        }
      }
      if (this.optionF) {
        this.values.add("-f 'Destination_${CLASS_NAME}.xml'");
      }
      if (this.optionF2) {
        this.values.add("-f 'Destination_${CLASS_NAME}.xml'");
      }
      if (this.optionFile) {
        this.values.add("--file='Destination_${CLASS_NAME}.xml'");
      }
      if (this.optionFile2) {
        this.values.add("--file='Destination_${CLASS_NAME}.xml'");
      }
      if (this.optionT) {
        this.values.add("-t '" + Err0003Test.rootPath + "/template/MultiTemplate.vm'");
      }
      if (this.optionT2) {
        this.values.add("-t '" + Err0003Test.rootPath + "/template/MultiTemplate.vm'");
      }
      if (this.optionTemplate) {
        this.values.add("--template='" + Err0003Test.rootPath + "/template/MultiTemplate.vm'");
      }
      if (this.optionTemplate2) {
        this.values.add("--template='" + Err0003Test.rootPath + "/template/MultiTemplate.vm'");
      }
    }

    final var stockArr = this.values.toArray(String[]::new);
    this.values.clear();

    Files.createDirectories(Err0003Test.cimerantPath.toPath());

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
   * @see Then
   */
  @Then("err0003.{int} error is thrown")
  public void thenErr0003ErrorIsThrown(final Integer argUnique) {
    Assertions.assertTrue(
        this.textWrittenToSystemErr != null
            && this.textWrittenToSystemErr.matches(Err0003Test.EXPECTED_REGEX),
        "#"
            + argUnique
            + " expected: "
            + System.lineSeparator()
            + "<"
            + Err0003Test.EXPECTED_REGEX
            + ">"
            + System.lineSeparator()
            + " but was: "
            + System.lineSeparator()
            + "<"
            + this.textWrittenToSystemErr
            + ">"
            + System.lineSeparator());

    Assertions.assertEquals(
        Err0003Test.EXPECTED_STATUS_CODE,
        this.statusCode,
        "#" + argUnique + " Unexpected Status Code: " + this.statusCode);
  }
}
