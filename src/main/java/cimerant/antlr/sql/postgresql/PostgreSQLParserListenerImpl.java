package cimerant.antlr.sql.postgresql;

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
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Strings;
import sql.postgresql.PostgreSQLParser;
import sql.postgresql.PostgreSQLParserListener;

/**
 * This class provides an empty implementation of {@link PostgreSQLParserListener}, which can be
 * extended to create a listener which only needs to handle a subset of the available methods.
 */
public class PostgreSQLParserListenerImpl extends PostgreSQLParserListenerBase {
  private static CharStream input;
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(PostgreSQLParserListenerImpl.class.getName());
  }

  private static void traceChildren(final String methodName, final ParseTree ctx) {
    if (PostgreSQLParserListenerImpl.logger.isTraceEnabled()) {
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
  public void exitAltertablestmt(final PostgreSQLParser.AltertablestmtContext ctx) {
    final var methodName = "exitAltertablestmt";
    PostgreSQLParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    final var fieldTypeText =
        " "
            + ParseTreeStream.parseTreeStream(ctx)
                .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdsContext.class)
                .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdContext.class)
                .streamChildrenByClass(PostgreSQLParser.TableconstraintContext.class)
                .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
                .listAllTerminalNodeText()
                .stream()
                .map(StringUtils::upperCase)
                .collect(Collectors.joining(" "))
            + " ";
    for (final var currentField : currentFieldList) {
      if (currentField != null) {
        if (fieldTypeText.contains(" PRIMARY KEY ")) {
          currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
        }
        if (fieldTypeText.contains(" UNIQUE ")) {
          currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
        }
        if (fieldTypeText.contains(" NOT NULL ")) {
          currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
        } else if (fieldTypeText.contains(" NULL ")
            && !fieldTypeText.contains(" ALWAYS NULL ")
            && !fieldTypeText.contains(" SET NULL ")) {
          currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.TRUE));
        }
      }
    }
    if (fieldTypeText.contains(" FOREIGN KEY ")) {
      final var currentRelationship = this.getCurrentRelationship(ctx);
      if (currentRelationship != null) {
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdsContext.class)
            .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdContext.class)
            .streamChildrenByClass(PostgreSQLParser.TableconstraintContext.class)
            .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .map(qualifiedNameContext -> ParseTreeHelper.trimToken(qualifiedNameContext.getText()))
            .filter(StringUtils::isNoneBlank)
            .filter(Predicate.not("null"::equalsIgnoreCase))
            .forEach(
                terminalNodeText ->
                    currentRelationship.put(
                        "foreignTable", NotNullSet.getInstance(terminalNodeText)));
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdsContext.class)
            .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdContext.class)
            .streamChildrenByClass(PostgreSQLParser.TableconstraintContext.class)
            .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
            .streamChildrenByClass(PostgreSQLParser.Opt_column_listContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
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
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdsContext.class)
            .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdContext.class)
            .streamChildrenByClass(PostgreSQLParser.TableconstraintContext.class)
            .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .map(identifierContext -> ParseTreeHelper.trimToken(identifierContext.getText()))
            .filter(StringUtils::isNoneBlank)
            .forEach(
                identifierText -> {
                  final Set<String> inheritsList;
                  if (currentRelationship.get("column") instanceof Set) {
                    inheritsList = (Set<String>) currentRelationship.get("column");
                  } else {
                    inheritsList = new LinkedHashSet<>();
                  }
                  inheritsList.add(identifierText);

                  currentRelationship.put("column", NotNullSet.getInstance(inheritsList));
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
  public void exitColumnDef(final PostgreSQLParser.ColumnDefContext ctx) {
    final var methodName = "exitColumnDef";
    PostgreSQLParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.ConstdatetimeContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!Strings.CI.equals(
                        currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)
                    && !Strings.CI.equals(Field.PRECISION, terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.ConstintervalContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!Strings.CI.equals(
                        currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)
                    && !Strings.CI.equals(Field.PRECISION, terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.BitContext.class)
        .streamChildrenByClass(PostgreSQLParser.BitwithlengthContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!Strings.CI.equals(
                        currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)
                    && !Strings.CI.equals(Field.PRECISION, terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.BitContext.class)
        .streamChildrenByClass(PostgreSQLParser.BitwithlengthContext.class)
        .filter(PostgreSQLParser.Expr_listContext.class::isInstance)
        .map((Function<? super ParseTree, ? extends String>) ParseTree::getText)
        .filter(StringUtils::isNoneBlank)
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.PRECISION)) {
                  if (terminalNodeText.contains(".")) {
                    final var terminalNodeSplit = terminalNodeText.split("\\.", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else if (terminalNodeText.contains(",")) {
                    final var terminalNodeSplit = terminalNodeText.split(",", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else {
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeText));
                  }
                } else if (!Strings.CI.equals(
                        currentField.get(Field.PRECISION).toString(), terminalNodeText)
                    && !Strings.CI.equals(Field.PRECISION, terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.BitContext.class)
        .streamChildrenByClass(PostgreSQLParser.BitwithlengthContext.class)
        .streamChildrenByClass(PostgreSQLParser.Opt_varyingContext.class)
        .streamTerminalNodeString()
        .map(StringUtils::upperCase)
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("VARYING", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.VARYING, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.ColquallistContext.class)
        .streamChildrenByClass(PostgreSQLParser.ColconstraintContext.class)
        .streamChildrenByClass(PostgreSQLParser.ColconstraintelemContext.class)
        .streamTerminalNodeString()
        .map(StringUtils::upperCase)
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("IDENTITY", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.IDENTITY, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.ColquallistContext.class)
        .streamChildrenByClass(PostgreSQLParser.ColconstraintContext.class)
        .streamChildrenByClass(PostgreSQLParser.ConstraintattrContext.class)
        .streamTerminalNodeString()
        .map(StringUtils::upperCase)
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("DEFERRABLE", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.DEFERRABLE, NotNullSet.getInstance(Boolean.TRUE));
                }
              } else if (Strings.CI.equals("DEFERRED", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.DEFERRED, NotNullSet.getInstance(Boolean.TRUE));
                }
              } else {
                for (final var currentField : currentFieldList) {
                  if (!Strings.CI.equals("IMMEDIATE", terminalNodeText)
                      && !Strings.CI.equals("INITIALLY", terminalNodeText)) {
                    currentField.put(
                        StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                        NotNullSet.getInstance(Boolean.TRUE));
                  }
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.ColquallistContext.class)
        .streamChildrenByClass(PostgreSQLParser.ColconstraintContext.class)
        .streamTerminalNodeString()
        .map(StringUtils::upperCase)
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("COLLATE", terminalNodeText)) {
                ParseTreeStream.parseTreeStream(ctx)
                    .streamChildrenByClass(PostgreSQLParser.ColquallistContext.class)
                    .streamChildrenByClass(PostgreSQLParser.ColconstraintContext.class)
                    .streamChildrenByClass(PostgreSQLParser.Any_nameContext.class)
                    .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
                    .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
                    .streamTerminalNodeString()
                    .forEach(
                        collateNodeText -> {
                          for (final var currentField : currentFieldList) {
                            currentField.put(
                                Field.COLLATION_NAME, NotNullSet.getInstance(collateNodeText));
                          }
                        });
              }
            });
    {
      final var terminalNodeText =
          ParseTreeStream.parseTreeStream(ctx)
              .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
              .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
              .streamChildrenByClass(PostgreSQLParser.NumericContext.class)
              .streamTerminalNodeString()
              .collect(Collectors.joining(" "));
      if (StringUtils.isNoneBlank(terminalNodeText)) {
        for (final var currentField : currentFieldList) {
          if (!currentField.containsKey(Field.FIELD_TYPE)) {
            currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
          } else if (!Strings.CI.equals(
                  currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)
              && !Strings.CI.equals(Field.PRECISION, terminalNodeText)) {
            currentField.put(
                StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                NotNullSet.getInstance(Boolean.TRUE));
          }
        }
      }
    }
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.CharacterContext.class)
        .streamChildrenByClass(PostgreSQLParser.Character_cContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!Strings.CI.equals(
                        currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)
                    && !Strings.CI.equals(Field.PRECISION, terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.CharacterContext.class)
        .streamChildrenByClass(PostgreSQLParser.IconstContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.PRECISION)) {
                  if (terminalNodeText.contains(".")) {
                    final var terminalNodeSplit = terminalNodeText.split("\\.", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else if (terminalNodeText.contains(",")) {
                    final var terminalNodeSplit = terminalNodeText.split(",", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else {
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeText));
                  }
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.ConstdatetimeContext.class)
        .streamChildrenByClass(PostgreSQLParser.IconstContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.PRECISION)) {
                  if (terminalNodeText.contains(".")) {
                    final var terminalNodeSplit = terminalNodeText.split("\\.", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else if (terminalNodeText.contains(",")) {
                    final var terminalNodeSplit = terminalNodeText.split(",", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else {
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeText));
                  }
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.GenerictypeContext.class)
        .streamChildrenByClass(PostgreSQLParser.Type_function_nameContext.class)
        .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!Strings.CI.equals(
                        currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)
                    && !Strings.CI.equals(Field.PRECISION, terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.GenerictypeContext.class)
        .streamChildrenByClass(PostgreSQLParser.Type_function_nameContext.class)
        .streamChildrenByClass(PostgreSQLParser.Unreserved_keywordContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!Strings.CI.equals(
                        currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)
                    && !Strings.CI.equals(Field.PRECISION, terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.GenerictypeContext.class)
        .streamChildrenByClass(PostgreSQLParser.Type_function_nameContext.class)
        .streamChildrenByClass(PostgreSQLParser.Type_func_name_keywordContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!Strings.CI.equals(
                        currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)
                    && !Strings.CI.equals(Field.PRECISION, terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.GenerictypeContext.class)
        .streamChildrenByClass(PostgreSQLParser.Opt_type_modifiersContext.class)
        .filter(PostgreSQLParser.Expr_listContext.class::isInstance)
        .map((Function<? super ParseTree, ? extends String>) ParseTree::getText)
        .filter(StringUtils::isNoneBlank)
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.PRECISION)) {
                  if (terminalNodeText.contains(".")) {
                    final var terminalNodeSplit = terminalNodeText.split("\\.", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else if (terminalNodeText.contains(",")) {
                    final var terminalNodeSplit = terminalNodeText.split(",", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else {
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeText));
                  }
                } else if (!Strings.CI.equals(
                        currentField.get(Field.PRECISION).toString(), terminalNodeText)
                    && !Strings.CI.equals(Field.PRECISION, terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.NumericContext.class)
        .streamChildrenByClass(PostgreSQLParser.Opt_type_modifiersContext.class)
        .filter(PostgreSQLParser.Expr_listContext.class::isInstance)
        .forEach(
            expr_listContext -> {
              final var values = expr_listContext.getText().split(",", 0);
              for (final var currentField : currentFieldList) {
                if (values.length == 2) {
                  if (!currentField.containsKey(Field.PRECISION)) {
                    if (values[0].contains(".")) {
                      final var terminalNodeSplit = values[0].split("\\.", 0);
                      currentField.put(
                          Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                      currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                    } else if (values[0].contains(",")) {
                      final var terminalNodeSplit = values[0].split(",", 0);
                      currentField.put(
                          Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                      currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                    } else {
                      currentField.put(Field.PRECISION, NotNullSet.getInstance(values[0]));
                    }
                  }
                  if (!currentField.containsKey(Field.SCALE)) {
                    currentField.put(Field.SCALE, NotNullSet.getInstance(values[1]));
                  }
                } else if (values.length == 1 && !currentField.containsKey(Field.PRECISION)) {
                  if (values[0].contains(".")) {
                    final var terminalNodeSplit = values[0].split("\\.", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else if (values[0].contains(",")) {
                    final var terminalNodeSplit = values[0].split(",", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else {
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(values[0]));
                  }
                }
              }
            });
    final var fieldTypeText =
        " "
            + ParseTreeStream.parseTreeStream(ctx)
                .streamChildrenByClass(PostgreSQLParser.ColquallistContext.class)
                .streamChildrenByClass(PostgreSQLParser.ColconstraintContext.class)
                .streamChildrenByClass(PostgreSQLParser.ColconstraintelemContext.class)
                .listAllTerminalNodeText()
                .stream()
                .map(StringUtils::upperCase)
                .collect(Collectors.joining(" "))
            + " ";
    for (final var currentField : currentFieldList) {
      if (currentField != null) {
        if (fieldTypeText.contains(" PRIMARY KEY ")) {
          currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
        }
        if (fieldTypeText.contains(" UNIQUE ")) {
          currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
        }
        if (fieldTypeText.contains(" NOT NULL ")) {
          currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
        } else if (fieldTypeText.contains(" NULL ")
            && !fieldTypeText.contains(" ALWAYS NULL ")
            && !fieldTypeText.contains(" SET NULL ")) {
          currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.TRUE));
        }
      }
    }

    final var colconstraintelemList =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.ColquallistContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColconstraintContext.class)
            .listChildrenByClass(PostgreSQLParser.ColconstraintelemContext.class);
    for (var i = 0; i < colconstraintelemList.size(); ++i) {
      for (final var currentField : currentFieldList) {
        if (!currentField.containsKey(Field.DEFAULT)
            && i + 1 < colconstraintelemList.size()
            && colconstraintelemList.get(i) instanceof TerminalNode
            && Strings.CI.equals(
                "DEFAULT", ParseTreeHelper.trimToken(colconstraintelemList.get(i).getText()))
            && colconstraintelemList.get(i + 1) instanceof ParserRuleContext) {
          final var intervalText =
              ParseTreeHelper.trimParentheses(
                  ParseTreeHelper.getText(
                      PostgreSQLParserListenerImpl.input,
                      (ParserRuleContext) colconstraintelemList.get(i + 1)));
          if (StringUtils.isNoneBlank(intervalText)) {
            currentField.put(Field.DEFAULT, NotNullSet.getInstance(intervalText));
          }
        }
      }
    }

    ParseTreeStream.parseTreeStream(ctx)
        .filter(PostgreSQLParser.TypenameContext.class::isInstance)
        .map((Function<? super ParseTree, ? extends String>) ParseTree::getText)
        .filter(typenameText -> typenameText.contains("["))
        .map(typenameText -> typenameText.substring(typenameText.indexOf('[')))
        .filter(StringUtils::isNoneBlank)
        .forEach(
            typenameText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.ARRAY, NotNullSet.getInstance(typenameText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
        .streamChildrenByClass(PostgreSQLParser.CharacterContext.class)
        .streamChildrenByClass(PostgreSQLParser.Character_cContext.class)
        .streamChildrenByClass(PostgreSQLParser.Opt_varyingContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (Strings.CI.equals("VARYING", terminalNodeText)) {
                  currentField.put(Field.VARYING, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });

    final var timezoneText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.TypenameContext.class)
            .streamChildrenByClass(PostgreSQLParser.SimpletypenameContext.class)
            .streamChildrenByClass(PostgreSQLParser.ConstdatetimeContext.class)
            .streamChildrenByClass(PostgreSQLParser.Opt_timezoneContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    for (final var currentField : currentFieldList) {
      if ("WITH TIME ZONE".equals(timezoneText)) {
        currentField.put(Field.TIMEZONE, NotNullSet.getInstance(Boolean.TRUE));
      } else if ("WITHOUT TIME ZONE".equals(timezoneText)) {
        currentField.put(Field.TIMEZONE, NotNullSet.getInstance(Boolean.FALSE));
      }
    }
    for (final var currentField : currentFieldList) {
      if (currentField.containsKey(Field.PRECISION)
          && !currentField.containsKey(Field.SCALE)
          && Stream.of(
                  "BINARY",
                  "BIT",
                  "BLOB",
                  "CHAR",
                  "CHARACTER",
                  "DATE",
                  "DATETIME",
                  "NCHAR",
                  "NVARCHAR",
                  "TIME",
                  "TIMESTAMP",
                  "VARBINARY",
                  "VARCHAR",
                  "VARCHAR2",
                  "YEAR")
              .anyMatch(currentField.get(Field.FIELD_TYPE).toString()::equalsIgnoreCase)) {
        currentField.put(Field.MAX_SIZE, currentField.get(Field.PRECISION));
        currentField.remove(Field.PRECISION);
      }
    }

    final var currentRelationship = this.getCurrentRelationship(ctx);
    if (currentRelationship != null) {
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
          .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
          .map(identifierContext -> ParseTreeHelper.trimToken(identifierContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              identifierText -> {
                final Set<String> inheritsList;
                if (currentRelationship.get("column") instanceof Set) {
                  inheritsList = (Set<String>) currentRelationship.get("column");
                } else {
                  inheritsList = new LinkedHashSet<>();
                }
                inheritsList.add(identifierText);

                currentRelationship.put("column", NotNullSet.getInstance(inheritsList));
              });
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
          .streamChildrenByClass(PostgreSQLParser.Unreserved_keywordContext.class)
          .map(identifierContext -> ParseTreeHelper.trimToken(identifierContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              identifierText -> {
                final Set<String> inheritsList;
                if (currentRelationship.get("column") instanceof Set) {
                  inheritsList = (Set<String>) currentRelationship.get("column");
                } else {
                  inheritsList = new LinkedHashSet<>();
                }
                inheritsList.add(identifierText);

                currentRelationship.put("column", NotNullSet.getInstance(inheritsList));
              });
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(PostgreSQLParser.ColquallistContext.class)
          .streamChildrenByClass(PostgreSQLParser.ColconstraintContext.class)
          .streamChildrenByClass(PostgreSQLParser.ColconstraintelemContext.class)
          .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
          .map(qualifiedNameContext -> ParseTreeHelper.trimToken(qualifiedNameContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .filter(Predicate.not("null"::equalsIgnoreCase))
          .forEach(
              identifierText ->
                  currentRelationship.put(
                      "foreignTable",
                      NotNullSet.getInstance(ParseTreeHelper.trimToken(identifierText))));
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(PostgreSQLParser.ColquallistContext.class)
          .streamChildrenByClass(PostgreSQLParser.ColconstraintContext.class)
          .streamChildrenByClass(PostgreSQLParser.ColconstraintelemContext.class)
          .streamChildrenByClass(PostgreSQLParser.Opt_column_listContext.class)
          .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
          .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
          .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
          .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
          .map(simpleIdContext -> ParseTreeHelper.trimToken(simpleIdContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              simpleIdContext -> {
                final Set<String> inheritsList;
                if (currentRelationship.get("foreignColumn") instanceof Set) {
                  inheritsList = (Set<String>) currentRelationship.get("foreignColumn");
                } else {
                  inheritsList = new LinkedHashSet<>();
                }
                inheritsList.add(simpleIdContext);

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
  public void exitCreateforeigntablestmt(final PostgreSQLParser.CreateforeigntablestmtContext ctx) {
    final var methodName = "exitCreateforeigntablestmt";
    PostgreSQLParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    {
      final var terminalNodeText =
          ParseTreeStream.parseTreeStream(ctx)
              .streamTerminalNodeString()
              .map(StringUtils::upperCase)
              .collect(Collectors.joining(" "));
      if ("BLOCKCHAIN".equals(terminalNodeText)) {
        currentTable
            .getAttributes()
            .put(SqlContextImpl.BLOCKCHAIN, NotNullSet.getInstance(Boolean.TRUE));
      }
      if ("QUEUE".equals(terminalNodeText)) {
        currentTable
            .getAttributes()
            .put(SqlContextImpl.QUEUE, NotNullSet.getInstance(Boolean.TRUE));
      }
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
          .streamChildrenByClass(PostgreSQLParser.OpttempContext.class)
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
                if (Strings.CI.equals("UNLOGGED", terminalNodeText)) {
                  currentTable
                      .getAttributes()
                      .put(SqlContextImpl.UNLOGGED, NotNullSet.getInstance(Boolean.TRUE));
                }
              });

      currentTable
          .getAttributes()
          .put(SqlContextImpl.FOREIGN, NotNullSet.getInstance(Boolean.TRUE));

      this.getRootContext().addObject(currentTable);
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatestmt(final PostgreSQLParser.CreatestmtContext ctx) {
    final var methodName = "exitCreatestmt";
    PostgreSQLParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    {
      final var terminalNodeText =
          ParseTreeStream.parseTreeStream(ctx)
              .streamTerminalNodeString()
              .map(StringUtils::upperCase)
              .collect(Collectors.joining(" "));
      if ("BLOCKCHAIN".equals(terminalNodeText)) {
        currentTable
            .getAttributes()
            .put(SqlContextImpl.BLOCKCHAIN, NotNullSet.getInstance(Boolean.TRUE));
      }
      if ("QUEUE".equals(terminalNodeText)) {
        currentTable
            .getAttributes()
            .put(SqlContextImpl.QUEUE, NotNullSet.getInstance(Boolean.TRUE));
      }
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
          .streamChildrenByClass(PostgreSQLParser.OpttempContext.class)
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
                if (Strings.CI.equals("UNLOGGED", terminalNodeText)) {
                  currentTable
                      .getAttributes()
                      .put(SqlContextImpl.UNLOGGED, NotNullSet.getInstance(Boolean.TRUE));
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
  public void exitOptinherit(final PostgreSQLParser.OptinheritContext ctx) {
    final var methodName = "exitOptinherit";
    PostgreSQLParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final List<String> terminalNodeTextList =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.Qualified_name_listContext.class)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .streamTerminalNodeString()
            .toList();
    if (!terminalNodeTextList.isEmpty()) {
      final Set<String> inheritsList;
      if (currentTable.getAttributes().get(SqlContextImpl.INHERITS) instanceof Set) {
        inheritsList = (Set<String>) currentTable.getAttributes().get(SqlContextImpl.INHERITS);
      } else {
        inheritsList = new TreeSet<>();
      }
      inheritsList.addAll(terminalNodeTextList);
      currentTable
          .getAttributes()
          .put(SqlContextImpl.INHERITS, NotNullSet.getInstance(inheritsList));
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt(final PostgreSQLParser.StmtContext ctx) {
    final var methodName = "exitStmt";
    PostgreSQLParserListenerImpl.traceChildren(methodName, ctx);

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
      this.getRootContext().addObject(currentTable);
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableconstraint(final PostgreSQLParser.TableconstraintContext ctx) {
    final var methodName = "exitTableconstraint";
    PostgreSQLParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }
    final var fieldTypeText =
        " "
            + ParseTreeStream.parseTreeStream(ctx)
                .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
                .streamTerminalNodeString()
                .map(StringUtils::upperCase)
                .collect(Collectors.joining(" "))
            + " ";
    for (final var currentField : currentFieldList) {
      if (fieldTypeText.contains(" PRIMARY KEY ")) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (fieldTypeText.contains(" UNIQUE ")) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (fieldTypeText.contains(" NOT NULL ")) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
      } else if (fieldTypeText.contains(" NULL ")
          && !fieldTypeText.contains(" ALWAYS NULL ")
          && !fieldTypeText.contains(" SET NULL ")) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    final var constraintAttributeText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ConstraintattributespecContext.class)
            .streamChildrenByClass(PostgreSQLParser.ConstraintattributeElemContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    if (constraintAttributeText.contains("DEFERRABLE")) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.DEFERRABLE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }

    final var foreignText =
        new StringBuilder()
            .append(
                ParseTreeStream.parseTreeStream(ctx)
                    .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
                    .streamTerminalNodeString()
                    .map(StringUtils::upperCase)
                    .collect(Collectors.joining(" ")));
    if (foreignText.toString().contains("FOREIGN KEY")) {
      final var currentRelationship = this.getCurrentRelationship(ctx);
      if (currentRelationship != null) {
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .map(qualifiedNameContext -> ParseTreeHelper.trimToken(qualifiedNameContext.getText()))
            .filter(StringUtils::isNoneBlank)
            .filter(Predicate.not("null"::equalsIgnoreCase))
            .forEach(
                terminalNodeText ->
                    currentRelationship.put(
                        "foreignTable", NotNullSet.getInstance(terminalNodeText)));
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
            .streamChildrenByClass(PostgreSQLParser.Opt_column_listContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
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
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .map(identifierContext -> ParseTreeHelper.trimToken(identifierContext.getText()))
            .filter(StringUtils::isNoneBlank)
            .forEach(
                identifierText -> {
                  final Set<String> inheritsList;
                  if (currentRelationship.get("column") instanceof Set) {
                    inheritsList = (Set<String>) currentRelationship.get("column");
                  } else {
                    inheritsList = new LinkedHashSet<>();
                  }
                  inheritsList.add(identifierText);

                  currentRelationship.put("column", NotNullSet.getInstance(inheritsList));
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
  public void exitTablelikeclause(final PostgreSQLParser.TablelikeclauseContext ctx) {
    final var methodName = "exitTablelikeclause";
    PostgreSQLParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var terminalNodeTextList =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .streamTerminalNodeString()
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

  /** The default implementation does nothing. */
  private List<ObjectField> getCurrentFieldList(final ParserRuleContext ctx) {
    final var methodName = "getCurrentFieldList";

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var constraintelemChildren =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdsContext.class)
            .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdContext.class)
            .streamChildrenByClass(PostgreSQLParser.TableconstraintContext.class)
            .listChildrenByClass(PostgreSQLParser.ConstraintelemContext.class);
    final var columnlistContextColidChildren =
        ParseTreeStream.parseTreeStream(constraintelemChildren)
            .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
            .listChildrenByClass(PostgreSQLParser.ColidContext.class);
    final var optColumnListColidChildren =
        ParseTreeStream.parseTreeStream(constraintelemChildren)
            .streamChildrenByClass(PostgreSQLParser.Opt_column_listContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
            .listChildrenByClass(PostgreSQLParser.ColidContext.class);

    final List<ParseTree> terminalNode = new ArrayList<>();
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(columnlistContextColidChildren)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(columnlistContextColidChildren)
            .streamChildrenByClass(PostgreSQLParser.Unreserved_keywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(columnlistContextColidChildren)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(columnlistContextColidChildren)
            .streamChildrenByClass(PostgreSQLParser.Col_name_keywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(optColumnListColidChildren)
            .streamChildrenByClass(PostgreSQLParser.Col_name_keywordContext.class)
            .streamChildrenByClass(PostgreSQLParser.Builtin_function_nameContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(optColumnListColidChildren)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .streamChildrenByClass(PostgreSQLParser.Plsql_unreserved_keywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(optColumnListColidChildren)
            .streamChildrenByClass(PostgreSQLParser.Unreserved_keywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(optColumnListColidChildren)
            .streamChildrenByClass(PostgreSQLParser.Col_name_keywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));

    final var colidContextChildren =
        ParseTreeStream.parseTreeStream(ctx)
            .listChildrenByClass(PostgreSQLParser.ColidContext.class);

    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(colidContextChildren)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(colidContextChildren)
            .streamChildrenByClass(PostgreSQLParser.Col_name_keywordContext.class)
            .streamChildrenByClass(PostgreSQLParser.Builtin_function_nameContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(colidContextChildren)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(colidContextChildren)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .streamChildrenByClass(PostgreSQLParser.Plsql_unreserved_keywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(colidContextChildren)
            .streamChildrenByClass(PostgreSQLParser.Unreserved_keywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(colidContextChildren)
            .streamChildrenByClass(PostgreSQLParser.Col_name_keywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));

    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.Unreserved_keywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.Col_name_keywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));

    return terminalNode.stream()
        .map(child -> ParseTreeHelper.getField(currentTable, child))
        .collect(Collectors.toList());
  }

  private ObjectRelationship getCurrentRelationship(final ParserRuleContext ctx) {
    final var methodName = "getCurrentRelationshipList";
    PostgreSQLParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final List<ParseTree> terminalNode = new ArrayList<>();
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PostgreSQLParser.ColquallistContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColconstraintContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColconstraintelemContext.class)
            .filter(TerminalNode.class::isInstance)
            .map(
                foreignTerminalNode -> {
                  final List<ParseTree> returnValue = new ArrayList<>();
                  if (Strings.CI.equalsAny("REFERENCES", foreignTerminalNode.getText())) {
                    returnValue.addAll(
                        ParseTreeStream.parseTreeStream(ctx)
                            .streamChildrenByClass(PostgreSQLParser.ColquallistContext.class)
                            .streamChildrenByClass(PostgreSQLParser.ColconstraintContext.class)
                            .streamChildrenByClass(PostgreSQLParser.NameContext.class)
                            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
                            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
                            .filter(TerminalNode.class::isInstance)
                            .toList());
                    if (returnValue.isEmpty()) {
                      returnValue.addAll(
                          ParseTreeStream.parseTreeStream(ctx)
                              .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
                              .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
                              .filter(TerminalNode.class::isInstance)
                              .toList());
                      returnValue.addAll(
                          ParseTreeStream.parseTreeStream(ctx)
                              .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
                              .streamChildrenByClass(
                                  PostgreSQLParser.Unreserved_keywordContext.class)
                              .filter(TerminalNode.class::isInstance)
                              .toList());
                    }
                  }
                  return returnValue;
                })
            .flatMap(List::stream)
            .toList());
    if (terminalNode.isEmpty()) {
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(ctx)
              .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
              .filter(TerminalNode.class::isInstance)
              .map(
                  foreignTerminalNode -> {
                    final List<ParseTree> returnValue = new ArrayList<>();
                    if (Strings.CI.equalsAny("REFERENCES", foreignTerminalNode.getText())) {
                      returnValue.addAll(
                          ParseTreeStream.parseTreeStream(ctx)
                              .streamChildrenByClass(PostgreSQLParser.NameContext.class)
                              .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
                              .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
                              .filter(TerminalNode.class::isInstance)
                              .toList());
                      if (returnValue.isEmpty()) {
                        returnValue.addAll(
                            ParseTreeStream.parseTreeStream(ctx)
                                .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
                                .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
                                .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
                                .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
                                .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
                                .filter(TerminalNode.class::isInstance)
                                .toList());
                      }
                    }
                    return returnValue;
                  })
              .flatMap(List::stream)
              .toList());
    }
    if (terminalNode.isEmpty()) {
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(ctx)
              .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdsContext.class)
              .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdContext.class)
              .streamChildrenByClass(PostgreSQLParser.TableconstraintContext.class)
              .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
              .filter(TerminalNode.class::isInstance)
              .map(
                  foreignTerminalNode -> {
                    final List<ParseTree> returnValue = new ArrayList<>();
                    if (Strings.CI.equalsAny("REFERENCES", foreignTerminalNode.getText())) {
                      returnValue.addAll(
                          ParseTreeStream.parseTreeStream(ctx)
                              .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdsContext.class)
                              .streamChildrenByClass(PostgreSQLParser.Alter_table_cmdContext.class)
                              .streamChildrenByClass(PostgreSQLParser.TableconstraintContext.class)
                              .streamChildrenByClass(PostgreSQLParser.NameContext.class)
                              .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
                              .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
                              .filter(TerminalNode.class::isInstance)
                              .toList());
                      if (returnValue.isEmpty()) {
                        returnValue.addAll(
                            ParseTreeStream.parseTreeStream(ctx)
                                .streamChildrenByClass(
                                    PostgreSQLParser.Alter_table_cmdsContext.class)
                                .streamChildrenByClass(
                                    PostgreSQLParser.Alter_table_cmdContext.class)
                                .streamChildrenByClass(
                                    PostgreSQLParser.TableconstraintContext.class)
                                .streamChildrenByClass(PostgreSQLParser.ConstraintelemContext.class)
                                .streamChildrenByClass(PostgreSQLParser.ColumnlistContext.class)
                                .streamChildrenByClass(PostgreSQLParser.ColumnElemContext.class)
                                .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
                                .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
                                .filter(TerminalNode.class::isInstance)
                                .toList());
                      }
                    }
                    return returnValue;
                  })
              .flatMap(List::stream)
              .toList());
    }

    if (!terminalNode.isEmpty()) {
      return ParseTreeHelper.getRelationship(
          currentTable, String.join("_", terminalNode.stream().map(ParseTree::getText).toList()));
    }
    return null;
  }

  private SqlContext getCurrentTable(final ParserRuleContext ctx) {
    final var methodName = "getCurrentTable";
    PostgreSQLParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    var parentContext =
        ParseTreeHelper.getParentContext(ctx, PostgreSQLParser.CreatestmtContext.class);
    if (parentContext == null) {
      parentContext =
          ParseTreeHelper.getParentContext(
              ctx, PostgreSQLParser.CreateforeigntablestmtContext.class);
      if (parentContext == null) {
        parentContext =
            ParseTreeHelper.getParentContext(ctx, PostgreSQLParser.AltertablestmtContext.class);
        if (parentContext == null) {
          parentContext = ParseTreeHelper.getParentContext(ctx, PostgreSQLParser.StmtContext.class);
        }
      }
    }

    if (parentContext == null || parentContext.children == null) {
      return null;
    }

    final List<String> terminalNodeTextList = new ArrayList<>();
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.AltertablestmtContext.class)
            .streamChildrenByClass(PostgreSQLParser.Relation_exprContext.class)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.AltertablestmtContext.class)
            .streamChildrenByClass(PostgreSQLParser.Relation_exprContext.class)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.IndirectionContext.class)
            .streamChildrenByClass(PostgreSQLParser.Indirection_elContext.class)
            .streamChildrenByClass(PostgreSQLParser.Attr_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.CollabelContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.AltertablestmtContext.class)
            .streamChildrenByClass(PostgreSQLParser.Relation_exprContext.class)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.IndirectionContext.class)
            .streamChildrenByClass(PostgreSQLParser.Indirection_elContext.class)
            .streamChildrenByClass(PostgreSQLParser.Attr_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.CollabelContext.class)
            .streamChildrenByClass(PostgreSQLParser.Unreserved_keywordContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.AltertablestmtContext.class)
            .streamChildrenByClass(PostgreSQLParser.Relation_exprContext.class)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.IndirectionContext.class)
            .streamChildrenByClass(PostgreSQLParser.Indirection_elContext.class)
            .streamChildrenByClass(PostgreSQLParser.Attr_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.CollabelContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.Col_name_keywordContext.class)
            .streamChildrenByClass(PostgreSQLParser.Builtin_function_nameContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.Col_name_keywordContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .streamChildrenByClass(PostgreSQLParser.Plsql_unreserved_keywordContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.Unreserved_keywordContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.IndirectionContext.class)
            .streamChildrenByClass(PostgreSQLParser.Indirection_elContext.class)
            .streamChildrenByClass(PostgreSQLParser.Attr_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.CollabelContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .streamTerminalNodeString()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.IndirectionContext.class)
            .streamChildrenByClass(PostgreSQLParser.Indirection_elContext.class)
            .streamChildrenByClass(PostgreSQLParser.Attr_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.CollabelContext.class)
            .streamChildrenByClass(PostgreSQLParser.Unreserved_keywordContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.Relation_exprContext.class)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.ColidContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.Relation_exprContext.class)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.IndirectionContext.class)
            .streamChildrenByClass(PostgreSQLParser.Indirection_elContext.class)
            .streamChildrenByClass(PostgreSQLParser.Attr_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.CollabelContext.class)
            .streamChildrenByClass(PostgreSQLParser.IdentifierContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PostgreSQLParser.Relation_exprContext.class)
            .streamChildrenByClass(PostgreSQLParser.Qualified_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.IndirectionContext.class)
            .streamChildrenByClass(PostgreSQLParser.Indirection_elContext.class)
            .streamChildrenByClass(PostgreSQLParser.Attr_nameContext.class)
            .streamChildrenByClass(PostgreSQLParser.CollabelContext.class)
            .streamChildrenByClass(PostgreSQLParser.Unreserved_keywordContext.class)
            .streamTerminalNodeString()
            .findFirst()
            .stream()
            .toList());

    if (terminalNodeTextList.isEmpty()
        || (terminalNodeTextList.size() == 1
            && Strings.CI.equals("public", terminalNodeTextList.get(0)))) {
      return null;
    }

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
    PostgreSQLParserListenerImpl.traceChildren(methodName, node);

    PostgreSQLParserListenerImpl.input = node.getSymbol().getInputStream();
  }
}
