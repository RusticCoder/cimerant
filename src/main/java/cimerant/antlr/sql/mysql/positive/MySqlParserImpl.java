package cimerant.antlr.sql.mysql.positive;

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
import sql.mysql.positive.MySqlLexer;
import sql.mysql.positive.MySqlParser;
import sql.mysql.positive.MySqlParserListener;

/** This is all the parsing support code essentially; most of it is error recovery stuff. */
public class MySqlParserImpl extends MySqlParser {
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(MySqlParserImpl.class.getName());
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param file the object model file.
   * @return a instance of the parser.
   */
  public static MySqlParserImpl getInstance(final File file) {
    final var moduleCode = ModuleCode.ERR_M2800;

    try {
      final var lexer = new MySqlLexer(CharStreams.fromFileName(file.getCanonicalPath()));
      lexer.removeErrorListeners();
      lexer.addErrorListener(new ProxyErrorListenerImpl(lexer.getErrorListeners()));

      return new MySqlParserImpl(new CommonTokenStream(lexer));
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (MySqlParserImpl.logger.isDebugEnabled()) {
        MySqlParserImpl.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  /**
   * Creates an instance.
   *
   * @param input An {@link IntStream} whose symbols are {@link Token} instances.
   */
  public MySqlParserImpl(final TokenStream input) {
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
    final MySqlParserListener mySqlParserListener = new MySqlParserListenerImpl();

    this.removeParseListeners();
    this.addParseListener(mySqlParserListener);
    this.root();

    return mySqlParserListener.getRootContext();
  }
}
