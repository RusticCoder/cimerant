package cimerant.antlr.sql.sqlite;

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
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import sql.sqlite.SQLiteParser;
import sql.sqlite.SQLiteParserBaseListener;
import sql.sqlite.SQLiteParserListener;

/**
 * This class provides an empty implementation of {@link SQLiteParserListener}, which can be
 * extended to create a listener which only needs to handle a subset of the available methods.
 */
public class SQLiteParserListenerImpl extends SQLiteParserBaseListener {
  private static CharStream input;
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(SQLiteParserListenerImpl.class.getName());
  }

  private static final void traceChildren(final String methodName, final ParseTree ctx) {
    if (SQLiteParserListenerImpl.logger.isTraceEnabled()) {
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
  public void enterAggregate_func(final SQLiteParser.Aggregate_funcContext ctx) {
    final var methodName = "enterAggregate_func";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggregate_function_invocation(
      final SQLiteParser.Aggregate_function_invocationContext ctx) {
    final var methodName = "enterAggregate_function_invocation";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlias(final SQLiteParser.AliasContext ctx) {
    final var methodName = "enterAlias";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_stmt(final SQLiteParser.Alter_table_stmtContext ctx) {
    final var methodName = "enterAlter_table_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAnalyze_stmt(final SQLiteParser.Analyze_stmtContext ctx) {
    final var methodName = "enterAnalyze_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAny_name(final SQLiteParser.Any_nameContext ctx) {
    final var methodName = "enterAny_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAsc_desc(final SQLiteParser.Asc_descContext ctx) {
    final var methodName = "enterAsc_desc";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAttach_stmt(final SQLiteParser.Attach_stmtContext ctx) {
    final var methodName = "enterAttach_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBase_window_name(final SQLiteParser.Base_window_nameContext ctx) {
    final var methodName = "enterBase_window_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBegin_stmt(final SQLiteParser.Begin_stmtContext ctx) {
    final var methodName = "enterBegin_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollation_name(final SQLiteParser.Collation_nameContext ctx) {
    final var methodName = "enterCollation_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_alias(final SQLiteParser.Column_aliasContext ctx) {
    final var methodName = "enterColumn_alias";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_constraint(final SQLiteParser.Column_constraintContext ctx) {
    final var methodName = "enterColumn_constraint";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_def(final SQLiteParser.Column_defContext ctx) {
    final var methodName = "enterColumn_def";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_name(final SQLiteParser.Column_nameContext ctx) {
    final var methodName = "enterColumn_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_name_list(final SQLiteParser.Column_name_listContext ctx) {
    final var methodName = "enterColumn_name_list";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommit_stmt(final SQLiteParser.Commit_stmtContext ctx) {
    final var methodName = "enterCommit_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommon_table_expression(final SQLiteParser.Common_table_expressionContext ctx) {
    final var methodName = "enterCommon_table_expression";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommon_table_stmt(final SQLiteParser.Common_table_stmtContext ctx) {
    final var methodName = "enterCommon_table_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompound_operator(final SQLiteParser.Compound_operatorContext ctx) {
    final var methodName = "enterCompound_operator";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompound_select_stmt(final SQLiteParser.Compound_select_stmtContext ctx) {
    final var methodName = "enterCompound_select_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConflict_clause(final SQLiteParser.Conflict_clauseContext ctx) {
    final var methodName = "enterConflict_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_index_stmt(final SQLiteParser.Create_index_stmtContext ctx) {
    final var methodName = "enterCreate_index_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_table_stmt(final SQLiteParser.Create_table_stmtContext ctx) {
    final var methodName = "enterCreate_table_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_trigger_stmt(final SQLiteParser.Create_trigger_stmtContext ctx) {
    final var methodName = "enterCreate_trigger_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_view_stmt(final SQLiteParser.Create_view_stmtContext ctx) {
    final var methodName = "enterCreate_view_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_virtual_table_stmt(
      final SQLiteParser.Create_virtual_table_stmtContext ctx) {
    final var methodName = "enterCreate_virtual_table_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCte_table_name(final SQLiteParser.Cte_table_nameContext ctx) {
    final var methodName = "enterCte_table_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_value(final SQLiteParser.Default_valueContext ctx) {
    final var methodName = "enterDefault_value";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDelete_stmt(final SQLiteParser.Delete_stmtContext ctx) {
    final var methodName = "enterDelete_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDelete_stmt_limited(final SQLiteParser.Delete_stmt_limitedContext ctx) {
    final var methodName = "enterDelete_stmt_limited";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDetach_stmt(final SQLiteParser.Detach_stmtContext ctx) {
    final var methodName = "enterDetach_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_stmt(final SQLiteParser.Drop_stmtContext ctx) {
    final var methodName = "enterDrop_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterError_message(final SQLiteParser.Error_messageContext ctx) {
    final var methodName = "enterError_message";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    final var methodName = "enterEveryRule";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr(final SQLiteParser.ExprContext ctx) {
    final var methodName = "enterExpr";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr_asc_desc(final SQLiteParser.Expr_asc_descContext ctx) {
    final var methodName = "enterExpr_asc_desc";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFactored_select_stmt(final SQLiteParser.Factored_select_stmtContext ctx) {
    final var methodName = "enterFactored_select_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFilename(final SQLiteParser.FilenameContext ctx) {
    final var methodName = "enterFilename";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFilter_clause(final SQLiteParser.Filter_clauseContext ctx) {
    final var methodName = "enterFilter_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForeign_key_clause(final SQLiteParser.Foreign_key_clauseContext ctx) {
    final var methodName = "enterForeign_key_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForeign_table(final SQLiteParser.Foreign_tableContext ctx) {
    final var methodName = "enterForeign_table";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrame_clause(final SQLiteParser.Frame_clauseContext ctx) {
    final var methodName = "enterFrame_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrame_left(final SQLiteParser.Frame_leftContext ctx) {
    final var methodName = "enterFrame_left";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrame_right(final SQLiteParser.Frame_rightContext ctx) {
    final var methodName = "enterFrame_right";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrame_single(final SQLiteParser.Frame_singleContext ctx) {
    final var methodName = "enterFrame_single";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrame_spec(final SQLiteParser.Frame_specContext ctx) {
    final var methodName = "enterFrame_spec";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_name(final SQLiteParser.Function_nameContext ctx) {
    final var methodName = "enterFunction_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_name(final SQLiteParser.Index_nameContext ctx) {
    final var methodName = "enterIndex_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexed_column(final SQLiteParser.Indexed_columnContext ctx) {
    final var methodName = "enterIndexed_column";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInitial_select(final SQLiteParser.Initial_selectContext ctx) {
    final var methodName = "enterInitial_select";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsert_stmt(final SQLiteParser.Insert_stmtContext ctx) {
    final var methodName = "enterInsert_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_clause(final SQLiteParser.Join_clauseContext ctx) {
    final var methodName = "enterJoin_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_constraint(final SQLiteParser.Join_constraintContext ctx) {
    final var methodName = "enterJoin_constraint";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_operator(final SQLiteParser.Join_operatorContext ctx) {
    final var methodName = "enterJoin_operator";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKeyword(final SQLiteParser.KeywordContext ctx) {
    final var methodName = "enterKeyword";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLimit_stmt(final SQLiteParser.Limit_stmtContext ctx) {
    final var methodName = "enterLimit_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLiteral_value(final SQLiteParser.Literal_valueContext ctx) {
    final var methodName = "enterLiteral_value";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModule_argument(final SQLiteParser.Module_argumentContext ctx) {
    final var methodName = "enterModule_argument";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModule_name(final SQLiteParser.Module_nameContext ctx) {
    final var methodName = "enterModule_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterName(final SQLiteParser.NameContext ctx) {
    final var methodName = "enterName";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOffset(final SQLiteParser.OffsetContext ctx) {
    final var methodName = "enterOffset";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_by_expr(final SQLiteParser.Order_by_exprContext ctx) {
    final var methodName = "enterOrder_by_expr";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_by_expr_asc_desc(final SQLiteParser.Order_by_expr_asc_descContext ctx) {
    final var methodName = "enterOrder_by_expr_asc_desc";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_by_stmt(final SQLiteParser.Order_by_stmtContext ctx) {
    final var methodName = "enterOrder_by_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrdering_term(final SQLiteParser.Ordering_termContext ctx) {
    final var methodName = "enterOrdering_term";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOver_clause(final SQLiteParser.Over_clauseContext ctx) {
    final var methodName = "enterOver_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParse(final SQLiteParser.ParseContext ctx) {
    final var methodName = "enterParse";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_by(final SQLiteParser.Partition_byContext ctx) {
    final var methodName = "enterPartition_by";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPragma_name(final SQLiteParser.Pragma_nameContext ctx) {
    final var methodName = "enterPragma_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPragma_stmt(final SQLiteParser.Pragma_stmtContext ctx) {
    final var methodName = "enterPragma_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPragma_value(final SQLiteParser.Pragma_valueContext ctx) {
    final var methodName = "enterPragma_value";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQualified_table_name(final SQLiteParser.Qualified_table_nameContext ctx) {
    final var methodName = "enterQualified_table_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRaise_function(final SQLiteParser.Raise_functionContext ctx) {
    final var methodName = "enterRaise_function";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRecursive_cte(final SQLiteParser.Recursive_cteContext ctx) {
    final var methodName = "enterRecursive_cte";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRecursive_select(final SQLiteParser.Recursive_selectContext ctx) {
    final var methodName = "enterRecursive_select";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReindex_stmt(final SQLiteParser.Reindex_stmtContext ctx) {
    final var methodName = "enterReindex_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelease_stmt(final SQLiteParser.Release_stmtContext ctx) {
    final var methodName = "enterRelease_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResult_column(final SQLiteParser.Result_columnContext ctx) {
    final var methodName = "enterResult_column";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReturning_clause(final SQLiteParser.Returning_clauseContext ctx) {
    final var methodName = "enterReturning_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollback_stmt(final SQLiteParser.Rollback_stmtContext ctx) {
    final var methodName = "enterRollback_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSavepoint_name(final SQLiteParser.Savepoint_nameContext ctx) {
    final var methodName = "enterSavepoint_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSavepoint_stmt(final SQLiteParser.Savepoint_stmtContext ctx) {
    final var methodName = "enterSavepoint_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSchema_name(final SQLiteParser.Schema_nameContext ctx) {
    final var methodName = "enterSchema_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_core(final SQLiteParser.Select_coreContext ctx) {
    final var methodName = "enterSelect_core";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_stmt(final SQLiteParser.Select_stmtContext ctx) {
    final var methodName = "enterSelect_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSigned_number(final SQLiteParser.Signed_numberContext ctx) {
    final var methodName = "enterSigned_number";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimple_func(final SQLiteParser.Simple_funcContext ctx) {
    final var methodName = "enterSimple_func";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimple_function_invocation(
      final SQLiteParser.Simple_function_invocationContext ctx) {
    final var methodName = "enterSimple_function_invocation";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimple_select_stmt(final SQLiteParser.Simple_select_stmtContext ctx) {
    final var methodName = "enterSimple_select_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_stmt(final SQLiteParser.Sql_stmtContext ctx) {
    final var methodName = "enterSql_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_stmt_list(final SQLiteParser.Sql_stmt_listContext ctx) {
    final var methodName = "enterSql_stmt_list";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_alias(final SQLiteParser.Table_aliasContext ctx) {
    final var methodName = "enterTable_alias";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_constraint(final SQLiteParser.Table_constraintContext ctx) {
    final var methodName = "enterTable_constraint";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_function_name(final SQLiteParser.Table_function_nameContext ctx) {
    final var methodName = "enterTable_function_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_name(final SQLiteParser.Table_nameContext ctx) {
    final var methodName = "enterTable_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_or_index_name(final SQLiteParser.Table_or_index_nameContext ctx) {
    final var methodName = "enterTable_or_index_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_or_subquery(final SQLiteParser.Table_or_subqueryContext ctx) {
    final var methodName = "enterTable_or_subquery";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransaction_name(final SQLiteParser.Transaction_nameContext ctx) {
    final var methodName = "enterTransaction_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrigger_name(final SQLiteParser.Trigger_nameContext ctx) {
    final var methodName = "enterTrigger_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_name(final SQLiteParser.Type_nameContext ctx) {
    final var methodName = "enterType_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnary_operator(final SQLiteParser.Unary_operatorContext ctx) {
    final var methodName = "enterUnary_operator";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_stmt(final SQLiteParser.Update_stmtContext ctx) {
    final var methodName = "enterUpdate_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_stmt_limited(final SQLiteParser.Update_stmt_limitedContext ctx) {
    final var methodName = "enterUpdate_stmt_limited";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpsert_clause(final SQLiteParser.Upsert_clauseContext ctx) {
    final var methodName = "enterUpsert_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVacuum_stmt(final SQLiteParser.Vacuum_stmtContext ctx) {
    final var methodName = "enterVacuum_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValue_row(final SQLiteParser.Value_rowContext ctx) {
    final var methodName = "enterValue_row";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValues_clause(final SQLiteParser.Values_clauseContext ctx) {
    final var methodName = "enterValues_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterView_name(final SQLiteParser.View_nameContext ctx) {
    final var methodName = "enterView_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_defn(final SQLiteParser.Window_defnContext ctx) {
    final var methodName = "enterWindow_defn";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_function(final SQLiteParser.Window_functionContext ctx) {
    final var methodName = "enterWindow_function";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_function_invocation(
      final SQLiteParser.Window_function_invocationContext ctx) {
    final var methodName = "enterWindow_function_invocation";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_name(final SQLiteParser.Window_nameContext ctx) {
    final var methodName = "enterWindow_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWith_clause(final SQLiteParser.With_clauseContext ctx) {
    final var methodName = "enterWith_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggregate_func(final SQLiteParser.Aggregate_funcContext ctx) {
    final var methodName = "exitAggregate_func";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggregate_function_invocation(
      final SQLiteParser.Aggregate_function_invocationContext ctx) {
    final var methodName = "exitAggregate_function_invocation";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlias(final SQLiteParser.AliasContext ctx) {
    final var methodName = "exitAlias";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_stmt(final SQLiteParser.Alter_table_stmtContext ctx) {
    final var methodName = "exitAlter_table_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAnalyze_stmt(final SQLiteParser.Analyze_stmtContext ctx) {
    final var methodName = "exitAnalyze_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAny_name(final SQLiteParser.Any_nameContext ctx) {
    final var methodName = "exitAny_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAsc_desc(final SQLiteParser.Asc_descContext ctx) {
    final var methodName = "exitAsc_desc";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAttach_stmt(final SQLiteParser.Attach_stmtContext ctx) {
    final var methodName = "exitAttach_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBase_window_name(final SQLiteParser.Base_window_nameContext ctx) {
    final var methodName = "exitBase_window_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBegin_stmt(final SQLiteParser.Begin_stmtContext ctx) {
    final var methodName = "exitBegin_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollation_name(final SQLiteParser.Collation_nameContext ctx) {
    final var methodName = "exitCollation_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_alias(final SQLiteParser.Column_aliasContext ctx) {
    final var methodName = "exitColumn_alias";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_constraint(final SQLiteParser.Column_constraintContext ctx) {
    final var methodName = "exitColumn_constraint";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_def(final SQLiteParser.Column_defContext ctx) {
    final var methodName = "exitColumn_def";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable != null) {
      final var currentFieldList =
          ParseTreeStream.parseTreeStream(ctx)
              .streamChildrenByClass(SQLiteParser.Type_nameContext.class)
              .streamChildrenByClass(SQLiteParser.NameContext.class)
              .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
              .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
              .filter(TerminalNode.class::isInstance)
              .map(child -> ParseTreeHelper.getField(currentTable, child))
              .collect(Collectors.toList());
      if (currentFieldList != null && !currentFieldList.isEmpty()) {
        var columnConstraintText = " ";
        columnConstraintText +=
            ParseTreeStream.parseTreeStream(ctx)
                .streamChildrenByClass(SQLiteParser.Column_nameContext.class)
                .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
                .streamChildrenByClass(SQLiteParser.KeywordContext.class)
                .streamTerminalNodeString()
                .map(StringUtils::upperCase)
                .collect(Collectors.joining(" "));
        columnConstraintText += " ";

        for (final var currentField : currentFieldList) {
          if (columnConstraintText.contains(" PRIMARY ")) {
            currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
          }
        }
      }
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SQLiteParser.Type_nameContext.class)
        .streamChildrenByClass(SQLiteParser.NameContext.class)
        .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
        .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (StringUtils.equalsIgnoreCase("MAX", terminalNodeText)) {
                  currentField.put(Field.MAX_SIZE, NotNullSet.getInstance(terminalNodeText));
                }
              }
            });
    final var generatedFound = new MutableBoolean(false);
    ParseTreeStream.parseTreeStream(ctx)
        .streamTextByClass(SQLiteParserListenerImpl.input, SQLiteParser.Type_nameContext.class)
        .filter(StringUtils::isNoneBlank)
        .map(StringUtils::upperCase)
        .forEach(
            intervalText -> {
              if (intervalText.contains("CONSTRAINT")
                  || intervalText.contains("CHECK (")
                  || intervalText.contains("GENERATED ALWAYS AS")
                  || intervalText.contains("GENERATED BY DEFAULT AS")
                  || intervalText.startsWith("AS ")) {
                generatedFound.setTrue();
              }
              if (intervalText.contains("TIME ZONE")) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.TIMEZONE, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SQLiteParser.Type_nameContext.class)
        .streamChildrenByClass(SQLiteParser.NameContext.class)
        .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
        .streamTextByClass(SQLiteParserListenerImpl.input, SQLiteParser.KeywordContext.class)
        .filter(StringUtils::isNoneBlank)
        .map(StringUtils::upperCase)
        .forEach(
            intervalText -> {
              if (intervalText.contains("GENERATED ALWAYS AS IDENTITY")
                  || intervalText.contains("GENERATED BY DEFAULT AS IDENTITY")
                  || intervalText.contains("GENERATED BY DEFAULT ON NULL AS IDENTITY")) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.IDENTITY, NotNullSet.getInstance(Boolean.TRUE));
                  generatedFound.setTrue();
                }
              } else if (intervalText.contains("GENERATED ALWAYS AS")
                  || intervalText.contains("GENERATED BY DEFAULT AS")) {
                generatedFound.setTrue();
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SQLiteParser.Type_nameContext.class)
        .streamChildrenByClass(SQLiteParser.NameContext.class)
        .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
        .filter(TerminalNode.class::isInstance)
        .forEach(
            terminalNode -> {
              final var terminalNodeText = ParseTreeHelper.trimToken(terminalNode.getText());
              if (terminalNodeText != null) {
                for (final var currentField : currentFieldList) {
                  if (StringUtils.equalsIgnoreCase("INHERIT", terminalNodeText)
                      || StringUtils.equalsIgnoreCase("KEY", terminalNodeText)
                      || StringUtils.equalsIgnoreCase("NO", terminalNodeText)
                      || StringUtils.equalsIgnoreCase("VALID", terminalNodeText)
                      || terminalNodeText.contains("(")) {
                    // ignore
                  } else if (StringUtils.equalsIgnoreCase("CLUSTERED", terminalNodeText)) {
                    currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.TRUE));
                  } else if (StringUtils.equalsIgnoreCase("IDENTITY", terminalNodeText)) {
                    currentField.put(Field.IDENTITY, NotNullSet.getInstance(Boolean.TRUE));
                  } else if (StringUtils.equalsIgnoreCase("NONCLUSTERED", terminalNodeText)) {
                    currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.FALSE));
                  } else if (!currentField.containsKey(Field.FIELD_TYPE)) {
                    final var intervalText =
                        ParseTreeHelper.trimBracket(
                            ParseTreeHelper.getText(
                                SQLiteParserListenerImpl.input,
                                (ParserRuleContext)
                                    terminalNode.getParent().getParent().getParent()));
                    if (StringUtils.equalsIgnoreCase("DOUBLE PRECISION", intervalText)) {
                      currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(intervalText));
                    } else {
                      currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                    }
                  } else if (StringUtils.equalsIgnoreCase("CHAR", terminalNodeText)) {
                    currentField.put("char", NotNullSet.getInstance(Boolean.TRUE));
                  } else {
                    final var intervalText =
                        ParseTreeHelper.trimBracket(
                            ParseTreeHelper.getText(
                                SQLiteParserListenerImpl.input,
                                (ParserRuleContext)
                                    terminalNode.getParent().getParent().getParent()));
                    final var commentPos =
                        StringUtils.upperCase(intervalText, Locale.getDefault())
                            .indexOf(" COMMENT ");
                    if (-1 < commentPos) {
                      currentField.put(
                          Field.COMMENT,
                          NotNullSet.getInstance(
                              ParseTreeHelper.trimToken(intervalText.substring(commentPos + 9))));
                    }
                  }
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SQLiteParser.Type_nameContext.class)
        .streamChildrenByClass(SQLiteParser.Signed_numberContext.class)
        .listAllTerminalNodeText()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (currentField.containsKey(Field.IDENTITY)) {
                  if (!currentField.containsKey(Field.SEED)) {
                    currentField.put(Field.SEED, NotNullSet.getInstance(terminalNodeText));
                  } else if (!currentField.containsKey(Field.INCREMENT)) {
                    currentField.put(Field.INCREMENT, NotNullSet.getInstance(terminalNodeText));
                  }
                } else if (!currentField.containsKey(Field.PRECISION)) {
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
                } else if (!currentField.containsKey(Field.SCALE)) {
                  currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeText));
                } else if (!StringUtils.equalsIgnoreCase(
                        currentField.get(Field.PRECISION).toString(), terminalNodeText)
                    && !StringUtils.equalsIgnoreCase(Field.PRECISION, terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SQLiteParser.Column_constraintContext.class)
        .streamChildrenByClass(SQLiteParser.Collation_nameContext.class)
        .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
        .listAllTerminalNodeText()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.COLLATION_NAME, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SQLiteParser.Column_constraintContext.class)
        .streamChildrenByClass(SQLiteParser.Foreign_key_clauseContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              if (StringUtils.equalsIgnoreCase("DEFERRABLE", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.DEFERRABLE, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
              if (StringUtils.equalsIgnoreCase("DEFERRED", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.DEFERRED, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    final var defaultFound = new MutableBoolean(false);
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SQLiteParser.Column_constraintContext.class)
        .filter(Objects::nonNull)
        .forEach(
            parserRuleContext -> {
              if (parserRuleContext instanceof TerminalNode
                  && StringUtils.equalsIgnoreCase("DEFAULT", parserRuleContext.getText())) {
                defaultFound.setTrue();
              } else if (!generatedFound.booleanValue()
                  && defaultFound.booleanValue()
                  && parserRuleContext instanceof ParserRuleContext) {
                for (final var currentField : currentFieldList) {
                  if (!currentField.containsKey(Field.DEFAULT)) {
                    currentField.put(
                        Field.DEFAULT,
                        NotNullSet.getInstance(
                            ParseTreeHelper.getText(
                                SQLiteParserListenerImpl.input,
                                (ParserRuleContext) parserRuleContext)));
                  }
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamTextByClass(SQLiteParserListenerImpl.input, SQLiteParser.Type_nameContext.class)
        .filter(StringUtils::isNoneBlank)
        .forEach(
            intervalText -> {
              for (final var currentField : currentFieldList) {
                final var defaultPos = intervalText.indexOf(" default ");
                if (-1 < defaultPos && !generatedFound.booleanValue()) {
                  currentField.put(
                      Field.DEFAULT,
                      NotNullSet.getInstance(intervalText.substring(defaultPos + 9)));
                }
              }
            });

    var columnConstraintText = " ";
    columnConstraintText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SQLiteParser.Column_constraintContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    columnConstraintText += " ";
    columnConstraintText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SQLiteParser.Column_nameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .streamChildrenByClass(SQLiteParser.KeywordContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    columnConstraintText += " ";
    columnConstraintText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SQLiteParser.Column_constraintContext.class)
            .streamChildrenByClass(SQLiteParser.ExprContext.class)
            .streamChildrenByClass(SQLiteParser.ExprContext.class)
            .listAllTerminalNodeText()
            .stream()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    columnConstraintText += " ";
    columnConstraintText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SQLiteParser.Type_nameContext.class)
            .streamChildrenByClass(SQLiteParser.NameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    columnConstraintText += " ";
    columnConstraintText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SQLiteParser.Type_nameContext.class)
            .streamChildrenByClass(SQLiteParser.NameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .streamChildrenByClass(SQLiteParser.KeywordContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    columnConstraintText += " ";

    for (final var currentField : currentFieldList) {
      if (columnConstraintText.contains(" AUTOINCREMENT ")
          || columnConstraintText.contains(" AUTO_INCREMENT ")) {
        currentField.put(Field.AUTO_INCREMENT, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" NOT NULL ")) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
      } else if (columnConstraintText.contains(" NULL ")
          && !columnConstraintText.contains(" GENERATED BY DEFAULT ON NULL AS ")) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" PRIMARY ")) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" UNIQUE ")) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" UNSIGNED ")) {
        currentField.put(Field.UNSIGNED, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" VARYING ")) {
        currentField.put(Field.VARYING, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" INVISIBLE ")) {
        currentField.put(Field.VISIBLE, NotNullSet.getInstance(Boolean.FALSE));
      } else if (columnConstraintText.contains(" VISIBLE ")) {
        currentField.put(Field.VISIBLE, NotNullSet.getInstance(Boolean.TRUE));
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
          .streamChildrenByClass(SQLiteParser.Column_nameContext.class)
          .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
          .map(anyNameContext -> ParseTreeHelper.trimToken(anyNameContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              anyNameText -> {
                final Set<String> inheritsList;
                if (currentRelationship.get("column") instanceof Set) {
                  inheritsList = (Set<String>) currentRelationship.get("column");
                } else {
                  inheritsList = new LinkedHashSet<>();
                }
                inheritsList.add(anyNameText);

                currentRelationship.put("column", NotNullSet.getInstance(inheritsList));
              });
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(SQLiteParser.Column_constraintContext.class)
          .streamChildrenByClass(SQLiteParser.Foreign_key_clauseContext.class)
          .streamChildrenByClass(SQLiteParser.Foreign_tableContext.class)
          .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
          .map(anyNameContext -> ParseTreeHelper.trimToken(anyNameContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .filter(Predicate.not("null"::equalsIgnoreCase))
          .forEach(
              anyNameText -> {
                currentRelationship.put(
                    "foreignTable", NotNullSet.getInstance(ParseTreeHelper.trimToken(anyNameText)));
              });
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(SQLiteParser.Column_constraintContext.class)
          .streamChildrenByClass(SQLiteParser.Foreign_key_clauseContext.class)
          .streamChildrenByClass(SQLiteParser.Column_nameContext.class)
          .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
          .map(anyNameContext -> ParseTreeHelper.trimToken(anyNameContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              anyNameContext -> {
                final Set<String> inheritsList;
                if (currentRelationship.get("foreignColumn") instanceof Set) {
                  inheritsList = (Set<String>) currentRelationship.get("foreignColumn");
                } else {
                  inheritsList = new LinkedHashSet<>();
                }
                inheritsList.add(anyNameContext);

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
  public void exitColumn_name(final SQLiteParser.Column_nameContext ctx) {
    final var methodName = "exitColumn_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_name_list(final SQLiteParser.Column_name_listContext ctx) {
    final var methodName = "exitColumn_name_list";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommit_stmt(final SQLiteParser.Commit_stmtContext ctx) {
    final var methodName = "exitCommit_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommon_table_expression(final SQLiteParser.Common_table_expressionContext ctx) {
    final var methodName = "exitCommon_table_expression";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommon_table_stmt(final SQLiteParser.Common_table_stmtContext ctx) {
    final var methodName = "exitCommon_table_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompound_operator(final SQLiteParser.Compound_operatorContext ctx) {
    final var methodName = "exitCompound_operator";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompound_select_stmt(final SQLiteParser.Compound_select_stmtContext ctx) {
    final var methodName = "exitCompound_select_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConflict_clause(final SQLiteParser.Conflict_clauseContext ctx) {
    final var methodName = "exitConflict_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_index_stmt(final SQLiteParser.Create_index_stmtContext ctx) {
    final var methodName = "exitCreate_index_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_table_stmt(final SQLiteParser.Create_table_stmtContext ctx) {
    final var methodName = "exitCreate_table_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);

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
          || StringUtils.equalsIgnoreCase("CONSTRAINT", field.getKey())) {
        fieldsToRemove.add(field.getKey());
      }
    }
    for (final var field : fieldsToRemove) {
      currentTable.getFields().remove(field);
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(SQLiteParser.Column_defContext.class)
        .streamChildrenByClass(SQLiteParser.Column_nameContext.class)
        .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
        .streamChildrenByClass(SQLiteParser.KeywordContext.class)
        .streamTerminalNodeString()
        .filter("LIKE"::equalsIgnoreCase)
        .forEach(
            text -> {
              final var terminalNodeTextList =
                  ParseTreeStream.parseTreeStream(ctx)
                      .streamChildrenByClass(SQLiteParser.Column_defContext.class)
                      .streamChildrenByClass(SQLiteParser.Type_nameContext.class)
                      .streamChildrenByClass(SQLiteParser.NameContext.class)
                      .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
                      .streamTerminalNodeString()
                      .filter(
                          terminalNodeText ->
                              !StringUtils.equalsIgnoreCase(
                                      currentTable.getObjectName(), terminalNodeText)
                                  && !StringUtils.equalsIgnoreCase("COMMENTS", terminalNodeText)
                                  && !StringUtils.equalsIgnoreCase("CONSTRAINTS", terminalNodeText)
                                  && !StringUtils.equalsIgnoreCase("DEFAULTS", terminalNodeText)
                                  && !StringUtils.equalsIgnoreCase("IDENTITY", terminalNodeText)
                                  && !StringUtils.equalsIgnoreCase("INCLUDING", terminalNodeText)
                                  && !StringUtils.equalsIgnoreCase("INDEXES", terminalNodeText)
                                  && !StringUtils.equalsIgnoreCase("INT", terminalNodeText)
                                  && !StringUtils.equalsIgnoreCase("PROPERTIES", terminalNodeText)
                                  && !StringUtils.equalsIgnoreCase("STORAGE", terminalNodeText)
                                  && !StringUtils.equalsIgnoreCase("TEXT", terminalNodeText))
                      .collect(Collectors.toSet());
              if (!terminalNodeTextList.isEmpty()) {
                final Set<String> inheritsList;
                if (currentTable.getAttributes().get(SqlContextImpl.LIKE) instanceof Set) {
                  inheritsList =
                      (Set<String>) currentTable.getAttributes().get(SqlContextImpl.LIKE);
                } else {
                  inheritsList = new TreeSet<>();
                }
                inheritsList.addAll(terminalNodeTextList);

                currentTable
                    .getAttributes()
                    .put(SqlContextImpl.LIKE, NotNullSet.getInstance(inheritsList));
              }
            });

    if (!currentTable.getFields().isEmpty() || !currentTable.getAttributes().isEmpty()) {
      ParseTreeStream.parseTreeStream(ctx)
          .streamTerminalNodeString()
          .map(StringUtils::upperCase)
          .forEach(
              terminalNodeText -> {
                if (StringUtils.equalsIgnoreCase("TEMPORARY", terminalNodeText)
                    || StringUtils.equalsIgnoreCase("TEMP", terminalNodeText)) {
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
  public void exitCreate_trigger_stmt(final SQLiteParser.Create_trigger_stmtContext ctx) {
    final var methodName = "exitCreate_trigger_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_view_stmt(final SQLiteParser.Create_view_stmtContext ctx) {
    final var methodName = "exitCreate_view_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_virtual_table_stmt(
      final SQLiteParser.Create_virtual_table_stmtContext ctx) {
    final var methodName = "exitCreate_virtual_table_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCte_table_name(final SQLiteParser.Cte_table_nameContext ctx) {
    final var methodName = "exitCte_table_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_value(final SQLiteParser.Default_valueContext ctx) {
    final var methodName = "exitDefault_value";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDelete_stmt(final SQLiteParser.Delete_stmtContext ctx) {
    final var methodName = "exitDelete_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDelete_stmt_limited(final SQLiteParser.Delete_stmt_limitedContext ctx) {
    final var methodName = "exitDelete_stmt_limited";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDetach_stmt(final SQLiteParser.Detach_stmtContext ctx) {
    final var methodName = "exitDetach_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_stmt(final SQLiteParser.Drop_stmtContext ctx) {
    final var methodName = "exitDrop_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitError_message(final SQLiteParser.Error_messageContext ctx) {
    final var methodName = "exitError_message";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    final var methodName = "exitEveryRule";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr(final SQLiteParser.ExprContext ctx) {
    final var methodName = "exitExpr";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr_asc_desc(final SQLiteParser.Expr_asc_descContext ctx) {
    final var methodName = "exitExpr_asc_desc";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFactored_select_stmt(final SQLiteParser.Factored_select_stmtContext ctx) {
    final var methodName = "exitFactored_select_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFilename(final SQLiteParser.FilenameContext ctx) {
    final var methodName = "exitFilename";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFilter_clause(final SQLiteParser.Filter_clauseContext ctx) {
    final var methodName = "exitFilter_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForeign_key_clause(final SQLiteParser.Foreign_key_clauseContext ctx) {
    final var methodName = "exitForeign_key_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForeign_table(final SQLiteParser.Foreign_tableContext ctx) {
    final var methodName = "exitForeign_table";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrame_clause(final SQLiteParser.Frame_clauseContext ctx) {
    final var methodName = "exitFrame_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrame_left(final SQLiteParser.Frame_leftContext ctx) {
    final var methodName = "exitFrame_left";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrame_right(final SQLiteParser.Frame_rightContext ctx) {
    final var methodName = "exitFrame_right";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrame_single(final SQLiteParser.Frame_singleContext ctx) {
    final var methodName = "exitFrame_single";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrame_spec(final SQLiteParser.Frame_specContext ctx) {
    final var methodName = "exitFrame_spec";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_name(final SQLiteParser.Function_nameContext ctx) {
    final var methodName = "exitFunction_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_name(final SQLiteParser.Index_nameContext ctx) {
    final var methodName = "exitIndex_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexed_column(final SQLiteParser.Indexed_columnContext ctx) {
    final var methodName = "exitIndexed_column";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInitial_select(final SQLiteParser.Initial_selectContext ctx) {
    final var methodName = "exitInitial_select";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsert_stmt(final SQLiteParser.Insert_stmtContext ctx) {
    final var methodName = "exitInsert_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_clause(final SQLiteParser.Join_clauseContext ctx) {
    final var methodName = "exitJoin_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_constraint(final SQLiteParser.Join_constraintContext ctx) {
    final var methodName = "exitJoin_constraint";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_operator(final SQLiteParser.Join_operatorContext ctx) {
    final var methodName = "exitJoin_operator";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKeyword(final SQLiteParser.KeywordContext ctx) {
    final var methodName = "exitKeyword";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLimit_stmt(final SQLiteParser.Limit_stmtContext ctx) {
    final var methodName = "exitLimit_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLiteral_value(final SQLiteParser.Literal_valueContext ctx) {
    final var methodName = "exitLiteral_value";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModule_argument(final SQLiteParser.Module_argumentContext ctx) {
    final var methodName = "exitModule_argument";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModule_name(final SQLiteParser.Module_nameContext ctx) {
    final var methodName = "exitModule_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitName(final SQLiteParser.NameContext ctx) {
    final var methodName = "exitName";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOffset(final SQLiteParser.OffsetContext ctx) {
    final var methodName = "exitOffset";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_by_expr(final SQLiteParser.Order_by_exprContext ctx) {
    final var methodName = "exitOrder_by_expr";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_by_expr_asc_desc(final SQLiteParser.Order_by_expr_asc_descContext ctx) {
    final var methodName = "exitOrder_by_expr_asc_desc";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_by_stmt(final SQLiteParser.Order_by_stmtContext ctx) {
    final var methodName = "exitOrder_by_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrdering_term(final SQLiteParser.Ordering_termContext ctx) {
    final var methodName = "exitOrdering_term";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOver_clause(final SQLiteParser.Over_clauseContext ctx) {
    final var methodName = "exitOver_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParse(final SQLiteParser.ParseContext ctx) {
    final var methodName = "exitParse";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_by(final SQLiteParser.Partition_byContext ctx) {
    final var methodName = "exitPartition_by";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPragma_name(final SQLiteParser.Pragma_nameContext ctx) {
    final var methodName = "exitPragma_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPragma_stmt(final SQLiteParser.Pragma_stmtContext ctx) {
    final var methodName = "exitPragma_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPragma_value(final SQLiteParser.Pragma_valueContext ctx) {
    final var methodName = "exitPragma_value";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQualified_table_name(final SQLiteParser.Qualified_table_nameContext ctx) {
    final var methodName = "exitQualified_table_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRaise_function(final SQLiteParser.Raise_functionContext ctx) {
    final var methodName = "exitRaise_function";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRecursive_cte(final SQLiteParser.Recursive_cteContext ctx) {
    final var methodName = "exitRecursive_cte";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRecursive_select(final SQLiteParser.Recursive_selectContext ctx) {
    final var methodName = "exitRecursive_select";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReindex_stmt(final SQLiteParser.Reindex_stmtContext ctx) {
    final var methodName = "exitReindex_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelease_stmt(final SQLiteParser.Release_stmtContext ctx) {
    final var methodName = "exitRelease_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResult_column(final SQLiteParser.Result_columnContext ctx) {
    final var methodName = "exitResult_column";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReturning_clause(final SQLiteParser.Returning_clauseContext ctx) {
    final var methodName = "exitReturning_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollback_stmt(final SQLiteParser.Rollback_stmtContext ctx) {
    final var methodName = "exitRollback_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSavepoint_name(final SQLiteParser.Savepoint_nameContext ctx) {
    final var methodName = "exitSavepoint_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSavepoint_stmt(final SQLiteParser.Savepoint_stmtContext ctx) {
    final var methodName = "exitSavepoint_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSchema_name(final SQLiteParser.Schema_nameContext ctx) {
    final var methodName = "exitSchema_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_core(final SQLiteParser.Select_coreContext ctx) {
    final var methodName = "exitSelect_core";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_stmt(final SQLiteParser.Select_stmtContext ctx) {
    final var methodName = "exitSelect_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSigned_number(final SQLiteParser.Signed_numberContext ctx) {
    final var methodName = "exitSigned_number";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimple_func(final SQLiteParser.Simple_funcContext ctx) {
    final var methodName = "exitSimple_func";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimple_function_invocation(
      final SQLiteParser.Simple_function_invocationContext ctx) {
    final var methodName = "exitSimple_function_invocation";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimple_select_stmt(final SQLiteParser.Simple_select_stmtContext ctx) {
    final var methodName = "exitSimple_select_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_stmt(final SQLiteParser.Sql_stmtContext ctx) {
    final var methodName = "exitSql_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_stmt_list(final SQLiteParser.Sql_stmt_listContext ctx) {
    final var methodName = "exitSql_stmt_list";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_alias(final SQLiteParser.Table_aliasContext ctx) {
    final var methodName = "exitTable_alias";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_constraint(final SQLiteParser.Table_constraintContext ctx) {
    final var methodName = "exitTable_constraint";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

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
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SQLiteParser.Foreign_key_clauseContext.class)
            .streamChildrenByClass(SQLiteParser.Foreign_tableContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .map(qualifiedNameContext -> ParseTreeHelper.trimToken(qualifiedNameContext.getText()))
            .filter(StringUtils::isNoneBlank)
            .filter(Predicate.not("null"::equalsIgnoreCase))
            .forEach(
                terminalNodeText -> {
                  currentRelationship.put("foreignTable", NotNullSet.getInstance(terminalNodeText));
                });
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SQLiteParser.Foreign_key_clauseContext.class)
            .streamChildrenByClass(SQLiteParser.Column_nameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
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
            .streamChildrenByClass(SQLiteParser.Column_nameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
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

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    var columnConstraintText = " ";
    columnConstraintText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    columnConstraintText += " ";

    for (final var currentField : currentFieldList) {
      if (columnConstraintText.contains(" PRIMARY ")) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" UNIQUE ")) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_function_name(final SQLiteParser.Table_function_nameContext ctx) {
    final var methodName = "exitTable_function_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_name(final SQLiteParser.Table_nameContext ctx) {
    final var methodName = "exitTable_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_or_index_name(final SQLiteParser.Table_or_index_nameContext ctx) {
    final var methodName = "exitTable_or_index_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_or_subquery(final SQLiteParser.Table_or_subqueryContext ctx) {
    final var methodName = "exitTable_or_subquery";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransaction_name(final SQLiteParser.Transaction_nameContext ctx) {
    final var methodName = "exitTransaction_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrigger_name(final SQLiteParser.Trigger_nameContext ctx) {
    final var methodName = "exitTrigger_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_name(final SQLiteParser.Type_nameContext ctx) {
    final var methodName = "exitType_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var currentFieldList =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SQLiteParser.NameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .filter(TerminalNode.class::isInstance)
            .map(child -> ParseTreeHelper.getField(currentTable, child))
            .collect(Collectors.toList());
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    var columnConstraintText = " ";
    columnConstraintText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SQLiteParser.NameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    columnConstraintText += " ";
    columnConstraintText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SQLiteParser.NameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .streamChildrenByClass(SQLiteParser.KeywordContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    columnConstraintText += " ";

    for (final var currentField : currentFieldList) {
      if (columnConstraintText.contains(" AUTOINCREMENT ")
          || columnConstraintText.contains(" AUTO_INCREMENT ")) {
        currentField.put(Field.AUTO_INCREMENT, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" NOT NULL ")) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
      } else if (columnConstraintText.contains(" NULL ")
          && !columnConstraintText.contains(" GENERATED BY DEFAULT ON NULL AS ")) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" CLUSTERED ")) {
        currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.TRUE));
      } else if (columnConstraintText.contains(" NONCLUSTERED ")) {
        currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.FALSE));
      }
      if (columnConstraintText.contains(" PRIMARY ")) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" UNIQUE ")) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" UNSIGNED ")) {
        currentField.put(Field.UNSIGNED, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" VARYING ")) {
        currentField.put(Field.VARYING, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (columnConstraintText.contains(" INVISIBLE ")) {
        currentField.put(Field.VISIBLE, NotNullSet.getInstance(Boolean.FALSE));
      } else if (columnConstraintText.contains(" VISIBLE ")) {
        currentField.put(Field.VISIBLE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnary_operator(final SQLiteParser.Unary_operatorContext ctx) {
    final var methodName = "exitUnary_operator";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_stmt(final SQLiteParser.Update_stmtContext ctx) {
    final var methodName = "exitUpdate_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_stmt_limited(final SQLiteParser.Update_stmt_limitedContext ctx) {
    final var methodName = "exitUpdate_stmt_limited";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpsert_clause(final SQLiteParser.Upsert_clauseContext ctx) {
    final var methodName = "exitUpsert_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVacuum_stmt(final SQLiteParser.Vacuum_stmtContext ctx) {
    final var methodName = "exitVacuum_stmt";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValue_row(final SQLiteParser.Value_rowContext ctx) {
    final var methodName = "exitValue_row";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValues_clause(final SQLiteParser.Values_clauseContext ctx) {
    final var methodName = "exitValues_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitView_name(final SQLiteParser.View_nameContext ctx) {
    final var methodName = "exitView_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_defn(final SQLiteParser.Window_defnContext ctx) {
    final var methodName = "exitWindow_defn";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_function(final SQLiteParser.Window_functionContext ctx) {
    final var methodName = "exitWindow_function";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_function_invocation(
      final SQLiteParser.Window_function_invocationContext ctx) {
    final var methodName = "exitWindow_function_invocation";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_name(final SQLiteParser.Window_nameContext ctx) {
    final var methodName = "exitWindow_name";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWith_clause(final SQLiteParser.With_clauseContext ctx) {
    final var methodName = "exitWith_clause";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);
  }

  private List<ObjectField> getCurrentFieldList(final ParserRuleContext ctx) {
    final var methodName = "getCurrentFieldList";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var terminalNode = new ArrayList<ParseTree>();

    var parentContext = ParseTreeHelper.getParentContext(ctx, SQLiteParser.Column_defContext.class);
    if (parentContext != null && parentContext.children != null) {
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SQLiteParser.Column_nameContext.class)
              .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SQLiteParser.Column_nameContext.class)
              .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
              .streamChildrenByClass(SQLiteParser.KeywordContext.class)
              .filter(
                  keywordContext ->
                      (keywordContext instanceof TerminalNode
                          && !StringUtils.equalsIgnoreCase("INDEX", keywordContext.getText())
                          && !StringUtils.equalsIgnoreCase("LIKE", keywordContext.getText())))
              .collect(Collectors.toSet()));
    }

    parentContext =
        ParseTreeHelper.getParentContext(ctx, SQLiteParser.Create_table_stmtContext.class);
    if (parentContext != null && parentContext.children != null) {
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SQLiteParser.Table_constraintContext.class)
              .streamChildrenByClass(SQLiteParser.Indexed_columnContext.class)
              .streamChildrenByClass(SQLiteParser.Column_nameContext.class)
              .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
    }

    return terminalNode.stream()
        .map(child -> ParseTreeHelper.getField(currentTable, child))
        .collect(Collectors.toList());
  }

  private ObjectRelationship getCurrentRelationship(final ParserRuleContext ctx) {
    final var methodName = "getCurrentRelationshipList";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, SQLiteParser.Column_defContext.class);
    final var terminalNode =
        new ArrayList<>(
            ParseTreeStream.parseTreeStream(parentContext)
                .streamChildrenByClass(SQLiteParser.Column_constraintContext.class)
                .streamChildrenByClass(SQLiteParser.Foreign_key_clauseContext.class)
                .filter(TerminalNode.class::isInstance)
                .map(
                    foreignTerminalNode -> {
                      final List<ParseTree> returnValue = new ArrayList<ParseTree>();
                      if (StringUtils.equalsAnyIgnoreCase(
                          "REFERENCES", foreignTerminalNode.getText())) {
                        returnValue.addAll(
                            ParseTreeStream.parseTreeStream(parentContext)
                                .streamChildrenByClass(SQLiteParser.Column_constraintContext.class)
                                .streamChildrenByClass(SQLiteParser.NameContext.class)
                                .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
                                .filter(TerminalNode.class::isInstance)
                                .collect(Collectors.toList()));
                      }
                      return returnValue;
                    })
                .flatMap(List::stream)
                .collect(Collectors.toList()));
    if (terminalNode.isEmpty()) {
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SQLiteParser.Column_constraintContext.class)
              .streamChildrenByClass(SQLiteParser.Foreign_key_clauseContext.class)
              .filter(TerminalNode.class::isInstance)
              .map(
                  foreignTerminalNode -> {
                    final List<ParseTree> returnValue = new ArrayList<ParseTree>();
                    if (StringUtils.equalsAnyIgnoreCase(
                        "REFERENCES", foreignTerminalNode.getText())) {
                      returnValue.addAll(
                          ParseTreeStream.parseTreeStream(parentContext)
                              .streamChildrenByClass(SQLiteParser.Column_nameContext.class)
                              .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
                              .filter(TerminalNode.class::isInstance)
                              .collect(Collectors.toList()));
                    }
                    return returnValue;
                  })
              .flatMap(List::stream)
              .collect(Collectors.toList()));
    }
    final var parentContext2 =
        ParseTreeHelper.getParentContext(ctx, SQLiteParser.Table_constraintContext.class);
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(parentContext2)
            .streamChildrenByClass(SQLiteParser.NameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toList()));
    if (terminalNode.isEmpty()) {
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext2)
              .streamChildrenByClass(SQLiteParser.Foreign_key_clauseContext.class)
              .streamChildrenByClass(SQLiteParser.Foreign_tableContext.class)
              .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toList()));
    }

    if (0 < terminalNode.size()) {
      return ParseTreeHelper.getRelationship(currentTable, terminalNode.get(0));
    }
    return null;
  }

  private SqlContext getCurrentTable(final ParserRuleContext ctx) {
    final var methodName = "getCurrentTable";
    SQLiteParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, SQLiteParser.Create_table_stmtContext.class);
    if (parentContext == null || parentContext.children == null) {
      return null;
    }

    final List<String> terminalNodeTextList =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SQLiteParser.Schema_nameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SQLiteParser.Table_nameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SQLiteParser.Table_nameContext.class)
            .streamChildrenByClass(SQLiteParser.Any_nameContext.class)
            .streamChildrenByClass(SQLiteParser.KeywordContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));

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
    SQLiteParserListenerImpl.traceChildren(methodName, node);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void visitTerminal(final TerminalNode node) {
    final var methodName = "visitTerminal";
    SQLiteParserListenerImpl.traceChildren(methodName, node);

    SQLiteParserListenerImpl.input = node.getSymbol().getInputStream();
  }
}
