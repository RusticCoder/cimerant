package cimerant.logger;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

/**
 * This interface based on {@link java.util.ServiceLoader} paradigm. <br>
 * It replaces the old static-binding mechanism used in SLF4J versions 1.0.x to 1.7.x.
 */
public class CimerantServiceProvider implements SLF4JServiceProvider {
  /**
   * Declare the version of the SLF4J API this implementation is compiled against. The value of this
   * field is modified with each major release.
   */

  // to avoid constant folding by the compiler, this field must *not* be final
  public static final String REQUESTED_API_VERSION = "2.0"; // !final

  private ILoggerFactory loggerFactory;
  private IMarkerFactory markerFactory;
  private MDCAdapter mdcAdapter;

  /**
   * Return the instance of {@link ILoggerFactory} that {@link org.slf4j.LoggerFactory} class should
   * bind to.
   */
  @Override
  public ILoggerFactory getLoggerFactory() {
    return this.loggerFactory;
  }

  /**
   * Return the instance of {@link IMarkerFactory} that {@link org.slf4j.MarkerFactory} class should
   * bind to.
   */
  @Override
  public IMarkerFactory getMarkerFactory() {
    return this.markerFactory;
  }

  /** Return the instance of {@link MDCAdapter} that {@link MDC} should bind to. */
  @Override
  public MDCAdapter getMDCAdapter() {
    return this.mdcAdapter;
  }

  /**
   * Return the maximum API version for SLF4J that the logging implementation supports. <br>
   * For example: {@code "2.0.1"}.
   */
  @Override
  public String getRequestedApiVersion() {
    return CimerantServiceProvider.REQUESTED_API_VERSION;
  }

  /**
   * Initialize the logging back-end. <br>
   * <b>WARNING:</b> This method is intended to be called once by {@link LoggerFactory} class and
   * from nowhere else.
   */
  @Override
  public void initialize() {
    this.loggerFactory = new CimerantLoggerFactory();
    this.markerFactory = new BasicMarkerFactory();
    this.mdcAdapter = new NOPMDCAdapter();
  }
}
