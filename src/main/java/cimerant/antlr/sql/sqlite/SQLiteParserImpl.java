package cimerant.antlr.sql.sqlite;

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
import sql.sqlite.SQLiteLexer;
import sql.sqlite.SQLiteParser;
import sql.sqlite.SQLiteParserListener;

/** This is all the parsing support code essentially; most of it is error recovery stuff. */
public class SQLiteParserImpl extends SQLiteParser {
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(SQLiteParserImpl.class.getName());
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param file the object model file.
   * @return a instance of the parser.
   */
  public static SQLiteParserImpl getInstance(final File file) {
    final var moduleCode = ModuleCode.ERR_M3300;

    try {
      final var lexer = new SQLiteLexer(CharStreams.fromFileName(file.getCanonicalPath()));
      lexer.removeErrorListeners();
      lexer.addErrorListener(new ProxyErrorListenerImpl(lexer.getErrorListeners()));

      return new SQLiteParserImpl(new CommonTokenStream(lexer));
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (SQLiteParserImpl.logger.isDebugEnabled()) {
        SQLiteParserImpl.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  /**
   * Creates an instance.
   *
   * @param input An {@link IntStream} whose symbols are {@link Token} instances.
   */
  public SQLiteParserImpl(final TokenStream input) {
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
    final SQLiteParserListener sqLiteParserListener = new SQLiteParserListenerImpl();

    this.removeParseListeners();
    this.addParseListener(sqLiteParserListener);
    this.parse();

    return sqLiteParserListener.getRootContext();
  }
}
