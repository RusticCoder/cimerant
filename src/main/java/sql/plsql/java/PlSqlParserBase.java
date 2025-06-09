package sql.plsql.java;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public abstract class PlSqlParserBase extends Parser {
  private boolean _isVersion10 = true;
  private boolean _isVersion12 = true;
  public PlSqlParserBase self;

  public PlSqlParserBase(final TokenStream input) {
    super(input);
    this.self = this;
  }

  public boolean isVersion10() {
    return this._isVersion10;
  }

  public boolean isVersion12() {
    return this._isVersion12;
  }

  public void setVersion10(final boolean value) {
    this._isVersion10 = value;
  }

  public void setVersion12(final boolean value) {
    this._isVersion12 = value;
  }
}
