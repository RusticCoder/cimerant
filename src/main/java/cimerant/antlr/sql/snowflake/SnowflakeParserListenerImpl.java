package cimerant.antlr.sql.snowflake;

import cimerant.antlr.sql.ParseTreeHelper;
import cimerant.antlr.sql.ParseTreeStream;
import cimerant.context.NotNullSet;
import cimerant.context.cimerant.ObjectField;
import cimerant.context.cimerant.ObjectRelationship;
import cimerant.context.sql.SqlContext;
import cimerant.context.sql.SqlRootContext;
import cimerant.context.sql.impl.SqlContextImpl;
import cimerant.context.sql.impl.SqlContextImpl.Field;
import cimerant.context.sql.impl.SqlRootContextImpl;
import cimerant.logger.CimerantLogger;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Strings;
import org.apache.commons.lang3.mutable.MutableBoolean;
import sql.snowflake.SnowflakeParser;
import sql.snowflake.SnowflakeParserListener;

/**
 * This class provides an empty implementation of {@link SnowflakeParserListener}, which can be
 * extended to create a listener which only needs to handle a subset of the available methods.
 */
public class SnowflakeParserListenerImpl extends SnowflakeParserListenerBase {
  private static CharStream input;
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(SnowflakeParserListenerImpl.class.getName());
  }

  private static void traceChildren(final String methodName, final ParseTree ctx) {
    if (SnowflakeParserListenerImpl.logger.isTraceEnabled()) {
      ParseTreeHelper.printChildren(methodName, ctx);
    }
  }

  private SqlRootContext rootContext = null;

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_decl_item(final SnowflakeParser.Column_decl_itemContext ctx) {
    final var methodName = "exitColumn_decl_item";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    final var fullColDeclChildrenList =
        ParseTreeStream.parseTreeStream(ctx)
            .listChildrenByClass(SnowflakeParser.Full_col_declContext.class);

    ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
        .streamChildrenByClass(SnowflakeParser.Col_declContext.class)
        .streamChildrenByClass(SnowflakeParser.Data_typeContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              final var terminalNodeTextList =
                  ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
                      .streamChildrenByClass(SnowflakeParser.Col_declContext.class)
                      .streamChildrenByClass(SnowflakeParser.Data_typeContext.class)
                      .streamChildrenByClass(SnowflakeParser.NumContext.class)
                      .listAllTerminalNodeText();
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!Strings.CI.equals(
                    currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
                terminalNodeTextList.forEach(
                    text -> {
                      if (!currentField.containsKey(Field.PRECISION)) {
                        currentField.put(Field.PRECISION, NotNullSet.getInstance(text));
                      } else if (!currentField.containsKey(Field.SCALE)) {
                        currentField.put(Field.SCALE, NotNullSet.getInstance(text));
                      }
                    });
              }
            });
    ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
        .streamTextByClass(SnowflakeParserListenerImpl.input, SnowflakeParser.StringContext.class)
        .map(ParseTreeHelper::trimSingleQuote)
        .filter(StringUtils::isNoneBlank)
        .forEach(
            intervalText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.COMMENT, NotNullSet.getInstance(intervalText));
              }
            });
    ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
        .streamChildrenByClass(SnowflakeParser.CollateContext.class)
        .streamChildrenByClass(SnowflakeParser.StringContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.COLLATION_NAME, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SnowflakeParser.Out_of_line_constraintContext.class)
        .streamChildrenByClass(SnowflakeParser.Common_constraint_propertiesContext.class)
        .streamChildrenByClass(SnowflakeParser.Deferrable_not_deferrableContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("DEFERRABLE", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.DEFERRABLE, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
        .streamChildrenByClass(SnowflakeParser.Default_valueContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("AUTOINCREMENT", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.AUTO_INCREMENT, NotNullSet.getInstance(Boolean.TRUE));
                }
              } else if (Strings.CI.equals("IDENTITY", terminalNodeText)) {
                final var terminalNodeTextList =
                    ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
                        .streamChildrenByClass(SnowflakeParser.Default_valueContext.class)
                        .streamChildrenByClass(SnowflakeParser.NumContext.class)
                        .listAllTerminalNodeText();

                for (final var currentField : currentFieldList) {
                  currentField.put(Field.IDENTITY, NotNullSet.getInstance(Boolean.TRUE));
                  terminalNodeTextList.forEach(
                      text -> {
                        if (!currentField.containsKey(Field.SEED)) {
                          currentField.put(Field.SEED, NotNullSet.getInstance(text));
                        } else if (!currentField.containsKey(Field.INCREMENT)) {
                          currentField.put(Field.INCREMENT, NotNullSet.getInstance(text));
                        }
                      });
                }
              }
            });
    ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
        .streamChildrenByClass(SnowflakeParser.Default_valueContext.class)
        .streamTextByClass(SnowflakeParserListenerImpl.input, SnowflakeParser.ExprContext.class)
        .map(ParseTreeHelper::trimParentheses)
        .forEach(
            intervalText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.DEFAULT, NotNullSet.getInstance(intervalText));
              }
            });
    ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
        .streamChildrenByClass(SnowflakeParser.Col_declContext.class)
        .streamChildrenByClass(SnowflakeParser.Data_typeContext.class)
        .streamChildrenByClass(SnowflakeParser.Data_type_sizeContext.class)
        .streamChildrenByClass(SnowflakeParser.NumContext.class)
        .listAllTerminalNodeText()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.MAX_SIZE)) {
                  currentField.put(Field.MAX_SIZE, NotNullSet.getInstance(terminalNodeText));
                } else if (!Strings.CI.equals(
                    currentField.get(Field.MAX_SIZE).toString(), terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });

    final var nullableText =
        ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
            .streamChildrenByClass(SnowflakeParser.Null_not_nullContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    for (final var currentField : currentFieldList) {
      if (nullableText.contains("NOT NULL")) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
      } else if ("NULL".equals(nullableText)) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }

    var primaryKeyText =
        ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
            .streamChildrenByClass(SnowflakeParser.Inline_constraintContext.class)
            .streamChildrenByClass(SnowflakeParser.Primary_keyContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    primaryKeyText += " ";
    primaryKeyText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SnowflakeParser.Out_of_line_constraintContext.class)
            .streamChildrenByClass(SnowflakeParser.Primary_keyContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    for (final var currentField : currentFieldList) {
      if (primaryKeyText.contains("PRIMARY KEY")) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    }

    var uniqueKeyText =
        ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
            .streamChildrenByClass(SnowflakeParser.Inline_constraintContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    uniqueKeyText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SnowflakeParser.Out_of_line_constraintContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));

    for (final var currentField : currentFieldList) {
      if (Strings.CI.equals("UNIQUE", uniqueKeyText)
          || Strings.CI.equals("CONSTRAINT UNIQUE", uniqueKeyText)) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }

    final var foreignText =
        new StringBuilder()
            .append(
                ParseTreeStream.parseTreeStream(fullColDeclChildrenList)
                    .streamChildrenByClass(SnowflakeParser.Inline_constraintContext.class)
                    .streamChildrenByClass(SnowflakeParser.Foreign_keyContext.class)
                    .streamTerminalNodeString()
                    .map(StringUtils::upperCase)
                    .collect(Collectors.joining(" ")));
    foreignText.append(" ");
    foreignText.append(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SnowflakeParser.Out_of_line_constraintContext.class)
            .streamChildrenByClass(SnowflakeParser.Foreign_keyContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" ")));
    if (foreignText.toString().contains("FOREIGN KEY")) {
      final var currentRelationship = this.getCurrentRelationship(ctx);
      if (currentRelationship != null) {
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SnowflakeParser.Full_col_declContext.class)
            .streamChildrenByClass(SnowflakeParser.Inline_constraintContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .listAllTerminalNodeText()
            .forEach(
                terminalNodeText ->
                    currentRelationship.put(
                        "foreignTable", NotNullSet.getInstance(terminalNodeText)));
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SnowflakeParser.Out_of_line_constraintContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .listAllTerminalNodeText()
            .forEach(
                terminalNodeText ->
                    currentRelationship.put(
                        "foreignTable", NotNullSet.getInstance(terminalNodeText)));
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SnowflakeParser.Full_col_declContext.class)
            .streamChildrenByClass(SnowflakeParser.Inline_constraintContext.class)
            .streamChildrenByClass(SnowflakeParser.Column_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .listAllTerminalNodeText()
            .forEach(
                terminalNodeText -> {
                  final Set<String> inheritsList;
                  if (currentRelationship.get("foreignColumn") instanceof Set) {
                    inheritsList = (Set<String>) currentRelationship.get("foreignColumn");
                  } else {
                    inheritsList = new LinkedHashSet<>();
                  }
                  inheritsList.add(terminalNodeText);

                  currentRelationship.put("foreignColumn", NotNullSet.getInstance(inheritsList));
                });
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SnowflakeParser.Full_col_declContext.class)
            .streamChildrenByClass(SnowflakeParser.Col_declContext.class)
            .streamChildrenByClass(SnowflakeParser.Column_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .listAllTerminalNodeText()
            .forEach(
                terminalNodeText -> {
                  final Set<String> inheritsList;
                  if (currentRelationship.get("column") instanceof Set) {
                    inheritsList = (Set<String>) currentRelationship.get("column");
                  } else {
                    inheritsList = new LinkedHashSet<>();
                  }
                  inheritsList.add(terminalNodeText);

                  currentRelationship.put("column", NotNullSet.getInstance(inheritsList));
                });
        final var referencesFound = new MutableBoolean(false);
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SnowflakeParser.Out_of_line_constraintContext.class)
            .forEach(
                outOfLineConstraintChild -> {
                  if (outOfLineConstraintChild instanceof TerminalNodeImpl
                      && Strings.CI.equals("REFERENCES", outOfLineConstraintChild.getText())) {
                    referencesFound.setTrue();
                  } else if (outOfLineConstraintChild
                      instanceof
                      final SnowflakeParser.Column_list_in_parenthesesContext
                              columnListInParenthesesContext) {
                    ParseTreeStream.parseTreeStream(columnListInParenthesesContext)
                        .streamChildrenByClass(SnowflakeParser.Column_listContext.class)
                        .streamChildrenByClass(SnowflakeParser.Column_nameContext.class)
                        .streamChildrenByClass(SnowflakeParser.Id_Context.class)
                        .listAllTerminalNodeText()
                        .forEach(
                            terminalNodeText -> {
                              if (!referencesFound.get()) {
                                final Set<String> inheritsList;
                                if (currentRelationship.get("column") instanceof Set) {
                                  inheritsList = (Set<String>) currentRelationship.get("column");
                                } else {
                                  inheritsList = new LinkedHashSet<>();
                                }
                                inheritsList.add(terminalNodeText);

                                currentRelationship.put(
                                    "column", NotNullSet.getInstance(inheritsList));
                              } else {
                                final Set<String> inheritsList;
                                if (currentRelationship.get("foreignColumn") instanceof Set) {
                                  inheritsList =
                                      (Set<String>) currentRelationship.get("foreignColumn");
                                } else {
                                  inheritsList = new LinkedHashSet<>();
                                }
                                inheritsList.add(terminalNodeText);

                                currentRelationship.put(
                                    "foreignColumn", NotNullSet.getInstance(inheritsList));
                              }
                            });
                  }
                });
      }
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_command(final SnowflakeParser.Create_commandContext ctx) {
    final var methodName = "exitCreate_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final Set<String> fieldsToRemove = new TreeSet<>();
    for (final var field : currentTable.getFields().entrySet()) {
      if (!field.getValue().containsKey(Field.FIELD_TYPE)
          || Strings.CI.equals("CONSTRAINT", field.getKey())) {
        fieldsToRemove.add(field.getKey());
      }
    }
    for (final var field : fieldsToRemove) {
      currentTable.getFields().remove(field);
    }
    final Set<String> relationshipsToRemove = new TreeSet<>();
    for (final var relationship : currentTable.getRelationships().entrySet()) {
      if (!relationship.getValue().containsKey("column")
          || !relationship.getValue().containsKey("foreignTable")) {
        relationshipsToRemove.add(relationship.getKey());
      }
    }
    for (final var relationship : relationshipsToRemove) {
      currentTable.getRelationships().remove(relationship);
    }

    if (!currentTable.getFields().isEmpty() || !currentTable.getAttributes().isEmpty()) {
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
          .streamChildrenByClass(SnowflakeParser.Table_typeContext.class)
          .streamChildrenByClass(SnowflakeParser.TemporaryContext.class)
          .streamTerminalNodeString()
          .map(StringUtils::upperCase)
          .forEach(
              terminalNodeText -> {
                if (Strings.CI.equals("TEMPORARY", terminalNodeText)
                    || Strings.CI.equals("TEMP", terminalNodeText)) {
                  currentTable
                      .getAttributes()
                      .put(SqlContextImpl.TEMP, NotNullSet.getInstance(Boolean.TRUE));
                }
              });

      this.getRootContext().addObject(currentTable);
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_external_table(final SnowflakeParser.Create_external_tableContext ctx) {
    final var methodName = "exitCreate_external_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    currentTable.getAttributes().put(SqlContextImpl.EXTERNAL, NotNullSet.getInstance(Boolean.TRUE));

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SnowflakeParser.External_table_column_decl_listContext.class)
        .streamChildrenByClass(SnowflakeParser.External_table_column_declContext.class)
        .streamChildrenByClass(SnowflakeParser.Data_typeContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!Strings.CI.equals(
                    currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SnowflakeParser.External_table_column_decl_listContext.class)
        .streamChildrenByClass(SnowflakeParser.External_table_column_declContext.class)
        .streamChildrenByClass(SnowflakeParser.Data_typeContext.class)
        .streamChildrenByClass(SnowflakeParser.Data_type_sizeContext.class)
        .streamChildrenByClass(SnowflakeParser.NumContext.class)
        .listAllTerminalNodeText()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.MAX_SIZE)) {
                  currentField.put(Field.MAX_SIZE, NotNullSet.getInstance(terminalNodeText));
                } else if (!Strings.CI.equals(
                    currentField.get(Field.MAX_SIZE).toString(), terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_table_clause(final SnowflakeParser.Create_table_clauseContext ctx) {
    final var methodName = "exitCreate_table_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SnowflakeParser.Comment_clauseContext.class)
        .streamTextByClass(SnowflakeParserListenerImpl.input, SnowflakeParser.StringContext.class)
        .map(ParseTreeHelper::trimSingleQuote)
        .filter(StringUtils::isNoneBlank)
        .forEach(
            intervalText -> {
              currentTable
                  .getAttributes()
                  .put(SqlContextImpl.COMMENT, NotNullSet.getInstance(intervalText));
            });
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_table_like(final SnowflakeParser.Create_table_likeContext ctx) {
    final var methodName = "exitCreate_table_like";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var terminalNodeTextList =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamTerminalNodeString()
            .filter(
                terminalNodeText ->
                    !Strings.CI.equals(currentTable.getObjectName(), terminalNodeText))
            .collect(Collectors.toSet());

    if (!terminalNodeTextList.isEmpty()) {
      final Set<String> inheritsList;
      if (currentTable.getAttributes().get(SqlContextImpl.LIKE) instanceof Set) {
        inheritsList = (Set<String>) currentTable.getAttributes().get(SqlContextImpl.LIKE);
      } else {
        inheritsList = new TreeSet<>();
      }
      inheritsList.addAll(terminalNodeTextList);

      currentTable.getAttributes().put(SqlContextImpl.LIKE, NotNullSet.getInstance(inheritsList));
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimary_key(final SnowflakeParser.Primary_keyContext ctx) {
    final var methodName = "exitPrimary_key";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);

    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    final var fieldTypeText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    for (final var currentField : currentFieldList) {
      if (fieldTypeText.contains("PRIMARY KEY")) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
  }

  private List<ObjectField> getCurrentFieldList(final ParserRuleContext ctx) {
    final var methodName = "getCurrentFieldList";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var terminalNode = new ArrayList<ParseTree>();

    var parentContext =
        ParseTreeHelper.getParentContext(ctx, SnowflakeParser.Column_decl_itemContext.class);
    if (parentContext != null && parentContext.children != null) {
      final var idChildrenList =
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SnowflakeParser.Full_col_declContext.class)
              .streamChildrenByClass(SnowflakeParser.Col_declContext.class)
              .streamChildrenByClass(SnowflakeParser.Column_nameContext.class)
              .listChildrenByClass(SnowflakeParser.Id_Context.class);

      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(idChildrenList)
              .filter(TerminalNode.class::isInstance)
              .toList());
      if (1 < terminalNode.size()
          && Strings.CI.equals(terminalNode.get(0).getText(), currentTable.getObjectName())) {
        terminalNode.remove(0);
      }

      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SnowflakeParser.Out_of_line_constraintContext.class)
              .streamChildrenByClass(SnowflakeParser.Column_list_in_parenthesesContext.class)
              .streamChildrenByClass(SnowflakeParser.Column_listContext.class)
              .streamChildrenByClass(SnowflakeParser.Column_nameContext.class)
              .streamChildrenByClass(SnowflakeParser.Id_Context.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SnowflakeParser.Out_of_line_constraintContext.class)
              .streamChildrenByClass(SnowflakeParser.Column_list_in_parenthesesContext.class)
              .streamChildrenByClass(SnowflakeParser.Column_listContext.class)
              .streamChildrenByClass(SnowflakeParser.Column_nameContext.class)
              .streamChildrenByClass(SnowflakeParser.Id_Context.class)
              .streamChildrenByClass(SnowflakeParser.Non_reserved_wordsContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(idChildrenList)
              .streamChildrenByClass(SnowflakeParser.Binary_builtin_functionContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(idChildrenList)
              .streamChildrenByClass(SnowflakeParser.Builtin_functionContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(idChildrenList)
              .streamChildrenByClass(SnowflakeParser.Data_typeContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(idChildrenList)
              .streamChildrenByClass(SnowflakeParser.KeywordContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(idChildrenList)
              .streamChildrenByClass(SnowflakeParser.Non_reserved_wordsContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(idChildrenList)
              .streamChildrenByClass(SnowflakeParser.Object_type_pluralContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(idChildrenList)
              .streamChildrenByClass(SnowflakeParser.Ternary_builtin_functionContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
    }

    parentContext =
        ParseTreeHelper.getParentContext(ctx, SnowflakeParser.Create_external_tableContext.class);
    if (parentContext != null && parentContext.children != null) {
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SnowflakeParser.External_table_column_decl_listContext.class)
              .streamChildrenByClass(SnowflakeParser.External_table_column_declContext.class)
              .streamChildrenByClass(SnowflakeParser.Column_nameContext.class)
              .streamChildrenByClass(SnowflakeParser.Id_Context.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
    }

    return terminalNode.stream()
        .map(child -> ParseTreeHelper.getField(currentTable, child))
        .collect(Collectors.toList());
  }

  private ObjectRelationship getCurrentRelationship(final ParserRuleContext ctx) {
    final var methodName = "getCurrentRelationshipList";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    var allTerminalNodeTextList = (ParseTreeStream.parseTreeStream(ctx).listAllTerminalNodeText());
    final int constraintIndex =
        IntStream.range(0, allTerminalNodeTextList.size())
            .filter(i -> "CONSTRAINT".equalsIgnoreCase(allTerminalNodeTextList.get(i)))
            .findFirst()
            .orElse(-1);
    final int foreignIndex =
        IntStream.range(0, allTerminalNodeTextList.size())
            .filter(i -> "FOREIGN".equalsIgnoreCase(allTerminalNodeTextList.get(i)))
            .findFirst()
            .orElse(-1);
    if (-1 < constraintIndex && constraintIndex + 1 < foreignIndex) {
      return ParseTreeHelper.getRelationship(
          currentTable,
          String.join("_", allTerminalNodeTextList.subList(constraintIndex + 1, foreignIndex)));
    } else {
      final int keyIndex =
          IntStream.range(0, allTerminalNodeTextList.size())
              .filter(i -> "KEY".equalsIgnoreCase(allTerminalNodeTextList.get(i)))
              .findFirst()
              .orElse(-1);
      final int referencesIndex =
          IntStream.range(0, allTerminalNodeTextList.size())
              .filter(i -> "REFERENCES".equalsIgnoreCase(allTerminalNodeTextList.get(i)))
              .findFirst()
              .orElse(-1);
      if (-1 < keyIndex && keyIndex + 1 < referencesIndex) {
        return ParseTreeHelper.getRelationship(
            currentTable,
            String.join("_", allTerminalNodeTextList.subList(keyIndex + 1, referencesIndex)));
      } else if (constraintIndex + 1 < foreignIndex) {
        return ParseTreeHelper.getRelationship(
            currentTable,
            String.join(
                "_", allTerminalNodeTextList.subList(constraintIndex + 1, constraintIndex + 2)));
      }
    }
    return null;
  }

  private SqlContext getCurrentTable(final ParserRuleContext ctx) {
    final var methodName = "getCurrentTable";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, SnowflakeParser.Create_commandContext.class);
    if (parentContext == null || parentContext.children == null) {
      return null;
    }

    final List<String> terminalNodeTextList =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamTerminalNodeString()
            .collect(Collectors.toList());

    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamChildrenByClass(SnowflakeParser.Non_reserved_wordsContext.class)
            .streamTerminalNodeString()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_dynamic_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamTerminalNodeString()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_event_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamTerminalNodeString()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_external_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamTerminalNodeString()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_table_as_selectContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamTerminalNodeString()
            .toList());

    final var ongoing = new MutableBoolean(true);
    ParseTreeStream.parseTreeStream(parentContext)
        .streamChildrenByClass(SnowflakeParser.Create_table_likeContext.class)
        .forEach(
            createTableLikeChild -> {
              if (createTableLikeChild instanceof TerminalNodeImpl
                  && Strings.CI.equals("LIKE", createTableLikeChild.getText())) {
                ongoing.setFalse();
              } else if (createTableLikeChild instanceof SnowflakeParser.Object_nameContext
                  && ongoing.get()) {
                terminalNodeTextList.addAll(
                    ParseTreeStream.parseTreeStream(
                            (SnowflakeParser.Object_nameContext) createTableLikeChild)
                        .streamChildrenByClass(SnowflakeParser.Id_Context.class)
                        .streamTerminalNodeString()
                        .toList());
              }
            });

    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamTerminalNodeString()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamChildrenByClass(SnowflakeParser.Builtin_functionContext.class)
            .streamTerminalNodeString()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamChildrenByClass(SnowflakeParser.KeywordContext.class)
            .streamTerminalNodeString()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamChildrenByClass(SnowflakeParser.Object_type_pluralContext.class)
            .streamTerminalNodeString()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamChildrenByClass(SnowflakeParser.Unary_or_binary_builtin_functionContext.class)
            .streamTerminalNodeString()
            .toList());

    return SqlContextImpl.getInstance(this.getRootContext(), terminalNodeTextList);
  }

  /**
   * {@inheritDoc}
   *
   * @return a instance of the context.
   */
  @Override
  public SqlRootContext getRootContext() {
    if (this.rootContext == null) {
      this.rootContext = new SqlRootContextImpl();
    }
    return this.rootContext;
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void visitTerminal(final TerminalNode node) {
    final var methodName = "visitTerminal";
    SnowflakeParserListenerImpl.traceChildren(methodName, node);

    SnowflakeParserListenerImpl.input = node.getSymbol().getInputStream();
  }
}
