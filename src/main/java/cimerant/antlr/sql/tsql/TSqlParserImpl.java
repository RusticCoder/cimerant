package cimerant.antlr.sql.tsql;

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
import org.slf4j.LoggerFactory;
import sql.tsql.TSqlLexer;
import sql.tsql.TSqlParser;
import sql.tsql.TSqlParserListener;

/** This is all the parsing support code essentially; most of it is error recovery stuff. */
public class TSqlParserImpl extends TSqlParser {
  private static final CimerantLogger logger;

  static {
    logger = (CimerantLogger) LoggerFactory.getLogger(TSqlParserImpl.class.getName());
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param file the object model file.
   * @return a instance of the parser.
   * @throws IOException if an I/O error occurs
   */
  public static TSqlParserImpl getInstance(final File file) throws IOException {
    final var moduleCode = ModuleCode.ERR_M3500;

    try {
      final var lexer = new TSqlLexer(CharStreams.fromFileName(file.getCanonicalPath()));
      lexer.removeErrorListeners();
      lexer.addErrorListener(new ProxyErrorListenerImpl(lexer.getErrorListeners()));

      return new TSqlParserImpl(new CommonTokenStream(lexer));
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (TSqlParserImpl.logger.isDebugEnabled()) {
        TSqlParserImpl.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  /**
   * Creates an instance.
   *
   * @param input An {@link IntStream} whose symbols are {@link Token} instances.
   */
  public TSqlParserImpl(final TokenStream input) {
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
    final TSqlParserListener tSqlParserListener = new TSqlParserListenerImpl();

    this.removeParseListeners();
    this.addParseListener(tSqlParserListener);
    this.tsql_file();

    return tSqlParserListener.getRootContext();
  }
}
