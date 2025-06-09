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

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import sql.postgresql.PostgreSQLLexer;
import sql.postgresql.PostgreSQLParser;

public abstract class PostgreSQLParserBase extends Parser {

  public PostgreSQLParserBase(final TokenStream input) {
    super(input);
  }

  ParserRuleContext GetParsedSqlTree(final String script, final int line) {
    final var ph = this.getPostgreSQLParser(script);
    return ph.root();
  }

  public PostgreSQLParser getPostgreSQLParser(final String script) {
    final CharStream charStream = CharStreams.fromString(script);
    final Lexer lexer = new PostgreSQLLexer(charStream);
    final var tokens = new CommonTokenStream(lexer);
    final var parser = new PostgreSQLParser(tokens);
    lexer.removeErrorListeners();
    parser.removeErrorListeners();
    final var listener_lexer =
        new LexerDispatchingErrorListener(
            (Lexer) ((CommonTokenStream) this.getInputStream()).getTokenSource());
    final var listener_parser = new ParserDispatchingErrorListener(this);
    lexer.addErrorListener(listener_lexer);
    parser.addErrorListener(listener_parser);
    return parser;
  }

  public String GetRoutineBodyString(final PostgreSQLParser.SconstContext rule) {
    final var anysconst = rule.anysconst();
    final var StringConstant = anysconst.StringConstant();
    if (null != StringConstant) {
      return this.unquote(this.TrimQuotes(StringConstant.getText()));
    }
    final var UnicodeEscapeStringConstant = anysconst.UnicodeEscapeStringConstant();
    if (null != UnicodeEscapeStringConstant) {
      return this.TrimQuotes(UnicodeEscapeStringConstant.getText());
    }
    final var EscapeStringConstant = anysconst.EscapeStringConstant();
    if (null != EscapeStringConstant) {
      return this.TrimQuotes(EscapeStringConstant.getText());
    }
    var result = new StringBuilder();
    final var dollartext = anysconst.DollarText();
    for (final org.antlr.v4.runtime.tree.TerminalNode s : dollartext) {
      result.append(s.getText());
    }
    return result.toString();
  }

  public void ParseRoutineBody(final PostgreSQLParser.Createfunc_opt_listContext _localctx) {
    String lang = null;
    for (final PostgreSQLParser.Createfunc_opt_itemContext coi : _localctx.createfunc_opt_item()) {
      if (coi.LANGUAGE() != null && coi.nonreservedword_or_sconst() != null) {
        if (coi.nonreservedword_or_sconst().nonreservedword() != null) {
          if (coi.nonreservedword_or_sconst().nonreservedword().identifier() != null) {
            if (coi.nonreservedword_or_sconst().nonreservedword().identifier().Identifier()
                != null) {
              lang =
                  coi.nonreservedword_or_sconst()
                      .nonreservedword()
                      .identifier()
                      .Identifier()
                      .getText();
              break;
            }
          }
        }
      }
    }
    if (null == lang) {
      return;
    }
    PostgreSQLParser.Createfunc_opt_itemContext func_as = null;
    for (final PostgreSQLParser.Createfunc_opt_itemContext a : _localctx.createfunc_opt_item()) {
      if (a.func_as() != null) {
        func_as = a;
        break;
      }
    }
    if (func_as != null) {
      final var txt = this.GetRoutineBodyString(func_as.func_as().sconst(0));
      final var ph = this.getPostgreSQLParser(txt);
      switch (lang) {
        case "plpgsql":
          func_as.func_as().Definition = ph.plsqlroot();
          break;
        case "sql":
          func_as.func_as().Definition = ph.root();
          break;
      }
    }
  }

  private String TrimQuotes(final String s) {
    return s == null || s.isEmpty() ? s : s.substring(1, s.length() - 1);
  }

  public String unquote(final String s) {
    final var slength = s.length();
    final var r = new StringBuilder(slength);
    var i = 0;
    while (i < slength) {
      final Character c = s.charAt(i);
      r.append(c);
      if (c == '\'' && i < slength - 1 && s.charAt(i + 1) == '\'') {
        i++;
      }
      i++;
    }
    return r.toString();
  }
}
