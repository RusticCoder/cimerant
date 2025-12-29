package cimerant.antlr.sql.postgresql;

import cimerant.antlr.sql.ParseTreeHelper;
import cimerant.logger.CimerantLogger;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import sql.postgresql.PostgreSQLParser;
import sql.postgresql.PostgreSQLParserBaseListener;
import sql.postgresql.PostgreSQLParserListener;

/**
 * This class provides an empty implementation of {@link PostgreSQLParserListener}, which can be
 * extended to create a listener which only needs to handle a subset of the available methods.
 */
public abstract class PostgreSQLParserListenerBase extends PostgreSQLParserBaseListener {
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(PostgreSQLParserListenerBase.class.getName());
  }

  private static void traceChildren(final String methodName, final ParseTree ctx) {
    if (PostgreSQLParserListenerBase.logger.isTraceEnabled()) {
      ParseTreeHelper.printChildren(methodName, ctx);
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr(final PostgreSQLParser.A_exprContext ctx) {
    final var methodName = "enterA_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_add(final PostgreSQLParser.A_expr_addContext ctx) {
    final var methodName = "enterA_expr_add";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_and(final PostgreSQLParser.A_expr_andContext ctx) {
    final var methodName = "enterA_expr_and";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_at_time_zone(final PostgreSQLParser.A_expr_at_time_zoneContext ctx) {
    final var methodName = "enterA_expr_at_time_zone";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_between(final PostgreSQLParser.A_expr_betweenContext ctx) {
    final var methodName = "enterA_expr_between";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_caret(final PostgreSQLParser.A_expr_caretContext ctx) {
    final var methodName = "enterA_expr_caret";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_collate(final PostgreSQLParser.A_expr_collateContext ctx) {
    final var methodName = "enterA_expr_collate";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_compare(final PostgreSQLParser.A_expr_compareContext ctx) {
    final var methodName = "enterA_expr_compare";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_in(final PostgreSQLParser.A_expr_inContext ctx) {
    final var methodName = "enterA_expr_in";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_is_not(final PostgreSQLParser.A_expr_is_notContext ctx) {
    final var methodName = "enterA_expr_is_not";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_isnull(final PostgreSQLParser.A_expr_isnullContext ctx) {
    final var methodName = "enterA_expr_isnull";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_lessless(final PostgreSQLParser.A_expr_lesslessContext ctx) {
    final var methodName = "enterA_expr_lessless";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_like(final PostgreSQLParser.A_expr_likeContext ctx) {
    final var methodName = "enterA_expr_like";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_mul(final PostgreSQLParser.A_expr_mulContext ctx) {
    final var methodName = "enterA_expr_mul";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_or(final PostgreSQLParser.A_expr_orContext ctx) {
    final var methodName = "enterA_expr_or";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_qual(final PostgreSQLParser.A_expr_qualContext ctx) {
    final var methodName = "enterA_expr_qual";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_qual_op(final PostgreSQLParser.A_expr_qual_opContext ctx) {
    final var methodName = "enterA_expr_qual_op";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_typecast(final PostgreSQLParser.A_expr_typecastContext ctx) {
    final var methodName = "enterA_expr_typecast";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_unary_not(final PostgreSQLParser.A_expr_unary_notContext ctx) {
    final var methodName = "enterA_expr_unary_not";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_unary_qualop(final PostgreSQLParser.A_expr_unary_qualopContext ctx) {
    final var methodName = "enterA_expr_unary_qualop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterA_expr_unary_sign(final PostgreSQLParser.A_expr_unary_signContext ctx) {
    final var methodName = "enterA_expr_unary_sign";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAccess_method_clause(final PostgreSQLParser.Access_method_clauseContext ctx) {
    final var methodName = "enterAccess_method_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_drop(final PostgreSQLParser.Add_dropContext ctx) {
    final var methodName = "enterAdd_drop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAexprconst(final PostgreSQLParser.AexprconstContext ctx) {
    final var methodName = "enterAexprconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggr_arg(final PostgreSQLParser.Aggr_argContext ctx) {
    final var methodName = "enterAggr_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggr_args(final PostgreSQLParser.Aggr_argsContext ctx) {
    final var methodName = "enterAggr_args";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggr_args_list(final PostgreSQLParser.Aggr_args_listContext ctx) {
    final var methodName = "enterAggr_args_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggregate_with_argtypes(
      final PostgreSQLParser.Aggregate_with_argtypesContext ctx) {
    final var methodName = "enterAggregate_with_argtypes";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggregate_with_argtypes_list(
      final PostgreSQLParser.Aggregate_with_argtypes_listContext ctx) {
    final var methodName = "enterAggregate_with_argtypes_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlias_clause(final PostgreSQLParser.Alias_clauseContext ctx) {
    final var methodName = "enterAlias_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAll_op(final PostgreSQLParser.All_opContext ctx) {
    final var methodName = "enterAll_op";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAll_or_distinct(final PostgreSQLParser.All_or_distinctContext ctx) {
    final var methodName = "enterAll_or_distinct";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_column_default(final PostgreSQLParser.Alter_column_defaultContext ctx) {
    final var methodName = "enterAlter_column_default";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_extension_opt_item(
      final PostgreSQLParser.Alter_extension_opt_itemContext ctx) {
    final var methodName = "enterAlter_extension_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_extension_opt_list(
      final PostgreSQLParser.Alter_extension_opt_listContext ctx) {
    final var methodName = "enterAlter_extension_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_generic_option_elem(
      final PostgreSQLParser.Alter_generic_option_elemContext ctx) {
    final var methodName = "enterAlter_generic_option_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_generic_option_list(
      final PostgreSQLParser.Alter_generic_option_listContext ctx) {
    final var methodName = "enterAlter_generic_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_generic_options(final PostgreSQLParser.Alter_generic_optionsContext ctx) {
    final var methodName = "enterAlter_generic_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_identity_column_option(
      final PostgreSQLParser.Alter_identity_column_optionContext ctx) {
    final var methodName = "enterAlter_identity_column_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_identity_column_option_list(
      final PostgreSQLParser.Alter_identity_column_option_listContext ctx) {
    final var methodName = "enterAlter_identity_column_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_cmd(final PostgreSQLParser.Alter_table_cmdContext ctx) {
    final var methodName = "enterAlter_table_cmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_cmds(final PostgreSQLParser.Alter_table_cmdsContext ctx) {
    final var methodName = "enterAlter_table_cmds";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_type_cmd(final PostgreSQLParser.Alter_type_cmdContext ctx) {
    final var methodName = "enterAlter_type_cmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_type_cmds(final PostgreSQLParser.Alter_type_cmdsContext ctx) {
    final var methodName = "enterAlter_type_cmds";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_using(final PostgreSQLParser.Alter_usingContext ctx) {
    final var methodName = "enterAlter_using";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAltercollationstmt(final PostgreSQLParser.AltercollationstmtContext ctx) {
    final var methodName = "enterAltercollationstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAltercompositetypestmt(
      final PostgreSQLParser.AltercompositetypestmtContext ctx) {
    final var methodName = "enterAltercompositetypestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterdatabasesetstmt(final PostgreSQLParser.AlterdatabasesetstmtContext ctx) {
    final var methodName = "enterAlterdatabasesetstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterdatabasestmt(final PostgreSQLParser.AlterdatabasestmtContext ctx) {
    final var methodName = "enterAlterdatabasestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterdefaultprivilegesstmt(
      final PostgreSQLParser.AlterdefaultprivilegesstmtContext ctx) {
    final var methodName = "enterAlterdefaultprivilegesstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterdomainstmt(final PostgreSQLParser.AlterdomainstmtContext ctx) {
    final var methodName = "enterAlterdomainstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterenumstmt(final PostgreSQLParser.AlterenumstmtContext ctx) {
    final var methodName = "enterAlterenumstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAltereventtrigstmt(final PostgreSQLParser.AltereventtrigstmtContext ctx) {
    final var methodName = "enterAltereventtrigstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterextensioncontentsstmt(
      final PostgreSQLParser.AlterextensioncontentsstmtContext ctx) {
    final var methodName = "enterAlterextensioncontentsstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterextensionstmt(final PostgreSQLParser.AlterextensionstmtContext ctx) {
    final var methodName = "enterAlterextensionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterfdwstmt(final PostgreSQLParser.AlterfdwstmtContext ctx) {
    final var methodName = "enterAlterfdwstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterforeignserverstmt(
      final PostgreSQLParser.AlterforeignserverstmtContext ctx) {
    final var methodName = "enterAlterforeignserverstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterfunc_opt_list(final PostgreSQLParser.Alterfunc_opt_listContext ctx) {
    final var methodName = "enterAlterfunc_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterfunctionstmt(final PostgreSQLParser.AlterfunctionstmtContext ctx) {
    final var methodName = "enterAlterfunctionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAltergroupstmt(final PostgreSQLParser.AltergroupstmtContext ctx) {
    final var methodName = "enterAltergroupstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterobjectdependsstmt(
      final PostgreSQLParser.AlterobjectdependsstmtContext ctx) {
    final var methodName = "enterAlterobjectdependsstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterobjectschemastmt(final PostgreSQLParser.AlterobjectschemastmtContext ctx) {
    final var methodName = "enterAlterobjectschemastmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlteroperatorstmt(final PostgreSQLParser.AlteroperatorstmtContext ctx) {
    final var methodName = "enterAlteroperatorstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlteropfamilystmt(final PostgreSQLParser.AlteropfamilystmtContext ctx) {
    final var methodName = "enterAlteropfamilystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlteroptroleelem(final PostgreSQLParser.AlteroptroleelemContext ctx) {
    final var methodName = "enterAlteroptroleelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlteroptrolelist(final PostgreSQLParser.AlteroptrolelistContext ctx) {
    final var methodName = "enterAlteroptrolelist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterownerstmt(final PostgreSQLParser.AlterownerstmtContext ctx) {
    final var methodName = "enterAlterownerstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterpolicystmt(final PostgreSQLParser.AlterpolicystmtContext ctx) {
    final var methodName = "enterAlterpolicystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterpublicationstmt(final PostgreSQLParser.AlterpublicationstmtContext ctx) {
    final var methodName = "enterAlterpublicationstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterrolesetstmt(final PostgreSQLParser.AlterrolesetstmtContext ctx) {
    final var methodName = "enterAlterrolesetstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterrolestmt(final PostgreSQLParser.AlterrolestmtContext ctx) {
    final var methodName = "enterAlterrolestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterseqstmt(final PostgreSQLParser.AlterseqstmtContext ctx) {
    final var methodName = "enterAlterseqstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterstatsstmt(final PostgreSQLParser.AlterstatsstmtContext ctx) {
    final var methodName = "enterAlterstatsstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAltersubscriptionstmt(final PostgreSQLParser.AltersubscriptionstmtContext ctx) {
    final var methodName = "enterAltersubscriptionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAltersystemstmt(final PostgreSQLParser.AltersystemstmtContext ctx) {
    final var methodName = "enterAltersystemstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAltertablestmt(final PostgreSQLParser.AltertablestmtContext ctx) {
    final var methodName = "enterAltertablestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAltertblspcstmt(final PostgreSQLParser.AltertblspcstmtContext ctx) {
    final var methodName = "enterAltertblspcstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAltertsconfigurationstmt(
      final PostgreSQLParser.AltertsconfigurationstmtContext ctx) {
    final var methodName = "enterAltertsconfigurationstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAltertsdictionarystmt(final PostgreSQLParser.AltertsdictionarystmtContext ctx) {
    final var methodName = "enterAltertsdictionarystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAltertypestmt(final PostgreSQLParser.AltertypestmtContext ctx) {
    final var methodName = "enterAltertypestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterusermappingstmt(final PostgreSQLParser.AlterusermappingstmtContext ctx) {
    final var methodName = "enterAlterusermappingstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAm_type(final PostgreSQLParser.Am_typeContext ctx) {
    final var methodName = "enterAm_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAnalyze_keyword(final PostgreSQLParser.Analyze_keywordContext ctx) {
    final var methodName = "enterAnalyze_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAnalyzestmt(final PostgreSQLParser.AnalyzestmtContext ctx) {
    final var methodName = "enterAnalyzestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAny_identifier(final PostgreSQLParser.Any_identifierContext ctx) {
    final var methodName = "enterAny_identifier";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAny_name(final PostgreSQLParser.Any_nameContext ctx) {
    final var methodName = "enterAny_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAny_name_list(final PostgreSQLParser.Any_name_listContext ctx) {
    final var methodName = "enterAny_name_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAny_operator(final PostgreSQLParser.Any_operatorContext ctx) {
    final var methodName = "enterAny_operator";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAny_with(final PostgreSQLParser.Any_withContext ctx) {
    final var methodName = "enterAny_with";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAnysconst(final PostgreSQLParser.AnysconstContext ctx) {
    final var methodName = "enterAnysconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterArg_class(final PostgreSQLParser.Arg_classContext ctx) {
    final var methodName = "enterArg_class";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterArray_expr(final PostgreSQLParser.Array_exprContext ctx) {
    final var methodName = "enterArray_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterArray_expr_list(final PostgreSQLParser.Array_expr_listContext ctx) {
    final var methodName = "enterArray_expr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAssign_operator(final PostgreSQLParser.Assign_operatorContext ctx) {
    final var methodName = "enterAssign_operator";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAssign_var(final PostgreSQLParser.Assign_varContext ctx) {
    final var methodName = "enterAssign_var";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAttr_name(final PostgreSQLParser.Attr_nameContext ctx) {
    final var methodName = "enterAttr_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAttrs(final PostgreSQLParser.AttrsContext ctx) {
    final var methodName = "enterAttrs";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAuth_ident(final PostgreSQLParser.Auth_identContext ctx) {
    final var methodName = "enterAuth_ident";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterB_expr(final PostgreSQLParser.B_exprContext ctx) {
    final var methodName = "enterB_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBconst(final PostgreSQLParser.BconstContext ctx) {
    final var methodName = "enterBconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBit(final PostgreSQLParser.BitContext ctx) {
    final var methodName = "enterBit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBitwithlength(final PostgreSQLParser.BitwithlengthContext ctx) {
    final var methodName = "enterBitwithlength";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBitwithoutlength(final PostgreSQLParser.BitwithoutlengthContext ctx) {
    final var methodName = "enterBitwithoutlength";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBuiltin_function_name(final PostgreSQLParser.Builtin_function_nameContext ctx) {
    final var methodName = "enterBuiltin_function_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterC_expr_case(final PostgreSQLParser.C_expr_caseContext ctx) {
    final var methodName = "enterC_expr_case";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterC_expr_exists(final PostgreSQLParser.C_expr_existsContext ctx) {
    final var methodName = "enterC_expr_exists";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterC_expr_expr(final PostgreSQLParser.C_expr_exprContext ctx) {
    final var methodName = "enterC_expr_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCallstmt(final PostgreSQLParser.CallstmtContext ctx) {
    final var methodName = "enterCallstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCase_arg(final PostgreSQLParser.Case_argContext ctx) {
    final var methodName = "enterCase_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCase_default(final PostgreSQLParser.Case_defaultContext ctx) {
    final var methodName = "enterCase_default";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCase_expr(final PostgreSQLParser.Case_exprContext ctx) {
    final var methodName = "enterCase_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCase_when(final PostgreSQLParser.Case_whenContext ctx) {
    final var methodName = "enterCase_when";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCase_when_list(final PostgreSQLParser.Case_when_listContext ctx) {
    final var methodName = "enterCase_when_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCast_context(final PostgreSQLParser.Cast_contextContext ctx) {
    final var methodName = "enterCast_context";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharacter(final PostgreSQLParser.CharacterContext ctx) {
    final var methodName = "enterCharacter";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharacter_c(final PostgreSQLParser.Character_cContext ctx) {
    final var methodName = "enterCharacter_c";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheckpointstmt(final PostgreSQLParser.CheckpointstmtContext ctx) {
    final var methodName = "enterCheckpointstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCloseportalstmt(final PostgreSQLParser.CloseportalstmtContext ctx) {
    final var methodName = "enterCloseportalstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCluster_index_specification(
      final PostgreSQLParser.Cluster_index_specificationContext ctx) {
    final var methodName = "enterCluster_index_specification";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClusterstmt(final PostgreSQLParser.ClusterstmtContext ctx) {
    final var methodName = "enterClusterstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCol_name_keyword(final PostgreSQLParser.Col_name_keywordContext ctx) {
    final var methodName = "enterCol_name_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColconstraint(final PostgreSQLParser.ColconstraintContext ctx) {
    final var methodName = "enterColconstraint";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColconstraintelem(final PostgreSQLParser.ColconstraintelemContext ctx) {
    final var methodName = "enterColconstraintelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColid(final PostgreSQLParser.ColidContext ctx) {
    final var methodName = "enterColid";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollabel(final PostgreSQLParser.CollabelContext ctx) {
    final var methodName = "enterCollabel";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColquallist(final PostgreSQLParser.ColquallistContext ctx) {
    final var methodName = "enterColquallist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnDef(final PostgreSQLParser.ColumnDefContext ctx) {
    final var methodName = "enterColumnDef";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnElem(final PostgreSQLParser.ColumnElemContext ctx) {
    final var methodName = "enterColumnElem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnlist(final PostgreSQLParser.ColumnlistContext ctx) {
    final var methodName = "enterColumnlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnOptions(final PostgreSQLParser.ColumnOptionsContext ctx) {
    final var methodName = "enterColumnOptions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnref(final PostgreSQLParser.ColumnrefContext ctx) {
    final var methodName = "enterColumnref";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComment_text(final PostgreSQLParser.Comment_textContext ctx) {
    final var methodName = "enterComment_text";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommentstmt(final PostgreSQLParser.CommentstmtContext ctx) {
    final var methodName = "enterCommentstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommon_func_opt_item(final PostgreSQLParser.Common_func_opt_itemContext ctx) {
    final var methodName = "enterCommon_func_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommon_table_expr(final PostgreSQLParser.Common_table_exprContext ctx) {
    final var methodName = "enterCommon_table_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComp_option(final PostgreSQLParser.Comp_optionContext ctx) {
    final var methodName = "enterComp_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComp_options(final PostgreSQLParser.Comp_optionsContext ctx) {
    final var methodName = "enterComp_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstbit(final PostgreSQLParser.ConstbitContext ctx) {
    final var methodName = "enterConstbit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstcharacter(final PostgreSQLParser.ConstcharacterContext ctx) {
    final var methodName = "enterConstcharacter";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstdatetime(final PostgreSQLParser.ConstdatetimeContext ctx) {
    final var methodName = "enterConstdatetime";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstinterval(final PostgreSQLParser.ConstintervalContext ctx) {
    final var methodName = "enterConstinterval";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraintattr(final PostgreSQLParser.ConstraintattrContext ctx) {
    final var methodName = "enterConstraintattr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraintattributeElem(
      final PostgreSQLParser.ConstraintattributeElemContext ctx) {
    final var methodName = "enterConstraintattributeElem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraintattributespec(
      final PostgreSQLParser.ConstraintattributespecContext ctx) {
    final var methodName = "enterConstraintattributespec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraintelem(final PostgreSQLParser.ConstraintelemContext ctx) {
    final var methodName = "enterConstraintelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraints_set_list(final PostgreSQLParser.Constraints_set_listContext ctx) {
    final var methodName = "enterConstraints_set_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraints_set_mode(final PostgreSQLParser.Constraints_set_modeContext ctx) {
    final var methodName = "enterConstraints_set_mode";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraintssetstmt(final PostgreSQLParser.ConstraintssetstmtContext ctx) {
    final var methodName = "enterConstraintssetstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConsttypename(final PostgreSQLParser.ConsttypenameContext ctx) {
    final var methodName = "enterConsttypename";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_delimiter(final PostgreSQLParser.Copy_delimiterContext ctx) {
    final var methodName = "enterCopy_delimiter";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_file_name(final PostgreSQLParser.Copy_file_nameContext ctx) {
    final var methodName = "enterCopy_file_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_from(final PostgreSQLParser.Copy_fromContext ctx) {
    final var methodName = "enterCopy_from";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_generic_opt_arg(final PostgreSQLParser.Copy_generic_opt_argContext ctx) {
    final var methodName = "enterCopy_generic_opt_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_generic_opt_arg_list(
      final PostgreSQLParser.Copy_generic_opt_arg_listContext ctx) {
    final var methodName = "enterCopy_generic_opt_arg_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_generic_opt_arg_list_item(
      final PostgreSQLParser.Copy_generic_opt_arg_list_itemContext ctx) {
    final var methodName = "enterCopy_generic_opt_arg_list_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_generic_opt_elem(final PostgreSQLParser.Copy_generic_opt_elemContext ctx) {
    final var methodName = "enterCopy_generic_opt_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_generic_opt_list(final PostgreSQLParser.Copy_generic_opt_listContext ctx) {
    final var methodName = "enterCopy_generic_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_opt_item(final PostgreSQLParser.Copy_opt_itemContext ctx) {
    final var methodName = "enterCopy_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_opt_list(final PostgreSQLParser.Copy_opt_listContext ctx) {
    final var methodName = "enterCopy_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_options(final PostgreSQLParser.Copy_optionsContext ctx) {
    final var methodName = "enterCopy_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopystmt(final PostgreSQLParser.CopystmtContext ctx) {
    final var methodName = "enterCopystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_as_target(final PostgreSQLParser.Create_as_targetContext ctx) {
    final var methodName = "enterCreate_as_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_extension_opt_item(
      final PostgreSQLParser.Create_extension_opt_itemContext ctx) {
    final var methodName = "enterCreate_extension_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_extension_opt_list(
      final PostgreSQLParser.Create_extension_opt_listContext ctx) {
    final var methodName = "enterCreate_extension_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_generic_options(
      final PostgreSQLParser.Create_generic_optionsContext ctx) {
    final var methodName = "enterCreate_generic_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_mv_target(final PostgreSQLParser.Create_mv_targetContext ctx) {
    final var methodName = "enterCreate_mv_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateamstmt(final PostgreSQLParser.CreateamstmtContext ctx) {
    final var methodName = "enterCreateamstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateassertionstmt(final PostgreSQLParser.CreateassertionstmtContext ctx) {
    final var methodName = "enterCreateassertionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateasstmt(final PostgreSQLParser.CreateasstmtContext ctx) {
    final var methodName = "enterCreateasstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatecaststmt(final PostgreSQLParser.CreatecaststmtContext ctx) {
    final var methodName = "enterCreatecaststmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateconversionstmt(final PostgreSQLParser.CreateconversionstmtContext ctx) {
    final var methodName = "enterCreateconversionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatedb_opt_item(final PostgreSQLParser.Createdb_opt_itemContext ctx) {
    final var methodName = "enterCreatedb_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatedb_opt_items(final PostgreSQLParser.Createdb_opt_itemsContext ctx) {
    final var methodName = "enterCreatedb_opt_items";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatedb_opt_list(final PostgreSQLParser.Createdb_opt_listContext ctx) {
    final var methodName = "enterCreatedb_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatedb_opt_name(final PostgreSQLParser.Createdb_opt_nameContext ctx) {
    final var methodName = "enterCreatedb_opt_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatedbstmt(final PostgreSQLParser.CreatedbstmtContext ctx) {
    final var methodName = "enterCreatedbstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatedomainstmt(final PostgreSQLParser.CreatedomainstmtContext ctx) {
    final var methodName = "enterCreatedomainstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateeventtrigstmt(final PostgreSQLParser.CreateeventtrigstmtContext ctx) {
    final var methodName = "enterCreateeventtrigstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateextensionstmt(final PostgreSQLParser.CreateextensionstmtContext ctx) {
    final var methodName = "enterCreateextensionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatefdwstmt(final PostgreSQLParser.CreatefdwstmtContext ctx) {
    final var methodName = "enterCreatefdwstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateforeignserverstmt(
      final PostgreSQLParser.CreateforeignserverstmtContext ctx) {
    final var methodName = "enterCreateforeignserverstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateforeigntablestmt(
      final PostgreSQLParser.CreateforeigntablestmtContext ctx) {
    final var methodName = "enterCreateforeigntablestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatefunc_opt_item(final PostgreSQLParser.Createfunc_opt_itemContext ctx) {
    final var methodName = "enterCreatefunc_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatefunc_opt_list(final PostgreSQLParser.Createfunc_opt_listContext ctx) {
    final var methodName = "enterCreatefunc_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatefunctionstmt(final PostgreSQLParser.CreatefunctionstmtContext ctx) {
    final var methodName = "enterCreatefunctionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreategroupstmt(final PostgreSQLParser.CreategroupstmtContext ctx) {
    final var methodName = "enterCreategroupstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatematviewstmt(final PostgreSQLParser.CreatematviewstmtContext ctx) {
    final var methodName = "enterCreatematviewstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateopclassstmt(final PostgreSQLParser.CreateopclassstmtContext ctx) {
    final var methodName = "enterCreateopclassstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateopfamilystmt(final PostgreSQLParser.CreateopfamilystmtContext ctx) {
    final var methodName = "enterCreateopfamilystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateoptroleelem(final PostgreSQLParser.CreateoptroleelemContext ctx) {
    final var methodName = "enterCreateoptroleelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateplangstmt(final PostgreSQLParser.CreateplangstmtContext ctx) {
    final var methodName = "enterCreateplangstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatepolicystmt(final PostgreSQLParser.CreatepolicystmtContext ctx) {
    final var methodName = "enterCreatepolicystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatepublicationstmt(final PostgreSQLParser.CreatepublicationstmtContext ctx) {
    final var methodName = "enterCreatepublicationstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreaterolestmt(final PostgreSQLParser.CreaterolestmtContext ctx) {
    final var methodName = "enterCreaterolestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateschemastmt(final PostgreSQLParser.CreateschemastmtContext ctx) {
    final var methodName = "enterCreateschemastmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateseqstmt(final PostgreSQLParser.CreateseqstmtContext ctx) {
    final var methodName = "enterCreateseqstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatestatsstmt(final PostgreSQLParser.CreatestatsstmtContext ctx) {
    final var methodName = "enterCreatestatsstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatestmt(final PostgreSQLParser.CreatestmtContext ctx) {
    final var methodName = "enterCreatestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatesubscriptionstmt(
      final PostgreSQLParser.CreatesubscriptionstmtContext ctx) {
    final var methodName = "enterCreatesubscriptionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatetablespacestmt(final PostgreSQLParser.CreatetablespacestmtContext ctx) {
    final var methodName = "enterCreatetablespacestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatetransformstmt(final PostgreSQLParser.CreatetransformstmtContext ctx) {
    final var methodName = "enterCreatetransformstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatetrigstmt(final PostgreSQLParser.CreatetrigstmtContext ctx) {
    final var methodName = "enterCreatetrigstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateusermappingstmt(final PostgreSQLParser.CreateusermappingstmtContext ctx) {
    final var methodName = "enterCreateusermappingstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateuserstmt(final PostgreSQLParser.CreateuserstmtContext ctx) {
    final var methodName = "enterCreateuserstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCte_list(final PostgreSQLParser.Cte_listContext ctx) {
    final var methodName = "enterCte_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCube_clause(final PostgreSQLParser.Cube_clauseContext ctx) {
    final var methodName = "enterCube_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCursor_name(final PostgreSQLParser.Cursor_nameContext ctx) {
    final var methodName = "enterCursor_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCursor_options(final PostgreSQLParser.Cursor_optionsContext ctx) {
    final var methodName = "enterCursor_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCursor_variable(final PostgreSQLParser.Cursor_variableContext ctx) {
    final var methodName = "enterCursor_variable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeallocatestmt(final PostgreSQLParser.DeallocatestmtContext ctx) {
    final var methodName = "enterDeallocatestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_aliasitem(final PostgreSQLParser.Decl_aliasitemContext ctx) {
    final var methodName = "enterDecl_aliasitem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_collate(final PostgreSQLParser.Decl_collateContext ctx) {
    final var methodName = "enterDecl_collate";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_const(final PostgreSQLParser.Decl_constContext ctx) {
    final var methodName = "enterDecl_const";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_cursor_arg(final PostgreSQLParser.Decl_cursor_argContext ctx) {
    final var methodName = "enterDecl_cursor_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_cursor_arglist(final PostgreSQLParser.Decl_cursor_arglistContext ctx) {
    final var methodName = "enterDecl_cursor_arglist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_cursor_args(final PostgreSQLParser.Decl_cursor_argsContext ctx) {
    final var methodName = "enterDecl_cursor_args";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_cursor_query(final PostgreSQLParser.Decl_cursor_queryContext ctx) {
    final var methodName = "enterDecl_cursor_query";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_datatype(final PostgreSQLParser.Decl_datatypeContext ctx) {
    final var methodName = "enterDecl_datatype";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_defkey(final PostgreSQLParser.Decl_defkeyContext ctx) {
    final var methodName = "enterDecl_defkey";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_defval(final PostgreSQLParser.Decl_defvalContext ctx) {
    final var methodName = "enterDecl_defval";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_is_for(final PostgreSQLParser.Decl_is_forContext ctx) {
    final var methodName = "enterDecl_is_for";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_notnull(final PostgreSQLParser.Decl_notnullContext ctx) {
    final var methodName = "enterDecl_notnull";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_sect(final PostgreSQLParser.Decl_sectContext ctx) {
    final var methodName = "enterDecl_sect";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_start(final PostgreSQLParser.Decl_startContext ctx) {
    final var methodName = "enterDecl_start";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_statement(final PostgreSQLParser.Decl_statementContext ctx) {
    final var methodName = "enterDecl_statement";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_stmt(final PostgreSQLParser.Decl_stmtContext ctx) {
    final var methodName = "enterDecl_stmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_stmts(final PostgreSQLParser.Decl_stmtsContext ctx) {
    final var methodName = "enterDecl_stmts";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecl_varname(final PostgreSQLParser.Decl_varnameContext ctx) {
    final var methodName = "enterDecl_varname";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeclarecursorstmt(final PostgreSQLParser.DeclarecursorstmtContext ctx) {
    final var methodName = "enterDeclarecursorstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDef_arg(final PostgreSQLParser.Def_argContext ctx) {
    final var methodName = "enterDef_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDef_elem(final PostgreSQLParser.Def_elemContext ctx) {
    final var methodName = "enterDef_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDef_list(final PostgreSQLParser.Def_listContext ctx) {
    final var methodName = "enterDef_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefacl_privilege_target(
      final PostgreSQLParser.Defacl_privilege_targetContext ctx) {
    final var methodName = "enterDefacl_privilege_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefaclaction(final PostgreSQLParser.DefaclactionContext ctx) {
    final var methodName = "enterDefaclaction";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefacloption(final PostgreSQLParser.DefacloptionContext ctx) {
    final var methodName = "enterDefacloption";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefacloptionlist(final PostgreSQLParser.DefacloptionlistContext ctx) {
    final var methodName = "enterDefacloptionlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefinestmt(final PostgreSQLParser.DefinestmtContext ctx) {
    final var methodName = "enterDefinestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefinition(final PostgreSQLParser.DefinitionContext ctx) {
    final var methodName = "enterDefinition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeletestmt(final PostgreSQLParser.DeletestmtContext ctx) {
    final var methodName = "enterDeletestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDiscardstmt(final PostgreSQLParser.DiscardstmtContext ctx) {
    final var methodName = "enterDiscardstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDistinct_clause(final PostgreSQLParser.Distinct_clauseContext ctx) {
    final var methodName = "enterDistinct_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDocument_or_content(final PostgreSQLParser.Document_or_contentContext ctx) {
    final var methodName = "enterDocument_or_content";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDostmt(final PostgreSQLParser.DostmtContext ctx) {
    final var methodName = "enterDostmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDostmt_opt_item(final PostgreSQLParser.Dostmt_opt_itemContext ctx) {
    final var methodName = "enterDostmt_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDostmt_opt_list(final PostgreSQLParser.Dostmt_opt_listContext ctx) {
    final var methodName = "enterDostmt_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_option(final PostgreSQLParser.Drop_optionContext ctx) {
    final var methodName = "enterDrop_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_option_list(final PostgreSQLParser.Drop_option_listContext ctx) {
    final var methodName = "enterDrop_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_type_name(final PostgreSQLParser.Drop_type_nameContext ctx) {
    final var methodName = "enterDrop_type_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropcaststmt(final PostgreSQLParser.DropcaststmtContext ctx) {
    final var methodName = "enterDropcaststmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropdbstmt(final PostgreSQLParser.DropdbstmtContext ctx) {
    final var methodName = "enterDropdbstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropopclassstmt(final PostgreSQLParser.DropopclassstmtContext ctx) {
    final var methodName = "enterDropopclassstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropopfamilystmt(final PostgreSQLParser.DropopfamilystmtContext ctx) {
    final var methodName = "enterDropopfamilystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropownedstmt(final PostgreSQLParser.DropownedstmtContext ctx) {
    final var methodName = "enterDropownedstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDroprolestmt(final PostgreSQLParser.DroprolestmtContext ctx) {
    final var methodName = "enterDroprolestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropstmt(final PostgreSQLParser.DropstmtContext ctx) {
    final var methodName = "enterDropstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropsubscriptionstmt(final PostgreSQLParser.DropsubscriptionstmtContext ctx) {
    final var methodName = "enterDropsubscriptionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDroptablespacestmt(final PostgreSQLParser.DroptablespacestmtContext ctx) {
    final var methodName = "enterDroptablespacestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDroptransformstmt(final PostgreSQLParser.DroptransformstmtContext ctx) {
    final var methodName = "enterDroptransformstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropusermappingstmt(final PostgreSQLParser.DropusermappingstmtContext ctx) {
    final var methodName = "enterDropusermappingstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEmpty_grouping_set(final PostgreSQLParser.Empty_grouping_setContext ctx) {
    final var methodName = "enterEmpty_grouping_set";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnable_trigger(final PostgreSQLParser.Enable_triggerContext ctx) {
    final var methodName = "enterEnable_trigger";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnum_val_list(final PostgreSQLParser.Enum_val_listContext ctx) {
    final var methodName = "enterEnum_val_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEvent(final PostgreSQLParser.EventContext ctx) {
    final var methodName = "enterEvent";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEvent_trigger_value_list(
      final PostgreSQLParser.Event_trigger_value_listContext ctx) {
    final var methodName = "enterEvent_trigger_value_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEvent_trigger_when_item(
      final PostgreSQLParser.Event_trigger_when_itemContext ctx) {
    final var methodName = "enterEvent_trigger_when_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEvent_trigger_when_list(
      final PostgreSQLParser.Event_trigger_when_listContext ctx) {
    final var methodName = "enterEvent_trigger_when_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    final var methodName = "enterEveryRule";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterException_sect(final PostgreSQLParser.Exception_sectContext ctx) {
    final var methodName = "enterException_sect";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExclusionconstraintelem(
      final PostgreSQLParser.ExclusionconstraintelemContext ctx) {
    final var methodName = "enterExclusionconstraintelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExclusionconstraintlist(
      final PostgreSQLParser.ExclusionconstraintlistContext ctx) {
    final var methodName = "enterExclusionconstraintlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExclusionwhereclause(final PostgreSQLParser.ExclusionwhereclauseContext ctx) {
    final var methodName = "enterExclusionwhereclause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecute_param_clause(final PostgreSQLParser.Execute_param_clauseContext ctx) {
    final var methodName = "enterExecute_param_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecutestmt(final PostgreSQLParser.ExecutestmtContext ctx) {
    final var methodName = "enterExecutestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExistingindex(final PostgreSQLParser.ExistingindexContext ctx) {
    final var methodName = "enterExistingindex";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExit_type(final PostgreSQLParser.Exit_typeContext ctx) {
    final var methodName = "enterExit_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplain_option_arg(final PostgreSQLParser.Explain_option_argContext ctx) {
    final var methodName = "enterExplain_option_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplain_option_elem(final PostgreSQLParser.Explain_option_elemContext ctx) {
    final var methodName = "enterExplain_option_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplain_option_list(final PostgreSQLParser.Explain_option_listContext ctx) {
    final var methodName = "enterExplain_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplain_option_name(final PostgreSQLParser.Explain_option_nameContext ctx) {
    final var methodName = "enterExplain_option_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplainablestmt(final PostgreSQLParser.ExplainablestmtContext ctx) {
    final var methodName = "enterExplainablestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplainstmt(final PostgreSQLParser.ExplainstmtContext ctx) {
    final var methodName = "enterExplainstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplicit_row(final PostgreSQLParser.Explicit_rowContext ctx) {
    final var methodName = "enterExplicit_row";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr_list(final PostgreSQLParser.Expr_listContext ctx) {
    final var methodName = "enterExpr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr_until_loop(final PostgreSQLParser.Expr_until_loopContext ctx) {
    final var methodName = "enterExpr_until_loop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr_until_rightbracket(
      final PostgreSQLParser.Expr_until_rightbracketContext ctx) {
    final var methodName = "enterExpr_until_rightbracket";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr_until_semi(final PostgreSQLParser.Expr_until_semiContext ctx) {
    final var methodName = "enterExpr_until_semi";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr_until_then(final PostgreSQLParser.Expr_until_thenContext ctx) {
    final var methodName = "enterExpr_until_then";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExtract_arg(final PostgreSQLParser.Extract_argContext ctx) {
    final var methodName = "enterExtract_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExtract_list(final PostgreSQLParser.Extract_listContext ctx) {
    final var methodName = "enterExtract_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFconst(final PostgreSQLParser.FconstContext ctx) {
    final var methodName = "enterFconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFdw_option(final PostgreSQLParser.Fdw_optionContext ctx) {
    final var methodName = "enterFdw_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFdw_options(final PostgreSQLParser.Fdw_optionsContext ctx) {
    final var methodName = "enterFdw_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFetch_args(final PostgreSQLParser.Fetch_argsContext ctx) {
    final var methodName = "enterFetch_args";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFetchstmt(final PostgreSQLParser.FetchstmtContext ctx) {
    final var methodName = "enterFetchstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFile_name(final PostgreSQLParser.File_nameContext ctx) {
    final var methodName = "enterFile_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFilter_clause(final PostgreSQLParser.Filter_clauseContext ctx) {
    final var methodName = "enterFilter_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFirst_or_next(final PostgreSQLParser.First_or_nextContext ctx) {
    final var methodName = "enterFirst_or_next";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFor_control(final PostgreSQLParser.For_controlContext ctx) {
    final var methodName = "enterFor_control";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFor_locking_clause(final PostgreSQLParser.For_locking_clauseContext ctx) {
    final var methodName = "enterFor_locking_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFor_locking_item(final PostgreSQLParser.For_locking_itemContext ctx) {
    final var methodName = "enterFor_locking_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFor_locking_items(final PostgreSQLParser.For_locking_itemsContext ctx) {
    final var methodName = "enterFor_locking_items";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFor_locking_strength(final PostgreSQLParser.For_locking_strengthContext ctx) {
    final var methodName = "enterFor_locking_strength";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFor_variable(final PostgreSQLParser.For_variableContext ctx) {
    final var methodName = "enterFor_variable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForeach_slice(final PostgreSQLParser.Foreach_sliceContext ctx) {
    final var methodName = "enterForeach_slice";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForeign_server_version(
      final PostgreSQLParser.Foreign_server_versionContext ctx) {
    final var methodName = "enterForeign_server_version";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrame_bound(final PostgreSQLParser.Frame_boundContext ctx) {
    final var methodName = "enterFrame_bound";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrame_extent(final PostgreSQLParser.Frame_extentContext ctx) {
    final var methodName = "enterFrame_extent";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrom_clause(final PostgreSQLParser.From_clauseContext ctx) {
    final var methodName = "enterFrom_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrom_in(final PostgreSQLParser.From_inContext ctx) {
    final var methodName = "enterFrom_in";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrom_list(final PostgreSQLParser.From_listContext ctx) {
    final var methodName = "enterFrom_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_alias_clause(final PostgreSQLParser.Func_alias_clauseContext ctx) {
    final var methodName = "enterFunc_alias_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_application(final PostgreSQLParser.Func_applicationContext ctx) {
    final var methodName = "enterFunc_application";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_arg(final PostgreSQLParser.Func_argContext ctx) {
    final var methodName = "enterFunc_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_arg_expr(final PostgreSQLParser.Func_arg_exprContext ctx) {
    final var methodName = "enterFunc_arg_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_arg_list(final PostgreSQLParser.Func_arg_listContext ctx) {
    final var methodName = "enterFunc_arg_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_arg_with_default(final PostgreSQLParser.Func_arg_with_defaultContext ctx) {
    final var methodName = "enterFunc_arg_with_default";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_args(final PostgreSQLParser.Func_argsContext ctx) {
    final var methodName = "enterFunc_args";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_args_list(final PostgreSQLParser.Func_args_listContext ctx) {
    final var methodName = "enterFunc_args_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_args_with_defaults(
      final PostgreSQLParser.Func_args_with_defaultsContext ctx) {
    final var methodName = "enterFunc_args_with_defaults";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_args_with_defaults_list(
      final PostgreSQLParser.Func_args_with_defaults_listContext ctx) {
    final var methodName = "enterFunc_args_with_defaults_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_as(final PostgreSQLParser.Func_asContext ctx) {
    final var methodName = "enterFunc_as";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_expr(final PostgreSQLParser.Func_exprContext ctx) {
    final var methodName = "enterFunc_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_expr_common_subexpr(
      final PostgreSQLParser.Func_expr_common_subexprContext ctx) {
    final var methodName = "enterFunc_expr_common_subexpr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_expr_windowless(final PostgreSQLParser.Func_expr_windowlessContext ctx) {
    final var methodName = "enterFunc_expr_windowless";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_name(final PostgreSQLParser.Func_nameContext ctx) {
    final var methodName = "enterFunc_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_return(final PostgreSQLParser.Func_returnContext ctx) {
    final var methodName = "enterFunc_return";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_table(final PostgreSQLParser.Func_tableContext ctx) {
    final var methodName = "enterFunc_table";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_type(final PostgreSQLParser.Func_typeContext ctx) {
    final var methodName = "enterFunc_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_or_procedure(final PostgreSQLParser.Function_or_procedureContext ctx) {
    final var methodName = "enterFunction_or_procedure";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_with_argtypes(
      final PostgreSQLParser.Function_with_argtypesContext ctx) {
    final var methodName = "enterFunction_with_argtypes";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_with_argtypes_list(
      final PostgreSQLParser.Function_with_argtypes_listContext ctx) {
    final var methodName = "enterFunction_with_argtypes_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionsetresetclause(
      final PostgreSQLParser.FunctionsetresetclauseContext ctx) {
    final var methodName = "enterFunctionsetresetclause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGenerated_when(final PostgreSQLParser.Generated_whenContext ctx) {
    final var methodName = "enterGenerated_when";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneric_option_arg(final PostgreSQLParser.Generic_option_argContext ctx) {
    final var methodName = "enterGeneric_option_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneric_option_elem(final PostgreSQLParser.Generic_option_elemContext ctx) {
    final var methodName = "enterGeneric_option_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneric_option_list(final PostgreSQLParser.Generic_option_listContext ctx) {
    final var methodName = "enterGeneric_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneric_option_name(final PostgreSQLParser.Generic_option_nameContext ctx) {
    final var methodName = "enterGeneric_option_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneric_reset(final PostgreSQLParser.Generic_resetContext ctx) {
    final var methodName = "enterGeneric_reset";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneric_set(final PostgreSQLParser.Generic_setContext ctx) {
    final var methodName = "enterGeneric_set";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGenerictype(final PostgreSQLParser.GenerictypeContext ctx) {
    final var methodName = "enterGenerictype";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGetdiag_area_opt(final PostgreSQLParser.Getdiag_area_optContext ctx) {
    final var methodName = "enterGetdiag_area_opt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGetdiag_item(final PostgreSQLParser.Getdiag_itemContext ctx) {
    final var methodName = "enterGetdiag_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGetdiag_list(final PostgreSQLParser.Getdiag_listContext ctx) {
    final var methodName = "enterGetdiag_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGetdiag_list_item(final PostgreSQLParser.Getdiag_list_itemContext ctx) {
    final var methodName = "enterGetdiag_list_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGetdiag_target(final PostgreSQLParser.Getdiag_targetContext ctx) {
    final var methodName = "enterGetdiag_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantee(final PostgreSQLParser.GranteeContext ctx) {
    final var methodName = "enterGrantee";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantee_list(final PostgreSQLParser.Grantee_listContext ctx) {
    final var methodName = "enterGrantee_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantrolestmt(final PostgreSQLParser.GrantrolestmtContext ctx) {
    final var methodName = "enterGrantrolestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantstmt(final PostgreSQLParser.GrantstmtContext ctx) {
    final var methodName = "enterGrantstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroup_by_item(final PostgreSQLParser.Group_by_itemContext ctx) {
    final var methodName = "enterGroup_by_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroup_by_list(final PostgreSQLParser.Group_by_listContext ctx) {
    final var methodName = "enterGroup_by_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroup_clause(final PostgreSQLParser.Group_clauseContext ctx) {
    final var methodName = "enterGroup_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrouping_sets_clause(final PostgreSQLParser.Grouping_sets_clauseContext ctx) {
    final var methodName = "enterGrouping_sets_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandler_name(final PostgreSQLParser.Handler_nameContext ctx) {
    final var methodName = "enterHandler_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHash_partbound(final PostgreSQLParser.Hash_partboundContext ctx) {
    final var methodName = "enterHash_partbound";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHash_partbound_elem(final PostgreSQLParser.Hash_partbound_elemContext ctx) {
    final var methodName = "enterHash_partbound_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHaving_clause(final PostgreSQLParser.Having_clauseContext ctx) {
    final var methodName = "enterHaving_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterI_or_f_const(final PostgreSQLParser.I_or_f_constContext ctx) {
    final var methodName = "enterI_or_f_const";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIconst(final PostgreSQLParser.IconstContext ctx) {
    final var methodName = "enterIconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIdentifier(final PostgreSQLParser.IdentifierContext ctx) {
    final var methodName = "enterIdentifier";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImplicit_row(final PostgreSQLParser.Implicit_rowContext ctx) {
    final var methodName = "enterImplicit_row";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImport_qualification(final PostgreSQLParser.Import_qualificationContext ctx) {
    final var methodName = "enterImport_qualification";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImport_qualification_type(
      final PostgreSQLParser.Import_qualification_typeContext ctx) {
    final var methodName = "enterImport_qualification_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImportforeignschemastmt(
      final PostgreSQLParser.ImportforeignschemastmtContext ctx) {
    final var methodName = "enterImportforeignschemastmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIn_expr_list(final PostgreSQLParser.In_expr_listContext ctx) {
    final var methodName = "enterIn_expr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIn_expr_select(final PostgreSQLParser.In_expr_selectContext ctx) {
    final var methodName = "enterIn_expr_select";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_elem(final PostgreSQLParser.Index_elemContext ctx) {
    final var methodName = "enterIndex_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_elem_options(final PostgreSQLParser.Index_elem_optionsContext ctx) {
    final var methodName = "enterIndex_elem_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_including_params(
      final PostgreSQLParser.Index_including_paramsContext ctx) {
    final var methodName = "enterIndex_including_params";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_params(final PostgreSQLParser.Index_paramsContext ctx) {
    final var methodName = "enterIndex_params";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_partition_cmd(final PostgreSQLParser.Index_partition_cmdContext ctx) {
    final var methodName = "enterIndex_partition_cmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexstmt(final PostgreSQLParser.IndexstmtContext ctx) {
    final var methodName = "enterIndexstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndirection(final PostgreSQLParser.IndirectionContext ctx) {
    final var methodName = "enterIndirection";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndirection_el(final PostgreSQLParser.Indirection_elContext ctx) {
    final var methodName = "enterIndirection_el";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsert_column_item(final PostgreSQLParser.Insert_column_itemContext ctx) {
    final var methodName = "enterInsert_column_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsert_column_list(final PostgreSQLParser.Insert_column_listContext ctx) {
    final var methodName = "enterInsert_column_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsert_rest(final PostgreSQLParser.Insert_restContext ctx) {
    final var methodName = "enterInsert_rest";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsert_target(final PostgreSQLParser.Insert_targetContext ctx) {
    final var methodName = "enterInsert_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsertstmt(final PostgreSQLParser.InsertstmtContext ctx) {
    final var methodName = "enterInsertstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInterval_second(final PostgreSQLParser.Interval_secondContext ctx) {
    final var methodName = "enterInterval_second";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInto_clause(final PostgreSQLParser.Into_clauseContext ctx) {
    final var methodName = "enterInto_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInto_target(final PostgreSQLParser.Into_targetContext ctx) {
    final var methodName = "enterInto_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIso_level(final PostgreSQLParser.Iso_levelContext ctx) {
    final var methodName = "enterIso_level";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_qual(final PostgreSQLParser.Join_qualContext ctx) {
    final var methodName = "enterJoin_qual";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_type(final PostgreSQLParser.Join_typeContext ctx) {
    final var methodName = "enterJoin_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKey_action(final PostgreSQLParser.Key_actionContext ctx) {
    final var methodName = "enterKey_action";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKey_actions(final PostgreSQLParser.Key_actionsContext ctx) {
    final var methodName = "enterKey_actions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKey_delete(final PostgreSQLParser.Key_deleteContext ctx) {
    final var methodName = "enterKey_delete";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKey_match(final PostgreSQLParser.Key_matchContext ctx) {
    final var methodName = "enterKey_match";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKey_update(final PostgreSQLParser.Key_updateContext ctx) {
    final var methodName = "enterKey_update";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLabel_decl(final PostgreSQLParser.Label_declContext ctx) {
    final var methodName = "enterLabel_decl";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLimit_clause(final PostgreSQLParser.Limit_clauseContext ctx) {
    final var methodName = "enterLimit_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterListenstmt(final PostgreSQLParser.ListenstmtContext ctx) {
    final var methodName = "enterListenstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoadstmt(final PostgreSQLParser.LoadstmtContext ctx) {
    final var methodName = "enterLoadstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLock_type(final PostgreSQLParser.Lock_typeContext ctx) {
    final var methodName = "enterLock_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLocked_rels_list(final PostgreSQLParser.Locked_rels_listContext ctx) {
    final var methodName = "enterLocked_rels_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockstmt(final PostgreSQLParser.LockstmtContext ctx) {
    final var methodName = "enterLockstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoop_body(final PostgreSQLParser.Loop_bodyContext ctx) {
    final var methodName = "enterLoop_body";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMake_execsql_stmt(final PostgreSQLParser.Make_execsql_stmtContext ctx) {
    final var methodName = "enterMake_execsql_stmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMathop(final PostgreSQLParser.MathopContext ctx) {
    final var methodName = "enterMathop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_delete_clause(final PostgreSQLParser.Merge_delete_clauseContext ctx) {
    final var methodName = "enterMerge_delete_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_insert_clause(final PostgreSQLParser.Merge_insert_clauseContext ctx) {
    final var methodName = "enterMerge_insert_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_update_clause(final PostgreSQLParser.Merge_update_clauseContext ctx) {
    final var methodName = "enterMerge_update_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMergestmt(final PostgreSQLParser.MergestmtContext ctx) {
    final var methodName = "enterMergestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterName(final PostgreSQLParser.NameContext ctx) {
    final var methodName = "enterName";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterName_list(final PostgreSQLParser.Name_listContext ctx) {
    final var methodName = "enterName_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNon_ansi_join(final PostgreSQLParser.Non_ansi_joinContext ctx) {
    final var methodName = "enterNon_ansi_join";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNonreservedword(final PostgreSQLParser.NonreservedwordContext ctx) {
    final var methodName = "enterNonreservedword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNonreservedword_or_sconst(
      final PostgreSQLParser.Nonreservedword_or_sconstContext ctx) {
    final var methodName = "enterNonreservedword_or_sconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNotify_payload(final PostgreSQLParser.Notify_payloadContext ctx) {
    final var methodName = "enterNotify_payload";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNotifystmt(final PostgreSQLParser.NotifystmtContext ctx) {
    final var methodName = "enterNotifystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNumeric(final PostgreSQLParser.NumericContext ctx) {
    final var methodName = "enterNumeric";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNumericonly(final PostgreSQLParser.NumericonlyContext ctx) {
    final var methodName = "enterNumericonly";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNumericonly_list(final PostgreSQLParser.Numericonly_listContext ctx) {
    final var methodName = "enterNumericonly_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_type_any_name(final PostgreSQLParser.Object_type_any_nameContext ctx) {
    final var methodName = "enterObject_type_any_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_type_name(final PostgreSQLParser.Object_type_nameContext ctx) {
    final var methodName = "enterObject_type_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_type_name_on_any_name(
      final PostgreSQLParser.Object_type_name_on_any_nameContext ctx) {
    final var methodName = "enterObject_type_name_on_any_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOffset_clause(final PostgreSQLParser.Offset_clauseContext ctx) {
    final var methodName = "enterOffset_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOld_aggr_definition(final PostgreSQLParser.Old_aggr_definitionContext ctx) {
    final var methodName = "enterOld_aggr_definition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOld_aggr_elem(final PostgreSQLParser.Old_aggr_elemContext ctx) {
    final var methodName = "enterOld_aggr_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOld_aggr_list(final PostgreSQLParser.Old_aggr_listContext ctx) {
    final var methodName = "enterOld_aggr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOncommitoption(final PostgreSQLParser.OncommitoptionContext ctx) {
    final var methodName = "enterOncommitoption";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpclass_drop(final PostgreSQLParser.Opclass_dropContext ctx) {
    final var methodName = "enterOpclass_drop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpclass_drop_list(final PostgreSQLParser.Opclass_drop_listContext ctx) {
    final var methodName = "enterOpclass_drop_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpclass_item(final PostgreSQLParser.Opclass_itemContext ctx) {
    final var methodName = "enterOpclass_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpclass_item_list(final PostgreSQLParser.Opclass_item_listContext ctx) {
    final var methodName = "enterOpclass_item_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpclass_purpose(final PostgreSQLParser.Opclass_purposeContext ctx) {
    final var methodName = "enterOpclass_purpose";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOper_argtypes(final PostgreSQLParser.Oper_argtypesContext ctx) {
    final var methodName = "enterOper_argtypes";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOperator_def_arg(final PostgreSQLParser.Operator_def_argContext ctx) {
    final var methodName = "enterOperator_def_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOperator_def_elem(final PostgreSQLParser.Operator_def_elemContext ctx) {
    final var methodName = "enterOperator_def_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOperator_def_list(final PostgreSQLParser.Operator_def_listContext ctx) {
    final var methodName = "enterOperator_def_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOperator_with_argtypes(
      final PostgreSQLParser.Operator_with_argtypesContext ctx) {
    final var methodName = "enterOperator_with_argtypes";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOperator_with_argtypes_list(
      final PostgreSQLParser.Operator_with_argtypes_listContext ctx) {
    final var methodName = "enterOperator_with_argtypes_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_alias_clause(final PostgreSQLParser.Opt_alias_clauseContext ctx) {
    final var methodName = "enterOpt_alias_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_all_clause(final PostgreSQLParser.Opt_all_clauseContext ctx) {
    final var methodName = "enterOpt_all_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_analyze(final PostgreSQLParser.Opt_analyzeContext ctx) {
    final var methodName = "enterOpt_analyze";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_array_bounds(final PostgreSQLParser.Opt_array_boundsContext ctx) {
    final var methodName = "enterOpt_array_bounds";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_as(final PostgreSQLParser.Opt_asContext ctx) {
    final var methodName = "enterOpt_as";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_asc_desc(final PostgreSQLParser.Opt_asc_descContext ctx) {
    final var methodName = "enterOpt_asc_desc";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_binary(final PostgreSQLParser.Opt_binaryContext ctx) {
    final var methodName = "enterOpt_binary";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_block_label(final PostgreSQLParser.Opt_block_labelContext ctx) {
    final var methodName = "enterOpt_block_label";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_boolean_or_string(final PostgreSQLParser.Opt_boolean_or_stringContext ctx) {
    final var methodName = "enterOpt_boolean_or_string";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_by(final PostgreSQLParser.Opt_byContext ctx) {
    final var methodName = "enterOpt_by";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_by_expression(final PostgreSQLParser.Opt_by_expressionContext ctx) {
    final var methodName = "enterOpt_by_expression";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_c_include(final PostgreSQLParser.Opt_c_includeContext ctx) {
    final var methodName = "enterOpt_c_include";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_case_else(final PostgreSQLParser.Opt_case_elseContext ctx) {
    final var methodName = "enterOpt_case_else";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_check_option(final PostgreSQLParser.Opt_check_optionContext ctx) {
    final var methodName = "enterOpt_check_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_class(final PostgreSQLParser.Opt_classContext ctx) {
    final var methodName = "enterOpt_class";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_col_def_list(final PostgreSQLParser.Opt_col_def_listContext ctx) {
    final var methodName = "enterOpt_col_def_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_collate(final PostgreSQLParser.Opt_collateContext ctx) {
    final var methodName = "enterOpt_collate";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_collate_clause(final PostgreSQLParser.Opt_collate_clauseContext ctx) {
    final var methodName = "enterOpt_collate_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_column(final PostgreSQLParser.Opt_columnContext ctx) {
    final var methodName = "enterOpt_column";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_column_list(final PostgreSQLParser.Opt_column_listContext ctx) {
    final var methodName = "enterOpt_column_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_concurrently(final PostgreSQLParser.Opt_concurrentlyContext ctx) {
    final var methodName = "enterOpt_concurrently";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_conf_expr(final PostgreSQLParser.Opt_conf_exprContext ctx) {
    final var methodName = "enterOpt_conf_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_cursor_from(final PostgreSQLParser.Opt_cursor_fromContext ctx) {
    final var methodName = "enterOpt_cursor_from";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_cursor_parameters(final PostgreSQLParser.Opt_cursor_parametersContext ctx) {
    final var methodName = "enterOpt_cursor_parameters";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_default(final PostgreSQLParser.Opt_defaultContext ctx) {
    final var methodName = "enterOpt_default";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_definition(final PostgreSQLParser.Opt_definitionContext ctx) {
    final var methodName = "enterOpt_definition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_drop_behavior(final PostgreSQLParser.Opt_drop_behaviorContext ctx) {
    final var methodName = "enterOpt_drop_behavior";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_encoding(final PostgreSQLParser.Opt_encodingContext ctx) {
    final var methodName = "enterOpt_encoding";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_enum_val_list(final PostgreSQLParser.Opt_enum_val_listContext ctx) {
    final var methodName = "enterOpt_enum_val_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_equal(final PostgreSQLParser.Opt_equalContext ctx) {
    final var methodName = "enterOpt_equal";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_escape(final PostgreSQLParser.Opt_escapeContext ctx) {
    final var methodName = "enterOpt_escape";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_execute_into(final PostgreSQLParser.Opt_execute_intoContext ctx) {
    final var methodName = "enterOpt_execute_into";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_execute_using(final PostgreSQLParser.Opt_execute_usingContext ctx) {
    final var methodName = "enterOpt_execute_using";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_execute_using_list(
      final PostgreSQLParser.Opt_execute_using_listContext ctx) {
    final var methodName = "enterOpt_execute_using_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_existing_window_name(
      final PostgreSQLParser.Opt_existing_window_nameContext ctx) {
    final var methodName = "enterOpt_existing_window_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_exitcond(final PostgreSQLParser.Opt_exitcondContext ctx) {
    final var methodName = "enterOpt_exitcond";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_expr_list(final PostgreSQLParser.Opt_expr_listContext ctx) {
    final var methodName = "enterOpt_expr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_expr_until_when(final PostgreSQLParser.Opt_expr_until_whenContext ctx) {
    final var methodName = "enterOpt_expr_until_when";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_fdw_options(final PostgreSQLParser.Opt_fdw_optionsContext ctx) {
    final var methodName = "enterOpt_fdw_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_fetch_direction(final PostgreSQLParser.Opt_fetch_directionContext ctx) {
    final var methodName = "enterOpt_fetch_direction";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_float(final PostgreSQLParser.Opt_floatContext ctx) {
    final var methodName = "enterOpt_float";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_for_locking_clause(
      final PostgreSQLParser.Opt_for_locking_clauseContext ctx) {
    final var methodName = "enterOpt_for_locking_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_for_using_expression(
      final PostgreSQLParser.Opt_for_using_expressionContext ctx) {
    final var methodName = "enterOpt_for_using_expression";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_foreign_server_version(
      final PostgreSQLParser.Opt_foreign_server_versionContext ctx) {
    final var methodName = "enterOpt_foreign_server_version";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_frame_clause(final PostgreSQLParser.Opt_frame_clauseContext ctx) {
    final var methodName = "enterOpt_frame_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_freeze(final PostgreSQLParser.Opt_freezeContext ctx) {
    final var methodName = "enterOpt_freeze";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_from_in(final PostgreSQLParser.Opt_from_inContext ctx) {
    final var methodName = "enterOpt_from_in";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_full(final PostgreSQLParser.Opt_fullContext ctx) {
    final var methodName = "enterOpt_full";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_grant_admin_option(
      final PostgreSQLParser.Opt_grant_admin_optionContext ctx) {
    final var methodName = "enterOpt_grant_admin_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_grant_grant_option(
      final PostgreSQLParser.Opt_grant_grant_optionContext ctx) {
    final var methodName = "enterOpt_grant_grant_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_granted_by(final PostgreSQLParser.Opt_granted_byContext ctx) {
    final var methodName = "enterOpt_granted_by";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_hold(final PostgreSQLParser.Opt_holdContext ctx) {
    final var methodName = "enterOpt_hold";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_if_exists(final PostgreSQLParser.Opt_if_existsContext ctx) {
    final var methodName = "enterOpt_if_exists";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_if_not_exists(final PostgreSQLParser.Opt_if_not_existsContext ctx) {
    final var methodName = "enterOpt_if_not_exists";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_in_database(final PostgreSQLParser.Opt_in_databaseContext ctx) {
    final var methodName = "enterOpt_in_database";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_include(final PostgreSQLParser.Opt_includeContext ctx) {
    final var methodName = "enterOpt_include";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_index_name(final PostgreSQLParser.Opt_index_nameContext ctx) {
    final var methodName = "enterOpt_index_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_indirection(final PostgreSQLParser.Opt_indirectionContext ctx) {
    final var methodName = "enterOpt_indirection";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_inline_handler(final PostgreSQLParser.Opt_inline_handlerContext ctx) {
    final var methodName = "enterOpt_inline_handler";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_instead(final PostgreSQLParser.Opt_insteadContext ctx) {
    final var methodName = "enterOpt_instead";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_interval(final PostgreSQLParser.Opt_intervalContext ctx) {
    final var methodName = "enterOpt_interval";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_label(final PostgreSQLParser.Opt_labelContext ctx) {
    final var methodName = "enterOpt_label";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_lock(final PostgreSQLParser.Opt_lockContext ctx) {
    final var methodName = "enterOpt_lock";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_loop_label(final PostgreSQLParser.Opt_loop_labelContext ctx) {
    final var methodName = "enterOpt_loop_label";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_materialized(final PostgreSQLParser.Opt_materializedContext ctx) {
    final var methodName = "enterOpt_materialized";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_name_list(final PostgreSQLParser.Opt_name_listContext ctx) {
    final var methodName = "enterOpt_name_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_no(final PostgreSQLParser.Opt_noContext ctx) {
    final var methodName = "enterOpt_no";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_no_inherit(final PostgreSQLParser.Opt_no_inheritContext ctx) {
    final var methodName = "enterOpt_no_inherit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_nowait(final PostgreSQLParser.Opt_nowaitContext ctx) {
    final var methodName = "enterOpt_nowait";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_nowait_or_skip(final PostgreSQLParser.Opt_nowait_or_skipContext ctx) {
    final var methodName = "enterOpt_nowait_or_skip";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_nulls_order(final PostgreSQLParser.Opt_nulls_orderContext ctx) {
    final var methodName = "enterOpt_nulls_order";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_on_conflict(final PostgreSQLParser.Opt_on_conflictContext ctx) {
    final var methodName = "enterOpt_on_conflict";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_open_bound_list(final PostgreSQLParser.Opt_open_bound_listContext ctx) {
    final var methodName = "enterOpt_open_bound_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_open_bound_list_item(
      final PostgreSQLParser.Opt_open_bound_list_itemContext ctx) {
    final var methodName = "enterOpt_open_bound_list_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_open_using(final PostgreSQLParser.Opt_open_usingContext ctx) {
    final var methodName = "enterOpt_open_using";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_opfamily(final PostgreSQLParser.Opt_opfamilyContext ctx) {
    final var methodName = "enterOpt_opfamily";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_or_replace(final PostgreSQLParser.Opt_or_replaceContext ctx) {
    final var methodName = "enterOpt_or_replace";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_ordinality(final PostgreSQLParser.Opt_ordinalityContext ctx) {
    final var methodName = "enterOpt_ordinality";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_partition_clause(final PostgreSQLParser.Opt_partition_clauseContext ctx) {
    final var methodName = "enterOpt_partition_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_procedural(final PostgreSQLParser.Opt_proceduralContext ctx) {
    final var methodName = "enterOpt_procedural";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_program(final PostgreSQLParser.Opt_programContext ctx) {
    final var methodName = "enterOpt_program";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_provider(final PostgreSQLParser.Opt_providerContext ctx) {
    final var methodName = "enterOpt_provider";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_publication_for_tables(
      final PostgreSQLParser.Opt_publication_for_tablesContext ctx) {
    final var methodName = "enterOpt_publication_for_tables";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_raise_list(final PostgreSQLParser.Opt_raise_listContext ctx) {
    final var methodName = "enterOpt_raise_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_raise_using(final PostgreSQLParser.Opt_raise_usingContext ctx) {
    final var methodName = "enterOpt_raise_using";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_raise_using_elem(final PostgreSQLParser.Opt_raise_using_elemContext ctx) {
    final var methodName = "enterOpt_raise_using_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_raise_using_elem_list(
      final PostgreSQLParser.Opt_raise_using_elem_listContext ctx) {
    final var methodName = "enterOpt_raise_using_elem_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_recheck(final PostgreSQLParser.Opt_recheckContext ctx) {
    final var methodName = "enterOpt_recheck";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_reloptions(final PostgreSQLParser.Opt_reloptionsContext ctx) {
    final var methodName = "enterOpt_reloptions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_repeatable_clause(final PostgreSQLParser.Opt_repeatable_clauseContext ctx) {
    final var methodName = "enterOpt_repeatable_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_restart_seqs(final PostgreSQLParser.Opt_restart_seqsContext ctx) {
    final var methodName = "enterOpt_restart_seqs";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_restrict(final PostgreSQLParser.Opt_restrictContext ctx) {
    final var methodName = "enterOpt_restrict";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_return_result(final PostgreSQLParser.Opt_return_resultContext ctx) {
    final var methodName = "enterOpt_return_result";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_returning_clause_into(
      final PostgreSQLParser.Opt_returning_clause_intoContext ctx) {
    final var methodName = "enterOpt_returning_clause_into";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_reverse(final PostgreSQLParser.Opt_reverseContext ctx) {
    final var methodName = "enterOpt_reverse";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_scroll_option(final PostgreSQLParser.Opt_scroll_optionContext ctx) {
    final var methodName = "enterOpt_scroll_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_scroll_option_no(final PostgreSQLParser.Opt_scroll_option_noContext ctx) {
    final var methodName = "enterOpt_scroll_option_no";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_scrollable(final PostgreSQLParser.Opt_scrollableContext ctx) {
    final var methodName = "enterOpt_scrollable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_select_limit(final PostgreSQLParser.Opt_select_limitContext ctx) {
    final var methodName = "enterOpt_select_limit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_semi(final PostgreSQLParser.Opt_semiContext ctx) {
    final var methodName = "enterOpt_semi";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_set_data(final PostgreSQLParser.Opt_set_dataContext ctx) {
    final var methodName = "enterOpt_set_data";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_slice_bound(final PostgreSQLParser.Opt_slice_boundContext ctx) {
    final var methodName = "enterOpt_slice_bound";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_sort_clause(final PostgreSQLParser.Opt_sort_clauseContext ctx) {
    final var methodName = "enterOpt_sort_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_stmt_assert_message(
      final PostgreSQLParser.Opt_stmt_assert_messageContext ctx) {
    final var methodName = "enterOpt_stmt_assert_message";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_stmt_raise_level(final PostgreSQLParser.Opt_stmt_raise_levelContext ctx) {
    final var methodName = "enterOpt_stmt_raise_level";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_strict(final PostgreSQLParser.Opt_strictContext ctx) {
    final var methodName = "enterOpt_strict";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_table(final PostgreSQLParser.Opt_tableContext ctx) {
    final var methodName = "enterOpt_table";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_target_list(final PostgreSQLParser.Opt_target_listContext ctx) {
    final var methodName = "enterOpt_target_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_timezone(final PostgreSQLParser.Opt_timezoneContext ctx) {
    final var methodName = "enterOpt_timezone";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_transaction(final PostgreSQLParser.Opt_transactionContext ctx) {
    final var methodName = "enterOpt_transaction";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_transaction_chain(final PostgreSQLParser.Opt_transaction_chainContext ctx) {
    final var methodName = "enterOpt_transaction_chain";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_trusted(final PostgreSQLParser.Opt_trustedContext ctx) {
    final var methodName = "enterOpt_trusted";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_type(final PostgreSQLParser.Opt_typeContext ctx) {
    final var methodName = "enterOpt_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_type_modifiers(final PostgreSQLParser.Opt_type_modifiersContext ctx) {
    final var methodName = "enterOpt_type_modifiers";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_uescape(final PostgreSQLParser.Opt_uescapeContext ctx) {
    final var methodName = "enterOpt_uescape";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_unique(final PostgreSQLParser.Opt_uniqueContext ctx) {
    final var methodName = "enterOpt_unique";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_using(final PostgreSQLParser.Opt_usingContext ctx) {
    final var methodName = "enterOpt_using";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_vacuum_relation_list(
      final PostgreSQLParser.Opt_vacuum_relation_listContext ctx) {
    final var methodName = "enterOpt_vacuum_relation_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_validator(final PostgreSQLParser.Opt_validatorContext ctx) {
    final var methodName = "enterOpt_validator";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_varying(final PostgreSQLParser.Opt_varyingContext ctx) {
    final var methodName = "enterOpt_varying";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_verbose(final PostgreSQLParser.Opt_verboseContext ctx) {
    final var methodName = "enterOpt_verbose";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_window_exclusion_clause(
      final PostgreSQLParser.Opt_window_exclusion_clauseContext ctx) {
    final var methodName = "enterOpt_window_exclusion_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_with(final PostgreSQLParser.Opt_withContext ctx) {
    final var methodName = "enterOpt_with";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_with_clause(final PostgreSQLParser.Opt_with_clauseContext ctx) {
    final var methodName = "enterOpt_with_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_with_data(final PostgreSQLParser.Opt_with_dataContext ctx) {
    final var methodName = "enterOpt_with_data";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpt_xml_root_standalone(
      final PostgreSQLParser.Opt_xml_root_standaloneContext ctx) {
    final var methodName = "enterOpt_xml_root_standalone";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptconstablespace(final PostgreSQLParser.OptconstablespaceContext ctx) {
    final var methodName = "enterOptconstablespace";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptconstrfromtable(final PostgreSQLParser.OptconstrfromtableContext ctx) {
    final var methodName = "enterOptconstrfromtable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptinherit(final PostgreSQLParser.OptinheritContext ctx) {
    final var methodName = "enterOptinherit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOption_value(final PostgreSQLParser.Option_valueContext ctx) {
    final var methodName = "enterOption_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptnolog(final PostgreSQLParser.OptnologContext ctx) {
    final var methodName = "enterOptnolog";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptparenthesizedseqoptlist(
      final PostgreSQLParser.OptparenthesizedseqoptlistContext ctx) {
    final var methodName = "enterOptparenthesizedseqoptlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptpartitionspec(final PostgreSQLParser.OptpartitionspecContext ctx) {
    final var methodName = "enterOptpartitionspec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptrolelist(final PostgreSQLParser.OptrolelistContext ctx) {
    final var methodName = "enterOptrolelist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptschemaeltlist(final PostgreSQLParser.OptschemaeltlistContext ctx) {
    final var methodName = "enterOptschemaeltlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptschemaname(final PostgreSQLParser.OptschemanameContext ctx) {
    final var methodName = "enterOptschemaname";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptseqoptlist(final PostgreSQLParser.OptseqoptlistContext ctx) {
    final var methodName = "enterOptseqoptlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpttableelementlist(final PostgreSQLParser.OpttableelementlistContext ctx) {
    final var methodName = "enterOpttableelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpttablefuncelementlist(
      final PostgreSQLParser.OpttablefuncelementlistContext ctx) {
    final var methodName = "enterOpttablefuncelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpttablespace(final PostgreSQLParser.OpttablespaceContext ctx) {
    final var methodName = "enterOpttablespace";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpttablespaceowner(final PostgreSQLParser.OpttablespaceownerContext ctx) {
    final var methodName = "enterOpttablespaceowner";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpttemp(final PostgreSQLParser.OpttempContext ctx) {
    final var methodName = "enterOpttemp";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpttempTableName(final PostgreSQLParser.OpttempTableNameContext ctx) {
    final var methodName = "enterOpttempTableName";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpttypedtableelementlist(
      final PostgreSQLParser.OpttypedtableelementlistContext ctx) {
    final var methodName = "enterOpttypedtableelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptwith(final PostgreSQLParser.OptwithContext ctx) {
    final var methodName = "enterOptwith";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOver_clause(final PostgreSQLParser.Over_clauseContext ctx) {
    final var methodName = "enterOver_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOverlay_list(final PostgreSQLParser.Overlay_listContext ctx) {
    final var methodName = "enterOverlay_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOverride_kind(final PostgreSQLParser.Override_kindContext ctx) {
    final var methodName = "enterOverride_kind";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParam_name(final PostgreSQLParser.Param_nameContext ctx) {
    final var methodName = "enterParam_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPart_elem(final PostgreSQLParser.Part_elemContext ctx) {
    final var methodName = "enterPart_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPart_params(final PostgreSQLParser.Part_paramsContext ctx) {
    final var methodName = "enterPart_params";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_cmd(final PostgreSQLParser.Partition_cmdContext ctx) {
    final var methodName = "enterPartition_cmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionboundspec(final PostgreSQLParser.PartitionboundspecContext ctx) {
    final var methodName = "enterPartitionboundspec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionspec(final PostgreSQLParser.PartitionspecContext ctx) {
    final var methodName = "enterPartitionspec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPl_block(final PostgreSQLParser.Pl_blockContext ctx) {
    final var methodName = "enterPl_block";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPl_function(final PostgreSQLParser.Pl_functionContext ctx) {
    final var methodName = "enterPl_function";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPlsql_opt_transaction_chain(
      final PostgreSQLParser.Plsql_opt_transaction_chainContext ctx) {
    final var methodName = "enterPlsql_opt_transaction_chain";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPlsql_unreserved_keyword(
      final PostgreSQLParser.Plsql_unreserved_keywordContext ctx) {
    final var methodName = "enterPlsql_unreserved_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPlsqlconsolecommand(final PostgreSQLParser.PlsqlconsolecommandContext ctx) {
    final var methodName = "enterPlsqlconsolecommand";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPlsqlidentifier(final PostgreSQLParser.PlsqlidentifierContext ctx) {
    final var methodName = "enterPlsqlidentifier";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPlsqlroot(final PostgreSQLParser.PlsqlrootContext ctx) {
    final var methodName = "enterPlsqlroot";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPlsqlvariablename(final PostgreSQLParser.PlsqlvariablenameContext ctx) {
    final var methodName = "enterPlsqlvariablename";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPosition_list(final PostgreSQLParser.Position_listContext ctx) {
    final var methodName = "enterPosition_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrep_type_clause(final PostgreSQLParser.Prep_type_clauseContext ctx) {
    final var methodName = "enterPrep_type_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPreparablestmt(final PostgreSQLParser.PreparablestmtContext ctx) {
    final var methodName = "enterPreparablestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPreparestmt(final PostgreSQLParser.PreparestmtContext ctx) {
    final var methodName = "enterPreparestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilege(final PostgreSQLParser.PrivilegeContext ctx) {
    final var methodName = "enterPrivilege";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilege_list(final PostgreSQLParser.Privilege_listContext ctx) {
    final var methodName = "enterPrivilege_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilege_target(final PostgreSQLParser.Privilege_targetContext ctx) {
    final var methodName = "enterPrivilege_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivileges(final PostgreSQLParser.PrivilegesContext ctx) {
    final var methodName = "enterPrivileges";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProc_condition(final PostgreSQLParser.Proc_conditionContext ctx) {
    final var methodName = "enterProc_condition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProc_conditions(final PostgreSQLParser.Proc_conditionsContext ctx) {
    final var methodName = "enterProc_conditions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProc_exception(final PostgreSQLParser.Proc_exceptionContext ctx) {
    final var methodName = "enterProc_exception";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProc_exceptions(final PostgreSQLParser.Proc_exceptionsContext ctx) {
    final var methodName = "enterProc_exceptions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProc_sect(final PostgreSQLParser.Proc_sectContext ctx) {
    final var methodName = "enterProc_sect";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProc_stmt(final PostgreSQLParser.Proc_stmtContext ctx) {
    final var methodName = "enterProc_stmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPublication_for_tables(
      final PostgreSQLParser.Publication_for_tablesContext ctx) {
    final var methodName = "enterPublication_for_tables";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPublication_name_item(final PostgreSQLParser.Publication_name_itemContext ctx) {
    final var methodName = "enterPublication_name_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPublication_name_list(final PostgreSQLParser.Publication_name_listContext ctx) {
    final var methodName = "enterPublication_name_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQual_all_op(final PostgreSQLParser.Qual_all_opContext ctx) {
    final var methodName = "enterQual_all_op";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQual_op(final PostgreSQLParser.Qual_opContext ctx) {
    final var methodName = "enterQual_op";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQualified_name(final PostgreSQLParser.Qualified_nameContext ctx) {
    final var methodName = "enterQualified_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQualified_name_list(final PostgreSQLParser.Qualified_name_listContext ctx) {
    final var methodName = "enterQualified_name_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReassignownedstmt(final PostgreSQLParser.ReassignownedstmtContext ctx) {
    final var methodName = "enterReassignownedstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRefreshmatviewstmt(final PostgreSQLParser.RefreshmatviewstmtContext ctx) {
    final var methodName = "enterRefreshmatviewstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReindex_option_elem(final PostgreSQLParser.Reindex_option_elemContext ctx) {
    final var methodName = "enterReindex_option_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReindex_option_list(final PostgreSQLParser.Reindex_option_listContext ctx) {
    final var methodName = "enterReindex_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReindex_target_multitable(
      final PostgreSQLParser.Reindex_target_multitableContext ctx) {
    final var methodName = "enterReindex_target_multitable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReindex_target_type(final PostgreSQLParser.Reindex_target_typeContext ctx) {
    final var methodName = "enterReindex_target_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReindexstmt(final PostgreSQLParser.ReindexstmtContext ctx) {
    final var methodName = "enterReindexstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelation_expr(final PostgreSQLParser.Relation_exprContext ctx) {
    final var methodName = "enterRelation_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelation_expr_list(final PostgreSQLParser.Relation_expr_listContext ctx) {
    final var methodName = "enterRelation_expr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelation_expr_opt_alias(
      final PostgreSQLParser.Relation_expr_opt_aliasContext ctx) {
    final var methodName = "enterRelation_expr_opt_alias";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReloption_elem(final PostgreSQLParser.Reloption_elemContext ctx) {
    final var methodName = "enterReloption_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReloption_list(final PostgreSQLParser.Reloption_listContext ctx) {
    final var methodName = "enterReloption_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReloptions(final PostgreSQLParser.ReloptionsContext ctx) {
    final var methodName = "enterReloptions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRemoveaggrstmt(final PostgreSQLParser.RemoveaggrstmtContext ctx) {
    final var methodName = "enterRemoveaggrstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRemovefuncstmt(final PostgreSQLParser.RemovefuncstmtContext ctx) {
    final var methodName = "enterRemovefuncstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRemoveoperstmt(final PostgreSQLParser.RemoveoperstmtContext ctx) {
    final var methodName = "enterRemoveoperstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRenamestmt(final PostgreSQLParser.RenamestmtContext ctx) {
    final var methodName = "enterRenamestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplica_identity(final PostgreSQLParser.Replica_identityContext ctx) {
    final var methodName = "enterReplica_identity";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReserved_keyword(final PostgreSQLParser.Reserved_keywordContext ctx) {
    final var methodName = "enterReserved_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReset_rest(final PostgreSQLParser.Reset_restContext ctx) {
    final var methodName = "enterReset_rest";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReturning_clause(final PostgreSQLParser.Returning_clauseContext ctx) {
    final var methodName = "enterReturning_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevokerolestmt(final PostgreSQLParser.RevokerolestmtContext ctx) {
    final var methodName = "enterRevokerolestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevokestmt(final PostgreSQLParser.RevokestmtContext ctx) {
    final var methodName = "enterRevokestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRole_list(final PostgreSQLParser.Role_listContext ctx) {
    final var methodName = "enterRole_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoleid(final PostgreSQLParser.RoleidContext ctx) {
    final var methodName = "enterRoleid";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRolespec(final PostgreSQLParser.RolespecContext ctx) {
    final var methodName = "enterRolespec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollup_clause(final PostgreSQLParser.Rollup_clauseContext ctx) {
    final var methodName = "enterRollup_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoot(final PostgreSQLParser.RootContext ctx) {
    final var methodName = "enterRoot";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRow(final PostgreSQLParser.RowContext ctx) {
    final var methodName = "enterRow";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRow_or_rows(final PostgreSQLParser.Row_or_rowsContext ctx) {
    final var methodName = "enterRow_or_rows";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRow_security_cmd(final PostgreSQLParser.Row_security_cmdContext ctx) {
    final var methodName = "enterRow_security_cmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowsecuritydefaultforcmd(
      final PostgreSQLParser.RowsecuritydefaultforcmdContext ctx) {
    final var methodName = "enterRowsecuritydefaultforcmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowsecuritydefaultpermissive(
      final PostgreSQLParser.RowsecuritydefaultpermissiveContext ctx) {
    final var methodName = "enterRowsecuritydefaultpermissive";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowsecuritydefaulttorole(
      final PostgreSQLParser.RowsecuritydefaulttoroleContext ctx) {
    final var methodName = "enterRowsecuritydefaulttorole";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowsecurityoptionalexpr(
      final PostgreSQLParser.RowsecurityoptionalexprContext ctx) {
    final var methodName = "enterRowsecurityoptionalexpr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowsecurityoptionaltorole(
      final PostgreSQLParser.RowsecurityoptionaltoroleContext ctx) {
    final var methodName = "enterRowsecurityoptionaltorole";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowsecurityoptionalwithcheck(
      final PostgreSQLParser.RowsecurityoptionalwithcheckContext ctx) {
    final var methodName = "enterRowsecurityoptionalwithcheck";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowsfrom_item(final PostgreSQLParser.Rowsfrom_itemContext ctx) {
    final var methodName = "enterRowsfrom_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowsfrom_list(final PostgreSQLParser.Rowsfrom_listContext ctx) {
    final var methodName = "enterRowsfrom_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRuleactionlist(final PostgreSQLParser.RuleactionlistContext ctx) {
    final var methodName = "enterRuleactionlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRuleactionmulti(final PostgreSQLParser.RuleactionmultiContext ctx) {
    final var methodName = "enterRuleactionmulti";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRuleactionstmt(final PostgreSQLParser.RuleactionstmtContext ctx) {
    final var methodName = "enterRuleactionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRuleactionstmtOrEmpty(final PostgreSQLParser.RuleactionstmtOrEmptyContext ctx) {
    final var methodName = "enterRuleactionstmtOrEmpty";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRulestmt(final PostgreSQLParser.RulestmtContext ctx) {
    final var methodName = "enterRulestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSchema_stmt(final PostgreSQLParser.Schema_stmtContext ctx) {
    final var methodName = "enterSchema_stmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSconst(final PostgreSQLParser.SconstContext ctx) {
    final var methodName = "enterSconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSeclabelstmt(final PostgreSQLParser.SeclabelstmtContext ctx) {
    final var methodName = "enterSeclabelstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSecurity_label(final PostgreSQLParser.Security_labelContext ctx) {
    final var methodName = "enterSecurity_label";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_clause(final PostgreSQLParser.Select_clauseContext ctx) {
    final var methodName = "enterSelect_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_fetch_first_value(
      final PostgreSQLParser.Select_fetch_first_valueContext ctx) {
    final var methodName = "enterSelect_fetch_first_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_limit(final PostgreSQLParser.Select_limitContext ctx) {
    final var methodName = "enterSelect_limit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_limit_value(final PostgreSQLParser.Select_limit_valueContext ctx) {
    final var methodName = "enterSelect_limit_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_no_parens(final PostgreSQLParser.Select_no_parensContext ctx) {
    final var methodName = "enterSelect_no_parens";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_offset_value(final PostgreSQLParser.Select_offset_valueContext ctx) {
    final var methodName = "enterSelect_offset_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_with_parens(final PostgreSQLParser.Select_with_parensContext ctx) {
    final var methodName = "enterSelect_with_parens";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectstmt(final PostgreSQLParser.SelectstmtContext ctx) {
    final var methodName = "enterSelectstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSeqoptelem(final PostgreSQLParser.SeqoptelemContext ctx) {
    final var methodName = "enterSeqoptelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSeqoptlist(final PostgreSQLParser.SeqoptlistContext ctx) {
    final var methodName = "enterSeqoptlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_clause(final PostgreSQLParser.Set_clauseContext ctx) {
    final var methodName = "enterSet_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_clause_list(final PostgreSQLParser.Set_clause_listContext ctx) {
    final var methodName = "enterSet_clause_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_rest(final PostgreSQLParser.Set_restContext ctx) {
    final var methodName = "enterSet_rest";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_rest_more(final PostgreSQLParser.Set_rest_moreContext ctx) {
    final var methodName = "enterSet_rest_more";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_target(final PostgreSQLParser.Set_targetContext ctx) {
    final var methodName = "enterSet_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_target_list(final PostgreSQLParser.Set_target_listContext ctx) {
    final var methodName = "enterSet_target_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetresetclause(final PostgreSQLParser.SetresetclauseContext ctx) {
    final var methodName = "enterSetresetclause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSharp(final PostgreSQLParser.SharpContext ctx) {
    final var methodName = "enterSharp";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSignediconst(final PostgreSQLParser.SignediconstContext ctx) {
    final var methodName = "enterSignediconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimple_select_intersect(
      final PostgreSQLParser.Simple_select_intersectContext ctx) {
    final var methodName = "enterSimple_select_intersect";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimple_select_pramary(final PostgreSQLParser.Simple_select_pramaryContext ctx) {
    final var methodName = "enterSimple_select_pramary";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpletypename(final PostgreSQLParser.SimpletypenameContext ctx) {
    final var methodName = "enterSimpletypename";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSort_clause(final PostgreSQLParser.Sort_clauseContext ctx) {
    final var methodName = "enterSort_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSortby(final PostgreSQLParser.SortbyContext ctx) {
    final var methodName = "enterSortby";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSortby_list(final PostgreSQLParser.Sortby_listContext ctx) {
    final var methodName = "enterSortby_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_expression(final PostgreSQLParser.Sql_expressionContext ctx) {
    final var methodName = "enterSql_expression";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt(final PostgreSQLParser.StmtContext ctx) {
    final var methodName = "enterStmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_assert(final PostgreSQLParser.Stmt_assertContext ctx) {
    final var methodName = "enterStmt_assert";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_assign(final PostgreSQLParser.Stmt_assignContext ctx) {
    final var methodName = "enterStmt_assign";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_call(final PostgreSQLParser.Stmt_callContext ctx) {
    final var methodName = "enterStmt_call";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_case(final PostgreSQLParser.Stmt_caseContext ctx) {
    final var methodName = "enterStmt_case";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_close(final PostgreSQLParser.Stmt_closeContext ctx) {
    final var methodName = "enterStmt_close";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_commit(final PostgreSQLParser.Stmt_commitContext ctx) {
    final var methodName = "enterStmt_commit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_dynexecute(final PostgreSQLParser.Stmt_dynexecuteContext ctx) {
    final var methodName = "enterStmt_dynexecute";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_else(final PostgreSQLParser.Stmt_elseContext ctx) {
    final var methodName = "enterStmt_else";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_elsifs(final PostgreSQLParser.Stmt_elsifsContext ctx) {
    final var methodName = "enterStmt_elsifs";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_execsql(final PostgreSQLParser.Stmt_execsqlContext ctx) {
    final var methodName = "enterStmt_execsql";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_exit(final PostgreSQLParser.Stmt_exitContext ctx) {
    final var methodName = "enterStmt_exit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_fetch(final PostgreSQLParser.Stmt_fetchContext ctx) {
    final var methodName = "enterStmt_fetch";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_for(final PostgreSQLParser.Stmt_forContext ctx) {
    final var methodName = "enterStmt_for";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_foreach_a(final PostgreSQLParser.Stmt_foreach_aContext ctx) {
    final var methodName = "enterStmt_foreach_a";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_getdiag(final PostgreSQLParser.Stmt_getdiagContext ctx) {
    final var methodName = "enterStmt_getdiag";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_if(final PostgreSQLParser.Stmt_ifContext ctx) {
    final var methodName = "enterStmt_if";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_loop(final PostgreSQLParser.Stmt_loopContext ctx) {
    final var methodName = "enterStmt_loop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_move(final PostgreSQLParser.Stmt_moveContext ctx) {
    final var methodName = "enterStmt_move";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_null(final PostgreSQLParser.Stmt_nullContext ctx) {
    final var methodName = "enterStmt_null";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_open(final PostgreSQLParser.Stmt_openContext ctx) {
    final var methodName = "enterStmt_open";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_perform(final PostgreSQLParser.Stmt_performContext ctx) {
    final var methodName = "enterStmt_perform";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_raise(final PostgreSQLParser.Stmt_raiseContext ctx) {
    final var methodName = "enterStmt_raise";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_return(final PostgreSQLParser.Stmt_returnContext ctx) {
    final var methodName = "enterStmt_return";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_rollback(final PostgreSQLParser.Stmt_rollbackContext ctx) {
    final var methodName = "enterStmt_rollback";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_set(final PostgreSQLParser.Stmt_setContext ctx) {
    final var methodName = "enterStmt_set";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmt_while(final PostgreSQLParser.Stmt_whileContext ctx) {
    final var methodName = "enterStmt_while";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmtblock(final PostgreSQLParser.StmtblockContext ctx) {
    final var methodName = "enterStmtblock";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStmtmulti(final PostgreSQLParser.StmtmultiContext ctx) {
    final var methodName = "enterStmtmulti";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSub_type(final PostgreSQLParser.Sub_typeContext ctx) {
    final var methodName = "enterSub_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubquery_Op(final PostgreSQLParser.Subquery_OpContext ctx) {
    final var methodName = "enterSubquery_Op";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubstr_list(final PostgreSQLParser.Substr_listContext ctx) {
    final var methodName = "enterSubstr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_access_method_clause(
      final PostgreSQLParser.Table_access_method_clauseContext ctx) {
    final var methodName = "enterTable_access_method_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_alias(final PostgreSQLParser.Table_aliasContext ctx) {
    final var methodName = "enterTable_alias";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_alias_clause(final PostgreSQLParser.Table_alias_clauseContext ctx) {
    final var methodName = "enterTable_alias_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_func_column(final PostgreSQLParser.Table_func_columnContext ctx) {
    final var methodName = "enterTable_func_column";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_func_column_list(
      final PostgreSQLParser.Table_func_column_listContext ctx) {
    final var methodName = "enterTable_func_column_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_ref(final PostgreSQLParser.Table_refContext ctx) {
    final var methodName = "enterTable_ref";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableconstraint(final PostgreSQLParser.TableconstraintContext ctx) {
    final var methodName = "enterTableconstraint";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableelement(final PostgreSQLParser.TableelementContext ctx) {
    final var methodName = "enterTableelement";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableelementlist(final PostgreSQLParser.TableelementlistContext ctx) {
    final var methodName = "enterTableelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablefuncelement(final PostgreSQLParser.TablefuncelementContext ctx) {
    final var methodName = "enterTablefuncelement";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablefuncelementlist(final PostgreSQLParser.TablefuncelementlistContext ctx) {
    final var methodName = "enterTablefuncelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablelikeclause(final PostgreSQLParser.TablelikeclauseContext ctx) {
    final var methodName = "enterTablelikeclause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablelikeoption(final PostgreSQLParser.TablelikeoptionContext ctx) {
    final var methodName = "enterTablelikeoption";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablelikeoptionlist(final PostgreSQLParser.TablelikeoptionlistContext ctx) {
    final var methodName = "enterTablelikeoptionlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablesample_clause(final PostgreSQLParser.Tablesample_clauseContext ctx) {
    final var methodName = "enterTablesample_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTarget_label(final PostgreSQLParser.Target_labelContext ctx) {
    final var methodName = "enterTarget_label";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTarget_list(final PostgreSQLParser.Target_listContext ctx) {
    final var methodName = "enterTarget_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTarget_star(final PostgreSQLParser.Target_starContext ctx) {
    final var methodName = "enterTarget_star";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransaction_mode_item(final PostgreSQLParser.Transaction_mode_itemContext ctx) {
    final var methodName = "enterTransaction_mode_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransaction_mode_list(final PostgreSQLParser.Transaction_mode_listContext ctx) {
    final var methodName = "enterTransaction_mode_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransaction_mode_list_or_empty(
      final PostgreSQLParser.Transaction_mode_list_or_emptyContext ctx) {
    final var methodName = "enterTransaction_mode_list_or_empty";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionstmt(final PostgreSQLParser.TransactionstmtContext ctx) {
    final var methodName = "enterTransactionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransform_element_list(
      final PostgreSQLParser.Transform_element_listContext ctx) {
    final var methodName = "enterTransform_element_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransform_type_list(final PostgreSQLParser.Transform_type_listContext ctx) {
    final var methodName = "enterTransform_type_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransitionoldornew(final PostgreSQLParser.TransitionoldornewContext ctx) {
    final var methodName = "enterTransitionoldornew";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransitionrelname(final PostgreSQLParser.TransitionrelnameContext ctx) {
    final var methodName = "enterTransitionrelname";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransitionrowortable(final PostgreSQLParser.TransitionrowortableContext ctx) {
    final var methodName = "enterTransitionrowortable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggeractiontime(final PostgreSQLParser.TriggeractiontimeContext ctx) {
    final var methodName = "enterTriggeractiontime";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerevents(final PostgreSQLParser.TriggereventsContext ctx) {
    final var methodName = "enterTriggerevents";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerforopteach(final PostgreSQLParser.TriggerforopteachContext ctx) {
    final var methodName = "enterTriggerforopteach";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerforspec(final PostgreSQLParser.TriggerforspecContext ctx) {
    final var methodName = "enterTriggerforspec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerfortype(final PostgreSQLParser.TriggerfortypeContext ctx) {
    final var methodName = "enterTriggerfortype";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerfuncarg(final PostgreSQLParser.TriggerfuncargContext ctx) {
    final var methodName = "enterTriggerfuncarg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerfuncargs(final PostgreSQLParser.TriggerfuncargsContext ctx) {
    final var methodName = "enterTriggerfuncargs";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggeroneevent(final PostgreSQLParser.TriggeroneeventContext ctx) {
    final var methodName = "enterTriggeroneevent";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerreferencing(final PostgreSQLParser.TriggerreferencingContext ctx) {
    final var methodName = "enterTriggerreferencing";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggertransition(final PostgreSQLParser.TriggertransitionContext ctx) {
    final var methodName = "enterTriggertransition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggertransitions(final PostgreSQLParser.TriggertransitionsContext ctx) {
    final var methodName = "enterTriggertransitions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerwhen(final PostgreSQLParser.TriggerwhenContext ctx) {
    final var methodName = "enterTriggerwhen";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrim_list(final PostgreSQLParser.Trim_listContext ctx) {
    final var methodName = "enterTrim_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTruncatestmt(final PostgreSQLParser.TruncatestmtContext ctx) {
    final var methodName = "enterTruncatestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_func_name_keyword(
      final PostgreSQLParser.Type_func_name_keywordContext ctx) {
    final var methodName = "enterType_func_name_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_function_name(final PostgreSQLParser.Type_function_nameContext ctx) {
    final var methodName = "enterType_function_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_list(final PostgreSQLParser.Type_listContext ctx) {
    final var methodName = "enterType_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_name_list(final PostgreSQLParser.Type_name_listContext ctx) {
    final var methodName = "enterType_name_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTypedtableelement(final PostgreSQLParser.TypedtableelementContext ctx) {
    final var methodName = "enterTypedtableelement";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTypedtableelementlist(final PostgreSQLParser.TypedtableelementlistContext ctx) {
    final var methodName = "enterTypedtableelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTypename(final PostgreSQLParser.TypenameContext ctx) {
    final var methodName = "enterTypename";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnicode_normal_form(final PostgreSQLParser.Unicode_normal_formContext ctx) {
    final var methodName = "enterUnicode_normal_form";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnlistenstmt(final PostgreSQLParser.UnlistenstmtContext ctx) {
    final var methodName = "enterUnlistenstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnreserved_keyword(final PostgreSQLParser.Unreserved_keywordContext ctx) {
    final var methodName = "enterUnreserved_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdatestmt(final PostgreSQLParser.UpdatestmtContext ctx) {
    final var methodName = "enterUpdatestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUsing_clause(final PostgreSQLParser.Using_clauseContext ctx) {
    final var methodName = "enterUsing_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVac_analyze_option_arg(
      final PostgreSQLParser.Vac_analyze_option_argContext ctx) {
    final var methodName = "enterVac_analyze_option_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVac_analyze_option_elem(
      final PostgreSQLParser.Vac_analyze_option_elemContext ctx) {
    final var methodName = "enterVac_analyze_option_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVac_analyze_option_list(
      final PostgreSQLParser.Vac_analyze_option_listContext ctx) {
    final var methodName = "enterVac_analyze_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVac_analyze_option_name(
      final PostgreSQLParser.Vac_analyze_option_nameContext ctx) {
    final var methodName = "enterVac_analyze_option_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVacuum_relation(final PostgreSQLParser.Vacuum_relationContext ctx) {
    final var methodName = "enterVacuum_relation";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVacuum_relation_list(final PostgreSQLParser.Vacuum_relation_listContext ctx) {
    final var methodName = "enterVacuum_relation_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVacuumstmt(final PostgreSQLParser.VacuumstmtContext ctx) {
    final var methodName = "enterVacuumstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValidator_clause(final PostgreSQLParser.Validator_clauseContext ctx) {
    final var methodName = "enterValidator_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValues_clause(final PostgreSQLParser.Values_clauseContext ctx) {
    final var methodName = "enterValues_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVar_list(final PostgreSQLParser.Var_listContext ctx) {
    final var methodName = "enterVar_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVar_name(final PostgreSQLParser.Var_nameContext ctx) {
    final var methodName = "enterVar_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVar_value(final PostgreSQLParser.Var_valueContext ctx) {
    final var methodName = "enterVar_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVariableresetstmt(final PostgreSQLParser.VariableresetstmtContext ctx) {
    final var methodName = "enterVariableresetstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVariablesetstmt(final PostgreSQLParser.VariablesetstmtContext ctx) {
    final var methodName = "enterVariablesetstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVariableshowstmt(final PostgreSQLParser.VariableshowstmtContext ctx) {
    final var methodName = "enterVariableshowstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewstmt(final PostgreSQLParser.ViewstmtContext ctx) {
    final var methodName = "enterViewstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhen_clause(final PostgreSQLParser.When_clauseContext ctx) {
    final var methodName = "enterWhen_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhen_clause_list(final PostgreSQLParser.When_clause_listContext ctx) {
    final var methodName = "enterWhen_clause_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhere_clause(final PostgreSQLParser.Where_clauseContext ctx) {
    final var methodName = "enterWhere_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhere_or_current_clause(
      final PostgreSQLParser.Where_or_current_clauseContext ctx) {
    final var methodName = "enterWhere_or_current_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_clause(final PostgreSQLParser.Window_clauseContext ctx) {
    final var methodName = "enterWindow_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_definition(final PostgreSQLParser.Window_definitionContext ctx) {
    final var methodName = "enterWindow_definition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_definition_list(
      final PostgreSQLParser.Window_definition_listContext ctx) {
    final var methodName = "enterWindow_definition_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_specification(final PostgreSQLParser.Window_specificationContext ctx) {
    final var methodName = "enterWindow_specification";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWith_clause(final PostgreSQLParser.With_clauseContext ctx) {
    final var methodName = "enterWith_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithin_group_clause(final PostgreSQLParser.Within_group_clauseContext ctx) {
    final var methodName = "enterWithin_group_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXconst(final PostgreSQLParser.XconstContext ctx) {
    final var methodName = "enterXconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_attribute_el(final PostgreSQLParser.Xml_attribute_elContext ctx) {
    final var methodName = "enterXml_attribute_el";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_attribute_list(final PostgreSQLParser.Xml_attribute_listContext ctx) {
    final var methodName = "enterXml_attribute_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_attributes(final PostgreSQLParser.Xml_attributesContext ctx) {
    final var methodName = "enterXml_attributes";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_namespace_el(final PostgreSQLParser.Xml_namespace_elContext ctx) {
    final var methodName = "enterXml_namespace_el";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_namespace_list(final PostgreSQLParser.Xml_namespace_listContext ctx) {
    final var methodName = "enterXml_namespace_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_passing_mech(final PostgreSQLParser.Xml_passing_mechContext ctx) {
    final var methodName = "enterXml_passing_mech";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_root_version(final PostgreSQLParser.Xml_root_versionContext ctx) {
    final var methodName = "enterXml_root_version";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_whitespace_option(final PostgreSQLParser.Xml_whitespace_optionContext ctx) {
    final var methodName = "enterXml_whitespace_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmlexists_argument(final PostgreSQLParser.Xmlexists_argumentContext ctx) {
    final var methodName = "enterXmlexists_argument";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmltable(final PostgreSQLParser.XmltableContext ctx) {
    final var methodName = "enterXmltable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmltable_column_el(final PostgreSQLParser.Xmltable_column_elContext ctx) {
    final var methodName = "enterXmltable_column_el";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmltable_column_list(final PostgreSQLParser.Xmltable_column_listContext ctx) {
    final var methodName = "enterXmltable_column_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmltable_column_option_el(
      final PostgreSQLParser.Xmltable_column_option_elContext ctx) {
    final var methodName = "enterXmltable_column_option_el";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmltable_column_option_list(
      final PostgreSQLParser.Xmltable_column_option_listContext ctx) {
    final var methodName = "enterXmltable_column_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterZone_value(final PostgreSQLParser.Zone_valueContext ctx) {
    final var methodName = "enterZone_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr(final PostgreSQLParser.A_exprContext ctx) {
    final var methodName = "exitA_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_add(final PostgreSQLParser.A_expr_addContext ctx) {
    final var methodName = "exitA_expr_add";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_and(final PostgreSQLParser.A_expr_andContext ctx) {
    final var methodName = "exitA_expr_and";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_at_time_zone(final PostgreSQLParser.A_expr_at_time_zoneContext ctx) {
    final var methodName = "exitA_expr_at_time_zone";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_between(final PostgreSQLParser.A_expr_betweenContext ctx) {
    final var methodName = "exitA_expr_between";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_caret(final PostgreSQLParser.A_expr_caretContext ctx) {
    final var methodName = "exitA_expr_caret";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_collate(final PostgreSQLParser.A_expr_collateContext ctx) {
    final var methodName = "exitA_expr_collate";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_compare(final PostgreSQLParser.A_expr_compareContext ctx) {
    final var methodName = "exitA_expr_compare";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_in(final PostgreSQLParser.A_expr_inContext ctx) {
    final var methodName = "exitA_expr_in";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_is_not(final PostgreSQLParser.A_expr_is_notContext ctx) {
    final var methodName = "exitA_expr_is_not";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_isnull(final PostgreSQLParser.A_expr_isnullContext ctx) {
    final var methodName = "exitA_expr_isnull";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_lessless(final PostgreSQLParser.A_expr_lesslessContext ctx) {
    final var methodName = "exitA_expr_lessless";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_like(final PostgreSQLParser.A_expr_likeContext ctx) {
    final var methodName = "exitA_expr_like";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_mul(final PostgreSQLParser.A_expr_mulContext ctx) {
    final var methodName = "exitA_expr_mul";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_or(final PostgreSQLParser.A_expr_orContext ctx) {
    final var methodName = "exitA_expr_or";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_qual(final PostgreSQLParser.A_expr_qualContext ctx) {
    final var methodName = "exitA_expr_qual";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_qual_op(final PostgreSQLParser.A_expr_qual_opContext ctx) {
    final var methodName = "exitA_expr_qual_op";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_typecast(final PostgreSQLParser.A_expr_typecastContext ctx) {
    final var methodName = "exitA_expr_typecast";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_unary_not(final PostgreSQLParser.A_expr_unary_notContext ctx) {
    final var methodName = "exitA_expr_unary_not";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_unary_qualop(final PostgreSQLParser.A_expr_unary_qualopContext ctx) {
    final var methodName = "exitA_expr_unary_qualop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitA_expr_unary_sign(final PostgreSQLParser.A_expr_unary_signContext ctx) {
    final var methodName = "exitA_expr_unary_sign";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAccess_method_clause(final PostgreSQLParser.Access_method_clauseContext ctx) {
    final var methodName = "exitAccess_method_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_drop(final PostgreSQLParser.Add_dropContext ctx) {
    final var methodName = "exitAdd_drop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAexprconst(final PostgreSQLParser.AexprconstContext ctx) {
    final var methodName = "exitAexprconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggr_arg(final PostgreSQLParser.Aggr_argContext ctx) {
    final var methodName = "exitAggr_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggr_args(final PostgreSQLParser.Aggr_argsContext ctx) {
    final var methodName = "exitAggr_args";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggr_args_list(final PostgreSQLParser.Aggr_args_listContext ctx) {
    final var methodName = "exitAggr_args_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggregate_with_argtypes(
      final PostgreSQLParser.Aggregate_with_argtypesContext ctx) {
    final var methodName = "exitAggregate_with_argtypes";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggregate_with_argtypes_list(
      final PostgreSQLParser.Aggregate_with_argtypes_listContext ctx) {
    final var methodName = "exitAggregate_with_argtypes_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlias_clause(final PostgreSQLParser.Alias_clauseContext ctx) {
    final var methodName = "exitAlias_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAll_op(final PostgreSQLParser.All_opContext ctx) {
    final var methodName = "exitAll_op";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAll_or_distinct(final PostgreSQLParser.All_or_distinctContext ctx) {
    final var methodName = "exitAll_or_distinct";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_column_default(final PostgreSQLParser.Alter_column_defaultContext ctx) {
    final var methodName = "exitAlter_column_default";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_extension_opt_item(
      final PostgreSQLParser.Alter_extension_opt_itemContext ctx) {
    final var methodName = "exitAlter_extension_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_extension_opt_list(
      final PostgreSQLParser.Alter_extension_opt_listContext ctx) {
    final var methodName = "exitAlter_extension_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_generic_option_elem(
      final PostgreSQLParser.Alter_generic_option_elemContext ctx) {
    final var methodName = "exitAlter_generic_option_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_generic_option_list(
      final PostgreSQLParser.Alter_generic_option_listContext ctx) {
    final var methodName = "exitAlter_generic_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_generic_options(final PostgreSQLParser.Alter_generic_optionsContext ctx) {
    final var methodName = "exitAlter_generic_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_identity_column_option(
      final PostgreSQLParser.Alter_identity_column_optionContext ctx) {
    final var methodName = "exitAlter_identity_column_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_identity_column_option_list(
      final PostgreSQLParser.Alter_identity_column_option_listContext ctx) {
    final var methodName = "exitAlter_identity_column_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_cmd(final PostgreSQLParser.Alter_table_cmdContext ctx) {
    final var methodName = "exitAlter_table_cmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_cmds(final PostgreSQLParser.Alter_table_cmdsContext ctx) {
    final var methodName = "exitAlter_table_cmds";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_type_cmd(final PostgreSQLParser.Alter_type_cmdContext ctx) {
    final var methodName = "exitAlter_type_cmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_type_cmds(final PostgreSQLParser.Alter_type_cmdsContext ctx) {
    final var methodName = "exitAlter_type_cmds";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_using(final PostgreSQLParser.Alter_usingContext ctx) {
    final var methodName = "exitAlter_using";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAltercollationstmt(final PostgreSQLParser.AltercollationstmtContext ctx) {
    final var methodName = "exitAltercollationstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAltercompositetypestmt(final PostgreSQLParser.AltercompositetypestmtContext ctx) {
    final var methodName = "exitAltercompositetypestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterdatabasesetstmt(final PostgreSQLParser.AlterdatabasesetstmtContext ctx) {
    final var methodName = "exitAlterdatabasesetstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterdatabasestmt(final PostgreSQLParser.AlterdatabasestmtContext ctx) {
    final var methodName = "exitAlterdatabasestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterdefaultprivilegesstmt(
      final PostgreSQLParser.AlterdefaultprivilegesstmtContext ctx) {
    final var methodName = "exitAlterdefaultprivilegesstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterdomainstmt(final PostgreSQLParser.AlterdomainstmtContext ctx) {
    final var methodName = "exitAlterdomainstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterenumstmt(final PostgreSQLParser.AlterenumstmtContext ctx) {
    final var methodName = "exitAlterenumstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAltereventtrigstmt(final PostgreSQLParser.AltereventtrigstmtContext ctx) {
    final var methodName = "exitAltereventtrigstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterextensioncontentsstmt(
      final PostgreSQLParser.AlterextensioncontentsstmtContext ctx) {
    final var methodName = "exitAlterextensioncontentsstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterextensionstmt(final PostgreSQLParser.AlterextensionstmtContext ctx) {
    final var methodName = "exitAlterextensionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterfdwstmt(final PostgreSQLParser.AlterfdwstmtContext ctx) {
    final var methodName = "exitAlterfdwstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterforeignserverstmt(final PostgreSQLParser.AlterforeignserverstmtContext ctx) {
    final var methodName = "exitAlterforeignserverstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterfunc_opt_list(final PostgreSQLParser.Alterfunc_opt_listContext ctx) {
    final var methodName = "exitAlterfunc_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterfunctionstmt(final PostgreSQLParser.AlterfunctionstmtContext ctx) {
    final var methodName = "exitAlterfunctionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAltergroupstmt(final PostgreSQLParser.AltergroupstmtContext ctx) {
    final var methodName = "exitAltergroupstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterobjectdependsstmt(final PostgreSQLParser.AlterobjectdependsstmtContext ctx) {
    final var methodName = "exitAlterobjectdependsstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterobjectschemastmt(final PostgreSQLParser.AlterobjectschemastmtContext ctx) {
    final var methodName = "exitAlterobjectschemastmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlteroperatorstmt(final PostgreSQLParser.AlteroperatorstmtContext ctx) {
    final var methodName = "exitAlteroperatorstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlteropfamilystmt(final PostgreSQLParser.AlteropfamilystmtContext ctx) {
    final var methodName = "exitAlteropfamilystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlteroptroleelem(final PostgreSQLParser.AlteroptroleelemContext ctx) {
    final var methodName = "exitAlteroptroleelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlteroptrolelist(final PostgreSQLParser.AlteroptrolelistContext ctx) {
    final var methodName = "exitAlteroptrolelist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterownerstmt(final PostgreSQLParser.AlterownerstmtContext ctx) {
    final var methodName = "exitAlterownerstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterpolicystmt(final PostgreSQLParser.AlterpolicystmtContext ctx) {
    final var methodName = "exitAlterpolicystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterpublicationstmt(final PostgreSQLParser.AlterpublicationstmtContext ctx) {
    final var methodName = "exitAlterpublicationstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterrolesetstmt(final PostgreSQLParser.AlterrolesetstmtContext ctx) {
    final var methodName = "exitAlterrolesetstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterrolestmt(final PostgreSQLParser.AlterrolestmtContext ctx) {
    final var methodName = "exitAlterrolestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterseqstmt(final PostgreSQLParser.AlterseqstmtContext ctx) {
    final var methodName = "exitAlterseqstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterstatsstmt(final PostgreSQLParser.AlterstatsstmtContext ctx) {
    final var methodName = "exitAlterstatsstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAltersubscriptionstmt(final PostgreSQLParser.AltersubscriptionstmtContext ctx) {
    final var methodName = "exitAltersubscriptionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAltersystemstmt(final PostgreSQLParser.AltersystemstmtContext ctx) {
    final var methodName = "exitAltersystemstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAltertablestmt(final PostgreSQLParser.AltertablestmtContext ctx) {
    final var methodName = "exitAltertablestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAltertblspcstmt(final PostgreSQLParser.AltertblspcstmtContext ctx) {
    final var methodName = "exitAltertblspcstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAltertsconfigurationstmt(
      final PostgreSQLParser.AltertsconfigurationstmtContext ctx) {
    final var methodName = "exitAltertsconfigurationstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAltertsdictionarystmt(final PostgreSQLParser.AltertsdictionarystmtContext ctx) {
    final var methodName = "exitAltertsdictionarystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAltertypestmt(final PostgreSQLParser.AltertypestmtContext ctx) {
    final var methodName = "exitAltertypestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterusermappingstmt(final PostgreSQLParser.AlterusermappingstmtContext ctx) {
    final var methodName = "exitAlterusermappingstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAm_type(final PostgreSQLParser.Am_typeContext ctx) {
    final var methodName = "exitAm_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAnalyze_keyword(final PostgreSQLParser.Analyze_keywordContext ctx) {
    final var methodName = "exitAnalyze_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAnalyzestmt(final PostgreSQLParser.AnalyzestmtContext ctx) {
    final var methodName = "exitAnalyzestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAny_identifier(final PostgreSQLParser.Any_identifierContext ctx) {
    final var methodName = "exitAny_identifier";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAny_name(final PostgreSQLParser.Any_nameContext ctx) {
    final var methodName = "exitAny_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAny_name_list(final PostgreSQLParser.Any_name_listContext ctx) {
    final var methodName = "exitAny_name_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAny_operator(final PostgreSQLParser.Any_operatorContext ctx) {
    final var methodName = "exitAny_operator";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAny_with(final PostgreSQLParser.Any_withContext ctx) {
    final var methodName = "exitAny_with";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAnysconst(final PostgreSQLParser.AnysconstContext ctx) {
    final var methodName = "exitAnysconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitArg_class(final PostgreSQLParser.Arg_classContext ctx) {
    final var methodName = "exitArg_class";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitArray_expr(final PostgreSQLParser.Array_exprContext ctx) {
    final var methodName = "exitArray_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitArray_expr_list(final PostgreSQLParser.Array_expr_listContext ctx) {
    final var methodName = "exitArray_expr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAssign_operator(final PostgreSQLParser.Assign_operatorContext ctx) {
    final var methodName = "exitAssign_operator";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAssign_var(final PostgreSQLParser.Assign_varContext ctx) {
    final var methodName = "exitAssign_var";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAttr_name(final PostgreSQLParser.Attr_nameContext ctx) {
    final var methodName = "exitAttr_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAttrs(final PostgreSQLParser.AttrsContext ctx) {
    final var methodName = "exitAttrs";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAuth_ident(final PostgreSQLParser.Auth_identContext ctx) {
    final var methodName = "exitAuth_ident";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitB_expr(final PostgreSQLParser.B_exprContext ctx) {
    final var methodName = "exitB_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBconst(final PostgreSQLParser.BconstContext ctx) {
    final var methodName = "exitBconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBit(final PostgreSQLParser.BitContext ctx) {
    final var methodName = "exitBit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBitwithlength(final PostgreSQLParser.BitwithlengthContext ctx) {
    final var methodName = "exitBitwithlength";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBitwithoutlength(final PostgreSQLParser.BitwithoutlengthContext ctx) {
    final var methodName = "exitBitwithoutlength";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBuiltin_function_name(final PostgreSQLParser.Builtin_function_nameContext ctx) {
    final var methodName = "exitBuiltin_function_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitC_expr_case(final PostgreSQLParser.C_expr_caseContext ctx) {
    final var methodName = "exitC_expr_case";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitC_expr_exists(final PostgreSQLParser.C_expr_existsContext ctx) {
    final var methodName = "exitC_expr_exists";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitC_expr_expr(final PostgreSQLParser.C_expr_exprContext ctx) {
    final var methodName = "exitC_expr_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCallstmt(final PostgreSQLParser.CallstmtContext ctx) {
    final var methodName = "exitCallstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCase_arg(final PostgreSQLParser.Case_argContext ctx) {
    final var methodName = "exitCase_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCase_default(final PostgreSQLParser.Case_defaultContext ctx) {
    final var methodName = "exitCase_default";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCase_expr(final PostgreSQLParser.Case_exprContext ctx) {
    final var methodName = "exitCase_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCase_when(final PostgreSQLParser.Case_whenContext ctx) {
    final var methodName = "exitCase_when";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCase_when_list(final PostgreSQLParser.Case_when_listContext ctx) {
    final var methodName = "exitCase_when_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCast_context(final PostgreSQLParser.Cast_contextContext ctx) {
    final var methodName = "exitCast_context";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharacter(final PostgreSQLParser.CharacterContext ctx) {
    final var methodName = "exitCharacter";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharacter_c(final PostgreSQLParser.Character_cContext ctx) {
    final var methodName = "exitCharacter_c";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheckpointstmt(final PostgreSQLParser.CheckpointstmtContext ctx) {
    final var methodName = "exitCheckpointstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCloseportalstmt(final PostgreSQLParser.CloseportalstmtContext ctx) {
    final var methodName = "exitCloseportalstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCluster_index_specification(
      final PostgreSQLParser.Cluster_index_specificationContext ctx) {
    final var methodName = "exitCluster_index_specification";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClusterstmt(final PostgreSQLParser.ClusterstmtContext ctx) {
    final var methodName = "exitClusterstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCol_name_keyword(final PostgreSQLParser.Col_name_keywordContext ctx) {
    final var methodName = "exitCol_name_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColconstraint(final PostgreSQLParser.ColconstraintContext ctx) {
    final var methodName = "exitColconstraint";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColconstraintelem(final PostgreSQLParser.ColconstraintelemContext ctx) {
    final var methodName = "exitColconstraintelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColid(final PostgreSQLParser.ColidContext ctx) {
    final var methodName = "exitColid";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollabel(final PostgreSQLParser.CollabelContext ctx) {
    final var methodName = "exitCollabel";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColquallist(final PostgreSQLParser.ColquallistContext ctx) {
    final var methodName = "exitColquallist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnDef(final PostgreSQLParser.ColumnDefContext ctx) {
    final var methodName = "exitColumnDef";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnElem(final PostgreSQLParser.ColumnElemContext ctx) {
    final var methodName = "exitColumnElem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnlist(final PostgreSQLParser.ColumnlistContext ctx) {
    final var methodName = "exitColumnlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnOptions(final PostgreSQLParser.ColumnOptionsContext ctx) {
    final var methodName = "exitColumnOptions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnref(final PostgreSQLParser.ColumnrefContext ctx) {
    final var methodName = "exitColumnref";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComment_text(final PostgreSQLParser.Comment_textContext ctx) {
    final var methodName = "exitComment_text";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommentstmt(final PostgreSQLParser.CommentstmtContext ctx) {
    final var methodName = "exitCommentstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommon_func_opt_item(final PostgreSQLParser.Common_func_opt_itemContext ctx) {
    final var methodName = "exitCommon_func_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommon_table_expr(final PostgreSQLParser.Common_table_exprContext ctx) {
    final var methodName = "exitCommon_table_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComp_option(final PostgreSQLParser.Comp_optionContext ctx) {
    final var methodName = "exitComp_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComp_options(final PostgreSQLParser.Comp_optionsContext ctx) {
    final var methodName = "exitComp_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstbit(final PostgreSQLParser.ConstbitContext ctx) {
    final var methodName = "exitConstbit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstcharacter(final PostgreSQLParser.ConstcharacterContext ctx) {
    final var methodName = "exitConstcharacter";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstdatetime(final PostgreSQLParser.ConstdatetimeContext ctx) {
    final var methodName = "exitConstdatetime";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstinterval(final PostgreSQLParser.ConstintervalContext ctx) {
    final var methodName = "exitConstinterval";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraintattr(final PostgreSQLParser.ConstraintattrContext ctx) {
    final var methodName = "exitConstraintattr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraintattributeElem(
      final PostgreSQLParser.ConstraintattributeElemContext ctx) {
    final var methodName = "exitConstraintattributeElem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraintattributespec(
      final PostgreSQLParser.ConstraintattributespecContext ctx) {
    final var methodName = "exitConstraintattributespec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraintelem(final PostgreSQLParser.ConstraintelemContext ctx) {
    final var methodName = "exitConstraintelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraints_set_list(final PostgreSQLParser.Constraints_set_listContext ctx) {
    final var methodName = "exitConstraints_set_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraints_set_mode(final PostgreSQLParser.Constraints_set_modeContext ctx) {
    final var methodName = "exitConstraints_set_mode";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraintssetstmt(final PostgreSQLParser.ConstraintssetstmtContext ctx) {
    final var methodName = "exitConstraintssetstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConsttypename(final PostgreSQLParser.ConsttypenameContext ctx) {
    final var methodName = "exitConsttypename";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_delimiter(final PostgreSQLParser.Copy_delimiterContext ctx) {
    final var methodName = "exitCopy_delimiter";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_file_name(final PostgreSQLParser.Copy_file_nameContext ctx) {
    final var methodName = "exitCopy_file_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_from(final PostgreSQLParser.Copy_fromContext ctx) {
    final var methodName = "exitCopy_from";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_generic_opt_arg(final PostgreSQLParser.Copy_generic_opt_argContext ctx) {
    final var methodName = "exitCopy_generic_opt_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_generic_opt_arg_list(
      final PostgreSQLParser.Copy_generic_opt_arg_listContext ctx) {
    final var methodName = "exitCopy_generic_opt_arg_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_generic_opt_arg_list_item(
      final PostgreSQLParser.Copy_generic_opt_arg_list_itemContext ctx) {
    final var methodName = "exitCopy_generic_opt_arg_list_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_generic_opt_elem(final PostgreSQLParser.Copy_generic_opt_elemContext ctx) {
    final var methodName = "exitCopy_generic_opt_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_generic_opt_list(final PostgreSQLParser.Copy_generic_opt_listContext ctx) {
    final var methodName = "exitCopy_generic_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_opt_item(final PostgreSQLParser.Copy_opt_itemContext ctx) {
    final var methodName = "exitCopy_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_opt_list(final PostgreSQLParser.Copy_opt_listContext ctx) {
    final var methodName = "exitCopy_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_options(final PostgreSQLParser.Copy_optionsContext ctx) {
    final var methodName = "exitCopy_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopystmt(final PostgreSQLParser.CopystmtContext ctx) {
    final var methodName = "exitCopystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_as_target(final PostgreSQLParser.Create_as_targetContext ctx) {
    final var methodName = "exitCreate_as_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_extension_opt_item(
      final PostgreSQLParser.Create_extension_opt_itemContext ctx) {
    final var methodName = "exitCreate_extension_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_extension_opt_list(
      final PostgreSQLParser.Create_extension_opt_listContext ctx) {
    final var methodName = "exitCreate_extension_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_generic_options(final PostgreSQLParser.Create_generic_optionsContext ctx) {
    final var methodName = "exitCreate_generic_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_mv_target(final PostgreSQLParser.Create_mv_targetContext ctx) {
    final var methodName = "exitCreate_mv_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateamstmt(final PostgreSQLParser.CreateamstmtContext ctx) {
    final var methodName = "exitCreateamstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateassertionstmt(final PostgreSQLParser.CreateassertionstmtContext ctx) {
    final var methodName = "exitCreateassertionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateasstmt(final PostgreSQLParser.CreateasstmtContext ctx) {
    final var methodName = "exitCreateasstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatecaststmt(final PostgreSQLParser.CreatecaststmtContext ctx) {
    final var methodName = "exitCreatecaststmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateconversionstmt(final PostgreSQLParser.CreateconversionstmtContext ctx) {
    final var methodName = "exitCreateconversionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatedb_opt_item(final PostgreSQLParser.Createdb_opt_itemContext ctx) {
    final var methodName = "exitCreatedb_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatedb_opt_items(final PostgreSQLParser.Createdb_opt_itemsContext ctx) {
    final var methodName = "exitCreatedb_opt_items";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatedb_opt_list(final PostgreSQLParser.Createdb_opt_listContext ctx) {
    final var methodName = "exitCreatedb_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatedb_opt_name(final PostgreSQLParser.Createdb_opt_nameContext ctx) {
    final var methodName = "exitCreatedb_opt_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatedbstmt(final PostgreSQLParser.CreatedbstmtContext ctx) {
    final var methodName = "exitCreatedbstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatedomainstmt(final PostgreSQLParser.CreatedomainstmtContext ctx) {
    final var methodName = "exitCreatedomainstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateeventtrigstmt(final PostgreSQLParser.CreateeventtrigstmtContext ctx) {
    final var methodName = "exitCreateeventtrigstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateextensionstmt(final PostgreSQLParser.CreateextensionstmtContext ctx) {
    final var methodName = "exitCreateextensionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatefdwstmt(final PostgreSQLParser.CreatefdwstmtContext ctx) {
    final var methodName = "exitCreatefdwstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateforeignserverstmt(
      final PostgreSQLParser.CreateforeignserverstmtContext ctx) {
    final var methodName = "exitCreateforeignserverstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateforeigntablestmt(final PostgreSQLParser.CreateforeigntablestmtContext ctx) {
    final var methodName = "exitCreateforeigntablestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatefunc_opt_item(final PostgreSQLParser.Createfunc_opt_itemContext ctx) {
    final var methodName = "exitCreatefunc_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatefunc_opt_list(final PostgreSQLParser.Createfunc_opt_listContext ctx) {
    final var methodName = "exitCreatefunc_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatefunctionstmt(final PostgreSQLParser.CreatefunctionstmtContext ctx) {
    final var methodName = "exitCreatefunctionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreategroupstmt(final PostgreSQLParser.CreategroupstmtContext ctx) {
    final var methodName = "exitCreategroupstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatematviewstmt(final PostgreSQLParser.CreatematviewstmtContext ctx) {
    final var methodName = "exitCreatematviewstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateopclassstmt(final PostgreSQLParser.CreateopclassstmtContext ctx) {
    final var methodName = "exitCreateopclassstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateopfamilystmt(final PostgreSQLParser.CreateopfamilystmtContext ctx) {
    final var methodName = "exitCreateopfamilystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateoptroleelem(final PostgreSQLParser.CreateoptroleelemContext ctx) {
    final var methodName = "exitCreateoptroleelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateplangstmt(final PostgreSQLParser.CreateplangstmtContext ctx) {
    final var methodName = "exitCreateplangstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatepolicystmt(final PostgreSQLParser.CreatepolicystmtContext ctx) {
    final var methodName = "exitCreatepolicystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatepublicationstmt(final PostgreSQLParser.CreatepublicationstmtContext ctx) {
    final var methodName = "exitCreatepublicationstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreaterolestmt(final PostgreSQLParser.CreaterolestmtContext ctx) {
    final var methodName = "exitCreaterolestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateschemastmt(final PostgreSQLParser.CreateschemastmtContext ctx) {
    final var methodName = "exitCreateschemastmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateseqstmt(final PostgreSQLParser.CreateseqstmtContext ctx) {
    final var methodName = "exitCreateseqstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatestatsstmt(final PostgreSQLParser.CreatestatsstmtContext ctx) {
    final var methodName = "exitCreatestatsstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatestmt(final PostgreSQLParser.CreatestmtContext ctx) {
    final var methodName = "exitCreatestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatesubscriptionstmt(final PostgreSQLParser.CreatesubscriptionstmtContext ctx) {
    final var methodName = "exitCreatesubscriptionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatetablespacestmt(final PostgreSQLParser.CreatetablespacestmtContext ctx) {
    final var methodName = "exitCreatetablespacestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatetransformstmt(final PostgreSQLParser.CreatetransformstmtContext ctx) {
    final var methodName = "exitCreatetransformstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatetrigstmt(final PostgreSQLParser.CreatetrigstmtContext ctx) {
    final var methodName = "exitCreatetrigstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateusermappingstmt(final PostgreSQLParser.CreateusermappingstmtContext ctx) {
    final var methodName = "exitCreateusermappingstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateuserstmt(final PostgreSQLParser.CreateuserstmtContext ctx) {
    final var methodName = "exitCreateuserstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCte_list(final PostgreSQLParser.Cte_listContext ctx) {
    final var methodName = "exitCte_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCube_clause(final PostgreSQLParser.Cube_clauseContext ctx) {
    final var methodName = "exitCube_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCursor_name(final PostgreSQLParser.Cursor_nameContext ctx) {
    final var methodName = "exitCursor_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCursor_options(final PostgreSQLParser.Cursor_optionsContext ctx) {
    final var methodName = "exitCursor_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCursor_variable(final PostgreSQLParser.Cursor_variableContext ctx) {
    final var methodName = "exitCursor_variable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeallocatestmt(final PostgreSQLParser.DeallocatestmtContext ctx) {
    final var methodName = "exitDeallocatestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_aliasitem(final PostgreSQLParser.Decl_aliasitemContext ctx) {
    final var methodName = "exitDecl_aliasitem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_collate(final PostgreSQLParser.Decl_collateContext ctx) {
    final var methodName = "exitDecl_collate";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_const(final PostgreSQLParser.Decl_constContext ctx) {
    final var methodName = "exitDecl_const";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_cursor_arg(final PostgreSQLParser.Decl_cursor_argContext ctx) {
    final var methodName = "exitDecl_cursor_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_cursor_arglist(final PostgreSQLParser.Decl_cursor_arglistContext ctx) {
    final var methodName = "exitDecl_cursor_arglist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_cursor_args(final PostgreSQLParser.Decl_cursor_argsContext ctx) {
    final var methodName = "exitDecl_cursor_args";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_cursor_query(final PostgreSQLParser.Decl_cursor_queryContext ctx) {
    final var methodName = "exitDecl_cursor_query";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_datatype(final PostgreSQLParser.Decl_datatypeContext ctx) {
    final var methodName = "exitDecl_datatype";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_defkey(final PostgreSQLParser.Decl_defkeyContext ctx) {
    final var methodName = "exitDecl_defkey";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_defval(final PostgreSQLParser.Decl_defvalContext ctx) {
    final var methodName = "exitDecl_defval";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_is_for(final PostgreSQLParser.Decl_is_forContext ctx) {
    final var methodName = "exitDecl_is_for";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_notnull(final PostgreSQLParser.Decl_notnullContext ctx) {
    final var methodName = "exitDecl_notnull";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_sect(final PostgreSQLParser.Decl_sectContext ctx) {
    final var methodName = "exitDecl_sect";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_start(final PostgreSQLParser.Decl_startContext ctx) {
    final var methodName = "exitDecl_start";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_statement(final PostgreSQLParser.Decl_statementContext ctx) {
    final var methodName = "exitDecl_statement";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_stmt(final PostgreSQLParser.Decl_stmtContext ctx) {
    final var methodName = "exitDecl_stmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_stmts(final PostgreSQLParser.Decl_stmtsContext ctx) {
    final var methodName = "exitDecl_stmts";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecl_varname(final PostgreSQLParser.Decl_varnameContext ctx) {
    final var methodName = "exitDecl_varname";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeclarecursorstmt(final PostgreSQLParser.DeclarecursorstmtContext ctx) {
    final var methodName = "exitDeclarecursorstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDef_arg(final PostgreSQLParser.Def_argContext ctx) {
    final var methodName = "exitDef_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDef_elem(final PostgreSQLParser.Def_elemContext ctx) {
    final var methodName = "exitDef_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDef_list(final PostgreSQLParser.Def_listContext ctx) {
    final var methodName = "exitDef_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefacl_privilege_target(
      final PostgreSQLParser.Defacl_privilege_targetContext ctx) {
    final var methodName = "exitDefacl_privilege_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefaclaction(final PostgreSQLParser.DefaclactionContext ctx) {
    final var methodName = "exitDefaclaction";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefacloption(final PostgreSQLParser.DefacloptionContext ctx) {
    final var methodName = "exitDefacloption";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefacloptionlist(final PostgreSQLParser.DefacloptionlistContext ctx) {
    final var methodName = "exitDefacloptionlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefinestmt(final PostgreSQLParser.DefinestmtContext ctx) {
    final var methodName = "exitDefinestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefinition(final PostgreSQLParser.DefinitionContext ctx) {
    final var methodName = "exitDefinition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeletestmt(final PostgreSQLParser.DeletestmtContext ctx) {
    final var methodName = "exitDeletestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDiscardstmt(final PostgreSQLParser.DiscardstmtContext ctx) {
    final var methodName = "exitDiscardstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDistinct_clause(final PostgreSQLParser.Distinct_clauseContext ctx) {
    final var methodName = "exitDistinct_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDocument_or_content(final PostgreSQLParser.Document_or_contentContext ctx) {
    final var methodName = "exitDocument_or_content";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDostmt(final PostgreSQLParser.DostmtContext ctx) {
    final var methodName = "exitDostmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDostmt_opt_item(final PostgreSQLParser.Dostmt_opt_itemContext ctx) {
    final var methodName = "exitDostmt_opt_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDostmt_opt_list(final PostgreSQLParser.Dostmt_opt_listContext ctx) {
    final var methodName = "exitDostmt_opt_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_option(final PostgreSQLParser.Drop_optionContext ctx) {
    final var methodName = "exitDrop_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_option_list(final PostgreSQLParser.Drop_option_listContext ctx) {
    final var methodName = "exitDrop_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_type_name(final PostgreSQLParser.Drop_type_nameContext ctx) {
    final var methodName = "exitDrop_type_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropcaststmt(final PostgreSQLParser.DropcaststmtContext ctx) {
    final var methodName = "exitDropcaststmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropdbstmt(final PostgreSQLParser.DropdbstmtContext ctx) {
    final var methodName = "exitDropdbstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropopclassstmt(final PostgreSQLParser.DropopclassstmtContext ctx) {
    final var methodName = "exitDropopclassstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropopfamilystmt(final PostgreSQLParser.DropopfamilystmtContext ctx) {
    final var methodName = "exitDropopfamilystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropownedstmt(final PostgreSQLParser.DropownedstmtContext ctx) {
    final var methodName = "exitDropownedstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDroprolestmt(final PostgreSQLParser.DroprolestmtContext ctx) {
    final var methodName = "exitDroprolestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropstmt(final PostgreSQLParser.DropstmtContext ctx) {
    final var methodName = "exitDropstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropsubscriptionstmt(final PostgreSQLParser.DropsubscriptionstmtContext ctx) {
    final var methodName = "exitDropsubscriptionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDroptablespacestmt(final PostgreSQLParser.DroptablespacestmtContext ctx) {
    final var methodName = "exitDroptablespacestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDroptransformstmt(final PostgreSQLParser.DroptransformstmtContext ctx) {
    final var methodName = "exitDroptransformstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropusermappingstmt(final PostgreSQLParser.DropusermappingstmtContext ctx) {
    final var methodName = "exitDropusermappingstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEmpty_grouping_set(final PostgreSQLParser.Empty_grouping_setContext ctx) {
    final var methodName = "exitEmpty_grouping_set";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnable_trigger(final PostgreSQLParser.Enable_triggerContext ctx) {
    final var methodName = "exitEnable_trigger";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnum_val_list(final PostgreSQLParser.Enum_val_listContext ctx) {
    final var methodName = "exitEnum_val_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEvent(final PostgreSQLParser.EventContext ctx) {
    final var methodName = "exitEvent";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEvent_trigger_value_list(
      final PostgreSQLParser.Event_trigger_value_listContext ctx) {
    final var methodName = "exitEvent_trigger_value_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEvent_trigger_when_item(
      final PostgreSQLParser.Event_trigger_when_itemContext ctx) {
    final var methodName = "exitEvent_trigger_when_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEvent_trigger_when_list(
      final PostgreSQLParser.Event_trigger_when_listContext ctx) {
    final var methodName = "exitEvent_trigger_when_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    final var methodName = "exitEveryRule";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitException_sect(final PostgreSQLParser.Exception_sectContext ctx) {
    final var methodName = "exitException_sect";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExclusionconstraintelem(
      final PostgreSQLParser.ExclusionconstraintelemContext ctx) {
    final var methodName = "exitExclusionconstraintelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExclusionconstraintlist(
      final PostgreSQLParser.ExclusionconstraintlistContext ctx) {
    final var methodName = "exitExclusionconstraintlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExclusionwhereclause(final PostgreSQLParser.ExclusionwhereclauseContext ctx) {
    final var methodName = "exitExclusionwhereclause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecute_param_clause(final PostgreSQLParser.Execute_param_clauseContext ctx) {
    final var methodName = "exitExecute_param_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecutestmt(final PostgreSQLParser.ExecutestmtContext ctx) {
    final var methodName = "exitExecutestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExistingindex(final PostgreSQLParser.ExistingindexContext ctx) {
    final var methodName = "exitExistingindex";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExit_type(final PostgreSQLParser.Exit_typeContext ctx) {
    final var methodName = "exitExit_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplain_option_arg(final PostgreSQLParser.Explain_option_argContext ctx) {
    final var methodName = "exitExplain_option_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplain_option_elem(final PostgreSQLParser.Explain_option_elemContext ctx) {
    final var methodName = "exitExplain_option_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplain_option_list(final PostgreSQLParser.Explain_option_listContext ctx) {
    final var methodName = "exitExplain_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplain_option_name(final PostgreSQLParser.Explain_option_nameContext ctx) {
    final var methodName = "exitExplain_option_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplainablestmt(final PostgreSQLParser.ExplainablestmtContext ctx) {
    final var methodName = "exitExplainablestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplainstmt(final PostgreSQLParser.ExplainstmtContext ctx) {
    final var methodName = "exitExplainstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplicit_row(final PostgreSQLParser.Explicit_rowContext ctx) {
    final var methodName = "exitExplicit_row";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr_list(final PostgreSQLParser.Expr_listContext ctx) {
    final var methodName = "exitExpr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr_until_loop(final PostgreSQLParser.Expr_until_loopContext ctx) {
    final var methodName = "exitExpr_until_loop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr_until_rightbracket(
      final PostgreSQLParser.Expr_until_rightbracketContext ctx) {
    final var methodName = "exitExpr_until_rightbracket";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr_until_semi(final PostgreSQLParser.Expr_until_semiContext ctx) {
    final var methodName = "exitExpr_until_semi";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr_until_then(final PostgreSQLParser.Expr_until_thenContext ctx) {
    final var methodName = "exitExpr_until_then";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExtract_arg(final PostgreSQLParser.Extract_argContext ctx) {
    final var methodName = "exitExtract_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExtract_list(final PostgreSQLParser.Extract_listContext ctx) {
    final var methodName = "exitExtract_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFconst(final PostgreSQLParser.FconstContext ctx) {
    final var methodName = "exitFconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFdw_option(final PostgreSQLParser.Fdw_optionContext ctx) {
    final var methodName = "exitFdw_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFdw_options(final PostgreSQLParser.Fdw_optionsContext ctx) {
    final var methodName = "exitFdw_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFetch_args(final PostgreSQLParser.Fetch_argsContext ctx) {
    final var methodName = "exitFetch_args";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFetchstmt(final PostgreSQLParser.FetchstmtContext ctx) {
    final var methodName = "exitFetchstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFile_name(final PostgreSQLParser.File_nameContext ctx) {
    final var methodName = "exitFile_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFilter_clause(final PostgreSQLParser.Filter_clauseContext ctx) {
    final var methodName = "exitFilter_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFirst_or_next(final PostgreSQLParser.First_or_nextContext ctx) {
    final var methodName = "exitFirst_or_next";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFor_control(final PostgreSQLParser.For_controlContext ctx) {
    final var methodName = "exitFor_control";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFor_locking_clause(final PostgreSQLParser.For_locking_clauseContext ctx) {
    final var methodName = "exitFor_locking_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFor_locking_item(final PostgreSQLParser.For_locking_itemContext ctx) {
    final var methodName = "exitFor_locking_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFor_locking_items(final PostgreSQLParser.For_locking_itemsContext ctx) {
    final var methodName = "exitFor_locking_items";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFor_locking_strength(final PostgreSQLParser.For_locking_strengthContext ctx) {
    final var methodName = "exitFor_locking_strength";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFor_variable(final PostgreSQLParser.For_variableContext ctx) {
    final var methodName = "exitFor_variable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForeach_slice(final PostgreSQLParser.Foreach_sliceContext ctx) {
    final var methodName = "exitForeach_slice";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForeign_server_version(final PostgreSQLParser.Foreign_server_versionContext ctx) {
    final var methodName = "exitForeign_server_version";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrame_bound(final PostgreSQLParser.Frame_boundContext ctx) {
    final var methodName = "exitFrame_bound";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrame_extent(final PostgreSQLParser.Frame_extentContext ctx) {
    final var methodName = "exitFrame_extent";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrom_clause(final PostgreSQLParser.From_clauseContext ctx) {
    final var methodName = "exitFrom_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrom_in(final PostgreSQLParser.From_inContext ctx) {
    final var methodName = "exitFrom_in";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrom_list(final PostgreSQLParser.From_listContext ctx) {
    final var methodName = "exitFrom_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_alias_clause(final PostgreSQLParser.Func_alias_clauseContext ctx) {
    final var methodName = "exitFunc_alias_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_application(final PostgreSQLParser.Func_applicationContext ctx) {
    final var methodName = "exitFunc_application";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_arg(final PostgreSQLParser.Func_argContext ctx) {
    final var methodName = "exitFunc_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_arg_expr(final PostgreSQLParser.Func_arg_exprContext ctx) {
    final var methodName = "exitFunc_arg_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_arg_list(final PostgreSQLParser.Func_arg_listContext ctx) {
    final var methodName = "exitFunc_arg_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_arg_with_default(final PostgreSQLParser.Func_arg_with_defaultContext ctx) {
    final var methodName = "exitFunc_arg_with_default";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_args(final PostgreSQLParser.Func_argsContext ctx) {
    final var methodName = "exitFunc_args";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_args_list(final PostgreSQLParser.Func_args_listContext ctx) {
    final var methodName = "exitFunc_args_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_args_with_defaults(
      final PostgreSQLParser.Func_args_with_defaultsContext ctx) {
    final var methodName = "exitFunc_args_with_defaults";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_args_with_defaults_list(
      final PostgreSQLParser.Func_args_with_defaults_listContext ctx) {
    final var methodName = "exitFunc_args_with_defaults_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_as(final PostgreSQLParser.Func_asContext ctx) {
    final var methodName = "exitFunc_as";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_expr(final PostgreSQLParser.Func_exprContext ctx) {
    final var methodName = "exitFunc_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_expr_common_subexpr(
      final PostgreSQLParser.Func_expr_common_subexprContext ctx) {
    final var methodName = "exitFunc_expr_common_subexpr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_expr_windowless(final PostgreSQLParser.Func_expr_windowlessContext ctx) {
    final var methodName = "exitFunc_expr_windowless";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_name(final PostgreSQLParser.Func_nameContext ctx) {
    final var methodName = "exitFunc_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_return(final PostgreSQLParser.Func_returnContext ctx) {
    final var methodName = "exitFunc_return";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_table(final PostgreSQLParser.Func_tableContext ctx) {
    final var methodName = "exitFunc_table";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_type(final PostgreSQLParser.Func_typeContext ctx) {
    final var methodName = "exitFunc_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_or_procedure(final PostgreSQLParser.Function_or_procedureContext ctx) {
    final var methodName = "exitFunction_or_procedure";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_with_argtypes(final PostgreSQLParser.Function_with_argtypesContext ctx) {
    final var methodName = "exitFunction_with_argtypes";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_with_argtypes_list(
      final PostgreSQLParser.Function_with_argtypes_listContext ctx) {
    final var methodName = "exitFunction_with_argtypes_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionsetresetclause(final PostgreSQLParser.FunctionsetresetclauseContext ctx) {
    final var methodName = "exitFunctionsetresetclause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGenerated_when(final PostgreSQLParser.Generated_whenContext ctx) {
    final var methodName = "exitGenerated_when";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneric_option_arg(final PostgreSQLParser.Generic_option_argContext ctx) {
    final var methodName = "exitGeneric_option_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneric_option_elem(final PostgreSQLParser.Generic_option_elemContext ctx) {
    final var methodName = "exitGeneric_option_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneric_option_list(final PostgreSQLParser.Generic_option_listContext ctx) {
    final var methodName = "exitGeneric_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneric_option_name(final PostgreSQLParser.Generic_option_nameContext ctx) {
    final var methodName = "exitGeneric_option_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneric_reset(final PostgreSQLParser.Generic_resetContext ctx) {
    final var methodName = "exitGeneric_reset";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneric_set(final PostgreSQLParser.Generic_setContext ctx) {
    final var methodName = "exitGeneric_set";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGenerictype(final PostgreSQLParser.GenerictypeContext ctx) {
    final var methodName = "exitGenerictype";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGetdiag_area_opt(final PostgreSQLParser.Getdiag_area_optContext ctx) {
    final var methodName = "exitGetdiag_area_opt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGetdiag_item(final PostgreSQLParser.Getdiag_itemContext ctx) {
    final var methodName = "exitGetdiag_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGetdiag_list(final PostgreSQLParser.Getdiag_listContext ctx) {
    final var methodName = "exitGetdiag_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGetdiag_list_item(final PostgreSQLParser.Getdiag_list_itemContext ctx) {
    final var methodName = "exitGetdiag_list_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGetdiag_target(final PostgreSQLParser.Getdiag_targetContext ctx) {
    final var methodName = "exitGetdiag_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantee(final PostgreSQLParser.GranteeContext ctx) {
    final var methodName = "exitGrantee";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantee_list(final PostgreSQLParser.Grantee_listContext ctx) {
    final var methodName = "exitGrantee_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantrolestmt(final PostgreSQLParser.GrantrolestmtContext ctx) {
    final var methodName = "exitGrantrolestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantstmt(final PostgreSQLParser.GrantstmtContext ctx) {
    final var methodName = "exitGrantstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroup_by_item(final PostgreSQLParser.Group_by_itemContext ctx) {
    final var methodName = "exitGroup_by_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroup_by_list(final PostgreSQLParser.Group_by_listContext ctx) {
    final var methodName = "exitGroup_by_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroup_clause(final PostgreSQLParser.Group_clauseContext ctx) {
    final var methodName = "exitGroup_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrouping_sets_clause(final PostgreSQLParser.Grouping_sets_clauseContext ctx) {
    final var methodName = "exitGrouping_sets_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandler_name(final PostgreSQLParser.Handler_nameContext ctx) {
    final var methodName = "exitHandler_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHash_partbound(final PostgreSQLParser.Hash_partboundContext ctx) {
    final var methodName = "exitHash_partbound";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHash_partbound_elem(final PostgreSQLParser.Hash_partbound_elemContext ctx) {
    final var methodName = "exitHash_partbound_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHaving_clause(final PostgreSQLParser.Having_clauseContext ctx) {
    final var methodName = "exitHaving_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitI_or_f_const(final PostgreSQLParser.I_or_f_constContext ctx) {
    final var methodName = "exitI_or_f_const";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIconst(final PostgreSQLParser.IconstContext ctx) {
    final var methodName = "exitIconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIdentifier(final PostgreSQLParser.IdentifierContext ctx) {
    final var methodName = "exitIdentifier";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImplicit_row(final PostgreSQLParser.Implicit_rowContext ctx) {
    final var methodName = "exitImplicit_row";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImport_qualification(final PostgreSQLParser.Import_qualificationContext ctx) {
    final var methodName = "exitImport_qualification";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImport_qualification_type(
      final PostgreSQLParser.Import_qualification_typeContext ctx) {
    final var methodName = "exitImport_qualification_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImportforeignschemastmt(
      final PostgreSQLParser.ImportforeignschemastmtContext ctx) {
    final var methodName = "exitImportforeignschemastmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIn_expr_list(final PostgreSQLParser.In_expr_listContext ctx) {
    final var methodName = "exitIn_expr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIn_expr_select(final PostgreSQLParser.In_expr_selectContext ctx) {
    final var methodName = "exitIn_expr_select";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_elem(final PostgreSQLParser.Index_elemContext ctx) {
    final var methodName = "exitIndex_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_elem_options(final PostgreSQLParser.Index_elem_optionsContext ctx) {
    final var methodName = "exitIndex_elem_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_including_params(final PostgreSQLParser.Index_including_paramsContext ctx) {
    final var methodName = "exitIndex_including_params";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_params(final PostgreSQLParser.Index_paramsContext ctx) {
    final var methodName = "exitIndex_params";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_partition_cmd(final PostgreSQLParser.Index_partition_cmdContext ctx) {
    final var methodName = "exitIndex_partition_cmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexstmt(final PostgreSQLParser.IndexstmtContext ctx) {
    final var methodName = "exitIndexstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndirection(final PostgreSQLParser.IndirectionContext ctx) {
    final var methodName = "exitIndirection";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndirection_el(final PostgreSQLParser.Indirection_elContext ctx) {
    final var methodName = "exitIndirection_el";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsert_column_item(final PostgreSQLParser.Insert_column_itemContext ctx) {
    final var methodName = "exitInsert_column_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsert_column_list(final PostgreSQLParser.Insert_column_listContext ctx) {
    final var methodName = "exitInsert_column_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsert_rest(final PostgreSQLParser.Insert_restContext ctx) {
    final var methodName = "exitInsert_rest";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsert_target(final PostgreSQLParser.Insert_targetContext ctx) {
    final var methodName = "exitInsert_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsertstmt(final PostgreSQLParser.InsertstmtContext ctx) {
    final var methodName = "exitInsertstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInterval_second(final PostgreSQLParser.Interval_secondContext ctx) {
    final var methodName = "exitInterval_second";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInto_clause(final PostgreSQLParser.Into_clauseContext ctx) {
    final var methodName = "exitInto_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInto_target(final PostgreSQLParser.Into_targetContext ctx) {
    final var methodName = "exitInto_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIso_level(final PostgreSQLParser.Iso_levelContext ctx) {
    final var methodName = "exitIso_level";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_qual(final PostgreSQLParser.Join_qualContext ctx) {
    final var methodName = "exitJoin_qual";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_type(final PostgreSQLParser.Join_typeContext ctx) {
    final var methodName = "exitJoin_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKey_action(final PostgreSQLParser.Key_actionContext ctx) {
    final var methodName = "exitKey_action";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKey_actions(final PostgreSQLParser.Key_actionsContext ctx) {
    final var methodName = "exitKey_actions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKey_delete(final PostgreSQLParser.Key_deleteContext ctx) {
    final var methodName = "exitKey_delete";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKey_match(final PostgreSQLParser.Key_matchContext ctx) {
    final var methodName = "exitKey_match";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKey_update(final PostgreSQLParser.Key_updateContext ctx) {
    final var methodName = "exitKey_update";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLabel_decl(final PostgreSQLParser.Label_declContext ctx) {
    final var methodName = "exitLabel_decl";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLimit_clause(final PostgreSQLParser.Limit_clauseContext ctx) {
    final var methodName = "exitLimit_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitListenstmt(final PostgreSQLParser.ListenstmtContext ctx) {
    final var methodName = "exitListenstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoadstmt(final PostgreSQLParser.LoadstmtContext ctx) {
    final var methodName = "exitLoadstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLock_type(final PostgreSQLParser.Lock_typeContext ctx) {
    final var methodName = "exitLock_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLocked_rels_list(final PostgreSQLParser.Locked_rels_listContext ctx) {
    final var methodName = "exitLocked_rels_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockstmt(final PostgreSQLParser.LockstmtContext ctx) {
    final var methodName = "exitLockstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoop_body(final PostgreSQLParser.Loop_bodyContext ctx) {
    final var methodName = "exitLoop_body";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMake_execsql_stmt(final PostgreSQLParser.Make_execsql_stmtContext ctx) {
    final var methodName = "exitMake_execsql_stmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMathop(final PostgreSQLParser.MathopContext ctx) {
    final var methodName = "exitMathop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_delete_clause(final PostgreSQLParser.Merge_delete_clauseContext ctx) {
    final var methodName = "exitMerge_delete_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_insert_clause(final PostgreSQLParser.Merge_insert_clauseContext ctx) {
    final var methodName = "exitMerge_insert_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_update_clause(final PostgreSQLParser.Merge_update_clauseContext ctx) {
    final var methodName = "exitMerge_update_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMergestmt(final PostgreSQLParser.MergestmtContext ctx) {
    final var methodName = "exitMergestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitName(final PostgreSQLParser.NameContext ctx) {
    final var methodName = "exitName";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitName_list(final PostgreSQLParser.Name_listContext ctx) {
    final var methodName = "exitName_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNon_ansi_join(final PostgreSQLParser.Non_ansi_joinContext ctx) {
    final var methodName = "exitNon_ansi_join";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNonreservedword(final PostgreSQLParser.NonreservedwordContext ctx) {
    final var methodName = "exitNonreservedword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNonreservedword_or_sconst(
      final PostgreSQLParser.Nonreservedword_or_sconstContext ctx) {
    final var methodName = "exitNonreservedword_or_sconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNotify_payload(final PostgreSQLParser.Notify_payloadContext ctx) {
    final var methodName = "exitNotify_payload";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNotifystmt(final PostgreSQLParser.NotifystmtContext ctx) {
    final var methodName = "exitNotifystmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNumeric(final PostgreSQLParser.NumericContext ctx) {
    final var methodName = "exitNumeric";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNumericonly(final PostgreSQLParser.NumericonlyContext ctx) {
    final var methodName = "exitNumericonly";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNumericonly_list(final PostgreSQLParser.Numericonly_listContext ctx) {
    final var methodName = "exitNumericonly_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_type_any_name(final PostgreSQLParser.Object_type_any_nameContext ctx) {
    final var methodName = "exitObject_type_any_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_type_name(final PostgreSQLParser.Object_type_nameContext ctx) {
    final var methodName = "exitObject_type_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_type_name_on_any_name(
      final PostgreSQLParser.Object_type_name_on_any_nameContext ctx) {
    final var methodName = "exitObject_type_name_on_any_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOffset_clause(final PostgreSQLParser.Offset_clauseContext ctx) {
    final var methodName = "exitOffset_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOld_aggr_definition(final PostgreSQLParser.Old_aggr_definitionContext ctx) {
    final var methodName = "exitOld_aggr_definition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOld_aggr_elem(final PostgreSQLParser.Old_aggr_elemContext ctx) {
    final var methodName = "exitOld_aggr_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOld_aggr_list(final PostgreSQLParser.Old_aggr_listContext ctx) {
    final var methodName = "exitOld_aggr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOncommitoption(final PostgreSQLParser.OncommitoptionContext ctx) {
    final var methodName = "exitOncommitoption";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpclass_drop(final PostgreSQLParser.Opclass_dropContext ctx) {
    final var methodName = "exitOpclass_drop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpclass_drop_list(final PostgreSQLParser.Opclass_drop_listContext ctx) {
    final var methodName = "exitOpclass_drop_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpclass_item(final PostgreSQLParser.Opclass_itemContext ctx) {
    final var methodName = "exitOpclass_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpclass_item_list(final PostgreSQLParser.Opclass_item_listContext ctx) {
    final var methodName = "exitOpclass_item_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpclass_purpose(final PostgreSQLParser.Opclass_purposeContext ctx) {
    final var methodName = "exitOpclass_purpose";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOper_argtypes(final PostgreSQLParser.Oper_argtypesContext ctx) {
    final var methodName = "exitOper_argtypes";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOperator_def_arg(final PostgreSQLParser.Operator_def_argContext ctx) {
    final var methodName = "exitOperator_def_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOperator_def_elem(final PostgreSQLParser.Operator_def_elemContext ctx) {
    final var methodName = "exitOperator_def_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOperator_def_list(final PostgreSQLParser.Operator_def_listContext ctx) {
    final var methodName = "exitOperator_def_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOperator_with_argtypes(final PostgreSQLParser.Operator_with_argtypesContext ctx) {
    final var methodName = "exitOperator_with_argtypes";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOperator_with_argtypes_list(
      final PostgreSQLParser.Operator_with_argtypes_listContext ctx) {
    final var methodName = "exitOperator_with_argtypes_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_alias_clause(final PostgreSQLParser.Opt_alias_clauseContext ctx) {
    final var methodName = "exitOpt_alias_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_all_clause(final PostgreSQLParser.Opt_all_clauseContext ctx) {
    final var methodName = "exitOpt_all_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_analyze(final PostgreSQLParser.Opt_analyzeContext ctx) {
    final var methodName = "exitOpt_analyze";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_array_bounds(final PostgreSQLParser.Opt_array_boundsContext ctx) {
    final var methodName = "exitOpt_array_bounds";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_as(final PostgreSQLParser.Opt_asContext ctx) {
    final var methodName = "exitOpt_as";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_asc_desc(final PostgreSQLParser.Opt_asc_descContext ctx) {
    final var methodName = "exitOpt_asc_desc";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_binary(final PostgreSQLParser.Opt_binaryContext ctx) {
    final var methodName = "exitOpt_binary";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_block_label(final PostgreSQLParser.Opt_block_labelContext ctx) {
    final var methodName = "exitOpt_block_label";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_boolean_or_string(final PostgreSQLParser.Opt_boolean_or_stringContext ctx) {
    final var methodName = "exitOpt_boolean_or_string";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_by(final PostgreSQLParser.Opt_byContext ctx) {
    final var methodName = "exitOpt_by";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_by_expression(final PostgreSQLParser.Opt_by_expressionContext ctx) {
    final var methodName = "exitOpt_by_expression";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_c_include(final PostgreSQLParser.Opt_c_includeContext ctx) {
    final var methodName = "exitOpt_c_include";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_case_else(final PostgreSQLParser.Opt_case_elseContext ctx) {
    final var methodName = "exitOpt_case_else";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_check_option(final PostgreSQLParser.Opt_check_optionContext ctx) {
    final var methodName = "exitOpt_check_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_class(final PostgreSQLParser.Opt_classContext ctx) {
    final var methodName = "exitOpt_class";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_col_def_list(final PostgreSQLParser.Opt_col_def_listContext ctx) {
    final var methodName = "exitOpt_col_def_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_collate(final PostgreSQLParser.Opt_collateContext ctx) {
    final var methodName = "exitOpt_collate";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_collate_clause(final PostgreSQLParser.Opt_collate_clauseContext ctx) {
    final var methodName = "exitOpt_collate_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_column(final PostgreSQLParser.Opt_columnContext ctx) {
    final var methodName = "exitOpt_column";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_column_list(final PostgreSQLParser.Opt_column_listContext ctx) {
    final var methodName = "exitOpt_column_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_concurrently(final PostgreSQLParser.Opt_concurrentlyContext ctx) {
    final var methodName = "exitOpt_concurrently";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_conf_expr(final PostgreSQLParser.Opt_conf_exprContext ctx) {
    final var methodName = "exitOpt_conf_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_cursor_from(final PostgreSQLParser.Opt_cursor_fromContext ctx) {
    final var methodName = "exitOpt_cursor_from";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_cursor_parameters(final PostgreSQLParser.Opt_cursor_parametersContext ctx) {
    final var methodName = "exitOpt_cursor_parameters";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_default(final PostgreSQLParser.Opt_defaultContext ctx) {
    final var methodName = "exitOpt_default";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_definition(final PostgreSQLParser.Opt_definitionContext ctx) {
    final var methodName = "exitOpt_definition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_drop_behavior(final PostgreSQLParser.Opt_drop_behaviorContext ctx) {
    final var methodName = "exitOpt_drop_behavior";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_encoding(final PostgreSQLParser.Opt_encodingContext ctx) {
    final var methodName = "exitOpt_encoding";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_enum_val_list(final PostgreSQLParser.Opt_enum_val_listContext ctx) {
    final var methodName = "exitOpt_enum_val_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_equal(final PostgreSQLParser.Opt_equalContext ctx) {
    final var methodName = "exitOpt_equal";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_escape(final PostgreSQLParser.Opt_escapeContext ctx) {
    final var methodName = "exitOpt_escape";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_execute_into(final PostgreSQLParser.Opt_execute_intoContext ctx) {
    final var methodName = "exitOpt_execute_into";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_execute_using(final PostgreSQLParser.Opt_execute_usingContext ctx) {
    final var methodName = "exitOpt_execute_using";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_execute_using_list(final PostgreSQLParser.Opt_execute_using_listContext ctx) {
    final var methodName = "exitOpt_execute_using_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_existing_window_name(
      final PostgreSQLParser.Opt_existing_window_nameContext ctx) {
    final var methodName = "exitOpt_existing_window_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_exitcond(final PostgreSQLParser.Opt_exitcondContext ctx) {
    final var methodName = "exitOpt_exitcond";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_expr_list(final PostgreSQLParser.Opt_expr_listContext ctx) {
    final var methodName = "exitOpt_expr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_expr_until_when(final PostgreSQLParser.Opt_expr_until_whenContext ctx) {
    final var methodName = "exitOpt_expr_until_when";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_fdw_options(final PostgreSQLParser.Opt_fdw_optionsContext ctx) {
    final var methodName = "exitOpt_fdw_options";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_fetch_direction(final PostgreSQLParser.Opt_fetch_directionContext ctx) {
    final var methodName = "exitOpt_fetch_direction";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_float(final PostgreSQLParser.Opt_floatContext ctx) {
    final var methodName = "exitOpt_float";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_for_locking_clause(final PostgreSQLParser.Opt_for_locking_clauseContext ctx) {
    final var methodName = "exitOpt_for_locking_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_for_using_expression(
      final PostgreSQLParser.Opt_for_using_expressionContext ctx) {
    final var methodName = "exitOpt_for_using_expression";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_foreign_server_version(
      final PostgreSQLParser.Opt_foreign_server_versionContext ctx) {
    final var methodName = "exitOpt_foreign_server_version";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_frame_clause(final PostgreSQLParser.Opt_frame_clauseContext ctx) {
    final var methodName = "exitOpt_frame_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_freeze(final PostgreSQLParser.Opt_freezeContext ctx) {
    final var methodName = "exitOpt_freeze";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_from_in(final PostgreSQLParser.Opt_from_inContext ctx) {
    final var methodName = "exitOpt_from_in";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_full(final PostgreSQLParser.Opt_fullContext ctx) {
    final var methodName = "exitOpt_full";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_grant_admin_option(final PostgreSQLParser.Opt_grant_admin_optionContext ctx) {
    final var methodName = "exitOpt_grant_admin_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_grant_grant_option(final PostgreSQLParser.Opt_grant_grant_optionContext ctx) {
    final var methodName = "exitOpt_grant_grant_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_granted_by(final PostgreSQLParser.Opt_granted_byContext ctx) {
    final var methodName = "exitOpt_granted_by";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_hold(final PostgreSQLParser.Opt_holdContext ctx) {
    final var methodName = "exitOpt_hold";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_if_exists(final PostgreSQLParser.Opt_if_existsContext ctx) {
    final var methodName = "exitOpt_if_exists";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_if_not_exists(final PostgreSQLParser.Opt_if_not_existsContext ctx) {
    final var methodName = "exitOpt_if_not_exists";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_in_database(final PostgreSQLParser.Opt_in_databaseContext ctx) {
    final var methodName = "exitOpt_in_database";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_include(final PostgreSQLParser.Opt_includeContext ctx) {
    final var methodName = "exitOpt_include";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_index_name(final PostgreSQLParser.Opt_index_nameContext ctx) {
    final var methodName = "exitOpt_index_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_indirection(final PostgreSQLParser.Opt_indirectionContext ctx) {
    final var methodName = "exitOpt_indirection";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_inline_handler(final PostgreSQLParser.Opt_inline_handlerContext ctx) {
    final var methodName = "exitOpt_inline_handler";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_instead(final PostgreSQLParser.Opt_insteadContext ctx) {
    final var methodName = "exitOpt_instead";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_interval(final PostgreSQLParser.Opt_intervalContext ctx) {
    final var methodName = "exitOpt_interval";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_label(final PostgreSQLParser.Opt_labelContext ctx) {
    final var methodName = "exitOpt_label";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_lock(final PostgreSQLParser.Opt_lockContext ctx) {
    final var methodName = "exitOpt_lock";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_loop_label(final PostgreSQLParser.Opt_loop_labelContext ctx) {
    final var methodName = "exitOpt_loop_label";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_materialized(final PostgreSQLParser.Opt_materializedContext ctx) {
    final var methodName = "exitOpt_materialized";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_name_list(final PostgreSQLParser.Opt_name_listContext ctx) {
    final var methodName = "exitOpt_name_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_no(final PostgreSQLParser.Opt_noContext ctx) {
    final var methodName = "exitOpt_no";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_no_inherit(final PostgreSQLParser.Opt_no_inheritContext ctx) {
    final var methodName = "exitOpt_no_inherit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_nowait(final PostgreSQLParser.Opt_nowaitContext ctx) {
    final var methodName = "exitOpt_nowait";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_nowait_or_skip(final PostgreSQLParser.Opt_nowait_or_skipContext ctx) {
    final var methodName = "exitOpt_nowait_or_skip";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_nulls_order(final PostgreSQLParser.Opt_nulls_orderContext ctx) {
    final var methodName = "exitOpt_nulls_order";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_on_conflict(final PostgreSQLParser.Opt_on_conflictContext ctx) {
    final var methodName = "exitOpt_on_conflict";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_open_bound_list(final PostgreSQLParser.Opt_open_bound_listContext ctx) {
    final var methodName = "exitOpt_open_bound_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_open_bound_list_item(
      final PostgreSQLParser.Opt_open_bound_list_itemContext ctx) {
    final var methodName = "exitOpt_open_bound_list_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_open_using(final PostgreSQLParser.Opt_open_usingContext ctx) {
    final var methodName = "exitOpt_open_using";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_opfamily(final PostgreSQLParser.Opt_opfamilyContext ctx) {
    final var methodName = "exitOpt_opfamily";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_or_replace(final PostgreSQLParser.Opt_or_replaceContext ctx) {
    final var methodName = "exitOpt_or_replace";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_ordinality(final PostgreSQLParser.Opt_ordinalityContext ctx) {
    final var methodName = "exitOpt_ordinality";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_partition_clause(final PostgreSQLParser.Opt_partition_clauseContext ctx) {
    final var methodName = "exitOpt_partition_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_procedural(final PostgreSQLParser.Opt_proceduralContext ctx) {
    final var methodName = "exitOpt_procedural";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_program(final PostgreSQLParser.Opt_programContext ctx) {
    final var methodName = "exitOpt_program";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_provider(final PostgreSQLParser.Opt_providerContext ctx) {
    final var methodName = "exitOpt_provider";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_publication_for_tables(
      final PostgreSQLParser.Opt_publication_for_tablesContext ctx) {
    final var methodName = "exitOpt_publication_for_tables";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_raise_list(final PostgreSQLParser.Opt_raise_listContext ctx) {
    final var methodName = "exitOpt_raise_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_raise_using(final PostgreSQLParser.Opt_raise_usingContext ctx) {
    final var methodName = "exitOpt_raise_using";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_raise_using_elem(final PostgreSQLParser.Opt_raise_using_elemContext ctx) {
    final var methodName = "exitOpt_raise_using_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_raise_using_elem_list(
      final PostgreSQLParser.Opt_raise_using_elem_listContext ctx) {
    final var methodName = "exitOpt_raise_using_elem_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_recheck(final PostgreSQLParser.Opt_recheckContext ctx) {
    final var methodName = "exitOpt_recheck";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_reloptions(final PostgreSQLParser.Opt_reloptionsContext ctx) {
    final var methodName = "exitOpt_reloptions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_repeatable_clause(final PostgreSQLParser.Opt_repeatable_clauseContext ctx) {
    final var methodName = "exitOpt_repeatable_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_restart_seqs(final PostgreSQLParser.Opt_restart_seqsContext ctx) {
    final var methodName = "exitOpt_restart_seqs";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_restrict(final PostgreSQLParser.Opt_restrictContext ctx) {
    final var methodName = "exitOpt_restrict";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_return_result(final PostgreSQLParser.Opt_return_resultContext ctx) {
    final var methodName = "exitOpt_return_result";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_returning_clause_into(
      final PostgreSQLParser.Opt_returning_clause_intoContext ctx) {
    final var methodName = "exitOpt_returning_clause_into";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_reverse(final PostgreSQLParser.Opt_reverseContext ctx) {
    final var methodName = "exitOpt_reverse";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_scroll_option(final PostgreSQLParser.Opt_scroll_optionContext ctx) {
    final var methodName = "exitOpt_scroll_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_scroll_option_no(final PostgreSQLParser.Opt_scroll_option_noContext ctx) {
    final var methodName = "exitOpt_scroll_option_no";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_scrollable(final PostgreSQLParser.Opt_scrollableContext ctx) {
    final var methodName = "exitOpt_scrollable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_select_limit(final PostgreSQLParser.Opt_select_limitContext ctx) {
    final var methodName = "exitOpt_select_limit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_semi(final PostgreSQLParser.Opt_semiContext ctx) {
    final var methodName = "exitOpt_semi";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_set_data(final PostgreSQLParser.Opt_set_dataContext ctx) {
    final var methodName = "exitOpt_set_data";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_slice_bound(final PostgreSQLParser.Opt_slice_boundContext ctx) {
    final var methodName = "exitOpt_slice_bound";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_sort_clause(final PostgreSQLParser.Opt_sort_clauseContext ctx) {
    final var methodName = "exitOpt_sort_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_stmt_assert_message(
      final PostgreSQLParser.Opt_stmt_assert_messageContext ctx) {
    final var methodName = "exitOpt_stmt_assert_message";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_stmt_raise_level(final PostgreSQLParser.Opt_stmt_raise_levelContext ctx) {
    final var methodName = "exitOpt_stmt_raise_level";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_strict(final PostgreSQLParser.Opt_strictContext ctx) {
    final var methodName = "exitOpt_strict";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_table(final PostgreSQLParser.Opt_tableContext ctx) {
    final var methodName = "exitOpt_table";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_target_list(final PostgreSQLParser.Opt_target_listContext ctx) {
    final var methodName = "exitOpt_target_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_timezone(final PostgreSQLParser.Opt_timezoneContext ctx) {
    final var methodName = "exitOpt_timezone";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_transaction(final PostgreSQLParser.Opt_transactionContext ctx) {
    final var methodName = "exitOpt_transaction";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_transaction_chain(final PostgreSQLParser.Opt_transaction_chainContext ctx) {
    final var methodName = "exitOpt_transaction_chain";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_trusted(final PostgreSQLParser.Opt_trustedContext ctx) {
    final var methodName = "exitOpt_trusted";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_type(final PostgreSQLParser.Opt_typeContext ctx) {
    final var methodName = "exitOpt_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_type_modifiers(final PostgreSQLParser.Opt_type_modifiersContext ctx) {
    final var methodName = "exitOpt_type_modifiers";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_uescape(final PostgreSQLParser.Opt_uescapeContext ctx) {
    final var methodName = "exitOpt_uescape";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_unique(final PostgreSQLParser.Opt_uniqueContext ctx) {
    final var methodName = "exitOpt_unique";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_using(final PostgreSQLParser.Opt_usingContext ctx) {
    final var methodName = "exitOpt_using";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_vacuum_relation_list(
      final PostgreSQLParser.Opt_vacuum_relation_listContext ctx) {
    final var methodName = "exitOpt_vacuum_relation_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_validator(final PostgreSQLParser.Opt_validatorContext ctx) {
    final var methodName = "exitOpt_validator";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_varying(final PostgreSQLParser.Opt_varyingContext ctx) {
    final var methodName = "exitOpt_varying";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_verbose(final PostgreSQLParser.Opt_verboseContext ctx) {
    final var methodName = "exitOpt_verbose";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_window_exclusion_clause(
      final PostgreSQLParser.Opt_window_exclusion_clauseContext ctx) {
    final var methodName = "exitOpt_window_exclusion_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_with(final PostgreSQLParser.Opt_withContext ctx) {
    final var methodName = "exitOpt_with";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_with_clause(final PostgreSQLParser.Opt_with_clauseContext ctx) {
    final var methodName = "exitOpt_with_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_with_data(final PostgreSQLParser.Opt_with_dataContext ctx) {
    final var methodName = "exitOpt_with_data";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpt_xml_root_standalone(
      final PostgreSQLParser.Opt_xml_root_standaloneContext ctx) {
    final var methodName = "exitOpt_xml_root_standalone";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptconstablespace(final PostgreSQLParser.OptconstablespaceContext ctx) {
    final var methodName = "exitOptconstablespace";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptconstrfromtable(final PostgreSQLParser.OptconstrfromtableContext ctx) {
    final var methodName = "exitOptconstrfromtable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptinherit(final PostgreSQLParser.OptinheritContext ctx) {
    final var methodName = "exitOptinherit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOption_value(final PostgreSQLParser.Option_valueContext ctx) {
    final var methodName = "exitOption_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptnolog(final PostgreSQLParser.OptnologContext ctx) {
    final var methodName = "exitOptnolog";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptparenthesizedseqoptlist(
      final PostgreSQLParser.OptparenthesizedseqoptlistContext ctx) {
    final var methodName = "exitOptparenthesizedseqoptlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptpartitionspec(final PostgreSQLParser.OptpartitionspecContext ctx) {
    final var methodName = "exitOptpartitionspec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptrolelist(final PostgreSQLParser.OptrolelistContext ctx) {
    final var methodName = "exitOptrolelist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptschemaeltlist(final PostgreSQLParser.OptschemaeltlistContext ctx) {
    final var methodName = "exitOptschemaeltlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptschemaname(final PostgreSQLParser.OptschemanameContext ctx) {
    final var methodName = "exitOptschemaname";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptseqoptlist(final PostgreSQLParser.OptseqoptlistContext ctx) {
    final var methodName = "exitOptseqoptlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpttableelementlist(final PostgreSQLParser.OpttableelementlistContext ctx) {
    final var methodName = "exitOpttableelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpttablefuncelementlist(
      final PostgreSQLParser.OpttablefuncelementlistContext ctx) {
    final var methodName = "exitOpttablefuncelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpttablespace(final PostgreSQLParser.OpttablespaceContext ctx) {
    final var methodName = "exitOpttablespace";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpttablespaceowner(final PostgreSQLParser.OpttablespaceownerContext ctx) {
    final var methodName = "exitOpttablespaceowner";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpttemp(final PostgreSQLParser.OpttempContext ctx) {
    final var methodName = "exitOpttemp";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpttempTableName(final PostgreSQLParser.OpttempTableNameContext ctx) {
    final var methodName = "exitOpttempTableName";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpttypedtableelementlist(
      final PostgreSQLParser.OpttypedtableelementlistContext ctx) {
    final var methodName = "exitOpttypedtableelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptwith(final PostgreSQLParser.OptwithContext ctx) {
    final var methodName = "exitOptwith";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOver_clause(final PostgreSQLParser.Over_clauseContext ctx) {
    final var methodName = "exitOver_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOverlay_list(final PostgreSQLParser.Overlay_listContext ctx) {
    final var methodName = "exitOverlay_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOverride_kind(final PostgreSQLParser.Override_kindContext ctx) {
    final var methodName = "exitOverride_kind";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParam_name(final PostgreSQLParser.Param_nameContext ctx) {
    final var methodName = "exitParam_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPart_elem(final PostgreSQLParser.Part_elemContext ctx) {
    final var methodName = "exitPart_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPart_params(final PostgreSQLParser.Part_paramsContext ctx) {
    final var methodName = "exitPart_params";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_cmd(final PostgreSQLParser.Partition_cmdContext ctx) {
    final var methodName = "exitPartition_cmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionboundspec(final PostgreSQLParser.PartitionboundspecContext ctx) {
    final var methodName = "exitPartitionboundspec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionspec(final PostgreSQLParser.PartitionspecContext ctx) {
    final var methodName = "exitPartitionspec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPl_block(final PostgreSQLParser.Pl_blockContext ctx) {
    final var methodName = "exitPl_block";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPl_function(final PostgreSQLParser.Pl_functionContext ctx) {
    final var methodName = "exitPl_function";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPlsql_opt_transaction_chain(
      final PostgreSQLParser.Plsql_opt_transaction_chainContext ctx) {
    final var methodName = "exitPlsql_opt_transaction_chain";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPlsql_unreserved_keyword(
      final PostgreSQLParser.Plsql_unreserved_keywordContext ctx) {
    final var methodName = "exitPlsql_unreserved_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPlsqlconsolecommand(final PostgreSQLParser.PlsqlconsolecommandContext ctx) {
    final var methodName = "exitPlsqlconsolecommand";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPlsqlidentifier(final PostgreSQLParser.PlsqlidentifierContext ctx) {
    final var methodName = "exitPlsqlidentifier";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPlsqlroot(final PostgreSQLParser.PlsqlrootContext ctx) {
    final var methodName = "exitPlsqlroot";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPlsqlvariablename(final PostgreSQLParser.PlsqlvariablenameContext ctx) {
    final var methodName = "exitPlsqlvariablename";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPosition_list(final PostgreSQLParser.Position_listContext ctx) {
    final var methodName = "exitPosition_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrep_type_clause(final PostgreSQLParser.Prep_type_clauseContext ctx) {
    final var methodName = "exitPrep_type_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPreparablestmt(final PostgreSQLParser.PreparablestmtContext ctx) {
    final var methodName = "exitPreparablestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPreparestmt(final PostgreSQLParser.PreparestmtContext ctx) {
    final var methodName = "exitPreparestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilege(final PostgreSQLParser.PrivilegeContext ctx) {
    final var methodName = "exitPrivilege";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilege_list(final PostgreSQLParser.Privilege_listContext ctx) {
    final var methodName = "exitPrivilege_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilege_target(final PostgreSQLParser.Privilege_targetContext ctx) {
    final var methodName = "exitPrivilege_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivileges(final PostgreSQLParser.PrivilegesContext ctx) {
    final var methodName = "exitPrivileges";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProc_condition(final PostgreSQLParser.Proc_conditionContext ctx) {
    final var methodName = "exitProc_condition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProc_conditions(final PostgreSQLParser.Proc_conditionsContext ctx) {
    final var methodName = "exitProc_conditions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProc_exception(final PostgreSQLParser.Proc_exceptionContext ctx) {
    final var methodName = "exitProc_exception";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProc_exceptions(final PostgreSQLParser.Proc_exceptionsContext ctx) {
    final var methodName = "exitProc_exceptions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProc_sect(final PostgreSQLParser.Proc_sectContext ctx) {
    final var methodName = "exitProc_sect";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProc_stmt(final PostgreSQLParser.Proc_stmtContext ctx) {
    final var methodName = "exitProc_stmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPublication_for_tables(final PostgreSQLParser.Publication_for_tablesContext ctx) {
    final var methodName = "exitPublication_for_tables";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPublication_name_item(final PostgreSQLParser.Publication_name_itemContext ctx) {
    final var methodName = "exitPublication_name_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPublication_name_list(final PostgreSQLParser.Publication_name_listContext ctx) {
    final var methodName = "exitPublication_name_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQual_all_op(final PostgreSQLParser.Qual_all_opContext ctx) {
    final var methodName = "exitQual_all_op";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQual_op(final PostgreSQLParser.Qual_opContext ctx) {
    final var methodName = "exitQual_op";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQualified_name(final PostgreSQLParser.Qualified_nameContext ctx) {
    final var methodName = "exitQualified_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQualified_name_list(final PostgreSQLParser.Qualified_name_listContext ctx) {
    final var methodName = "exitQualified_name_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReassignownedstmt(final PostgreSQLParser.ReassignownedstmtContext ctx) {
    final var methodName = "exitReassignownedstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRefreshmatviewstmt(final PostgreSQLParser.RefreshmatviewstmtContext ctx) {
    final var methodName = "exitRefreshmatviewstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReindex_option_elem(final PostgreSQLParser.Reindex_option_elemContext ctx) {
    final var methodName = "exitReindex_option_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReindex_option_list(final PostgreSQLParser.Reindex_option_listContext ctx) {
    final var methodName = "exitReindex_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReindex_target_multitable(
      final PostgreSQLParser.Reindex_target_multitableContext ctx) {
    final var methodName = "exitReindex_target_multitable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReindex_target_type(final PostgreSQLParser.Reindex_target_typeContext ctx) {
    final var methodName = "exitReindex_target_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReindexstmt(final PostgreSQLParser.ReindexstmtContext ctx) {
    final var methodName = "exitReindexstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelation_expr(final PostgreSQLParser.Relation_exprContext ctx) {
    final var methodName = "exitRelation_expr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelation_expr_list(final PostgreSQLParser.Relation_expr_listContext ctx) {
    final var methodName = "exitRelation_expr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelation_expr_opt_alias(
      final PostgreSQLParser.Relation_expr_opt_aliasContext ctx) {
    final var methodName = "exitRelation_expr_opt_alias";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReloption_elem(final PostgreSQLParser.Reloption_elemContext ctx) {
    final var methodName = "exitReloption_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReloption_list(final PostgreSQLParser.Reloption_listContext ctx) {
    final var methodName = "exitReloption_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReloptions(final PostgreSQLParser.ReloptionsContext ctx) {
    final var methodName = "exitReloptions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRemoveaggrstmt(final PostgreSQLParser.RemoveaggrstmtContext ctx) {
    final var methodName = "exitRemoveaggrstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRemovefuncstmt(final PostgreSQLParser.RemovefuncstmtContext ctx) {
    final var methodName = "exitRemovefuncstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRemoveoperstmt(final PostgreSQLParser.RemoveoperstmtContext ctx) {
    final var methodName = "exitRemoveoperstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRenamestmt(final PostgreSQLParser.RenamestmtContext ctx) {
    final var methodName = "exitRenamestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplica_identity(final PostgreSQLParser.Replica_identityContext ctx) {
    final var methodName = "exitReplica_identity";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReserved_keyword(final PostgreSQLParser.Reserved_keywordContext ctx) {
    final var methodName = "exitReserved_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReset_rest(final PostgreSQLParser.Reset_restContext ctx) {
    final var methodName = "exitReset_rest";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReturning_clause(final PostgreSQLParser.Returning_clauseContext ctx) {
    final var methodName = "exitReturning_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevokerolestmt(final PostgreSQLParser.RevokerolestmtContext ctx) {
    final var methodName = "exitRevokerolestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevokestmt(final PostgreSQLParser.RevokestmtContext ctx) {
    final var methodName = "exitRevokestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRole_list(final PostgreSQLParser.Role_listContext ctx) {
    final var methodName = "exitRole_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoleid(final PostgreSQLParser.RoleidContext ctx) {
    final var methodName = "exitRoleid";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRolespec(final PostgreSQLParser.RolespecContext ctx) {
    final var methodName = "exitRolespec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollup_clause(final PostgreSQLParser.Rollup_clauseContext ctx) {
    final var methodName = "exitRollup_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoot(final PostgreSQLParser.RootContext ctx) {
    final var methodName = "exitRoot";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRow(final PostgreSQLParser.RowContext ctx) {
    final var methodName = "exitRow";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRow_or_rows(final PostgreSQLParser.Row_or_rowsContext ctx) {
    final var methodName = "exitRow_or_rows";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRow_security_cmd(final PostgreSQLParser.Row_security_cmdContext ctx) {
    final var methodName = "exitRow_security_cmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowsecuritydefaultforcmd(
      final PostgreSQLParser.RowsecuritydefaultforcmdContext ctx) {
    final var methodName = "exitRowsecuritydefaultforcmd";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowsecuritydefaultpermissive(
      final PostgreSQLParser.RowsecuritydefaultpermissiveContext ctx) {
    final var methodName = "exitRowsecuritydefaultpermissive";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowsecuritydefaulttorole(
      final PostgreSQLParser.RowsecuritydefaulttoroleContext ctx) {
    final var methodName = "exitRowsecuritydefaulttorole";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowsecurityoptionalexpr(
      final PostgreSQLParser.RowsecurityoptionalexprContext ctx) {
    final var methodName = "exitRowsecurityoptionalexpr";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowsecurityoptionaltorole(
      final PostgreSQLParser.RowsecurityoptionaltoroleContext ctx) {
    final var methodName = "exitRowsecurityoptionaltorole";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowsecurityoptionalwithcheck(
      final PostgreSQLParser.RowsecurityoptionalwithcheckContext ctx) {
    final var methodName = "exitRowsecurityoptionalwithcheck";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowsfrom_item(final PostgreSQLParser.Rowsfrom_itemContext ctx) {
    final var methodName = "exitRowsfrom_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowsfrom_list(final PostgreSQLParser.Rowsfrom_listContext ctx) {
    final var methodName = "exitRowsfrom_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRuleactionlist(final PostgreSQLParser.RuleactionlistContext ctx) {
    final var methodName = "exitRuleactionlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRuleactionmulti(final PostgreSQLParser.RuleactionmultiContext ctx) {
    final var methodName = "exitRuleactionmulti";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRuleactionstmt(final PostgreSQLParser.RuleactionstmtContext ctx) {
    final var methodName = "exitRuleactionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRuleactionstmtOrEmpty(final PostgreSQLParser.RuleactionstmtOrEmptyContext ctx) {
    final var methodName = "exitRuleactionstmtOrEmpty";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRulestmt(final PostgreSQLParser.RulestmtContext ctx) {
    final var methodName = "exitRulestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSchema_stmt(final PostgreSQLParser.Schema_stmtContext ctx) {
    final var methodName = "exitSchema_stmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSconst(final PostgreSQLParser.SconstContext ctx) {
    final var methodName = "exitSconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSeclabelstmt(final PostgreSQLParser.SeclabelstmtContext ctx) {
    final var methodName = "exitSeclabelstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSecurity_label(final PostgreSQLParser.Security_labelContext ctx) {
    final var methodName = "exitSecurity_label";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_clause(final PostgreSQLParser.Select_clauseContext ctx) {
    final var methodName = "exitSelect_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_fetch_first_value(
      final PostgreSQLParser.Select_fetch_first_valueContext ctx) {
    final var methodName = "exitSelect_fetch_first_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_limit(final PostgreSQLParser.Select_limitContext ctx) {
    final var methodName = "exitSelect_limit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_limit_value(final PostgreSQLParser.Select_limit_valueContext ctx) {
    final var methodName = "exitSelect_limit_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_no_parens(final PostgreSQLParser.Select_no_parensContext ctx) {
    final var methodName = "exitSelect_no_parens";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_offset_value(final PostgreSQLParser.Select_offset_valueContext ctx) {
    final var methodName = "exitSelect_offset_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_with_parens(final PostgreSQLParser.Select_with_parensContext ctx) {
    final var methodName = "exitSelect_with_parens";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectstmt(final PostgreSQLParser.SelectstmtContext ctx) {
    final var methodName = "exitSelectstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSeqoptelem(final PostgreSQLParser.SeqoptelemContext ctx) {
    final var methodName = "exitSeqoptelem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSeqoptlist(final PostgreSQLParser.SeqoptlistContext ctx) {
    final var methodName = "exitSeqoptlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_clause(final PostgreSQLParser.Set_clauseContext ctx) {
    final var methodName = "exitSet_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_clause_list(final PostgreSQLParser.Set_clause_listContext ctx) {
    final var methodName = "exitSet_clause_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_rest(final PostgreSQLParser.Set_restContext ctx) {
    final var methodName = "exitSet_rest";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_rest_more(final PostgreSQLParser.Set_rest_moreContext ctx) {
    final var methodName = "exitSet_rest_more";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_target(final PostgreSQLParser.Set_targetContext ctx) {
    final var methodName = "exitSet_target";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_target_list(final PostgreSQLParser.Set_target_listContext ctx) {
    final var methodName = "exitSet_target_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetresetclause(final PostgreSQLParser.SetresetclauseContext ctx) {
    final var methodName = "exitSetresetclause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSharp(final PostgreSQLParser.SharpContext ctx) {
    final var methodName = "exitSharp";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSignediconst(final PostgreSQLParser.SignediconstContext ctx) {
    final var methodName = "exitSignediconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimple_select_intersect(
      final PostgreSQLParser.Simple_select_intersectContext ctx) {
    final var methodName = "exitSimple_select_intersect";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimple_select_pramary(final PostgreSQLParser.Simple_select_pramaryContext ctx) {
    final var methodName = "exitSimple_select_pramary";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpletypename(final PostgreSQLParser.SimpletypenameContext ctx) {
    final var methodName = "exitSimpletypename";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSort_clause(final PostgreSQLParser.Sort_clauseContext ctx) {
    final var methodName = "exitSort_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSortby(final PostgreSQLParser.SortbyContext ctx) {
    final var methodName = "exitSortby";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSortby_list(final PostgreSQLParser.Sortby_listContext ctx) {
    final var methodName = "exitSortby_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_expression(final PostgreSQLParser.Sql_expressionContext ctx) {
    final var methodName = "exitSql_expression";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt(final PostgreSQLParser.StmtContext ctx) {
    final var methodName = "exitStmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_assert(final PostgreSQLParser.Stmt_assertContext ctx) {
    final var methodName = "exitStmt_assert";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_assign(final PostgreSQLParser.Stmt_assignContext ctx) {
    final var methodName = "exitStmt_assign";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_call(final PostgreSQLParser.Stmt_callContext ctx) {
    final var methodName = "exitStmt_call";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_case(final PostgreSQLParser.Stmt_caseContext ctx) {
    final var methodName = "exitStmt_case";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_close(final PostgreSQLParser.Stmt_closeContext ctx) {
    final var methodName = "exitStmt_close";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_commit(final PostgreSQLParser.Stmt_commitContext ctx) {
    final var methodName = "exitStmt_commit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_dynexecute(final PostgreSQLParser.Stmt_dynexecuteContext ctx) {
    final var methodName = "exitStmt_dynexecute";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_else(final PostgreSQLParser.Stmt_elseContext ctx) {
    final var methodName = "exitStmt_else";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_elsifs(final PostgreSQLParser.Stmt_elsifsContext ctx) {
    final var methodName = "exitStmt_elsifs";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_execsql(final PostgreSQLParser.Stmt_execsqlContext ctx) {
    final var methodName = "exitStmt_execsql";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_exit(final PostgreSQLParser.Stmt_exitContext ctx) {
    final var methodName = "exitStmt_exit";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_fetch(final PostgreSQLParser.Stmt_fetchContext ctx) {
    final var methodName = "exitStmt_fetch";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_for(final PostgreSQLParser.Stmt_forContext ctx) {
    final var methodName = "exitStmt_for";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_foreach_a(final PostgreSQLParser.Stmt_foreach_aContext ctx) {
    final var methodName = "exitStmt_foreach_a";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_getdiag(final PostgreSQLParser.Stmt_getdiagContext ctx) {
    final var methodName = "exitStmt_getdiag";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_if(final PostgreSQLParser.Stmt_ifContext ctx) {
    final var methodName = "exitStmt_if";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_loop(final PostgreSQLParser.Stmt_loopContext ctx) {
    final var methodName = "exitStmt_loop";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_move(final PostgreSQLParser.Stmt_moveContext ctx) {
    final var methodName = "exitStmt_move";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_null(final PostgreSQLParser.Stmt_nullContext ctx) {
    final var methodName = "exitStmt_null";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_open(final PostgreSQLParser.Stmt_openContext ctx) {
    final var methodName = "exitStmt_open";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_perform(final PostgreSQLParser.Stmt_performContext ctx) {
    final var methodName = "exitStmt_perform";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_raise(final PostgreSQLParser.Stmt_raiseContext ctx) {
    final var methodName = "exitStmt_raise";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_return(final PostgreSQLParser.Stmt_returnContext ctx) {
    final var methodName = "exitStmt_return";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_rollback(final PostgreSQLParser.Stmt_rollbackContext ctx) {
    final var methodName = "exitStmt_rollback";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_set(final PostgreSQLParser.Stmt_setContext ctx) {
    final var methodName = "exitStmt_set";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmt_while(final PostgreSQLParser.Stmt_whileContext ctx) {
    final var methodName = "exitStmt_while";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmtblock(final PostgreSQLParser.StmtblockContext ctx) {
    final var methodName = "exitStmtblock";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStmtmulti(final PostgreSQLParser.StmtmultiContext ctx) {
    final var methodName = "exitStmtmulti";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSub_type(final PostgreSQLParser.Sub_typeContext ctx) {
    final var methodName = "exitSub_type";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubquery_Op(final PostgreSQLParser.Subquery_OpContext ctx) {
    final var methodName = "exitSubquery_Op";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubstr_list(final PostgreSQLParser.Substr_listContext ctx) {
    final var methodName = "exitSubstr_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_access_method_clause(
      final PostgreSQLParser.Table_access_method_clauseContext ctx) {
    final var methodName = "exitTable_access_method_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_alias(final PostgreSQLParser.Table_aliasContext ctx) {
    final var methodName = "exitTable_alias";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_alias_clause(final PostgreSQLParser.Table_alias_clauseContext ctx) {
    final var methodName = "exitTable_alias_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_func_column(final PostgreSQLParser.Table_func_columnContext ctx) {
    final var methodName = "exitTable_func_column";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_func_column_list(final PostgreSQLParser.Table_func_column_listContext ctx) {
    final var methodName = "exitTable_func_column_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_ref(final PostgreSQLParser.Table_refContext ctx) {
    final var methodName = "exitTable_ref";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableconstraint(final PostgreSQLParser.TableconstraintContext ctx) {
    final var methodName = "exitTableconstraint";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableelement(final PostgreSQLParser.TableelementContext ctx) {
    final var methodName = "exitTableelement";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableelementlist(final PostgreSQLParser.TableelementlistContext ctx) {
    final var methodName = "exitTableelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablefuncelement(final PostgreSQLParser.TablefuncelementContext ctx) {
    final var methodName = "exitTablefuncelement";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablefuncelementlist(final PostgreSQLParser.TablefuncelementlistContext ctx) {
    final var methodName = "exitTablefuncelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablelikeclause(final PostgreSQLParser.TablelikeclauseContext ctx) {
    final var methodName = "exitTablelikeclause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablelikeoption(final PostgreSQLParser.TablelikeoptionContext ctx) {
    final var methodName = "exitTablelikeoption";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablelikeoptionlist(final PostgreSQLParser.TablelikeoptionlistContext ctx) {
    final var methodName = "exitTablelikeoptionlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablesample_clause(final PostgreSQLParser.Tablesample_clauseContext ctx) {
    final var methodName = "exitTablesample_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTarget_label(final PostgreSQLParser.Target_labelContext ctx) {
    final var methodName = "exitTarget_label";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTarget_list(final PostgreSQLParser.Target_listContext ctx) {
    final var methodName = "exitTarget_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTarget_star(final PostgreSQLParser.Target_starContext ctx) {
    final var methodName = "exitTarget_star";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransaction_mode_item(final PostgreSQLParser.Transaction_mode_itemContext ctx) {
    final var methodName = "exitTransaction_mode_item";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransaction_mode_list(final PostgreSQLParser.Transaction_mode_listContext ctx) {
    final var methodName = "exitTransaction_mode_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransaction_mode_list_or_empty(
      final PostgreSQLParser.Transaction_mode_list_or_emptyContext ctx) {
    final var methodName = "exitTransaction_mode_list_or_empty";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionstmt(final PostgreSQLParser.TransactionstmtContext ctx) {
    final var methodName = "exitTransactionstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransform_element_list(final PostgreSQLParser.Transform_element_listContext ctx) {
    final var methodName = "exitTransform_element_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransform_type_list(final PostgreSQLParser.Transform_type_listContext ctx) {
    final var methodName = "exitTransform_type_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransitionoldornew(final PostgreSQLParser.TransitionoldornewContext ctx) {
    final var methodName = "exitTransitionoldornew";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransitionrelname(final PostgreSQLParser.TransitionrelnameContext ctx) {
    final var methodName = "exitTransitionrelname";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransitionrowortable(final PostgreSQLParser.TransitionrowortableContext ctx) {
    final var methodName = "exitTransitionrowortable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggeractiontime(final PostgreSQLParser.TriggeractiontimeContext ctx) {
    final var methodName = "exitTriggeractiontime";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerevents(final PostgreSQLParser.TriggereventsContext ctx) {
    final var methodName = "exitTriggerevents";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerforopteach(final PostgreSQLParser.TriggerforopteachContext ctx) {
    final var methodName = "exitTriggerforopteach";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerforspec(final PostgreSQLParser.TriggerforspecContext ctx) {
    final var methodName = "exitTriggerforspec";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerfortype(final PostgreSQLParser.TriggerfortypeContext ctx) {
    final var methodName = "exitTriggerfortype";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerfuncarg(final PostgreSQLParser.TriggerfuncargContext ctx) {
    final var methodName = "exitTriggerfuncarg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerfuncargs(final PostgreSQLParser.TriggerfuncargsContext ctx) {
    final var methodName = "exitTriggerfuncargs";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggeroneevent(final PostgreSQLParser.TriggeroneeventContext ctx) {
    final var methodName = "exitTriggeroneevent";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerreferencing(final PostgreSQLParser.TriggerreferencingContext ctx) {
    final var methodName = "exitTriggerreferencing";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggertransition(final PostgreSQLParser.TriggertransitionContext ctx) {
    final var methodName = "exitTriggertransition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggertransitions(final PostgreSQLParser.TriggertransitionsContext ctx) {
    final var methodName = "exitTriggertransitions";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerwhen(final PostgreSQLParser.TriggerwhenContext ctx) {
    final var methodName = "exitTriggerwhen";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrim_list(final PostgreSQLParser.Trim_listContext ctx) {
    final var methodName = "exitTrim_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTruncatestmt(final PostgreSQLParser.TruncatestmtContext ctx) {
    final var methodName = "exitTruncatestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_func_name_keyword(final PostgreSQLParser.Type_func_name_keywordContext ctx) {
    final var methodName = "exitType_func_name_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_function_name(final PostgreSQLParser.Type_function_nameContext ctx) {
    final var methodName = "exitType_function_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_list(final PostgreSQLParser.Type_listContext ctx) {
    final var methodName = "exitType_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_name_list(final PostgreSQLParser.Type_name_listContext ctx) {
    final var methodName = "exitType_name_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTypedtableelement(final PostgreSQLParser.TypedtableelementContext ctx) {
    final var methodName = "exitTypedtableelement";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTypedtableelementlist(final PostgreSQLParser.TypedtableelementlistContext ctx) {
    final var methodName = "exitTypedtableelementlist";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTypename(final PostgreSQLParser.TypenameContext ctx) {
    final var methodName = "exitTypename";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnicode_normal_form(final PostgreSQLParser.Unicode_normal_formContext ctx) {
    final var methodName = "exitUnicode_normal_form";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnlistenstmt(final PostgreSQLParser.UnlistenstmtContext ctx) {
    final var methodName = "exitUnlistenstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnreserved_keyword(final PostgreSQLParser.Unreserved_keywordContext ctx) {
    final var methodName = "exitUnreserved_keyword";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdatestmt(final PostgreSQLParser.UpdatestmtContext ctx) {
    final var methodName = "exitUpdatestmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUsing_clause(final PostgreSQLParser.Using_clauseContext ctx) {
    final var methodName = "exitUsing_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVac_analyze_option_arg(final PostgreSQLParser.Vac_analyze_option_argContext ctx) {
    final var methodName = "exitVac_analyze_option_arg";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVac_analyze_option_elem(
      final PostgreSQLParser.Vac_analyze_option_elemContext ctx) {
    final var methodName = "exitVac_analyze_option_elem";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVac_analyze_option_list(
      final PostgreSQLParser.Vac_analyze_option_listContext ctx) {
    final var methodName = "exitVac_analyze_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVac_analyze_option_name(
      final PostgreSQLParser.Vac_analyze_option_nameContext ctx) {
    final var methodName = "exitVac_analyze_option_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVacuum_relation(final PostgreSQLParser.Vacuum_relationContext ctx) {
    final var methodName = "exitVacuum_relation";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVacuum_relation_list(final PostgreSQLParser.Vacuum_relation_listContext ctx) {
    final var methodName = "exitVacuum_relation_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVacuumstmt(final PostgreSQLParser.VacuumstmtContext ctx) {
    final var methodName = "exitVacuumstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValidator_clause(final PostgreSQLParser.Validator_clauseContext ctx) {
    final var methodName = "exitValidator_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValues_clause(final PostgreSQLParser.Values_clauseContext ctx) {
    final var methodName = "exitValues_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVar_list(final PostgreSQLParser.Var_listContext ctx) {
    final var methodName = "exitVar_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVar_name(final PostgreSQLParser.Var_nameContext ctx) {
    final var methodName = "exitVar_name";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVar_value(final PostgreSQLParser.Var_valueContext ctx) {
    final var methodName = "exitVar_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVariableresetstmt(final PostgreSQLParser.VariableresetstmtContext ctx) {
    final var methodName = "exitVariableresetstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVariablesetstmt(final PostgreSQLParser.VariablesetstmtContext ctx) {
    final var methodName = "exitVariablesetstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVariableshowstmt(final PostgreSQLParser.VariableshowstmtContext ctx) {
    final var methodName = "exitVariableshowstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewstmt(final PostgreSQLParser.ViewstmtContext ctx) {
    final var methodName = "exitViewstmt";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhen_clause(final PostgreSQLParser.When_clauseContext ctx) {
    final var methodName = "exitWhen_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhen_clause_list(final PostgreSQLParser.When_clause_listContext ctx) {
    final var methodName = "exitWhen_clause_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhere_clause(final PostgreSQLParser.Where_clauseContext ctx) {
    final var methodName = "exitWhere_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhere_or_current_clause(
      final PostgreSQLParser.Where_or_current_clauseContext ctx) {
    final var methodName = "exitWhere_or_current_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_clause(final PostgreSQLParser.Window_clauseContext ctx) {
    final var methodName = "exitWindow_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_definition(final PostgreSQLParser.Window_definitionContext ctx) {
    final var methodName = "exitWindow_definition";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_definition_list(final PostgreSQLParser.Window_definition_listContext ctx) {
    final var methodName = "exitWindow_definition_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_specification(final PostgreSQLParser.Window_specificationContext ctx) {
    final var methodName = "exitWindow_specification";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWith_clause(final PostgreSQLParser.With_clauseContext ctx) {
    final var methodName = "exitWith_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithin_group_clause(final PostgreSQLParser.Within_group_clauseContext ctx) {
    final var methodName = "exitWithin_group_clause";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXconst(final PostgreSQLParser.XconstContext ctx) {
    final var methodName = "exitXconst";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_attribute_el(final PostgreSQLParser.Xml_attribute_elContext ctx) {
    final var methodName = "exitXml_attribute_el";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_attribute_list(final PostgreSQLParser.Xml_attribute_listContext ctx) {
    final var methodName = "exitXml_attribute_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_attributes(final PostgreSQLParser.Xml_attributesContext ctx) {
    final var methodName = "exitXml_attributes";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_namespace_el(final PostgreSQLParser.Xml_namespace_elContext ctx) {
    final var methodName = "exitXml_namespace_el";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_namespace_list(final PostgreSQLParser.Xml_namespace_listContext ctx) {
    final var methodName = "exitXml_namespace_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_passing_mech(final PostgreSQLParser.Xml_passing_mechContext ctx) {
    final var methodName = "exitXml_passing_mech";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_root_version(final PostgreSQLParser.Xml_root_versionContext ctx) {
    final var methodName = "exitXml_root_version";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_whitespace_option(final PostgreSQLParser.Xml_whitespace_optionContext ctx) {
    final var methodName = "exitXml_whitespace_option";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmlexists_argument(final PostgreSQLParser.Xmlexists_argumentContext ctx) {
    final var methodName = "exitXmlexists_argument";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmltable(final PostgreSQLParser.XmltableContext ctx) {
    final var methodName = "exitXmltable";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmltable_column_el(final PostgreSQLParser.Xmltable_column_elContext ctx) {
    final var methodName = "exitXmltable_column_el";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmltable_column_list(final PostgreSQLParser.Xmltable_column_listContext ctx) {
    final var methodName = "exitXmltable_column_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmltable_column_option_el(
      final PostgreSQLParser.Xmltable_column_option_elContext ctx) {
    final var methodName = "exitXmltable_column_option_el";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmltable_column_option_list(
      final PostgreSQLParser.Xmltable_column_option_listContext ctx) {
    final var methodName = "exitXmltable_column_option_list";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitZone_value(final PostgreSQLParser.Zone_valueContext ctx) {
    final var methodName = "exitZone_value";
    PostgreSQLParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void visitErrorNode(final ErrorNode node) {
    final var methodName = "visitErrorNode";
    PostgreSQLParserListenerBase.traceChildren(methodName, node);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void visitTerminal(final TerminalNode node) {
    final var methodName = "visitTerminal";
    PostgreSQLParserListenerBase.traceChildren(methodName, node);
  }
}
