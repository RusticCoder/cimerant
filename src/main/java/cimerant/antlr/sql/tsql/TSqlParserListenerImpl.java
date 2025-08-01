package cimerant.antlr.sql.tsql;

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
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Strings;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableObject;
import sql.tsql.TSqlParser;
import sql.tsql.TSqlParserBaseListener;
import sql.tsql.TSqlParserListener;

/**
 * This class provides an empty implementation of {@link TSqlParserListener}, which can be extended
 * to create a listener which only needs to handle a subset of the available methods.
 */
public class TSqlParserListenerImpl extends TSqlParserBaseListener {
  private static CharStream input;
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(TSqlParserListenerImpl.class.getName());
  }

  private static void traceChildren(final String methodName, final ParseTree ctx) {
    if (TSqlParserListenerImpl.logger.isTraceEnabled()) {
      ParseTreeHelper.printChildren(methodName, ctx);
    }
  }

  private SqlRootContext rootContext = null;

  /** {@inheritDoc} */
  @Override
  public void enterABS(final TSqlParser.ABSContext ctx) {
    final var methodName = "enterABS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterACOS(final TSqlParser.ACOSContext ctx) {
    final var methodName = "enterACOS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAction_specification(final TSqlParser.Action_specificationContext ctx) {
    final var methodName = "enterAction_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAdd_or_modify_filegroups(final TSqlParser.Add_or_modify_filegroupsContext ctx) {
    final var methodName = "enterAdd_or_modify_filegroups";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAdd_or_modify_files(final TSqlParser.Add_or_modify_filesContext ctx) {
    final var methodName = "enterAdd_or_modify_files";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAGGREGATE_WINDOWED_FUNC(final TSqlParser.AGGREGATE_WINDOWED_FUNCContext ctx) {
    final var methodName = "enterAGGREGATE_WINDOWED_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAggregate_windowed_function(
      final TSqlParser.Aggregate_windowed_functionContext ctx) {
    final var methodName = "enterAggregate_windowed_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlgorithm(final TSqlParser.AlgorithmContext ctx) {
    final var methodName = "enterAlgorithm";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAll_distinct_expression(final TSqlParser.All_distinct_expressionContext ctx) {
    final var methodName = "enterAll_distinct_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_application_role(final TSqlParser.Alter_application_roleContext ctx) {
    final var methodName = "enterAlter_application_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly(final TSqlParser.Alter_assemblyContext ctx) {
    final var methodName = "enterAlter_assembly";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_add_clause(
      final TSqlParser.Alter_assembly_add_clauseContext ctx) {
    final var methodName = "enterAlter_assembly_add_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_as(final TSqlParser.Alter_assembly_asContext ctx) {
    final var methodName = "enterAlter_assembly_as";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_clause(final TSqlParser.Alter_assembly_clauseContext ctx) {
    final var methodName = "enterAlter_assembly_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_client_file_clause(
      final TSqlParser.Alter_assembly_client_file_clauseContext ctx) {
    final var methodName = "enterAlter_assembly_client_file_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_drop(final TSqlParser.Alter_assembly_dropContext ctx) {
    final var methodName = "enterAlter_assembly_drop";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_drop_clause(
      final TSqlParser.Alter_assembly_drop_clauseContext ctx) {
    final var methodName = "enterAlter_assembly_drop_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_drop_multiple_files(
      final TSqlParser.Alter_assembly_drop_multiple_filesContext ctx) {
    final var methodName = "enterAlter_assembly_drop_multiple_files";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_file_bits(final TSqlParser.Alter_assembly_file_bitsContext ctx) {
    final var methodName = "enterAlter_assembly_file_bits";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_file_name(final TSqlParser.Alter_assembly_file_nameContext ctx) {
    final var methodName = "enterAlter_assembly_file_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_from_clause(
      final TSqlParser.Alter_assembly_from_clauseContext ctx) {
    final var methodName = "enterAlter_assembly_from_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_from_clause_start(
      final TSqlParser.Alter_assembly_from_clause_startContext ctx) {
    final var methodName = "enterAlter_assembly_from_clause_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_start(final TSqlParser.Alter_assembly_startContext ctx) {
    final var methodName = "enterAlter_assembly_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_with(final TSqlParser.Alter_assembly_withContext ctx) {
    final var methodName = "enterAlter_assembly_with";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_assembly_with_clause(
      final TSqlParser.Alter_assembly_with_clauseContext ctx) {
    final var methodName = "enterAlter_assembly_with_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_asssembly_add_clause_start(
      final TSqlParser.Alter_asssembly_add_clause_startContext ctx) {
    final var methodName = "enterAlter_asssembly_add_clause_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_asymmetric_key(final TSqlParser.Alter_asymmetric_keyContext ctx) {
    final var methodName = "enterAlter_asymmetric_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_asymmetric_key_start(
      final TSqlParser.Alter_asymmetric_key_startContext ctx) {
    final var methodName = "enterAlter_asymmetric_key_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_authorization(final TSqlParser.Alter_authorizationContext ctx) {
    final var methodName = "enterAlter_authorization";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_authorization_for_azure_dw(
      final TSqlParser.Alter_authorization_for_azure_dwContext ctx) {
    final var methodName = "enterAlter_authorization_for_azure_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_authorization_for_parallel_dw(
      final TSqlParser.Alter_authorization_for_parallel_dwContext ctx) {
    final var methodName = "enterAlter_authorization_for_parallel_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_authorization_for_sql_database(
      final TSqlParser.Alter_authorization_for_sql_databaseContext ctx) {
    final var methodName = "enterAlter_authorization_for_sql_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_authorization_start(
      final TSqlParser.Alter_authorization_startContext ctx) {
    final var methodName = "enterAlter_authorization_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_availability_group(final TSqlParser.Alter_availability_groupContext ctx) {
    final var methodName = "enterAlter_availability_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_availability_group_options(
      final TSqlParser.Alter_availability_group_optionsContext ctx) {
    final var methodName = "enterAlter_availability_group_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_availability_group_start(
      final TSqlParser.Alter_availability_group_startContext ctx) {
    final var methodName = "enterAlter_availability_group_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_certificate(final TSqlParser.Alter_certificateContext ctx) {
    final var methodName = "enterAlter_certificate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_column_encryption_key(
      final TSqlParser.Alter_column_encryption_keyContext ctx) {
    final var methodName = "enterAlter_column_encryption_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_credential(final TSqlParser.Alter_credentialContext ctx) {
    final var methodName = "enterAlter_credential";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_cryptographic_provider(
      final TSqlParser.Alter_cryptographic_providerContext ctx) {
    final var methodName = "enterAlter_cryptographic_provider";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_database(final TSqlParser.Alter_databaseContext ctx) {
    final var methodName = "enterAlter_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_database_audit_specification(
      final TSqlParser.Alter_database_audit_specificationContext ctx) {
    final var methodName = "enterAlter_database_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_db_role(final TSqlParser.Alter_db_roleContext ctx) {
    final var methodName = "enterAlter_db_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_endpoint(final TSqlParser.Alter_endpointContext ctx) {
    final var methodName = "enterAlter_endpoint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_external_data_source(
      final TSqlParser.Alter_external_data_sourceContext ctx) {
    final var methodName = "enterAlter_external_data_source";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_external_library(final TSqlParser.Alter_external_libraryContext ctx) {
    final var methodName = "enterAlter_external_library";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_external_resource_pool(
      final TSqlParser.Alter_external_resource_poolContext ctx) {
    final var methodName = "enterAlter_external_resource_pool";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_fulltext_catalog(final TSqlParser.Alter_fulltext_catalogContext ctx) {
    final var methodName = "enterAlter_fulltext_catalog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_fulltext_stoplist(final TSqlParser.Alter_fulltext_stoplistContext ctx) {
    final var methodName = "enterAlter_fulltext_stoplist";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_index(final TSqlParser.Alter_indexContext ctx) {
    final var methodName = "enterAlter_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_login_azure_sql(final TSqlParser.Alter_login_azure_sqlContext ctx) {
    final var methodName = "enterAlter_login_azure_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_login_azure_sql_dw_and_pdw(
      final TSqlParser.Alter_login_azure_sql_dw_and_pdwContext ctx) {
    final var methodName = "enterAlter_login_azure_sql_dw_and_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_login_sql_server(final TSqlParser.Alter_login_sql_serverContext ctx) {
    final var methodName = "enterAlter_login_sql_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_master_key_azure_sql(
      final TSqlParser.Alter_master_key_azure_sqlContext ctx) {
    final var methodName = "enterAlter_master_key_azure_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_master_key_sql_server(
      final TSqlParser.Alter_master_key_sql_serverContext ctx) {
    final var methodName = "enterAlter_master_key_sql_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_message_type(final TSqlParser.Alter_message_typeContext ctx) {
    final var methodName = "enterAlter_message_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_partition_function(final TSqlParser.Alter_partition_functionContext ctx) {
    final var methodName = "enterAlter_partition_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_partition_scheme(final TSqlParser.Alter_partition_schemeContext ctx) {
    final var methodName = "enterAlter_partition_scheme";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_queue(final TSqlParser.Alter_queueContext ctx) {
    final var methodName = "enterAlter_queue";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_remote_service_binding(
      final TSqlParser.Alter_remote_service_bindingContext ctx) {
    final var methodName = "enterAlter_remote_service_binding";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_resource_governor(final TSqlParser.Alter_resource_governorContext ctx) {
    final var methodName = "enterAlter_resource_governor";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_schema_azure_sql_dw_and_pdw(
      final TSqlParser.Alter_schema_azure_sql_dw_and_pdwContext ctx) {
    final var methodName = "enterAlter_schema_azure_sql_dw_and_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_schema_sql(final TSqlParser.Alter_schema_sqlContext ctx) {
    final var methodName = "enterAlter_schema_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_sequence(final TSqlParser.Alter_sequenceContext ctx) {
    final var methodName = "enterAlter_sequence";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_server_audit(final TSqlParser.Alter_server_auditContext ctx) {
    final var methodName = "enterAlter_server_audit";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_server_audit_specification(
      final TSqlParser.Alter_server_audit_specificationContext ctx) {
    final var methodName = "enterAlter_server_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_server_configuration(
      final TSqlParser.Alter_server_configurationContext ctx) {
    final var methodName = "enterAlter_server_configuration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_server_role(final TSqlParser.Alter_server_roleContext ctx) {
    final var methodName = "enterAlter_server_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_server_role_pdw(final TSqlParser.Alter_server_role_pdwContext ctx) {
    final var methodName = "enterAlter_server_role_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_service(final TSqlParser.Alter_serviceContext ctx) {
    final var methodName = "enterAlter_service";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_service_master_key(final TSqlParser.Alter_service_master_keyContext ctx) {
    final var methodName = "enterAlter_service_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_symmetric_key(final TSqlParser.Alter_symmetric_keyContext ctx) {
    final var methodName = "enterAlter_symmetric_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_table(final TSqlParser.Alter_tableContext ctx) {
    final var methodName = "enterAlter_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_table_index_option(final TSqlParser.Alter_table_index_optionContext ctx) {
    final var methodName = "enterAlter_table_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_table_index_options(
      final TSqlParser.Alter_table_index_optionsContext ctx) {
    final var methodName = "enterAlter_table_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_user(final TSqlParser.Alter_userContext ctx) {
    final var methodName = "enterAlter_user";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_user_azure_sql(final TSqlParser.Alter_user_azure_sqlContext ctx) {
    final var methodName = "enterAlter_user_azure_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_workload_group(final TSqlParser.Alter_workload_groupContext ctx) {
    final var methodName = "enterAlter_workload_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAlter_xml_schema_collection(
      final TSqlParser.Alter_xml_schema_collectionContext ctx) {
    final var methodName = "enterAlter_xml_schema_collection";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterANALYTIC_WINDOWED_FUNC(final TSqlParser.ANALYTIC_WINDOWED_FUNCContext ctx) {
    final var methodName = "enterANALYTIC_WINDOWED_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAnalytic_windowed_function(
      final TSqlParser.Analytic_windowed_functionContext ctx) {
    final var methodName = "enterAnalytic_windowed_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAnother_statement(final TSqlParser.Another_statementContext ctx) {
    final var methodName = "enterAnother_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAPP_NAME(final TSqlParser.APP_NAMEContext ctx) {
    final var methodName = "enterAPP_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAPPLOCK_MODE(final TSqlParser.APPLOCK_MODEContext ctx) {
    final var methodName = "enterAPPLOCK_MODE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAPPLOCK_TEST(final TSqlParser.APPLOCK_TESTContext ctx) {
    final var methodName = "enterAPPLOCK_TEST";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterApply_(final TSqlParser.Apply_Context ctx) {
    final var methodName = "enterApply_";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAs_column_alias(final TSqlParser.As_column_aliasContext ctx) {
    final var methodName = "enterAs_column_alias";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAs_external_name(final TSqlParser.As_external_nameContext ctx) {
    final var methodName = "enterAs_external_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAs_table_alias(final TSqlParser.As_table_aliasContext ctx) {
    final var methodName = "enterAs_table_alias";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterASCII(final TSqlParser.ASCIIContext ctx) {
    final var methodName = "enterASCII";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterASIN(final TSqlParser.ASINContext ctx) {
    final var methodName = "enterASIN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAssembly_option(final TSqlParser.Assembly_optionContext ctx) {
    final var methodName = "enterAssembly_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterASSEMBLYPROPERTY(final TSqlParser.ASSEMBLYPROPERTYContext ctx) {
    final var methodName = "enterASSEMBLYPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAssignment_operator(final TSqlParser.Assignment_operatorContext ctx) {
    final var methodName = "enterAssignment_operator";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAsterisk(final TSqlParser.AsteriskContext ctx) {
    final var methodName = "enterAsterisk";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAsymmetric_key_option(final TSqlParser.Asymmetric_key_optionContext ctx) {
    final var methodName = "enterAsymmetric_key_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAsymmetric_key_option_start(
      final TSqlParser.Asymmetric_key_option_startContext ctx) {
    final var methodName = "enterAsymmetric_key_option_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAsymmetric_key_password_change_option(
      final TSqlParser.Asymmetric_key_password_change_optionContext ctx) {
    final var methodName = "enterAsymmetric_key_password_change_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterATAN(final TSqlParser.ATANContext ctx) {
    final var methodName = "enterATAN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterATN2(final TSqlParser.ATN2Context ctx) {
    final var methodName = "enterATN2";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAudit_action_spec_group(final TSqlParser.Audit_action_spec_groupContext ctx) {
    final var methodName = "enterAudit_action_spec_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAudit_action_specification(
      final TSqlParser.Audit_action_specificationContext ctx) {
    final var methodName = "enterAudit_action_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAudit_class_name(final TSqlParser.Audit_class_nameContext ctx) {
    final var methodName = "enterAudit_class_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAudit_securable(final TSqlParser.Audit_securableContext ctx) {
    final var methodName = "enterAudit_securable";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAuthorization_grantee(final TSqlParser.Authorization_granteeContext ctx) {
    final var methodName = "enterAuthorization_grantee";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterAuto_option(final TSqlParser.Auto_optionContext ctx) {
    final var methodName = "enterAuto_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBackup_certificate(final TSqlParser.Backup_certificateContext ctx) {
    final var methodName = "enterBackup_certificate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBackup_database(final TSqlParser.Backup_databaseContext ctx) {
    final var methodName = "enterBackup_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBackup_log(final TSqlParser.Backup_logContext ctx) {
    final var methodName = "enterBackup_log";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBackup_master_key(final TSqlParser.Backup_master_keyContext ctx) {
    final var methodName = "enterBackup_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBackup_service_master_key(
      final TSqlParser.Backup_service_master_keyContext ctx) {
    final var methodName = "enterBackup_service_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBackup_statement(final TSqlParser.Backup_statementContext ctx) {
    final var methodName = "enterBackup_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBatch(final TSqlParser.BatchContext ctx) {
    final var methodName = "enterBatch";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBatch_level_statement(final TSqlParser.Batch_level_statementContext ctx) {
    final var methodName = "enterBatch_level_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBegin_conversation_dialog(
      final TSqlParser.Begin_conversation_dialogContext ctx) {
    final var methodName = "enterBegin_conversation_dialog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBegin_conversation_timer(final TSqlParser.Begin_conversation_timerContext ctx) {
    final var methodName = "enterBegin_conversation_timer";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBINARY_CHECKSUM(final TSqlParser.BINARY_CHECKSUMContext ctx) {
    final var methodName = "enterBINARY_CHECKSUM";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBlock_statement(final TSqlParser.Block_statementContext ctx) {
    final var methodName = "enterBlock_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBracket_expression(final TSqlParser.Bracket_expressionContext ctx) {
    final var methodName = "enterBracket_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBreak_statement(final TSqlParser.Break_statementContext ctx) {
    final var methodName = "enterBreak_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBUILT_IN_FUNC(final TSqlParser.BUILT_IN_FUNCContext ctx) {
    final var methodName = "enterBUILT_IN_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterBulk_option(final TSqlParser.Bulk_optionContext ctx) {
    final var methodName = "enterBulk_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCase_expression(final TSqlParser.Case_expressionContext ctx) {
    final var methodName = "enterCase_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCAST(final TSqlParser.CASTContext ctx) {
    final var methodName = "enterCAST";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCEILING(final TSqlParser.CEILINGContext ctx) {
    final var methodName = "enterCEILING";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCERT_ID(final TSqlParser.CERT_IDContext ctx) {
    final var methodName = "enterCERT_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCERTENCODED(final TSqlParser.CERTENCODEDContext ctx) {
    final var methodName = "enterCERTENCODED";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCERTPRIVATEKEY(final TSqlParser.CERTPRIVATEKEYContext ctx) {
    final var methodName = "enterCERTPRIVATEKEY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCfl_statement(final TSqlParser.Cfl_statementContext ctx) {
    final var methodName = "enterCfl_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterChange_table(final TSqlParser.Change_tableContext ctx) {
    final var methodName = "enterChange_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterChange_table_changes(final TSqlParser.Change_table_changesContext ctx) {
    final var methodName = "enterChange_table_changes";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterChange_table_version(final TSqlParser.Change_table_versionContext ctx) {
    final var methodName = "enterChange_table_version";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterChange_tracking_option(final TSqlParser.Change_tracking_optionContext ctx) {
    final var methodName = "enterChange_tracking_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterChange_tracking_option_list(
      final TSqlParser.Change_tracking_option_listContext ctx) {
    final var methodName = "enterChange_tracking_option_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCHAR(final TSqlParser.CHARContext ctx) {
    final var methodName = "enterCHAR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCHARINDEX(final TSqlParser.CHARINDEXContext ctx) {
    final var methodName = "enterCHARINDEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCheck_constraint(final TSqlParser.Check_constraintContext ctx) {
    final var methodName = "enterCheck_constraint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCheckpoint_statement(final TSqlParser.Checkpoint_statementContext ctx) {
    final var methodName = "enterCheckpoint_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCHECKSUM(final TSqlParser.CHECKSUMContext ctx) {
    final var methodName = "enterCHECKSUM";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterClass_type(final TSqlParser.Class_typeContext ctx) {
    final var methodName = "enterClass_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterClass_type_for_azure_dw(final TSqlParser.Class_type_for_azure_dwContext ctx) {
    final var methodName = "enterClass_type_for_azure_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterClass_type_for_grant(final TSqlParser.Class_type_for_grantContext ctx) {
    final var methodName = "enterClass_type_for_grant";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterClass_type_for_parallel_dw(
      final TSqlParser.Class_type_for_parallel_dwContext ctx) {
    final var methodName = "enterClass_type_for_parallel_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterClass_type_for_sql_database(
      final TSqlParser.Class_type_for_sql_databaseContext ctx) {
    final var methodName = "enterClass_type_for_sql_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterClient_assembly_specifier(
      final TSqlParser.Client_assembly_specifierContext ctx) {
    final var methodName = "enterClient_assembly_specifier";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterClose_key(final TSqlParser.Close_keyContext ctx) {
    final var methodName = "enterClose_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterClustered(final TSqlParser.ClusteredContext ctx) {
    final var methodName = "enterClustered";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCOALESCE(final TSqlParser.COALESCEContext ctx) {
    final var methodName = "enterCOALESCE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCOL_LENGTH(final TSqlParser.COL_LENGTHContext ctx) {
    final var methodName = "enterCOL_LENGTH";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCOL_NAME(final TSqlParser.COL_NAMEContext ctx) {
    final var methodName = "enterCOL_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColon_colon(final TSqlParser.Colon_colonContext ctx) {
    final var methodName = "enterColon_colon";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_alias(final TSqlParser.Column_aliasContext ctx) {
    final var methodName = "enterColumn_alias";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_alias_list(final TSqlParser.Column_alias_listContext ctx) {
    final var methodName = "enterColumn_alias_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_constraint(final TSqlParser.Column_constraintContext ctx) {
    final var methodName = "enterColumn_constraint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_declaration(final TSqlParser.Column_declarationContext ctx) {
    final var methodName = "enterColumn_declaration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_def_table_constraint(
      final TSqlParser.Column_def_table_constraintContext ctx) {
    final var methodName = "enterColumn_def_table_constraint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_def_table_constraints(
      final TSqlParser.Column_def_table_constraintsContext ctx) {
    final var methodName = "enterColumn_def_table_constraints";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_definition(final TSqlParser.Column_definitionContext ctx) {
    final var methodName = "enterColumn_definition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_definition_element(
      final TSqlParser.Column_definition_elementContext ctx) {
    final var methodName = "enterColumn_definition_element";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_index(final TSqlParser.Column_indexContext ctx) {
    final var methodName = "enterColumn_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_modifier(final TSqlParser.Column_modifierContext ctx) {
    final var methodName = "enterColumn_modifier";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_name_list(final TSqlParser.Column_name_listContext ctx) {
    final var methodName = "enterColumn_name_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumn_name_list_with_order(
      final TSqlParser.Column_name_list_with_orderContext ctx) {
    final var methodName = "enterColumn_name_list_with_order";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCOLUMNPROPERTY(final TSqlParser.COLUMNPROPERTYContext ctx) {
    final var methodName = "enterCOLUMNPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterColumnstore_index_option(final TSqlParser.Columnstore_index_optionContext ctx) {
    final var methodName = "enterColumnstore_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCommon_table_expression(final TSqlParser.Common_table_expressionContext ctx) {
    final var methodName = "enterCommon_table_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterComparison_operator(final TSqlParser.Comparison_operatorContext ctx) {
    final var methodName = "enterComparison_operator";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCOMPRESS(final TSqlParser.COMPRESSContext ctx) {
    final var methodName = "enterCOMPRESS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCONCAT(final TSqlParser.CONCATContext ctx) {
    final var methodName = "enterCONCAT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCONCAT_WS(final TSqlParser.CONCAT_WSContext ctx) {
    final var methodName = "enterCONCAT_WS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterConnection_node(final TSqlParser.Connection_nodeContext ctx) {
    final var methodName = "enterConnection_node";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCONNECTIONPROPERTY(final TSqlParser.CONNECTIONPROPERTYContext ctx) {
    final var methodName = "enterCONNECTIONPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterConstant(final TSqlParser.ConstantContext ctx) {
    final var methodName = "enterConstant";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterConstant_LOCAL_ID(final TSqlParser.Constant_LOCAL_IDContext ctx) {
    final var methodName = "enterConstant_LOCAL_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterContainment_option(final TSqlParser.Containment_optionContext ctx) {
    final var methodName = "enterContainment_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCONTEXT_INFO(final TSqlParser.CONTEXT_INFOContext ctx) {
    final var methodName = "enterCONTEXT_INFO";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterContinue_statement(final TSqlParser.Continue_statementContext ctx) {
    final var methodName = "enterContinue_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterContract_name(final TSqlParser.Contract_nameContext ctx) {
    final var methodName = "enterContract_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterConversation_statement(final TSqlParser.Conversation_statementContext ctx) {
    final var methodName = "enterConversation_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCONVERT(final TSqlParser.CONVERTContext ctx) {
    final var methodName = "enterCONVERT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCOS(final TSqlParser.COSContext ctx) {
    final var methodName = "enterCOS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCOT(final TSqlParser.COTContext ctx) {
    final var methodName = "enterCOT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_application_role(final TSqlParser.Create_application_roleContext ctx) {
    final var methodName = "enterCreate_application_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_assembly(final TSqlParser.Create_assemblyContext ctx) {
    final var methodName = "enterCreate_assembly";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_asymmetric_key(final TSqlParser.Create_asymmetric_keyContext ctx) {
    final var methodName = "enterCreate_asymmetric_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_certificate(final TSqlParser.Create_certificateContext ctx) {
    final var methodName = "enterCreate_certificate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_column_encryption_key(
      final TSqlParser.Create_column_encryption_keyContext ctx) {
    final var methodName = "enterCreate_column_encryption_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_column_master_key(final TSqlParser.Create_column_master_keyContext ctx) {
    final var methodName = "enterCreate_column_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_columnstore_index(final TSqlParser.Create_columnstore_indexContext ctx) {
    final var methodName = "enterCreate_columnstore_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_columnstore_index_options(
      final TSqlParser.Create_columnstore_index_optionsContext ctx) {
    final var methodName = "enterCreate_columnstore_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_contract(final TSqlParser.Create_contractContext ctx) {
    final var methodName = "enterCreate_contract";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_credential(final TSqlParser.Create_credentialContext ctx) {
    final var methodName = "enterCreate_credential";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_cryptographic_provider(
      final TSqlParser.Create_cryptographic_providerContext ctx) {
    final var methodName = "enterCreate_cryptographic_provider";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_database(final TSqlParser.Create_databaseContext ctx) {
    final var methodName = "enterCreate_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_database_audit_specification(
      final TSqlParser.Create_database_audit_specificationContext ctx) {
    final var methodName = "enterCreate_database_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_database_option(final TSqlParser.Create_database_optionContext ctx) {
    final var methodName = "enterCreate_database_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_db_role(final TSqlParser.Create_db_roleContext ctx) {
    final var methodName = "enterCreate_db_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_endpoint(final TSqlParser.Create_endpointContext ctx) {
    final var methodName = "enterCreate_endpoint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_event_notification(
      final TSqlParser.Create_event_notificationContext ctx) {
    final var methodName = "enterCreate_event_notification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_external_library(final TSqlParser.Create_external_libraryContext ctx) {
    final var methodName = "enterCreate_external_library";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_external_resource_pool(
      final TSqlParser.Create_external_resource_poolContext ctx) {
    final var methodName = "enterCreate_external_resource_pool";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_fulltext_catalog(final TSqlParser.Create_fulltext_catalogContext ctx) {
    final var methodName = "enterCreate_fulltext_catalog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_fulltext_stoplist(final TSqlParser.Create_fulltext_stoplistContext ctx) {
    final var methodName = "enterCreate_fulltext_stoplist";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_index(final TSqlParser.Create_indexContext ctx) {
    final var methodName = "enterCreate_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_index_options(final TSqlParser.Create_index_optionsContext ctx) {
    final var methodName = "enterCreate_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_key(final TSqlParser.Create_keyContext ctx) {
    final var methodName = "enterCreate_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_login_azure_sql(final TSqlParser.Create_login_azure_sqlContext ctx) {
    final var methodName = "enterCreate_login_azure_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_login_pdw(final TSqlParser.Create_login_pdwContext ctx) {
    final var methodName = "enterCreate_login_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_login_sql_server(final TSqlParser.Create_login_sql_serverContext ctx) {
    final var methodName = "enterCreate_login_sql_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_master_key_azure_sql(
      final TSqlParser.Create_master_key_azure_sqlContext ctx) {
    final var methodName = "enterCreate_master_key_azure_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_master_key_sql_server(
      final TSqlParser.Create_master_key_sql_serverContext ctx) {
    final var methodName = "enterCreate_master_key_sql_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_nonclustered_columnstore_index(
      final TSqlParser.Create_nonclustered_columnstore_indexContext ctx) {
    final var methodName = "enterCreate_nonclustered_columnstore_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_or_alter_broker_priority(
      final TSqlParser.Create_or_alter_broker_priorityContext ctx) {
    final var methodName = "enterCreate_or_alter_broker_priority";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_or_alter_ddl_trigger(
      final TSqlParser.Create_or_alter_ddl_triggerContext ctx) {
    final var methodName = "enterCreate_or_alter_ddl_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_or_alter_dml_trigger(
      final TSqlParser.Create_or_alter_dml_triggerContext ctx) {
    final var methodName = "enterCreate_or_alter_dml_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_or_alter_event_session(
      final TSqlParser.Create_or_alter_event_sessionContext ctx) {
    final var methodName = "enterCreate_or_alter_event_session";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_or_alter_function(final TSqlParser.Create_or_alter_functionContext ctx) {
    final var methodName = "enterCreate_or_alter_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_or_alter_procedure(
      final TSqlParser.Create_or_alter_procedureContext ctx) {
    final var methodName = "enterCreate_or_alter_procedure";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_or_alter_trigger(final TSqlParser.Create_or_alter_triggerContext ctx) {
    final var methodName = "enterCreate_or_alter_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_partition_function(
      final TSqlParser.Create_partition_functionContext ctx) {
    final var methodName = "enterCreate_partition_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_partition_scheme(final TSqlParser.Create_partition_schemeContext ctx) {
    final var methodName = "enterCreate_partition_scheme";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_queue(final TSqlParser.Create_queueContext ctx) {
    final var methodName = "enterCreate_queue";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_remote_service_binding(
      final TSqlParser.Create_remote_service_bindingContext ctx) {
    final var methodName = "enterCreate_remote_service_binding";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_resource_pool(final TSqlParser.Create_resource_poolContext ctx) {
    final var methodName = "enterCreate_resource_pool";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_route(final TSqlParser.Create_routeContext ctx) {
    final var methodName = "enterCreate_route";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_rule(final TSqlParser.Create_ruleContext ctx) {
    final var methodName = "enterCreate_rule";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_schema(final TSqlParser.Create_schemaContext ctx) {
    final var methodName = "enterCreate_schema";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_schema_azure_sql_dw_and_pdw(
      final TSqlParser.Create_schema_azure_sql_dw_and_pdwContext ctx) {
    final var methodName = "enterCreate_schema_azure_sql_dw_and_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_search_property_list(
      final TSqlParser.Create_search_property_listContext ctx) {
    final var methodName = "enterCreate_search_property_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_security_policy(final TSqlParser.Create_security_policyContext ctx) {
    final var methodName = "enterCreate_security_policy";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_sequence(final TSqlParser.Create_sequenceContext ctx) {
    final var methodName = "enterCreate_sequence";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_server_audit(final TSqlParser.Create_server_auditContext ctx) {
    final var methodName = "enterCreate_server_audit";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_server_audit_specification(
      final TSqlParser.Create_server_audit_specificationContext ctx) {
    final var methodName = "enterCreate_server_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_server_role(final TSqlParser.Create_server_roleContext ctx) {
    final var methodName = "enterCreate_server_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_service(final TSqlParser.Create_serviceContext ctx) {
    final var methodName = "enterCreate_service";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_statistics(final TSqlParser.Create_statisticsContext ctx) {
    final var methodName = "enterCreate_statistics";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_synonym(final TSqlParser.Create_synonymContext ctx) {
    final var methodName = "enterCreate_synonym";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_table(final TSqlParser.Create_tableContext ctx) {
    final var methodName = "enterCreate_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_table_index_option(
      final TSqlParser.Create_table_index_optionContext ctx) {
    final var methodName = "enterCreate_table_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_table_index_options(
      final TSqlParser.Create_table_index_optionsContext ctx) {
    final var methodName = "enterCreate_table_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_type(final TSqlParser.Create_typeContext ctx) {
    final var methodName = "enterCreate_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_user(final TSqlParser.Create_userContext ctx) {
    final var methodName = "enterCreate_user";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_user_azure_sql_dw(final TSqlParser.Create_user_azure_sql_dwContext ctx) {
    final var methodName = "enterCreate_user_azure_sql_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_view(final TSqlParser.Create_viewContext ctx) {
    final var methodName = "enterCreate_view";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_workload_group(final TSqlParser.Create_workload_groupContext ctx) {
    final var methodName = "enterCreate_workload_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_xml_index(final TSqlParser.Create_xml_indexContext ctx) {
    final var methodName = "enterCreate_xml_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCreate_xml_schema_collection(
      final TSqlParser.Create_xml_schema_collectionContext ctx) {
    final var methodName = "enterCreate_xml_schema_collection";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCross_join(final TSqlParser.Cross_joinContext ctx) {
    final var methodName = "enterCross_join";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCURRENT_DATE(final TSqlParser.CURRENT_DATEContext ctx) {
    final var methodName = "enterCURRENT_DATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCURRENT_REQUEST_ID(final TSqlParser.CURRENT_REQUEST_IDContext ctx) {
    final var methodName = "enterCURRENT_REQUEST_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCURRENT_TIMESTAMP(final TSqlParser.CURRENT_TIMESTAMPContext ctx) {
    final var methodName = "enterCURRENT_TIMESTAMP";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCURRENT_TIMEZONE(final TSqlParser.CURRENT_TIMEZONEContext ctx) {
    final var methodName = "enterCURRENT_TIMEZONE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCURRENT_TIMEZONE_ID(final TSqlParser.CURRENT_TIMEZONE_IDContext ctx) {
    final var methodName = "enterCURRENT_TIMEZONE_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCURRENT_TRANSACTION_ID(final TSqlParser.CURRENT_TRANSACTION_IDContext ctx) {
    final var methodName = "enterCURRENT_TRANSACTION_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCURRENT_USER(final TSqlParser.CURRENT_USERContext ctx) {
    final var methodName = "enterCURRENT_USER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCursor_name(final TSqlParser.Cursor_nameContext ctx) {
    final var methodName = "enterCursor_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCursor_option(final TSqlParser.Cursor_optionContext ctx) {
    final var methodName = "enterCursor_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCURSOR_ROWS(final TSqlParser.CURSOR_ROWSContext ctx) {
    final var methodName = "enterCURSOR_ROWS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCursor_statement(final TSqlParser.Cursor_statementContext ctx) {
    final var methodName = "enterCursor_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterCURSOR_STATUS(final TSqlParser.CURSOR_STATUSContext ctx) {
    final var methodName = "enterCURSOR_STATUS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterData_type(final TSqlParser.Data_typeContext ctx) {
    final var methodName = "enterData_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDatabase_file_spec(final TSqlParser.Database_file_specContext ctx) {
    final var methodName = "enterDatabase_file_spec";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDatabase_filestream_option(
      final TSqlParser.Database_filestream_optionContext ctx) {
    final var methodName = "enterDatabase_filestream_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDatabase_mirroring_option(
      final TSqlParser.Database_mirroring_optionContext ctx) {
    final var methodName = "enterDatabase_mirroring_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDatabase_optionspec(final TSqlParser.Database_optionspecContext ctx) {
    final var methodName = "enterDatabase_optionspec";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATABASE_PRINCIPAL_ID(final TSqlParser.DATABASE_PRINCIPAL_IDContext ctx) {
    final var methodName = "enterDATABASE_PRINCIPAL_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATABASEPROPERTYEX(final TSqlParser.DATABASEPROPERTYEXContext ctx) {
    final var methodName = "enterDATABASEPROPERTYEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATALENGTH(final TSqlParser.DATALENGTHContext ctx) {
    final var methodName = "enterDATALENGTH";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATE_BUCKET(final TSqlParser.DATE_BUCKETContext ctx) {
    final var methodName = "enterDATE_BUCKET";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDate_correlation_optimization_option(
      final TSqlParser.Date_correlation_optimization_optionContext ctx) {
    final var methodName = "enterDate_correlation_optimization_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDate_options(final TSqlParser.Date_optionsContext ctx) {
    final var methodName = "enterDate_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATEADD(final TSqlParser.DATEADDContext ctx) {
    final var methodName = "enterDATEADD";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATEDIFF(final TSqlParser.DATEDIFFContext ctx) {
    final var methodName = "enterDATEDIFF";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATEDIFF_BIG(final TSqlParser.DATEDIFF_BIGContext ctx) {
    final var methodName = "enterDATEDIFF_BIG";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATEFROMPARTS(final TSqlParser.DATEFROMPARTSContext ctx) {
    final var methodName = "enterDATEFROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATENAME(final TSqlParser.DATENAMEContext ctx) {
    final var methodName = "enterDATENAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATEPART(final TSqlParser.DATEPARTContext ctx) {
    final var methodName = "enterDATEPART";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDateparts_12(final TSqlParser.Dateparts_12Context ctx) {
    final var methodName = "enterDateparts_12";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDateparts_15(final TSqlParser.Dateparts_15Context ctx) {
    final var methodName = "enterDateparts_15";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDateparts_9(final TSqlParser.Dateparts_9Context ctx) {
    final var methodName = "enterDateparts_9";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDateparts_datetrunc(final TSqlParser.Dateparts_datetruncContext ctx) {
    final var methodName = "enterDateparts_datetrunc";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATETIME2FROMPARTS(final TSqlParser.DATETIME2FROMPARTSContext ctx) {
    final var methodName = "enterDATETIME2FROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATETIMEFROMPARTS(final TSqlParser.DATETIMEFROMPARTSContext ctx) {
    final var methodName = "enterDATETIMEFROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATETIMEOFFSETFROMPARTS(final TSqlParser.DATETIMEOFFSETFROMPARTSContext ctx) {
    final var methodName = "enterDATETIMEOFFSETFROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDATETRUNC(final TSqlParser.DATETRUNCContext ctx) {
    final var methodName = "enterDATETRUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDAY(final TSqlParser.DAYContext ctx) {
    final var methodName = "enterDAY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDb_encryption_option(final TSqlParser.Db_encryption_optionContext ctx) {
    final var methodName = "enterDb_encryption_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDB_ID(final TSqlParser.DB_IDContext ctx) {
    final var methodName = "enterDB_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDB_NAME(final TSqlParser.DB_NAMEContext ctx) {
    final var methodName = "enterDB_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDb_state_option(final TSqlParser.Db_state_optionContext ctx) {
    final var methodName = "enterDb_state_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDb_update_option(final TSqlParser.Db_update_optionContext ctx) {
    final var methodName = "enterDb_update_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDb_user_access_option(final TSqlParser.Db_user_access_optionContext ctx) {
    final var methodName = "enterDb_user_access_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_checkalloc(final TSqlParser.Dbcc_checkallocContext ctx) {
    final var methodName = "enterDbcc_checkalloc";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_checkalloc_option(final TSqlParser.Dbcc_checkalloc_optionContext ctx) {
    final var methodName = "enterDbcc_checkalloc_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_checkcatalog(final TSqlParser.Dbcc_checkcatalogContext ctx) {
    final var methodName = "enterDbcc_checkcatalog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_checkconstraints(final TSqlParser.Dbcc_checkconstraintsContext ctx) {
    final var methodName = "enterDbcc_checkconstraints";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_checkconstraints_option(
      final TSqlParser.Dbcc_checkconstraints_optionContext ctx) {
    final var methodName = "enterDbcc_checkconstraints_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_checkdb(final TSqlParser.Dbcc_checkdbContext ctx) {
    final var methodName = "enterDbcc_checkdb";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_checkdb_table_option(
      final TSqlParser.Dbcc_checkdb_table_optionContext ctx) {
    final var methodName = "enterDbcc_checkdb_table_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_checkfilegroup(final TSqlParser.Dbcc_checkfilegroupContext ctx) {
    final var methodName = "enterDbcc_checkfilegroup";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_checkfilegroup_option(
      final TSqlParser.Dbcc_checkfilegroup_optionContext ctx) {
    final var methodName = "enterDbcc_checkfilegroup_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_checktable(final TSqlParser.Dbcc_checktableContext ctx) {
    final var methodName = "enterDbcc_checktable";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_clause(final TSqlParser.Dbcc_clauseContext ctx) {
    final var methodName = "enterDbcc_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_cleantable(final TSqlParser.Dbcc_cleantableContext ctx) {
    final var methodName = "enterDbcc_cleantable";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_clonedatabase(final TSqlParser.Dbcc_clonedatabaseContext ctx) {
    final var methodName = "enterDbcc_clonedatabase";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_clonedatabase_option(
      final TSqlParser.Dbcc_clonedatabase_optionContext ctx) {
    final var methodName = "enterDbcc_clonedatabase_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_dbreindex(final TSqlParser.Dbcc_dbreindexContext ctx) {
    final var methodName = "enterDbcc_dbreindex";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_dll_free(final TSqlParser.Dbcc_dll_freeContext ctx) {
    final var methodName = "enterDbcc_dll_free";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_dropcleanbuffers(final TSqlParser.Dbcc_dropcleanbuffersContext ctx) {
    final var methodName = "enterDbcc_dropcleanbuffers";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_pdw_showspaceused(final TSqlParser.Dbcc_pdw_showspaceusedContext ctx) {
    final var methodName = "enterDbcc_pdw_showspaceused";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_proccache(final TSqlParser.Dbcc_proccacheContext ctx) {
    final var methodName = "enterDbcc_proccache";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_showcontig(final TSqlParser.Dbcc_showcontigContext ctx) {
    final var methodName = "enterDbcc_showcontig";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_showcontig_option(final TSqlParser.Dbcc_showcontig_optionContext ctx) {
    final var methodName = "enterDbcc_showcontig_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDbcc_shrinklog(final TSqlParser.Dbcc_shrinklogContext ctx) {
    final var methodName = "enterDbcc_shrinklog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDdl_clause(final TSqlParser.Ddl_clauseContext ctx) {
    final var methodName = "enterDdl_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDdl_object(final TSqlParser.Ddl_objectContext ctx) {
    final var methodName = "enterDdl_object";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDdl_trigger_operation(final TSqlParser.Ddl_trigger_operationContext ctx) {
    final var methodName = "enterDdl_trigger_operation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDeclare_cursor(final TSqlParser.Declare_cursorContext ctx) {
    final var methodName = "enterDeclare_cursor";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDeclare_local(final TSqlParser.Declare_localContext ctx) {
    final var methodName = "enterDeclare_local";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDeclare_set_cursor_common(
      final TSqlParser.Declare_set_cursor_commonContext ctx) {
    final var methodName = "enterDeclare_set_cursor_common";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDeclare_set_cursor_common_partial(
      final TSqlParser.Declare_set_cursor_common_partialContext ctx) {
    final var methodName = "enterDeclare_set_cursor_common_partial";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDeclare_statement(final TSqlParser.Declare_statementContext ctx) {
    final var methodName = "enterDeclare_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDECOMPRESS(final TSqlParser.DECOMPRESSContext ctx) {
    final var methodName = "enterDECOMPRESS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDecryption_mechanism(final TSqlParser.Decryption_mechanismContext ctx) {
    final var methodName = "enterDecryption_mechanism";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDEGREES(final TSqlParser.DEGREESContext ctx) {
    final var methodName = "enterDEGREES";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDelayed_durability_option(
      final TSqlParser.Delayed_durability_optionContext ctx) {
    final var methodName = "enterDelayed_durability_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDelete_statement(final TSqlParser.Delete_statementContext ctx) {
    final var methodName = "enterDelete_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDelete_statement_from(final TSqlParser.Delete_statement_fromContext ctx) {
    final var methodName = "enterDelete_statement_from";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDeprecated_table_hint(final TSqlParser.Deprecated_table_hintContext ctx) {
    final var methodName = "enterDeprecated_table_hint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDerived_table(final TSqlParser.Derived_tableContext ctx) {
    final var methodName = "enterDerived_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDIFFERENCE(final TSqlParser.DIFFERENCEContext ctx) {
    final var methodName = "enterDIFFERENCE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDisable_trigger(final TSqlParser.Disable_triggerContext ctx) {
    final var methodName = "enterDisable_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDml_clause(final TSqlParser.Dml_clauseContext ctx) {
    final var methodName = "enterDml_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDml_trigger_operation(final TSqlParser.Dml_trigger_operationContext ctx) {
    final var methodName = "enterDml_trigger_operation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDml_trigger_option(final TSqlParser.Dml_trigger_optionContext ctx) {
    final var methodName = "enterDml_trigger_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_aggregate(final TSqlParser.Drop_aggregateContext ctx) {
    final var methodName = "enterDrop_aggregate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_application_role(final TSqlParser.Drop_application_roleContext ctx) {
    final var methodName = "enterDrop_application_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_assembly(final TSqlParser.Drop_assemblyContext ctx) {
    final var methodName = "enterDrop_assembly";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_asymmetric_key(final TSqlParser.Drop_asymmetric_keyContext ctx) {
    final var methodName = "enterDrop_asymmetric_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_availability_group(final TSqlParser.Drop_availability_groupContext ctx) {
    final var methodName = "enterDrop_availability_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_backward_compatible_index(
      final TSqlParser.Drop_backward_compatible_indexContext ctx) {
    final var methodName = "enterDrop_backward_compatible_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_broker_priority(final TSqlParser.Drop_broker_priorityContext ctx) {
    final var methodName = "enterDrop_broker_priority";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_certificate(final TSqlParser.Drop_certificateContext ctx) {
    final var methodName = "enterDrop_certificate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_column_encryption_key(
      final TSqlParser.Drop_column_encryption_keyContext ctx) {
    final var methodName = "enterDrop_column_encryption_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_column_master_key(final TSqlParser.Drop_column_master_keyContext ctx) {
    final var methodName = "enterDrop_column_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_contract(final TSqlParser.Drop_contractContext ctx) {
    final var methodName = "enterDrop_contract";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_credential(final TSqlParser.Drop_credentialContext ctx) {
    final var methodName = "enterDrop_credential";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_cryptograhic_provider(
      final TSqlParser.Drop_cryptograhic_providerContext ctx) {
    final var methodName = "enterDrop_cryptograhic_provider";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_database(final TSqlParser.Drop_databaseContext ctx) {
    final var methodName = "enterDrop_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_database_audit_specification(
      final TSqlParser.Drop_database_audit_specificationContext ctx) {
    final var methodName = "enterDrop_database_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_database_encryption_key(
      final TSqlParser.Drop_database_encryption_keyContext ctx) {
    final var methodName = "enterDrop_database_encryption_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_database_scoped_credential(
      final TSqlParser.Drop_database_scoped_credentialContext ctx) {
    final var methodName = "enterDrop_database_scoped_credential";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_db_role(final TSqlParser.Drop_db_roleContext ctx) {
    final var methodName = "enterDrop_db_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_ddl_trigger(final TSqlParser.Drop_ddl_triggerContext ctx) {
    final var methodName = "enterDrop_ddl_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_default(final TSqlParser.Drop_defaultContext ctx) {
    final var methodName = "enterDrop_default";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_dml_trigger(final TSqlParser.Drop_dml_triggerContext ctx) {
    final var methodName = "enterDrop_dml_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_endpoint(final TSqlParser.Drop_endpointContext ctx) {
    final var methodName = "enterDrop_endpoint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_event_notifications(final TSqlParser.Drop_event_notificationsContext ctx) {
    final var methodName = "enterDrop_event_notifications";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_event_session(final TSqlParser.Drop_event_sessionContext ctx) {
    final var methodName = "enterDrop_event_session";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_external_data_source(
      final TSqlParser.Drop_external_data_sourceContext ctx) {
    final var methodName = "enterDrop_external_data_source";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_external_file_format(
      final TSqlParser.Drop_external_file_formatContext ctx) {
    final var methodName = "enterDrop_external_file_format";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_external_library(final TSqlParser.Drop_external_libraryContext ctx) {
    final var methodName = "enterDrop_external_library";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_external_resource_pool(
      final TSqlParser.Drop_external_resource_poolContext ctx) {
    final var methodName = "enterDrop_external_resource_pool";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_external_table(final TSqlParser.Drop_external_tableContext ctx) {
    final var methodName = "enterDrop_external_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_fulltext_catalog(final TSqlParser.Drop_fulltext_catalogContext ctx) {
    final var methodName = "enterDrop_fulltext_catalog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_fulltext_index(final TSqlParser.Drop_fulltext_indexContext ctx) {
    final var methodName = "enterDrop_fulltext_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_fulltext_stoplist(final TSqlParser.Drop_fulltext_stoplistContext ctx) {
    final var methodName = "enterDrop_fulltext_stoplist";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_function(final TSqlParser.Drop_functionContext ctx) {
    final var methodName = "enterDrop_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_index(final TSqlParser.Drop_indexContext ctx) {
    final var methodName = "enterDrop_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_login(final TSqlParser.Drop_loginContext ctx) {
    final var methodName = "enterDrop_login";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_master_key(final TSqlParser.Drop_master_keyContext ctx) {
    final var methodName = "enterDrop_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_message_type(final TSqlParser.Drop_message_typeContext ctx) {
    final var methodName = "enterDrop_message_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_partition_function(final TSqlParser.Drop_partition_functionContext ctx) {
    final var methodName = "enterDrop_partition_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_partition_scheme(final TSqlParser.Drop_partition_schemeContext ctx) {
    final var methodName = "enterDrop_partition_scheme";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_procedure(final TSqlParser.Drop_procedureContext ctx) {
    final var methodName = "enterDrop_procedure";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_queue(final TSqlParser.Drop_queueContext ctx) {
    final var methodName = "enterDrop_queue";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_relational_or_xml_or_spatial_index(
      final TSqlParser.Drop_relational_or_xml_or_spatial_indexContext ctx) {
    final var methodName = "enterDrop_relational_or_xml_or_spatial_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_remote_service_binding(
      final TSqlParser.Drop_remote_service_bindingContext ctx) {
    final var methodName = "enterDrop_remote_service_binding";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_resource_pool(final TSqlParser.Drop_resource_poolContext ctx) {
    final var methodName = "enterDrop_resource_pool";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_route(final TSqlParser.Drop_routeContext ctx) {
    final var methodName = "enterDrop_route";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_rule(final TSqlParser.Drop_ruleContext ctx) {
    final var methodName = "enterDrop_rule";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_schema(final TSqlParser.Drop_schemaContext ctx) {
    final var methodName = "enterDrop_schema";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_search_property_list(
      final TSqlParser.Drop_search_property_listContext ctx) {
    final var methodName = "enterDrop_search_property_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_security_policy(final TSqlParser.Drop_security_policyContext ctx) {
    final var methodName = "enterDrop_security_policy";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_sequence(final TSqlParser.Drop_sequenceContext ctx) {
    final var methodName = "enterDrop_sequence";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_server_audit(final TSqlParser.Drop_server_auditContext ctx) {
    final var methodName = "enterDrop_server_audit";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_server_audit_specification(
      final TSqlParser.Drop_server_audit_specificationContext ctx) {
    final var methodName = "enterDrop_server_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_server_role(final TSqlParser.Drop_server_roleContext ctx) {
    final var methodName = "enterDrop_server_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_service(final TSqlParser.Drop_serviceContext ctx) {
    final var methodName = "enterDrop_service";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_signature(final TSqlParser.Drop_signatureContext ctx) {
    final var methodName = "enterDrop_signature";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_statistics(final TSqlParser.Drop_statisticsContext ctx) {
    final var methodName = "enterDrop_statistics";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_statistics_name_azure_dw_and_pdw(
      final TSqlParser.Drop_statistics_name_azure_dw_and_pdwContext ctx) {
    final var methodName = "enterDrop_statistics_name_azure_dw_and_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_symmetric_key(final TSqlParser.Drop_symmetric_keyContext ctx) {
    final var methodName = "enterDrop_symmetric_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_synonym(final TSqlParser.Drop_synonymContext ctx) {
    final var methodName = "enterDrop_synonym";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_table(final TSqlParser.Drop_tableContext ctx) {
    final var methodName = "enterDrop_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_trigger(final TSqlParser.Drop_triggerContext ctx) {
    final var methodName = "enterDrop_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_type(final TSqlParser.Drop_typeContext ctx) {
    final var methodName = "enterDrop_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_user(final TSqlParser.Drop_userContext ctx) {
    final var methodName = "enterDrop_user";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_view(final TSqlParser.Drop_viewContext ctx) {
    final var methodName = "enterDrop_view";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_workload_group(final TSqlParser.Drop_workload_groupContext ctx) {
    final var methodName = "enterDrop_workload_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterDrop_xml_schema_collection(
      final TSqlParser.Drop_xml_schema_collectionContext ctx) {
    final var methodName = "enterDrop_xml_schema_collection";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEmpty_statement(final TSqlParser.Empty_statementContext ctx) {
    final var methodName = "enterEmpty_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEnable_trigger(final TSqlParser.Enable_triggerContext ctx) {
    final var methodName = "enterEnable_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEncryption_mechanism(final TSqlParser.Encryption_mechanismContext ctx) {
    final var methodName = "enterEncryption_mechanism";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEnd_conversation(final TSqlParser.End_conversationContext ctx) {
    final var methodName = "enterEnd_conversation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEndpoint_authentication_clause(
      final TSqlParser.Endpoint_authentication_clauseContext ctx) {
    final var methodName = "enterEndpoint_authentication_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEndpoint_encryption_alogorithm_clause(
      final TSqlParser.Endpoint_encryption_alogorithm_clauseContext ctx) {
    final var methodName = "enterEndpoint_encryption_alogorithm_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEndpoint_listener_clause(final TSqlParser.Endpoint_listener_clauseContext ctx) {
    final var methodName = "enterEndpoint_listener_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEntity_name(final TSqlParser.Entity_nameContext ctx) {
    final var methodName = "enterEntity_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEntity_name_for_azure_dw(final TSqlParser.Entity_name_for_azure_dwContext ctx) {
    final var methodName = "enterEntity_name_for_azure_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEntity_name_for_parallel_dw(
      final TSqlParser.Entity_name_for_parallel_dwContext ctx) {
    final var methodName = "enterEntity_name_for_parallel_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEntity_to(final TSqlParser.Entity_toContext ctx) {
    final var methodName = "enterEntity_to";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEOMONTH(final TSqlParser.EOMONTHContext ctx) {
    final var methodName = "enterEOMONTH";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterERROR_LINE(final TSqlParser.ERROR_LINEContext ctx) {
    final var methodName = "enterERROR_LINE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterERROR_MESSAGE(final TSqlParser.ERROR_MESSAGEContext ctx) {
    final var methodName = "enterERROR_MESSAGE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterERROR_NUMBER(final TSqlParser.ERROR_NUMBERContext ctx) {
    final var methodName = "enterERROR_NUMBER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterERROR_PROCEDURE(final TSqlParser.ERROR_PROCEDUREContext ctx) {
    final var methodName = "enterERROR_PROCEDURE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterERROR_SEVERITY(final TSqlParser.ERROR_SEVERITYContext ctx) {
    final var methodName = "enterERROR_SEVERITY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterERROR_STATE(final TSqlParser.ERROR_STATEContext ctx) {
    final var methodName = "enterERROR_STATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEvent_session_predicate_expression(
      final TSqlParser.Event_session_predicate_expressionContext ctx) {
    final var methodName = "enterEvent_session_predicate_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEvent_session_predicate_factor(
      final TSqlParser.Event_session_predicate_factorContext ctx) {
    final var methodName = "enterEvent_session_predicate_factor";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEvent_session_predicate_leaf(
      final TSqlParser.Event_session_predicate_leafContext ctx) {
    final var methodName = "enterEvent_session_predicate_leaf";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    final var methodName = "enterEveryRule";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExecute_body(final TSqlParser.Execute_bodyContext ctx) {
    final var methodName = "enterExecute_body";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExecute_body_batch(final TSqlParser.Execute_body_batchContext ctx) {
    final var methodName = "enterExecute_body_batch";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExecute_clause(final TSqlParser.Execute_clauseContext ctx) {
    final var methodName = "enterExecute_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExecute_parameter(final TSqlParser.Execute_parameterContext ctx) {
    final var methodName = "enterExecute_parameter";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExecute_statement(final TSqlParser.Execute_statementContext ctx) {
    final var methodName = "enterExecute_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExecute_statement_arg(final TSqlParser.Execute_statement_argContext ctx) {
    final var methodName = "enterExecute_statement_arg";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExecute_statement_arg_named(
      final TSqlParser.Execute_statement_arg_namedContext ctx) {
    final var methodName = "enterExecute_statement_arg_named";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExecute_statement_arg_unnamed(
      final TSqlParser.Execute_statement_arg_unnamedContext ctx) {
    final var methodName = "enterExecute_statement_arg_unnamed";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExecute_var_string(final TSqlParser.Execute_var_stringContext ctx) {
    final var methodName = "enterExecute_var_string";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExist_call(final TSqlParser.Exist_callContext ctx) {
    final var methodName = "enterExist_call";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExist_method(final TSqlParser.Exist_methodContext ctx) {
    final var methodName = "enterExist_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExisting_keys(final TSqlParser.Existing_keysContext ctx) {
    final var methodName = "enterExisting_keys";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterEXP(final TSqlParser.EXPContext ctx) {
    final var methodName = "enterEXP";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExpression(final TSqlParser.ExpressionContext ctx) {
    final var methodName = "enterExpression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExpression_elem(final TSqlParser.Expression_elemContext ctx) {
    final var methodName = "enterExpression_elem";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExpression_list_(final TSqlParser.Expression_list_Context ctx) {
    final var methodName = "enterExpression_list_";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterExternal_access_option(final TSqlParser.External_access_optionContext ctx) {
    final var methodName = "enterExternal_access_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFetch_cursor(final TSqlParser.Fetch_cursorContext ctx) {
    final var methodName = "enterFetch_cursor";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFETCH_STATUS(final TSqlParser.FETCH_STATUSContext ctx) {
    final var methodName = "enterFETCH_STATUS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFile_directory_path_separator(
      final TSqlParser.File_directory_path_separatorContext ctx) {
    final var methodName = "enterFile_directory_path_separator";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFile_group(final TSqlParser.File_groupContext ctx) {
    final var methodName = "enterFile_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFILE_ID(final TSqlParser.FILE_IDContext ctx) {
    final var methodName = "enterFILE_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFILE_IDEX(final TSqlParser.FILE_IDEXContext ctx) {
    final var methodName = "enterFILE_IDEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFILE_NAME(final TSqlParser.FILE_NAMEContext ctx) {
    final var methodName = "enterFILE_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFile_path(final TSqlParser.File_pathContext ctx) {
    final var methodName = "enterFile_path";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFile_size(final TSqlParser.File_sizeContext ctx) {
    final var methodName = "enterFile_size";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFile_spec(final TSqlParser.File_specContext ctx) {
    final var methodName = "enterFile_spec";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFILEGROUP_ID(final TSqlParser.FILEGROUP_IDContext ctx) {
    final var methodName = "enterFILEGROUP_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFILEGROUP_NAME(final TSqlParser.FILEGROUP_NAMEContext ctx) {
    final var methodName = "enterFILEGROUP_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFilegroup_updatability_option(
      final TSqlParser.Filegroup_updatability_optionContext ctx) {
    final var methodName = "enterFilegroup_updatability_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFILEGROUPPROPERTY(final TSqlParser.FILEGROUPPROPERTYContext ctx) {
    final var methodName = "enterFILEGROUPPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFILEPROPERTY(final TSqlParser.FILEPROPERTYContext ctx) {
    final var methodName = "enterFILEPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFILEPROPERTYEX(final TSqlParser.FILEPROPERTYEXContext ctx) {
    final var methodName = "enterFILEPROPERTYEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFilespec(final TSqlParser.FilespecContext ctx) {
    final var methodName = "enterFilespec";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFLOOR(final TSqlParser.FLOORContext ctx) {
    final var methodName = "enterFLOOR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFor_clause(final TSqlParser.For_clauseContext ctx) {
    final var methodName = "enterFor_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterForeign_key_options(final TSqlParser.Foreign_key_optionsContext ctx) {
    final var methodName = "enterForeign_key_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFORMAT(final TSqlParser.FORMATContext ctx) {
    final var methodName = "enterFORMAT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFORMATMESSAGE(final TSqlParser.FORMATMESSAGEContext ctx) {
    final var methodName = "enterFORMATMESSAGE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFREE_TEXT(final TSqlParser.FREE_TEXTContext ctx) {
    final var methodName = "enterFREE_TEXT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFreetext_function(final TSqlParser.Freetext_functionContext ctx) {
    final var methodName = "enterFreetext_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFreetext_predicate(final TSqlParser.Freetext_predicateContext ctx) {
    final var methodName = "enterFreetext_predicate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFull_column_name(final TSqlParser.Full_column_nameContext ctx) {
    final var methodName = "enterFull_column_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFull_column_name_list(final TSqlParser.Full_column_name_listContext ctx) {
    final var methodName = "enterFull_column_name_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFull_table_name(final TSqlParser.Full_table_nameContext ctx) {
    final var methodName = "enterFull_table_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFULLTEXTCATALOGPROPERTY(final TSqlParser.FULLTEXTCATALOGPROPERTYContext ctx) {
    final var methodName = "enterFULLTEXTCATALOGPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFULLTEXTSERVICEPROPERTY(final TSqlParser.FULLTEXTSERVICEPROPERTYContext ctx) {
    final var methodName = "enterFULLTEXTSERVICEPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFunc_body_returns_scalar(final TSqlParser.Func_body_returns_scalarContext ctx) {
    final var methodName = "enterFunc_body_returns_scalar";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFunc_body_returns_select(final TSqlParser.Func_body_returns_selectContext ctx) {
    final var methodName = "enterFunc_body_returns_select";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFunc_body_returns_table(final TSqlParser.Func_body_returns_tableContext ctx) {
    final var methodName = "enterFunc_body_returns_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFunc_proc_name_database_schema(
      final TSqlParser.Func_proc_name_database_schemaContext ctx) {
    final var methodName = "enterFunc_proc_name_database_schema";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFunc_proc_name_schema(final TSqlParser.Func_proc_name_schemaContext ctx) {
    final var methodName = "enterFunc_proc_name_schema";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFunc_proc_name_server_database_schema(
      final TSqlParser.Func_proc_name_server_database_schemaContext ctx) {
    final var methodName = "enterFunc_proc_name_server_database_schema";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterFunction_option(final TSqlParser.Function_optionContext ctx) {
    final var methodName = "enterFunction_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGenerate_new_keys(final TSqlParser.Generate_new_keysContext ctx) {
    final var methodName = "enterGenerate_new_keys";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGet_conversation(final TSqlParser.Get_conversationContext ctx) {
    final var methodName = "enterGet_conversation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGET_FILESTREAM_TRANSACTION_CONTEXT(
      final TSqlParser.GET_FILESTREAM_TRANSACTION_CONTEXTContext ctx) {
    final var methodName = "enterGET_FILESTREAM_TRANSACTION_CONTEXT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGETANSINULL(final TSqlParser.GETANSINULLContext ctx) {
    final var methodName = "enterGETANSINULL";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGETDATE(final TSqlParser.GETDATEContext ctx) {
    final var methodName = "enterGETDATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGETUTCDATE(final TSqlParser.GETUTCDATEContext ctx) {
    final var methodName = "enterGETUTCDATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGo_statement(final TSqlParser.Go_statementContext ctx) {
    final var methodName = "enterGo_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGoto_statement(final TSqlParser.Goto_statementContext ctx) {
    final var methodName = "enterGoto_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGrant_permission(final TSqlParser.Grant_permissionContext ctx) {
    final var methodName = "enterGrant_permission";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGREATEST(final TSqlParser.GREATESTContext ctx) {
    final var methodName = "enterGREATEST";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGroup_by_item(final TSqlParser.Group_by_itemContext ctx) {
    final var methodName = "enterGroup_by_item";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterGrouping_sets_item(final TSqlParser.Grouping_sets_itemContext ctx) {
    final var methodName = "enterGrouping_sets_item";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterHadr_options(final TSqlParser.Hadr_optionsContext ctx) {
    final var methodName = "enterHadr_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterHAS_DBACCESS(final TSqlParser.HAS_DBACCESSContext ctx) {
    final var methodName = "enterHAS_DBACCESS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterHAS_PERMS_BY_NAME(final TSqlParser.HAS_PERMS_BY_NAMEContext ctx) {
    final var methodName = "enterHAS_PERMS_BY_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterHierarchyid_call(final TSqlParser.Hierarchyid_callContext ctx) {
    final var methodName = "enterHierarchyid_call";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterHIERARCHYID_METHOD(final TSqlParser.HIERARCHYID_METHODContext ctx) {
    final var methodName = "enterHIERARCHYID_METHOD";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterHierarchyid_static_method(
      final TSqlParser.Hierarchyid_static_methodContext ctx) {
    final var methodName = "enterHierarchyid_static_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterHost(final TSqlParser.HostContext ctx) {
    final var methodName = "enterHost";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterHOST_ID(final TSqlParser.HOST_IDContext ctx) {
    final var methodName = "enterHOST_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterHOST_NAME(final TSqlParser.HOST_NAMEContext ctx) {
    final var methodName = "enterHOST_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterId_(final TSqlParser.Id_Context ctx) {
    final var methodName = "enterId_";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterId_or_string(final TSqlParser.Id_or_stringContext ctx) {
    final var methodName = "enterId_or_string";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIDENT_CURRENT(final TSqlParser.IDENT_CURRENTContext ctx) {
    final var methodName = "enterIDENT_CURRENT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIDENT_INCR(final TSqlParser.IDENT_INCRContext ctx) {
    final var methodName = "enterIDENT_INCR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIDENT_SEED(final TSqlParser.IDENT_SEEDContext ctx) {
    final var methodName = "enterIDENT_SEED";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIDENTITY(final TSqlParser.IDENTITYContext ctx) {
    final var methodName = "enterIDENTITY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIf_statement(final TSqlParser.If_statementContext ctx) {
    final var methodName = "enterIf_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIIF(final TSqlParser.IIFContext ctx) {
    final var methodName = "enterIIF";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterINDEX_COL(final TSqlParser.INDEX_COLContext ctx) {
    final var methodName = "enterINDEX_COL";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIndex_value(final TSqlParser.Index_valueContext ctx) {
    final var methodName = "enterIndex_value";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterINDEXKEY_PROPERTY(final TSqlParser.INDEXKEY_PROPERTYContext ctx) {
    final var methodName = "enterINDEXKEY_PROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterINDEXPROPERTY(final TSqlParser.INDEXPROPERTYContext ctx) {
    final var methodName = "enterINDEXPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterInsert_column_id(final TSqlParser.Insert_column_idContext ctx) {
    final var methodName = "enterInsert_column_id";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterInsert_column_name_list(final TSqlParser.Insert_column_name_listContext ctx) {
    final var methodName = "enterInsert_column_name_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterInsert_statement(final TSqlParser.Insert_statementContext ctx) {
    final var methodName = "enterInsert_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterInsert_statement_value(final TSqlParser.Insert_statement_valueContext ctx) {
    final var methodName = "enterInsert_statement_value";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIp_v4_failover(final TSqlParser.Ip_v4_failoverContext ctx) {
    final var methodName = "enterIp_v4_failover";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIp_v6_failover(final TSqlParser.Ip_v6_failoverContext ctx) {
    final var methodName = "enterIp_v6_failover";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIS_MEMBER(final TSqlParser.IS_MEMBERContext ctx) {
    final var methodName = "enterIS_MEMBER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIS_ROLEMEMBER(final TSqlParser.IS_ROLEMEMBERContext ctx) {
    final var methodName = "enterIS_ROLEMEMBER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterIS_SRVROLEMEMBER(final TSqlParser.IS_SRVROLEMEMBERContext ctx) {
    final var methodName = "enterIS_SRVROLEMEMBER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterISDATE(final TSqlParser.ISDATEContext ctx) {
    final var methodName = "enterISDATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterISJSON(final TSqlParser.ISJSONContext ctx) {
    final var methodName = "enterISJSON";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterISNULL(final TSqlParser.ISNULLContext ctx) {
    final var methodName = "enterISNULL";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterISNUMERIC(final TSqlParser.ISNUMERICContext ctx) {
    final var methodName = "enterISNUMERIC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJoin_on(final TSqlParser.Join_onContext ctx) {
    final var methodName = "enterJoin_on";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJoin_part(final TSqlParser.Join_partContext ctx) {
    final var methodName = "enterJoin_part";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJSON_ARRAY(final TSqlParser.JSON_ARRAYContext ctx) {
    final var methodName = "enterJSON_ARRAY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJson_column_declaration(final TSqlParser.Json_column_declarationContext ctx) {
    final var methodName = "enterJson_column_declaration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJson_declaration(final TSqlParser.Json_declarationContext ctx) {
    final var methodName = "enterJson_declaration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJson_key_value(final TSqlParser.Json_key_valueContext ctx) {
    final var methodName = "enterJson_key_value";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJSON_MODIFY(final TSqlParser.JSON_MODIFYContext ctx) {
    final var methodName = "enterJSON_MODIFY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJson_null_clause(final TSqlParser.Json_null_clauseContext ctx) {
    final var methodName = "enterJson_null_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJSON_OBJECT(final TSqlParser.JSON_OBJECTContext ctx) {
    final var methodName = "enterJSON_OBJECT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJSON_PATH_EXISTS(final TSqlParser.JSON_PATH_EXISTSContext ctx) {
    final var methodName = "enterJSON_PATH_EXISTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJSON_QUERY(final TSqlParser.JSON_QUERYContext ctx) {
    final var methodName = "enterJSON_QUERY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterJSON_VALUE(final TSqlParser.JSON_VALUEContext ctx) {
    final var methodName = "enterJSON_VALUE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterKey_options(final TSqlParser.Key_optionsContext ctx) {
    final var methodName = "enterKey_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterKeyword(final TSqlParser.KeywordContext ctx) {
    final var methodName = "enterKeyword";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterKill_process(final TSqlParser.Kill_processContext ctx) {
    final var methodName = "enterKill_process";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterKill_query_notification(final TSqlParser.Kill_query_notificationContext ctx) {
    final var methodName = "enterKill_query_notification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterKill_statement(final TSqlParser.Kill_statementContext ctx) {
    final var methodName = "enterKill_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterKill_stats_job(final TSqlParser.Kill_stats_jobContext ctx) {
    final var methodName = "enterKill_stats_job";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLEAST(final TSqlParser.LEASTContext ctx) {
    final var methodName = "enterLEAST";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLEFT(final TSqlParser.LEFTContext ctx) {
    final var methodName = "enterLEFT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLEN(final TSqlParser.LENContext ctx) {
    final var methodName = "enterLEN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLocal_drive(final TSqlParser.Local_driveContext ctx) {
    final var methodName = "enterLocal_drive";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLocal_file(final TSqlParser.Local_fileContext ctx) {
    final var methodName = "enterLocal_file";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLock_table(final TSqlParser.Lock_tableContext ctx) {
    final var methodName = "enterLock_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLOG(final TSqlParser.LOGContext ctx) {
    final var methodName = "enterLOG";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLOG10(final TSqlParser.LOG10Context ctx) {
    final var methodName = "enterLOG10";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLOGINPROPERTY(final TSqlParser.LOGINPROPERTYContext ctx) {
    final var methodName = "enterLOGINPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLow_priority_lock_wait(final TSqlParser.Low_priority_lock_waitContext ctx) {
    final var methodName = "enterLow_priority_lock_wait";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLOWER(final TSqlParser.LOWERContext ctx) {
    final var methodName = "enterLOWER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterLTRIM(final TSqlParser.LTRIMContext ctx) {
    final var methodName = "enterLTRIM";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMaterialized_column_definition(
      final TSqlParser.Materialized_column_definitionContext ctx) {
    final var methodName = "enterMaterialized_column_definition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMATH_SIGN(final TSqlParser.MATH_SIGNContext ctx) {
    final var methodName = "enterMATH_SIGN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMerge_matched(final TSqlParser.Merge_matchedContext ctx) {
    final var methodName = "enterMerge_matched";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMerge_not_matched(final TSqlParser.Merge_not_matchedContext ctx) {
    final var methodName = "enterMerge_not_matched";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMerge_statement(final TSqlParser.Merge_statementContext ctx) {
    final var methodName = "enterMerge_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMessage_statement(final TSqlParser.Message_statementContext ctx) {
    final var methodName = "enterMessage_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMIN_ACTIVE_ROWVERSION(final TSqlParser.MIN_ACTIVE_ROWVERSIONContext ctx) {
    final var methodName = "enterMIN_ACTIVE_ROWVERSION";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMirroring_host_port_seperator(
      final TSqlParser.Mirroring_host_port_seperatorContext ctx) {
    final var methodName = "enterMirroring_host_port_seperator";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMirroring_partner(final TSqlParser.Mirroring_partnerContext ctx) {
    final var methodName = "enterMirroring_partner";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMirroring_set_option(final TSqlParser.Mirroring_set_optionContext ctx) {
    final var methodName = "enterMirroring_set_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMirroring_witness(final TSqlParser.Mirroring_witnessContext ctx) {
    final var methodName = "enterMirroring_witness";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMixed_page_allocation_option(
      final TSqlParser.Mixed_page_allocation_optionContext ctx) {
    final var methodName = "enterMixed_page_allocation_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterModify_call(final TSqlParser.Modify_callContext ctx) {
    final var methodName = "enterModify_call";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterModify_method(final TSqlParser.Modify_methodContext ctx) {
    final var methodName = "enterModify_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMONTH(final TSqlParser.MONTHContext ctx) {
    final var methodName = "enterMONTH";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMultiple_local_file_start(
      final TSqlParser.Multiple_local_file_startContext ctx) {
    final var methodName = "enterMultiple_local_file_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterMultiple_local_files(final TSqlParser.Multiple_local_filesContext ctx) {
    final var methodName = "enterMultiple_local_files";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterNCHAR(final TSqlParser.NCHARContext ctx) {
    final var methodName = "enterNCHAR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterNetwork_computer(final TSqlParser.Network_computerContext ctx) {
    final var methodName = "enterNetwork_computer";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterNetwork_file_share(final TSqlParser.Network_file_shareContext ctx) {
    final var methodName = "enterNetwork_file_share";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterNetwork_file_start(final TSqlParser.Network_file_startContext ctx) {
    final var methodName = "enterNetwork_file_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterNEWID(final TSqlParser.NEWIDContext ctx) {
    final var methodName = "enterNEWID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterNEWSEQUENTIALID(final TSqlParser.NEWSEQUENTIALIDContext ctx) {
    final var methodName = "enterNEWSEQUENTIALID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterNEXT_VALUE_FOR(final TSqlParser.NEXT_VALUE_FORContext ctx) {
    final var methodName = "enterNEXT_VALUE_FOR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterNodes_method(final TSqlParser.Nodes_methodContext ctx) {
    final var methodName = "enterNodes_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterNon_ansi_join(final TSqlParser.Non_ansi_joinContext ctx) {
    final var methodName = "enterNon_ansi_join";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterNull_notnull(final TSqlParser.Null_notnullContext ctx) {
    final var methodName = "enterNull_notnull";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterNULLIF(final TSqlParser.NULLIFContext ctx) {
    final var methodName = "enterNULLIF";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOBJECT_DEFINITION(final TSqlParser.OBJECT_DEFINITIONContext ctx) {
    final var methodName = "enterOBJECT_DEFINITION";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOBJECT_ID(final TSqlParser.OBJECT_IDContext ctx) {
    final var methodName = "enterOBJECT_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOBJECT_NAME(final TSqlParser.OBJECT_NAMEContext ctx) {
    final var methodName = "enterOBJECT_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOBJECT_SCHEMA_NAME(final TSqlParser.OBJECT_SCHEMA_NAMEContext ctx) {
    final var methodName = "enterOBJECT_SCHEMA_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOBJECTPROPERTY(final TSqlParser.OBJECTPROPERTYContext ctx) {
    final var methodName = "enterOBJECTPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOBJECTPROPERTYEX(final TSqlParser.OBJECTPROPERTYEXContext ctx) {
    final var methodName = "enterOBJECTPROPERTYEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOn_delete(final TSqlParser.On_deleteContext ctx) {
    final var methodName = "enterOn_delete";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOn_off(final TSqlParser.On_offContext ctx) {
    final var methodName = "enterOn_off";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOn_partition_or_filegroup(
      final TSqlParser.On_partition_or_filegroupContext ctx) {
    final var methodName = "enterOn_partition_or_filegroup";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOn_partitions(final TSqlParser.On_partitionsContext ctx) {
    final var methodName = "enterOn_partitions";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOn_update(final TSqlParser.On_updateContext ctx) {
    final var methodName = "enterOn_update";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOpen_json(final TSqlParser.Open_jsonContext ctx) {
    final var methodName = "enterOpen_json";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOpen_key(final TSqlParser.Open_keyContext ctx) {
    final var methodName = "enterOpen_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOpen_xml(final TSqlParser.Open_xmlContext ctx) {
    final var methodName = "enterOpen_xml";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOpendatasource(final TSqlParser.OpendatasourceContext ctx) {
    final var methodName = "enterOpendatasource";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOpenquery(final TSqlParser.OpenqueryContext ctx) {
    final var methodName = "enterOpenquery";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOpt_arg_clause(final TSqlParser.Opt_arg_clauseContext ctx) {
    final var methodName = "enterOpt_arg_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOptimize_for_arg(final TSqlParser.Optimize_for_argContext ctx) {
    final var methodName = "enterOptimize_for_arg";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOption(final TSqlParser.OptionContext ctx) {
    final var methodName = "enterOption";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOption_clause(final TSqlParser.Option_clauseContext ctx) {
    final var methodName = "enterOption_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOrder_by_clause(final TSqlParser.Order_by_clauseContext ctx) {
    final var methodName = "enterOrder_by_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOrder_by_expression(final TSqlParser.Order_by_expressionContext ctx) {
    final var methodName = "enterOrder_by_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterORIGINAL_DB_NAME(final TSqlParser.ORIGINAL_DB_NAMEContext ctx) {
    final var methodName = "enterORIGINAL_DB_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterORIGINAL_LOGIN(final TSqlParser.ORIGINAL_LOGINContext ctx) {
    final var methodName = "enterORIGINAL_LOGIN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOutput_clause(final TSqlParser.Output_clauseContext ctx) {
    final var methodName = "enterOutput_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOutput_dml_list_elem(final TSqlParser.Output_dml_list_elemContext ctx) {
    final var methodName = "enterOutput_dml_list_elem";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterOver_clause(final TSqlParser.Over_clauseContext ctx) {
    final var methodName = "enterOver_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterParameter(final TSqlParser.ParameterContext ctx) {
    final var methodName = "enterParameter";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterParameterization_option(final TSqlParser.Parameterization_optionContext ctx) {
    final var methodName = "enterParameterization_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPARSE(final TSqlParser.PARSEContext ctx) {
    final var methodName = "enterPARSE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPARSENAME(final TSqlParser.PARSENAMEContext ctx) {
    final var methodName = "enterPARSENAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPARTITION_FUNC(final TSqlParser.PARTITION_FUNCContext ctx) {
    final var methodName = "enterPARTITION_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPartition_function(final TSqlParser.Partition_functionContext ctx) {
    final var methodName = "enterPartition_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPartner_option(final TSqlParser.Partner_optionContext ctx) {
    final var methodName = "enterPartner_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPartner_server(final TSqlParser.Partner_serverContext ctx) {
    final var methodName = "enterPartner_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPartner_server_tcp_prefix(
      final TSqlParser.Partner_server_tcp_prefixContext ctx) {
    final var methodName = "enterPartner_server_tcp_prefix";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPATINDEX(final TSqlParser.PATINDEXContext ctx) {
    final var methodName = "enterPATINDEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPERMISSIONS(final TSqlParser.PERMISSIONSContext ctx) {
    final var methodName = "enterPERMISSIONS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPI(final TSqlParser.PIContext ctx) {
    final var methodName = "enterPI";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPivot(final TSqlParser.PivotContext ctx) {
    final var methodName = "enterPivot";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPivot_clause(final TSqlParser.Pivot_clauseContext ctx) {
    final var methodName = "enterPivot_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPort_number(final TSqlParser.Port_numberContext ctx) {
    final var methodName = "enterPort_number";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPOWER(final TSqlParser.POWERContext ctx) {
    final var methodName = "enterPOWER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPredicate(final TSqlParser.PredicateContext ctx) {
    final var methodName = "enterPredicate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPrimary_key_options(final TSqlParser.Primary_key_optionsContext ctx) {
    final var methodName = "enterPrimary_key_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPrimitive_constant(final TSqlParser.Primitive_constantContext ctx) {
    final var methodName = "enterPrimitive_constant";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPrimitive_expression(final TSqlParser.Primitive_expressionContext ctx) {
    final var methodName = "enterPrimitive_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPrincipal_id(final TSqlParser.Principal_idContext ctx) {
    final var methodName = "enterPrincipal_id";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPrint_statement(final TSqlParser.Print_statementContext ctx) {
    final var methodName = "enterPrint_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPrivate_key_options(final TSqlParser.Private_key_optionsContext ctx) {
    final var methodName = "enterPrivate_key_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterProcedure_option(final TSqlParser.Procedure_optionContext ctx) {
    final var methodName = "enterProcedure_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterProcedure_param(final TSqlParser.Procedure_paramContext ctx) {
    final var methodName = "enterProcedure_param";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterProcedure_param_default_value(
      final TSqlParser.Procedure_param_default_valueContext ctx) {
    final var methodName = "enterProcedure_param_default_value";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPWDCOMPARE(final TSqlParser.PWDCOMPAREContext ctx) {
    final var methodName = "enterPWDCOMPARE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterPWDENCRYPT(final TSqlParser.PWDENCRYPTContext ctx) {
    final var methodName = "enterPWDENCRYPT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterQuery_call(final TSqlParser.Query_callContext ctx) {
    final var methodName = "enterQuery_call";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterQuery_expression(final TSqlParser.Query_expressionContext ctx) {
    final var methodName = "enterQuery_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterQuery_method(final TSqlParser.Query_methodContext ctx) {
    final var methodName = "enterQuery_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterQuery_specification(final TSqlParser.Query_specificationContext ctx) {
    final var methodName = "enterQuery_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterQueue_action(final TSqlParser.Queue_actionContext ctx) {
    final var methodName = "enterQueue_action";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterQueue_id(final TSqlParser.Queue_idContext ctx) {
    final var methodName = "enterQueue_id";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterQueue_rebuild_options(final TSqlParser.Queue_rebuild_optionsContext ctx) {
    final var methodName = "enterQueue_rebuild_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterQueue_settings(final TSqlParser.Queue_settingsContext ctx) {
    final var methodName = "enterQueue_settings";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterQUOTENAME(final TSqlParser.QUOTENAMEContext ctx) {
    final var methodName = "enterQUOTENAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRADIANS(final TSqlParser.RADIANSContext ctx) {
    final var methodName = "enterRADIANS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRaiseerror_statement(final TSqlParser.Raiseerror_statementContext ctx) {
    final var methodName = "enterRaiseerror_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRAND(final TSqlParser.RANDContext ctx) {
    final var methodName = "enterRAND";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRANKING_WINDOWED_FUNC(final TSqlParser.RANKING_WINDOWED_FUNCContext ctx) {
    final var methodName = "enterRANKING_WINDOWED_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRanking_windowed_function(
      final TSqlParser.Ranking_windowed_functionContext ctx) {
    final var methodName = "enterRanking_windowed_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRebuild_index_option(final TSqlParser.Rebuild_index_optionContext ctx) {
    final var methodName = "enterRebuild_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRebuild_index_options(final TSqlParser.Rebuild_index_optionsContext ctx) {
    final var methodName = "enterRebuild_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRebuild_partition(final TSqlParser.Rebuild_partitionContext ctx) {
    final var methodName = "enterRebuild_partition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterReceive_statement(final TSqlParser.Receive_statementContext ctx) {
    final var methodName = "enterReceive_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterReconfigure_statement(final TSqlParser.Reconfigure_statementContext ctx) {
    final var methodName = "enterReconfigure_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRecovery_option(final TSqlParser.Recovery_optionContext ctx) {
    final var methodName = "enterRecovery_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRelational_index_option(final TSqlParser.Relational_index_optionContext ctx) {
    final var methodName = "enterRelational_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterReorganize_option(final TSqlParser.Reorganize_optionContext ctx) {
    final var methodName = "enterReorganize_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterReorganize_options(final TSqlParser.Reorganize_optionsContext ctx) {
    final var methodName = "enterReorganize_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterReorganize_partition(final TSqlParser.Reorganize_partitionContext ctx) {
    final var methodName = "enterReorganize_partition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterREPLACE(final TSqlParser.REPLACEContext ctx) {
    final var methodName = "enterREPLACE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterREPLICATE(final TSqlParser.REPLICATEContext ctx) {
    final var methodName = "enterREPLICATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterResumable_index_option(final TSqlParser.Resumable_index_optionContext ctx) {
    final var methodName = "enterResumable_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterResumable_index_options(final TSqlParser.Resumable_index_optionsContext ctx) {
    final var methodName = "enterResumable_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterReturn_statement(final TSqlParser.Return_statementContext ctx) {
    final var methodName = "enterReturn_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterREVERSE(final TSqlParser.REVERSEContext ctx) {
    final var methodName = "enterREVERSE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRIGHT(final TSqlParser.RIGHTContext ctx) {
    final var methodName = "enterRIGHT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterROUND(final TSqlParser.ROUNDContext ctx) {
    final var methodName = "enterROUND";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRow_or_range_clause(final TSqlParser.Row_or_range_clauseContext ctx) {
    final var methodName = "enterRow_or_range_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterROWCOUNT_BIG(final TSqlParser.ROWCOUNT_BIGContext ctx) {
    final var methodName = "enterROWCOUNT_BIG";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRowset_function(final TSqlParser.Rowset_functionContext ctx) {
    final var methodName = "enterRowset_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRowset_function_limited(final TSqlParser.Rowset_function_limitedContext ctx) {
    final var methodName = "enterRowset_function_limited";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterRTRIM(final TSqlParser.RTRIMContext ctx) {
    final var methodName = "enterRTRIM";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSCALAR_FUNCTION(final TSqlParser.SCALAR_FUNCTIONContext ctx) {
    final var methodName = "enterSCALAR_FUNCTION";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterScalar_function_name(final TSqlParser.Scalar_function_nameContext ctx) {
    final var methodName = "enterScalar_function_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSchema_declaration(final TSqlParser.Schema_declarationContext ctx) {
    final var methodName = "enterSchema_declaration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSCHEMA_ID(final TSqlParser.SCHEMA_IDContext ctx) {
    final var methodName = "enterSCHEMA_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSCHEMA_NAME(final TSqlParser.SCHEMA_NAMEContext ctx) {
    final var methodName = "enterSCHEMA_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSCOPE_IDENTITY(final TSqlParser.SCOPE_IDENTITYContext ctx) {
    final var methodName = "enterSCOPE_IDENTITY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSearch_condition(final TSqlParser.Search_conditionContext ctx) {
    final var methodName = "enterSearch_condition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSecurity_statement(final TSqlParser.Security_statementContext ctx) {
    final var methodName = "enterSecurity_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSelect_list(final TSqlParser.Select_listContext ctx) {
    final var methodName = "enterSelect_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSelect_list_elem(final TSqlParser.Select_list_elemContext ctx) {
    final var methodName = "enterSelect_list_elem";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSelect_order_by_clause(final TSqlParser.Select_order_by_clauseContext ctx) {
    final var methodName = "enterSelect_order_by_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSelect_statement(final TSqlParser.Select_statementContext ctx) {
    final var methodName = "enterSelect_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSelect_statement_standalone(
      final TSqlParser.Select_statement_standaloneContext ctx) {
    final var methodName = "enterSelect_statement_standalone";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSend_conversation(final TSqlParser.Send_conversationContext ctx) {
    final var methodName = "enterSend_conversation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSERVERPROPERTY(final TSqlParser.SERVERPROPERTYContext ctx) {
    final var methodName = "enterSERVERPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterService_broker_option(final TSqlParser.Service_broker_optionContext ctx) {
    final var methodName = "enterService_broker_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterService_name(final TSqlParser.Service_nameContext ctx) {
    final var methodName = "enterService_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSESSION_CONTEXT(final TSqlParser.SESSION_CONTEXTContext ctx) {
    final var methodName = "enterSESSION_CONTEXT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSESSION_USER(final TSqlParser.SESSION_USERContext ctx) {
    final var methodName = "enterSESSION_USER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSESSIONPROPERTY(final TSqlParser.SESSIONPROPERTYContext ctx) {
    final var methodName = "enterSESSIONPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSet_index_option(final TSqlParser.Set_index_optionContext ctx) {
    final var methodName = "enterSet_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSet_index_options(final TSqlParser.Set_index_optionsContext ctx) {
    final var methodName = "enterSet_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSet_special(final TSqlParser.Set_specialContext ctx) {
    final var methodName = "enterSet_special";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSet_statement(final TSqlParser.Set_statementContext ctx) {
    final var methodName = "enterSet_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSetuser_statement(final TSqlParser.Setuser_statementContext ctx) {
    final var methodName = "enterSetuser_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterShutdown_statement(final TSqlParser.Shutdown_statementContext ctx) {
    final var methodName = "enterShutdown_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSimple_id(final TSqlParser.Simple_idContext ctx) {
    final var methodName = "enterSimple_id";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSimple_name(final TSqlParser.Simple_nameContext ctx) {
    final var methodName = "enterSimple_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSIN(final TSqlParser.SINContext ctx) {
    final var methodName = "enterSIN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSingle_partition_rebuild_index_option(
      final TSqlParser.Single_partition_rebuild_index_optionContext ctx) {
    final var methodName = "enterSingle_partition_rebuild_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSingle_partition_rebuild_index_options(
      final TSqlParser.Single_partition_rebuild_index_optionsContext ctx) {
    final var methodName = "enterSingle_partition_rebuild_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSMALLDATETIMEFROMPARTS(final TSqlParser.SMALLDATETIMEFROMPARTSContext ctx) {
    final var methodName = "enterSMALLDATETIMEFROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSnapshot_option(final TSqlParser.Snapshot_optionContext ctx) {
    final var methodName = "enterSnapshot_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSOUNDEX(final TSqlParser.SOUNDEXContext ctx) {
    final var methodName = "enterSOUNDEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSPACE(final TSqlParser.SPACEContext ctx) {
    final var methodName = "enterSPACE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSpecial_list(final TSqlParser.Special_listContext ctx) {
    final var methodName = "enterSpecial_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSql_clauses(final TSqlParser.Sql_clausesContext ctx) {
    final var methodName = "enterSql_clauses";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSql_option(final TSqlParser.Sql_optionContext ctx) {
    final var methodName = "enterSql_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSql_union(final TSqlParser.Sql_unionContext ctx) {
    final var methodName = "enterSql_union";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSQL_VARIANT_PROPERTY(final TSqlParser.SQL_VARIANT_PROPERTYContext ctx) {
    final var methodName = "enterSQL_VARIANT_PROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSQRT(final TSqlParser.SQRTContext ctx) {
    final var methodName = "enterSQRT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSQUARE(final TSqlParser.SQUAREContext ctx) {
    final var methodName = "enterSQUARE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSTATS_DATE(final TSqlParser.STATS_DATEContext ctx) {
    final var methodName = "enterSTATS_DATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSTR(final TSqlParser.STRContext ctx) {
    final var methodName = "enterSTR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSTRING_ESCAPE(final TSqlParser.STRING_ESCAPEContext ctx) {
    final var methodName = "enterSTRING_ESCAPE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSTRINGAGG(final TSqlParser.STRINGAGGContext ctx) {
    final var methodName = "enterSTRINGAGG";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSTUFF(final TSqlParser.STUFFContext ctx) {
    final var methodName = "enterSTUFF";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSubquery(final TSqlParser.SubqueryContext ctx) {
    final var methodName = "enterSubquery";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSUBSTRING(final TSqlParser.SUBSTRINGContext ctx) {
    final var methodName = "enterSUBSTRING";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSUSER_ID(final TSqlParser.SUSER_IDContext ctx) {
    final var methodName = "enterSUSER_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSUSER_SID(final TSqlParser.SUSER_SIDContext ctx) {
    final var methodName = "enterSUSER_SID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSUSER_SNAME(final TSqlParser.SUSER_SNAMEContext ctx) {
    final var methodName = "enterSUSER_SNAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSwitch_partition(final TSqlParser.Switch_partitionContext ctx) {
    final var methodName = "enterSwitch_partition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSwitch_search_condition_section(
      final TSqlParser.Switch_search_condition_sectionContext ctx) {
    final var methodName = "enterSwitch_search_condition_section";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSwitch_section(final TSqlParser.Switch_sectionContext ctx) {
    final var methodName = "enterSwitch_section";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSWITCHOFFSET(final TSqlParser.SWITCHOFFSETContext ctx) {
    final var methodName = "enterSWITCHOFFSET";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSybase_legacy_hint(final TSqlParser.Sybase_legacy_hintContext ctx) {
    final var methodName = "enterSybase_legacy_hint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSybase_legacy_hints(final TSqlParser.Sybase_legacy_hintsContext ctx) {
    final var methodName = "enterSybase_legacy_hints";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSYSDATETIME(final TSqlParser.SYSDATETIMEContext ctx) {
    final var methodName = "enterSYSDATETIME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSYSDATETIMEOFFSET(final TSqlParser.SYSDATETIMEOFFSETContext ctx) {
    final var methodName = "enterSYSDATETIMEOFFSET";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSYSTEM_USER(final TSqlParser.SYSTEM_USERContext ctx) {
    final var methodName = "enterSYSTEM_USER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterSYSUTCDATETIME(final TSqlParser.SYSUTCDATETIMEContext ctx) {
    final var methodName = "enterSYSUTCDATETIME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_alias(final TSqlParser.Table_aliasContext ctx) {
    final var methodName = "enterTable_alias";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_constraint(final TSqlParser.Table_constraintContext ctx) {
    final var methodName = "enterTable_constraint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_hint(final TSqlParser.Table_hintContext ctx) {
    final var methodName = "enterTable_hint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_indices(final TSqlParser.Table_indicesContext ctx) {
    final var methodName = "enterTable_indices";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_name(final TSqlParser.Table_nameContext ctx) {
    final var methodName = "enterTable_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_option(final TSqlParser.Table_optionContext ctx) {
    final var methodName = "enterTable_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_options(final TSqlParser.Table_optionsContext ctx) {
    final var methodName = "enterTable_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_source(final TSqlParser.Table_sourceContext ctx) {
    final var methodName = "enterTable_source";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_source_item(final TSqlParser.Table_source_itemContext ctx) {
    final var methodName = "enterTable_source_item";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_sources(final TSqlParser.Table_sourcesContext ctx) {
    final var methodName = "enterTable_sources";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_type_definition(final TSqlParser.Table_type_definitionContext ctx) {
    final var methodName = "enterTable_type_definition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_type_indices(final TSqlParser.Table_type_indicesContext ctx) {
    final var methodName = "enterTable_type_indices";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTable_value_constructor(final TSqlParser.Table_value_constructorContext ctx) {
    final var methodName = "enterTable_value_constructor";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTAN(final TSqlParser.TANContext ctx) {
    final var methodName = "enterTAN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTarget_recovery_time_option(
      final TSqlParser.Target_recovery_time_optionContext ctx) {
    final var methodName = "enterTarget_recovery_time_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTermination(final TSqlParser.TerminationContext ctx) {
    final var methodName = "enterTermination";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterThrow_error_number(final TSqlParser.Throw_error_numberContext ctx) {
    final var methodName = "enterThrow_error_number";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterThrow_message(final TSqlParser.Throw_messageContext ctx) {
    final var methodName = "enterThrow_message";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterThrow_state(final TSqlParser.Throw_stateContext ctx) {
    final var methodName = "enterThrow_state";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterThrow_statement(final TSqlParser.Throw_statementContext ctx) {
    final var methodName = "enterThrow_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTime(final TSqlParser.TimeContext ctx) {
    final var methodName = "enterTime";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTime_zone(final TSqlParser.Time_zoneContext ctx) {
    final var methodName = "enterTime_zone";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTIMEFROMPARTS(final TSqlParser.TIMEFROMPARTSContext ctx) {
    final var methodName = "enterTIMEFROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTODATETIMEOFFSET(final TSqlParser.TODATETIMEOFFSETContext ctx) {
    final var methodName = "enterTODATETIMEOFFSET";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTop_clause(final TSqlParser.Top_clauseContext ctx) {
    final var methodName = "enterTop_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTop_count(final TSqlParser.Top_countContext ctx) {
    final var methodName = "enterTop_count";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTop_percent(final TSqlParser.Top_percentContext ctx) {
    final var methodName = "enterTop_percent";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTransaction_statement(final TSqlParser.Transaction_statementContext ctx) {
    final var methodName = "enterTransaction_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTRANSLATE(final TSqlParser.TRANSLATEContext ctx) {
    final var methodName = "enterTRANSLATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTRIM(final TSqlParser.TRIMContext ctx) {
    final var methodName = "enterTRIM";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTruncate_table(final TSqlParser.Truncate_tableContext ctx) {
    final var methodName = "enterTruncate_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTRY_CAST(final TSqlParser.TRY_CASTContext ctx) {
    final var methodName = "enterTRY_CAST";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTry_catch_statement(final TSqlParser.Try_catch_statementContext ctx) {
    final var methodName = "enterTry_catch_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTsql_file(final TSqlParser.Tsql_fileContext ctx) {
    final var methodName = "enterTsql_file";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTYPE_ID(final TSqlParser.TYPE_IDContext ctx) {
    final var methodName = "enterTYPE_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTYPE_NAME(final TSqlParser.TYPE_NAMEContext ctx) {
    final var methodName = "enterTYPE_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterTYPEPROPERTY(final TSqlParser.TYPEPROPERTYContext ctx) {
    final var methodName = "enterTYPEPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUdt_elem(final TSqlParser.Udt_elemContext ctx) {
    final var methodName = "enterUdt_elem";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUdt_method_arguments(final TSqlParser.Udt_method_argumentsContext ctx) {
    final var methodName = "enterUdt_method_arguments";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUnary_operator_expression(
      final TSqlParser.Unary_operator_expressionContext ctx) {
    final var methodName = "enterUnary_operator_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUNICODE(final TSqlParser.UNICODEContext ctx) {
    final var methodName = "enterUNICODE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUnpivot(final TSqlParser.UnpivotContext ctx) {
    final var methodName = "enterUnpivot";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUnpivot_clause(final TSqlParser.Unpivot_clauseContext ctx) {
    final var methodName = "enterUnpivot_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUpdate_elem(final TSqlParser.Update_elemContext ctx) {
    final var methodName = "enterUpdate_elem";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUpdate_elem_merge(final TSqlParser.Update_elem_mergeContext ctx) {
    final var methodName = "enterUpdate_elem_merge";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUpdate_statement(final TSqlParser.Update_statementContext ctx) {
    final var methodName = "enterUpdate_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUpdate_statistics(final TSqlParser.Update_statisticsContext ctx) {
    final var methodName = "enterUpdate_statistics";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUpdate_statistics_option(final TSqlParser.Update_statistics_optionContext ctx) {
    final var methodName = "enterUpdate_statistics_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUpdate_statistics_options(
      final TSqlParser.Update_statistics_optionsContext ctx) {
    final var methodName = "enterUpdate_statistics_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUPPER(final TSqlParser.UPPERContext ctx) {
    final var methodName = "enterUPPER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUse_statement(final TSqlParser.Use_statementContext ctx) {
    final var methodName = "enterUse_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUSER(final TSqlParser.USERContext ctx) {
    final var methodName = "enterUSER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUSER_ID(final TSqlParser.USER_IDContext ctx) {
    final var methodName = "enterUSER_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterUSER_NAME(final TSqlParser.USER_NAMEContext ctx) {
    final var methodName = "enterUSER_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterValue_call(final TSqlParser.Value_callContext ctx) {
    final var methodName = "enterValue_call";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterValue_method(final TSqlParser.Value_methodContext ctx) {
    final var methodName = "enterValue_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterView_attribute(final TSqlParser.View_attributeContext ctx) {
    final var methodName = "enterView_attribute";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWaitfor_conversation(final TSqlParser.Waitfor_conversationContext ctx) {
    final var methodName = "enterWaitfor_conversation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWaitfor_statement(final TSqlParser.Waitfor_statementContext ctx) {
    final var methodName = "enterWaitfor_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWhen_matches(final TSqlParser.When_matchesContext ctx) {
    final var methodName = "enterWhen_matches";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWhile_statement(final TSqlParser.While_statementContext ctx) {
    final var methodName = "enterWhile_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWindow_frame_bound(final TSqlParser.Window_frame_boundContext ctx) {
    final var methodName = "enterWindow_frame_bound";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWindow_frame_extent(final TSqlParser.Window_frame_extentContext ctx) {
    final var methodName = "enterWindow_frame_extent";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWindow_frame_following(final TSqlParser.Window_frame_followingContext ctx) {
    final var methodName = "enterWindow_frame_following";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWindow_frame_preceding(final TSqlParser.Window_frame_precedingContext ctx) {
    final var methodName = "enterWindow_frame_preceding";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWith_expression(final TSqlParser.With_expressionContext ctx) {
    final var methodName = "enterWith_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWith_table_hints(final TSqlParser.With_table_hintsContext ctx) {
    final var methodName = "enterWith_table_hints";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWitness_option(final TSqlParser.Witness_optionContext ctx) {
    final var methodName = "enterWitness_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWitness_partner_equal(final TSqlParser.Witness_partner_equalContext ctx) {
    final var methodName = "enterWitness_partner_equal";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterWitness_server(final TSqlParser.Witness_serverContext ctx) {
    final var methodName = "enterWitness_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterXACT_STATE(final TSqlParser.XACT_STATEContext ctx) {
    final var methodName = "enterXACT_STATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterXml_common_directives(final TSqlParser.Xml_common_directivesContext ctx) {
    final var methodName = "enterXml_common_directives";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterXML_DATA_TYPE_FUNC(final TSqlParser.XML_DATA_TYPE_FUNCContext ctx) {
    final var methodName = "enterXML_DATA_TYPE_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterXml_data_type_methods(final TSqlParser.Xml_data_type_methodsContext ctx) {
    final var methodName = "enterXml_data_type_methods";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterXml_declaration(final TSqlParser.Xml_declarationContext ctx) {
    final var methodName = "enterXml_declaration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterXml_index_option(final TSqlParser.Xml_index_optionContext ctx) {
    final var methodName = "enterXml_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterXml_index_options(final TSqlParser.Xml_index_optionsContext ctx) {
    final var methodName = "enterXml_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterXml_schema_collection(final TSqlParser.Xml_schema_collectionContext ctx) {
    final var methodName = "enterXml_schema_collection";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterXml_type_definition(final TSqlParser.Xml_type_definitionContext ctx) {
    final var methodName = "enterXml_type_definition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void enterYEAR(final TSqlParser.YEARContext ctx) {
    final var methodName = "enterYEAR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitABS(final TSqlParser.ABSContext ctx) {
    final var methodName = "exitABS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitACOS(final TSqlParser.ACOSContext ctx) {
    final var methodName = "exitACOS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAction_specification(final TSqlParser.Action_specificationContext ctx) {
    final var methodName = "exitAction_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAdd_or_modify_filegroups(final TSqlParser.Add_or_modify_filegroupsContext ctx) {
    final var methodName = "exitAdd_or_modify_filegroups";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAdd_or_modify_files(final TSqlParser.Add_or_modify_filesContext ctx) {
    final var methodName = "exitAdd_or_modify_files";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAGGREGATE_WINDOWED_FUNC(final TSqlParser.AGGREGATE_WINDOWED_FUNCContext ctx) {
    final var methodName = "exitAGGREGATE_WINDOWED_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAggregate_windowed_function(
      final TSqlParser.Aggregate_windowed_functionContext ctx) {
    final var methodName = "exitAggregate_windowed_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlgorithm(final TSqlParser.AlgorithmContext ctx) {
    final var methodName = "exitAlgorithm";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAll_distinct_expression(final TSqlParser.All_distinct_expressionContext ctx) {
    final var methodName = "exitAll_distinct_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_application_role(final TSqlParser.Alter_application_roleContext ctx) {
    final var methodName = "exitAlter_application_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly(final TSqlParser.Alter_assemblyContext ctx) {
    final var methodName = "exitAlter_assembly";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_add_clause(final TSqlParser.Alter_assembly_add_clauseContext ctx) {
    final var methodName = "exitAlter_assembly_add_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_as(final TSqlParser.Alter_assembly_asContext ctx) {
    final var methodName = "exitAlter_assembly_as";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_clause(final TSqlParser.Alter_assembly_clauseContext ctx) {
    final var methodName = "exitAlter_assembly_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_client_file_clause(
      final TSqlParser.Alter_assembly_client_file_clauseContext ctx) {
    final var methodName = "exitAlter_assembly_client_file_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_drop(final TSqlParser.Alter_assembly_dropContext ctx) {
    final var methodName = "exitAlter_assembly_drop";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_drop_clause(
      final TSqlParser.Alter_assembly_drop_clauseContext ctx) {
    final var methodName = "exitAlter_assembly_drop_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_drop_multiple_files(
      final TSqlParser.Alter_assembly_drop_multiple_filesContext ctx) {
    final var methodName = "exitAlter_assembly_drop_multiple_files";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_file_bits(final TSqlParser.Alter_assembly_file_bitsContext ctx) {
    final var methodName = "exitAlter_assembly_file_bits";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_file_name(final TSqlParser.Alter_assembly_file_nameContext ctx) {
    final var methodName = "exitAlter_assembly_file_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_from_clause(
      final TSqlParser.Alter_assembly_from_clauseContext ctx) {
    final var methodName = "exitAlter_assembly_from_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_from_clause_start(
      final TSqlParser.Alter_assembly_from_clause_startContext ctx) {
    final var methodName = "exitAlter_assembly_from_clause_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_start(final TSqlParser.Alter_assembly_startContext ctx) {
    final var methodName = "exitAlter_assembly_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_with(final TSqlParser.Alter_assembly_withContext ctx) {
    final var methodName = "exitAlter_assembly_with";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_assembly_with_clause(
      final TSqlParser.Alter_assembly_with_clauseContext ctx) {
    final var methodName = "exitAlter_assembly_with_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_asssembly_add_clause_start(
      final TSqlParser.Alter_asssembly_add_clause_startContext ctx) {
    final var methodName = "exitAlter_asssembly_add_clause_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_asymmetric_key(final TSqlParser.Alter_asymmetric_keyContext ctx) {
    final var methodName = "exitAlter_asymmetric_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_asymmetric_key_start(
      final TSqlParser.Alter_asymmetric_key_startContext ctx) {
    final var methodName = "exitAlter_asymmetric_key_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_authorization(final TSqlParser.Alter_authorizationContext ctx) {
    final var methodName = "exitAlter_authorization";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_authorization_for_azure_dw(
      final TSqlParser.Alter_authorization_for_azure_dwContext ctx) {
    final var methodName = "exitAlter_authorization_for_azure_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_authorization_for_parallel_dw(
      final TSqlParser.Alter_authorization_for_parallel_dwContext ctx) {
    final var methodName = "exitAlter_authorization_for_parallel_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_authorization_for_sql_database(
      final TSqlParser.Alter_authorization_for_sql_databaseContext ctx) {
    final var methodName = "exitAlter_authorization_for_sql_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_authorization_start(final TSqlParser.Alter_authorization_startContext ctx) {
    final var methodName = "exitAlter_authorization_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_availability_group(final TSqlParser.Alter_availability_groupContext ctx) {
    final var methodName = "exitAlter_availability_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_availability_group_options(
      final TSqlParser.Alter_availability_group_optionsContext ctx) {
    final var methodName = "exitAlter_availability_group_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_availability_group_start(
      final TSqlParser.Alter_availability_group_startContext ctx) {
    final var methodName = "exitAlter_availability_group_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_certificate(final TSqlParser.Alter_certificateContext ctx) {
    final var methodName = "exitAlter_certificate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_column_encryption_key(
      final TSqlParser.Alter_column_encryption_keyContext ctx) {
    final var methodName = "exitAlter_column_encryption_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_credential(final TSqlParser.Alter_credentialContext ctx) {
    final var methodName = "exitAlter_credential";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_cryptographic_provider(
      final TSqlParser.Alter_cryptographic_providerContext ctx) {
    final var methodName = "exitAlter_cryptographic_provider";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_database(final TSqlParser.Alter_databaseContext ctx) {
    final var methodName = "exitAlter_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_database_audit_specification(
      final TSqlParser.Alter_database_audit_specificationContext ctx) {
    final var methodName = "exitAlter_database_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_db_role(final TSqlParser.Alter_db_roleContext ctx) {
    final var methodName = "exitAlter_db_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_endpoint(final TSqlParser.Alter_endpointContext ctx) {
    final var methodName = "exitAlter_endpoint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_external_data_source(
      final TSqlParser.Alter_external_data_sourceContext ctx) {
    final var methodName = "exitAlter_external_data_source";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_external_library(final TSqlParser.Alter_external_libraryContext ctx) {
    final var methodName = "exitAlter_external_library";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_external_resource_pool(
      final TSqlParser.Alter_external_resource_poolContext ctx) {
    final var methodName = "exitAlter_external_resource_pool";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_fulltext_catalog(final TSqlParser.Alter_fulltext_catalogContext ctx) {
    final var methodName = "exitAlter_fulltext_catalog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_fulltext_stoplist(final TSqlParser.Alter_fulltext_stoplistContext ctx) {
    final var methodName = "exitAlter_fulltext_stoplist";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_index(final TSqlParser.Alter_indexContext ctx) {
    final var methodName = "exitAlter_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_login_azure_sql(final TSqlParser.Alter_login_azure_sqlContext ctx) {
    final var methodName = "exitAlter_login_azure_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_login_azure_sql_dw_and_pdw(
      final TSqlParser.Alter_login_azure_sql_dw_and_pdwContext ctx) {
    final var methodName = "exitAlter_login_azure_sql_dw_and_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_login_sql_server(final TSqlParser.Alter_login_sql_serverContext ctx) {
    final var methodName = "exitAlter_login_sql_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_master_key_azure_sql(
      final TSqlParser.Alter_master_key_azure_sqlContext ctx) {
    final var methodName = "exitAlter_master_key_azure_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_master_key_sql_server(
      final TSqlParser.Alter_master_key_sql_serverContext ctx) {
    final var methodName = "exitAlter_master_key_sql_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_message_type(final TSqlParser.Alter_message_typeContext ctx) {
    final var methodName = "exitAlter_message_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_partition_function(final TSqlParser.Alter_partition_functionContext ctx) {
    final var methodName = "exitAlter_partition_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_partition_scheme(final TSqlParser.Alter_partition_schemeContext ctx) {
    final var methodName = "exitAlter_partition_scheme";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_queue(final TSqlParser.Alter_queueContext ctx) {
    final var methodName = "exitAlter_queue";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_remote_service_binding(
      final TSqlParser.Alter_remote_service_bindingContext ctx) {
    final var methodName = "exitAlter_remote_service_binding";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_resource_governor(final TSqlParser.Alter_resource_governorContext ctx) {
    final var methodName = "exitAlter_resource_governor";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_schema_azure_sql_dw_and_pdw(
      final TSqlParser.Alter_schema_azure_sql_dw_and_pdwContext ctx) {
    final var methodName = "exitAlter_schema_azure_sql_dw_and_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_schema_sql(final TSqlParser.Alter_schema_sqlContext ctx) {
    final var methodName = "exitAlter_schema_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_sequence(final TSqlParser.Alter_sequenceContext ctx) {
    final var methodName = "exitAlter_sequence";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_server_audit(final TSqlParser.Alter_server_auditContext ctx) {
    final var methodName = "exitAlter_server_audit";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_server_audit_specification(
      final TSqlParser.Alter_server_audit_specificationContext ctx) {
    final var methodName = "exitAlter_server_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_server_configuration(
      final TSqlParser.Alter_server_configurationContext ctx) {
    final var methodName = "exitAlter_server_configuration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_server_role(final TSqlParser.Alter_server_roleContext ctx) {
    final var methodName = "exitAlter_server_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_server_role_pdw(final TSqlParser.Alter_server_role_pdwContext ctx) {
    final var methodName = "exitAlter_server_role_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_service(final TSqlParser.Alter_serviceContext ctx) {
    final var methodName = "exitAlter_service";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_service_master_key(final TSqlParser.Alter_service_master_keyContext ctx) {
    final var methodName = "exitAlter_service_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_symmetric_key(final TSqlParser.Alter_symmetric_keyContext ctx) {
    final var methodName = "exitAlter_symmetric_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_table(final TSqlParser.Alter_tableContext ctx) {
    final var methodName = "exitAlter_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_table_index_option(final TSqlParser.Alter_table_index_optionContext ctx) {
    final var methodName = "exitAlter_table_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_table_index_options(final TSqlParser.Alter_table_index_optionsContext ctx) {
    final var methodName = "exitAlter_table_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_user(final TSqlParser.Alter_userContext ctx) {
    final var methodName = "exitAlter_user";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_user_azure_sql(final TSqlParser.Alter_user_azure_sqlContext ctx) {
    final var methodName = "exitAlter_user_azure_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_workload_group(final TSqlParser.Alter_workload_groupContext ctx) {
    final var methodName = "exitAlter_workload_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAlter_xml_schema_collection(
      final TSqlParser.Alter_xml_schema_collectionContext ctx) {
    final var methodName = "exitAlter_xml_schema_collection";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitANALYTIC_WINDOWED_FUNC(final TSqlParser.ANALYTIC_WINDOWED_FUNCContext ctx) {
    final var methodName = "exitANALYTIC_WINDOWED_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAnalytic_windowed_function(
      final TSqlParser.Analytic_windowed_functionContext ctx) {
    final var methodName = "exitAnalytic_windowed_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAnother_statement(final TSqlParser.Another_statementContext ctx) {
    final var methodName = "exitAnother_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAPP_NAME(final TSqlParser.APP_NAMEContext ctx) {
    final var methodName = "exitAPP_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAPPLOCK_MODE(final TSqlParser.APPLOCK_MODEContext ctx) {
    final var methodName = "exitAPPLOCK_MODE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAPPLOCK_TEST(final TSqlParser.APPLOCK_TESTContext ctx) {
    final var methodName = "exitAPPLOCK_TEST";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitApply_(final TSqlParser.Apply_Context ctx) {
    final var methodName = "exitApply_";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAs_column_alias(final TSqlParser.As_column_aliasContext ctx) {
    final var methodName = "exitAs_column_alias";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAs_external_name(final TSqlParser.As_external_nameContext ctx) {
    final var methodName = "exitAs_external_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAs_table_alias(final TSqlParser.As_table_aliasContext ctx) {
    final var methodName = "exitAs_table_alias";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitASCII(final TSqlParser.ASCIIContext ctx) {
    final var methodName = "exitASCII";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitASIN(final TSqlParser.ASINContext ctx) {
    final var methodName = "exitASIN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAssembly_option(final TSqlParser.Assembly_optionContext ctx) {
    final var methodName = "exitAssembly_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitASSEMBLYPROPERTY(final TSqlParser.ASSEMBLYPROPERTYContext ctx) {
    final var methodName = "exitASSEMBLYPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAssignment_operator(final TSqlParser.Assignment_operatorContext ctx) {
    final var methodName = "exitAssignment_operator";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAsterisk(final TSqlParser.AsteriskContext ctx) {
    final var methodName = "exitAsterisk";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAsymmetric_key_option(final TSqlParser.Asymmetric_key_optionContext ctx) {
    final var methodName = "exitAsymmetric_key_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAsymmetric_key_option_start(
      final TSqlParser.Asymmetric_key_option_startContext ctx) {
    final var methodName = "exitAsymmetric_key_option_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAsymmetric_key_password_change_option(
      final TSqlParser.Asymmetric_key_password_change_optionContext ctx) {
    final var methodName = "exitAsymmetric_key_password_change_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitATAN(final TSqlParser.ATANContext ctx) {
    final var methodName = "exitATAN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitATN2(final TSqlParser.ATN2Context ctx) {
    final var methodName = "exitATN2";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAudit_action_spec_group(final TSqlParser.Audit_action_spec_groupContext ctx) {
    final var methodName = "exitAudit_action_spec_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAudit_action_specification(
      final TSqlParser.Audit_action_specificationContext ctx) {
    final var methodName = "exitAudit_action_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAudit_class_name(final TSqlParser.Audit_class_nameContext ctx) {
    final var methodName = "exitAudit_class_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAudit_securable(final TSqlParser.Audit_securableContext ctx) {
    final var methodName = "exitAudit_securable";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAuthorization_grantee(final TSqlParser.Authorization_granteeContext ctx) {
    final var methodName = "exitAuthorization_grantee";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitAuto_option(final TSqlParser.Auto_optionContext ctx) {
    final var methodName = "exitAuto_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBackup_certificate(final TSqlParser.Backup_certificateContext ctx) {
    final var methodName = "exitBackup_certificate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBackup_database(final TSqlParser.Backup_databaseContext ctx) {
    final var methodName = "exitBackup_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBackup_log(final TSqlParser.Backup_logContext ctx) {
    final var methodName = "exitBackup_log";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBackup_master_key(final TSqlParser.Backup_master_keyContext ctx) {
    final var methodName = "exitBackup_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBackup_service_master_key(final TSqlParser.Backup_service_master_keyContext ctx) {
    final var methodName = "exitBackup_service_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBackup_statement(final TSqlParser.Backup_statementContext ctx) {
    final var methodName = "exitBackup_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBatch(final TSqlParser.BatchContext ctx) {
    final var methodName = "exitBatch";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBatch_level_statement(final TSqlParser.Batch_level_statementContext ctx) {
    final var methodName = "exitBatch_level_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBegin_conversation_dialog(final TSqlParser.Begin_conversation_dialogContext ctx) {
    final var methodName = "exitBegin_conversation_dialog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBegin_conversation_timer(final TSqlParser.Begin_conversation_timerContext ctx) {
    final var methodName = "exitBegin_conversation_timer";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBINARY_CHECKSUM(final TSqlParser.BINARY_CHECKSUMContext ctx) {
    final var methodName = "exitBINARY_CHECKSUM";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBlock_statement(final TSqlParser.Block_statementContext ctx) {
    final var methodName = "exitBlock_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBracket_expression(final TSqlParser.Bracket_expressionContext ctx) {
    final var methodName = "exitBracket_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBreak_statement(final TSqlParser.Break_statementContext ctx) {
    final var methodName = "exitBreak_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBUILT_IN_FUNC(final TSqlParser.BUILT_IN_FUNCContext ctx) {
    final var methodName = "exitBUILT_IN_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitBulk_option(final TSqlParser.Bulk_optionContext ctx) {
    final var methodName = "exitBulk_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCase_expression(final TSqlParser.Case_expressionContext ctx) {
    final var methodName = "exitCase_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCAST(final TSqlParser.CASTContext ctx) {
    final var methodName = "exitCAST";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCEILING(final TSqlParser.CEILINGContext ctx) {
    final var methodName = "exitCEILING";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCERT_ID(final TSqlParser.CERT_IDContext ctx) {
    final var methodName = "exitCERT_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCERTENCODED(final TSqlParser.CERTENCODEDContext ctx) {
    final var methodName = "exitCERTENCODED";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCERTPRIVATEKEY(final TSqlParser.CERTPRIVATEKEYContext ctx) {
    final var methodName = "exitCERTPRIVATEKEY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCfl_statement(final TSqlParser.Cfl_statementContext ctx) {
    final var methodName = "exitCfl_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitChange_table(final TSqlParser.Change_tableContext ctx) {
    final var methodName = "exitChange_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitChange_table_changes(final TSqlParser.Change_table_changesContext ctx) {
    final var methodName = "exitChange_table_changes";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitChange_table_version(final TSqlParser.Change_table_versionContext ctx) {
    final var methodName = "exitChange_table_version";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitChange_tracking_option(final TSqlParser.Change_tracking_optionContext ctx) {
    final var methodName = "exitChange_tracking_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitChange_tracking_option_list(
      final TSqlParser.Change_tracking_option_listContext ctx) {
    final var methodName = "exitChange_tracking_option_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCHAR(final TSqlParser.CHARContext ctx) {
    final var methodName = "exitCHAR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCHARINDEX(final TSqlParser.CHARINDEXContext ctx) {
    final var methodName = "exitCHARINDEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCheck_constraint(final TSqlParser.Check_constraintContext ctx) {
    final var methodName = "exitCheck_constraint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCheckpoint_statement(final TSqlParser.Checkpoint_statementContext ctx) {
    final var methodName = "exitCheckpoint_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCHECKSUM(final TSqlParser.CHECKSUMContext ctx) {
    final var methodName = "exitCHECKSUM";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitClass_type(final TSqlParser.Class_typeContext ctx) {
    final var methodName = "exitClass_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitClass_type_for_azure_dw(final TSqlParser.Class_type_for_azure_dwContext ctx) {
    final var methodName = "exitClass_type_for_azure_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitClass_type_for_grant(final TSqlParser.Class_type_for_grantContext ctx) {
    final var methodName = "exitClass_type_for_grant";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitClass_type_for_parallel_dw(
      final TSqlParser.Class_type_for_parallel_dwContext ctx) {
    final var methodName = "exitClass_type_for_parallel_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitClass_type_for_sql_database(
      final TSqlParser.Class_type_for_sql_databaseContext ctx) {
    final var methodName = "exitClass_type_for_sql_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitClient_assembly_specifier(final TSqlParser.Client_assembly_specifierContext ctx) {
    final var methodName = "exitClient_assembly_specifier";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitClose_key(final TSqlParser.Close_keyContext ctx) {
    final var methodName = "exitClose_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitClustered(final TSqlParser.ClusteredContext ctx) {
    final var methodName = "exitClustered";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCOALESCE(final TSqlParser.COALESCEContext ctx) {
    final var methodName = "exitCOALESCE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCOL_LENGTH(final TSqlParser.COL_LENGTHContext ctx) {
    final var methodName = "exitCOL_LENGTH";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCOL_NAME(final TSqlParser.COL_NAMEContext ctx) {
    final var methodName = "exitCOL_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColon_colon(final TSqlParser.Colon_colonContext ctx) {
    final var methodName = "exitColon_colon";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumn_alias(final TSqlParser.Column_aliasContext ctx) {
    final var methodName = "exitColumn_alias";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumn_alias_list(final TSqlParser.Column_alias_listContext ctx) {
    final var methodName = "exitColumn_alias_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumn_constraint(final TSqlParser.Column_constraintContext ctx) {
    final var methodName = "exitColumn_constraint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumn_declaration(final TSqlParser.Column_declarationContext ctx) {
    final var methodName = "exitColumn_declaration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumn_def_table_constraint(
      final TSqlParser.Column_def_table_constraintContext ctx) {
    final var methodName = "exitColumn_def_table_constraint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumn_def_table_constraints(
      final TSqlParser.Column_def_table_constraintsContext ctx) {
    final var methodName = "exitColumn_def_table_constraints";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var currentField = new MutableObject<ObjectField>(null);
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(TSqlParser.Column_def_table_constraintContext.class)
        .streamChildrenByClass(TSqlParser.Column_definitionContext.class)
        .forEach(
            columnDefinitionContext -> {
              if (columnDefinitionContext instanceof final TSqlParser.Id_Context idContext) {
                final var idText =
                    ParseTreeStream.parseTreeStream(idContext)
                        .streamTerminalNodeString()
                        .collect(Collectors.joining(" "));
                if (Strings.CI.equals("UNSIGNED", idText)) {
                  if (currentField.get() != null) {
                    currentField.get().put(Field.UNSIGNED, NotNullSet.getInstance(Boolean.TRUE));
                  }
                } else {
                  ParseTreeStream.parseTreeStream(idContext)
                      .listAllTerminalNode()
                      .forEach(
                          terminalNode ->
                              currentField.setValue(
                                  ParseTreeHelper.getField(currentTable, terminalNode)));
                }
              } else if (columnDefinitionContext
                  instanceof
                  final TSqlParser.Column_definition_elementContext
                          columnDefinitionElementContext) {
                final var columnDefinitionElementText =
                    " "
                        + StringUtils.upperCase(
                            StringUtils.join(
                                ParseTreeStream.parseTreeStream(columnDefinitionElementContext)
                                    .listAllTerminalNodeText(),
                                " "),
                            Locale.getDefault())
                        + " ";
                if (currentField.get() != null
                    && !currentField.get().containsKey(Field.NULLABLE)
                    && !columnDefinitionElementText.contains(" DEFAULT NULL ")) {
                  if (columnDefinitionElementText.contains(" NOT NULL ")) {
                    currentField.get().put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
                  } else if (columnDefinitionElementText.contains(" NULL ")) {
                    currentField.get().put(Field.NULLABLE, NotNullSet.getInstance(Boolean.TRUE));
                  }
                }
              }
            });
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumn_definition(final TSqlParser.Column_definitionContext ctx) {
    final var methodName = "exitColumn_definition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    final var fieldType =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(TSqlParser.Data_typeContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (StringUtils.isNoneBlank(fieldType)) {
      for (final var currentField : currentFieldList) {
        if (Strings.CI.equals("DOUBLE PRECISION", fieldType)) {
          if (!currentField.containsKey(Field.FIELD_TYPE)) {
            currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(fieldType));
          } else if (!Strings.CI.equals(currentField.get(Field.FIELD_TYPE).toString(), fieldType)) {
            currentField.put(
                StringUtils.lowerCase(fieldType, Locale.getDefault()),
                NotNullSet.getInstance(Boolean.TRUE));
          }
        }
      }
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(TSqlParser.Data_typeContext.class)
        .streamChildrenByClass(TSqlParser.Id_Context.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  if (!Strings.CI.equals("INHERIT", terminalNodeText)) {
                    currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                  }
                } else if (!Strings.CI.equals(
                    currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(TSqlParser.Data_typeContext.class)
        .streamChildrenByClass(TSqlParser.Id_Context.class)
        .streamChildrenByClass(TSqlParser.KeywordContext.class)
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
        .streamChildrenByClass(TSqlParser.ExpressionContext.class)
        .streamChildrenByClass(TSqlParser.BUILT_IN_FUNCContext.class)
        .streamChildrenByClass(TSqlParser.JSON_VALUEContext.class)
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
        .streamChildrenByClass(TSqlParser.Column_indexContext.class)
        .streamChildrenByClass(TSqlParser.ClusteredContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("CLUSTERED", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.TRUE));
                }
              } else if (Strings.CI.equals("NONCLUSTERED", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.FALSE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(TSqlParser.Id_Context.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("UNSIGNED", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.UNSIGNED, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(TSqlParser.Column_definition_elementContext.class)
        .streamChildrenByClass(TSqlParser.Column_constraintContext.class)
        .streamChildrenByClass(TSqlParser.ClusteredContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("CLUSTERED", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.TRUE));
                }
              } else if (Strings.CI.equals("NONCLUSTERED", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.FALSE));
                }
              }
            });
    var nullableText = " ";
    nullableText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(TSqlParser.Column_definition_elementContext.class)
            .streamChildrenByClass(TSqlParser.Column_constraintContext.class)
            .streamChildrenByClass(TSqlParser.Null_notnullContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    nullableText += " ";
    for (final var currentField : currentFieldList) {
      if (!nullableText.contains(" DEFAULT NULL ") && !currentField.containsKey(Field.NULLABLE)) {
        if (nullableText.contains(" NOT NULL ")) {
          currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
        } else if (nullableText.contains(" NULL ")) {
          currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.TRUE));
        }
      }
    }
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(TSqlParser.Data_typeContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (Strings.CI.equals("NCHAR", terminalNodeText)
                    || Strings.CI.equals("NVARCHAR", terminalNodeText)
                    || Strings.CI.equals("VARCHAR", terminalNodeText)
                    || Strings.CI.equals("VARBINARY", terminalNodeText)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (Strings.CI.equals("COLLATE", terminalNodeText)) {
                  ParseTreeStream.parseTreeStream(ctx)
                      .streamChildrenByClass(TSqlParser.Data_typeContext.class)
                      .streamChildrenByClass(TSqlParser.Id_Context.class)
                      .streamTerminalNodeString()
                      .forEach(
                          idContextText ->
                              currentField.put(
                                  Field.COLLATION_NAME, NotNullSet.getInstance(idContextText)));
                } else if (Strings.CI.equals("IDENTITY", terminalNodeText)) {
                  currentField.put(Field.IDENTITY, NotNullSet.getInstance(Boolean.TRUE));
                } else if (currentField.containsKey(Field.IDENTITY)) {
                  if (!currentField.containsKey(Field.SEED)) {
                    currentField.put(Field.SEED, NotNullSet.getInstance(terminalNodeText));
                  } else {
                    currentField.put(Field.INCREMENT, NotNullSet.getInstance(terminalNodeText));
                  }
                } else if (!currentField.containsKey(Field.PRECISION)) {
                  if (NumberUtils.isCreatable(terminalNodeText)
                      || Strings.CI.equals("MAX", terminalNodeText)) {
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeText));
                  }
                } else if (currentField.containsKey(Field.PRECISION)) {
                  currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeText));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(TSqlParser.Column_definition_elementContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (Strings.CI.equals("DEFAULT", terminalNodeText)) {
                  ParseTreeStream.parseTreeStream(ctx)
                      .streamChildrenByClass(TSqlParser.Column_definition_elementContext.class)
                      .streamTextByClass(
                          TSqlParserListenerImpl.input, TSqlParser.ExpressionContext.class)
                      .map(ParseTreeHelper::trimParentheses)
                      .forEach(
                          intervalText ->
                              currentField.put(
                                  Field.DEFAULT, NotNullSet.getInstance(intervalText)));
                } else if (Strings.CI.equals("ROWGUIDCOL", terminalNodeText)) {
                  currentField.put(Field.ROWGUIDCOL, NotNullSet.getInstance(Boolean.TRUE));
                } else if (Strings.CI.equals("NCHAR", terminalNodeText)
                    || Strings.CI.equals("NVARCHAR", terminalNodeText)
                    || Strings.CI.equals("VARCHAR", terminalNodeText)
                    || Strings.CI.equals("VARBINARY", terminalNodeText)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (Strings.CI.equals("COLLATE", terminalNodeText)) {
                  ParseTreeStream.parseTreeStream(ctx)
                      .streamChildrenByClass(TSqlParser.Column_definition_elementContext.class)
                      .streamChildrenByClass(TSqlParser.Id_Context.class)
                      .streamTerminalNodeString()
                      .forEach(
                          idContextText ->
                              currentField.put(
                                  Field.COLLATION_NAME, NotNullSet.getInstance(idContextText)));
                } else if (Strings.CI.equals("IDENTITY", terminalNodeText)) {
                  currentField.put(Field.IDENTITY, NotNullSet.getInstance(Boolean.TRUE));
                } else if (currentField.containsKey(Field.IDENTITY)) {
                  if (!currentField.containsKey(Field.SEED)) {
                    currentField.put(Field.SEED, NotNullSet.getInstance(terminalNodeText));
                  } else {
                    currentField.put(Field.INCREMENT, NotNullSet.getInstance(terminalNodeText));
                  }
                } else if (!currentField.containsKey(Field.PRECISION)) {
                  currentField.put(Field.MAX_SIZE, NotNullSet.getInstance(terminalNodeText));
                  currentField.remove(Field.PRECISION);
                  currentField.remove(Field.SCALE);
                } else if ((currentField.get(Field.FIELD_TYPE) == null)
                    || (!Strings.CI.equals("NCHAR", currentField.get(Field.FIELD_TYPE).toString())
                        && !Strings.CI.equals(
                            "NVARCHAR", currentField.get(Field.FIELD_TYPE).toString())
                        && !Strings.CI.equals(
                            "VARCHAR", currentField.get(Field.FIELD_TYPE).toString())
                        && !Strings.CI.equals(
                            "VARBINARY", currentField.get(Field.FIELD_TYPE).toString()))) {
                  currentField.put(Field.PRECISION, currentField.get(Field.PRECISION));
                  currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeText));
                  currentField.remove(Field.PRECISION);
                }
              }
            });
    final var primaryKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(TSqlParser.Column_definition_elementContext.class)
            .streamChildrenByClass(TSqlParser.Column_constraintContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    if (primaryKeyText.contains("PRIMARY KEY")) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    if (primaryKeyText.contains("UNIQUE")) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
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
          .streamChildrenByClass(TSqlParser.Id_Context.class)
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
          .streamChildrenByClass(TSqlParser.Column_definition_elementContext.class)
          .streamChildrenByClass(TSqlParser.Column_constraintContext.class)
          .streamChildrenByClass(TSqlParser.Foreign_key_optionsContext.class)
          .streamChildrenByClass(TSqlParser.Table_nameContext.class)
          .streamChildrenByClass(TSqlParser.Id_Context.class)
          .map(anyNameContext -> ParseTreeHelper.trimToken(anyNameContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .filter(Predicate.not("null"::equalsIgnoreCase))
          .forEach(
              anyNameText ->
                  currentRelationship.put(
                      "foreignTable",
                      NotNullSet.getInstance(ParseTreeHelper.trimToken(anyNameText))));
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(TSqlParser.Column_definition_elementContext.class)
          .streamChildrenByClass(TSqlParser.Column_constraintContext.class)
          .streamChildrenByClass(TSqlParser.Foreign_key_optionsContext.class)
          .streamChildrenByClass(TSqlParser.Column_name_listContext.class)
          .streamChildrenByClass(TSqlParser.Id_Context.class)
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

  /** {@inheritDoc} */
  @Override
  public void exitColumn_definition_element(final TSqlParser.Column_definition_elementContext ctx) {
    final var methodName = "exitColumn_definition_element";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumn_index(final TSqlParser.Column_indexContext ctx) {
    final var methodName = "exitColumn_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumn_modifier(final TSqlParser.Column_modifierContext ctx) {
    final var methodName = "exitColumn_modifier";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumn_name_list(final TSqlParser.Column_name_listContext ctx) {
    final var methodName = "exitColumn_name_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumn_name_list_with_order(
      final TSqlParser.Column_name_list_with_orderContext ctx) {
    final var methodName = "exitColumn_name_list_with_order";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCOLUMNPROPERTY(final TSqlParser.COLUMNPROPERTYContext ctx) {
    final var methodName = "exitCOLUMNPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitColumnstore_index_option(final TSqlParser.Columnstore_index_optionContext ctx) {
    final var methodName = "exitColumnstore_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCommon_table_expression(final TSqlParser.Common_table_expressionContext ctx) {
    final var methodName = "exitCommon_table_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitComparison_operator(final TSqlParser.Comparison_operatorContext ctx) {
    final var methodName = "exitComparison_operator";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCOMPRESS(final TSqlParser.COMPRESSContext ctx) {
    final var methodName = "exitCOMPRESS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCONCAT(final TSqlParser.CONCATContext ctx) {
    final var methodName = "exitCONCAT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCONCAT_WS(final TSqlParser.CONCAT_WSContext ctx) {
    final var methodName = "exitCONCAT_WS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitConnection_node(final TSqlParser.Connection_nodeContext ctx) {
    final var methodName = "exitConnection_node";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCONNECTIONPROPERTY(final TSqlParser.CONNECTIONPROPERTYContext ctx) {
    final var methodName = "exitCONNECTIONPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitConstant(final TSqlParser.ConstantContext ctx) {
    final var methodName = "exitConstant";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitConstant_LOCAL_ID(final TSqlParser.Constant_LOCAL_IDContext ctx) {
    final var methodName = "exitConstant_LOCAL_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitContainment_option(final TSqlParser.Containment_optionContext ctx) {
    final var methodName = "exitContainment_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCONTEXT_INFO(final TSqlParser.CONTEXT_INFOContext ctx) {
    final var methodName = "exitCONTEXT_INFO";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitContinue_statement(final TSqlParser.Continue_statementContext ctx) {
    final var methodName = "exitContinue_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitContract_name(final TSqlParser.Contract_nameContext ctx) {
    final var methodName = "exitContract_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitConversation_statement(final TSqlParser.Conversation_statementContext ctx) {
    final var methodName = "exitConversation_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCONVERT(final TSqlParser.CONVERTContext ctx) {
    final var methodName = "exitCONVERT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCOS(final TSqlParser.COSContext ctx) {
    final var methodName = "exitCOS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCOT(final TSqlParser.COTContext ctx) {
    final var methodName = "exitCOT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_application_role(final TSqlParser.Create_application_roleContext ctx) {
    final var methodName = "exitCreate_application_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_assembly(final TSqlParser.Create_assemblyContext ctx) {
    final var methodName = "exitCreate_assembly";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_asymmetric_key(final TSqlParser.Create_asymmetric_keyContext ctx) {
    final var methodName = "exitCreate_asymmetric_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_certificate(final TSqlParser.Create_certificateContext ctx) {
    final var methodName = "exitCreate_certificate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_column_encryption_key(
      final TSqlParser.Create_column_encryption_keyContext ctx) {
    final var methodName = "exitCreate_column_encryption_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_column_master_key(final TSqlParser.Create_column_master_keyContext ctx) {
    final var methodName = "exitCreate_column_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_columnstore_index(final TSqlParser.Create_columnstore_indexContext ctx) {
    final var methodName = "exitCreate_columnstore_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_columnstore_index_options(
      final TSqlParser.Create_columnstore_index_optionsContext ctx) {
    final var methodName = "exitCreate_columnstore_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_contract(final TSqlParser.Create_contractContext ctx) {
    final var methodName = "exitCreate_contract";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_credential(final TSqlParser.Create_credentialContext ctx) {
    final var methodName = "exitCreate_credential";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_cryptographic_provider(
      final TSqlParser.Create_cryptographic_providerContext ctx) {
    final var methodName = "exitCreate_cryptographic_provider";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_database(final TSqlParser.Create_databaseContext ctx) {
    final var methodName = "exitCreate_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_database_audit_specification(
      final TSqlParser.Create_database_audit_specificationContext ctx) {
    final var methodName = "exitCreate_database_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_database_option(final TSqlParser.Create_database_optionContext ctx) {
    final var methodName = "exitCreate_database_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_db_role(final TSqlParser.Create_db_roleContext ctx) {
    final var methodName = "exitCreate_db_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_endpoint(final TSqlParser.Create_endpointContext ctx) {
    final var methodName = "exitCreate_endpoint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_event_notification(final TSqlParser.Create_event_notificationContext ctx) {
    final var methodName = "exitCreate_event_notification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_external_library(final TSqlParser.Create_external_libraryContext ctx) {
    final var methodName = "exitCreate_external_library";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_external_resource_pool(
      final TSqlParser.Create_external_resource_poolContext ctx) {
    final var methodName = "exitCreate_external_resource_pool";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_fulltext_catalog(final TSqlParser.Create_fulltext_catalogContext ctx) {
    final var methodName = "exitCreate_fulltext_catalog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_fulltext_stoplist(final TSqlParser.Create_fulltext_stoplistContext ctx) {
    final var methodName = "exitCreate_fulltext_stoplist";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_index(final TSqlParser.Create_indexContext ctx) {
    final var methodName = "exitCreate_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_index_options(final TSqlParser.Create_index_optionsContext ctx) {
    final var methodName = "exitCreate_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_key(final TSqlParser.Create_keyContext ctx) {
    final var methodName = "exitCreate_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_login_azure_sql(final TSqlParser.Create_login_azure_sqlContext ctx) {
    final var methodName = "exitCreate_login_azure_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_login_pdw(final TSqlParser.Create_login_pdwContext ctx) {
    final var methodName = "exitCreate_login_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_login_sql_server(final TSqlParser.Create_login_sql_serverContext ctx) {
    final var methodName = "exitCreate_login_sql_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_master_key_azure_sql(
      final TSqlParser.Create_master_key_azure_sqlContext ctx) {
    final var methodName = "exitCreate_master_key_azure_sql";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_master_key_sql_server(
      final TSqlParser.Create_master_key_sql_serverContext ctx) {
    final var methodName = "exitCreate_master_key_sql_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_nonclustered_columnstore_index(
      final TSqlParser.Create_nonclustered_columnstore_indexContext ctx) {
    final var methodName = "exitCreate_nonclustered_columnstore_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_or_alter_broker_priority(
      final TSqlParser.Create_or_alter_broker_priorityContext ctx) {
    final var methodName = "exitCreate_or_alter_broker_priority";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_or_alter_ddl_trigger(
      final TSqlParser.Create_or_alter_ddl_triggerContext ctx) {
    final var methodName = "exitCreate_or_alter_ddl_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_or_alter_dml_trigger(
      final TSqlParser.Create_or_alter_dml_triggerContext ctx) {
    final var methodName = "exitCreate_or_alter_dml_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_or_alter_event_session(
      final TSqlParser.Create_or_alter_event_sessionContext ctx) {
    final var methodName = "exitCreate_or_alter_event_session";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_or_alter_function(final TSqlParser.Create_or_alter_functionContext ctx) {
    final var methodName = "exitCreate_or_alter_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_or_alter_procedure(final TSqlParser.Create_or_alter_procedureContext ctx) {
    final var methodName = "exitCreate_or_alter_procedure";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_or_alter_trigger(final TSqlParser.Create_or_alter_triggerContext ctx) {
    final var methodName = "exitCreate_or_alter_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_partition_function(final TSqlParser.Create_partition_functionContext ctx) {
    final var methodName = "exitCreate_partition_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_partition_scheme(final TSqlParser.Create_partition_schemeContext ctx) {
    final var methodName = "exitCreate_partition_scheme";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_queue(final TSqlParser.Create_queueContext ctx) {
    final var methodName = "exitCreate_queue";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_remote_service_binding(
      final TSqlParser.Create_remote_service_bindingContext ctx) {
    final var methodName = "exitCreate_remote_service_binding";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_resource_pool(final TSqlParser.Create_resource_poolContext ctx) {
    final var methodName = "exitCreate_resource_pool";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_route(final TSqlParser.Create_routeContext ctx) {
    final var methodName = "exitCreate_route";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_rule(final TSqlParser.Create_ruleContext ctx) {
    final var methodName = "exitCreate_rule";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_schema(final TSqlParser.Create_schemaContext ctx) {
    final var methodName = "exitCreate_schema";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_schema_azure_sql_dw_and_pdw(
      final TSqlParser.Create_schema_azure_sql_dw_and_pdwContext ctx) {
    final var methodName = "exitCreate_schema_azure_sql_dw_and_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_search_property_list(
      final TSqlParser.Create_search_property_listContext ctx) {
    final var methodName = "exitCreate_search_property_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_security_policy(final TSqlParser.Create_security_policyContext ctx) {
    final var methodName = "exitCreate_security_policy";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_sequence(final TSqlParser.Create_sequenceContext ctx) {
    final var methodName = "exitCreate_sequence";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_server_audit(final TSqlParser.Create_server_auditContext ctx) {
    final var methodName = "exitCreate_server_audit";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_server_audit_specification(
      final TSqlParser.Create_server_audit_specificationContext ctx) {
    final var methodName = "exitCreate_server_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_server_role(final TSqlParser.Create_server_roleContext ctx) {
    final var methodName = "exitCreate_server_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_service(final TSqlParser.Create_serviceContext ctx) {
    final var methodName = "exitCreate_service";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_statistics(final TSqlParser.Create_statisticsContext ctx) {
    final var methodName = "exitCreate_statistics";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_synonym(final TSqlParser.Create_synonymContext ctx) {
    final var methodName = "exitCreate_synonym";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_table(final TSqlParser.Create_tableContext ctx) {
    final var methodName = "exitCreate_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);

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

  /** {@inheritDoc} */
  @Override
  public void exitCreate_table_index_option(final TSqlParser.Create_table_index_optionContext ctx) {
    final var methodName = "exitCreate_table_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_table_index_options(
      final TSqlParser.Create_table_index_optionsContext ctx) {
    final var methodName = "exitCreate_table_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_type(final TSqlParser.Create_typeContext ctx) {
    final var methodName = "exitCreate_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_user(final TSqlParser.Create_userContext ctx) {
    final var methodName = "exitCreate_user";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_user_azure_sql_dw(final TSqlParser.Create_user_azure_sql_dwContext ctx) {
    final var methodName = "exitCreate_user_azure_sql_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_view(final TSqlParser.Create_viewContext ctx) {
    final var methodName = "exitCreate_view";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_workload_group(final TSqlParser.Create_workload_groupContext ctx) {
    final var methodName = "exitCreate_workload_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_xml_index(final TSqlParser.Create_xml_indexContext ctx) {
    final var methodName = "exitCreate_xml_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCreate_xml_schema_collection(
      final TSqlParser.Create_xml_schema_collectionContext ctx) {
    final var methodName = "exitCreate_xml_schema_collection";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCross_join(final TSqlParser.Cross_joinContext ctx) {
    final var methodName = "exitCross_join";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCURRENT_DATE(final TSqlParser.CURRENT_DATEContext ctx) {
    final var methodName = "exitCURRENT_DATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCURRENT_REQUEST_ID(final TSqlParser.CURRENT_REQUEST_IDContext ctx) {
    final var methodName = "exitCURRENT_REQUEST_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCURRENT_TIMESTAMP(final TSqlParser.CURRENT_TIMESTAMPContext ctx) {
    final var methodName = "exitCURRENT_TIMESTAMP";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCURRENT_TIMEZONE(final TSqlParser.CURRENT_TIMEZONEContext ctx) {
    final var methodName = "exitCURRENT_TIMEZONE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCURRENT_TIMEZONE_ID(final TSqlParser.CURRENT_TIMEZONE_IDContext ctx) {
    final var methodName = "exitCURRENT_TIMEZONE_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCURRENT_TRANSACTION_ID(final TSqlParser.CURRENT_TRANSACTION_IDContext ctx) {
    final var methodName = "exitCURRENT_TRANSACTION_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCURRENT_USER(final TSqlParser.CURRENT_USERContext ctx) {
    final var methodName = "exitCURRENT_USER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCursor_name(final TSqlParser.Cursor_nameContext ctx) {
    final var methodName = "exitCursor_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCursor_option(final TSqlParser.Cursor_optionContext ctx) {
    final var methodName = "exitCursor_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCURSOR_ROWS(final TSqlParser.CURSOR_ROWSContext ctx) {
    final var methodName = "exitCURSOR_ROWS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCursor_statement(final TSqlParser.Cursor_statementContext ctx) {
    final var methodName = "exitCursor_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitCURSOR_STATUS(final TSqlParser.CURSOR_STATUSContext ctx) {
    final var methodName = "exitCURSOR_STATUS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitData_type(final TSqlParser.Data_typeContext ctx) {
    final var methodName = "exitData_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDatabase_file_spec(final TSqlParser.Database_file_specContext ctx) {
    final var methodName = "exitDatabase_file_spec";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDatabase_filestream_option(
      final TSqlParser.Database_filestream_optionContext ctx) {
    final var methodName = "exitDatabase_filestream_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDatabase_mirroring_option(final TSqlParser.Database_mirroring_optionContext ctx) {
    final var methodName = "exitDatabase_mirroring_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDatabase_optionspec(final TSqlParser.Database_optionspecContext ctx) {
    final var methodName = "exitDatabase_optionspec";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATABASE_PRINCIPAL_ID(final TSqlParser.DATABASE_PRINCIPAL_IDContext ctx) {
    final var methodName = "exitDATABASE_PRINCIPAL_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATABASEPROPERTYEX(final TSqlParser.DATABASEPROPERTYEXContext ctx) {
    final var methodName = "exitDATABASEPROPERTYEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATALENGTH(final TSqlParser.DATALENGTHContext ctx) {
    final var methodName = "exitDATALENGTH";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATE_BUCKET(final TSqlParser.DATE_BUCKETContext ctx) {
    final var methodName = "exitDATE_BUCKET";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDate_correlation_optimization_option(
      final TSqlParser.Date_correlation_optimization_optionContext ctx) {
    final var methodName = "exitDate_correlation_optimization_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDate_options(final TSqlParser.Date_optionsContext ctx) {
    final var methodName = "exitDate_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATEADD(final TSqlParser.DATEADDContext ctx) {
    final var methodName = "exitDATEADD";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATEDIFF(final TSqlParser.DATEDIFFContext ctx) {
    final var methodName = "exitDATEDIFF";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATEDIFF_BIG(final TSqlParser.DATEDIFF_BIGContext ctx) {
    final var methodName = "exitDATEDIFF_BIG";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATEFROMPARTS(final TSqlParser.DATEFROMPARTSContext ctx) {
    final var methodName = "exitDATEFROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATENAME(final TSqlParser.DATENAMEContext ctx) {
    final var methodName = "exitDATENAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATEPART(final TSqlParser.DATEPARTContext ctx) {
    final var methodName = "exitDATEPART";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDateparts_12(final TSqlParser.Dateparts_12Context ctx) {
    final var methodName = "exitDateparts_12";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDateparts_15(final TSqlParser.Dateparts_15Context ctx) {
    final var methodName = "exitDateparts_15";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDateparts_9(final TSqlParser.Dateparts_9Context ctx) {
    final var methodName = "exitDateparts_9";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDateparts_datetrunc(final TSqlParser.Dateparts_datetruncContext ctx) {
    final var methodName = "exitDateparts_datetrunc";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATETIME2FROMPARTS(final TSqlParser.DATETIME2FROMPARTSContext ctx) {
    final var methodName = "exitDATETIME2FROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATETIMEFROMPARTS(final TSqlParser.DATETIMEFROMPARTSContext ctx) {
    final var methodName = "exitDATETIMEFROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATETIMEOFFSETFROMPARTS(final TSqlParser.DATETIMEOFFSETFROMPARTSContext ctx) {
    final var methodName = "exitDATETIMEOFFSETFROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDATETRUNC(final TSqlParser.DATETRUNCContext ctx) {
    final var methodName = "exitDATETRUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDAY(final TSqlParser.DAYContext ctx) {
    final var methodName = "exitDAY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDb_encryption_option(final TSqlParser.Db_encryption_optionContext ctx) {
    final var methodName = "exitDb_encryption_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDB_ID(final TSqlParser.DB_IDContext ctx) {
    final var methodName = "exitDB_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDB_NAME(final TSqlParser.DB_NAMEContext ctx) {
    final var methodName = "exitDB_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDb_state_option(final TSqlParser.Db_state_optionContext ctx) {
    final var methodName = "exitDb_state_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDb_update_option(final TSqlParser.Db_update_optionContext ctx) {
    final var methodName = "exitDb_update_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDb_user_access_option(final TSqlParser.Db_user_access_optionContext ctx) {
    final var methodName = "exitDb_user_access_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_checkalloc(final TSqlParser.Dbcc_checkallocContext ctx) {
    final var methodName = "exitDbcc_checkalloc";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_checkalloc_option(final TSqlParser.Dbcc_checkalloc_optionContext ctx) {
    final var methodName = "exitDbcc_checkalloc_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_checkcatalog(final TSqlParser.Dbcc_checkcatalogContext ctx) {
    final var methodName = "exitDbcc_checkcatalog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_checkconstraints(final TSqlParser.Dbcc_checkconstraintsContext ctx) {
    final var methodName = "exitDbcc_checkconstraints";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_checkconstraints_option(
      final TSqlParser.Dbcc_checkconstraints_optionContext ctx) {
    final var methodName = "exitDbcc_checkconstraints_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_checkdb(final TSqlParser.Dbcc_checkdbContext ctx) {
    final var methodName = "exitDbcc_checkdb";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_checkdb_table_option(final TSqlParser.Dbcc_checkdb_table_optionContext ctx) {
    final var methodName = "exitDbcc_checkdb_table_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_checkfilegroup(final TSqlParser.Dbcc_checkfilegroupContext ctx) {
    final var methodName = "exitDbcc_checkfilegroup";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_checkfilegroup_option(
      final TSqlParser.Dbcc_checkfilegroup_optionContext ctx) {
    final var methodName = "exitDbcc_checkfilegroup_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_checktable(final TSqlParser.Dbcc_checktableContext ctx) {
    final var methodName = "exitDbcc_checktable";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_clause(final TSqlParser.Dbcc_clauseContext ctx) {
    final var methodName = "exitDbcc_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_cleantable(final TSqlParser.Dbcc_cleantableContext ctx) {
    final var methodName = "exitDbcc_cleantable";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_clonedatabase(final TSqlParser.Dbcc_clonedatabaseContext ctx) {
    final var methodName = "exitDbcc_clonedatabase";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_clonedatabase_option(final TSqlParser.Dbcc_clonedatabase_optionContext ctx) {
    final var methodName = "exitDbcc_clonedatabase_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_dbreindex(final TSqlParser.Dbcc_dbreindexContext ctx) {
    final var methodName = "exitDbcc_dbreindex";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_dll_free(final TSqlParser.Dbcc_dll_freeContext ctx) {
    final var methodName = "exitDbcc_dll_free";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_dropcleanbuffers(final TSqlParser.Dbcc_dropcleanbuffersContext ctx) {
    final var methodName = "exitDbcc_dropcleanbuffers";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_pdw_showspaceused(final TSqlParser.Dbcc_pdw_showspaceusedContext ctx) {
    final var methodName = "exitDbcc_pdw_showspaceused";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_proccache(final TSqlParser.Dbcc_proccacheContext ctx) {
    final var methodName = "exitDbcc_proccache";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_showcontig(final TSqlParser.Dbcc_showcontigContext ctx) {
    final var methodName = "exitDbcc_showcontig";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_showcontig_option(final TSqlParser.Dbcc_showcontig_optionContext ctx) {
    final var methodName = "exitDbcc_showcontig_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDbcc_shrinklog(final TSqlParser.Dbcc_shrinklogContext ctx) {
    final var methodName = "exitDbcc_shrinklog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDdl_clause(final TSqlParser.Ddl_clauseContext ctx) {
    final var methodName = "exitDdl_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDdl_object(final TSqlParser.Ddl_objectContext ctx) {
    final var methodName = "exitDdl_object";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDdl_trigger_operation(final TSqlParser.Ddl_trigger_operationContext ctx) {
    final var methodName = "exitDdl_trigger_operation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDeclare_cursor(final TSqlParser.Declare_cursorContext ctx) {
    final var methodName = "exitDeclare_cursor";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDeclare_local(final TSqlParser.Declare_localContext ctx) {
    final var methodName = "exitDeclare_local";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDeclare_set_cursor_common(final TSqlParser.Declare_set_cursor_commonContext ctx) {
    final var methodName = "exitDeclare_set_cursor_common";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDeclare_set_cursor_common_partial(
      final TSqlParser.Declare_set_cursor_common_partialContext ctx) {
    final var methodName = "exitDeclare_set_cursor_common_partial";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDeclare_statement(final TSqlParser.Declare_statementContext ctx) {
    final var methodName = "exitDeclare_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDECOMPRESS(final TSqlParser.DECOMPRESSContext ctx) {
    final var methodName = "exitDECOMPRESS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDecryption_mechanism(final TSqlParser.Decryption_mechanismContext ctx) {
    final var methodName = "exitDecryption_mechanism";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDEGREES(final TSqlParser.DEGREESContext ctx) {
    final var methodName = "exitDEGREES";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDelayed_durability_option(final TSqlParser.Delayed_durability_optionContext ctx) {
    final var methodName = "exitDelayed_durability_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDelete_statement(final TSqlParser.Delete_statementContext ctx) {
    final var methodName = "exitDelete_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDelete_statement_from(final TSqlParser.Delete_statement_fromContext ctx) {
    final var methodName = "exitDelete_statement_from";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDeprecated_table_hint(final TSqlParser.Deprecated_table_hintContext ctx) {
    final var methodName = "exitDeprecated_table_hint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDerived_table(final TSqlParser.Derived_tableContext ctx) {
    final var methodName = "exitDerived_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDIFFERENCE(final TSqlParser.DIFFERENCEContext ctx) {
    final var methodName = "exitDIFFERENCE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDisable_trigger(final TSqlParser.Disable_triggerContext ctx) {
    final var methodName = "exitDisable_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDml_clause(final TSqlParser.Dml_clauseContext ctx) {
    final var methodName = "exitDml_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDml_trigger_operation(final TSqlParser.Dml_trigger_operationContext ctx) {
    final var methodName = "exitDml_trigger_operation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDml_trigger_option(final TSqlParser.Dml_trigger_optionContext ctx) {
    final var methodName = "exitDml_trigger_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_aggregate(final TSqlParser.Drop_aggregateContext ctx) {
    final var methodName = "exitDrop_aggregate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_application_role(final TSqlParser.Drop_application_roleContext ctx) {
    final var methodName = "exitDrop_application_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_assembly(final TSqlParser.Drop_assemblyContext ctx) {
    final var methodName = "exitDrop_assembly";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_asymmetric_key(final TSqlParser.Drop_asymmetric_keyContext ctx) {
    final var methodName = "exitDrop_asymmetric_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_availability_group(final TSqlParser.Drop_availability_groupContext ctx) {
    final var methodName = "exitDrop_availability_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_backward_compatible_index(
      final TSqlParser.Drop_backward_compatible_indexContext ctx) {
    final var methodName = "exitDrop_backward_compatible_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_broker_priority(final TSqlParser.Drop_broker_priorityContext ctx) {
    final var methodName = "exitDrop_broker_priority";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_certificate(final TSqlParser.Drop_certificateContext ctx) {
    final var methodName = "exitDrop_certificate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_column_encryption_key(
      final TSqlParser.Drop_column_encryption_keyContext ctx) {
    final var methodName = "exitDrop_column_encryption_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_column_master_key(final TSqlParser.Drop_column_master_keyContext ctx) {
    final var methodName = "exitDrop_column_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_contract(final TSqlParser.Drop_contractContext ctx) {
    final var methodName = "exitDrop_contract";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_credential(final TSqlParser.Drop_credentialContext ctx) {
    final var methodName = "exitDrop_credential";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_cryptograhic_provider(
      final TSqlParser.Drop_cryptograhic_providerContext ctx) {
    final var methodName = "exitDrop_cryptograhic_provider";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_database(final TSqlParser.Drop_databaseContext ctx) {
    final var methodName = "exitDrop_database";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_database_audit_specification(
      final TSqlParser.Drop_database_audit_specificationContext ctx) {
    final var methodName = "exitDrop_database_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_database_encryption_key(
      final TSqlParser.Drop_database_encryption_keyContext ctx) {
    final var methodName = "exitDrop_database_encryption_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_database_scoped_credential(
      final TSqlParser.Drop_database_scoped_credentialContext ctx) {
    final var methodName = "exitDrop_database_scoped_credential";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_db_role(final TSqlParser.Drop_db_roleContext ctx) {
    final var methodName = "exitDrop_db_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_ddl_trigger(final TSqlParser.Drop_ddl_triggerContext ctx) {
    final var methodName = "exitDrop_ddl_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_default(final TSqlParser.Drop_defaultContext ctx) {
    final var methodName = "exitDrop_default";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_dml_trigger(final TSqlParser.Drop_dml_triggerContext ctx) {
    final var methodName = "exitDrop_dml_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_endpoint(final TSqlParser.Drop_endpointContext ctx) {
    final var methodName = "exitDrop_endpoint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_event_notifications(final TSqlParser.Drop_event_notificationsContext ctx) {
    final var methodName = "exitDrop_event_notifications";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_event_session(final TSqlParser.Drop_event_sessionContext ctx) {
    final var methodName = "exitDrop_event_session";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_external_data_source(final TSqlParser.Drop_external_data_sourceContext ctx) {
    final var methodName = "exitDrop_external_data_source";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_external_file_format(final TSqlParser.Drop_external_file_formatContext ctx) {
    final var methodName = "exitDrop_external_file_format";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_external_library(final TSqlParser.Drop_external_libraryContext ctx) {
    final var methodName = "exitDrop_external_library";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_external_resource_pool(
      final TSqlParser.Drop_external_resource_poolContext ctx) {
    final var methodName = "exitDrop_external_resource_pool";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_external_table(final TSqlParser.Drop_external_tableContext ctx) {
    final var methodName = "exitDrop_external_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_fulltext_catalog(final TSqlParser.Drop_fulltext_catalogContext ctx) {
    final var methodName = "exitDrop_fulltext_catalog";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_fulltext_index(final TSqlParser.Drop_fulltext_indexContext ctx) {
    final var methodName = "exitDrop_fulltext_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_fulltext_stoplist(final TSqlParser.Drop_fulltext_stoplistContext ctx) {
    final var methodName = "exitDrop_fulltext_stoplist";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_function(final TSqlParser.Drop_functionContext ctx) {
    final var methodName = "exitDrop_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_index(final TSqlParser.Drop_indexContext ctx) {
    final var methodName = "exitDrop_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_login(final TSqlParser.Drop_loginContext ctx) {
    final var methodName = "exitDrop_login";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_master_key(final TSqlParser.Drop_master_keyContext ctx) {
    final var methodName = "exitDrop_master_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_message_type(final TSqlParser.Drop_message_typeContext ctx) {
    final var methodName = "exitDrop_message_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_partition_function(final TSqlParser.Drop_partition_functionContext ctx) {
    final var methodName = "exitDrop_partition_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_partition_scheme(final TSqlParser.Drop_partition_schemeContext ctx) {
    final var methodName = "exitDrop_partition_scheme";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_procedure(final TSqlParser.Drop_procedureContext ctx) {
    final var methodName = "exitDrop_procedure";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_queue(final TSqlParser.Drop_queueContext ctx) {
    final var methodName = "exitDrop_queue";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_relational_or_xml_or_spatial_index(
      final TSqlParser.Drop_relational_or_xml_or_spatial_indexContext ctx) {
    final var methodName = "exitDrop_relational_or_xml_or_spatial_index";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_remote_service_binding(
      final TSqlParser.Drop_remote_service_bindingContext ctx) {
    final var methodName = "exitDrop_remote_service_binding";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_resource_pool(final TSqlParser.Drop_resource_poolContext ctx) {
    final var methodName = "exitDrop_resource_pool";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_route(final TSqlParser.Drop_routeContext ctx) {
    final var methodName = "exitDrop_route";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_rule(final TSqlParser.Drop_ruleContext ctx) {
    final var methodName = "exitDrop_rule";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_schema(final TSqlParser.Drop_schemaContext ctx) {
    final var methodName = "exitDrop_schema";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_search_property_list(final TSqlParser.Drop_search_property_listContext ctx) {
    final var methodName = "exitDrop_search_property_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_security_policy(final TSqlParser.Drop_security_policyContext ctx) {
    final var methodName = "exitDrop_security_policy";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_sequence(final TSqlParser.Drop_sequenceContext ctx) {
    final var methodName = "exitDrop_sequence";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_server_audit(final TSqlParser.Drop_server_auditContext ctx) {
    final var methodName = "exitDrop_server_audit";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_server_audit_specification(
      final TSqlParser.Drop_server_audit_specificationContext ctx) {
    final var methodName = "exitDrop_server_audit_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_server_role(final TSqlParser.Drop_server_roleContext ctx) {
    final var methodName = "exitDrop_server_role";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_service(final TSqlParser.Drop_serviceContext ctx) {
    final var methodName = "exitDrop_service";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_signature(final TSqlParser.Drop_signatureContext ctx) {
    final var methodName = "exitDrop_signature";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_statistics(final TSqlParser.Drop_statisticsContext ctx) {
    final var methodName = "exitDrop_statistics";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_statistics_name_azure_dw_and_pdw(
      final TSqlParser.Drop_statistics_name_azure_dw_and_pdwContext ctx) {
    final var methodName = "exitDrop_statistics_name_azure_dw_and_pdw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_symmetric_key(final TSqlParser.Drop_symmetric_keyContext ctx) {
    final var methodName = "exitDrop_symmetric_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_synonym(final TSqlParser.Drop_synonymContext ctx) {
    final var methodName = "exitDrop_synonym";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_table(final TSqlParser.Drop_tableContext ctx) {
    final var methodName = "exitDrop_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_trigger(final TSqlParser.Drop_triggerContext ctx) {
    final var methodName = "exitDrop_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_type(final TSqlParser.Drop_typeContext ctx) {
    final var methodName = "exitDrop_type";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_user(final TSqlParser.Drop_userContext ctx) {
    final var methodName = "exitDrop_user";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_view(final TSqlParser.Drop_viewContext ctx) {
    final var methodName = "exitDrop_view";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_workload_group(final TSqlParser.Drop_workload_groupContext ctx) {
    final var methodName = "exitDrop_workload_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitDrop_xml_schema_collection(
      final TSqlParser.Drop_xml_schema_collectionContext ctx) {
    final var methodName = "exitDrop_xml_schema_collection";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEmpty_statement(final TSqlParser.Empty_statementContext ctx) {
    final var methodName = "exitEmpty_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEnable_trigger(final TSqlParser.Enable_triggerContext ctx) {
    final var methodName = "exitEnable_trigger";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEncryption_mechanism(final TSqlParser.Encryption_mechanismContext ctx) {
    final var methodName = "exitEncryption_mechanism";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEnd_conversation(final TSqlParser.End_conversationContext ctx) {
    final var methodName = "exitEnd_conversation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEndpoint_authentication_clause(
      final TSqlParser.Endpoint_authentication_clauseContext ctx) {
    final var methodName = "exitEndpoint_authentication_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEndpoint_encryption_alogorithm_clause(
      final TSqlParser.Endpoint_encryption_alogorithm_clauseContext ctx) {
    final var methodName = "exitEndpoint_encryption_alogorithm_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEndpoint_listener_clause(final TSqlParser.Endpoint_listener_clauseContext ctx) {
    final var methodName = "exitEndpoint_listener_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEntity_name(final TSqlParser.Entity_nameContext ctx) {
    final var methodName = "exitEntity_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEntity_name_for_azure_dw(final TSqlParser.Entity_name_for_azure_dwContext ctx) {
    final var methodName = "exitEntity_name_for_azure_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEntity_name_for_parallel_dw(
      final TSqlParser.Entity_name_for_parallel_dwContext ctx) {
    final var methodName = "exitEntity_name_for_parallel_dw";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEntity_to(final TSqlParser.Entity_toContext ctx) {
    final var methodName = "exitEntity_to";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEOMONTH(final TSqlParser.EOMONTHContext ctx) {
    final var methodName = "exitEOMONTH";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitERROR_LINE(final TSqlParser.ERROR_LINEContext ctx) {
    final var methodName = "exitERROR_LINE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitERROR_MESSAGE(final TSqlParser.ERROR_MESSAGEContext ctx) {
    final var methodName = "exitERROR_MESSAGE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitERROR_NUMBER(final TSqlParser.ERROR_NUMBERContext ctx) {
    final var methodName = "exitERROR_NUMBER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitERROR_PROCEDURE(final TSqlParser.ERROR_PROCEDUREContext ctx) {
    final var methodName = "exitERROR_PROCEDURE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitERROR_SEVERITY(final TSqlParser.ERROR_SEVERITYContext ctx) {
    final var methodName = "exitERROR_SEVERITY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitERROR_STATE(final TSqlParser.ERROR_STATEContext ctx) {
    final var methodName = "exitERROR_STATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEvent_session_predicate_expression(
      final TSqlParser.Event_session_predicate_expressionContext ctx) {
    final var methodName = "exitEvent_session_predicate_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEvent_session_predicate_factor(
      final TSqlParser.Event_session_predicate_factorContext ctx) {
    final var methodName = "exitEvent_session_predicate_factor";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEvent_session_predicate_leaf(
      final TSqlParser.Event_session_predicate_leafContext ctx) {
    final var methodName = "exitEvent_session_predicate_leaf";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    final var methodName = "exitEveryRule";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExecute_body(final TSqlParser.Execute_bodyContext ctx) {
    final var methodName = "exitExecute_body";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExecute_body_batch(final TSqlParser.Execute_body_batchContext ctx) {
    final var methodName = "exitExecute_body_batch";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExecute_clause(final TSqlParser.Execute_clauseContext ctx) {
    final var methodName = "exitExecute_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExecute_parameter(final TSqlParser.Execute_parameterContext ctx) {
    final var methodName = "exitExecute_parameter";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExecute_statement(final TSqlParser.Execute_statementContext ctx) {
    final var methodName = "exitExecute_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExecute_statement_arg(final TSqlParser.Execute_statement_argContext ctx) {
    final var methodName = "exitExecute_statement_arg";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExecute_statement_arg_named(
      final TSqlParser.Execute_statement_arg_namedContext ctx) {
    final var methodName = "exitExecute_statement_arg_named";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExecute_statement_arg_unnamed(
      final TSqlParser.Execute_statement_arg_unnamedContext ctx) {
    final var methodName = "exitExecute_statement_arg_unnamed";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExecute_var_string(final TSqlParser.Execute_var_stringContext ctx) {
    final var methodName = "exitExecute_var_string";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExist_call(final TSqlParser.Exist_callContext ctx) {
    final var methodName = "exitExist_call";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExist_method(final TSqlParser.Exist_methodContext ctx) {
    final var methodName = "exitExist_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExisting_keys(final TSqlParser.Existing_keysContext ctx) {
    final var methodName = "exitExisting_keys";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitEXP(final TSqlParser.EXPContext ctx) {
    final var methodName = "exitEXP";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExpression(final TSqlParser.ExpressionContext ctx) {
    final var methodName = "exitExpression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExpression_elem(final TSqlParser.Expression_elemContext ctx) {
    final var methodName = "exitExpression_elem";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExpression_list_(final TSqlParser.Expression_list_Context ctx) {
    final var methodName = "exitExpression_list_";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitExternal_access_option(final TSqlParser.External_access_optionContext ctx) {
    final var methodName = "exitExternal_access_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFetch_cursor(final TSqlParser.Fetch_cursorContext ctx) {
    final var methodName = "exitFetch_cursor";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFETCH_STATUS(final TSqlParser.FETCH_STATUSContext ctx) {
    final var methodName = "exitFETCH_STATUS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFile_directory_path_separator(
      final TSqlParser.File_directory_path_separatorContext ctx) {
    final var methodName = "exitFile_directory_path_separator";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFile_group(final TSqlParser.File_groupContext ctx) {
    final var methodName = "exitFile_group";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFILE_ID(final TSqlParser.FILE_IDContext ctx) {
    final var methodName = "exitFILE_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFILE_IDEX(final TSqlParser.FILE_IDEXContext ctx) {
    final var methodName = "exitFILE_IDEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFILE_NAME(final TSqlParser.FILE_NAMEContext ctx) {
    final var methodName = "exitFILE_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFile_path(final TSqlParser.File_pathContext ctx) {
    final var methodName = "exitFile_path";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFile_size(final TSqlParser.File_sizeContext ctx) {
    final var methodName = "exitFile_size";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFile_spec(final TSqlParser.File_specContext ctx) {
    final var methodName = "exitFile_spec";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFILEGROUP_ID(final TSqlParser.FILEGROUP_IDContext ctx) {
    final var methodName = "exitFILEGROUP_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFILEGROUP_NAME(final TSqlParser.FILEGROUP_NAMEContext ctx) {
    final var methodName = "exitFILEGROUP_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFilegroup_updatability_option(
      final TSqlParser.Filegroup_updatability_optionContext ctx) {
    final var methodName = "exitFilegroup_updatability_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFILEGROUPPROPERTY(final TSqlParser.FILEGROUPPROPERTYContext ctx) {
    final var methodName = "exitFILEGROUPPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFILEPROPERTY(final TSqlParser.FILEPROPERTYContext ctx) {
    final var methodName = "exitFILEPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFILEPROPERTYEX(final TSqlParser.FILEPROPERTYEXContext ctx) {
    final var methodName = "exitFILEPROPERTYEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFilespec(final TSqlParser.FilespecContext ctx) {
    final var methodName = "exitFilespec";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFLOOR(final TSqlParser.FLOORContext ctx) {
    final var methodName = "exitFLOOR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFor_clause(final TSqlParser.For_clauseContext ctx) {
    final var methodName = "exitFor_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitForeign_key_options(final TSqlParser.Foreign_key_optionsContext ctx) {
    final var methodName = "exitForeign_key_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFORMAT(final TSqlParser.FORMATContext ctx) {
    final var methodName = "exitFORMAT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFORMATMESSAGE(final TSqlParser.FORMATMESSAGEContext ctx) {
    final var methodName = "exitFORMATMESSAGE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFREE_TEXT(final TSqlParser.FREE_TEXTContext ctx) {
    final var methodName = "exitFREE_TEXT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFreetext_function(final TSqlParser.Freetext_functionContext ctx) {
    final var methodName = "exitFreetext_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFreetext_predicate(final TSqlParser.Freetext_predicateContext ctx) {
    final var methodName = "exitFreetext_predicate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFull_column_name(final TSqlParser.Full_column_nameContext ctx) {
    final var methodName = "exitFull_column_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFull_column_name_list(final TSqlParser.Full_column_name_listContext ctx) {
    final var methodName = "exitFull_column_name_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFull_table_name(final TSqlParser.Full_table_nameContext ctx) {
    final var methodName = "exitFull_table_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFULLTEXTCATALOGPROPERTY(final TSqlParser.FULLTEXTCATALOGPROPERTYContext ctx) {
    final var methodName = "exitFULLTEXTCATALOGPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFULLTEXTSERVICEPROPERTY(final TSqlParser.FULLTEXTSERVICEPROPERTYContext ctx) {
    final var methodName = "exitFULLTEXTSERVICEPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFunc_body_returns_scalar(final TSqlParser.Func_body_returns_scalarContext ctx) {
    final var methodName = "exitFunc_body_returns_scalar";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFunc_body_returns_select(final TSqlParser.Func_body_returns_selectContext ctx) {
    final var methodName = "exitFunc_body_returns_select";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFunc_body_returns_table(final TSqlParser.Func_body_returns_tableContext ctx) {
    final var methodName = "exitFunc_body_returns_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFunc_proc_name_database_schema(
      final TSqlParser.Func_proc_name_database_schemaContext ctx) {
    final var methodName = "exitFunc_proc_name_database_schema";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFunc_proc_name_schema(final TSqlParser.Func_proc_name_schemaContext ctx) {
    final var methodName = "exitFunc_proc_name_schema";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFunc_proc_name_server_database_schema(
      final TSqlParser.Func_proc_name_server_database_schemaContext ctx) {
    final var methodName = "exitFunc_proc_name_server_database_schema";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitFunction_option(final TSqlParser.Function_optionContext ctx) {
    final var methodName = "exitFunction_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGenerate_new_keys(final TSqlParser.Generate_new_keysContext ctx) {
    final var methodName = "exitGenerate_new_keys";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGet_conversation(final TSqlParser.Get_conversationContext ctx) {
    final var methodName = "exitGet_conversation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGET_FILESTREAM_TRANSACTION_CONTEXT(
      final TSqlParser.GET_FILESTREAM_TRANSACTION_CONTEXTContext ctx) {
    final var methodName = "exitGET_FILESTREAM_TRANSACTION_CONTEXT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGETANSINULL(final TSqlParser.GETANSINULLContext ctx) {
    final var methodName = "exitGETANSINULL";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGETDATE(final TSqlParser.GETDATEContext ctx) {
    final var methodName = "exitGETDATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGETUTCDATE(final TSqlParser.GETUTCDATEContext ctx) {
    final var methodName = "exitGETUTCDATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGo_statement(final TSqlParser.Go_statementContext ctx) {
    final var methodName = "exitGo_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGoto_statement(final TSqlParser.Goto_statementContext ctx) {
    final var methodName = "exitGoto_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGrant_permission(final TSqlParser.Grant_permissionContext ctx) {
    final var methodName = "exitGrant_permission";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGREATEST(final TSqlParser.GREATESTContext ctx) {
    final var methodName = "exitGREATEST";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGroup_by_item(final TSqlParser.Group_by_itemContext ctx) {
    final var methodName = "exitGroup_by_item";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitGrouping_sets_item(final TSqlParser.Grouping_sets_itemContext ctx) {
    final var methodName = "exitGrouping_sets_item";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitHadr_options(final TSqlParser.Hadr_optionsContext ctx) {
    final var methodName = "exitHadr_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitHAS_DBACCESS(final TSqlParser.HAS_DBACCESSContext ctx) {
    final var methodName = "exitHAS_DBACCESS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitHAS_PERMS_BY_NAME(final TSqlParser.HAS_PERMS_BY_NAMEContext ctx) {
    final var methodName = "exitHAS_PERMS_BY_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitHierarchyid_call(final TSqlParser.Hierarchyid_callContext ctx) {
    final var methodName = "exitHierarchyid_call";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitHIERARCHYID_METHOD(final TSqlParser.HIERARCHYID_METHODContext ctx) {
    final var methodName = "exitHIERARCHYID_METHOD";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitHierarchyid_static_method(final TSqlParser.Hierarchyid_static_methodContext ctx) {
    final var methodName = "exitHierarchyid_static_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitHost(final TSqlParser.HostContext ctx) {
    final var methodName = "exitHost";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitHOST_ID(final TSqlParser.HOST_IDContext ctx) {
    final var methodName = "exitHOST_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitHOST_NAME(final TSqlParser.HOST_NAMEContext ctx) {
    final var methodName = "exitHOST_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitId_(final TSqlParser.Id_Context ctx) {
    final var methodName = "exitId_";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitId_or_string(final TSqlParser.Id_or_stringContext ctx) {
    final var methodName = "exitId_or_string";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIDENT_CURRENT(final TSqlParser.IDENT_CURRENTContext ctx) {
    final var methodName = "exitIDENT_CURRENT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIDENT_INCR(final TSqlParser.IDENT_INCRContext ctx) {
    final var methodName = "exitIDENT_INCR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIDENT_SEED(final TSqlParser.IDENT_SEEDContext ctx) {
    final var methodName = "exitIDENT_SEED";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIDENTITY(final TSqlParser.IDENTITYContext ctx) {
    final var methodName = "exitIDENTITY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIf_statement(final TSqlParser.If_statementContext ctx) {
    final var methodName = "exitIf_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIIF(final TSqlParser.IIFContext ctx) {
    final var methodName = "exitIIF";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitINDEX_COL(final TSqlParser.INDEX_COLContext ctx) {
    final var methodName = "exitINDEX_COL";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIndex_value(final TSqlParser.Index_valueContext ctx) {
    final var methodName = "exitIndex_value";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitINDEXKEY_PROPERTY(final TSqlParser.INDEXKEY_PROPERTYContext ctx) {
    final var methodName = "exitINDEXKEY_PROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitINDEXPROPERTY(final TSqlParser.INDEXPROPERTYContext ctx) {
    final var methodName = "exitINDEXPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitInsert_column_id(final TSqlParser.Insert_column_idContext ctx) {
    final var methodName = "exitInsert_column_id";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitInsert_column_name_list(final TSqlParser.Insert_column_name_listContext ctx) {
    final var methodName = "exitInsert_column_name_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitInsert_statement(final TSqlParser.Insert_statementContext ctx) {
    final var methodName = "exitInsert_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitInsert_statement_value(final TSqlParser.Insert_statement_valueContext ctx) {
    final var methodName = "exitInsert_statement_value";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIp_v4_failover(final TSqlParser.Ip_v4_failoverContext ctx) {
    final var methodName = "exitIp_v4_failover";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIp_v6_failover(final TSqlParser.Ip_v6_failoverContext ctx) {
    final var methodName = "exitIp_v6_failover";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIS_MEMBER(final TSqlParser.IS_MEMBERContext ctx) {
    final var methodName = "exitIS_MEMBER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIS_ROLEMEMBER(final TSqlParser.IS_ROLEMEMBERContext ctx) {
    final var methodName = "exitIS_ROLEMEMBER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitIS_SRVROLEMEMBER(final TSqlParser.IS_SRVROLEMEMBERContext ctx) {
    final var methodName = "exitIS_SRVROLEMEMBER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitISDATE(final TSqlParser.ISDATEContext ctx) {
    final var methodName = "exitISDATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitISJSON(final TSqlParser.ISJSONContext ctx) {
    final var methodName = "exitISJSON";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitISNULL(final TSqlParser.ISNULLContext ctx) {
    final var methodName = "exitISNULL";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitISNUMERIC(final TSqlParser.ISNUMERICContext ctx) {
    final var methodName = "exitISNUMERIC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJoin_on(final TSqlParser.Join_onContext ctx) {
    final var methodName = "exitJoin_on";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJoin_part(final TSqlParser.Join_partContext ctx) {
    final var methodName = "exitJoin_part";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJSON_ARRAY(final TSqlParser.JSON_ARRAYContext ctx) {
    final var methodName = "exitJSON_ARRAY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJson_column_declaration(final TSqlParser.Json_column_declarationContext ctx) {
    final var methodName = "exitJson_column_declaration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJson_declaration(final TSqlParser.Json_declarationContext ctx) {
    final var methodName = "exitJson_declaration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJson_key_value(final TSqlParser.Json_key_valueContext ctx) {
    final var methodName = "exitJson_key_value";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJSON_MODIFY(final TSqlParser.JSON_MODIFYContext ctx) {
    final var methodName = "exitJSON_MODIFY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJson_null_clause(final TSqlParser.Json_null_clauseContext ctx) {
    final var methodName = "exitJson_null_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJSON_OBJECT(final TSqlParser.JSON_OBJECTContext ctx) {
    final var methodName = "exitJSON_OBJECT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJSON_PATH_EXISTS(final TSqlParser.JSON_PATH_EXISTSContext ctx) {
    final var methodName = "exitJSON_PATH_EXISTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJSON_QUERY(final TSqlParser.JSON_QUERYContext ctx) {
    final var methodName = "exitJSON_QUERY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitJSON_VALUE(final TSqlParser.JSON_VALUEContext ctx) {
    final var methodName = "exitJSON_VALUE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitKey_options(final TSqlParser.Key_optionsContext ctx) {
    final var methodName = "exitKey_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitKeyword(final TSqlParser.KeywordContext ctx) {
    final var methodName = "exitKeyword";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitKill_process(final TSqlParser.Kill_processContext ctx) {
    final var methodName = "exitKill_process";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitKill_query_notification(final TSqlParser.Kill_query_notificationContext ctx) {
    final var methodName = "exitKill_query_notification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitKill_statement(final TSqlParser.Kill_statementContext ctx) {
    final var methodName = "exitKill_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitKill_stats_job(final TSqlParser.Kill_stats_jobContext ctx) {
    final var methodName = "exitKill_stats_job";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLEAST(final TSqlParser.LEASTContext ctx) {
    final var methodName = "exitLEAST";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLEFT(final TSqlParser.LEFTContext ctx) {
    final var methodName = "exitLEFT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLEN(final TSqlParser.LENContext ctx) {
    final var methodName = "exitLEN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLocal_drive(final TSqlParser.Local_driveContext ctx) {
    final var methodName = "exitLocal_drive";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLocal_file(final TSqlParser.Local_fileContext ctx) {
    final var methodName = "exitLocal_file";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLock_table(final TSqlParser.Lock_tableContext ctx) {
    final var methodName = "exitLock_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLOG(final TSqlParser.LOGContext ctx) {
    final var methodName = "exitLOG";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLOG10(final TSqlParser.LOG10Context ctx) {
    final var methodName = "exitLOG10";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLOGINPROPERTY(final TSqlParser.LOGINPROPERTYContext ctx) {
    final var methodName = "exitLOGINPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLow_priority_lock_wait(final TSqlParser.Low_priority_lock_waitContext ctx) {
    final var methodName = "exitLow_priority_lock_wait";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLOWER(final TSqlParser.LOWERContext ctx) {
    final var methodName = "exitLOWER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitLTRIM(final TSqlParser.LTRIMContext ctx) {
    final var methodName = "exitLTRIM";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMaterialized_column_definition(
      final TSqlParser.Materialized_column_definitionContext ctx) {
    final var methodName = "exitMaterialized_column_definition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMATH_SIGN(final TSqlParser.MATH_SIGNContext ctx) {
    final var methodName = "exitMATH_SIGN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMerge_matched(final TSqlParser.Merge_matchedContext ctx) {
    final var methodName = "exitMerge_matched";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMerge_not_matched(final TSqlParser.Merge_not_matchedContext ctx) {
    final var methodName = "exitMerge_not_matched";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMerge_statement(final TSqlParser.Merge_statementContext ctx) {
    final var methodName = "exitMerge_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMessage_statement(final TSqlParser.Message_statementContext ctx) {
    final var methodName = "exitMessage_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMIN_ACTIVE_ROWVERSION(final TSqlParser.MIN_ACTIVE_ROWVERSIONContext ctx) {
    final var methodName = "exitMIN_ACTIVE_ROWVERSION";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMirroring_host_port_seperator(
      final TSqlParser.Mirroring_host_port_seperatorContext ctx) {
    final var methodName = "exitMirroring_host_port_seperator";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMirroring_partner(final TSqlParser.Mirroring_partnerContext ctx) {
    final var methodName = "exitMirroring_partner";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMirroring_set_option(final TSqlParser.Mirroring_set_optionContext ctx) {
    final var methodName = "exitMirroring_set_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMirroring_witness(final TSqlParser.Mirroring_witnessContext ctx) {
    final var methodName = "exitMirroring_witness";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMixed_page_allocation_option(
      final TSqlParser.Mixed_page_allocation_optionContext ctx) {
    final var methodName = "exitMixed_page_allocation_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitModify_call(final TSqlParser.Modify_callContext ctx) {
    final var methodName = "exitModify_call";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitModify_method(final TSqlParser.Modify_methodContext ctx) {
    final var methodName = "exitModify_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMONTH(final TSqlParser.MONTHContext ctx) {
    final var methodName = "exitMONTH";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMultiple_local_file_start(final TSqlParser.Multiple_local_file_startContext ctx) {
    final var methodName = "exitMultiple_local_file_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitMultiple_local_files(final TSqlParser.Multiple_local_filesContext ctx) {
    final var methodName = "exitMultiple_local_files";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitNCHAR(final TSqlParser.NCHARContext ctx) {
    final var methodName = "exitNCHAR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitNetwork_computer(final TSqlParser.Network_computerContext ctx) {
    final var methodName = "exitNetwork_computer";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitNetwork_file_share(final TSqlParser.Network_file_shareContext ctx) {
    final var methodName = "exitNetwork_file_share";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitNetwork_file_start(final TSqlParser.Network_file_startContext ctx) {
    final var methodName = "exitNetwork_file_start";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitNEWID(final TSqlParser.NEWIDContext ctx) {
    final var methodName = "exitNEWID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitNEWSEQUENTIALID(final TSqlParser.NEWSEQUENTIALIDContext ctx) {
    final var methodName = "exitNEWSEQUENTIALID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitNEXT_VALUE_FOR(final TSqlParser.NEXT_VALUE_FORContext ctx) {
    final var methodName = "exitNEXT_VALUE_FOR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitNodes_method(final TSqlParser.Nodes_methodContext ctx) {
    final var methodName = "exitNodes_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitNon_ansi_join(final TSqlParser.Non_ansi_joinContext ctx) {
    final var methodName = "exitNon_ansi_join";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitNull_notnull(final TSqlParser.Null_notnullContext ctx) {
    final var methodName = "exitNull_notnull";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitNULLIF(final TSqlParser.NULLIFContext ctx) {
    final var methodName = "exitNULLIF";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOBJECT_DEFINITION(final TSqlParser.OBJECT_DEFINITIONContext ctx) {
    final var methodName = "exitOBJECT_DEFINITION";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOBJECT_ID(final TSqlParser.OBJECT_IDContext ctx) {
    final var methodName = "exitOBJECT_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOBJECT_NAME(final TSqlParser.OBJECT_NAMEContext ctx) {
    final var methodName = "exitOBJECT_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOBJECT_SCHEMA_NAME(final TSqlParser.OBJECT_SCHEMA_NAMEContext ctx) {
    final var methodName = "exitOBJECT_SCHEMA_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOBJECTPROPERTY(final TSqlParser.OBJECTPROPERTYContext ctx) {
    final var methodName = "exitOBJECTPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOBJECTPROPERTYEX(final TSqlParser.OBJECTPROPERTYEXContext ctx) {
    final var methodName = "exitOBJECTPROPERTYEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOn_delete(final TSqlParser.On_deleteContext ctx) {
    final var methodName = "exitOn_delete";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOn_off(final TSqlParser.On_offContext ctx) {
    final var methodName = "exitOn_off";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOn_partition_or_filegroup(final TSqlParser.On_partition_or_filegroupContext ctx) {
    final var methodName = "exitOn_partition_or_filegroup";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOn_partitions(final TSqlParser.On_partitionsContext ctx) {
    final var methodName = "exitOn_partitions";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOn_update(final TSqlParser.On_updateContext ctx) {
    final var methodName = "exitOn_update";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOpen_json(final TSqlParser.Open_jsonContext ctx) {
    final var methodName = "exitOpen_json";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOpen_key(final TSqlParser.Open_keyContext ctx) {
    final var methodName = "exitOpen_key";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOpen_xml(final TSqlParser.Open_xmlContext ctx) {
    final var methodName = "exitOpen_xml";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOpendatasource(final TSqlParser.OpendatasourceContext ctx) {
    final var methodName = "exitOpendatasource";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOpenquery(final TSqlParser.OpenqueryContext ctx) {
    final var methodName = "exitOpenquery";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOpt_arg_clause(final TSqlParser.Opt_arg_clauseContext ctx) {
    final var methodName = "exitOpt_arg_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOptimize_for_arg(final TSqlParser.Optimize_for_argContext ctx) {
    final var methodName = "exitOptimize_for_arg";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOption(final TSqlParser.OptionContext ctx) {
    final var methodName = "exitOption";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOption_clause(final TSqlParser.Option_clauseContext ctx) {
    final var methodName = "exitOption_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOrder_by_clause(final TSqlParser.Order_by_clauseContext ctx) {
    final var methodName = "exitOrder_by_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOrder_by_expression(final TSqlParser.Order_by_expressionContext ctx) {
    final var methodName = "exitOrder_by_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitORIGINAL_DB_NAME(final TSqlParser.ORIGINAL_DB_NAMEContext ctx) {
    final var methodName = "exitORIGINAL_DB_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitORIGINAL_LOGIN(final TSqlParser.ORIGINAL_LOGINContext ctx) {
    final var methodName = "exitORIGINAL_LOGIN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOutput_clause(final TSqlParser.Output_clauseContext ctx) {
    final var methodName = "exitOutput_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOutput_dml_list_elem(final TSqlParser.Output_dml_list_elemContext ctx) {
    final var methodName = "exitOutput_dml_list_elem";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitOver_clause(final TSqlParser.Over_clauseContext ctx) {
    final var methodName = "exitOver_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitParameter(final TSqlParser.ParameterContext ctx) {
    final var methodName = "exitParameter";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitParameterization_option(final TSqlParser.Parameterization_optionContext ctx) {
    final var methodName = "exitParameterization_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPARSE(final TSqlParser.PARSEContext ctx) {
    final var methodName = "exitPARSE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPARSENAME(final TSqlParser.PARSENAMEContext ctx) {
    final var methodName = "exitPARSENAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPARTITION_FUNC(final TSqlParser.PARTITION_FUNCContext ctx) {
    final var methodName = "exitPARTITION_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPartition_function(final TSqlParser.Partition_functionContext ctx) {
    final var methodName = "exitPartition_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPartner_option(final TSqlParser.Partner_optionContext ctx) {
    final var methodName = "exitPartner_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPartner_server(final TSqlParser.Partner_serverContext ctx) {
    final var methodName = "exitPartner_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPartner_server_tcp_prefix(final TSqlParser.Partner_server_tcp_prefixContext ctx) {
    final var methodName = "exitPartner_server_tcp_prefix";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPATINDEX(final TSqlParser.PATINDEXContext ctx) {
    final var methodName = "exitPATINDEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPERMISSIONS(final TSqlParser.PERMISSIONSContext ctx) {
    final var methodName = "exitPERMISSIONS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPI(final TSqlParser.PIContext ctx) {
    final var methodName = "exitPI";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPivot(final TSqlParser.PivotContext ctx) {
    final var methodName = "exitPivot";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPivot_clause(final TSqlParser.Pivot_clauseContext ctx) {
    final var methodName = "exitPivot_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPort_number(final TSqlParser.Port_numberContext ctx) {
    final var methodName = "exitPort_number";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPOWER(final TSqlParser.POWERContext ctx) {
    final var methodName = "exitPOWER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPredicate(final TSqlParser.PredicateContext ctx) {
    final var methodName = "exitPredicate";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPrimary_key_options(final TSqlParser.Primary_key_optionsContext ctx) {
    final var methodName = "exitPrimary_key_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPrimitive_constant(final TSqlParser.Primitive_constantContext ctx) {
    final var methodName = "exitPrimitive_constant";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPrimitive_expression(final TSqlParser.Primitive_expressionContext ctx) {
    final var methodName = "exitPrimitive_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPrincipal_id(final TSqlParser.Principal_idContext ctx) {
    final var methodName = "exitPrincipal_id";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPrint_statement(final TSqlParser.Print_statementContext ctx) {
    final var methodName = "exitPrint_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPrivate_key_options(final TSqlParser.Private_key_optionsContext ctx) {
    final var methodName = "exitPrivate_key_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitProcedure_option(final TSqlParser.Procedure_optionContext ctx) {
    final var methodName = "exitProcedure_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitProcedure_param(final TSqlParser.Procedure_paramContext ctx) {
    final var methodName = "exitProcedure_param";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitProcedure_param_default_value(
      final TSqlParser.Procedure_param_default_valueContext ctx) {
    final var methodName = "exitProcedure_param_default_value";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPWDCOMPARE(final TSqlParser.PWDCOMPAREContext ctx) {
    final var methodName = "exitPWDCOMPARE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitPWDENCRYPT(final TSqlParser.PWDENCRYPTContext ctx) {
    final var methodName = "exitPWDENCRYPT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitQuery_call(final TSqlParser.Query_callContext ctx) {
    final var methodName = "exitQuery_call";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitQuery_expression(final TSqlParser.Query_expressionContext ctx) {
    final var methodName = "exitQuery_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitQuery_method(final TSqlParser.Query_methodContext ctx) {
    final var methodName = "exitQuery_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitQuery_specification(final TSqlParser.Query_specificationContext ctx) {
    final var methodName = "exitQuery_specification";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitQueue_action(final TSqlParser.Queue_actionContext ctx) {
    final var methodName = "exitQueue_action";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitQueue_id(final TSqlParser.Queue_idContext ctx) {
    final var methodName = "exitQueue_id";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitQueue_rebuild_options(final TSqlParser.Queue_rebuild_optionsContext ctx) {
    final var methodName = "exitQueue_rebuild_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitQueue_settings(final TSqlParser.Queue_settingsContext ctx) {
    final var methodName = "exitQueue_settings";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitQUOTENAME(final TSqlParser.QUOTENAMEContext ctx) {
    final var methodName = "exitQUOTENAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRADIANS(final TSqlParser.RADIANSContext ctx) {
    final var methodName = "exitRADIANS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRaiseerror_statement(final TSqlParser.Raiseerror_statementContext ctx) {
    final var methodName = "exitRaiseerror_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRAND(final TSqlParser.RANDContext ctx) {
    final var methodName = "exitRAND";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRANKING_WINDOWED_FUNC(final TSqlParser.RANKING_WINDOWED_FUNCContext ctx) {
    final var methodName = "exitRANKING_WINDOWED_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRanking_windowed_function(final TSqlParser.Ranking_windowed_functionContext ctx) {
    final var methodName = "exitRanking_windowed_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRebuild_index_option(final TSqlParser.Rebuild_index_optionContext ctx) {
    final var methodName = "exitRebuild_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRebuild_index_options(final TSqlParser.Rebuild_index_optionsContext ctx) {
    final var methodName = "exitRebuild_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRebuild_partition(final TSqlParser.Rebuild_partitionContext ctx) {
    final var methodName = "exitRebuild_partition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitReceive_statement(final TSqlParser.Receive_statementContext ctx) {
    final var methodName = "exitReceive_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitReconfigure_statement(final TSqlParser.Reconfigure_statementContext ctx) {
    final var methodName = "exitReconfigure_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRecovery_option(final TSqlParser.Recovery_optionContext ctx) {
    final var methodName = "exitRecovery_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRelational_index_option(final TSqlParser.Relational_index_optionContext ctx) {
    final var methodName = "exitRelational_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitReorganize_option(final TSqlParser.Reorganize_optionContext ctx) {
    final var methodName = "exitReorganize_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitReorganize_options(final TSqlParser.Reorganize_optionsContext ctx) {
    final var methodName = "exitReorganize_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitReorganize_partition(final TSqlParser.Reorganize_partitionContext ctx) {
    final var methodName = "exitReorganize_partition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitREPLACE(final TSqlParser.REPLACEContext ctx) {
    final var methodName = "exitREPLACE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitREPLICATE(final TSqlParser.REPLICATEContext ctx) {
    final var methodName = "exitREPLICATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitResumable_index_option(final TSqlParser.Resumable_index_optionContext ctx) {
    final var methodName = "exitResumable_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitResumable_index_options(final TSqlParser.Resumable_index_optionsContext ctx) {
    final var methodName = "exitResumable_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitReturn_statement(final TSqlParser.Return_statementContext ctx) {
    final var methodName = "exitReturn_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitREVERSE(final TSqlParser.REVERSEContext ctx) {
    final var methodName = "exitREVERSE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRIGHT(final TSqlParser.RIGHTContext ctx) {
    final var methodName = "exitRIGHT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitROUND(final TSqlParser.ROUNDContext ctx) {
    final var methodName = "exitROUND";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRow_or_range_clause(final TSqlParser.Row_or_range_clauseContext ctx) {
    final var methodName = "exitRow_or_range_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitROWCOUNT_BIG(final TSqlParser.ROWCOUNT_BIGContext ctx) {
    final var methodName = "exitROWCOUNT_BIG";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRowset_function(final TSqlParser.Rowset_functionContext ctx) {
    final var methodName = "exitRowset_function";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRowset_function_limited(final TSqlParser.Rowset_function_limitedContext ctx) {
    final var methodName = "exitRowset_function_limited";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitRTRIM(final TSqlParser.RTRIMContext ctx) {
    final var methodName = "exitRTRIM";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSCALAR_FUNCTION(final TSqlParser.SCALAR_FUNCTIONContext ctx) {
    final var methodName = "exitSCALAR_FUNCTION";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitScalar_function_name(final TSqlParser.Scalar_function_nameContext ctx) {
    final var methodName = "exitScalar_function_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSchema_declaration(final TSqlParser.Schema_declarationContext ctx) {
    final var methodName = "exitSchema_declaration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSCHEMA_ID(final TSqlParser.SCHEMA_IDContext ctx) {
    final var methodName = "exitSCHEMA_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSCHEMA_NAME(final TSqlParser.SCHEMA_NAMEContext ctx) {
    final var methodName = "exitSCHEMA_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSCOPE_IDENTITY(final TSqlParser.SCOPE_IDENTITYContext ctx) {
    final var methodName = "exitSCOPE_IDENTITY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSearch_condition(final TSqlParser.Search_conditionContext ctx) {
    final var methodName = "exitSearch_condition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSecurity_statement(final TSqlParser.Security_statementContext ctx) {
    final var methodName = "exitSecurity_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSelect_list(final TSqlParser.Select_listContext ctx) {
    final var methodName = "exitSelect_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSelect_list_elem(final TSqlParser.Select_list_elemContext ctx) {
    final var methodName = "exitSelect_list_elem";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSelect_order_by_clause(final TSqlParser.Select_order_by_clauseContext ctx) {
    final var methodName = "exitSelect_order_by_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSelect_statement(final TSqlParser.Select_statementContext ctx) {
    final var methodName = "exitSelect_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSelect_statement_standalone(
      final TSqlParser.Select_statement_standaloneContext ctx) {
    final var methodName = "exitSelect_statement_standalone";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSend_conversation(final TSqlParser.Send_conversationContext ctx) {
    final var methodName = "exitSend_conversation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSERVERPROPERTY(final TSqlParser.SERVERPROPERTYContext ctx) {
    final var methodName = "exitSERVERPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitService_broker_option(final TSqlParser.Service_broker_optionContext ctx) {
    final var methodName = "exitService_broker_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitService_name(final TSqlParser.Service_nameContext ctx) {
    final var methodName = "exitService_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSESSION_CONTEXT(final TSqlParser.SESSION_CONTEXTContext ctx) {
    final var methodName = "exitSESSION_CONTEXT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSESSION_USER(final TSqlParser.SESSION_USERContext ctx) {
    final var methodName = "exitSESSION_USER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSESSIONPROPERTY(final TSqlParser.SESSIONPROPERTYContext ctx) {
    final var methodName = "exitSESSIONPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSet_index_option(final TSqlParser.Set_index_optionContext ctx) {
    final var methodName = "exitSet_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSet_index_options(final TSqlParser.Set_index_optionsContext ctx) {
    final var methodName = "exitSet_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSet_special(final TSqlParser.Set_specialContext ctx) {
    final var methodName = "exitSet_special";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSet_statement(final TSqlParser.Set_statementContext ctx) {
    final var methodName = "exitSet_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSetuser_statement(final TSqlParser.Setuser_statementContext ctx) {
    final var methodName = "exitSetuser_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitShutdown_statement(final TSqlParser.Shutdown_statementContext ctx) {
    final var methodName = "exitShutdown_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSimple_id(final TSqlParser.Simple_idContext ctx) {
    final var methodName = "exitSimple_id";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSimple_name(final TSqlParser.Simple_nameContext ctx) {
    final var methodName = "exitSimple_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSIN(final TSqlParser.SINContext ctx) {
    final var methodName = "exitSIN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSingle_partition_rebuild_index_option(
      final TSqlParser.Single_partition_rebuild_index_optionContext ctx) {
    final var methodName = "exitSingle_partition_rebuild_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSingle_partition_rebuild_index_options(
      final TSqlParser.Single_partition_rebuild_index_optionsContext ctx) {
    final var methodName = "exitSingle_partition_rebuild_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSMALLDATETIMEFROMPARTS(final TSqlParser.SMALLDATETIMEFROMPARTSContext ctx) {
    final var methodName = "exitSMALLDATETIMEFROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSnapshot_option(final TSqlParser.Snapshot_optionContext ctx) {
    final var methodName = "exitSnapshot_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSOUNDEX(final TSqlParser.SOUNDEXContext ctx) {
    final var methodName = "exitSOUNDEX";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSPACE(final TSqlParser.SPACEContext ctx) {
    final var methodName = "exitSPACE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSpecial_list(final TSqlParser.Special_listContext ctx) {
    final var methodName = "exitSpecial_list";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSql_clauses(final TSqlParser.Sql_clausesContext ctx) {
    final var methodName = "exitSql_clauses";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSql_option(final TSqlParser.Sql_optionContext ctx) {
    final var methodName = "exitSql_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSql_union(final TSqlParser.Sql_unionContext ctx) {
    final var methodName = "exitSql_union";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSQL_VARIANT_PROPERTY(final TSqlParser.SQL_VARIANT_PROPERTYContext ctx) {
    final var methodName = "exitSQL_VARIANT_PROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSQRT(final TSqlParser.SQRTContext ctx) {
    final var methodName = "exitSQRT";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSQUARE(final TSqlParser.SQUAREContext ctx) {
    final var methodName = "exitSQUARE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSTATS_DATE(final TSqlParser.STATS_DATEContext ctx) {
    final var methodName = "exitSTATS_DATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSTR(final TSqlParser.STRContext ctx) {
    final var methodName = "exitSTR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSTRING_ESCAPE(final TSqlParser.STRING_ESCAPEContext ctx) {
    final var methodName = "exitSTRING_ESCAPE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSTRINGAGG(final TSqlParser.STRINGAGGContext ctx) {
    final var methodName = "exitSTRINGAGG";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSTUFF(final TSqlParser.STUFFContext ctx) {
    final var methodName = "exitSTUFF";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSubquery(final TSqlParser.SubqueryContext ctx) {
    final var methodName = "exitSubquery";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSUBSTRING(final TSqlParser.SUBSTRINGContext ctx) {
    final var methodName = "exitSUBSTRING";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSUSER_ID(final TSqlParser.SUSER_IDContext ctx) {
    final var methodName = "exitSUSER_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSUSER_SID(final TSqlParser.SUSER_SIDContext ctx) {
    final var methodName = "exitSUSER_SID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSUSER_SNAME(final TSqlParser.SUSER_SNAMEContext ctx) {
    final var methodName = "exitSUSER_SNAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSwitch_partition(final TSqlParser.Switch_partitionContext ctx) {
    final var methodName = "exitSwitch_partition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSwitch_search_condition_section(
      final TSqlParser.Switch_search_condition_sectionContext ctx) {
    final var methodName = "exitSwitch_search_condition_section";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSwitch_section(final TSqlParser.Switch_sectionContext ctx) {
    final var methodName = "exitSwitch_section";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSWITCHOFFSET(final TSqlParser.SWITCHOFFSETContext ctx) {
    final var methodName = "exitSWITCHOFFSET";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSybase_legacy_hint(final TSqlParser.Sybase_legacy_hintContext ctx) {
    final var methodName = "exitSybase_legacy_hint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSybase_legacy_hints(final TSqlParser.Sybase_legacy_hintsContext ctx) {
    final var methodName = "exitSybase_legacy_hints";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSYSDATETIME(final TSqlParser.SYSDATETIMEContext ctx) {
    final var methodName = "exitSYSDATETIME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSYSDATETIMEOFFSET(final TSqlParser.SYSDATETIMEOFFSETContext ctx) {
    final var methodName = "exitSYSDATETIMEOFFSET";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSYSTEM_USER(final TSqlParser.SYSTEM_USERContext ctx) {
    final var methodName = "exitSYSTEM_USER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitSYSUTCDATETIME(final TSqlParser.SYSUTCDATETIMEContext ctx) {
    final var methodName = "exitSYSUTCDATETIME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_alias(final TSqlParser.Table_aliasContext ctx) {
    final var methodName = "exitTable_alias";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_constraint(final TSqlParser.Table_constraintContext ctx) {
    final var methodName = "exitTable_constraint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);

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
            .streamChildrenByClass(TSqlParser.Foreign_key_optionsContext.class)
            .streamChildrenByClass(TSqlParser.Table_nameContext.class)
            .streamChildrenByClass(TSqlParser.Id_Context.class)
            .map(qualifiedNameContext -> ParseTreeHelper.trimToken(qualifiedNameContext.getText()))
            .filter(StringUtils::isNoneBlank)
            .filter(Predicate.not("null"::equalsIgnoreCase))
            .forEach(
                terminalNodeText ->
                    currentRelationship.put(
                        "foreignTable", NotNullSet.getInstance(terminalNodeText)));
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(TSqlParser.Foreign_key_optionsContext.class)
            .streamChildrenByClass(TSqlParser.Column_name_listContext.class)
            .streamChildrenByClass(TSqlParser.Id_Context.class)
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
            .streamChildrenByClass(TSqlParser.Column_name_listContext.class)
            .streamChildrenByClass(TSqlParser.Id_Context.class)
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

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    final var primaryKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    if (primaryKeyText.contains("PRIMARY KEY")) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    if (primaryKeyText.contains("UNIQUE")) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(TSqlParser.ClusteredContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("CLUSTERED", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.TRUE));
                }
              } else if (Strings.CI.equals("NONCLUSTERED", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.FALSE));
                }
              }
            });
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_hint(final TSqlParser.Table_hintContext ctx) {
    final var methodName = "exitTable_hint";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_indices(final TSqlParser.Table_indicesContext ctx) {
    final var methodName = "exitTable_indices";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var terminalNode =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(TSqlParser.Column_name_list_with_orderContext.class)
            .streamChildrenByClass(TSqlParser.Id_Context.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toCollection(ArrayList::new));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(TSqlParser.Column_name_list_with_orderContext.class)
            .streamChildrenByClass(TSqlParser.Id_Context.class)
            .streamChildrenByClass(TSqlParser.KeywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .toList());

    final var currentFieldList =
        terminalNode.stream().map(child -> ParseTreeHelper.getField(currentTable, child)).toList();

    ParseTreeStream.parseTreeStream(ctx)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("UNIQUE", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(TSqlParser.ClusteredContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              if (Strings.CI.equals("CLUSTERED", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.TRUE));
                }
              } else if (Strings.CI.equals("NONCLUSTERED", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.FALSE));
                }
              }
            });
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_name(final TSqlParser.Table_nameContext ctx) {
    final var methodName = "exitTable_name";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_option(final TSqlParser.Table_optionContext ctx) {
    final var methodName = "exitTable_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var isClustered = new MutableBoolean(false);
    final var currentField = new MutableObject<ObjectField>(null);
    ParseTreeStream.parseTreeStream(ctx)
        .forEach(
            child -> {
              if (child instanceof final TSqlParser.Id_Context idContext) {
                ParseTreeStream.parseTreeStream(idContext)
                    .filter(TerminalNode.class::isInstance)
                    .forEach(
                        terminalNode ->
                            currentField.setValue(
                                ParseTreeHelper.getField(currentTable, terminalNode)));
              } else if (child instanceof final TerminalNode terminalNode) {
                if (Strings.CI.equals("CLUSTERED", terminalNode.getText())) {
                  isClustered.setTrue();
                } else if (isClustered.booleanValue() && currentField.get() != null) {
                  if (Strings.CI.equals("ASC", terminalNode.getText())
                      || Strings.CI.equals("DESC", terminalNode.getText())) {
                    currentField
                        .get()
                        .put(Field.CLUSTERED, NotNullSet.getInstance(terminalNode.getText()));
                  } else {
                    currentField.get().put(Field.CLUSTERED, NotNullSet.getInstance(Boolean.TRUE));
                  }
                  currentField.setValue(null);
                }
              }
            });
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_options(final TSqlParser.Table_optionsContext ctx) {
    final var methodName = "exitTable_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_source(final TSqlParser.Table_sourceContext ctx) {
    final var methodName = "exitTable_source";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_source_item(final TSqlParser.Table_source_itemContext ctx) {
    final var methodName = "exitTable_source_item";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_sources(final TSqlParser.Table_sourcesContext ctx) {
    final var methodName = "exitTable_sources";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_type_definition(final TSqlParser.Table_type_definitionContext ctx) {
    final var methodName = "exitTable_type_definition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_type_indices(final TSqlParser.Table_type_indicesContext ctx) {
    final var methodName = "exitTable_type_indices";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTable_value_constructor(final TSqlParser.Table_value_constructorContext ctx) {
    final var methodName = "exitTable_value_constructor";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTAN(final TSqlParser.TANContext ctx) {
    final var methodName = "exitTAN";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTarget_recovery_time_option(
      final TSqlParser.Target_recovery_time_optionContext ctx) {
    final var methodName = "exitTarget_recovery_time_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTermination(final TSqlParser.TerminationContext ctx) {
    final var methodName = "exitTermination";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitThrow_error_number(final TSqlParser.Throw_error_numberContext ctx) {
    final var methodName = "exitThrow_error_number";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitThrow_message(final TSqlParser.Throw_messageContext ctx) {
    final var methodName = "exitThrow_message";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitThrow_state(final TSqlParser.Throw_stateContext ctx) {
    final var methodName = "exitThrow_state";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitThrow_statement(final TSqlParser.Throw_statementContext ctx) {
    final var methodName = "exitThrow_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTime(final TSqlParser.TimeContext ctx) {
    final var methodName = "exitTime";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTime_zone(final TSqlParser.Time_zoneContext ctx) {
    final var methodName = "exitTime_zone";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTIMEFROMPARTS(final TSqlParser.TIMEFROMPARTSContext ctx) {
    final var methodName = "exitTIMEFROMPARTS";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTODATETIMEOFFSET(final TSqlParser.TODATETIMEOFFSETContext ctx) {
    final var methodName = "exitTODATETIMEOFFSET";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTop_clause(final TSqlParser.Top_clauseContext ctx) {
    final var methodName = "exitTop_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTop_count(final TSqlParser.Top_countContext ctx) {
    final var methodName = "exitTop_count";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTop_percent(final TSqlParser.Top_percentContext ctx) {
    final var methodName = "exitTop_percent";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTransaction_statement(final TSqlParser.Transaction_statementContext ctx) {
    final var methodName = "exitTransaction_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTRANSLATE(final TSqlParser.TRANSLATEContext ctx) {
    final var methodName = "exitTRANSLATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTRIM(final TSqlParser.TRIMContext ctx) {
    final var methodName = "exitTRIM";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTruncate_table(final TSqlParser.Truncate_tableContext ctx) {
    final var methodName = "exitTruncate_table";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTRY_CAST(final TSqlParser.TRY_CASTContext ctx) {
    final var methodName = "exitTRY_CAST";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTry_catch_statement(final TSqlParser.Try_catch_statementContext ctx) {
    final var methodName = "exitTry_catch_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTsql_file(final TSqlParser.Tsql_fileContext ctx) {
    final var methodName = "exitTsql_file";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTYPE_ID(final TSqlParser.TYPE_IDContext ctx) {
    final var methodName = "exitTYPE_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTYPE_NAME(final TSqlParser.TYPE_NAMEContext ctx) {
    final var methodName = "exitTYPE_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitTYPEPROPERTY(final TSqlParser.TYPEPROPERTYContext ctx) {
    final var methodName = "exitTYPEPROPERTY";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUdt_elem(final TSqlParser.Udt_elemContext ctx) {
    final var methodName = "exitUdt_elem";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUdt_method_arguments(final TSqlParser.Udt_method_argumentsContext ctx) {
    final var methodName = "exitUdt_method_arguments";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUnary_operator_expression(final TSqlParser.Unary_operator_expressionContext ctx) {
    final var methodName = "exitUnary_operator_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUNICODE(final TSqlParser.UNICODEContext ctx) {
    final var methodName = "exitUNICODE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUnpivot(final TSqlParser.UnpivotContext ctx) {
    final var methodName = "exitUnpivot";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUnpivot_clause(final TSqlParser.Unpivot_clauseContext ctx) {
    final var methodName = "exitUnpivot_clause";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUpdate_elem(final TSqlParser.Update_elemContext ctx) {
    final var methodName = "exitUpdate_elem";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUpdate_elem_merge(final TSqlParser.Update_elem_mergeContext ctx) {
    final var methodName = "exitUpdate_elem_merge";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUpdate_statement(final TSqlParser.Update_statementContext ctx) {
    final var methodName = "exitUpdate_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUpdate_statistics(final TSqlParser.Update_statisticsContext ctx) {
    final var methodName = "exitUpdate_statistics";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUpdate_statistics_option(final TSqlParser.Update_statistics_optionContext ctx) {
    final var methodName = "exitUpdate_statistics_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUpdate_statistics_options(final TSqlParser.Update_statistics_optionsContext ctx) {
    final var methodName = "exitUpdate_statistics_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUPPER(final TSqlParser.UPPERContext ctx) {
    final var methodName = "exitUPPER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUse_statement(final TSqlParser.Use_statementContext ctx) {
    final var methodName = "exitUse_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUSER(final TSqlParser.USERContext ctx) {
    final var methodName = "exitUSER";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUSER_ID(final TSqlParser.USER_IDContext ctx) {
    final var methodName = "exitUSER_ID";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitUSER_NAME(final TSqlParser.USER_NAMEContext ctx) {
    final var methodName = "exitUSER_NAME";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitValue_call(final TSqlParser.Value_callContext ctx) {
    final var methodName = "exitValue_call";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitValue_method(final TSqlParser.Value_methodContext ctx) {
    final var methodName = "exitValue_method";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitView_attribute(final TSqlParser.View_attributeContext ctx) {
    final var methodName = "exitView_attribute";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWaitfor_conversation(final TSqlParser.Waitfor_conversationContext ctx) {
    final var methodName = "exitWaitfor_conversation";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWaitfor_statement(final TSqlParser.Waitfor_statementContext ctx) {
    final var methodName = "exitWaitfor_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWhen_matches(final TSqlParser.When_matchesContext ctx) {
    final var methodName = "exitWhen_matches";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWhile_statement(final TSqlParser.While_statementContext ctx) {
    final var methodName = "exitWhile_statement";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWindow_frame_bound(final TSqlParser.Window_frame_boundContext ctx) {
    final var methodName = "exitWindow_frame_bound";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWindow_frame_extent(final TSqlParser.Window_frame_extentContext ctx) {
    final var methodName = "exitWindow_frame_extent";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWindow_frame_following(final TSqlParser.Window_frame_followingContext ctx) {
    final var methodName = "exitWindow_frame_following";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWindow_frame_preceding(final TSqlParser.Window_frame_precedingContext ctx) {
    final var methodName = "exitWindow_frame_preceding";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWith_expression(final TSqlParser.With_expressionContext ctx) {
    final var methodName = "exitWith_expression";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWith_table_hints(final TSqlParser.With_table_hintsContext ctx) {
    final var methodName = "exitWith_table_hints";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWitness_option(final TSqlParser.Witness_optionContext ctx) {
    final var methodName = "exitWitness_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWitness_partner_equal(final TSqlParser.Witness_partner_equalContext ctx) {
    final var methodName = "exitWitness_partner_equal";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitWitness_server(final TSqlParser.Witness_serverContext ctx) {
    final var methodName = "exitWitness_server";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitXACT_STATE(final TSqlParser.XACT_STATEContext ctx) {
    final var methodName = "exitXACT_STATE";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitXml_common_directives(final TSqlParser.Xml_common_directivesContext ctx) {
    final var methodName = "exitXml_common_directives";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitXML_DATA_TYPE_FUNC(final TSqlParser.XML_DATA_TYPE_FUNCContext ctx) {
    final var methodName = "exitXML_DATA_TYPE_FUNC";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitXml_data_type_methods(final TSqlParser.Xml_data_type_methodsContext ctx) {
    final var methodName = "exitXml_data_type_methods";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitXml_declaration(final TSqlParser.Xml_declarationContext ctx) {
    final var methodName = "exitXml_declaration";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitXml_index_option(final TSqlParser.Xml_index_optionContext ctx) {
    final var methodName = "exitXml_index_option";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitXml_index_options(final TSqlParser.Xml_index_optionsContext ctx) {
    final var methodName = "exitXml_index_options";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitXml_schema_collection(final TSqlParser.Xml_schema_collectionContext ctx) {
    final var methodName = "exitXml_schema_collection";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitXml_type_definition(final TSqlParser.Xml_type_definitionContext ctx) {
    final var methodName = "exitXml_type_definition";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /** {@inheritDoc} */
  @Override
  public void exitYEAR(final TSqlParser.YEARContext ctx) {
    final var methodName = "exitYEAR";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  private List<ObjectField> getCurrentFieldList(final ParserRuleContext ctx) {
    final var methodName = "getCurrentFieldList";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var terminalNode = new ArrayList<ParseTree>();

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, TSqlParser.Column_def_table_constraintContext.class);
    if (parentContext != null && parentContext.children != null) {
      final var idChildrenList =
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(TSqlParser.Column_definitionContext.class)
              .listChildrenByClass(TSqlParser.Id_Context.class);
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(idChildrenList)
              .filter(
                  keywordContext ->
                      (keywordContext instanceof TerminalNode
                          && !Strings.CI.equals("CONSTRAINTS", keywordContext.getText())
                          && !Strings.CI.equals("UNSIGNED", keywordContext.getText())))
              .collect(Collectors.toSet()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(idChildrenList)
              .streamChildrenByClass(TSqlParser.KeywordContext.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(TSqlParser.Table_constraintContext.class)
              .streamChildrenByClass(TSqlParser.Column_name_list_with_orderContext.class)
              .streamChildrenByClass(TSqlParser.Id_Context.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
    }

    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(TSqlParser.Column_name_list_with_orderContext.class)
            .streamChildrenByClass(TSqlParser.Id_Context.class)
            .streamChildrenByClass(TSqlParser.KeywordContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));

    return terminalNode.stream()
        .map(child -> ParseTreeHelper.getField(currentTable, child))
        .collect(Collectors.toList());
  }

  private ObjectRelationship getCurrentRelationship(final ParserRuleContext ctx) {
    final var methodName = "getCurrentRelationshipList";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, TSqlParser.Column_definitionContext.class);
    final var terminalNode =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(TSqlParser.Column_definition_elementContext.class)
            .streamChildrenByClass(TSqlParser.Column_constraintContext.class)
            .streamChildrenByClass(TSqlParser.Foreign_key_optionsContext.class)
            .filter(TerminalNode.class::isInstance)
            .map(
                foreignTerminalNode -> {
                  final List<ParseTree> returnValue = new ArrayList<>();
                  if (Strings.CI.equalsAny("REFERENCES", foreignTerminalNode.getText())) {
                    returnValue.addAll(
                        ParseTreeStream.parseTreeStream(parentContext)
                            .streamChildrenByClass(TSqlParser.Id_Context.class)
                            .filter(TerminalNode.class::isInstance)
                            .toList());
                    if (returnValue.isEmpty()) {
                      returnValue.addAll(
                          ParseTreeStream.parseTreeStream(parentContext)
                              .streamChildrenByClass(
                                  TSqlParser.Column_definition_elementContext.class)
                              .streamChildrenByClass(TSqlParser.Column_constraintContext.class)
                              .streamChildrenByClass(TSqlParser.Foreign_key_optionsContext.class)
                              .streamChildrenByClass(TSqlParser.Column_name_listContext.class)
                              .streamChildrenByClass(TSqlParser.Id_Context.class)
                              .filter(TerminalNode.class::isInstance)
                              .toList());
                    }
                  }
                  return returnValue;
                })
            .flatMap(List::stream)
            .collect(Collectors.toCollection(ArrayList::new));
    final var parentContext2 =
        ParseTreeHelper.getParentContext(ctx, TSqlParser.Table_constraintContext.class);
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(parentContext2)
            .streamChildrenByClass(TSqlParser.Id_Context.class)
            .filter(TerminalNode.class::isInstance)
            .toList());
    if (terminalNode.isEmpty()) {
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext2)
              .streamChildrenByClass(TSqlParser.Foreign_key_optionsContext.class)
              .streamChildrenByClass(TSqlParser.Table_nameContext.class)
              .streamChildrenByClass(TSqlParser.Id_Context.class)
              .filter(TerminalNode.class::isInstance)
              .toList());
    }

    if (!terminalNode.isEmpty()) {
      return ParseTreeHelper.getRelationship(currentTable, terminalNode.get(0));
    }
    return null;
  }

  private SqlContext getCurrentTable(final ParserRuleContext ctx) {
    final var methodName = "getCurrentTable";
    TSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, TSqlParser.Create_tableContext.class);
    if (parentContext == null || parentContext.children == null) {
      return null;
    }

    final List<String> terminalNodeTextList =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(TSqlParser.Table_nameContext.class)
            .streamChildrenByClass(TSqlParser.Id_Context.class)
            .streamChildrenByClass(TSqlParser.KeywordContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList());
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(TSqlParser.Table_nameContext.class)
            .streamChildrenByClass(TSqlParser.Id_Context.class)
            .streamTerminalNodeString()
            .toList());

    terminalNodeTextList.replaceAll(text -> StringUtils.trimToNull(StringUtils.strip(text, "#")));

    return SqlContextImpl.getInstance(this.getRootContext(), terminalNodeTextList);
  }

  /** {@inheritDoc} */
  @Override
  public SqlRootContext getRootContext() {
    if (this.rootContext == null) {
      this.rootContext = new SqlRootContextImpl();
    }
    return this.rootContext;
  }

  @Override
  public void visitErrorNode(final ErrorNode node) {
    final var methodName = "visitErrorNode";
    TSqlParserListenerImpl.traceChildren(methodName, node);
  }

  @Override
  public void visitTerminal(final TerminalNode node) {
    final var methodName = "visitTerminal";
    TSqlParserListenerImpl.traceChildren(methodName, node);

    TSqlParserListenerImpl.input = node.getSymbol().getInputStream();
  }
}
