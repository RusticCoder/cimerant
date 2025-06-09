package cimerant.antlr.sql.plsql;

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
import java.util.stream.Stream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import sql.plsql.PlSqlParser;
import sql.plsql.PlSqlParserBaseListener;
import sql.plsql.PlSqlParserListener;

/**
 * This class provides an empty implementation of {@link PlSqlParserListener}, which can be extended
 * to create a listener which only needs to handle a subset of the available methods.
 */
public class PlSqlParserListenerImpl extends PlSqlParserBaseListener {
  private static CharStream input;
  private static final CimerantLogger logger;

  static {
    logger = (CimerantLogger) LoggerFactory.getLogger(PlSqlParserListenerImpl.class.getName());
  }

  private static final void traceChildren(final String methodName, final ParseTree ctx) {
    if (PlSqlParserListenerImpl.logger.isTraceEnabled()) {
      ParseTreeHelper.printChildren(methodName, ctx);
    }
  }

  private boolean newScript = true;
  private SqlRootContext rootContext = null;

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAccess_driver_type(final PlSqlParser.Access_driver_typeContext ctx) {
    final var methodName = "enterAccess_driver_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAccessible_by_clause(final PlSqlParser.Accessible_by_clauseContext ctx) {
    final var methodName = "enterAccessible_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAccessor(final PlSqlParser.AccessorContext ctx) {
    final var methodName = "enterAccessor";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAction_audit_clause(final PlSqlParser.Action_audit_clauseContext ctx) {
    final var methodName = "enterAction_audit_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterActions_clause(final PlSqlParser.Actions_clauseContext ctx) {
    final var methodName = "enterActions_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterActivate_standby_db_clause(
      final PlSqlParser.Activate_standby_db_clauseContext ctx) {
    final var methodName = "enterActivate_standby_db_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAd_attributes_clause(final PlSqlParser.Ad_attributes_clauseContext ctx) {
    final var methodName = "enterAd_attributes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAd_level_clause(final PlSqlParser.Ad_level_clauseContext ctx) {
    final var methodName = "enterAd_level_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAd_using_clause(final PlSqlParser.Ad_using_clauseContext ctx) {
    final var methodName = "enterAd_using_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_binding_clause(final PlSqlParser.Add_binding_clauseContext ctx) {
    final var methodName = "enterAdd_binding_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_calc_meas_clause(final PlSqlParser.Add_calc_meas_clauseContext ctx) {
    final var methodName = "enterAdd_calc_meas_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_calcs_clause(final PlSqlParser.Add_calcs_clauseContext ctx) {
    final var methodName = "enterAdd_calcs_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_column_clause(final PlSqlParser.Add_column_clauseContext ctx) {
    final var methodName = "enterAdd_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_constraint(final PlSqlParser.Add_constraintContext ctx) {
    final var methodName = "enterAdd_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_constraint_clause(final PlSqlParser.Add_constraint_clauseContext ctx) {
    final var methodName = "enterAdd_constraint_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_disk_clause(final PlSqlParser.Add_disk_clauseContext ctx) {
    final var methodName = "enterAdd_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_filegroup_clause(final PlSqlParser.Add_filegroup_clauseContext ctx) {
    final var methodName = "enterAdd_filegroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_hash_index_partition(final PlSqlParser.Add_hash_index_partitionContext ctx) {
    final var methodName = "enterAdd_hash_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_logfile_clauses(final PlSqlParser.Add_logfile_clausesContext ctx) {
    final var methodName = "enterAdd_logfile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_modify_drop_column_clauses(
      final PlSqlParser.Add_modify_drop_column_clausesContext ctx) {
    final var methodName = "enterAdd_modify_drop_column_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_mv_log_column_clause(final PlSqlParser.Add_mv_log_column_clauseContext ctx) {
    final var methodName = "enterAdd_mv_log_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_or_drop(final PlSqlParser.Add_or_dropContext ctx) {
    final var methodName = "enterAdd_or_drop";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_overflow_clause(final PlSqlParser.Add_overflow_clauseContext ctx) {
    final var methodName = "enterAdd_overflow_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_rem_container_data(final PlSqlParser.Add_rem_container_dataContext ctx) {
    final var methodName = "enterAdd_rem_container_data";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_table_partition(final PlSqlParser.Add_table_partitionContext ctx) {
    final var methodName = "enterAdd_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_update_secret(final PlSqlParser.Add_update_secretContext ctx) {
    final var methodName = "enterAdd_update_secret";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_update_secret_seps(final PlSqlParser.Add_update_secret_sepsContext ctx) {
    final var methodName = "enterAdd_update_secret_seps";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdd_volume_clause(final PlSqlParser.Add_volume_clauseContext ctx) {
    final var methodName = "enterAdd_volume_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdminister_key_management(
      final PlSqlParser.Administer_key_managementContext ctx) {
    final var methodName = "enterAdminister_key_management";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggregate_clause(final PlSqlParser.Aggregate_clauseContext ctx) {
    final var methodName = "enterAggregate_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggregate_function_name(final PlSqlParser.Aggregate_function_nameContext ctx) {
    final var methodName = "enterAggregate_function_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAll_clause(final PlSqlParser.All_clauseContext ctx) {
    final var methodName = "enterAll_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAllocate_extent_clause(final PlSqlParser.Allocate_extent_clauseContext ctx) {
    final var methodName = "enterAllocate_extent_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAllow_or_disallow(final PlSqlParser.Allow_or_disallowContext ctx) {
    final var methodName = "enterAllow_or_disallow";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_add_cache_clause(final PlSqlParser.Alter_add_cache_clauseContext ctx) {
    final var methodName = "enterAlter_add_cache_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_analytic_view(final PlSqlParser.Alter_analytic_viewContext ctx) {
    final var methodName = "enterAlter_analytic_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_attribute_definition(
      final PlSqlParser.Alter_attribute_definitionContext ctx) {
    final var methodName = "enterAlter_attribute_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_attribute_dimension(
      final PlSqlParser.Alter_attribute_dimensionContext ctx) {
    final var methodName = "enterAlter_attribute_dimension";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_audit_policy(final PlSqlParser.Alter_audit_policyContext ctx) {
    final var methodName = "enterAlter_audit_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_cluster(final PlSqlParser.Alter_clusterContext ctx) {
    final var methodName = "enterAlter_cluster";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_collection_clauses(final PlSqlParser.Alter_collection_clausesContext ctx) {
    final var methodName = "enterAlter_collection_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_database(final PlSqlParser.Alter_databaseContext ctx) {
    final var methodName = "enterAlter_database";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_database_link(final PlSqlParser.Alter_database_linkContext ctx) {
    final var methodName = "enterAlter_database_link";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_datafile_clause(final PlSqlParser.Alter_datafile_clauseContext ctx) {
    final var methodName = "enterAlter_datafile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_dimension(final PlSqlParser.Alter_dimensionContext ctx) {
    final var methodName = "enterAlter_dimension";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_diskgroup(final PlSqlParser.Alter_diskgroupContext ctx) {
    final var methodName = "enterAlter_diskgroup";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_drop_cache_clause(final PlSqlParser.Alter_drop_cache_clauseContext ctx) {
    final var methodName = "enterAlter_drop_cache_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_flashback_archive(final PlSqlParser.Alter_flashback_archiveContext ctx) {
    final var methodName = "enterAlter_flashback_archive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_function(final PlSqlParser.Alter_functionContext ctx) {
    final var methodName = "enterAlter_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_hierarchy(final PlSqlParser.Alter_hierarchyContext ctx) {
    final var methodName = "enterAlter_hierarchy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_identified_by(final PlSqlParser.Alter_identified_byContext ctx) {
    final var methodName = "enterAlter_identified_by";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_index(final PlSqlParser.Alter_indexContext ctx) {
    final var methodName = "enterAlter_index";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_index_ops_set1(final PlSqlParser.Alter_index_ops_set1Context ctx) {
    final var methodName = "enterAlter_index_ops_set1";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_index_ops_set2(final PlSqlParser.Alter_index_ops_set2Context ctx) {
    final var methodName = "enterAlter_index_ops_set2";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_index_partitioning(final PlSqlParser.Alter_index_partitioningContext ctx) {
    final var methodName = "enterAlter_index_partitioning";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_inmemory_join_group(
      final PlSqlParser.Alter_inmemory_join_groupContext ctx) {
    final var methodName = "enterAlter_inmemory_join_group";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_interval_partition(final PlSqlParser.Alter_interval_partitionContext ctx) {
    final var methodName = "enterAlter_interval_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_iot_clauses(final PlSqlParser.Alter_iot_clausesContext ctx) {
    final var methodName = "enterAlter_iot_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_java(final PlSqlParser.Alter_javaContext ctx) {
    final var methodName = "enterAlter_java";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_keystore_password(final PlSqlParser.Alter_keystore_passwordContext ctx) {
    final var methodName = "enterAlter_keystore_password";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_library(final PlSqlParser.Alter_libraryContext ctx) {
    final var methodName = "enterAlter_library";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_lockdown_profile(final PlSqlParser.Alter_lockdown_profileContext ctx) {
    final var methodName = "enterAlter_lockdown_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_mapping_table_clause(
      final PlSqlParser.Alter_mapping_table_clauseContext ctx) {
    final var methodName = "enterAlter_mapping_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_materialized_view(final PlSqlParser.Alter_materialized_viewContext ctx) {
    final var methodName = "enterAlter_materialized_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_materialized_view_log(
      final PlSqlParser.Alter_materialized_view_logContext ctx) {
    final var methodName = "enterAlter_materialized_view_log";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_materialized_zonemap(
      final PlSqlParser.Alter_materialized_zonemapContext ctx) {
    final var methodName = "enterAlter_materialized_zonemap";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_method_element(final PlSqlParser.Alter_method_elementContext ctx) {
    final var methodName = "enterAlter_method_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_method_spec(final PlSqlParser.Alter_method_specContext ctx) {
    final var methodName = "enterAlter_method_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_mv_option1(final PlSqlParser.Alter_mv_option1Context ctx) {
    final var methodName = "enterAlter_mv_option1";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_mv_refresh(final PlSqlParser.Alter_mv_refreshContext ctx) {
    final var methodName = "enterAlter_mv_refresh";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_operator(final PlSqlParser.Alter_operatorContext ctx) {
    final var methodName = "enterAlter_operator";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_outline(final PlSqlParser.Alter_outlineContext ctx) {
    final var methodName = "enterAlter_outline";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_overflow_clause(final PlSqlParser.Alter_overflow_clauseContext ctx) {
    final var methodName = "enterAlter_overflow_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_package(final PlSqlParser.Alter_packageContext ctx) {
    final var methodName = "enterAlter_package";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_pmem_filestore(final PlSqlParser.Alter_pmem_filestoreContext ctx) {
    final var methodName = "enterAlter_pmem_filestore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_procedure(final PlSqlParser.Alter_procedureContext ctx) {
    final var methodName = "enterAlter_procedure";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_resource_cost(final PlSqlParser.Alter_resource_costContext ctx) {
    final var methodName = "enterAlter_resource_cost";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_role(final PlSqlParser.Alter_roleContext ctx) {
    final var methodName = "enterAlter_role";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_rollback_segment(final PlSqlParser.Alter_rollback_segmentContext ctx) {
    final var methodName = "enterAlter_rollback_segment";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_sequence(final PlSqlParser.Alter_sequenceContext ctx) {
    final var methodName = "enterAlter_sequence";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_session(final PlSqlParser.Alter_sessionContext ctx) {
    final var methodName = "enterAlter_session";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_session_set_clause(final PlSqlParser.Alter_session_set_clauseContext ctx) {
    final var methodName = "enterAlter_session_set_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_synonym(final PlSqlParser.Alter_synonymContext ctx) {
    final var methodName = "enterAlter_synonym";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table(final PlSqlParser.Alter_tableContext ctx) {
    final var methodName = "enterAlter_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_partitioning(final PlSqlParser.Alter_table_partitioningContext ctx) {
    final var methodName = "enterAlter_table_partitioning";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_properties(final PlSqlParser.Alter_table_propertiesContext ctx) {
    final var methodName = "enterAlter_table_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_table_properties_1(final PlSqlParser.Alter_table_properties_1Context ctx) {
    final var methodName = "enterAlter_table_properties_1";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_tablespace(final PlSqlParser.Alter_tablespaceContext ctx) {
    final var methodName = "enterAlter_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_tablespace_attrs(final PlSqlParser.Alter_tablespace_attrsContext ctx) {
    final var methodName = "enterAlter_tablespace_attrs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_tablespace_encryption(
      final PlSqlParser.Alter_tablespace_encryptionContext ctx) {
    final var methodName = "enterAlter_tablespace_encryption";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_tablespace_set(final PlSqlParser.Alter_tablespace_setContext ctx) {
    final var methodName = "enterAlter_tablespace_set";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_tempfile_clause(final PlSqlParser.Alter_tempfile_clauseContext ctx) {
    final var methodName = "enterAlter_tempfile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_trigger(final PlSqlParser.Alter_triggerContext ctx) {
    final var methodName = "enterAlter_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_type(final PlSqlParser.Alter_typeContext ctx) {
    final var methodName = "enterAlter_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_user(final PlSqlParser.Alter_userContext ctx) {
    final var methodName = "enterAlter_user";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_user_editions_clause(
      final PlSqlParser.Alter_user_editions_clauseContext ctx) {
    final var methodName = "enterAlter_user_editions_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_varray_col_properties(
      final PlSqlParser.Alter_varray_col_propertiesContext ctx) {
    final var methodName = "enterAlter_varray_col_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_view(final PlSqlParser.Alter_viewContext ctx) {
    final var methodName = "enterAlter_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlter_view_editionable(final PlSqlParser.Alter_view_editionableContext ctx) {
    final var methodName = "enterAlter_view_editionable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlternate_key_clause(final PlSqlParser.Alternate_key_clauseContext ctx) {
    final var methodName = "enterAlternate_key_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAnalyze(final PlSqlParser.AnalyzeContext ctx) {
    final var methodName = "enterAnalyze";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAnonymous_block(final PlSqlParser.Anonymous_blockContext ctx) {
    final var methodName = "enterAnonymous_block";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterArgument(final PlSqlParser.ArgumentContext ctx) {
    final var methodName = "enterArgument";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAssignment_statement(final PlSqlParser.Assignment_statementContext ctx) {
    final var methodName = "enterAssignment_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAssociate_statistics(final PlSqlParser.Associate_statisticsContext ctx) {
    final var methodName = "enterAssociate_statistics";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAtom(final PlSqlParser.AtomContext ctx) {
    final var methodName = "enterAtom";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAttribute_clause(final PlSqlParser.Attribute_clauseContext ctx) {
    final var methodName = "enterAttribute_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAttribute_clustering_clause(
      final PlSqlParser.Attribute_clustering_clauseContext ctx) {
    final var methodName = "enterAttribute_clustering_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAttribute_definition(final PlSqlParser.Attribute_definitionContext ctx) {
    final var methodName = "enterAttribute_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAttribute_name(final PlSqlParser.Attribute_nameContext ctx) {
    final var methodName = "enterAttribute_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAttributes_clause(final PlSqlParser.Attributes_clauseContext ctx) {
    final var methodName = "enterAttributes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAudit_container_clause(final PlSqlParser.Audit_container_clauseContext ctx) {
    final var methodName = "enterAudit_container_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAudit_direct_path(final PlSqlParser.Audit_direct_pathContext ctx) {
    final var methodName = "enterAudit_direct_path";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAudit_operation_clause(final PlSqlParser.Audit_operation_clauseContext ctx) {
    final var methodName = "enterAudit_operation_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAudit_schema_object_clause(
      final PlSqlParser.Audit_schema_object_clauseContext ctx) {
    final var methodName = "enterAudit_schema_object_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAudit_traditional(final PlSqlParser.Audit_traditionalContext ctx) {
    final var methodName = "enterAudit_traditional";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAudit_user(final PlSqlParser.Audit_userContext ctx) {
    final var methodName = "enterAudit_user";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAuditing_by_clause(final PlSqlParser.Auditing_by_clauseContext ctx) {
    final var methodName = "enterAuditing_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAuditing_on_clause(final PlSqlParser.Auditing_on_clauseContext ctx) {
    final var methodName = "enterAuditing_on_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAutoextend_clause(final PlSqlParser.Autoextend_clauseContext ctx) {
    final var methodName = "enterAutoextend_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAutogenerated_sequence_definition(
      final PlSqlParser.Autogenerated_sequence_definitionContext ctx) {
    final var methodName = "enterAutogenerated_sequence_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAv_measure(final PlSqlParser.Av_measureContext ctx) {
    final var methodName = "enterAv_measure";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBackup_keystore(final PlSqlParser.Backup_keystoreContext ctx) {
    final var methodName = "enterBackup_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBase_meas_clause(final PlSqlParser.Base_meas_clauseContext ctx) {
    final var methodName = "enterBase_meas_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBegin_or_end(final PlSqlParser.Begin_or_endContext ctx) {
    final var methodName = "enterBegin_or_end";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBetween_bound(final PlSqlParser.Between_boundContext ctx) {
    final var methodName = "enterBetween_bound";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBetween_elements(final PlSqlParser.Between_elementsContext ctx) {
    final var methodName = "enterBetween_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBind_variable(final PlSqlParser.Bind_variableContext ctx) {
    final var methodName = "enterBind_variable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBinding_clause(final PlSqlParser.Binding_clauseContext ctx) {
    final var methodName = "enterBinding_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBitmap_join_index_clause(final PlSqlParser.Bitmap_join_index_clauseContext ctx) {
    final var methodName = "enterBitmap_join_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBlock(final PlSqlParser.BlockContext ctx) {
    final var methodName = "enterBlock";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBlockchain_drop_table_clause(
      final PlSqlParser.Blockchain_drop_table_clauseContext ctx) {
    final var methodName = "enterBlockchain_drop_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBlockchain_hash_and_data_format_clause(
      final PlSqlParser.Blockchain_hash_and_data_format_clauseContext ctx) {
    final var methodName = "enterBlockchain_hash_and_data_format_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBlockchain_row_retention_clause(
      final PlSqlParser.Blockchain_row_retention_clauseContext ctx) {
    final var methodName = "enterBlockchain_row_retention_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBlockchain_table_clauses(final PlSqlParser.Blockchain_table_clausesContext ctx) {
    final var methodName = "enterBlockchain_table_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBody(final PlSqlParser.BodyContext ctx) {
    final var methodName = "enterBody";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBounds_clause(final PlSqlParser.Bounds_clauseContext ctx) {
    final var methodName = "enterBounds_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBuild_clause(final PlSqlParser.Build_clauseContext ctx) {
    final var methodName = "enterBuild_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterC_agent_in_clause(final PlSqlParser.C_agent_in_clauseContext ctx) {
    final var methodName = "enterC_agent_in_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterC_external_parameter(final PlSqlParser.C_external_parameterContext ctx) {
    final var methodName = "enterC_external_parameter";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterC_parameters_clause(final PlSqlParser.C_parameters_clauseContext ctx) {
    final var methodName = "enterC_parameters_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterC_property(final PlSqlParser.C_propertyContext ctx) {
    final var methodName = "enterC_property";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterC_spec(final PlSqlParser.C_specContext ctx) {
    final var methodName = "enterC_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCache_clause(final PlSqlParser.Cache_clauseContext ctx) {
    final var methodName = "enterCache_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCache_or_nocache(final PlSqlParser.Cache_or_nocacheContext ctx) {
    final var methodName = "enterCache_or_nocache";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCache_specification(final PlSqlParser.Cache_specificationContext ctx) {
    final var methodName = "enterCache_specification";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCalc_meas_clause(final PlSqlParser.Calc_meas_clauseContext ctx) {
    final var methodName = "enterCalc_meas_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCall_spec(final PlSqlParser.Call_specContext ctx) {
    final var methodName = "enterCall_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCall_statement(final PlSqlParser.Call_statementContext ctx) {
    final var methodName = "enterCall_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaption_clause(final PlSqlParser.Caption_clauseContext ctx) {
    final var methodName = "enterCaption_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCase_else_part(final PlSqlParser.Case_else_partContext ctx) {
    final var methodName = "enterCase_else_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCase_statement(final PlSqlParser.Case_statementContext ctx) {
    final var methodName = "enterCase_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCav_using_clause(final PlSqlParser.Cav_using_clauseContext ctx) {
    final var methodName = "enterCav_using_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCdb_fleet_clauses(final PlSqlParser.Cdb_fleet_clausesContext ctx) {
    final var methodName = "enterCdb_fleet_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCell_assignment(final PlSqlParser.Cell_assignmentContext ctx) {
    final var methodName = "enterCell_assignment";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCell_reference_options(final PlSqlParser.Cell_reference_optionsContext ctx) {
    final var methodName = "enterCell_reference_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChar_set_name(final PlSqlParser.Char_set_nameContext ctx) {
    final var methodName = "enterChar_set_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharacter_set_clause(final PlSqlParser.Character_set_clauseContext ctx) {
    final var methodName = "enterCharacter_set_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheck_constraint(final PlSqlParser.Check_constraintContext ctx) {
    final var methodName = "enterCheck_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheck_diskgroup_clause(final PlSqlParser.Check_diskgroup_clauseContext ctx) {
    final var methodName = "enterCheck_diskgroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClassification_clause(final PlSqlParser.Classification_clauseContext ctx) {
    final var methodName = "enterClassification_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClassification_item(final PlSqlParser.Classification_itemContext ctx) {
    final var methodName = "enterClassification_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClause_options(final PlSqlParser.Clause_optionsContext ctx) {
    final var methodName = "enterClause_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClose_keystore(final PlSqlParser.Close_keystoreContext ctx) {
    final var methodName = "enterClose_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClose_statement(final PlSqlParser.Close_statementContext ctx) {
    final var methodName = "enterClose_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCluster_clause(final PlSqlParser.Cluster_clauseContext ctx) {
    final var methodName = "enterCluster_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCluster_index_clause(final PlSqlParser.Cluster_index_clauseContext ctx) {
    final var methodName = "enterCluster_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCluster_name(final PlSqlParser.Cluster_nameContext ctx) {
    final var methodName = "enterCluster_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClustering_column_group(final PlSqlParser.Clustering_column_groupContext ctx) {
    final var methodName = "enterClustering_column_group";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClustering_columns(final PlSqlParser.Clustering_columnsContext ctx) {
    final var methodName = "enterClustering_columns";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClustering_join(final PlSqlParser.Clustering_joinContext ctx) {
    final var methodName = "enterClustering_join";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClustering_join_item(final PlSqlParser.Clustering_join_itemContext ctx) {
    final var methodName = "enterClustering_join_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCoalesce_index_partition(final PlSqlParser.Coalesce_index_partitionContext ctx) {
    final var methodName = "enterCoalesce_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCoalesce_table_partition(final PlSqlParser.Coalesce_table_partitionContext ctx) {
    final var methodName = "enterCoalesce_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollation_name(final PlSqlParser.Collation_nameContext ctx) {
    final var methodName = "enterCollation_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollect_order_by_part(final PlSqlParser.Collect_order_by_partContext ctx) {
    final var methodName = "enterCollect_order_by_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollection_expression(final PlSqlParser.Collection_expressionContext ctx) {
    final var methodName = "enterCollection_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollection_item(final PlSqlParser.Collection_itemContext ctx) {
    final var methodName = "enterCollection_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollection_method_call(final PlSqlParser.Collection_method_callContext ctx) {
    final var methodName = "enterCollection_method_call";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollection_name(final PlSqlParser.Collection_nameContext ctx) {
    final var methodName = "enterCollection_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_alias(final PlSqlParser.Column_aliasContext ctx) {
    final var methodName = "enterColumn_alias";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_association(final PlSqlParser.Column_associationContext ctx) {
    final var methodName = "enterColumn_association";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_based_update_set_clause(
      final PlSqlParser.Column_based_update_set_clauseContext ctx) {
    final var methodName = "enterColumn_based_update_set_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_clauses(final PlSqlParser.Column_clausesContext ctx) {
    final var methodName = "enterColumn_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_collation_name(final PlSqlParser.Column_collation_nameContext ctx) {
    final var methodName = "enterColumn_collation_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_definition(final PlSqlParser.Column_definitionContext ctx) {
    final var methodName = "enterColumn_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_list(final PlSqlParser.Column_listContext ctx) {
    final var methodName = "enterColumn_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_name(final PlSqlParser.Column_nameContext ctx) {
    final var methodName = "enterColumn_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_one_or_more_sub_clause(
      final PlSqlParser.Column_one_or_more_sub_clauseContext ctx) {
    final var methodName = "enterColumn_one_or_more_sub_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_or_attribute(final PlSqlParser.Column_or_attributeContext ctx) {
    final var methodName = "enterColumn_or_attribute";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumn_properties(final PlSqlParser.Column_propertiesContext ctx) {
    final var methodName = "enterColumn_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComment_on_column(final PlSqlParser.Comment_on_columnContext ctx) {
    final var methodName = "enterComment_on_column";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComment_on_materialized(final PlSqlParser.Comment_on_materializedContext ctx) {
    final var methodName = "enterComment_on_materialized";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComment_on_table(final PlSqlParser.Comment_on_tableContext ctx) {
    final var methodName = "enterComment_on_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommit_statement(final PlSqlParser.Commit_statementContext ctx) {
    final var methodName = "enterCommit_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommit_switchover_clause(final PlSqlParser.Commit_switchover_clauseContext ctx) {
    final var methodName = "enterCommit_switchover_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompile_type_clause(final PlSqlParser.Compile_type_clauseContext ctx) {
    final var methodName = "enterCompile_type_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompiler_parameters_clause(
      final PlSqlParser.Compiler_parameters_clauseContext ctx) {
    final var methodName = "enterCompiler_parameters_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComponent_action(final PlSqlParser.Component_actionContext ctx) {
    final var methodName = "enterComponent_action";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComponent_actions(final PlSqlParser.Component_actionsContext ctx) {
    final var methodName = "enterComponent_actions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComposite_hash_partitions(
      final PlSqlParser.Composite_hash_partitionsContext ctx) {
    final var methodName = "enterComposite_hash_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComposite_list_partitions(
      final PlSqlParser.Composite_list_partitionsContext ctx) {
    final var methodName = "enterComposite_list_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComposite_range_partitions(
      final PlSqlParser.Composite_range_partitionsContext ctx) {
    final var methodName = "enterComposite_range_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompound_dml_trigger(final PlSqlParser.Compound_dml_triggerContext ctx) {
    final var methodName = "enterCompound_dml_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompound_expression(final PlSqlParser.Compound_expressionContext ctx) {
    final var methodName = "enterCompound_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompound_trigger_block(final PlSqlParser.Compound_trigger_blockContext ctx) {
    final var methodName = "enterCompound_trigger_block";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompute_clauses(final PlSqlParser.Compute_clausesContext ctx) {
    final var methodName = "enterCompute_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConcatenation(final PlSqlParser.ConcatenationContext ctx) {
    final var methodName = "enterConcatenation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCondition(final PlSqlParser.ConditionContext ctx) {
    final var methodName = "enterCondition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConditional_insert_clause(
      final PlSqlParser.Conditional_insert_clauseContext ctx) {
    final var methodName = "enterConditional_insert_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConditional_insert_else_part(
      final PlSqlParser.Conditional_insert_else_partContext ctx) {
    final var methodName = "enterConditional_insert_else_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConditional_insert_when_part(
      final PlSqlParser.Conditional_insert_when_partContext ctx) {
    final var methodName = "enterConditional_insert_when_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConnection_qualifier(final PlSqlParser.Connection_qualifierContext ctx) {
    final var methodName = "enterConnection_qualifier";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstant(final PlSqlParser.ConstantContext ctx) {
    final var methodName = "enterConstant";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraint_clauses(final PlSqlParser.Constraint_clausesContext ctx) {
    final var methodName = "enterConstraint_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraint_name(final PlSqlParser.Constraint_nameContext ctx) {
    final var methodName = "enterConstraint_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraint_state(final PlSqlParser.Constraint_stateContext ctx) {
    final var methodName = "enterConstraint_state";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstructor_declaration(final PlSqlParser.Constructor_declarationContext ctx) {
    final var methodName = "enterConstructor_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstructor_spec(final PlSqlParser.Constructor_specContext ctx) {
    final var methodName = "enterConstructor_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterContainer_clause(final PlSqlParser.Container_clauseContext ctx) {
    final var methodName = "enterContainer_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterContainer_data_clause(final PlSqlParser.Container_data_clauseContext ctx) {
    final var methodName = "enterContainer_data_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterContainer_names(final PlSqlParser.Container_namesContext ctx) {
    final var methodName = "enterContainer_names";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterContainer_tableview_name(final PlSqlParser.Container_tableview_nameContext ctx) {
    final var methodName = "enterContainer_tableview_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterContinue_statement(final PlSqlParser.Continue_statementContext ctx) {
    final var methodName = "enterContinue_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterControlfile_clauses(final PlSqlParser.Controlfile_clausesContext ctx) {
    final var methodName = "enterControlfile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterControlfile_options(final PlSqlParser.Controlfile_optionsContext ctx) {
    final var methodName = "enterControlfile_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConvert_database_clause(final PlSqlParser.Convert_database_clauseContext ctx) {
    final var methodName = "enterConvert_database_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConvert_redundancy_clause(
      final PlSqlParser.Convert_redundancy_clauseContext ctx) {
    final var methodName = "enterConvert_redundancy_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCost_class_name(final PlSqlParser.Cost_class_nameContext ctx) {
    final var methodName = "enterCost_class_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCost_matrix_clause(final PlSqlParser.Cost_matrix_clauseContext ctx) {
    final var methodName = "enterCost_matrix_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCpu_cost(final PlSqlParser.Cpu_costContext ctx) {
    final var methodName = "enterCpu_cost";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_analytic_view(final PlSqlParser.Create_analytic_viewContext ctx) {
    final var methodName = "enterCreate_analytic_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_attribute_dimension(
      final PlSqlParser.Create_attribute_dimensionContext ctx) {
    final var methodName = "enterCreate_attribute_dimension";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_audit_policy(final PlSqlParser.Create_audit_policyContext ctx) {
    final var methodName = "enterCreate_audit_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_cluster(final PlSqlParser.Create_clusterContext ctx) {
    final var methodName = "enterCreate_cluster";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_context(final PlSqlParser.Create_contextContext ctx) {
    final var methodName = "enterCreate_context";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_controlfile(final PlSqlParser.Create_controlfileContext ctx) {
    final var methodName = "enterCreate_controlfile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_database(final PlSqlParser.Create_databaseContext ctx) {
    final var methodName = "enterCreate_database";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_database_link(final PlSqlParser.Create_database_linkContext ctx) {
    final var methodName = "enterCreate_database_link";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_datafile_clause(final PlSqlParser.Create_datafile_clauseContext ctx) {
    final var methodName = "enterCreate_datafile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_dimension(final PlSqlParser.Create_dimensionContext ctx) {
    final var methodName = "enterCreate_dimension";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_directory(final PlSqlParser.Create_directoryContext ctx) {
    final var methodName = "enterCreate_directory";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_diskgroup(final PlSqlParser.Create_diskgroupContext ctx) {
    final var methodName = "enterCreate_diskgroup";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_edition(final PlSqlParser.Create_editionContext ctx) {
    final var methodName = "enterCreate_edition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_flashback_archive(final PlSqlParser.Create_flashback_archiveContext ctx) {
    final var methodName = "enterCreate_flashback_archive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_function_body(final PlSqlParser.Create_function_bodyContext ctx) {
    final var methodName = "enterCreate_function_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_hierarchy(final PlSqlParser.Create_hierarchyContext ctx) {
    final var methodName = "enterCreate_hierarchy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_index(final PlSqlParser.Create_indexContext ctx) {
    final var methodName = "enterCreate_index";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_inmemory_join_group(
      final PlSqlParser.Create_inmemory_join_groupContext ctx) {
    final var methodName = "enterCreate_inmemory_join_group";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_java(final PlSqlParser.Create_javaContext ctx) {
    final var methodName = "enterCreate_java";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_key(final PlSqlParser.Create_keyContext ctx) {
    final var methodName = "enterCreate_key";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_keystore(final PlSqlParser.Create_keystoreContext ctx) {
    final var methodName = "enterCreate_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_library(final PlSqlParser.Create_libraryContext ctx) {
    final var methodName = "enterCreate_library";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_lockdown_profile(final PlSqlParser.Create_lockdown_profileContext ctx) {
    final var methodName = "enterCreate_lockdown_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_materialized_view(final PlSqlParser.Create_materialized_viewContext ctx) {
    final var methodName = "enterCreate_materialized_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_materialized_view_log(
      final PlSqlParser.Create_materialized_view_logContext ctx) {
    final var methodName = "enterCreate_materialized_view_log";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_materialized_zonemap(
      final PlSqlParser.Create_materialized_zonemapContext ctx) {
    final var methodName = "enterCreate_materialized_zonemap";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_mv_refresh(final PlSqlParser.Create_mv_refreshContext ctx) {
    final var methodName = "enterCreate_mv_refresh";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_operator(final PlSqlParser.Create_operatorContext ctx) {
    final var methodName = "enterCreate_operator";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_outline(final PlSqlParser.Create_outlineContext ctx) {
    final var methodName = "enterCreate_outline";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_package(final PlSqlParser.Create_packageContext ctx) {
    final var methodName = "enterCreate_package";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_package_body(final PlSqlParser.Create_package_bodyContext ctx) {
    final var methodName = "enterCreate_package_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_pmem_filestore(final PlSqlParser.Create_pmem_filestoreContext ctx) {
    final var methodName = "enterCreate_pmem_filestore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_procedure_body(final PlSqlParser.Create_procedure_bodyContext ctx) {
    final var methodName = "enterCreate_procedure_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_profile(final PlSqlParser.Create_profileContext ctx) {
    final var methodName = "enterCreate_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_restore_point(final PlSqlParser.Create_restore_pointContext ctx) {
    final var methodName = "enterCreate_restore_point";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_role(final PlSqlParser.Create_roleContext ctx) {
    final var methodName = "enterCreate_role";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_rollback_segment(final PlSqlParser.Create_rollback_segmentContext ctx) {
    final var methodName = "enterCreate_rollback_segment";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_sequence(final PlSqlParser.Create_sequenceContext ctx) {
    final var methodName = "enterCreate_sequence";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_spfile(final PlSqlParser.Create_spfileContext ctx) {
    final var methodName = "enterCreate_spfile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_synonym(final PlSqlParser.Create_synonymContext ctx) {
    final var methodName = "enterCreate_synonym";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_table(final PlSqlParser.Create_tableContext ctx) {
    final var methodName = "enterCreate_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);

    this.newScript = true;
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_tablespace(final PlSqlParser.Create_tablespaceContext ctx) {
    final var methodName = "enterCreate_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_tablespace_set(final PlSqlParser.Create_tablespace_setContext ctx) {
    final var methodName = "enterCreate_tablespace_set";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_trigger(final PlSqlParser.Create_triggerContext ctx) {
    final var methodName = "enterCreate_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_type(final PlSqlParser.Create_typeContext ctx) {
    final var methodName = "enterCreate_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_user(final PlSqlParser.Create_userContext ctx) {
    final var methodName = "enterCreate_user";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_view(final PlSqlParser.Create_viewContext ctx) {
    final var methodName = "enterCreate_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_zonemap_as_subquery(
      final PlSqlParser.Create_zonemap_as_subqueryContext ctx) {
    final var methodName = "enterCreate_zonemap_as_subquery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreate_zonemap_on_table(final PlSqlParser.Create_zonemap_on_tableContext ctx) {
    final var methodName = "enterCreate_zonemap_on_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCredential_name(final PlSqlParser.Credential_nameContext ctx) {
    final var methodName = "enterCredential_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCursor_declaration(final PlSqlParser.Cursor_declarationContext ctx) {
    final var methodName = "enterCursor_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCursor_expression(final PlSqlParser.Cursor_expressionContext ctx) {
    final var methodName = "enterCursor_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCursor_loop_param(final PlSqlParser.Cursor_loop_paramContext ctx) {
    final var methodName = "enterCursor_loop_param";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCursor_manipulation_statements(
      final PlSqlParser.Cursor_manipulation_statementsContext ctx) {
    final var methodName = "enterCursor_manipulation_statements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCursor_name(final PlSqlParser.Cursor_nameContext ctx) {
    final var methodName = "enterCursor_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCycle_clause(final PlSqlParser.Cycle_clauseContext ctx) {
    final var methodName = "enterCycle_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterData_manipulation_language_statements(
      final PlSqlParser.Data_manipulation_language_statementsContext ctx) {
    final var methodName = "enterData_manipulation_language_statements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatabase(final PlSqlParser.DatabaseContext ctx) {
    final var methodName = "enterDatabase";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatabase_clause(final PlSqlParser.Database_clauseContext ctx) {
    final var methodName = "enterDatabase_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatabase_file_clauses(final PlSqlParser.Database_file_clausesContext ctx) {
    final var methodName = "enterDatabase_file_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatabase_logging_clauses(final PlSqlParser.Database_logging_clausesContext ctx) {
    final var methodName = "enterDatabase_logging_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatabase_logging_sub_clause(
      final PlSqlParser.Database_logging_sub_clauseContext ctx) {
    final var methodName = "enterDatabase_logging_sub_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatabase_name(final PlSqlParser.Database_nameContext ctx) {
    final var methodName = "enterDatabase_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatafile_specification(final PlSqlParser.Datafile_specificationContext ctx) {
    final var methodName = "enterDatafile_specification";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatafile_tempfile_clauses(
      final PlSqlParser.Datafile_tempfile_clausesContext ctx) {
    final var methodName = "enterDatafile_tempfile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatafile_tempfile_spec(final PlSqlParser.Datafile_tempfile_specContext ctx) {
    final var methodName = "enterDatafile_tempfile_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatatype(final PlSqlParser.DatatypeContext ctx) {
    final var methodName = "enterDatatype";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatatype_null_enable(final PlSqlParser.Datatype_null_enableContext ctx) {
    final var methodName = "enterDatatype_null_enable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatetime_expr(final PlSqlParser.Datetime_exprContext ctx) {
    final var methodName = "enterDatetime_expr";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDb_name(final PlSqlParser.Db_nameContext ctx) {
    final var methodName = "enterDb_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeallocate_unused_clause(final PlSqlParser.Deallocate_unused_clauseContext ctx) {
    final var methodName = "enterDeallocate_unused_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeclare_spec(final PlSqlParser.Declare_specContext ctx) {
    final var methodName = "enterDeclare_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_aggregate_clause(final PlSqlParser.Default_aggregate_clauseContext ctx) {
    final var methodName = "enterDefault_aggregate_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_collation_clause(final PlSqlParser.Default_collation_clauseContext ctx) {
    final var methodName = "enterDefault_collation_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_cost_clause(final PlSqlParser.Default_cost_clauseContext ctx) {
    final var methodName = "enterDefault_cost_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_index_compression(
      final PlSqlParser.Default_index_compressionContext ctx) {
    final var methodName = "enterDefault_index_compression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_measure_clause(final PlSqlParser.Default_measure_clauseContext ctx) {
    final var methodName = "enterDefault_measure_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_selectivity(final PlSqlParser.Default_selectivityContext ctx) {
    final var methodName = "enterDefault_selectivity";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_selectivity_clause(
      final PlSqlParser.Default_selectivity_clauseContext ctx) {
    final var methodName = "enterDefault_selectivity_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_settings_clause(final PlSqlParser.Default_settings_clauseContext ctx) {
    final var methodName = "enterDefault_settings_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_table_compression(
      final PlSqlParser.Default_table_compressionContext ctx) {
    final var methodName = "enterDefault_table_compression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_tablespace(final PlSqlParser.Default_tablespaceContext ctx) {
    final var methodName = "enterDefault_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_tablespace_params(
      final PlSqlParser.Default_tablespace_paramsContext ctx) {
    final var methodName = "enterDefault_tablespace_params";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_temp_tablespace(final PlSqlParser.Default_temp_tablespaceContext ctx) {
    final var methodName = "enterDefault_temp_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefault_value_part(final PlSqlParser.Default_value_partContext ctx) {
    final var methodName = "enterDefault_value_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeferred_segment_creation(
      final PlSqlParser.Deferred_segment_creationContext ctx) {
    final var methodName = "enterDeferred_segment_creation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDelete_secret(final PlSqlParser.Delete_secretContext ctx) {
    final var methodName = "enterDelete_secret";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDelete_secret_seps(final PlSqlParser.Delete_secret_sepsContext ctx) {
    final var methodName = "enterDelete_secret_seps";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDelete_statement(final PlSqlParser.Delete_statementContext ctx) {
    final var methodName = "enterDelete_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDependent_exceptions_part(
      final PlSqlParser.Dependent_exceptions_partContext ctx) {
    final var methodName = "enterDependent_exceptions_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDependent_handling_clause(
      final PlSqlParser.Dependent_handling_clauseContext ctx) {
    final var methodName = "enterDependent_handling_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescription_clause(final PlSqlParser.Description_clauseContext ctx) {
    final var methodName = "enterDescription_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDim_by_clause(final PlSqlParser.Dim_by_clauseContext ctx) {
    final var methodName = "enterDim_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDim_key(final PlSqlParser.Dim_keyContext ctx) {
    final var methodName = "enterDim_key";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDim_order_clause(final PlSqlParser.Dim_order_clauseContext ctx) {
    final var methodName = "enterDim_order_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDim_ref(final PlSqlParser.Dim_refContext ctx) {
    final var methodName = "enterDim_ref";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDimension_join_clause(final PlSqlParser.Dimension_join_clauseContext ctx) {
    final var methodName = "enterDimension_join_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDir_name(final PlSqlParser.Dir_nameContext ctx) {
    final var methodName = "enterDir_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDir_object_name(final PlSqlParser.Dir_object_nameContext ctx) {
    final var methodName = "enterDir_object_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDirectory_name(final PlSqlParser.Directory_nameContext ctx) {
    final var methodName = "enterDirectory_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDirectory_path(final PlSqlParser.Directory_pathContext ctx) {
    final var methodName = "enterDirectory_path";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDisable_constraint(final PlSqlParser.Disable_constraintContext ctx) {
    final var methodName = "enterDisable_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDisable_enable(final PlSqlParser.Disable_enableContext ctx) {
    final var methodName = "enterDisable_enable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDisassociate_statistics(final PlSqlParser.Disassociate_statisticsContext ctx) {
    final var methodName = "enterDisassociate_statistics";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDisk_offline_clause(final PlSqlParser.Disk_offline_clauseContext ctx) {
    final var methodName = "enterDisk_offline_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDisk_online_clause(final PlSqlParser.Disk_online_clauseContext ctx) {
    final var methodName = "enterDisk_online_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDisk_region_clause(final PlSqlParser.Disk_region_clauseContext ctx) {
    final var methodName = "enterDisk_region_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDiskgroup_alias_clauses(final PlSqlParser.Diskgroup_alias_clausesContext ctx) {
    final var methodName = "enterDiskgroup_alias_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDiskgroup_attributes(final PlSqlParser.Diskgroup_attributesContext ctx) {
    final var methodName = "enterDiskgroup_attributes";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDiskgroup_availability(final PlSqlParser.Diskgroup_availabilityContext ctx) {
    final var methodName = "enterDiskgroup_availability";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDiskgroup_directory_clauses(
      final PlSqlParser.Diskgroup_directory_clausesContext ctx) {
    final var methodName = "enterDiskgroup_directory_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDiskgroup_template_clauses(
      final PlSqlParser.Diskgroup_template_clausesContext ctx) {
    final var methodName = "enterDiskgroup_template_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDiskgroup_volume_clauses(final PlSqlParser.Diskgroup_volume_clausesContext ctx) {
    final var methodName = "enterDiskgroup_volume_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDml_event_clause(final PlSqlParser.Dml_event_clauseContext ctx) {
    final var methodName = "enterDml_event_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDml_event_element(final PlSqlParser.Dml_event_elementContext ctx) {
    final var methodName = "enterDml_event_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDml_event_nested_clause(final PlSqlParser.Dml_event_nested_clauseContext ctx) {
    final var methodName = "enterDml_event_nested_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDml_table_expression_clause(
      final PlSqlParser.Dml_table_expression_clauseContext ctx) {
    final var methodName = "enterDml_table_expression_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDomain(final PlSqlParser.DomainContext ctx) {
    final var methodName = "enterDomain";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDomain_index_clause(final PlSqlParser.Domain_index_clauseContext ctx) {
    final var methodName = "enterDomain_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_analytic_view(final PlSqlParser.Drop_analytic_viewContext ctx) {
    final var methodName = "enterDrop_analytic_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_attribute_dimension(final PlSqlParser.Drop_attribute_dimensionContext ctx) {
    final var methodName = "enterDrop_attribute_dimension";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_audit_policy(final PlSqlParser.Drop_audit_policyContext ctx) {
    final var methodName = "enterDrop_audit_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_binding_clause(final PlSqlParser.Drop_binding_clauseContext ctx) {
    final var methodName = "enterDrop_binding_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_cluster(final PlSqlParser.Drop_clusterContext ctx) {
    final var methodName = "enterDrop_cluster";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_column_clause(final PlSqlParser.Drop_column_clauseContext ctx) {
    final var methodName = "enterDrop_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_constraint(final PlSqlParser.Drop_constraintContext ctx) {
    final var methodName = "enterDrop_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_constraint_clause(final PlSqlParser.Drop_constraint_clauseContext ctx) {
    final var methodName = "enterDrop_constraint_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_context(final PlSqlParser.Drop_contextContext ctx) {
    final var methodName = "enterDrop_context";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_database(final PlSqlParser.Drop_databaseContext ctx) {
    final var methodName = "enterDrop_database";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_database_link(final PlSqlParser.Drop_database_linkContext ctx) {
    final var methodName = "enterDrop_database_link";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_directory(final PlSqlParser.Drop_directoryContext ctx) {
    final var methodName = "enterDrop_directory";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_disk_clause(final PlSqlParser.Drop_disk_clauseContext ctx) {
    final var methodName = "enterDrop_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_diskgroup(final PlSqlParser.Drop_diskgroupContext ctx) {
    final var methodName = "enterDrop_diskgroup";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_diskgroup_file_clause(
      final PlSqlParser.Drop_diskgroup_file_clauseContext ctx) {
    final var methodName = "enterDrop_diskgroup_file_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_edition(final PlSqlParser.Drop_editionContext ctx) {
    final var methodName = "enterDrop_edition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_filegroup_clause(final PlSqlParser.Drop_filegroup_clauseContext ctx) {
    final var methodName = "enterDrop_filegroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_flashback_archive(final PlSqlParser.Drop_flashback_archiveContext ctx) {
    final var methodName = "enterDrop_flashback_archive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_function(final PlSqlParser.Drop_functionContext ctx) {
    final var methodName = "enterDrop_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_hierarchy(final PlSqlParser.Drop_hierarchyContext ctx) {
    final var methodName = "enterDrop_hierarchy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_index(final PlSqlParser.Drop_indexContext ctx) {
    final var methodName = "enterDrop_index";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_index_partition(final PlSqlParser.Drop_index_partitionContext ctx) {
    final var methodName = "enterDrop_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_indextype(final PlSqlParser.Drop_indextypeContext ctx) {
    final var methodName = "enterDrop_indextype";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_inmemory_join_group(final PlSqlParser.Drop_inmemory_join_groupContext ctx) {
    final var methodName = "enterDrop_inmemory_join_group";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_java(final PlSqlParser.Drop_javaContext ctx) {
    final var methodName = "enterDrop_java";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_library(final PlSqlParser.Drop_libraryContext ctx) {
    final var methodName = "enterDrop_library";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_lockdown_profile(final PlSqlParser.Drop_lockdown_profileContext ctx) {
    final var methodName = "enterDrop_lockdown_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_logfile_clauses(final PlSqlParser.Drop_logfile_clausesContext ctx) {
    final var methodName = "enterDrop_logfile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_materialized_view(final PlSqlParser.Drop_materialized_viewContext ctx) {
    final var methodName = "enterDrop_materialized_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_materialized_zonemap(
      final PlSqlParser.Drop_materialized_zonemapContext ctx) {
    final var methodName = "enterDrop_materialized_zonemap";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_mirror_clause(final PlSqlParser.Drop_mirror_clauseContext ctx) {
    final var methodName = "enterDrop_mirror_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_operator(final PlSqlParser.Drop_operatorContext ctx) {
    final var methodName = "enterDrop_operator";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_outline(final PlSqlParser.Drop_outlineContext ctx) {
    final var methodName = "enterDrop_outline";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_package(final PlSqlParser.Drop_packageContext ctx) {
    final var methodName = "enterDrop_package";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_pmem_filestore(final PlSqlParser.Drop_pmem_filestoreContext ctx) {
    final var methodName = "enterDrop_pmem_filestore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_procedure(final PlSqlParser.Drop_procedureContext ctx) {
    final var methodName = "enterDrop_procedure";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_restore_point(final PlSqlParser.Drop_restore_pointContext ctx) {
    final var methodName = "enterDrop_restore_point";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_role(final PlSqlParser.Drop_roleContext ctx) {
    final var methodName = "enterDrop_role";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_rollback_segment(final PlSqlParser.Drop_rollback_segmentContext ctx) {
    final var methodName = "enterDrop_rollback_segment";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_sequence(final PlSqlParser.Drop_sequenceContext ctx) {
    final var methodName = "enterDrop_sequence";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_synonym(final PlSqlParser.Drop_synonymContext ctx) {
    final var methodName = "enterDrop_synonym";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_table(final PlSqlParser.Drop_tableContext ctx) {
    final var methodName = "enterDrop_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_table_partition(final PlSqlParser.Drop_table_partitionContext ctx) {
    final var methodName = "enterDrop_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_tablespace(final PlSqlParser.Drop_tablespaceContext ctx) {
    final var methodName = "enterDrop_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_tablespace_set(final PlSqlParser.Drop_tablespace_setContext ctx) {
    final var methodName = "enterDrop_tablespace_set";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_trigger(final PlSqlParser.Drop_triggerContext ctx) {
    final var methodName = "enterDrop_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_type(final PlSqlParser.Drop_typeContext ctx) {
    final var methodName = "enterDrop_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_user(final PlSqlParser.Drop_userContext ctx) {
    final var methodName = "enterDrop_user";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDrop_view(final PlSqlParser.Drop_viewContext ctx) {
    final var methodName = "enterDrop_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDynamic_base_profile(final PlSqlParser.Dynamic_base_profileContext ctx) {
    final var methodName = "enterDynamic_base_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDynamic_returning_clause(final PlSqlParser.Dynamic_returning_clauseContext ctx) {
    final var methodName = "enterDynamic_returning_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEdition_name(final PlSqlParser.Edition_nameContext ctx) {
    final var methodName = "enterEdition_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEditioning_clause(final PlSqlParser.Editioning_clauseContext ctx) {
    final var methodName = "enterEditioning_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterElement(final PlSqlParser.ElementContext ctx) {
    final var methodName = "enterElement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterElement_spec(final PlSqlParser.Element_specContext ctx) {
    final var methodName = "enterElement_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterElement_spec_options(final PlSqlParser.Element_spec_optionsContext ctx) {
    final var methodName = "enterElement_spec_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterElse_part(final PlSqlParser.Else_partContext ctx) {
    final var methodName = "enterElse_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterElsif_part(final PlSqlParser.Elsif_partContext ctx) {
    final var methodName = "enterElsif_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnable_constraint(final PlSqlParser.Enable_constraintContext ctx) {
    final var methodName = "enterEnable_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnable_disable_clause(final PlSqlParser.Enable_disable_clauseContext ctx) {
    final var methodName = "enterEnable_disable_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnable_disable_volume(final PlSqlParser.Enable_disable_volumeContext ctx) {
    final var methodName = "enterEnable_disable_volume";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnable_or_disable(final PlSqlParser.Enable_or_disableContext ctx) {
    final var methodName = "enterEnable_or_disable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnable_pluggable_database(
      final PlSqlParser.Enable_pluggable_databaseContext ctx) {
    final var methodName = "enterEnable_pluggable_database";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEncryption_spec(final PlSqlParser.Encryption_specContext ctx) {
    final var methodName = "enterEncryption_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnd_time_column(final PlSqlParser.End_time_columnContext ctx) {
    final var methodName = "enterEnd_time_column";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEquijoin_condition(final PlSqlParser.Equijoin_conditionContext ctx) {
    final var methodName = "enterEquijoin_condition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterError_directive(final PlSqlParser.Error_directiveContext ctx) {
    final var methodName = "enterError_directive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterError_logging_clause(final PlSqlParser.Error_logging_clauseContext ctx) {
    final var methodName = "enterError_logging_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterError_logging_into_part(final PlSqlParser.Error_logging_into_partContext ctx) {
    final var methodName = "enterError_logging_into_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterError_logging_reject_part(
      final PlSqlParser.Error_logging_reject_partContext ctx) {
    final var methodName = "enterError_logging_reject_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEvaluation_edition_clause(
      final PlSqlParser.Evaluation_edition_clauseContext ctx) {
    final var methodName = "enterEvaluation_edition_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    final var methodName = "enterEveryRule";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterException_declaration(final PlSqlParser.Exception_declarationContext ctx) {
    final var methodName = "enterException_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterException_handler(final PlSqlParser.Exception_handlerContext ctx) {
    final var methodName = "enterException_handler";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterException_name(final PlSqlParser.Exception_nameContext ctx) {
    final var methodName = "enterException_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExceptions_clause(final PlSqlParser.Exceptions_clauseContext ctx) {
    final var methodName = "enterExceptions_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExchange_table_partition(final PlSqlParser.Exchange_table_partitionContext ctx) {
    final var methodName = "enterExchange_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecute_immediate(final PlSqlParser.Execute_immediateContext ctx) {
    final var methodName = "enterExecute_immediate";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExit_statement(final PlSqlParser.Exit_statementContext ctx) {
    final var methodName = "enterExit_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplain_statement(final PlSqlParser.Explain_statementContext ctx) {
    final var methodName = "enterExplain_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExport_keys(final PlSqlParser.Export_keysContext ctx) {
    final var methodName = "enterExport_keys";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpression(final PlSqlParser.ExpressionContext ctx) {
    final var methodName = "enterExpression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressions(final PlSqlParser.ExpressionsContext ctx) {
    final var methodName = "enterExpressions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExtended_attribute_clause(
      final PlSqlParser.Extended_attribute_clauseContext ctx) {
    final var methodName = "enterExtended_attribute_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExtent_management_clause(final PlSqlParser.Extent_management_clauseContext ctx) {
    final var methodName = "enterExtent_management_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExternal_table_clause(final PlSqlParser.External_table_clauseContext ctx) {
    final var methodName = "enterExternal_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExternal_table_data_props(
      final PlSqlParser.External_table_data_propsContext ctx) {
    final var methodName = "enterExternal_table_data_props";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFact_columns_clause(final PlSqlParser.Fact_columns_clauseContext ctx) {
    final var methodName = "enterFact_columns_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFetch_clause(final PlSqlParser.Fetch_clauseContext ctx) {
    final var methodName = "enterFetch_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFetch_statement(final PlSqlParser.Fetch_statementContext ctx) {
    final var methodName = "enterFetch_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterField_spec(final PlSqlParser.Field_specContext ctx) {
    final var methodName = "enterField_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFile_name_convert(final PlSqlParser.File_name_convertContext ctx) {
    final var methodName = "enterFile_name_convert";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFile_owner_clause(final PlSqlParser.File_owner_clauseContext ctx) {
    final var methodName = "enterFile_owner_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFile_path(final PlSqlParser.File_pathContext ctx) {
    final var methodName = "enterFile_path";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFile_permissions_clause(final PlSqlParser.File_permissions_clauseContext ctx) {
    final var methodName = "enterFile_permissions_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFile_specification(final PlSqlParser.File_specificationContext ctx) {
    final var methodName = "enterFile_specification";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFilegroup_clauses(final PlSqlParser.Filegroup_clausesContext ctx) {
    final var methodName = "enterFilegroup_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFilename(final PlSqlParser.FilenameContext ctx) {
    final var methodName = "enterFilename";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFilename_convert_sub_clause(
      final PlSqlParser.Filename_convert_sub_clauseContext ctx) {
    final var methodName = "enterFilename_convert_sub_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFilenumber(final PlSqlParser.FilenumberContext ctx) {
    final var methodName = "enterFilenumber";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFilter_clause(final PlSqlParser.Filter_clauseContext ctx) {
    final var methodName = "enterFilter_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFilter_clauses(final PlSqlParser.Filter_clausesContext ctx) {
    final var methodName = "enterFilter_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlashback_archive_clause(final PlSqlParser.Flashback_archive_clauseContext ctx) {
    final var methodName = "enterFlashback_archive_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlashback_archive_quota(final PlSqlParser.Flashback_archive_quotaContext ctx) {
    final var methodName = "enterFlashback_archive_quota";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlashback_archive_retention(
      final PlSqlParser.Flashback_archive_retentionContext ctx) {
    final var methodName = "enterFlashback_archive_retention";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlashback_mode_clause(final PlSqlParser.Flashback_mode_clauseContext ctx) {
    final var methodName = "enterFlashback_mode_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlashback_query_clause(final PlSqlParser.Flashback_query_clauseContext ctx) {
    final var methodName = "enterFlashback_query_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlashback_table(final PlSqlParser.Flashback_tableContext ctx) {
    final var methodName = "enterFlashback_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFor_clause(final PlSqlParser.For_clauseContext ctx) {
    final var methodName = "enterFor_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFor_each_row(final PlSqlParser.For_each_rowContext ctx) {
    final var methodName = "enterFor_each_row";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFor_update_clause(final PlSqlParser.For_update_clauseContext ctx) {
    final var methodName = "enterFor_update_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFor_update_of_part(final PlSqlParser.For_update_of_partContext ctx) {
    final var methodName = "enterFor_update_of_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFor_update_options(final PlSqlParser.For_update_optionsContext ctx) {
    final var methodName = "enterFor_update_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForall_statement(final PlSqlParser.Forall_statementContext ctx) {
    final var methodName = "enterForall_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForce_keystore(final PlSqlParser.Force_keystoreContext ctx) {
    final var methodName = "enterForce_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForce_noforce(final PlSqlParser.Force_noforceContext ctx) {
    final var methodName = "enterForce_noforce";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForeign_key_clause(final PlSqlParser.Foreign_key_clauseContext ctx) {
    final var methodName = "enterForeign_key_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrom_clause(final PlSqlParser.From_clauseContext ctx) {
    final var methodName = "enterFrom_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFull_database_recovery(final PlSqlParser.Full_database_recoveryContext ctx) {
    final var methodName = "enterFull_database_recovery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunc_decl_in_type(final PlSqlParser.Func_decl_in_typeContext ctx) {
    final var methodName = "enterFunc_decl_in_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_argument(final PlSqlParser.Function_argumentContext ctx) {
    final var methodName = "enterFunction_argument";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_argument_analytic(
      final PlSqlParser.Function_argument_analyticContext ctx) {
    final var methodName = "enterFunction_argument_analytic";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_argument_modeling(
      final PlSqlParser.Function_argument_modelingContext ctx) {
    final var methodName = "enterFunction_argument_modeling";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_association(final PlSqlParser.Function_associationContext ctx) {
    final var methodName = "enterFunction_association";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_body(final PlSqlParser.Function_bodyContext ctx) {
    final var methodName = "enterFunction_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_name(final PlSqlParser.Function_nameContext ctx) {
    final var methodName = "enterFunction_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_spec(final PlSqlParser.Function_specContext ctx) {
    final var methodName = "enterFunction_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneral_element(final PlSqlParser.General_elementContext ctx) {
    final var methodName = "enterGeneral_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneral_element_part(final PlSqlParser.General_element_partContext ctx) {
    final var methodName = "enterGeneral_element_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneral_recovery(final PlSqlParser.General_recoveryContext ctx) {
    final var methodName = "enterGeneral_recovery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneral_table_ref(final PlSqlParser.General_table_refContext ctx) {
    final var methodName = "enterGeneral_table_ref";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGlobal_partitioned_index(final PlSqlParser.Global_partitioned_indexContext ctx) {
    final var methodName = "enterGlobal_partitioned_index";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGoto_statement(final PlSqlParser.Goto_statementContext ctx) {
    final var methodName = "enterGoto_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrant_object_name(final PlSqlParser.Grant_object_nameContext ctx) {
    final var methodName = "enterGrant_object_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrant_statement(final PlSqlParser.Grant_statementContext ctx) {
    final var methodName = "enterGrant_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantee_name(final PlSqlParser.Grantee_nameContext ctx) {
    final var methodName = "enterGrantee_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroup_by_clause(final PlSqlParser.Group_by_clauseContext ctx) {
    final var methodName = "enterGroup_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroup_by_elements(final PlSqlParser.Group_by_elementsContext ctx) {
    final var methodName = "enterGroup_by_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroup_redo_logfile(final PlSqlParser.Group_redo_logfileContext ctx) {
    final var methodName = "enterGroup_redo_logfile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrouping_sets_clause(final PlSqlParser.Grouping_sets_clauseContext ctx) {
    final var methodName = "enterGrouping_sets_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrouping_sets_elements(final PlSqlParser.Grouping_sets_elementsContext ctx) {
    final var methodName = "enterGrouping_sets_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHash_partition_quantity(final PlSqlParser.Hash_partition_quantityContext ctx) {
    final var methodName = "enterHash_partition_quantity";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHash_partitions(final PlSqlParser.Hash_partitionsContext ctx) {
    final var methodName = "enterHash_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHash_partitions_by_quantity(
      final PlSqlParser.Hash_partitions_by_quantityContext ctx) {
    final var methodName = "enterHash_partitions_by_quantity";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHash_subpartition_quantity(
      final PlSqlParser.Hash_subpartition_quantityContext ctx) {
    final var methodName = "enterHash_subpartition_quantity";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHash_subparts_by_quantity(
      final PlSqlParser.Hash_subparts_by_quantityContext ctx) {
    final var methodName = "enterHash_subparts_by_quantity";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHaving_clause(final PlSqlParser.Having_clauseContext ctx) {
    final var methodName = "enterHaving_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHeap_org_table_clause(final PlSqlParser.Heap_org_table_clauseContext ctx) {
    final var methodName = "enterHeap_org_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHier_attr_clause(final PlSqlParser.Hier_attr_clauseContext ctx) {
    final var methodName = "enterHier_attr_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHier_attr_name(final PlSqlParser.Hier_attr_nameContext ctx) {
    final var methodName = "enterHier_attr_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHier_attrs_clause(final PlSqlParser.Hier_attrs_clauseContext ctx) {
    final var methodName = "enterHier_attrs_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHier_ref(final PlSqlParser.Hier_refContext ctx) {
    final var methodName = "enterHier_ref";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHier_using_clause(final PlSqlParser.Hier_using_clauseContext ctx) {
    final var methodName = "enterHier_using_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHierarchical_query_clause(
      final PlSqlParser.Hierarchical_query_clauseContext ctx) {
    final var methodName = "enterHierarchical_query_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHierarchies_clause(final PlSqlParser.Hierarchies_clauseContext ctx) {
    final var methodName = "enterHierarchies_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHierarchy_clause(final PlSqlParser.Hierarchy_clauseContext ctx) {
    final var methodName = "enterHierarchy_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterId_expression(final PlSqlParser.Id_expressionContext ctx) {
    final var methodName = "enterId_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIdentified_by(final PlSqlParser.Identified_byContext ctx) {
    final var methodName = "enterIdentified_by";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIdentified_by_password_clause(
      final PlSqlParser.Identified_by_password_clauseContext ctx) {
    final var methodName = "enterIdentified_by_password_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIdentified_by_store(final PlSqlParser.Identified_by_storeContext ctx) {
    final var methodName = "enterIdentified_by_store";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIdentified_other_clause(final PlSqlParser.Identified_other_clauseContext ctx) {
    final var methodName = "enterIdentified_other_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIdentifier(final PlSqlParser.IdentifierContext ctx) {
    final var methodName = "enterIdentifier";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIdentity_clause(final PlSqlParser.Identity_clauseContext ctx) {
    final var methodName = "enterIdentity_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIdentity_options(final PlSqlParser.Identity_optionsContext ctx) {
    final var methodName = "enterIdentity_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIdentity_options_parentheses(
      final PlSqlParser.Identity_options_parenthesesContext ctx) {
    final var methodName = "enterIdentity_options_parentheses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIf_statement(final PlSqlParser.If_statementContext ctx) {
    final var methodName = "enterIf_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIlm_after_on(final PlSqlParser.Ilm_after_onContext ctx) {
    final var methodName = "enterIlm_after_on";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIlm_clause(final PlSqlParser.Ilm_clauseContext ctx) {
    final var methodName = "enterIlm_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIlm_compression_policy(final PlSqlParser.Ilm_compression_policyContext ctx) {
    final var methodName = "enterIlm_compression_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIlm_inmemory_policy(final PlSqlParser.Ilm_inmemory_policyContext ctx) {
    final var methodName = "enterIlm_inmemory_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIlm_policy_clause(final PlSqlParser.Ilm_policy_clauseContext ctx) {
    final var methodName = "enterIlm_policy_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIlm_tiering_policy(final PlSqlParser.Ilm_tiering_policyContext ctx) {
    final var methodName = "enterIlm_tiering_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIlm_time_period(final PlSqlParser.Ilm_time_periodContext ctx) {
    final var methodName = "enterIlm_time_period";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImmutable_table_clauses(final PlSqlParser.Immutable_table_clausesContext ctx) {
    final var methodName = "enterImmutable_table_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImmutable_table_no_delete_clause(
      final PlSqlParser.Immutable_table_no_delete_clauseContext ctx) {
    final var methodName = "enterImmutable_table_no_delete_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImmutable_table_no_drop_clause(
      final PlSqlParser.Immutable_table_no_drop_clauseContext ctx) {
    final var methodName = "enterImmutable_table_no_drop_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImplementation_clause(final PlSqlParser.Implementation_clauseContext ctx) {
    final var methodName = "enterImplementation_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImplementation_type_name(final PlSqlParser.Implementation_type_nameContext ctx) {
    final var methodName = "enterImplementation_type_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImplicit_cursor_expression(
      final PlSqlParser.Implicit_cursor_expressionContext ctx) {
    final var methodName = "enterImplicit_cursor_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImport_keys(final PlSqlParser.Import_keysContext ctx) {
    final var methodName = "enterImport_keys";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIn_elements(final PlSqlParser.In_elementsContext ctx) {
    final var methodName = "enterIn_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIncluding_contents_clause(
      final PlSqlParser.Including_contents_clauseContext ctx) {
    final var methodName = "enterIncluding_contents_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIncluding_or_excluding(final PlSqlParser.Including_or_excludingContext ctx) {
    final var methodName = "enterIncluding_or_excluding";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_attributes(final PlSqlParser.Index_attributesContext ctx) {
    final var methodName = "enterIndex_attributes";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_expr(final PlSqlParser.Index_exprContext ctx) {
    final var methodName = "enterIndex_expr";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_name(final PlSqlParser.Index_nameContext ctx) {
    final var methodName = "enterIndex_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_org_overflow_clause(
      final PlSqlParser.Index_org_overflow_clauseContext ctx) {
    final var methodName = "enterIndex_org_overflow_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_org_table_clause(final PlSqlParser.Index_org_table_clauseContext ctx) {
    final var methodName = "enterIndex_org_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_partition_description(
      final PlSqlParser.Index_partition_descriptionContext ctx) {
    final var methodName = "enterIndex_partition_description";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_partitioning_clause(
      final PlSqlParser.Index_partitioning_clauseContext ctx) {
    final var methodName = "enterIndex_partitioning_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_partitioning_values_list(
      final PlSqlParser.Index_partitioning_values_listContext ctx) {
    final var methodName = "enterIndex_partitioning_values_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_properties(final PlSqlParser.Index_propertiesContext ctx) {
    final var methodName = "enterIndex_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_subpartition_clause(
      final PlSqlParser.Index_subpartition_clauseContext ctx) {
    final var methodName = "enterIndex_subpartition_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndex_subpartition_subclause(
      final PlSqlParser.Index_subpartition_subclauseContext ctx) {
    final var methodName = "enterIndex_subpartition_subclause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexing_clause(final PlSqlParser.Indexing_clauseContext ctx) {
    final var methodName = "enterIndexing_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndextype(final PlSqlParser.IndextypeContext ctx) {
    final var methodName = "enterIndextype";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndextype_name(final PlSqlParser.Indextype_nameContext ctx) {
    final var methodName = "enterIndextype_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndividual_hash_partitions(
      final PlSqlParser.Individual_hash_partitionsContext ctx) {
    final var methodName = "enterIndividual_hash_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndividual_hash_subparts(final PlSqlParser.Individual_hash_subpartsContext ctx) {
    final var methodName = "enterIndividual_hash_subparts";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInline_constraint(final PlSqlParser.Inline_constraintContext ctx) {
    final var methodName = "enterInline_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInline_ref_constraint(final PlSqlParser.Inline_ref_constraintContext ctx) {
    final var methodName = "enterInline_ref_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInmemory_attributes(final PlSqlParser.Inmemory_attributesContext ctx) {
    final var methodName = "enterInmemory_attributes";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInmemory_column_clause(final PlSqlParser.Inmemory_column_clauseContext ctx) {
    final var methodName = "enterInmemory_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInmemory_distribute(final PlSqlParser.Inmemory_distributeContext ctx) {
    final var methodName = "enterInmemory_distribute";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInmemory_duplicate(final PlSqlParser.Inmemory_duplicateContext ctx) {
    final var methodName = "enterInmemory_duplicate";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInmemory_memcompress(final PlSqlParser.Inmemory_memcompressContext ctx) {
    final var methodName = "enterInmemory_memcompress";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInmemory_priority(final PlSqlParser.Inmemory_priorityContext ctx) {
    final var methodName = "enterInmemory_priority";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInmemory_table_clause(final PlSqlParser.Inmemory_table_clauseContext ctx) {
    final var methodName = "enterInmemory_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInmmemory_clause(final PlSqlParser.Inmmemory_clauseContext ctx) {
    final var methodName = "enterInmmemory_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInquiry_directive(final PlSqlParser.Inquiry_directiveContext ctx) {
    final var methodName = "enterInquiry_directive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsert_into_clause(final PlSqlParser.Insert_into_clauseContext ctx) {
    final var methodName = "enterInsert_into_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsert_statement(final PlSqlParser.Insert_statementContext ctx) {
    final var methodName = "enterInsert_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInstance_clauses(final PlSqlParser.Instance_clausesContext ctx) {
    final var methodName = "enterInstance_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInterval_expr(final PlSqlParser.Interval_exprContext ctx) {
    final var methodName = "enterInterval_expr";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInterval_expression(final PlSqlParser.Interval_expressionContext ctx) {
    final var methodName = "enterInterval_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInto_clause(final PlSqlParser.Into_clauseContext ctx) {
    final var methodName = "enterInto_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInto_clause1(final PlSqlParser.Into_clause1Context ctx) {
    final var methodName = "enterInto_clause1";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInvoker_rights_clause(final PlSqlParser.Invoker_rights_clauseContext ctx) {
    final var methodName = "enterInvoker_rights_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIo_cost(final PlSqlParser.Io_costContext ctx) {
    final var methodName = "enterIo_cost";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIsolate_keystore(final PlSqlParser.Isolate_keystoreContext ctx) {
    final var methodName = "enterIsolate_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJava_spec(final PlSqlParser.Java_specContext ctx) {
    final var methodName = "enterJava_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_clause(final PlSqlParser.Join_clauseContext ctx) {
    final var methodName = "enterJoin_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_condition(final PlSqlParser.Join_conditionContext ctx) {
    final var methodName = "enterJoin_condition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_condition_item(final PlSqlParser.Join_condition_itemContext ctx) {
    final var methodName = "enterJoin_condition_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_on_part(final PlSqlParser.Join_on_partContext ctx) {
    final var methodName = "enterJoin_on_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_path_clause(final PlSqlParser.Join_path_clauseContext ctx) {
    final var methodName = "enterJoin_path_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoin_using_part(final PlSqlParser.Join_using_partContext ctx) {
    final var methodName = "enterJoin_using_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_array_element(final PlSqlParser.Json_array_elementContext ctx) {
    final var methodName = "enterJson_array_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_column_clause(final PlSqlParser.Json_column_clauseContext ctx) {
    final var methodName = "enterJson_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_column_definition(final PlSqlParser.Json_column_definitionContext ctx) {
    final var methodName = "enterJson_column_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_function(final PlSqlParser.Json_functionContext ctx) {
    final var methodName = "enterJson_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_object_content(final PlSqlParser.Json_object_contentContext ctx) {
    final var methodName = "enterJson_object_content";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_object_entry(final PlSqlParser.Json_object_entryContext ctx) {
    final var methodName = "enterJson_object_entry";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_on_null_clause(final PlSqlParser.Json_on_null_clauseContext ctx) {
    final var methodName = "enterJson_on_null_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_query_on_empty_clause(
      final PlSqlParser.Json_query_on_empty_clauseContext ctx) {
    final var methodName = "enterJson_query_on_empty_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_query_on_error_clause(
      final PlSqlParser.Json_query_on_error_clauseContext ctx) {
    final var methodName = "enterJson_query_on_error_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_query_return_type(final PlSqlParser.Json_query_return_typeContext ctx) {
    final var methodName = "enterJson_query_return_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_query_returning_clause(
      final PlSqlParser.Json_query_returning_clauseContext ctx) {
    final var methodName = "enterJson_query_returning_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_query_wrapper_clause(
      final PlSqlParser.Json_query_wrapper_clauseContext ctx) {
    final var methodName = "enterJson_query_wrapper_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_return_clause(final PlSqlParser.Json_return_clauseContext ctx) {
    final var methodName = "enterJson_return_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_table_clause(final PlSqlParser.Json_table_clauseContext ctx) {
    final var methodName = "enterJson_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_transform_op(final PlSqlParser.Json_transform_opContext ctx) {
    final var methodName = "enterJson_transform_op";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_value_on_mismatch_clause(
      final PlSqlParser.Json_value_on_mismatch_clauseContext ctx) {
    final var methodName = "enterJson_value_on_mismatch_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_value_return_clause(final PlSqlParser.Json_value_return_clauseContext ctx) {
    final var methodName = "enterJson_value_return_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJson_value_return_type(final PlSqlParser.Json_value_return_typeContext ctx) {
    final var methodName = "enterJson_value_return_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKeep_clause(final PlSqlParser.Keep_clauseContext ctx) {
    final var methodName = "enterKeep_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKey_clause(final PlSqlParser.Key_clauseContext ctx) {
    final var methodName = "enterKey_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKey_compression(final PlSqlParser.Key_compressionContext ctx) {
    final var methodName = "enterKey_compression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKey_management_clauses(final PlSqlParser.Key_management_clausesContext ctx) {
    final var methodName = "enterKey_management_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKeystore_management_clauses(
      final PlSqlParser.Keystore_management_clausesContext ctx) {
    final var methodName = "enterKeystore_management_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKeystore_password(final PlSqlParser.Keystore_passwordContext ctx) {
    final var methodName = "enterKeystore_password";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLabel_declaration(final PlSqlParser.Label_declarationContext ctx) {
    final var methodName = "enterLabel_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLabel_name(final PlSqlParser.Label_nameContext ctx) {
    final var methodName = "enterLabel_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLanguage(final PlSqlParser.LanguageContext ctx) {
    final var methodName = "enterLanguage";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLead_cdb_clause(final PlSqlParser.Lead_cdb_clauseContext ctx) {
    final var methodName = "enterLead_cdb_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLead_cdb_uri_clause(final PlSqlParser.Lead_cdb_uri_clauseContext ctx) {
    final var methodName = "enterLead_cdb_uri_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevel_clause(final PlSqlParser.Level_clauseContext ctx) {
    final var methodName = "enterLevel_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevel_group_type(final PlSqlParser.Level_group_typeContext ctx) {
    final var methodName = "enterLevel_group_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevel_hier_clause(final PlSqlParser.Level_hier_clauseContext ctx) {
    final var methodName = "enterLevel_hier_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevel_specification(final PlSqlParser.Level_specificationContext ctx) {
    final var methodName = "enterLevel_specification";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevels_clause(final PlSqlParser.Levels_clauseContext ctx) {
    final var methodName = "enterLevels_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevels_item(final PlSqlParser.Levels_itemContext ctx) {
    final var methodName = "enterLevels_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLibrary_debug(final PlSqlParser.Library_debugContext ctx) {
    final var methodName = "enterLibrary_debug";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLibrary_editionable(final PlSqlParser.Library_editionableContext ctx) {
    final var methodName = "enterLibrary_editionable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLibrary_name(final PlSqlParser.Library_nameContext ctx) {
    final var methodName = "enterLibrary_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLink_authentication(final PlSqlParser.Link_authenticationContext ctx) {
    final var methodName = "enterLink_authentication";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLink_name(final PlSqlParser.Link_nameContext ctx) {
    final var methodName = "enterLink_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterList_partition_desc(final PlSqlParser.List_partition_descContext ctx) {
    final var methodName = "enterList_partition_desc";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterList_partitions(final PlSqlParser.List_partitionsContext ctx) {
    final var methodName = "enterList_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterList_subpartition_desc(final PlSqlParser.List_subpartition_descContext ctx) {
    final var methodName = "enterList_subpartition_desc";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterList_values_clause(final PlSqlParser.List_values_clauseContext ctx) {
    final var methodName = "enterList_values_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterListagg_overflow_clause(final PlSqlParser.Listagg_overflow_clauseContext ctx) {
    final var methodName = "enterListagg_overflow_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLiteral(final PlSqlParser.LiteralContext ctx) {
    final var methodName = "enterLiteral";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLob_compression_clause(final PlSqlParser.Lob_compression_clauseContext ctx) {
    final var methodName = "enterLob_compression_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLob_deduplicate_clause(final PlSqlParser.Lob_deduplicate_clauseContext ctx) {
    final var methodName = "enterLob_deduplicate_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLob_item(final PlSqlParser.Lob_itemContext ctx) {
    final var methodName = "enterLob_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLob_parameters(final PlSqlParser.Lob_parametersContext ctx) {
    final var methodName = "enterLob_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLob_partition_storage(final PlSqlParser.Lob_partition_storageContext ctx) {
    final var methodName = "enterLob_partition_storage";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLob_partitioning_storage(final PlSqlParser.Lob_partitioning_storageContext ctx) {
    final var methodName = "enterLob_partitioning_storage";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLob_retention_clause(final PlSqlParser.Lob_retention_clauseContext ctx) {
    final var methodName = "enterLob_retention_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLob_segname(final PlSqlParser.Lob_segnameContext ctx) {
    final var methodName = "enterLob_segname";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLob_storage_clause(final PlSqlParser.Lob_storage_clauseContext ctx) {
    final var methodName = "enterLob_storage_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLob_storage_parameters(final PlSqlParser.Lob_storage_parametersContext ctx) {
    final var methodName = "enterLob_storage_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLocal_domain_index_clause(
      final PlSqlParser.Local_domain_index_clauseContext ctx) {
    final var methodName = "enterLocal_domain_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLocal_link_name(final PlSqlParser.Local_link_nameContext ctx) {
    final var methodName = "enterLocal_link_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLocal_partitioned_index(final PlSqlParser.Local_partitioned_indexContext ctx) {
    final var methodName = "enterLocal_partitioned_index";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLocal_xmlindex_clause(final PlSqlParser.Local_xmlindex_clauseContext ctx) {
    final var methodName = "enterLocal_xmlindex_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLock_mode(final PlSqlParser.Lock_modeContext ctx) {
    final var methodName = "enterLock_mode";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLock_table_element(final PlSqlParser.Lock_table_elementContext ctx) {
    final var methodName = "enterLock_table_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLock_table_statement(final PlSqlParser.Lock_table_statementContext ctx) {
    final var methodName = "enterLock_table_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockdown_feature(final PlSqlParser.Lockdown_featureContext ctx) {
    final var methodName = "enterLockdown_feature";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockdown_options(final PlSqlParser.Lockdown_optionsContext ctx) {
    final var methodName = "enterLockdown_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockdown_statements(final PlSqlParser.Lockdown_statementsContext ctx) {
    final var methodName = "enterLockdown_statements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLog_grp(final PlSqlParser.Log_grpContext ctx) {
    final var methodName = "enterLog_grp";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLogfile_clause(final PlSqlParser.Logfile_clauseContext ctx) {
    final var methodName = "enterLogfile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLogfile_clauses(final PlSqlParser.Logfile_clausesContext ctx) {
    final var methodName = "enterLogfile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLogfile_descriptor(final PlSqlParser.Logfile_descriptorContext ctx) {
    final var methodName = "enterLogfile_descriptor";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLogging_clause(final PlSqlParser.Logging_clauseContext ctx) {
    final var methodName = "enterLogging_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLogical_expression(final PlSqlParser.Logical_expressionContext ctx) {
    final var methodName = "enterLogical_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLogical_operation(final PlSqlParser.Logical_operationContext ctx) {
    final var methodName = "enterLogical_operation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLogical_replication_clause(
      final PlSqlParser.Logical_replication_clauseContext ctx) {
    final var methodName = "enterLogical_replication_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoop_statement(final PlSqlParser.Loop_statementContext ctx) {
    final var methodName = "enterLoop_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLost_write_protection(final PlSqlParser.Lost_write_protectionContext ctx) {
    final var methodName = "enterLost_write_protection";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLow_high(final PlSqlParser.Low_highContext ctx) {
    final var methodName = "enterLow_high";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLower_bound(final PlSqlParser.Lower_boundContext ctx) {
    final var methodName = "enterLower_bound";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMain_model(final PlSqlParser.Main_modelContext ctx) {
    final var methodName = "enterMain_model";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMain_model_name(final PlSqlParser.Main_model_nameContext ctx) {
    final var methodName = "enterMain_model_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterManaged_standby_recovery(final PlSqlParser.Managed_standby_recoveryContext ctx) {
    final var methodName = "enterManaged_standby_recovery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMap_order_func_declaration(
      final PlSqlParser.Map_order_func_declarationContext ctx) {
    final var methodName = "enterMap_order_func_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMap_order_function_spec(final PlSqlParser.Map_order_function_specContext ctx) {
    final var methodName = "enterMap_order_function_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMapping_table_clause(final PlSqlParser.Mapping_table_clauseContext ctx) {
    final var methodName = "enterMapping_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMatch_string(final PlSqlParser.Match_stringContext ctx) {
    final var methodName = "enterMatch_string";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMaximize_standby_db_clause(
      final PlSqlParser.Maximize_standby_db_clauseContext ctx) {
    final var methodName = "enterMaximize_standby_db_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMaxsize_clause(final PlSqlParser.Maxsize_clauseContext ctx) {
    final var methodName = "enterMaxsize_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMeas_aggregate_clause(final PlSqlParser.Meas_aggregate_clauseContext ctx) {
    final var methodName = "enterMeas_aggregate_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMeasure_list(final PlSqlParser.Measure_listContext ctx) {
    final var methodName = "enterMeasure_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMeasures_clause(final PlSqlParser.Measures_clauseContext ctx) {
    final var methodName = "enterMeasures_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMemoptimize_read_write_clause(
      final PlSqlParser.Memoptimize_read_write_clauseContext ctx) {
    final var methodName = "enterMemoptimize_read_write_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_element(final PlSqlParser.Merge_elementContext ctx) {
    final var methodName = "enterMerge_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_insert_clause(final PlSqlParser.Merge_insert_clauseContext ctx) {
    final var methodName = "enterMerge_insert_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_into_existing_keystore(
      final PlSqlParser.Merge_into_existing_keystoreContext ctx) {
    final var methodName = "enterMerge_into_existing_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_into_new_keystore(final PlSqlParser.Merge_into_new_keystoreContext ctx) {
    final var methodName = "enterMerge_into_new_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_statement(final PlSqlParser.Merge_statementContext ctx) {
    final var methodName = "enterMerge_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_table_partition(final PlSqlParser.Merge_table_partitionContext ctx) {
    final var methodName = "enterMerge_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_update_clause(final PlSqlParser.Merge_update_clauseContext ctx) {
    final var methodName = "enterMerge_update_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMerge_update_delete_part(final PlSqlParser.Merge_update_delete_partContext ctx) {
    final var methodName = "enterMerge_update_delete_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMigrate_keys(final PlSqlParser.Migrate_keysContext ctx) {
    final var methodName = "enterMigrate_keys";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMk(final PlSqlParser.MkContext ctx) {
    final var methodName = "enterMk";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMkid(final PlSqlParser.MkidContext ctx) {
    final var methodName = "enterMkid";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_clause(final PlSqlParser.Model_clauseContext ctx) {
    final var methodName = "enterModel_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_column(final PlSqlParser.Model_columnContext ctx) {
    final var methodName = "enterModel_column";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_column_clauses(final PlSqlParser.Model_column_clausesContext ctx) {
    final var methodName = "enterModel_column_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_column_list(final PlSqlParser.Model_column_listContext ctx) {
    final var methodName = "enterModel_column_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_column_partition_part(
      final PlSqlParser.Model_column_partition_partContext ctx) {
    final var methodName = "enterModel_column_partition_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_expression(final PlSqlParser.Model_expressionContext ctx) {
    final var methodName = "enterModel_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_expression_element(final PlSqlParser.Model_expression_elementContext ctx) {
    final var methodName = "enterModel_expression_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_iterate_clause(final PlSqlParser.Model_iterate_clauseContext ctx) {
    final var methodName = "enterModel_iterate_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_name(final PlSqlParser.Model_nameContext ctx) {
    final var methodName = "enterModel_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_rules_clause(final PlSqlParser.Model_rules_clauseContext ctx) {
    final var methodName = "enterModel_rules_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_rules_element(final PlSqlParser.Model_rules_elementContext ctx) {
    final var methodName = "enterModel_rules_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModel_rules_part(final PlSqlParser.Model_rules_partContext ctx) {
    final var methodName = "enterModel_rules_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModifier_clause(final PlSqlParser.Modifier_clauseContext ctx) {
    final var methodName = "enterModifier_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_col_properties(final PlSqlParser.Modify_col_propertiesContext ctx) {
    final var methodName = "enterModify_col_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_col_substitutable(final PlSqlParser.Modify_col_substitutableContext ctx) {
    final var methodName = "enterModify_col_substitutable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_col_visibility(final PlSqlParser.Modify_col_visibilityContext ctx) {
    final var methodName = "enterModify_col_visibility";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_collection_retrieval(
      final PlSqlParser.Modify_collection_retrievalContext ctx) {
    final var methodName = "enterModify_collection_retrieval";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_column_clauses(final PlSqlParser.Modify_column_clausesContext ctx) {
    final var methodName = "enterModify_column_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_diskgroup_file(final PlSqlParser.Modify_diskgroup_fileContext ctx) {
    final var methodName = "enterModify_diskgroup_file";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_filegroup_clause(final PlSqlParser.Modify_filegroup_clauseContext ctx) {
    final var methodName = "enterModify_filegroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_index_default_attrs(
      final PlSqlParser.Modify_index_default_attrsContext ctx) {
    final var methodName = "enterModify_index_default_attrs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_index_partition(final PlSqlParser.Modify_index_partitionContext ctx) {
    final var methodName = "enterModify_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_index_partitions_ops(
      final PlSqlParser.Modify_index_partitions_opsContext ctx) {
    final var methodName = "enterModify_index_partitions_ops";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_index_subpartition(
      final PlSqlParser.Modify_index_subpartitionContext ctx) {
    final var methodName = "enterModify_index_subpartition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_lob_parameters(final PlSqlParser.Modify_lob_parametersContext ctx) {
    final var methodName = "enterModify_lob_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_lob_storage_clause(
      final PlSqlParser.Modify_lob_storage_clauseContext ctx) {
    final var methodName = "enterModify_lob_storage_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_mv_column_clause(final PlSqlParser.Modify_mv_column_clauseContext ctx) {
    final var methodName = "enterModify_mv_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_table_partition(final PlSqlParser.Modify_table_partitionContext ctx) {
    final var methodName = "enterModify_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModify_volume_clause(final PlSqlParser.Modify_volume_clauseContext ctx) {
    final var methodName = "enterModify_volume_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMonitoring_nomonitoring(final PlSqlParser.Monitoring_nomonitoringContext ctx) {
    final var methodName = "enterMonitoring_nomonitoring";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMove_datafile_clause(final PlSqlParser.Move_datafile_clauseContext ctx) {
    final var methodName = "enterMove_datafile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMove_keys(final PlSqlParser.Move_keysContext ctx) {
    final var methodName = "enterMove_keys";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMove_mv_log_clause(final PlSqlParser.Move_mv_log_clauseContext ctx) {
    final var methodName = "enterMove_mv_log_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMove_table_clause(final PlSqlParser.Move_table_clauseContext ctx) {
    final var methodName = "enterMove_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMove_to_filegroup_clause(final PlSqlParser.Move_to_filegroup_clauseContext ctx) {
    final var methodName = "enterMove_to_filegroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMulti_column_for_loop(final PlSqlParser.Multi_column_for_loopContext ctx) {
    final var methodName = "enterMulti_column_for_loop";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMulti_table_element(final PlSqlParser.Multi_table_elementContext ctx) {
    final var methodName = "enterMulti_table_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMulti_table_insert(final PlSqlParser.Multi_table_insertContext ctx) {
    final var methodName = "enterMulti_table_insert";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMultiset_expression(final PlSqlParser.Multiset_expressionContext ctx) {
    final var methodName = "enterMultiset_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMv_column_alias(final PlSqlParser.Mv_column_aliasContext ctx) {
    final var methodName = "enterMv_column_alias";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMv_log_augmentation(final PlSqlParser.Mv_log_augmentationContext ctx) {
    final var methodName = "enterMv_log_augmentation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMv_log_purge_clause(final PlSqlParser.Mv_log_purge_clauseContext ctx) {
    final var methodName = "enterMv_log_purge_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNative_datatype_element(final PlSqlParser.Native_datatype_elementContext ctx) {
    final var methodName = "enterNative_datatype_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNested_item(final PlSqlParser.Nested_itemContext ctx) {
    final var methodName = "enterNested_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNested_table_col_properties(
      final PlSqlParser.Nested_table_col_propertiesContext ctx) {
    final var methodName = "enterNested_table_col_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNested_table_type_def(final PlSqlParser.Nested_table_type_defContext ctx) {
    final var methodName = "enterNested_table_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNetwork_cost(final PlSqlParser.Network_costContext ctx) {
    final var methodName = "enterNetwork_cost";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNew_column_name(final PlSqlParser.New_column_nameContext ctx) {
    final var methodName = "enterNew_column_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNew_constraint_name(final PlSqlParser.New_constraint_nameContext ctx) {
    final var methodName = "enterNew_constraint_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNew_index_name(final PlSqlParser.New_index_nameContext ctx) {
    final var methodName = "enterNew_index_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNew_partition_name(final PlSqlParser.New_partition_nameContext ctx) {
    final var methodName = "enterNew_partition_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNew_tablespace_name(final PlSqlParser.New_tablespace_nameContext ctx) {
    final var methodName = "enterNew_tablespace_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNew_values_clause(final PlSqlParser.New_values_clauseContext ctx) {
    final var methodName = "enterNew_values_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNoaudit_statement(final PlSqlParser.Noaudit_statementContext ctx) {
    final var methodName = "enterNoaudit_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNon_dml_event(final PlSqlParser.Non_dml_eventContext ctx) {
    final var methodName = "enterNon_dml_event";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNon_dml_trigger(final PlSqlParser.Non_dml_triggerContext ctx) {
    final var methodName = "enterNon_dml_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNon_reserved_keywords_in_12c(
      final PlSqlParser.Non_reserved_keywords_in_12cContext ctx) {
    final var methodName = "enterNon_reserved_keywords_in_12c";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNon_reserved_keywords_in_18c(
      final PlSqlParser.Non_reserved_keywords_in_18cContext ctx) {
    final var methodName = "enterNon_reserved_keywords_in_18c";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNon_reserved_keywords_pre12c(
      final PlSqlParser.Non_reserved_keywords_pre12cContext ctx) {
    final var methodName = "enterNon_reserved_keywords_pre12c";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNull_statement(final PlSqlParser.Null_statementContext ctx) {
    final var methodName = "enterNull_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNumeric(final PlSqlParser.NumericContext ctx) {
    final var methodName = "enterNumeric";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNumeric_function(final PlSqlParser.Numeric_functionContext ctx) {
    final var methodName = "enterNumeric_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNumeric_function_name(final PlSqlParser.Numeric_function_nameContext ctx) {
    final var methodName = "enterNumeric_function_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNumeric_function_wrapper(final PlSqlParser.Numeric_function_wrapperContext ctx) {
    final var methodName = "enterNumeric_function_wrapper";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNumeric_negative(final PlSqlParser.Numeric_negativeContext ctx) {
    final var methodName = "enterNumeric_negative";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_action(final PlSqlParser.Object_actionContext ctx) {
    final var methodName = "enterObject_action";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_as_part(final PlSqlParser.Object_as_partContext ctx) {
    final var methodName = "enterObject_as_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_member_spec(final PlSqlParser.Object_member_specContext ctx) {
    final var methodName = "enterObject_member_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_name(final PlSqlParser.Object_nameContext ctx) {
    final var methodName = "enterObject_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_privilege(final PlSqlParser.Object_privilegeContext ctx) {
    final var methodName = "enterObject_privilege";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_properties(final PlSqlParser.Object_propertiesContext ctx) {
    final var methodName = "enterObject_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_table(final PlSqlParser.Object_tableContext ctx) {
    final var methodName = "enterObject_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_table_substitution(
      final PlSqlParser.Object_table_substitutionContext ctx) {
    final var methodName = "enterObject_table_substitution";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_type(final PlSqlParser.Object_typeContext ctx) {
    final var methodName = "enterObject_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_type_col_properties(
      final PlSqlParser.Object_type_col_propertiesContext ctx) {
    final var methodName = "enterObject_type_col_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_type_def(final PlSqlParser.Object_type_defContext ctx) {
    final var methodName = "enterObject_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_under_part(final PlSqlParser.Object_under_partContext ctx) {
    final var methodName = "enterObject_under_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterObject_view_clause(final PlSqlParser.Object_view_clauseContext ctx) {
    final var methodName = "enterObject_view_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOdci_parameters(final PlSqlParser.Odci_parametersContext ctx) {
    final var methodName = "enterOdci_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOffset_clause(final PlSqlParser.Offset_clauseContext ctx) {
    final var methodName = "enterOffset_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOid_clause(final PlSqlParser.Oid_clauseContext ctx) {
    final var methodName = "enterOid_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOid_index_clause(final PlSqlParser.Oid_index_clauseContext ctx) {
    final var methodName = "enterOid_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOld_column_name(final PlSqlParser.Old_column_nameContext ctx) {
    final var methodName = "enterOld_column_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOld_constraint_name(final PlSqlParser.Old_constraint_nameContext ctx) {
    final var methodName = "enterOld_constraint_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_comp_partitioned_clause(
      final PlSqlParser.On_comp_partitioned_clauseContext ctx) {
    final var methodName = "enterOn_comp_partitioned_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_comp_partitioned_table(
      final PlSqlParser.On_comp_partitioned_tableContext ctx) {
    final var methodName = "enterOn_comp_partitioned_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_delete_clause(final PlSqlParser.On_delete_clauseContext ctx) {
    final var methodName = "enterOn_delete_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_hash_partitioned_clause(
      final PlSqlParser.On_hash_partitioned_clauseContext ctx) {
    final var methodName = "enterOn_hash_partitioned_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_hash_partitioned_table(
      final PlSqlParser.On_hash_partitioned_tableContext ctx) {
    final var methodName = "enterOn_hash_partitioned_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_list_partitioned_table(
      final PlSqlParser.On_list_partitioned_tableContext ctx) {
    final var methodName = "enterOn_list_partitioned_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_object_clause(final PlSqlParser.On_object_clauseContext ctx) {
    final var methodName = "enterOn_object_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOn_range_partitioned_table(
      final PlSqlParser.On_range_partitioned_tableContext ctx) {
    final var methodName = "enterOn_range_partitioned_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOnline_or_offline(final PlSqlParser.Online_or_offlineContext ctx) {
    final var methodName = "enterOnline_or_offline";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpaque_format_spec(final PlSqlParser.Opaque_format_specContext ctx) {
    final var methodName = "enterOpaque_format_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpen_for_statement(final PlSqlParser.Open_for_statementContext ctx) {
    final var methodName = "enterOpen_for_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpen_keystore(final PlSqlParser.Open_keystoreContext ctx) {
    final var methodName = "enterOpen_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpen_statement(final PlSqlParser.Open_statementContext ctx) {
    final var methodName = "enterOpen_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOperator_context_clause(final PlSqlParser.Operator_context_clauseContext ctx) {
    final var methodName = "enterOperator_context_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOperator_function_name(final PlSqlParser.Operator_function_nameContext ctx) {
    final var methodName = "enterOperator_function_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOperator_name(final PlSqlParser.Operator_nameContext ctx) {
    final var methodName = "enterOperator_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOption_values(final PlSqlParser.Option_valuesContext ctx) {
    final var methodName = "enterOption_values";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOracle_namespace(final PlSqlParser.Oracle_namespaceContext ctx) {
    final var methodName = "enterOracle_namespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_by_clause(final PlSqlParser.Order_by_clauseContext ctx) {
    final var methodName = "enterOrder_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrder_by_elements(final PlSqlParser.Order_by_elementsContext ctx) {
    final var methodName = "enterOrder_by_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOther_function(final PlSqlParser.Other_functionContext ctx) {
    final var methodName = "enterOther_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOut_of_line_constraint(final PlSqlParser.Out_of_line_constraintContext ctx) {
    final var methodName = "enterOut_of_line_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOut_of_line_part_storage(final PlSqlParser.Out_of_line_part_storageContext ctx) {
    final var methodName = "enterOut_of_line_part_storage";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOut_of_line_ref_constraint(
      final PlSqlParser.Out_of_line_ref_constraintContext ctx) {
    final var methodName = "enterOut_of_line_ref_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOuter_join_sign(final PlSqlParser.Outer_join_signContext ctx) {
    final var methodName = "enterOuter_join_sign";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOuter_join_type(final PlSqlParser.Outer_join_typeContext ctx) {
    final var methodName = "enterOuter_join_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOutline_options(final PlSqlParser.Outline_optionsContext ctx) {
    final var methodName = "enterOutline_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOver_clause(final PlSqlParser.Over_clauseContext ctx) {
    final var methodName = "enterOver_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOver_clause_keyword(final PlSqlParser.Over_clause_keywordContext ctx) {
    final var methodName = "enterOver_clause_keyword";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOverriding_function_spec(final PlSqlParser.Overriding_function_specContext ctx) {
    final var methodName = "enterOverriding_function_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOverriding_subprogram_spec(
      final PlSqlParser.Overriding_subprogram_specContext ctx) {
    final var methodName = "enterOverriding_subprogram_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPackage_name(final PlSqlParser.Package_nameContext ctx) {
    final var methodName = "enterPackage_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPackage_obj_body(final PlSqlParser.Package_obj_bodyContext ctx) {
    final var methodName = "enterPackage_obj_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPackage_obj_spec(final PlSqlParser.Package_obj_specContext ctx) {
    final var methodName = "enterPackage_obj_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParallel_clause(final PlSqlParser.Parallel_clauseContext ctx) {
    final var methodName = "enterParallel_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParallel_enable_clause(final PlSqlParser.Parallel_enable_clauseContext ctx) {
    final var methodName = "enterParallel_enable_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParameter(final PlSqlParser.ParameterContext ctx) {
    final var methodName = "enterParameter";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParameter_name(final PlSqlParser.Parameter_nameContext ctx) {
    final var methodName = "enterParameter_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParameter_spec(final PlSqlParser.Parameter_specContext ctx) {
    final var methodName = "enterParameter_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParameter_value(final PlSqlParser.Parameter_valueContext ctx) {
    final var methodName = "enterParameter_value";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParen_column_list(final PlSqlParser.Paren_column_listContext ctx) {
    final var methodName = "enterParen_column_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartial_database_recovery(
      final PlSqlParser.Partial_database_recoveryContext ctx) {
    final var methodName = "enterPartial_database_recovery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartial_database_recovery_10g(
      final PlSqlParser.Partial_database_recovery_10gContext ctx) {
    final var methodName = "enterPartial_database_recovery_10g";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_by_clause(final PlSqlParser.Partition_by_clauseContext ctx) {
    final var methodName = "enterPartition_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_extended_names(final PlSqlParser.Partition_extended_namesContext ctx) {
    final var methodName = "enterPartition_extended_names";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_extension_clause(
      final PlSqlParser.Partition_extension_clauseContext ctx) {
    final var methodName = "enterPartition_extension_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_extention_clause(
      final PlSqlParser.Partition_extention_clauseContext ctx) {
    final var methodName = "enterPartition_extention_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_key_value(final PlSqlParser.Partition_key_valueContext ctx) {
    final var methodName = "enterPartition_key_value";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_name(final PlSqlParser.Partition_nameContext ctx) {
    final var methodName = "enterPartition_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartition_name_old(final PlSqlParser.Partition_name_oldContext ctx) {
    final var methodName = "enterPartition_name_old";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitioned_table(final PlSqlParser.Partitioned_tableContext ctx) {
    final var methodName = "enterPartitioned_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitioning_storage_clause(
      final PlSqlParser.Partitioning_storage_clauseContext ctx) {
    final var methodName = "enterPartitioning_storage_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPassword_expire_clause(final PlSqlParser.Password_expire_clauseContext ctx) {
    final var methodName = "enterPassword_expire_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPassword_parameters(final PlSqlParser.Password_parametersContext ctx) {
    final var methodName = "enterPassword_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPassword_value(final PlSqlParser.Password_valueContext ctx) {
    final var methodName = "enterPassword_value";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPath(final PlSqlParser.PathContext ctx) {
    final var methodName = "enterPath";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPeriod_definition(final PlSqlParser.Period_definitionContext ctx) {
    final var methodName = "enterPeriod_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPermanent_tablespace_attrs(
      final PlSqlParser.Permanent_tablespace_attrsContext ctx) {
    final var methodName = "enterPermanent_tablespace_attrs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPermanent_tablespace_clause(
      final PlSqlParser.Permanent_tablespace_clauseContext ctx) {
    final var methodName = "enterPermanent_tablespace_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPfile_name(final PlSqlParser.Pfile_nameContext ctx) {
    final var methodName = "enterPfile_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPhase(final PlSqlParser.PhaseContext ctx) {
    final var methodName = "enterPhase";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPhysical_attributes_clause(
      final PlSqlParser.Physical_attributes_clauseContext ctx) {
    final var methodName = "enterPhysical_attributes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPhysical_properties(final PlSqlParser.Physical_propertiesContext ctx) {
    final var methodName = "enterPhysical_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPipe_row_statement(final PlSqlParser.Pipe_row_statementContext ctx) {
    final var methodName = "enterPipe_row_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPipelined_using_clause(final PlSqlParser.Pipelined_using_clauseContext ctx) {
    final var methodName = "enterPipelined_using_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPivot_clause(final PlSqlParser.Pivot_clauseContext ctx) {
    final var methodName = "enterPivot_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPivot_element(final PlSqlParser.Pivot_elementContext ctx) {
    final var methodName = "enterPivot_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPivot_for_clause(final PlSqlParser.Pivot_for_clauseContext ctx) {
    final var methodName = "enterPivot_for_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPivot_in_clause(final PlSqlParser.Pivot_in_clauseContext ctx) {
    final var methodName = "enterPivot_in_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPivot_in_clause_element(final PlSqlParser.Pivot_in_clause_elementContext ctx) {
    final var methodName = "enterPivot_in_clause_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPivot_in_clause_elements(final PlSqlParser.Pivot_in_clause_elementsContext ctx) {
    final var methodName = "enterPivot_in_clause_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPlsql_library_source(final PlSqlParser.Plsql_library_sourceContext ctx) {
    final var methodName = "enterPlsql_library_source";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPmem_filestore_options(final PlSqlParser.Pmem_filestore_optionsContext ctx) {
    final var methodName = "enterPmem_filestore_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPolicy_name(final PlSqlParser.Policy_nameContext ctx) {
    final var methodName = "enterPolicy_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPragma_clause(final PlSqlParser.Pragma_clauseContext ctx) {
    final var methodName = "enterPragma_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPragma_declaration(final PlSqlParser.Pragma_declarationContext ctx) {
    final var methodName = "enterPragma_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPragma_elements(final PlSqlParser.Pragma_elementsContext ctx) {
    final var methodName = "enterPragma_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecision_part(final PlSqlParser.Precision_partContext ctx) {
    final var methodName = "enterPrecision_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrepare_clause(final PlSqlParser.Prepare_clauseContext ctx) {
    final var methodName = "enterPrepare_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimary_key_clause(final PlSqlParser.Primary_key_clauseContext ctx) {
    final var methodName = "enterPrimary_key_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimary_operator_item(final PlSqlParser.Primary_operator_itemContext ctx) {
    final var methodName = "enterPrimary_operator_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimary_operator_list(final PlSqlParser.Primary_operator_listContext ctx) {
    final var methodName = "enterPrimary_operator_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilege_audit_clause(final PlSqlParser.Privilege_audit_clauseContext ctx) {
    final var methodName = "enterPrivilege_audit_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProc_decl_in_type(final PlSqlParser.Proc_decl_in_typeContext ctx) {
    final var methodName = "enterProc_decl_in_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProcedure_body(final PlSqlParser.Procedure_bodyContext ctx) {
    final var methodName = "enterProcedure_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProcedure_name(final PlSqlParser.Procedure_nameContext ctx) {
    final var methodName = "enterProcedure_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProcedure_spec(final PlSqlParser.Procedure_specContext ctx) {
    final var methodName = "enterProcedure_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProfile_clause(final PlSqlParser.Profile_clauseContext ctx) {
    final var methodName = "enterProfile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProfile_name(final PlSqlParser.Profile_nameContext ctx) {
    final var methodName = "enterProfile_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProgram_unit(final PlSqlParser.Program_unitContext ctx) {
    final var methodName = "enterProgram_unit";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProperty_clauses(final PlSqlParser.Property_clausesContext ctx) {
    final var methodName = "enterProperty_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProperty_name(final PlSqlParser.Property_nameContext ctx) {
    final var methodName = "enterProperty_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProperty_value(final PlSqlParser.Property_valueContext ctx) {
    final var methodName = "enterProperty_value";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProxy_clause(final PlSqlParser.Proxy_clauseContext ctx) {
    final var methodName = "enterProxy_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPurge_statement(final PlSqlParser.Purge_statementContext ctx) {
    final var methodName = "enterPurge_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQry_transform_clause(final PlSqlParser.Qry_transform_clauseContext ctx) {
    final var methodName = "enterQry_transform_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQualified_disk_clause(final PlSqlParser.Qualified_disk_clauseContext ctx) {
    final var methodName = "enterQualified_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQualified_template_clause(
      final PlSqlParser.Qualified_template_clauseContext ctx) {
    final var methodName = "enterQualified_template_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuantified_expression(final PlSqlParser.Quantified_expressionContext ctx) {
    final var methodName = "enterQuantified_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuantitative_where_stmt(final PlSqlParser.Quantitative_where_stmtContext ctx) {
    final var methodName = "enterQuantitative_where_stmt";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuery_block(final PlSqlParser.Query_blockContext ctx) {
    final var methodName = "enterQuery_block";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuery_name(final PlSqlParser.Query_nameContext ctx) {
    final var methodName = "enterQuery_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuery_partition_clause(final PlSqlParser.Query_partition_clauseContext ctx) {
    final var methodName = "enterQuery_partition_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuorum_regular(final PlSqlParser.Quorum_regularContext ctx) {
    final var methodName = "enterQuorum_regular";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuota_clause(final PlSqlParser.Quota_clauseContext ctx) {
    final var methodName = "enterQuota_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuotagroup_clauses(final PlSqlParser.Quotagroup_clausesContext ctx) {
    final var methodName = "enterQuotagroup_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuoted_string(final PlSqlParser.Quoted_stringContext ctx) {
    final var methodName = "enterQuoted_string";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRaise_statement(final PlSqlParser.Raise_statementContext ctx) {
    final var methodName = "enterRaise_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRange_partition_desc(final PlSqlParser.Range_partition_descContext ctx) {
    final var methodName = "enterRange_partition_desc";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRange_partitions(final PlSqlParser.Range_partitionsContext ctx) {
    final var methodName = "enterRange_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRange_subpartition_desc(final PlSqlParser.Range_subpartition_descContext ctx) {
    final var methodName = "enterRange_subpartition_desc";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRange_values_clause(final PlSqlParser.Range_values_clauseContext ctx) {
    final var methodName = "enterRange_values_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRange_values_list(final PlSqlParser.Range_values_listContext ctx) {
    final var methodName = "enterRange_values_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRead_only_clause(final PlSqlParser.Read_only_clauseContext ctx) {
    final var methodName = "enterRead_only_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRebalance_diskgroup_clause(
      final PlSqlParser.Rebalance_diskgroup_clauseContext ctx) {
    final var methodName = "enterRebalance_diskgroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRebuild_clause(final PlSqlParser.Rebuild_clauseContext ctx) {
    final var methodName = "enterRebuild_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRecord_name(final PlSqlParser.Record_nameContext ctx) {
    final var methodName = "enterRecord_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRecord_type_def(final PlSqlParser.Record_type_defContext ctx) {
    final var methodName = "enterRecord_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRecords_per_block_clause(final PlSqlParser.Records_per_block_clauseContext ctx) {
    final var methodName = "enterRecords_per_block_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRecovery_clauses(final PlSqlParser.Recovery_clausesContext ctx) {
    final var methodName = "enterRecovery_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRedo_log_file_spec(final PlSqlParser.Redo_log_file_specContext ctx) {
    final var methodName = "enterRedo_log_file_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRedundancy_clause(final PlSqlParser.Redundancy_clauseContext ctx) {
    final var methodName = "enterRedundancy_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRef_cursor_type_def(final PlSqlParser.Ref_cursor_type_defContext ctx) {
    final var methodName = "enterRef_cursor_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReference_model(final PlSqlParser.Reference_modelContext ctx) {
    final var methodName = "enterReference_model";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReference_model_name(final PlSqlParser.Reference_model_nameContext ctx) {
    final var methodName = "enterReference_model_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReference_partition_desc(final PlSqlParser.Reference_partition_descContext ctx) {
    final var methodName = "enterReference_partition_desc";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReference_partitioning(final PlSqlParser.Reference_partitioningContext ctx) {
    final var methodName = "enterReference_partitioning";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReferences_clause(final PlSqlParser.References_clauseContext ctx) {
    final var methodName = "enterReferences_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReferencing_clause(final PlSqlParser.Referencing_clauseContext ctx) {
    final var methodName = "enterReferencing_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReferencing_element(final PlSqlParser.Referencing_elementContext ctx) {
    final var methodName = "enterReferencing_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRegister_logfile_clause(final PlSqlParser.Register_logfile_clauseContext ctx) {
    final var methodName = "enterRegister_logfile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRegular_id(final PlSqlParser.Regular_idContext ctx) {
    final var methodName = "enterRegular_id";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelational_expression(final PlSqlParser.Relational_expressionContext ctx) {
    final var methodName = "enterRelational_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelational_operator(final PlSqlParser.Relational_operatorContext ctx) {
    final var methodName = "enterRelational_operator";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelational_property(final PlSqlParser.Relational_propertyContext ctx) {
    final var methodName = "enterRelational_property";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelational_table(final PlSqlParser.Relational_tableContext ctx) {
    final var methodName = "enterRelational_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelies_on_part(final PlSqlParser.Relies_on_partContext ctx) {
    final var methodName = "enterRelies_on_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRename_column_clause(final PlSqlParser.Rename_column_clauseContext ctx) {
    final var methodName = "enterRename_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRename_disk_clause(final PlSqlParser.Rename_disk_clauseContext ctx) {
    final var methodName = "enterRename_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRename_index_partition(final PlSqlParser.Rename_index_partitionContext ctx) {
    final var methodName = "enterRename_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRename_object(final PlSqlParser.Rename_objectContext ctx) {
    final var methodName = "enterRename_object";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplace_disk_clause(final PlSqlParser.Replace_disk_clauseContext ctx) {
    final var methodName = "enterReplace_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplace_type_clause(final PlSqlParser.Replace_type_clauseContext ctx) {
    final var methodName = "enterReplace_type_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplay_upgrade_clauses(final PlSqlParser.Replay_upgrade_clausesContext ctx) {
    final var methodName = "enterReplay_upgrade_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResetlogs_or_noresetlogs(final PlSqlParser.Resetlogs_or_noresetlogsContext ctx) {
    final var methodName = "enterResetlogs_or_noresetlogs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResize_disk_clause(final PlSqlParser.Resize_disk_clauseContext ctx) {
    final var methodName = "enterResize_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResource_parameters(final PlSqlParser.Resource_parametersContext ctx) {
    final var methodName = "enterResource_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRespect_or_ignore_nulls(final PlSqlParser.Respect_or_ignore_nullsContext ctx) {
    final var methodName = "enterRespect_or_ignore_nulls";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRestore_point(final PlSqlParser.Restore_pointContext ctx) {
    final var methodName = "enterRestore_point";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResult_cache_clause(final PlSqlParser.Result_cache_clauseContext ctx) {
    final var methodName = "enterResult_cache_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReturn_rows_clause(final PlSqlParser.Return_rows_clauseContext ctx) {
    final var methodName = "enterReturn_rows_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReturn_statement(final PlSqlParser.Return_statementContext ctx) {
    final var methodName = "enterReturn_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReverse_migrate_keys(final PlSqlParser.Reverse_migrate_keysContext ctx) {
    final var methodName = "enterReverse_migrate_keys";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevoke_object_privileges(final PlSqlParser.Revoke_object_privilegesContext ctx) {
    final var methodName = "enterRevoke_object_privileges";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevoke_roles_from_programs(
      final PlSqlParser.Revoke_roles_from_programsContext ctx) {
    final var methodName = "enterRevoke_roles_from_programs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevoke_statement(final PlSqlParser.Revoke_statementContext ctx) {
    final var methodName = "enterRevoke_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevoke_system_privilege(final PlSqlParser.Revoke_system_privilegeContext ctx) {
    final var methodName = "enterRevoke_system_privilege";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevokee_clause(final PlSqlParser.Revokee_clauseContext ctx) {
    final var methodName = "enterRevokee_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRole_audit_clause(final PlSqlParser.Role_audit_clauseContext ctx) {
    final var methodName = "enterRole_audit_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRole_clause(final PlSqlParser.Role_clauseContext ctx) {
    final var methodName = "enterRole_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRole_identified_clause(final PlSqlParser.Role_identified_clauseContext ctx) {
    final var methodName = "enterRole_identified_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRole_name(final PlSqlParser.Role_nameContext ctx) {
    final var methodName = "enterRole_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollback_segment(final PlSqlParser.Rollback_segmentContext ctx) {
    final var methodName = "enterRollback_segment";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollback_segment_name(final PlSqlParser.Rollback_segment_nameContext ctx) {
    final var methodName = "enterRollback_segment_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollback_statement(final PlSqlParser.Rollback_statementContext ctx) {
    final var methodName = "enterRollback_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollup_cube_clause(final PlSqlParser.Rollup_cube_clauseContext ctx) {
    final var methodName = "enterRollup_cube_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutine_clause(final PlSqlParser.Routine_clauseContext ctx) {
    final var methodName = "enterRoutine_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutine_name(final PlSqlParser.Routine_nameContext ctx) {
    final var methodName = "enterRoutine_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRow_movement_clause(final PlSqlParser.Row_movement_clauseContext ctx) {
    final var methodName = "enterRow_movement_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSample_clause(final PlSqlParser.Sample_clauseContext ctx) {
    final var methodName = "enterSample_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSavepoint_name(final PlSqlParser.Savepoint_nameContext ctx) {
    final var methodName = "enterSavepoint_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSavepoint_statement(final PlSqlParser.Savepoint_statementContext ctx) {
    final var methodName = "enterSavepoint_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSchema_name(final PlSqlParser.Schema_nameContext ctx) {
    final var methodName = "enterSchema_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSchema_object_name(final PlSqlParser.Schema_object_nameContext ctx) {
    final var methodName = "enterSchema_object_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterScoped_table_ref_constraint(
      final PlSqlParser.Scoped_table_ref_constraintContext ctx) {
    final var methodName = "enterScoped_table_ref_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterScrub_clause(final PlSqlParser.Scrub_clauseContext ctx) {
    final var methodName = "enterScrub_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSearch_clause(final PlSqlParser.Search_clauseContext ctx) {
    final var methodName = "enterSearch_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSearched_case_statement(final PlSqlParser.Searched_case_statementContext ctx) {
    final var methodName = "enterSearched_case_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSearched_case_when_part(final PlSqlParser.Searched_case_when_partContext ctx) {
    final var methodName = "enterSearched_case_when_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSecret(final PlSqlParser.SecretContext ctx) {
    final var methodName = "enterSecret";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSecret_management_clauses(
      final PlSqlParser.Secret_management_clausesContext ctx) {
    final var methodName = "enterSecret_management_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSecurity_clause(final PlSqlParser.Security_clauseContext ctx) {
    final var methodName = "enterSecurity_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSeed_part(final PlSqlParser.Seed_partContext ctx) {
    final var methodName = "enterSeed_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSegment_attributes_clause(
      final PlSqlParser.Segment_attributes_clauseContext ctx) {
    final var methodName = "enterSegment_attributes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSegment_group(final PlSqlParser.Segment_groupContext ctx) {
    final var methodName = "enterSegment_group";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSegment_management_clause(
      final PlSqlParser.Segment_management_clauseContext ctx) {
    final var methodName = "enterSegment_management_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_list_elements(final PlSqlParser.Select_list_elementsContext ctx) {
    final var methodName = "enterSelect_list_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_only_statement(final PlSqlParser.Select_only_statementContext ctx) {
    final var methodName = "enterSelect_only_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelect_statement(final PlSqlParser.Select_statementContext ctx) {
    final var methodName = "enterSelect_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelected_list(final PlSqlParser.Selected_listContext ctx) {
    final var methodName = "enterSelected_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelected_tableview(final PlSqlParser.Selected_tableviewContext ctx) {
    final var methodName = "enterSelected_tableview";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelection_directive(final PlSqlParser.Selection_directiveContext ctx) {
    final var methodName = "enterSelection_directive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelection_directive_body(final PlSqlParser.Selection_directive_bodyContext ctx) {
    final var methodName = "enterSelection_directive_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSeq_of_declare_specs(final PlSqlParser.Seq_of_declare_specsContext ctx) {
    final var methodName = "enterSeq_of_declare_specs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSeq_of_statements(final PlSqlParser.Seq_of_statementsContext ctx) {
    final var methodName = "enterSeq_of_statements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSequence_name(final PlSqlParser.Sequence_nameContext ctx) {
    final var methodName = "enterSequence_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSequence_spec(final PlSqlParser.Sequence_specContext ctx) {
    final var methodName = "enterSequence_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSequence_start_clause(final PlSqlParser.Sequence_start_clauseContext ctx) {
    final var methodName = "enterSequence_start_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_command(final PlSqlParser.Set_commandContext ctx) {
    final var methodName = "enterSet_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_constraint_command(final PlSqlParser.Set_constraint_commandContext ctx) {
    final var methodName = "enterSet_constraint_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_container_data(final PlSqlParser.Set_container_dataContext ctx) {
    final var methodName = "enterSet_container_data";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_key(final PlSqlParser.Set_keyContext ctx) {
    final var methodName = "enterSet_key";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_key_tag(final PlSqlParser.Set_key_tagContext ctx) {
    final var methodName = "enterSet_key_tag";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_time_zone_clause(final PlSqlParser.Set_time_zone_clauseContext ctx) {
    final var methodName = "enterSet_time_zone_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSet_transaction_command(final PlSqlParser.Set_transaction_commandContext ctx) {
    final var methodName = "enterSet_transaction_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShrink_clause(final PlSqlParser.Shrink_clauseContext ctx) {
    final var methodName = "enterShrink_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimple_case_statement(final PlSqlParser.Simple_case_statementContext ctx) {
    final var methodName = "enterSimple_case_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimple_case_when_part(final PlSqlParser.Simple_case_when_partContext ctx) {
    final var methodName = "enterSimple_case_when_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimple_dml_trigger(final PlSqlParser.Simple_dml_triggerContext ctx) {
    final var methodName = "enterSimple_dml_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSingle_column_for_loop(final PlSqlParser.Single_column_for_loopContext ctx) {
    final var methodName = "enterSingle_column_for_loop";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSingle_table_insert(final PlSqlParser.Single_table_insertContext ctx) {
    final var methodName = "enterSingle_table_insert";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSize_clause(final PlSqlParser.Size_clauseContext ctx) {
    final var methodName = "enterSize_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSort_or_nosort(final PlSqlParser.Sort_or_nosortContext ctx) {
    final var methodName = "enterSort_or_nosort";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSource_clause(final PlSqlParser.Source_clauseContext ctx) {
    final var methodName = "enterSource_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSpfile_name(final PlSqlParser.Spfile_nameContext ctx) {
    final var methodName = "enterSpfile_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSplit_index_partition(final PlSqlParser.Split_index_partitionContext ctx) {
    final var methodName = "enterSplit_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSplit_table_partition(final PlSqlParser.Split_table_partitionContext ctx) {
    final var methodName = "enterSplit_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_macro_body(final PlSqlParser.Sql_macro_bodyContext ctx) {
    final var methodName = "enterSql_macro_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_operation(final PlSqlParser.Sql_operationContext ctx) {
    final var methodName = "enterSql_operation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_plus_command(final PlSqlParser.Sql_plus_commandContext ctx) {
    final var methodName = "enterSql_plus_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_plus_command_no_semicolon(
      final PlSqlParser.Sql_plus_command_no_semicolonContext ctx) {
    final var methodName = "enterSql_plus_command_no_semicolon";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_script(final PlSqlParser.Sql_scriptContext ctx) {
    final var methodName = "enterSql_script";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_statement(final PlSqlParser.Sql_statementContext ctx) {
    final var methodName = "enterSql_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql_statement_shortcut(final PlSqlParser.Sql_statement_shortcutContext ctx) {
    final var methodName = "enterSql_statement_shortcut";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSqlj_object_type(final PlSqlParser.Sqlj_object_typeContext ctx) {
    final var methodName = "enterSqlj_object_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSqlj_object_type_attr(final PlSqlParser.Sqlj_object_type_attrContext ctx) {
    final var methodName = "enterSqlj_object_type_attr";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStandard_actions(final PlSqlParser.Standard_actionsContext ctx) {
    final var methodName = "enterStandard_actions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStandard_function(final PlSqlParser.Standard_functionContext ctx) {
    final var methodName = "enterStandard_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStandard_prediction_function_keyword(
      final PlSqlParser.Standard_prediction_function_keywordContext ctx) {
    final var methodName = "enterStandard_prediction_function_keyword";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStandby_database_clauses(final PlSqlParser.Standby_database_clausesContext ctx) {
    final var methodName = "enterStandby_database_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStart_command(final PlSqlParser.Start_commandContext ctx) {
    final var methodName = "enterStart_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStart_part(final PlSqlParser.Start_partContext ctx) {
    final var methodName = "enterStart_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStart_standby_clause(final PlSqlParser.Start_standby_clauseContext ctx) {
    final var methodName = "enterStart_standby_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStart_time_column(final PlSqlParser.Start_time_columnContext ctx) {
    final var methodName = "enterStart_time_column";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStartup_clauses(final PlSqlParser.Startup_clausesContext ctx) {
    final var methodName = "enterStartup_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStatement(final PlSqlParser.StatementContext ctx) {
    final var methodName = "enterStatement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStatement_clauses(final PlSqlParser.Statement_clausesContext ctx) {
    final var methodName = "enterStatement_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStatic_base_profile(final PlSqlParser.Static_base_profileContext ctx) {
    final var methodName = "enterStatic_base_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStatic_returning_clause(final PlSqlParser.Static_returning_clauseContext ctx) {
    final var methodName = "enterStatic_returning_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStatistics_type_name(final PlSqlParser.Statistics_type_nameContext ctx) {
    final var methodName = "enterStatistics_type_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStop_standby_clause(final PlSqlParser.Stop_standby_clauseContext ctx) {
    final var methodName = "enterStop_standby_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStorage_clause(final PlSqlParser.Storage_clauseContext ctx) {
    final var methodName = "enterStorage_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStorage_table_clause(final PlSqlParser.Storage_table_clauseContext ctx) {
    final var methodName = "enterStorage_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStreaming_clause(final PlSqlParser.Streaming_clauseContext ctx) {
    final var methodName = "enterStreaming_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterString_delimiter(final PlSqlParser.String_delimiterContext ctx) {
    final var methodName = "enterString_delimiter";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterString_function(final PlSqlParser.String_functionContext ctx) {
    final var methodName = "enterString_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterString_function_name(final PlSqlParser.String_function_nameContext ctx) {
    final var methodName = "enterString_function_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterString_list(final PlSqlParser.String_listContext ctx) {
    final var methodName = "enterString_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStriping_clause(final PlSqlParser.Striping_clauseContext ctx) {
    final var methodName = "enterStriping_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubav_clause(final PlSqlParser.Subav_clauseContext ctx) {
    final var methodName = "enterSubav_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubav_factoring_clause(final PlSqlParser.Subav_factoring_clauseContext ctx) {
    final var methodName = "enterSubav_factoring_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubpartition_by_hash(final PlSqlParser.Subpartition_by_hashContext ctx) {
    final var methodName = "enterSubpartition_by_hash";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubpartition_by_list(final PlSqlParser.Subpartition_by_listContext ctx) {
    final var methodName = "enterSubpartition_by_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubpartition_by_range(final PlSqlParser.Subpartition_by_rangeContext ctx) {
    final var methodName = "enterSubpartition_by_range";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubpartition_extended_names(
      final PlSqlParser.Subpartition_extended_namesContext ctx) {
    final var methodName = "enterSubpartition_extended_names";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubpartition_key_value(final PlSqlParser.Subpartition_key_valueContext ctx) {
    final var methodName = "enterSubpartition_key_value";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubpartition_name(final PlSqlParser.Subpartition_nameContext ctx) {
    final var methodName = "enterSubpartition_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubpartition_template(final PlSqlParser.Subpartition_templateContext ctx) {
    final var methodName = "enterSubpartition_template";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubprog_decl_in_type(final PlSqlParser.Subprog_decl_in_typeContext ctx) {
    final var methodName = "enterSubprog_decl_in_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubprogram_spec(final PlSqlParser.Subprogram_specContext ctx) {
    final var methodName = "enterSubprogram_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubquery(final PlSqlParser.SubqueryContext ctx) {
    final var methodName = "enterSubquery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubquery_basic_elements(final PlSqlParser.Subquery_basic_elementsContext ctx) {
    final var methodName = "enterSubquery_basic_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubquery_factoring_clause(
      final PlSqlParser.Subquery_factoring_clauseContext ctx) {
    final var methodName = "enterSubquery_factoring_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubquery_operation_part(final PlSqlParser.Subquery_operation_partContext ctx) {
    final var methodName = "enterSubquery_operation_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubquery_restriction_clause(
      final PlSqlParser.Subquery_restriction_clauseContext ctx) {
    final var methodName = "enterSubquery_restriction_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubstitutable_column_clause(
      final PlSqlParser.Substitutable_column_clauseContext ctx) {
    final var methodName = "enterSubstitutable_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubtype_declaration(final PlSqlParser.Subtype_declarationContext ctx) {
    final var methodName = "enterSubtype_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSupplemental_db_logging(final PlSqlParser.Supplemental_db_loggingContext ctx) {
    final var methodName = "enterSupplemental_db_logging";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSupplemental_id_key_clause(
      final PlSqlParser.Supplemental_id_key_clauseContext ctx) {
    final var methodName = "enterSupplemental_id_key_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSupplemental_log_grp_clause(
      final PlSqlParser.Supplemental_log_grp_clauseContext ctx) {
    final var methodName = "enterSupplemental_log_grp_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSupplemental_logging_props(
      final PlSqlParser.Supplemental_logging_propsContext ctx) {
    final var methodName = "enterSupplemental_logging_props";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSupplemental_plsql_clause(
      final PlSqlParser.Supplemental_plsql_clauseContext ctx) {
    final var methodName = "enterSupplemental_plsql_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSupplemental_table_logging(
      final PlSqlParser.Supplemental_table_loggingContext ctx) {
    final var methodName = "enterSupplemental_table_logging";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSwallow_to_semi(final PlSqlParser.Swallow_to_semiContext ctx) {
    final var methodName = "enterSwallow_to_semi";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSwitch_logfile_clause(final PlSqlParser.Switch_logfile_clauseContext ctx) {
    final var methodName = "enterSwitch_logfile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSynchronous_or_asynchronous(
      final PlSqlParser.Synchronous_or_asynchronousContext ctx) {
    final var methodName = "enterSynchronous_or_asynchronous";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSynonym_name(final PlSqlParser.Synonym_nameContext ctx) {
    final var methodName = "enterSynonym_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSystem_action(final PlSqlParser.System_actionContext ctx) {
    final var methodName = "enterSystem_action";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSystem_actions(final PlSqlParser.System_actionsContext ctx) {
    final var methodName = "enterSystem_actions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSystem_partitioning(final PlSqlParser.System_partitioningContext ctx) {
    final var methodName = "enterSystem_partitioning";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSystem_privilege(final PlSqlParser.System_privilegeContext ctx) {
    final var methodName = "enterSystem_privilege";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_alias(final PlSqlParser.Table_aliasContext ctx) {
    final var methodName = "enterTable_alias";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_collection_expression(
      final PlSqlParser.Table_collection_expressionContext ctx) {
    final var methodName = "enterTable_collection_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_compression(final PlSqlParser.Table_compressionContext ctx) {
    final var methodName = "enterTable_compression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_element(final PlSqlParser.Table_elementContext ctx) {
    final var methodName = "enterTable_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_index_clause(final PlSqlParser.Table_index_clauseContext ctx) {
    final var methodName = "enterTable_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_indexed_by_part(final PlSqlParser.Table_indexed_by_partContext ctx) {
    final var methodName = "enterTable_indexed_by_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_name(final PlSqlParser.Table_nameContext ctx) {
    final var methodName = "enterTable_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_partition_description(
      final PlSqlParser.Table_partition_descriptionContext ctx) {
    final var methodName = "enterTable_partition_description";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_partitioning_clauses(
      final PlSqlParser.Table_partitioning_clausesContext ctx) {
    final var methodName = "enterTable_partitioning_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_properties(final PlSqlParser.Table_propertiesContext ctx) {
    final var methodName = "enterTable_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_ref(final PlSqlParser.Table_refContext ctx) {
    final var methodName = "enterTable_ref";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_ref_aux(final PlSqlParser.Table_ref_auxContext ctx) {
    final var methodName = "enterTable_ref_aux";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_ref_aux_internal_one(
      final PlSqlParser.Table_ref_aux_internal_oneContext ctx) {
    final var methodName = "enterTable_ref_aux_internal_one";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_ref_aux_internal_thre(
      final PlSqlParser.Table_ref_aux_internal_threContext ctx) {
    final var methodName = "enterTable_ref_aux_internal_thre";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_ref_aux_internal_two(
      final PlSqlParser.Table_ref_aux_internal_twoContext ctx) {
    final var methodName = "enterTable_ref_aux_internal_two";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_ref_list(final PlSqlParser.Table_ref_listContext ctx) {
    final var methodName = "enterTable_ref_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_type_def(final PlSqlParser.Table_type_defContext ctx) {
    final var methodName = "enterTable_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTable_var_name(final PlSqlParser.Table_var_nameContext ctx) {
    final var methodName = "enterTable_var_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespace(final PlSqlParser.TablespaceContext ctx) {
    final var methodName = "enterTablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespace_clauses(final PlSqlParser.Tablespace_clausesContext ctx) {
    final var methodName = "enterTablespace_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespace_datafile_clauses(
      final PlSqlParser.Tablespace_datafile_clausesContext ctx) {
    final var methodName = "enterTablespace_datafile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespace_encryption_clause(
      final PlSqlParser.Tablespace_encryption_clauseContext ctx) {
    final var methodName = "enterTablespace_encryption_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespace_encryption_spec(
      final PlSqlParser.Tablespace_encryption_specContext ctx) {
    final var methodName = "enterTablespace_encryption_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespace_group_clause(final PlSqlParser.Tablespace_group_clauseContext ctx) {
    final var methodName = "enterTablespace_group_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespace_group_name(final PlSqlParser.Tablespace_group_nameContext ctx) {
    final var methodName = "enterTablespace_group_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespace_logging_clauses(
      final PlSqlParser.Tablespace_logging_clausesContext ctx) {
    final var methodName = "enterTablespace_logging_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespace_retention_clause(
      final PlSqlParser.Tablespace_retention_clauseContext ctx) {
    final var methodName = "enterTablespace_retention_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespace_state_clauses(final PlSqlParser.Tablespace_state_clausesContext ctx) {
    final var methodName = "enterTablespace_state_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableview_name(final PlSqlParser.Tableview_nameContext ctx) {
    final var methodName = "enterTableview_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTempfile_specification(final PlSqlParser.Tempfile_specificationContext ctx) {
    final var methodName = "enterTempfile_specification";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTemporary_tablespace_clause(
      final PlSqlParser.Temporary_tablespace_clauseContext ctx) {
    final var methodName = "enterTemporary_tablespace_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTimeout_clause(final PlSqlParser.Timeout_clauseContext ctx) {
    final var methodName = "enterTimeout_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTiming_command(final PlSqlParser.Timing_commandContext ctx) {
    final var methodName = "enterTiming_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTiming_point_section(final PlSqlParser.Timing_point_sectionContext ctx) {
    final var methodName = "enterTiming_point_section";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTps_block(final PlSqlParser.Tps_blockContext ctx) {
    final var methodName = "enterTps_block";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrace_file_clause(final PlSqlParser.Trace_file_clauseContext ctx) {
    final var methodName = "enterTrace_file_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransaction_control_statements(
      final PlSqlParser.Transaction_control_statementsContext ctx) {
    final var methodName = "enterTransaction_control_statements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrigger_block(final PlSqlParser.Trigger_blockContext ctx) {
    final var methodName = "enterTrigger_block";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrigger_body(final PlSqlParser.Trigger_bodyContext ctx) {
    final var methodName = "enterTrigger_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrigger_follows_clause(final PlSqlParser.Trigger_follows_clauseContext ctx) {
    final var methodName = "enterTrigger_follows_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrigger_name(final PlSqlParser.Trigger_nameContext ctx) {
    final var methodName = "enterTrigger_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrigger_when_clause(final PlSqlParser.Trigger_when_clauseContext ctx) {
    final var methodName = "enterTrigger_when_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTruncate_cluster(final PlSqlParser.Truncate_clusterContext ctx) {
    final var methodName = "enterTruncate_cluster";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTruncate_table(final PlSqlParser.Truncate_tableContext ctx) {
    final var methodName = "enterTruncate_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTruncate_table_partition(final PlSqlParser.Truncate_table_partitionContext ctx) {
    final var methodName = "enterTruncate_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTs_file_name_convert(final PlSqlParser.Ts_file_name_convertContext ctx) {
    final var methodName = "enterTs_file_name_convert";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_body(final PlSqlParser.Type_bodyContext ctx) {
    final var methodName = "enterType_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_body_elements(final PlSqlParser.Type_body_elementsContext ctx) {
    final var methodName = "enterType_body_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_declaration(final PlSqlParser.Type_declarationContext ctx) {
    final var methodName = "enterType_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_definition(final PlSqlParser.Type_definitionContext ctx) {
    final var methodName = "enterType_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_elements_parameter(final PlSqlParser.Type_elements_parameterContext ctx) {
    final var methodName = "enterType_elements_parameter";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_function_spec(final PlSqlParser.Type_function_specContext ctx) {
    final var methodName = "enterType_function_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_name(final PlSqlParser.Type_nameContext ctx) {
    final var methodName = "enterType_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_procedure_spec(final PlSqlParser.Type_procedure_specContext ctx) {
    final var methodName = "enterType_procedure_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType_spec(final PlSqlParser.Type_specContext ctx) {
    final var methodName = "enterType_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnary_expression(final PlSqlParser.Unary_expressionContext ctx) {
    final var methodName = "enterUnary_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnary_logical_expression(final PlSqlParser.Unary_logical_expressionContext ctx) {
    final var methodName = "enterUnary_logical_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnary_logical_operation(final PlSqlParser.Unary_logical_operationContext ctx) {
    final var methodName = "enterUnary_logical_operation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUndo_mode_clause(final PlSqlParser.Undo_mode_clauseContext ctx) {
    final var methodName = "enterUndo_mode_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUndo_tablespace(final PlSqlParser.Undo_tablespaceContext ctx) {
    final var methodName = "enterUndo_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUndo_tablespace_clause(final PlSqlParser.Undo_tablespace_clauseContext ctx) {
    final var methodName = "enterUndo_tablespace_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUndrop_disk_clause(final PlSqlParser.Undrop_disk_clauseContext ctx) {
    final var methodName = "enterUndrop_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnified_auditing(final PlSqlParser.Unified_auditingContext ctx) {
    final var methodName = "enterUnified_auditing";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnique_key_clause(final PlSqlParser.Unique_key_clauseContext ctx) {
    final var methodName = "enterUnique_key_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnit_statement(final PlSqlParser.Unit_statementContext ctx) {
    final var methodName = "enterUnit_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnite_keystore(final PlSqlParser.Unite_keystoreContext ctx) {
    final var methodName = "enterUnite_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnpivot_clause(final PlSqlParser.Unpivot_clauseContext ctx) {
    final var methodName = "enterUnpivot_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnpivot_in_clause(final PlSqlParser.Unpivot_in_clauseContext ctx) {
    final var methodName = "enterUnpivot_in_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnpivot_in_elements(final PlSqlParser.Unpivot_in_elementsContext ctx) {
    final var methodName = "enterUnpivot_in_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUntil_part(final PlSqlParser.Until_partContext ctx) {
    final var methodName = "enterUntil_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_all_indexes_clause(
      final PlSqlParser.Update_all_indexes_clauseContext ctx) {
    final var methodName = "enterUpdate_all_indexes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_all_indexes_index_clause(
      final PlSqlParser.Update_all_indexes_index_clauseContext ctx) {
    final var methodName = "enterUpdate_all_indexes_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_global_index_clause(
      final PlSqlParser.Update_global_index_clauseContext ctx) {
    final var methodName = "enterUpdate_global_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_index_clauses(final PlSqlParser.Update_index_clausesContext ctx) {
    final var methodName = "enterUpdate_index_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_index_partition(final PlSqlParser.Update_index_partitionContext ctx) {
    final var methodName = "enterUpdate_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_index_subpartition(
      final PlSqlParser.Update_index_subpartitionContext ctx) {
    final var methodName = "enterUpdate_index_subpartition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_set_clause(final PlSqlParser.Update_set_clauseContext ctx) {
    final var methodName = "enterUpdate_set_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdate_statement(final PlSqlParser.Update_statementContext ctx) {
    final var methodName = "enterUpdate_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpgrade_or_downgrade(final PlSqlParser.Upgrade_or_downgradeContext ctx) {
    final var methodName = "enterUpgrade_or_downgrade";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpgrade_table_clause(final PlSqlParser.Upgrade_table_clauseContext ctx) {
    final var methodName = "enterUpgrade_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpper_bound(final PlSqlParser.Upper_boundContext ctx) {
    final var methodName = "enterUpper_bound";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUse_key(final PlSqlParser.Use_keyContext ctx) {
    final var methodName = "enterUse_key";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUser_clauses(final PlSqlParser.User_clausesContext ctx) {
    final var methodName = "enterUser_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUser_default_role_clause(final PlSqlParser.User_default_role_clauseContext ctx) {
    final var methodName = "enterUser_default_role_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUser_editions_clause(final PlSqlParser.User_editions_clauseContext ctx) {
    final var methodName = "enterUser_editions_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUser_lock_clause(final PlSqlParser.User_lock_clauseContext ctx) {
    final var methodName = "enterUser_lock_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUser_object_name(final PlSqlParser.User_object_nameContext ctx) {
    final var methodName = "enterUser_object_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUser_tablespace_clause(final PlSqlParser.User_tablespace_clauseContext ctx) {
    final var methodName = "enterUser_tablespace_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUsergroup_clauses(final PlSqlParser.Usergroup_clausesContext ctx) {
    final var methodName = "enterUsergroup_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUsing_algorithm_clause(final PlSqlParser.Using_algorithm_clauseContext ctx) {
    final var methodName = "enterUsing_algorithm_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUsing_clause(final PlSqlParser.Using_clauseContext ctx) {
    final var methodName = "enterUsing_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUsing_element(final PlSqlParser.Using_elementContext ctx) {
    final var methodName = "enterUsing_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUsing_function_clause(final PlSqlParser.Using_function_clauseContext ctx) {
    final var methodName = "enterUsing_function_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUsing_index_clause(final PlSqlParser.Using_index_clauseContext ctx) {
    final var methodName = "enterUsing_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUsing_statistics_type(final PlSqlParser.Using_statistics_typeContext ctx) {
    final var methodName = "enterUsing_statistics_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUsing_tag_clause(final PlSqlParser.Using_tag_clauseContext ctx) {
    final var methodName = "enterUsing_tag_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValidation_clauses(final PlSqlParser.Validation_clausesContext ctx) {
    final var methodName = "enterValidation_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValues_clause(final PlSqlParser.Values_clauseContext ctx) {
    final var methodName = "enterValues_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVariable_declaration(final PlSqlParser.Variable_declarationContext ctx) {
    final var methodName = "enterVariable_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVariable_name(final PlSqlParser.Variable_nameContext ctx) {
    final var methodName = "enterVariable_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVariable_or_collection(final PlSqlParser.Variable_or_collectionContext ctx) {
    final var methodName = "enterVariable_or_collection";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVarray_col_properties(final PlSqlParser.Varray_col_propertiesContext ctx) {
    final var methodName = "enterVarray_col_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVarray_item(final PlSqlParser.Varray_itemContext ctx) {
    final var methodName = "enterVarray_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVarray_storage_clause(final PlSqlParser.Varray_storage_clauseContext ctx) {
    final var methodName = "enterVarray_storage_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVarray_type_def(final PlSqlParser.Varray_type_defContext ctx) {
    final var methodName = "enterVarray_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterView_alias_constraint(final PlSqlParser.View_alias_constraintContext ctx) {
    final var methodName = "enterView_alias_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterView_options(final PlSqlParser.View_optionsContext ctx) {
    final var methodName = "enterView_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVirtual_column_definition(
      final PlSqlParser.Virtual_column_definitionContext ctx) {
    final var methodName = "enterVirtual_column_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVisible_or_invisible(final PlSqlParser.Visible_or_invisibleContext ctx) {
    final var methodName = "enterVisible_or_invisible";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWait_nowait(final PlSqlParser.Wait_nowaitContext ctx) {
    final var methodName = "enterWait_nowait";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWait_nowait_part(final PlSqlParser.Wait_nowait_partContext ctx) {
    final var methodName = "enterWait_nowait_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhenever_command(final PlSqlParser.Whenever_commandContext ctx) {
    final var methodName = "enterWhenever_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhere_clause(final PlSqlParser.Where_clauseContext ctx) {
    final var methodName = "enterWhere_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindowing_clause(final PlSqlParser.Windowing_clauseContext ctx) {
    final var methodName = "enterWindowing_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindowing_elements(final PlSqlParser.Windowing_elementsContext ctx) {
    final var methodName = "enterWindowing_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindowing_type(final PlSqlParser.Windowing_typeContext ctx) {
    final var methodName = "enterWindowing_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWith_backup_clause(final PlSqlParser.With_backup_clauseContext ctx) {
    final var methodName = "enterWith_backup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWith_clause(final PlSqlParser.With_clauseContext ctx) {
    final var methodName = "enterWith_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWith_factoring_clause(final PlSqlParser.With_factoring_clauseContext ctx) {
    final var methodName = "enterWith_factoring_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithin_or_over_clause_keyword(
      final PlSqlParser.Within_or_over_clause_keywordContext ctx) {
    final var methodName = "enterWithin_or_over_clause_keyword";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithin_or_over_part(final PlSqlParser.Within_or_over_partContext ctx) {
    final var methodName = "enterWithin_or_over_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWrite_clause(final PlSqlParser.Write_clauseContext ctx) {
    final var methodName = "enterWrite_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_attributes_clause(final PlSqlParser.Xml_attributes_clauseContext ctx) {
    final var methodName = "enterXml_attributes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_column_name(final PlSqlParser.Xml_column_nameContext ctx) {
    final var methodName = "enterXml_column_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_general_default_part(final PlSqlParser.Xml_general_default_partContext ctx) {
    final var methodName = "enterXml_general_default_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_multiuse_expression_element(
      final PlSqlParser.Xml_multiuse_expression_elementContext ctx) {
    final var methodName = "enterXml_multiuse_expression_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_namespaces_clause(final PlSqlParser.Xml_namespaces_clauseContext ctx) {
    final var methodName = "enterXml_namespaces_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_passing_clause(final PlSqlParser.Xml_passing_clauseContext ctx) {
    final var methodName = "enterXml_passing_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_schema_spec(final PlSqlParser.Xml_schema_specContext ctx) {
    final var methodName = "enterXml_schema_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_schema_url(final PlSqlParser.Xml_schema_urlContext ctx) {
    final var methodName = "enterXml_schema_url";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXml_table_column(final PlSqlParser.Xml_table_columnContext ctx) {
    final var methodName = "enterXml_table_column";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmlindex_clause(final PlSqlParser.Xmlindex_clauseContext ctx) {
    final var methodName = "enterXmlindex_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmlroot_param_standalone_part(
      final PlSqlParser.Xmlroot_param_standalone_partContext ctx) {
    final var methodName = "enterXmlroot_param_standalone_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmlroot_param_version_part(
      final PlSqlParser.Xmlroot_param_version_partContext ctx) {
    final var methodName = "enterXmlroot_param_version_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmlschema_spec(final PlSqlParser.Xmlschema_specContext ctx) {
    final var methodName = "enterXmlschema_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmlserialize_param_enconding_part(
      final PlSqlParser.Xmlserialize_param_enconding_partContext ctx) {
    final var methodName = "enterXmlserialize_param_enconding_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmlserialize_param_ident_part(
      final PlSqlParser.Xmlserialize_param_ident_partContext ctx) {
    final var methodName = "enterXmlserialize_param_ident_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmlserialize_param_version_part(
      final PlSqlParser.Xmlserialize_param_version_partContext ctx) {
    final var methodName = "enterXmlserialize_param_version_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmltable(final PlSqlParser.XmltableContext ctx) {
    final var methodName = "enterXmltable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmltype_column_properties(
      final PlSqlParser.Xmltype_column_propertiesContext ctx) {
    final var methodName = "enterXmltype_column_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmltype_storage(final PlSqlParser.Xmltype_storageContext ctx) {
    final var methodName = "enterXmltype_storage";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmltype_table(final PlSqlParser.Xmltype_tableContext ctx) {
    final var methodName = "enterXmltype_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmltype_view_clause(final PlSqlParser.Xmltype_view_clauseContext ctx) {
    final var methodName = "enterXmltype_view_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXmltype_virtual_columns(final PlSqlParser.Xmltype_virtual_columnsContext ctx) {
    final var methodName = "enterXmltype_virtual_columns";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterYes_no(final PlSqlParser.Yes_noContext ctx) {
    final var methodName = "enterYes_no";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterZero_downtime_software_patching_clauses(
      final PlSqlParser.Zero_downtime_software_patching_clausesContext ctx) {
    final var methodName = "enterZero_downtime_software_patching_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterZonemap_attributes(final PlSqlParser.Zonemap_attributesContext ctx) {
    final var methodName = "enterZonemap_attributes";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterZonemap_clause(final PlSqlParser.Zonemap_clauseContext ctx) {
    final var methodName = "enterZonemap_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterZonemap_name(final PlSqlParser.Zonemap_nameContext ctx) {
    final var methodName = "enterZonemap_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterZonemap_refresh_clause(final PlSqlParser.Zonemap_refresh_clauseContext ctx) {
    final var methodName = "enterZonemap_refresh_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAccess_driver_type(final PlSqlParser.Access_driver_typeContext ctx) {
    final var methodName = "exitAccess_driver_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAccessible_by_clause(final PlSqlParser.Accessible_by_clauseContext ctx) {
    final var methodName = "exitAccessible_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAccessor(final PlSqlParser.AccessorContext ctx) {
    final var methodName = "exitAccessor";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAction_audit_clause(final PlSqlParser.Action_audit_clauseContext ctx) {
    final var methodName = "exitAction_audit_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitActions_clause(final PlSqlParser.Actions_clauseContext ctx) {
    final var methodName = "exitActions_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitActivate_standby_db_clause(
      final PlSqlParser.Activate_standby_db_clauseContext ctx) {
    final var methodName = "exitActivate_standby_db_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAd_attributes_clause(final PlSqlParser.Ad_attributes_clauseContext ctx) {
    final var methodName = "exitAd_attributes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAd_level_clause(final PlSqlParser.Ad_level_clauseContext ctx) {
    final var methodName = "exitAd_level_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAd_using_clause(final PlSqlParser.Ad_using_clauseContext ctx) {
    final var methodName = "exitAd_using_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_binding_clause(final PlSqlParser.Add_binding_clauseContext ctx) {
    final var methodName = "exitAdd_binding_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_calc_meas_clause(final PlSqlParser.Add_calc_meas_clauseContext ctx) {
    final var methodName = "exitAdd_calc_meas_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_calcs_clause(final PlSqlParser.Add_calcs_clauseContext ctx) {
    final var methodName = "exitAdd_calcs_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_column_clause(final PlSqlParser.Add_column_clauseContext ctx) {
    final var methodName = "exitAdd_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_constraint(final PlSqlParser.Add_constraintContext ctx) {
    final var methodName = "exitAdd_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_constraint_clause(final PlSqlParser.Add_constraint_clauseContext ctx) {
    final var methodName = "exitAdd_constraint_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_disk_clause(final PlSqlParser.Add_disk_clauseContext ctx) {
    final var methodName = "exitAdd_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_filegroup_clause(final PlSqlParser.Add_filegroup_clauseContext ctx) {
    final var methodName = "exitAdd_filegroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_hash_index_partition(final PlSqlParser.Add_hash_index_partitionContext ctx) {
    final var methodName = "exitAdd_hash_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_logfile_clauses(final PlSqlParser.Add_logfile_clausesContext ctx) {
    final var methodName = "exitAdd_logfile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_modify_drop_column_clauses(
      final PlSqlParser.Add_modify_drop_column_clausesContext ctx) {
    final var methodName = "exitAdd_modify_drop_column_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_mv_log_column_clause(final PlSqlParser.Add_mv_log_column_clauseContext ctx) {
    final var methodName = "exitAdd_mv_log_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_or_drop(final PlSqlParser.Add_or_dropContext ctx) {
    final var methodName = "exitAdd_or_drop";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_overflow_clause(final PlSqlParser.Add_overflow_clauseContext ctx) {
    final var methodName = "exitAdd_overflow_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_rem_container_data(final PlSqlParser.Add_rem_container_dataContext ctx) {
    final var methodName = "exitAdd_rem_container_data";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_table_partition(final PlSqlParser.Add_table_partitionContext ctx) {
    final var methodName = "exitAdd_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_update_secret(final PlSqlParser.Add_update_secretContext ctx) {
    final var methodName = "exitAdd_update_secret";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_update_secret_seps(final PlSqlParser.Add_update_secret_sepsContext ctx) {
    final var methodName = "exitAdd_update_secret_seps";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdd_volume_clause(final PlSqlParser.Add_volume_clauseContext ctx) {
    final var methodName = "exitAdd_volume_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdminister_key_management(
      final PlSqlParser.Administer_key_managementContext ctx) {
    final var methodName = "exitAdminister_key_management";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggregate_clause(final PlSqlParser.Aggregate_clauseContext ctx) {
    final var methodName = "exitAggregate_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggregate_function_name(final PlSqlParser.Aggregate_function_nameContext ctx) {
    final var methodName = "exitAggregate_function_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAll_clause(final PlSqlParser.All_clauseContext ctx) {
    final var methodName = "exitAll_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAllocate_extent_clause(final PlSqlParser.Allocate_extent_clauseContext ctx) {
    final var methodName = "exitAllocate_extent_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAllow_or_disallow(final PlSqlParser.Allow_or_disallowContext ctx) {
    final var methodName = "exitAllow_or_disallow";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_add_cache_clause(final PlSqlParser.Alter_add_cache_clauseContext ctx) {
    final var methodName = "exitAlter_add_cache_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_analytic_view(final PlSqlParser.Alter_analytic_viewContext ctx) {
    final var methodName = "exitAlter_analytic_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_attribute_definition(
      final PlSqlParser.Alter_attribute_definitionContext ctx) {
    final var methodName = "exitAlter_attribute_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_attribute_dimension(
      final PlSqlParser.Alter_attribute_dimensionContext ctx) {
    final var methodName = "exitAlter_attribute_dimension";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_audit_policy(final PlSqlParser.Alter_audit_policyContext ctx) {
    final var methodName = "exitAlter_audit_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_cluster(final PlSqlParser.Alter_clusterContext ctx) {
    final var methodName = "exitAlter_cluster";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_collection_clauses(final PlSqlParser.Alter_collection_clausesContext ctx) {
    final var methodName = "exitAlter_collection_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_database(final PlSqlParser.Alter_databaseContext ctx) {
    final var methodName = "exitAlter_database";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_database_link(final PlSqlParser.Alter_database_linkContext ctx) {
    final var methodName = "exitAlter_database_link";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_datafile_clause(final PlSqlParser.Alter_datafile_clauseContext ctx) {
    final var methodName = "exitAlter_datafile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_dimension(final PlSqlParser.Alter_dimensionContext ctx) {
    final var methodName = "exitAlter_dimension";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_diskgroup(final PlSqlParser.Alter_diskgroupContext ctx) {
    final var methodName = "exitAlter_diskgroup";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_drop_cache_clause(final PlSqlParser.Alter_drop_cache_clauseContext ctx) {
    final var methodName = "exitAlter_drop_cache_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_flashback_archive(final PlSqlParser.Alter_flashback_archiveContext ctx) {
    final var methodName = "exitAlter_flashback_archive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_function(final PlSqlParser.Alter_functionContext ctx) {
    final var methodName = "exitAlter_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_hierarchy(final PlSqlParser.Alter_hierarchyContext ctx) {
    final var methodName = "exitAlter_hierarchy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_identified_by(final PlSqlParser.Alter_identified_byContext ctx) {
    final var methodName = "exitAlter_identified_by";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_index(final PlSqlParser.Alter_indexContext ctx) {
    final var methodName = "exitAlter_index";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_index_ops_set1(final PlSqlParser.Alter_index_ops_set1Context ctx) {
    final var methodName = "exitAlter_index_ops_set1";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_index_ops_set2(final PlSqlParser.Alter_index_ops_set2Context ctx) {
    final var methodName = "exitAlter_index_ops_set2";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_index_partitioning(final PlSqlParser.Alter_index_partitioningContext ctx) {
    final var methodName = "exitAlter_index_partitioning";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_inmemory_join_group(
      final PlSqlParser.Alter_inmemory_join_groupContext ctx) {
    final var methodName = "exitAlter_inmemory_join_group";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_interval_partition(final PlSqlParser.Alter_interval_partitionContext ctx) {
    final var methodName = "exitAlter_interval_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_iot_clauses(final PlSqlParser.Alter_iot_clausesContext ctx) {
    final var methodName = "exitAlter_iot_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_java(final PlSqlParser.Alter_javaContext ctx) {
    final var methodName = "exitAlter_java";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_keystore_password(final PlSqlParser.Alter_keystore_passwordContext ctx) {
    final var methodName = "exitAlter_keystore_password";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_library(final PlSqlParser.Alter_libraryContext ctx) {
    final var methodName = "exitAlter_library";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_lockdown_profile(final PlSqlParser.Alter_lockdown_profileContext ctx) {
    final var methodName = "exitAlter_lockdown_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_mapping_table_clause(
      final PlSqlParser.Alter_mapping_table_clauseContext ctx) {
    final var methodName = "exitAlter_mapping_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_materialized_view(final PlSqlParser.Alter_materialized_viewContext ctx) {
    final var methodName = "exitAlter_materialized_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_materialized_view_log(
      final PlSqlParser.Alter_materialized_view_logContext ctx) {
    final var methodName = "exitAlter_materialized_view_log";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_materialized_zonemap(
      final PlSqlParser.Alter_materialized_zonemapContext ctx) {
    final var methodName = "exitAlter_materialized_zonemap";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_method_element(final PlSqlParser.Alter_method_elementContext ctx) {
    final var methodName = "exitAlter_method_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_method_spec(final PlSqlParser.Alter_method_specContext ctx) {
    final var methodName = "exitAlter_method_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_mv_option1(final PlSqlParser.Alter_mv_option1Context ctx) {
    final var methodName = "exitAlter_mv_option1";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_mv_refresh(final PlSqlParser.Alter_mv_refreshContext ctx) {
    final var methodName = "exitAlter_mv_refresh";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_operator(final PlSqlParser.Alter_operatorContext ctx) {
    final var methodName = "exitAlter_operator";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_outline(final PlSqlParser.Alter_outlineContext ctx) {
    final var methodName = "exitAlter_outline";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_overflow_clause(final PlSqlParser.Alter_overflow_clauseContext ctx) {
    final var methodName = "exitAlter_overflow_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_package(final PlSqlParser.Alter_packageContext ctx) {
    final var methodName = "exitAlter_package";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_pmem_filestore(final PlSqlParser.Alter_pmem_filestoreContext ctx) {
    final var methodName = "exitAlter_pmem_filestore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_procedure(final PlSqlParser.Alter_procedureContext ctx) {
    final var methodName = "exitAlter_procedure";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_resource_cost(final PlSqlParser.Alter_resource_costContext ctx) {
    final var methodName = "exitAlter_resource_cost";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_role(final PlSqlParser.Alter_roleContext ctx) {
    final var methodName = "exitAlter_role";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_rollback_segment(final PlSqlParser.Alter_rollback_segmentContext ctx) {
    final var methodName = "exitAlter_rollback_segment";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_sequence(final PlSqlParser.Alter_sequenceContext ctx) {
    final var methodName = "exitAlter_sequence";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_session(final PlSqlParser.Alter_sessionContext ctx) {
    final var methodName = "exitAlter_session";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_session_set_clause(final PlSqlParser.Alter_session_set_clauseContext ctx) {
    final var methodName = "exitAlter_session_set_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_synonym(final PlSqlParser.Alter_synonymContext ctx) {
    final var methodName = "exitAlter_synonym";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table(final PlSqlParser.Alter_tableContext ctx) {
    final var methodName = "exitAlter_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_partitioning(final PlSqlParser.Alter_table_partitioningContext ctx) {
    final var methodName = "exitAlter_table_partitioning";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_properties(final PlSqlParser.Alter_table_propertiesContext ctx) {
    final var methodName = "exitAlter_table_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_table_properties_1(final PlSqlParser.Alter_table_properties_1Context ctx) {
    final var methodName = "exitAlter_table_properties_1";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_tablespace(final PlSqlParser.Alter_tablespaceContext ctx) {
    final var methodName = "exitAlter_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_tablespace_attrs(final PlSqlParser.Alter_tablespace_attrsContext ctx) {
    final var methodName = "exitAlter_tablespace_attrs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_tablespace_encryption(
      final PlSqlParser.Alter_tablespace_encryptionContext ctx) {
    final var methodName = "exitAlter_tablespace_encryption";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_tablespace_set(final PlSqlParser.Alter_tablespace_setContext ctx) {
    final var methodName = "exitAlter_tablespace_set";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_tempfile_clause(final PlSqlParser.Alter_tempfile_clauseContext ctx) {
    final var methodName = "exitAlter_tempfile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_trigger(final PlSqlParser.Alter_triggerContext ctx) {
    final var methodName = "exitAlter_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_type(final PlSqlParser.Alter_typeContext ctx) {
    final var methodName = "exitAlter_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_user(final PlSqlParser.Alter_userContext ctx) {
    final var methodName = "exitAlter_user";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_user_editions_clause(
      final PlSqlParser.Alter_user_editions_clauseContext ctx) {
    final var methodName = "exitAlter_user_editions_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_varray_col_properties(
      final PlSqlParser.Alter_varray_col_propertiesContext ctx) {
    final var methodName = "exitAlter_varray_col_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_view(final PlSqlParser.Alter_viewContext ctx) {
    final var methodName = "exitAlter_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlter_view_editionable(final PlSqlParser.Alter_view_editionableContext ctx) {
    final var methodName = "exitAlter_view_editionable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlternate_key_clause(final PlSqlParser.Alternate_key_clauseContext ctx) {
    final var methodName = "exitAlternate_key_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAnalyze(final PlSqlParser.AnalyzeContext ctx) {
    final var methodName = "exitAnalyze";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAnonymous_block(final PlSqlParser.Anonymous_blockContext ctx) {
    final var methodName = "exitAnonymous_block";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitArgument(final PlSqlParser.ArgumentContext ctx) {
    final var methodName = "exitArgument";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAssignment_statement(final PlSqlParser.Assignment_statementContext ctx) {
    final var methodName = "exitAssignment_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAssociate_statistics(final PlSqlParser.Associate_statisticsContext ctx) {
    final var methodName = "exitAssociate_statistics";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAtom(final PlSqlParser.AtomContext ctx) {
    final var methodName = "exitAtom";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAttribute_clause(final PlSqlParser.Attribute_clauseContext ctx) {
    final var methodName = "exitAttribute_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAttribute_clustering_clause(
      final PlSqlParser.Attribute_clustering_clauseContext ctx) {
    final var methodName = "exitAttribute_clustering_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAttribute_definition(final PlSqlParser.Attribute_definitionContext ctx) {
    final var methodName = "exitAttribute_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAttribute_name(final PlSqlParser.Attribute_nameContext ctx) {
    final var methodName = "exitAttribute_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAttributes_clause(final PlSqlParser.Attributes_clauseContext ctx) {
    final var methodName = "exitAttributes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAudit_container_clause(final PlSqlParser.Audit_container_clauseContext ctx) {
    final var methodName = "exitAudit_container_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAudit_direct_path(final PlSqlParser.Audit_direct_pathContext ctx) {
    final var methodName = "exitAudit_direct_path";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAudit_operation_clause(final PlSqlParser.Audit_operation_clauseContext ctx) {
    final var methodName = "exitAudit_operation_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAudit_schema_object_clause(
      final PlSqlParser.Audit_schema_object_clauseContext ctx) {
    final var methodName = "exitAudit_schema_object_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAudit_traditional(final PlSqlParser.Audit_traditionalContext ctx) {
    final var methodName = "exitAudit_traditional";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAudit_user(final PlSqlParser.Audit_userContext ctx) {
    final var methodName = "exitAudit_user";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAuditing_by_clause(final PlSqlParser.Auditing_by_clauseContext ctx) {
    final var methodName = "exitAuditing_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAuditing_on_clause(final PlSqlParser.Auditing_on_clauseContext ctx) {
    final var methodName = "exitAuditing_on_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAutoextend_clause(final PlSqlParser.Autoextend_clauseContext ctx) {
    final var methodName = "exitAutoextend_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAutogenerated_sequence_definition(
      final PlSqlParser.Autogenerated_sequence_definitionContext ctx) {
    final var methodName = "exitAutogenerated_sequence_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAv_measure(final PlSqlParser.Av_measureContext ctx) {
    final var methodName = "exitAv_measure";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBackup_keystore(final PlSqlParser.Backup_keystoreContext ctx) {
    final var methodName = "exitBackup_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBase_meas_clause(final PlSqlParser.Base_meas_clauseContext ctx) {
    final var methodName = "exitBase_meas_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBegin_or_end(final PlSqlParser.Begin_or_endContext ctx) {
    final var methodName = "exitBegin_or_end";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBetween_bound(final PlSqlParser.Between_boundContext ctx) {
    final var methodName = "exitBetween_bound";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBetween_elements(final PlSqlParser.Between_elementsContext ctx) {
    final var methodName = "exitBetween_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBind_variable(final PlSqlParser.Bind_variableContext ctx) {
    final var methodName = "exitBind_variable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBinding_clause(final PlSqlParser.Binding_clauseContext ctx) {
    final var methodName = "exitBinding_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBitmap_join_index_clause(final PlSqlParser.Bitmap_join_index_clauseContext ctx) {
    final var methodName = "exitBitmap_join_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBlock(final PlSqlParser.BlockContext ctx) {
    final var methodName = "exitBlock";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBlockchain_drop_table_clause(
      final PlSqlParser.Blockchain_drop_table_clauseContext ctx) {
    final var methodName = "exitBlockchain_drop_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBlockchain_hash_and_data_format_clause(
      final PlSqlParser.Blockchain_hash_and_data_format_clauseContext ctx) {
    final var methodName = "exitBlockchain_hash_and_data_format_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBlockchain_row_retention_clause(
      final PlSqlParser.Blockchain_row_retention_clauseContext ctx) {
    final var methodName = "exitBlockchain_row_retention_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBlockchain_table_clauses(final PlSqlParser.Blockchain_table_clausesContext ctx) {
    final var methodName = "exitBlockchain_table_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBody(final PlSqlParser.BodyContext ctx) {
    final var methodName = "exitBody";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBounds_clause(final PlSqlParser.Bounds_clauseContext ctx) {
    final var methodName = "exitBounds_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBuild_clause(final PlSqlParser.Build_clauseContext ctx) {
    final var methodName = "exitBuild_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitC_agent_in_clause(final PlSqlParser.C_agent_in_clauseContext ctx) {
    final var methodName = "exitC_agent_in_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitC_external_parameter(final PlSqlParser.C_external_parameterContext ctx) {
    final var methodName = "exitC_external_parameter";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitC_parameters_clause(final PlSqlParser.C_parameters_clauseContext ctx) {
    final var methodName = "exitC_parameters_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitC_property(final PlSqlParser.C_propertyContext ctx) {
    final var methodName = "exitC_property";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitC_spec(final PlSqlParser.C_specContext ctx) {
    final var methodName = "exitC_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCache_clause(final PlSqlParser.Cache_clauseContext ctx) {
    final var methodName = "exitCache_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCache_or_nocache(final PlSqlParser.Cache_or_nocacheContext ctx) {
    final var methodName = "exitCache_or_nocache";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCache_specification(final PlSqlParser.Cache_specificationContext ctx) {
    final var methodName = "exitCache_specification";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCalc_meas_clause(final PlSqlParser.Calc_meas_clauseContext ctx) {
    final var methodName = "exitCalc_meas_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCall_spec(final PlSqlParser.Call_specContext ctx) {
    final var methodName = "exitCall_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCall_statement(final PlSqlParser.Call_statementContext ctx) {
    final var methodName = "exitCall_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaption_clause(final PlSqlParser.Caption_clauseContext ctx) {
    final var methodName = "exitCaption_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCase_else_part(final PlSqlParser.Case_else_partContext ctx) {
    final var methodName = "exitCase_else_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCase_statement(final PlSqlParser.Case_statementContext ctx) {
    final var methodName = "exitCase_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCav_using_clause(final PlSqlParser.Cav_using_clauseContext ctx) {
    final var methodName = "exitCav_using_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCdb_fleet_clauses(final PlSqlParser.Cdb_fleet_clausesContext ctx) {
    final var methodName = "exitCdb_fleet_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCell_assignment(final PlSqlParser.Cell_assignmentContext ctx) {
    final var methodName = "exitCell_assignment";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCell_reference_options(final PlSqlParser.Cell_reference_optionsContext ctx) {
    final var methodName = "exitCell_reference_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChar_set_name(final PlSqlParser.Char_set_nameContext ctx) {
    final var methodName = "exitChar_set_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharacter_set_clause(final PlSqlParser.Character_set_clauseContext ctx) {
    final var methodName = "exitCharacter_set_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheck_constraint(final PlSqlParser.Check_constraintContext ctx) {
    final var methodName = "exitCheck_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheck_diskgroup_clause(final PlSqlParser.Check_diskgroup_clauseContext ctx) {
    final var methodName = "exitCheck_diskgroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClassification_clause(final PlSqlParser.Classification_clauseContext ctx) {
    final var methodName = "exitClassification_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClassification_item(final PlSqlParser.Classification_itemContext ctx) {
    final var methodName = "exitClassification_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClause_options(final PlSqlParser.Clause_optionsContext ctx) {
    final var methodName = "exitClause_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClose_keystore(final PlSqlParser.Close_keystoreContext ctx) {
    final var methodName = "exitClose_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClose_statement(final PlSqlParser.Close_statementContext ctx) {
    final var methodName = "exitClose_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCluster_clause(final PlSqlParser.Cluster_clauseContext ctx) {
    final var methodName = "exitCluster_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCluster_index_clause(final PlSqlParser.Cluster_index_clauseContext ctx) {
    final var methodName = "exitCluster_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCluster_name(final PlSqlParser.Cluster_nameContext ctx) {
    final var methodName = "exitCluster_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClustering_column_group(final PlSqlParser.Clustering_column_groupContext ctx) {
    final var methodName = "exitClustering_column_group";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClustering_columns(final PlSqlParser.Clustering_columnsContext ctx) {
    final var methodName = "exitClustering_columns";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClustering_join(final PlSqlParser.Clustering_joinContext ctx) {
    final var methodName = "exitClustering_join";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClustering_join_item(final PlSqlParser.Clustering_join_itemContext ctx) {
    final var methodName = "exitClustering_join_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCoalesce_index_partition(final PlSqlParser.Coalesce_index_partitionContext ctx) {
    final var methodName = "exitCoalesce_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCoalesce_table_partition(final PlSqlParser.Coalesce_table_partitionContext ctx) {
    final var methodName = "exitCoalesce_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollation_name(final PlSqlParser.Collation_nameContext ctx) {
    final var methodName = "exitCollation_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollect_order_by_part(final PlSqlParser.Collect_order_by_partContext ctx) {
    final var methodName = "exitCollect_order_by_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollection_expression(final PlSqlParser.Collection_expressionContext ctx) {
    final var methodName = "exitCollection_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollection_item(final PlSqlParser.Collection_itemContext ctx) {
    final var methodName = "exitCollection_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollection_method_call(final PlSqlParser.Collection_method_callContext ctx) {
    final var methodName = "exitCollection_method_call";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollection_name(final PlSqlParser.Collection_nameContext ctx) {
    final var methodName = "exitCollection_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_alias(final PlSqlParser.Column_aliasContext ctx) {
    final var methodName = "exitColumn_alias";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_association(final PlSqlParser.Column_associationContext ctx) {
    final var methodName = "exitColumn_association";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_based_update_set_clause(
      final PlSqlParser.Column_based_update_set_clauseContext ctx) {
    final var methodName = "exitColumn_based_update_set_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_clauses(final PlSqlParser.Column_clausesContext ctx) {
    final var methodName = "exitColumn_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_collation_name(final PlSqlParser.Column_collation_nameContext ctx) {
    final var methodName = "exitColumn_collation_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_definition(final PlSqlParser.Column_definitionContext ctx) {
    final var methodName = "exitColumn_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamTextByClass(PlSqlParserListenerImpl.input, PlSqlParser.Identity_clauseContext.class)
        .forEach(
            intervalText -> {
              if (StringUtils.isNoneBlank(intervalText)) {
                if (StringUtils.upperCase(intervalText, Locale.getDefault())
                        .contains("GENERATED ALWAYS AS IDENTITY")
                    || StringUtils.upperCase(intervalText, Locale.getDefault())
                        .contains("GENERATED BY DEFAULT AS IDENTITY")
                    || StringUtils.upperCase(intervalText, Locale.getDefault())
                        .contains("GENERATED BY DEFAULT ON NULL AS IDENTITY")) {
                  for (final var currentField : currentFieldList) {
                    currentField.put(Field.IDENTITY, NotNullSet.getInstance(Boolean.TRUE));
                  }
                } else {
                  final var intervalTextSplit = intervalText.split(" ", 2);
                  if (1 < intervalTextSplit.length) {
                    final var value = intervalTextSplit[1];
                    if (StringUtils.isNoneBlank(value)) {
                      for (final var currentField : currentFieldList) {
                        currentField.put(
                            StringUtils.lowerCase(intervalTextSplit[0], Locale.getDefault()),
                            NotNullSet.getInstance(value));
                      }
                    }
                  }
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.Inline_constraintContext.class)
        .streamChildrenByClass(PlSqlParser.Constraint_stateContext.class)
        .streamTerminalNodeString()
        .map(StringUtils::lowerCase)
        .forEach(
            terminalNodeText -> {
              if (!StringUtils.equalsIgnoreCase("INITIALLY", terminalNodeText)
                  && !StringUtils.equalsIgnoreCase("IMMEDIATE", terminalNodeText)) {
                for (final var currentField : currentFieldList) {
                  // ENABLE
                  currentField.put(terminalNodeText, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!currentField.get(Field.FIELD_TYPE).get(0).equals(terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    final var nativeDatatypeElementText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PlSqlParser.DatatypeContext.class)
            .streamChildrenByClass(PlSqlParser.Native_datatype_elementContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (StringUtils.isNotBlank(nativeDatatypeElementText)) {
      for (final var currentField : currentFieldList) {
        if (!currentField.containsKey(Field.FIELD_TYPE)) {
          currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(nativeDatatypeElementText));
        } else if (!currentField.get(Field.FIELD_TYPE).get(0).equals(nativeDatatypeElementText)) {
          currentField.put(
              StringUtils.lowerCase(nativeDatatypeElementText, Locale.getDefault()),
              NotNullSet.getInstance(Boolean.TRUE));
        }
      }
    }
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
        .streamChildrenByClass(PlSqlParser.Non_reserved_keywords_pre12cContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!currentField.get(Field.FIELD_TYPE).get(0).equals(terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
        .streamChildrenByClass(PlSqlParser.Non_reserved_keywords_in_12cContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (!currentField.get(Field.FIELD_TYPE).get(0).equals(terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.DatatypeContext.class)
        .streamChildrenByClass(PlSqlParser.Precision_partContext.class)
        .streamTerminalNodeString()
        .map(StringUtils::lowerCase)
        .forEach(
            terminalNodeText -> {
              // [CHAR | VARCHAR2][(maximum_size [CHAR | BYTE])]
              for (final var currentField : currentFieldList) {
                currentField.put(terminalNodeText, NotNullSet.getInstance(Boolean.TRUE));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.DatatypeContext.class)
        .streamChildrenByClass(PlSqlParser.Precision_partContext.class)
        .filter(
            precisionPartContext ->
                precisionPartContext instanceof PlSqlParser.NumericContext
                    || precisionPartContext instanceof PlSqlParser.Numeric_negativeContext)
        .filter(Objects::nonNull)
        .map(parserRuleContext -> ParseTreeHelper.trimToken(parserRuleContext.getText()))
        .forEach(
            parserRuleText -> {
              for (final var currentField : currentFieldList) {
                if (this.newScript || !currentField.containsKey(Field.PRECISION)) {
                  this.newScript = false;
                  if (parserRuleText.contains(".")) {
                    final var terminalNodeSplit = parserRuleText.split("\\.", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else {
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(parserRuleText));
                  }
                } else if (!currentField.containsKey(Field.SCALE)) {
                  currentField.put(Field.SCALE, NotNullSet.getInstance(parserRuleText));
                }
              }
            });
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
    ParseTreeStream.parseTreeStream(ctx)
        .streamTerminalNodeString()
        .map(StringUtils::upperCase)
        .forEach(
            terminalNodeText -> {
              switch (terminalNodeText) {
                case "DEFAULT":
                  {
                    ParseTreeStream.parseTreeStream(ctx)
                        .streamTextByClass(
                            PlSqlParserListenerImpl.input, PlSqlParser.ExpressionContext.class)
                        .map(ParseTreeHelper::trimParentheses)
                        .filter(StringUtils::isNoneBlank)
                        .forEach(
                            intervalText -> {
                              for (final var currentField : currentFieldList) {
                                currentField.put(
                                    StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                                    NotNullSet.getInstance(intervalText));
                              }
                            });
                    break;
                  }
                case "ENCRYPT":
                  {
                    ParseTreeStream.parseTreeStream(ctx)
                        .streamTextByClass(
                            PlSqlParserListenerImpl.input, PlSqlParser.Encryption_specContext.class)
                        .filter(StringUtils::isNoneBlank)
                        .forEach(
                            intervalText -> {
                              for (final var currentField : currentFieldList) {
                                currentField.put(
                                    StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                                    NotNullSet.getInstance(intervalText));
                              }
                            });
                    break;
                  }
                case "INVISIBLE":
                  for (final var currentField : currentFieldList) {
                    currentField.put(Field.VISIBLE, NotNullSet.getInstance(Boolean.FALSE));
                  }
                  break;
                case "VISIBLE":
                  for (final var currentField : currentFieldList) {
                    currentField.put(Field.VISIBLE, NotNullSet.getInstance(Boolean.TRUE));
                  }
                  break;
                default:
                  for (final var currentField : currentFieldList) {
                    currentField.put(
                        StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                        NotNullSet.getInstance(Boolean.TRUE));
                  }
                  break;
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.DatatypeContext.class)
        .streamChildrenByClass(PlSqlParser.Char_set_nameContext.class)
        .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
        .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.CHARSET, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.Column_collation_nameContext.class)
        .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.COLLATION_NAME, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.Column_collation_nameContext.class)
        .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
        .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.COLLATION_NAME, NotNullSet.getInstance(terminalNodeText));
              }
            });
    var primaryKeyText = " ";
    primaryKeyText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PlSqlParser.Inline_constraintContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    primaryKeyText += " ";
    primaryKeyText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PlSqlParser.Inline_constraintContext.class)
            .streamChildrenByClass(PlSqlParser.Check_constraintContext.class)
            .streamChildrenByClass(PlSqlParser.ConditionContext.class)
            .streamChildrenByClass(PlSqlParser.ExpressionContext.class)
            .streamChildrenByClass(PlSqlParser.Logical_expressionContext.class)
            .streamChildrenByClass(PlSqlParser.Unary_logical_expressionContext.class)
            .streamChildrenByClass(PlSqlParser.Unary_logical_operationContext.class)
            .listAllTerminalNodeText()
            .stream()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    primaryKeyText += " ";
    for (final var currentField : currentFieldList) {
      if (primaryKeyText.contains(" PRIMARY KEY ")) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (primaryKeyText.contains(" NOT NULL ")) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
      } else if (primaryKeyText.contains(" NULL ")) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.TRUE));
      }
      if (primaryKeyText.contains(" UNIQUE ")) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    final var timeZoneText =
        " "
            + ParseTreeStream.parseTreeStream(ctx)
                .streamChildrenByClass(PlSqlParser.DatatypeContext.class)
                .streamTerminalNodeString()
                .map(StringUtils::upperCase)
                .collect(Collectors.joining(" "))
            + " ";
    if (timeZoneText.contains(" WITH TIME ZONE ")) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.TIMEZONE, NotNullSet.getInstance(Boolean.TRUE));
      }
    } else if (timeZoneText.contains(" WITH LOCAL TIME ZONE ")) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.TIMEZONE, NotNullSet.getInstance(Boolean.FALSE));
      }
    }

    final var currentRelationship = this.getCurrentRelationship(ctx);
    if (currentRelationship != null) {
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(PlSqlParser.Column_nameContext.class)
          .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
          .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
          .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
          .map(regularIdContext -> ParseTreeHelper.trimToken(regularIdContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              regularIdText -> {
                final Set<String> inheritsList;
                if (currentRelationship.get("column") instanceof Set) {
                  inheritsList = (Set<String>) currentRelationship.get("column");
                } else {
                  inheritsList = new LinkedHashSet<>();
                }
                inheritsList.add(regularIdText);

                currentRelationship.put("column", NotNullSet.getInstance(inheritsList));
              });
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(PlSqlParser.Inline_constraintContext.class)
          .streamChildrenByClass(PlSqlParser.References_clauseContext.class)
          .streamChildrenByClass(PlSqlParser.Tableview_nameContext.class)
          .map(tableviewNameContext -> ParseTreeHelper.trimToken(tableviewNameContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              tableviewNameText -> {
                currentRelationship.put(
                    "foreignTable",
                    NotNullSet.getInstance(ParseTreeHelper.trimToken(tableviewNameText)));
              });
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(PlSqlParser.Inline_constraintContext.class)
          .streamChildrenByClass(PlSqlParser.References_clauseContext.class)
          .streamChildrenByClass(PlSqlParser.Paren_column_listContext.class)
          .streamChildrenByClass(PlSqlParser.Column_listContext.class)
          .streamChildrenByClass(PlSqlParser.Column_nameContext.class)
          .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
          .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
          .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
          .map(regularIdContext -> ParseTreeHelper.trimToken(regularIdContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              regularIdText -> {
                final Set<String> inheritsList;
                if (currentRelationship.get("foreignColumn") instanceof Set) {
                  inheritsList = (Set<String>) currentRelationship.get("foreignColumn");
                } else {
                  inheritsList = new LinkedHashSet<>();
                }
                inheritsList.add(regularIdText);

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
  public void exitColumn_list(final PlSqlParser.Column_listContext ctx) {
    final var methodName = "exitColumn_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_name(final PlSqlParser.Column_nameContext ctx) {
    final var methodName = "exitColumn_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_one_or_more_sub_clause(
      final PlSqlParser.Column_one_or_more_sub_clauseContext ctx) {
    final var methodName = "exitColumn_one_or_more_sub_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_or_attribute(final PlSqlParser.Column_or_attributeContext ctx) {
    final var methodName = "exitColumn_or_attribute";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumn_properties(final PlSqlParser.Column_propertiesContext ctx) {
    final var methodName = "exitColumn_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComment_on_column(final PlSqlParser.Comment_on_columnContext ctx) {
    final var methodName = "exitComment_on_column";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComment_on_materialized(final PlSqlParser.Comment_on_materializedContext ctx) {
    final var methodName = "exitComment_on_materialized";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComment_on_table(final PlSqlParser.Comment_on_tableContext ctx) {
    final var methodName = "exitComment_on_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommit_statement(final PlSqlParser.Commit_statementContext ctx) {
    final var methodName = "exitCommit_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommit_switchover_clause(final PlSqlParser.Commit_switchover_clauseContext ctx) {
    final var methodName = "exitCommit_switchover_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompile_type_clause(final PlSqlParser.Compile_type_clauseContext ctx) {
    final var methodName = "exitCompile_type_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompiler_parameters_clause(
      final PlSqlParser.Compiler_parameters_clauseContext ctx) {
    final var methodName = "exitCompiler_parameters_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComponent_action(final PlSqlParser.Component_actionContext ctx) {
    final var methodName = "exitComponent_action";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComponent_actions(final PlSqlParser.Component_actionsContext ctx) {
    final var methodName = "exitComponent_actions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComposite_hash_partitions(
      final PlSqlParser.Composite_hash_partitionsContext ctx) {
    final var methodName = "exitComposite_hash_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComposite_list_partitions(
      final PlSqlParser.Composite_list_partitionsContext ctx) {
    final var methodName = "exitComposite_list_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComposite_range_partitions(
      final PlSqlParser.Composite_range_partitionsContext ctx) {
    final var methodName = "exitComposite_range_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompound_dml_trigger(final PlSqlParser.Compound_dml_triggerContext ctx) {
    final var methodName = "exitCompound_dml_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompound_expression(final PlSqlParser.Compound_expressionContext ctx) {
    final var methodName = "exitCompound_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompound_trigger_block(final PlSqlParser.Compound_trigger_blockContext ctx) {
    final var methodName = "exitCompound_trigger_block";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompute_clauses(final PlSqlParser.Compute_clausesContext ctx) {
    final var methodName = "exitCompute_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConcatenation(final PlSqlParser.ConcatenationContext ctx) {
    final var methodName = "exitConcatenation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCondition(final PlSqlParser.ConditionContext ctx) {
    final var methodName = "exitCondition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConditional_insert_clause(
      final PlSqlParser.Conditional_insert_clauseContext ctx) {
    final var methodName = "exitConditional_insert_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConditional_insert_else_part(
      final PlSqlParser.Conditional_insert_else_partContext ctx) {
    final var methodName = "exitConditional_insert_else_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConditional_insert_when_part(
      final PlSqlParser.Conditional_insert_when_partContext ctx) {
    final var methodName = "exitConditional_insert_when_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConnection_qualifier(final PlSqlParser.Connection_qualifierContext ctx) {
    final var methodName = "exitConnection_qualifier";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstant(final PlSqlParser.ConstantContext ctx) {
    final var methodName = "exitConstant";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraint_clauses(final PlSqlParser.Constraint_clausesContext ctx) {
    final var methodName = "exitConstraint_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraint_name(final PlSqlParser.Constraint_nameContext ctx) {
    final var methodName = "exitConstraint_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraint_state(final PlSqlParser.Constraint_stateContext ctx) {
    final var methodName = "exitConstraint_state";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstructor_declaration(final PlSqlParser.Constructor_declarationContext ctx) {
    final var methodName = "exitConstructor_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstructor_spec(final PlSqlParser.Constructor_specContext ctx) {
    final var methodName = "exitConstructor_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitContainer_clause(final PlSqlParser.Container_clauseContext ctx) {
    final var methodName = "exitContainer_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitContainer_data_clause(final PlSqlParser.Container_data_clauseContext ctx) {
    final var methodName = "exitContainer_data_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitContainer_names(final PlSqlParser.Container_namesContext ctx) {
    final var methodName = "exitContainer_names";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitContainer_tableview_name(final PlSqlParser.Container_tableview_nameContext ctx) {
    final var methodName = "exitContainer_tableview_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitContinue_statement(final PlSqlParser.Continue_statementContext ctx) {
    final var methodName = "exitContinue_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitControlfile_clauses(final PlSqlParser.Controlfile_clausesContext ctx) {
    final var methodName = "exitControlfile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitControlfile_options(final PlSqlParser.Controlfile_optionsContext ctx) {
    final var methodName = "exitControlfile_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConvert_database_clause(final PlSqlParser.Convert_database_clauseContext ctx) {
    final var methodName = "exitConvert_database_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConvert_redundancy_clause(
      final PlSqlParser.Convert_redundancy_clauseContext ctx) {
    final var methodName = "exitConvert_redundancy_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCost_class_name(final PlSqlParser.Cost_class_nameContext ctx) {
    final var methodName = "exitCost_class_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCost_matrix_clause(final PlSqlParser.Cost_matrix_clauseContext ctx) {
    final var methodName = "exitCost_matrix_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCpu_cost(final PlSqlParser.Cpu_costContext ctx) {
    final var methodName = "exitCpu_cost";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_analytic_view(final PlSqlParser.Create_analytic_viewContext ctx) {
    final var methodName = "exitCreate_analytic_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_attribute_dimension(
      final PlSqlParser.Create_attribute_dimensionContext ctx) {
    final var methodName = "exitCreate_attribute_dimension";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_audit_policy(final PlSqlParser.Create_audit_policyContext ctx) {
    final var methodName = "exitCreate_audit_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_cluster(final PlSqlParser.Create_clusterContext ctx) {
    final var methodName = "exitCreate_cluster";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_context(final PlSqlParser.Create_contextContext ctx) {
    final var methodName = "exitCreate_context";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_controlfile(final PlSqlParser.Create_controlfileContext ctx) {
    final var methodName = "exitCreate_controlfile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_database(final PlSqlParser.Create_databaseContext ctx) {
    final var methodName = "exitCreate_database";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_database_link(final PlSqlParser.Create_database_linkContext ctx) {
    final var methodName = "exitCreate_database_link";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_datafile_clause(final PlSqlParser.Create_datafile_clauseContext ctx) {
    final var methodName = "exitCreate_datafile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_dimension(final PlSqlParser.Create_dimensionContext ctx) {
    final var methodName = "exitCreate_dimension";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_directory(final PlSqlParser.Create_directoryContext ctx) {
    final var methodName = "exitCreate_directory";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_diskgroup(final PlSqlParser.Create_diskgroupContext ctx) {
    final var methodName = "exitCreate_diskgroup";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_edition(final PlSqlParser.Create_editionContext ctx) {
    final var methodName = "exitCreate_edition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_flashback_archive(final PlSqlParser.Create_flashback_archiveContext ctx) {
    final var methodName = "exitCreate_flashback_archive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_function_body(final PlSqlParser.Create_function_bodyContext ctx) {
    final var methodName = "exitCreate_function_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_hierarchy(final PlSqlParser.Create_hierarchyContext ctx) {
    final var methodName = "exitCreate_hierarchy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_index(final PlSqlParser.Create_indexContext ctx) {
    final var methodName = "exitCreate_index";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_inmemory_join_group(
      final PlSqlParser.Create_inmemory_join_groupContext ctx) {
    final var methodName = "exitCreate_inmemory_join_group";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_java(final PlSqlParser.Create_javaContext ctx) {
    final var methodName = "exitCreate_java";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_key(final PlSqlParser.Create_keyContext ctx) {
    final var methodName = "exitCreate_key";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_keystore(final PlSqlParser.Create_keystoreContext ctx) {
    final var methodName = "exitCreate_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_library(final PlSqlParser.Create_libraryContext ctx) {
    final var methodName = "exitCreate_library";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_lockdown_profile(final PlSqlParser.Create_lockdown_profileContext ctx) {
    final var methodName = "exitCreate_lockdown_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_materialized_view(final PlSqlParser.Create_materialized_viewContext ctx) {
    final var methodName = "exitCreate_materialized_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_materialized_view_log(
      final PlSqlParser.Create_materialized_view_logContext ctx) {
    final var methodName = "exitCreate_materialized_view_log";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_materialized_zonemap(
      final PlSqlParser.Create_materialized_zonemapContext ctx) {
    final var methodName = "exitCreate_materialized_zonemap";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_mv_refresh(final PlSqlParser.Create_mv_refreshContext ctx) {
    final var methodName = "exitCreate_mv_refresh";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_operator(final PlSqlParser.Create_operatorContext ctx) {
    final var methodName = "exitCreate_operator";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_outline(final PlSqlParser.Create_outlineContext ctx) {
    final var methodName = "exitCreate_outline";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_package(final PlSqlParser.Create_packageContext ctx) {
    final var methodName = "exitCreate_package";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_package_body(final PlSqlParser.Create_package_bodyContext ctx) {
    final var methodName = "exitCreate_package_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_pmem_filestore(final PlSqlParser.Create_pmem_filestoreContext ctx) {
    final var methodName = "exitCreate_pmem_filestore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_procedure_body(final PlSqlParser.Create_procedure_bodyContext ctx) {
    final var methodName = "exitCreate_procedure_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_profile(final PlSqlParser.Create_profileContext ctx) {
    final var methodName = "exitCreate_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_restore_point(final PlSqlParser.Create_restore_pointContext ctx) {
    final var methodName = "exitCreate_restore_point";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_role(final PlSqlParser.Create_roleContext ctx) {
    final var methodName = "exitCreate_role";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_rollback_segment(final PlSqlParser.Create_rollback_segmentContext ctx) {
    final var methodName = "exitCreate_rollback_segment";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_sequence(final PlSqlParser.Create_sequenceContext ctx) {
    final var methodName = "exitCreate_sequence";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_spfile(final PlSqlParser.Create_spfileContext ctx) {
    final var methodName = "exitCreate_spfile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_synonym(final PlSqlParser.Create_synonymContext ctx) {
    final var methodName = "exitCreate_synonym";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_table(final PlSqlParser.Create_tableContext ctx) {
    final var methodName = "exitCreate_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var terminalNodeList =
        ParseTreeStream.parseTreeStream(ctx)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.toSet());
    if (terminalNodeList.contains("BLOCKCHAIN")) {
      currentTable
          .getAttributes()
          .put(SqlContextImpl.BLOCKCHAIN, NotNullSet.getInstance(Boolean.TRUE));
    }
    if (terminalNodeList.contains("QUEUE")) {
      currentTable.getAttributes().put(SqlContextImpl.QUEUE, NotNullSet.getInstance(Boolean.TRUE));
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
      this.getRootContext().addObject(currentTable);
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_tablespace(final PlSqlParser.Create_tablespaceContext ctx) {
    final var methodName = "exitCreate_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_tablespace_set(final PlSqlParser.Create_tablespace_setContext ctx) {
    final var methodName = "exitCreate_tablespace_set";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_trigger(final PlSqlParser.Create_triggerContext ctx) {
    final var methodName = "exitCreate_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_type(final PlSqlParser.Create_typeContext ctx) {
    final var methodName = "exitCreate_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_user(final PlSqlParser.Create_userContext ctx) {
    final var methodName = "exitCreate_user";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_view(final PlSqlParser.Create_viewContext ctx) {
    final var methodName = "exitCreate_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_zonemap_as_subquery(
      final PlSqlParser.Create_zonemap_as_subqueryContext ctx) {
    final var methodName = "exitCreate_zonemap_as_subquery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreate_zonemap_on_table(final PlSqlParser.Create_zonemap_on_tableContext ctx) {
    final var methodName = "exitCreate_zonemap_on_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCredential_name(final PlSqlParser.Credential_nameContext ctx) {
    final var methodName = "exitCredential_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCursor_declaration(final PlSqlParser.Cursor_declarationContext ctx) {
    final var methodName = "exitCursor_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCursor_expression(final PlSqlParser.Cursor_expressionContext ctx) {
    final var methodName = "exitCursor_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCursor_loop_param(final PlSqlParser.Cursor_loop_paramContext ctx) {
    final var methodName = "exitCursor_loop_param";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCursor_manipulation_statements(
      final PlSqlParser.Cursor_manipulation_statementsContext ctx) {
    final var methodName = "exitCursor_manipulation_statements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCursor_name(final PlSqlParser.Cursor_nameContext ctx) {
    final var methodName = "exitCursor_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCycle_clause(final PlSqlParser.Cycle_clauseContext ctx) {
    final var methodName = "exitCycle_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitData_manipulation_language_statements(
      final PlSqlParser.Data_manipulation_language_statementsContext ctx) {
    final var methodName = "exitData_manipulation_language_statements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatabase(final PlSqlParser.DatabaseContext ctx) {
    final var methodName = "exitDatabase";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatabase_clause(final PlSqlParser.Database_clauseContext ctx) {
    final var methodName = "exitDatabase_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatabase_file_clauses(final PlSqlParser.Database_file_clausesContext ctx) {
    final var methodName = "exitDatabase_file_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatabase_logging_clauses(final PlSqlParser.Database_logging_clausesContext ctx) {
    final var methodName = "exitDatabase_logging_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatabase_logging_sub_clause(
      final PlSqlParser.Database_logging_sub_clauseContext ctx) {
    final var methodName = "exitDatabase_logging_sub_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatabase_name(final PlSqlParser.Database_nameContext ctx) {
    final var methodName = "exitDatabase_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatafile_specification(final PlSqlParser.Datafile_specificationContext ctx) {
    final var methodName = "exitDatafile_specification";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatafile_tempfile_clauses(
      final PlSqlParser.Datafile_tempfile_clausesContext ctx) {
    final var methodName = "exitDatafile_tempfile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatafile_tempfile_spec(final PlSqlParser.Datafile_tempfile_specContext ctx) {
    final var methodName = "exitDatafile_tempfile_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatatype(final PlSqlParser.DatatypeContext ctx) {
    final var methodName = "exitDatatype";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatatype_null_enable(final PlSqlParser.Datatype_null_enableContext ctx) {
    final var methodName = "exitDatatype_null_enable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatetime_expr(final PlSqlParser.Datetime_exprContext ctx) {
    final var methodName = "exitDatetime_expr";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDb_name(final PlSqlParser.Db_nameContext ctx) {
    final var methodName = "exitDb_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeallocate_unused_clause(final PlSqlParser.Deallocate_unused_clauseContext ctx) {
    final var methodName = "exitDeallocate_unused_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeclare_spec(final PlSqlParser.Declare_specContext ctx) {
    final var methodName = "exitDeclare_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_aggregate_clause(final PlSqlParser.Default_aggregate_clauseContext ctx) {
    final var methodName = "exitDefault_aggregate_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_collation_clause(final PlSqlParser.Default_collation_clauseContext ctx) {
    final var methodName = "exitDefault_collation_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_cost_clause(final PlSqlParser.Default_cost_clauseContext ctx) {
    final var methodName = "exitDefault_cost_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_index_compression(
      final PlSqlParser.Default_index_compressionContext ctx) {
    final var methodName = "exitDefault_index_compression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_measure_clause(final PlSqlParser.Default_measure_clauseContext ctx) {
    final var methodName = "exitDefault_measure_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_selectivity(final PlSqlParser.Default_selectivityContext ctx) {
    final var methodName = "exitDefault_selectivity";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_selectivity_clause(
      final PlSqlParser.Default_selectivity_clauseContext ctx) {
    final var methodName = "exitDefault_selectivity_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_settings_clause(final PlSqlParser.Default_settings_clauseContext ctx) {
    final var methodName = "exitDefault_settings_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_table_compression(
      final PlSqlParser.Default_table_compressionContext ctx) {
    final var methodName = "exitDefault_table_compression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_tablespace(final PlSqlParser.Default_tablespaceContext ctx) {
    final var methodName = "exitDefault_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_tablespace_params(
      final PlSqlParser.Default_tablespace_paramsContext ctx) {
    final var methodName = "exitDefault_tablespace_params";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_temp_tablespace(final PlSqlParser.Default_temp_tablespaceContext ctx) {
    final var methodName = "exitDefault_temp_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefault_value_part(final PlSqlParser.Default_value_partContext ctx) {
    final var methodName = "exitDefault_value_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeferred_segment_creation(
      final PlSqlParser.Deferred_segment_creationContext ctx) {
    final var methodName = "exitDeferred_segment_creation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDelete_secret(final PlSqlParser.Delete_secretContext ctx) {
    final var methodName = "exitDelete_secret";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDelete_secret_seps(final PlSqlParser.Delete_secret_sepsContext ctx) {
    final var methodName = "exitDelete_secret_seps";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDelete_statement(final PlSqlParser.Delete_statementContext ctx) {
    final var methodName = "exitDelete_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDependent_exceptions_part(
      final PlSqlParser.Dependent_exceptions_partContext ctx) {
    final var methodName = "exitDependent_exceptions_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDependent_handling_clause(
      final PlSqlParser.Dependent_handling_clauseContext ctx) {
    final var methodName = "exitDependent_handling_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescription_clause(final PlSqlParser.Description_clauseContext ctx) {
    final var methodName = "exitDescription_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDim_by_clause(final PlSqlParser.Dim_by_clauseContext ctx) {
    final var methodName = "exitDim_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDim_key(final PlSqlParser.Dim_keyContext ctx) {
    final var methodName = "exitDim_key";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDim_order_clause(final PlSqlParser.Dim_order_clauseContext ctx) {
    final var methodName = "exitDim_order_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDim_ref(final PlSqlParser.Dim_refContext ctx) {
    final var methodName = "exitDim_ref";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDimension_join_clause(final PlSqlParser.Dimension_join_clauseContext ctx) {
    final var methodName = "exitDimension_join_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDir_name(final PlSqlParser.Dir_nameContext ctx) {
    final var methodName = "exitDir_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDir_object_name(final PlSqlParser.Dir_object_nameContext ctx) {
    final var methodName = "exitDir_object_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDirectory_name(final PlSqlParser.Directory_nameContext ctx) {
    final var methodName = "exitDirectory_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDirectory_path(final PlSqlParser.Directory_pathContext ctx) {
    final var methodName = "exitDirectory_path";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDisable_constraint(final PlSqlParser.Disable_constraintContext ctx) {
    final var methodName = "exitDisable_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDisable_enable(final PlSqlParser.Disable_enableContext ctx) {
    final var methodName = "exitDisable_enable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDisassociate_statistics(final PlSqlParser.Disassociate_statisticsContext ctx) {
    final var methodName = "exitDisassociate_statistics";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDisk_offline_clause(final PlSqlParser.Disk_offline_clauseContext ctx) {
    final var methodName = "exitDisk_offline_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDisk_online_clause(final PlSqlParser.Disk_online_clauseContext ctx) {
    final var methodName = "exitDisk_online_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDisk_region_clause(final PlSqlParser.Disk_region_clauseContext ctx) {
    final var methodName = "exitDisk_region_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDiskgroup_alias_clauses(final PlSqlParser.Diskgroup_alias_clausesContext ctx) {
    final var methodName = "exitDiskgroup_alias_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDiskgroup_attributes(final PlSqlParser.Diskgroup_attributesContext ctx) {
    final var methodName = "exitDiskgroup_attributes";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDiskgroup_availability(final PlSqlParser.Diskgroup_availabilityContext ctx) {
    final var methodName = "exitDiskgroup_availability";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDiskgroup_directory_clauses(
      final PlSqlParser.Diskgroup_directory_clausesContext ctx) {
    final var methodName = "exitDiskgroup_directory_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDiskgroup_template_clauses(
      final PlSqlParser.Diskgroup_template_clausesContext ctx) {
    final var methodName = "exitDiskgroup_template_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDiskgroup_volume_clauses(final PlSqlParser.Diskgroup_volume_clausesContext ctx) {
    final var methodName = "exitDiskgroup_volume_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDml_event_clause(final PlSqlParser.Dml_event_clauseContext ctx) {
    final var methodName = "exitDml_event_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDml_event_element(final PlSqlParser.Dml_event_elementContext ctx) {
    final var methodName = "exitDml_event_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDml_event_nested_clause(final PlSqlParser.Dml_event_nested_clauseContext ctx) {
    final var methodName = "exitDml_event_nested_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDml_table_expression_clause(
      final PlSqlParser.Dml_table_expression_clauseContext ctx) {
    final var methodName = "exitDml_table_expression_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDomain(final PlSqlParser.DomainContext ctx) {
    final var methodName = "exitDomain";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDomain_index_clause(final PlSqlParser.Domain_index_clauseContext ctx) {
    final var methodName = "exitDomain_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_analytic_view(final PlSqlParser.Drop_analytic_viewContext ctx) {
    final var methodName = "exitDrop_analytic_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_attribute_dimension(final PlSqlParser.Drop_attribute_dimensionContext ctx) {
    final var methodName = "exitDrop_attribute_dimension";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_audit_policy(final PlSqlParser.Drop_audit_policyContext ctx) {
    final var methodName = "exitDrop_audit_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_binding_clause(final PlSqlParser.Drop_binding_clauseContext ctx) {
    final var methodName = "exitDrop_binding_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_cluster(final PlSqlParser.Drop_clusterContext ctx) {
    final var methodName = "exitDrop_cluster";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_column_clause(final PlSqlParser.Drop_column_clauseContext ctx) {
    final var methodName = "exitDrop_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_constraint(final PlSqlParser.Drop_constraintContext ctx) {
    final var methodName = "exitDrop_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_constraint_clause(final PlSqlParser.Drop_constraint_clauseContext ctx) {
    final var methodName = "exitDrop_constraint_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_context(final PlSqlParser.Drop_contextContext ctx) {
    final var methodName = "exitDrop_context";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_database(final PlSqlParser.Drop_databaseContext ctx) {
    final var methodName = "exitDrop_database";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_database_link(final PlSqlParser.Drop_database_linkContext ctx) {
    final var methodName = "exitDrop_database_link";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_directory(final PlSqlParser.Drop_directoryContext ctx) {
    final var methodName = "exitDrop_directory";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_disk_clause(final PlSqlParser.Drop_disk_clauseContext ctx) {
    final var methodName = "exitDrop_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_diskgroup(final PlSqlParser.Drop_diskgroupContext ctx) {
    final var methodName = "exitDrop_diskgroup";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_diskgroup_file_clause(
      final PlSqlParser.Drop_diskgroup_file_clauseContext ctx) {
    final var methodName = "exitDrop_diskgroup_file_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_edition(final PlSqlParser.Drop_editionContext ctx) {
    final var methodName = "exitDrop_edition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_filegroup_clause(final PlSqlParser.Drop_filegroup_clauseContext ctx) {
    final var methodName = "exitDrop_filegroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_flashback_archive(final PlSqlParser.Drop_flashback_archiveContext ctx) {
    final var methodName = "exitDrop_flashback_archive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_function(final PlSqlParser.Drop_functionContext ctx) {
    final var methodName = "exitDrop_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_hierarchy(final PlSqlParser.Drop_hierarchyContext ctx) {
    final var methodName = "exitDrop_hierarchy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_index(final PlSqlParser.Drop_indexContext ctx) {
    final var methodName = "exitDrop_index";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_index_partition(final PlSqlParser.Drop_index_partitionContext ctx) {
    final var methodName = "exitDrop_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_indextype(final PlSqlParser.Drop_indextypeContext ctx) {
    final var methodName = "exitDrop_indextype";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_inmemory_join_group(final PlSqlParser.Drop_inmemory_join_groupContext ctx) {
    final var methodName = "exitDrop_inmemory_join_group";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_java(final PlSqlParser.Drop_javaContext ctx) {
    final var methodName = "exitDrop_java";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_library(final PlSqlParser.Drop_libraryContext ctx) {
    final var methodName = "exitDrop_library";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_lockdown_profile(final PlSqlParser.Drop_lockdown_profileContext ctx) {
    final var methodName = "exitDrop_lockdown_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_logfile_clauses(final PlSqlParser.Drop_logfile_clausesContext ctx) {
    final var methodName = "exitDrop_logfile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_materialized_view(final PlSqlParser.Drop_materialized_viewContext ctx) {
    final var methodName = "exitDrop_materialized_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_materialized_zonemap(
      final PlSqlParser.Drop_materialized_zonemapContext ctx) {
    final var methodName = "exitDrop_materialized_zonemap";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_mirror_clause(final PlSqlParser.Drop_mirror_clauseContext ctx) {
    final var methodName = "exitDrop_mirror_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_operator(final PlSqlParser.Drop_operatorContext ctx) {
    final var methodName = "exitDrop_operator";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_outline(final PlSqlParser.Drop_outlineContext ctx) {
    final var methodName = "exitDrop_outline";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_package(final PlSqlParser.Drop_packageContext ctx) {
    final var methodName = "exitDrop_package";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_pmem_filestore(final PlSqlParser.Drop_pmem_filestoreContext ctx) {
    final var methodName = "exitDrop_pmem_filestore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_procedure(final PlSqlParser.Drop_procedureContext ctx) {
    final var methodName = "exitDrop_procedure";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_restore_point(final PlSqlParser.Drop_restore_pointContext ctx) {
    final var methodName = "exitDrop_restore_point";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_role(final PlSqlParser.Drop_roleContext ctx) {
    final var methodName = "exitDrop_role";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_rollback_segment(final PlSqlParser.Drop_rollback_segmentContext ctx) {
    final var methodName = "exitDrop_rollback_segment";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_sequence(final PlSqlParser.Drop_sequenceContext ctx) {
    final var methodName = "exitDrop_sequence";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_synonym(final PlSqlParser.Drop_synonymContext ctx) {
    final var methodName = "exitDrop_synonym";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_table(final PlSqlParser.Drop_tableContext ctx) {
    final var methodName = "exitDrop_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_table_partition(final PlSqlParser.Drop_table_partitionContext ctx) {
    final var methodName = "exitDrop_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_tablespace(final PlSqlParser.Drop_tablespaceContext ctx) {
    final var methodName = "exitDrop_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_tablespace_set(final PlSqlParser.Drop_tablespace_setContext ctx) {
    final var methodName = "exitDrop_tablespace_set";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_trigger(final PlSqlParser.Drop_triggerContext ctx) {
    final var methodName = "exitDrop_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_type(final PlSqlParser.Drop_typeContext ctx) {
    final var methodName = "exitDrop_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_user(final PlSqlParser.Drop_userContext ctx) {
    final var methodName = "exitDrop_user";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDrop_view(final PlSqlParser.Drop_viewContext ctx) {
    final var methodName = "exitDrop_view";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDynamic_base_profile(final PlSqlParser.Dynamic_base_profileContext ctx) {
    final var methodName = "exitDynamic_base_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDynamic_returning_clause(final PlSqlParser.Dynamic_returning_clauseContext ctx) {
    final var methodName = "exitDynamic_returning_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEdition_name(final PlSqlParser.Edition_nameContext ctx) {
    final var methodName = "exitEdition_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEditioning_clause(final PlSqlParser.Editioning_clauseContext ctx) {
    final var methodName = "exitEditioning_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitElement(final PlSqlParser.ElementContext ctx) {
    final var methodName = "exitElement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitElement_spec(final PlSqlParser.Element_specContext ctx) {
    final var methodName = "exitElement_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitElement_spec_options(final PlSqlParser.Element_spec_optionsContext ctx) {
    final var methodName = "exitElement_spec_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitElse_part(final PlSqlParser.Else_partContext ctx) {
    final var methodName = "exitElse_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitElsif_part(final PlSqlParser.Elsif_partContext ctx) {
    final var methodName = "exitElsif_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnable_constraint(final PlSqlParser.Enable_constraintContext ctx) {
    final var methodName = "exitEnable_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnable_disable_clause(final PlSqlParser.Enable_disable_clauseContext ctx) {
    final var methodName = "exitEnable_disable_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnable_disable_volume(final PlSqlParser.Enable_disable_volumeContext ctx) {
    final var methodName = "exitEnable_disable_volume";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnable_or_disable(final PlSqlParser.Enable_or_disableContext ctx) {
    final var methodName = "exitEnable_or_disable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnable_pluggable_database(
      final PlSqlParser.Enable_pluggable_databaseContext ctx) {
    final var methodName = "exitEnable_pluggable_database";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEncryption_spec(final PlSqlParser.Encryption_specContext ctx) {
    final var methodName = "exitEncryption_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnd_time_column(final PlSqlParser.End_time_columnContext ctx) {
    final var methodName = "exitEnd_time_column";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEquijoin_condition(final PlSqlParser.Equijoin_conditionContext ctx) {
    final var methodName = "exitEquijoin_condition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitError_directive(final PlSqlParser.Error_directiveContext ctx) {
    final var methodName = "exitError_directive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitError_logging_clause(final PlSqlParser.Error_logging_clauseContext ctx) {
    final var methodName = "exitError_logging_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitError_logging_into_part(final PlSqlParser.Error_logging_into_partContext ctx) {
    final var methodName = "exitError_logging_into_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitError_logging_reject_part(
      final PlSqlParser.Error_logging_reject_partContext ctx) {
    final var methodName = "exitError_logging_reject_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEvaluation_edition_clause(
      final PlSqlParser.Evaluation_edition_clauseContext ctx) {
    final var methodName = "exitEvaluation_edition_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    final var methodName = "exitEveryRule";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitException_declaration(final PlSqlParser.Exception_declarationContext ctx) {
    final var methodName = "exitException_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitException_handler(final PlSqlParser.Exception_handlerContext ctx) {
    final var methodName = "exitException_handler";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitException_name(final PlSqlParser.Exception_nameContext ctx) {
    final var methodName = "exitException_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExceptions_clause(final PlSqlParser.Exceptions_clauseContext ctx) {
    final var methodName = "exitExceptions_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExchange_table_partition(final PlSqlParser.Exchange_table_partitionContext ctx) {
    final var methodName = "exitExchange_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecute_immediate(final PlSqlParser.Execute_immediateContext ctx) {
    final var methodName = "exitExecute_immediate";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExit_statement(final PlSqlParser.Exit_statementContext ctx) {
    final var methodName = "exitExit_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplain_statement(final PlSqlParser.Explain_statementContext ctx) {
    final var methodName = "exitExplain_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExport_keys(final PlSqlParser.Export_keysContext ctx) {
    final var methodName = "exitExport_keys";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpression(final PlSqlParser.ExpressionContext ctx) {
    final var methodName = "exitExpression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressions(final PlSqlParser.ExpressionsContext ctx) {
    final var methodName = "exitExpressions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExtended_attribute_clause(
      final PlSqlParser.Extended_attribute_clauseContext ctx) {
    final var methodName = "exitExtended_attribute_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExtent_management_clause(final PlSqlParser.Extent_management_clauseContext ctx) {
    final var methodName = "exitExtent_management_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExternal_table_clause(final PlSqlParser.External_table_clauseContext ctx) {
    final var methodName = "exitExternal_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExternal_table_data_props(
      final PlSqlParser.External_table_data_propsContext ctx) {
    final var methodName = "exitExternal_table_data_props";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFact_columns_clause(final PlSqlParser.Fact_columns_clauseContext ctx) {
    final var methodName = "exitFact_columns_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFetch_clause(final PlSqlParser.Fetch_clauseContext ctx) {
    final var methodName = "exitFetch_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFetch_statement(final PlSqlParser.Fetch_statementContext ctx) {
    final var methodName = "exitFetch_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitField_spec(final PlSqlParser.Field_specContext ctx) {
    final var methodName = "exitField_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFile_name_convert(final PlSqlParser.File_name_convertContext ctx) {
    final var methodName = "exitFile_name_convert";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFile_owner_clause(final PlSqlParser.File_owner_clauseContext ctx) {
    final var methodName = "exitFile_owner_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFile_path(final PlSqlParser.File_pathContext ctx) {
    final var methodName = "exitFile_path";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFile_permissions_clause(final PlSqlParser.File_permissions_clauseContext ctx) {
    final var methodName = "exitFile_permissions_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFile_specification(final PlSqlParser.File_specificationContext ctx) {
    final var methodName = "exitFile_specification";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFilegroup_clauses(final PlSqlParser.Filegroup_clausesContext ctx) {
    final var methodName = "exitFilegroup_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFilename(final PlSqlParser.FilenameContext ctx) {
    final var methodName = "exitFilename";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFilename_convert_sub_clause(
      final PlSqlParser.Filename_convert_sub_clauseContext ctx) {
    final var methodName = "exitFilename_convert_sub_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFilenumber(final PlSqlParser.FilenumberContext ctx) {
    final var methodName = "exitFilenumber";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFilter_clause(final PlSqlParser.Filter_clauseContext ctx) {
    final var methodName = "exitFilter_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFilter_clauses(final PlSqlParser.Filter_clausesContext ctx) {
    final var methodName = "exitFilter_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlashback_archive_clause(final PlSqlParser.Flashback_archive_clauseContext ctx) {
    final var methodName = "exitFlashback_archive_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlashback_archive_quota(final PlSqlParser.Flashback_archive_quotaContext ctx) {
    final var methodName = "exitFlashback_archive_quota";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlashback_archive_retention(
      final PlSqlParser.Flashback_archive_retentionContext ctx) {
    final var methodName = "exitFlashback_archive_retention";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlashback_mode_clause(final PlSqlParser.Flashback_mode_clauseContext ctx) {
    final var methodName = "exitFlashback_mode_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlashback_query_clause(final PlSqlParser.Flashback_query_clauseContext ctx) {
    final var methodName = "exitFlashback_query_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlashback_table(final PlSqlParser.Flashback_tableContext ctx) {
    final var methodName = "exitFlashback_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFor_clause(final PlSqlParser.For_clauseContext ctx) {
    final var methodName = "exitFor_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFor_each_row(final PlSqlParser.For_each_rowContext ctx) {
    final var methodName = "exitFor_each_row";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFor_update_clause(final PlSqlParser.For_update_clauseContext ctx) {
    final var methodName = "exitFor_update_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFor_update_of_part(final PlSqlParser.For_update_of_partContext ctx) {
    final var methodName = "exitFor_update_of_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFor_update_options(final PlSqlParser.For_update_optionsContext ctx) {
    final var methodName = "exitFor_update_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForall_statement(final PlSqlParser.Forall_statementContext ctx) {
    final var methodName = "exitForall_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForce_keystore(final PlSqlParser.Force_keystoreContext ctx) {
    final var methodName = "exitForce_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForce_noforce(final PlSqlParser.Force_noforceContext ctx) {
    final var methodName = "exitForce_noforce";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForeign_key_clause(final PlSqlParser.Foreign_key_clauseContext ctx) {
    final var methodName = "exitForeign_key_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrom_clause(final PlSqlParser.From_clauseContext ctx) {
    final var methodName = "exitFrom_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFull_database_recovery(final PlSqlParser.Full_database_recoveryContext ctx) {
    final var methodName = "exitFull_database_recovery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunc_decl_in_type(final PlSqlParser.Func_decl_in_typeContext ctx) {
    final var methodName = "exitFunc_decl_in_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_argument(final PlSqlParser.Function_argumentContext ctx) {
    final var methodName = "exitFunction_argument";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_argument_analytic(
      final PlSqlParser.Function_argument_analyticContext ctx) {
    final var methodName = "exitFunction_argument_analytic";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_argument_modeling(
      final PlSqlParser.Function_argument_modelingContext ctx) {
    final var methodName = "exitFunction_argument_modeling";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_association(final PlSqlParser.Function_associationContext ctx) {
    final var methodName = "exitFunction_association";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_body(final PlSqlParser.Function_bodyContext ctx) {
    final var methodName = "exitFunction_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_name(final PlSqlParser.Function_nameContext ctx) {
    final var methodName = "exitFunction_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_spec(final PlSqlParser.Function_specContext ctx) {
    final var methodName = "exitFunction_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneral_element(final PlSqlParser.General_elementContext ctx) {
    final var methodName = "exitGeneral_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneral_element_part(final PlSqlParser.General_element_partContext ctx) {
    final var methodName = "exitGeneral_element_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneral_recovery(final PlSqlParser.General_recoveryContext ctx) {
    final var methodName = "exitGeneral_recovery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneral_table_ref(final PlSqlParser.General_table_refContext ctx) {
    final var methodName = "exitGeneral_table_ref";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGlobal_partitioned_index(final PlSqlParser.Global_partitioned_indexContext ctx) {
    final var methodName = "exitGlobal_partitioned_index";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGoto_statement(final PlSqlParser.Goto_statementContext ctx) {
    final var methodName = "exitGoto_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrant_object_name(final PlSqlParser.Grant_object_nameContext ctx) {
    final var methodName = "exitGrant_object_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrant_statement(final PlSqlParser.Grant_statementContext ctx) {
    final var methodName = "exitGrant_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantee_name(final PlSqlParser.Grantee_nameContext ctx) {
    final var methodName = "exitGrantee_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroup_by_clause(final PlSqlParser.Group_by_clauseContext ctx) {
    final var methodName = "exitGroup_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroup_by_elements(final PlSqlParser.Group_by_elementsContext ctx) {
    final var methodName = "exitGroup_by_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroup_redo_logfile(final PlSqlParser.Group_redo_logfileContext ctx) {
    final var methodName = "exitGroup_redo_logfile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrouping_sets_clause(final PlSqlParser.Grouping_sets_clauseContext ctx) {
    final var methodName = "exitGrouping_sets_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrouping_sets_elements(final PlSqlParser.Grouping_sets_elementsContext ctx) {
    final var methodName = "exitGrouping_sets_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHash_partition_quantity(final PlSqlParser.Hash_partition_quantityContext ctx) {
    final var methodName = "exitHash_partition_quantity";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHash_partitions(final PlSqlParser.Hash_partitionsContext ctx) {
    final var methodName = "exitHash_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHash_partitions_by_quantity(
      final PlSqlParser.Hash_partitions_by_quantityContext ctx) {
    final var methodName = "exitHash_partitions_by_quantity";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHash_subpartition_quantity(
      final PlSqlParser.Hash_subpartition_quantityContext ctx) {
    final var methodName = "exitHash_subpartition_quantity";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHash_subparts_by_quantity(
      final PlSqlParser.Hash_subparts_by_quantityContext ctx) {
    final var methodName = "exitHash_subparts_by_quantity";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHaving_clause(final PlSqlParser.Having_clauseContext ctx) {
    final var methodName = "exitHaving_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHeap_org_table_clause(final PlSqlParser.Heap_org_table_clauseContext ctx) {
    final var methodName = "exitHeap_org_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHier_attr_clause(final PlSqlParser.Hier_attr_clauseContext ctx) {
    final var methodName = "exitHier_attr_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHier_attr_name(final PlSqlParser.Hier_attr_nameContext ctx) {
    final var methodName = "exitHier_attr_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHier_attrs_clause(final PlSqlParser.Hier_attrs_clauseContext ctx) {
    final var methodName = "exitHier_attrs_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHier_ref(final PlSqlParser.Hier_refContext ctx) {
    final var methodName = "exitHier_ref";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHier_using_clause(final PlSqlParser.Hier_using_clauseContext ctx) {
    final var methodName = "exitHier_using_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHierarchical_query_clause(
      final PlSqlParser.Hierarchical_query_clauseContext ctx) {
    final var methodName = "exitHierarchical_query_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHierarchies_clause(final PlSqlParser.Hierarchies_clauseContext ctx) {
    final var methodName = "exitHierarchies_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHierarchy_clause(final PlSqlParser.Hierarchy_clauseContext ctx) {
    final var methodName = "exitHierarchy_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitId_expression(final PlSqlParser.Id_expressionContext ctx) {
    final var methodName = "exitId_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIdentified_by(final PlSqlParser.Identified_byContext ctx) {
    final var methodName = "exitIdentified_by";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIdentified_by_password_clause(
      final PlSqlParser.Identified_by_password_clauseContext ctx) {
    final var methodName = "exitIdentified_by_password_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIdentified_by_store(final PlSqlParser.Identified_by_storeContext ctx) {
    final var methodName = "exitIdentified_by_store";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIdentified_other_clause(final PlSqlParser.Identified_other_clauseContext ctx) {
    final var methodName = "exitIdentified_other_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIdentifier(final PlSqlParser.IdentifierContext ctx) {
    final var methodName = "exitIdentifier";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIdentity_clause(final PlSqlParser.Identity_clauseContext ctx) {
    final var methodName = "exitIdentity_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIdentity_options(final PlSqlParser.Identity_optionsContext ctx) {
    final var methodName = "exitIdentity_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIdentity_options_parentheses(
      final PlSqlParser.Identity_options_parenthesesContext ctx) {
    final var methodName = "exitIdentity_options_parentheses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIf_statement(final PlSqlParser.If_statementContext ctx) {
    final var methodName = "exitIf_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIlm_after_on(final PlSqlParser.Ilm_after_onContext ctx) {
    final var methodName = "exitIlm_after_on";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIlm_clause(final PlSqlParser.Ilm_clauseContext ctx) {
    final var methodName = "exitIlm_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIlm_compression_policy(final PlSqlParser.Ilm_compression_policyContext ctx) {
    final var methodName = "exitIlm_compression_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIlm_inmemory_policy(final PlSqlParser.Ilm_inmemory_policyContext ctx) {
    final var methodName = "exitIlm_inmemory_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIlm_policy_clause(final PlSqlParser.Ilm_policy_clauseContext ctx) {
    final var methodName = "exitIlm_policy_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIlm_tiering_policy(final PlSqlParser.Ilm_tiering_policyContext ctx) {
    final var methodName = "exitIlm_tiering_policy";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIlm_time_period(final PlSqlParser.Ilm_time_periodContext ctx) {
    final var methodName = "exitIlm_time_period";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImmutable_table_clauses(final PlSqlParser.Immutable_table_clausesContext ctx) {
    final var methodName = "exitImmutable_table_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImmutable_table_no_delete_clause(
      final PlSqlParser.Immutable_table_no_delete_clauseContext ctx) {
    final var methodName = "exitImmutable_table_no_delete_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImmutable_table_no_drop_clause(
      final PlSqlParser.Immutable_table_no_drop_clauseContext ctx) {
    final var methodName = "exitImmutable_table_no_drop_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImplementation_clause(final PlSqlParser.Implementation_clauseContext ctx) {
    final var methodName = "exitImplementation_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImplementation_type_name(final PlSqlParser.Implementation_type_nameContext ctx) {
    final var methodName = "exitImplementation_type_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImplicit_cursor_expression(
      final PlSqlParser.Implicit_cursor_expressionContext ctx) {
    final var methodName = "exitImplicit_cursor_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImport_keys(final PlSqlParser.Import_keysContext ctx) {
    final var methodName = "exitImport_keys";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIn_elements(final PlSqlParser.In_elementsContext ctx) {
    final var methodName = "exitIn_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIncluding_contents_clause(
      final PlSqlParser.Including_contents_clauseContext ctx) {
    final var methodName = "exitIncluding_contents_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIncluding_or_excluding(final PlSqlParser.Including_or_excludingContext ctx) {
    final var methodName = "exitIncluding_or_excluding";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_attributes(final PlSqlParser.Index_attributesContext ctx) {
    final var methodName = "exitIndex_attributes";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_expr(final PlSqlParser.Index_exprContext ctx) {
    final var methodName = "exitIndex_expr";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_name(final PlSqlParser.Index_nameContext ctx) {
    final var methodName = "exitIndex_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_org_overflow_clause(
      final PlSqlParser.Index_org_overflow_clauseContext ctx) {
    final var methodName = "exitIndex_org_overflow_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_org_table_clause(final PlSqlParser.Index_org_table_clauseContext ctx) {
    final var methodName = "exitIndex_org_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_partition_description(
      final PlSqlParser.Index_partition_descriptionContext ctx) {
    final var methodName = "exitIndex_partition_description";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_partitioning_clause(
      final PlSqlParser.Index_partitioning_clauseContext ctx) {
    final var methodName = "exitIndex_partitioning_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_partitioning_values_list(
      final PlSqlParser.Index_partitioning_values_listContext ctx) {
    final var methodName = "exitIndex_partitioning_values_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_properties(final PlSqlParser.Index_propertiesContext ctx) {
    final var methodName = "exitIndex_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_subpartition_clause(
      final PlSqlParser.Index_subpartition_clauseContext ctx) {
    final var methodName = "exitIndex_subpartition_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndex_subpartition_subclause(
      final PlSqlParser.Index_subpartition_subclauseContext ctx) {
    final var methodName = "exitIndex_subpartition_subclause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexing_clause(final PlSqlParser.Indexing_clauseContext ctx) {
    final var methodName = "exitIndexing_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndextype(final PlSqlParser.IndextypeContext ctx) {
    final var methodName = "exitIndextype";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndextype_name(final PlSqlParser.Indextype_nameContext ctx) {
    final var methodName = "exitIndextype_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndividual_hash_partitions(
      final PlSqlParser.Individual_hash_partitionsContext ctx) {
    final var methodName = "exitIndividual_hash_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndividual_hash_subparts(final PlSqlParser.Individual_hash_subpartsContext ctx) {
    final var methodName = "exitIndividual_hash_subparts";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInline_constraint(final PlSqlParser.Inline_constraintContext ctx) {
    final var methodName = "exitInline_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInline_ref_constraint(final PlSqlParser.Inline_ref_constraintContext ctx) {
    final var methodName = "exitInline_ref_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInmemory_attributes(final PlSqlParser.Inmemory_attributesContext ctx) {
    final var methodName = "exitInmemory_attributes";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInmemory_column_clause(final PlSqlParser.Inmemory_column_clauseContext ctx) {
    final var methodName = "exitInmemory_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInmemory_distribute(final PlSqlParser.Inmemory_distributeContext ctx) {
    final var methodName = "exitInmemory_distribute";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInmemory_duplicate(final PlSqlParser.Inmemory_duplicateContext ctx) {
    final var methodName = "exitInmemory_duplicate";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInmemory_memcompress(final PlSqlParser.Inmemory_memcompressContext ctx) {
    final var methodName = "exitInmemory_memcompress";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInmemory_priority(final PlSqlParser.Inmemory_priorityContext ctx) {
    final var methodName = "exitInmemory_priority";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInmemory_table_clause(final PlSqlParser.Inmemory_table_clauseContext ctx) {
    final var methodName = "exitInmemory_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInmmemory_clause(final PlSqlParser.Inmmemory_clauseContext ctx) {
    final var methodName = "exitInmmemory_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInquiry_directive(final PlSqlParser.Inquiry_directiveContext ctx) {
    final var methodName = "exitInquiry_directive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsert_into_clause(final PlSqlParser.Insert_into_clauseContext ctx) {
    final var methodName = "exitInsert_into_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsert_statement(final PlSqlParser.Insert_statementContext ctx) {
    final var methodName = "exitInsert_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInstance_clauses(final PlSqlParser.Instance_clausesContext ctx) {
    final var methodName = "exitInstance_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInterval_expr(final PlSqlParser.Interval_exprContext ctx) {
    final var methodName = "exitInterval_expr";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInterval_expression(final PlSqlParser.Interval_expressionContext ctx) {
    final var methodName = "exitInterval_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInto_clause(final PlSqlParser.Into_clauseContext ctx) {
    final var methodName = "exitInto_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInto_clause1(final PlSqlParser.Into_clause1Context ctx) {
    final var methodName = "exitInto_clause1";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInvoker_rights_clause(final PlSqlParser.Invoker_rights_clauseContext ctx) {
    final var methodName = "exitInvoker_rights_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIo_cost(final PlSqlParser.Io_costContext ctx) {
    final var methodName = "exitIo_cost";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIsolate_keystore(final PlSqlParser.Isolate_keystoreContext ctx) {
    final var methodName = "exitIsolate_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJava_spec(final PlSqlParser.Java_specContext ctx) {
    final var methodName = "exitJava_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_clause(final PlSqlParser.Join_clauseContext ctx) {
    final var methodName = "exitJoin_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_condition(final PlSqlParser.Join_conditionContext ctx) {
    final var methodName = "exitJoin_condition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_condition_item(final PlSqlParser.Join_condition_itemContext ctx) {
    final var methodName = "exitJoin_condition_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_on_part(final PlSqlParser.Join_on_partContext ctx) {
    final var methodName = "exitJoin_on_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_path_clause(final PlSqlParser.Join_path_clauseContext ctx) {
    final var methodName = "exitJoin_path_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoin_using_part(final PlSqlParser.Join_using_partContext ctx) {
    final var methodName = "exitJoin_using_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_array_element(final PlSqlParser.Json_array_elementContext ctx) {
    final var methodName = "exitJson_array_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_column_clause(final PlSqlParser.Json_column_clauseContext ctx) {
    final var methodName = "exitJson_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_column_definition(final PlSqlParser.Json_column_definitionContext ctx) {
    final var methodName = "exitJson_column_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_function(final PlSqlParser.Json_functionContext ctx) {
    final var methodName = "exitJson_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_object_content(final PlSqlParser.Json_object_contentContext ctx) {
    final var methodName = "exitJson_object_content";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_object_entry(final PlSqlParser.Json_object_entryContext ctx) {
    final var methodName = "exitJson_object_entry";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_on_null_clause(final PlSqlParser.Json_on_null_clauseContext ctx) {
    final var methodName = "exitJson_on_null_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_query_on_empty_clause(
      final PlSqlParser.Json_query_on_empty_clauseContext ctx) {
    final var methodName = "exitJson_query_on_empty_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_query_on_error_clause(
      final PlSqlParser.Json_query_on_error_clauseContext ctx) {
    final var methodName = "exitJson_query_on_error_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_query_return_type(final PlSqlParser.Json_query_return_typeContext ctx) {
    final var methodName = "exitJson_query_return_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_query_returning_clause(
      final PlSqlParser.Json_query_returning_clauseContext ctx) {
    final var methodName = "exitJson_query_returning_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_query_wrapper_clause(
      final PlSqlParser.Json_query_wrapper_clauseContext ctx) {
    final var methodName = "exitJson_query_wrapper_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_return_clause(final PlSqlParser.Json_return_clauseContext ctx) {
    final var methodName = "exitJson_return_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_table_clause(final PlSqlParser.Json_table_clauseContext ctx) {
    final var methodName = "exitJson_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_transform_op(final PlSqlParser.Json_transform_opContext ctx) {
    final var methodName = "exitJson_transform_op";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_value_on_mismatch_clause(
      final PlSqlParser.Json_value_on_mismatch_clauseContext ctx) {
    final var methodName = "exitJson_value_on_mismatch_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_value_return_clause(final PlSqlParser.Json_value_return_clauseContext ctx) {
    final var methodName = "exitJson_value_return_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJson_value_return_type(final PlSqlParser.Json_value_return_typeContext ctx) {
    final var methodName = "exitJson_value_return_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKeep_clause(final PlSqlParser.Keep_clauseContext ctx) {
    final var methodName = "exitKeep_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKey_clause(final PlSqlParser.Key_clauseContext ctx) {
    final var methodName = "exitKey_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKey_compression(final PlSqlParser.Key_compressionContext ctx) {
    final var methodName = "exitKey_compression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKey_management_clauses(final PlSqlParser.Key_management_clausesContext ctx) {
    final var methodName = "exitKey_management_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKeystore_management_clauses(
      final PlSqlParser.Keystore_management_clausesContext ctx) {
    final var methodName = "exitKeystore_management_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKeystore_password(final PlSqlParser.Keystore_passwordContext ctx) {
    final var methodName = "exitKeystore_password";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLabel_declaration(final PlSqlParser.Label_declarationContext ctx) {
    final var methodName = "exitLabel_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLabel_name(final PlSqlParser.Label_nameContext ctx) {
    final var methodName = "exitLabel_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLanguage(final PlSqlParser.LanguageContext ctx) {
    final var methodName = "exitLanguage";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLead_cdb_clause(final PlSqlParser.Lead_cdb_clauseContext ctx) {
    final var methodName = "exitLead_cdb_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLead_cdb_uri_clause(final PlSqlParser.Lead_cdb_uri_clauseContext ctx) {
    final var methodName = "exitLead_cdb_uri_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevel_clause(final PlSqlParser.Level_clauseContext ctx) {
    final var methodName = "exitLevel_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevel_group_type(final PlSqlParser.Level_group_typeContext ctx) {
    final var methodName = "exitLevel_group_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevel_hier_clause(final PlSqlParser.Level_hier_clauseContext ctx) {
    final var methodName = "exitLevel_hier_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevel_specification(final PlSqlParser.Level_specificationContext ctx) {
    final var methodName = "exitLevel_specification";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevels_clause(final PlSqlParser.Levels_clauseContext ctx) {
    final var methodName = "exitLevels_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevels_item(final PlSqlParser.Levels_itemContext ctx) {
    final var methodName = "exitLevels_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLibrary_debug(final PlSqlParser.Library_debugContext ctx) {
    final var methodName = "exitLibrary_debug";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLibrary_editionable(final PlSqlParser.Library_editionableContext ctx) {
    final var methodName = "exitLibrary_editionable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLibrary_name(final PlSqlParser.Library_nameContext ctx) {
    final var methodName = "exitLibrary_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLink_authentication(final PlSqlParser.Link_authenticationContext ctx) {
    final var methodName = "exitLink_authentication";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLink_name(final PlSqlParser.Link_nameContext ctx) {
    final var methodName = "exitLink_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitList_partition_desc(final PlSqlParser.List_partition_descContext ctx) {
    final var methodName = "exitList_partition_desc";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitList_partitions(final PlSqlParser.List_partitionsContext ctx) {
    final var methodName = "exitList_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitList_subpartition_desc(final PlSqlParser.List_subpartition_descContext ctx) {
    final var methodName = "exitList_subpartition_desc";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitList_values_clause(final PlSqlParser.List_values_clauseContext ctx) {
    final var methodName = "exitList_values_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitListagg_overflow_clause(final PlSqlParser.Listagg_overflow_clauseContext ctx) {
    final var methodName = "exitListagg_overflow_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLiteral(final PlSqlParser.LiteralContext ctx) {
    final var methodName = "exitLiteral";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLob_compression_clause(final PlSqlParser.Lob_compression_clauseContext ctx) {
    final var methodName = "exitLob_compression_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLob_deduplicate_clause(final PlSqlParser.Lob_deduplicate_clauseContext ctx) {
    final var methodName = "exitLob_deduplicate_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLob_item(final PlSqlParser.Lob_itemContext ctx) {
    final var methodName = "exitLob_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLob_parameters(final PlSqlParser.Lob_parametersContext ctx) {
    final var methodName = "exitLob_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLob_partition_storage(final PlSqlParser.Lob_partition_storageContext ctx) {
    final var methodName = "exitLob_partition_storage";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLob_partitioning_storage(final PlSqlParser.Lob_partitioning_storageContext ctx) {
    final var methodName = "exitLob_partitioning_storage";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLob_retention_clause(final PlSqlParser.Lob_retention_clauseContext ctx) {
    final var methodName = "exitLob_retention_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLob_segname(final PlSqlParser.Lob_segnameContext ctx) {
    final var methodName = "exitLob_segname";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLob_storage_clause(final PlSqlParser.Lob_storage_clauseContext ctx) {
    final var methodName = "exitLob_storage_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLob_storage_parameters(final PlSqlParser.Lob_storage_parametersContext ctx) {
    final var methodName = "exitLob_storage_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLocal_domain_index_clause(
      final PlSqlParser.Local_domain_index_clauseContext ctx) {
    final var methodName = "exitLocal_domain_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLocal_link_name(final PlSqlParser.Local_link_nameContext ctx) {
    final var methodName = "exitLocal_link_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLocal_partitioned_index(final PlSqlParser.Local_partitioned_indexContext ctx) {
    final var methodName = "exitLocal_partitioned_index";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLocal_xmlindex_clause(final PlSqlParser.Local_xmlindex_clauseContext ctx) {
    final var methodName = "exitLocal_xmlindex_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLock_mode(final PlSqlParser.Lock_modeContext ctx) {
    final var methodName = "exitLock_mode";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLock_table_element(final PlSqlParser.Lock_table_elementContext ctx) {
    final var methodName = "exitLock_table_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLock_table_statement(final PlSqlParser.Lock_table_statementContext ctx) {
    final var methodName = "exitLock_table_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockdown_feature(final PlSqlParser.Lockdown_featureContext ctx) {
    final var methodName = "exitLockdown_feature";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockdown_options(final PlSqlParser.Lockdown_optionsContext ctx) {
    final var methodName = "exitLockdown_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockdown_statements(final PlSqlParser.Lockdown_statementsContext ctx) {
    final var methodName = "exitLockdown_statements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLog_grp(final PlSqlParser.Log_grpContext ctx) {
    final var methodName = "exitLog_grp";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLogfile_clause(final PlSqlParser.Logfile_clauseContext ctx) {
    final var methodName = "exitLogfile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLogfile_clauses(final PlSqlParser.Logfile_clausesContext ctx) {
    final var methodName = "exitLogfile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLogfile_descriptor(final PlSqlParser.Logfile_descriptorContext ctx) {
    final var methodName = "exitLogfile_descriptor";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLogging_clause(final PlSqlParser.Logging_clauseContext ctx) {
    final var methodName = "exitLogging_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLogical_expression(final PlSqlParser.Logical_expressionContext ctx) {
    final var methodName = "exitLogical_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLogical_operation(final PlSqlParser.Logical_operationContext ctx) {
    final var methodName = "exitLogical_operation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLogical_replication_clause(
      final PlSqlParser.Logical_replication_clauseContext ctx) {
    final var methodName = "exitLogical_replication_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoop_statement(final PlSqlParser.Loop_statementContext ctx) {
    final var methodName = "exitLoop_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLost_write_protection(final PlSqlParser.Lost_write_protectionContext ctx) {
    final var methodName = "exitLost_write_protection";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLow_high(final PlSqlParser.Low_highContext ctx) {
    final var methodName = "exitLow_high";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLower_bound(final PlSqlParser.Lower_boundContext ctx) {
    final var methodName = "exitLower_bound";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMain_model(final PlSqlParser.Main_modelContext ctx) {
    final var methodName = "exitMain_model";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMain_model_name(final PlSqlParser.Main_model_nameContext ctx) {
    final var methodName = "exitMain_model_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitManaged_standby_recovery(final PlSqlParser.Managed_standby_recoveryContext ctx) {
    final var methodName = "exitManaged_standby_recovery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMap_order_func_declaration(
      final PlSqlParser.Map_order_func_declarationContext ctx) {
    final var methodName = "exitMap_order_func_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMap_order_function_spec(final PlSqlParser.Map_order_function_specContext ctx) {
    final var methodName = "exitMap_order_function_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMapping_table_clause(final PlSqlParser.Mapping_table_clauseContext ctx) {
    final var methodName = "exitMapping_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMatch_string(final PlSqlParser.Match_stringContext ctx) {
    final var methodName = "exitMatch_string";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMaximize_standby_db_clause(
      final PlSqlParser.Maximize_standby_db_clauseContext ctx) {
    final var methodName = "exitMaximize_standby_db_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMaxsize_clause(final PlSqlParser.Maxsize_clauseContext ctx) {
    final var methodName = "exitMaxsize_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMeas_aggregate_clause(final PlSqlParser.Meas_aggregate_clauseContext ctx) {
    final var methodName = "exitMeas_aggregate_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMeasure_list(final PlSqlParser.Measure_listContext ctx) {
    final var methodName = "exitMeasure_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMeasures_clause(final PlSqlParser.Measures_clauseContext ctx) {
    final var methodName = "exitMeasures_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMemoptimize_read_write_clause(
      final PlSqlParser.Memoptimize_read_write_clauseContext ctx) {
    final var methodName = "exitMemoptimize_read_write_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_element(final PlSqlParser.Merge_elementContext ctx) {
    final var methodName = "exitMerge_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_insert_clause(final PlSqlParser.Merge_insert_clauseContext ctx) {
    final var methodName = "exitMerge_insert_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_into_existing_keystore(
      final PlSqlParser.Merge_into_existing_keystoreContext ctx) {
    final var methodName = "exitMerge_into_existing_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_into_new_keystore(final PlSqlParser.Merge_into_new_keystoreContext ctx) {
    final var methodName = "exitMerge_into_new_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_statement(final PlSqlParser.Merge_statementContext ctx) {
    final var methodName = "exitMerge_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_table_partition(final PlSqlParser.Merge_table_partitionContext ctx) {
    final var methodName = "exitMerge_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_update_clause(final PlSqlParser.Merge_update_clauseContext ctx) {
    final var methodName = "exitMerge_update_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMerge_update_delete_part(final PlSqlParser.Merge_update_delete_partContext ctx) {
    final var methodName = "exitMerge_update_delete_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMigrate_keys(final PlSqlParser.Migrate_keysContext ctx) {
    final var methodName = "exitMigrate_keys";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMk(final PlSqlParser.MkContext ctx) {
    final var methodName = "exitMk";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMkid(final PlSqlParser.MkidContext ctx) {
    final var methodName = "exitMkid";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_clause(final PlSqlParser.Model_clauseContext ctx) {
    final var methodName = "exitModel_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_column(final PlSqlParser.Model_columnContext ctx) {
    final var methodName = "exitModel_column";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_column_clauses(final PlSqlParser.Model_column_clausesContext ctx) {
    final var methodName = "exitModel_column_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_column_list(final PlSqlParser.Model_column_listContext ctx) {
    final var methodName = "exitModel_column_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_column_partition_part(
      final PlSqlParser.Model_column_partition_partContext ctx) {
    final var methodName = "exitModel_column_partition_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_expression(final PlSqlParser.Model_expressionContext ctx) {
    final var methodName = "exitModel_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_expression_element(final PlSqlParser.Model_expression_elementContext ctx) {
    final var methodName = "exitModel_expression_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_iterate_clause(final PlSqlParser.Model_iterate_clauseContext ctx) {
    final var methodName = "exitModel_iterate_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_name(final PlSqlParser.Model_nameContext ctx) {
    final var methodName = "exitModel_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_rules_clause(final PlSqlParser.Model_rules_clauseContext ctx) {
    final var methodName = "exitModel_rules_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_rules_element(final PlSqlParser.Model_rules_elementContext ctx) {
    final var methodName = "exitModel_rules_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModel_rules_part(final PlSqlParser.Model_rules_partContext ctx) {
    final var methodName = "exitModel_rules_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModifier_clause(final PlSqlParser.Modifier_clauseContext ctx) {
    final var methodName = "exitModifier_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_col_properties(final PlSqlParser.Modify_col_propertiesContext ctx) {
    final var methodName = "exitModify_col_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_col_substitutable(final PlSqlParser.Modify_col_substitutableContext ctx) {
    final var methodName = "exitModify_col_substitutable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_col_visibility(final PlSqlParser.Modify_col_visibilityContext ctx) {
    final var methodName = "exitModify_col_visibility";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_collection_retrieval(
      final PlSqlParser.Modify_collection_retrievalContext ctx) {
    final var methodName = "exitModify_collection_retrieval";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_column_clauses(final PlSqlParser.Modify_column_clausesContext ctx) {
    final var methodName = "exitModify_column_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_diskgroup_file(final PlSqlParser.Modify_diskgroup_fileContext ctx) {
    final var methodName = "exitModify_diskgroup_file";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_filegroup_clause(final PlSqlParser.Modify_filegroup_clauseContext ctx) {
    final var methodName = "exitModify_filegroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_index_default_attrs(
      final PlSqlParser.Modify_index_default_attrsContext ctx) {
    final var methodName = "exitModify_index_default_attrs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_index_partition(final PlSqlParser.Modify_index_partitionContext ctx) {
    final var methodName = "exitModify_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_index_partitions_ops(
      final PlSqlParser.Modify_index_partitions_opsContext ctx) {
    final var methodName = "exitModify_index_partitions_ops";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_index_subpartition(
      final PlSqlParser.Modify_index_subpartitionContext ctx) {
    final var methodName = "exitModify_index_subpartition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_lob_parameters(final PlSqlParser.Modify_lob_parametersContext ctx) {
    final var methodName = "exitModify_lob_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_lob_storage_clause(
      final PlSqlParser.Modify_lob_storage_clauseContext ctx) {
    final var methodName = "exitModify_lob_storage_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_mv_column_clause(final PlSqlParser.Modify_mv_column_clauseContext ctx) {
    final var methodName = "exitModify_mv_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_table_partition(final PlSqlParser.Modify_table_partitionContext ctx) {
    final var methodName = "exitModify_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModify_volume_clause(final PlSqlParser.Modify_volume_clauseContext ctx) {
    final var methodName = "exitModify_volume_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMonitoring_nomonitoring(final PlSqlParser.Monitoring_nomonitoringContext ctx) {
    final var methodName = "exitMonitoring_nomonitoring";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMove_datafile_clause(final PlSqlParser.Move_datafile_clauseContext ctx) {
    final var methodName = "exitMove_datafile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMove_keys(final PlSqlParser.Move_keysContext ctx) {
    final var methodName = "exitMove_keys";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMove_mv_log_clause(final PlSqlParser.Move_mv_log_clauseContext ctx) {
    final var methodName = "exitMove_mv_log_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMove_table_clause(final PlSqlParser.Move_table_clauseContext ctx) {
    final var methodName = "exitMove_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMove_to_filegroup_clause(final PlSqlParser.Move_to_filegroup_clauseContext ctx) {
    final var methodName = "exitMove_to_filegroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMulti_column_for_loop(final PlSqlParser.Multi_column_for_loopContext ctx) {
    final var methodName = "exitMulti_column_for_loop";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMulti_table_element(final PlSqlParser.Multi_table_elementContext ctx) {
    final var methodName = "exitMulti_table_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMulti_table_insert(final PlSqlParser.Multi_table_insertContext ctx) {
    final var methodName = "exitMulti_table_insert";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMultiset_expression(final PlSqlParser.Multiset_expressionContext ctx) {
    final var methodName = "exitMultiset_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMv_column_alias(final PlSqlParser.Mv_column_aliasContext ctx) {
    final var methodName = "exitMv_column_alias";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMv_log_augmentation(final PlSqlParser.Mv_log_augmentationContext ctx) {
    final var methodName = "exitMv_log_augmentation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMv_log_purge_clause(final PlSqlParser.Mv_log_purge_clauseContext ctx) {
    final var methodName = "exitMv_log_purge_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNative_datatype_element(final PlSqlParser.Native_datatype_elementContext ctx) {
    final var methodName = "exitNative_datatype_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNested_item(final PlSqlParser.Nested_itemContext ctx) {
    final var methodName = "exitNested_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNested_table_col_properties(
      final PlSqlParser.Nested_table_col_propertiesContext ctx) {
    final var methodName = "exitNested_table_col_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNested_table_type_def(final PlSqlParser.Nested_table_type_defContext ctx) {
    final var methodName = "exitNested_table_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNetwork_cost(final PlSqlParser.Network_costContext ctx) {
    final var methodName = "exitNetwork_cost";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNew_column_name(final PlSqlParser.New_column_nameContext ctx) {
    final var methodName = "exitNew_column_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNew_constraint_name(final PlSqlParser.New_constraint_nameContext ctx) {
    final var methodName = "exitNew_constraint_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNew_index_name(final PlSqlParser.New_index_nameContext ctx) {
    final var methodName = "exitNew_index_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNew_partition_name(final PlSqlParser.New_partition_nameContext ctx) {
    final var methodName = "exitNew_partition_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNew_tablespace_name(final PlSqlParser.New_tablespace_nameContext ctx) {
    final var methodName = "exitNew_tablespace_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNew_values_clause(final PlSqlParser.New_values_clauseContext ctx) {
    final var methodName = "exitNew_values_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNoaudit_statement(final PlSqlParser.Noaudit_statementContext ctx) {
    final var methodName = "exitNoaudit_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNon_dml_event(final PlSqlParser.Non_dml_eventContext ctx) {
    final var methodName = "exitNon_dml_event";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNon_dml_trigger(final PlSqlParser.Non_dml_triggerContext ctx) {
    final var methodName = "exitNon_dml_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNon_reserved_keywords_in_12c(
      final PlSqlParser.Non_reserved_keywords_in_12cContext ctx) {
    final var methodName = "exitNon_reserved_keywords_in_12c";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNon_reserved_keywords_in_18c(
      final PlSqlParser.Non_reserved_keywords_in_18cContext ctx) {
    final var methodName = "exitNon_reserved_keywords_in_18c";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNon_reserved_keywords_pre12c(
      final PlSqlParser.Non_reserved_keywords_pre12cContext ctx) {
    final var methodName = "exitNon_reserved_keywords_pre12c";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNull_statement(final PlSqlParser.Null_statementContext ctx) {
    final var methodName = "exitNull_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNumeric(final PlSqlParser.NumericContext ctx) {
    final var methodName = "exitNumeric";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNumeric_function(final PlSqlParser.Numeric_functionContext ctx) {
    final var methodName = "exitNumeric_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNumeric_function_name(final PlSqlParser.Numeric_function_nameContext ctx) {
    final var methodName = "exitNumeric_function_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNumeric_function_wrapper(final PlSqlParser.Numeric_function_wrapperContext ctx) {
    final var methodName = "exitNumeric_function_wrapper";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNumeric_negative(final PlSqlParser.Numeric_negativeContext ctx) {
    final var methodName = "exitNumeric_negative";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_action(final PlSqlParser.Object_actionContext ctx) {
    final var methodName = "exitObject_action";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_as_part(final PlSqlParser.Object_as_partContext ctx) {
    final var methodName = "exitObject_as_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_member_spec(final PlSqlParser.Object_member_specContext ctx) {
    final var methodName = "exitObject_member_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_name(final PlSqlParser.Object_nameContext ctx) {
    final var methodName = "exitObject_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_privilege(final PlSqlParser.Object_privilegeContext ctx) {
    final var methodName = "exitObject_privilege";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_properties(final PlSqlParser.Object_propertiesContext ctx) {
    final var methodName = "exitObject_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_table(final PlSqlParser.Object_tableContext ctx) {
    final var methodName = "exitObject_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_table_substitution(
      final PlSqlParser.Object_table_substitutionContext ctx) {
    final var methodName = "exitObject_table_substitution";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_type(final PlSqlParser.Object_typeContext ctx) {
    final var methodName = "exitObject_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_type_col_properties(
      final PlSqlParser.Object_type_col_propertiesContext ctx) {
    final var methodName = "exitObject_type_col_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_type_def(final PlSqlParser.Object_type_defContext ctx) {
    final var methodName = "exitObject_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_under_part(final PlSqlParser.Object_under_partContext ctx) {
    final var methodName = "exitObject_under_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitObject_view_clause(final PlSqlParser.Object_view_clauseContext ctx) {
    final var methodName = "exitObject_view_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOdci_parameters(final PlSqlParser.Odci_parametersContext ctx) {
    final var methodName = "exitOdci_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOffset_clause(final PlSqlParser.Offset_clauseContext ctx) {
    final var methodName = "exitOffset_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOid_clause(final PlSqlParser.Oid_clauseContext ctx) {
    final var methodName = "exitOid_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOid_index_clause(final PlSqlParser.Oid_index_clauseContext ctx) {
    final var methodName = "exitOid_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOld_column_name(final PlSqlParser.Old_column_nameContext ctx) {
    final var methodName = "exitOld_column_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOld_constraint_name(final PlSqlParser.Old_constraint_nameContext ctx) {
    final var methodName = "exitOld_constraint_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_comp_partitioned_clause(
      final PlSqlParser.On_comp_partitioned_clauseContext ctx) {
    final var methodName = "exitOn_comp_partitioned_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_comp_partitioned_table(
      final PlSqlParser.On_comp_partitioned_tableContext ctx) {
    final var methodName = "exitOn_comp_partitioned_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_delete_clause(final PlSqlParser.On_delete_clauseContext ctx) {
    final var methodName = "exitOn_delete_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_hash_partitioned_clause(
      final PlSqlParser.On_hash_partitioned_clauseContext ctx) {
    final var methodName = "exitOn_hash_partitioned_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_hash_partitioned_table(
      final PlSqlParser.On_hash_partitioned_tableContext ctx) {
    final var methodName = "exitOn_hash_partitioned_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_list_partitioned_table(
      final PlSqlParser.On_list_partitioned_tableContext ctx) {
    final var methodName = "exitOn_list_partitioned_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_object_clause(final PlSqlParser.On_object_clauseContext ctx) {
    final var methodName = "exitOn_object_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOn_range_partitioned_table(
      final PlSqlParser.On_range_partitioned_tableContext ctx) {
    final var methodName = "exitOn_range_partitioned_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOnline_or_offline(final PlSqlParser.Online_or_offlineContext ctx) {
    final var methodName = "exitOnline_or_offline";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpaque_format_spec(final PlSqlParser.Opaque_format_specContext ctx) {
    final var methodName = "exitOpaque_format_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpen_for_statement(final PlSqlParser.Open_for_statementContext ctx) {
    final var methodName = "exitOpen_for_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpen_keystore(final PlSqlParser.Open_keystoreContext ctx) {
    final var methodName = "exitOpen_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpen_statement(final PlSqlParser.Open_statementContext ctx) {
    final var methodName = "exitOpen_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOperator_context_clause(final PlSqlParser.Operator_context_clauseContext ctx) {
    final var methodName = "exitOperator_context_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOperator_function_name(final PlSqlParser.Operator_function_nameContext ctx) {
    final var methodName = "exitOperator_function_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOperator_name(final PlSqlParser.Operator_nameContext ctx) {
    final var methodName = "exitOperator_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOption_values(final PlSqlParser.Option_valuesContext ctx) {
    final var methodName = "exitOption_values";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOracle_namespace(final PlSqlParser.Oracle_namespaceContext ctx) {
    final var methodName = "exitOracle_namespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_by_clause(final PlSqlParser.Order_by_clauseContext ctx) {
    final var methodName = "exitOrder_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrder_by_elements(final PlSqlParser.Order_by_elementsContext ctx) {
    final var methodName = "exitOrder_by_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOther_function(final PlSqlParser.Other_functionContext ctx) {
    final var methodName = "exitOther_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOut_of_line_constraint(final PlSqlParser.Out_of_line_constraintContext ctx) {
    final var methodName = "exitOut_of_line_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var fieldType =
        ParseTreeStream.parseTreeStream(ctx)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.toSet());
    fieldType.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PlSqlParser.Constraint_stateContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.toSet()));
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.Column_nameContext.class)
        .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
        .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
        .filter(TerminalNode.class::isInstance)
        .forEach(
            terminalNode -> {
              final var field = ParseTreeHelper.getField(currentTable, terminalNode);
              if (field != null) {
                if (fieldType.contains("PRIMARY")) {
                  if (!field.containsKey(Field.PRIMARY)) {
                    field.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
                  }
                } else if (fieldType.contains("UNIQUE") && !field.containsKey(Field.UNIQUE)) {
                  field.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
                } else if (fieldType.contains("NOT")
                    && fieldType.contains("NULL")
                    && !field.containsKey(Field.NULLABLE)) {
                  field.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
                }
                if (fieldType.contains("DEFERRABLE") && !field.containsKey(Field.DEFERRABLE)) {
                  field.put(Field.DEFERRABLE, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.Column_nameContext.class)
        .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
        .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
        .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
        .filter(TerminalNode.class::isInstance)
        .forEach(
            terminalNode -> {
              final var field = ParseTreeHelper.getField(currentTable, terminalNode);
              if (field != null) {
                if (fieldType.contains("PRIMARY")) {
                  if (!field.containsKey(Field.PRIMARY)) {
                    field.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
                  }
                } else if (fieldType.contains("UNIQUE") && !field.containsKey(Field.UNIQUE)) {
                  field.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
                } else if (fieldType.contains("NOT")
                    && fieldType.contains("NULL")
                    && !field.containsKey(Field.NULLABLE)) {
                  field.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
                }
                if (fieldType.contains("DEFERRABLE") && !field.containsKey(Field.DEFERRABLE)) {
                  field.put(Field.DEFERRABLE, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(PlSqlParser.Column_nameContext.class)
        .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
        .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
        .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
        .streamChildrenByClass(PlSqlParser.Non_reserved_keywords_pre12cContext.class)
        .filter(TerminalNode.class::isInstance)
        .forEach(
            terminalNode -> {
              final var field = ParseTreeHelper.getField(currentTable, terminalNode);
              if (field != null) {
                if (fieldType.contains("PRIMARY")) {
                  if (!field.containsKey(Field.PRIMARY)) {
                    field.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
                  }
                } else if (fieldType.contains("UNIQUE") && !field.containsKey(Field.UNIQUE)) {
                  field.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
                } else if (fieldType.contains("NOT")
                    && fieldType.contains("NULL")
                    && !field.containsKey(Field.NULLABLE)) {
                  field.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
                }
                if (fieldType.contains("DEFERRABLE") && !field.containsKey(Field.DEFERRABLE)) {
                  field.put(Field.DEFERRABLE, NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });

    final var foreignText =
        new StringBuilder()
            .append(
                ParseTreeStream.parseTreeStream(ctx)
                    .streamChildrenByClass(PlSqlParser.Foreign_key_clauseContext.class)
                    .streamTerminalNodeString()
                    .map(StringUtils::upperCase)
                    .collect(Collectors.joining(" ")));
    if (foreignText.toString().contains("FOREIGN KEY")) {
      final var currentRelationship = this.getCurrentRelationship(ctx);
      if (currentRelationship != null) {
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PlSqlParser.Foreign_key_clauseContext.class)
            .streamChildrenByClass(PlSqlParser.References_clauseContext.class)
            .streamChildrenByClass(PlSqlParser.Tableview_nameContext.class)
            .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
            .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
            .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
            .streamTerminalNodeString()
            .forEach(
                terminalNodeText -> {
                  currentRelationship.put("foreignTable", NotNullSet.getInstance(terminalNodeText));
                });
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(PlSqlParser.Foreign_key_clauseContext.class)
            .streamChildrenByClass(PlSqlParser.References_clauseContext.class)
            .streamChildrenByClass(PlSqlParser.Paren_column_listContext.class)
            .streamChildrenByClass(PlSqlParser.Column_listContext.class)
            .streamChildrenByClass(PlSqlParser.Column_nameContext.class)
            .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
            .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
            .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
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
            .streamChildrenByClass(PlSqlParser.Foreign_key_clauseContext.class)
            .streamChildrenByClass(PlSqlParser.Paren_column_listContext.class)
            .streamChildrenByClass(PlSqlParser.Column_listContext.class)
            .streamChildrenByClass(PlSqlParser.Column_nameContext.class)
            .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
            .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
            .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
            .map(regularIdContext -> ParseTreeHelper.trimToken(regularIdContext.getText()))
            .filter(StringUtils::isNoneBlank)
            .forEach(
                regularIdText -> {
                  final Set<String> inheritsList;
                  if (currentRelationship.get("column") instanceof Set) {
                    inheritsList = (Set<String>) currentRelationship.get("column");
                  } else {
                    inheritsList = new LinkedHashSet<>();
                  }
                  inheritsList.add(regularIdText);

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
  public void exitOut_of_line_part_storage(final PlSqlParser.Out_of_line_part_storageContext ctx) {
    final var methodName = "exitOut_of_line_part_storage";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOut_of_line_ref_constraint(
      final PlSqlParser.Out_of_line_ref_constraintContext ctx) {
    final var methodName = "exitOut_of_line_ref_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOuter_join_sign(final PlSqlParser.Outer_join_signContext ctx) {
    final var methodName = "exitOuter_join_sign";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOuter_join_type(final PlSqlParser.Outer_join_typeContext ctx) {
    final var methodName = "exitOuter_join_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOutline_options(final PlSqlParser.Outline_optionsContext ctx) {
    final var methodName = "exitOutline_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOver_clause(final PlSqlParser.Over_clauseContext ctx) {
    final var methodName = "exitOver_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOver_clause_keyword(final PlSqlParser.Over_clause_keywordContext ctx) {
    final var methodName = "exitOver_clause_keyword";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOverriding_function_spec(final PlSqlParser.Overriding_function_specContext ctx) {
    final var methodName = "exitOverriding_function_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOverriding_subprogram_spec(
      final PlSqlParser.Overriding_subprogram_specContext ctx) {
    final var methodName = "exitOverriding_subprogram_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPackage_name(final PlSqlParser.Package_nameContext ctx) {
    final var methodName = "exitPackage_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPackage_obj_body(final PlSqlParser.Package_obj_bodyContext ctx) {
    final var methodName = "exitPackage_obj_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPackage_obj_spec(final PlSqlParser.Package_obj_specContext ctx) {
    final var methodName = "exitPackage_obj_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParallel_clause(final PlSqlParser.Parallel_clauseContext ctx) {
    final var methodName = "exitParallel_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParallel_enable_clause(final PlSqlParser.Parallel_enable_clauseContext ctx) {
    final var methodName = "exitParallel_enable_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParameter(final PlSqlParser.ParameterContext ctx) {
    final var methodName = "exitParameter";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParameter_name(final PlSqlParser.Parameter_nameContext ctx) {
    final var methodName = "exitParameter_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParameter_spec(final PlSqlParser.Parameter_specContext ctx) {
    final var methodName = "exitParameter_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParameter_value(final PlSqlParser.Parameter_valueContext ctx) {
    final var methodName = "exitParameter_value";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParen_column_list(final PlSqlParser.Paren_column_listContext ctx) {
    final var methodName = "exitParen_column_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartial_database_recovery(
      final PlSqlParser.Partial_database_recoveryContext ctx) {
    final var methodName = "exitPartial_database_recovery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartial_database_recovery_10g(
      final PlSqlParser.Partial_database_recovery_10gContext ctx) {
    final var methodName = "exitPartial_database_recovery_10g";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_by_clause(final PlSqlParser.Partition_by_clauseContext ctx) {
    final var methodName = "exitPartition_by_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_extended_names(final PlSqlParser.Partition_extended_namesContext ctx) {
    final var methodName = "exitPartition_extended_names";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_extension_clause(
      final PlSqlParser.Partition_extension_clauseContext ctx) {
    final var methodName = "exitPartition_extension_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_extention_clause(
      final PlSqlParser.Partition_extention_clauseContext ctx) {
    final var methodName = "exitPartition_extention_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_key_value(final PlSqlParser.Partition_key_valueContext ctx) {
    final var methodName = "exitPartition_key_value";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_name(final PlSqlParser.Partition_nameContext ctx) {
    final var methodName = "exitPartition_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartition_name_old(final PlSqlParser.Partition_name_oldContext ctx) {
    final var methodName = "exitPartition_name_old";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitioned_table(final PlSqlParser.Partitioned_tableContext ctx) {
    final var methodName = "exitPartitioned_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitioning_storage_clause(
      final PlSqlParser.Partitioning_storage_clauseContext ctx) {
    final var methodName = "exitPartitioning_storage_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPassword_expire_clause(final PlSqlParser.Password_expire_clauseContext ctx) {
    final var methodName = "exitPassword_expire_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPassword_parameters(final PlSqlParser.Password_parametersContext ctx) {
    final var methodName = "exitPassword_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPassword_value(final PlSqlParser.Password_valueContext ctx) {
    final var methodName = "exitPassword_value";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPath(final PlSqlParser.PathContext ctx) {
    final var methodName = "exitPath";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPeriod_definition(final PlSqlParser.Period_definitionContext ctx) {
    final var methodName = "exitPeriod_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPermanent_tablespace_attrs(
      final PlSqlParser.Permanent_tablespace_attrsContext ctx) {
    final var methodName = "exitPermanent_tablespace_attrs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPermanent_tablespace_clause(
      final PlSqlParser.Permanent_tablespace_clauseContext ctx) {
    final var methodName = "exitPermanent_tablespace_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPfile_name(final PlSqlParser.Pfile_nameContext ctx) {
    final var methodName = "exitPfile_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPhase(final PlSqlParser.PhaseContext ctx) {
    final var methodName = "exitPhase";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPhysical_attributes_clause(
      final PlSqlParser.Physical_attributes_clauseContext ctx) {
    final var methodName = "exitPhysical_attributes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPhysical_properties(final PlSqlParser.Physical_propertiesContext ctx) {
    final var methodName = "exitPhysical_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPipe_row_statement(final PlSqlParser.Pipe_row_statementContext ctx) {
    final var methodName = "exitPipe_row_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPipelined_using_clause(final PlSqlParser.Pipelined_using_clauseContext ctx) {
    final var methodName = "exitPipelined_using_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPivot_clause(final PlSqlParser.Pivot_clauseContext ctx) {
    final var methodName = "exitPivot_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPivot_element(final PlSqlParser.Pivot_elementContext ctx) {
    final var methodName = "exitPivot_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPivot_for_clause(final PlSqlParser.Pivot_for_clauseContext ctx) {
    final var methodName = "exitPivot_for_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPivot_in_clause(final PlSqlParser.Pivot_in_clauseContext ctx) {
    final var methodName = "exitPivot_in_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPivot_in_clause_element(final PlSqlParser.Pivot_in_clause_elementContext ctx) {
    final var methodName = "exitPivot_in_clause_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPivot_in_clause_elements(final PlSqlParser.Pivot_in_clause_elementsContext ctx) {
    final var methodName = "exitPivot_in_clause_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPlsql_library_source(final PlSqlParser.Plsql_library_sourceContext ctx) {
    final var methodName = "exitPlsql_library_source";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPmem_filestore_options(final PlSqlParser.Pmem_filestore_optionsContext ctx) {
    final var methodName = "exitPmem_filestore_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPolicy_name(final PlSqlParser.Policy_nameContext ctx) {
    final var methodName = "exitPolicy_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPragma_clause(final PlSqlParser.Pragma_clauseContext ctx) {
    final var methodName = "exitPragma_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPragma_declaration(final PlSqlParser.Pragma_declarationContext ctx) {
    final var methodName = "exitPragma_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPragma_elements(final PlSqlParser.Pragma_elementsContext ctx) {
    final var methodName = "exitPragma_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecision_part(final PlSqlParser.Precision_partContext ctx) {
    final var methodName = "exitPrecision_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrepare_clause(final PlSqlParser.Prepare_clauseContext ctx) {
    final var methodName = "exitPrepare_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimary_key_clause(final PlSqlParser.Primary_key_clauseContext ctx) {
    final var methodName = "exitPrimary_key_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimary_operator_item(final PlSqlParser.Primary_operator_itemContext ctx) {
    final var methodName = "exitPrimary_operator_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimary_operator_list(final PlSqlParser.Primary_operator_listContext ctx) {
    final var methodName = "exitPrimary_operator_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilege_audit_clause(final PlSqlParser.Privilege_audit_clauseContext ctx) {
    final var methodName = "exitPrivilege_audit_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProc_decl_in_type(final PlSqlParser.Proc_decl_in_typeContext ctx) {
    final var methodName = "exitProc_decl_in_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProcedure_body(final PlSqlParser.Procedure_bodyContext ctx) {
    final var methodName = "exitProcedure_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProcedure_name(final PlSqlParser.Procedure_nameContext ctx) {
    final var methodName = "exitProcedure_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProcedure_spec(final PlSqlParser.Procedure_specContext ctx) {
    final var methodName = "exitProcedure_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProfile_clause(final PlSqlParser.Profile_clauseContext ctx) {
    final var methodName = "exitProfile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProfile_name(final PlSqlParser.Profile_nameContext ctx) {
    final var methodName = "exitProfile_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProgram_unit(final PlSqlParser.Program_unitContext ctx) {
    final var methodName = "exitProgram_unit";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProperty_clauses(final PlSqlParser.Property_clausesContext ctx) {
    final var methodName = "exitProperty_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProperty_name(final PlSqlParser.Property_nameContext ctx) {
    final var methodName = "exitProperty_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProperty_value(final PlSqlParser.Property_valueContext ctx) {
    final var methodName = "exitProperty_value";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProxy_clause(final PlSqlParser.Proxy_clauseContext ctx) {
    final var methodName = "exitProxy_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPurge_statement(final PlSqlParser.Purge_statementContext ctx) {
    final var methodName = "exitPurge_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQry_transform_clause(final PlSqlParser.Qry_transform_clauseContext ctx) {
    final var methodName = "exitQry_transform_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQualified_disk_clause(final PlSqlParser.Qualified_disk_clauseContext ctx) {
    final var methodName = "exitQualified_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQualified_template_clause(
      final PlSqlParser.Qualified_template_clauseContext ctx) {
    final var methodName = "exitQualified_template_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuantified_expression(final PlSqlParser.Quantified_expressionContext ctx) {
    final var methodName = "exitQuantified_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuantitative_where_stmt(final PlSqlParser.Quantitative_where_stmtContext ctx) {
    final var methodName = "exitQuantitative_where_stmt";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuery_block(final PlSqlParser.Query_blockContext ctx) {
    final var methodName = "exitQuery_block";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuery_name(final PlSqlParser.Query_nameContext ctx) {
    final var methodName = "exitQuery_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuery_partition_clause(final PlSqlParser.Query_partition_clauseContext ctx) {
    final var methodName = "exitQuery_partition_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuorum_regular(final PlSqlParser.Quorum_regularContext ctx) {
    final var methodName = "exitQuorum_regular";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuota_clause(final PlSqlParser.Quota_clauseContext ctx) {
    final var methodName = "exitQuota_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuotagroup_clauses(final PlSqlParser.Quotagroup_clausesContext ctx) {
    final var methodName = "exitQuotagroup_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuoted_string(final PlSqlParser.Quoted_stringContext ctx) {
    final var methodName = "exitQuoted_string";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRaise_statement(final PlSqlParser.Raise_statementContext ctx) {
    final var methodName = "exitRaise_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRange_partition_desc(final PlSqlParser.Range_partition_descContext ctx) {
    final var methodName = "exitRange_partition_desc";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRange_partitions(final PlSqlParser.Range_partitionsContext ctx) {
    final var methodName = "exitRange_partitions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRange_subpartition_desc(final PlSqlParser.Range_subpartition_descContext ctx) {
    final var methodName = "exitRange_subpartition_desc";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRange_values_clause(final PlSqlParser.Range_values_clauseContext ctx) {
    final var methodName = "exitRange_values_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRange_values_list(final PlSqlParser.Range_values_listContext ctx) {
    final var methodName = "exitRange_values_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRead_only_clause(final PlSqlParser.Read_only_clauseContext ctx) {
    final var methodName = "exitRead_only_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRebalance_diskgroup_clause(
      final PlSqlParser.Rebalance_diskgroup_clauseContext ctx) {
    final var methodName = "exitRebalance_diskgroup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRebuild_clause(final PlSqlParser.Rebuild_clauseContext ctx) {
    final var methodName = "exitRebuild_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRecord_name(final PlSqlParser.Record_nameContext ctx) {
    final var methodName = "exitRecord_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRecord_type_def(final PlSqlParser.Record_type_defContext ctx) {
    final var methodName = "exitRecord_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRecords_per_block_clause(final PlSqlParser.Records_per_block_clauseContext ctx) {
    final var methodName = "exitRecords_per_block_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRecovery_clauses(final PlSqlParser.Recovery_clausesContext ctx) {
    final var methodName = "exitRecovery_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRedo_log_file_spec(final PlSqlParser.Redo_log_file_specContext ctx) {
    final var methodName = "exitRedo_log_file_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRedundancy_clause(final PlSqlParser.Redundancy_clauseContext ctx) {
    final var methodName = "exitRedundancy_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRef_cursor_type_def(final PlSqlParser.Ref_cursor_type_defContext ctx) {
    final var methodName = "exitRef_cursor_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReference_model(final PlSqlParser.Reference_modelContext ctx) {
    final var methodName = "exitReference_model";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReference_model_name(final PlSqlParser.Reference_model_nameContext ctx) {
    final var methodName = "exitReference_model_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReference_partition_desc(final PlSqlParser.Reference_partition_descContext ctx) {
    final var methodName = "exitReference_partition_desc";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReference_partitioning(final PlSqlParser.Reference_partitioningContext ctx) {
    final var methodName = "exitReference_partitioning";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReferences_clause(final PlSqlParser.References_clauseContext ctx) {
    final var methodName = "exitReferences_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReferencing_clause(final PlSqlParser.Referencing_clauseContext ctx) {
    final var methodName = "exitReferencing_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReferencing_element(final PlSqlParser.Referencing_elementContext ctx) {
    final var methodName = "exitReferencing_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRegister_logfile_clause(final PlSqlParser.Register_logfile_clauseContext ctx) {
    final var methodName = "exitRegister_logfile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRegular_id(final PlSqlParser.Regular_idContext ctx) {
    final var methodName = "exitRegular_id";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelational_expression(final PlSqlParser.Relational_expressionContext ctx) {
    final var methodName = "exitRelational_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelational_operator(final PlSqlParser.Relational_operatorContext ctx) {
    final var methodName = "exitRelational_operator";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelational_property(final PlSqlParser.Relational_propertyContext ctx) {
    final var methodName = "exitRelational_property";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelational_table(final PlSqlParser.Relational_tableContext ctx) {
    final var methodName = "exitRelational_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelies_on_part(final PlSqlParser.Relies_on_partContext ctx) {
    final var methodName = "exitRelies_on_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRename_column_clause(final PlSqlParser.Rename_column_clauseContext ctx) {
    final var methodName = "exitRename_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRename_disk_clause(final PlSqlParser.Rename_disk_clauseContext ctx) {
    final var methodName = "exitRename_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRename_index_partition(final PlSqlParser.Rename_index_partitionContext ctx) {
    final var methodName = "exitRename_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRename_object(final PlSqlParser.Rename_objectContext ctx) {
    final var methodName = "exitRename_object";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplace_disk_clause(final PlSqlParser.Replace_disk_clauseContext ctx) {
    final var methodName = "exitReplace_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplace_type_clause(final PlSqlParser.Replace_type_clauseContext ctx) {
    final var methodName = "exitReplace_type_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplay_upgrade_clauses(final PlSqlParser.Replay_upgrade_clausesContext ctx) {
    final var methodName = "exitReplay_upgrade_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResetlogs_or_noresetlogs(final PlSqlParser.Resetlogs_or_noresetlogsContext ctx) {
    final var methodName = "exitResetlogs_or_noresetlogs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResize_disk_clause(final PlSqlParser.Resize_disk_clauseContext ctx) {
    final var methodName = "exitResize_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResource_parameters(final PlSqlParser.Resource_parametersContext ctx) {
    final var methodName = "exitResource_parameters";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRespect_or_ignore_nulls(final PlSqlParser.Respect_or_ignore_nullsContext ctx) {
    final var methodName = "exitRespect_or_ignore_nulls";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRestore_point(final PlSqlParser.Restore_pointContext ctx) {
    final var methodName = "exitRestore_point";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResult_cache_clause(final PlSqlParser.Result_cache_clauseContext ctx) {
    final var methodName = "exitResult_cache_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReturn_rows_clause(final PlSqlParser.Return_rows_clauseContext ctx) {
    final var methodName = "exitReturn_rows_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReturn_statement(final PlSqlParser.Return_statementContext ctx) {
    final var methodName = "exitReturn_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReverse_migrate_keys(final PlSqlParser.Reverse_migrate_keysContext ctx) {
    final var methodName = "exitReverse_migrate_keys";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevoke_object_privileges(final PlSqlParser.Revoke_object_privilegesContext ctx) {
    final var methodName = "exitRevoke_object_privileges";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevoke_roles_from_programs(
      final PlSqlParser.Revoke_roles_from_programsContext ctx) {
    final var methodName = "exitRevoke_roles_from_programs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevoke_statement(final PlSqlParser.Revoke_statementContext ctx) {
    final var methodName = "exitRevoke_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevoke_system_privilege(final PlSqlParser.Revoke_system_privilegeContext ctx) {
    final var methodName = "exitRevoke_system_privilege";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevokee_clause(final PlSqlParser.Revokee_clauseContext ctx) {
    final var methodName = "exitRevokee_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRole_audit_clause(final PlSqlParser.Role_audit_clauseContext ctx) {
    final var methodName = "exitRole_audit_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRole_clause(final PlSqlParser.Role_clauseContext ctx) {
    final var methodName = "exitRole_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRole_identified_clause(final PlSqlParser.Role_identified_clauseContext ctx) {
    final var methodName = "exitRole_identified_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRole_name(final PlSqlParser.Role_nameContext ctx) {
    final var methodName = "exitRole_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollback_segment(final PlSqlParser.Rollback_segmentContext ctx) {
    final var methodName = "exitRollback_segment";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollback_segment_name(final PlSqlParser.Rollback_segment_nameContext ctx) {
    final var methodName = "exitRollback_segment_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollback_statement(final PlSqlParser.Rollback_statementContext ctx) {
    final var methodName = "exitRollback_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollup_cube_clause(final PlSqlParser.Rollup_cube_clauseContext ctx) {
    final var methodName = "exitRollup_cube_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutine_clause(final PlSqlParser.Routine_clauseContext ctx) {
    final var methodName = "exitRoutine_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutine_name(final PlSqlParser.Routine_nameContext ctx) {
    final var methodName = "exitRoutine_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRow_movement_clause(final PlSqlParser.Row_movement_clauseContext ctx) {
    final var methodName = "exitRow_movement_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSample_clause(final PlSqlParser.Sample_clauseContext ctx) {
    final var methodName = "exitSample_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSavepoint_name(final PlSqlParser.Savepoint_nameContext ctx) {
    final var methodName = "exitSavepoint_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSavepoint_statement(final PlSqlParser.Savepoint_statementContext ctx) {
    final var methodName = "exitSavepoint_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSchema_name(final PlSqlParser.Schema_nameContext ctx) {
    final var methodName = "exitSchema_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSchema_object_name(final PlSqlParser.Schema_object_nameContext ctx) {
    final var methodName = "exitSchema_object_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitScoped_table_ref_constraint(
      final PlSqlParser.Scoped_table_ref_constraintContext ctx) {
    final var methodName = "exitScoped_table_ref_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitScrub_clause(final PlSqlParser.Scrub_clauseContext ctx) {
    final var methodName = "exitScrub_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSearch_clause(final PlSqlParser.Search_clauseContext ctx) {
    final var methodName = "exitSearch_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSearched_case_statement(final PlSqlParser.Searched_case_statementContext ctx) {
    final var methodName = "exitSearched_case_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSearched_case_when_part(final PlSqlParser.Searched_case_when_partContext ctx) {
    final var methodName = "exitSearched_case_when_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSecret(final PlSqlParser.SecretContext ctx) {
    final var methodName = "exitSecret";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSecret_management_clauses(
      final PlSqlParser.Secret_management_clausesContext ctx) {
    final var methodName = "exitSecret_management_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSecurity_clause(final PlSqlParser.Security_clauseContext ctx) {
    final var methodName = "exitSecurity_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSeed_part(final PlSqlParser.Seed_partContext ctx) {
    final var methodName = "exitSeed_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSegment_attributes_clause(
      final PlSqlParser.Segment_attributes_clauseContext ctx) {
    final var methodName = "exitSegment_attributes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSegment_group(final PlSqlParser.Segment_groupContext ctx) {
    final var methodName = "exitSegment_group";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSegment_management_clause(
      final PlSqlParser.Segment_management_clauseContext ctx) {
    final var methodName = "exitSegment_management_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_list_elements(final PlSqlParser.Select_list_elementsContext ctx) {
    final var methodName = "exitSelect_list_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_only_statement(final PlSqlParser.Select_only_statementContext ctx) {
    final var methodName = "exitSelect_only_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelect_statement(final PlSqlParser.Select_statementContext ctx) {
    final var methodName = "exitSelect_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelected_list(final PlSqlParser.Selected_listContext ctx) {
    final var methodName = "exitSelected_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelected_tableview(final PlSqlParser.Selected_tableviewContext ctx) {
    final var methodName = "exitSelected_tableview";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelection_directive(final PlSqlParser.Selection_directiveContext ctx) {
    final var methodName = "exitSelection_directive";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelection_directive_body(final PlSqlParser.Selection_directive_bodyContext ctx) {
    final var methodName = "exitSelection_directive_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSeq_of_declare_specs(final PlSqlParser.Seq_of_declare_specsContext ctx) {
    final var methodName = "exitSeq_of_declare_specs";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSeq_of_statements(final PlSqlParser.Seq_of_statementsContext ctx) {
    final var methodName = "exitSeq_of_statements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSequence_name(final PlSqlParser.Sequence_nameContext ctx) {
    final var methodName = "exitSequence_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSequence_spec(final PlSqlParser.Sequence_specContext ctx) {
    final var methodName = "exitSequence_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSequence_start_clause(final PlSqlParser.Sequence_start_clauseContext ctx) {
    final var methodName = "exitSequence_start_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_command(final PlSqlParser.Set_commandContext ctx) {
    final var methodName = "exitSet_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_constraint_command(final PlSqlParser.Set_constraint_commandContext ctx) {
    final var methodName = "exitSet_constraint_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_container_data(final PlSqlParser.Set_container_dataContext ctx) {
    final var methodName = "exitSet_container_data";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_key(final PlSqlParser.Set_keyContext ctx) {
    final var methodName = "exitSet_key";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_key_tag(final PlSqlParser.Set_key_tagContext ctx) {
    final var methodName = "exitSet_key_tag";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_time_zone_clause(final PlSqlParser.Set_time_zone_clauseContext ctx) {
    final var methodName = "exitSet_time_zone_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSet_transaction_command(final PlSqlParser.Set_transaction_commandContext ctx) {
    final var methodName = "exitSet_transaction_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShrink_clause(final PlSqlParser.Shrink_clauseContext ctx) {
    final var methodName = "exitShrink_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimple_case_statement(final PlSqlParser.Simple_case_statementContext ctx) {
    final var methodName = "exitSimple_case_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimple_case_when_part(final PlSqlParser.Simple_case_when_partContext ctx) {
    final var methodName = "exitSimple_case_when_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimple_dml_trigger(final PlSqlParser.Simple_dml_triggerContext ctx) {
    final var methodName = "exitSimple_dml_trigger";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSingle_column_for_loop(final PlSqlParser.Single_column_for_loopContext ctx) {
    final var methodName = "exitSingle_column_for_loop";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSingle_table_insert(final PlSqlParser.Single_table_insertContext ctx) {
    final var methodName = "exitSingle_table_insert";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSize_clause(final PlSqlParser.Size_clauseContext ctx) {
    final var methodName = "exitSize_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSort_or_nosort(final PlSqlParser.Sort_or_nosortContext ctx) {
    final var methodName = "exitSort_or_nosort";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSource_clause(final PlSqlParser.Source_clauseContext ctx) {
    final var methodName = "exitSource_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSpfile_name(final PlSqlParser.Spfile_nameContext ctx) {
    final var methodName = "exitSpfile_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSplit_index_partition(final PlSqlParser.Split_index_partitionContext ctx) {
    final var methodName = "exitSplit_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSplit_table_partition(final PlSqlParser.Split_table_partitionContext ctx) {
    final var methodName = "exitSplit_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_macro_body(final PlSqlParser.Sql_macro_bodyContext ctx) {
    final var methodName = "exitSql_macro_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_operation(final PlSqlParser.Sql_operationContext ctx) {
    final var methodName = "exitSql_operation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_plus_command(final PlSqlParser.Sql_plus_commandContext ctx) {
    final var methodName = "exitSql_plus_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_plus_command_no_semicolon(
      final PlSqlParser.Sql_plus_command_no_semicolonContext ctx) {
    final var methodName = "exitSql_plus_command_no_semicolon";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_script(final PlSqlParser.Sql_scriptContext ctx) {
    final var methodName = "exitSql_script";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_statement(final PlSqlParser.Sql_statementContext ctx) {
    final var methodName = "exitSql_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql_statement_shortcut(final PlSqlParser.Sql_statement_shortcutContext ctx) {
    final var methodName = "exitSql_statement_shortcut";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSqlj_object_type(final PlSqlParser.Sqlj_object_typeContext ctx) {
    final var methodName = "exitSqlj_object_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSqlj_object_type_attr(final PlSqlParser.Sqlj_object_type_attrContext ctx) {
    final var methodName = "exitSqlj_object_type_attr";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStandard_actions(final PlSqlParser.Standard_actionsContext ctx) {
    final var methodName = "exitStandard_actions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStandard_function(final PlSqlParser.Standard_functionContext ctx) {
    final var methodName = "exitStandard_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStandard_prediction_function_keyword(
      final PlSqlParser.Standard_prediction_function_keywordContext ctx) {
    final var methodName = "exitStandard_prediction_function_keyword";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStandby_database_clauses(final PlSqlParser.Standby_database_clausesContext ctx) {
    final var methodName = "exitStandby_database_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStart_command(final PlSqlParser.Start_commandContext ctx) {
    final var methodName = "exitStart_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStart_part(final PlSqlParser.Start_partContext ctx) {
    final var methodName = "exitStart_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStart_standby_clause(final PlSqlParser.Start_standby_clauseContext ctx) {
    final var methodName = "exitStart_standby_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStart_time_column(final PlSqlParser.Start_time_columnContext ctx) {
    final var methodName = "exitStart_time_column";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStartup_clauses(final PlSqlParser.Startup_clausesContext ctx) {
    final var methodName = "exitStartup_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStatement(final PlSqlParser.StatementContext ctx) {
    final var methodName = "exitStatement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStatement_clauses(final PlSqlParser.Statement_clausesContext ctx) {
    final var methodName = "exitStatement_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStatic_base_profile(final PlSqlParser.Static_base_profileContext ctx) {
    final var methodName = "exitStatic_base_profile";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStatic_returning_clause(final PlSqlParser.Static_returning_clauseContext ctx) {
    final var methodName = "exitStatic_returning_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStatistics_type_name(final PlSqlParser.Statistics_type_nameContext ctx) {
    final var methodName = "exitStatistics_type_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStop_standby_clause(final PlSqlParser.Stop_standby_clauseContext ctx) {
    final var methodName = "exitStop_standby_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStorage_clause(final PlSqlParser.Storage_clauseContext ctx) {
    final var methodName = "exitStorage_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStorage_table_clause(final PlSqlParser.Storage_table_clauseContext ctx) {
    final var methodName = "exitStorage_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStreaming_clause(final PlSqlParser.Streaming_clauseContext ctx) {
    final var methodName = "exitStreaming_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitString_delimiter(final PlSqlParser.String_delimiterContext ctx) {
    final var methodName = "exitString_delimiter";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitString_function(final PlSqlParser.String_functionContext ctx) {
    final var methodName = "exitString_function";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitString_function_name(final PlSqlParser.String_function_nameContext ctx) {
    final var methodName = "exitString_function_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitString_list(final PlSqlParser.String_listContext ctx) {
    final var methodName = "exitString_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStriping_clause(final PlSqlParser.Striping_clauseContext ctx) {
    final var methodName = "exitStriping_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubav_clause(final PlSqlParser.Subav_clauseContext ctx) {
    final var methodName = "exitSubav_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubav_factoring_clause(final PlSqlParser.Subav_factoring_clauseContext ctx) {
    final var methodName = "exitSubav_factoring_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubpartition_by_hash(final PlSqlParser.Subpartition_by_hashContext ctx) {
    final var methodName = "exitSubpartition_by_hash";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubpartition_by_list(final PlSqlParser.Subpartition_by_listContext ctx) {
    final var methodName = "exitSubpartition_by_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubpartition_by_range(final PlSqlParser.Subpartition_by_rangeContext ctx) {
    final var methodName = "exitSubpartition_by_range";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubpartition_extended_names(
      final PlSqlParser.Subpartition_extended_namesContext ctx) {
    final var methodName = "exitSubpartition_extended_names";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubpartition_key_value(final PlSqlParser.Subpartition_key_valueContext ctx) {
    final var methodName = "exitSubpartition_key_value";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubpartition_name(final PlSqlParser.Subpartition_nameContext ctx) {
    final var methodName = "exitSubpartition_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubpartition_template(final PlSqlParser.Subpartition_templateContext ctx) {
    final var methodName = "exitSubpartition_template";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubprog_decl_in_type(final PlSqlParser.Subprog_decl_in_typeContext ctx) {
    final var methodName = "exitSubprog_decl_in_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubprogram_spec(final PlSqlParser.Subprogram_specContext ctx) {
    final var methodName = "exitSubprogram_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubquery(final PlSqlParser.SubqueryContext ctx) {
    final var methodName = "exitSubquery";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubquery_basic_elements(final PlSqlParser.Subquery_basic_elementsContext ctx) {
    final var methodName = "exitSubquery_basic_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubquery_factoring_clause(
      final PlSqlParser.Subquery_factoring_clauseContext ctx) {
    final var methodName = "exitSubquery_factoring_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubquery_operation_part(final PlSqlParser.Subquery_operation_partContext ctx) {
    final var methodName = "exitSubquery_operation_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubquery_restriction_clause(
      final PlSqlParser.Subquery_restriction_clauseContext ctx) {
    final var methodName = "exitSubquery_restriction_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubstitutable_column_clause(
      final PlSqlParser.Substitutable_column_clauseContext ctx) {
    final var methodName = "exitSubstitutable_column_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubtype_declaration(final PlSqlParser.Subtype_declarationContext ctx) {
    final var methodName = "exitSubtype_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSupplemental_db_logging(final PlSqlParser.Supplemental_db_loggingContext ctx) {
    final var methodName = "exitSupplemental_db_logging";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSupplemental_id_key_clause(
      final PlSqlParser.Supplemental_id_key_clauseContext ctx) {
    final var methodName = "exitSupplemental_id_key_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSupplemental_log_grp_clause(
      final PlSqlParser.Supplemental_log_grp_clauseContext ctx) {
    final var methodName = "exitSupplemental_log_grp_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSupplemental_logging_props(
      final PlSqlParser.Supplemental_logging_propsContext ctx) {
    final var methodName = "exitSupplemental_logging_props";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSupplemental_plsql_clause(
      final PlSqlParser.Supplemental_plsql_clauseContext ctx) {
    final var methodName = "exitSupplemental_plsql_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSupplemental_table_logging(
      final PlSqlParser.Supplemental_table_loggingContext ctx) {
    final var methodName = "exitSupplemental_table_logging";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSwallow_to_semi(final PlSqlParser.Swallow_to_semiContext ctx) {
    final var methodName = "exitSwallow_to_semi";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSwitch_logfile_clause(final PlSqlParser.Switch_logfile_clauseContext ctx) {
    final var methodName = "exitSwitch_logfile_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSynchronous_or_asynchronous(
      final PlSqlParser.Synchronous_or_asynchronousContext ctx) {
    final var methodName = "exitSynchronous_or_asynchronous";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSynonym_name(final PlSqlParser.Synonym_nameContext ctx) {
    final var methodName = "exitSynonym_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSystem_action(final PlSqlParser.System_actionContext ctx) {
    final var methodName = "exitSystem_action";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSystem_actions(final PlSqlParser.System_actionsContext ctx) {
    final var methodName = "exitSystem_actions";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSystem_partitioning(final PlSqlParser.System_partitioningContext ctx) {
    final var methodName = "exitSystem_partitioning";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSystem_privilege(final PlSqlParser.System_privilegeContext ctx) {
    final var methodName = "exitSystem_privilege";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_alias(final PlSqlParser.Table_aliasContext ctx) {
    final var methodName = "exitTable_alias";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_collection_expression(
      final PlSqlParser.Table_collection_expressionContext ctx) {
    final var methodName = "exitTable_collection_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_compression(final PlSqlParser.Table_compressionContext ctx) {
    final var methodName = "exitTable_compression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_element(final PlSqlParser.Table_elementContext ctx) {
    final var methodName = "exitTable_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_index_clause(final PlSqlParser.Table_index_clauseContext ctx) {
    final var methodName = "exitTable_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_indexed_by_part(final PlSqlParser.Table_indexed_by_partContext ctx) {
    final var methodName = "exitTable_indexed_by_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_name(final PlSqlParser.Table_nameContext ctx) {
    final var methodName = "exitTable_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_partition_description(
      final PlSqlParser.Table_partition_descriptionContext ctx) {
    final var methodName = "exitTable_partition_description";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_partitioning_clauses(
      final PlSqlParser.Table_partitioning_clausesContext ctx) {
    final var methodName = "exitTable_partitioning_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_properties(final PlSqlParser.Table_propertiesContext ctx) {
    final var methodName = "exitTable_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_ref(final PlSqlParser.Table_refContext ctx) {
    final var methodName = "exitTable_ref";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_ref_aux(final PlSqlParser.Table_ref_auxContext ctx) {
    final var methodName = "exitTable_ref_aux";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_ref_aux_internal_one(
      final PlSqlParser.Table_ref_aux_internal_oneContext ctx) {
    final var methodName = "exitTable_ref_aux_internal_one";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_ref_aux_internal_thre(
      final PlSqlParser.Table_ref_aux_internal_threContext ctx) {
    final var methodName = "exitTable_ref_aux_internal_thre";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_ref_aux_internal_two(
      final PlSqlParser.Table_ref_aux_internal_twoContext ctx) {
    final var methodName = "exitTable_ref_aux_internal_two";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_ref_list(final PlSqlParser.Table_ref_listContext ctx) {
    final var methodName = "exitTable_ref_list";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_type_def(final PlSqlParser.Table_type_defContext ctx) {
    final var methodName = "exitTable_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTable_var_name(final PlSqlParser.Table_var_nameContext ctx) {
    final var methodName = "exitTable_var_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespace(final PlSqlParser.TablespaceContext ctx) {
    final var methodName = "exitTablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespace_clauses(final PlSqlParser.Tablespace_clausesContext ctx) {
    final var methodName = "exitTablespace_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespace_datafile_clauses(
      final PlSqlParser.Tablespace_datafile_clausesContext ctx) {
    final var methodName = "exitTablespace_datafile_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespace_encryption_clause(
      final PlSqlParser.Tablespace_encryption_clauseContext ctx) {
    final var methodName = "exitTablespace_encryption_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespace_encryption_spec(
      final PlSqlParser.Tablespace_encryption_specContext ctx) {
    final var methodName = "exitTablespace_encryption_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespace_group_clause(final PlSqlParser.Tablespace_group_clauseContext ctx) {
    final var methodName = "exitTablespace_group_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespace_group_name(final PlSqlParser.Tablespace_group_nameContext ctx) {
    final var methodName = "exitTablespace_group_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespace_logging_clauses(
      final PlSqlParser.Tablespace_logging_clausesContext ctx) {
    final var methodName = "exitTablespace_logging_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespace_retention_clause(
      final PlSqlParser.Tablespace_retention_clauseContext ctx) {
    final var methodName = "exitTablespace_retention_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespace_state_clauses(final PlSqlParser.Tablespace_state_clausesContext ctx) {
    final var methodName = "exitTablespace_state_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableview_name(final PlSqlParser.Tableview_nameContext ctx) {
    final var methodName = "exitTableview_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTempfile_specification(final PlSqlParser.Tempfile_specificationContext ctx) {
    final var methodName = "exitTempfile_specification";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTemporary_tablespace_clause(
      final PlSqlParser.Temporary_tablespace_clauseContext ctx) {
    final var methodName = "exitTemporary_tablespace_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTimeout_clause(final PlSqlParser.Timeout_clauseContext ctx) {
    final var methodName = "exitTimeout_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTiming_command(final PlSqlParser.Timing_commandContext ctx) {
    final var methodName = "exitTiming_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTiming_point_section(final PlSqlParser.Timing_point_sectionContext ctx) {
    final var methodName = "exitTiming_point_section";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTps_block(final PlSqlParser.Tps_blockContext ctx) {
    final var methodName = "exitTps_block";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrace_file_clause(final PlSqlParser.Trace_file_clauseContext ctx) {
    final var methodName = "exitTrace_file_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransaction_control_statements(
      final PlSqlParser.Transaction_control_statementsContext ctx) {
    final var methodName = "exitTransaction_control_statements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrigger_block(final PlSqlParser.Trigger_blockContext ctx) {
    final var methodName = "exitTrigger_block";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrigger_body(final PlSqlParser.Trigger_bodyContext ctx) {
    final var methodName = "exitTrigger_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrigger_follows_clause(final PlSqlParser.Trigger_follows_clauseContext ctx) {
    final var methodName = "exitTrigger_follows_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrigger_name(final PlSqlParser.Trigger_nameContext ctx) {
    final var methodName = "exitTrigger_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrigger_when_clause(final PlSqlParser.Trigger_when_clauseContext ctx) {
    final var methodName = "exitTrigger_when_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTruncate_cluster(final PlSqlParser.Truncate_clusterContext ctx) {
    final var methodName = "exitTruncate_cluster";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTruncate_table(final PlSqlParser.Truncate_tableContext ctx) {
    final var methodName = "exitTruncate_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTruncate_table_partition(final PlSqlParser.Truncate_table_partitionContext ctx) {
    final var methodName = "exitTruncate_table_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTs_file_name_convert(final PlSqlParser.Ts_file_name_convertContext ctx) {
    final var methodName = "exitTs_file_name_convert";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_body(final PlSqlParser.Type_bodyContext ctx) {
    final var methodName = "exitType_body";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_body_elements(final PlSqlParser.Type_body_elementsContext ctx) {
    final var methodName = "exitType_body_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_declaration(final PlSqlParser.Type_declarationContext ctx) {
    final var methodName = "exitType_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_definition(final PlSqlParser.Type_definitionContext ctx) {
    final var methodName = "exitType_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_elements_parameter(final PlSqlParser.Type_elements_parameterContext ctx) {
    final var methodName = "exitType_elements_parameter";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_function_spec(final PlSqlParser.Type_function_specContext ctx) {
    final var methodName = "exitType_function_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_name(final PlSqlParser.Type_nameContext ctx) {
    final var methodName = "exitType_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_procedure_spec(final PlSqlParser.Type_procedure_specContext ctx) {
    final var methodName = "exitType_procedure_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType_spec(final PlSqlParser.Type_specContext ctx) {
    final var methodName = "exitType_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnary_expression(final PlSqlParser.Unary_expressionContext ctx) {
    final var methodName = "exitUnary_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnary_logical_expression(final PlSqlParser.Unary_logical_expressionContext ctx) {
    final var methodName = "exitUnary_logical_expression";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnary_logical_operation(final PlSqlParser.Unary_logical_operationContext ctx) {
    final var methodName = "exitUnary_logical_operation";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUndo_mode_clause(final PlSqlParser.Undo_mode_clauseContext ctx) {
    final var methodName = "exitUndo_mode_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUndo_tablespace(final PlSqlParser.Undo_tablespaceContext ctx) {
    final var methodName = "exitUndo_tablespace";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUndo_tablespace_clause(final PlSqlParser.Undo_tablespace_clauseContext ctx) {
    final var methodName = "exitUndo_tablespace_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUndrop_disk_clause(final PlSqlParser.Undrop_disk_clauseContext ctx) {
    final var methodName = "exitUndrop_disk_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnified_auditing(final PlSqlParser.Unified_auditingContext ctx) {
    final var methodName = "exitUnified_auditing";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnique_key_clause(final PlSqlParser.Unique_key_clauseContext ctx) {
    final var methodName = "exitUnique_key_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnit_statement(final PlSqlParser.Unit_statementContext ctx) {
    final var methodName = "exitUnit_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnite_keystore(final PlSqlParser.Unite_keystoreContext ctx) {
    final var methodName = "exitUnite_keystore";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnpivot_clause(final PlSqlParser.Unpivot_clauseContext ctx) {
    final var methodName = "exitUnpivot_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnpivot_in_clause(final PlSqlParser.Unpivot_in_clauseContext ctx) {
    final var methodName = "exitUnpivot_in_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnpivot_in_elements(final PlSqlParser.Unpivot_in_elementsContext ctx) {
    final var methodName = "exitUnpivot_in_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUntil_part(final PlSqlParser.Until_partContext ctx) {
    final var methodName = "exitUntil_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_all_indexes_clause(
      final PlSqlParser.Update_all_indexes_clauseContext ctx) {
    final var methodName = "exitUpdate_all_indexes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_all_indexes_index_clause(
      final PlSqlParser.Update_all_indexes_index_clauseContext ctx) {
    final var methodName = "exitUpdate_all_indexes_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_global_index_clause(
      final PlSqlParser.Update_global_index_clauseContext ctx) {
    final var methodName = "exitUpdate_global_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_index_clauses(final PlSqlParser.Update_index_clausesContext ctx) {
    final var methodName = "exitUpdate_index_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_index_partition(final PlSqlParser.Update_index_partitionContext ctx) {
    final var methodName = "exitUpdate_index_partition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_index_subpartition(
      final PlSqlParser.Update_index_subpartitionContext ctx) {
    final var methodName = "exitUpdate_index_subpartition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_set_clause(final PlSqlParser.Update_set_clauseContext ctx) {
    final var methodName = "exitUpdate_set_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdate_statement(final PlSqlParser.Update_statementContext ctx) {
    final var methodName = "exitUpdate_statement";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpgrade_or_downgrade(final PlSqlParser.Upgrade_or_downgradeContext ctx) {
    final var methodName = "exitUpgrade_or_downgrade";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpgrade_table_clause(final PlSqlParser.Upgrade_table_clauseContext ctx) {
    final var methodName = "exitUpgrade_table_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpper_bound(final PlSqlParser.Upper_boundContext ctx) {
    final var methodName = "exitUpper_bound";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUse_key(final PlSqlParser.Use_keyContext ctx) {
    final var methodName = "exitUse_key";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUser_clauses(final PlSqlParser.User_clausesContext ctx) {
    final var methodName = "exitUser_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUser_default_role_clause(final PlSqlParser.User_default_role_clauseContext ctx) {
    final var methodName = "exitUser_default_role_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUser_editions_clause(final PlSqlParser.User_editions_clauseContext ctx) {
    final var methodName = "exitUser_editions_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUser_lock_clause(final PlSqlParser.User_lock_clauseContext ctx) {
    final var methodName = "exitUser_lock_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUser_object_name(final PlSqlParser.User_object_nameContext ctx) {
    final var methodName = "exitUser_object_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUser_tablespace_clause(final PlSqlParser.User_tablespace_clauseContext ctx) {
    final var methodName = "exitUser_tablespace_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUsergroup_clauses(final PlSqlParser.Usergroup_clausesContext ctx) {
    final var methodName = "exitUsergroup_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUsing_algorithm_clause(final PlSqlParser.Using_algorithm_clauseContext ctx) {
    final var methodName = "exitUsing_algorithm_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUsing_clause(final PlSqlParser.Using_clauseContext ctx) {
    final var methodName = "exitUsing_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUsing_element(final PlSqlParser.Using_elementContext ctx) {
    final var methodName = "exitUsing_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUsing_function_clause(final PlSqlParser.Using_function_clauseContext ctx) {
    final var methodName = "exitUsing_function_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUsing_index_clause(final PlSqlParser.Using_index_clauseContext ctx) {
    final var methodName = "exitUsing_index_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUsing_statistics_type(final PlSqlParser.Using_statistics_typeContext ctx) {
    final var methodName = "exitUsing_statistics_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUsing_tag_clause(final PlSqlParser.Using_tag_clauseContext ctx) {
    final var methodName = "exitUsing_tag_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValidation_clauses(final PlSqlParser.Validation_clausesContext ctx) {
    final var methodName = "exitValidation_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValues_clause(final PlSqlParser.Values_clauseContext ctx) {
    final var methodName = "exitValues_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVariable_declaration(final PlSqlParser.Variable_declarationContext ctx) {
    final var methodName = "exitVariable_declaration";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVariable_name(final PlSqlParser.Variable_nameContext ctx) {
    final var methodName = "exitVariable_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVariable_or_collection(final PlSqlParser.Variable_or_collectionContext ctx) {
    final var methodName = "exitVariable_or_collection";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVarray_col_properties(final PlSqlParser.Varray_col_propertiesContext ctx) {
    final var methodName = "exitVarray_col_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVarray_item(final PlSqlParser.Varray_itemContext ctx) {
    final var methodName = "exitVarray_item";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVarray_storage_clause(final PlSqlParser.Varray_storage_clauseContext ctx) {
    final var methodName = "exitVarray_storage_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVarray_type_def(final PlSqlParser.Varray_type_defContext ctx) {
    final var methodName = "exitVarray_type_def";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitView_alias_constraint(final PlSqlParser.View_alias_constraintContext ctx) {
    final var methodName = "exitView_alias_constraint";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitView_options(final PlSqlParser.View_optionsContext ctx) {
    final var methodName = "exitView_options";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVirtual_column_definition(
      final PlSqlParser.Virtual_column_definitionContext ctx) {
    final var methodName = "exitVirtual_column_definition";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVisible_or_invisible(final PlSqlParser.Visible_or_invisibleContext ctx) {
    final var methodName = "exitVisible_or_invisible";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWait_nowait(final PlSqlParser.Wait_nowaitContext ctx) {
    final var methodName = "exitWait_nowait";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWait_nowait_part(final PlSqlParser.Wait_nowait_partContext ctx) {
    final var methodName = "exitWait_nowait_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhenever_command(final PlSqlParser.Whenever_commandContext ctx) {
    final var methodName = "exitWhenever_command";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhere_clause(final PlSqlParser.Where_clauseContext ctx) {
    final var methodName = "exitWhere_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindowing_clause(final PlSqlParser.Windowing_clauseContext ctx) {
    final var methodName = "exitWindowing_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindowing_elements(final PlSqlParser.Windowing_elementsContext ctx) {
    final var methodName = "exitWindowing_elements";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindowing_type(final PlSqlParser.Windowing_typeContext ctx) {
    final var methodName = "exitWindowing_type";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWith_backup_clause(final PlSqlParser.With_backup_clauseContext ctx) {
    final var methodName = "exitWith_backup_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWith_clause(final PlSqlParser.With_clauseContext ctx) {
    final var methodName = "exitWith_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWith_factoring_clause(final PlSqlParser.With_factoring_clauseContext ctx) {
    final var methodName = "exitWith_factoring_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithin_or_over_clause_keyword(
      final PlSqlParser.Within_or_over_clause_keywordContext ctx) {
    final var methodName = "exitWithin_or_over_clause_keyword";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithin_or_over_part(final PlSqlParser.Within_or_over_partContext ctx) {
    final var methodName = "exitWithin_or_over_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWrite_clause(final PlSqlParser.Write_clauseContext ctx) {
    final var methodName = "exitWrite_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_attributes_clause(final PlSqlParser.Xml_attributes_clauseContext ctx) {
    final var methodName = "exitXml_attributes_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_column_name(final PlSqlParser.Xml_column_nameContext ctx) {
    final var methodName = "exitXml_column_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_general_default_part(final PlSqlParser.Xml_general_default_partContext ctx) {
    final var methodName = "exitXml_general_default_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_multiuse_expression_element(
      final PlSqlParser.Xml_multiuse_expression_elementContext ctx) {
    final var methodName = "exitXml_multiuse_expression_element";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_namespaces_clause(final PlSqlParser.Xml_namespaces_clauseContext ctx) {
    final var methodName = "exitXml_namespaces_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_passing_clause(final PlSqlParser.Xml_passing_clauseContext ctx) {
    final var methodName = "exitXml_passing_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_schema_spec(final PlSqlParser.Xml_schema_specContext ctx) {
    final var methodName = "exitXml_schema_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_schema_url(final PlSqlParser.Xml_schema_urlContext ctx) {
    final var methodName = "exitXml_schema_url";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXml_table_column(final PlSqlParser.Xml_table_columnContext ctx) {
    final var methodName = "exitXml_table_column";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmlindex_clause(final PlSqlParser.Xmlindex_clauseContext ctx) {
    final var methodName = "exitXmlindex_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmlroot_param_standalone_part(
      final PlSqlParser.Xmlroot_param_standalone_partContext ctx) {
    final var methodName = "exitXmlroot_param_standalone_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmlroot_param_version_part(
      final PlSqlParser.Xmlroot_param_version_partContext ctx) {
    final var methodName = "exitXmlroot_param_version_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmlschema_spec(final PlSqlParser.Xmlschema_specContext ctx) {
    final var methodName = "exitXmlschema_spec";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmlserialize_param_enconding_part(
      final PlSqlParser.Xmlserialize_param_enconding_partContext ctx) {
    final var methodName = "exitXmlserialize_param_enconding_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmlserialize_param_ident_part(
      final PlSqlParser.Xmlserialize_param_ident_partContext ctx) {
    final var methodName = "exitXmlserialize_param_ident_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmlserialize_param_version_part(
      final PlSqlParser.Xmlserialize_param_version_partContext ctx) {
    final var methodName = "exitXmlserialize_param_version_part";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmltable(final PlSqlParser.XmltableContext ctx) {
    final var methodName = "exitXmltable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmltype_column_properties(
      final PlSqlParser.Xmltype_column_propertiesContext ctx) {
    final var methodName = "exitXmltype_column_properties";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmltype_storage(final PlSqlParser.Xmltype_storageContext ctx) {
    final var methodName = "exitXmltype_storage";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmltype_table(final PlSqlParser.Xmltype_tableContext ctx) {
    final var methodName = "exitXmltype_table";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmltype_view_clause(final PlSqlParser.Xmltype_view_clauseContext ctx) {
    final var methodName = "exitXmltype_view_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXmltype_virtual_columns(final PlSqlParser.Xmltype_virtual_columnsContext ctx) {
    final var methodName = "exitXmltype_virtual_columns";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitYes_no(final PlSqlParser.Yes_noContext ctx) {
    final var methodName = "exitYes_no";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitZero_downtime_software_patching_clauses(
      final PlSqlParser.Zero_downtime_software_patching_clausesContext ctx) {
    final var methodName = "exitZero_downtime_software_patching_clauses";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitZonemap_attributes(final PlSqlParser.Zonemap_attributesContext ctx) {
    final var methodName = "exitZonemap_attributes";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitZonemap_clause(final PlSqlParser.Zonemap_clauseContext ctx) {
    final var methodName = "exitZonemap_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitZonemap_name(final PlSqlParser.Zonemap_nameContext ctx) {
    final var methodName = "exitZonemap_name";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitZonemap_refresh_clause(final PlSqlParser.Zonemap_refresh_clauseContext ctx) {
    final var methodName = "exitZonemap_refresh_clause";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  private List<ObjectField> getCurrentFieldList(final ParserRuleContext ctx) {
    final var methodName = "getCurrentFieldList";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, PlSqlParser.Column_definitionContext.class);

    final var terminalNode =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PlSqlParser.Column_nameContext.class)
            .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
            .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet());

    final var idExpressionChildrenList =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PlSqlParser.Column_nameContext.class)
            .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
            .listChildrenByClass(PlSqlParser.Id_expressionContext.class);

    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(idExpressionChildrenList)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));

    final var regularIdChildrenList =
        ParseTreeStream.parseTreeStream(idExpressionChildrenList)
            .listChildrenByClass(PlSqlParser.Regular_idContext.class);
    if (terminalNode.isEmpty()) {
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(regularIdChildrenList)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
    }
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(regularIdChildrenList)
            .streamChildrenByClass(PlSqlParser.Non_reserved_keywords_in_12cContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(regularIdChildrenList)
            .streamChildrenByClass(PlSqlParser.Non_reserved_keywords_pre12cContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));

    return terminalNode.stream()
        .map(child -> ParseTreeHelper.getField(currentTable, child))
        .collect(Collectors.toList());
  }

  private ObjectRelationship getCurrentRelationship(final ParserRuleContext ctx) {
    final var methodName = "getCurrentRelationshipList";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, PlSqlParser.Column_definitionContext.class);
    final var terminalNode =
        new ArrayList<>(
            ParseTreeStream.parseTreeStream(parentContext)
                .streamChildrenByClass(PlSqlParser.Inline_constraintContext.class)
                .streamChildrenByClass(PlSqlParser.References_clauseContext.class)
                .filter(TerminalNode.class::isInstance)
                .map(
                    foreignTerminalNode -> {
                      final List<ParseTree> returnValue = new ArrayList<ParseTree>();
                      if (StringUtils.equalsAnyIgnoreCase(
                          "REFERENCES", foreignTerminalNode.getText())) {
                        returnValue.addAll(
                            ParseTreeStream.parseTreeStream(parentContext)
                                .streamChildrenByClass(PlSqlParser.Inline_constraintContext.class)
                                .streamChildrenByClass(PlSqlParser.Constraint_nameContext.class)
                                .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
                                .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
                                .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
                                .filter(TerminalNode.class::isInstance)
                                .collect(Collectors.toList()));
                        if (returnValue.isEmpty()) {
                          returnValue.addAll(
                              ParseTreeStream.parseTreeStream(parentContext)
                                  .streamChildrenByClass(PlSqlParser.Column_nameContext.class)
                                  .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
                                  .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
                                  .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
                                  .listAllTerminalNode()
                                  .stream()
                                  .collect(Collectors.toList()));
                        }
                      }
                      return returnValue;
                    })
                .flatMap(List::stream)
                .collect(Collectors.toList()));
    final var parentContext2 =
        ParseTreeHelper.getParentContext(ctx, PlSqlParser.Out_of_line_constraintContext.class);
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(parentContext2)
            .streamChildrenByClass(PlSqlParser.Constraint_nameContext.class)
            .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
            .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
            .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toList()));
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(parentContext2)
            .streamChildrenByClass(PlSqlParser.Foreign_key_clauseContext.class)
            .streamChildrenByClass(PlSqlParser.References_clauseContext.class)
            .streamChildrenByClass(PlSqlParser.Tableview_nameContext.class)
            .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
            .streamChildrenByClass(PlSqlParser.Id_expressionContext.class)
            .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toList()));

    if (0 < terminalNode.size()) {
      return ParseTreeHelper.getRelationship(currentTable, terminalNode.get(0));
    }
    return null;
  }

  private SqlContext getCurrentTable(final ParserRuleContext ctx) {
    final var methodName = "getCurrentTable";
    PlSqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, PlSqlParser.Create_tableContext.class);
    if (parentContext == null || parentContext.children == null) {
      return null;
    }

    var idExpressionChildrenList =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PlSqlParser.Schema_nameContext.class)
            .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
            .listChildrenByClass(PlSqlParser.Id_expressionContext.class);

    final var terminalNodeTextList =
        ParseTreeStream.parseTreeStream(idExpressionChildrenList)
            .streamTerminalNodeString()
            .collect(Collectors.toList());

    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(idExpressionChildrenList)
            .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));

    idExpressionChildrenList =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(PlSqlParser.Table_nameContext.class)
            .streamChildrenByClass(PlSqlParser.IdentifierContext.class)
            .listChildrenByClass(PlSqlParser.Id_expressionContext.class);

    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(idExpressionChildrenList)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(idExpressionChildrenList)
            .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(idExpressionChildrenList)
            .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
            .streamChildrenByClass(PlSqlParser.Non_reserved_keywords_pre12cContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.toList()));
    terminalNodeTextList.addAll(
        ParseTreeStream.parseTreeStream(idExpressionChildrenList)
            .streamChildrenByClass(PlSqlParser.Regular_idContext.class)
            .streamChildrenByClass(PlSqlParser.Non_reserved_keywords_in_12cContext.class)
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
    PlSqlParserListenerImpl.traceChildren(methodName, node);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void visitTerminal(final TerminalNode node) {
    final var methodName = "visitTerminal";
    PlSqlParserListenerImpl.traceChildren(methodName, node);

    PlSqlParserListenerImpl.input = node.getSymbol().getInputStream();
  }
}
