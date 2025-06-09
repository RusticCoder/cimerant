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
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.LoggerFactory;
import sql.hive.v4.HiveParser;
import sql.hive.v4.HiveParserBaseListener;
import sql.hive.v4.HiveParserListener;

/**
 * This class provides an empty implementation of {@link HiveParserListener}, which can be extended
 * to create a listener which only needs to handle a subset of the available methods.
 */
public class HiveParserListenerImpl extends HiveParserBaseListener {
  private static CharStream input;
  private static final CimerantLogger logger;

  static {
    logger = (CimerantLogger) LoggerFactory.getLogger(HiveParserListenerImpl.class.getName());
  }

  private static final void traceChildren(final String methodName, final ParseTree ctx) {
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
  public void enterAbortCompactionStatement(final HiveParser.AbortCompactionStatementContext ctx) {
    final var methodName = "enterAbortCompactionStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterActivate(final HiveParser.ActivateContext ctx) {
    final var methodName = "enterActivate";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdminOptionFor(final HiveParser.AdminOptionForContext ctx) {
    final var methodName = "enterAdminOptionFor";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAliasList(final HiveParser.AliasListContext ctx) {
    final var methodName = "enterAliasList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAll_distinct(final HiveParser.All_distinctContext ctx) {
    final var methodName = "enterAll_distinct";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterColConstraint(final HiveParser.AlterColConstraintContext ctx) {
    final var methodName = "enterAlterColConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterColumnConstraint(final HiveParser.AlterColumnConstraintContext ctx) {
    final var methodName = "enterAlterColumnConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterConstraintWithName(final HiveParser.AlterConstraintWithNameContext ctx) {
    final var methodName = "enterAlterConstraintWithName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterForeignKeyWithName(final HiveParser.AlterForeignKeyWithNameContext ctx) {
    final var methodName = "enterAlterForeignKeyWithName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterMappingStatement(final HiveParser.AlterMappingStatementContext ctx) {
    final var methodName = "enterAlterMappingStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterPoolStatement(final HiveParser.AlterPoolStatementContext ctx) {
    final var methodName = "enterAlterPoolStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterStatement(final HiveParser.AlterStatementContext ctx) {
    final var methodName = "enterAlterStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterTriggerStatement(final HiveParser.AlterTriggerStatementContext ctx) {
    final var methodName = "enterAlterTriggerStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterViewStatementSuffix(final HiveParser.AlterViewStatementSuffixContext ctx) {
    final var methodName = "enterAlterViewStatementSuffix";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAnalyzeStatement(final HiveParser.AnalyzeStatementContext ctx) {
    final var methodName = "enterAnalyzeStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAsOfClause(final HiveParser.AsOfClauseContext ctx) {
    final var methodName = "enterAsOfClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAtomExpression(final HiveParser.AtomExpressionContext ctx) {
    final var methodName = "enterAtomExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAtomjoinSource(final HiveParser.AtomjoinSourceContext ctx) {
    final var methodName = "enterAtomjoinSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAtomSelectStatement(final HiveParser.AtomSelectStatementContext ctx) {
    final var methodName = "enterAtomSelectStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBlocking(final HiveParser.BlockingContext ctx) {
    final var methodName = "enterBlocking";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBody(final HiveParser.BodyContext ctx) {
    final var methodName = "enterBody";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBooleanValue(final HiveParser.BooleanValueContext ctx) {
    final var methodName = "enterBooleanValue";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBooleanValueTok(final HiveParser.BooleanValueTokContext ctx) {
    final var methodName = "enterBooleanValueTok";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseExpression(final HiveParser.CaseExpressionContext ctx) {
    final var methodName = "enterCaseExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCastExpression(final HiveParser.CastExpressionContext ctx) {
    final var methodName = "enterCastExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharSetStringLiteral(final HiveParser.CharSetStringLiteralContext ctx) {
    final var methodName = "enterCharSetStringLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheckConstraint(final HiveParser.CheckConstraintContext ctx) {
    final var methodName = "enterCheckConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterClusterByClause(final HiveParser.ClusterByClauseContext ctx) {
    final var methodName = "enterClusterByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColConstraint(final HiveParser.ColConstraintContext ctx) {
    final var methodName = "enterColConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColType(final HiveParser.ColTypeContext ctx) {
    final var methodName = "enterColType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColTypeList(final HiveParser.ColTypeListContext ctx) {
    final var methodName = "enterColTypeList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnAssignmentClause(final HiveParser.ColumnAssignmentClauseContext ctx) {
    final var methodName = "enterColumnAssignmentClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnConstraint(final HiveParser.ColumnConstraintContext ctx) {
    final var methodName = "enterColumnConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnConstraintType(final HiveParser.ColumnConstraintTypeContext ctx) {
    final var methodName = "enterColumnConstraintType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnName(final HiveParser.ColumnNameContext ctx) {
    final var methodName = "enterColumnName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameColonType(final HiveParser.ColumnNameColonTypeContext ctx) {
    final var methodName = "enterColumnNameColonType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameColonTypeList(final HiveParser.ColumnNameColonTypeListContext ctx) {
    final var methodName = "enterColumnNameColonTypeList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameComment(final HiveParser.ColumnNameCommentContext ctx) {
    final var methodName = "enterColumnNameComment";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameCommentList(final HiveParser.ColumnNameCommentListContext ctx) {
    final var methodName = "enterColumnNameCommentList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameList(final HiveParser.ColumnNameListContext ctx) {
    final var methodName = "enterColumnNameList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameOrder(final HiveParser.ColumnNameOrderContext ctx) {
    final var methodName = "enterColumnNameOrder";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameOrderList(final HiveParser.ColumnNameOrderListContext ctx) {
    final var methodName = "enterColumnNameOrderList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameType(final HiveParser.ColumnNameTypeContext ctx) {
    final var methodName = "enterColumnNameType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameTypeConstraint(final HiveParser.ColumnNameTypeConstraintContext ctx) {
    final var methodName = "enterColumnNameTypeConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnNameTypeList(final HiveParser.ColumnNameTypeListContext ctx) {
    final var methodName = "enterColumnNameTypeList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnParenthesesList(final HiveParser.ColumnParenthesesListContext ctx) {
    final var methodName = "enterColumnParenthesesList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnRefOrder(final HiveParser.ColumnRefOrderContext ctx) {
    final var methodName = "enterColumnRefOrder";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommitStatement(final HiveParser.CommitStatementContext ctx) {
    final var methodName = "enterCommitStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompactionId(final HiveParser.CompactionIdContext ctx) {
    final var methodName = "enterCompactionId";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompactionPool(final HiveParser.CompactionPoolContext ctx) {
    final var methodName = "enterCompactionPool";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompactionStatus(final HiveParser.CompactionStatusContext ctx) {
    final var methodName = "enterCompactionStatus";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompactionType(final HiveParser.CompactionTypeContext ctx) {
    final var methodName = "enterCompactionType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompactPool(final HiveParser.CompactPoolContext ctx) {
    final var methodName = "enterCompactPool";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComparisionOperator(final HiveParser.ComparisionOperatorContext ctx) {
    final var methodName = "enterComparisionOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstant(final HiveParser.ConstantContext ctx) {
    final var methodName = "enterConstant";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraintOptsAlter(final HiveParser.ConstraintOptsAlterContext ctx) {
    final var methodName = "enterConstraintOptsAlter";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraintOptsCreate(final HiveParser.ConstraintOptsCreateContext ctx) {
    final var methodName = "enterConstraintOptsCreate";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateConstraint(final HiveParser.CreateConstraintContext ctx) {
    final var methodName = "enterCreateConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateDatabaseStatement(final HiveParser.CreateDatabaseStatementContext ctx) {
    final var methodName = "enterCreateDatabaseStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateForeignKey(final HiveParser.CreateForeignKeyContext ctx) {
    final var methodName = "enterCreateForeignKey";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateFunctionStatement(final HiveParser.CreateFunctionStatementContext ctx) {
    final var methodName = "enterCreateFunctionStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateMacroStatement(final HiveParser.CreateMacroStatementContext ctx) {
    final var methodName = "enterCreateMacroStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateMappingStatement(final HiveParser.CreateMappingStatementContext ctx) {
    final var methodName = "enterCreateMappingStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreatePoolStatement(final HiveParser.CreatePoolStatementContext ctx) {
    final var methodName = "enterCreatePoolStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateRoleStatement(final HiveParser.CreateRoleStatementContext ctx) {
    final var methodName = "enterCreateRoleStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTablePartitionSpec(final HiveParser.CreateTablePartitionSpecContext ctx) {
    final var methodName = "enterCreateTablePartitionSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTableStatement(final HiveParser.CreateTableStatementContext ctx) {
    final var methodName = "enterCreateTableStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTriggerStatement(final HiveParser.CreateTriggerStatementContext ctx) {
    final var methodName = "enterCreateTriggerStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateViewStatement(final HiveParser.CreateViewStatementContext ctx) {
    final var methodName = "enterCreateViewStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCteStatement(final HiveParser.CteStatementContext ctx) {
    final var methodName = "enterCteStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDatabaseComment(final HiveParser.DatabaseCommentContext ctx) {
    final var methodName = "enterDatabaseComment";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDataConnectorComment(final HiveParser.DataConnectorCommentContext ctx) {
    final var methodName = "enterDataConnectorComment";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDataConnectorType(final HiveParser.DataConnectorTypeContext ctx) {
    final var methodName = "enterDataConnectorType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDataConnectorUrl(final HiveParser.DataConnectorUrlContext ctx) {
    final var methodName = "enterDataConnectorUrl";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDateLiteral(final HiveParser.DateLiteralContext ctx) {
    final var methodName = "enterDateLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDb_schema(final HiveParser.Db_schemaContext ctx) {
    final var methodName = "enterDb_schema";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDbConnectorName(final HiveParser.DbConnectorNameContext ctx) {
    final var methodName = "enterDbConnectorName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDbLocation(final HiveParser.DbLocationContext ctx) {
    final var methodName = "enterDbLocation";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDbManagedLocation(final HiveParser.DbManagedLocationContext ctx) {
    final var methodName = "enterDbManagedLocation";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDbProperties(final HiveParser.DbPropertiesContext ctx) {
    final var methodName = "enterDbProperties";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDbPropertiesList(final HiveParser.DbPropertiesListContext ctx) {
    final var methodName = "enterDbPropertiesList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDcProperties(final HiveParser.DcPropertiesContext ctx) {
    final var methodName = "enterDcProperties";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDdlStatement(final HiveParser.DdlStatementContext ctx) {
    final var methodName = "enterDdlStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefaultVal(final HiveParser.DefaultValContext ctx) {
    final var methodName = "enterDefaultVal";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefaultValue(final HiveParser.DefaultValueContext ctx) {
    final var methodName = "enterDefaultValue";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefinedAsSpec(final HiveParser.DefinedAsSpecContext ctx) {
    final var methodName = "enterDefinedAsSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeleteStatement(final HiveParser.DeleteStatementContext ctx) {
    final var methodName = "enterDeleteStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescFuncNames(final HiveParser.DescFuncNamesContext ctx) {
    final var methodName = "enterDescFuncNames";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescStatement(final HiveParser.DescStatementContext ctx) {
    final var methodName = "enterDescStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDestination(final HiveParser.DestinationContext ctx) {
    final var methodName = "enterDestination";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDisable(final HiveParser.DisableContext ctx) {
    final var methodName = "enterDisable";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDistributeByClause(final HiveParser.DistributeByClauseContext ctx) {
    final var methodName = "enterDistributeByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropDatabaseStatement(final HiveParser.DropDatabaseStatementContext ctx) {
    final var methodName = "enterDropDatabaseStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropFunctionStatement(final HiveParser.DropFunctionStatementContext ctx) {
    final var methodName = "enterDropFunctionStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropMacroStatement(final HiveParser.DropMacroStatementContext ctx) {
    final var methodName = "enterDropMacroStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropMappingStatement(final HiveParser.DropMappingStatementContext ctx) {
    final var methodName = "enterDropMappingStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropPoolStatement(final HiveParser.DropPoolStatementContext ctx) {
    final var methodName = "enterDropPoolStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropRoleStatement(final HiveParser.DropRoleStatementContext ctx) {
    final var methodName = "enterDropRoleStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropTableStatement(final HiveParser.DropTableStatementContext ctx) {
    final var methodName = "enterDropTableStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropTriggerStatement(final HiveParser.DropTriggerStatementContext ctx) {
    final var methodName = "enterDropTriggerStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropViewStatement(final HiveParser.DropViewStatementContext ctx) {
    final var methodName = "enterDropViewStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnable(final HiveParser.EnableContext ctx) {
    final var methodName = "enterEnable";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnableSpecification(final HiveParser.EnableSpecificationContext ctx) {
    final var methodName = "enterEnableSpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnforcedSpecification(final HiveParser.EnforcedSpecificationContext ctx) {
    final var methodName = "enterEnforcedSpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    final var methodName = "enterEveryRule";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecStatement(final HiveParser.ExecStatementContext ctx) {
    final var methodName = "enterExecStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecutedAsSpec(final HiveParser.ExecutedAsSpecContext ctx) {
    final var methodName = "enterExecutedAsSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecuteParamList(final HiveParser.ExecuteParamListContext ctx) {
    final var methodName = "enterExecuteParamList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecuteStatement(final HiveParser.ExecuteStatementContext ctx) {
    final var methodName = "enterExecuteStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplainOption(final HiveParser.ExplainOptionContext ctx) {
    final var methodName = "enterExplainOption";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplainStatement(final HiveParser.ExplainStatementContext ctx) {
    final var methodName = "enterExplainStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExportStatement(final HiveParser.ExportStatementContext ctx) {
    final var methodName = "enterExportStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpression(final HiveParser.ExpressionContext ctx) {
    final var methodName = "enterExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionList(final HiveParser.ExpressionListContext ctx) {
    final var methodName = "enterExpressionList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionOrDefault(final HiveParser.ExpressionOrDefaultContext ctx) {
    final var methodName = "enterExpressionOrDefault";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionPart(final HiveParser.ExpressionPartContext ctx) {
    final var methodName = "enterExpressionPart";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressions(final HiveParser.ExpressionsContext ctx) {
    final var methodName = "enterExpressions";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionsInParenthesis(final HiveParser.ExpressionsInParenthesisContext ctx) {
    final var methodName = "enterExpressionsInParenthesis";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionWithAlias(final HiveParser.ExpressionWithAliasContext ctx) {
    final var methodName = "enterExpressionWithAlias";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExtColumnName(final HiveParser.ExtColumnNameContext ctx) {
    final var methodName = "enterExtColumnName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExtractExpression(final HiveParser.ExtractExpressionContext ctx) {
    final var methodName = "enterExtractExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFileFormat(final HiveParser.FileFormatContext ctx) {
    final var methodName = "enterFileFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFirstValueRowConstructor(final HiveParser.FirstValueRowConstructorContext ctx) {
    final var methodName = "enterFirstValueRowConstructor";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFloorDateQualifiers(final HiveParser.FloorDateQualifiersContext ctx) {
    final var methodName = "enterFloorDateQualifiers";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFloorExpression(final HiveParser.FloorExpressionContext ctx) {
    final var methodName = "enterFloorExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForce(final HiveParser.ForceContext ctx) {
    final var methodName = "enterForce";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForeignKeyConstraint(final HiveParser.ForeignKeyConstraintContext ctx) {
    final var methodName = "enterForeignKeyConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrom_in(final HiveParser.From_inContext ctx) {
    final var methodName = "enterFrom_in";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFromClause(final HiveParser.FromClauseContext ctx) {
    final var methodName = "enterFromClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFromSource(final HiveParser.FromSourceContext ctx) {
    final var methodName = "enterFromSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFromStatement(final HiveParser.FromStatementContext ctx) {
    final var methodName = "enterFromStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunction_(final HiveParser.Function_Context ctx) {
    final var methodName = "enterFunction_";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionIdentifier(final HiveParser.FunctionIdentifierContext ctx) {
    final var methodName = "enterFunctionIdentifier";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionName(final HiveParser.FunctionNameContext ctx) {
    final var methodName = "enterFunctionName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGlobalWmStatement(final HiveParser.GlobalWmStatementContext ctx) {
    final var methodName = "enterGlobalWmStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantOptionFor(final HiveParser.GrantOptionForContext ctx) {
    final var methodName = "enterGrantOptionFor";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantPrivileges(final HiveParser.GrantPrivilegesContext ctx) {
    final var methodName = "enterGrantPrivileges";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantRole(final HiveParser.GrantRoleContext ctx) {
    final var methodName = "enterGrantRole";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupby_expression(final HiveParser.Groupby_expressionContext ctx) {
    final var methodName = "enterGroupby_expression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupByClause(final HiveParser.GroupByClauseContext ctx) {
    final var methodName = "enterGroupByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupByEmpty(final HiveParser.GroupByEmptyContext ctx) {
    final var methodName = "enterGroupByEmpty";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupingExpressionSingle(final HiveParser.GroupingExpressionSingleContext ctx) {
    final var methodName = "enterGroupingExpressionSingle";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupingSetExpression(final HiveParser.GroupingSetExpressionContext ctx) {
    final var methodName = "enterGroupingSetExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHavingClause(final HiveParser.HavingClauseContext ctx) {
    final var methodName = "enterHavingClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHavingCondition(final HiveParser.HavingConditionContext ctx) {
    final var methodName = "enterHavingCondition";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHint(final HiveParser.HintContext ctx) {
    final var methodName = "enterHint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHintArgName(final HiveParser.HintArgNameContext ctx) {
    final var methodName = "enterHintArgName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHintArgs(final HiveParser.HintArgsContext ctx) {
    final var methodName = "enterHintArgs";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHintItem(final HiveParser.HintItemContext ctx) {
    final var methodName = "enterHintItem";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHintList(final HiveParser.HintListContext ctx) {
    final var methodName = "enterHintList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHintName(final HiveParser.HintNameContext ctx) {
    final var methodName = "enterHintName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterId_(final HiveParser.Id_Context ctx) {
    final var methodName = "enterId_";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIfExists(final HiveParser.IfExistsContext ctx) {
    final var methodName = "enterIfExists";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIfNotExists(final HiveParser.IfNotExistsContext ctx) {
    final var methodName = "enterIfNotExists";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterImportStatement(final HiveParser.ImportStatementContext ctx) {
    final var methodName = "enterImportStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInputFileFormat(final HiveParser.InputFileFormatContext ctx) {
    final var methodName = "enterInputFileFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsertClause(final HiveParser.InsertClauseContext ctx) {
    final var methodName = "enterInsertClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalExpression(final HiveParser.IntervalExpressionContext ctx) {
    final var methodName = "enterIntervalExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalLiteral(final HiveParser.IntervalLiteralContext ctx) {
    final var methodName = "enterIntervalLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalQualifiers(final HiveParser.IntervalQualifiersContext ctx) {
    final var methodName = "enterIntervalQualifiers";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalValue(final HiveParser.IntervalValueContext ctx) {
    final var methodName = "enterIntervalValue";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIsCondition(final HiveParser.IsConditionContext ctx) {
    final var methodName = "enterIsCondition";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIsolationLevel(final HiveParser.IsolationLevelContext ctx) {
    final var methodName = "enterIsolationLevel";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoinSource(final HiveParser.JoinSourceContext ctx) {
    final var methodName = "enterJoinSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoinSourcePart(final HiveParser.JoinSourcePartContext ctx) {
    final var methodName = "enterJoinSourcePart";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoinToken(final HiveParser.JoinTokenContext ctx) {
    final var methodName = "enterJoinToken";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKeyProperty(final HiveParser.KeyPropertyContext ctx) {
    final var methodName = "enterKeyProperty";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKeyValueProperty(final HiveParser.KeyValuePropertyContext ctx) {
    final var methodName = "enterKeyValueProperty";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKillQueryStatement(final HiveParser.KillQueryStatementContext ctx) {
    final var methodName = "enterKillQueryStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLateralView(final HiveParser.LateralViewContext ctx) {
    final var methodName = "enterLateralView";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevelOfIsolation(final HiveParser.LevelOfIsolationContext ctx) {
    final var methodName = "enterLevelOfIsolation";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLikeTableOrFile(final HiveParser.LikeTableOrFileContext ctx) {
    final var methodName = "enterLikeTableOrFile";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLimitClause(final HiveParser.LimitClauseContext ctx) {
    final var methodName = "enterLimitClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterListType(final HiveParser.ListTypeContext ctx) {
    final var methodName = "enterListType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoadStatement(final HiveParser.LoadStatementContext ctx) {
    final var methodName = "enterLoadStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockDatabase(final HiveParser.LockDatabaseContext ctx) {
    final var methodName = "enterLockDatabase";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockMode(final HiveParser.LockModeContext ctx) {
    final var methodName = "enterLockMode";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockStatement(final HiveParser.LockStatementContext ctx) {
    final var methodName = "enterLockStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMapType(final HiveParser.MapTypeContext ctx) {
    final var methodName = "enterMapType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMergeStatement(final HiveParser.MergeStatementContext ctx) {
    final var methodName = "enterMergeStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMetastoreCheck(final HiveParser.MetastoreCheckContext ctx) {
    final var methodName = "enterMetastoreCheck";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNonReserved(final HiveParser.NonReservedContext ctx) {
    final var methodName = "enterNonReserved";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNull_treatment(final HiveParser.Null_treatmentContext ctx) {
    final var methodName = "enterNull_treatment";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNullOrdering(final HiveParser.NullOrderingContext ctx) {
    final var methodName = "enterNullOrdering";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrderByClause(final HiveParser.OrderByClauseContext ctx) {
    final var methodName = "enterOrderByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrderSpecification(final HiveParser.OrderSpecificationContext ctx) {
    final var methodName = "enterOrderSpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrReplace(final HiveParser.OrReplaceContext ctx) {
    final var methodName = "enterOrReplace";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParameterIdx(final HiveParser.ParameterIdxContext ctx) {
    final var methodName = "enterParameterIdx";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionByClause(final HiveParser.PartitionByClauseContext ctx) {
    final var methodName = "enterPartitionByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionedTableFunction(final HiveParser.PartitionedTableFunctionContext ctx) {
    final var methodName = "enterPartitionedTableFunction";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitioningSpec(final HiveParser.PartitioningSpecContext ctx) {
    final var methodName = "enterPartitioningSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionLocation(final HiveParser.PartitionLocationContext ctx) {
    final var methodName = "enterPartitionLocation";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionSelectorSpec(final HiveParser.PartitionSelectorSpecContext ctx) {
    final var methodName = "enterPartitionSelectorSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionSelectorVal(final HiveParser.PartitionSelectorValContext ctx) {
    final var methodName = "enterPartitionSelectorVal";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionSpec(final HiveParser.PartitionSpecContext ctx) {
    final var methodName = "enterPartitionSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionTransformSpec(final HiveParser.PartitionTransformSpecContext ctx) {
    final var methodName = "enterPartitionTransformSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionTransformType(final HiveParser.PartitionTransformTypeContext ctx) {
    final var methodName = "enterPartitionTransformType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionVal(final HiveParser.PartitionValContext ctx) {
    final var methodName = "enterPartitionVal";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartTypeExpr(final HiveParser.PartTypeExprContext ctx) {
    final var methodName = "enterPartTypeExpr";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPkUkConstraint(final HiveParser.PkUkConstraintContext ctx) {
    final var methodName = "enterPkUkConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPoolAssign(final HiveParser.PoolAssignContext ctx) {
    final var methodName = "enterPoolAssign";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPoolAssignList(final HiveParser.PoolAssignListContext ctx) {
    final var methodName = "enterPoolAssignList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPoolPath(final HiveParser.PoolPathContext ctx) {
    final var methodName = "enterPoolPath";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceAndExpression(final HiveParser.PrecedenceAndExpressionContext ctx) {
    final var methodName = "enterPrecedenceAndExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceAndOperator(final HiveParser.PrecedenceAndOperatorContext ctx) {
    final var methodName = "enterPrecedenceAndOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceEqualOperator(final HiveParser.PrecedenceEqualOperatorContext ctx) {
    final var methodName = "enterPrecedenceEqualOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceNotExpression(final HiveParser.PrecedenceNotExpressionContext ctx) {
    final var methodName = "enterPrecedenceNotExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceNotOperator(final HiveParser.PrecedenceNotOperatorContext ctx) {
    final var methodName = "enterPrecedenceNotOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceOrExpression(final HiveParser.PrecedenceOrExpressionContext ctx) {
    final var methodName = "enterPrecedenceOrExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceOrOperator(final HiveParser.PrecedenceOrOperatorContext ctx) {
    final var methodName = "enterPrecedenceOrOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedencePlusExpression(final HiveParser.PrecedencePlusExpressionContext ctx) {
    final var methodName = "enterPrecedencePlusExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedencePlusOperator(final HiveParser.PrecedencePlusOperatorContext ctx) {
    final var methodName = "enterPrecedencePlusOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceRegexpOperator(final HiveParser.PrecedenceRegexpOperatorContext ctx) {
    final var methodName = "enterPrecedenceRegexpOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceStarExpression(final HiveParser.PrecedenceStarExpressionContext ctx) {
    final var methodName = "enterPrecedenceStarExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceStarOperator(final HiveParser.PrecedenceStarOperatorContext ctx) {
    final var methodName = "enterPrecedenceStarOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrecedenceUnaryOperator(final HiveParser.PrecedenceUnaryOperatorContext ctx) {
    final var methodName = "enterPrecedenceUnaryOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrepareStatement(final HiveParser.PrepareStatementContext ctx) {
    final var methodName = "enterPrepareStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrepareStmtParam(final HiveParser.PrepareStmtParamContext ctx) {
    final var methodName = "enterPrepareStmtParam";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimitiveType(final HiveParser.PrimitiveTypeContext ctx) {
    final var methodName = "enterPrimitiveType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrincipalIdentifier(final HiveParser.PrincipalIdentifierContext ctx) {
    final var methodName = "enterPrincipalIdentifier";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrincipalName(final HiveParser.PrincipalNameContext ctx) {
    final var methodName = "enterPrincipalName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrincipalSpecification(final HiveParser.PrincipalSpecificationContext ctx) {
    final var methodName = "enterPrincipalSpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilegeList(final HiveParser.PrivilegeListContext ctx) {
    final var methodName = "enterPrivilegeList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilegeObject(final HiveParser.PrivilegeObjectContext ctx) {
    final var methodName = "enterPrivilegeObject";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilegeType(final HiveParser.PrivilegeTypeContext ctx) {
    final var methodName = "enterPrivilegeType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivlegeDef(final HiveParser.PrivlegeDefContext ctx) {
    final var methodName = "enterPrivlegeDef";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivObject(final HiveParser.PrivObjectContext ctx) {
    final var methodName = "enterPrivObject";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivObjectCols(final HiveParser.PrivObjectColsContext ctx) {
    final var methodName = "enterPrivObjectCols";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQualifyClause(final HiveParser.QualifyClauseContext ctx) {
    final var methodName = "enterQualifyClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuantifierType(final HiveParser.QuantifierTypeContext ctx) {
    final var methodName = "enterQuantifierType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQueryStatementExpression(final HiveParser.QueryStatementExpressionContext ctx) {
    final var methodName = "enterQueryStatementExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRecordReader(final HiveParser.RecordReaderContext ctx) {
    final var methodName = "enterRecordReader";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRecordWriter(final HiveParser.RecordWriterContext ctx) {
    final var methodName = "enterRecordWriter";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRegularBody(final HiveParser.RegularBodyContext ctx) {
    final var methodName = "enterRegularBody";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReloadFunctionsStatement(final HiveParser.ReloadFunctionsStatementContext ctx) {
    final var methodName = "enterReloadFunctionsStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelySpecification(final HiveParser.RelySpecificationContext ctx) {
    final var methodName = "enterRelySpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplConfigs(final HiveParser.ReplConfigsContext ctx) {
    final var methodName = "enterReplConfigs";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplConfigsList(final HiveParser.ReplConfigsListContext ctx) {
    final var methodName = "enterReplConfigsList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplDbPolicy(final HiveParser.ReplDbPolicyContext ctx) {
    final var methodName = "enterReplDbPolicy";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplDumpStatement(final HiveParser.ReplDumpStatementContext ctx) {
    final var methodName = "enterReplDumpStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplicationClause(final HiveParser.ReplicationClauseContext ctx) {
    final var methodName = "enterReplicationClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplLoadStatement(final HiveParser.ReplLoadStatementContext ctx) {
    final var methodName = "enterReplLoadStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplStatusStatement(final HiveParser.ReplStatusStatementContext ctx) {
    final var methodName = "enterReplStatusStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplTableLevelPolicy(final HiveParser.ReplTableLevelPolicyContext ctx) {
    final var methodName = "enterReplTableLevelPolicy";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResource(final HiveParser.ResourceContext ctx) {
    final var methodName = "enterResource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResourceList(final HiveParser.ResourceListContext ctx) {
    final var methodName = "enterResourceList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResourceType(final HiveParser.ResourceTypeContext ctx) {
    final var methodName = "enterResourceType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRestrictOrCascade(final HiveParser.RestrictOrCascadeContext ctx) {
    final var methodName = "enterRestrictOrCascade";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevokePrivileges(final HiveParser.RevokePrivilegesContext ctx) {
    final var methodName = "enterRevokePrivileges";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevokeRole(final HiveParser.RevokeRoleContext ctx) {
    final var methodName = "enterRevokeRole";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRewriteDisabled(final HiveParser.RewriteDisabledContext ctx) {
    final var methodName = "enterRewriteDisabled";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRewriteEnabled(final HiveParser.RewriteEnabledContext ctx) {
    final var methodName = "enterRewriteEnabled";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollbackStatement(final HiveParser.RollbackStatementContext ctx) {
    final var methodName = "enterRollbackStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollupOldSyntax(final HiveParser.RollupOldSyntaxContext ctx) {
    final var methodName = "enterRollupOldSyntax";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollupStandard(final HiveParser.RollupStandardContext ctx) {
    final var methodName = "enterRollupStandard";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowFormat(final HiveParser.RowFormatContext ctx) {
    final var methodName = "enterRowFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowFormatDelimited(final HiveParser.RowFormatDelimitedContext ctx) {
    final var methodName = "enterRowFormatDelimited";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRowFormatSerde(final HiveParser.RowFormatSerdeContext ctx) {
    final var methodName = "enterRowFormatSerde";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRpAssign(final HiveParser.RpAssignContext ctx) {
    final var methodName = "enterRpAssign";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRpAssignList(final HiveParser.RpAssignListContext ctx) {
    final var methodName = "enterRpAssignList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRpUnassign(final HiveParser.RpUnassignContext ctx) {
    final var methodName = "enterRpUnassign";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRpUnassignList(final HiveParser.RpUnassignListContext ctx) {
    final var methodName = "enterRpUnassignList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterScheduleSpec(final HiveParser.ScheduleSpecContext ctx) {
    final var methodName = "enterScheduleSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSearchCondition(final HiveParser.SearchConditionContext ctx) {
    final var methodName = "enterSearchCondition";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectClause(final HiveParser.SelectClauseContext ctx) {
    final var methodName = "enterSelectClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectExpression(final HiveParser.SelectExpressionContext ctx) {
    final var methodName = "enterSelectExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectExpressionList(final HiveParser.SelectExpressionListContext ctx) {
    final var methodName = "enterSelectExpressionList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectItem(final HiveParser.SelectItemContext ctx) {
    final var methodName = "enterSelectItem";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectList(final HiveParser.SelectListContext ctx) {
    final var methodName = "enterSelectList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectStatement(final HiveParser.SelectStatementContext ctx) {
    final var methodName = "enterSelectStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectStatementWithCTE(final HiveParser.SelectStatementWithCTEContext ctx) {
    final var methodName = "enterSelectStatementWithCTE";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectTrfmClause(final HiveParser.SelectTrfmClauseContext ctx) {
    final var methodName = "enterSelectTrfmClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetAutoCommitStatement(final HiveParser.SetAutoCommitStatementContext ctx) {
    final var methodName = "enterSetAutoCommitStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetColumnsClause(final HiveParser.SetColumnsClauseContext ctx) {
    final var methodName = "enterSetColumnsClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetOperator(final HiveParser.SetOperatorContext ctx) {
    final var methodName = "enterSetOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetOpSelectStatement(final HiveParser.SetOpSelectStatementContext ctx) {
    final var methodName = "enterSetOpSelectStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetRole(final HiveParser.SetRoleContext ctx) {
    final var methodName = "enterSetRole";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCurrentRole(final HiveParser.ShowCurrentRoleContext ctx) {
    final var methodName = "enterShowCurrentRole";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowFunctionIdentifier(final HiveParser.ShowFunctionIdentifierContext ctx) {
    final var methodName = "enterShowFunctionIdentifier";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowGrants(final HiveParser.ShowGrantsContext ctx) {
    final var methodName = "enterShowGrants";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowRoleGrants(final HiveParser.ShowRoleGrantsContext ctx) {
    final var methodName = "enterShowRoleGrants";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowRolePrincipals(final HiveParser.ShowRolePrincipalsContext ctx) {
    final var methodName = "enterShowRolePrincipals";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowRoles(final HiveParser.ShowRolesContext ctx) {
    final var methodName = "enterShowRoles";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowStatement(final HiveParser.ShowStatementContext ctx) {
    final var methodName = "enterShowStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowStmtIdentifier(final HiveParser.ShowStmtIdentifierContext ctx) {
    final var methodName = "enterShowStmtIdentifier";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowTablesFilterExpr(final HiveParser.ShowTablesFilterExprContext ctx) {
    final var methodName = "enterShowTablesFilterExpr";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSingleFromStatement(final HiveParser.SingleFromStatementContext ctx) {
    final var methodName = "enterSingleFromStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedColumnValue(final HiveParser.SkewedColumnValueContext ctx) {
    final var methodName = "enterSkewedColumnValue";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedColumnValuePair(final HiveParser.SkewedColumnValuePairContext ctx) {
    final var methodName = "enterSkewedColumnValuePair";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedColumnValues(final HiveParser.SkewedColumnValuesContext ctx) {
    final var methodName = "enterSkewedColumnValues";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedLocationMap(final HiveParser.SkewedLocationMapContext ctx) {
    final var methodName = "enterSkewedLocationMap";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedLocations(final HiveParser.SkewedLocationsContext ctx) {
    final var methodName = "enterSkewedLocations";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedLocationsList(final HiveParser.SkewedLocationsListContext ctx) {
    final var methodName = "enterSkewedLocationsList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSkewedValueElement(final HiveParser.SkewedValueElementContext ctx) {
    final var methodName = "enterSkewedValueElement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSortByClause(final HiveParser.SortByClauseContext ctx) {
    final var methodName = "enterSortByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSplitSample(final HiveParser.SplitSampleContext ctx) {
    final var methodName = "enterSplitSample";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSqlTransactionStatement(final HiveParser.SqlTransactionStatementContext ctx) {
    final var methodName = "enterSqlTransactionStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStatement(final HiveParser.StatementContext ctx) {
    final var methodName = "enterStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStoredAsDirs(final HiveParser.StoredAsDirsContext ctx) {
    final var methodName = "enterStoredAsDirs";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStringLiteralSequence(final HiveParser.StringLiteralSequenceContext ctx) {
    final var methodName = "enterStringLiteralSequence";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStructType(final HiveParser.StructTypeContext ctx) {
    final var methodName = "enterStructType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubQueryExpression(final HiveParser.SubQueryExpressionContext ctx) {
    final var methodName = "enterSubQueryExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubQuerySelectorOperator(final HiveParser.SubQuerySelectorOperatorContext ctx) {
    final var methodName = "enterSubQuerySelectorOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubQuerySource(final HiveParser.SubQuerySourceContext ctx) {
    final var methodName = "enterSubQuerySource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSwitchDatabaseStatement(final HiveParser.SwitchDatabaseStatementContext ctx) {
    final var methodName = "enterSwitchDatabaseStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSysFuncNames(final HiveParser.SysFuncNamesContext ctx) {
    final var methodName = "enterSysFuncNames";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableAlias(final HiveParser.TableAliasContext ctx) {
    final var methodName = "enterTableAlias";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableAllColumns(final HiveParser.TableAllColumnsContext ctx) {
    final var methodName = "enterTableAllColumns";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableBuckets(final HiveParser.TableBucketsContext ctx) {
    final var methodName = "enterTableBuckets";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableBucketSample(final HiveParser.TableBucketSampleContext ctx) {
    final var methodName = "enterTableBucketSample";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableComment(final HiveParser.TableCommentContext ctx) {
    final var methodName = "enterTableComment";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableConstraint(final HiveParser.TableConstraintContext ctx) {
    final var methodName = "enterTableConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableConstraintType(final HiveParser.TableConstraintTypeContext ctx) {
    final var methodName = "enterTableConstraintType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableFileFormat(final HiveParser.TableFileFormatContext ctx) {
    final var methodName = "enterTableFileFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableImplBuckets(final HiveParser.TableImplBucketsContext ctx) {
    final var methodName = "enterTableImplBuckets";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableLevelConstraint(final HiveParser.TableLevelConstraintContext ctx) {
    final var methodName = "enterTableLevelConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableLocation(final HiveParser.TableLocationContext ctx) {
    final var methodName = "enterTableLocation";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableName(final HiveParser.TableNameContext ctx) {
    final var methodName = "enterTableName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOrColumn(final HiveParser.TableOrColumnContext ctx) {
    final var methodName = "enterTableOrColumn";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOrPartition(final HiveParser.TableOrPartitionContext ctx) {
    final var methodName = "enterTableOrPartition";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablePartitionPrefix(final HiveParser.TablePartitionPrefixContext ctx) {
    final var methodName = "enterTablePartitionPrefix";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableProperties(final HiveParser.TablePropertiesContext ctx) {
    final var methodName = "enterTableProperties";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablePropertiesList(final HiveParser.TablePropertiesListContext ctx) {
    final var methodName = "enterTablePropertiesList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablePropertiesPrefixed(final HiveParser.TablePropertiesPrefixedContext ctx) {
    final var methodName = "enterTablePropertiesPrefixed";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableRowFormat(final HiveParser.TableRowFormatContext ctx) {
    final var methodName = "enterTableRowFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableRowNullFormat(final HiveParser.TableRowNullFormatContext ctx) {
    final var methodName = "enterTableRowNullFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSample(final HiveParser.TableSampleContext ctx) {
    final var methodName = "enterTableSample";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSkewed(final HiveParser.TableSkewedContext ctx) {
    final var methodName = "enterTableSkewed";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSource(final HiveParser.TableSourceContext ctx) {
    final var methodName = "enterTableSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTabPartColTypeExpr(final HiveParser.TabPartColTypeExprContext ctx) {
    final var methodName = "enterTabPartColTypeExpr";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTabTypeExpr(final HiveParser.TabTypeExprContext ctx) {
    final var methodName = "enterTabTypeExpr";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTimeQualifiers(final HiveParser.TimeQualifiersContext ctx) {
    final var methodName = "enterTimeQualifiers";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTimestampLiteral(final HiveParser.TimestampLiteralContext ctx) {
    final var methodName = "enterTimestampLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTimestampLocalTZLiteral(final HiveParser.TimestampLocalTZLiteralContext ctx) {
    final var methodName = "enterTimestampLocalTZLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionAccessMode(final HiveParser.TransactionAccessModeContext ctx) {
    final var methodName = "enterTransactionAccessMode";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionMode(final HiveParser.TransactionModeContext ctx) {
    final var methodName = "enterTransactionMode";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrfmClause(final HiveParser.TrfmClauseContext ctx) {
    final var methodName = "enterTrfmClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerActionExpression(final HiveParser.TriggerActionExpressionContext ctx) {
    final var methodName = "enterTriggerActionExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerAndExpression(final HiveParser.TriggerAndExpressionContext ctx) {
    final var methodName = "enterTriggerAndExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerAtomExpression(final HiveParser.TriggerAtomExpressionContext ctx) {
    final var methodName = "enterTriggerAtomExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerExpression(final HiveParser.TriggerExpressionContext ctx) {
    final var methodName = "enterTriggerExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerLiteral(final HiveParser.TriggerLiteralContext ctx) {
    final var methodName = "enterTriggerLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTriggerOrExpression(final HiveParser.TriggerOrExpressionContext ctx) {
    final var methodName = "enterTriggerOrExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrimFunction(final HiveParser.TrimFunctionContext ctx) {
    final var methodName = "enterTrimFunction";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTruncateTableStatement(final HiveParser.TruncateTableStatementContext ctx) {
    final var methodName = "enterTruncateTableStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterType(final HiveParser.TypeContext ctx) {
    final var methodName = "enterType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnionType(final HiveParser.UnionTypeContext ctx) {
    final var methodName = "enterUnionType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueJoinExpr(final HiveParser.UniqueJoinExprContext ctx) {
    final var methodName = "enterUniqueJoinExpr";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueJoinSource(final HiveParser.UniqueJoinSourceContext ctx) {
    final var methodName = "enterUniqueJoinSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueJoinTableSource(final HiveParser.UniqueJoinTableSourceContext ctx) {
    final var methodName = "enterUniqueJoinTableSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueJoinToken(final HiveParser.UniqueJoinTokenContext ctx) {
    final var methodName = "enterUniqueJoinToken";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnlockDatabase(final HiveParser.UnlockDatabaseContext ctx) {
    final var methodName = "enterUnlockDatabase";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnlockStatement(final HiveParser.UnlockStatementContext ctx) {
    final var methodName = "enterUnlockStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnmanaged(final HiveParser.UnmanagedContext ctx) {
    final var methodName = "enterUnmanaged";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdateOrDelete(final HiveParser.UpdateOrDeleteContext ctx) {
    final var methodName = "enterUpdateOrDelete";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdateStatement(final HiveParser.UpdateStatementContext ctx) {
    final var methodName = "enterUpdateStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValidateSpecification(final HiveParser.ValidateSpecificationContext ctx) {
    final var methodName = "enterValidateSpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValueRowConstructor(final HiveParser.ValueRowConstructorContext ctx) {
    final var methodName = "enterValueRowConstructor";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValuesClause(final HiveParser.ValuesClauseContext ctx) {
    final var methodName = "enterValuesClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValuesSource(final HiveParser.ValuesSourceContext ctx) {
    final var methodName = "enterValuesSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValuesTableConstructor(final HiveParser.ValuesTableConstructorContext ctx) {
    final var methodName = "enterValuesTableConstructor";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVectorizationOnly(final HiveParser.VectorizationOnlyContext ctx) {
    final var methodName = "enterVectorizationOnly";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVectorizatonDetail(final HiveParser.VectorizatonDetailContext ctx) {
    final var methodName = "enterVectorizatonDetail";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewClusterSpec(final HiveParser.ViewClusterSpecContext ctx) {
    final var methodName = "enterViewClusterSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewComplexSpec(final HiveParser.ViewComplexSpecContext ctx) {
    final var methodName = "enterViewComplexSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewDistSpec(final HiveParser.ViewDistSpecContext ctx) {
    final var methodName = "enterViewDistSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewName(final HiveParser.ViewNameContext ctx) {
    final var methodName = "enterViewName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewOrganization(final HiveParser.ViewOrganizationContext ctx) {
    final var methodName = "enterViewOrganization";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewPartition(final HiveParser.ViewPartitionContext ctx) {
    final var methodName = "enterViewPartition";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterViewSortSpec(final HiveParser.ViewSortSpecContext ctx) {
    final var methodName = "enterViewSortSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVirtualTableSource(final HiveParser.VirtualTableSourceContext ctx) {
    final var methodName = "enterVirtualTableSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhenClauses(final HiveParser.WhenClausesContext ctx) {
    final var methodName = "enterWhenClauses";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhenExpression(final HiveParser.WhenExpressionContext ctx) {
    final var methodName = "enterWhenExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhenMatchedAndClause(final HiveParser.WhenMatchedAndClauseContext ctx) {
    final var methodName = "enterWhenMatchedAndClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhenMatchedThenClause(final HiveParser.WhenMatchedThenClauseContext ctx) {
    final var methodName = "enterWhenMatchedThenClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhenNotMatchedClause(final HiveParser.WhenNotMatchedClauseContext ctx) {
    final var methodName = "enterWhenNotMatchedClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhereClause(final HiveParser.WhereClauseContext ctx) {
    final var methodName = "enterWhereClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_clause(final HiveParser.Window_clauseContext ctx) {
    final var methodName = "enterWindow_clause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_defn(final HiveParser.Window_defnContext ctx) {
    final var methodName = "enterWindow_defn";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_frame(final HiveParser.Window_frameContext ctx) {
    final var methodName = "enterWindow_frame";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_frame_boundary(final HiveParser.Window_frame_boundaryContext ctx) {
    final var methodName = "enterWindow_frame_boundary";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_range_expression(final HiveParser.Window_range_expressionContext ctx) {
    final var methodName = "enterWindow_range_expression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_specification(final HiveParser.Window_specificationContext ctx) {
    final var methodName = "enterWindow_specification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindow_value_expression(final HiveParser.Window_value_expressionContext ctx) {
    final var methodName = "enterWindow_value_expression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithAdminOption(final HiveParser.WithAdminOptionContext ctx) {
    final var methodName = "enterWithAdminOption";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithClause(final HiveParser.WithClauseContext ctx) {
    final var methodName = "enterWithClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithGrantOption(final HiveParser.WithGrantOptionContext ctx) {
    final var methodName = "enterWithGrantOption";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithReplace(final HiveParser.WithReplaceContext ctx) {
    final var methodName = "enterWithReplace";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAbortCompactionStatement(final HiveParser.AbortCompactionStatementContext ctx) {
    final var methodName = "exitAbortCompactionStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAbortTransactionStatement(final HiveParser.AbortTransactionStatementContext ctx) {
    final var methodName = "exitAbortTransactionStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitActivate(final HiveParser.ActivateContext ctx) {
    final var methodName = "exitActivate";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdminOptionFor(final HiveParser.AdminOptionForContext ctx) {
    final var methodName = "exitAdminOptionFor";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAliasList(final HiveParser.AliasListContext ctx) {
    final var methodName = "exitAliasList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAll_distinct(final HiveParser.All_distinctContext ctx) {
    final var methodName = "exitAll_distinct";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterColConstraint(final HiveParser.AlterColConstraintContext ctx) {
    final var methodName = "exitAlterColConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterColumnConstraint(final HiveParser.AlterColumnConstraintContext ctx) {
    final var methodName = "exitAlterColumnConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterConstraintWithName(final HiveParser.AlterConstraintWithNameContext ctx) {
    final var methodName = "exitAlterConstraintWithName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterForeignKeyConstraint(final HiveParser.AlterForeignKeyConstraintContext ctx) {
    final var methodName = "exitAlterForeignKeyConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterForeignKeyWithName(final HiveParser.AlterForeignKeyWithNameContext ctx) {
    final var methodName = "exitAlterForeignKeyWithName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterMappingStatement(final HiveParser.AlterMappingStatementContext ctx) {
    final var methodName = "exitAlterMappingStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterPoolStatement(final HiveParser.AlterPoolStatementContext ctx) {
    final var methodName = "exitAlterPoolStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterScheduledQueryChange(final HiveParser.AlterScheduledQueryChangeContext ctx) {
    final var methodName = "exitAlterScheduledQueryChange";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatement(final HiveParser.AlterStatementContext ctx) {
    final var methodName = "exitAlterStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterStatementSuffixTouch(final HiveParser.AlterStatementSuffixTouchContext ctx) {
    final var methodName = "exitAlterStatementSuffixTouch";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterTableStatementSuffix(final HiveParser.AlterTableStatementSuffixContext ctx) {
    final var methodName = "exitAlterTableStatementSuffix";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterTriggerStatement(final HiveParser.AlterTriggerStatementContext ctx) {
    final var methodName = "exitAlterTriggerStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterViewStatementSuffix(final HiveParser.AlterViewStatementSuffixContext ctx) {
    final var methodName = "exitAlterViewStatementSuffix";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterViewSuffixProperties(final HiveParser.AlterViewSuffixPropertiesContext ctx) {
    final var methodName = "exitAlterViewSuffixProperties";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAnalyzeStatement(final HiveParser.AnalyzeStatementContext ctx) {
    final var methodName = "exitAnalyzeStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAsOfClause(final HiveParser.AsOfClauseContext ctx) {
    final var methodName = "exitAsOfClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAtomExpression(final HiveParser.AtomExpressionContext ctx) {
    final var methodName = "exitAtomExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAtomjoinSource(final HiveParser.AtomjoinSourceContext ctx) {
    final var methodName = "exitAtomjoinSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAtomSelectStatement(final HiveParser.AtomSelectStatementContext ctx) {
    final var methodName = "exitAtomSelectStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBlocking(final HiveParser.BlockingContext ctx) {
    final var methodName = "exitBlocking";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBody(final HiveParser.BodyContext ctx) {
    final var methodName = "exitBody";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBooleanValue(final HiveParser.BooleanValueContext ctx) {
    final var methodName = "exitBooleanValue";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBooleanValueTok(final HiveParser.BooleanValueTokContext ctx) {
    final var methodName = "exitBooleanValueTok";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseExpression(final HiveParser.CaseExpressionContext ctx) {
    final var methodName = "exitCaseExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCastExpression(final HiveParser.CastExpressionContext ctx) {
    final var methodName = "exitCastExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharSetStringLiteral(final HiveParser.CharSetStringLiteralContext ctx) {
    final var methodName = "exitCharSetStringLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheckConstraint(final HiveParser.CheckConstraintContext ctx) {
    final var methodName = "exitCheckConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitClusterByClause(final HiveParser.ClusterByClauseContext ctx) {
    final var methodName = "exitClusterByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColConstraint(final HiveParser.ColConstraintContext ctx) {
    final var methodName = "exitColConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColType(final HiveParser.ColTypeContext ctx) {
    final var methodName = "exitColType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColTypeList(final HiveParser.ColTypeListContext ctx) {
    final var methodName = "exitColTypeList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnAssignmentClause(final HiveParser.ColumnAssignmentClauseContext ctx) {
    final var methodName = "exitColumnAssignmentClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnConstraint(final HiveParser.ColumnConstraintContext ctx) {
    final var methodName = "exitColumnConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnConstraintType(final HiveParser.ColumnConstraintTypeContext ctx) {
    final var methodName = "exitColumnConstraintType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnName(final HiveParser.ColumnNameContext ctx) {
    final var methodName = "exitColumnName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameColonType(final HiveParser.ColumnNameColonTypeContext ctx) {
    final var methodName = "exitColumnNameColonType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameColonTypeList(final HiveParser.ColumnNameColonTypeListContext ctx) {
    final var methodName = "exitColumnNameColonTypeList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameComment(final HiveParser.ColumnNameCommentContext ctx) {
    final var methodName = "exitColumnNameComment";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameCommentList(final HiveParser.ColumnNameCommentListContext ctx) {
    final var methodName = "exitColumnNameCommentList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameList(final HiveParser.ColumnNameListContext ctx) {
    final var methodName = "exitColumnNameList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameOrder(final HiveParser.ColumnNameOrderContext ctx) {
    final var methodName = "exitColumnNameOrder";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameOrderList(final HiveParser.ColumnNameOrderListContext ctx) {
    final var methodName = "exitColumnNameOrderList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnNameType(final HiveParser.ColumnNameTypeContext ctx) {
    final var methodName = "exitColumnNameType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

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
    if (commentText != null
        && !commentText.isEmpty()
        && StringUtils.equalsIgnoreCase("COMMENT", commentText.get(0))) {
      commentText.set(0, "");
      final var comment =
          StringUtils.trimToEmpty(commentText.stream().collect(Collectors.joining(" ")));
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
                } else if (StringUtils.equalsIgnoreCase("PRECISION", terminalNodeText)) {
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
                } else if (!StringUtils.equalsIgnoreCase(
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
    if (StringUtils.equalsIgnoreCase("NOT NULL", nullableText)) {
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
    if (StringUtils.equalsIgnoreCase("PRIMARY KEY", primaryKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    } else if (StringUtils.equalsIgnoreCase("UNIQUE", primaryKeyText)) {
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
      if (StringUtils.equalsIgnoreCase(
              "DECIMAL", Objects.toString(currentField.get(Field.FIELD_TYPE), ""))
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
              terminalNodeText -> {
                currentRelationship.put("foreignTable", NotNullSet.getInstance(terminalNodeText));
              });
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
  public void exitColumnNameTypeList(final HiveParser.ColumnNameTypeListContext ctx) {
    final var methodName = "exitColumnNameTypeList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnParenthesesList(final HiveParser.ColumnParenthesesListContext ctx) {
    final var methodName = "exitColumnParenthesesList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnRefOrder(final HiveParser.ColumnRefOrderContext ctx) {
    final var methodName = "exitColumnRefOrder";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommitStatement(final HiveParser.CommitStatementContext ctx) {
    final var methodName = "exitCommitStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompactionId(final HiveParser.CompactionIdContext ctx) {
    final var methodName = "exitCompactionId";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompactionPool(final HiveParser.CompactionPoolContext ctx) {
    final var methodName = "exitCompactionPool";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompactionStatus(final HiveParser.CompactionStatusContext ctx) {
    final var methodName = "exitCompactionStatus";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompactionType(final HiveParser.CompactionTypeContext ctx) {
    final var methodName = "exitCompactionType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompactPool(final HiveParser.CompactPoolContext ctx) {
    final var methodName = "exitCompactPool";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComparisionOperator(final HiveParser.ComparisionOperatorContext ctx) {
    final var methodName = "exitComparisionOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstant(final HiveParser.ConstantContext ctx) {
    final var methodName = "exitConstant";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraintOptsAlter(final HiveParser.ConstraintOptsAlterContext ctx) {
    final var methodName = "exitConstraintOptsAlter";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraintOptsCreate(final HiveParser.ConstraintOptsCreateContext ctx) {
    final var methodName = "exitConstraintOptsCreate";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateConstraint(final HiveParser.CreateConstraintContext ctx) {
    final var methodName = "exitCreateConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateDatabaseStatement(final HiveParser.CreateDatabaseStatementContext ctx) {
    final var methodName = "exitCreateDatabaseStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
                        StringUtils.equalsIgnoreCase("REFERENCES", terminalNode.getText()));
                  } else if (createForeignKeyChild
                          instanceof final HiveParser.TableNameContext tableNameContext
                      && referencesFound.booleanValue()) {
                    ParseTreeStream.parseTreeStream(tableNameContext)
                        .streamChildrenByClass(HiveParser.Id_Context.class)
                        .streamTerminalNodeString()
                        .forEach(
                            terminalNodeText -> {
                              currentRelationship.put(
                                  "foreignTable", NotNullSet.getInstance(terminalNodeText));
                            });
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
  public void exitCreateFunctionStatement(final HiveParser.CreateFunctionStatementContext ctx) {
    final var methodName = "exitCreateFunctionStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateMacroStatement(final HiveParser.CreateMacroStatementContext ctx) {
    final var methodName = "exitCreateMacroStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateMappingStatement(final HiveParser.CreateMappingStatementContext ctx) {
    final var methodName = "exitCreateMappingStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreatePoolStatement(final HiveParser.CreatePoolStatementContext ctx) {
    final var methodName = "exitCreatePoolStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateRoleStatement(final HiveParser.CreateRoleStatementContext ctx) {
    final var methodName = "exitCreateRoleStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTablePartitionSpec(final HiveParser.CreateTablePartitionSpecContext ctx) {
    final var methodName = "exitCreateTablePartitionSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
          || StringUtils.equalsIgnoreCase("CONSTRAINT", field.getKey())) {
        fieldsToRemove.add(field.getKey());
      }
    }
    for (final var field : fieldsToRemove) {
      currentTable.getFields().remove(field);
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
  public void exitCreateTriggerStatement(final HiveParser.CreateTriggerStatementContext ctx) {
    final var methodName = "exitCreateTriggerStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateViewStatement(final HiveParser.CreateViewStatementContext ctx) {
    final var methodName = "exitCreateViewStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCteStatement(final HiveParser.CteStatementContext ctx) {
    final var methodName = "exitCteStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDatabaseComment(final HiveParser.DatabaseCommentContext ctx) {
    final var methodName = "exitDatabaseComment";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDataConnectorComment(final HiveParser.DataConnectorCommentContext ctx) {
    final var methodName = "exitDataConnectorComment";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDataConnectorType(final HiveParser.DataConnectorTypeContext ctx) {
    final var methodName = "exitDataConnectorType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDataConnectorUrl(final HiveParser.DataConnectorUrlContext ctx) {
    final var methodName = "exitDataConnectorUrl";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDateLiteral(final HiveParser.DateLiteralContext ctx) {
    final var methodName = "exitDateLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDb_schema(final HiveParser.Db_schemaContext ctx) {
    final var methodName = "exitDb_schema";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDbConnectorName(final HiveParser.DbConnectorNameContext ctx) {
    final var methodName = "exitDbConnectorName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDbLocation(final HiveParser.DbLocationContext ctx) {
    final var methodName = "exitDbLocation";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDbManagedLocation(final HiveParser.DbManagedLocationContext ctx) {
    final var methodName = "exitDbManagedLocation";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDbProperties(final HiveParser.DbPropertiesContext ctx) {
    final var methodName = "exitDbProperties";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDbPropertiesList(final HiveParser.DbPropertiesListContext ctx) {
    final var methodName = "exitDbPropertiesList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDcProperties(final HiveParser.DcPropertiesContext ctx) {
    final var methodName = "exitDcProperties";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDdlStatement(final HiveParser.DdlStatementContext ctx) {
    final var methodName = "exitDdlStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefaultVal(final HiveParser.DefaultValContext ctx) {
    final var methodName = "exitDefaultVal";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefaultValue(final HiveParser.DefaultValueContext ctx) {
    final var methodName = "exitDefaultValue";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefinedAsSpec(final HiveParser.DefinedAsSpecContext ctx) {
    final var methodName = "exitDefinedAsSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeleteStatement(final HiveParser.DeleteStatementContext ctx) {
    final var methodName = "exitDeleteStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescFuncNames(final HiveParser.DescFuncNamesContext ctx) {
    final var methodName = "exitDescFuncNames";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescStatement(final HiveParser.DescStatementContext ctx) {
    final var methodName = "exitDescStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDestination(final HiveParser.DestinationContext ctx) {
    final var methodName = "exitDestination";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDisable(final HiveParser.DisableContext ctx) {
    final var methodName = "exitDisable";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDistributeByClause(final HiveParser.DistributeByClauseContext ctx) {
    final var methodName = "exitDistributeByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropDatabaseStatement(final HiveParser.DropDatabaseStatementContext ctx) {
    final var methodName = "exitDropDatabaseStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropFunctionStatement(final HiveParser.DropFunctionStatementContext ctx) {
    final var methodName = "exitDropFunctionStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropMacroStatement(final HiveParser.DropMacroStatementContext ctx) {
    final var methodName = "exitDropMacroStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropMappingStatement(final HiveParser.DropMappingStatementContext ctx) {
    final var methodName = "exitDropMappingStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropPoolStatement(final HiveParser.DropPoolStatementContext ctx) {
    final var methodName = "exitDropPoolStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropResourcePlanStatement(final HiveParser.DropResourcePlanStatementContext ctx) {
    final var methodName = "exitDropResourcePlanStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropRoleStatement(final HiveParser.DropRoleStatementContext ctx) {
    final var methodName = "exitDropRoleStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropTableStatement(final HiveParser.DropTableStatementContext ctx) {
    final var methodName = "exitDropTableStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropTriggerStatement(final HiveParser.DropTriggerStatementContext ctx) {
    final var methodName = "exitDropTriggerStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropViewStatement(final HiveParser.DropViewStatementContext ctx) {
    final var methodName = "exitDropViewStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnable(final HiveParser.EnableContext ctx) {
    final var methodName = "exitEnable";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnableSpecification(final HiveParser.EnableSpecificationContext ctx) {
    final var methodName = "exitEnableSpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnforcedSpecification(final HiveParser.EnforcedSpecificationContext ctx) {
    final var methodName = "exitEnforcedSpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    final var methodName = "exitEveryRule";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecStatement(final HiveParser.ExecStatementContext ctx) {
    final var methodName = "exitExecStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecutedAsSpec(final HiveParser.ExecutedAsSpecContext ctx) {
    final var methodName = "exitExecutedAsSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecuteParamList(final HiveParser.ExecuteParamListContext ctx) {
    final var methodName = "exitExecuteParamList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecuteStatement(final HiveParser.ExecuteStatementContext ctx) {
    final var methodName = "exitExecuteStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplainOption(final HiveParser.ExplainOptionContext ctx) {
    final var methodName = "exitExplainOption";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplainStatement(final HiveParser.ExplainStatementContext ctx) {
    final var methodName = "exitExplainStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExportStatement(final HiveParser.ExportStatementContext ctx) {
    final var methodName = "exitExportStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpression(final HiveParser.ExpressionContext ctx) {
    final var methodName = "exitExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionList(final HiveParser.ExpressionListContext ctx) {
    final var methodName = "exitExpressionList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionOrDefault(final HiveParser.ExpressionOrDefaultContext ctx) {
    final var methodName = "exitExpressionOrDefault";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionPart(final HiveParser.ExpressionPartContext ctx) {
    final var methodName = "exitExpressionPart";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressions(final HiveParser.ExpressionsContext ctx) {
    final var methodName = "exitExpressions";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionsInParenthesis(final HiveParser.ExpressionsInParenthesisContext ctx) {
    final var methodName = "exitExpressionsInParenthesis";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionWithAlias(final HiveParser.ExpressionWithAliasContext ctx) {
    final var methodName = "exitExpressionWithAlias";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExtColumnName(final HiveParser.ExtColumnNameContext ctx) {
    final var methodName = "exitExtColumnName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExtractExpression(final HiveParser.ExtractExpressionContext ctx) {
    final var methodName = "exitExtractExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFileFormat(final HiveParser.FileFormatContext ctx) {
    final var methodName = "exitFileFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFirstExpressionsWithAlias(final HiveParser.FirstExpressionsWithAliasContext ctx) {
    final var methodName = "exitFirstExpressionsWithAlias";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFirstValueRowConstructor(final HiveParser.FirstValueRowConstructorContext ctx) {
    final var methodName = "exitFirstValueRowConstructor";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFloorDateQualifiers(final HiveParser.FloorDateQualifiersContext ctx) {
    final var methodName = "exitFloorDateQualifiers";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFloorExpression(final HiveParser.FloorExpressionContext ctx) {
    final var methodName = "exitFloorExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForce(final HiveParser.ForceContext ctx) {
    final var methodName = "exitForce";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForeignKeyConstraint(final HiveParser.ForeignKeyConstraintContext ctx) {
    final var methodName = "exitForeignKeyConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrom_in(final HiveParser.From_inContext ctx) {
    final var methodName = "exitFrom_in";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFromClause(final HiveParser.FromClauseContext ctx) {
    final var methodName = "exitFromClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFromSource(final HiveParser.FromSourceContext ctx) {
    final var methodName = "exitFromSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFromStatement(final HiveParser.FromStatementContext ctx) {
    final var methodName = "exitFromStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunction_(final HiveParser.Function_Context ctx) {
    final var methodName = "exitFunction_";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionIdentifier(final HiveParser.FunctionIdentifierContext ctx) {
    final var methodName = "exitFunctionIdentifier";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionName(final HiveParser.FunctionNameContext ctx) {
    final var methodName = "exitFunctionName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGlobalWmStatement(final HiveParser.GlobalWmStatementContext ctx) {
    final var methodName = "exitGlobalWmStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantOptionFor(final HiveParser.GrantOptionForContext ctx) {
    final var methodName = "exitGrantOptionFor";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantPrivileges(final HiveParser.GrantPrivilegesContext ctx) {
    final var methodName = "exitGrantPrivileges";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantRole(final HiveParser.GrantRoleContext ctx) {
    final var methodName = "exitGrantRole";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupby_expression(final HiveParser.Groupby_expressionContext ctx) {
    final var methodName = "exitGroupby_expression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupByClause(final HiveParser.GroupByClauseContext ctx) {
    final var methodName = "exitGroupByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupByEmpty(final HiveParser.GroupByEmptyContext ctx) {
    final var methodName = "exitGroupByEmpty";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupingExpressionSingle(final HiveParser.GroupingExpressionSingleContext ctx) {
    final var methodName = "exitGroupingExpressionSingle";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupingSetExpression(final HiveParser.GroupingSetExpressionContext ctx) {
    final var methodName = "exitGroupingSetExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHavingClause(final HiveParser.HavingClauseContext ctx) {
    final var methodName = "exitHavingClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHavingCondition(final HiveParser.HavingConditionContext ctx) {
    final var methodName = "exitHavingCondition";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHint(final HiveParser.HintContext ctx) {
    final var methodName = "exitHint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHintArgName(final HiveParser.HintArgNameContext ctx) {
    final var methodName = "exitHintArgName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHintArgs(final HiveParser.HintArgsContext ctx) {
    final var methodName = "exitHintArgs";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHintItem(final HiveParser.HintItemContext ctx) {
    final var methodName = "exitHintItem";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHintList(final HiveParser.HintListContext ctx) {
    final var methodName = "exitHintList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHintName(final HiveParser.HintNameContext ctx) {
    final var methodName = "exitHintName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitId_(final HiveParser.Id_Context ctx) {
    final var methodName = "exitId_";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIfExists(final HiveParser.IfExistsContext ctx) {
    final var methodName = "exitIfExists";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIfNotExists(final HiveParser.IfNotExistsContext ctx) {
    final var methodName = "exitIfNotExists";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitImportStatement(final HiveParser.ImportStatementContext ctx) {
    final var methodName = "exitImportStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInputFileFormat(final HiveParser.InputFileFormatContext ctx) {
    final var methodName = "exitInputFileFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsertClause(final HiveParser.InsertClauseContext ctx) {
    final var methodName = "exitInsertClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalExpression(final HiveParser.IntervalExpressionContext ctx) {
    final var methodName = "exitIntervalExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalLiteral(final HiveParser.IntervalLiteralContext ctx) {
    final var methodName = "exitIntervalLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalQualifiers(final HiveParser.IntervalQualifiersContext ctx) {
    final var methodName = "exitIntervalQualifiers";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalValue(final HiveParser.IntervalValueContext ctx) {
    final var methodName = "exitIntervalValue";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIsCondition(final HiveParser.IsConditionContext ctx) {
    final var methodName = "exitIsCondition";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIsolationLevel(final HiveParser.IsolationLevelContext ctx) {
    final var methodName = "exitIsolationLevel";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoinSource(final HiveParser.JoinSourceContext ctx) {
    final var methodName = "exitJoinSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoinSourcePart(final HiveParser.JoinSourcePartContext ctx) {
    final var methodName = "exitJoinSourcePart";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoinToken(final HiveParser.JoinTokenContext ctx) {
    final var methodName = "exitJoinToken";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKeyProperty(final HiveParser.KeyPropertyContext ctx) {
    final var methodName = "exitKeyProperty";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKeyValueProperty(final HiveParser.KeyValuePropertyContext ctx) {
    final var methodName = "exitKeyValueProperty";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKillQueryStatement(final HiveParser.KillQueryStatementContext ctx) {
    final var methodName = "exitKillQueryStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLateralView(final HiveParser.LateralViewContext ctx) {
    final var methodName = "exitLateralView";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevelOfIsolation(final HiveParser.LevelOfIsolationContext ctx) {
    final var methodName = "exitLevelOfIsolation";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLikeTableOrFile(final HiveParser.LikeTableOrFileContext ctx) {
    final var methodName = "exitLikeTableOrFile";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLimitClause(final HiveParser.LimitClauseContext ctx) {
    final var methodName = "exitLimitClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitListType(final HiveParser.ListTypeContext ctx) {
    final var methodName = "exitListType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoadStatement(final HiveParser.LoadStatementContext ctx) {
    final var methodName = "exitLoadStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockDatabase(final HiveParser.LockDatabaseContext ctx) {
    final var methodName = "exitLockDatabase";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockMode(final HiveParser.LockModeContext ctx) {
    final var methodName = "exitLockMode";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockStatement(final HiveParser.LockStatementContext ctx) {
    final var methodName = "exitLockStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMapType(final HiveParser.MapTypeContext ctx) {
    final var methodName = "exitMapType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMergeStatement(final HiveParser.MergeStatementContext ctx) {
    final var methodName = "exitMergeStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMetastoreCheck(final HiveParser.MetastoreCheckContext ctx) {
    final var methodName = "exitMetastoreCheck";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNonReserved(final HiveParser.NonReservedContext ctx) {
    final var methodName = "exitNonReserved";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNull_treatment(final HiveParser.Null_treatmentContext ctx) {
    final var methodName = "exitNull_treatment";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNullOrdering(final HiveParser.NullOrderingContext ctx) {
    final var methodName = "exitNullOrdering";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrderByClause(final HiveParser.OrderByClauseContext ctx) {
    final var methodName = "exitOrderByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrderSpecification(final HiveParser.OrderSpecificationContext ctx) {
    final var methodName = "exitOrderSpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrderSpecificationRewrite(final HiveParser.OrderSpecificationRewriteContext ctx) {
    final var methodName = "exitOrderSpecificationRewrite";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrReplace(final HiveParser.OrReplaceContext ctx) {
    final var methodName = "exitOrReplace";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParameterIdx(final HiveParser.ParameterIdxContext ctx) {
    final var methodName = "exitParameterIdx";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionByClause(final HiveParser.PartitionByClauseContext ctx) {
    final var methodName = "exitPartitionByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionedTableFunction(final HiveParser.PartitionedTableFunctionContext ctx) {
    final var methodName = "exitPartitionedTableFunction";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitioningSpec(final HiveParser.PartitioningSpecContext ctx) {
    final var methodName = "exitPartitioningSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionLocation(final HiveParser.PartitionLocationContext ctx) {
    final var methodName = "exitPartitionLocation";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionSelectorOperator(final HiveParser.PartitionSelectorOperatorContext ctx) {
    final var methodName = "exitPartitionSelectorOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionSelectorSpec(final HiveParser.PartitionSelectorSpecContext ctx) {
    final var methodName = "exitPartitionSelectorSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionSelectorVal(final HiveParser.PartitionSelectorValContext ctx) {
    final var methodName = "exitPartitionSelectorVal";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionSpec(final HiveParser.PartitionSpecContext ctx) {
    final var methodName = "exitPartitionSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionTransformSpec(final HiveParser.PartitionTransformSpecContext ctx) {
    final var methodName = "exitPartitionTransformSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionTransformType(final HiveParser.PartitionTransformTypeContext ctx) {
    final var methodName = "exitPartitionTransformType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionVal(final HiveParser.PartitionValContext ctx) {
    final var methodName = "exitPartitionVal";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartTypeExpr(final HiveParser.PartTypeExprContext ctx) {
    final var methodName = "exitPartTypeExpr";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPkUkConstraint(final HiveParser.PkUkConstraintContext ctx) {
    final var methodName = "exitPkUkConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPoolAssign(final HiveParser.PoolAssignContext ctx) {
    final var methodName = "exitPoolAssign";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPoolAssignList(final HiveParser.PoolAssignListContext ctx) {
    final var methodName = "exitPoolAssignList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPoolPath(final HiveParser.PoolPathContext ctx) {
    final var methodName = "exitPoolPath";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceAndExpression(final HiveParser.PrecedenceAndExpressionContext ctx) {
    final var methodName = "exitPrecedenceAndExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceAndOperator(final HiveParser.PrecedenceAndOperatorContext ctx) {
    final var methodName = "exitPrecedenceAndOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceEqualExpression(final HiveParser.PrecedenceEqualExpressionContext ctx) {
    final var methodName = "exitPrecedenceEqualExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceEqualOperator(final HiveParser.PrecedenceEqualOperatorContext ctx) {
    final var methodName = "exitPrecedenceEqualOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceFieldExpression(final HiveParser.PrecedenceFieldExpressionContext ctx) {
    final var methodName = "exitPrecedenceFieldExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceNotExpression(final HiveParser.PrecedenceNotExpressionContext ctx) {
    final var methodName = "exitPrecedenceNotExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceNotOperator(final HiveParser.PrecedenceNotOperatorContext ctx) {
    final var methodName = "exitPrecedenceNotOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceOrExpression(final HiveParser.PrecedenceOrExpressionContext ctx) {
    final var methodName = "exitPrecedenceOrExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceOrOperator(final HiveParser.PrecedenceOrOperatorContext ctx) {
    final var methodName = "exitPrecedenceOrOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedencePlusExpression(final HiveParser.PrecedencePlusExpressionContext ctx) {
    final var methodName = "exitPrecedencePlusExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedencePlusOperator(final HiveParser.PrecedencePlusOperatorContext ctx) {
    final var methodName = "exitPrecedencePlusOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceRegexpOperator(final HiveParser.PrecedenceRegexpOperatorContext ctx) {
    final var methodName = "exitPrecedenceRegexpOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceSimilarOperator(final HiveParser.PrecedenceSimilarOperatorContext ctx) {
    final var methodName = "exitPrecedenceSimilarOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceStarExpression(final HiveParser.PrecedenceStarExpressionContext ctx) {
    final var methodName = "exitPrecedenceStarExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceStarOperator(final HiveParser.PrecedenceStarOperatorContext ctx) {
    final var methodName = "exitPrecedenceStarOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrecedenceUnaryOperator(final HiveParser.PrecedenceUnaryOperatorContext ctx) {
    final var methodName = "exitPrecedenceUnaryOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrepareStatement(final HiveParser.PrepareStatementContext ctx) {
    final var methodName = "exitPrepareStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrepareStmtParam(final HiveParser.PrepareStmtParamContext ctx) {
    final var methodName = "exitPrepareStmtParam";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimitiveType(final HiveParser.PrimitiveTypeContext ctx) {
    final var methodName = "exitPrimitiveType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrincipalIdentifier(final HiveParser.PrincipalIdentifierContext ctx) {
    final var methodName = "exitPrincipalIdentifier";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrincipalName(final HiveParser.PrincipalNameContext ctx) {
    final var methodName = "exitPrincipalName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrincipalSpecification(final HiveParser.PrincipalSpecificationContext ctx) {
    final var methodName = "exitPrincipalSpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilegeIncludeColObject(final HiveParser.PrivilegeIncludeColObjectContext ctx) {
    final var methodName = "exitPrivilegeIncludeColObject";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilegeList(final HiveParser.PrivilegeListContext ctx) {
    final var methodName = "exitPrivilegeList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilegeObject(final HiveParser.PrivilegeObjectContext ctx) {
    final var methodName = "exitPrivilegeObject";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilegeType(final HiveParser.PrivilegeTypeContext ctx) {
    final var methodName = "exitPrivilegeType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivlegeDef(final HiveParser.PrivlegeDefContext ctx) {
    final var methodName = "exitPrivlegeDef";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivObject(final HiveParser.PrivObjectContext ctx) {
    final var methodName = "exitPrivObject";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivObjectCols(final HiveParser.PrivObjectColsContext ctx) {
    final var methodName = "exitPrivObjectCols";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQualifyClause(final HiveParser.QualifyClauseContext ctx) {
    final var methodName = "exitQualifyClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuantifierType(final HiveParser.QuantifierTypeContext ctx) {
    final var methodName = "exitQuantifierType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQueryStatementExpression(final HiveParser.QueryStatementExpressionContext ctx) {
    final var methodName = "exitQueryStatementExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRecordReader(final HiveParser.RecordReaderContext ctx) {
    final var methodName = "exitRecordReader";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRecordWriter(final HiveParser.RecordWriterContext ctx) {
    final var methodName = "exitRecordWriter";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRegularBody(final HiveParser.RegularBodyContext ctx) {
    final var methodName = "exitRegularBody";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReloadFunctionsStatement(final HiveParser.ReloadFunctionsStatementContext ctx) {
    final var methodName = "exitReloadFunctionsStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelySpecification(final HiveParser.RelySpecificationContext ctx) {
    final var methodName = "exitRelySpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplConfigs(final HiveParser.ReplConfigsContext ctx) {
    final var methodName = "exitReplConfigs";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplConfigsList(final HiveParser.ReplConfigsListContext ctx) {
    final var methodName = "exitReplConfigsList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplDbPolicy(final HiveParser.ReplDbPolicyContext ctx) {
    final var methodName = "exitReplDbPolicy";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplDumpStatement(final HiveParser.ReplDumpStatementContext ctx) {
    final var methodName = "exitReplDumpStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplicationClause(final HiveParser.ReplicationClauseContext ctx) {
    final var methodName = "exitReplicationClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplLoadStatement(final HiveParser.ReplLoadStatementContext ctx) {
    final var methodName = "exitReplLoadStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplStatusStatement(final HiveParser.ReplStatusStatementContext ctx) {
    final var methodName = "exitReplStatusStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplTableLevelPolicy(final HiveParser.ReplTableLevelPolicyContext ctx) {
    final var methodName = "exitReplTableLevelPolicy";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResource(final HiveParser.ResourceContext ctx) {
    final var methodName = "exitResource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResourceList(final HiveParser.ResourceListContext ctx) {
    final var methodName = "exitResourceList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResourcePlanDdlStatements(final HiveParser.ResourcePlanDdlStatementsContext ctx) {
    final var methodName = "exitResourcePlanDdlStatements";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResourceType(final HiveParser.ResourceTypeContext ctx) {
    final var methodName = "exitResourceType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRestrictOrCascade(final HiveParser.RestrictOrCascadeContext ctx) {
    final var methodName = "exitRestrictOrCascade";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevokePrivileges(final HiveParser.RevokePrivilegesContext ctx) {
    final var methodName = "exitRevokePrivileges";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevokeRole(final HiveParser.RevokeRoleContext ctx) {
    final var methodName = "exitRevokeRole";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRewriteDisabled(final HiveParser.RewriteDisabledContext ctx) {
    final var methodName = "exitRewriteDisabled";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRewriteEnabled(final HiveParser.RewriteEnabledContext ctx) {
    final var methodName = "exitRewriteEnabled";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollbackStatement(final HiveParser.RollbackStatementContext ctx) {
    final var methodName = "exitRollbackStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollupOldSyntax(final HiveParser.RollupOldSyntaxContext ctx) {
    final var methodName = "exitRollupOldSyntax";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollupStandard(final HiveParser.RollupStandardContext ctx) {
    final var methodName = "exitRollupStandard";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowFormat(final HiveParser.RowFormatContext ctx) {
    final var methodName = "exitRowFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowFormatDelimited(final HiveParser.RowFormatDelimitedContext ctx) {
    final var methodName = "exitRowFormatDelimited";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRowFormatSerde(final HiveParser.RowFormatSerdeContext ctx) {
    final var methodName = "exitRowFormatSerde";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRpAssign(final HiveParser.RpAssignContext ctx) {
    final var methodName = "exitRpAssign";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRpAssignList(final HiveParser.RpAssignListContext ctx) {
    final var methodName = "exitRpAssignList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRpUnassign(final HiveParser.RpUnassignContext ctx) {
    final var methodName = "exitRpUnassign";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRpUnassignList(final HiveParser.RpUnassignListContext ctx) {
    final var methodName = "exitRpUnassignList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitScheduleSpec(final HiveParser.ScheduleSpecContext ctx) {
    final var methodName = "exitScheduleSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSearchCondition(final HiveParser.SearchConditionContext ctx) {
    final var methodName = "exitSearchCondition";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectClause(final HiveParser.SelectClauseContext ctx) {
    final var methodName = "exitSelectClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectExpression(final HiveParser.SelectExpressionContext ctx) {
    final var methodName = "exitSelectExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectExpressionList(final HiveParser.SelectExpressionListContext ctx) {
    final var methodName = "exitSelectExpressionList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectItem(final HiveParser.SelectItemContext ctx) {
    final var methodName = "exitSelectItem";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectList(final HiveParser.SelectListContext ctx) {
    final var methodName = "exitSelectList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectStatement(final HiveParser.SelectStatementContext ctx) {
    final var methodName = "exitSelectStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectStatementWithCTE(final HiveParser.SelectStatementWithCTEContext ctx) {
    final var methodName = "exitSelectStatementWithCTE";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectTrfmClause(final HiveParser.SelectTrfmClauseContext ctx) {
    final var methodName = "exitSelectTrfmClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetAutoCommitStatement(final HiveParser.SetAutoCommitStatementContext ctx) {
    final var methodName = "exitSetAutoCommitStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetColumnsClause(final HiveParser.SetColumnsClauseContext ctx) {
    final var methodName = "exitSetColumnsClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetOperator(final HiveParser.SetOperatorContext ctx) {
    final var methodName = "exitSetOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetOpSelectStatement(final HiveParser.SetOpSelectStatementContext ctx) {
    final var methodName = "exitSetOpSelectStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetRole(final HiveParser.SetRoleContext ctx) {
    final var methodName = "exitSetRole";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCurrentRole(final HiveParser.ShowCurrentRoleContext ctx) {
    final var methodName = "exitShowCurrentRole";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowFunctionIdentifier(final HiveParser.ShowFunctionIdentifierContext ctx) {
    final var methodName = "exitShowFunctionIdentifier";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowGrants(final HiveParser.ShowGrantsContext ctx) {
    final var methodName = "exitShowGrants";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowRoleGrants(final HiveParser.ShowRoleGrantsContext ctx) {
    final var methodName = "exitShowRoleGrants";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowRolePrincipals(final HiveParser.ShowRolePrincipalsContext ctx) {
    final var methodName = "exitShowRolePrincipals";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowRoles(final HiveParser.ShowRolesContext ctx) {
    final var methodName = "exitShowRoles";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowStatement(final HiveParser.ShowStatementContext ctx) {
    final var methodName = "exitShowStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowStmtIdentifier(final HiveParser.ShowStmtIdentifierContext ctx) {
    final var methodName = "exitShowStmtIdentifier";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowTablesFilterExpr(final HiveParser.ShowTablesFilterExprContext ctx) {
    final var methodName = "exitShowTablesFilterExpr";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSingleFromStatement(final HiveParser.SingleFromStatementContext ctx) {
    final var methodName = "exitSingleFromStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedColumnValue(final HiveParser.SkewedColumnValueContext ctx) {
    final var methodName = "exitSkewedColumnValue";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedColumnValuePair(final HiveParser.SkewedColumnValuePairContext ctx) {
    final var methodName = "exitSkewedColumnValuePair";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedColumnValuePairList(final HiveParser.SkewedColumnValuePairListContext ctx) {
    final var methodName = "exitSkewedColumnValuePairList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedColumnValues(final HiveParser.SkewedColumnValuesContext ctx) {
    final var methodName = "exitSkewedColumnValues";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedLocationMap(final HiveParser.SkewedLocationMapContext ctx) {
    final var methodName = "exitSkewedLocationMap";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedLocations(final HiveParser.SkewedLocationsContext ctx) {
    final var methodName = "exitSkewedLocations";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedLocationsList(final HiveParser.SkewedLocationsListContext ctx) {
    final var methodName = "exitSkewedLocationsList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSkewedValueElement(final HiveParser.SkewedValueElementContext ctx) {
    final var methodName = "exitSkewedValueElement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSortByClause(final HiveParser.SortByClauseContext ctx) {
    final var methodName = "exitSortByClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSplitSample(final HiveParser.SplitSampleContext ctx) {
    final var methodName = "exitSplitSample";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSqlTransactionStatement(final HiveParser.SqlTransactionStatementContext ctx) {
    final var methodName = "exitSqlTransactionStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStartTransactionStatement(final HiveParser.StartTransactionStatementContext ctx) {
    final var methodName = "exitStartTransactionStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStatement(final HiveParser.StatementContext ctx) {
    final var methodName = "exitStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStoredAsDirs(final HiveParser.StoredAsDirsContext ctx) {
    final var methodName = "exitStoredAsDirs";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStringLiteralSequence(final HiveParser.StringLiteralSequenceContext ctx) {
    final var methodName = "exitStringLiteralSequence";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStructType(final HiveParser.StructTypeContext ctx) {
    final var methodName = "exitStructType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubQueryExpression(final HiveParser.SubQueryExpressionContext ctx) {
    final var methodName = "exitSubQueryExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubQuerySelectorOperator(final HiveParser.SubQuerySelectorOperatorContext ctx) {
    final var methodName = "exitSubQuerySelectorOperator";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubQuerySource(final HiveParser.SubQuerySourceContext ctx) {
    final var methodName = "exitSubQuerySource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSwitchDatabaseStatement(final HiveParser.SwitchDatabaseStatementContext ctx) {
    final var methodName = "exitSwitchDatabaseStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSysFuncNames(final HiveParser.SysFuncNamesContext ctx) {
    final var methodName = "exitSysFuncNames";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableAlias(final HiveParser.TableAliasContext ctx) {
    final var methodName = "exitTableAlias";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableAllColumns(final HiveParser.TableAllColumnsContext ctx) {
    final var methodName = "exitTableAllColumns";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableBuckets(final HiveParser.TableBucketsContext ctx) {
    final var methodName = "exitTableBuckets";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableBucketSample(final HiveParser.TableBucketSampleContext ctx) {
    final var methodName = "exitTableBucketSample";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableComment(final HiveParser.TableCommentContext ctx) {
    final var methodName = "exitTableComment";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableConstraint(final HiveParser.TableConstraintContext ctx) {
    final var methodName = "exitTableConstraint";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableConstraintType(final HiveParser.TableConstraintTypeContext ctx) {
    final var methodName = "exitTableConstraintType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
  public void exitTableImplBuckets(final HiveParser.TableImplBucketsContext ctx) {
    final var methodName = "exitTableImplBuckets";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    if (StringUtils.equalsIgnoreCase("PRIMARY KEY", primaryKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    } else if (StringUtils.equalsIgnoreCase("UNIQUE", primaryKeyText)) {
      for (final var currentField : currentFieldList) {
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
  public void exitTableLocation(final HiveParser.TableLocationContext ctx) {
    final var methodName = "exitTableLocation";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableName(final HiveParser.TableNameContext ctx) {
    final var methodName = "exitTableName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOrColumn(final HiveParser.TableOrColumnContext ctx) {
    final var methodName = "exitTableOrColumn";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOrPartition(final HiveParser.TableOrPartitionContext ctx) {
    final var methodName = "exitTableOrPartition";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablePartitionPrefix(final HiveParser.TablePartitionPrefixContext ctx) {
    final var methodName = "exitTablePartitionPrefix";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableProperties(final HiveParser.TablePropertiesContext ctx) {
    final var methodName = "exitTableProperties";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablePropertiesList(final HiveParser.TablePropertiesListContext ctx) {
    final var methodName = "exitTablePropertiesList";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablePropertiesPrefixed(final HiveParser.TablePropertiesPrefixedContext ctx) {
    final var methodName = "exitTablePropertiesPrefixed";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableRowFormat(final HiveParser.TableRowFormatContext ctx) {
    final var methodName = "exitTableRowFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableRowNullFormat(final HiveParser.TableRowNullFormatContext ctx) {
    final var methodName = "exitTableRowNullFormat";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSample(final HiveParser.TableSampleContext ctx) {
    final var methodName = "exitTableSample";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSkewed(final HiveParser.TableSkewedContext ctx) {
    final var methodName = "exitTableSkewed";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSource(final HiveParser.TableSourceContext ctx) {
    final var methodName = "exitTableSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTabPartColTypeExpr(final HiveParser.TabPartColTypeExprContext ctx) {
    final var methodName = "exitTabPartColTypeExpr";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTabTypeExpr(final HiveParser.TabTypeExprContext ctx) {
    final var methodName = "exitTabTypeExpr";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTimeQualifiers(final HiveParser.TimeQualifiersContext ctx) {
    final var methodName = "exitTimeQualifiers";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTimestampLiteral(final HiveParser.TimestampLiteralContext ctx) {
    final var methodName = "exitTimestampLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTimestampLocalTZLiteral(final HiveParser.TimestampLocalTZLiteralContext ctx) {
    final var methodName = "exitTimestampLocalTZLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionAccessMode(final HiveParser.TransactionAccessModeContext ctx) {
    final var methodName = "exitTransactionAccessMode";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionMode(final HiveParser.TransactionModeContext ctx) {
    final var methodName = "exitTransactionMode";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrfmClause(final HiveParser.TrfmClauseContext ctx) {
    final var methodName = "exitTrfmClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerActionExpression(final HiveParser.TriggerActionExpressionContext ctx) {
    final var methodName = "exitTriggerActionExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerAndExpression(final HiveParser.TriggerAndExpressionContext ctx) {
    final var methodName = "exitTriggerAndExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerAtomExpression(final HiveParser.TriggerAtomExpressionContext ctx) {
    final var methodName = "exitTriggerAtomExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerExpression(final HiveParser.TriggerExpressionContext ctx) {
    final var methodName = "exitTriggerExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerLiteral(final HiveParser.TriggerLiteralContext ctx) {
    final var methodName = "exitTriggerLiteral";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTriggerOrExpression(final HiveParser.TriggerOrExpressionContext ctx) {
    final var methodName = "exitTriggerOrExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrimFunction(final HiveParser.TrimFunctionContext ctx) {
    final var methodName = "exitTrimFunction";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTruncateTableStatement(final HiveParser.TruncateTableStatementContext ctx) {
    final var methodName = "exitTruncateTableStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitType(final HiveParser.TypeContext ctx) {
    final var methodName = "exitType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnionType(final HiveParser.UnionTypeContext ctx) {
    final var methodName = "exitUnionType";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueJoinExpr(final HiveParser.UniqueJoinExprContext ctx) {
    final var methodName = "exitUniqueJoinExpr";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueJoinSource(final HiveParser.UniqueJoinSourceContext ctx) {
    final var methodName = "exitUniqueJoinSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueJoinTableSource(final HiveParser.UniqueJoinTableSourceContext ctx) {
    final var methodName = "exitUniqueJoinTableSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueJoinToken(final HiveParser.UniqueJoinTokenContext ctx) {
    final var methodName = "exitUniqueJoinToken";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnlockDatabase(final HiveParser.UnlockDatabaseContext ctx) {
    final var methodName = "exitUnlockDatabase";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnlockStatement(final HiveParser.UnlockStatementContext ctx) {
    final var methodName = "exitUnlockStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnmanaged(final HiveParser.UnmanagedContext ctx) {
    final var methodName = "exitUnmanaged";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdateOrDelete(final HiveParser.UpdateOrDeleteContext ctx) {
    final var methodName = "exitUpdateOrDelete";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdateStatement(final HiveParser.UpdateStatementContext ctx) {
    final var methodName = "exitUpdateStatement";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValidateSpecification(final HiveParser.ValidateSpecificationContext ctx) {
    final var methodName = "exitValidateSpecification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValueRowConstructor(final HiveParser.ValueRowConstructorContext ctx) {
    final var methodName = "exitValueRowConstructor";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValuesClause(final HiveParser.ValuesClauseContext ctx) {
    final var methodName = "exitValuesClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValuesSource(final HiveParser.ValuesSourceContext ctx) {
    final var methodName = "exitValuesSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValuesTableConstructor(final HiveParser.ValuesTableConstructorContext ctx) {
    final var methodName = "exitValuesTableConstructor";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVectorizationOnly(final HiveParser.VectorizationOnlyContext ctx) {
    final var methodName = "exitVectorizationOnly";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVectorizatonDetail(final HiveParser.VectorizatonDetailContext ctx) {
    final var methodName = "exitVectorizatonDetail";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewClusterSpec(final HiveParser.ViewClusterSpecContext ctx) {
    final var methodName = "exitViewClusterSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewComplexSpec(final HiveParser.ViewComplexSpecContext ctx) {
    final var methodName = "exitViewComplexSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewDistSpec(final HiveParser.ViewDistSpecContext ctx) {
    final var methodName = "exitViewDistSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewName(final HiveParser.ViewNameContext ctx) {
    final var methodName = "exitViewName";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewOrganization(final HiveParser.ViewOrganizationContext ctx) {
    final var methodName = "exitViewOrganization";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewPartition(final HiveParser.ViewPartitionContext ctx) {
    final var methodName = "exitViewPartition";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitViewSortSpec(final HiveParser.ViewSortSpecContext ctx) {
    final var methodName = "exitViewSortSpec";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVirtualTableSource(final HiveParser.VirtualTableSourceContext ctx) {
    final var methodName = "exitVirtualTableSource";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhenClauses(final HiveParser.WhenClausesContext ctx) {
    final var methodName = "exitWhenClauses";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhenExpression(final HiveParser.WhenExpressionContext ctx) {
    final var methodName = "exitWhenExpression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhenMatchedAndClause(final HiveParser.WhenMatchedAndClauseContext ctx) {
    final var methodName = "exitWhenMatchedAndClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhenMatchedThenClause(final HiveParser.WhenMatchedThenClauseContext ctx) {
    final var methodName = "exitWhenMatchedThenClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhenNotMatchedClause(final HiveParser.WhenNotMatchedClauseContext ctx) {
    final var methodName = "exitWhenNotMatchedClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhereClause(final HiveParser.WhereClauseContext ctx) {
    final var methodName = "exitWhereClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_clause(final HiveParser.Window_clauseContext ctx) {
    final var methodName = "exitWindow_clause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_defn(final HiveParser.Window_defnContext ctx) {
    final var methodName = "exitWindow_defn";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_frame(final HiveParser.Window_frameContext ctx) {
    final var methodName = "exitWindow_frame";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_frame_boundary(final HiveParser.Window_frame_boundaryContext ctx) {
    final var methodName = "exitWindow_frame_boundary";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_range_expression(final HiveParser.Window_range_expressionContext ctx) {
    final var methodName = "exitWindow_range_expression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_specification(final HiveParser.Window_specificationContext ctx) {
    final var methodName = "exitWindow_specification";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindow_value_expression(final HiveParser.Window_value_expressionContext ctx) {
    final var methodName = "exitWindow_value_expression";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithAdminOption(final HiveParser.WithAdminOptionContext ctx) {
    final var methodName = "exitWithAdminOption";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithClause(final HiveParser.WithClauseContext ctx) {
    final var methodName = "exitWithClause";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithGrantOption(final HiveParser.WithGrantOptionContext ctx) {
    final var methodName = "exitWithGrantOption";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithReplace(final HiveParser.WithReplaceContext ctx) {
    final var methodName = "exitWithReplace";
    HiveParserListenerImpl.traceChildren(methodName, ctx);
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

    final var parentContext =
        ParseTreeHelper.getParentContext(ctx, HiveParser.CreateForeignKeyContext.class);
    if (parentContext != null && parentContext.children != null) {
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(HiveParser.Id_Context.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toList()));
      terminalNode.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(HiveParser.TableNameContext.class)
              .streamChildrenByClass(HiveParser.Id_Context.class)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toList()));
    }
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(HiveParser.ColumnConstraintContext.class)
            .streamChildrenByClass(HiveParser.ForeignKeyConstraintContext.class)
            .filter(TerminalNode.class::isInstance)
            .map(
                foreignTerminalNode -> {
                  final List<ParseTree> returnValue = new ArrayList<ParseTree>();
                  if (StringUtils.equalsAnyIgnoreCase(
                      "REFERENCES", foreignTerminalNode.getText())) {
                    returnValue.addAll(
                        ParseTreeStream.parseTreeStream(
                                (ParserRuleContext)
                                    foreignTerminalNode.getParent().getParent().getParent())
                            .streamChildrenByClass(HiveParser.Id_Context.class)
                            .filter(TerminalNode.class::isInstance)
                            .collect(Collectors.toList()));
                  }
                  return returnValue;
                })
            .flatMap(List::stream)
            .collect(Collectors.toList()));

    if (0 < terminalNode.size()) {
      return ParseTreeHelper.getRelationship(currentTable, terminalNode.get(0));
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
    HiveParserListenerImpl.traceChildren(methodName, node);
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
