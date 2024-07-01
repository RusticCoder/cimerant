package cimerant;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.Suite;

/** {@code @Suite} marks a class as a test suite on the JUnit Platform. */
@Suite
@IncludeEngines("cucumber")
public class CucumberTests {}
