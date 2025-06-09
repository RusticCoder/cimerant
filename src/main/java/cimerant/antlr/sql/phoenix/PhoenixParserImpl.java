package cimerant.antlr.sql.phoenix;

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
import sql.phoenix.PhoenixLexer;
import sql.phoenix.PhoenixParser;
import sql.phoenix.PhoenixParserListener;

/** This is all the parsing support code essentially; most of it is error recovery stuff. */
public class PhoenixParserImpl extends PhoenixParser {
  private static final CimerantLogger logger;

  static {
    logger = (CimerantLogger) LoggerFactory.getLogger(PhoenixParserImpl.class.getName());
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param file the object model file.
   * @return a instance of the parser.
   * @throws IOException if an I/O error occurs
   */
  public static PhoenixParserImpl getInstance(final File file) throws IOException {
    final var moduleCode = ModuleCode.ERR_M2900;

    try {
      final var lexer = new PhoenixLexer(CharStreams.fromFileName(file.getCanonicalPath()));
      lexer.removeErrorListeners();
      lexer.addErrorListener(new ProxyErrorListenerImpl(lexer.getErrorListeners()));

      return new PhoenixParserImpl(new CommonTokenStream(lexer));
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (PhoenixParserImpl.logger.isDebugEnabled()) {
        PhoenixParserImpl.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  /**
   * Creates an instance.
   *
   * @param input An {@link IntStream} whose symbols are {@link Token} instances.
   */
  public PhoenixParserImpl(final TokenStream input) {
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
    final PhoenixParserListener phoenixParserListener = new PhoenixParserListenerImpl();

    this.removeParseListeners();
    this.addParseListener(phoenixParserListener);
    this.phoenix_file();

    return phoenixParserListener.getRootContext();
  }
}
