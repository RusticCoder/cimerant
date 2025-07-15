package cimerant.antlr.sql.postgresql;

import cimerant.Cimerant;
import cimerant.ModuleCode;
import cimerant.StatusCode;
import cimerant.SysError;
import cimerant.antlr.sql.ProxyErrorListenerImpl;
import cimerant.context.sql.SqlRootContext;
import cimerant.logger.CimerantLogger;
import java.io.File;
import java.io.IOException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import sql.postgresql.PostgreSQLLexer;
import sql.postgresql.PostgreSQLParser;
import sql.postgresql.PostgreSQLParserListener;

/** This is all the parsing support code essentially; most of it is error recovery stuff. */
public class PostgreSQLParserImpl extends PostgreSQLParser {
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(PostgreSQLParserImpl.class.getName());
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param file the object model file.
   * @return a instance of the parser.
   * @throws IOException if an I/O error occurs
   */
  public static PostgreSQLParserImpl getInstance(final File file) throws IOException {
    final var moduleCode = ModuleCode.ERR_M3100;

    try {
      final var lexer = new PostgreSQLLexer(CharStreams.fromFileName(file.getCanonicalPath()));
      lexer.removeErrorListeners();
      lexer.addErrorListener(new ProxyErrorListenerImpl(lexer.getErrorListeners()));

      return new PostgreSQLParserImpl(new CommonTokenStream(lexer));
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (PostgreSQLParserImpl.logger.isDebugEnabled()) {
        PostgreSQLParserImpl.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  /**
   * Creates an instance.
   *
   * @param input An {@link IntStream} whose symbols are {@link Token} instances.
   */
  public PostgreSQLParserImpl(final TokenStream input) {
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
    final PostgreSQLParserListener postgreSQLParserListener = new PostgreSQLParserListenerImpl();

    this.removeParseListeners();
    this.addParseListener(postgreSQLParserListener);
    this.root();

    return postgreSQLParserListener.getRootContext();
  }
}
