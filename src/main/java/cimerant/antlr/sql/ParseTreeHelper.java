package cimerant.antlr.sql;

import cimerant.context.NotNullSet;
import cimerant.context.cimerant.ObjectField;
import cimerant.context.cimerant.ObjectRelationship;
import cimerant.context.cimerant.impl.ObjectFieldImpl;
import cimerant.context.cimerant.impl.ObjectRelationshipImpl;
import cimerant.context.sql.SqlContext;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

/** Parse tree helper. */
public class ParseTreeHelper {
  /**
   * Returns a list of contexts that match the ruleContext class that was passed in.
   *
   * @param <T> the type of ruleContext.
   * @param ctx the tree of {@link RuleContext} objects created during a parse that makes the data
   *     structure look like a simple parse tree. This node represents both internal nodes, rule
   *     invocations, and leaf nodes, token matches.
   * @param ruleContext class to match and return.
   * @return a list of values that match the ruleContext class that was passed in.
   */
  public static <T extends ParserRuleContext> List<ParserRuleContext> findContext(
      final ParserRuleContext ctx, final Class<T> ruleContext) {
    final List<ParserRuleContext> returnValue = new ArrayList<>();

    if (ctx == null) {
      return returnValue;
    }

    if (ctx.getClass() == ruleContext) {
      returnValue.add(ctx);
    } else if (ctx.children != null && !ctx.children.isEmpty()) {
      ctx.children.stream()
          .filter(ParserRuleContext.class::isInstance)
          .map(parserRuleContext -> (ParserRuleContext) parserRuleContext)
          .forEach(child -> returnValue.addAll(ParseTreeHelper.findContext(child, ruleContext)));
    }

    return returnValue;
  }

  /**
   * Returns the existing or creates the field associated with the table.
   *
   * @param currentTable the current table.
   * @param parseTree the field to find or create within the table.
   * @return the field associated with the table.
   */
  public static ObjectField getField(final SqlContext currentTable, final ParseTree parseTree) {
    ObjectField returnValue = null;

    final var text = ParseTreeHelper.trimToken(parseTree.getText());
    if (StringUtils.isNoneBlank(text)) {
      if (currentTable.getFields().containsKey(text)) {
        returnValue = currentTable.getFields().get(text);
      } else {
        currentTable.getFields().put(text, new ObjectFieldImpl());
        returnValue = ParseTreeHelper.getField(currentTable, parseTree);
        returnValue.put("cimerant:type", NotNullSet.getInstance("field"));
      }
    }

    return returnValue;
  }

  /**
   * Returns a list of terminalNode values from the parent path leading to the parser rule object
   * matches the expected path.
   *
   * @param <T> the type of ruleContext.
   * @param ctx the tree of {@link RuleContext} objects created during a parse that makes the data
   *     structure look like a simple parse tree. This node represents both internal nodes, rule
   *     invocations, and leaf nodes, token matches.
   * @param ruleContext class to match and return.
   * @return a list of terminalNode values.
   */
  public static <T extends ParserRuleContext> ParserRuleContext getParentContext(
      final ParserRuleContext ctx, final Class<T> ruleContext) {
    var returnValue = ctx;

    while (returnValue != null) {
      if (returnValue.getClass() == ruleContext) {
        return returnValue;
      }
      returnValue = returnValue.getParent();
    }

    return returnValue;
  }

  /**
   * Returns the existing or creates the relationship associated with the table.
   *
   * @param currentTable the current table.
   * @param parseTree the relationship to find or create within the table.
   * @return the relationship associated with the table.
   */
  public static ObjectRelationship getRelationship(
      final SqlContext currentTable, final ParseTree parseTree) {
    ObjectRelationship returnValue = null;

    final var text = ParseTreeHelper.trimToken(parseTree.getText());
    if (StringUtils.isNoneBlank(text)) {
      if (currentTable.getRelationships().containsKey(text)) {
        returnValue = currentTable.getRelationships().get(text);
      } else {
        currentTable.getRelationships().put(text, new ObjectRelationshipImpl());
        returnValue = ParseTreeHelper.getRelationship(currentTable, parseTree);
        returnValue.put("cimerant:type", NotNullSet.getInstance("relationship"));
      }
    }

    return returnValue;
  }

  /**
   * Return the combined text of all child nodes.
   *
   * @param input A source of characters for an ANTLR lexer.
   * @param parserRuleContext A rule invocation record for parsing.
   * @return the combined text of all child nodes.
   */
  public static String getText(final CharStream input, final ParserRuleContext parserRuleContext) {
    if (input != null && parserRuleContext != null) {
      try {
        return StringUtils.trimToNull(
            input.getText(
                new Interval(
                    parserRuleContext.start.getStartIndex(),
                    parserRuleContext.stop.getStopIndex())));
      } catch (final Exception e) {
        return StringUtils.trimToNull(parserRuleContext.getText());
      }
    }
    return null;
  }

  /**
   * Returns {@code true} if the parent path leading to the parser rule object matches the expected
   * path.
   *
   * @param ctx the tree of {@link RuleContext} objects created during a parse that makes the data
   *     structure look like a simple parse tree. This node represents both internal nodes, rule
   *     invocations, and leaf nodes, token matches.
   * @param args the expected path.
   * @return if the parent path matches the expected path.
   */
  public static boolean isParentPath(final ParserRuleContext ctx, final Class<?>... args) {
    return ParseTreeHelper.isParentPath(ctx, args.length - 1, args);
  }

  private static boolean isParentPath(
      final ParserRuleContext ctx, final int length, final Class<?>... args) {
    if (ctx != null && ctx.getParent() != null) {
      if (0 == length) {
        return args[length].isInstance(ctx.getParent());
      }
      if (0 < length && args[length].isInstance(ctx.getParent())) {
        return ParseTreeHelper.isParentPath(ctx.getParent(), length - 1, args);
      }
    }
    return false;
  }

  /**
   * Used for debugging development, returning the children associated with the parser rule object.
   *
   * @param methodName the calling method.
   * @param ctx the tree of {@link RuleContext} objects created during a parse that makes the data
   *     structure look like a simple parse tree. This node represents both internal nodes, rule
   *     invocations, and leaf nodes, token matches.
   */
  public static void printChildren(final String methodName, final ParseTree ctx) {
    if (StringUtils.isNoneBlank(ParseTreeHelper.trimToken(ctx.getText()))) {
      if (0 < ctx.getChildCount()) {
        for (var i = 0; i < ctx.getChildCount(); ++i) {
          ParseTreeHelper.printChildren(
              methodName + ": " + ctx.getClass().getSimpleName(), ctx.getChild(i));
        }
      } else {
        System.out.println(
            methodName + ": " + ctx.getClass().getSimpleName() + ": " + ctx.getText());
      }
    }
  }

  /**
   * Used for debugging development, returning the parent path associated with the parser rule
   * object.
   *
   * @param methodName the calling method.
   * @param ctx the tree of {@link RuleContext} objects created during a parse that makes the data
   *     structure look like a simple parse tree. This node represents both internal nodes, rule
   *     invocations, and leaf nodes, token matches.
   */
  public static void printParents(final String methodName, final ParseTree ctx) {
    final var printString = methodName + ": " + ParseTreeHelper.privatePrintParents("", ctx);
    System.out.println(StringUtils.substring(printString, 0, printString.length() - 2));
  }

  private static String privatePrintParents(final String returnString, final ParseTree ctx) {
    if (ctx.getParent() != null) {
      return ParseTreeHelper.privatePrintParents(
          ctx.getParent().getClass().getSimpleName() + ": " + returnString, ctx.getParent());
    }
    return returnString;
  }

  /**
   * Removes square brackets from both ends of this String returning an empty String ("") if the
   * String is empty ("") after the trim or if it is {@code null}.
   *
   * @param text the String to be trimmed, may be null
   * @return the trimmed String, or an empty String if {@code null} input
   */
  public static String trimBracket(String text) {
    text = StringUtils.trimToEmpty(text);
    final var firstCharacter = text.charAt(0);
    final var lastCharacter = text.charAt(text.length() - 1);
    if (firstCharacter == '[' && lastCharacter == ']') {
      text = text.substring(1, text.length() - 1);
    }

    return text;
  }

  /**
   * Removes parentheses from both ends of this String returning an empty String ("") if the String
   * is empty ("") after the trim or if it is {@code null}.
   *
   * @param text the String to be trimmed, may be null
   * @return the trimmed String, or an empty String if {@code null} input
   */
  public static String trimParentheses(String text) {
    text = StringUtils.trimToEmpty(text);
    final var firstCharacter = text.charAt(0);
    final var lastCharacter = text.charAt(text.length() - 1);
    if (firstCharacter == '(' && lastCharacter == ')') {
      text = text.substring(1, text.length() - 1);
    }

    return text;
  }

  /**
   * Removes single quote from both ends of this String returning an empty String ("") if the String
   * is empty ("") after the trim or if it is {@code null}.
   *
   * @param text the String to be trimmed, may be null
   * @return the trimmed String, or an empty String if {@code null} input
   */
  public static String trimSingleQuote(String text) {
    text = StringUtils.trimToEmpty(text);
    final var firstCharacter = text.charAt(0);
    final var lastCharacter = text.charAt(text.length() - 1);
    if (firstCharacter == '\'' && lastCharacter == '\'') {
      text = text.substring(1, text.length() - 1);
    }

    return text;
  }

  /**
   * Strip undesired characters from the start and end of a String.
   *
   * @param str the String to remove characters from, may be null.
   * @return the stripped String, {@code null} if null String input.
   */
  public static String trimToken(final String str) {
    return StringUtils.trimToNull(StringUtils.strip(str, " '\"[].`(),=;"));
  }

  private ParseTreeHelper() {}
}
