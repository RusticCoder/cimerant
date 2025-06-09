package cimerant.antlr.sql;

import java.util.BitSet;
import java.util.Collection;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ProxyErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

/**
 * This implementation of {@link ANTLRErrorListener} dispatches all calls to a collection of
 * delegate listeners. This reduces the effort required to support multiple listeners.
 */
public class ProxyErrorListenerImpl extends ProxyErrorListener {
  /**
   * The number of syntax errors reported during parsing. This value is incremented each time {@link
   * Parser#notifyErrorListeners} is called.
   */
  protected int syntaxErrors = 0;

  /**
   * Creates an instance.
   *
   * @param delegates Upon syntax error, notify any interested parties.
   */
  public ProxyErrorListenerImpl(final Collection<? extends ANTLRErrorListener> delegates) {
    super(delegates);
  }

  /**
   * Gets the number of syntax errors reported during parsing. This value is incremented each time
   * {@link Parser#notifyErrorListeners} is called.
   *
   * @return number of syntax errors
   * @see Parser#notifyErrorListeners
   */
  public int getNumberOfSyntaxErrors() {
    return this.syntaxErrors;
  }

  @Override
  public void reportAmbiguity(
      final Parser recognizer,
      final DFA dfa,
      final int startIndex,
      final int stopIndex,
      final boolean exact,
      final BitSet ambigAlts,
      final ATNConfigSet configs) {
    try {
      super.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs);
    } catch (final Throwable t) {
      ++this.syntaxErrors;
    }
  }

  @Override
  public void reportAttemptingFullContext(
      final Parser recognizer,
      final DFA dfa,
      final int startIndex,
      final int stopIndex,
      final BitSet conflictingAlts,
      final ATNConfigSet configs) {
    try {
      super.reportAttemptingFullContext(
          recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs);
    } catch (final Throwable t) {
      ++this.syntaxErrors;
    }
  }

  @Override
  public void reportContextSensitivity(
      final Parser recognizer,
      final DFA dfa,
      final int startIndex,
      final int stopIndex,
      final int prediction,
      final ATNConfigSet configs) {
    try {
      super.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex, prediction, configs);
    } catch (final Throwable t) {
      ++this.syntaxErrors;
    }
  }

  @Override
  public void syntaxError(
      final Recognizer<?, ?> recognizer,
      final Object offendingSymbol,
      final int line,
      final int charPositionInLine,
      final String msg,
      final RecognitionException e) {
    try {
      super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
    } catch (final Throwable t) {
      ++this.syntaxErrors;
    }
  }
}
