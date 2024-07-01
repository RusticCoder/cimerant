package cimerant;

// import com.tngtech.archunit.core.domain.JavaClasses;
// import com.tngtech.archunit.junit.AnalyzeClasses;
// import com.tngtech.archunit.junit.ArchTest;
// import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
// import com.tngtech.archunit.library.GeneralCodingRules;
// import org.junit.jupiter.api.Tag;

/**
 * https://www.archunit.org
 *
 * <p>https://github.com/TNG/ArchUnit-Examples
 *
 * <p>example-junit5 shows how to use the JUnit 5 test support where test classes are simply being
 * picked up by being annotated with @AnalyzeClasses
 */
// @AnalyzeClasses(packagesOf = {Cimerant.class})
// @Tag("architectureTests")
public class ArchitectureTests {
  // @ArchTest
  // @Tag("architectureTests")
  // public void assertionsShouldHaveDetailMessage(final JavaClasses classes) {
  // GeneralCodingRules.ASSERTIONS_SHOULD_HAVE_DETAIL_MESSAGE.check(classes);
  // }
  //
  // // @ArchTest
  // // private final ArchRule deprecatedApiShouldNotBeUsed =
  // // GeneralCodingRules.DEPRECATED_API_SHOULD_NOT_BE_USED;
  //
  // @ArchTest
  // @Tag("architectureTests")
  // public void loggersShouldBePrivateNotStaticBeFinal(final JavaClasses classes) {
  // ArchRuleDefinition.fields()
  // .that()
  // .haveRawType(org.slf4j.Logger.class)
  // .should()
  // .bePrivate()
  // .andShould()
  // .notBeStatic()
  // .andShould()
  // .beFinal()
  // .because("allow log to be GC at end of run.")
  // .allowEmptyShould(true);
  // }
  //
  // // @ArchTest
  // // private final ArchRule noClassesShouldAccessStandardStreamsOrThrowGenericExceptions =
  // // CompositeArchRule.of(GeneralCodingRules.NO_CLASSES_SHOULD_ACCESS_STANDARD_STREAMS)
  // // .and(GeneralCodingRules.NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS);
  //
  // // @ArchTest
  // // private final ArchRule noClassesShouldDependUpperPackages =
  // // DependencyRules.NO_CLASSES_SHOULD_DEPEND_UPPER_PACKAGES;
  //
  // @ArchTest
  // @Tag("architectureTests")
  // public void noClassesShouldUseFieldInjection(final JavaClasses classes) {
  // GeneralCodingRules.NO_CLASSES_SHOULD_USE_FIELD_INJECTION.check(classes);
  // }
  //
  // @ArchTest
  // @Tag("architectureTests")
  // public void noClassesShouldUseJavaUtilLogging(final JavaClasses classes) {
  // GeneralCodingRules.NO_CLASSES_SHOULD_USE_JAVA_UTIL_LOGGING.check(classes);
  // }
  //
  // @ArchTest
  // @Tag("architectureTests")
  // public void noClassesShouldUseJodatime(final JavaClasses classes) {
  // GeneralCodingRules.NO_CLASSES_SHOULD_USE_JODATIME.check(classes);
  // }
  //
  // // @ArchTest
  // // private void noAccessToStandardStreamsAsMethod(final JavaClasses classes) {
  // // ArchRuleDefinition.noClasses()
  // // .should(GeneralCodingRules.ACCESS_STANDARD_STREAMS)
  // // .check(classes);
  // // }
}
