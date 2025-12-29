package cimerant.antlr.sql.hive.v4;

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
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Strings;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import sql.hive.v4.HiveParser;
import sql.hive.v4.HiveParserListener;

/**
 * This class provides an empty implementation of {@link HiveParserListener}, which can be extended
 * to create a listener which only needs to handle a subset of the available methods.
 */
public class HiveParserListenerImpl extends HiveParserListenerBase {
  private static CharStream input;
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(HiveParserListenerImpl.class.getName());
  }

  private static void traceChildren(final String methodName, final ParseTree ctx) {
    if (HiveParserListenerImpl.logger.isTraceEnabled()) {
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
  public void exitColumnNameTypeConstraint(final HiveParser.ColumnNameTypeConstraintContext ctx) {
    final var methodName = "exitColumnNameTypeConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    final var commentText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamTerminalNodeString()
            .collect(Collectors.toList());
    if (!commentText.isEmpty() && Strings.CI.equals("COMMENT", commentText.get(0))) {
      commentText.set(0, "");
      final var comment = StringUtils.trimToEmpty(String.join(" ", commentText));
      if (StringUtils.isNoneBlank(comment)) {
        for (final var currentField : currentFieldList) {
          currentField.put(Field.COMMENT, NotNullSet.getInstance(comment));
        }
      }
    }
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(HiveParser.ColTypeContext.class)
        .streamChildrenByClass(HiveParser.TypeContext.class)
        .streamChildrenByClass(HiveParser.PrimitiveTypeContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (Strings.CI.equals("PRECISION", terminalNodeText)) {
                  currentField.put(
                      Field.FIELD_TYPE,
                      NotNullSet.getInstance(
                          currentField.get(Field.FIELD_TYPE) + " " + terminalNodeText));
                } else if (NumberUtils.isCreatable(terminalNodeText)) {
                  if (!currentField.containsKey(Field.MAX_SIZE)) {
                    if (terminalNodeText.contains(".")) {
                      final var terminalNodeSplit = terminalNodeText.split("\\.", 0);
                      currentField.put(
                          Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                      currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                    } else {
                      currentField.put(Field.MAX_SIZE, NotNullSet.getInstance(terminalNodeText));
                    }
                  } else {
                    currentField.put(Field.PRECISION, currentField.get(Field.MAX_SIZE));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeText));
                    currentField.remove(Field.MAX_SIZE);
                  }
                } else if (!Strings.CI.equals(
                    currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    final var nullableText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(HiveParser.ColumnConstraintContext.class)
            .streamChildrenByClass(HiveParser.ColConstraintContext.class)
            .streamChildrenByClass(HiveParser.ColumnConstraintTypeContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (Strings.CI.equals("NOT NULL", nullableText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
      }
    }
    final var primaryKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(HiveParser.ColumnConstraintContext.class)
            .streamChildrenByClass(HiveParser.ColConstraintContext.class)
            .streamChildrenByClass(HiveParser.ColumnConstraintTypeContext.class)
            .streamChildrenByClass(HiveParser.TableConstraintTypeContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (Strings.CI.equals("PRIMARY KEY", primaryKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    } else if (Strings.CI.equals("UNIQUE", primaryKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(HiveParser.ColumnConstraintContext.class)
        .streamChildrenByClass(HiveParser.ColConstraintContext.class)
        .streamChildrenByClass(HiveParser.ColumnConstraintTypeContext.class)
        .streamTextByClass(HiveParserListenerImpl.input, HiveParser.DefaultValContext.class)
        .forEach(
            intervalText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.DEFAULT, NotNullSet.getInstance(intervalText));
              }
            });

    for (final var currentField : currentFieldList) {
      if (Strings.CI.equals("DECIMAL", Objects.toString(currentField.get(Field.FIELD_TYPE), ""))
          && currentField.containsKey(Field.MAX_SIZE)) {
        currentField.put(Field.PRECISION, currentField.get(Field.MAX_SIZE));
        currentField.remove(Field.MAX_SIZE);
      }
    }

    final var currentRelationship = this.getCurrentRelationship(ctx);
    if (currentRelationship != null) {
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(HiveParser.Id_Context.class)
          .streamTerminalNodeString()
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
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(HiveParser.ColumnConstraintContext.class)
          .streamChildrenByClass(HiveParser.ForeignKeyConstraintContext.class)
          .streamChildrenByClass(HiveParser.TableNameContext.class)
          .streamChildrenByClass(HiveParser.Id_Context.class)
          .streamTerminalNodeString()
          .forEach(
              terminalNodeText ->
                  currentRelationship.put(
                      "foreignTable", NotNullSet.getInstance(terminalNodeText)));
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(HiveParser.ColumnConstraintContext.class)
          .streamChildrenByClass(HiveParser.ForeignKeyConstraintContext.class)
          .streamChildrenByClass(HiveParser.ColumnNameContext.class)
          .streamChildrenByClass(HiveParser.Id_Context.class)
          .streamTerminalNodeString()
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
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateForeignKey(final HiveParser.CreateForeignKeyContext ctx) {
    final var methodName = "exitCreateForeignKey";
    HiveParserListenerImpl.traceChildren(methodName, ctx);

    final var foreignText =
        new StringBuilder()
            .append(
                ParseTreeStream.parseTreeStream(ctx)
                    .streamTerminalNodeString()
                    .map(StringUtils::upperCase)
                    .collect(Collectors.joining(" ")));
    if (foreignText.toString().contains("FOREIGN KEY")) {
      final var currentRelationship = this.getCurrentRelationship(ctx);
      if (currentRelationship != null) {
        final var referencesFound = new MutableBoolean(false);
        ParseTreeStream.parseTreeStream(ctx)
            .forEach(
                createForeignKeyChild -> {
                  if (createForeignKeyChild instanceof final TerminalNode terminalNode
                      && !referencesFound.booleanValue()) {
                    referencesFound.setValue(
                        Strings.CI.equals("REFERENCES", terminalNode.getText()));
                  } else if (createForeignKeyChild
                          instanceof final HiveParser.TableNameContext tableNameContext
                      && referencesFound.booleanValue()) {
                    ParseTreeStream.parseTreeStream(tableNameContext)
                        .streamChildrenByClass(HiveParser.Id_Context.class)
                        .streamTerminalNodeString()
                        .forEach(
                            terminalNodeText ->
                                currentRelationship.put(
                                    "foreignTable", NotNullSet.getInstance(terminalNodeText)));
                  } else if (createForeignKeyChild
                      instanceof
                      final HiveParser.ColumnParenthesesListContext columnParenthesesListContext) {
                    if (referencesFound.booleanValue()) {
                      ParseTreeStream.parseTreeStream(columnParenthesesListContext)
                          .streamChildrenByClass(HiveParser.ColumnNameListContext.class)
                          .streamChildrenByClass(HiveParser.ColumnNameContext.class)
                          .streamChildrenByClass(HiveParser.Id_Context.class)
                          .streamTerminalNodeString()
                          .forEach(
                              terminalNodeText -> {
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
                              });
                    } else {
                      ParseTreeStream.parseTreeStream(columnParenthesesListContext)
                          .streamChildrenByClass(HiveParser.ColumnNameListContext.class)
                          .streamChildrenByClass(HiveParser.ColumnNameContext.class)
                          .streamChildrenByClass(HiveParser.Id_Context.class)
                          .streamTerminalNodeString()
                          .forEach(
                              terminalNodeText -> {
                                final Set<String> inheritsList;
                                if (currentRelationship.get("column") instanceof Set) {
                                  inheritsList = (Set<String>) currentRelationship.get("column");
                                } else {
                                  inheritsList = new LinkedHashSet<>();
                                }
                                inheritsList.add(terminalNodeText);

                                currentRelationship.put(
                                    "column", NotNullSet.getInstance(inheritsList));
                              });
                    }
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
  public void exitCreateTableStatement(final HiveParser.CreateTableStatementContext ctx) {
    final var methodName = "exitCreateTableStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);

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

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(HiveParser.LikeTableOrFileContext.class)
        .streamChildrenByClass(HiveParser.TableNameContext.class)
        .streamChildrenByClass(HiveParser.Id_Context.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              final Set<String> inheritsList;
              if (currentTable.getAttributes().get(SqlContextImpl.LIKE) instanceof Set) {
                inheritsList = (Set<String>) currentTable.getAttributes().get(SqlContextImpl.LIKE);
              } else {
                inheritsList = new TreeSet<>();
              }
              inheritsList.add(terminalNodeText);
              currentTable
                  .getAttributes()
                  .put(SqlContextImpl.LIKE, NotNullSet.getInstance(inheritsList));
            });

    if (!currentTable.getFields().isEmpty() || !currentTable.getAttributes().isEmpty()) {
      ParseTreeStream.parseTreeStream(ctx)
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
  public void exitTableFileFormat(final HiveParser.TableFileFormatContext ctx) {
    final var methodName = "exitTableFileFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var terminalNodeText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(HiveParser.Id_Context.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (StringUtils.isNoneBlank(terminalNodeText)) {
      currentTable
          .getAttributes()
          .put(SqlContextImpl.STORED_AS, NotNullSet.getInstance(terminalNodeText));
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableLevelConstraint(final HiveParser.TableLevelConstraintContext ctx) {
    final var methodName = "exitTableLevelConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    final var primaryKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(HiveParser.PkUkConstraintContext.class)
            .streamChildrenByClass(HiveParser.TableConstraintTypeContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (Strings.CI.equals("PRIMARY KEY", primaryKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    } else if (Strings.CI.equals("UNIQUE", primaryKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
  }

  private List<ObjectField> getCurrentFieldList(final ParserRuleContext ctx) {
    final var methodName = "getCurrentFieldList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var terminalNodeList =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(HiveParser.Id_Context.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet());
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(HiveParser.Id_Context.class)
            .streamChildrenByClass(HiveParser.NonReservedContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(HiveParser.PkUkConstraintContext.class)
            .streamChildrenByClass(HiveParser.ColumnParenthesesListContext.class)
            .streamChildrenByClass(HiveParser.ColumnNameListContext.class)
            .streamChildrenByClass(HiveParser.ColumnNameContext.class)
            .streamChildrenByClass(HiveParser.Id_Context.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(HiveParser.CreateForeignKeyContext.class)
            .streamChildrenByClass(HiveParser.ColumnParenthesesListContext.class)
            .streamChildrenByClass(HiveParser.ColumnNameListContext.class)
            .streamChildrenByClass(HiveParser.ColumnNameContext.class)
            .streamChildrenByClass(HiveParser.Id_Context.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));

    return terminalNodeList.stream()
        .map(child -> ParseTreeHelper.getField(currentTable, child))
        .collect(Collectors.toList());
  }

  private ObjectRelationship getCurrentRelationship(final ParserRuleContext ctx) {
    final var methodName = "getCurrentRelationshipList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var terminalNode = new ArrayList<ParseTree>();
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(HiveParser.ColumnConstraintContext.class)
            .streamChildrenByClass(HiveParser.ForeignKeyConstraintContext.class)
            .filter(TerminalNode.class::isInstance)
            .map(
                foreignTerminalNode -> {
                  final List<ParseTree> returnValue = new ArrayList<>();
                  if (Strings.CI.equalsAny("REFERENCES", foreignTerminalNode.getText())) {
                    returnValue.addAll(
                        ParseTreeStream.parseTreeStream(
                                (ParserRuleContext)
                                    foreignTerminalNode.getParent().getParent().getParent())
                            .streamChildrenByClass(HiveParser.Id_Context.class)
                            .filter(TerminalNode.class::isInstance)
                            .toList());
                  }
                  return returnValue;
                })
            .flatMap(List::stream)
            .toList());
    int lastIdx =
        IntStream.range(0, ctx.children.size())
            .filter(i -> ctx.children.get(i).getText().toUpperCase().contains("REFERENCES"))
            .findFirst()
            .orElse(-1);
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .filter(TerminalNode.class::isInstance)
            .map(
                foreignTerminalNode -> {
                  final List<ParseTree> returnValue = new ArrayList<>();
                  if (Strings.CI.equalsAny("REFERENCES", foreignTerminalNode.getText())) {
                    returnValue.addAll(
                        ParseTreeStream.parseTreeStream(ctx)
                            .streamChildrenByClass(HiveParser.Id_Context.class)
                            .filter(TerminalNode.class::isInstance)
                            .toList());
                    if (returnValue.isEmpty()) {
                      returnValue.addAll(
                          ParseTreeStream.parseTreeStream(ctx)
                              .streamChildrenByClass(HiveParser.ColumnParenthesesListContext.class)
                              .streamChildrenByClass(HiveParser.ColumnNameListContext.class)
                              .streamChildrenByClass(HiveParser.ColumnNameContext.class)
                              .streamChildrenByClass(HiveParser.Id_Context.class)
                              .filter(TerminalNode.class::isInstance)
                              .toList()
                              .subList(0, lastIdx - 1));
                    }
                  }
                  return returnValue;
                })
            .flatMap(List::stream)
            .toList());

    if (!terminalNode.isEmpty()) {
      return ParseTreeHelper.getRelationship(
          currentTable, String.join("_", terminalNode.stream().map(ParseTree::getText).toList()));
    }
    return null;
  }

  private SqlContext getCurrentTable(final ParserRuleContext ctx) {
    final var methodName = "getCurrentTable";
    HiveParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, HiveParser.CreateTableStatementContext.class);
    if (parentContext == null || parentContext.children == null) {
      return null;
    }

    final var terminalNodeTextList =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(HiveParser.TableNameContext.class)
            .streamChildrenByClass(HiveParser.Id_Context.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(HiveParser.TableNameContext.class)
            .streamChildrenByClass(HiveParser.Id_Context.class)
            .streamChildrenByClass(HiveParser.NonReservedContext.class)
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
    HiveParserListenerImpl.traceChildren(methodName, node);

    HiveParserListenerImpl.input = node.getSymbol().getInputStream();
  }
}
