/*
 * PostgreSQL grammar. The MIT License (MIT). Copyright (c) 2021-2023, Oleksii Kovalov
 * (Oleksii.Kovalov@outlook.com). Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons
 * to whom the Software is furnished to do so, subject to the following conditions: The above
 * copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software. THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package sql.postgresql.java;

import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ProxyErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class LexerDispatchingErrorListener implements ANTLRErrorListener {
  Lexer _parent;

  public LexerDispatchingErrorListener(final Lexer parent) {
    this._parent = parent;
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
    final var foo = new ProxyErrorListener(this._parent.getErrorListeners());
    foo.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs);
  }

  @Override
  public void reportAttemptingFullContext(
      final Parser recognizer,
      final DFA dfa,
      final int startIndex,
      final int stopIndex,
      final BitSet conflictingAlts,
      final ATNConfigSet configs) {
    final var foo = new ProxyErrorListener(this._parent.getErrorListeners());
    foo.reportAttemptingFullContext(
        recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs);
  }

  @Override
  public void reportContextSensitivity(
      final Parser recognizer,
      final DFA dfa,
      final int startIndex,
      final int stopIndex,
      final int prediction,
      final ATNConfigSet configs) {
    final var foo = new ProxyErrorListener(this._parent.getErrorListeners());
    foo.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex, prediction, configs);
  }

  @Override
  public void syntaxError(
      final Recognizer<?, ?> recognizer,
      final Object offendingSymbol,
      final int line,
      final int charPositionInLine,
      final String msg,
      final RecognitionException e) {
    final var foo = new ProxyErrorListener(this._parent.getErrorListeners());
    foo.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
  }
}
