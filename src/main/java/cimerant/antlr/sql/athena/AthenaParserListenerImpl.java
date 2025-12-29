package cimerant.antlr.sql.athena;

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
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Strings;
import sql.athena.AthenaParser;
import sql.athena.AthenaParserBaseListener;
import sql.athena.AthenaParserListener;

/**
 * This class provides an empty implementation of {@link AthenaParserListener}, which can be
 * extended to create a listener which only needs to handle a subset of the available methods.
 */
public class AthenaParserListenerImpl extends AthenaParserBaseListener {
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(AthenaParserListenerImpl.class.getName());
  }

  private static void traceChildren(final String methodName, final ParseTree ctx) {
    if (AthenaParserListenerImpl.logger.isTraceEnabled()) {
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
  public void enterAlias(final AthenaParser.AliasContext ctx) {
    final var methodName = "enterAlias";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAll_distinct(final AthenaParser.All_distinctContext ctx) {
    final var methodName = "enterAll_distinct";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_database(final AthenaParser.Alter_databaseContext ctx) {
    final var methodName = "enterAlter_database";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_add_cols(final AthenaParser.Alter_table_add_colsContext ctx) {
    final var methodName = "enterAlter_table_add_cols";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_add_part(final AthenaParser.Alter_table_add_partContext ctx) {
    final var methodName = "enterAlter_table_add_part";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_drop_part(final AthenaParser.Alter_table_drop_partContext ctx) {
    final var methodName = "enterAlter_table_drop_part";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_rename_part(final AthenaParser.Alter_table_rename_partContext ctx) {
    final var methodName = "enterAlter_table_rename_part";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_replace_part(
      final AthenaParser.Alter_table_replace_partContext ctx) {
    final var methodName = "enterAlter_table_replace_part";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_set_location(
      final AthenaParser.Alter_table_set_locationContext ctx) {
    final var methodName = "enterAlter_table_set_location";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_set_props(final AthenaParser.Alter_table_set_propsContext ctx) {
    final var methodName = "enterAlter_table_set_props";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBoolean_expression(final AthenaParser.Boolean_expressionContext ctx) {
    final var methodName = "enterBoolean_expression";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCase_expression(final AthenaParser.Case_expressionContext ctx) {
    final var methodName = "enterCase_expression";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCol_comment(final AthenaParser.Col_commentContext ctx) {
    final var methodName = "enterCol_comment";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCol_def_with_comment(final AthenaParser.Col_def_with_commentContext ctx) {
    final var methodName = "enterCol_def_with_comment";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCol_name(final AthenaParser.Col_nameContext ctx) {
    final var methodName = "enterCol_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_list(final AthenaParser.Column_listContext ctx) {
    final var methodName = "enterColumn_list";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommand(final AthenaParser.CommandContext ctx) {
    final var methodName = "enterCommand";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComparison_operator(final AthenaParser.Comparison_operatorContext ctx) {
    final var methodName = "enterComparison_operator";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCondition(final AthenaParser.ConditionContext ctx) {
    final var methodName = "enterCondition";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCount(final AthenaParser.CountContext ctx) {
    final var methodName = "enterCount";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_database(final AthenaParser.Create_databaseContext ctx) {
    final var methodName = "enterCreate_database";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_table(final AthenaParser.Create_tableContext ctx) {
    final var methodName = "enterCreate_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_table_as(final AthenaParser.Create_table_asContext ctx) {
    final var methodName = "enterCreate_table_as";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_view(final AthenaParser.Create_viewContext ctx) {
    final var methodName = "enterCreate_view";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterData_type(final AthenaParser.Data_typeContext ctx) {
    final var methodName = "enterData_type";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatabase_name(final AthenaParser.Database_nameContext ctx) {
    final var methodName = "enterDatabase_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDb_name(final AthenaParser.Db_nameContext ctx) {
    final var methodName = "enterDb_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDb_schema(final AthenaParser.Db_schemaContext ctx) {
    final var methodName = "enterDb_schema";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDdl_command(final AthenaParser.Ddl_commandContext ctx) {
    final var methodName = "enterDdl_command";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeallocate(final AthenaParser.DeallocateContext ctx) {
    final var methodName = "enterDeallocate";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDelete_stmt(final AthenaParser.Delete_stmtContext ctx) {
    final var methodName = "enterDelete_stmt";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe(final AthenaParser.DescribeContext ctx) {
    final var methodName = "enterDescribe";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_view(final AthenaParser.Describe_viewContext ctx) {
    final var methodName = "enterDescribe_view";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDestination_table(final AthenaParser.Destination_tableContext ctx) {
    final var methodName = "enterDestination_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDml_command(final AthenaParser.Dml_commandContext ctx) {
    final var methodName = "enterDml_command";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_database(final AthenaParser.Drop_databaseContext ctx) {
    final var methodName = "enterDrop_database";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_table(final AthenaParser.Drop_tableContext ctx) {
    final var methodName = "enterDrop_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_view(final AthenaParser.Drop_viewContext ctx) {
    final var methodName = "enterDrop_view";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    final var methodName = "enterEveryRule";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecute(final AthenaParser.ExecuteContext ctx) {
    final var methodName = "enterExecute";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplain(final AthenaParser.ExplainContext ctx) {
    final var methodName = "enterExplain";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplain_option(final AthenaParser.Explain_optionContext ctx) {
    final var methodName = "enterExplain_option";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpression(final AthenaParser.ExpressionContext ctx) {
    final var methodName = "enterExpression";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpression_list_(final AthenaParser.Expression_list_Context ctx) {
    final var methodName = "enterExpression_list_";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterField_name(final AthenaParser.Field_nameContext ctx) {
    final var methodName = "enterField_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFile_format(final AthenaParser.File_formatContext ctx) {
    final var methodName = "enterFile_format";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrom_in(final AthenaParser.From_inContext ctx) {
    final var methodName = "enterFrom_in";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrom_item(final AthenaParser.From_itemContext ctx) {
    final var methodName = "enterFrom_item";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrouping_element(final AthenaParser.Grouping_elementContext ctx) {
    final var methodName = "enterGrouping_element";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterId_(final AthenaParser.Id_Context ctx) {
    final var methodName = "enterId_";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIf_exists(final AthenaParser.If_existsContext ctx) {
    final var methodName = "enterIf_exists";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIf_not_exists(final AthenaParser.If_not_existsContext ctx) {
    final var methodName = "enterIf_not_exists";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsert_into(final AthenaParser.Insert_intoContext ctx) {
    final var methodName = "enterInsert_into";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInt_number(final AthenaParser.Int_numberContext ctx) {
    final var methodName = "enterInt_number";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKv_pair(final AthenaParser.Kv_pairContext ctx) {
    final var methodName = "enterKv_pair";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLiteral(final AthenaParser.LiteralContext ctx) {
    final var methodName = "enterLiteral";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_into(final AthenaParser.Merge_intoContext ctx) {
    final var methodName = "enterMerge_into";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMsck(final AthenaParser.MsckContext ctx) {
    final var methodName = "enterMsck";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNum_buckets(final AthenaParser.Num_bucketsContext ctx) {
    final var methodName = "enterNum_buckets";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNumber(final AthenaParser.NumberContext ctx) {
    final var methodName = "enterNumber";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptimize_stmt(final AthenaParser.Optimize_stmtContext ctx) {
    final var methodName = "enterOptimize_stmt";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOr_replace(final AthenaParser.Or_replaceContext ctx) {
    final var methodName = "enterOr_replace";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_item(final AthenaParser.Order_itemContext ctx) {
    final var methodName = "enterOrder_item";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParameter(final AthenaParser.ParameterContext ctx) {
    final var methodName = "enterParameter";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPart_col_name_value(final AthenaParser.Part_col_name_valueContext ctx) {
    final var methodName = "enterPart_col_name_value";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_col_name(final AthenaParser.Partition_col_nameContext ctx) {
    final var methodName = "enterPartition_col_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_col_value(final AthenaParser.Partition_col_valueContext ctx) {
    final var methodName = "enterPartition_col_value";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_spec(final AthenaParser.Partition_specContext ctx) {
    final var methodName = "enterPartition_spec";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecision(final AthenaParser.PrecisionContext ctx) {
    final var methodName = "enterPrecision";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPred(final AthenaParser.PredContext ctx) {
    final var methodName = "enterPred";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPredicate(final AthenaParser.PredicateContext ctx) {
    final var methodName = "enterPredicate";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrepare(final AthenaParser.PrepareContext ctx) {
    final var methodName = "enterPrepare";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimitive_expression(final AthenaParser.Primitive_expressionContext ctx) {
    final var methodName = "enterPrimitive_expression";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimitive_type(final AthenaParser.Primitive_typeContext ctx) {
    final var methodName = "enterPrimitive_type";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProp_exp(final AthenaParser.Prop_expContext ctx) {
    final var methodName = "enterProp_exp";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProperty_list(final AthenaParser.Property_listContext ctx) {
    final var methodName = "enterProperty_list";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProperty_name(final AthenaParser.Property_nameContext ctx) {
    final var methodName = "enterProperty_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProperty_value(final AthenaParser.Property_valueContext ctx) {
    final var methodName = "enterProperty_value";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuery(final AthenaParser.QueryContext ctx) {
    final var methodName = "enterQuery";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReg_ex(final AthenaParser.Reg_exContext ctx) {
    final var methodName = "enterReg_ex";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRow_format(final AthenaParser.Row_formatContext ctx) {
    final var methodName = "enterRow_format";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterScale(final AthenaParser.ScaleContext ctx) {
    final var methodName = "enterScale";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSearch_condition(final AthenaParser.Search_conditionContext ctx) {
    final var methodName = "enterSearch_condition";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect(final AthenaParser.SelectContext ctx) {
    final var methodName = "enterSelect";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_item(final AthenaParser.Select_itemContext ctx) {
    final var methodName = "enterSelect_item";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_list(final AthenaParser.Select_listContext ctx) {
    final var methodName = "enterSelect_list";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_statement(final AthenaParser.Select_statementContext ctx) {
    final var methodName = "enterSelect_statement";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_columns(final AthenaParser.Show_columnsContext ctx) {
    final var methodName = "enterShow_columns";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_create_table(final AthenaParser.Show_create_tableContext ctx) {
    final var methodName = "enterShow_create_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_create_view(final AthenaParser.Show_create_viewContext ctx) {
    final var methodName = "enterShow_create_view";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_databases(final AthenaParser.Show_databasesContext ctx) {
    final var methodName = "enterShow_databases";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_partitions(final AthenaParser.Show_partitionsContext ctx) {
    final var methodName = "enterShow_partitions";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_tables(final AthenaParser.Show_tablesContext ctx) {
    final var methodName = "enterShow_tables";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_tblproperties(final AthenaParser.Show_tblpropertiesContext ctx) {
    final var methodName = "enterShow_tblproperties";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_views(final AthenaParser.Show_viewsContext ctx) {
    final var methodName = "enterShow_views";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSource_alias(final AthenaParser.Source_aliasContext ctx) {
    final var methodName = "enterSource_alias";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSource_table(final AthenaParser.Source_tableContext ctx) {
    final var methodName = "enterSource_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStatement(final AthenaParser.StatementContext ctx) {
    final var methodName = "enterStatement";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStatement_name(final AthenaParser.Statement_nameContext ctx) {
    final var methodName = "enterStatement_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt(final AthenaParser.StmtContext ctx) {
    final var methodName = "enterStmt";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterString(final AthenaParser.StringContext ctx) {
    final var methodName = "enterString";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStruct_col_def(final AthenaParser.Struct_col_defContext ctx) {
    final var methodName = "enterStruct_col_def";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_comment(final AthenaParser.Table_commentContext ctx) {
    final var methodName = "enterTable_comment";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_name(final AthenaParser.Table_nameContext ctx) {
    final var methodName = "enterTable_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_row_format_coll_items_identifier(
      final AthenaParser.Table_row_format_coll_items_identifierContext ctx) {
    final var methodName = "enterTable_row_format_coll_items_identifier";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_row_format_field_identifier(
      final AthenaParser.Table_row_format_field_identifierContext ctx) {
    final var methodName = "enterTable_row_format_field_identifier";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_row_format_lines_identifier(
      final AthenaParser.Table_row_format_lines_identifierContext ctx) {
    final var methodName = "enterTable_row_format_lines_identifier";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_row_format_map_keys_identifier(
      final AthenaParser.Table_row_format_map_keys_identifierContext ctx) {
    final var methodName = "enterTable_row_format_map_keys_identifier";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_row_null_format(final AthenaParser.Table_row_null_formatContext ctx) {
    final var methodName = "enterTable_row_null_format";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_subquery(final AthenaParser.Table_subqueryContext ctx) {
    final var methodName = "enterTable_subquery";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTarget_alias(final AthenaParser.Target_aliasContext ctx) {
    final var methodName = "enterTarget_alias";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTarget_table(final AthenaParser.Target_tableContext ctx) {
    final var methodName = "enterTarget_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrue_false(final AthenaParser.True_falseContext ctx) {
    final var methodName = "enterTrue_false";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnload(final AthenaParser.UnloadContext ctx) {
    final var methodName = "enterUnload";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate(final AthenaParser.UpdateContext ctx) {
    final var methodName = "enterUpdate";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_delete(final AthenaParser.Update_deleteContext ctx) {
    final var methodName = "enterUpdate_delete";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVacuum(final AthenaParser.VacuumContext ctx) {
    final var methodName = "enterVacuum";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValue(final AthenaParser.ValueContext ctx) {
    final var methodName = "enterValue";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValue_list(final AthenaParser.Value_listContext ctx) {
    final var methodName = "enterValue_list";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterView_name(final AthenaParser.View_nameContext ctx) {
    final var methodName = "enterView_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhen_clauses(final AthenaParser.When_clausesContext ctx) {
    final var methodName = "enterWhen_clauses";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhen_expression(final AthenaParser.When_expressionContext ctx) {
    final var methodName = "enterWhen_expression";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhen_matched_and_clause(final AthenaParser.When_matched_and_clauseContext ctx) {
    final var methodName = "enterWhen_matched_and_clause";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhen_matched_then_clause(
      final AthenaParser.When_matched_then_clauseContext ctx) {
    final var methodName = "enterWhen_matched_then_clause";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhen_not_matched_clause(final AthenaParser.When_not_matched_clauseContext ctx) {
    final var methodName = "enterWhen_not_matched_clause";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWith_query(final AthenaParser.With_queryContext ctx) {
    final var methodName = "enterWith_query";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlias(final AthenaParser.AliasContext ctx) {
    final var methodName = "exitAlias";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAll_distinct(final AthenaParser.All_distinctContext ctx) {
    final var methodName = "exitAll_distinct";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_database(final AthenaParser.Alter_databaseContext ctx) {
    final var methodName = "exitAlter_database";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_add_cols(final AthenaParser.Alter_table_add_colsContext ctx) {
    final var methodName = "exitAlter_table_add_cols";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_add_part(final AthenaParser.Alter_table_add_partContext ctx) {
    final var methodName = "exitAlter_table_add_part";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_drop_part(final AthenaParser.Alter_table_drop_partContext ctx) {
    final var methodName = "exitAlter_table_drop_part";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_rename_part(final AthenaParser.Alter_table_rename_partContext ctx) {
    final var methodName = "exitAlter_table_rename_part";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_replace_part(final AthenaParser.Alter_table_replace_partContext ctx) {
    final var methodName = "exitAlter_table_replace_part";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_set_location(final AthenaParser.Alter_table_set_locationContext ctx) {
    final var methodName = "exitAlter_table_set_location";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_set_props(final AthenaParser.Alter_table_set_propsContext ctx) {
    final var methodName = "exitAlter_table_set_props";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBoolean_expression(final AthenaParser.Boolean_expressionContext ctx) {
    final var methodName = "exitBoolean_expression";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCase_expression(final AthenaParser.Case_expressionContext ctx) {
    final var methodName = "exitCase_expression";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCol_comment(final AthenaParser.Col_commentContext ctx) {
    final var methodName = "exitCol_comment";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCol_def_with_comment(final AthenaParser.Col_def_with_commentContext ctx) {
    final var methodName = "exitCol_def_with_comment";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    final var primitiveTypeChildren =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(AthenaParser.Data_typeContext.class)
            .listChildrenByClass(AthenaParser.Primitive_typeContext.class);

    ParseTreeStream.parseTreeStream(primitiveTypeChildren)
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
    ParseTreeStream.parseTreeStream(primitiveTypeChildren)
        .streamChildrenByClass(AthenaParser.Int_numberContext.class)
        .streamTerminalNodeString()
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
  public void exitCol_name(final AthenaParser.Col_nameContext ctx) {
    final var methodName = "exitCol_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_list(final AthenaParser.Column_listContext ctx) {
    final var methodName = "exitColumn_list";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommand(final AthenaParser.CommandContext ctx) {
    final var methodName = "exitCommand";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComparison_operator(final AthenaParser.Comparison_operatorContext ctx) {
    final var methodName = "exitComparison_operator";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCondition(final AthenaParser.ConditionContext ctx) {
    final var methodName = "exitCondition";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCount(final AthenaParser.CountContext ctx) {
    final var methodName = "exitCount";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_database(final AthenaParser.Create_databaseContext ctx) {
    final var methodName = "exitCreate_database";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_table(final AthenaParser.Create_tableContext ctx) {
    final var methodName = "exitCreate_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);

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
  public void exitCreate_table_as(final AthenaParser.Create_table_asContext ctx) {
    final var methodName = "exitCreate_table_as";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_view(final AthenaParser.Create_viewContext ctx) {
    final var methodName = "exitCreate_view";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitData_type(final AthenaParser.Data_typeContext ctx) {
    final var methodName = "exitData_type";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatabase_name(final AthenaParser.Database_nameContext ctx) {
    final var methodName = "exitDatabase_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDb_name(final AthenaParser.Db_nameContext ctx) {
    final var methodName = "exitDb_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDb_schema(final AthenaParser.Db_schemaContext ctx) {
    final var methodName = "exitDb_schema";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDdl_command(final AthenaParser.Ddl_commandContext ctx) {
    final var methodName = "exitDdl_command";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeallocate(final AthenaParser.DeallocateContext ctx) {
    final var methodName = "exitDeallocate";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDelete_stmt(final AthenaParser.Delete_stmtContext ctx) {
    final var methodName = "exitDelete_stmt";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe(final AthenaParser.DescribeContext ctx) {
    final var methodName = "exitDescribe";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_view(final AthenaParser.Describe_viewContext ctx) {
    final var methodName = "exitDescribe_view";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDestination_table(final AthenaParser.Destination_tableContext ctx) {
    final var methodName = "exitDestination_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDml_command(final AthenaParser.Dml_commandContext ctx) {
    final var methodName = "exitDml_command";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_database(final AthenaParser.Drop_databaseContext ctx) {
    final var methodName = "exitDrop_database";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_table(final AthenaParser.Drop_tableContext ctx) {
    final var methodName = "exitDrop_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_view(final AthenaParser.Drop_viewContext ctx) {
    final var methodName = "exitDrop_view";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    final var methodName = "exitEveryRule";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecute(final AthenaParser.ExecuteContext ctx) {
    final var methodName = "exitExecute";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplain(final AthenaParser.ExplainContext ctx) {
    final var methodName = "exitExplain";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplain_option(final AthenaParser.Explain_optionContext ctx) {
    final var methodName = "exitExplain_option";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpression(final AthenaParser.ExpressionContext ctx) {
    final var methodName = "exitExpression";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpression_list_(final AthenaParser.Expression_list_Context ctx) {
    final var methodName = "exitExpression_list_";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitField_name(final AthenaParser.Field_nameContext ctx) {
    final var methodName = "exitField_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFile_format(final AthenaParser.File_formatContext ctx) {
    final var methodName = "exitFile_format";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrom_in(final AthenaParser.From_inContext ctx) {
    final var methodName = "exitFrom_in";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrom_item(final AthenaParser.From_itemContext ctx) {
    final var methodName = "exitFrom_item";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrouping_element(final AthenaParser.Grouping_elementContext ctx) {
    final var methodName = "exitGrouping_element";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitId_(final AthenaParser.Id_Context ctx) {
    final var methodName = "exitId_";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIf_exists(final AthenaParser.If_existsContext ctx) {
    final var methodName = "exitIf_exists";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIf_not_exists(final AthenaParser.If_not_existsContext ctx) {
    final var methodName = "exitIf_not_exists";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsert_into(final AthenaParser.Insert_intoContext ctx) {
    final var methodName = "exitInsert_into";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInt_number(final AthenaParser.Int_numberContext ctx) {
    final var methodName = "exitInt_number";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKv_pair(final AthenaParser.Kv_pairContext ctx) {
    final var methodName = "exitKv_pair";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLiteral(final AthenaParser.LiteralContext ctx) {
    final var methodName = "exitLiteral";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_into(final AthenaParser.Merge_intoContext ctx) {
    final var methodName = "exitMerge_into";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMsck(final AthenaParser.MsckContext ctx) {
    final var methodName = "exitMsck";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNum_buckets(final AthenaParser.Num_bucketsContext ctx) {
    final var methodName = "exitNum_buckets";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNumber(final AthenaParser.NumberContext ctx) {
    final var methodName = "exitNumber";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptimize_stmt(final AthenaParser.Optimize_stmtContext ctx) {
    final var methodName = "exitOptimize_stmt";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOr_replace(final AthenaParser.Or_replaceContext ctx) {
    final var methodName = "exitOr_replace";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_item(final AthenaParser.Order_itemContext ctx) {
    final var methodName = "exitOrder_item";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParameter(final AthenaParser.ParameterContext ctx) {
    final var methodName = "exitParameter";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPart_col_name_value(final AthenaParser.Part_col_name_valueContext ctx) {
    final var methodName = "exitPart_col_name_value";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_col_name(final AthenaParser.Partition_col_nameContext ctx) {
    final var methodName = "exitPartition_col_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_col_value(final AthenaParser.Partition_col_valueContext ctx) {
    final var methodName = "exitPartition_col_value";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_spec(final AthenaParser.Partition_specContext ctx) {
    final var methodName = "exitPartition_spec";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecision(final AthenaParser.PrecisionContext ctx) {
    final var methodName = "exitPrecision";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPred(final AthenaParser.PredContext ctx) {
    final var methodName = "exitPred";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPredicate(final AthenaParser.PredicateContext ctx) {
    final var methodName = "exitPredicate";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrepare(final AthenaParser.PrepareContext ctx) {
    final var methodName = "exitPrepare";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimitive_expression(final AthenaParser.Primitive_expressionContext ctx) {
    final var methodName = "exitPrimitive_expression";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimitive_type(final AthenaParser.Primitive_typeContext ctx) {
    final var methodName = "exitPrimitive_type";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProp_exp(final AthenaParser.Prop_expContext ctx) {
    final var methodName = "exitProp_exp";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProperty_list(final AthenaParser.Property_listContext ctx) {
    final var methodName = "exitProperty_list";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProperty_name(final AthenaParser.Property_nameContext ctx) {
    final var methodName = "exitProperty_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProperty_value(final AthenaParser.Property_valueContext ctx) {
    final var methodName = "exitProperty_value";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuery(final AthenaParser.QueryContext ctx) {
    final var methodName = "exitQuery";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReg_ex(final AthenaParser.Reg_exContext ctx) {
    final var methodName = "exitReg_ex";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRow_format(final AthenaParser.Row_formatContext ctx) {
    final var methodName = "exitRow_format";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitScale(final AthenaParser.ScaleContext ctx) {
    final var methodName = "exitScale";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSearch_condition(final AthenaParser.Search_conditionContext ctx) {
    final var methodName = "exitSearch_condition";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect(final AthenaParser.SelectContext ctx) {
    final var methodName = "exitSelect";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_item(final AthenaParser.Select_itemContext ctx) {
    final var methodName = "exitSelect_item";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_list(final AthenaParser.Select_listContext ctx) {
    final var methodName = "exitSelect_list";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_statement(final AthenaParser.Select_statementContext ctx) {
    final var methodName = "exitSelect_statement";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_columns(final AthenaParser.Show_columnsContext ctx) {
    final var methodName = "exitShow_columns";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_create_table(final AthenaParser.Show_create_tableContext ctx) {
    final var methodName = "exitShow_create_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_create_view(final AthenaParser.Show_create_viewContext ctx) {
    final var methodName = "exitShow_create_view";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_databases(final AthenaParser.Show_databasesContext ctx) {
    final var methodName = "exitShow_databases";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_partitions(final AthenaParser.Show_partitionsContext ctx) {
    final var methodName = "exitShow_partitions";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_tables(final AthenaParser.Show_tablesContext ctx) {
    final var methodName = "exitShow_tables";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_tblproperties(final AthenaParser.Show_tblpropertiesContext ctx) {
    final var methodName = "exitShow_tblproperties";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_views(final AthenaParser.Show_viewsContext ctx) {
    final var methodName = "exitShow_views";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSource_alias(final AthenaParser.Source_aliasContext ctx) {
    final var methodName = "exitSource_alias";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSource_table(final AthenaParser.Source_tableContext ctx) {
    final var methodName = "exitSource_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStatement(final AthenaParser.StatementContext ctx) {
    final var methodName = "exitStatement";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStatement_name(final AthenaParser.Statement_nameContext ctx) {
    final var methodName = "exitStatement_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt(final AthenaParser.StmtContext ctx) {
    final var methodName = "exitStmt";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitString(final AthenaParser.StringContext ctx) {
    final var methodName = "exitString";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStruct_col_def(final AthenaParser.Struct_col_defContext ctx) {
    final var methodName = "exitStruct_col_def";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_comment(final AthenaParser.Table_commentContext ctx) {
    final var methodName = "exitTable_comment";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_name(final AthenaParser.Table_nameContext ctx) {
    final var methodName = "exitTable_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_row_format_coll_items_identifier(
      final AthenaParser.Table_row_format_coll_items_identifierContext ctx) {
    final var methodName = "exitTable_row_format_coll_items_identifier";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_row_format_field_identifier(
      final AthenaParser.Table_row_format_field_identifierContext ctx) {
    final var methodName = "exitTable_row_format_field_identifier";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_row_format_lines_identifier(
      final AthenaParser.Table_row_format_lines_identifierContext ctx) {
    final var methodName = "exitTable_row_format_lines_identifier";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_row_format_map_keys_identifier(
      final AthenaParser.Table_row_format_map_keys_identifierContext ctx) {
    final var methodName = "exitTable_row_format_map_keys_identifier";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_row_null_format(final AthenaParser.Table_row_null_formatContext ctx) {
    final var methodName = "exitTable_row_null_format";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_subquery(final AthenaParser.Table_subqueryContext ctx) {
    final var methodName = "exitTable_subquery";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTarget_alias(final AthenaParser.Target_aliasContext ctx) {
    final var methodName = "exitTarget_alias";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTarget_table(final AthenaParser.Target_tableContext ctx) {
    final var methodName = "exitTarget_table";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrue_false(final AthenaParser.True_falseContext ctx) {
    final var methodName = "exitTrue_false";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnload(final AthenaParser.UnloadContext ctx) {
    final var methodName = "exitUnload";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate(final AthenaParser.UpdateContext ctx) {
    final var methodName = "exitUpdate";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_delete(final AthenaParser.Update_deleteContext ctx) {
    final var methodName = "exitUpdate_delete";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVacuum(final AthenaParser.VacuumContext ctx) {
    final var methodName = "exitVacuum";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValue(final AthenaParser.ValueContext ctx) {
    final var methodName = "exitValue";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValue_list(final AthenaParser.Value_listContext ctx) {
    final var methodName = "exitValue_list";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitView_name(final AthenaParser.View_nameContext ctx) {
    final var methodName = "exitView_name";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhen_clauses(final AthenaParser.When_clausesContext ctx) {
    final var methodName = "exitWhen_clauses";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhen_expression(final AthenaParser.When_expressionContext ctx) {
    final var methodName = "exitWhen_expression";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhen_matched_and_clause(final AthenaParser.When_matched_and_clauseContext ctx) {
    final var methodName = "exitWhen_matched_and_clause";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhen_matched_then_clause(final AthenaParser.When_matched_then_clauseContext ctx) {
    final var methodName = "exitWhen_matched_then_clause";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhen_not_matched_clause(final AthenaParser.When_not_matched_clauseContext ctx) {
    final var methodName = "exitWhen_not_matched_clause";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWith_query(final AthenaParser.With_queryContext ctx) {
    final var methodName = "exitWith_query";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);
  }

  private List<ObjectField> getCurrentFieldList(final ParserRuleContext ctx) {
    final var methodName = "getCurrentFieldList";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var terminalNodeList =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(AthenaParser.Col_nameContext.class)
            .streamChildrenByClass(AthenaParser.Id_Context.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet());

    return terminalNodeList.stream()
        .map(child -> ParseTreeHelper.getField(currentTable, child))
        .collect(Collectors.toList());
  }

  private SqlContext getCurrentTable(final ParserRuleContext ctx) {
    final var methodName = "getCurrentTable";
    AthenaParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, AthenaParser.Create_tableContext.class);
    if (parentContext == null || parentContext.children == null) {
      return null;
    }

    final var terminalNodeTextList =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(AthenaParser.Table_nameContext.class)
            .streamChildrenByClass(AthenaParser.Id_Context.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList());

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
    AthenaParserListenerImpl.traceChildren(methodName, node);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void visitTerminal(final TerminalNode node) {
    final var methodName = "visitTerminal";
    AthenaParserListenerImpl.traceChildren(methodName, node);
  }
}
