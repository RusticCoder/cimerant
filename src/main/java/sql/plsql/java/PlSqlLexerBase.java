package sql.plsql.java;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;

public abstract class PlSqlLexerBase extends Lexer {
  public PlSqlLexerBase self;

  public PlSqlLexerBase(final CharStream input) {
    super(input);
    this.self = this;
  }

  protected boolean IsNewlineAtPos(final int pos) {
    final var la = this._input.LA(pos);
    return la == -1 || la == '\n';
  }
}
