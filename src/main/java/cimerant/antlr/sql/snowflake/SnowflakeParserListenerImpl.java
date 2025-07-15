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
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import sql.snowflake.SnowflakeParser;
import sql.snowflake.SnowflakeParserBaseListener;
import sql.snowflake.SnowflakeParserListener;

/**
 * This class provides an empty implementation of {@link SnowflakeParserListener}, which can be
 * extended to create a listener which only needs to handle a subset of the available methods.
 */
public class SnowflakeParserListenerImpl extends SnowflakeParserBaseListener {
  private static CharStream input;
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(SnowflakeParserListenerImpl.class.getName());
  }

  private static final void traceChildren(final String methodName, final ParseTree ctx) {
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
  public void enterAccount_id_list(final SnowflakeParser.Account_id_listContext ctx) {
    final var methodName = "enterAccount_id_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAccount_identifier(final SnowflakeParser.Account_identifierContext ctx) {
    final var methodName = "enterAccount_identifier";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAccount_object_privilege(
      final SnowflakeParser.Account_object_privilegeContext ctx) {
    final var methodName = "enterAccount_object_privilege";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAccount_object_privileges(
      final SnowflakeParser.Account_object_privilegesContext ctx) {
    final var methodName = "enterAccount_object_privileges";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAccount_params(final SnowflakeParser.Account_paramsContext ctx) {
    final var methodName = "enterAccount_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAfter_match(final SnowflakeParser.After_matchContext ctx) {
    final var methodName = "enterAfter_match";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggregate_function(final SnowflakeParser.Aggregate_functionContext ctx) {
    final var methodName = "enterAggregate_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlert_action(final SnowflakeParser.Alert_actionContext ctx) {
    final var methodName = "enterAlert_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlert_condition(final SnowflakeParser.Alert_conditionContext ctx) {
    final var methodName = "enterAlert_condition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlert_set_clause(final SnowflakeParser.Alert_set_clauseContext ctx) {
    final var methodName = "enterAlert_set_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlert_unset_clause(final SnowflakeParser.Alert_unset_clauseContext ctx) {
    final var methodName = "enterAlert_unset_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlias(final SnowflakeParser.AliasContext ctx) {
    final var methodName = "enterAlias";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAll_distinct(final SnowflakeParser.All_distinctContext ctx) {
    final var methodName = "enterAll_distinct";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_account(final SnowflakeParser.Alter_accountContext ctx) {
    final var methodName = "enterAlter_account";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_account_opts(final SnowflakeParser.Alter_account_optsContext ctx) {
    final var methodName = "enterAlter_account_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_alert(final SnowflakeParser.Alter_alertContext ctx) {
    final var methodName = "enterAlter_alert";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_api_integration(final SnowflakeParser.Alter_api_integrationContext ctx) {
    final var methodName = "enterAlter_api_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_column_clause(final SnowflakeParser.Alter_column_clauseContext ctx) {
    final var methodName = "enterAlter_column_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_column_decl(final SnowflakeParser.Alter_column_declContext ctx) {
    final var methodName = "enterAlter_column_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_column_decl_list(final SnowflakeParser.Alter_column_decl_listContext ctx) {
    final var methodName = "enterAlter_column_decl_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_column_opts(final SnowflakeParser.Alter_column_optsContext ctx) {
    final var methodName = "enterAlter_column_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_command(final SnowflakeParser.Alter_commandContext ctx) {
    final var methodName = "enterAlter_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_connection(final SnowflakeParser.Alter_connectionContext ctx) {
    final var methodName = "enterAlter_connection";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_connection_opts(final SnowflakeParser.Alter_connection_optsContext ctx) {
    final var methodName = "enterAlter_connection_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_database(final SnowflakeParser.Alter_databaseContext ctx) {
    final var methodName = "enterAlter_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_dynamic_table(final SnowflakeParser.Alter_dynamic_tableContext ctx) {
    final var methodName = "enterAlter_dynamic_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_external_table(final SnowflakeParser.Alter_external_tableContext ctx) {
    final var methodName = "enterAlter_external_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_failover_group(final SnowflakeParser.Alter_failover_groupContext ctx) {
    final var methodName = "enterAlter_failover_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_file_format(final SnowflakeParser.Alter_file_formatContext ctx) {
    final var methodName = "enterAlter_file_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_function(final SnowflakeParser.Alter_functionContext ctx) {
    final var methodName = "enterAlter_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_function_signature(
      final SnowflakeParser.Alter_function_signatureContext ctx) {
    final var methodName = "enterAlter_function_signature";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_masking_policy(final SnowflakeParser.Alter_masking_policyContext ctx) {
    final var methodName = "enterAlter_masking_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_materialized_view(
      final SnowflakeParser.Alter_materialized_viewContext ctx) {
    final var methodName = "enterAlter_materialized_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_modify(final SnowflakeParser.Alter_modifyContext ctx) {
    final var methodName = "enterAlter_modify";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_network_policy(final SnowflakeParser.Alter_network_policyContext ctx) {
    final var methodName = "enterAlter_network_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_network_policy_opts(
      final SnowflakeParser.Alter_network_policy_optsContext ctx) {
    final var methodName = "enterAlter_network_policy_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_notification_integration(
      final SnowflakeParser.Alter_notification_integrationContext ctx) {
    final var methodName = "enterAlter_notification_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_password_policy(final SnowflakeParser.Alter_password_policyContext ctx) {
    final var methodName = "enterAlter_password_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_pipe(final SnowflakeParser.Alter_pipeContext ctx) {
    final var methodName = "enterAlter_pipe";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_procedure(final SnowflakeParser.Alter_procedureContext ctx) {
    final var methodName = "enterAlter_procedure";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_replication_group(
      final SnowflakeParser.Alter_replication_groupContext ctx) {
    final var methodName = "enterAlter_replication_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_resource_monitor(final SnowflakeParser.Alter_resource_monitorContext ctx) {
    final var methodName = "enterAlter_resource_monitor";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_role(final SnowflakeParser.Alter_roleContext ctx) {
    final var methodName = "enterAlter_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_row_access_policy(
      final SnowflakeParser.Alter_row_access_policyContext ctx) {
    final var methodName = "enterAlter_row_access_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_schema(final SnowflakeParser.Alter_schemaContext ctx) {
    final var methodName = "enterAlter_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_security_integration_external_oauth(
      final SnowflakeParser.Alter_security_integration_external_oauthContext ctx) {
    final var methodName = "enterAlter_security_integration_external_oauth";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_security_integration_saml2(
      final SnowflakeParser.Alter_security_integration_saml2Context ctx) {
    final var methodName = "enterAlter_security_integration_saml2";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_security_integration_scim(
      final SnowflakeParser.Alter_security_integration_scimContext ctx) {
    final var methodName = "enterAlter_security_integration_scim";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_security_integration_snowflake_oauth(
      final SnowflakeParser.Alter_security_integration_snowflake_oauthContext ctx) {
    final var methodName = "enterAlter_security_integration_snowflake_oauth";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_sequence(final SnowflakeParser.Alter_sequenceContext ctx) {
    final var methodName = "enterAlter_sequence";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_session(final SnowflakeParser.Alter_sessionContext ctx) {
    final var methodName = "enterAlter_session";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_session_policy(final SnowflakeParser.Alter_session_policyContext ctx) {
    final var methodName = "enterAlter_session_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_share(final SnowflakeParser.Alter_shareContext ctx) {
    final var methodName = "enterAlter_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_stage(final SnowflakeParser.Alter_stageContext ctx) {
    final var methodName = "enterAlter_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_storage_integration(
      final SnowflakeParser.Alter_storage_integrationContext ctx) {
    final var methodName = "enterAlter_storage_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_stream(final SnowflakeParser.Alter_streamContext ctx) {
    final var methodName = "enterAlter_stream";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table(final SnowflakeParser.Alter_tableContext ctx) {
    final var methodName = "enterAlter_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_alter_column(
      final SnowflakeParser.Alter_table_alter_columnContext ctx) {
    final var methodName = "enterAlter_table_alter_column";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_tag(final SnowflakeParser.Alter_tagContext ctx) {
    final var methodName = "enterAlter_tag";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_tag_opts(final SnowflakeParser.Alter_tag_optsContext ctx) {
    final var methodName = "enterAlter_tag_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_task(final SnowflakeParser.Alter_taskContext ctx) {
    final var methodName = "enterAlter_task";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_user(final SnowflakeParser.Alter_userContext ctx) {
    final var methodName = "enterAlter_user";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_user_opts(final SnowflakeParser.Alter_user_optsContext ctx) {
    final var methodName = "enterAlter_user_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_view(final SnowflakeParser.Alter_viewContext ctx) {
    final var methodName = "enterAlter_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_warehouse(final SnowflakeParser.Alter_warehouseContext ctx) {
    final var methodName = "enterAlter_warehouse";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_warehouse_opts(final SnowflakeParser.Alter_warehouse_optsContext ctx) {
    final var methodName = "enterAlter_warehouse_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterApi_integration_property(
      final SnowflakeParser.Api_integration_propertyContext ctx) {
    final var methodName = "enterApi_integration_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAppend_only(final SnowflakeParser.Append_onlyContext ctx) {
    final var methodName = "enterAppend_only";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterArg_data_type(final SnowflakeParser.Arg_data_typeContext ctx) {
    final var methodName = "enterArg_data_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterArg_decl(final SnowflakeParser.Arg_declContext ctx) {
    final var methodName = "enterArg_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterArg_default_value_clause(
      final SnowflakeParser.Arg_default_value_clauseContext ctx) {
    final var methodName = "enterArg_default_value_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterArg_name(final SnowflakeParser.Arg_nameContext ctx) {
    final var methodName = "enterArg_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterArg_types(final SnowflakeParser.Arg_typesContext ctx) {
    final var methodName = "enterArg_types";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterArr_literal(final SnowflakeParser.Arr_literalContext ctx) {
    final var methodName = "enterArr_literal";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAs_alias(final SnowflakeParser.As_aliasContext ctx) {
    final var methodName = "enterAs_alias";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAsc_desc(final SnowflakeParser.Asc_descContext ctx) {
    final var methodName = "enterAsc_desc";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAt_before(final SnowflakeParser.At_beforeContext ctx) {
    final var methodName = "enterAt_before";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAt_before1(final SnowflakeParser.At_before1Context ctx) {
    final var methodName = "enterAt_before1";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAuto_refresh(final SnowflakeParser.Auto_refreshContext ctx) {
    final var methodName = "enterAuto_refresh";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAws_credential_or_storage_integration(
      final SnowflakeParser.Aws_credential_or_storage_integrationContext ctx) {
    final var methodName = "enterAws_credential_or_storage_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAws_key_id(final SnowflakeParser.Aws_key_idContext ctx) {
    final var methodName = "enterAws_key_id";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAws_role(final SnowflakeParser.Aws_roleContext ctx) {
    final var methodName = "enterAws_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAws_secret_key(final SnowflakeParser.Aws_secret_keyContext ctx) {
    final var methodName = "enterAws_secret_key";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAws_token(final SnowflakeParser.Aws_tokenContext ctx) {
    final var methodName = "enterAws_token";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAz_credential_or_storage_integration(
      final SnowflakeParser.Az_credential_or_storage_integrationContext ctx) {
    final var methodName = "enterAz_credential_or_storage_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAzure_encryption_value(final SnowflakeParser.Azure_encryption_valueContext ctx) {
    final var methodName = "enterAzure_encryption_value";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBatch(final SnowflakeParser.BatchContext ctx) {
    final var methodName = "enterBatch";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBegin_txn(final SnowflakeParser.Begin_txnContext ctx) {
    final var methodName = "enterBegin_txn";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBinary_builtin_function(
      final SnowflakeParser.Binary_builtin_functionContext ctx) {
    final var methodName = "enterBinary_builtin_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBinary_or_ternary_builtin_function(
      final SnowflakeParser.Binary_or_ternary_builtin_functionContext ctx) {
    final var methodName = "enterBinary_or_ternary_builtin_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBracket_expression(final SnowflakeParser.Bracket_expressionContext ctx) {
    final var methodName = "enterBracket_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBuiltin_function(final SnowflakeParser.Builtin_functionContext ctx) {
    final var methodName = "enterBuiltin_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCall(final SnowflakeParser.CallContext ctx) {
    final var methodName = "enterCall";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaller_owner(final SnowflakeParser.Caller_ownerContext ctx) {
    final var methodName = "enterCaller_owner";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCascade_restrict(final SnowflakeParser.Cascade_restrictContext ctx) {
    final var methodName = "enterCascade_restrict";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCase_expression(final SnowflakeParser.Case_expressionContext ctx) {
    final var methodName = "enterCase_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCast_expr(final SnowflakeParser.Cast_exprContext ctx) {
    final var methodName = "enterCast_expr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChange_tracking(final SnowflakeParser.Change_trackingContext ctx) {
    final var methodName = "enterChange_tracking";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChanges(final SnowflakeParser.ChangesContext ctx) {
    final var methodName = "enterChanges";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharacter(final SnowflakeParser.CharacterContext ctx) {
    final var methodName = "enterCharacter";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClone_at_before(final SnowflakeParser.Clone_at_beforeContext ctx) {
    final var methodName = "enterClone_at_before";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCloud_provider_params(final SnowflakeParser.Cloud_provider_paramsContext ctx) {
    final var methodName = "enterCloud_provider_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCloud_provider_params_auto(
      final SnowflakeParser.Cloud_provider_params_autoContext ctx) {
    final var methodName = "enterCloud_provider_params_auto";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCloud_provider_params_push(
      final SnowflakeParser.Cloud_provider_params_pushContext ctx) {
    final var methodName = "enterCloud_provider_params_push";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCloud_provider_params2(final SnowflakeParser.Cloud_provider_params2Context ctx) {
    final var methodName = "enterCloud_provider_params2";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCloud_provider_params3(final SnowflakeParser.Cloud_provider_params3Context ctx) {
    final var methodName = "enterCloud_provider_params3";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCluster_by(final SnowflakeParser.Cluster_byContext ctx) {
    final var methodName = "enterCluster_by";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClustering_action(final SnowflakeParser.Clustering_actionContext ctx) {
    final var methodName = "enterClustering_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCol_decl(final SnowflakeParser.Col_declContext ctx) {
    final var methodName = "enterCol_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollate(final SnowflakeParser.CollateContext ctx) {
    final var methodName = "enterCollate";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_alias_list_in_brackets(
      final SnowflakeParser.Column_alias_list_in_bracketsContext ctx) {
    final var methodName = "enterColumn_alias_list_in_brackets";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_decl_item(final SnowflakeParser.Column_decl_itemContext ctx) {
    final var methodName = "enterColumn_decl_item";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_decl_item_list(final SnowflakeParser.Column_decl_item_listContext ctx) {
    final var methodName = "enterColumn_decl_item_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_decl_item_list_paren(
      final SnowflakeParser.Column_decl_item_list_parenContext ctx) {
    final var methodName = "enterColumn_decl_item_list_paren";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_elem(final SnowflakeParser.Column_elemContext ctx) {
    final var methodName = "enterColumn_elem";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_elem_star(final SnowflakeParser.Column_elem_starContext ctx) {
    final var methodName = "enterColumn_elem_star";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_list(final SnowflakeParser.Column_listContext ctx) {
    final var methodName = "enterColumn_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_list_in_parentheses(
      final SnowflakeParser.Column_list_in_parenthesesContext ctx) {
    final var methodName = "enterColumn_list_in_parentheses";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_list_with_comment(
      final SnowflakeParser.Column_list_with_commentContext ctx) {
    final var methodName = "enterColumn_list_with_comment";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_name(final SnowflakeParser.Column_nameContext ctx) {
    final var methodName = "enterColumn_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_position(final SnowflakeParser.Column_positionContext ctx) {
    final var methodName = "enterColumn_position";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_set_tags(final SnowflakeParser.Column_set_tagsContext ctx) {
    final var methodName = "enterColumn_set_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_unset_tags(final SnowflakeParser.Column_unset_tagsContext ctx) {
    final var methodName = "enterColumn_unset_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComment(final SnowflakeParser.CommentContext ctx) {
    final var methodName = "enterComment";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComment_clause(final SnowflakeParser.Comment_clauseContext ctx) {
    final var methodName = "enterComment_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommit(final SnowflakeParser.CommitContext ctx) {
    final var methodName = "enterCommit";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommon_constraint_properties(
      final SnowflakeParser.Common_constraint_propertiesContext ctx) {
    final var methodName = "enterCommon_constraint_properties";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommon_table_expression(
      final SnowflakeParser.Common_table_expressionContext ctx) {
    final var methodName = "enterCommon_table_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComparison_operator(final SnowflakeParser.Comparison_operatorContext ctx) {
    final var methodName = "enterComparison_operator";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompression(final SnowflakeParser.CompressionContext ctx) {
    final var methodName = "enterCompression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompression_type(final SnowflakeParser.Compression_typeContext ctx) {
    final var methodName = "enterCompression_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraint_action(final SnowflakeParser.Constraint_actionContext ctx) {
    final var methodName = "enterConstraint_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraint_properties(final SnowflakeParser.Constraint_propertiesContext ctx) {
    final var methodName = "enterConstraint_properties";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_grants(final SnowflakeParser.Copy_grantsContext ctx) {
    final var methodName = "enterCopy_grants";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_into_location(final SnowflakeParser.Copy_into_locationContext ctx) {
    final var methodName = "enterCopy_into_location";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_into_table(final SnowflakeParser.Copy_into_tableContext ctx) {
    final var methodName = "enterCopy_into_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopy_options(final SnowflakeParser.Copy_optionsContext ctx) {
    final var methodName = "enterCopy_options";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_account(final SnowflakeParser.Create_accountContext ctx) {
    final var methodName = "enterCreate_account";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_alert(final SnowflakeParser.Create_alertContext ctx) {
    final var methodName = "enterCreate_alert";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_api_integration(final SnowflakeParser.Create_api_integrationContext ctx) {
    final var methodName = "enterCreate_api_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_command(final SnowflakeParser.Create_commandContext ctx) {
    final var methodName = "enterCreate_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_connection(final SnowflakeParser.Create_connectionContext ctx) {
    final var methodName = "enterCreate_connection";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_database(final SnowflakeParser.Create_databaseContext ctx) {
    final var methodName = "enterCreate_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_dynamic_table(final SnowflakeParser.Create_dynamic_tableContext ctx) {
    final var methodName = "enterCreate_dynamic_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_event_table(final SnowflakeParser.Create_event_tableContext ctx) {
    final var methodName = "enterCreate_event_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_external_function(
      final SnowflakeParser.Create_external_functionContext ctx) {
    final var methodName = "enterCreate_external_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_external_table(final SnowflakeParser.Create_external_tableContext ctx) {
    final var methodName = "enterCreate_external_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_failover_group(final SnowflakeParser.Create_failover_groupContext ctx) {
    final var methodName = "enterCreate_failover_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_file_format(final SnowflakeParser.Create_file_formatContext ctx) {
    final var methodName = "enterCreate_file_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_function(final SnowflakeParser.Create_functionContext ctx) {
    final var methodName = "enterCreate_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_managed_account(final SnowflakeParser.Create_managed_accountContext ctx) {
    final var methodName = "enterCreate_managed_account";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_masking_policy(final SnowflakeParser.Create_masking_policyContext ctx) {
    final var methodName = "enterCreate_masking_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_materialized_view(
      final SnowflakeParser.Create_materialized_viewContext ctx) {
    final var methodName = "enterCreate_materialized_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_network_policy(final SnowflakeParser.Create_network_policyContext ctx) {
    final var methodName = "enterCreate_network_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_notification_integration(
      final SnowflakeParser.Create_notification_integrationContext ctx) {
    final var methodName = "enterCreate_notification_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_object_clone(final SnowflakeParser.Create_object_cloneContext ctx) {
    final var methodName = "enterCreate_object_clone";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_password_policy(final SnowflakeParser.Create_password_policyContext ctx) {
    final var methodName = "enterCreate_password_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_pipe(final SnowflakeParser.Create_pipeContext ctx) {
    final var methodName = "enterCreate_pipe";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_procedure(final SnowflakeParser.Create_procedureContext ctx) {
    final var methodName = "enterCreate_procedure";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_replication_group(
      final SnowflakeParser.Create_replication_groupContext ctx) {
    final var methodName = "enterCreate_replication_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_resource_monitor(
      final SnowflakeParser.Create_resource_monitorContext ctx) {
    final var methodName = "enterCreate_resource_monitor";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_role(final SnowflakeParser.Create_roleContext ctx) {
    final var methodName = "enterCreate_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_row_access_policy(
      final SnowflakeParser.Create_row_access_policyContext ctx) {
    final var methodName = "enterCreate_row_access_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_schema(final SnowflakeParser.Create_schemaContext ctx) {
    final var methodName = "enterCreate_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_security_integration_external_oauth(
      final SnowflakeParser.Create_security_integration_external_oauthContext ctx) {
    final var methodName = "enterCreate_security_integration_external_oauth";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_security_integration_saml2(
      final SnowflakeParser.Create_security_integration_saml2Context ctx) {
    final var methodName = "enterCreate_security_integration_saml2";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_security_integration_scim(
      final SnowflakeParser.Create_security_integration_scimContext ctx) {
    final var methodName = "enterCreate_security_integration_scim";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_security_integration_snowflake_oauth(
      final SnowflakeParser.Create_security_integration_snowflake_oauthContext ctx) {
    final var methodName = "enterCreate_security_integration_snowflake_oauth";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_sequence(final SnowflakeParser.Create_sequenceContext ctx) {
    final var methodName = "enterCreate_sequence";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_session_policy(final SnowflakeParser.Create_session_policyContext ctx) {
    final var methodName = "enterCreate_session_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_share(final SnowflakeParser.Create_shareContext ctx) {
    final var methodName = "enterCreate_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_stage(final SnowflakeParser.Create_stageContext ctx) {
    final var methodName = "enterCreate_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_storage_integration(
      final SnowflakeParser.Create_storage_integrationContext ctx) {
    final var methodName = "enterCreate_storage_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_stream(final SnowflakeParser.Create_streamContext ctx) {
    final var methodName = "enterCreate_stream";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_table(final SnowflakeParser.Create_tableContext ctx) {
    final var methodName = "enterCreate_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_table_as_select(final SnowflakeParser.Create_table_as_selectContext ctx) {
    final var methodName = "enterCreate_table_as_select";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_table_clause(final SnowflakeParser.Create_table_clauseContext ctx) {
    final var methodName = "enterCreate_table_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_table_like(final SnowflakeParser.Create_table_likeContext ctx) {
    final var methodName = "enterCreate_table_like";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_tag(final SnowflakeParser.Create_tagContext ctx) {
    final var methodName = "enterCreate_tag";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_task(final SnowflakeParser.Create_taskContext ctx) {
    final var methodName = "enterCreate_task";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_user(final SnowflakeParser.Create_userContext ctx) {
    final var methodName = "enterCreate_user";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_view(final SnowflakeParser.Create_viewContext ctx) {
    final var methodName = "enterCreate_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_warehouse(final SnowflakeParser.Create_warehouseContext ctx) {
    final var methodName = "enterCreate_warehouse";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCredit_quota(final SnowflakeParser.Credit_quotaContext ctx) {
    final var methodName = "enterCredit_quota";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterData_type(final SnowflakeParser.Data_typeContext ctx) {
    final var methodName = "enterData_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterData_type_list(final SnowflakeParser.Data_type_listContext ctx) {
    final var methodName = "enterData_type_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterData_type_size(final SnowflakeParser.Data_type_sizeContext ctx) {
    final var methodName = "enterData_type_size";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatabase_property(final SnowflakeParser.Database_propertyContext ctx) {
    final var methodName = "enterDatabase_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDb_name_list(final SnowflakeParser.Db_name_listContext ctx) {
    final var methodName = "enterDb_name_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDdl_command(final SnowflakeParser.Ddl_commandContext ctx) {
    final var methodName = "enterDdl_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_append_only(final SnowflakeParser.Default_append_onlyContext ctx) {
    final var methodName = "enterDefault_append_only";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_ddl_collation(final SnowflakeParser.Default_ddl_collationContext ctx) {
    final var methodName = "enterDefault_ddl_collation";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_value(final SnowflakeParser.Default_valueContext ctx) {
    final var methodName = "enterDefault_value";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeferrable_not_deferrable(
      final SnowflakeParser.Deferrable_not_deferrableContext ctx) {
    final var methodName = "enterDeferrable_not_deferrable";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefine(final SnowflakeParser.DefineContext ctx) {
    final var methodName = "enterDefine";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDelete_statement(final SnowflakeParser.Delete_statementContext ctx) {
    final var methodName = "enterDelete_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe(final SnowflakeParser.DescribeContext ctx) {
    final var methodName = "enterDescribe";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_alert(final SnowflakeParser.Describe_alertContext ctx) {
    final var methodName = "enterDescribe_alert";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_command(final SnowflakeParser.Describe_commandContext ctx) {
    final var methodName = "enterDescribe_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_database(final SnowflakeParser.Describe_databaseContext ctx) {
    final var methodName = "enterDescribe_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_dynamic_table(final SnowflakeParser.Describe_dynamic_tableContext ctx) {
    final var methodName = "enterDescribe_dynamic_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_event_table(final SnowflakeParser.Describe_event_tableContext ctx) {
    final var methodName = "enterDescribe_event_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_external_table(
      final SnowflakeParser.Describe_external_tableContext ctx) {
    final var methodName = "enterDescribe_external_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_file_format(final SnowflakeParser.Describe_file_formatContext ctx) {
    final var methodName = "enterDescribe_file_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_function(final SnowflakeParser.Describe_functionContext ctx) {
    final var methodName = "enterDescribe_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_integration(final SnowflakeParser.Describe_integrationContext ctx) {
    final var methodName = "enterDescribe_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_masking_policy(
      final SnowflakeParser.Describe_masking_policyContext ctx) {
    final var methodName = "enterDescribe_masking_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_materialized_view(
      final SnowflakeParser.Describe_materialized_viewContext ctx) {
    final var methodName = "enterDescribe_materialized_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_network_policy(
      final SnowflakeParser.Describe_network_policyContext ctx) {
    final var methodName = "enterDescribe_network_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_password_policy(
      final SnowflakeParser.Describe_password_policyContext ctx) {
    final var methodName = "enterDescribe_password_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_pipe(final SnowflakeParser.Describe_pipeContext ctx) {
    final var methodName = "enterDescribe_pipe";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_procedure(final SnowflakeParser.Describe_procedureContext ctx) {
    final var methodName = "enterDescribe_procedure";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_result(final SnowflakeParser.Describe_resultContext ctx) {
    final var methodName = "enterDescribe_result";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_row_access_policy(
      final SnowflakeParser.Describe_row_access_policyContext ctx) {
    final var methodName = "enterDescribe_row_access_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_schema(final SnowflakeParser.Describe_schemaContext ctx) {
    final var methodName = "enterDescribe_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_search_optimization(
      final SnowflakeParser.Describe_search_optimizationContext ctx) {
    final var methodName = "enterDescribe_search_optimization";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_sequence(final SnowflakeParser.Describe_sequenceContext ctx) {
    final var methodName = "enterDescribe_sequence";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_session_policy(
      final SnowflakeParser.Describe_session_policyContext ctx) {
    final var methodName = "enterDescribe_session_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_share(final SnowflakeParser.Describe_shareContext ctx) {
    final var methodName = "enterDescribe_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_stage(final SnowflakeParser.Describe_stageContext ctx) {
    final var methodName = "enterDescribe_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_stream(final SnowflakeParser.Describe_streamContext ctx) {
    final var methodName = "enterDescribe_stream";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_table(final SnowflakeParser.Describe_tableContext ctx) {
    final var methodName = "enterDescribe_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_task(final SnowflakeParser.Describe_taskContext ctx) {
    final var methodName = "enterDescribe_task";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_transaction(final SnowflakeParser.Describe_transactionContext ctx) {
    final var methodName = "enterDescribe_transaction";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_user(final SnowflakeParser.Describe_userContext ctx) {
    final var methodName = "enterDescribe_user";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_view(final SnowflakeParser.Describe_viewContext ctx) {
    final var methodName = "enterDescribe_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribe_warehouse(final SnowflakeParser.Describe_warehouseContext ctx) {
    final var methodName = "enterDescribe_warehouse";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDirectory_table_external_params(
      final SnowflakeParser.Directory_table_external_paramsContext ctx) {
    final var methodName = "enterDirectory_table_external_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDirectory_table_internal_params(
      final SnowflakeParser.Directory_table_internal_paramsContext ctx) {
    final var methodName = "enterDirectory_table_internal_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDml_command(final SnowflakeParser.Dml_commandContext ctx) {
    final var methodName = "enterDml_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_alert(final SnowflakeParser.Drop_alertContext ctx) {
    final var methodName = "enterDrop_alert";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_command(final SnowflakeParser.Drop_commandContext ctx) {
    final var methodName = "enterDrop_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_connection(final SnowflakeParser.Drop_connectionContext ctx) {
    final var methodName = "enterDrop_connection";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_database(final SnowflakeParser.Drop_databaseContext ctx) {
    final var methodName = "enterDrop_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_dynamic_table(final SnowflakeParser.Drop_dynamic_tableContext ctx) {
    final var methodName = "enterDrop_dynamic_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_external_table(final SnowflakeParser.Drop_external_tableContext ctx) {
    final var methodName = "enterDrop_external_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_failover_group(final SnowflakeParser.Drop_failover_groupContext ctx) {
    final var methodName = "enterDrop_failover_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_file_format(final SnowflakeParser.Drop_file_formatContext ctx) {
    final var methodName = "enterDrop_file_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_function(final SnowflakeParser.Drop_functionContext ctx) {
    final var methodName = "enterDrop_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_integration(final SnowflakeParser.Drop_integrationContext ctx) {
    final var methodName = "enterDrop_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_managed_account(final SnowflakeParser.Drop_managed_accountContext ctx) {
    final var methodName = "enterDrop_managed_account";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_masking_policy(final SnowflakeParser.Drop_masking_policyContext ctx) {
    final var methodName = "enterDrop_masking_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_materialized_view(final SnowflakeParser.Drop_materialized_viewContext ctx) {
    final var methodName = "enterDrop_materialized_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_network_policy(final SnowflakeParser.Drop_network_policyContext ctx) {
    final var methodName = "enterDrop_network_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_object(final SnowflakeParser.Drop_objectContext ctx) {
    final var methodName = "enterDrop_object";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_password_policy(final SnowflakeParser.Drop_password_policyContext ctx) {
    final var methodName = "enterDrop_password_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_pipe(final SnowflakeParser.Drop_pipeContext ctx) {
    final var methodName = "enterDrop_pipe";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_procedure(final SnowflakeParser.Drop_procedureContext ctx) {
    final var methodName = "enterDrop_procedure";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_replication_group(final SnowflakeParser.Drop_replication_groupContext ctx) {
    final var methodName = "enterDrop_replication_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_resource_monitor(final SnowflakeParser.Drop_resource_monitorContext ctx) {
    final var methodName = "enterDrop_resource_monitor";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_role(final SnowflakeParser.Drop_roleContext ctx) {
    final var methodName = "enterDrop_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_row_access_policy(final SnowflakeParser.Drop_row_access_policyContext ctx) {
    final var methodName = "enterDrop_row_access_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_schema(final SnowflakeParser.Drop_schemaContext ctx) {
    final var methodName = "enterDrop_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_sequence(final SnowflakeParser.Drop_sequenceContext ctx) {
    final var methodName = "enterDrop_sequence";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_session_policy(final SnowflakeParser.Drop_session_policyContext ctx) {
    final var methodName = "enterDrop_session_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_share(final SnowflakeParser.Drop_shareContext ctx) {
    final var methodName = "enterDrop_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_stage(final SnowflakeParser.Drop_stageContext ctx) {
    final var methodName = "enterDrop_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_stream(final SnowflakeParser.Drop_streamContext ctx) {
    final var methodName = "enterDrop_stream";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_table(final SnowflakeParser.Drop_tableContext ctx) {
    final var methodName = "enterDrop_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_tag(final SnowflakeParser.Drop_tagContext ctx) {
    final var methodName = "enterDrop_tag";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_task(final SnowflakeParser.Drop_taskContext ctx) {
    final var methodName = "enterDrop_task";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_user(final SnowflakeParser.Drop_userContext ctx) {
    final var methodName = "enterDrop_user";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_view(final SnowflakeParser.Drop_viewContext ctx) {
    final var methodName = "enterDrop_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_warehouse(final SnowflakeParser.Drop_warehouseContext ctx) {
    final var methodName = "enterDrop_warehouse";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnable(final SnowflakeParser.EnableContext ctx) {
    final var methodName = "enterEnable";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnabled_true_false(final SnowflakeParser.Enabled_true_falseContext ctx) {
    final var methodName = "enterEnabled_true_false";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnd(final SnowflakeParser.EndContext ctx) {
    final var methodName = "enterEnd";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnforced_not_enforced(final SnowflakeParser.Enforced_not_enforcedContext ctx) {
    final var methodName = "enterEnforced_not_enforced";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    final var methodName = "enterEveryRule";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecuta_as(final SnowflakeParser.Executa_asContext ctx) {
    final var methodName = "enterExecuta_as";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecute_immediate(final SnowflakeParser.Execute_immediateContext ctx) {
    final var methodName = "enterExecute_immediate";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecute_task(final SnowflakeParser.Execute_taskContext ctx) {
    final var methodName = "enterExecute_task";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplain(final SnowflakeParser.ExplainContext ctx) {
    final var methodName = "enterExplain";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr(final SnowflakeParser.ExprContext ctx) {
    final var methodName = "enterExpr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr_alias_list(final SnowflakeParser.Expr_alias_listContext ctx) {
    final var methodName = "enterExpr_alias_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr_list(final SnowflakeParser.Expr_listContext ctx) {
    final var methodName = "enterExpr_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr_list_in_parentheses(
      final SnowflakeParser.Expr_list_in_parenthesesContext ctx) {
    final var methodName = "enterExpr_list_in_parentheses";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpr_list_sorted(final SnowflakeParser.Expr_list_sortedContext ctx) {
    final var methodName = "enterExpr_list_sorted";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpression_elem(final SnowflakeParser.Expression_elemContext ctx) {
    final var methodName = "enterExpression_elem";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExt_table_column_action(
      final SnowflakeParser.Ext_table_column_actionContext ctx) {
    final var methodName = "enterExt_table_column_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExternal_location(final SnowflakeParser.External_locationContext ctx) {
    final var methodName = "enterExternal_location";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExternal_stage_params(final SnowflakeParser.External_stage_paramsContext ctx) {
    final var methodName = "enterExternal_stage_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExternal_table_column_decl(
      final SnowflakeParser.External_table_column_declContext ctx) {
    final var methodName = "enterExternal_table_column_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExternal_table_column_decl_list(
      final SnowflakeParser.External_table_column_decl_listContext ctx) {
    final var methodName = "enterExternal_table_column_decl_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFile_format(final SnowflakeParser.File_formatContext ctx) {
    final var methodName = "enterFile_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFiles(final SnowflakeParser.FilesContext ctx) {
    final var methodName = "enterFiles";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFirst_last(final SnowflakeParser.First_lastContext ctx) {
    final var methodName = "enterFirst_last";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFirst_next(final SnowflakeParser.First_nextContext ctx) {
    final var methodName = "enterFirst_next";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlatten_table(final SnowflakeParser.Flatten_tableContext ctx) {
    final var methodName = "enterFlatten_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlatten_table_option(final SnowflakeParser.Flatten_table_optionContext ctx) {
    final var methodName = "enterFlatten_table_option";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForeign_key(final SnowflakeParser.Foreign_keyContext ctx) {
    final var methodName = "enterForeign_key";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForeign_key_match(final SnowflakeParser.Foreign_key_matchContext ctx) {
    final var methodName = "enterForeign_key_match";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFormat_name(final SnowflakeParser.Format_nameContext ctx) {
    final var methodName = "enterFormat_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFormat_type(final SnowflakeParser.Format_typeContext ctx) {
    final var methodName = "enterFormat_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFormat_type_options(final SnowflakeParser.Format_type_optionsContext ctx) {
    final var methodName = "enterFormat_type_options";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrequency(final SnowflakeParser.FrequencyContext ctx) {
    final var methodName = "enterFrequency";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrom_clause(final SnowflakeParser.From_clauseContext ctx) {
    final var methodName = "enterFrom_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFull_acct(final SnowflakeParser.Full_acctContext ctx) {
    final var methodName = "enterFull_acct";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFull_acct_list(final SnowflakeParser.Full_acct_listContext ctx) {
    final var methodName = "enterFull_acct_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFull_col_decl(final SnowflakeParser.Full_col_declContext ctx) {
    final var methodName = "enterFull_col_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFull_column_name(final SnowflakeParser.Full_column_nameContext ctx) {
    final var methodName = "enterFull_column_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_call(final SnowflakeParser.Function_callContext ctx) {
    final var methodName = "enterFunction_call";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_definition(final SnowflakeParser.Function_definitionContext ctx) {
    final var methodName = "enterFunction_definition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_signature(final SnowflakeParser.Function_signatureContext ctx) {
    final var methodName = "enterFunction_signature";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGcp_encryption_value(final SnowflakeParser.Gcp_encryption_valueContext ctx) {
    final var methodName = "enterGcp_encryption_value";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGet_dml(final SnowflakeParser.Get_dmlContext ctx) {
    final var methodName = "enterGet_dml";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGlobal_privilege(final SnowflakeParser.Global_privilegeContext ctx) {
    final var methodName = "enterGlobal_privilege";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGlobal_privileges(final SnowflakeParser.Global_privilegesContext ctx) {
    final var methodName = "enterGlobal_privileges";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrant_ownership(final SnowflakeParser.Grant_ownershipContext ctx) {
    final var methodName = "enterGrant_ownership";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrant_role(final SnowflakeParser.Grant_roleContext ctx) {
    final var methodName = "enterGrant_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrant_to_role(final SnowflakeParser.Grant_to_roleContext ctx) {
    final var methodName = "enterGrant_to_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrant_to_share(final SnowflakeParser.Grant_to_shareContext ctx) {
    final var methodName = "enterGrant_to_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroup_by_clause(final SnowflakeParser.Group_by_clauseContext ctx) {
    final var methodName = "enterGroup_by_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroup_by_elem(final SnowflakeParser.Group_by_elemContext ctx) {
    final var methodName = "enterGroup_by_elem";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroup_by_list(final SnowflakeParser.Group_by_listContext ctx) {
    final var methodName = "enterGroup_by_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHaving_clause(final SnowflakeParser.Having_clauseContext ctx) {
    final var methodName = "enterHaving_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHeader_decl(final SnowflakeParser.Header_declContext ctx) {
    final var methodName = "enterHeader_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterId_(final SnowflakeParser.Id_Context ctx) {
    final var methodName = "enterId_";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterId_fn(final SnowflakeParser.Id_fnContext ctx) {
    final var methodName = "enterId_fn";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIf_exists(final SnowflakeParser.If_existsContext ctx) {
    final var methodName = "enterIf_exists";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIf_not_exists(final SnowflakeParser.If_not_existsContext ctx) {
    final var methodName = "enterIf_not_exists";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIf_suspended(final SnowflakeParser.If_suspendedContext ctx) {
    final var methodName = "enterIf_suspended";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIff_expr(final SnowflakeParser.Iff_exprContext ctx) {
    final var methodName = "enterIff_expr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIgnore_edition_check(final SnowflakeParser.Ignore_edition_checkContext ctx) {
    final var methodName = "enterIgnore_edition_check";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIgnore_or_repect_nulls(final SnowflakeParser.Ignore_or_repect_nullsContext ctx) {
    final var methodName = "enterIgnore_or_repect_nulls";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImplicit_none(final SnowflakeParser.Implicit_noneContext ctx) {
    final var methodName = "enterImplicit_none";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIn_for(final SnowflakeParser.In_forContext ctx) {
    final var methodName = "enterIn_for";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIn_obj(final SnowflakeParser.In_objContext ctx) {
    final var methodName = "enterIn_obj";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIn_obj_2(final SnowflakeParser.In_obj_2Context ctx) {
    final var methodName = "enterIn_obj_2";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIncrement_by(final SnowflakeParser.Increment_byContext ctx) {
    final var methodName = "enterIncrement_by";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInitially_deferred_or_immediate(
      final SnowflakeParser.Initially_deferred_or_immediateContext ctx) {
    final var methodName = "enterInitially_deferred_or_immediate";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInline_constraint(final SnowflakeParser.Inline_constraintContext ctx) {
    final var methodName = "enterInline_constraint";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsert_multi_table_statement(
      final SnowflakeParser.Insert_multi_table_statementContext ctx) {
    final var methodName = "enterInsert_multi_table_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsert_only(final SnowflakeParser.Insert_onlyContext ctx) {
    final var methodName = "enterInsert_only";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsert_statement(final SnowflakeParser.Insert_statementContext ctx) {
    final var methodName = "enterInsert_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntegration_type_name(final SnowflakeParser.Integration_type_nameContext ctx) {
    final var methodName = "enterIntegration_type_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInto_clause(final SnowflakeParser.Into_clauseContext ctx) {
    final var methodName = "enterInto_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInto_clause2(final SnowflakeParser.Into_clause2Context ctx) {
    final var methodName = "enterInto_clause2";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_clause(final SnowflakeParser.Join_clauseContext ctx) {
    final var methodName = "enterJoin_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_type(final SnowflakeParser.Join_typeContext ctx) {
    final var methodName = "enterJoin_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_literal(final SnowflakeParser.Json_literalContext ctx) {
    final var methodName = "enterJson_literal";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKeyword(final SnowflakeParser.KeywordContext ctx) {
    final var methodName = "enterKeyword";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKv_pair(final SnowflakeParser.Kv_pairContext ctx) {
    final var methodName = "enterKv_pair";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLike_pattern(final SnowflakeParser.Like_patternContext ctx) {
    final var methodName = "enterLike_pattern";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLimit_clause(final SnowflakeParser.Limit_clauseContext ctx) {
    final var methodName = "enterLimit_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLimit_rows(final SnowflakeParser.Limit_rowsContext ctx) {
    final var methodName = "enterLimit_rows";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterList(final SnowflakeParser.ListContext ctx) {
    final var methodName = "enterList";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterList_function(final SnowflakeParser.List_functionContext ctx) {
    final var methodName = "enterList_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLiteral(final SnowflakeParser.LiteralContext ctx) {
    final var methodName = "enterLiteral";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMatch_opts(final SnowflakeParser.Match_optsContext ctx) {
    final var methodName = "enterMatch_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMatch_recognize(final SnowflakeParser.Match_recognizeContext ctx) {
    final var methodName = "enterMatch_recognize";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMeasures(final SnowflakeParser.MeasuresContext ctx) {
    final var methodName = "enterMeasures";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_cond(final SnowflakeParser.Merge_condContext ctx) {
    final var methodName = "enterMerge_cond";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_insert(final SnowflakeParser.Merge_insertContext ctx) {
    final var methodName = "enterMerge_insert";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_matches(final SnowflakeParser.Merge_matchesContext ctx) {
    final var methodName = "enterMerge_matches";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_statement(final SnowflakeParser.Merge_statementContext ctx) {
    final var methodName = "enterMerge_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_update_delete(final SnowflakeParser.Merge_update_deleteContext ctx) {
    final var methodName = "enterMerge_update_delete";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNamed_stage(final SnowflakeParser.Named_stageContext ctx) {
    final var methodName = "enterNamed_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNetwork_policy(final SnowflakeParser.Network_policyContext ctx) {
    final var methodName = "enterNetwork_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNon_reserved_words(final SnowflakeParser.Non_reserved_wordsContext ctx) {
    final var methodName = "enterNon_reserved_words";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNot_null(final SnowflakeParser.Not_nullContext ctx) {
    final var methodName = "enterNot_null";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNotification_integration(
      final SnowflakeParser.Notification_integrationContext ctx) {
    final var methodName = "enterNotification_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNotify_users(final SnowflakeParser.Notify_usersContext ctx) {
    final var methodName = "enterNotify_users";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNull_not_null(final SnowflakeParser.Null_not_nullContext ctx) {
    final var methodName = "enterNull_not_null";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNum(final SnowflakeParser.NumContext ctx) {
    final var methodName = "enterNum";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_name(final SnowflakeParser.Object_nameContext ctx) {
    final var methodName = "enterObject_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_name_or_alias(final SnowflakeParser.Object_name_or_aliasContext ctx) {
    final var methodName = "enterObject_name_or_alias";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_name_or_identifier(
      final SnowflakeParser.Object_name_or_identifierContext ctx) {
    final var methodName = "enterObject_name_or_identifier";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_params(final SnowflakeParser.Object_paramsContext ctx) {
    final var methodName = "enterObject_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_privilege(final SnowflakeParser.Object_privilegeContext ctx) {
    final var methodName = "enterObject_privilege";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_properties(final SnowflakeParser.Object_propertiesContext ctx) {
    final var methodName = "enterObject_properties";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_ref(final SnowflakeParser.Object_refContext ctx) {
    final var methodName = "enterObject_ref";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_type(final SnowflakeParser.Object_typeContext ctx) {
    final var methodName = "enterObject_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_type_list(final SnowflakeParser.Object_type_listContext ctx) {
    final var methodName = "enterObject_type_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_type_name(final SnowflakeParser.Object_type_nameContext ctx) {
    final var methodName = "enterObject_type_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_type_plural(final SnowflakeParser.Object_type_pluralContext ctx) {
    final var methodName = "enterObject_type_plural";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_action(final SnowflakeParser.On_actionContext ctx) {
    final var methodName = "enterOn_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_delete(final SnowflakeParser.On_deleteContext ctx) {
    final var methodName = "enterOn_delete";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_update(final SnowflakeParser.On_updateContext ctx) {
    final var methodName = "enterOn_update";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOr_replace(final SnowflakeParser.Or_replaceContext ctx) {
    final var methodName = "enterOr_replace";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_by_clause(final SnowflakeParser.Order_by_clauseContext ctx) {
    final var methodName = "enterOrder_by_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_by_expr(final SnowflakeParser.Order_by_exprContext ctx) {
    final var methodName = "enterOrder_by_expr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_item(final SnowflakeParser.Order_itemContext ctx) {
    final var methodName = "enterOrder_item";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_noorder(final SnowflakeParser.Order_noorderContext ctx) {
    final var methodName = "enterOrder_noorder";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOther_command(final SnowflakeParser.Other_commandContext ctx) {
    final var methodName = "enterOther_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOut_of_line_constraint(final SnowflakeParser.Out_of_line_constraintContext ctx) {
    final var methodName = "enterOut_of_line_constraint";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOuter_join(final SnowflakeParser.Outer_joinContext ctx) {
    final var methodName = "enterOuter_join";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOver_clause(final SnowflakeParser.Over_clauseContext ctx) {
    final var methodName = "enterOver_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParallel(final SnowflakeParser.ParallelContext ctx) {
    final var methodName = "enterParallel";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParam_assoc(final SnowflakeParser.Param_assocContext ctx) {
    final var methodName = "enterParam_assoc";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParam_assoc_list(final SnowflakeParser.Param_assoc_listContext ctx) {
    final var methodName = "enterParam_assoc_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParam_name(final SnowflakeParser.Param_nameContext ctx) {
    final var methodName = "enterParam_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_by(final SnowflakeParser.Partition_byContext ctx) {
    final var methodName = "enterPartition_by";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartner_application(final SnowflakeParser.Partner_applicationContext ctx) {
    final var methodName = "enterPartner_application";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPassword_policy_param_name(
      final SnowflakeParser.Password_policy_param_nameContext ctx) {
    final var methodName = "enterPassword_policy_param_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPassword_policy_params(final SnowflakeParser.Password_policy_paramsContext ctx) {
    final var methodName = "enterPassword_policy_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPattern(final SnowflakeParser.PatternContext ctx) {
    final var methodName = "enterPattern";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPivot_unpivot(final SnowflakeParser.Pivot_unpivotContext ctx) {
    final var methodName = "enterPivot_unpivot";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPredicate(final SnowflakeParser.PredicateContext ctx) {
    final var methodName = "enterPredicate";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimary_key(final SnowflakeParser.Primary_keyContext ctx) {
    final var methodName = "enterPrimary_key";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimitive_expression(final SnowflakeParser.Primitive_expressionContext ctx) {
    final var methodName = "enterPrimitive_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrior_item(final SnowflakeParser.Prior_itemContext ctx) {
    final var methodName = "enterPrior_item";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrior_list(final SnowflakeParser.Prior_listContext ctx) {
    final var methodName = "enterPrior_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProcedure_definition(final SnowflakeParser.Procedure_definitionContext ctx) {
    final var methodName = "enterProcedure_definition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPut(final SnowflakeParser.PutContext ctx) {
    final var methodName = "enterPut";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQualify_clause(final SnowflakeParser.Qualify_clauseContext ctx) {
    final var methodName = "enterQualify_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuery_statement(final SnowflakeParser.Query_statementContext ctx) {
    final var methodName = "enterQuery_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRanking_windowed_function(
      final SnowflakeParser.Ranking_windowed_functionContext ctx) {
    final var methodName = "enterRanking_windowed_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRefresh_on_create(final SnowflakeParser.Refresh_on_createContext ctx) {
    final var methodName = "enterRefresh_on_create";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRegion_group_id(final SnowflakeParser.Region_group_idContext ctx) {
    final var methodName = "enterRegion_group_id";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRemove(final SnowflakeParser.RemoveContext ctx) {
    final var methodName = "enterRemove";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRepeatable_seed(final SnowflakeParser.Repeatable_seedContext ctx) {
    final var methodName = "enterRepeatable_seed";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplication_schedule(final SnowflakeParser.Replication_scheduleContext ctx) {
    final var methodName = "enterReplication_schedule";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResume_suspend(final SnowflakeParser.Resume_suspendContext ctx) {
    final var methodName = "enterResume_suspend";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevoke_from_role(final SnowflakeParser.Revoke_from_roleContext ctx) {
    final var methodName = "enterRevoke_from_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevoke_from_share(final SnowflakeParser.Revoke_from_shareContext ctx) {
    final var methodName = "enterRevoke_from_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevoke_role(final SnowflakeParser.Revoke_roleContext ctx) {
    final var methodName = "enterRevoke_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRole_name(final SnowflakeParser.Role_nameContext ctx) {
    final var methodName = "enterRole_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollback(final SnowflakeParser.RollbackContext ctx) {
    final var methodName = "enterRollback";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRound_expr(final SnowflakeParser.Round_exprContext ctx) {
    final var methodName = "enterRound_expr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRound_mode(final SnowflakeParser.Round_modeContext ctx) {
    final var methodName = "enterRound_mode";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRow_match(final SnowflakeParser.Row_matchContext ctx) {
    final var methodName = "enterRow_match";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRow_rows(final SnowflakeParser.Row_rowsContext ctx) {
    final var methodName = "enterRow_rows";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSample(final SnowflakeParser.SampleContext ctx) {
    final var methodName = "enterSample";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSample_method(final SnowflakeParser.Sample_methodContext ctx) {
    final var methodName = "enterSample_method";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSample_opts(final SnowflakeParser.Sample_optsContext ctx) {
    final var methodName = "enterSample_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSchema_name(final SnowflakeParser.Schema_nameContext ctx) {
    final var methodName = "enterSchema_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSchema_object_privilege(
      final SnowflakeParser.Schema_object_privilegeContext ctx) {
    final var methodName = "enterSchema_object_privilege";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSchema_object_privileges(
      final SnowflakeParser.Schema_object_privilegesContext ctx) {
    final var methodName = "enterSchema_object_privileges";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSchema_privilege(final SnowflakeParser.Schema_privilegeContext ctx) {
    final var methodName = "enterSchema_privilege";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSchema_privileges(final SnowflakeParser.Schema_privilegesContext ctx) {
    final var methodName = "enterSchema_privileges";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSchema_property(final SnowflakeParser.Schema_propertyContext ctx) {
    final var methodName = "enterSchema_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSearch_condition(final SnowflakeParser.Search_conditionContext ctx) {
    final var methodName = "enterSearch_condition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSearch_method_with_target(
      final SnowflakeParser.Search_method_with_targetContext ctx) {
    final var methodName = "enterSearch_method_with_target";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSearch_optimization_action(
      final SnowflakeParser.Search_optimization_actionContext ctx) {
    final var methodName = "enterSearch_optimization_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSecurity_integration_external_oauth_property(
      final SnowflakeParser.Security_integration_external_oauth_propertyContext ctx) {
    final var methodName = "enterSecurity_integration_external_oauth_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSecurity_integration_scim_property(
      final SnowflakeParser.Security_integration_scim_propertyContext ctx) {
    final var methodName = "enterSecurity_integration_scim_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSecurity_integration_snowflake_oauth_property(
      final SnowflakeParser.Security_integration_snowflake_oauth_propertyContext ctx) {
    final var methodName = "enterSecurity_integration_snowflake_oauth_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_clause(final SnowflakeParser.Select_clauseContext ctx) {
    final var methodName = "enterSelect_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_list(final SnowflakeParser.Select_listContext ctx) {
    final var methodName = "enterSelect_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_list_elem(final SnowflakeParser.Select_list_elemContext ctx) {
    final var methodName = "enterSelect_list_elem";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_list_no_top(final SnowflakeParser.Select_list_no_topContext ctx) {
    final var methodName = "enterSelect_list_no_top";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_list_top(final SnowflakeParser.Select_list_topContext ctx) {
    final var methodName = "enterSelect_list_top";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_optional_clauses(
      final SnowflakeParser.Select_optional_clausesContext ctx) {
    final var methodName = "enterSelect_optional_clauses";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_statement(final SnowflakeParser.Select_statementContext ctx) {
    final var methodName = "enterSelect_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_top_clause(final SnowflakeParser.Select_top_clauseContext ctx) {
    final var methodName = "enterSelect_top_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSession_parameter(final SnowflakeParser.Session_parameterContext ctx) {
    final var methodName = "enterSession_parameter";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSession_parameter_list(final SnowflakeParser.Session_parameter_listContext ctx) {
    final var methodName = "enterSession_parameter_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSession_params(final SnowflakeParser.Session_paramsContext ctx) {
    final var methodName = "enterSession_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSession_params_list(final SnowflakeParser.Session_params_listContext ctx) {
    final var methodName = "enterSession_params_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSession_policy_param_name(
      final SnowflakeParser.Session_policy_param_nameContext ctx) {
    final var methodName = "enterSession_policy_param_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSession_policy_params(final SnowflakeParser.Session_policy_paramsContext ctx) {
    final var methodName = "enterSession_policy_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet(final SnowflakeParser.SetContext ctx) {
    final var methodName = "enterSet";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_operators(final SnowflakeParser.Set_operatorsContext ctx) {
    final var methodName = "enterSet_operators";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_tags(final SnowflakeParser.Set_tagsContext ctx) {
    final var methodName = "enterSet_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShare_name_list(final SnowflakeParser.Share_name_listContext ctx) {
    final var methodName = "enterShare_name_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_alerts(final SnowflakeParser.Show_alertsContext ctx) {
    final var methodName = "enterShow_alerts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_channels(final SnowflakeParser.Show_channelsContext ctx) {
    final var methodName = "enterShow_channels";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_columns(final SnowflakeParser.Show_columnsContext ctx) {
    final var methodName = "enterShow_columns";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_command(final SnowflakeParser.Show_commandContext ctx) {
    final var methodName = "enterShow_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_connections(final SnowflakeParser.Show_connectionsContext ctx) {
    final var methodName = "enterShow_connections";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_databases(final SnowflakeParser.Show_databasesContext ctx) {
    final var methodName = "enterShow_databases";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_databases_in_failover_group(
      final SnowflakeParser.Show_databases_in_failover_groupContext ctx) {
    final var methodName = "enterShow_databases_in_failover_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_databases_in_replication_group(
      final SnowflakeParser.Show_databases_in_replication_groupContext ctx) {
    final var methodName = "enterShow_databases_in_replication_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_delegated_authorizations(
      final SnowflakeParser.Show_delegated_authorizationsContext ctx) {
    final var methodName = "enterShow_delegated_authorizations";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_dynamic_tables(final SnowflakeParser.Show_dynamic_tablesContext ctx) {
    final var methodName = "enterShow_dynamic_tables";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_event_tables(final SnowflakeParser.Show_event_tablesContext ctx) {
    final var methodName = "enterShow_event_tables";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_external_functions(
      final SnowflakeParser.Show_external_functionsContext ctx) {
    final var methodName = "enterShow_external_functions";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_external_tables(final SnowflakeParser.Show_external_tablesContext ctx) {
    final var methodName = "enterShow_external_tables";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_failover_groups(final SnowflakeParser.Show_failover_groupsContext ctx) {
    final var methodName = "enterShow_failover_groups";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_file_formats(final SnowflakeParser.Show_file_formatsContext ctx) {
    final var methodName = "enterShow_file_formats";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_functions(final SnowflakeParser.Show_functionsContext ctx) {
    final var methodName = "enterShow_functions";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_global_accounts(final SnowflakeParser.Show_global_accountsContext ctx) {
    final var methodName = "enterShow_global_accounts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_grants(final SnowflakeParser.Show_grantsContext ctx) {
    final var methodName = "enterShow_grants";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_grants_opts(final SnowflakeParser.Show_grants_optsContext ctx) {
    final var methodName = "enterShow_grants_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_initial_rows(final SnowflakeParser.Show_initial_rowsContext ctx) {
    final var methodName = "enterShow_initial_rows";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_integrations(final SnowflakeParser.Show_integrationsContext ctx) {
    final var methodName = "enterShow_integrations";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_locks(final SnowflakeParser.Show_locksContext ctx) {
    final var methodName = "enterShow_locks";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_managed_accounts(final SnowflakeParser.Show_managed_accountsContext ctx) {
    final var methodName = "enterShow_managed_accounts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_masking_policies(final SnowflakeParser.Show_masking_policiesContext ctx) {
    final var methodName = "enterShow_masking_policies";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_materialized_views(
      final SnowflakeParser.Show_materialized_viewsContext ctx) {
    final var methodName = "enterShow_materialized_views";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_network_policies(final SnowflakeParser.Show_network_policiesContext ctx) {
    final var methodName = "enterShow_network_policies";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_objects(final SnowflakeParser.Show_objectsContext ctx) {
    final var methodName = "enterShow_objects";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_organization_accounts(
      final SnowflakeParser.Show_organization_accountsContext ctx) {
    final var methodName = "enterShow_organization_accounts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_parameters(final SnowflakeParser.Show_parametersContext ctx) {
    final var methodName = "enterShow_parameters";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_password_policies(final SnowflakeParser.Show_password_policiesContext ctx) {
    final var methodName = "enterShow_password_policies";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_pipes(final SnowflakeParser.Show_pipesContext ctx) {
    final var methodName = "enterShow_pipes";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_primary_keys(final SnowflakeParser.Show_primary_keysContext ctx) {
    final var methodName = "enterShow_primary_keys";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_procedures(final SnowflakeParser.Show_proceduresContext ctx) {
    final var methodName = "enterShow_procedures";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_regions(final SnowflakeParser.Show_regionsContext ctx) {
    final var methodName = "enterShow_regions";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_replication_accounts(
      final SnowflakeParser.Show_replication_accountsContext ctx) {
    final var methodName = "enterShow_replication_accounts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_replication_databases(
      final SnowflakeParser.Show_replication_databasesContext ctx) {
    final var methodName = "enterShow_replication_databases";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_replication_groups(
      final SnowflakeParser.Show_replication_groupsContext ctx) {
    final var methodName = "enterShow_replication_groups";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_resource_monitors(final SnowflakeParser.Show_resource_monitorsContext ctx) {
    final var methodName = "enterShow_resource_monitors";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_roles(final SnowflakeParser.Show_rolesContext ctx) {
    final var methodName = "enterShow_roles";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_row_access_policies(
      final SnowflakeParser.Show_row_access_policiesContext ctx) {
    final var methodName = "enterShow_row_access_policies";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_schemas(final SnowflakeParser.Show_schemasContext ctx) {
    final var methodName = "enterShow_schemas";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_sequences(final SnowflakeParser.Show_sequencesContext ctx) {
    final var methodName = "enterShow_sequences";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_session_policies(final SnowflakeParser.Show_session_policiesContext ctx) {
    final var methodName = "enterShow_session_policies";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_shares(final SnowflakeParser.Show_sharesContext ctx) {
    final var methodName = "enterShow_shares";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_shares_in_failover_group(
      final SnowflakeParser.Show_shares_in_failover_groupContext ctx) {
    final var methodName = "enterShow_shares_in_failover_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_shares_in_replication_group(
      final SnowflakeParser.Show_shares_in_replication_groupContext ctx) {
    final var methodName = "enterShow_shares_in_replication_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_stages(final SnowflakeParser.Show_stagesContext ctx) {
    final var methodName = "enterShow_stages";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_streams(final SnowflakeParser.Show_streamsContext ctx) {
    final var methodName = "enterShow_streams";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_tables(final SnowflakeParser.Show_tablesContext ctx) {
    final var methodName = "enterShow_tables";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_tags(final SnowflakeParser.Show_tagsContext ctx) {
    final var methodName = "enterShow_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_tasks(final SnowflakeParser.Show_tasksContext ctx) {
    final var methodName = "enterShow_tasks";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_transactions(final SnowflakeParser.Show_transactionsContext ctx) {
    final var methodName = "enterShow_transactions";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_user_functions(final SnowflakeParser.Show_user_functionsContext ctx) {
    final var methodName = "enterShow_user_functions";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_users(final SnowflakeParser.Show_usersContext ctx) {
    final var methodName = "enterShow_users";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_variables(final SnowflakeParser.Show_variablesContext ctx) {
    final var methodName = "enterShow_variables";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_views(final SnowflakeParser.Show_viewsContext ctx) {
    final var methodName = "enterShow_views";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShow_warehouses(final SnowflakeParser.Show_warehousesContext ctx) {
    final var methodName = "enterShow_warehouses";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSign(final SnowflakeParser.SignContext ctx) {
    final var methodName = "enterSign";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSnowflake_file(final SnowflakeParser.Snowflake_fileContext ctx) {
    final var methodName = "enterSnowflake_file";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSnowflake_region_id(final SnowflakeParser.Snowflake_region_idContext ctx) {
    final var methodName = "enterSnowflake_region_id";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSplited_table(final SnowflakeParser.Splited_tableContext ctx) {
    final var methodName = "enterSplited_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql(final SnowflakeParser.SqlContext ctx) {
    final var methodName = "enterSql";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_command(final SnowflakeParser.Sql_commandContext ctx) {
    final var methodName = "enterSql_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStage_encryption_opts_aws(
      final SnowflakeParser.Stage_encryption_opts_awsContext ctx) {
    final var methodName = "enterStage_encryption_opts_aws";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStage_encryption_opts_az(
      final SnowflakeParser.Stage_encryption_opts_azContext ctx) {
    final var methodName = "enterStage_encryption_opts_az";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStage_encryption_opts_gcp(
      final SnowflakeParser.Stage_encryption_opts_gcpContext ctx) {
    final var methodName = "enterStage_encryption_opts_gcp";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStage_encryption_opts_internal(
      final SnowflakeParser.Stage_encryption_opts_internalContext ctx) {
    final var methodName = "enterStage_encryption_opts_internal";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStage_file_format(final SnowflakeParser.Stage_file_formatContext ctx) {
    final var methodName = "enterStage_file_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStage_kms_key(final SnowflakeParser.Stage_kms_keyContext ctx) {
    final var methodName = "enterStage_kms_key";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStage_master_key(final SnowflakeParser.Stage_master_keyContext ctx) {
    final var methodName = "enterStage_master_key";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStage_path(final SnowflakeParser.Stage_pathContext ctx) {
    final var methodName = "enterStage_path";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStage_type(final SnowflakeParser.Stage_typeContext ctx) {
    final var methodName = "enterStage_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStart_with(final SnowflakeParser.Start_withContext ctx) {
    final var methodName = "enterStart_with";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStarts_with(final SnowflakeParser.Starts_withContext ctx) {
    final var methodName = "enterStarts_with";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStorage_integration_eq_id(
      final SnowflakeParser.Storage_integration_eq_idContext ctx) {
    final var methodName = "enterStorage_integration_eq_id";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStream_time(final SnowflakeParser.Stream_timeContext ctx) {
    final var methodName = "enterStream_time";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterString(final SnowflakeParser.StringContext ctx) {
    final var methodName = "enterString";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterString_list(final SnowflakeParser.String_listContext ctx) {
    final var methodName = "enterString_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubquery(final SnowflakeParser.SubqueryContext ctx) {
    final var methodName = "enterSubquery";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSwitch_search_condition_section(
      final SnowflakeParser.Switch_search_condition_sectionContext ctx) {
    final var methodName = "enterSwitch_search_condition_section";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSwitch_section(final SnowflakeParser.Switch_sectionContext ctx) {
    final var methodName = "enterSwitch_section";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSymbol(final SnowflakeParser.SymbolContext ctx) {
    final var methodName = "enterSymbol";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSymbol_list(final SnowflakeParser.Symbol_listContext ctx) {
    final var methodName = "enterSymbol_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSystem_defined_role(final SnowflakeParser.System_defined_roleContext ctx) {
    final var methodName = "enterSystem_defined_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_column_action(final SnowflakeParser.Table_column_actionContext ctx) {
    final var methodName = "enterTable_column_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_or_query(final SnowflakeParser.Table_or_queryContext ctx) {
    final var methodName = "enterTable_or_query";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_source(final SnowflakeParser.Table_sourceContext ctx) {
    final var methodName = "enterTable_source";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_source_item_joined(
      final SnowflakeParser.Table_source_item_joinedContext ctx) {
    final var methodName = "enterTable_source_item_joined";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_sources(final SnowflakeParser.Table_sourcesContext ctx) {
    final var methodName = "enterTable_sources";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_stage(final SnowflakeParser.Table_stageContext ctx) {
    final var methodName = "enterTable_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_type(final SnowflakeParser.Table_typeContext ctx) {
    final var methodName = "enterTable_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTag_allowed_values(final SnowflakeParser.Tag_allowed_valuesContext ctx) {
    final var methodName = "enterTag_allowed_values";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTag_decl(final SnowflakeParser.Tag_declContext ctx) {
    final var methodName = "enterTag_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTag_decl_list(final SnowflakeParser.Tag_decl_listContext ctx) {
    final var methodName = "enterTag_decl_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTag_value(final SnowflakeParser.Tag_valueContext ctx) {
    final var methodName = "enterTag_value";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTask_compute(final SnowflakeParser.Task_computeContext ctx) {
    final var methodName = "enterTask_compute";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTask_error_integration(final SnowflakeParser.Task_error_integrationContext ctx) {
    final var methodName = "enterTask_error_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTask_overlap(final SnowflakeParser.Task_overlapContext ctx) {
    final var methodName = "enterTask_overlap";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTask_parameters(final SnowflakeParser.Task_parametersContext ctx) {
    final var methodName = "enterTask_parameters";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTask_schedule(final SnowflakeParser.Task_scheduleContext ctx) {
    final var methodName = "enterTask_schedule";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTask_suspend_after_failure_number(
      final SnowflakeParser.Task_suspend_after_failure_numberContext ctx) {
    final var methodName = "enterTask_suspend_after_failure_number";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTask_timeout(final SnowflakeParser.Task_timeoutContext ctx) {
    final var methodName = "enterTask_timeout";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTemporary(final SnowflakeParser.TemporaryContext ctx) {
    final var methodName = "enterTemporary";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTernary_builtin_function(
      final SnowflakeParser.Ternary_builtin_functionContext ctx) {
    final var methodName = "enterTernary_builtin_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTop_clause(final SnowflakeParser.Top_clauseContext ctx) {
    final var methodName = "enterTop_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrigger_definition(final SnowflakeParser.Trigger_definitionContext ctx) {
    final var methodName = "enterTrigger_definition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerDefinition(final SnowflakeParser.TriggerDefinitionContext ctx) {
    final var methodName = "enterTriggerDefinition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrim_expression(final SnowflakeParser.Trim_expressionContext ctx) {
    final var methodName = "enterTrim_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrue_false(final SnowflakeParser.True_falseContext ctx) {
    final var methodName = "enterTrue_false";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTruncate_materialized_view(
      final SnowflakeParser.Truncate_materialized_viewContext ctx) {
    final var methodName = "enterTruncate_materialized_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTruncate_table(final SnowflakeParser.Truncate_tableContext ctx) {
    final var methodName = "enterTruncate_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTry_cast_expr(final SnowflakeParser.Try_cast_exprContext ctx) {
    final var methodName = "enterTry_cast_expr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_fileformat(final SnowflakeParser.Type_fileformatContext ctx) {
    final var methodName = "enterType_fileformat";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnary_or_binary_builtin_function(
      final SnowflakeParser.Unary_or_binary_builtin_functionContext ctx) {
    final var methodName = "enterUnary_or_binary_builtin_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUndrop_command(final SnowflakeParser.Undrop_commandContext ctx) {
    final var methodName = "enterUndrop_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUndrop_database(final SnowflakeParser.Undrop_databaseContext ctx) {
    final var methodName = "enterUndrop_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUndrop_schema(final SnowflakeParser.Undrop_schemaContext ctx) {
    final var methodName = "enterUndrop_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUndrop_table(final SnowflakeParser.Undrop_tableContext ctx) {
    final var methodName = "enterUndrop_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUndrop_tag(final SnowflakeParser.Undrop_tagContext ctx) {
    final var methodName = "enterUndrop_tag";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnset(final SnowflakeParser.UnsetContext ctx) {
    final var methodName = "enterUnset";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnset_tags(final SnowflakeParser.Unset_tagsContext ctx) {
    final var methodName = "enterUnset_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_statement(final SnowflakeParser.Update_statementContext ctx) {
    final var methodName = "enterUpdate_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUse_command(final SnowflakeParser.Use_commandContext ctx) {
    final var methodName = "enterUse_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUse_database(final SnowflakeParser.Use_databaseContext ctx) {
    final var methodName = "enterUse_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUse_role(final SnowflakeParser.Use_roleContext ctx) {
    final var methodName = "enterUse_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUse_schema(final SnowflakeParser.Use_schemaContext ctx) {
    final var methodName = "enterUse_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUse_secondary_roles(final SnowflakeParser.Use_secondary_rolesContext ctx) {
    final var methodName = "enterUse_secondary_roles";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUse_warehouse(final SnowflakeParser.Use_warehouseContext ctx) {
    final var methodName = "enterUse_warehouse";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUser_stage(final SnowflakeParser.User_stageContext ctx) {
    final var methodName = "enterUser_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValue(final SnowflakeParser.ValueContext ctx) {
    final var methodName = "enterValue";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValue_item(final SnowflakeParser.Value_itemContext ctx) {
    final var methodName = "enterValue_item";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValues_builder(final SnowflakeParser.Values_builderContext ctx) {
    final var methodName = "enterValues_builder";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValues_list(final SnowflakeParser.Values_listContext ctx) {
    final var methodName = "enterValues_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValues_table(final SnowflakeParser.Values_tableContext ctx) {
    final var methodName = "enterValues_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValues_table_body(final SnowflakeParser.Values_table_bodyContext ctx) {
    final var methodName = "enterValues_table_body";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVar(final SnowflakeParser.VarContext ctx) {
    final var methodName = "enterVar";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVar_list(final SnowflakeParser.Var_listContext ctx) {
    final var methodName = "enterVar_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterView_col(final SnowflakeParser.View_colContext ctx) {
    final var methodName = "enterView_col";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVirtual_column_decl(final SnowflakeParser.Virtual_column_declContext ctx) {
    final var methodName = "enterVirtual_column_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWh_common_size(final SnowflakeParser.Wh_common_sizeContext ctx) {
    final var methodName = "enterWh_common_size";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWh_extra_size(final SnowflakeParser.Wh_extra_sizeContext ctx) {
    final var methodName = "enterWh_extra_size";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWh_params(final SnowflakeParser.Wh_paramsContext ctx) {
    final var methodName = "enterWh_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWh_properties(final SnowflakeParser.Wh_propertiesContext ctx) {
    final var methodName = "enterWh_properties";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhere_clause(final SnowflakeParser.Where_clauseContext ctx) {
    final var methodName = "enterWhere_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWith_expression(final SnowflakeParser.With_expressionContext ctx) {
    final var methodName = "enterWith_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWith_masking_policy(final SnowflakeParser.With_masking_policyContext ctx) {
    final var methodName = "enterWith_masking_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWith_row_access_policy(final SnowflakeParser.With_row_access_policyContext ctx) {
    final var methodName = "enterWith_row_access_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWith_tags(final SnowflakeParser.With_tagsContext ctx) {
    final var methodName = "enterWith_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAccount_id_list(final SnowflakeParser.Account_id_listContext ctx) {
    final var methodName = "exitAccount_id_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAccount_identifier(final SnowflakeParser.Account_identifierContext ctx) {
    final var methodName = "exitAccount_identifier";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAccount_object_privilege(
      final SnowflakeParser.Account_object_privilegeContext ctx) {
    final var methodName = "exitAccount_object_privilege";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAccount_object_privileges(
      final SnowflakeParser.Account_object_privilegesContext ctx) {
    final var methodName = "exitAccount_object_privileges";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAccount_params(final SnowflakeParser.Account_paramsContext ctx) {
    final var methodName = "exitAccount_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAfter_match(final SnowflakeParser.After_matchContext ctx) {
    final var methodName = "exitAfter_match";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggregate_function(final SnowflakeParser.Aggregate_functionContext ctx) {
    final var methodName = "exitAggregate_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlert_action(final SnowflakeParser.Alert_actionContext ctx) {
    final var methodName = "exitAlert_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlert_condition(final SnowflakeParser.Alert_conditionContext ctx) {
    final var methodName = "exitAlert_condition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlert_set_clause(final SnowflakeParser.Alert_set_clauseContext ctx) {
    final var methodName = "exitAlert_set_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlert_unset_clause(final SnowflakeParser.Alert_unset_clauseContext ctx) {
    final var methodName = "exitAlert_unset_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlias(final SnowflakeParser.AliasContext ctx) {
    final var methodName = "exitAlias";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAll_distinct(final SnowflakeParser.All_distinctContext ctx) {
    final var methodName = "exitAll_distinct";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_account(final SnowflakeParser.Alter_accountContext ctx) {
    final var methodName = "exitAlter_account";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_account_opts(final SnowflakeParser.Alter_account_optsContext ctx) {
    final var methodName = "exitAlter_account_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_alert(final SnowflakeParser.Alter_alertContext ctx) {
    final var methodName = "exitAlter_alert";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_api_integration(final SnowflakeParser.Alter_api_integrationContext ctx) {
    final var methodName = "exitAlter_api_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_column_clause(final SnowflakeParser.Alter_column_clauseContext ctx) {
    final var methodName = "exitAlter_column_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_column_decl(final SnowflakeParser.Alter_column_declContext ctx) {
    final var methodName = "exitAlter_column_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_column_decl_list(final SnowflakeParser.Alter_column_decl_listContext ctx) {
    final var methodName = "exitAlter_column_decl_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_column_opts(final SnowflakeParser.Alter_column_optsContext ctx) {
    final var methodName = "exitAlter_column_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_command(final SnowflakeParser.Alter_commandContext ctx) {
    final var methodName = "exitAlter_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_connection(final SnowflakeParser.Alter_connectionContext ctx) {
    final var methodName = "exitAlter_connection";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_connection_opts(final SnowflakeParser.Alter_connection_optsContext ctx) {
    final var methodName = "exitAlter_connection_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_database(final SnowflakeParser.Alter_databaseContext ctx) {
    final var methodName = "exitAlter_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_dynamic_table(final SnowflakeParser.Alter_dynamic_tableContext ctx) {
    final var methodName = "exitAlter_dynamic_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_external_table(final SnowflakeParser.Alter_external_tableContext ctx) {
    final var methodName = "exitAlter_external_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_failover_group(final SnowflakeParser.Alter_failover_groupContext ctx) {
    final var methodName = "exitAlter_failover_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_file_format(final SnowflakeParser.Alter_file_formatContext ctx) {
    final var methodName = "exitAlter_file_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_function(final SnowflakeParser.Alter_functionContext ctx) {
    final var methodName = "exitAlter_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_function_signature(
      final SnowflakeParser.Alter_function_signatureContext ctx) {
    final var methodName = "exitAlter_function_signature";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_masking_policy(final SnowflakeParser.Alter_masking_policyContext ctx) {
    final var methodName = "exitAlter_masking_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_materialized_view(
      final SnowflakeParser.Alter_materialized_viewContext ctx) {
    final var methodName = "exitAlter_materialized_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_modify(final SnowflakeParser.Alter_modifyContext ctx) {
    final var methodName = "exitAlter_modify";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_network_policy(final SnowflakeParser.Alter_network_policyContext ctx) {
    final var methodName = "exitAlter_network_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_network_policy_opts(
      final SnowflakeParser.Alter_network_policy_optsContext ctx) {
    final var methodName = "exitAlter_network_policy_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_notification_integration(
      final SnowflakeParser.Alter_notification_integrationContext ctx) {
    final var methodName = "exitAlter_notification_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_password_policy(final SnowflakeParser.Alter_password_policyContext ctx) {
    final var methodName = "exitAlter_password_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_pipe(final SnowflakeParser.Alter_pipeContext ctx) {
    final var methodName = "exitAlter_pipe";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_procedure(final SnowflakeParser.Alter_procedureContext ctx) {
    final var methodName = "exitAlter_procedure";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_replication_group(
      final SnowflakeParser.Alter_replication_groupContext ctx) {
    final var methodName = "exitAlter_replication_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_resource_monitor(final SnowflakeParser.Alter_resource_monitorContext ctx) {
    final var methodName = "exitAlter_resource_monitor";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_role(final SnowflakeParser.Alter_roleContext ctx) {
    final var methodName = "exitAlter_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_row_access_policy(
      final SnowflakeParser.Alter_row_access_policyContext ctx) {
    final var methodName = "exitAlter_row_access_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_schema(final SnowflakeParser.Alter_schemaContext ctx) {
    final var methodName = "exitAlter_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_security_integration_external_oauth(
      final SnowflakeParser.Alter_security_integration_external_oauthContext ctx) {
    final var methodName = "exitAlter_security_integration_external_oauth";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_security_integration_saml2(
      final SnowflakeParser.Alter_security_integration_saml2Context ctx) {
    final var methodName = "exitAlter_security_integration_saml2";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_security_integration_scim(
      final SnowflakeParser.Alter_security_integration_scimContext ctx) {
    final var methodName = "exitAlter_security_integration_scim";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_security_integration_snowflake_oauth(
      final SnowflakeParser.Alter_security_integration_snowflake_oauthContext ctx) {
    final var methodName = "exitAlter_security_integration_snowflake_oauth";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_sequence(final SnowflakeParser.Alter_sequenceContext ctx) {
    final var methodName = "exitAlter_sequence";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_session(final SnowflakeParser.Alter_sessionContext ctx) {
    final var methodName = "exitAlter_session";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_session_policy(final SnowflakeParser.Alter_session_policyContext ctx) {
    final var methodName = "exitAlter_session_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_share(final SnowflakeParser.Alter_shareContext ctx) {
    final var methodName = "exitAlter_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_stage(final SnowflakeParser.Alter_stageContext ctx) {
    final var methodName = "exitAlter_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_storage_integration(
      final SnowflakeParser.Alter_storage_integrationContext ctx) {
    final var methodName = "exitAlter_storage_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_stream(final SnowflakeParser.Alter_streamContext ctx) {
    final var methodName = "exitAlter_stream";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table(final SnowflakeParser.Alter_tableContext ctx) {
    final var methodName = "exitAlter_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_alter_column(
      final SnowflakeParser.Alter_table_alter_columnContext ctx) {
    final var methodName = "exitAlter_table_alter_column";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_tag(final SnowflakeParser.Alter_tagContext ctx) {
    final var methodName = "exitAlter_tag";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_tag_opts(final SnowflakeParser.Alter_tag_optsContext ctx) {
    final var methodName = "exitAlter_tag_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_task(final SnowflakeParser.Alter_taskContext ctx) {
    final var methodName = "exitAlter_task";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_user(final SnowflakeParser.Alter_userContext ctx) {
    final var methodName = "exitAlter_user";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_user_opts(final SnowflakeParser.Alter_user_optsContext ctx) {
    final var methodName = "exitAlter_user_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_view(final SnowflakeParser.Alter_viewContext ctx) {
    final var methodName = "exitAlter_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_warehouse(final SnowflakeParser.Alter_warehouseContext ctx) {
    final var methodName = "exitAlter_warehouse";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_warehouse_opts(final SnowflakeParser.Alter_warehouse_optsContext ctx) {
    final var methodName = "exitAlter_warehouse_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitApi_integration_property(
      final SnowflakeParser.Api_integration_propertyContext ctx) {
    final var methodName = "exitApi_integration_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAppend_only(final SnowflakeParser.Append_onlyContext ctx) {
    final var methodName = "exitAppend_only";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitArg_data_type(final SnowflakeParser.Arg_data_typeContext ctx) {
    final var methodName = "exitArg_data_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitArg_decl(final SnowflakeParser.Arg_declContext ctx) {
    final var methodName = "exitArg_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitArg_default_value_clause(
      final SnowflakeParser.Arg_default_value_clauseContext ctx) {
    final var methodName = "exitArg_default_value_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitArg_name(final SnowflakeParser.Arg_nameContext ctx) {
    final var methodName = "exitArg_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitArg_types(final SnowflakeParser.Arg_typesContext ctx) {
    final var methodName = "exitArg_types";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitArr_literal(final SnowflakeParser.Arr_literalContext ctx) {
    final var methodName = "exitArr_literal";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAs_alias(final SnowflakeParser.As_aliasContext ctx) {
    final var methodName = "exitAs_alias";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAsc_desc(final SnowflakeParser.Asc_descContext ctx) {
    final var methodName = "exitAsc_desc";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAt_before(final SnowflakeParser.At_beforeContext ctx) {
    final var methodName = "exitAt_before";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAt_before1(final SnowflakeParser.At_before1Context ctx) {
    final var methodName = "exitAt_before1";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAuto_refresh(final SnowflakeParser.Auto_refreshContext ctx) {
    final var methodName = "exitAuto_refresh";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAws_credential_or_storage_integration(
      final SnowflakeParser.Aws_credential_or_storage_integrationContext ctx) {
    final var methodName = "exitAws_credential_or_storage_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAws_key_id(final SnowflakeParser.Aws_key_idContext ctx) {
    final var methodName = "exitAws_key_id";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAws_role(final SnowflakeParser.Aws_roleContext ctx) {
    final var methodName = "exitAws_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAws_secret_key(final SnowflakeParser.Aws_secret_keyContext ctx) {
    final var methodName = "exitAws_secret_key";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAws_token(final SnowflakeParser.Aws_tokenContext ctx) {
    final var methodName = "exitAws_token";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAz_credential_or_storage_integration(
      final SnowflakeParser.Az_credential_or_storage_integrationContext ctx) {
    final var methodName = "exitAz_credential_or_storage_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAzure_encryption_value(final SnowflakeParser.Azure_encryption_valueContext ctx) {
    final var methodName = "exitAzure_encryption_value";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBatch(final SnowflakeParser.BatchContext ctx) {
    final var methodName = "exitBatch";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBegin_txn(final SnowflakeParser.Begin_txnContext ctx) {
    final var methodName = "exitBegin_txn";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBinary_builtin_function(
      final SnowflakeParser.Binary_builtin_functionContext ctx) {
    final var methodName = "exitBinary_builtin_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBinary_or_ternary_builtin_function(
      final SnowflakeParser.Binary_or_ternary_builtin_functionContext ctx) {
    final var methodName = "exitBinary_or_ternary_builtin_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBracket_expression(final SnowflakeParser.Bracket_expressionContext ctx) {
    final var methodName = "exitBracket_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBuiltin_function(final SnowflakeParser.Builtin_functionContext ctx) {
    final var methodName = "exitBuiltin_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCall(final SnowflakeParser.CallContext ctx) {
    final var methodName = "exitCall";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaller_owner(final SnowflakeParser.Caller_ownerContext ctx) {
    final var methodName = "exitCaller_owner";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCascade_restrict(final SnowflakeParser.Cascade_restrictContext ctx) {
    final var methodName = "exitCascade_restrict";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCase_expression(final SnowflakeParser.Case_expressionContext ctx) {
    final var methodName = "exitCase_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCast_expr(final SnowflakeParser.Cast_exprContext ctx) {
    final var methodName = "exitCast_expr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChange_tracking(final SnowflakeParser.Change_trackingContext ctx) {
    final var methodName = "exitChange_tracking";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChanges(final SnowflakeParser.ChangesContext ctx) {
    final var methodName = "exitChanges";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharacter(final SnowflakeParser.CharacterContext ctx) {
    final var methodName = "exitCharacter";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClone_at_before(final SnowflakeParser.Clone_at_beforeContext ctx) {
    final var methodName = "exitClone_at_before";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCloud_provider_params(final SnowflakeParser.Cloud_provider_paramsContext ctx) {
    final var methodName = "exitCloud_provider_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCloud_provider_params_auto(
      final SnowflakeParser.Cloud_provider_params_autoContext ctx) {
    final var methodName = "exitCloud_provider_params_auto";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCloud_provider_params_push(
      final SnowflakeParser.Cloud_provider_params_pushContext ctx) {
    final var methodName = "exitCloud_provider_params_push";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCloud_provider_params2(final SnowflakeParser.Cloud_provider_params2Context ctx) {
    final var methodName = "exitCloud_provider_params2";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCloud_provider_params3(final SnowflakeParser.Cloud_provider_params3Context ctx) {
    final var methodName = "exitCloud_provider_params3";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCluster_by(final SnowflakeParser.Cluster_byContext ctx) {
    final var methodName = "exitCluster_by";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClustering_action(final SnowflakeParser.Clustering_actionContext ctx) {
    final var methodName = "exitClustering_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCol_decl(final SnowflakeParser.Col_declContext ctx) {
    final var methodName = "exitCol_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollate(final SnowflakeParser.CollateContext ctx) {
    final var methodName = "exitCollate";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_alias_list_in_brackets(
      final SnowflakeParser.Column_alias_list_in_bracketsContext ctx) {
    final var methodName = "exitColumn_alias_list_in_brackets";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

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
                } else if (!StringUtils.equalsIgnoreCase(
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
              if (StringUtils.equalsIgnoreCase("DEFERRABLE", terminalNodeText)) {
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
              if (StringUtils.equalsIgnoreCase("AUTOINCREMENT", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.AUTO_INCREMENT, NotNullSet.getInstance(Boolean.TRUE));
                }
              } else if (StringUtils.equalsIgnoreCase("IDENTITY", terminalNodeText)) {
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
                } else if (!StringUtils.equalsIgnoreCase(
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
      if (StringUtils.equalsIgnoreCase("UNIQUE", uniqueKeyText)
          || StringUtils.equalsIgnoreCase("CONSTRAINT UNIQUE", uniqueKeyText)) {
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
                terminalNodeText -> {
                  currentRelationship.put("foreignTable", NotNullSet.getInstance(terminalNodeText));
                });
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(SnowflakeParser.Out_of_line_constraintContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .listAllTerminalNodeText()
            .forEach(
                terminalNodeText -> {
                  currentRelationship.put("foreignTable", NotNullSet.getInstance(terminalNodeText));
                });
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
                      && StringUtils.equalsIgnoreCase(
                          "REFERENCES", outOfLineConstraintChild.getText())) {
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
                              if (!referencesFound.getValue()) {
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
  public void exitColumn_decl_item_list(final SnowflakeParser.Column_decl_item_listContext ctx) {
    final var methodName = "exitColumn_decl_item_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_decl_item_list_paren(
      final SnowflakeParser.Column_decl_item_list_parenContext ctx) {
    final var methodName = "exitColumn_decl_item_list_paren";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_elem(final SnowflakeParser.Column_elemContext ctx) {
    final var methodName = "exitColumn_elem";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_elem_star(final SnowflakeParser.Column_elem_starContext ctx) {
    final var methodName = "exitColumn_elem_star";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_list(final SnowflakeParser.Column_listContext ctx) {
    final var methodName = "exitColumn_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_list_in_parentheses(
      final SnowflakeParser.Column_list_in_parenthesesContext ctx) {
    final var methodName = "exitColumn_list_in_parentheses";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_list_with_comment(
      final SnowflakeParser.Column_list_with_commentContext ctx) {
    final var methodName = "exitColumn_list_with_comment";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_name(final SnowflakeParser.Column_nameContext ctx) {
    final var methodName = "exitColumn_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_position(final SnowflakeParser.Column_positionContext ctx) {
    final var methodName = "exitColumn_position";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_set_tags(final SnowflakeParser.Column_set_tagsContext ctx) {
    final var methodName = "exitColumn_set_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_unset_tags(final SnowflakeParser.Column_unset_tagsContext ctx) {
    final var methodName = "exitColumn_unset_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComment(final SnowflakeParser.CommentContext ctx) {
    final var methodName = "exitComment";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComment_clause(final SnowflakeParser.Comment_clauseContext ctx) {
    final var methodName = "exitComment_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommit(final SnowflakeParser.CommitContext ctx) {
    final var methodName = "exitCommit";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommon_constraint_properties(
      final SnowflakeParser.Common_constraint_propertiesContext ctx) {
    final var methodName = "exitCommon_constraint_properties";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommon_table_expression(
      final SnowflakeParser.Common_table_expressionContext ctx) {
    final var methodName = "exitCommon_table_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComparison_operator(final SnowflakeParser.Comparison_operatorContext ctx) {
    final var methodName = "exitComparison_operator";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompression(final SnowflakeParser.CompressionContext ctx) {
    final var methodName = "exitCompression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompression_type(final SnowflakeParser.Compression_typeContext ctx) {
    final var methodName = "exitCompression_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraint_action(final SnowflakeParser.Constraint_actionContext ctx) {
    final var methodName = "exitConstraint_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraint_properties(final SnowflakeParser.Constraint_propertiesContext ctx) {
    final var methodName = "exitConstraint_properties";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_grants(final SnowflakeParser.Copy_grantsContext ctx) {
    final var methodName = "exitCopy_grants";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_into_location(final SnowflakeParser.Copy_into_locationContext ctx) {
    final var methodName = "exitCopy_into_location";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_into_table(final SnowflakeParser.Copy_into_tableContext ctx) {
    final var methodName = "exitCopy_into_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopy_options(final SnowflakeParser.Copy_optionsContext ctx) {
    final var methodName = "exitCopy_options";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_account(final SnowflakeParser.Create_accountContext ctx) {
    final var methodName = "exitCreate_account";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_alert(final SnowflakeParser.Create_alertContext ctx) {
    final var methodName = "exitCreate_alert";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_api_integration(final SnowflakeParser.Create_api_integrationContext ctx) {
    final var methodName = "exitCreate_api_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
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
          || StringUtils.equalsIgnoreCase("CONSTRAINT", field.getKey())) {
        fieldsToRemove.add(field.getKey());
      }
    }
    for (final var field : fieldsToRemove) {
      currentTable.getFields().remove(field);
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
  public void exitCreate_connection(final SnowflakeParser.Create_connectionContext ctx) {
    final var methodName = "exitCreate_connection";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_database(final SnowflakeParser.Create_databaseContext ctx) {
    final var methodName = "exitCreate_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_dynamic_table(final SnowflakeParser.Create_dynamic_tableContext ctx) {
    final var methodName = "exitCreate_dynamic_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_event_table(final SnowflakeParser.Create_event_tableContext ctx) {
    final var methodName = "exitCreate_event_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_external_function(
      final SnowflakeParser.Create_external_functionContext ctx) {
    final var methodName = "exitCreate_external_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
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
                } else if (!StringUtils.equalsIgnoreCase(
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
                } else if (!StringUtils.equalsIgnoreCase(
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
  public void exitCreate_failover_group(final SnowflakeParser.Create_failover_groupContext ctx) {
    final var methodName = "exitCreate_failover_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_file_format(final SnowflakeParser.Create_file_formatContext ctx) {
    final var methodName = "exitCreate_file_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_function(final SnowflakeParser.Create_functionContext ctx) {
    final var methodName = "exitCreate_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_managed_account(final SnowflakeParser.Create_managed_accountContext ctx) {
    final var methodName = "exitCreate_managed_account";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_masking_policy(final SnowflakeParser.Create_masking_policyContext ctx) {
    final var methodName = "exitCreate_masking_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_materialized_view(
      final SnowflakeParser.Create_materialized_viewContext ctx) {
    final var methodName = "exitCreate_materialized_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_network_policy(final SnowflakeParser.Create_network_policyContext ctx) {
    final var methodName = "exitCreate_network_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_notification_integration(
      final SnowflakeParser.Create_notification_integrationContext ctx) {
    final var methodName = "exitCreate_notification_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_object_clone(final SnowflakeParser.Create_object_cloneContext ctx) {
    final var methodName = "exitCreate_object_clone";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_password_policy(final SnowflakeParser.Create_password_policyContext ctx) {
    final var methodName = "exitCreate_password_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_pipe(final SnowflakeParser.Create_pipeContext ctx) {
    final var methodName = "exitCreate_pipe";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_procedure(final SnowflakeParser.Create_procedureContext ctx) {
    final var methodName = "exitCreate_procedure";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_replication_group(
      final SnowflakeParser.Create_replication_groupContext ctx) {
    final var methodName = "exitCreate_replication_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_resource_monitor(
      final SnowflakeParser.Create_resource_monitorContext ctx) {
    final var methodName = "exitCreate_resource_monitor";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_role(final SnowflakeParser.Create_roleContext ctx) {
    final var methodName = "exitCreate_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_row_access_policy(
      final SnowflakeParser.Create_row_access_policyContext ctx) {
    final var methodName = "exitCreate_row_access_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_schema(final SnowflakeParser.Create_schemaContext ctx) {
    final var methodName = "exitCreate_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_security_integration_external_oauth(
      final SnowflakeParser.Create_security_integration_external_oauthContext ctx) {
    final var methodName = "exitCreate_security_integration_external_oauth";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_security_integration_saml2(
      final SnowflakeParser.Create_security_integration_saml2Context ctx) {
    final var methodName = "exitCreate_security_integration_saml2";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_security_integration_scim(
      final SnowflakeParser.Create_security_integration_scimContext ctx) {
    final var methodName = "exitCreate_security_integration_scim";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_security_integration_snowflake_oauth(
      final SnowflakeParser.Create_security_integration_snowflake_oauthContext ctx) {
    final var methodName = "exitCreate_security_integration_snowflake_oauth";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_sequence(final SnowflakeParser.Create_sequenceContext ctx) {
    final var methodName = "exitCreate_sequence";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_session_policy(final SnowflakeParser.Create_session_policyContext ctx) {
    final var methodName = "exitCreate_session_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_share(final SnowflakeParser.Create_shareContext ctx) {
    final var methodName = "exitCreate_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_stage(final SnowflakeParser.Create_stageContext ctx) {
    final var methodName = "exitCreate_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_storage_integration(
      final SnowflakeParser.Create_storage_integrationContext ctx) {
    final var methodName = "exitCreate_storage_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_stream(final SnowflakeParser.Create_streamContext ctx) {
    final var methodName = "exitCreate_stream";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_table(final SnowflakeParser.Create_tableContext ctx) {
    final var methodName = "exitCreate_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_table_as_select(final SnowflakeParser.Create_table_as_selectContext ctx) {
    final var methodName = "exitCreate_table_as_select";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
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
    if (currentTable == null) {}

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
                    !StringUtils.equalsIgnoreCase(currentTable.getObjectName(), terminalNodeText))
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
  public void exitCreate_tag(final SnowflakeParser.Create_tagContext ctx) {
    final var methodName = "exitCreate_tag";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_task(final SnowflakeParser.Create_taskContext ctx) {
    final var methodName = "exitCreate_task";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_user(final SnowflakeParser.Create_userContext ctx) {
    final var methodName = "exitCreate_user";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_view(final SnowflakeParser.Create_viewContext ctx) {
    final var methodName = "exitCreate_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_warehouse(final SnowflakeParser.Create_warehouseContext ctx) {
    final var methodName = "exitCreate_warehouse";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCredit_quota(final SnowflakeParser.Credit_quotaContext ctx) {
    final var methodName = "exitCredit_quota";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitData_type(final SnowflakeParser.Data_typeContext ctx) {
    final var methodName = "exitData_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitData_type_list(final SnowflakeParser.Data_type_listContext ctx) {
    final var methodName = "exitData_type_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitData_type_size(final SnowflakeParser.Data_type_sizeContext ctx) {
    final var methodName = "exitData_type_size";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatabase_property(final SnowflakeParser.Database_propertyContext ctx) {
    final var methodName = "exitDatabase_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDb_name_list(final SnowflakeParser.Db_name_listContext ctx) {
    final var methodName = "exitDb_name_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDdl_command(final SnowflakeParser.Ddl_commandContext ctx) {
    final var methodName = "exitDdl_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_append_only(final SnowflakeParser.Default_append_onlyContext ctx) {
    final var methodName = "exitDefault_append_only";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_ddl_collation(final SnowflakeParser.Default_ddl_collationContext ctx) {
    final var methodName = "exitDefault_ddl_collation";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_value(final SnowflakeParser.Default_valueContext ctx) {
    final var methodName = "exitDefault_value";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeferrable_not_deferrable(
      final SnowflakeParser.Deferrable_not_deferrableContext ctx) {
    final var methodName = "exitDeferrable_not_deferrable";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefine(final SnowflakeParser.DefineContext ctx) {
    final var methodName = "exitDefine";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDelete_statement(final SnowflakeParser.Delete_statementContext ctx) {
    final var methodName = "exitDelete_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe(final SnowflakeParser.DescribeContext ctx) {
    final var methodName = "exitDescribe";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_alert(final SnowflakeParser.Describe_alertContext ctx) {
    final var methodName = "exitDescribe_alert";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_command(final SnowflakeParser.Describe_commandContext ctx) {
    final var methodName = "exitDescribe_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_database(final SnowflakeParser.Describe_databaseContext ctx) {
    final var methodName = "exitDescribe_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_dynamic_table(final SnowflakeParser.Describe_dynamic_tableContext ctx) {
    final var methodName = "exitDescribe_dynamic_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_event_table(final SnowflakeParser.Describe_event_tableContext ctx) {
    final var methodName = "exitDescribe_event_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_external_table(
      final SnowflakeParser.Describe_external_tableContext ctx) {
    final var methodName = "exitDescribe_external_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_file_format(final SnowflakeParser.Describe_file_formatContext ctx) {
    final var methodName = "exitDescribe_file_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_function(final SnowflakeParser.Describe_functionContext ctx) {
    final var methodName = "exitDescribe_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_integration(final SnowflakeParser.Describe_integrationContext ctx) {
    final var methodName = "exitDescribe_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_masking_policy(
      final SnowflakeParser.Describe_masking_policyContext ctx) {
    final var methodName = "exitDescribe_masking_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_materialized_view(
      final SnowflakeParser.Describe_materialized_viewContext ctx) {
    final var methodName = "exitDescribe_materialized_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_network_policy(
      final SnowflakeParser.Describe_network_policyContext ctx) {
    final var methodName = "exitDescribe_network_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_password_policy(
      final SnowflakeParser.Describe_password_policyContext ctx) {
    final var methodName = "exitDescribe_password_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_pipe(final SnowflakeParser.Describe_pipeContext ctx) {
    final var methodName = "exitDescribe_pipe";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_procedure(final SnowflakeParser.Describe_procedureContext ctx) {
    final var methodName = "exitDescribe_procedure";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_result(final SnowflakeParser.Describe_resultContext ctx) {
    final var methodName = "exitDescribe_result";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_row_access_policy(
      final SnowflakeParser.Describe_row_access_policyContext ctx) {
    final var methodName = "exitDescribe_row_access_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_schema(final SnowflakeParser.Describe_schemaContext ctx) {
    final var methodName = "exitDescribe_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_search_optimization(
      final SnowflakeParser.Describe_search_optimizationContext ctx) {
    final var methodName = "exitDescribe_search_optimization";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_sequence(final SnowflakeParser.Describe_sequenceContext ctx) {
    final var methodName = "exitDescribe_sequence";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_session_policy(
      final SnowflakeParser.Describe_session_policyContext ctx) {
    final var methodName = "exitDescribe_session_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_share(final SnowflakeParser.Describe_shareContext ctx) {
    final var methodName = "exitDescribe_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_stage(final SnowflakeParser.Describe_stageContext ctx) {
    final var methodName = "exitDescribe_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_stream(final SnowflakeParser.Describe_streamContext ctx) {
    final var methodName = "exitDescribe_stream";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_table(final SnowflakeParser.Describe_tableContext ctx) {
    final var methodName = "exitDescribe_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_task(final SnowflakeParser.Describe_taskContext ctx) {
    final var methodName = "exitDescribe_task";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_transaction(final SnowflakeParser.Describe_transactionContext ctx) {
    final var methodName = "exitDescribe_transaction";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_user(final SnowflakeParser.Describe_userContext ctx) {
    final var methodName = "exitDescribe_user";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_view(final SnowflakeParser.Describe_viewContext ctx) {
    final var methodName = "exitDescribe_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribe_warehouse(final SnowflakeParser.Describe_warehouseContext ctx) {
    final var methodName = "exitDescribe_warehouse";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDirectory_table_external_params(
      final SnowflakeParser.Directory_table_external_paramsContext ctx) {
    final var methodName = "exitDirectory_table_external_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDirectory_table_internal_params(
      final SnowflakeParser.Directory_table_internal_paramsContext ctx) {
    final var methodName = "exitDirectory_table_internal_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDml_command(final SnowflakeParser.Dml_commandContext ctx) {
    final var methodName = "exitDml_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_alert(final SnowflakeParser.Drop_alertContext ctx) {
    final var methodName = "exitDrop_alert";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_command(final SnowflakeParser.Drop_commandContext ctx) {
    final var methodName = "exitDrop_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_connection(final SnowflakeParser.Drop_connectionContext ctx) {
    final var methodName = "exitDrop_connection";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_database(final SnowflakeParser.Drop_databaseContext ctx) {
    final var methodName = "exitDrop_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_dynamic_table(final SnowflakeParser.Drop_dynamic_tableContext ctx) {
    final var methodName = "exitDrop_dynamic_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_external_table(final SnowflakeParser.Drop_external_tableContext ctx) {
    final var methodName = "exitDrop_external_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_failover_group(final SnowflakeParser.Drop_failover_groupContext ctx) {
    final var methodName = "exitDrop_failover_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_file_format(final SnowflakeParser.Drop_file_formatContext ctx) {
    final var methodName = "exitDrop_file_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_function(final SnowflakeParser.Drop_functionContext ctx) {
    final var methodName = "exitDrop_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_integration(final SnowflakeParser.Drop_integrationContext ctx) {
    final var methodName = "exitDrop_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_managed_account(final SnowflakeParser.Drop_managed_accountContext ctx) {
    final var methodName = "exitDrop_managed_account";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_masking_policy(final SnowflakeParser.Drop_masking_policyContext ctx) {
    final var methodName = "exitDrop_masking_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_materialized_view(final SnowflakeParser.Drop_materialized_viewContext ctx) {
    final var methodName = "exitDrop_materialized_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_network_policy(final SnowflakeParser.Drop_network_policyContext ctx) {
    final var methodName = "exitDrop_network_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_object(final SnowflakeParser.Drop_objectContext ctx) {
    final var methodName = "exitDrop_object";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_password_policy(final SnowflakeParser.Drop_password_policyContext ctx) {
    final var methodName = "exitDrop_password_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_pipe(final SnowflakeParser.Drop_pipeContext ctx) {
    final var methodName = "exitDrop_pipe";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_procedure(final SnowflakeParser.Drop_procedureContext ctx) {
    final var methodName = "exitDrop_procedure";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_replication_group(final SnowflakeParser.Drop_replication_groupContext ctx) {
    final var methodName = "exitDrop_replication_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_resource_monitor(final SnowflakeParser.Drop_resource_monitorContext ctx) {
    final var methodName = "exitDrop_resource_monitor";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_role(final SnowflakeParser.Drop_roleContext ctx) {
    final var methodName = "exitDrop_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_row_access_policy(final SnowflakeParser.Drop_row_access_policyContext ctx) {
    final var methodName = "exitDrop_row_access_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_schema(final SnowflakeParser.Drop_schemaContext ctx) {
    final var methodName = "exitDrop_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_sequence(final SnowflakeParser.Drop_sequenceContext ctx) {
    final var methodName = "exitDrop_sequence";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_session_policy(final SnowflakeParser.Drop_session_policyContext ctx) {
    final var methodName = "exitDrop_session_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_share(final SnowflakeParser.Drop_shareContext ctx) {
    final var methodName = "exitDrop_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_stage(final SnowflakeParser.Drop_stageContext ctx) {
    final var methodName = "exitDrop_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_stream(final SnowflakeParser.Drop_streamContext ctx) {
    final var methodName = "exitDrop_stream";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_table(final SnowflakeParser.Drop_tableContext ctx) {
    final var methodName = "exitDrop_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_tag(final SnowflakeParser.Drop_tagContext ctx) {
    final var methodName = "exitDrop_tag";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_task(final SnowflakeParser.Drop_taskContext ctx) {
    final var methodName = "exitDrop_task";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_user(final SnowflakeParser.Drop_userContext ctx) {
    final var methodName = "exitDrop_user";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_view(final SnowflakeParser.Drop_viewContext ctx) {
    final var methodName = "exitDrop_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_warehouse(final SnowflakeParser.Drop_warehouseContext ctx) {
    final var methodName = "exitDrop_warehouse";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnable(final SnowflakeParser.EnableContext ctx) {
    final var methodName = "exitEnable";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnabled_true_false(final SnowflakeParser.Enabled_true_falseContext ctx) {
    final var methodName = "exitEnabled_true_false";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnd(final SnowflakeParser.EndContext ctx) {
    final var methodName = "exitEnd";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnforced_not_enforced(final SnowflakeParser.Enforced_not_enforcedContext ctx) {
    final var methodName = "exitEnforced_not_enforced";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    final var methodName = "exitEveryRule";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecuta_as(final SnowflakeParser.Executa_asContext ctx) {
    final var methodName = "exitExecuta_as";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecute_immediate(final SnowflakeParser.Execute_immediateContext ctx) {
    final var methodName = "exitExecute_immediate";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecute_task(final SnowflakeParser.Execute_taskContext ctx) {
    final var methodName = "exitExecute_task";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplain(final SnowflakeParser.ExplainContext ctx) {
    final var methodName = "exitExplain";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr(final SnowflakeParser.ExprContext ctx) {
    final var methodName = "exitExpr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr_alias_list(final SnowflakeParser.Expr_alias_listContext ctx) {
    final var methodName = "exitExpr_alias_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr_list(final SnowflakeParser.Expr_listContext ctx) {
    final var methodName = "exitExpr_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr_list_in_parentheses(
      final SnowflakeParser.Expr_list_in_parenthesesContext ctx) {
    final var methodName = "exitExpr_list_in_parentheses";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpr_list_sorted(final SnowflakeParser.Expr_list_sortedContext ctx) {
    final var methodName = "exitExpr_list_sorted";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpression_elem(final SnowflakeParser.Expression_elemContext ctx) {
    final var methodName = "exitExpression_elem";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExt_table_column_action(
      final SnowflakeParser.Ext_table_column_actionContext ctx) {
    final var methodName = "exitExt_table_column_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExternal_location(final SnowflakeParser.External_locationContext ctx) {
    final var methodName = "exitExternal_location";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExternal_stage_params(final SnowflakeParser.External_stage_paramsContext ctx) {
    final var methodName = "exitExternal_stage_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExternal_table_column_decl(
      final SnowflakeParser.External_table_column_declContext ctx) {
    final var methodName = "exitExternal_table_column_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExternal_table_column_decl_list(
      final SnowflakeParser.External_table_column_decl_listContext ctx) {
    final var methodName = "exitExternal_table_column_decl_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFile_format(final SnowflakeParser.File_formatContext ctx) {
    final var methodName = "exitFile_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFiles(final SnowflakeParser.FilesContext ctx) {
    final var methodName = "exitFiles";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFirst_last(final SnowflakeParser.First_lastContext ctx) {
    final var methodName = "exitFirst_last";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFirst_next(final SnowflakeParser.First_nextContext ctx) {
    final var methodName = "exitFirst_next";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlatten_table(final SnowflakeParser.Flatten_tableContext ctx) {
    final var methodName = "exitFlatten_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlatten_table_option(final SnowflakeParser.Flatten_table_optionContext ctx) {
    final var methodName = "exitFlatten_table_option";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForeign_key(final SnowflakeParser.Foreign_keyContext ctx) {
    final var methodName = "exitForeign_key";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForeign_key_match(final SnowflakeParser.Foreign_key_matchContext ctx) {
    final var methodName = "exitForeign_key_match";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFormat_name(final SnowflakeParser.Format_nameContext ctx) {
    final var methodName = "exitFormat_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFormat_type(final SnowflakeParser.Format_typeContext ctx) {
    final var methodName = "exitFormat_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFormat_type_options(final SnowflakeParser.Format_type_optionsContext ctx) {
    final var methodName = "exitFormat_type_options";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrequency(final SnowflakeParser.FrequencyContext ctx) {
    final var methodName = "exitFrequency";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrom_clause(final SnowflakeParser.From_clauseContext ctx) {
    final var methodName = "exitFrom_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFull_acct(final SnowflakeParser.Full_acctContext ctx) {
    final var methodName = "exitFull_acct";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFull_acct_list(final SnowflakeParser.Full_acct_listContext ctx) {
    final var methodName = "exitFull_acct_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFull_col_decl(final SnowflakeParser.Full_col_declContext ctx) {
    final var methodName = "exitFull_col_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFull_column_name(final SnowflakeParser.Full_column_nameContext ctx) {
    final var methodName = "exitFull_column_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_call(final SnowflakeParser.Function_callContext ctx) {
    final var methodName = "exitFunction_call";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_definition(final SnowflakeParser.Function_definitionContext ctx) {
    final var methodName = "exitFunction_definition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_signature(final SnowflakeParser.Function_signatureContext ctx) {
    final var methodName = "exitFunction_signature";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGcp_encryption_value(final SnowflakeParser.Gcp_encryption_valueContext ctx) {
    final var methodName = "exitGcp_encryption_value";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGet_dml(final SnowflakeParser.Get_dmlContext ctx) {
    final var methodName = "exitGet_dml";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGlobal_privilege(final SnowflakeParser.Global_privilegeContext ctx) {
    final var methodName = "exitGlobal_privilege";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGlobal_privileges(final SnowflakeParser.Global_privilegesContext ctx) {
    final var methodName = "exitGlobal_privileges";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrant_ownership(final SnowflakeParser.Grant_ownershipContext ctx) {
    final var methodName = "exitGrant_ownership";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrant_role(final SnowflakeParser.Grant_roleContext ctx) {
    final var methodName = "exitGrant_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrant_to_role(final SnowflakeParser.Grant_to_roleContext ctx) {
    final var methodName = "exitGrant_to_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrant_to_share(final SnowflakeParser.Grant_to_shareContext ctx) {
    final var methodName = "exitGrant_to_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroup_by_clause(final SnowflakeParser.Group_by_clauseContext ctx) {
    final var methodName = "exitGroup_by_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroup_by_elem(final SnowflakeParser.Group_by_elemContext ctx) {
    final var methodName = "exitGroup_by_elem";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroup_by_list(final SnowflakeParser.Group_by_listContext ctx) {
    final var methodName = "exitGroup_by_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHaving_clause(final SnowflakeParser.Having_clauseContext ctx) {
    final var methodName = "exitHaving_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHeader_decl(final SnowflakeParser.Header_declContext ctx) {
    final var methodName = "exitHeader_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitId_(final SnowflakeParser.Id_Context ctx) {
    final var methodName = "exitId_";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitId_fn(final SnowflakeParser.Id_fnContext ctx) {
    final var methodName = "exitId_fn";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIf_exists(final SnowflakeParser.If_existsContext ctx) {
    final var methodName = "exitIf_exists";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIf_not_exists(final SnowflakeParser.If_not_existsContext ctx) {
    final var methodName = "exitIf_not_exists";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIf_suspended(final SnowflakeParser.If_suspendedContext ctx) {
    final var methodName = "exitIf_suspended";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIff_expr(final SnowflakeParser.Iff_exprContext ctx) {
    final var methodName = "exitIff_expr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIgnore_edition_check(final SnowflakeParser.Ignore_edition_checkContext ctx) {
    final var methodName = "exitIgnore_edition_check";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIgnore_or_repect_nulls(final SnowflakeParser.Ignore_or_repect_nullsContext ctx) {
    final var methodName = "exitIgnore_or_repect_nulls";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImplicit_none(final SnowflakeParser.Implicit_noneContext ctx) {
    final var methodName = "exitImplicit_none";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIn_for(final SnowflakeParser.In_forContext ctx) {
    final var methodName = "exitIn_for";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIn_obj(final SnowflakeParser.In_objContext ctx) {
    final var methodName = "exitIn_obj";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIn_obj_2(final SnowflakeParser.In_obj_2Context ctx) {
    final var methodName = "exitIn_obj_2";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIncrement_by(final SnowflakeParser.Increment_byContext ctx) {
    final var methodName = "exitIncrement_by";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInitially_deferred_or_immediate(
      final SnowflakeParser.Initially_deferred_or_immediateContext ctx) {
    final var methodName = "exitInitially_deferred_or_immediate";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInline_constraint(final SnowflakeParser.Inline_constraintContext ctx) {
    final var methodName = "exitInline_constraint";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsert_multi_table_statement(
      final SnowflakeParser.Insert_multi_table_statementContext ctx) {
    final var methodName = "exitInsert_multi_table_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsert_only(final SnowflakeParser.Insert_onlyContext ctx) {
    final var methodName = "exitInsert_only";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsert_statement(final SnowflakeParser.Insert_statementContext ctx) {
    final var methodName = "exitInsert_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntegration_type_name(final SnowflakeParser.Integration_type_nameContext ctx) {
    final var methodName = "exitIntegration_type_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInto_clause(final SnowflakeParser.Into_clauseContext ctx) {
    final var methodName = "exitInto_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInto_clause2(final SnowflakeParser.Into_clause2Context ctx) {
    final var methodName = "exitInto_clause2";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_clause(final SnowflakeParser.Join_clauseContext ctx) {
    final var methodName = "exitJoin_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_type(final SnowflakeParser.Join_typeContext ctx) {
    final var methodName = "exitJoin_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_literal(final SnowflakeParser.Json_literalContext ctx) {
    final var methodName = "exitJson_literal";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKeyword(final SnowflakeParser.KeywordContext ctx) {
    final var methodName = "exitKeyword";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKv_pair(final SnowflakeParser.Kv_pairContext ctx) {
    final var methodName = "exitKv_pair";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLike_pattern(final SnowflakeParser.Like_patternContext ctx) {
    final var methodName = "exitLike_pattern";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLimit_clause(final SnowflakeParser.Limit_clauseContext ctx) {
    final var methodName = "exitLimit_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLimit_rows(final SnowflakeParser.Limit_rowsContext ctx) {
    final var methodName = "exitLimit_rows";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitList(final SnowflakeParser.ListContext ctx) {
    final var methodName = "exitList";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitList_function(final SnowflakeParser.List_functionContext ctx) {
    final var methodName = "exitList_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLiteral(final SnowflakeParser.LiteralContext ctx) {
    final var methodName = "exitLiteral";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMatch_opts(final SnowflakeParser.Match_optsContext ctx) {
    final var methodName = "exitMatch_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMatch_recognize(final SnowflakeParser.Match_recognizeContext ctx) {
    final var methodName = "exitMatch_recognize";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMeasures(final SnowflakeParser.MeasuresContext ctx) {
    final var methodName = "exitMeasures";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_cond(final SnowflakeParser.Merge_condContext ctx) {
    final var methodName = "exitMerge_cond";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_insert(final SnowflakeParser.Merge_insertContext ctx) {
    final var methodName = "exitMerge_insert";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_matches(final SnowflakeParser.Merge_matchesContext ctx) {
    final var methodName = "exitMerge_matches";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_statement(final SnowflakeParser.Merge_statementContext ctx) {
    final var methodName = "exitMerge_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_update_delete(final SnowflakeParser.Merge_update_deleteContext ctx) {
    final var methodName = "exitMerge_update_delete";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNamed_stage(final SnowflakeParser.Named_stageContext ctx) {
    final var methodName = "exitNamed_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNetwork_policy(final SnowflakeParser.Network_policyContext ctx) {
    final var methodName = "exitNetwork_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNon_reserved_words(final SnowflakeParser.Non_reserved_wordsContext ctx) {
    final var methodName = "exitNon_reserved_words";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNot_null(final SnowflakeParser.Not_nullContext ctx) {
    final var methodName = "exitNot_null";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNotification_integration(
      final SnowflakeParser.Notification_integrationContext ctx) {
    final var methodName = "exitNotification_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNotify_users(final SnowflakeParser.Notify_usersContext ctx) {
    final var methodName = "exitNotify_users";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNull_not_null(final SnowflakeParser.Null_not_nullContext ctx) {
    final var methodName = "exitNull_not_null";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNum(final SnowflakeParser.NumContext ctx) {
    final var methodName = "exitNum";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_name(final SnowflakeParser.Object_nameContext ctx) {
    final var methodName = "exitObject_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_name_or_alias(final SnowflakeParser.Object_name_or_aliasContext ctx) {
    final var methodName = "exitObject_name_or_alias";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_name_or_identifier(
      final SnowflakeParser.Object_name_or_identifierContext ctx) {
    final var methodName = "exitObject_name_or_identifier";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_params(final SnowflakeParser.Object_paramsContext ctx) {
    final var methodName = "exitObject_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_privilege(final SnowflakeParser.Object_privilegeContext ctx) {
    final var methodName = "exitObject_privilege";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_properties(final SnowflakeParser.Object_propertiesContext ctx) {
    final var methodName = "exitObject_properties";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_ref(final SnowflakeParser.Object_refContext ctx) {
    final var methodName = "exitObject_ref";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_type(final SnowflakeParser.Object_typeContext ctx) {
    final var methodName = "exitObject_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_type_list(final SnowflakeParser.Object_type_listContext ctx) {
    final var methodName = "exitObject_type_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_type_name(final SnowflakeParser.Object_type_nameContext ctx) {
    final var methodName = "exitObject_type_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_type_plural(final SnowflakeParser.Object_type_pluralContext ctx) {
    final var methodName = "exitObject_type_plural";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_action(final SnowflakeParser.On_actionContext ctx) {
    final var methodName = "exitOn_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_delete(final SnowflakeParser.On_deleteContext ctx) {
    final var methodName = "exitOn_delete";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_update(final SnowflakeParser.On_updateContext ctx) {
    final var methodName = "exitOn_update";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOr_replace(final SnowflakeParser.Or_replaceContext ctx) {
    final var methodName = "exitOr_replace";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_by_clause(final SnowflakeParser.Order_by_clauseContext ctx) {
    final var methodName = "exitOrder_by_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_by_expr(final SnowflakeParser.Order_by_exprContext ctx) {
    final var methodName = "exitOrder_by_expr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_item(final SnowflakeParser.Order_itemContext ctx) {
    final var methodName = "exitOrder_item";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_noorder(final SnowflakeParser.Order_noorderContext ctx) {
    final var methodName = "exitOrder_noorder";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOther_command(final SnowflakeParser.Other_commandContext ctx) {
    final var methodName = "exitOther_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOut_of_line_constraint(final SnowflakeParser.Out_of_line_constraintContext ctx) {
    final var methodName = "exitOut_of_line_constraint";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOuter_join(final SnowflakeParser.Outer_joinContext ctx) {
    final var methodName = "exitOuter_join";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOver_clause(final SnowflakeParser.Over_clauseContext ctx) {
    final var methodName = "exitOver_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParallel(final SnowflakeParser.ParallelContext ctx) {
    final var methodName = "exitParallel";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParam_assoc(final SnowflakeParser.Param_assocContext ctx) {
    final var methodName = "exitParam_assoc";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParam_assoc_list(final SnowflakeParser.Param_assoc_listContext ctx) {
    final var methodName = "exitParam_assoc_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParam_name(final SnowflakeParser.Param_nameContext ctx) {
    final var methodName = "exitParam_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_by(final SnowflakeParser.Partition_byContext ctx) {
    final var methodName = "exitPartition_by";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartner_application(final SnowflakeParser.Partner_applicationContext ctx) {
    final var methodName = "exitPartner_application";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPassword_policy_param_name(
      final SnowflakeParser.Password_policy_param_nameContext ctx) {
    final var methodName = "exitPassword_policy_param_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPassword_policy_params(final SnowflakeParser.Password_policy_paramsContext ctx) {
    final var methodName = "exitPassword_policy_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPattern(final SnowflakeParser.PatternContext ctx) {
    final var methodName = "exitPattern";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPivot_unpivot(final SnowflakeParser.Pivot_unpivotContext ctx) {
    final var methodName = "exitPivot_unpivot";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPredicate(final SnowflakeParser.PredicateContext ctx) {
    final var methodName = "exitPredicate";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
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

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimitive_expression(final SnowflakeParser.Primitive_expressionContext ctx) {
    final var methodName = "exitPrimitive_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrior_item(final SnowflakeParser.Prior_itemContext ctx) {
    final var methodName = "exitPrior_item";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrior_list(final SnowflakeParser.Prior_listContext ctx) {
    final var methodName = "exitPrior_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProcedure_definition(final SnowflakeParser.Procedure_definitionContext ctx) {
    final var methodName = "exitProcedure_definition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPut(final SnowflakeParser.PutContext ctx) {
    final var methodName = "exitPut";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQualify_clause(final SnowflakeParser.Qualify_clauseContext ctx) {
    final var methodName = "exitQualify_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuery_statement(final SnowflakeParser.Query_statementContext ctx) {
    final var methodName = "exitQuery_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRanking_windowed_function(
      final SnowflakeParser.Ranking_windowed_functionContext ctx) {
    final var methodName = "exitRanking_windowed_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRefresh_on_create(final SnowflakeParser.Refresh_on_createContext ctx) {
    final var methodName = "exitRefresh_on_create";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRegion_group_id(final SnowflakeParser.Region_group_idContext ctx) {
    final var methodName = "exitRegion_group_id";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRemove(final SnowflakeParser.RemoveContext ctx) {
    final var methodName = "exitRemove";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRepeatable_seed(final SnowflakeParser.Repeatable_seedContext ctx) {
    final var methodName = "exitRepeatable_seed";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplication_schedule(final SnowflakeParser.Replication_scheduleContext ctx) {
    final var methodName = "exitReplication_schedule";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResume_suspend(final SnowflakeParser.Resume_suspendContext ctx) {
    final var methodName = "exitResume_suspend";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevoke_from_role(final SnowflakeParser.Revoke_from_roleContext ctx) {
    final var methodName = "exitRevoke_from_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevoke_from_share(final SnowflakeParser.Revoke_from_shareContext ctx) {
    final var methodName = "exitRevoke_from_share";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevoke_role(final SnowflakeParser.Revoke_roleContext ctx) {
    final var methodName = "exitRevoke_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRole_name(final SnowflakeParser.Role_nameContext ctx) {
    final var methodName = "exitRole_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollback(final SnowflakeParser.RollbackContext ctx) {
    final var methodName = "exitRollback";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRound_expr(final SnowflakeParser.Round_exprContext ctx) {
    final var methodName = "exitRound_expr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRound_mode(final SnowflakeParser.Round_modeContext ctx) {
    final var methodName = "exitRound_mode";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRow_match(final SnowflakeParser.Row_matchContext ctx) {
    final var methodName = "exitRow_match";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRow_rows(final SnowflakeParser.Row_rowsContext ctx) {
    final var methodName = "exitRow_rows";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSample(final SnowflakeParser.SampleContext ctx) {
    final var methodName = "exitSample";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSample_method(final SnowflakeParser.Sample_methodContext ctx) {
    final var methodName = "exitSample_method";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSample_opts(final SnowflakeParser.Sample_optsContext ctx) {
    final var methodName = "exitSample_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSchema_name(final SnowflakeParser.Schema_nameContext ctx) {
    final var methodName = "exitSchema_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSchema_object_privilege(
      final SnowflakeParser.Schema_object_privilegeContext ctx) {
    final var methodName = "exitSchema_object_privilege";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSchema_object_privileges(
      final SnowflakeParser.Schema_object_privilegesContext ctx) {
    final var methodName = "exitSchema_object_privileges";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSchema_privilege(final SnowflakeParser.Schema_privilegeContext ctx) {
    final var methodName = "exitSchema_privilege";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSchema_privileges(final SnowflakeParser.Schema_privilegesContext ctx) {
    final var methodName = "exitSchema_privileges";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSchema_property(final SnowflakeParser.Schema_propertyContext ctx) {
    final var methodName = "exitSchema_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSearch_condition(final SnowflakeParser.Search_conditionContext ctx) {
    final var methodName = "exitSearch_condition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSearch_method_with_target(
      final SnowflakeParser.Search_method_with_targetContext ctx) {
    final var methodName = "exitSearch_method_with_target";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSearch_optimization_action(
      final SnowflakeParser.Search_optimization_actionContext ctx) {
    final var methodName = "exitSearch_optimization_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSecurity_integration_external_oauth_property(
      final SnowflakeParser.Security_integration_external_oauth_propertyContext ctx) {
    final var methodName = "exitSecurity_integration_external_oauth_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSecurity_integration_scim_property(
      final SnowflakeParser.Security_integration_scim_propertyContext ctx) {
    final var methodName = "exitSecurity_integration_scim_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSecurity_integration_snowflake_oauth_property(
      final SnowflakeParser.Security_integration_snowflake_oauth_propertyContext ctx) {
    final var methodName = "exitSecurity_integration_snowflake_oauth_property";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_clause(final SnowflakeParser.Select_clauseContext ctx) {
    final var methodName = "exitSelect_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_list(final SnowflakeParser.Select_listContext ctx) {
    final var methodName = "exitSelect_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_list_elem(final SnowflakeParser.Select_list_elemContext ctx) {
    final var methodName = "exitSelect_list_elem";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_list_no_top(final SnowflakeParser.Select_list_no_topContext ctx) {
    final var methodName = "exitSelect_list_no_top";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_list_top(final SnowflakeParser.Select_list_topContext ctx) {
    final var methodName = "exitSelect_list_top";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_optional_clauses(
      final SnowflakeParser.Select_optional_clausesContext ctx) {
    final var methodName = "exitSelect_optional_clauses";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_statement(final SnowflakeParser.Select_statementContext ctx) {
    final var methodName = "exitSelect_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_top_clause(final SnowflakeParser.Select_top_clauseContext ctx) {
    final var methodName = "exitSelect_top_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSession_parameter(final SnowflakeParser.Session_parameterContext ctx) {
    final var methodName = "exitSession_parameter";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSession_parameter_list(final SnowflakeParser.Session_parameter_listContext ctx) {
    final var methodName = "exitSession_parameter_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSession_params(final SnowflakeParser.Session_paramsContext ctx) {
    final var methodName = "exitSession_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSession_params_list(final SnowflakeParser.Session_params_listContext ctx) {
    final var methodName = "exitSession_params_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSession_policy_param_name(
      final SnowflakeParser.Session_policy_param_nameContext ctx) {
    final var methodName = "exitSession_policy_param_name";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSession_policy_params(final SnowflakeParser.Session_policy_paramsContext ctx) {
    final var methodName = "exitSession_policy_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet(final SnowflakeParser.SetContext ctx) {
    final var methodName = "exitSet";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_operators(final SnowflakeParser.Set_operatorsContext ctx) {
    final var methodName = "exitSet_operators";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_tags(final SnowflakeParser.Set_tagsContext ctx) {
    final var methodName = "exitSet_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShare_name_list(final SnowflakeParser.Share_name_listContext ctx) {
    final var methodName = "exitShare_name_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_alerts(final SnowflakeParser.Show_alertsContext ctx) {
    final var methodName = "exitShow_alerts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_channels(final SnowflakeParser.Show_channelsContext ctx) {
    final var methodName = "exitShow_channels";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_columns(final SnowflakeParser.Show_columnsContext ctx) {
    final var methodName = "exitShow_columns";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_command(final SnowflakeParser.Show_commandContext ctx) {
    final var methodName = "exitShow_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_connections(final SnowflakeParser.Show_connectionsContext ctx) {
    final var methodName = "exitShow_connections";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_databases(final SnowflakeParser.Show_databasesContext ctx) {
    final var methodName = "exitShow_databases";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_databases_in_failover_group(
      final SnowflakeParser.Show_databases_in_failover_groupContext ctx) {
    final var methodName = "exitShow_databases_in_failover_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_databases_in_replication_group(
      final SnowflakeParser.Show_databases_in_replication_groupContext ctx) {
    final var methodName = "exitShow_databases_in_replication_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_delegated_authorizations(
      final SnowflakeParser.Show_delegated_authorizationsContext ctx) {
    final var methodName = "exitShow_delegated_authorizations";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_dynamic_tables(final SnowflakeParser.Show_dynamic_tablesContext ctx) {
    final var methodName = "exitShow_dynamic_tables";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_event_tables(final SnowflakeParser.Show_event_tablesContext ctx) {
    final var methodName = "exitShow_event_tables";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_external_functions(
      final SnowflakeParser.Show_external_functionsContext ctx) {
    final var methodName = "exitShow_external_functions";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_external_tables(final SnowflakeParser.Show_external_tablesContext ctx) {
    final var methodName = "exitShow_external_tables";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_failover_groups(final SnowflakeParser.Show_failover_groupsContext ctx) {
    final var methodName = "exitShow_failover_groups";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_file_formats(final SnowflakeParser.Show_file_formatsContext ctx) {
    final var methodName = "exitShow_file_formats";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_functions(final SnowflakeParser.Show_functionsContext ctx) {
    final var methodName = "exitShow_functions";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_global_accounts(final SnowflakeParser.Show_global_accountsContext ctx) {
    final var methodName = "exitShow_global_accounts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_grants(final SnowflakeParser.Show_grantsContext ctx) {
    final var methodName = "exitShow_grants";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_grants_opts(final SnowflakeParser.Show_grants_optsContext ctx) {
    final var methodName = "exitShow_grants_opts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_initial_rows(final SnowflakeParser.Show_initial_rowsContext ctx) {
    final var methodName = "exitShow_initial_rows";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_integrations(final SnowflakeParser.Show_integrationsContext ctx) {
    final var methodName = "exitShow_integrations";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_locks(final SnowflakeParser.Show_locksContext ctx) {
    final var methodName = "exitShow_locks";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_managed_accounts(final SnowflakeParser.Show_managed_accountsContext ctx) {
    final var methodName = "exitShow_managed_accounts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_masking_policies(final SnowflakeParser.Show_masking_policiesContext ctx) {
    final var methodName = "exitShow_masking_policies";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_materialized_views(
      final SnowflakeParser.Show_materialized_viewsContext ctx) {
    final var methodName = "exitShow_materialized_views";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_network_policies(final SnowflakeParser.Show_network_policiesContext ctx) {
    final var methodName = "exitShow_network_policies";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_objects(final SnowflakeParser.Show_objectsContext ctx) {
    final var methodName = "exitShow_objects";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_organization_accounts(
      final SnowflakeParser.Show_organization_accountsContext ctx) {
    final var methodName = "exitShow_organization_accounts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_parameters(final SnowflakeParser.Show_parametersContext ctx) {
    final var methodName = "exitShow_parameters";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_password_policies(final SnowflakeParser.Show_password_policiesContext ctx) {
    final var methodName = "exitShow_password_policies";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_pipes(final SnowflakeParser.Show_pipesContext ctx) {
    final var methodName = "exitShow_pipes";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_primary_keys(final SnowflakeParser.Show_primary_keysContext ctx) {
    final var methodName = "exitShow_primary_keys";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_procedures(final SnowflakeParser.Show_proceduresContext ctx) {
    final var methodName = "exitShow_procedures";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_regions(final SnowflakeParser.Show_regionsContext ctx) {
    final var methodName = "exitShow_regions";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_replication_accounts(
      final SnowflakeParser.Show_replication_accountsContext ctx) {
    final var methodName = "exitShow_replication_accounts";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_replication_databases(
      final SnowflakeParser.Show_replication_databasesContext ctx) {
    final var methodName = "exitShow_replication_databases";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_replication_groups(
      final SnowflakeParser.Show_replication_groupsContext ctx) {
    final var methodName = "exitShow_replication_groups";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_resource_monitors(final SnowflakeParser.Show_resource_monitorsContext ctx) {
    final var methodName = "exitShow_resource_monitors";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_roles(final SnowflakeParser.Show_rolesContext ctx) {
    final var methodName = "exitShow_roles";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_row_access_policies(
      final SnowflakeParser.Show_row_access_policiesContext ctx) {
    final var methodName = "exitShow_row_access_policies";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_schemas(final SnowflakeParser.Show_schemasContext ctx) {
    final var methodName = "exitShow_schemas";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_sequences(final SnowflakeParser.Show_sequencesContext ctx) {
    final var methodName = "exitShow_sequences";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_session_policies(final SnowflakeParser.Show_session_policiesContext ctx) {
    final var methodName = "exitShow_session_policies";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_shares(final SnowflakeParser.Show_sharesContext ctx) {
    final var methodName = "exitShow_shares";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_shares_in_failover_group(
      final SnowflakeParser.Show_shares_in_failover_groupContext ctx) {
    final var methodName = "exitShow_shares_in_failover_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_shares_in_replication_group(
      final SnowflakeParser.Show_shares_in_replication_groupContext ctx) {
    final var methodName = "exitShow_shares_in_replication_group";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_stages(final SnowflakeParser.Show_stagesContext ctx) {
    final var methodName = "exitShow_stages";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_streams(final SnowflakeParser.Show_streamsContext ctx) {
    final var methodName = "exitShow_streams";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_tables(final SnowflakeParser.Show_tablesContext ctx) {
    final var methodName = "exitShow_tables";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_tags(final SnowflakeParser.Show_tagsContext ctx) {
    final var methodName = "exitShow_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_tasks(final SnowflakeParser.Show_tasksContext ctx) {
    final var methodName = "exitShow_tasks";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_transactions(final SnowflakeParser.Show_transactionsContext ctx) {
    final var methodName = "exitShow_transactions";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_user_functions(final SnowflakeParser.Show_user_functionsContext ctx) {
    final var methodName = "exitShow_user_functions";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_users(final SnowflakeParser.Show_usersContext ctx) {
    final var methodName = "exitShow_users";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_variables(final SnowflakeParser.Show_variablesContext ctx) {
    final var methodName = "exitShow_variables";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_views(final SnowflakeParser.Show_viewsContext ctx) {
    final var methodName = "exitShow_views";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShow_warehouses(final SnowflakeParser.Show_warehousesContext ctx) {
    final var methodName = "exitShow_warehouses";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSign(final SnowflakeParser.SignContext ctx) {
    final var methodName = "exitSign";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSnowflake_file(final SnowflakeParser.Snowflake_fileContext ctx) {
    final var methodName = "exitSnowflake_file";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSnowflake_region_id(final SnowflakeParser.Snowflake_region_idContext ctx) {
    final var methodName = "exitSnowflake_region_id";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSplited_table(final SnowflakeParser.Splited_tableContext ctx) {
    final var methodName = "exitSplited_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql(final SnowflakeParser.SqlContext ctx) {
    final var methodName = "exitSql";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_command(final SnowflakeParser.Sql_commandContext ctx) {
    final var methodName = "exitSql_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStage_encryption_opts_aws(
      final SnowflakeParser.Stage_encryption_opts_awsContext ctx) {
    final var methodName = "exitStage_encryption_opts_aws";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStage_encryption_opts_az(
      final SnowflakeParser.Stage_encryption_opts_azContext ctx) {
    final var methodName = "exitStage_encryption_opts_az";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStage_encryption_opts_gcp(
      final SnowflakeParser.Stage_encryption_opts_gcpContext ctx) {
    final var methodName = "exitStage_encryption_opts_gcp";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStage_encryption_opts_internal(
      final SnowflakeParser.Stage_encryption_opts_internalContext ctx) {
    final var methodName = "exitStage_encryption_opts_internal";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStage_file_format(final SnowflakeParser.Stage_file_formatContext ctx) {
    final var methodName = "exitStage_file_format";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStage_kms_key(final SnowflakeParser.Stage_kms_keyContext ctx) {
    final var methodName = "exitStage_kms_key";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStage_master_key(final SnowflakeParser.Stage_master_keyContext ctx) {
    final var methodName = "exitStage_master_key";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStage_path(final SnowflakeParser.Stage_pathContext ctx) {
    final var methodName = "exitStage_path";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStage_type(final SnowflakeParser.Stage_typeContext ctx) {
    final var methodName = "exitStage_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStart_with(final SnowflakeParser.Start_withContext ctx) {
    final var methodName = "exitStart_with";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStarts_with(final SnowflakeParser.Starts_withContext ctx) {
    final var methodName = "exitStarts_with";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStorage_integration_eq_id(
      final SnowflakeParser.Storage_integration_eq_idContext ctx) {
    final var methodName = "exitStorage_integration_eq_id";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStream_time(final SnowflakeParser.Stream_timeContext ctx) {
    final var methodName = "exitStream_time";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitString(final SnowflakeParser.StringContext ctx) {
    final var methodName = "exitString";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitString_list(final SnowflakeParser.String_listContext ctx) {
    final var methodName = "exitString_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubquery(final SnowflakeParser.SubqueryContext ctx) {
    final var methodName = "exitSubquery";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSwitch_search_condition_section(
      final SnowflakeParser.Switch_search_condition_sectionContext ctx) {
    final var methodName = "exitSwitch_search_condition_section";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSwitch_section(final SnowflakeParser.Switch_sectionContext ctx) {
    final var methodName = "exitSwitch_section";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSymbol(final SnowflakeParser.SymbolContext ctx) {
    final var methodName = "exitSymbol";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSymbol_list(final SnowflakeParser.Symbol_listContext ctx) {
    final var methodName = "exitSymbol_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSystem_defined_role(final SnowflakeParser.System_defined_roleContext ctx) {
    final var methodName = "exitSystem_defined_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_column_action(final SnowflakeParser.Table_column_actionContext ctx) {
    final var methodName = "exitTable_column_action";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_or_query(final SnowflakeParser.Table_or_queryContext ctx) {
    final var methodName = "exitTable_or_query";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_source(final SnowflakeParser.Table_sourceContext ctx) {
    final var methodName = "exitTable_source";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_source_item_joined(
      final SnowflakeParser.Table_source_item_joinedContext ctx) {
    final var methodName = "exitTable_source_item_joined";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_sources(final SnowflakeParser.Table_sourcesContext ctx) {
    final var methodName = "exitTable_sources";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_stage(final SnowflakeParser.Table_stageContext ctx) {
    final var methodName = "exitTable_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_type(final SnowflakeParser.Table_typeContext ctx) {
    final var methodName = "exitTable_type";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTag_allowed_values(final SnowflakeParser.Tag_allowed_valuesContext ctx) {
    final var methodName = "exitTag_allowed_values";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTag_decl(final SnowflakeParser.Tag_declContext ctx) {
    final var methodName = "exitTag_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTag_decl_list(final SnowflakeParser.Tag_decl_listContext ctx) {
    final var methodName = "exitTag_decl_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTag_value(final SnowflakeParser.Tag_valueContext ctx) {
    final var methodName = "exitTag_value";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTask_compute(final SnowflakeParser.Task_computeContext ctx) {
    final var methodName = "exitTask_compute";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTask_error_integration(final SnowflakeParser.Task_error_integrationContext ctx) {
    final var methodName = "exitTask_error_integration";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTask_overlap(final SnowflakeParser.Task_overlapContext ctx) {
    final var methodName = "exitTask_overlap";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTask_parameters(final SnowflakeParser.Task_parametersContext ctx) {
    final var methodName = "exitTask_parameters";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTask_schedule(final SnowflakeParser.Task_scheduleContext ctx) {
    final var methodName = "exitTask_schedule";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTask_suspend_after_failure_number(
      final SnowflakeParser.Task_suspend_after_failure_numberContext ctx) {
    final var methodName = "exitTask_suspend_after_failure_number";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTask_timeout(final SnowflakeParser.Task_timeoutContext ctx) {
    final var methodName = "exitTask_timeout";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTemporary(final SnowflakeParser.TemporaryContext ctx) {
    final var methodName = "exitTemporary";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTernary_builtin_function(
      final SnowflakeParser.Ternary_builtin_functionContext ctx) {
    final var methodName = "exitTernary_builtin_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTop_clause(final SnowflakeParser.Top_clauseContext ctx) {
    final var methodName = "exitTop_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrigger_definition(final SnowflakeParser.Trigger_definitionContext ctx) {
    final var methodName = "exitTrigger_definition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerDefinition(final SnowflakeParser.TriggerDefinitionContext ctx) {
    final var methodName = "exitTriggerDefinition";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrim_expression(final SnowflakeParser.Trim_expressionContext ctx) {
    final var methodName = "exitTrim_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrue_false(final SnowflakeParser.True_falseContext ctx) {
    final var methodName = "exitTrue_false";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTruncate_materialized_view(
      final SnowflakeParser.Truncate_materialized_viewContext ctx) {
    final var methodName = "exitTruncate_materialized_view";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTruncate_table(final SnowflakeParser.Truncate_tableContext ctx) {
    final var methodName = "exitTruncate_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTry_cast_expr(final SnowflakeParser.Try_cast_exprContext ctx) {
    final var methodName = "exitTry_cast_expr";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_fileformat(final SnowflakeParser.Type_fileformatContext ctx) {
    final var methodName = "exitType_fileformat";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnary_or_binary_builtin_function(
      final SnowflakeParser.Unary_or_binary_builtin_functionContext ctx) {
    final var methodName = "exitUnary_or_binary_builtin_function";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUndrop_command(final SnowflakeParser.Undrop_commandContext ctx) {
    final var methodName = "exitUndrop_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUndrop_database(final SnowflakeParser.Undrop_databaseContext ctx) {
    final var methodName = "exitUndrop_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUndrop_schema(final SnowflakeParser.Undrop_schemaContext ctx) {
    final var methodName = "exitUndrop_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUndrop_table(final SnowflakeParser.Undrop_tableContext ctx) {
    final var methodName = "exitUndrop_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUndrop_tag(final SnowflakeParser.Undrop_tagContext ctx) {
    final var methodName = "exitUndrop_tag";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnset(final SnowflakeParser.UnsetContext ctx) {
    final var methodName = "exitUnset";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnset_tags(final SnowflakeParser.Unset_tagsContext ctx) {
    final var methodName = "exitUnset_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_statement(final SnowflakeParser.Update_statementContext ctx) {
    final var methodName = "exitUpdate_statement";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUse_command(final SnowflakeParser.Use_commandContext ctx) {
    final var methodName = "exitUse_command";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUse_database(final SnowflakeParser.Use_databaseContext ctx) {
    final var methodName = "exitUse_database";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUse_role(final SnowflakeParser.Use_roleContext ctx) {
    final var methodName = "exitUse_role";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUse_schema(final SnowflakeParser.Use_schemaContext ctx) {
    final var methodName = "exitUse_schema";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUse_secondary_roles(final SnowflakeParser.Use_secondary_rolesContext ctx) {
    final var methodName = "exitUse_secondary_roles";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUse_warehouse(final SnowflakeParser.Use_warehouseContext ctx) {
    final var methodName = "exitUse_warehouse";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUser_stage(final SnowflakeParser.User_stageContext ctx) {
    final var methodName = "exitUser_stage";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValue(final SnowflakeParser.ValueContext ctx) {
    final var methodName = "exitValue";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValue_item(final SnowflakeParser.Value_itemContext ctx) {
    final var methodName = "exitValue_item";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValues_builder(final SnowflakeParser.Values_builderContext ctx) {
    final var methodName = "exitValues_builder";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValues_list(final SnowflakeParser.Values_listContext ctx) {
    final var methodName = "exitValues_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValues_table(final SnowflakeParser.Values_tableContext ctx) {
    final var methodName = "exitValues_table";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValues_table_body(final SnowflakeParser.Values_table_bodyContext ctx) {
    final var methodName = "exitValues_table_body";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVar(final SnowflakeParser.VarContext ctx) {
    final var methodName = "exitVar";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVar_list(final SnowflakeParser.Var_listContext ctx) {
    final var methodName = "exitVar_list";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitView_col(final SnowflakeParser.View_colContext ctx) {
    final var methodName = "exitView_col";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVirtual_column_decl(final SnowflakeParser.Virtual_column_declContext ctx) {
    final var methodName = "exitVirtual_column_decl";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWh_common_size(final SnowflakeParser.Wh_common_sizeContext ctx) {
    final var methodName = "exitWh_common_size";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWh_extra_size(final SnowflakeParser.Wh_extra_sizeContext ctx) {
    final var methodName = "exitWh_extra_size";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWh_params(final SnowflakeParser.Wh_paramsContext ctx) {
    final var methodName = "exitWh_params";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWh_properties(final SnowflakeParser.Wh_propertiesContext ctx) {
    final var methodName = "exitWh_properties";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhere_clause(final SnowflakeParser.Where_clauseContext ctx) {
    final var methodName = "exitWhere_clause";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWith_expression(final SnowflakeParser.With_expressionContext ctx) {
    final var methodName = "exitWith_expression";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWith_masking_policy(final SnowflakeParser.With_masking_policyContext ctx) {
    final var methodName = "exitWith_masking_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWith_row_access_policy(final SnowflakeParser.With_row_access_policyContext ctx) {
    final var methodName = "exitWith_row_access_policy";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWith_tags(final SnowflakeParser.With_tagsContext ctx) {
    final var methodName = "exitWith_tags";
    SnowflakeParserListenerImpl.traceChildren(methodName, ctx);
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
              .collect(Collectors.toList()));
      if (1 < terminalNode.size()
          && StringUtils.equalsIgnoreCase(
              terminalNode.get(0).getText(), currentTable.getObjectName())) {
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

    final var terminalNode = new ArrayList<ParseTree>();

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, SnowflakeParser.Column_decl_itemContext.class);
    if (parentContext != null && parentContext.children != null) {
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SnowflakeParser.Full_col_declContext.class)
              .streamChildrenByClass(SnowflakeParser.Inline_constraintContext.class)
              .streamChildrenByClass(SnowflakeParser.Id_Context.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toList()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SnowflakeParser.Full_col_declContext.class)
              .streamChildrenByClass(SnowflakeParser.Inline_constraintContext.class)
              .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
              .streamChildrenByClass(SnowflakeParser.Id_Context.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toList()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SnowflakeParser.Out_of_line_constraintContext.class)
              .streamChildrenByClass(SnowflakeParser.Id_Context.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toList()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(SnowflakeParser.Out_of_line_constraintContext.class)
              .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
              .streamChildrenByClass(SnowflakeParser.Id_Context.class)
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
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_dynamic_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_event_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_external_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_table_as_selectContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));

    final var ongoing = new MutableBoolean(true);
    ParseTreeStream.parseTreeStream(parentContext)
        .streamChildrenByClass(SnowflakeParser.Create_table_likeContext.class)
        .forEach(
            createTableLikeChild -> {
              if (createTableLikeChild instanceof TerminalNodeImpl
                  && StringUtils.equalsIgnoreCase("LIKE", createTableLikeChild.getText())) {
                ongoing.setFalse();
              } else if (createTableLikeChild instanceof SnowflakeParser.Object_nameContext
                  && ongoing.getValue()) {
                terminalNodeTextList.addAll(
                    ParseTreeStream.parseTreeStream(
                            (SnowflakeParser.Object_nameContext) createTableLikeChild)
                        .streamChildrenByClass(SnowflakeParser.Id_Context.class)
                        .streamTerminalNodeString()
                        .collect(Collectors.toList()));
              }
            });

    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamChildrenByClass(SnowflakeParser.Builtin_functionContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamChildrenByClass(SnowflakeParser.KeywordContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamChildrenByClass(SnowflakeParser.Object_type_pluralContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(SnowflakeParser.Create_tableContext.class)
            .streamChildrenByClass(SnowflakeParser.Object_nameContext.class)
            .streamChildrenByClass(SnowflakeParser.Id_Context.class)
            .streamChildrenByClass(SnowflakeParser.Unary_or_binary_builtin_functionContext.class)
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
    SnowflakeParserListenerImpl.traceChildren(methodName, node);
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
