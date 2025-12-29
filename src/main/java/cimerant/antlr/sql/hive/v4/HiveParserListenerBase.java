package cimerant.antlr.sql.hive.v4;

import cimerant.antlr.sql.ParseTreeHelper;
import cimerant.logger.CimerantLogger;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import sql.hive.v4.HiveParser;
import sql.hive.v4.HiveParserBaseListener;

public class HiveParserListenerBase extends HiveParserBaseListener {
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(HiveParserListenerBase.class.getName());
  }

  private static void traceChildren(final String methodName, final ParseTree ctx) {
    if (HiveParserListenerBase.logger.isTraceEnabled()) {
      ParseTreeHelper.printChildren(methodName, ctx);
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAbortCompactionStatement(final HiveParser.AbortCompactionStatementContext ctx) {
    final var methodName = "enterAbortCompactionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAbortTransactionStatement(
      final HiveParser.AbortTransactionStatementContext ctx) {
    final var methodName = "enterAbortTransactionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterActivate(final HiveParser.ActivateContext ctx) {
    final var methodName = "enterActivate";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdminOptionFor(final HiveParser.AdminOptionForContext ctx) {
    final var methodName = "enterAdminOptionFor";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAliasList(final HiveParser.AliasListContext ctx) {
    final var methodName = "enterAliasList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAll_distinct(final HiveParser.All_distinctContext ctx) {
    final var methodName = "enterAll_distinct";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterColConstraint(final HiveParser.AlterColConstraintContext ctx) {
    final var methodName = "enterAlterColConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterColumnConstraint(final HiveParser.AlterColumnConstraintContext ctx) {
    final var methodName = "enterAlterColumnConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterConstraintWithName(final HiveParser.AlterConstraintWithNameContext ctx) {
    final var methodName = "enterAlterConstraintWithName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterDatabaseStatementSuffix(
      final HiveParser.AlterDatabaseStatementSuffixContext ctx) {
    final var methodName = "enterAlterDatabaseStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterDatabaseSuffixProperties(
      final HiveParser.AlterDatabaseSuffixPropertiesContext ctx) {
    final var methodName = "enterAlterDatabaseSuffixProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterDatabaseSuffixSetLocation(
      final HiveParser.AlterDatabaseSuffixSetLocationContext ctx) {
    final var methodName = "enterAlterDatabaseSuffixSetLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterDatabaseSuffixSetManagedLocation(
      final HiveParser.AlterDatabaseSuffixSetManagedLocationContext ctx) {
    final var methodName = "enterAlterDatabaseSuffixSetManagedLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterDatabaseSuffixSetOwner(
      final HiveParser.AlterDatabaseSuffixSetOwnerContext ctx) {
    final var methodName = "enterAlterDatabaseSuffixSetOwner";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterDataConnectorStatementSuffix(
      final HiveParser.AlterDataConnectorStatementSuffixContext ctx) {
    final var methodName = "enterAlterDataConnectorStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterDataConnectorSuffixProperties(
      final HiveParser.AlterDataConnectorSuffixPropertiesContext ctx) {
    final var methodName = "enterAlterDataConnectorSuffixProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterDataConnectorSuffixSetOwner(
      final HiveParser.AlterDataConnectorSuffixSetOwnerContext ctx) {
    final var methodName = "enterAlterDataConnectorSuffixSetOwner";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterDataConnectorSuffixSetUrl(
      final HiveParser.AlterDataConnectorSuffixSetUrlContext ctx) {
    final var methodName = "enterAlterDataConnectorSuffixSetUrl";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterForeignKeyConstraint(
      final HiveParser.AlterForeignKeyConstraintContext ctx) {
    final var methodName = "enterAlterForeignKeyConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterForeignKeyWithName(final HiveParser.AlterForeignKeyWithNameContext ctx) {
    final var methodName = "enterAlterForeignKeyWithName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterMappingStatement(final HiveParser.AlterMappingStatementContext ctx) {
    final var methodName = "enterAlterMappingStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterMaterializedViewStatementSuffix(
      final HiveParser.AlterMaterializedViewStatementSuffixContext ctx) {
    final var methodName = "enterAlterMaterializedViewStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterMaterializedViewSuffixRebuild(
      final HiveParser.AlterMaterializedViewSuffixRebuildContext ctx) {
    final var methodName = "enterAlterMaterializedViewSuffixRebuild";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterMaterializedViewSuffixRewrite(
      final HiveParser.AlterMaterializedViewSuffixRewriteContext ctx) {
    final var methodName = "enterAlterMaterializedViewSuffixRewrite";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterPoolStatement(final HiveParser.AlterPoolStatementContext ctx) {
    final var methodName = "enterAlterPoolStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterResourcePlanStatement(
      final HiveParser.AlterResourcePlanStatementContext ctx) {
    final var methodName = "enterAlterResourcePlanStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterScheduledQueryChange(
      final HiveParser.AlterScheduledQueryChangeContext ctx) {
    final var methodName = "enterAlterScheduledQueryChange";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterScheduledQueryStatement(
      final HiveParser.AlterScheduledQueryStatementContext ctx) {
    final var methodName = "enterAlterScheduledQueryStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatement(final HiveParser.AlterStatementContext ctx) {
    final var methodName = "enterAlterStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementChangeColPosition(
      final HiveParser.AlterStatementChangeColPositionContext ctx) {
    final var methodName = "enterAlterStatementChangeColPosition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementPartitionKeyType(
      final HiveParser.AlterStatementPartitionKeyTypeContext ctx) {
    final var methodName = "enterAlterStatementPartitionKeyType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixAddCol(
      final HiveParser.AlterStatementSuffixAddColContext ctx) {
    final var methodName = "enterAlterStatementSuffixAddCol";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixAddConstraint(
      final HiveParser.AlterStatementSuffixAddConstraintContext ctx) {
    final var methodName = "enterAlterStatementSuffixAddConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixAddPartitions(
      final HiveParser.AlterStatementSuffixAddPartitionsContext ctx) {
    final var methodName = "enterAlterStatementSuffixAddPartitions";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixAddPartitionsElement(
      final HiveParser.AlterStatementSuffixAddPartitionsElementContext ctx) {
    final var methodName = "enterAlterStatementSuffixAddPartitionsElement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixArchive(
      final HiveParser.AlterStatementSuffixArchiveContext ctx) {
    final var methodName = "enterAlterStatementSuffixArchive";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixBucketNum(
      final HiveParser.AlterStatementSuffixBucketNumContext ctx) {
    final var methodName = "enterAlterStatementSuffixBucketNum";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixClusterbySortby(
      final HiveParser.AlterStatementSuffixClusterbySortbyContext ctx) {
    final var methodName = "enterAlterStatementSuffixClusterbySortby";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixCompact(
      final HiveParser.AlterStatementSuffixCompactContext ctx) {
    final var methodName = "enterAlterStatementSuffixCompact";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixDropConstraint(
      final HiveParser.AlterStatementSuffixDropConstraintContext ctx) {
    final var methodName = "enterAlterStatementSuffixDropConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixDropPartitions(
      final HiveParser.AlterStatementSuffixDropPartitionsContext ctx) {
    final var methodName = "enterAlterStatementSuffixDropPartitions";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixExchangePartition(
      final HiveParser.AlterStatementSuffixExchangePartitionContext ctx) {
    final var methodName = "enterAlterStatementSuffixExchangePartition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixExecute(
      final HiveParser.AlterStatementSuffixExecuteContext ctx) {
    final var methodName = "enterAlterStatementSuffixExecute";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixFileFormat(
      final HiveParser.AlterStatementSuffixFileFormatContext ctx) {
    final var methodName = "enterAlterStatementSuffixFileFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixLocation(
      final HiveParser.AlterStatementSuffixLocationContext ctx) {
    final var methodName = "enterAlterStatementSuffixLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixMergeFiles(
      final HiveParser.AlterStatementSuffixMergeFilesContext ctx) {
    final var methodName = "enterAlterStatementSuffixMergeFiles";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixProperties(
      final HiveParser.AlterStatementSuffixPropertiesContext ctx) {
    final var methodName = "enterAlterStatementSuffixProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixRename(
      final HiveParser.AlterStatementSuffixRenameContext ctx) {
    final var methodName = "enterAlterStatementSuffixRename";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixRenameCol(
      final HiveParser.AlterStatementSuffixRenameColContext ctx) {
    final var methodName = "enterAlterStatementSuffixRenameCol";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixRenamePart(
      final HiveParser.AlterStatementSuffixRenamePartContext ctx) {
    final var methodName = "enterAlterStatementSuffixRenamePart";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixSerdeProperties(
      final HiveParser.AlterStatementSuffixSerdePropertiesContext ctx) {
    final var methodName = "enterAlterStatementSuffixSerdeProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixSetOwner(
      final HiveParser.AlterStatementSuffixSetOwnerContext ctx) {
    final var methodName = "enterAlterStatementSuffixSetOwner";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixSetPartSpec(
      final HiveParser.AlterStatementSuffixSetPartSpecContext ctx) {
    final var methodName = "enterAlterStatementSuffixSetPartSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixSkewedby(
      final HiveParser.AlterStatementSuffixSkewedbyContext ctx) {
    final var methodName = "enterAlterStatementSuffixSkewedby";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixStatsPart(
      final HiveParser.AlterStatementSuffixStatsPartContext ctx) {
    final var methodName = "enterAlterStatementSuffixStatsPart";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixTouch(
      final HiveParser.AlterStatementSuffixTouchContext ctx) {
    final var methodName = "enterAlterStatementSuffixTouch";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixUnArchive(
      final HiveParser.AlterStatementSuffixUnArchiveContext ctx) {
    final var methodName = "enterAlterStatementSuffixUnArchive";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixUpdateColumns(
      final HiveParser.AlterStatementSuffixUpdateColumnsContext ctx) {
    final var methodName = "enterAlterStatementSuffixUpdateColumns";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixUpdateStats(
      final HiveParser.AlterStatementSuffixUpdateStatsContext ctx) {
    final var methodName = "enterAlterStatementSuffixUpdateStats";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatementSuffixUpdateStatsCol(
      final HiveParser.AlterStatementSuffixUpdateStatsColContext ctx) {
    final var methodName = "enterAlterStatementSuffixUpdateStatsCol";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterTableStatementSuffix(
      final HiveParser.AlterTableStatementSuffixContext ctx) {
    final var methodName = "enterAlterTableStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterTblPartitionStatementSuffix(
      final HiveParser.AlterTblPartitionStatementSuffixContext ctx) {
    final var methodName = "enterAlterTblPartitionStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterTblPartitionStatementSuffixSkewedLocation(
      final HiveParser.AlterTblPartitionStatementSuffixSkewedLocationContext ctx) {
    final var methodName = "enterAlterTblPartitionStatementSuffixSkewedLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterTriggerStatement(final HiveParser.AlterTriggerStatementContext ctx) {
    final var methodName = "enterAlterTriggerStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterViewStatementSuffix(final HiveParser.AlterViewStatementSuffixContext ctx) {
    final var methodName = "enterAlterViewStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterViewSuffixProperties(
      final HiveParser.AlterViewSuffixPropertiesContext ctx) {
    final var methodName = "enterAlterViewSuffixProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAnalyzeStatement(final HiveParser.AnalyzeStatementContext ctx) {
    final var methodName = "enterAnalyzeStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAsOfClause(final HiveParser.AsOfClauseContext ctx) {
    final var methodName = "enterAsOfClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAtomExpression(final HiveParser.AtomExpressionContext ctx) {
    final var methodName = "enterAtomExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAtomjoinSource(final HiveParser.AtomjoinSourceContext ctx) {
    final var methodName = "enterAtomjoinSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAtomSelectStatement(final HiveParser.AtomSelectStatementContext ctx) {
    final var methodName = "enterAtomSelectStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBlocking(final HiveParser.BlockingContext ctx) {
    final var methodName = "enterBlocking";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBody(final HiveParser.BodyContext ctx) {
    final var methodName = "enterBody";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBooleanValue(final HiveParser.BooleanValueContext ctx) {
    final var methodName = "enterBooleanValue";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBooleanValueTok(final HiveParser.BooleanValueTokContext ctx) {
    final var methodName = "enterBooleanValueTok";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseExpression(final HiveParser.CaseExpressionContext ctx) {
    final var methodName = "enterCaseExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCastExpression(final HiveParser.CastExpressionContext ctx) {
    final var methodName = "enterCastExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharSetStringLiteral(final HiveParser.CharSetStringLiteralContext ctx) {
    final var methodName = "enterCharSetStringLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheckConstraint(final HiveParser.CheckConstraintContext ctx) {
    final var methodName = "enterCheckConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClusterByClause(final HiveParser.ClusterByClauseContext ctx) {
    final var methodName = "enterClusterByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColConstraint(final HiveParser.ColConstraintContext ctx) {
    final var methodName = "enterColConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColType(final HiveParser.ColTypeContext ctx) {
    final var methodName = "enterColType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColTypeList(final HiveParser.ColTypeListContext ctx) {
    final var methodName = "enterColTypeList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnAssignmentClause(final HiveParser.ColumnAssignmentClauseContext ctx) {
    final var methodName = "enterColumnAssignmentClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnConstraint(final HiveParser.ColumnConstraintContext ctx) {
    final var methodName = "enterColumnConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnConstraintType(final HiveParser.ColumnConstraintTypeContext ctx) {
    final var methodName = "enterColumnConstraintType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnName(final HiveParser.ColumnNameContext ctx) {
    final var methodName = "enterColumnName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameColonType(final HiveParser.ColumnNameColonTypeContext ctx) {
    final var methodName = "enterColumnNameColonType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameColonTypeList(final HiveParser.ColumnNameColonTypeListContext ctx) {
    final var methodName = "enterColumnNameColonTypeList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameComment(final HiveParser.ColumnNameCommentContext ctx) {
    final var methodName = "enterColumnNameComment";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameCommentList(final HiveParser.ColumnNameCommentListContext ctx) {
    final var methodName = "enterColumnNameCommentList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameList(final HiveParser.ColumnNameListContext ctx) {
    final var methodName = "enterColumnNameList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameOrder(final HiveParser.ColumnNameOrderContext ctx) {
    final var methodName = "enterColumnNameOrder";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameOrderList(final HiveParser.ColumnNameOrderListContext ctx) {
    final var methodName = "enterColumnNameOrderList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameTransformConstraint(
      final HiveParser.ColumnNameTransformConstraintContext ctx) {
    final var methodName = "enterColumnNameTransformConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameType(final HiveParser.ColumnNameTypeContext ctx) {
    final var methodName = "enterColumnNameType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameTypeConstraint(final HiveParser.ColumnNameTypeConstraintContext ctx) {
    final var methodName = "enterColumnNameTypeConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameTypeList(final HiveParser.ColumnNameTypeListContext ctx) {
    final var methodName = "enterColumnNameTypeList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameTypeOrConstraint(
      final HiveParser.ColumnNameTypeOrConstraintContext ctx) {
    final var methodName = "enterColumnNameTypeOrConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameTypeOrConstraintList(
      final HiveParser.ColumnNameTypeOrConstraintListContext ctx) {
    final var methodName = "enterColumnNameTypeOrConstraintList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnParenthesesList(final HiveParser.ColumnParenthesesListContext ctx) {
    final var methodName = "enterColumnParenthesesList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnRefOrder(final HiveParser.ColumnRefOrderContext ctx) {
    final var methodName = "enterColumnRefOrder";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnRefOrderInParenthesis(
      final HiveParser.ColumnRefOrderInParenthesisContext ctx) {
    final var methodName = "enterColumnRefOrderInParenthesis";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnRefOrderNotInParenthesis(
      final HiveParser.ColumnRefOrderNotInParenthesisContext ctx) {
    final var methodName = "enterColumnRefOrderNotInParenthesis";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommitStatement(final HiveParser.CommitStatementContext ctx) {
    final var methodName = "enterCommitStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompactionId(final HiveParser.CompactionIdContext ctx) {
    final var methodName = "enterCompactionId";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompactionPool(final HiveParser.CompactionPoolContext ctx) {
    final var methodName = "enterCompactionPool";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompactionStatus(final HiveParser.CompactionStatusContext ctx) {
    final var methodName = "enterCompactionStatus";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompactionType(final HiveParser.CompactionTypeContext ctx) {
    final var methodName = "enterCompactionType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompactPool(final HiveParser.CompactPoolContext ctx) {
    final var methodName = "enterCompactPool";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComparisionOperator(final HiveParser.ComparisionOperatorContext ctx) {
    final var methodName = "enterComparisionOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstant(final HiveParser.ConstantContext ctx) {
    final var methodName = "enterConstant";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraintOptsAlter(final HiveParser.ConstraintOptsAlterContext ctx) {
    final var methodName = "enterConstraintOptsAlter";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraintOptsCreate(final HiveParser.ConstraintOptsCreateContext ctx) {
    final var methodName = "enterConstraintOptsCreate";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateConstraint(final HiveParser.CreateConstraintContext ctx) {
    final var methodName = "enterCreateConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateDatabaseStatement(final HiveParser.CreateDatabaseStatementContext ctx) {
    final var methodName = "enterCreateDatabaseStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateDataConnectorStatement(
      final HiveParser.CreateDataConnectorStatementContext ctx) {
    final var methodName = "enterCreateDataConnectorStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateForeignKey(final HiveParser.CreateForeignKeyContext ctx) {
    final var methodName = "enterCreateForeignKey";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateFunctionStatement(final HiveParser.CreateFunctionStatementContext ctx) {
    final var methodName = "enterCreateFunctionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateMacroStatement(final HiveParser.CreateMacroStatementContext ctx) {
    final var methodName = "enterCreateMacroStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateMappingStatement(final HiveParser.CreateMappingStatementContext ctx) {
    final var methodName = "enterCreateMappingStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateMaterializedViewStatement(
      final HiveParser.CreateMaterializedViewStatementContext ctx) {
    final var methodName = "enterCreateMaterializedViewStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatePoolStatement(final HiveParser.CreatePoolStatementContext ctx) {
    final var methodName = "enterCreatePoolStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateResourcePlanStatement(
      final HiveParser.CreateResourcePlanStatementContext ctx) {
    final var methodName = "enterCreateResourcePlanStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateRoleStatement(final HiveParser.CreateRoleStatementContext ctx) {
    final var methodName = "enterCreateRoleStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateScheduledQueryStatement(
      final HiveParser.CreateScheduledQueryStatementContext ctx) {
    final var methodName = "enterCreateScheduledQueryStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTablePartitionColumnSpec(
      final HiveParser.CreateTablePartitionColumnSpecContext ctx) {
    final var methodName = "enterCreateTablePartitionColumnSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTablePartitionColumnTypeSpec(
      final HiveParser.CreateTablePartitionColumnTypeSpecContext ctx) {
    final var methodName = "enterCreateTablePartitionColumnTypeSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTablePartitionSpec(final HiveParser.CreateTablePartitionSpecContext ctx) {
    final var methodName = "enterCreateTablePartitionSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTableStatement(final HiveParser.CreateTableStatementContext ctx) {
    final var methodName = "enterCreateTableStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTriggerStatement(final HiveParser.CreateTriggerStatementContext ctx) {
    final var methodName = "enterCreateTriggerStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateViewStatement(final HiveParser.CreateViewStatementContext ctx) {
    final var methodName = "enterCreateViewStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCteStatement(final HiveParser.CteStatementContext ctx) {
    final var methodName = "enterCteStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatabaseComment(final HiveParser.DatabaseCommentContext ctx) {
    final var methodName = "enterDatabaseComment";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDataConnectorComment(final HiveParser.DataConnectorCommentContext ctx) {
    final var methodName = "enterDataConnectorComment";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDataConnectorType(final HiveParser.DataConnectorTypeContext ctx) {
    final var methodName = "enterDataConnectorType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDataConnectorUrl(final HiveParser.DataConnectorUrlContext ctx) {
    final var methodName = "enterDataConnectorUrl";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDateLiteral(final HiveParser.DateLiteralContext ctx) {
    final var methodName = "enterDateLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDb_schema(final HiveParser.Db_schemaContext ctx) {
    final var methodName = "enterDb_schema";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDbConnectorName(final HiveParser.DbConnectorNameContext ctx) {
    final var methodName = "enterDbConnectorName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDbLocation(final HiveParser.DbLocationContext ctx) {
    final var methodName = "enterDbLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDbManagedLocation(final HiveParser.DbManagedLocationContext ctx) {
    final var methodName = "enterDbManagedLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDbProperties(final HiveParser.DbPropertiesContext ctx) {
    final var methodName = "enterDbProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDbPropertiesList(final HiveParser.DbPropertiesListContext ctx) {
    final var methodName = "enterDbPropertiesList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDcProperties(final HiveParser.DcPropertiesContext ctx) {
    final var methodName = "enterDcProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDdlStatement(final HiveParser.DdlStatementContext ctx) {
    final var methodName = "enterDdlStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefaultVal(final HiveParser.DefaultValContext ctx) {
    final var methodName = "enterDefaultVal";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefaultValue(final HiveParser.DefaultValueContext ctx) {
    final var methodName = "enterDefaultValue";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefinedAsSpec(final HiveParser.DefinedAsSpecContext ctx) {
    final var methodName = "enterDefinedAsSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeleteStatement(final HiveParser.DeleteStatementContext ctx) {
    final var methodName = "enterDeleteStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescFuncNames(final HiveParser.DescFuncNamesContext ctx) {
    final var methodName = "enterDescFuncNames";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescStatement(final HiveParser.DescStatementContext ctx) {
    final var methodName = "enterDescStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDestination(final HiveParser.DestinationContext ctx) {
    final var methodName = "enterDestination";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDisable(final HiveParser.DisableContext ctx) {
    final var methodName = "enterDisable";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDistributeByClause(final HiveParser.DistributeByClauseContext ctx) {
    final var methodName = "enterDistributeByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropDatabaseStatement(final HiveParser.DropDatabaseStatementContext ctx) {
    final var methodName = "enterDropDatabaseStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropDataConnectorStatement(
      final HiveParser.DropDataConnectorStatementContext ctx) {
    final var methodName = "enterDropDataConnectorStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropFunctionStatement(final HiveParser.DropFunctionStatementContext ctx) {
    final var methodName = "enterDropFunctionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropMacroStatement(final HiveParser.DropMacroStatementContext ctx) {
    final var methodName = "enterDropMacroStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropMappingStatement(final HiveParser.DropMappingStatementContext ctx) {
    final var methodName = "enterDropMappingStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropMaterializedViewStatement(
      final HiveParser.DropMaterializedViewStatementContext ctx) {
    final var methodName = "enterDropMaterializedViewStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropPoolStatement(final HiveParser.DropPoolStatementContext ctx) {
    final var methodName = "enterDropPoolStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropResourcePlanStatement(
      final HiveParser.DropResourcePlanStatementContext ctx) {
    final var methodName = "enterDropResourcePlanStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropRoleStatement(final HiveParser.DropRoleStatementContext ctx) {
    final var methodName = "enterDropRoleStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropScheduledQueryStatement(
      final HiveParser.DropScheduledQueryStatementContext ctx) {
    final var methodName = "enterDropScheduledQueryStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropTableStatement(final HiveParser.DropTableStatementContext ctx) {
    final var methodName = "enterDropTableStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropTriggerStatement(final HiveParser.DropTriggerStatementContext ctx) {
    final var methodName = "enterDropTriggerStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropViewStatement(final HiveParser.DropViewStatementContext ctx) {
    final var methodName = "enterDropViewStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnable(final HiveParser.EnableContext ctx) {
    final var methodName = "enterEnable";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnableSpecification(final HiveParser.EnableSpecificationContext ctx) {
    final var methodName = "enterEnableSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnableValidateSpecification(
      final HiveParser.EnableValidateSpecificationContext ctx) {
    final var methodName = "enterEnableValidateSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnforcedSpecification(final HiveParser.EnforcedSpecificationContext ctx) {
    final var methodName = "enterEnforcedSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    final var methodName = "enterEveryRule";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecStatement(final HiveParser.ExecStatementContext ctx) {
    final var methodName = "enterExecStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecutedAsSpec(final HiveParser.ExecutedAsSpecContext ctx) {
    final var methodName = "enterExecutedAsSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecuteParamList(final HiveParser.ExecuteParamListContext ctx) {
    final var methodName = "enterExecuteParamList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecuteStatement(final HiveParser.ExecuteStatementContext ctx) {
    final var methodName = "enterExecuteStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplainOption(final HiveParser.ExplainOptionContext ctx) {
    final var methodName = "enterExplainOption";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplainStatement(final HiveParser.ExplainStatementContext ctx) {
    final var methodName = "enterExplainStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExportStatement(final HiveParser.ExportStatementContext ctx) {
    final var methodName = "enterExportStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpression(final HiveParser.ExpressionContext ctx) {
    final var methodName = "enterExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionList(final HiveParser.ExpressionListContext ctx) {
    final var methodName = "enterExpressionList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionOrDefault(final HiveParser.ExpressionOrDefaultContext ctx) {
    final var methodName = "enterExpressionOrDefault";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionPart(final HiveParser.ExpressionPartContext ctx) {
    final var methodName = "enterExpressionPart";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressions(final HiveParser.ExpressionsContext ctx) {
    final var methodName = "enterExpressions";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionsInParenthesis(final HiveParser.ExpressionsInParenthesisContext ctx) {
    final var methodName = "enterExpressionsInParenthesis";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionsNotInParenthesis(
      final HiveParser.ExpressionsNotInParenthesisContext ctx) {
    final var methodName = "enterExpressionsNotInParenthesis";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionWithAlias(final HiveParser.ExpressionWithAliasContext ctx) {
    final var methodName = "enterExpressionWithAlias";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExtColumnName(final HiveParser.ExtColumnNameContext ctx) {
    final var methodName = "enterExtColumnName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExtractExpression(final HiveParser.ExtractExpressionContext ctx) {
    final var methodName = "enterExtractExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFileFormat(final HiveParser.FileFormatContext ctx) {
    final var methodName = "enterFileFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFirstExpressionsWithAlias(
      final HiveParser.FirstExpressionsWithAliasContext ctx) {
    final var methodName = "enterFirstExpressionsWithAlias";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFirstValueRowConstructor(final HiveParser.FirstValueRowConstructorContext ctx) {
    final var methodName = "enterFirstValueRowConstructor";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFloorDateQualifiers(final HiveParser.FloorDateQualifiersContext ctx) {
    final var methodName = "enterFloorDateQualifiers";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFloorExpression(final HiveParser.FloorExpressionContext ctx) {
    final var methodName = "enterFloorExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForce(final HiveParser.ForceContext ctx) {
    final var methodName = "enterForce";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForeignKeyConstraint(final HiveParser.ForeignKeyConstraintContext ctx) {
    final var methodName = "enterForeignKeyConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrom_in(final HiveParser.From_inContext ctx) {
    final var methodName = "enterFrom_in";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFromClause(final HiveParser.FromClauseContext ctx) {
    final var methodName = "enterFromClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFromSource(final HiveParser.FromSourceContext ctx) {
    final var methodName = "enterFromSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFromStatement(final HiveParser.FromStatementContext ctx) {
    final var methodName = "enterFromStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_(final HiveParser.Function_Context ctx) {
    final var methodName = "enterFunction_";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionIdentifier(final HiveParser.FunctionIdentifierContext ctx) {
    final var methodName = "enterFunctionIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionName(final HiveParser.FunctionNameContext ctx) {
    final var methodName = "enterFunctionName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGlobalWmStatement(final HiveParser.GlobalWmStatementContext ctx) {
    final var methodName = "enterGlobalWmStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantOptionFor(final HiveParser.GrantOptionForContext ctx) {
    final var methodName = "enterGrantOptionFor";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantPrivileges(final HiveParser.GrantPrivilegesContext ctx) {
    final var methodName = "enterGrantPrivileges";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantRole(final HiveParser.GrantRoleContext ctx) {
    final var methodName = "enterGrantRole";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupby_expression(final HiveParser.Groupby_expressionContext ctx) {
    final var methodName = "enterGroupby_expression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupByClause(final HiveParser.GroupByClauseContext ctx) {
    final var methodName = "enterGroupByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupByEmpty(final HiveParser.GroupByEmptyContext ctx) {
    final var methodName = "enterGroupByEmpty";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupingExpressionSingle(final HiveParser.GroupingExpressionSingleContext ctx) {
    final var methodName = "enterGroupingExpressionSingle";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupingSetExpression(final HiveParser.GroupingSetExpressionContext ctx) {
    final var methodName = "enterGroupingSetExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupingSetExpressionMultiple(
      final HiveParser.GroupingSetExpressionMultipleContext ctx) {
    final var methodName = "enterGroupingSetExpressionMultiple";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHavingClause(final HiveParser.HavingClauseContext ctx) {
    final var methodName = "enterHavingClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHavingCondition(final HiveParser.HavingConditionContext ctx) {
    final var methodName = "enterHavingCondition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHint(final HiveParser.HintContext ctx) {
    final var methodName = "enterHint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHintArgName(final HiveParser.HintArgNameContext ctx) {
    final var methodName = "enterHintArgName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHintArgs(final HiveParser.HintArgsContext ctx) {
    final var methodName = "enterHintArgs";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHintItem(final HiveParser.HintItemContext ctx) {
    final var methodName = "enterHintItem";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHintList(final HiveParser.HintListContext ctx) {
    final var methodName = "enterHintList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHintName(final HiveParser.HintNameContext ctx) {
    final var methodName = "enterHintName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterId_(final HiveParser.Id_Context ctx) {
    final var methodName = "enterId_";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIfExists(final HiveParser.IfExistsContext ctx) {
    final var methodName = "enterIfExists";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIfNotExists(final HiveParser.IfNotExistsContext ctx) {
    final var methodName = "enterIfNotExists";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImportStatement(final HiveParser.ImportStatementContext ctx) {
    final var methodName = "enterImportStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInputFileFormat(final HiveParser.InputFileFormatContext ctx) {
    final var methodName = "enterInputFileFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsertClause(final HiveParser.InsertClauseContext ctx) {
    final var methodName = "enterInsertClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalExpression(final HiveParser.IntervalExpressionContext ctx) {
    final var methodName = "enterIntervalExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalLiteral(final HiveParser.IntervalLiteralContext ctx) {
    final var methodName = "enterIntervalLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalQualifiers(final HiveParser.IntervalQualifiersContext ctx) {
    final var methodName = "enterIntervalQualifiers";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalValue(final HiveParser.IntervalValueContext ctx) {
    final var methodName = "enterIntervalValue";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIsCondition(final HiveParser.IsConditionContext ctx) {
    final var methodName = "enterIsCondition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIsolationLevel(final HiveParser.IsolationLevelContext ctx) {
    final var methodName = "enterIsolationLevel";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoinSource(final HiveParser.JoinSourceContext ctx) {
    final var methodName = "enterJoinSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoinSourcePart(final HiveParser.JoinSourcePartContext ctx) {
    final var methodName = "enterJoinSourcePart";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoinToken(final HiveParser.JoinTokenContext ctx) {
    final var methodName = "enterJoinToken";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKeyProperty(final HiveParser.KeyPropertyContext ctx) {
    final var methodName = "enterKeyProperty";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKeyValueProperty(final HiveParser.KeyValuePropertyContext ctx) {
    final var methodName = "enterKeyValueProperty";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKillQueryStatement(final HiveParser.KillQueryStatementContext ctx) {
    final var methodName = "enterKillQueryStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLateralView(final HiveParser.LateralViewContext ctx) {
    final var methodName = "enterLateralView";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevelOfIsolation(final HiveParser.LevelOfIsolationContext ctx) {
    final var methodName = "enterLevelOfIsolation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLikeTableOrFile(final HiveParser.LikeTableOrFileContext ctx) {
    final var methodName = "enterLikeTableOrFile";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLimitClause(final HiveParser.LimitClauseContext ctx) {
    final var methodName = "enterLimitClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterListType(final HiveParser.ListTypeContext ctx) {
    final var methodName = "enterListType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoadStatement(final HiveParser.LoadStatementContext ctx) {
    final var methodName = "enterLoadStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockDatabase(final HiveParser.LockDatabaseContext ctx) {
    final var methodName = "enterLockDatabase";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockMode(final HiveParser.LockModeContext ctx) {
    final var methodName = "enterLockMode";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockStatement(final HiveParser.LockStatementContext ctx) {
    final var methodName = "enterLockStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMapType(final HiveParser.MapTypeContext ctx) {
    final var methodName = "enterMapType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMergeStatement(final HiveParser.MergeStatementContext ctx) {
    final var methodName = "enterMergeStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMetastoreCheck(final HiveParser.MetastoreCheckContext ctx) {
    final var methodName = "enterMetastoreCheck";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNonReserved(final HiveParser.NonReservedContext ctx) {
    final var methodName = "enterNonReserved";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNull_treatment(final HiveParser.Null_treatmentContext ctx) {
    final var methodName = "enterNull_treatment";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNullOrdering(final HiveParser.NullOrderingContext ctx) {
    final var methodName = "enterNullOrdering";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrderByClause(final HiveParser.OrderByClauseContext ctx) {
    final var methodName = "enterOrderByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrderSpecification(final HiveParser.OrderSpecificationContext ctx) {
    final var methodName = "enterOrderSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrderSpecificationRewrite(
      final HiveParser.OrderSpecificationRewriteContext ctx) {
    final var methodName = "enterOrderSpecificationRewrite";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrReplace(final HiveParser.OrReplaceContext ctx) {
    final var methodName = "enterOrReplace";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParameterIdx(final HiveParser.ParameterIdxContext ctx) {
    final var methodName = "enterParameterIdx";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionByClause(final HiveParser.PartitionByClauseContext ctx) {
    final var methodName = "enterPartitionByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionedTableFunction(final HiveParser.PartitionedTableFunctionContext ctx) {
    final var methodName = "enterPartitionedTableFunction";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitioningSpec(final HiveParser.PartitioningSpecContext ctx) {
    final var methodName = "enterPartitioningSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionLocation(final HiveParser.PartitionLocationContext ctx) {
    final var methodName = "enterPartitionLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionSelectorOperator(
      final HiveParser.PartitionSelectorOperatorContext ctx) {
    final var methodName = "enterPartitionSelectorOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionSelectorSpec(final HiveParser.PartitionSelectorSpecContext ctx) {
    final var methodName = "enterPartitionSelectorSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionSelectorVal(final HiveParser.PartitionSelectorValContext ctx) {
    final var methodName = "enterPartitionSelectorVal";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionSpec(final HiveParser.PartitionSpecContext ctx) {
    final var methodName = "enterPartitionSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionTableFunctionSource(
      final HiveParser.PartitionTableFunctionSourceContext ctx) {
    final var methodName = "enterPartitionTableFunctionSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionTransformSpec(final HiveParser.PartitionTransformSpecContext ctx) {
    final var methodName = "enterPartitionTransformSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionTransformType(final HiveParser.PartitionTransformTypeContext ctx) {
    final var methodName = "enterPartitionTransformType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionVal(final HiveParser.PartitionValContext ctx) {
    final var methodName = "enterPartitionVal";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartTypeExpr(final HiveParser.PartTypeExprContext ctx) {
    final var methodName = "enterPartTypeExpr";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPkUkConstraint(final HiveParser.PkUkConstraintContext ctx) {
    final var methodName = "enterPkUkConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPoolAssign(final HiveParser.PoolAssignContext ctx) {
    final var methodName = "enterPoolAssign";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPoolAssignList(final HiveParser.PoolAssignListContext ctx) {
    final var methodName = "enterPoolAssignList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPoolPath(final HiveParser.PoolPathContext ctx) {
    final var methodName = "enterPoolPath";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceAmpersandExpression(
      final HiveParser.PrecedenceAmpersandExpressionContext ctx) {
    final var methodName = "enterPrecedenceAmpersandExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceAmpersandOperator(
      final HiveParser.PrecedenceAmpersandOperatorContext ctx) {
    final var methodName = "enterPrecedenceAmpersandOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceAndExpression(final HiveParser.PrecedenceAndExpressionContext ctx) {
    final var methodName = "enterPrecedenceAndExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceAndOperator(final HiveParser.PrecedenceAndOperatorContext ctx) {
    final var methodName = "enterPrecedenceAndOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceBitwiseOrExpression(
      final HiveParser.PrecedenceBitwiseOrExpressionContext ctx) {
    final var methodName = "enterPrecedenceBitwiseOrExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceBitwiseOrOperator(
      final HiveParser.PrecedenceBitwiseOrOperatorContext ctx) {
    final var methodName = "enterPrecedenceBitwiseOrOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceBitwiseXorExpression(
      final HiveParser.PrecedenceBitwiseXorExpressionContext ctx) {
    final var methodName = "enterPrecedenceBitwiseXorExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceBitwiseXorOperator(
      final HiveParser.PrecedenceBitwiseXorOperatorContext ctx) {
    final var methodName = "enterPrecedenceBitwiseXorOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceConcatenateExpression(
      final HiveParser.PrecedenceConcatenateExpressionContext ctx) {
    final var methodName = "enterPrecedenceConcatenateExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceConcatenateOperator(
      final HiveParser.PrecedenceConcatenateOperatorContext ctx) {
    final var methodName = "enterPrecedenceConcatenateOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceDistinctOperator(
      final HiveParser.PrecedenceDistinctOperatorContext ctx) {
    final var methodName = "enterPrecedenceDistinctOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceEqualExpression(
      final HiveParser.PrecedenceEqualExpressionContext ctx) {
    final var methodName = "enterPrecedenceEqualExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceEqualOperator(final HiveParser.PrecedenceEqualOperatorContext ctx) {
    final var methodName = "enterPrecedenceEqualOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceFieldExpression(
      final HiveParser.PrecedenceFieldExpressionContext ctx) {
    final var methodName = "enterPrecedenceFieldExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceNotExpression(final HiveParser.PrecedenceNotExpressionContext ctx) {
    final var methodName = "enterPrecedenceNotExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceNotOperator(final HiveParser.PrecedenceNotOperatorContext ctx) {
    final var methodName = "enterPrecedenceNotOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceOrExpression(final HiveParser.PrecedenceOrExpressionContext ctx) {
    final var methodName = "enterPrecedenceOrExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceOrOperator(final HiveParser.PrecedenceOrOperatorContext ctx) {
    final var methodName = "enterPrecedenceOrOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedencePlusExpression(final HiveParser.PrecedencePlusExpressionContext ctx) {
    final var methodName = "enterPrecedencePlusExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedencePlusExpressionOrDefault(
      final HiveParser.PrecedencePlusExpressionOrDefaultContext ctx) {
    final var methodName = "enterPrecedencePlusExpressionOrDefault";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedencePlusOperator(final HiveParser.PrecedencePlusOperatorContext ctx) {
    final var methodName = "enterPrecedencePlusOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceRegexpOperator(final HiveParser.PrecedenceRegexpOperatorContext ctx) {
    final var methodName = "enterPrecedenceRegexpOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceSimilarExpression(
      final HiveParser.PrecedenceSimilarExpressionContext ctx) {
    final var methodName = "enterPrecedenceSimilarExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceSimilarExpressionAtom(
      final HiveParser.PrecedenceSimilarExpressionAtomContext ctx) {
    final var methodName = "enterPrecedenceSimilarExpressionAtom";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceSimilarExpressionIn(
      final HiveParser.PrecedenceSimilarExpressionInContext ctx) {
    final var methodName = "enterPrecedenceSimilarExpressionIn";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceSimilarExpressionMain(
      final HiveParser.PrecedenceSimilarExpressionMainContext ctx) {
    final var methodName = "enterPrecedenceSimilarExpressionMain";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceSimilarExpressionPart(
      final HiveParser.PrecedenceSimilarExpressionPartContext ctx) {
    final var methodName = "enterPrecedenceSimilarExpressionPart";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceSimilarExpressionPartNot(
      final HiveParser.PrecedenceSimilarExpressionPartNotContext ctx) {
    final var methodName = "enterPrecedenceSimilarExpressionPartNot";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceSimilarExpressionQuantifierPredicate(
      final HiveParser.PrecedenceSimilarExpressionQuantifierPredicateContext ctx) {
    final var methodName = "enterPrecedenceSimilarExpressionQuantifierPredicate";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceSimilarOperator(
      final HiveParser.PrecedenceSimilarOperatorContext ctx) {
    final var methodName = "enterPrecedenceSimilarOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceStarExpression(final HiveParser.PrecedenceStarExpressionContext ctx) {
    final var methodName = "enterPrecedenceStarExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceStarOperator(final HiveParser.PrecedenceStarOperatorContext ctx) {
    final var methodName = "enterPrecedenceStarOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceUnaryOperator(final HiveParser.PrecedenceUnaryOperatorContext ctx) {
    final var methodName = "enterPrecedenceUnaryOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceUnaryPrefixExpression(
      final HiveParser.PrecedenceUnaryPrefixExpressionContext ctx) {
    final var methodName = "enterPrecedenceUnaryPrefixExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceUnarySuffixExpression(
      final HiveParser.PrecedenceUnarySuffixExpressionContext ctx) {
    final var methodName = "enterPrecedenceUnarySuffixExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrepareStatement(final HiveParser.PrepareStatementContext ctx) {
    final var methodName = "enterPrepareStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrepareStmtParam(final HiveParser.PrepareStmtParamContext ctx) {
    final var methodName = "enterPrepareStmtParam";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimitiveType(final HiveParser.PrimitiveTypeContext ctx) {
    final var methodName = "enterPrimitiveType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrincipalIdentifier(final HiveParser.PrincipalIdentifierContext ctx) {
    final var methodName = "enterPrincipalIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrincipalName(final HiveParser.PrincipalNameContext ctx) {
    final var methodName = "enterPrincipalName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrincipalSpecification(final HiveParser.PrincipalSpecificationContext ctx) {
    final var methodName = "enterPrincipalSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilegeIncludeColObject(
      final HiveParser.PrivilegeIncludeColObjectContext ctx) {
    final var methodName = "enterPrivilegeIncludeColObject";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilegeList(final HiveParser.PrivilegeListContext ctx) {
    final var methodName = "enterPrivilegeList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilegeObject(final HiveParser.PrivilegeObjectContext ctx) {
    final var methodName = "enterPrivilegeObject";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilegeType(final HiveParser.PrivilegeTypeContext ctx) {
    final var methodName = "enterPrivilegeType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivlegeDef(final HiveParser.PrivlegeDefContext ctx) {
    final var methodName = "enterPrivlegeDef";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivObject(final HiveParser.PrivObjectContext ctx) {
    final var methodName = "enterPrivObject";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivObjectCols(final HiveParser.PrivObjectColsContext ctx) {
    final var methodName = "enterPrivObjectCols";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQualifyClause(final HiveParser.QualifyClauseContext ctx) {
    final var methodName = "enterQualifyClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuantifierType(final HiveParser.QuantifierTypeContext ctx) {
    final var methodName = "enterQuantifierType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQueryStatementExpression(final HiveParser.QueryStatementExpressionContext ctx) {
    final var methodName = "enterQueryStatementExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQueryStatementExpressionBody(
      final HiveParser.QueryStatementExpressionBodyContext ctx) {
    final var methodName = "enterQueryStatementExpressionBody";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRecordReader(final HiveParser.RecordReaderContext ctx) {
    final var methodName = "enterRecordReader";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRecordWriter(final HiveParser.RecordWriterContext ctx) {
    final var methodName = "enterRecordWriter";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRegularBody(final HiveParser.RegularBodyContext ctx) {
    final var methodName = "enterRegularBody";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReloadFunctionsStatement(final HiveParser.ReloadFunctionsStatementContext ctx) {
    final var methodName = "enterReloadFunctionsStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelySpecification(final HiveParser.RelySpecificationContext ctx) {
    final var methodName = "enterRelySpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplaceResourcePlanStatement(
      final HiveParser.ReplaceResourcePlanStatementContext ctx) {
    final var methodName = "enterReplaceResourcePlanStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplConfigs(final HiveParser.ReplConfigsContext ctx) {
    final var methodName = "enterReplConfigs";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplConfigsList(final HiveParser.ReplConfigsListContext ctx) {
    final var methodName = "enterReplConfigsList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplDbPolicy(final HiveParser.ReplDbPolicyContext ctx) {
    final var methodName = "enterReplDbPolicy";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplDumpStatement(final HiveParser.ReplDumpStatementContext ctx) {
    final var methodName = "enterReplDumpStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplicationClause(final HiveParser.ReplicationClauseContext ctx) {
    final var methodName = "enterReplicationClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplLoadStatement(final HiveParser.ReplLoadStatementContext ctx) {
    final var methodName = "enterReplLoadStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplStatusStatement(final HiveParser.ReplStatusStatementContext ctx) {
    final var methodName = "enterReplStatusStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplTableLevelPolicy(final HiveParser.ReplTableLevelPolicyContext ctx) {
    final var methodName = "enterReplTableLevelPolicy";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResource(final HiveParser.ResourceContext ctx) {
    final var methodName = "enterResource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResourceList(final HiveParser.ResourceListContext ctx) {
    final var methodName = "enterResourceList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResourcePlanDdlStatements(
      final HiveParser.ResourcePlanDdlStatementsContext ctx) {
    final var methodName = "enterResourcePlanDdlStatements";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResourceType(final HiveParser.ResourceTypeContext ctx) {
    final var methodName = "enterResourceType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRestrictOrCascade(final HiveParser.RestrictOrCascadeContext ctx) {
    final var methodName = "enterRestrictOrCascade";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevokePrivileges(final HiveParser.RevokePrivilegesContext ctx) {
    final var methodName = "enterRevokePrivileges";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevokeRole(final HiveParser.RevokeRoleContext ctx) {
    final var methodName = "enterRevokeRole";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRewriteDisabled(final HiveParser.RewriteDisabledContext ctx) {
    final var methodName = "enterRewriteDisabled";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRewriteEnabled(final HiveParser.RewriteEnabledContext ctx) {
    final var methodName = "enterRewriteEnabled";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollbackStatement(final HiveParser.RollbackStatementContext ctx) {
    final var methodName = "enterRollbackStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollupOldSyntax(final HiveParser.RollupOldSyntaxContext ctx) {
    final var methodName = "enterRollupOldSyntax";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollupStandard(final HiveParser.RollupStandardContext ctx) {
    final var methodName = "enterRollupStandard";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowFormat(final HiveParser.RowFormatContext ctx) {
    final var methodName = "enterRowFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowFormatDelimited(final HiveParser.RowFormatDelimitedContext ctx) {
    final var methodName = "enterRowFormatDelimited";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowFormatSerde(final HiveParser.RowFormatSerdeContext ctx) {
    final var methodName = "enterRowFormatSerde";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRpAssign(final HiveParser.RpAssignContext ctx) {
    final var methodName = "enterRpAssign";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRpAssignList(final HiveParser.RpAssignListContext ctx) {
    final var methodName = "enterRpAssignList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRpUnassign(final HiveParser.RpUnassignContext ctx) {
    final var methodName = "enterRpUnassign";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRpUnassignList(final HiveParser.RpUnassignListContext ctx) {
    final var methodName = "enterRpUnassignList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterScheduleSpec(final HiveParser.ScheduleSpecContext ctx) {
    final var methodName = "enterScheduleSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSearchCondition(final HiveParser.SearchConditionContext ctx) {
    final var methodName = "enterSearchCondition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectClause(final HiveParser.SelectClauseContext ctx) {
    final var methodName = "enterSelectClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectExpression(final HiveParser.SelectExpressionContext ctx) {
    final var methodName = "enterSelectExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectExpressionList(final HiveParser.SelectExpressionListContext ctx) {
    final var methodName = "enterSelectExpressionList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectItem(final HiveParser.SelectItemContext ctx) {
    final var methodName = "enterSelectItem";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectList(final HiveParser.SelectListContext ctx) {
    final var methodName = "enterSelectList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectStatement(final HiveParser.SelectStatementContext ctx) {
    final var methodName = "enterSelectStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectStatementWithCTE(final HiveParser.SelectStatementWithCTEContext ctx) {
    final var methodName = "enterSelectStatementWithCTE";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectTrfmClause(final HiveParser.SelectTrfmClauseContext ctx) {
    final var methodName = "enterSelectTrfmClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetAutoCommitStatement(final HiveParser.SetAutoCommitStatementContext ctx) {
    final var methodName = "enterSetAutoCommitStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetColumnsClause(final HiveParser.SetColumnsClauseContext ctx) {
    final var methodName = "enterSetColumnsClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetOperator(final HiveParser.SetOperatorContext ctx) {
    final var methodName = "enterSetOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetOpSelectStatement(final HiveParser.SetOpSelectStatementContext ctx) {
    final var methodName = "enterSetOpSelectStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetRole(final HiveParser.SetRoleContext ctx) {
    final var methodName = "enterSetRole";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCurrentRole(final HiveParser.ShowCurrentRoleContext ctx) {
    final var methodName = "enterShowCurrentRole";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowFunctionIdentifier(final HiveParser.ShowFunctionIdentifierContext ctx) {
    final var methodName = "enterShowFunctionIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowGrants(final HiveParser.ShowGrantsContext ctx) {
    final var methodName = "enterShowGrants";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowRoleGrants(final HiveParser.ShowRoleGrantsContext ctx) {
    final var methodName = "enterShowRoleGrants";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowRolePrincipals(final HiveParser.ShowRolePrincipalsContext ctx) {
    final var methodName = "enterShowRolePrincipals";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowRoles(final HiveParser.ShowRolesContext ctx) {
    final var methodName = "enterShowRoles";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowStatement(final HiveParser.ShowStatementContext ctx) {
    final var methodName = "enterShowStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowStmtIdentifier(final HiveParser.ShowStmtIdentifierContext ctx) {
    final var methodName = "enterShowStmtIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowTablesFilterExpr(final HiveParser.ShowTablesFilterExprContext ctx) {
    final var methodName = "enterShowTablesFilterExpr";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSingleFromStatement(final HiveParser.SingleFromStatementContext ctx) {
    final var methodName = "enterSingleFromStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedColumnValue(final HiveParser.SkewedColumnValueContext ctx) {
    final var methodName = "enterSkewedColumnValue";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedColumnValuePair(final HiveParser.SkewedColumnValuePairContext ctx) {
    final var methodName = "enterSkewedColumnValuePair";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedColumnValuePairList(
      final HiveParser.SkewedColumnValuePairListContext ctx) {
    final var methodName = "enterSkewedColumnValuePairList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedColumnValues(final HiveParser.SkewedColumnValuesContext ctx) {
    final var methodName = "enterSkewedColumnValues";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedLocationMap(final HiveParser.SkewedLocationMapContext ctx) {
    final var methodName = "enterSkewedLocationMap";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedLocations(final HiveParser.SkewedLocationsContext ctx) {
    final var methodName = "enterSkewedLocations";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedLocationsList(final HiveParser.SkewedLocationsListContext ctx) {
    final var methodName = "enterSkewedLocationsList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedValueElement(final HiveParser.SkewedValueElementContext ctx) {
    final var methodName = "enterSkewedValueElement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedValueLocationElement(
      final HiveParser.SkewedValueLocationElementContext ctx) {
    final var methodName = "enterSkewedValueLocationElement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSortByClause(final HiveParser.SortByClauseContext ctx) {
    final var methodName = "enterSortByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSplitSample(final HiveParser.SplitSampleContext ctx) {
    final var methodName = "enterSplitSample";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSql11ReservedKeywordsUsedAsFunctionName(
      final HiveParser.Sql11ReservedKeywordsUsedAsFunctionNameContext ctx) {
    final var methodName = "enterSql11ReservedKeywordsUsedAsFunctionName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSqlTransactionStatement(final HiveParser.SqlTransactionStatementContext ctx) {
    final var methodName = "enterSqlTransactionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStartTransactionStatement(
      final HiveParser.StartTransactionStatementContext ctx) {
    final var methodName = "enterStartTransactionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStatement(final HiveParser.StatementContext ctx) {
    final var methodName = "enterStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStoredAsDirs(final HiveParser.StoredAsDirsContext ctx) {
    final var methodName = "enterStoredAsDirs";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStringLiteralSequence(final HiveParser.StringLiteralSequenceContext ctx) {
    final var methodName = "enterStringLiteralSequence";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStructType(final HiveParser.StructTypeContext ctx) {
    final var methodName = "enterStructType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubQueryExpression(final HiveParser.SubQueryExpressionContext ctx) {
    final var methodName = "enterSubQueryExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubQuerySelectorOperator(final HiveParser.SubQuerySelectorOperatorContext ctx) {
    final var methodName = "enterSubQuerySelectorOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubQuerySource(final HiveParser.SubQuerySourceContext ctx) {
    final var methodName = "enterSubQuerySource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSwitchDatabaseStatement(final HiveParser.SwitchDatabaseStatementContext ctx) {
    final var methodName = "enterSwitchDatabaseStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSysFuncNames(final HiveParser.SysFuncNamesContext ctx) {
    final var methodName = "enterSysFuncNames";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableAlias(final HiveParser.TableAliasContext ctx) {
    final var methodName = "enterTableAlias";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableAllColumns(final HiveParser.TableAllColumnsContext ctx) {
    final var methodName = "enterTableAllColumns";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableBuckets(final HiveParser.TableBucketsContext ctx) {
    final var methodName = "enterTableBuckets";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableBucketSample(final HiveParser.TableBucketSampleContext ctx) {
    final var methodName = "enterTableBucketSample";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableComment(final HiveParser.TableCommentContext ctx) {
    final var methodName = "enterTableComment";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableConstraint(final HiveParser.TableConstraintContext ctx) {
    final var methodName = "enterTableConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableConstraintType(final HiveParser.TableConstraintTypeContext ctx) {
    final var methodName = "enterTableConstraintType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableFileFormat(final HiveParser.TableFileFormatContext ctx) {
    final var methodName = "enterTableFileFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableImplBuckets(final HiveParser.TableImplBucketsContext ctx) {
    final var methodName = "enterTableImplBuckets";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableLevelConstraint(final HiveParser.TableLevelConstraintContext ctx) {
    final var methodName = "enterTableLevelConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableLocation(final HiveParser.TableLocationContext ctx) {
    final var methodName = "enterTableLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableName(final HiveParser.TableNameContext ctx) {
    final var methodName = "enterTableName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOrColumn(final HiveParser.TableOrColumnContext ctx) {
    final var methodName = "enterTableOrColumn";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOrPartition(final HiveParser.TableOrPartitionContext ctx) {
    final var methodName = "enterTableOrPartition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablePartitionPrefix(final HiveParser.TablePartitionPrefixContext ctx) {
    final var methodName = "enterTablePartitionPrefix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableProperties(final HiveParser.TablePropertiesContext ctx) {
    final var methodName = "enterTableProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablePropertiesList(final HiveParser.TablePropertiesListContext ctx) {
    final var methodName = "enterTablePropertiesList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablePropertiesPrefixed(final HiveParser.TablePropertiesPrefixedContext ctx) {
    final var methodName = "enterTablePropertiesPrefixed";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableRowFormat(final HiveParser.TableRowFormatContext ctx) {
    final var methodName = "enterTableRowFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableRowFormatCollItemsIdentifier(
      final HiveParser.TableRowFormatCollItemsIdentifierContext ctx) {
    final var methodName = "enterTableRowFormatCollItemsIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableRowFormatFieldIdentifier(
      final HiveParser.TableRowFormatFieldIdentifierContext ctx) {
    final var methodName = "enterTableRowFormatFieldIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableRowFormatLinesIdentifier(
      final HiveParser.TableRowFormatLinesIdentifierContext ctx) {
    final var methodName = "enterTableRowFormatLinesIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableRowFormatMapKeysIdentifier(
      final HiveParser.TableRowFormatMapKeysIdentifierContext ctx) {
    final var methodName = "enterTableRowFormatMapKeysIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableRowNullFormat(final HiveParser.TableRowNullFormatContext ctx) {
    final var methodName = "enterTableRowNullFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSample(final HiveParser.TableSampleContext ctx) {
    final var methodName = "enterTableSample";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSkewed(final HiveParser.TableSkewedContext ctx) {
    final var methodName = "enterTableSkewed";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSource(final HiveParser.TableSourceContext ctx) {
    final var methodName = "enterTableSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTabPartColTypeExpr(final HiveParser.TabPartColTypeExprContext ctx) {
    final var methodName = "enterTabPartColTypeExpr";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTabTypeExpr(final HiveParser.TabTypeExprContext ctx) {
    final var methodName = "enterTabTypeExpr";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTimeQualifiers(final HiveParser.TimeQualifiersContext ctx) {
    final var methodName = "enterTimeQualifiers";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTimestampLiteral(final HiveParser.TimestampLiteralContext ctx) {
    final var methodName = "enterTimestampLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTimestampLocalTZLiteral(final HiveParser.TimestampLocalTZLiteralContext ctx) {
    final var methodName = "enterTimestampLocalTZLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionAccessMode(final HiveParser.TransactionAccessModeContext ctx) {
    final var methodName = "enterTransactionAccessMode";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionMode(final HiveParser.TransactionModeContext ctx) {
    final var methodName = "enterTransactionMode";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrfmClause(final HiveParser.TrfmClauseContext ctx) {
    final var methodName = "enterTrfmClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerActionExpression(final HiveParser.TriggerActionExpressionContext ctx) {
    final var methodName = "enterTriggerActionExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerActionExpressionStandalone(
      final HiveParser.TriggerActionExpressionStandaloneContext ctx) {
    final var methodName = "enterTriggerActionExpressionStandalone";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerAndExpression(final HiveParser.TriggerAndExpressionContext ctx) {
    final var methodName = "enterTriggerAndExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerAtomExpression(final HiveParser.TriggerAtomExpressionContext ctx) {
    final var methodName = "enterTriggerAtomExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerExpression(final HiveParser.TriggerExpressionContext ctx) {
    final var methodName = "enterTriggerExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerExpressionStandalone(
      final HiveParser.TriggerExpressionStandaloneContext ctx) {
    final var methodName = "enterTriggerExpressionStandalone";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerLiteral(final HiveParser.TriggerLiteralContext ctx) {
    final var methodName = "enterTriggerLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerOrExpression(final HiveParser.TriggerOrExpressionContext ctx) {
    final var methodName = "enterTriggerOrExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrimFunction(final HiveParser.TrimFunctionContext ctx) {
    final var methodName = "enterTrimFunction";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTruncateTableStatement(final HiveParser.TruncateTableStatementContext ctx) {
    final var methodName = "enterTruncateTableStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType(final HiveParser.TypeContext ctx) {
    final var methodName = "enterType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnionType(final HiveParser.UnionTypeContext ctx) {
    final var methodName = "enterUnionType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueJoinExpr(final HiveParser.UniqueJoinExprContext ctx) {
    final var methodName = "enterUniqueJoinExpr";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueJoinSource(final HiveParser.UniqueJoinSourceContext ctx) {
    final var methodName = "enterUniqueJoinSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueJoinTableSource(final HiveParser.UniqueJoinTableSourceContext ctx) {
    final var methodName = "enterUniqueJoinTableSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueJoinToken(final HiveParser.UniqueJoinTokenContext ctx) {
    final var methodName = "enterUniqueJoinToken";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnlockDatabase(final HiveParser.UnlockDatabaseContext ctx) {
    final var methodName = "enterUnlockDatabase";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnlockStatement(final HiveParser.UnlockStatementContext ctx) {
    final var methodName = "enterUnlockStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnmanaged(final HiveParser.UnmanagedContext ctx) {
    final var methodName = "enterUnmanaged";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdateOrDelete(final HiveParser.UpdateOrDeleteContext ctx) {
    final var methodName = "enterUpdateOrDelete";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdateStatement(final HiveParser.UpdateStatementContext ctx) {
    final var methodName = "enterUpdateStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValidateSpecification(final HiveParser.ValidateSpecificationContext ctx) {
    final var methodName = "enterValidateSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValueRowConstructor(final HiveParser.ValueRowConstructorContext ctx) {
    final var methodName = "enterValueRowConstructor";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValuesClause(final HiveParser.ValuesClauseContext ctx) {
    final var methodName = "enterValuesClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValuesSource(final HiveParser.ValuesSourceContext ctx) {
    final var methodName = "enterValuesSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValuesTableConstructor(final HiveParser.ValuesTableConstructorContext ctx) {
    final var methodName = "enterValuesTableConstructor";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVectorizationOnly(final HiveParser.VectorizationOnlyContext ctx) {
    final var methodName = "enterVectorizationOnly";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVectorizatonDetail(final HiveParser.VectorizatonDetailContext ctx) {
    final var methodName = "enterVectorizatonDetail";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewClusterSpec(final HiveParser.ViewClusterSpecContext ctx) {
    final var methodName = "enterViewClusterSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewComplexSpec(final HiveParser.ViewComplexSpecContext ctx) {
    final var methodName = "enterViewComplexSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewDistSpec(final HiveParser.ViewDistSpecContext ctx) {
    final var methodName = "enterViewDistSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewName(final HiveParser.ViewNameContext ctx) {
    final var methodName = "enterViewName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewOrganization(final HiveParser.ViewOrganizationContext ctx) {
    final var methodName = "enterViewOrganization";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewPartition(final HiveParser.ViewPartitionContext ctx) {
    final var methodName = "enterViewPartition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewSortSpec(final HiveParser.ViewSortSpecContext ctx) {
    final var methodName = "enterViewSortSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVirtualTableSource(final HiveParser.VirtualTableSourceContext ctx) {
    final var methodName = "enterVirtualTableSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhenClauses(final HiveParser.WhenClausesContext ctx) {
    final var methodName = "enterWhenClauses";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhenExpression(final HiveParser.WhenExpressionContext ctx) {
    final var methodName = "enterWhenExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhenMatchedAndClause(final HiveParser.WhenMatchedAndClauseContext ctx) {
    final var methodName = "enterWhenMatchedAndClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhenMatchedThenClause(final HiveParser.WhenMatchedThenClauseContext ctx) {
    final var methodName = "enterWhenMatchedThenClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhenNotMatchedClause(final HiveParser.WhenNotMatchedClauseContext ctx) {
    final var methodName = "enterWhenNotMatchedClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhereClause(final HiveParser.WhereClauseContext ctx) {
    final var methodName = "enterWhereClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_clause(final HiveParser.Window_clauseContext ctx) {
    final var methodName = "enterWindow_clause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_defn(final HiveParser.Window_defnContext ctx) {
    final var methodName = "enterWindow_defn";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_frame(final HiveParser.Window_frameContext ctx) {
    final var methodName = "enterWindow_frame";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_frame_boundary(final HiveParser.Window_frame_boundaryContext ctx) {
    final var methodName = "enterWindow_frame_boundary";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_frame_start_boundary(
      final HiveParser.Window_frame_start_boundaryContext ctx) {
    final var methodName = "enterWindow_frame_start_boundary";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_range_expression(final HiveParser.Window_range_expressionContext ctx) {
    final var methodName = "enterWindow_range_expression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_specification(final HiveParser.Window_specificationContext ctx) {
    final var methodName = "enterWindow_specification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_value_expression(final HiveParser.Window_value_expressionContext ctx) {
    final var methodName = "enterWindow_value_expression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithAdminOption(final HiveParser.WithAdminOptionContext ctx) {
    final var methodName = "enterWithAdminOption";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithClause(final HiveParser.WithClauseContext ctx) {
    final var methodName = "enterWithClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithGrantOption(final HiveParser.WithGrantOptionContext ctx) {
    final var methodName = "enterWithGrantOption";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithReplace(final HiveParser.WithReplaceContext ctx) {
    final var methodName = "enterWithReplace";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAbortCompactionStatement(final HiveParser.AbortCompactionStatementContext ctx) {
    final var methodName = "exitAbortCompactionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAbortTransactionStatement(final HiveParser.AbortTransactionStatementContext ctx) {
    final var methodName = "exitAbortTransactionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitActivate(final HiveParser.ActivateContext ctx) {
    final var methodName = "exitActivate";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdminOptionFor(final HiveParser.AdminOptionForContext ctx) {
    final var methodName = "exitAdminOptionFor";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAliasList(final HiveParser.AliasListContext ctx) {
    final var methodName = "exitAliasList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAll_distinct(final HiveParser.All_distinctContext ctx) {
    final var methodName = "exitAll_distinct";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterColConstraint(final HiveParser.AlterColConstraintContext ctx) {
    final var methodName = "exitAlterColConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterColumnConstraint(final HiveParser.AlterColumnConstraintContext ctx) {
    final var methodName = "exitAlterColumnConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterConstraintWithName(final HiveParser.AlterConstraintWithNameContext ctx) {
    final var methodName = "exitAlterConstraintWithName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterDatabaseStatementSuffix(
      final HiveParser.AlterDatabaseStatementSuffixContext ctx) {
    final var methodName = "exitAlterDatabaseStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterDatabaseSuffixProperties(
      final HiveParser.AlterDatabaseSuffixPropertiesContext ctx) {
    final var methodName = "exitAlterDatabaseSuffixProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterDatabaseSuffixSetLocation(
      final HiveParser.AlterDatabaseSuffixSetLocationContext ctx) {
    final var methodName = "exitAlterDatabaseSuffixSetLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterDatabaseSuffixSetManagedLocation(
      final HiveParser.AlterDatabaseSuffixSetManagedLocationContext ctx) {
    final var methodName = "exitAlterDatabaseSuffixSetManagedLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterDatabaseSuffixSetOwner(
      final HiveParser.AlterDatabaseSuffixSetOwnerContext ctx) {
    final var methodName = "exitAlterDatabaseSuffixSetOwner";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterDataConnectorStatementSuffix(
      final HiveParser.AlterDataConnectorStatementSuffixContext ctx) {
    final var methodName = "exitAlterDataConnectorStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterDataConnectorSuffixProperties(
      final HiveParser.AlterDataConnectorSuffixPropertiesContext ctx) {
    final var methodName = "exitAlterDataConnectorSuffixProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterDataConnectorSuffixSetOwner(
      final HiveParser.AlterDataConnectorSuffixSetOwnerContext ctx) {
    final var methodName = "exitAlterDataConnectorSuffixSetOwner";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterDataConnectorSuffixSetUrl(
      final HiveParser.AlterDataConnectorSuffixSetUrlContext ctx) {
    final var methodName = "exitAlterDataConnectorSuffixSetUrl";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterForeignKeyConstraint(final HiveParser.AlterForeignKeyConstraintContext ctx) {
    final var methodName = "exitAlterForeignKeyConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterForeignKeyWithName(final HiveParser.AlterForeignKeyWithNameContext ctx) {
    final var methodName = "exitAlterForeignKeyWithName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterMappingStatement(final HiveParser.AlterMappingStatementContext ctx) {
    final var methodName = "exitAlterMappingStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterMaterializedViewStatementSuffix(
      final HiveParser.AlterMaterializedViewStatementSuffixContext ctx) {
    final var methodName = "exitAlterMaterializedViewStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterMaterializedViewSuffixRebuild(
      final HiveParser.AlterMaterializedViewSuffixRebuildContext ctx) {
    final var methodName = "exitAlterMaterializedViewSuffixRebuild";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterMaterializedViewSuffixRewrite(
      final HiveParser.AlterMaterializedViewSuffixRewriteContext ctx) {
    final var methodName = "exitAlterMaterializedViewSuffixRewrite";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterPoolStatement(final HiveParser.AlterPoolStatementContext ctx) {
    final var methodName = "exitAlterPoolStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterResourcePlanStatement(
      final HiveParser.AlterResourcePlanStatementContext ctx) {
    final var methodName = "exitAlterResourcePlanStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterScheduledQueryChange(final HiveParser.AlterScheduledQueryChangeContext ctx) {
    final var methodName = "exitAlterScheduledQueryChange";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterScheduledQueryStatement(
      final HiveParser.AlterScheduledQueryStatementContext ctx) {
    final var methodName = "exitAlterScheduledQueryStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatement(final HiveParser.AlterStatementContext ctx) {
    final var methodName = "exitAlterStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementChangeColPosition(
      final HiveParser.AlterStatementChangeColPositionContext ctx) {
    final var methodName = "exitAlterStatementChangeColPosition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementPartitionKeyType(
      final HiveParser.AlterStatementPartitionKeyTypeContext ctx) {
    final var methodName = "exitAlterStatementPartitionKeyType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixAddCol(
      final HiveParser.AlterStatementSuffixAddColContext ctx) {
    final var methodName = "exitAlterStatementSuffixAddCol";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixAddConstraint(
      final HiveParser.AlterStatementSuffixAddConstraintContext ctx) {
    final var methodName = "exitAlterStatementSuffixAddConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixAddPartitions(
      final HiveParser.AlterStatementSuffixAddPartitionsContext ctx) {
    final var methodName = "exitAlterStatementSuffixAddPartitions";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixAddPartitionsElement(
      final HiveParser.AlterStatementSuffixAddPartitionsElementContext ctx) {
    final var methodName = "exitAlterStatementSuffixAddPartitionsElement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixArchive(
      final HiveParser.AlterStatementSuffixArchiveContext ctx) {
    final var methodName = "exitAlterStatementSuffixArchive";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixBucketNum(
      final HiveParser.AlterStatementSuffixBucketNumContext ctx) {
    final var methodName = "exitAlterStatementSuffixBucketNum";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixClusterbySortby(
      final HiveParser.AlterStatementSuffixClusterbySortbyContext ctx) {
    final var methodName = "exitAlterStatementSuffixClusterbySortby";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixCompact(
      final HiveParser.AlterStatementSuffixCompactContext ctx) {
    final var methodName = "exitAlterStatementSuffixCompact";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixDropConstraint(
      final HiveParser.AlterStatementSuffixDropConstraintContext ctx) {
    final var methodName = "exitAlterStatementSuffixDropConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixDropPartitions(
      final HiveParser.AlterStatementSuffixDropPartitionsContext ctx) {
    final var methodName = "exitAlterStatementSuffixDropPartitions";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixExchangePartition(
      final HiveParser.AlterStatementSuffixExchangePartitionContext ctx) {
    final var methodName = "exitAlterStatementSuffixExchangePartition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixExecute(
      final HiveParser.AlterStatementSuffixExecuteContext ctx) {
    final var methodName = "exitAlterStatementSuffixExecute";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixFileFormat(
      final HiveParser.AlterStatementSuffixFileFormatContext ctx) {
    final var methodName = "exitAlterStatementSuffixFileFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixLocation(
      final HiveParser.AlterStatementSuffixLocationContext ctx) {
    final var methodName = "exitAlterStatementSuffixLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixMergeFiles(
      final HiveParser.AlterStatementSuffixMergeFilesContext ctx) {
    final var methodName = "exitAlterStatementSuffixMergeFiles";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixProperties(
      final HiveParser.AlterStatementSuffixPropertiesContext ctx) {
    final var methodName = "exitAlterStatementSuffixProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixRename(
      final HiveParser.AlterStatementSuffixRenameContext ctx) {
    final var methodName = "exitAlterStatementSuffixRename";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixRenameCol(
      final HiveParser.AlterStatementSuffixRenameColContext ctx) {
    final var methodName = "exitAlterStatementSuffixRenameCol";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixRenamePart(
      final HiveParser.AlterStatementSuffixRenamePartContext ctx) {
    final var methodName = "exitAlterStatementSuffixRenamePart";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixSerdeProperties(
      final HiveParser.AlterStatementSuffixSerdePropertiesContext ctx) {
    final var methodName = "exitAlterStatementSuffixSerdeProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixSetOwner(
      final HiveParser.AlterStatementSuffixSetOwnerContext ctx) {
    final var methodName = "exitAlterStatementSuffixSetOwner";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixSetPartSpec(
      final HiveParser.AlterStatementSuffixSetPartSpecContext ctx) {
    final var methodName = "exitAlterStatementSuffixSetPartSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixSkewedby(
      final HiveParser.AlterStatementSuffixSkewedbyContext ctx) {
    final var methodName = "exitAlterStatementSuffixSkewedby";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixStatsPart(
      final HiveParser.AlterStatementSuffixStatsPartContext ctx) {
    final var methodName = "exitAlterStatementSuffixStatsPart";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixTouch(final HiveParser.AlterStatementSuffixTouchContext ctx) {
    final var methodName = "exitAlterStatementSuffixTouch";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixUnArchive(
      final HiveParser.AlterStatementSuffixUnArchiveContext ctx) {
    final var methodName = "exitAlterStatementSuffixUnArchive";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixUpdateColumns(
      final HiveParser.AlterStatementSuffixUpdateColumnsContext ctx) {
    final var methodName = "exitAlterStatementSuffixUpdateColumns";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixUpdateStats(
      final HiveParser.AlterStatementSuffixUpdateStatsContext ctx) {
    final var methodName = "exitAlterStatementSuffixUpdateStats";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixUpdateStatsCol(
      final HiveParser.AlterStatementSuffixUpdateStatsColContext ctx) {
    final var methodName = "exitAlterStatementSuffixUpdateStatsCol";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterTableStatementSuffix(final HiveParser.AlterTableStatementSuffixContext ctx) {
    final var methodName = "exitAlterTableStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterTblPartitionStatementSuffix(
      final HiveParser.AlterTblPartitionStatementSuffixContext ctx) {
    final var methodName = "exitAlterTblPartitionStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterTblPartitionStatementSuffixSkewedLocation(
      final HiveParser.AlterTblPartitionStatementSuffixSkewedLocationContext ctx) {
    final var methodName = "exitAlterTblPartitionStatementSuffixSkewedLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterTriggerStatement(final HiveParser.AlterTriggerStatementContext ctx) {
    final var methodName = "exitAlterTriggerStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterViewStatementSuffix(final HiveParser.AlterViewStatementSuffixContext ctx) {
    final var methodName = "exitAlterViewStatementSuffix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterViewSuffixProperties(final HiveParser.AlterViewSuffixPropertiesContext ctx) {
    final var methodName = "exitAlterViewSuffixProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAnalyzeStatement(final HiveParser.AnalyzeStatementContext ctx) {
    final var methodName = "exitAnalyzeStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAsOfClause(final HiveParser.AsOfClauseContext ctx) {
    final var methodName = "exitAsOfClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAtomExpression(final HiveParser.AtomExpressionContext ctx) {
    final var methodName = "exitAtomExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAtomjoinSource(final HiveParser.AtomjoinSourceContext ctx) {
    final var methodName = "exitAtomjoinSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAtomSelectStatement(final HiveParser.AtomSelectStatementContext ctx) {
    final var methodName = "exitAtomSelectStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBlocking(final HiveParser.BlockingContext ctx) {
    final var methodName = "exitBlocking";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBody(final HiveParser.BodyContext ctx) {
    final var methodName = "exitBody";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBooleanValue(final HiveParser.BooleanValueContext ctx) {
    final var methodName = "exitBooleanValue";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBooleanValueTok(final HiveParser.BooleanValueTokContext ctx) {
    final var methodName = "exitBooleanValueTok";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseExpression(final HiveParser.CaseExpressionContext ctx) {
    final var methodName = "exitCaseExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCastExpression(final HiveParser.CastExpressionContext ctx) {
    final var methodName = "exitCastExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharSetStringLiteral(final HiveParser.CharSetStringLiteralContext ctx) {
    final var methodName = "exitCharSetStringLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheckConstraint(final HiveParser.CheckConstraintContext ctx) {
    final var methodName = "exitCheckConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClusterByClause(final HiveParser.ClusterByClauseContext ctx) {
    final var methodName = "exitClusterByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColConstraint(final HiveParser.ColConstraintContext ctx) {
    final var methodName = "exitColConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColType(final HiveParser.ColTypeContext ctx) {
    final var methodName = "exitColType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColTypeList(final HiveParser.ColTypeListContext ctx) {
    final var methodName = "exitColTypeList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnAssignmentClause(final HiveParser.ColumnAssignmentClauseContext ctx) {
    final var methodName = "exitColumnAssignmentClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnConstraint(final HiveParser.ColumnConstraintContext ctx) {
    final var methodName = "exitColumnConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnConstraintType(final HiveParser.ColumnConstraintTypeContext ctx) {
    final var methodName = "exitColumnConstraintType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnName(final HiveParser.ColumnNameContext ctx) {
    final var methodName = "exitColumnName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameColonType(final HiveParser.ColumnNameColonTypeContext ctx) {
    final var methodName = "exitColumnNameColonType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameColonTypeList(final HiveParser.ColumnNameColonTypeListContext ctx) {
    final var methodName = "exitColumnNameColonTypeList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameComment(final HiveParser.ColumnNameCommentContext ctx) {
    final var methodName = "exitColumnNameComment";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameCommentList(final HiveParser.ColumnNameCommentListContext ctx) {
    final var methodName = "exitColumnNameCommentList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameList(final HiveParser.ColumnNameListContext ctx) {
    final var methodName = "exitColumnNameList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameOrder(final HiveParser.ColumnNameOrderContext ctx) {
    final var methodName = "exitColumnNameOrder";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameOrderList(final HiveParser.ColumnNameOrderListContext ctx) {
    final var methodName = "exitColumnNameOrderList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameTransformConstraint(
      final HiveParser.ColumnNameTransformConstraintContext ctx) {
    final var methodName = "exitColumnNameTransformConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameType(final HiveParser.ColumnNameTypeContext ctx) {
    final var methodName = "exitColumnNameType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameTypeConstraint(final HiveParser.ColumnNameTypeConstraintContext ctx) {
    final var methodName = "exitColumnNameTypeConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameTypeList(final HiveParser.ColumnNameTypeListContext ctx) {
    final var methodName = "exitColumnNameTypeList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameTypeOrConstraint(
      final HiveParser.ColumnNameTypeOrConstraintContext ctx) {
    final var methodName = "exitColumnNameTypeOrConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameTypeOrConstraintList(
      final HiveParser.ColumnNameTypeOrConstraintListContext ctx) {
    final var methodName = "exitColumnNameTypeOrConstraintList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnParenthesesList(final HiveParser.ColumnParenthesesListContext ctx) {
    final var methodName = "exitColumnParenthesesList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnRefOrder(final HiveParser.ColumnRefOrderContext ctx) {
    final var methodName = "exitColumnRefOrder";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnRefOrderInParenthesis(
      final HiveParser.ColumnRefOrderInParenthesisContext ctx) {
    final var methodName = "exitColumnRefOrderInParenthesis";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnRefOrderNotInParenthesis(
      final HiveParser.ColumnRefOrderNotInParenthesisContext ctx) {
    final var methodName = "exitColumnRefOrderNotInParenthesis";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommitStatement(final HiveParser.CommitStatementContext ctx) {
    final var methodName = "exitCommitStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompactionId(final HiveParser.CompactionIdContext ctx) {
    final var methodName = "exitCompactionId";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompactionPool(final HiveParser.CompactionPoolContext ctx) {
    final var methodName = "exitCompactionPool";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompactionStatus(final HiveParser.CompactionStatusContext ctx) {
    final var methodName = "exitCompactionStatus";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompactionType(final HiveParser.CompactionTypeContext ctx) {
    final var methodName = "exitCompactionType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompactPool(final HiveParser.CompactPoolContext ctx) {
    final var methodName = "exitCompactPool";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComparisionOperator(final HiveParser.ComparisionOperatorContext ctx) {
    final var methodName = "exitComparisionOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstant(final HiveParser.ConstantContext ctx) {
    final var methodName = "exitConstant";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraintOptsAlter(final HiveParser.ConstraintOptsAlterContext ctx) {
    final var methodName = "exitConstraintOptsAlter";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraintOptsCreate(final HiveParser.ConstraintOptsCreateContext ctx) {
    final var methodName = "exitConstraintOptsCreate";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateConstraint(final HiveParser.CreateConstraintContext ctx) {
    final var methodName = "exitCreateConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateDatabaseStatement(final HiveParser.CreateDatabaseStatementContext ctx) {
    final var methodName = "exitCreateDatabaseStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateDataConnectorStatement(
      final HiveParser.CreateDataConnectorStatementContext ctx) {
    final var methodName = "exitCreateDataConnectorStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateForeignKey(final HiveParser.CreateForeignKeyContext ctx) {
    final var methodName = "exitCreateForeignKey";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateFunctionStatement(final HiveParser.CreateFunctionStatementContext ctx) {
    final var methodName = "exitCreateFunctionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateMacroStatement(final HiveParser.CreateMacroStatementContext ctx) {
    final var methodName = "exitCreateMacroStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateMappingStatement(final HiveParser.CreateMappingStatementContext ctx) {
    final var methodName = "exitCreateMappingStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateMaterializedViewStatement(
      final HiveParser.CreateMaterializedViewStatementContext ctx) {
    final var methodName = "exitCreateMaterializedViewStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatePoolStatement(final HiveParser.CreatePoolStatementContext ctx) {
    final var methodName = "exitCreatePoolStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateResourcePlanStatement(
      final HiveParser.CreateResourcePlanStatementContext ctx) {
    final var methodName = "exitCreateResourcePlanStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateRoleStatement(final HiveParser.CreateRoleStatementContext ctx) {
    final var methodName = "exitCreateRoleStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateScheduledQueryStatement(
      final HiveParser.CreateScheduledQueryStatementContext ctx) {
    final var methodName = "exitCreateScheduledQueryStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTablePartitionColumnSpec(
      final HiveParser.CreateTablePartitionColumnSpecContext ctx) {
    final var methodName = "exitCreateTablePartitionColumnSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTablePartitionColumnTypeSpec(
      final HiveParser.CreateTablePartitionColumnTypeSpecContext ctx) {
    final var methodName = "exitCreateTablePartitionColumnTypeSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTablePartitionSpec(final HiveParser.CreateTablePartitionSpecContext ctx) {
    final var methodName = "exitCreateTablePartitionSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTableStatement(final HiveParser.CreateTableStatementContext ctx) {
    final var methodName = "exitCreateTableStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTriggerStatement(final HiveParser.CreateTriggerStatementContext ctx) {
    final var methodName = "exitCreateTriggerStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateViewStatement(final HiveParser.CreateViewStatementContext ctx) {
    final var methodName = "exitCreateViewStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCteStatement(final HiveParser.CteStatementContext ctx) {
    final var methodName = "exitCteStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatabaseComment(final HiveParser.DatabaseCommentContext ctx) {
    final var methodName = "exitDatabaseComment";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDataConnectorComment(final HiveParser.DataConnectorCommentContext ctx) {
    final var methodName = "exitDataConnectorComment";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDataConnectorType(final HiveParser.DataConnectorTypeContext ctx) {
    final var methodName = "exitDataConnectorType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDataConnectorUrl(final HiveParser.DataConnectorUrlContext ctx) {
    final var methodName = "exitDataConnectorUrl";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDateLiteral(final HiveParser.DateLiteralContext ctx) {
    final var methodName = "exitDateLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDb_schema(final HiveParser.Db_schemaContext ctx) {
    final var methodName = "exitDb_schema";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDbConnectorName(final HiveParser.DbConnectorNameContext ctx) {
    final var methodName = "exitDbConnectorName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDbLocation(final HiveParser.DbLocationContext ctx) {
    final var methodName = "exitDbLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDbManagedLocation(final HiveParser.DbManagedLocationContext ctx) {
    final var methodName = "exitDbManagedLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDbProperties(final HiveParser.DbPropertiesContext ctx) {
    final var methodName = "exitDbProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDbPropertiesList(final HiveParser.DbPropertiesListContext ctx) {
    final var methodName = "exitDbPropertiesList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDcProperties(final HiveParser.DcPropertiesContext ctx) {
    final var methodName = "exitDcProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDdlStatement(final HiveParser.DdlStatementContext ctx) {
    final var methodName = "exitDdlStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefaultVal(final HiveParser.DefaultValContext ctx) {
    final var methodName = "exitDefaultVal";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefaultValue(final HiveParser.DefaultValueContext ctx) {
    final var methodName = "exitDefaultValue";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefinedAsSpec(final HiveParser.DefinedAsSpecContext ctx) {
    final var methodName = "exitDefinedAsSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeleteStatement(final HiveParser.DeleteStatementContext ctx) {
    final var methodName = "exitDeleteStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescFuncNames(final HiveParser.DescFuncNamesContext ctx) {
    final var methodName = "exitDescFuncNames";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescStatement(final HiveParser.DescStatementContext ctx) {
    final var methodName = "exitDescStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDestination(final HiveParser.DestinationContext ctx) {
    final var methodName = "exitDestination";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDisable(final HiveParser.DisableContext ctx) {
    final var methodName = "exitDisable";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDistributeByClause(final HiveParser.DistributeByClauseContext ctx) {
    final var methodName = "exitDistributeByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropDatabaseStatement(final HiveParser.DropDatabaseStatementContext ctx) {
    final var methodName = "exitDropDatabaseStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropDataConnectorStatement(
      final HiveParser.DropDataConnectorStatementContext ctx) {
    final var methodName = "exitDropDataConnectorStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropFunctionStatement(final HiveParser.DropFunctionStatementContext ctx) {
    final var methodName = "exitDropFunctionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropMacroStatement(final HiveParser.DropMacroStatementContext ctx) {
    final var methodName = "exitDropMacroStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropMappingStatement(final HiveParser.DropMappingStatementContext ctx) {
    final var methodName = "exitDropMappingStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropMaterializedViewStatement(
      final HiveParser.DropMaterializedViewStatementContext ctx) {
    final var methodName = "exitDropMaterializedViewStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropPoolStatement(final HiveParser.DropPoolStatementContext ctx) {
    final var methodName = "exitDropPoolStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropResourcePlanStatement(final HiveParser.DropResourcePlanStatementContext ctx) {
    final var methodName = "exitDropResourcePlanStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropRoleStatement(final HiveParser.DropRoleStatementContext ctx) {
    final var methodName = "exitDropRoleStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropScheduledQueryStatement(
      final HiveParser.DropScheduledQueryStatementContext ctx) {
    final var methodName = "exitDropScheduledQueryStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropTableStatement(final HiveParser.DropTableStatementContext ctx) {
    final var methodName = "exitDropTableStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropTriggerStatement(final HiveParser.DropTriggerStatementContext ctx) {
    final var methodName = "exitDropTriggerStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropViewStatement(final HiveParser.DropViewStatementContext ctx) {
    final var methodName = "exitDropViewStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnable(final HiveParser.EnableContext ctx) {
    final var methodName = "exitEnable";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnableSpecification(final HiveParser.EnableSpecificationContext ctx) {
    final var methodName = "exitEnableSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnableValidateSpecification(
      final HiveParser.EnableValidateSpecificationContext ctx) {
    final var methodName = "exitEnableValidateSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnforcedSpecification(final HiveParser.EnforcedSpecificationContext ctx) {
    final var methodName = "exitEnforcedSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    final var methodName = "exitEveryRule";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecStatement(final HiveParser.ExecStatementContext ctx) {
    final var methodName = "exitExecStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecutedAsSpec(final HiveParser.ExecutedAsSpecContext ctx) {
    final var methodName = "exitExecutedAsSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecuteParamList(final HiveParser.ExecuteParamListContext ctx) {
    final var methodName = "exitExecuteParamList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecuteStatement(final HiveParser.ExecuteStatementContext ctx) {
    final var methodName = "exitExecuteStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplainOption(final HiveParser.ExplainOptionContext ctx) {
    final var methodName = "exitExplainOption";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplainStatement(final HiveParser.ExplainStatementContext ctx) {
    final var methodName = "exitExplainStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExportStatement(final HiveParser.ExportStatementContext ctx) {
    final var methodName = "exitExportStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpression(final HiveParser.ExpressionContext ctx) {
    final var methodName = "exitExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionList(final HiveParser.ExpressionListContext ctx) {
    final var methodName = "exitExpressionList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionOrDefault(final HiveParser.ExpressionOrDefaultContext ctx) {
    final var methodName = "exitExpressionOrDefault";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionPart(final HiveParser.ExpressionPartContext ctx) {
    final var methodName = "exitExpressionPart";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressions(final HiveParser.ExpressionsContext ctx) {
    final var methodName = "exitExpressions";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionsInParenthesis(final HiveParser.ExpressionsInParenthesisContext ctx) {
    final var methodName = "exitExpressionsInParenthesis";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionsNotInParenthesis(
      final HiveParser.ExpressionsNotInParenthesisContext ctx) {
    final var methodName = "exitExpressionsNotInParenthesis";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionWithAlias(final HiveParser.ExpressionWithAliasContext ctx) {
    final var methodName = "exitExpressionWithAlias";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExtColumnName(final HiveParser.ExtColumnNameContext ctx) {
    final var methodName = "exitExtColumnName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExtractExpression(final HiveParser.ExtractExpressionContext ctx) {
    final var methodName = "exitExtractExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFileFormat(final HiveParser.FileFormatContext ctx) {
    final var methodName = "exitFileFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFirstExpressionsWithAlias(final HiveParser.FirstExpressionsWithAliasContext ctx) {
    final var methodName = "exitFirstExpressionsWithAlias";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFirstValueRowConstructor(final HiveParser.FirstValueRowConstructorContext ctx) {
    final var methodName = "exitFirstValueRowConstructor";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFloorDateQualifiers(final HiveParser.FloorDateQualifiersContext ctx) {
    final var methodName = "exitFloorDateQualifiers";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFloorExpression(final HiveParser.FloorExpressionContext ctx) {
    final var methodName = "exitFloorExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForce(final HiveParser.ForceContext ctx) {
    final var methodName = "exitForce";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForeignKeyConstraint(final HiveParser.ForeignKeyConstraintContext ctx) {
    final var methodName = "exitForeignKeyConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrom_in(final HiveParser.From_inContext ctx) {
    final var methodName = "exitFrom_in";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFromClause(final HiveParser.FromClauseContext ctx) {
    final var methodName = "exitFromClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFromSource(final HiveParser.FromSourceContext ctx) {
    final var methodName = "exitFromSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFromStatement(final HiveParser.FromStatementContext ctx) {
    final var methodName = "exitFromStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_(final HiveParser.Function_Context ctx) {
    final var methodName = "exitFunction_";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionIdentifier(final HiveParser.FunctionIdentifierContext ctx) {
    final var methodName = "exitFunctionIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionName(final HiveParser.FunctionNameContext ctx) {
    final var methodName = "exitFunctionName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGlobalWmStatement(final HiveParser.GlobalWmStatementContext ctx) {
    final var methodName = "exitGlobalWmStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantOptionFor(final HiveParser.GrantOptionForContext ctx) {
    final var methodName = "exitGrantOptionFor";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantPrivileges(final HiveParser.GrantPrivilegesContext ctx) {
    final var methodName = "exitGrantPrivileges";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantRole(final HiveParser.GrantRoleContext ctx) {
    final var methodName = "exitGrantRole";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupby_expression(final HiveParser.Groupby_expressionContext ctx) {
    final var methodName = "exitGroupby_expression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupByClause(final HiveParser.GroupByClauseContext ctx) {
    final var methodName = "exitGroupByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupByEmpty(final HiveParser.GroupByEmptyContext ctx) {
    final var methodName = "exitGroupByEmpty";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupingExpressionSingle(final HiveParser.GroupingExpressionSingleContext ctx) {
    final var methodName = "exitGroupingExpressionSingle";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupingSetExpression(final HiveParser.GroupingSetExpressionContext ctx) {
    final var methodName = "exitGroupingSetExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupingSetExpressionMultiple(
      final HiveParser.GroupingSetExpressionMultipleContext ctx) {
    final var methodName = "exitGroupingSetExpressionMultiple";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHavingClause(final HiveParser.HavingClauseContext ctx) {
    final var methodName = "exitHavingClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHavingCondition(final HiveParser.HavingConditionContext ctx) {
    final var methodName = "exitHavingCondition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHint(final HiveParser.HintContext ctx) {
    final var methodName = "exitHint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHintArgName(final HiveParser.HintArgNameContext ctx) {
    final var methodName = "exitHintArgName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHintArgs(final HiveParser.HintArgsContext ctx) {
    final var methodName = "exitHintArgs";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHintItem(final HiveParser.HintItemContext ctx) {
    final var methodName = "exitHintItem";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHintList(final HiveParser.HintListContext ctx) {
    final var methodName = "exitHintList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHintName(final HiveParser.HintNameContext ctx) {
    final var methodName = "exitHintName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitId_(final HiveParser.Id_Context ctx) {
    final var methodName = "exitId_";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIfExists(final HiveParser.IfExistsContext ctx) {
    final var methodName = "exitIfExists";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIfNotExists(final HiveParser.IfNotExistsContext ctx) {
    final var methodName = "exitIfNotExists";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImportStatement(final HiveParser.ImportStatementContext ctx) {
    final var methodName = "exitImportStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInputFileFormat(final HiveParser.InputFileFormatContext ctx) {
    final var methodName = "exitInputFileFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsertClause(final HiveParser.InsertClauseContext ctx) {
    final var methodName = "exitInsertClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalExpression(final HiveParser.IntervalExpressionContext ctx) {
    final var methodName = "exitIntervalExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalLiteral(final HiveParser.IntervalLiteralContext ctx) {
    final var methodName = "exitIntervalLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalQualifiers(final HiveParser.IntervalQualifiersContext ctx) {
    final var methodName = "exitIntervalQualifiers";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalValue(final HiveParser.IntervalValueContext ctx) {
    final var methodName = "exitIntervalValue";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIsCondition(final HiveParser.IsConditionContext ctx) {
    final var methodName = "exitIsCondition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIsolationLevel(final HiveParser.IsolationLevelContext ctx) {
    final var methodName = "exitIsolationLevel";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoinSource(final HiveParser.JoinSourceContext ctx) {
    final var methodName = "exitJoinSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoinSourcePart(final HiveParser.JoinSourcePartContext ctx) {
    final var methodName = "exitJoinSourcePart";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoinToken(final HiveParser.JoinTokenContext ctx) {
    final var methodName = "exitJoinToken";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKeyProperty(final HiveParser.KeyPropertyContext ctx) {
    final var methodName = "exitKeyProperty";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKeyValueProperty(final HiveParser.KeyValuePropertyContext ctx) {
    final var methodName = "exitKeyValueProperty";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKillQueryStatement(final HiveParser.KillQueryStatementContext ctx) {
    final var methodName = "exitKillQueryStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLateralView(final HiveParser.LateralViewContext ctx) {
    final var methodName = "exitLateralView";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevelOfIsolation(final HiveParser.LevelOfIsolationContext ctx) {
    final var methodName = "exitLevelOfIsolation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLikeTableOrFile(final HiveParser.LikeTableOrFileContext ctx) {
    final var methodName = "exitLikeTableOrFile";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLimitClause(final HiveParser.LimitClauseContext ctx) {
    final var methodName = "exitLimitClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitListType(final HiveParser.ListTypeContext ctx) {
    final var methodName = "exitListType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoadStatement(final HiveParser.LoadStatementContext ctx) {
    final var methodName = "exitLoadStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockDatabase(final HiveParser.LockDatabaseContext ctx) {
    final var methodName = "exitLockDatabase";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockMode(final HiveParser.LockModeContext ctx) {
    final var methodName = "exitLockMode";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockStatement(final HiveParser.LockStatementContext ctx) {
    final var methodName = "exitLockStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMapType(final HiveParser.MapTypeContext ctx) {
    final var methodName = "exitMapType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMergeStatement(final HiveParser.MergeStatementContext ctx) {
    final var methodName = "exitMergeStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMetastoreCheck(final HiveParser.MetastoreCheckContext ctx) {
    final var methodName = "exitMetastoreCheck";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNonReserved(final HiveParser.NonReservedContext ctx) {
    final var methodName = "exitNonReserved";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNull_treatment(final HiveParser.Null_treatmentContext ctx) {
    final var methodName = "exitNull_treatment";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNullOrdering(final HiveParser.NullOrderingContext ctx) {
    final var methodName = "exitNullOrdering";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrderByClause(final HiveParser.OrderByClauseContext ctx) {
    final var methodName = "exitOrderByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrderSpecification(final HiveParser.OrderSpecificationContext ctx) {
    final var methodName = "exitOrderSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrderSpecificationRewrite(final HiveParser.OrderSpecificationRewriteContext ctx) {
    final var methodName = "exitOrderSpecificationRewrite";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrReplace(final HiveParser.OrReplaceContext ctx) {
    final var methodName = "exitOrReplace";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParameterIdx(final HiveParser.ParameterIdxContext ctx) {
    final var methodName = "exitParameterIdx";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionByClause(final HiveParser.PartitionByClauseContext ctx) {
    final var methodName = "exitPartitionByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionedTableFunction(final HiveParser.PartitionedTableFunctionContext ctx) {
    final var methodName = "exitPartitionedTableFunction";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitioningSpec(final HiveParser.PartitioningSpecContext ctx) {
    final var methodName = "exitPartitioningSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionLocation(final HiveParser.PartitionLocationContext ctx) {
    final var methodName = "exitPartitionLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionSelectorOperator(final HiveParser.PartitionSelectorOperatorContext ctx) {
    final var methodName = "exitPartitionSelectorOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionSelectorSpec(final HiveParser.PartitionSelectorSpecContext ctx) {
    final var methodName = "exitPartitionSelectorSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionSelectorVal(final HiveParser.PartitionSelectorValContext ctx) {
    final var methodName = "exitPartitionSelectorVal";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionSpec(final HiveParser.PartitionSpecContext ctx) {
    final var methodName = "exitPartitionSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionTableFunctionSource(
      final HiveParser.PartitionTableFunctionSourceContext ctx) {
    final var methodName = "exitPartitionTableFunctionSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionTransformSpec(final HiveParser.PartitionTransformSpecContext ctx) {
    final var methodName = "exitPartitionTransformSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionTransformType(final HiveParser.PartitionTransformTypeContext ctx) {
    final var methodName = "exitPartitionTransformType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionVal(final HiveParser.PartitionValContext ctx) {
    final var methodName = "exitPartitionVal";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartTypeExpr(final HiveParser.PartTypeExprContext ctx) {
    final var methodName = "exitPartTypeExpr";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPkUkConstraint(final HiveParser.PkUkConstraintContext ctx) {
    final var methodName = "exitPkUkConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPoolAssign(final HiveParser.PoolAssignContext ctx) {
    final var methodName = "exitPoolAssign";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPoolAssignList(final HiveParser.PoolAssignListContext ctx) {
    final var methodName = "exitPoolAssignList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPoolPath(final HiveParser.PoolPathContext ctx) {
    final var methodName = "exitPoolPath";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceAmpersandExpression(
      final HiveParser.PrecedenceAmpersandExpressionContext ctx) {
    final var methodName = "exitPrecedenceAmpersandExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceAmpersandOperator(
      final HiveParser.PrecedenceAmpersandOperatorContext ctx) {
    final var methodName = "exitPrecedenceAmpersandOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceAndExpression(final HiveParser.PrecedenceAndExpressionContext ctx) {
    final var methodName = "exitPrecedenceAndExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceAndOperator(final HiveParser.PrecedenceAndOperatorContext ctx) {
    final var methodName = "exitPrecedenceAndOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceBitwiseOrExpression(
      final HiveParser.PrecedenceBitwiseOrExpressionContext ctx) {
    final var methodName = "exitPrecedenceBitwiseOrExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceBitwiseOrOperator(
      final HiveParser.PrecedenceBitwiseOrOperatorContext ctx) {
    final var methodName = "exitPrecedenceBitwiseOrOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceBitwiseXorExpression(
      final HiveParser.PrecedenceBitwiseXorExpressionContext ctx) {
    final var methodName = "exitPrecedenceBitwiseXorExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceBitwiseXorOperator(
      final HiveParser.PrecedenceBitwiseXorOperatorContext ctx) {
    final var methodName = "exitPrecedenceBitwiseXorOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceConcatenateExpression(
      final HiveParser.PrecedenceConcatenateExpressionContext ctx) {
    final var methodName = "exitPrecedenceConcatenateExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceConcatenateOperator(
      final HiveParser.PrecedenceConcatenateOperatorContext ctx) {
    final var methodName = "exitPrecedenceConcatenateOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceDistinctOperator(
      final HiveParser.PrecedenceDistinctOperatorContext ctx) {
    final var methodName = "exitPrecedenceDistinctOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceEqualExpression(final HiveParser.PrecedenceEqualExpressionContext ctx) {
    final var methodName = "exitPrecedenceEqualExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceEqualOperator(final HiveParser.PrecedenceEqualOperatorContext ctx) {
    final var methodName = "exitPrecedenceEqualOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceFieldExpression(final HiveParser.PrecedenceFieldExpressionContext ctx) {
    final var methodName = "exitPrecedenceFieldExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceNotExpression(final HiveParser.PrecedenceNotExpressionContext ctx) {
    final var methodName = "exitPrecedenceNotExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceNotOperator(final HiveParser.PrecedenceNotOperatorContext ctx) {
    final var methodName = "exitPrecedenceNotOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceOrExpression(final HiveParser.PrecedenceOrExpressionContext ctx) {
    final var methodName = "exitPrecedenceOrExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceOrOperator(final HiveParser.PrecedenceOrOperatorContext ctx) {
    final var methodName = "exitPrecedenceOrOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedencePlusExpression(final HiveParser.PrecedencePlusExpressionContext ctx) {
    final var methodName = "exitPrecedencePlusExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedencePlusExpressionOrDefault(
      final HiveParser.PrecedencePlusExpressionOrDefaultContext ctx) {
    final var methodName = "exitPrecedencePlusExpressionOrDefault";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedencePlusOperator(final HiveParser.PrecedencePlusOperatorContext ctx) {
    final var methodName = "exitPrecedencePlusOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceRegexpOperator(final HiveParser.PrecedenceRegexpOperatorContext ctx) {
    final var methodName = "exitPrecedenceRegexpOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceSimilarExpression(
      final HiveParser.PrecedenceSimilarExpressionContext ctx) {
    final var methodName = "exitPrecedenceSimilarExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceSimilarExpressionAtom(
      final HiveParser.PrecedenceSimilarExpressionAtomContext ctx) {
    final var methodName = "exitPrecedenceSimilarExpressionAtom";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceSimilarExpressionIn(
      final HiveParser.PrecedenceSimilarExpressionInContext ctx) {
    final var methodName = "exitPrecedenceSimilarExpressionIn";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceSimilarExpressionMain(
      final HiveParser.PrecedenceSimilarExpressionMainContext ctx) {
    final var methodName = "exitPrecedenceSimilarExpressionMain";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceSimilarExpressionPart(
      final HiveParser.PrecedenceSimilarExpressionPartContext ctx) {
    final var methodName = "exitPrecedenceSimilarExpressionPart";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceSimilarExpressionPartNot(
      final HiveParser.PrecedenceSimilarExpressionPartNotContext ctx) {
    final var methodName = "exitPrecedenceSimilarExpressionPartNot";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceSimilarExpressionQuantifierPredicate(
      final HiveParser.PrecedenceSimilarExpressionQuantifierPredicateContext ctx) {
    final var methodName = "exitPrecedenceSimilarExpressionQuantifierPredicate";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceSimilarOperator(final HiveParser.PrecedenceSimilarOperatorContext ctx) {
    final var methodName = "exitPrecedenceSimilarOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceStarExpression(final HiveParser.PrecedenceStarExpressionContext ctx) {
    final var methodName = "exitPrecedenceStarExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceStarOperator(final HiveParser.PrecedenceStarOperatorContext ctx) {
    final var methodName = "exitPrecedenceStarOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceUnaryOperator(final HiveParser.PrecedenceUnaryOperatorContext ctx) {
    final var methodName = "exitPrecedenceUnaryOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceUnaryPrefixExpression(
      final HiveParser.PrecedenceUnaryPrefixExpressionContext ctx) {
    final var methodName = "exitPrecedenceUnaryPrefixExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceUnarySuffixExpression(
      final HiveParser.PrecedenceUnarySuffixExpressionContext ctx) {
    final var methodName = "exitPrecedenceUnarySuffixExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrepareStatement(final HiveParser.PrepareStatementContext ctx) {
    final var methodName = "exitPrepareStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrepareStmtParam(final HiveParser.PrepareStmtParamContext ctx) {
    final var methodName = "exitPrepareStmtParam";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimitiveType(final HiveParser.PrimitiveTypeContext ctx) {
    final var methodName = "exitPrimitiveType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrincipalIdentifier(final HiveParser.PrincipalIdentifierContext ctx) {
    final var methodName = "exitPrincipalIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrincipalName(final HiveParser.PrincipalNameContext ctx) {
    final var methodName = "exitPrincipalName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrincipalSpecification(final HiveParser.PrincipalSpecificationContext ctx) {
    final var methodName = "exitPrincipalSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilegeIncludeColObject(final HiveParser.PrivilegeIncludeColObjectContext ctx) {
    final var methodName = "exitPrivilegeIncludeColObject";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilegeList(final HiveParser.PrivilegeListContext ctx) {
    final var methodName = "exitPrivilegeList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilegeObject(final HiveParser.PrivilegeObjectContext ctx) {
    final var methodName = "exitPrivilegeObject";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilegeType(final HiveParser.PrivilegeTypeContext ctx) {
    final var methodName = "exitPrivilegeType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivlegeDef(final HiveParser.PrivlegeDefContext ctx) {
    final var methodName = "exitPrivlegeDef";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivObject(final HiveParser.PrivObjectContext ctx) {
    final var methodName = "exitPrivObject";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivObjectCols(final HiveParser.PrivObjectColsContext ctx) {
    final var methodName = "exitPrivObjectCols";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQualifyClause(final HiveParser.QualifyClauseContext ctx) {
    final var methodName = "exitQualifyClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuantifierType(final HiveParser.QuantifierTypeContext ctx) {
    final var methodName = "exitQuantifierType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQueryStatementExpression(final HiveParser.QueryStatementExpressionContext ctx) {
    final var methodName = "exitQueryStatementExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQueryStatementExpressionBody(
      final HiveParser.QueryStatementExpressionBodyContext ctx) {
    final var methodName = "exitQueryStatementExpressionBody";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRecordReader(final HiveParser.RecordReaderContext ctx) {
    final var methodName = "exitRecordReader";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRecordWriter(final HiveParser.RecordWriterContext ctx) {
    final var methodName = "exitRecordWriter";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRegularBody(final HiveParser.RegularBodyContext ctx) {
    final var methodName = "exitRegularBody";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReloadFunctionsStatement(final HiveParser.ReloadFunctionsStatementContext ctx) {
    final var methodName = "exitReloadFunctionsStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelySpecification(final HiveParser.RelySpecificationContext ctx) {
    final var methodName = "exitRelySpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplaceResourcePlanStatement(
      final HiveParser.ReplaceResourcePlanStatementContext ctx) {
    final var methodName = "exitReplaceResourcePlanStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplConfigs(final HiveParser.ReplConfigsContext ctx) {
    final var methodName = "exitReplConfigs";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplConfigsList(final HiveParser.ReplConfigsListContext ctx) {
    final var methodName = "exitReplConfigsList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplDbPolicy(final HiveParser.ReplDbPolicyContext ctx) {
    final var methodName = "exitReplDbPolicy";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplDumpStatement(final HiveParser.ReplDumpStatementContext ctx) {
    final var methodName = "exitReplDumpStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplicationClause(final HiveParser.ReplicationClauseContext ctx) {
    final var methodName = "exitReplicationClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplLoadStatement(final HiveParser.ReplLoadStatementContext ctx) {
    final var methodName = "exitReplLoadStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplStatusStatement(final HiveParser.ReplStatusStatementContext ctx) {
    final var methodName = "exitReplStatusStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplTableLevelPolicy(final HiveParser.ReplTableLevelPolicyContext ctx) {
    final var methodName = "exitReplTableLevelPolicy";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResource(final HiveParser.ResourceContext ctx) {
    final var methodName = "exitResource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResourceList(final HiveParser.ResourceListContext ctx) {
    final var methodName = "exitResourceList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResourcePlanDdlStatements(final HiveParser.ResourcePlanDdlStatementsContext ctx) {
    final var methodName = "exitResourcePlanDdlStatements";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResourceType(final HiveParser.ResourceTypeContext ctx) {
    final var methodName = "exitResourceType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRestrictOrCascade(final HiveParser.RestrictOrCascadeContext ctx) {
    final var methodName = "exitRestrictOrCascade";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevokePrivileges(final HiveParser.RevokePrivilegesContext ctx) {
    final var methodName = "exitRevokePrivileges";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevokeRole(final HiveParser.RevokeRoleContext ctx) {
    final var methodName = "exitRevokeRole";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRewriteDisabled(final HiveParser.RewriteDisabledContext ctx) {
    final var methodName = "exitRewriteDisabled";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRewriteEnabled(final HiveParser.RewriteEnabledContext ctx) {
    final var methodName = "exitRewriteEnabled";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollbackStatement(final HiveParser.RollbackStatementContext ctx) {
    final var methodName = "exitRollbackStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollupOldSyntax(final HiveParser.RollupOldSyntaxContext ctx) {
    final var methodName = "exitRollupOldSyntax";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollupStandard(final HiveParser.RollupStandardContext ctx) {
    final var methodName = "exitRollupStandard";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowFormat(final HiveParser.RowFormatContext ctx) {
    final var methodName = "exitRowFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowFormatDelimited(final HiveParser.RowFormatDelimitedContext ctx) {
    final var methodName = "exitRowFormatDelimited";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowFormatSerde(final HiveParser.RowFormatSerdeContext ctx) {
    final var methodName = "exitRowFormatSerde";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRpAssign(final HiveParser.RpAssignContext ctx) {
    final var methodName = "exitRpAssign";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRpAssignList(final HiveParser.RpAssignListContext ctx) {
    final var methodName = "exitRpAssignList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRpUnassign(final HiveParser.RpUnassignContext ctx) {
    final var methodName = "exitRpUnassign";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRpUnassignList(final HiveParser.RpUnassignListContext ctx) {
    final var methodName = "exitRpUnassignList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitScheduleSpec(final HiveParser.ScheduleSpecContext ctx) {
    final var methodName = "exitScheduleSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSearchCondition(final HiveParser.SearchConditionContext ctx) {
    final var methodName = "exitSearchCondition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectClause(final HiveParser.SelectClauseContext ctx) {
    final var methodName = "exitSelectClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectExpression(final HiveParser.SelectExpressionContext ctx) {
    final var methodName = "exitSelectExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectExpressionList(final HiveParser.SelectExpressionListContext ctx) {
    final var methodName = "exitSelectExpressionList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectItem(final HiveParser.SelectItemContext ctx) {
    final var methodName = "exitSelectItem";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectList(final HiveParser.SelectListContext ctx) {
    final var methodName = "exitSelectList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectStatement(final HiveParser.SelectStatementContext ctx) {
    final var methodName = "exitSelectStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectStatementWithCTE(final HiveParser.SelectStatementWithCTEContext ctx) {
    final var methodName = "exitSelectStatementWithCTE";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectTrfmClause(final HiveParser.SelectTrfmClauseContext ctx) {
    final var methodName = "exitSelectTrfmClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetAutoCommitStatement(final HiveParser.SetAutoCommitStatementContext ctx) {
    final var methodName = "exitSetAutoCommitStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetColumnsClause(final HiveParser.SetColumnsClauseContext ctx) {
    final var methodName = "exitSetColumnsClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetOperator(final HiveParser.SetOperatorContext ctx) {
    final var methodName = "exitSetOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetOpSelectStatement(final HiveParser.SetOpSelectStatementContext ctx) {
    final var methodName = "exitSetOpSelectStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetRole(final HiveParser.SetRoleContext ctx) {
    final var methodName = "exitSetRole";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCurrentRole(final HiveParser.ShowCurrentRoleContext ctx) {
    final var methodName = "exitShowCurrentRole";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowFunctionIdentifier(final HiveParser.ShowFunctionIdentifierContext ctx) {
    final var methodName = "exitShowFunctionIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowGrants(final HiveParser.ShowGrantsContext ctx) {
    final var methodName = "exitShowGrants";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowRoleGrants(final HiveParser.ShowRoleGrantsContext ctx) {
    final var methodName = "exitShowRoleGrants";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowRolePrincipals(final HiveParser.ShowRolePrincipalsContext ctx) {
    final var methodName = "exitShowRolePrincipals";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowRoles(final HiveParser.ShowRolesContext ctx) {
    final var methodName = "exitShowRoles";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowStatement(final HiveParser.ShowStatementContext ctx) {
    final var methodName = "exitShowStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowStmtIdentifier(final HiveParser.ShowStmtIdentifierContext ctx) {
    final var methodName = "exitShowStmtIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowTablesFilterExpr(final HiveParser.ShowTablesFilterExprContext ctx) {
    final var methodName = "exitShowTablesFilterExpr";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSingleFromStatement(final HiveParser.SingleFromStatementContext ctx) {
    final var methodName = "exitSingleFromStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedColumnValue(final HiveParser.SkewedColumnValueContext ctx) {
    final var methodName = "exitSkewedColumnValue";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedColumnValuePair(final HiveParser.SkewedColumnValuePairContext ctx) {
    final var methodName = "exitSkewedColumnValuePair";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedColumnValuePairList(final HiveParser.SkewedColumnValuePairListContext ctx) {
    final var methodName = "exitSkewedColumnValuePairList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedColumnValues(final HiveParser.SkewedColumnValuesContext ctx) {
    final var methodName = "exitSkewedColumnValues";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedLocationMap(final HiveParser.SkewedLocationMapContext ctx) {
    final var methodName = "exitSkewedLocationMap";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedLocations(final HiveParser.SkewedLocationsContext ctx) {
    final var methodName = "exitSkewedLocations";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedLocationsList(final HiveParser.SkewedLocationsListContext ctx) {
    final var methodName = "exitSkewedLocationsList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedValueElement(final HiveParser.SkewedValueElementContext ctx) {
    final var methodName = "exitSkewedValueElement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedValueLocationElement(
      final HiveParser.SkewedValueLocationElementContext ctx) {
    final var methodName = "exitSkewedValueLocationElement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSortByClause(final HiveParser.SortByClauseContext ctx) {
    final var methodName = "exitSortByClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSplitSample(final HiveParser.SplitSampleContext ctx) {
    final var methodName = "exitSplitSample";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSql11ReservedKeywordsUsedAsFunctionName(
      final HiveParser.Sql11ReservedKeywordsUsedAsFunctionNameContext ctx) {
    final var methodName = "exitSql11ReservedKeywordsUsedAsFunctionName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSqlTransactionStatement(final HiveParser.SqlTransactionStatementContext ctx) {
    final var methodName = "exitSqlTransactionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStartTransactionStatement(final HiveParser.StartTransactionStatementContext ctx) {
    final var methodName = "exitStartTransactionStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStatement(final HiveParser.StatementContext ctx) {
    final var methodName = "exitStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStoredAsDirs(final HiveParser.StoredAsDirsContext ctx) {
    final var methodName = "exitStoredAsDirs";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStringLiteralSequence(final HiveParser.StringLiteralSequenceContext ctx) {
    final var methodName = "exitStringLiteralSequence";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStructType(final HiveParser.StructTypeContext ctx) {
    final var methodName = "exitStructType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubQueryExpression(final HiveParser.SubQueryExpressionContext ctx) {
    final var methodName = "exitSubQueryExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubQuerySelectorOperator(final HiveParser.SubQuerySelectorOperatorContext ctx) {
    final var methodName = "exitSubQuerySelectorOperator";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubQuerySource(final HiveParser.SubQuerySourceContext ctx) {
    final var methodName = "exitSubQuerySource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSwitchDatabaseStatement(final HiveParser.SwitchDatabaseStatementContext ctx) {
    final var methodName = "exitSwitchDatabaseStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSysFuncNames(final HiveParser.SysFuncNamesContext ctx) {
    final var methodName = "exitSysFuncNames";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableAlias(final HiveParser.TableAliasContext ctx) {
    final var methodName = "exitTableAlias";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableAllColumns(final HiveParser.TableAllColumnsContext ctx) {
    final var methodName = "exitTableAllColumns";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableBuckets(final HiveParser.TableBucketsContext ctx) {
    final var methodName = "exitTableBuckets";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableBucketSample(final HiveParser.TableBucketSampleContext ctx) {
    final var methodName = "exitTableBucketSample";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableComment(final HiveParser.TableCommentContext ctx) {
    final var methodName = "exitTableComment";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableConstraint(final HiveParser.TableConstraintContext ctx) {
    final var methodName = "exitTableConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableConstraintType(final HiveParser.TableConstraintTypeContext ctx) {
    final var methodName = "exitTableConstraintType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableFileFormat(final HiveParser.TableFileFormatContext ctx) {
    final var methodName = "exitTableFileFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableImplBuckets(final HiveParser.TableImplBucketsContext ctx) {
    final var methodName = "exitTableImplBuckets";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableLevelConstraint(final HiveParser.TableLevelConstraintContext ctx) {
    final var methodName = "exitTableLevelConstraint";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableLocation(final HiveParser.TableLocationContext ctx) {
    final var methodName = "exitTableLocation";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableName(final HiveParser.TableNameContext ctx) {
    final var methodName = "exitTableName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOrColumn(final HiveParser.TableOrColumnContext ctx) {
    final var methodName = "exitTableOrColumn";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOrPartition(final HiveParser.TableOrPartitionContext ctx) {
    final var methodName = "exitTableOrPartition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablePartitionPrefix(final HiveParser.TablePartitionPrefixContext ctx) {
    final var methodName = "exitTablePartitionPrefix";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableProperties(final HiveParser.TablePropertiesContext ctx) {
    final var methodName = "exitTableProperties";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablePropertiesList(final HiveParser.TablePropertiesListContext ctx) {
    final var methodName = "exitTablePropertiesList";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablePropertiesPrefixed(final HiveParser.TablePropertiesPrefixedContext ctx) {
    final var methodName = "exitTablePropertiesPrefixed";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableRowFormat(final HiveParser.TableRowFormatContext ctx) {
    final var methodName = "exitTableRowFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableRowFormatCollItemsIdentifier(
      final HiveParser.TableRowFormatCollItemsIdentifierContext ctx) {
    final var methodName = "exitTableRowFormatCollItemsIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableRowFormatFieldIdentifier(
      final HiveParser.TableRowFormatFieldIdentifierContext ctx) {
    final var methodName = "exitTableRowFormatFieldIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableRowFormatLinesIdentifier(
      final HiveParser.TableRowFormatLinesIdentifierContext ctx) {
    final var methodName = "exitTableRowFormatLinesIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableRowFormatMapKeysIdentifier(
      final HiveParser.TableRowFormatMapKeysIdentifierContext ctx) {
    final var methodName = "exitTableRowFormatMapKeysIdentifier";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableRowNullFormat(final HiveParser.TableRowNullFormatContext ctx) {
    final var methodName = "exitTableRowNullFormat";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSample(final HiveParser.TableSampleContext ctx) {
    final var methodName = "exitTableSample";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSkewed(final HiveParser.TableSkewedContext ctx) {
    final var methodName = "exitTableSkewed";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSource(final HiveParser.TableSourceContext ctx) {
    final var methodName = "exitTableSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTabPartColTypeExpr(final HiveParser.TabPartColTypeExprContext ctx) {
    final var methodName = "exitTabPartColTypeExpr";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTabTypeExpr(final HiveParser.TabTypeExprContext ctx) {
    final var methodName = "exitTabTypeExpr";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTimeQualifiers(final HiveParser.TimeQualifiersContext ctx) {
    final var methodName = "exitTimeQualifiers";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTimestampLiteral(final HiveParser.TimestampLiteralContext ctx) {
    final var methodName = "exitTimestampLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTimestampLocalTZLiteral(final HiveParser.TimestampLocalTZLiteralContext ctx) {
    final var methodName = "exitTimestampLocalTZLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionAccessMode(final HiveParser.TransactionAccessModeContext ctx) {
    final var methodName = "exitTransactionAccessMode";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionMode(final HiveParser.TransactionModeContext ctx) {
    final var methodName = "exitTransactionMode";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrfmClause(final HiveParser.TrfmClauseContext ctx) {
    final var methodName = "exitTrfmClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerActionExpression(final HiveParser.TriggerActionExpressionContext ctx) {
    final var methodName = "exitTriggerActionExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerActionExpressionStandalone(
      final HiveParser.TriggerActionExpressionStandaloneContext ctx) {
    final var methodName = "exitTriggerActionExpressionStandalone";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerAndExpression(final HiveParser.TriggerAndExpressionContext ctx) {
    final var methodName = "exitTriggerAndExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerAtomExpression(final HiveParser.TriggerAtomExpressionContext ctx) {
    final var methodName = "exitTriggerAtomExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerExpression(final HiveParser.TriggerExpressionContext ctx) {
    final var methodName = "exitTriggerExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerExpressionStandalone(
      final HiveParser.TriggerExpressionStandaloneContext ctx) {
    final var methodName = "exitTriggerExpressionStandalone";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerLiteral(final HiveParser.TriggerLiteralContext ctx) {
    final var methodName = "exitTriggerLiteral";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerOrExpression(final HiveParser.TriggerOrExpressionContext ctx) {
    final var methodName = "exitTriggerOrExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrimFunction(final HiveParser.TrimFunctionContext ctx) {
    final var methodName = "exitTrimFunction";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTruncateTableStatement(final HiveParser.TruncateTableStatementContext ctx) {
    final var methodName = "exitTruncateTableStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType(final HiveParser.TypeContext ctx) {
    final var methodName = "exitType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnionType(final HiveParser.UnionTypeContext ctx) {
    final var methodName = "exitUnionType";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueJoinExpr(final HiveParser.UniqueJoinExprContext ctx) {
    final var methodName = "exitUniqueJoinExpr";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueJoinSource(final HiveParser.UniqueJoinSourceContext ctx) {
    final var methodName = "exitUniqueJoinSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueJoinTableSource(final HiveParser.UniqueJoinTableSourceContext ctx) {
    final var methodName = "exitUniqueJoinTableSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueJoinToken(final HiveParser.UniqueJoinTokenContext ctx) {
    final var methodName = "exitUniqueJoinToken";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnlockDatabase(final HiveParser.UnlockDatabaseContext ctx) {
    final var methodName = "exitUnlockDatabase";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnlockStatement(final HiveParser.UnlockStatementContext ctx) {
    final var methodName = "exitUnlockStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnmanaged(final HiveParser.UnmanagedContext ctx) {
    final var methodName = "exitUnmanaged";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdateOrDelete(final HiveParser.UpdateOrDeleteContext ctx) {
    final var methodName = "exitUpdateOrDelete";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdateStatement(final HiveParser.UpdateStatementContext ctx) {
    final var methodName = "exitUpdateStatement";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValidateSpecification(final HiveParser.ValidateSpecificationContext ctx) {
    final var methodName = "exitValidateSpecification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValueRowConstructor(final HiveParser.ValueRowConstructorContext ctx) {
    final var methodName = "exitValueRowConstructor";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValuesClause(final HiveParser.ValuesClauseContext ctx) {
    final var methodName = "exitValuesClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValuesSource(final HiveParser.ValuesSourceContext ctx) {
    final var methodName = "exitValuesSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValuesTableConstructor(final HiveParser.ValuesTableConstructorContext ctx) {
    final var methodName = "exitValuesTableConstructor";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVectorizationOnly(final HiveParser.VectorizationOnlyContext ctx) {
    final var methodName = "exitVectorizationOnly";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVectorizatonDetail(final HiveParser.VectorizatonDetailContext ctx) {
    final var methodName = "exitVectorizatonDetail";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewClusterSpec(final HiveParser.ViewClusterSpecContext ctx) {
    final var methodName = "exitViewClusterSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewComplexSpec(final HiveParser.ViewComplexSpecContext ctx) {
    final var methodName = "exitViewComplexSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewDistSpec(final HiveParser.ViewDistSpecContext ctx) {
    final var methodName = "exitViewDistSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewName(final HiveParser.ViewNameContext ctx) {
    final var methodName = "exitViewName";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewOrganization(final HiveParser.ViewOrganizationContext ctx) {
    final var methodName = "exitViewOrganization";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewPartition(final HiveParser.ViewPartitionContext ctx) {
    final var methodName = "exitViewPartition";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewSortSpec(final HiveParser.ViewSortSpecContext ctx) {
    final var methodName = "exitViewSortSpec";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVirtualTableSource(final HiveParser.VirtualTableSourceContext ctx) {
    final var methodName = "exitVirtualTableSource";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhenClauses(final HiveParser.WhenClausesContext ctx) {
    final var methodName = "exitWhenClauses";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhenExpression(final HiveParser.WhenExpressionContext ctx) {
    final var methodName = "exitWhenExpression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhenMatchedAndClause(final HiveParser.WhenMatchedAndClauseContext ctx) {
    final var methodName = "exitWhenMatchedAndClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhenMatchedThenClause(final HiveParser.WhenMatchedThenClauseContext ctx) {
    final var methodName = "exitWhenMatchedThenClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhenNotMatchedClause(final HiveParser.WhenNotMatchedClauseContext ctx) {
    final var methodName = "exitWhenNotMatchedClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhereClause(final HiveParser.WhereClauseContext ctx) {
    final var methodName = "exitWhereClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_clause(final HiveParser.Window_clauseContext ctx) {
    final var methodName = "exitWindow_clause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_defn(final HiveParser.Window_defnContext ctx) {
    final var methodName = "exitWindow_defn";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_frame(final HiveParser.Window_frameContext ctx) {
    final var methodName = "exitWindow_frame";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_frame_boundary(final HiveParser.Window_frame_boundaryContext ctx) {
    final var methodName = "exitWindow_frame_boundary";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_frame_start_boundary(
      final HiveParser.Window_frame_start_boundaryContext ctx) {
    final var methodName = "exitWindow_frame_start_boundary";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_range_expression(final HiveParser.Window_range_expressionContext ctx) {
    final var methodName = "exitWindow_range_expression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_specification(final HiveParser.Window_specificationContext ctx) {
    final var methodName = "exitWindow_specification";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_value_expression(final HiveParser.Window_value_expressionContext ctx) {
    final var methodName = "exitWindow_value_expression";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithAdminOption(final HiveParser.WithAdminOptionContext ctx) {
    final var methodName = "exitWithAdminOption";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithClause(final HiveParser.WithClauseContext ctx) {
    final var methodName = "exitWithClause";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithGrantOption(final HiveParser.WithGrantOptionContext ctx) {
    final var methodName = "exitWithGrantOption";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithReplace(final HiveParser.WithReplaceContext ctx) {
    final var methodName = "exitWithReplace";
    HiveParserListenerBase.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void visitErrorNode(final ErrorNode node) {
    final var methodName = "visitErrorNode";
    HiveParserListenerBase.traceChildren(methodName, node);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void visitTerminal(final TerminalNode node) {
    final var methodName = "visitTerminal";
    HiveParserListenerBase.traceChildren(methodName, node);
  }
}
