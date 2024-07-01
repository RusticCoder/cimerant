package cimerant.tests.stringutils;

import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

/** This feature will test all the various combinations of command-line arguments. */
public class KebabTitleCaseValue {
  private final ContextRoot<ObjectMapper> contextRoot =
      ContextRootImpl.getInstance(new ObjectMapper());
  private String outputString = null;

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @see Given
   */
  @Given("kebabTitleCaseValue.{int} the input null is passed into Cimerant")
  public void givenTheInputNullIsPassedIntoCimerant(final Integer argUnique) {
    this.outputString = this.contextRoot.kebabTitleCase((String) null);
  }

  /**
   * Describes the initial context or state of the system (the setup).
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argInputString input string to be tested.
   * @see Given
   */
  @Given("kebabTitleCaseValue.{int} the input {string} is passed into Cimerant")
  public void givenTheInputStringIsPassedIntoCimerant(
      final Integer argUnique, final String argInputString) {
    this.outputString = this.contextRoot.kebabTitleCase(argInputString);
  }

  /**
   * Describes the expected outcome or result.
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @param argOutputString expected output string.
   * @see Then
   */
  @Then("kebabTitleCaseValue.{int} Cimerant outputs {string}")
  public void thenCimerantOutputs(final Integer argUnique, final String argOutputString) {
    var result = this.outputString;
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 1));

    result =
        this.contextRoot.kebabTitleCase(this.contextRoot.backSlashLowerCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 2));

    result =
        this.contextRoot.kebabTitleCase(this.contextRoot.backSlashTitleCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 3));

    result =
        this.contextRoot.kebabTitleCase(this.contextRoot.backSlashUpperCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 4));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.camelCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 5));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.dotLowerCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 6));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.dotTitleCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 7));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.dotUpperCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 8));

    result =
        this.contextRoot.kebabTitleCase(this.contextRoot.forwardSlashLowerCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 9));

    result =
        this.contextRoot.kebabTitleCase(this.contextRoot.forwardSlashTitleCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 10));

    result =
        this.contextRoot.kebabTitleCase(this.contextRoot.forwardSlashUpperCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 11));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.kebabLowerCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 12));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.kebabTitleCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 13));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.kebabUpperCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 14));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.lowerCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 15));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.lowerFirst(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 16));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.pascalCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 17));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.snakeLowerCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 18));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.snakeTitleCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 19));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.snakeUpperCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 20));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.titleCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 21));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.upperCase(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 22));

    result = this.contextRoot.kebabTitleCase(this.contextRoot.upperFirst(this.outputString));
    Assertions.assertEquals(argOutputString, result, String.format("#%d", 23));
  }

  /**
   * Describes the expected outcome or result.
   *
   * @param argUnique a unique value indicating the line in the example data being tested.
   * @see Then
   */
  @Then("kebabTitleCaseValue.{int} Cimerant outputs null")
  public void thenCimerantOutputsNull(final Integer argUnique) {
    Assertions.assertEquals(this.outputString, null);
  }
}
