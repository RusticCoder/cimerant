package cimerant.antlr.sql.snowflake;

import cimerant.Cimerant;
import cimerant.ModuleCode;
import cimerant.StatusCode;
import cimerant.SysError;
import cimerant.antlr.sql.ProxyErrorListenerImpl;
import cimerant.context.sql.SqlRootContext;
import cimerant.logger.CimerantLogger;
import java.io.File;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import sql.snowflake.SnowflakeLexer;
import sql.snowflake.SnowflakeParser;
import sql.snowflake.SnowflakeParserListener;

/** This is all the parsing support code essentially; most of it is error recovery stuff. */
public class SnowflakeParserImpl extends SnowflakeParser {
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(SnowflakeParserImpl.class.getName());
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param file the object model file.
   * @return a instance of the parser.
   */
  public static SnowflakeParserImpl getInstance(final File file) {
    final var moduleCode = ModuleCode.ERR_M3200;

    try {
      final var lexer = new SnowflakeLexer(CharStreams.fromFileName(file.getCanonicalPath()));
      lexer.removeErrorListeners();
      lexer.addErrorListener(new ProxyErrorListenerImpl(lexer.getErrorListeners()));

      return new SnowflakeParserImpl(new CommonTokenStream(lexer));
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (SnowflakeParserImpl.logger.isDebugEnabled()) {
        SnowflakeParserImpl.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  /**
   * Creates an instance.
   *
   * @param input An {@link IntStream} whose symbols are {@link Token} instances.
   */
  public SnowflakeParserImpl(final TokenStream input) {
    super(input);

    this.removeParseListeners();
    this.removeErrorListeners();
    this.addErrorListener(new ProxyErrorListenerImpl(this.getErrorListeners()));
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @return a instance of the context.
   */
  public SqlRootContext getRootContext() {
    final SnowflakeParserListener snowflakeParserListener = new SnowflakeParserListenerImpl();

    this.removeParseListeners();
    this.addParseListener(snowflakeParserListener);
    this.snowflake_file();

    return snowflakeParserListener.getRootContext();
  }
}
