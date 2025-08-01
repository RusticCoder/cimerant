package cimerant.antlr.sql.phoenix;

import cimerant.antlr.sql.ParseTreeHelper;
import cimerant.antlr.sql.ParseTreeStream;
import cimerant.context.NotNullSet;
import cimerant.context.cimerant.ObjectField;
import cimerant.context.sql.SqlContext;
import cimerant.context.sql.SqlRootContext;
import cimerant.context.sql.impl.SqlContextImpl;
import cimerant.context.sql.impl.SqlContextImpl.Field;
import cimerant.context.sql.impl.SqlRootContextImpl;
import cimerant.logger.CimerantLogger;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Strings;
import sql.phoenix.PhoenixParser;
import sql.phoenix.PhoenixParserBaseListener;
import sql.phoenix.PhoenixParserListener;

/**
 * This class provides an empty implementation of {@link PhoenixParserListener}, which can be
 * extended to create a listener which only needs to handle a subset of the available methods.
 */
public class PhoenixParserListenerImpl extends PhoenixParserBaseListener {
  private static CharStream input;
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(PhoenixParserListenerImpl.class.getName());
  }

  private static void traceChildren(final String methodName, final ParseTree ctx) {
    if (PhoenixParserListenerImpl.logger.isTraceEnabled()) {
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
  public void enterAlias(final PhoenixParser.AliasContext ctx) {
    final var methodName = "enterAlias";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAliased_table_ref(final PhoenixParser.Aliased_table_refContext ctx) {
    final var methodName = "enterAliased_table_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_command(final PhoenixParser.Alter_commandContext ctx) {
    final var methodName = "enterAlter_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_index_command(final PhoenixParser.Alter_index_commandContext ctx) {
    final var methodName = "enterAlter_index_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAny_all(final PhoenixParser.Any_allContext ctx) {
    final var methodName = "enterAny_all";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterArray_constructor(final PhoenixParser.Array_constructorContext ctx) {
    final var methodName = "enterArray_constructor";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAsc_desc(final PhoenixParser.Asc_descContext ctx) {
    final var methodName = "enterAsc_desc";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBatch(final PhoenixParser.BatchContext ctx) {
    final var methodName = "enterBatch";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBind_parameter(final PhoenixParser.Bind_parameterContext ctx) {
    final var methodName = "enterBind_parameter";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBind_parameter_number(final PhoenixParser.Bind_parameter_numberContext ctx) {
    final var methodName = "enterBind_parameter_number";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCache_hint(final PhoenixParser.Cache_hintContext ctx) {
    final var methodName = "enterCache_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCase(final PhoenixParser.CaseContext ctx) {
    final var methodName = "enterCase";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCase_when(final PhoenixParser.Case_whenContext ctx) {
    final var methodName = "enterCase_when";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCast(final PhoenixParser.CastContext ctx) {
    final var methodName = "enterCast";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClass_name(final PhoenixParser.Class_nameContext ctx) {
    final var methodName = "enterClass_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClose_command(final PhoenixParser.Close_commandContext ctx) {
    final var methodName = "enterClose_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_alias(final PhoenixParser.Column_aliasContext ctx) {
    final var methodName = "enterColumn_alias";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_def(final PhoenixParser.Column_defContext ctx) {
    final var methodName = "enterColumn_def";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_def_list(final PhoenixParser.Column_def_listContext ctx) {
    final var methodName = "enterColumn_def_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_name(final PhoenixParser.Column_nameContext ctx) {
    final var methodName = "enterColumn_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_ref(final PhoenixParser.Column_refContext ctx) {
    final var methodName = "enterColumn_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_ref_list(final PhoenixParser.Column_ref_listContext ctx) {
    final var methodName = "enterColumn_ref_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComp_op(final PhoenixParser.Comp_opContext ctx) {
    final var methodName = "enterComp_op";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraint(final PhoenixParser.ConstraintContext ctx) {
    final var methodName = "enterConstraint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraint_column(final PhoenixParser.Constraint_columnContext ctx) {
    final var methodName = "enterConstraint_column";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraint_column_list(final PhoenixParser.Constraint_column_listContext ctx) {
    final var methodName = "enterConstraint_column_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraint_name(final PhoenixParser.Constraint_nameContext ctx) {
    final var methodName = "enterConstraint_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_function_command(final PhoenixParser.Create_function_commandContext ctx) {
    final var methodName = "enterCreate_function_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_index_command(final PhoenixParser.Create_index_commandContext ctx) {
    final var methodName = "enterCreate_index_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_schema_command(final PhoenixParser.Create_schema_commandContext ctx) {
    final var methodName = "enterCreate_schema_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_sequence_command(final PhoenixParser.Create_sequence_commandContext ctx) {
    final var methodName = "enterCreate_sequence_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_table_command(final PhoenixParser.Create_table_commandContext ctx) {
    final var methodName = "enterCreate_table_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_view_command(final PhoenixParser.Create_view_commandContext ctx) {
    final var methodName = "enterCreate_view_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCursor_name(final PhoenixParser.Cursor_nameContext ctx) {
    final var methodName = "enterCursor_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterData_type(final PhoenixParser.Data_typeContext ctx) {
    final var methodName = "enterData_type";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDdl_command(final PhoenixParser.Ddl_commandContext ctx) {
    final var methodName = "enterDdl_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecimal(final PhoenixParser.DecimalContext ctx) {
    final var methodName = "enterDecimal";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeclare_cursor_command(final PhoenixParser.Declare_cursor_commandContext ctx) {
    final var methodName = "enterDeclare_cursor_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDelete_command(final PhoenixParser.Delete_commandContext ctx) {
    final var methodName = "enterDelete_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDimension_int(final PhoenixParser.Dimension_intContext ctx) {
    final var methodName = "enterDimension_int";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDml_command(final PhoenixParser.Dml_commandContext ctx) {
    final var methodName = "enterDml_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_function_command(final PhoenixParser.Drop_function_commandContext ctx) {
    final var methodName = "enterDrop_function_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_index_command(final PhoenixParser.Drop_index_commandContext ctx) {
    final var methodName = "enterDrop_index_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_schema_command(final PhoenixParser.Drop_schema_commandContext ctx) {
    final var methodName = "enterDrop_schema_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_sequence_command(final PhoenixParser.Drop_sequence_commandContext ctx) {
    final var methodName = "enterDrop_sequence_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_table_command(final PhoenixParser.Drop_table_commandContext ctx) {
    final var methodName = "enterDrop_table_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_view_command(final PhoenixParser.Drop_view_commandContext ctx) {
    final var methodName = "enterDrop_view_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    final var methodName = "enterEveryRule";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExisting_table_ref(final PhoenixParser.Existing_table_refContext ctx) {
    final var methodName = "enterExisting_table_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplain_command(final PhoenixParser.Explain_commandContext ctx) {
    final var methodName = "enterExplain_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpression(final PhoenixParser.ExpressionContext ctx) {
    final var methodName = "enterExpression";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpression_asc_desc_list(
      final PhoenixParser.Expression_asc_desc_listContext ctx) {
    final var methodName = "enterExpression_asc_desc_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpression_list(final PhoenixParser.Expression_listContext ctx) {
    final var methodName = "enterExpression_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFamily_name(final PhoenixParser.Family_nameContext ctx) {
    final var methodName = "enterFamily_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFetch_next_command(final PhoenixParser.Fetch_next_commandContext ctx) {
    final var methodName = "enterFetch_next_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFirst_last(final PhoenixParser.First_lastContext ctx) {
    final var methodName = "enterFirst_last";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFirst_next(final PhoenixParser.First_nextContext ctx) {
    final var methodName = "enterFirst_next";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_argument(final PhoenixParser.Func_argumentContext ctx) {
    final var methodName = "enterFunc_argument";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_argument_list(final PhoenixParser.Func_argument_listContext ctx) {
    final var methodName = "enterFunc_argument_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_name(final PhoenixParser.Func_nameContext ctx) {
    final var methodName = "enterFunc_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrant_command(final PhoenixParser.Grant_commandContext ctx) {
    final var methodName = "enterGrant_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGuide_post_options(final PhoenixParser.Guide_post_optionsContext ctx) {
    final var methodName = "enterGuide_post_options";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHbase_data_type(final PhoenixParser.Hbase_data_typeContext ctx) {
    final var methodName = "enterHbase_data_type";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHint(final PhoenixParser.HintContext ctx) {
    final var methodName = "enterHint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHint_name(final PhoenixParser.Hint_nameContext ctx) {
    final var methodName = "enterHint_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIf_exists(final PhoenixParser.If_existsContext ctx) {
    final var methodName = "enterIf_exists";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIf_not_exists(final PhoenixParser.If_not_existsContext ctx) {
    final var methodName = "enterIf_not_exists";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_hint(final PhoenixParser.Index_hintContext ctx) {
    final var methodName = "enterIndex_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_name(final PhoenixParser.Index_nameContext ctx) {
    final var methodName = "enterIndex_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_options(final PhoenixParser.Index_optionsContext ctx) {
    final var methodName = "enterIndex_options";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInteger(final PhoenixParser.IntegerContext ctx) {
    final var methodName = "enterInteger";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJar_path(final PhoenixParser.Jar_pathContext ctx) {
    final var methodName = "enterJar_path";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_hint(final PhoenixParser.Join_hintContext ctx) {
    final var methodName = "enterJoin_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_item(final PhoenixParser.Join_itemContext ctx) {
    final var methodName = "enterJoin_item";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_list(final PhoenixParser.Join_listContext ctx) {
    final var methodName = "enterJoin_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_type(final PhoenixParser.Join_typeContext ctx) {
    final var methodName = "enterJoin_type";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLimit_clause(final PhoenixParser.Limit_clauseContext ctx) {
    final var methodName = "enterLimit_clause";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLiteral(final PhoenixParser.LiteralContext ctx) {
    final var methodName = "enterLiteral";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterName(final PhoenixParser.NameContext ctx) {
    final var methodName = "enterName";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNew_table_ref(final PhoenixParser.New_table_refContext ctx) {
    final var methodName = "enterNew_table_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNumber(final PhoenixParser.NumberContext ctx) {
    final var methodName = "enterNumber";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNumeric(final PhoenixParser.NumericContext ctx) {
    final var methodName = "enterNumeric";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_schema_table(final PhoenixParser.On_schema_tableContext ctx) {
    final var methodName = "enterOn_schema_table";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpen_cursor_command(final PhoenixParser.Open_cursor_commandContext ctx) {
    final var methodName = "enterOpen_cursor_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOption(final PhoenixParser.OptionContext ctx) {
    final var methodName = "enterOption";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptions_(final PhoenixParser.Options_Context ctx) {
    final var methodName = "enterOptions_";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptions_list(final PhoenixParser.Options_listContext ctx) {
    final var methodName = "enterOptions_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder(final PhoenixParser.OrderContext ctx) {
    final var methodName = "enterOrder";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_by_clause(final PhoenixParser.Order_by_clauseContext ctx) {
    final var methodName = "enterOrder_by_clause";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_list(final PhoenixParser.Order_listContext ctx) {
    final var methodName = "enterOrder_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOther_command(final PhoenixParser.Other_commandContext ctx) {
    final var methodName = "enterOther_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPermission_string(final PhoenixParser.Permission_stringContext ctx) {
    final var methodName = "enterPermission_string";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPhoenix_file(final PhoenixParser.Phoenix_fileContext ctx) {
    final var methodName = "enterPhoenix_file";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPositive_decimal(final PhoenixParser.Positive_decimalContext ctx) {
    final var methodName = "enterPositive_decimal";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecision_int(final PhoenixParser.Precision_intContext ctx) {
    final var methodName = "enterPrecision_int";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuoted_name(final PhoenixParser.Quoted_nameContext ctx) {
    final var methodName = "enterQuoted_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevoke_command(final PhoenixParser.Revoke_commandContext ctx) {
    final var methodName = "enterRevoke_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRow_rows(final PhoenixParser.Row_rowsContext ctx) {
    final var methodName = "enterRow_rows";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRow_value_constructor(final PhoenixParser.Row_value_constructorContext ctx) {
    final var methodName = "enterRow_value_constructor";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterScale_int(final PhoenixParser.Scale_intContext ctx) {
    final var methodName = "enterScale_int";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterScan_hint(final PhoenixParser.Scan_hintContext ctx) {
    final var methodName = "enterScan_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSchema_name(final PhoenixParser.Schema_nameContext ctx) {
    final var methodName = "enterSchema_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSeek_to_column_hint(final PhoenixParser.Seek_to_column_hintContext ctx) {
    final var methodName = "enterSeek_to_column_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_command(final PhoenixParser.Select_commandContext ctx) {
    final var methodName = "enterSelect_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_expression(final PhoenixParser.Select_expressionContext ctx) {
    final var methodName = "enterSelect_expression";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_statement(final PhoenixParser.Select_statementContext ctx) {
    final var methodName = "enterSelect_statement";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSequence(final PhoenixParser.SequenceContext ctx) {
    final var methodName = "enterSequence";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSequence_name(final PhoenixParser.Sequence_nameContext ctx) {
    final var methodName = "enterSequence_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSequence_ref(final PhoenixParser.Sequence_refContext ctx) {
    final var methodName = "enterSequence_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSerial_hint(final PhoenixParser.Serial_hintContext ctx) {
    final var methodName = "enterSerial_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSmall_hint(final PhoenixParser.Small_hintContext ctx) {
    final var methodName = "enterSmall_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSplit_point(final PhoenixParser.Split_pointContext ctx) {
    final var methodName = "enterSplit_point";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSplit_point_list(final PhoenixParser.Split_point_listContext ctx) {
    final var methodName = "enterSplit_point_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_command(final PhoenixParser.Sql_commandContext ctx) {
    final var methodName = "enterSql_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_data_type(final PhoenixParser.Sql_data_typeContext ctx) {
    final var methodName = "enterSql_data_type";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterString(final PhoenixParser.StringContext ctx) {
    final var methodName = "enterString";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_alias(final PhoenixParser.Table_aliasContext ctx) {
    final var methodName = "enterTable_alias";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_name(final PhoenixParser.Table_nameContext ctx) {
    final var methodName = "enterTable_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_options(final PhoenixParser.Table_optionsContext ctx) {
    final var methodName = "enterTable_options";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_ref(final PhoenixParser.Table_refContext ctx) {
    final var methodName = "enterTable_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_spec(final PhoenixParser.Table_specContext ctx) {
    final var methodName = "enterTable_spec";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrue_false(final PhoenixParser.True_falseContext ctx) {
    final var methodName = "enterTrue_false";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnion(final PhoenixParser.UnionContext ctx) {
    final var methodName = "enterUnion";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnion_list(final PhoenixParser.Union_listContext ctx) {
    final var methodName = "enterUnion_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_statistics_command(
      final PhoenixParser.Update_statistics_commandContext ctx) {
    final var methodName = "enterUpdate_statistics_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpsert_select_command(final PhoenixParser.Upsert_select_commandContext ctx) {
    final var methodName = "enterUpsert_select_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpsert_values_command(final PhoenixParser.Upsert_values_commandContext ctx) {
    final var methodName = "enterUpsert_values_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUse_command(final PhoenixParser.Use_commandContext ctx) {
    final var methodName = "enterUse_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUser_string(final PhoenixParser.User_stringContext ctx) {
    final var methodName = "enterUser_string";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhere_clause(final PhoenixParser.Where_clauseContext ctx) {
    final var methodName = "enterWhere_clause";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlias(final PhoenixParser.AliasContext ctx) {
    final var methodName = "exitAlias";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAliased_table_ref(final PhoenixParser.Aliased_table_refContext ctx) {
    final var methodName = "exitAliased_table_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_command(final PhoenixParser.Alter_commandContext ctx) {
    final var methodName = "exitAlter_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_index_command(final PhoenixParser.Alter_index_commandContext ctx) {
    final var methodName = "exitAlter_index_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAny_all(final PhoenixParser.Any_allContext ctx) {
    final var methodName = "exitAny_all";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitArray_constructor(final PhoenixParser.Array_constructorContext ctx) {
    final var methodName = "exitArray_constructor";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAsc_desc(final PhoenixParser.Asc_descContext ctx) {
    final var methodName = "exitAsc_desc";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBatch(final PhoenixParser.BatchContext ctx) {
    final var methodName = "exitBatch";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBind_parameter(final PhoenixParser.Bind_parameterContext ctx) {
    final var methodName = "exitBind_parameter";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBind_parameter_number(final PhoenixParser.Bind_parameter_numberContext ctx) {
    final var methodName = "exitBind_parameter_number";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCache_hint(final PhoenixParser.Cache_hintContext ctx) {
    final var methodName = "exitCache_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCase(final PhoenixParser.CaseContext ctx) {
    final var methodName = "exitCase";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCase_when(final PhoenixParser.Case_whenContext ctx) {
    final var methodName = "exitCase_when";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCast(final PhoenixParser.CastContext ctx) {
    final var methodName = "exitCast";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClass_name(final PhoenixParser.Class_nameContext ctx) {
    final var methodName = "exitClass_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClose_command(final PhoenixParser.Close_commandContext ctx) {
    final var methodName = "exitClose_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_alias(final PhoenixParser.Column_aliasContext ctx) {
    final var methodName = "exitColumn_alias";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_def(final PhoenixParser.Column_defContext ctx) {
    final var methodName = "exitColumn_def";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    final var sqlDataTypeChildrenList =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PhoenixParser.Data_typeContext.class)
            .listChildrenByClass(PhoenixParser.Sql_data_typeContext.class);

    ParseTreeStream.parseTreeStream(sqlDataTypeChildrenList)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!currentField.get(Field.FIELD_TYPE).get(0).equals(terminalNodeText)
                    && !Strings.CI.equals(Field.PRECISION, terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(sqlDataTypeChildrenList)
        .streamChildrenByClass(PhoenixParser.Precision_intContext.class)
        .streamChildrenByClass(PhoenixParser.IntegerContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.MAX_SIZE)) {
                  currentField.put(Field.MAX_SIZE, NotNullSet.getInstance(terminalNodeText));
                } else if (!currentField.get(Field.MAX_SIZE).get(0).equals(terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    final var primaryKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    for (final var currentField : currentFieldList) {
      if (!currentField.containsKey(Field.PRIMARY)) {
        if (primaryKeyText.contains("PRIMARY KEY")) {
          currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
        }
        if (primaryKeyText.contains("NOT NULL")) {
          currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
        } else if (primaryKeyText.contains("NULL")) {
          currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.TRUE));
        }
        if (primaryKeyText.contains("DEFAULT")) {
          ParseTreeStream.parseTreeStream(ctx)
              .streamTextByClass(
                  PhoenixParserListenerImpl.input, PhoenixParser.LiteralContext.class)
              .forEach(
                  intervalText ->
                      currentField.put(Field.DEFAULT, NotNullSet.getInstance(intervalText)));
        }
      }
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_def_list(final PhoenixParser.Column_def_listContext ctx) {
    final var methodName = "exitColumn_def_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_name(final PhoenixParser.Column_nameContext ctx) {
    final var methodName = "exitColumn_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_ref(final PhoenixParser.Column_refContext ctx) {
    final var methodName = "exitColumn_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_ref_list(final PhoenixParser.Column_ref_listContext ctx) {
    final var methodName = "exitColumn_ref_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComp_op(final PhoenixParser.Comp_opContext ctx) {
    final var methodName = "exitComp_op";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraint(final PhoenixParser.ConstraintContext ctx) {
    final var methodName = "exitConstraint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var primaryKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PhoenixParser.Constraint_column_listContext.class)
        .streamChildrenByClass(PhoenixParser.Constraint_columnContext.class)
        .streamChildrenByClass(PhoenixParser.Column_nameContext.class)
        .streamChildrenByClass(PhoenixParser.NameContext.class)
        .filter(TerminalNode.class::isInstance)
        .forEach(
            terminalNode -> {
              final var field = ParseTreeHelper.getField(currentTable, terminalNode);
              if (!field.containsKey(Field.PRIMARY)
                  && (Strings.CI.equals("PRIMARY KEY", primaryKeyText)
                      || Strings.CI.equals("CONSTRAINT PRIMARY KEY", primaryKeyText))) {
                field.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
              }
            });
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraint_column(final PhoenixParser.Constraint_columnContext ctx) {
    final var methodName = "exitConstraint_column";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraint_column_list(final PhoenixParser.Constraint_column_listContext ctx) {
    final var methodName = "exitConstraint_column_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraint_name(final PhoenixParser.Constraint_nameContext ctx) {
    final var methodName = "exitConstraint_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_function_command(final PhoenixParser.Create_function_commandContext ctx) {
    final var methodName = "exitCreate_function_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_index_command(final PhoenixParser.Create_index_commandContext ctx) {
    final var methodName = "exitCreate_index_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_schema_command(final PhoenixParser.Create_schema_commandContext ctx) {
    final var methodName = "exitCreate_schema_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_sequence_command(final PhoenixParser.Create_sequence_commandContext ctx) {
    final var methodName = "exitCreate_sequence_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_table_command(final PhoenixParser.Create_table_commandContext ctx) {
    final var methodName = "exitCreate_table_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);

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
  public void exitCreate_view_command(final PhoenixParser.Create_view_commandContext ctx) {
    final var methodName = "exitCreate_view_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCursor_name(final PhoenixParser.Cursor_nameContext ctx) {
    final var methodName = "exitCursor_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitData_type(final PhoenixParser.Data_typeContext ctx) {
    final var methodName = "exitData_type";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDdl_command(final PhoenixParser.Ddl_commandContext ctx) {
    final var methodName = "exitDdl_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecimal(final PhoenixParser.DecimalContext ctx) {
    final var methodName = "exitDecimal";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeclare_cursor_command(final PhoenixParser.Declare_cursor_commandContext ctx) {
    final var methodName = "exitDeclare_cursor_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDelete_command(final PhoenixParser.Delete_commandContext ctx) {
    final var methodName = "exitDelete_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDimension_int(final PhoenixParser.Dimension_intContext ctx) {
    final var methodName = "exitDimension_int";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDml_command(final PhoenixParser.Dml_commandContext ctx) {
    final var methodName = "exitDml_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_function_command(final PhoenixParser.Drop_function_commandContext ctx) {
    final var methodName = "exitDrop_function_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_index_command(final PhoenixParser.Drop_index_commandContext ctx) {
    final var methodName = "exitDrop_index_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_schema_command(final PhoenixParser.Drop_schema_commandContext ctx) {
    final var methodName = "exitDrop_schema_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_sequence_command(final PhoenixParser.Drop_sequence_commandContext ctx) {
    final var methodName = "exitDrop_sequence_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_table_command(final PhoenixParser.Drop_table_commandContext ctx) {
    final var methodName = "exitDrop_table_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_view_command(final PhoenixParser.Drop_view_commandContext ctx) {
    final var methodName = "exitDrop_view_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    final var methodName = "exitEveryRule";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExisting_table_ref(final PhoenixParser.Existing_table_refContext ctx) {
    final var methodName = "exitExisting_table_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplain_command(final PhoenixParser.Explain_commandContext ctx) {
    final var methodName = "exitExplain_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpression(final PhoenixParser.ExpressionContext ctx) {
    final var methodName = "exitExpression";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpression_asc_desc_list(
      final PhoenixParser.Expression_asc_desc_listContext ctx) {
    final var methodName = "exitExpression_asc_desc_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpression_list(final PhoenixParser.Expression_listContext ctx) {
    final var methodName = "exitExpression_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFamily_name(final PhoenixParser.Family_nameContext ctx) {
    final var methodName = "exitFamily_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFetch_next_command(final PhoenixParser.Fetch_next_commandContext ctx) {
    final var methodName = "exitFetch_next_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFirst_last(final PhoenixParser.First_lastContext ctx) {
    final var methodName = "exitFirst_last";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFirst_next(final PhoenixParser.First_nextContext ctx) {
    final var methodName = "exitFirst_next";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_argument(final PhoenixParser.Func_argumentContext ctx) {
    final var methodName = "exitFunc_argument";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_argument_list(final PhoenixParser.Func_argument_listContext ctx) {
    final var methodName = "exitFunc_argument_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_name(final PhoenixParser.Func_nameContext ctx) {
    final var methodName = "exitFunc_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrant_command(final PhoenixParser.Grant_commandContext ctx) {
    final var methodName = "exitGrant_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGuide_post_options(final PhoenixParser.Guide_post_optionsContext ctx) {
    final var methodName = "exitGuide_post_options";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHbase_data_type(final PhoenixParser.Hbase_data_typeContext ctx) {
    final var methodName = "exitHbase_data_type";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHint(final PhoenixParser.HintContext ctx) {
    final var methodName = "exitHint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHint_name(final PhoenixParser.Hint_nameContext ctx) {
    final var methodName = "exitHint_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIf_exists(final PhoenixParser.If_existsContext ctx) {
    final var methodName = "exitIf_exists";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIf_not_exists(final PhoenixParser.If_not_existsContext ctx) {
    final var methodName = "exitIf_not_exists";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_hint(final PhoenixParser.Index_hintContext ctx) {
    final var methodName = "exitIndex_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_name(final PhoenixParser.Index_nameContext ctx) {
    final var methodName = "exitIndex_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_options(final PhoenixParser.Index_optionsContext ctx) {
    final var methodName = "exitIndex_options";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInteger(final PhoenixParser.IntegerContext ctx) {
    final var methodName = "exitInteger";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJar_path(final PhoenixParser.Jar_pathContext ctx) {
    final var methodName = "exitJar_path";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_hint(final PhoenixParser.Join_hintContext ctx) {
    final var methodName = "exitJoin_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_item(final PhoenixParser.Join_itemContext ctx) {
    final var methodName = "exitJoin_item";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_list(final PhoenixParser.Join_listContext ctx) {
    final var methodName = "exitJoin_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_type(final PhoenixParser.Join_typeContext ctx) {
    final var methodName = "exitJoin_type";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLimit_clause(final PhoenixParser.Limit_clauseContext ctx) {
    final var methodName = "exitLimit_clause";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLiteral(final PhoenixParser.LiteralContext ctx) {
    final var methodName = "exitLiteral";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitName(final PhoenixParser.NameContext ctx) {
    final var methodName = "exitName";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNew_table_ref(final PhoenixParser.New_table_refContext ctx) {
    final var methodName = "exitNew_table_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNumber(final PhoenixParser.NumberContext ctx) {
    final var methodName = "exitNumber";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNumeric(final PhoenixParser.NumericContext ctx) {
    final var methodName = "exitNumeric";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_schema_table(final PhoenixParser.On_schema_tableContext ctx) {
    final var methodName = "exitOn_schema_table";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpen_cursor_command(final PhoenixParser.Open_cursor_commandContext ctx) {
    final var methodName = "exitOpen_cursor_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOption(final PhoenixParser.OptionContext ctx) {
    final var methodName = "exitOption";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptions_(final PhoenixParser.Options_Context ctx) {
    final var methodName = "exitOptions_";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptions_list(final PhoenixParser.Options_listContext ctx) {
    final var methodName = "exitOptions_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder(final PhoenixParser.OrderContext ctx) {
    final var methodName = "exitOrder";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_by_clause(final PhoenixParser.Order_by_clauseContext ctx) {
    final var methodName = "exitOrder_by_clause";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_list(final PhoenixParser.Order_listContext ctx) {
    final var methodName = "exitOrder_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOther_command(final PhoenixParser.Other_commandContext ctx) {
    final var methodName = "exitOther_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPermission_string(final PhoenixParser.Permission_stringContext ctx) {
    final var methodName = "exitPermission_string";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPhoenix_file(final PhoenixParser.Phoenix_fileContext ctx) {
    final var methodName = "exitPhoenix_file";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPositive_decimal(final PhoenixParser.Positive_decimalContext ctx) {
    final var methodName = "exitPositive_decimal";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecision_int(final PhoenixParser.Precision_intContext ctx) {
    final var methodName = "exitPrecision_int";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuoted_name(final PhoenixParser.Quoted_nameContext ctx) {
    final var methodName = "exitQuoted_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevoke_command(final PhoenixParser.Revoke_commandContext ctx) {
    final var methodName = "exitRevoke_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRow_rows(final PhoenixParser.Row_rowsContext ctx) {
    final var methodName = "exitRow_rows";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRow_value_constructor(final PhoenixParser.Row_value_constructorContext ctx) {
    final var methodName = "exitRow_value_constructor";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitScale_int(final PhoenixParser.Scale_intContext ctx) {
    final var methodName = "exitScale_int";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitScan_hint(final PhoenixParser.Scan_hintContext ctx) {
    final var methodName = "exitScan_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSchema_name(final PhoenixParser.Schema_nameContext ctx) {
    final var methodName = "exitSchema_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSeek_to_column_hint(final PhoenixParser.Seek_to_column_hintContext ctx) {
    final var methodName = "exitSeek_to_column_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_command(final PhoenixParser.Select_commandContext ctx) {
    final var methodName = "exitSelect_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_expression(final PhoenixParser.Select_expressionContext ctx) {
    final var methodName = "exitSelect_expression";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_statement(final PhoenixParser.Select_statementContext ctx) {
    final var methodName = "exitSelect_statement";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSequence(final PhoenixParser.SequenceContext ctx) {
    final var methodName = "exitSequence";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSequence_name(final PhoenixParser.Sequence_nameContext ctx) {
    final var methodName = "exitSequence_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSequence_ref(final PhoenixParser.Sequence_refContext ctx) {
    final var methodName = "exitSequence_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSerial_hint(final PhoenixParser.Serial_hintContext ctx) {
    final var methodName = "exitSerial_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSmall_hint(final PhoenixParser.Small_hintContext ctx) {
    final var methodName = "exitSmall_hint";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSplit_point(final PhoenixParser.Split_pointContext ctx) {
    final var methodName = "exitSplit_point";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSplit_point_list(final PhoenixParser.Split_point_listContext ctx) {
    final var methodName = "exitSplit_point_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_command(final PhoenixParser.Sql_commandContext ctx) {
    final var methodName = "exitSql_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_data_type(final PhoenixParser.Sql_data_typeContext ctx) {
    final var methodName = "exitSql_data_type";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitString(final PhoenixParser.StringContext ctx) {
    final var methodName = "exitString";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_alias(final PhoenixParser.Table_aliasContext ctx) {
    final var methodName = "exitTable_alias";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_name(final PhoenixParser.Table_nameContext ctx) {
    final var methodName = "exitTable_name";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_options(final PhoenixParser.Table_optionsContext ctx) {
    final var methodName = "exitTable_options";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PhoenixParser.Options_Context.class)
        .streamChildrenByClass(PhoenixParser.OptionContext.class)
        .streamChildrenByClass(PhoenixParser.NameContext.class)
        .filter(TerminalNode.class::isInstance)
        .forEach(
            terminalNode -> {
              final var terminalNodeText = ParseTreeHelper.trimToken(terminalNode.getText());
              if (StringUtils.isNoneBlank(terminalNodeText)) {
                if (Strings.CI.equals("DISABLE_WAL", terminalNodeText)) {
                  ParseTreeStream.parseTreeStream(
                          ((PhoenixParser.OptionContext) terminalNode.getParent().getParent())
                              .children)
                      .streamChildrenByClass(PhoenixParser.LiteralContext.class)
                      .streamChildrenByClass(PhoenixParser.True_falseContext.class)
                      .streamTerminalNodeString()
                      .forEach(
                          terminalNodeText2 ->
                              currentTable
                                  .getAttributes()
                                  .put(
                                      SqlContextImpl.DISABLE_WAL,
                                      NotNullSet.getInstance(terminalNodeText2)));
                } else if (Strings.CI.equals("STORE_NULLS", terminalNodeText)) {
                  ParseTreeStream.parseTreeStream(
                          ((PhoenixParser.OptionContext) terminalNode.getParent().getParent())
                              .children)
                      .streamChildrenByClass(PhoenixParser.LiteralContext.class)
                      .streamChildrenByClass(PhoenixParser.True_falseContext.class)
                      .streamTerminalNodeString()
                      .forEach(
                          terminalNodeText2 ->
                              currentTable
                                  .getAttributes()
                                  .put(
                                      SqlContextImpl.NULLABLE,
                                      NotNullSet.getInstance(terminalNodeText2)));
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
  public void exitTable_ref(final PhoenixParser.Table_refContext ctx) {
    final var methodName = "exitTable_ref";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_spec(final PhoenixParser.Table_specContext ctx) {
    final var methodName = "exitTable_spec";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrue_false(final PhoenixParser.True_falseContext ctx) {
    final var methodName = "exitTrue_false";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnion(final PhoenixParser.UnionContext ctx) {
    final var methodName = "exitUnion";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnion_list(final PhoenixParser.Union_listContext ctx) {
    final var methodName = "exitUnion_list";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_statistics_command(
      final PhoenixParser.Update_statistics_commandContext ctx) {
    final var methodName = "exitUpdate_statistics_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpsert_select_command(final PhoenixParser.Upsert_select_commandContext ctx) {
    final var methodName = "exitUpsert_select_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpsert_values_command(final PhoenixParser.Upsert_values_commandContext ctx) {
    final var methodName = "exitUpsert_values_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUse_command(final PhoenixParser.Use_commandContext ctx) {
    final var methodName = "exitUse_command";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUser_string(final PhoenixParser.User_stringContext ctx) {
    final var methodName = "exitUser_string";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhere_clause(final PhoenixParser.Where_clauseContext ctx) {
    final var methodName = "exitWhere_clause";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);
  }

  private List<ObjectField> getCurrentFieldList(final ParserRuleContext ctx) {
    final var methodName = "getCurrentFieldList";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    return ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PhoenixParser.Column_refContext.class)
        .streamChildrenByClass(PhoenixParser.Column_nameContext.class)
        .streamChildrenByClass(PhoenixParser.NameContext.class)
        .map(child -> ParseTreeHelper.getField(currentTable, child))
        .collect(Collectors.toList());
  }

  private SqlContext getCurrentTable(final ParserRuleContext ctx) {
    final var methodName = "getCurrentTable";
    PhoenixParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, PhoenixParser.Create_table_commandContext.class);
    if (parentContext == null || parentContext.children == null) {
      return null;
    }

    final List<String> terminalNodeTextList =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PhoenixParser.Table_refContext.class)
            .streamChildrenByClass(PhoenixParser.Schema_nameContext.class)
            .streamChildrenByClass(PhoenixParser.NameContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PhoenixParser.Table_refContext.class)
            .streamChildrenByClass(PhoenixParser.Table_nameContext.class)
            .streamChildrenByClass(PhoenixParser.NameContext.class)
            .streamTerminalNodeString()
            .toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PhoenixParser.Table_refContext.class)
            .streamChildrenByClass(PhoenixParser.Table_nameContext.class)
            .streamChildrenByClass(PhoenixParser.NameContext.class)
            .streamChildrenByClass(PhoenixParser.Quoted_nameContext.class)
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
  public void visitErrorNode(final ErrorNode node) {
    final var methodName = "visitErrorNode";
    PhoenixParserListenerImpl.traceChildren(methodName, node);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void visitTerminal(final TerminalNode node) {
    final var methodName = "visitTerminal";
    PhoenixParserListenerImpl.traceChildren(methodName, node);

    PhoenixParserListenerImpl.input = node.getSymbol().getInputStream();
  }
}
