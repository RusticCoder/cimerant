package cimerant.tests.sql;

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

/** This feature will test parsing SQLite files. */
public class SQLite {
  private static File cimerantPath;
  private static Path destinationFilePath;
  private static String rootPath;
  private static Path sharedDestinationFilePath;
  private static String sharedRootPath;
  private static Path sharedSourceFilePath;
  private static Path sourceFilePath;

  /**
   * Run before any scenario is run.
   *
   * @throws IOException temporary folder could not be created.
   * @see BeforeAll
   */
  @BeforeAll
  public static void beforeAll() throws IOException {
    if (SQLite.cimerantPath == null) {
      final var temporaryFolder = new TemporaryFolder();
      temporaryFolder.create();

      SQLite.cimerantPath = temporaryFolder.getRoot();
      // cimerantPath = new File(System.getProperty("user.home") + "/tmp");

      System.setProperty("user.dir", SQLite.cimerantPath.getAbsolutePath());
    }

    if (SQLite.rootPath == null) {
      SQLite.rootPath = "src/test/resources/cucumber/sql/" + SQLite.class.getSimpleName();
      SQLite.sharedRootPath = "src/test/resources/cucumber/sql/shared";
    }
    if (SQLite.sourceFilePath == null) {
      SQLite.sourceFilePath = Paths.get(SQLite.rootPath, "result");
      SQLite.sharedSourceFilePath = Paths.get(SQLite.sharedRootPath, "result");
    }
    if (SQLite.destinationFilePath == null) {
      SQLite.destinationFilePath =
          Paths.get(
              SQLite.cimerantPath.getAbsolutePath(),
              "cucumber",
              SQLite.class.getSimpleName(),
              "result");
      SQLite.sharedDestinationFilePath =
          Paths.get(SQLite.cimerantPath.getAbsolutePath(), "cucumber", "shared", "result");
    }
  }

  /**
   * Run after all scenarios have been executed.
   *
   * @see AfterAll
   */
  @AfterAll
  public static void endAll() {
    try (var dirStream = Files.walk(SQLite.cimerantPath.toPath())) {
      dirStream
          .filter(Files::isDirectory)
          .map(Path::toFile)
          .sorted(Comparator.reverseOrder())
          .forEach(File::delete);
    } catch (final Throwable t) {
      // ignore
    }

    SQLite.cimerantPath = null;
    SQLite.destinationFilePath = null;
    SQLite.rootPath = null;
  }

  private boolean contentEquals = true;
  private String outputFile = null;
  private Path sharedDestinationFile;
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
    }

    if (this.sharedDestinationFile != null) {
      this.sharedDestinationFile.toFile().delete();
    }

    this.contentEquals = true;
    this.statusCode = 0;
    this.sharedDestinationFile = null;
    this.uniqueDestinationFilePath = null;
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argInputFile file to be transformed.
   * @see Given
   */
  @Given("sqLite.{int} the input file {string}")
  public void givenInputFile(final Integer argUnique, final String argInputFile) {
    this.values.add("--input='" + SQLite.rootPath + "/model/" + argInputFile + "'");
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argOutputFile file to be returned.
   * @see Given
   */
  @Given("sqLite.{int} the output file {string}")
  public void givenOutputFile(final Integer argUnique, final String argOutputFile) {
    this.outputFile = argOutputFile + ".xml";
    this.values.add("--file='" + this.outputFile + "'");
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argInputFile file to be transformed.
   * @see Given
   */
  @Given("sqLite.{int} the shared input file {string}")
  public void givenSharedInputFile(final Integer argUnique, final String argInputFile) {
    this.values.add("--input='" + SQLite.sharedRootPath + "/model/" + argInputFile + "'");
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argOutputFile file to be returned.
   * @see Given
   */
  @Given("sqLite.{int} the shared output file {string}")
  public void givenSharedOutputFile(final Integer argUnique, final String argOutputFile) {
    this.outputFile = argOutputFile + ".xml";
    this.values.add("--file='" + this.outputFile + "'");
  }

  /**
   * Describes the action or event that triggers the behavior.
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @throws Exception any exception thrown by the statement.
   * @see When
   */
  @When("sqLite.{int} the shared values are passed into Cimerant")
  public void sinceWhenTheSharedValuesArePassedIntoCimerant(final Integer argUnique)
      throws Exception {
    this.uniqueDestinationFilePath = Paths.get(SQLite.sharedDestinationFilePath.toString());

    this.values.add("--path='" + this.uniqueDestinationFilePath + "'");
    this.values.add(
        "--template='" + SQLite.rootPath + "/template/" + SQLite.class.getSimpleName() + ".vm'");
    this.values.add("--single");
    this.values.add("--input-type='SQLite'");

    final var stockArr = this.values.toArray(String[]::new);
    this.values.clear();

    Files.createDirectories(SQLite.cimerantPath.toPath());

    try {
      this.textWrittenToSystemErr =
          SystemLambda.tapSystemErr(
              () -> this.statusCode = SystemLambda.catchSystemExit(() -> Cimerant.main(stockArr)));
    } catch (final java.lang.AssertionError e) {
      if (!"System.exit has not been called.".equals(e.getMessage())) {
        throw e;
      }
    }
    this.textWrittenToSystemErr = StringUtils.stripToNull(this.textWrittenToSystemErr);
  }

  /**
   * Describes the action or event that triggers the behavior.
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @throws Exception any exception thrown by the statement.
   * @see When
   */
  @When("sqLite.{int} the values are passed into Cimerant")
  public void sinceWhenTheValuesArePassedIntoCimerant(final Integer argUnique) throws Exception {
    this.uniqueDestinationFilePath =
        Paths.get(SQLite.destinationFilePath.toString(), "" + argUnique);

    this.values.add("--path='" + this.uniqueDestinationFilePath + "'");
    this.values.add(
        "--template='" + SQLite.rootPath + "/template/" + SQLite.class.getSimpleName() + ".vm'");
    this.values.add("--single");
    this.values.add("--input-type='SQLite'");

    final var stockArr = this.values.toArray(String[]::new);
    this.values.clear();

    Files.createDirectories(SQLite.cimerantPath.toPath());

    try {
      this.textWrittenToSystemErr =
          SystemLambda.tapSystemErr(
              () -> this.statusCode = SystemLambda.catchSystemExit(() -> Cimerant.main(stockArr)));
    } catch (final java.lang.AssertionError e) {
      if (!"System.exit has not been called.".equals(e.getMessage())) {
        throw e;
      }
    }
    this.textWrittenToSystemErr = StringUtils.stripToNull(this.textWrittenToSystemErr);
  }

  /**
   * Describes the expected outcome or result.
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @throws IOException folders cannot be compared.
   * @see Then
   */
  @Then("sqLite.{int} Cimerant outputs")
  public void thenOutputSourceFilePath(final Integer argUnique) throws IOException {
    Assertions.assertTrue(
        StringUtils.isBlank(this.textWrittenToSystemErr),
        "#" + argUnique + " Unexpected Error: " + this.textWrittenToSystemErr);
    Assertions.assertEquals(
        0, this.statusCode, "#" + argUnique + " Unexpected Status Code: " + this.statusCode);

    final var uniqueSourceFilePath = Paths.get(SQLite.sourceFilePath.toString(), "" + argUnique);
    if (this.uniqueDestinationFilePath == null) {
      this.uniqueDestinationFilePath =
          Paths.get(SQLite.destinationFilePath.toString(), "" + argUnique);
    }
    this.contentEquals =
        DirUtils.contentEquals(uniqueSourceFilePath, this.uniqueDestinationFilePath);
    Assertions.assertTrue(
        this.contentEquals,
        "#"
            + argUnique
            + " '"
            + uniqueSourceFilePath.toAbsolutePath()
            + "' did not match '"
            + this.uniqueDestinationFilePath.toAbsolutePath()
            + "'");
  }

  /**
   * Describes the expected outcome or result.
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @throws IOException folders cannot be compared.
   * @see Then
   */
  @Then("sqLite.{int} Cimerant shared outputs")
  public void thenSharedOutputSourceFilePath(final Integer argUnique) throws IOException {
    this.sharedDestinationFile = null;
    this.uniqueDestinationFilePath = null;

    Assertions.assertTrue(
        StringUtils.isBlank(this.textWrittenToSystemErr),
        "#" + argUnique + " Unexpected Error: " + this.textWrittenToSystemErr);
    Assertions.assertEquals(
        0, this.statusCode, "#" + argUnique + " Unexpected Status Code: " + this.statusCode);

    final var sharedSourceFile =
        Paths.get(SQLite.sharedSourceFilePath.toAbsolutePath().toString(), this.outputFile);
    this.contentEquals =
        this.contentEquals
            && sharedSourceFile.toFile().exists()
            && !sharedSourceFile.toFile().isDirectory();
    Assertions.assertTrue(
        this.contentEquals,
        "#" + argUnique + " '" + sharedSourceFile.toFile().getAbsolutePath() + "' not found.");

    final var sharedDestinationFile =
        Paths.get(SQLite.sharedDestinationFilePath.toAbsolutePath().toString(), this.outputFile);
    this.contentEquals =
        sharedDestinationFile.toFile().exists() && !sharedDestinationFile.toFile().isDirectory();
    Assertions.assertTrue(
        this.contentEquals,
        "#" + argUnique + " '" + sharedDestinationFile.toFile().getAbsolutePath() + "' not found.");

    this.contentEquals =
        FileUtils.contentEquals(sharedSourceFile.toFile(), sharedDestinationFile.toFile());
    Assertions.assertTrue(
        this.contentEquals,
        "#"
            + argUnique
            + " '"
            + sharedSourceFile.toFile().getAbsolutePath()
            + "' did not match '"
            + sharedDestinationFile.toFile().getAbsolutePath()
            + "'");

    this.sharedDestinationFile = sharedDestinationFile;
  }
}
