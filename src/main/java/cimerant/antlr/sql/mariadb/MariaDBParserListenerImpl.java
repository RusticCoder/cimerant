package cimerant.antlr.sql.mariadb;

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
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Strings;
import org.apache.commons.lang3.mutable.MutableBoolean;
import sql.mariadb.MariaDBParser;
import sql.mariadb.MariaDBParserBaseListener;
import sql.mariadb.MariaDBParserListener;

/**
 * This class provides an empty implementation of {@link MariaDBParserListener}, which can be
 * extended to create a listener which only needs to handle a subset of the available methods.
 */
public class MariaDBParserListenerImpl extends MariaDBParserBaseListener {
  private static CharStream input;
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(MariaDBParserListenerImpl.class.getName());
  }

  private static void traceChildren(final String methodName, final ParseTree ctx) {
    if (MariaDBParserListenerImpl.logger.isTraceEnabled()) {
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
  public void enterAdministrationStatement(final MariaDBParser.AdministrationStatementContext ctx) {
    final var methodName = "enterAdministrationStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggregateFunctionCall(final MariaDBParser.AggregateFunctionCallContext ctx) {
    final var methodName = "enterAggregateFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggregateWindowedFunction(
      final MariaDBParser.AggregateWindowedFunctionContext ctx) {
    final var methodName = "enterAggregateWindowedFunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddCheckTableConstraint(
      final MariaDBParser.AlterByAddCheckTableConstraintContext ctx) {
    final var methodName = "enterAlterByAddCheckTableConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddColumn(final MariaDBParser.AlterByAddColumnContext ctx) {
    final var methodName = "enterAlterByAddColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddColumns(final MariaDBParser.AlterByAddColumnsContext ctx) {
    final var methodName = "enterAlterByAddColumns";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddDefinitions(final MariaDBParser.AlterByAddDefinitionsContext ctx) {
    final var methodName = "enterAlterByAddDefinitions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddForeignKey(final MariaDBParser.AlterByAddForeignKeyContext ctx) {
    final var methodName = "enterAlterByAddForeignKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddIndex(final MariaDBParser.AlterByAddIndexContext ctx) {
    final var methodName = "enterAlterByAddIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddPartition(final MariaDBParser.AlterByAddPartitionContext ctx) {
    final var methodName = "enterAlterByAddPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddPrimaryKey(final MariaDBParser.AlterByAddPrimaryKeyContext ctx) {
    final var methodName = "enterAlterByAddPrimaryKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddSpecialIndex(final MariaDBParser.AlterByAddSpecialIndexContext ctx) {
    final var methodName = "enterAlterByAddSpecialIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddUniqueKey(final MariaDBParser.AlterByAddUniqueKeyContext ctx) {
    final var methodName = "enterAlterByAddUniqueKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAlterIndexVisibility(
      final MariaDBParser.AlterByAlterIndexVisibilityContext ctx) {
    final var methodName = "enterAlterByAlterIndexVisibility";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAnalyzePartition(final MariaDBParser.AlterByAnalyzePartitionContext ctx) {
    final var methodName = "enterAlterByAnalyzePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByChangeColumn(final MariaDBParser.AlterByChangeColumnContext ctx) {
    final var methodName = "enterAlterByChangeColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByChangeDefault(final MariaDBParser.AlterByChangeDefaultContext ctx) {
    final var methodName = "enterAlterByChangeDefault";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByCheckPartition(final MariaDBParser.AlterByCheckPartitionContext ctx) {
    final var methodName = "enterAlterByCheckPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByCoalescePartition(
      final MariaDBParser.AlterByCoalescePartitionContext ctx) {
    final var methodName = "enterAlterByCoalescePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByConvertCharset(final MariaDBParser.AlterByConvertCharsetContext ctx) {
    final var methodName = "enterAlterByConvertCharset";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDefaultCharset(final MariaDBParser.AlterByDefaultCharsetContext ctx) {
    final var methodName = "enterAlterByDefaultCharset";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDisableKeys(final MariaDBParser.AlterByDisableKeysContext ctx) {
    final var methodName = "enterAlterByDisableKeys";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDiscardPartition(final MariaDBParser.AlterByDiscardPartitionContext ctx) {
    final var methodName = "enterAlterByDiscardPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDiscardTablespace(
      final MariaDBParser.AlterByDiscardTablespaceContext ctx) {
    final var methodName = "enterAlterByDiscardTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropColumn(final MariaDBParser.AlterByDropColumnContext ctx) {
    final var methodName = "enterAlterByDropColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropConstraintCheck(
      final MariaDBParser.AlterByDropConstraintCheckContext ctx) {
    final var methodName = "enterAlterByDropConstraintCheck";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropForeignKey(final MariaDBParser.AlterByDropForeignKeyContext ctx) {
    final var methodName = "enterAlterByDropForeignKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropIndex(final MariaDBParser.AlterByDropIndexContext ctx) {
    final var methodName = "enterAlterByDropIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropPartition(final MariaDBParser.AlterByDropPartitionContext ctx) {
    final var methodName = "enterAlterByDropPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropPrimaryKey(final MariaDBParser.AlterByDropPrimaryKeyContext ctx) {
    final var methodName = "enterAlterByDropPrimaryKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByEnableKeys(final MariaDBParser.AlterByEnableKeysContext ctx) {
    final var methodName = "enterAlterByEnableKeys";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByExchangePartition(
      final MariaDBParser.AlterByExchangePartitionContext ctx) {
    final var methodName = "enterAlterByExchangePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByForce(final MariaDBParser.AlterByForceContext ctx) {
    final var methodName = "enterAlterByForce";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByImportPartition(final MariaDBParser.AlterByImportPartitionContext ctx) {
    final var methodName = "enterAlterByImportPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByImportTablespace(final MariaDBParser.AlterByImportTablespaceContext ctx) {
    final var methodName = "enterAlterByImportTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByLock(final MariaDBParser.AlterByLockContext ctx) {
    final var methodName = "enterAlterByLock";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByModifyColumn(final MariaDBParser.AlterByModifyColumnContext ctx) {
    final var methodName = "enterAlterByModifyColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByOptimizePartition(
      final MariaDBParser.AlterByOptimizePartitionContext ctx) {
    final var methodName = "enterAlterByOptimizePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByOrder(final MariaDBParser.AlterByOrderContext ctx) {
    final var methodName = "enterAlterByOrder";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRebuildPartition(final MariaDBParser.AlterByRebuildPartitionContext ctx) {
    final var methodName = "enterAlterByRebuildPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRemovePartitioning(
      final MariaDBParser.AlterByRemovePartitioningContext ctx) {
    final var methodName = "enterAlterByRemovePartitioning";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRename(final MariaDBParser.AlterByRenameContext ctx) {
    final var methodName = "enterAlterByRename";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRenameColumn(final MariaDBParser.AlterByRenameColumnContext ctx) {
    final var methodName = "enterAlterByRenameColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRenameIndex(final MariaDBParser.AlterByRenameIndexContext ctx) {
    final var methodName = "enterAlterByRenameIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByReorganizePartition(
      final MariaDBParser.AlterByReorganizePartitionContext ctx) {
    final var methodName = "enterAlterByReorganizePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRepairPartition(final MariaDBParser.AlterByRepairPartitionContext ctx) {
    final var methodName = "enterAlterByRepairPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterBySetAlgorithm(final MariaDBParser.AlterBySetAlgorithmContext ctx) {
    final var methodName = "enterAlterBySetAlgorithm";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByTableOption(final MariaDBParser.AlterByTableOptionContext ctx) {
    final var methodName = "enterAlterByTableOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByTruncatePartition(
      final MariaDBParser.AlterByTruncatePartitionContext ctx) {
    final var methodName = "enterAlterByTruncatePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByUpgradePartitioning(
      final MariaDBParser.AlterByUpgradePartitioningContext ctx) {
    final var methodName = "enterAlterByUpgradePartitioning";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByValidate(final MariaDBParser.AlterByValidateContext ctx) {
    final var methodName = "enterAlterByValidate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterEvent(final MariaDBParser.AlterEventContext ctx) {
    final var methodName = "enterAlterEvent";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterFunction(final MariaDBParser.AlterFunctionContext ctx) {
    final var methodName = "enterAlterFunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterInstance(final MariaDBParser.AlterInstanceContext ctx) {
    final var methodName = "enterAlterInstance";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterLogfileGroup(final MariaDBParser.AlterLogfileGroupContext ctx) {
    final var methodName = "enterAlterLogfileGroup";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterPartition(final MariaDBParser.AlterPartitionContext ctx) {
    final var methodName = "enterAlterPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterProcedure(final MariaDBParser.AlterProcedureContext ctx) {
    final var methodName = "enterAlterProcedure";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterSequence(final MariaDBParser.AlterSequenceContext ctx) {
    final var methodName = "enterAlterSequence";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterServer(final MariaDBParser.AlterServerContext ctx) {
    final var methodName = "enterAlterServer";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterSimpleDatabase(final MariaDBParser.AlterSimpleDatabaseContext ctx) {
    final var methodName = "enterAlterSimpleDatabase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterTable(final MariaDBParser.AlterTableContext ctx) {
    final var methodName = "enterAlterTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterTablespace(final MariaDBParser.AlterTablespaceContext ctx) {
    final var methodName = "enterAlterTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterUpgradeName(final MariaDBParser.AlterUpgradeNameContext ctx) {
    final var methodName = "enterAlterUpgradeName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterUserMysqlV56(final MariaDBParser.AlterUserMysqlV56Context ctx) {
    final var methodName = "enterAlterUserMysqlV56";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterUserMysqlV80(final MariaDBParser.AlterUserMysqlV80Context ctx) {
    final var methodName = "enterAlterUserMysqlV80";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterView(final MariaDBParser.AlterViewContext ctx) {
    final var methodName = "enterAlterView";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAnalyzeTable(final MariaDBParser.AnalyzeTableContext ctx) {
    final var methodName = "enterAnalyzeTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAssignmentField(final MariaDBParser.AssignmentFieldContext ctx) {
    final var methodName = "enterAssignmentField";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAtomTableItem(final MariaDBParser.AtomTableItemContext ctx) {
    final var methodName = "enterAtomTableItem";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAuthPlugin(final MariaDBParser.AuthPluginContext ctx) {
    final var methodName = "enterAuthPlugin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAutoIncrementColumnConstraint(
      final MariaDBParser.AutoIncrementColumnConstraintContext ctx) {
    final var methodName = "enterAutoIncrementColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBeginWork(final MariaDBParser.BeginWorkContext ctx) {
    final var methodName = "enterBeginWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBetweenPredicate(final MariaDBParser.BetweenPredicateContext ctx) {
    final var methodName = "enterBetweenPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBinaryComparisonPredicate(
      final MariaDBParser.BinaryComparisonPredicateContext ctx) {
    final var methodName = "enterBinaryComparisonPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBinaryExpressionAtom(final MariaDBParser.BinaryExpressionAtomContext ctx) {
    final var methodName = "enterBinaryExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBinlogStatement(final MariaDBParser.BinlogStatementContext ctx) {
    final var methodName = "enterBinlogStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBitExpressionAtom(final MariaDBParser.BitExpressionAtomContext ctx) {
    final var methodName = "enterBitExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBitOperator(final MariaDBParser.BitOperatorContext ctx) {
    final var methodName = "enterBitOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBlockStatement(final MariaDBParser.BlockStatementContext ctx) {
    final var methodName = "enterBlockStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBooleanLiteral(final MariaDBParser.BooleanLiteralContext ctx) {
    final var methodName = "enterBooleanLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBoolMasterOption(final MariaDBParser.BoolMasterOptionContext ctx) {
    final var methodName = "enterBoolMasterOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCacheIndexStatement(final MariaDBParser.CacheIndexStatementContext ctx) {
    final var methodName = "enterCacheIndexStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCallStatement(final MariaDBParser.CallStatementContext ctx) {
    final var methodName = "enterCallStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseAlternative(final MariaDBParser.CaseAlternativeContext ctx) {
    final var methodName = "enterCaseAlternative";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseExpressionFunctionCall(
      final MariaDBParser.CaseExpressionFunctionCallContext ctx) {
    final var methodName = "enterCaseExpressionFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseFuncAlternative(final MariaDBParser.CaseFuncAlternativeContext ctx) {
    final var methodName = "enterCaseFuncAlternative";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseFunctionCall(final MariaDBParser.CaseFunctionCallContext ctx) {
    final var methodName = "enterCaseFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseStatement(final MariaDBParser.CaseStatementContext ctx) {
    final var methodName = "enterCaseStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChangeMaster(final MariaDBParser.ChangeMasterContext ctx) {
    final var methodName = "enterChangeMaster";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChangeReplicationFilter(final MariaDBParser.ChangeReplicationFilterContext ctx) {
    final var methodName = "enterChangeReplicationFilter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChannelFlushOption(final MariaDBParser.ChannelFlushOptionContext ctx) {
    final var methodName = "enterChannelFlushOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChannelOption(final MariaDBParser.ChannelOptionContext ctx) {
    final var methodName = "enterChannelOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharFunctionCall(final MariaDBParser.CharFunctionCallContext ctx) {
    final var methodName = "enterCharFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharSet(final MariaDBParser.CharSetContext ctx) {
    final var methodName = "enterCharSet";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharsetName(final MariaDBParser.CharsetNameContext ctx) {
    final var methodName = "enterCharsetName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharsetNameBase(final MariaDBParser.CharsetNameBaseContext ctx) {
    final var methodName = "enterCharsetNameBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheckColumnConstraint(final MariaDBParser.CheckColumnConstraintContext ctx) {
    final var methodName = "enterCheckColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChecksumTable(final MariaDBParser.ChecksumTableContext ctx) {
    final var methodName = "enterChecksumTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheckTable(final MariaDBParser.CheckTableContext ctx) {
    final var methodName = "enterCheckTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheckTableConstraint(final MariaDBParser.CheckTableConstraintContext ctx) {
    final var methodName = "enterCheckTableConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheckTableOption(final MariaDBParser.CheckTableOptionContext ctx) {
    final var methodName = "enterCheckTableOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCloseCursor(final MariaDBParser.CloseCursorContext ctx) {
    final var methodName = "enterCloseCursor";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollateColumnConstraint(final MariaDBParser.CollateColumnConstraintContext ctx) {
    final var methodName = "enterCollateColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollateExpressionAtom(final MariaDBParser.CollateExpressionAtomContext ctx) {
    final var methodName = "enterCollateExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollationName(final MariaDBParser.CollationNameContext ctx) {
    final var methodName = "enterCollationName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollectionDataType(final MariaDBParser.CollectionDataTypeContext ctx) {
    final var methodName = "enterCollectionDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollectionOptions(final MariaDBParser.CollectionOptionsContext ctx) {
    final var methodName = "enterCollectionOptions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnCreateTable(final MariaDBParser.ColumnCreateTableContext ctx) {
    final var methodName = "enterColumnCreateTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnDeclaration(final MariaDBParser.ColumnDeclarationContext ctx) {
    final var methodName = "enterColumnDeclaration";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnDefinition(final MariaDBParser.ColumnDefinitionContext ctx) {
    final var methodName = "enterColumnDefinition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommentColumnConstraint(final MariaDBParser.CommentColumnConstraintContext ctx) {
    final var methodName = "enterCommentColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommitWork(final MariaDBParser.CommitWorkContext ctx) {
    final var methodName = "enterCommitWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommonTableExpressions(final MariaDBParser.CommonTableExpressionsContext ctx) {
    final var methodName = "enterCommonTableExpressions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComparisonOperator(final MariaDBParser.ComparisonOperatorContext ctx) {
    final var methodName = "enterComparisonOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompoundStatement(final MariaDBParser.CompoundStatementContext ctx) {
    final var methodName = "enterCompoundStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstant(final MariaDBParser.ConstantContext ctx) {
    final var methodName = "enterConstant";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstantExpressionAtom(final MariaDBParser.ConstantExpressionAtomContext ctx) {
    final var methodName = "enterConstantExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstants(final MariaDBParser.ConstantsContext ctx) {
    final var methodName = "enterConstants";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraintDeclaration(final MariaDBParser.ConstraintDeclarationContext ctx) {
    final var methodName = "enterConstraintDeclaration";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConvertedDataType(final MariaDBParser.ConvertedDataTypeContext ctx) {
    final var methodName = "enterConvertedDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopyCreateTable(final MariaDBParser.CopyCreateTableContext ctx) {
    final var methodName = "enterCopyCreateTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateDatabase(final MariaDBParser.CreateDatabaseContext ctx) {
    final var methodName = "enterCreateDatabase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateDatabaseOption(final MariaDBParser.CreateDatabaseOptionContext ctx) {
    final var methodName = "enterCreateDatabaseOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateDefinitions(final MariaDBParser.CreateDefinitionsContext ctx) {
    final var methodName = "enterCreateDefinitions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateEvent(final MariaDBParser.CreateEventContext ctx) {
    final var methodName = "enterCreateEvent";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateFunction(final MariaDBParser.CreateFunctionContext ctx) {
    final var methodName = "enterCreateFunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateIndex(final MariaDBParser.CreateIndexContext ctx) {
    final var methodName = "enterCreateIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateLogfileGroup(final MariaDBParser.CreateLogfileGroupContext ctx) {
    final var methodName = "enterCreateLogfileGroup";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateProcedure(final MariaDBParser.CreateProcedureContext ctx) {
    final var methodName = "enterCreateProcedure";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateRole(final MariaDBParser.CreateRoleContext ctx) {
    final var methodName = "enterCreateRole";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateSequence(final MariaDBParser.CreateSequenceContext ctx) {
    final var methodName = "enterCreateSequence";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateServer(final MariaDBParser.CreateServerContext ctx) {
    final var methodName = "enterCreateServer";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTablespaceInnodb(final MariaDBParser.CreateTablespaceInnodbContext ctx) {
    final var methodName = "enterCreateTablespaceInnodb";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTablespaceNdb(final MariaDBParser.CreateTablespaceNdbContext ctx) {
    final var methodName = "enterCreateTablespaceNdb";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTrigger(final MariaDBParser.CreateTriggerContext ctx) {
    final var methodName = "enterCreateTrigger";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateUdfunction(final MariaDBParser.CreateUdfunctionContext ctx) {
    final var methodName = "enterCreateUdfunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateUserMysqlV56(final MariaDBParser.CreateUserMysqlV56Context ctx) {
    final var methodName = "enterCreateUserMysqlV56";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateUserMysqlV80(final MariaDBParser.CreateUserMysqlV80Context ctx) {
    final var methodName = "enterCreateUserMysqlV80";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateView(final MariaDBParser.CreateViewContext ctx) {
    final var methodName = "enterCreateView";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCteColumnName(final MariaDBParser.CteColumnNameContext ctx) {
    final var methodName = "enterCteColumnName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCteName(final MariaDBParser.CteNameContext ctx) {
    final var methodName = "enterCteName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCurrentSchemaPriviLevel(final MariaDBParser.CurrentSchemaPriviLevelContext ctx) {
    final var methodName = "enterCurrentSchemaPriviLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCurrentTimestamp(final MariaDBParser.CurrentTimestampContext ctx) {
    final var methodName = "enterCurrentTimestamp";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCurrentUserExpression(final MariaDBParser.CurrentUserExpressionContext ctx) {
    final var methodName = "enterCurrentUserExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDataTypeBase(final MariaDBParser.DataTypeBaseContext ctx) {
    final var methodName = "enterDataTypeBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDataTypeFunctionCall(final MariaDBParser.DataTypeFunctionCallContext ctx) {
    final var methodName = "enterDataTypeFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDdlStatement(final MariaDBParser.DdlStatementContext ctx) {
    final var methodName = "enterDdlStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeallocatePrepare(final MariaDBParser.DeallocatePrepareContext ctx) {
    final var methodName = "enterDeallocatePrepare";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecimalLiteral(final MariaDBParser.DecimalLiteralContext ctx) {
    final var methodName = "enterDecimalLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecimalMasterOption(final MariaDBParser.DecimalMasterOptionContext ctx) {
    final var methodName = "enterDecimalMasterOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeclareCondition(final MariaDBParser.DeclareConditionContext ctx) {
    final var methodName = "enterDeclareCondition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeclareCursor(final MariaDBParser.DeclareCursorContext ctx) {
    final var methodName = "enterDeclareCursor";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeclareHandler(final MariaDBParser.DeclareHandlerContext ctx) {
    final var methodName = "enterDeclareHandler";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeclareVariable(final MariaDBParser.DeclareVariableContext ctx) {
    final var methodName = "enterDeclareVariable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefaultAuthConnectionOption(
      final MariaDBParser.DefaultAuthConnectionOptionContext ctx) {
    final var methodName = "enterDefaultAuthConnectionOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefaultColumnConstraint(final MariaDBParser.DefaultColumnConstraintContext ctx) {
    final var methodName = "enterDefaultColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefaultValue(final MariaDBParser.DefaultValueContext ctx) {
    final var methodName = "enterDefaultValue";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefiniteFullTablePrivLevel(
      final MariaDBParser.DefiniteFullTablePrivLevelContext ctx) {
    final var methodName = "enterDefiniteFullTablePrivLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefiniteFullTablePrivLevel2(
      final MariaDBParser.DefiniteFullTablePrivLevel2Context ctx) {
    final var methodName = "enterDefiniteFullTablePrivLevel2";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefiniteSchemaPrivLevel(final MariaDBParser.DefiniteSchemaPrivLevelContext ctx) {
    final var methodName = "enterDefiniteSchemaPrivLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefiniteTablePrivLevel(final MariaDBParser.DefiniteTablePrivLevelContext ctx) {
    final var methodName = "enterDefiniteTablePrivLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeleteStatement(final MariaDBParser.DeleteStatementContext ctx) {
    final var methodName = "enterDeleteStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribeConnection(final MariaDBParser.DescribeConnectionContext ctx) {
    final var methodName = "enterDescribeConnection";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribeStatements(final MariaDBParser.DescribeStatementsContext ctx) {
    final var methodName = "enterDescribeStatements";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDetailRevoke(final MariaDBParser.DetailRevokeContext ctx) {
    final var methodName = "enterDetailRevoke";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDiagnosticsConditionInformationName(
      final MariaDBParser.DiagnosticsConditionInformationNameContext ctx) {
    final var methodName = "enterDiagnosticsConditionInformationName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDiagnosticsStatement(final MariaDBParser.DiagnosticsStatementContext ctx) {
    final var methodName = "enterDiagnosticsStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDimensionDataType(final MariaDBParser.DimensionDataTypeContext ctx) {
    final var methodName = "enterDimensionDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDmlStatement(final MariaDBParser.DmlStatementContext ctx) {
    final var methodName = "enterDmlStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDoDbReplication(final MariaDBParser.DoDbReplicationContext ctx) {
    final var methodName = "enterDoDbReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDoStatement(final MariaDBParser.DoStatementContext ctx) {
    final var methodName = "enterDoStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDoTableReplication(final MariaDBParser.DoTableReplicationContext ctx) {
    final var methodName = "enterDoTableReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDottedId(final MariaDBParser.DottedIdContext ctx) {
    final var methodName = "enterDottedId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropDatabase(final MariaDBParser.DropDatabaseContext ctx) {
    final var methodName = "enterDropDatabase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropEvent(final MariaDBParser.DropEventContext ctx) {
    final var methodName = "enterDropEvent";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropFunction(final MariaDBParser.DropFunctionContext ctx) {
    final var methodName = "enterDropFunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropIndex(final MariaDBParser.DropIndexContext ctx) {
    final var methodName = "enterDropIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropLogfileGroup(final MariaDBParser.DropLogfileGroupContext ctx) {
    final var methodName = "enterDropLogfileGroup";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropProcedure(final MariaDBParser.DropProcedureContext ctx) {
    final var methodName = "enterDropProcedure";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropRole(final MariaDBParser.DropRoleContext ctx) {
    final var methodName = "enterDropRole";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropSequence(final MariaDBParser.DropSequenceContext ctx) {
    final var methodName = "enterDropSequence";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropServer(final MariaDBParser.DropServerContext ctx) {
    final var methodName = "enterDropServer";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropTable(final MariaDBParser.DropTableContext ctx) {
    final var methodName = "enterDropTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropTablespace(final MariaDBParser.DropTablespaceContext ctx) {
    final var methodName = "enterDropTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropTrigger(final MariaDBParser.DropTriggerContext ctx) {
    final var methodName = "enterDropTrigger";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropUser(final MariaDBParser.DropUserContext ctx) {
    final var methodName = "enterDropUser";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropView(final MariaDBParser.DropViewContext ctx) {
    final var methodName = "enterDropView";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterElifAlternative(final MariaDBParser.ElifAlternativeContext ctx) {
    final var methodName = "enterElifAlternative";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEmptyStatement_(final MariaDBParser.EmptyStatement_Context ctx) {
    final var methodName = "enterEmptyStatement_";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnableType(final MariaDBParser.EnableTypeContext ctx) {
    final var methodName = "enterEnableType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEncryptedLiteral(final MariaDBParser.EncryptedLiteralContext ctx) {
    final var methodName = "enterEncryptedLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEngineName(final MariaDBParser.EngineNameContext ctx) {
    final var methodName = "enterEngineName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEngineNameBase(final MariaDBParser.EngineNameBaseContext ctx) {
    final var methodName = "enterEngineNameBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    final var methodName = "enterEveryRule";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecuteStatement(final MariaDBParser.ExecuteStatementContext ctx) {
    final var methodName = "enterExecuteStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExistsExpressionAtom(final MariaDBParser.ExistsExpressionAtomContext ctx) {
    final var methodName = "enterExistsExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExplainForConnection(final MariaDBParser.ExplainForConnectionContext ctx) {
    final var methodName = "enterExplainForConnection";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionAtomPredicate(final MariaDBParser.ExpressionAtomPredicateContext ctx) {
    final var methodName = "enterExpressionAtomPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionOrDefault(final MariaDBParser.ExpressionOrDefaultContext ctx) {
    final var methodName = "enterExpressionOrDefault";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressions(final MariaDBParser.ExpressionsContext ctx) {
    final var methodName = "enterExpressions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionsWithDefaults(final MariaDBParser.ExpressionsWithDefaultsContext ctx) {
    final var methodName = "enterExpressionsWithDefaults";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExtractFunctionCall(final MariaDBParser.ExtractFunctionCallContext ctx) {
    final var methodName = "enterExtractFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFetchCursor(final MariaDBParser.FetchCursorContext ctx) {
    final var methodName = "enterFetchCursor";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFileSizeLiteral(final MariaDBParser.FileSizeLiteralContext ctx) {
    final var methodName = "enterFileSizeLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlushStatement(final MariaDBParser.FlushStatementContext ctx) {
    final var methodName = "enterFlushStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlushTableOption(final MariaDBParser.FlushTableOptionContext ctx) {
    final var methodName = "enterFlushTableOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForeignKeyTableConstraint(
      final MariaDBParser.ForeignKeyTableConstraintContext ctx) {
    final var methodName = "enterForeignKeyTableConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFormatColumnConstraint(final MariaDBParser.FormatColumnConstraintContext ctx) {
    final var methodName = "enterFormatColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFormatJsonStatement(final MariaDBParser.FormatJsonStatementContext ctx) {
    final var methodName = "enterFormatJsonStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrameBetween(final MariaDBParser.FrameBetweenContext ctx) {
    final var methodName = "enterFrameBetween";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrameClause(final MariaDBParser.FrameClauseContext ctx) {
    final var methodName = "enterFrameClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrameExtent(final MariaDBParser.FrameExtentContext ctx) {
    final var methodName = "enterFrameExtent";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrameRange(final MariaDBParser.FrameRangeContext ctx) {
    final var methodName = "enterFrameRange";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrameUnits(final MariaDBParser.FrameUnitsContext ctx) {
    final var methodName = "enterFrameUnits";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFromClause(final MariaDBParser.FromClauseContext ctx) {
    final var methodName = "enterFromClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFullColumnName(final MariaDBParser.FullColumnNameContext ctx) {
    final var methodName = "enterFullColumnName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFullColumnNameExpressionAtom(
      final MariaDBParser.FullColumnNameExpressionAtomContext ctx) {
    final var methodName = "enterFullColumnNameExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFullDescribeStatement(final MariaDBParser.FullDescribeStatementContext ctx) {
    final var methodName = "enterFullDescribeStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFullId(final MariaDBParser.FullIdContext ctx) {
    final var methodName = "enterFullId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionArg(final MariaDBParser.FunctionArgContext ctx) {
    final var methodName = "enterFunctionArg";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionArgs(final MariaDBParser.FunctionArgsContext ctx) {
    final var methodName = "enterFunctionArgs";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionCallExpressionAtom(
      final MariaDBParser.FunctionCallExpressionAtomContext ctx) {
    final var methodName = "enterFunctionCallExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionNameBase(final MariaDBParser.FunctionNameBaseContext ctx) {
    final var methodName = "enterFunctionNameBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionParameter(final MariaDBParser.FunctionParameterContext ctx) {
    final var methodName = "enterFunctionParameter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneratedColumnConstraint(
      final MariaDBParser.GeneratedColumnConstraintContext ctx) {
    final var methodName = "enterGeneratedColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGetFormatFunctionCall(final MariaDBParser.GetFormatFunctionCallContext ctx) {
    final var methodName = "enterGetFormatFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGlobalPrivLevel(final MariaDBParser.GlobalPrivLevelContext ctx) {
    final var methodName = "enterGlobalPrivLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantProxy(final MariaDBParser.GrantProxyContext ctx) {
    final var methodName = "enterGrantProxy";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantStatement(final MariaDBParser.GrantStatementContext ctx) {
    final var methodName = "enterGrantStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupByClause(final MariaDBParser.GroupByClauseContext ctx) {
    final var methodName = "enterGroupByClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupByItem(final MariaDBParser.GroupByItemContext ctx) {
    final var methodName = "enterGroupByItem";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGtidsUntilOption(final MariaDBParser.GtidsUntilOptionContext ctx) {
    final var methodName = "enterGtidsUntilOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGtuidSet(final MariaDBParser.GtuidSetContext ctx) {
    final var methodName = "enterGtuidSet";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerCloseStatement(final MariaDBParser.HandlerCloseStatementContext ctx) {
    final var methodName = "enterHandlerCloseStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionCode(final MariaDBParser.HandlerConditionCodeContext ctx) {
    final var methodName = "enterHandlerConditionCode";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionException(
      final MariaDBParser.HandlerConditionExceptionContext ctx) {
    final var methodName = "enterHandlerConditionException";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionName(final MariaDBParser.HandlerConditionNameContext ctx) {
    final var methodName = "enterHandlerConditionName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionNotfound(
      final MariaDBParser.HandlerConditionNotfoundContext ctx) {
    final var methodName = "enterHandlerConditionNotfound";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionState(final MariaDBParser.HandlerConditionStateContext ctx) {
    final var methodName = "enterHandlerConditionState";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionWarning(final MariaDBParser.HandlerConditionWarningContext ctx) {
    final var methodName = "enterHandlerConditionWarning";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerOpenStatement(final MariaDBParser.HandlerOpenStatementContext ctx) {
    final var methodName = "enterHandlerOpenStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerReadIndexStatement(
      final MariaDBParser.HandlerReadIndexStatementContext ctx) {
    final var methodName = "enterHandlerReadIndexStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerReadStatement(final MariaDBParser.HandlerReadStatementContext ctx) {
    final var methodName = "enterHandlerReadStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerStatement(final MariaDBParser.HandlerStatementContext ctx) {
    final var methodName = "enterHandlerStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHashAuthOption(final MariaDBParser.HashAuthOptionContext ctx) {
    final var methodName = "enterHashAuthOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHavingClause(final MariaDBParser.HavingClauseContext ctx) {
    final var methodName = "enterHavingClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHelpStatement(final MariaDBParser.HelpStatementContext ctx) {
    final var methodName = "enterHelpStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHexadecimalLiteral(final MariaDBParser.HexadecimalLiteralContext ctx) {
    final var methodName = "enterHexadecimalLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHostName(final MariaDBParser.HostNameContext ctx) {
    final var methodName = "enterHostName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIfExists(final MariaDBParser.IfExistsContext ctx) {
    final var methodName = "enterIfExists";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIfNotExists(final MariaDBParser.IfNotExistsContext ctx) {
    final var methodName = "enterIfNotExists";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIfStatement(final MariaDBParser.IfStatementContext ctx) {
    final var methodName = "enterIfStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIgnoreDbReplication(final MariaDBParser.IgnoreDbReplicationContext ctx) {
    final var methodName = "enterIgnoreDbReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIgnoreTableReplication(final MariaDBParser.IgnoreTableReplicationContext ctx) {
    final var methodName = "enterIgnoreTableReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexColumnName(final MariaDBParser.IndexColumnNameContext ctx) {
    final var methodName = "enterIndexColumnName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexColumnNames(final MariaDBParser.IndexColumnNamesContext ctx) {
    final var methodName = "enterIndexColumnNames";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexDeclaration(final MariaDBParser.IndexDeclarationContext ctx) {
    final var methodName = "enterIndexDeclaration";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexHint(final MariaDBParser.IndexHintContext ctx) {
    final var methodName = "enterIndexHint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexHintType(final MariaDBParser.IndexHintTypeContext ctx) {
    final var methodName = "enterIndexHintType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexOption(final MariaDBParser.IndexOptionContext ctx) {
    final var methodName = "enterIndexOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexType(final MariaDBParser.IndexTypeContext ctx) {
    final var methodName = "enterIndexType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInnerJoin(final MariaDBParser.InnerJoinContext ctx) {
    final var methodName = "enterInnerJoin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInPredicate(final MariaDBParser.InPredicateContext ctx) {
    final var methodName = "enterInPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsertStatement(final MariaDBParser.InsertStatementContext ctx) {
    final var methodName = "enterInsertStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsertStatementValue(final MariaDBParser.InsertStatementValueContext ctx) {
    final var methodName = "enterInsertStatementValue";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInstallPlugin(final MariaDBParser.InstallPluginContext ctx) {
    final var methodName = "enterInstallPlugin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalExpr(final MariaDBParser.IntervalExprContext ctx) {
    final var methodName = "enterIntervalExpr";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalExpressionAtom(final MariaDBParser.IntervalExpressionAtomContext ctx) {
    final var methodName = "enterIntervalExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalSchedule(final MariaDBParser.IntervalScheduleContext ctx) {
    final var methodName = "enterIntervalSchedule";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalType(final MariaDBParser.IntervalTypeContext ctx) {
    final var methodName = "enterIntervalType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalTypeBase(final MariaDBParser.IntervalTypeBaseContext ctx) {
    final var methodName = "enterIntervalTypeBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInvisibilityColumnConstraint(
      final MariaDBParser.InvisibilityColumnConstraintContext ctx) {
    final var methodName = "enterInvisibilityColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIsExpression(final MariaDBParser.IsExpressionContext ctx) {
    final var methodName = "enterIsExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIsNullPredicate(final MariaDBParser.IsNullPredicateContext ctx) {
    final var methodName = "enterIsNullPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIterateStatement(final MariaDBParser.IterateStatementContext ctx) {
    final var methodName = "enterIterateStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonColumn(final MariaDBParser.JsonColumnContext ctx) {
    final var methodName = "enterJsonColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonColumnList(final MariaDBParser.JsonColumnListContext ctx) {
    final var methodName = "enterJsonColumnList";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonExpressionAtom(final MariaDBParser.JsonExpressionAtomContext ctx) {
    final var methodName = "enterJsonExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonMemberOfPredicate(final MariaDBParser.JsonMemberOfPredicateContext ctx) {
    final var methodName = "enterJsonMemberOfPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonOnEmpty(final MariaDBParser.JsonOnEmptyContext ctx) {
    final var methodName = "enterJsonOnEmpty";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonOnError(final MariaDBParser.JsonOnErrorContext ctx) {
    final var methodName = "enterJsonOnError";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonOperator(final MariaDBParser.JsonOperatorContext ctx) {
    final var methodName = "enterJsonOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonTable(final MariaDBParser.JsonTableContext ctx) {
    final var methodName = "enterJsonTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonValueFunctionCall(final MariaDBParser.JsonValueFunctionCallContext ctx) {
    final var methodName = "enterJsonValueFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKeywordsCanBeId(final MariaDBParser.KeywordsCanBeIdContext ctx) {
    final var methodName = "enterKeywordsCanBeId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKillStatement(final MariaDBParser.KillStatementContext ctx) {
    final var methodName = "enterKillStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLateralStatement(final MariaDBParser.LateralStatementContext ctx) {
    final var methodName = "enterLateralStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLeaveStatement(final MariaDBParser.LeaveStatementContext ctx) {
    final var methodName = "enterLeaveStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLengthOneDimension(final MariaDBParser.LengthOneDimensionContext ctx) {
    final var methodName = "enterLengthOneDimension";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLengthTwoDimension(final MariaDBParser.LengthTwoDimensionContext ctx) {
    final var methodName = "enterLengthTwoDimension";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLengthTwoOptionalDimension(
      final MariaDBParser.LengthTwoOptionalDimensionContext ctx) {
    final var methodName = "enterLengthTwoOptionalDimension";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevelInWeightListElement(
      final MariaDBParser.LevelInWeightListElementContext ctx) {
    final var methodName = "enterLevelInWeightListElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevelWeightList(final MariaDBParser.LevelWeightListContext ctx) {
    final var methodName = "enterLevelWeightList";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevelWeightRange(final MariaDBParser.LevelWeightRangeContext ctx) {
    final var methodName = "enterLevelWeightRange";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLikePredicate(final MariaDBParser.LikePredicateContext ctx) {
    final var methodName = "enterLikePredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLimitClause(final MariaDBParser.LimitClauseContext ctx) {
    final var methodName = "enterLimitClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLimitClauseAtom(final MariaDBParser.LimitClauseAtomContext ctx) {
    final var methodName = "enterLimitClauseAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoadDataStatement(final MariaDBParser.LoadDataStatementContext ctx) {
    final var methodName = "enterLoadDataStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoadedTableIndexes(final MariaDBParser.LoadedTableIndexesContext ctx) {
    final var methodName = "enterLoadedTableIndexes";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoadIndexIntoCache(final MariaDBParser.LoadIndexIntoCacheContext ctx) {
    final var methodName = "enterLoadIndexIntoCache";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoadXmlStatement(final MariaDBParser.LoadXmlStatementContext ctx) {
    final var methodName = "enterLoadXmlStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockAction(final MariaDBParser.LockActionContext ctx) {
    final var methodName = "enterLockAction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockClause(final MariaDBParser.LockClauseContext ctx) {
    final var methodName = "enterLockClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockOption(final MariaDBParser.LockOptionContext ctx) {
    final var methodName = "enterLockOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockTableElement(final MariaDBParser.LockTableElementContext ctx) {
    final var methodName = "enterLockTableElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockTables(final MariaDBParser.LockTablesContext ctx) {
    final var methodName = "enterLockTables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLogicalExpression(final MariaDBParser.LogicalExpressionContext ctx) {
    final var methodName = "enterLogicalExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLogicalOperator(final MariaDBParser.LogicalOperatorContext ctx) {
    final var methodName = "enterLogicalOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLongVarbinaryDataType(final MariaDBParser.LongVarbinaryDataTypeContext ctx) {
    final var methodName = "enterLongVarbinaryDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLongVarcharDataType(final MariaDBParser.LongVarcharDataTypeContext ctx) {
    final var methodName = "enterLongVarcharDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoopStatement(final MariaDBParser.LoopStatementContext ctx) {
    final var methodName = "enterLoopStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterBoolOption(final MariaDBParser.MasterBoolOptionContext ctx) {
    final var methodName = "enterMasterBoolOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterDecimalOption(final MariaDBParser.MasterDecimalOptionContext ctx) {
    final var methodName = "enterMasterDecimalOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterLogUntilOption(final MariaDBParser.MasterLogUntilOptionContext ctx) {
    final var methodName = "enterMasterLogUntilOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterRealOption(final MariaDBParser.MasterRealOptionContext ctx) {
    final var methodName = "enterMasterRealOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterStringOption(final MariaDBParser.MasterStringOptionContext ctx) {
    final var methodName = "enterMasterStringOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterUidListOption(final MariaDBParser.MasterUidListOptionContext ctx) {
    final var methodName = "enterMasterUidListOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMathExpressionAtom(final MariaDBParser.MathExpressionAtomContext ctx) {
    final var methodName = "enterMathExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMathOperator(final MariaDBParser.MathOperatorContext ctx) {
    final var methodName = "enterMathOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModule(final MariaDBParser.ModuleContext ctx) {
    final var methodName = "enterModule";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModuleAuthOption(final MariaDBParser.ModuleAuthOptionContext ctx) {
    final var methodName = "enterModuleAuthOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMultipleDeleteStatement(final MariaDBParser.MultipleDeleteStatementContext ctx) {
    final var methodName = "enterMultipleDeleteStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMultipleUpdateStatement(final MariaDBParser.MultipleUpdateStatementContext ctx) {
    final var methodName = "enterMultipleUpdateStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMysqlVariable(final MariaDBParser.MysqlVariableContext ctx) {
    final var methodName = "enterMysqlVariable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMysqlVariableExpressionAtom(
      final MariaDBParser.MysqlVariableExpressionAtomContext ctx) {
    final var methodName = "enterMysqlVariableExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNationalStringDataType(final MariaDBParser.NationalStringDataTypeContext ctx) {
    final var methodName = "enterNationalStringDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNationalVaryingStringDataType(
      final MariaDBParser.NationalVaryingStringDataTypeContext ctx) {
    final var methodName = "enterNationalVaryingStringDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNaturalJoin(final MariaDBParser.NaturalJoinContext ctx) {
    final var methodName = "enterNaturalJoin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNestedExpressionAtom(final MariaDBParser.NestedExpressionAtomContext ctx) {
    final var methodName = "enterNestedExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNestedRowExpressionAtom(final MariaDBParser.NestedRowExpressionAtomContext ctx) {
    final var methodName = "enterNestedRowExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNonAggregateFunctionCall(
      final MariaDBParser.NonAggregateFunctionCallContext ctx) {
    final var methodName = "enterNonAggregateFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNonAggregateWindowedFunction(
      final MariaDBParser.NonAggregateWindowedFunctionContext ctx) {
    final var methodName = "enterNonAggregateWindowedFunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNotExpression(final MariaDBParser.NotExpressionContext ctx) {
    final var methodName = "enterNotExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNullColumnConstraint(final MariaDBParser.NullColumnConstraintContext ctx) {
    final var methodName = "enterNullColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNullNotnull(final MariaDBParser.NullNotnullContext ctx) {
    final var methodName = "enterNullNotnull";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpenCursor(final MariaDBParser.OpenCursorContext ctx) {
    final var methodName = "enterOpenCursor";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptimizeTable(final MariaDBParser.OptimizeTableContext ctx) {
    final var methodName = "enterOptimizeTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrderByClause(final MariaDBParser.OrderByClauseContext ctx) {
    final var methodName = "enterOrderByClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrderByExpression(final MariaDBParser.OrderByExpressionContext ctx) {
    final var methodName = "enterOrderByExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrReplace(final MariaDBParser.OrReplaceContext ctx) {
    final var methodName = "enterOrReplace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOuterJoin(final MariaDBParser.OuterJoinContext ctx) {
    final var methodName = "enterOuterJoin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOverClause(final MariaDBParser.OverClauseContext ctx) {
    final var methodName = "enterOverClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOwnerStatement(final MariaDBParser.OwnerStatementContext ctx) {
    final var methodName = "enterOwnerStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParenthesisSelect(final MariaDBParser.ParenthesisSelectContext ctx) {
    final var methodName = "enterParenthesisSelect";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionClause(final MariaDBParser.PartitionClauseContext ctx) {
    final var methodName = "enterPartitionClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionComparison(final MariaDBParser.PartitionComparisonContext ctx) {
    final var methodName = "enterPartitionComparison";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionDefinerAtom(final MariaDBParser.PartitionDefinerAtomContext ctx) {
    final var methodName = "enterPartitionDefinerAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionDefinerVector(final MariaDBParser.PartitionDefinerVectorContext ctx) {
    final var methodName = "enterPartitionDefinerVector";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionDefinitions(final MariaDBParser.PartitionDefinitionsContext ctx) {
    final var methodName = "enterPartitionDefinitions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionFunctionHash(final MariaDBParser.PartitionFunctionHashContext ctx) {
    final var methodName = "enterPartitionFunctionHash";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionFunctionKey(final MariaDBParser.PartitionFunctionKeyContext ctx) {
    final var methodName = "enterPartitionFunctionKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionFunctionList(final MariaDBParser.PartitionFunctionListContext ctx) {
    final var methodName = "enterPartitionFunctionList";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionFunctionRange(final MariaDBParser.PartitionFunctionRangeContext ctx) {
    final var methodName = "enterPartitionFunctionRange";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionListAtom(final MariaDBParser.PartitionListAtomContext ctx) {
    final var methodName = "enterPartitionListAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionListVector(final MariaDBParser.PartitionListVectorContext ctx) {
    final var methodName = "enterPartitionListVector";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionComment(final MariaDBParser.PartitionOptionCommentContext ctx) {
    final var methodName = "enterPartitionOptionComment";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionDataDirectory(
      final MariaDBParser.PartitionOptionDataDirectoryContext ctx) {
    final var methodName = "enterPartitionOptionDataDirectory";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionEngine(final MariaDBParser.PartitionOptionEngineContext ctx) {
    final var methodName = "enterPartitionOptionEngine";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionIndexDirectory(
      final MariaDBParser.PartitionOptionIndexDirectoryContext ctx) {
    final var methodName = "enterPartitionOptionIndexDirectory";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionMaxRows(final MariaDBParser.PartitionOptionMaxRowsContext ctx) {
    final var methodName = "enterPartitionOptionMaxRows";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionMinRows(final MariaDBParser.PartitionOptionMinRowsContext ctx) {
    final var methodName = "enterPartitionOptionMinRows";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionNodeGroup(
      final MariaDBParser.PartitionOptionNodeGroupContext ctx) {
    final var methodName = "enterPartitionOptionNodeGroup";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionTablespace(
      final MariaDBParser.PartitionOptionTablespaceContext ctx) {
    final var methodName = "enterPartitionOptionTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionSimple(final MariaDBParser.PartitionSimpleContext ctx) {
    final var methodName = "enterPartitionSimple";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPasswordConnectionOption(
      final MariaDBParser.PasswordConnectionOptionContext ctx) {
    final var methodName = "enterPasswordConnectionOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPasswordFunctionCall(final MariaDBParser.PasswordFunctionCallContext ctx) {
    final var methodName = "enterPasswordFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPasswordFunctionClause(final MariaDBParser.PasswordFunctionClauseContext ctx) {
    final var methodName = "enterPasswordFunctionClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPasswordModuleOption(final MariaDBParser.PasswordModuleOptionContext ctx) {
    final var methodName = "enterPasswordModuleOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPluginDirConnectionOption(
      final MariaDBParser.PluginDirConnectionOptionContext ctx) {
    final var methodName = "enterPluginDirConnectionOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPositionFunctionCall(final MariaDBParser.PositionFunctionCallContext ctx) {
    final var methodName = "enterPositionFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPreciseSchedule(final MariaDBParser.PreciseScheduleContext ctx) {
    final var methodName = "enterPreciseSchedule";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPredicateExpression(final MariaDBParser.PredicateExpressionContext ctx) {
    final var methodName = "enterPredicateExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPreparedStatement(final MariaDBParser.PreparedStatementContext ctx) {
    final var methodName = "enterPreparedStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrepareStatement(final MariaDBParser.PrepareStatementContext ctx) {
    final var methodName = "enterPrepareStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimaryKeyColumnConstraint(
      final MariaDBParser.PrimaryKeyColumnConstraintContext ctx) {
    final var methodName = "enterPrimaryKeyColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimaryKeyTableConstraint(
      final MariaDBParser.PrimaryKeyTableConstraintContext ctx) {
    final var methodName = "enterPrimaryKeyTableConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivelegeClause(final MariaDBParser.PrivelegeClauseContext ctx) {
    final var methodName = "enterPrivelegeClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilege(final MariaDBParser.PrivilegeContext ctx) {
    final var methodName = "enterPrivilege";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilegesBase(final MariaDBParser.PrivilegesBaseContext ctx) {
    final var methodName = "enterPrivilegesBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProcedureParameter(final MariaDBParser.ProcedureParameterContext ctx) {
    final var methodName = "enterProcedureParameter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProcedureSqlStatement(final MariaDBParser.ProcedureSqlStatementContext ctx) {
    final var methodName = "enterProcedureSqlStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPurgeBinaryLogs(final MariaDBParser.PurgeBinaryLogsContext ctx) {
    final var methodName = "enterPurgeBinaryLogs";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQueryCreateTable(final MariaDBParser.QueryCreateTableContext ctx) {
    final var methodName = "enterQueryCreateTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQueryExpression(final MariaDBParser.QueryExpressionContext ctx) {
    final var methodName = "enterQueryExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQueryExpressionNointo(final MariaDBParser.QueryExpressionNointoContext ctx) {
    final var methodName = "enterQueryExpressionNointo";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuerySpecification(final MariaDBParser.QuerySpecificationContext ctx) {
    final var methodName = "enterQuerySpecification";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuerySpecificationNointo(
      final MariaDBParser.QuerySpecificationNointoContext ctx) {
    final var methodName = "enterQuerySpecificationNointo";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReferenceAction(final MariaDBParser.ReferenceActionContext ctx) {
    final var methodName = "enterReferenceAction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReferenceColumnConstraint(
      final MariaDBParser.ReferenceColumnConstraintContext ctx) {
    final var methodName = "enterReferenceColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReferenceControlType(final MariaDBParser.ReferenceControlTypeContext ctx) {
    final var methodName = "enterReferenceControlType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReferenceDefinition(final MariaDBParser.ReferenceDefinitionContext ctx) {
    final var methodName = "enterReferenceDefinition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRegexpPredicate(final MariaDBParser.RegexpPredicateContext ctx) {
    final var methodName = "enterRegexpPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelayLogUntilOption(final MariaDBParser.RelayLogUntilOptionContext ctx) {
    final var methodName = "enterRelayLogUntilOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReleaseStatement(final MariaDBParser.ReleaseStatementContext ctx) {
    final var methodName = "enterReleaseStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRenameTable(final MariaDBParser.RenameTableContext ctx) {
    final var methodName = "enterRenameTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRenameTableClause(final MariaDBParser.RenameTableClauseContext ctx) {
    final var methodName = "enterRenameTableClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRenameUser(final MariaDBParser.RenameUserContext ctx) {
    final var methodName = "enterRenameUser";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRenameUserClause(final MariaDBParser.RenameUserClauseContext ctx) {
    final var methodName = "enterRenameUserClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRepairTable(final MariaDBParser.RepairTableContext ctx) {
    final var methodName = "enterRepairTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRepeatStatement(final MariaDBParser.RepeatStatementContext ctx) {
    final var methodName = "enterRepeatStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplaceStatement(final MariaDBParser.ReplaceStatementContext ctx) {
    final var methodName = "enterReplaceStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplicationStatement(final MariaDBParser.ReplicationStatementContext ctx) {
    final var methodName = "enterReplicationStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResetMaster(final MariaDBParser.ResetMasterContext ctx) {
    final var methodName = "enterResetMaster";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResetSlave(final MariaDBParser.ResetSlaveContext ctx) {
    final var methodName = "enterResetSlave";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResetStatement(final MariaDBParser.ResetStatementContext ctx) {
    final var methodName = "enterResetStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResignalStatement(final MariaDBParser.ResignalStatementContext ctx) {
    final var methodName = "enterResignalStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReturnStatement(final MariaDBParser.ReturnStatementContext ctx) {
    final var methodName = "enterReturnStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevokeProxy(final MariaDBParser.RevokeProxyContext ctx) {
    final var methodName = "enterRevokeProxy";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRewriteDbReplication(final MariaDBParser.RewriteDbReplicationContext ctx) {
    final var methodName = "enterRewriteDbReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoleName(final MariaDBParser.RoleNameContext ctx) {
    final var methodName = "enterRoleName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoleOption(final MariaDBParser.RoleOptionContext ctx) {
    final var methodName = "enterRoleOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoleRevoke(final MariaDBParser.RoleRevokeContext ctx) {
    final var methodName = "enterRoleRevoke";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollbackStatement(final MariaDBParser.RollbackStatementContext ctx) {
    final var methodName = "enterRollbackStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollbackWork(final MariaDBParser.RollbackWorkContext ctx) {
    final var methodName = "enterRollbackWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoot(final MariaDBParser.RootContext ctx) {
    final var methodName = "enterRoot";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineBehavior(final MariaDBParser.RoutineBehaviorContext ctx) {
    final var methodName = "enterRoutineBehavior";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineBody(final MariaDBParser.RoutineBodyContext ctx) {
    final var methodName = "enterRoutineBody";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineComment(final MariaDBParser.RoutineCommentContext ctx) {
    final var methodName = "enterRoutineComment";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineData(final MariaDBParser.RoutineDataContext ctx) {
    final var methodName = "enterRoutineData";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineLanguage(final MariaDBParser.RoutineLanguageContext ctx) {
    final var methodName = "enterRoutineLanguage";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineSecurity(final MariaDBParser.RoutineSecurityContext ctx) {
    final var methodName = "enterRoutineSecurity";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSavepointStatement(final MariaDBParser.SavepointStatementContext ctx) {
    final var methodName = "enterSavepointStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterScalarFunctionCall(final MariaDBParser.ScalarFunctionCallContext ctx) {
    final var methodName = "enterScalarFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterScalarFunctionName(final MariaDBParser.ScalarFunctionNameContext ctx) {
    final var methodName = "enterScalarFunctionName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectColumnElement(final MariaDBParser.SelectColumnElementContext ctx) {
    final var methodName = "enterSelectColumnElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectElements(final MariaDBParser.SelectElementsContext ctx) {
    final var methodName = "enterSelectElements";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectExpressionElement(final MariaDBParser.SelectExpressionElementContext ctx) {
    final var methodName = "enterSelectExpressionElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectFieldsInto(final MariaDBParser.SelectFieldsIntoContext ctx) {
    final var methodName = "enterSelectFieldsInto";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectFunctionElement(final MariaDBParser.SelectFunctionElementContext ctx) {
    final var methodName = "enterSelectFunctionElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectIntoDumpFile(final MariaDBParser.SelectIntoDumpFileContext ctx) {
    final var methodName = "enterSelectIntoDumpFile";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectIntoTextFile(final MariaDBParser.SelectIntoTextFileContext ctx) {
    final var methodName = "enterSelectIntoTextFile";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectIntoVariables(final MariaDBParser.SelectIntoVariablesContext ctx) {
    final var methodName = "enterSelectIntoVariables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectLinesInto(final MariaDBParser.SelectLinesIntoContext ctx) {
    final var methodName = "enterSelectLinesInto";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectSpec(final MariaDBParser.SelectSpecContext ctx) {
    final var methodName = "enterSelectSpec";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectStarElement(final MariaDBParser.SelectStarElementContext ctx) {
    final var methodName = "enterSelectStarElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSequenceSpec(final MariaDBParser.SequenceSpecContext ctx) {
    final var methodName = "enterSequenceSpec";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSerialDefaultColumnConstraint(
      final MariaDBParser.SerialDefaultColumnConstraintContext ctx) {
    final var methodName = "enterSerialDefaultColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterServerOption(final MariaDBParser.ServerOptionContext ctx) {
    final var methodName = "enterServerOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetAutocommit(final MariaDBParser.SetAutocommitContext ctx) {
    final var methodName = "enterSetAutocommit";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetAutocommitStatement(final MariaDBParser.SetAutocommitStatementContext ctx) {
    final var methodName = "enterSetAutocommitStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetCharset(final MariaDBParser.SetCharsetContext ctx) {
    final var methodName = "enterSetCharset";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetNames(final MariaDBParser.SetNamesContext ctx) {
    final var methodName = "enterSetNames";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetNewValueInsideTrigger(
      final MariaDBParser.SetNewValueInsideTriggerContext ctx) {
    final var methodName = "enterSetNewValueInsideTrigger";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetPassword(final MariaDBParser.SetPasswordContext ctx) {
    final var methodName = "enterSetPassword";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetPasswordStatement(final MariaDBParser.SetPasswordStatementContext ctx) {
    final var methodName = "enterSetPasswordStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetRole(final MariaDBParser.SetRoleContext ctx) {
    final var methodName = "enterSetRole";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetStatementFor(final MariaDBParser.SetStatementForContext ctx) {
    final var methodName = "enterSetStatementFor";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetTransaction(final MariaDBParser.SetTransactionContext ctx) {
    final var methodName = "enterSetTransaction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetTransactionStatement(final MariaDBParser.SetTransactionStatementContext ctx) {
    final var methodName = "enterSetTransactionStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetVariable(final MariaDBParser.SetVariableContext ctx) {
    final var methodName = "enterSetVariable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShortRevoke(final MariaDBParser.ShortRevokeContext ctx) {
    final var methodName = "enterShortRevoke";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowBinLogEvents(final MariaDBParser.ShowBinLogEventsContext ctx) {
    final var methodName = "enterShowBinLogEvents";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowColumns(final MariaDBParser.ShowColumnsContext ctx) {
    final var methodName = "enterShowColumns";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCommonEntity(final MariaDBParser.ShowCommonEntityContext ctx) {
    final var methodName = "enterShowCommonEntity";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCountErrors(final MariaDBParser.ShowCountErrorsContext ctx) {
    final var methodName = "enterShowCountErrors";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCreateDb(final MariaDBParser.ShowCreateDbContext ctx) {
    final var methodName = "enterShowCreateDb";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCreateFullIdObject(final MariaDBParser.ShowCreateFullIdObjectContext ctx) {
    final var methodName = "enterShowCreateFullIdObject";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCreatePackage(final MariaDBParser.ShowCreatePackageContext ctx) {
    final var methodName = "enterShowCreatePackage";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCreateUser(final MariaDBParser.ShowCreateUserContext ctx) {
    final var methodName = "enterShowCreateUser";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowEngine(final MariaDBParser.ShowEngineContext ctx) {
    final var methodName = "enterShowEngine";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowErrors(final MariaDBParser.ShowErrorsContext ctx) {
    final var methodName = "enterShowErrors";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowExplain(final MariaDBParser.ShowExplainContext ctx) {
    final var methodName = "enterShowExplain";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowFilter(final MariaDBParser.ShowFilterContext ctx) {
    final var methodName = "enterShowFilter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowGlobalInfo(final MariaDBParser.ShowGlobalInfoContext ctx) {
    final var methodName = "enterShowGlobalInfo";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowGlobalInfoClause(final MariaDBParser.ShowGlobalInfoClauseContext ctx) {
    final var methodName = "enterShowGlobalInfoClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowGrants(final MariaDBParser.ShowGrantsContext ctx) {
    final var methodName = "enterShowGrants";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowIndexes(final MariaDBParser.ShowIndexesContext ctx) {
    final var methodName = "enterShowIndexes";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowInnoDBStatus(final MariaDBParser.ShowInnoDBStatusContext ctx) {
    final var methodName = "enterShowInnoDBStatus";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowMasterLogs(final MariaDBParser.ShowMasterLogsContext ctx) {
    final var methodName = "enterShowMasterLogs";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowObjectFilter(final MariaDBParser.ShowObjectFilterContext ctx) {
    final var methodName = "enterShowObjectFilter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowOpenTables(final MariaDBParser.ShowOpenTablesContext ctx) {
    final var methodName = "enterShowOpenTables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowPackageStatus(final MariaDBParser.ShowPackageStatusContext ctx) {
    final var methodName = "enterShowPackageStatus";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowProfile(final MariaDBParser.ShowProfileContext ctx) {
    final var methodName = "enterShowProfile";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowProfileType(final MariaDBParser.ShowProfileTypeContext ctx) {
    final var methodName = "enterShowProfileType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowRelayLogEvents(final MariaDBParser.ShowRelayLogEventsContext ctx) {
    final var methodName = "enterShowRelayLogEvents";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowRoutine(final MariaDBParser.ShowRoutineContext ctx) {
    final var methodName = "enterShowRoutine";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowSchemaEntity(final MariaDBParser.ShowSchemaEntityContext ctx) {
    final var methodName = "enterShowSchemaEntity";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowSchemaFilter(final MariaDBParser.ShowSchemaFilterContext ctx) {
    final var methodName = "enterShowSchemaFilter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowSlaveStatus(final MariaDBParser.ShowSlaveStatusContext ctx) {
    final var methodName = "enterShowSlaveStatus";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowUserstatPlugin(final MariaDBParser.ShowUserstatPluginContext ctx) {
    final var methodName = "enterShowUserstatPlugin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShutdownStatement(final MariaDBParser.ShutdownStatementContext ctx) {
    final var methodName = "enterShutdownStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSignalConditionInformation(
      final MariaDBParser.SignalConditionInformationContext ctx) {
    final var methodName = "enterSignalConditionInformation";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSignalStatement(final MariaDBParser.SignalStatementContext ctx) {
    final var methodName = "enterSignalStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleAuthOption(final MariaDBParser.SimpleAuthOptionContext ctx) {
    final var methodName = "enterSimpleAuthOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleDataType(final MariaDBParser.SimpleDataTypeContext ctx) {
    final var methodName = "enterSimpleDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleDescribeStatement(final MariaDBParser.SimpleDescribeStatementContext ctx) {
    final var methodName = "enterSimpleDescribeStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleFlushOption(final MariaDBParser.SimpleFlushOptionContext ctx) {
    final var methodName = "enterSimpleFlushOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleFunctionCall(final MariaDBParser.SimpleFunctionCallContext ctx) {
    final var methodName = "enterSimpleFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleId(final MariaDBParser.SimpleIdContext ctx) {
    final var methodName = "enterSimpleId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleIndexDeclaration(final MariaDBParser.SimpleIndexDeclarationContext ctx) {
    final var methodName = "enterSimpleIndexDeclaration";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleSelect(final MariaDBParser.SimpleSelectContext ctx) {
    final var methodName = "enterSimpleSelect";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleStrings(final MariaDBParser.SimpleStringsContext ctx) {
    final var methodName = "enterSimpleStrings";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleUserName(final MariaDBParser.SimpleUserNameContext ctx) {
    final var methodName = "enterSimpleUserName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSingleDeleteStatement(final MariaDBParser.SingleDeleteStatementContext ctx) {
    final var methodName = "enterSingleDeleteStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSingleUpdateStatement(final MariaDBParser.SingleUpdateStatementContext ctx) {
    final var methodName = "enterSingleUpdateStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSoundsLikePredicate(final MariaDBParser.SoundsLikePredicateContext ctx) {
    final var methodName = "enterSoundsLikePredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSpatialDataType(final MariaDBParser.SpatialDataTypeContext ctx) {
    final var methodName = "enterSpatialDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSpecialIndexDeclaration(final MariaDBParser.SpecialIndexDeclarationContext ctx) {
    final var methodName = "enterSpecialIndexDeclaration";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSpecificFunctionCall(final MariaDBParser.SpecificFunctionCallContext ctx) {
    final var methodName = "enterSpecificFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSqlGapsUntilOption(final MariaDBParser.SqlGapsUntilOptionContext ctx) {
    final var methodName = "enterSqlGapsUntilOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSqlStatement(final MariaDBParser.SqlStatementContext ctx) {
    final var methodName = "enterSqlStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSqlStatements(final MariaDBParser.SqlStatementsContext ctx) {
    final var methodName = "enterSqlStatements";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStartGroupReplication(final MariaDBParser.StartGroupReplicationContext ctx) {
    final var methodName = "enterStartGroupReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStartSlave(final MariaDBParser.StartSlaveContext ctx) {
    final var methodName = "enterStartSlave";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStartTransaction(final MariaDBParser.StartTransactionContext ctx) {
    final var methodName = "enterStartTransaction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStopGroupReplication(final MariaDBParser.StopGroupReplicationContext ctx) {
    final var methodName = "enterStopGroupReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStopSlave(final MariaDBParser.StopSlaveContext ctx) {
    final var methodName = "enterStopSlave";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStorageColumnConstraint(final MariaDBParser.StorageColumnConstraintContext ctx) {
    final var methodName = "enterStorageColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStraightJoin(final MariaDBParser.StraightJoinContext ctx) {
    final var methodName = "enterStraightJoin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStringAuthOption(final MariaDBParser.StringAuthOptionContext ctx) {
    final var methodName = "enterStringAuthOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStringDataType(final MariaDBParser.StringDataTypeContext ctx) {
    final var methodName = "enterStringDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStringLiteral(final MariaDBParser.StringLiteralContext ctx) {
    final var methodName = "enterStringLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStringMasterOption(final MariaDBParser.StringMasterOptionContext ctx) {
    final var methodName = "enterStringMasterOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubpartitionDefinition(final MariaDBParser.SubpartitionDefinitionContext ctx) {
    final var methodName = "enterSubpartitionDefinition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubPartitionFunctionHash(
      final MariaDBParser.SubPartitionFunctionHashContext ctx) {
    final var methodName = "enterSubPartitionFunctionHash";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubPartitionFunctionKey(final MariaDBParser.SubPartitionFunctionKeyContext ctx) {
    final var methodName = "enterSubPartitionFunctionKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubqueryComparisonPredicate(
      final MariaDBParser.SubqueryComparisonPredicateContext ctx) {
    final var methodName = "enterSubqueryComparisonPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubqueryExpressionAtom(final MariaDBParser.SubqueryExpressionAtomContext ctx) {
    final var methodName = "enterSubqueryExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubqueryTableItem(final MariaDBParser.SubqueryTableItemContext ctx) {
    final var methodName = "enterSubqueryTableItem";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubstrFunctionCall(final MariaDBParser.SubstrFunctionCallContext ctx) {
    final var methodName = "enterSubstrFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableFlushOption(final MariaDBParser.TableFlushOptionContext ctx) {
    final var methodName = "enterTableFlushOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableIndexes(final MariaDBParser.TableIndexesContext ctx) {
    final var methodName = "enterTableIndexes";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableJson(final MariaDBParser.TableJsonContext ctx) {
    final var methodName = "enterTableJson";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableName(final MariaDBParser.TableNameContext ctx) {
    final var methodName = "enterTableName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionAutoextendSize(
      final MariaDBParser.TableOptionAutoextendSizeContext ctx) {
    final var methodName = "enterTableOptionAutoextendSize";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionAutoIncrement(
      final MariaDBParser.TableOptionAutoIncrementContext ctx) {
    final var methodName = "enterTableOptionAutoIncrement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionAverage(final MariaDBParser.TableOptionAverageContext ctx) {
    final var methodName = "enterTableOptionAverage";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionCharset(final MariaDBParser.TableOptionCharsetContext ctx) {
    final var methodName = "enterTableOptionCharset";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionChecksum(final MariaDBParser.TableOptionChecksumContext ctx) {
    final var methodName = "enterTableOptionChecksum";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionCollate(final MariaDBParser.TableOptionCollateContext ctx) {
    final var methodName = "enterTableOptionCollate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionComment(final MariaDBParser.TableOptionCommentContext ctx) {
    final var methodName = "enterTableOptionComment";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionCompression(final MariaDBParser.TableOptionCompressionContext ctx) {
    final var methodName = "enterTableOptionCompression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionConnection(final MariaDBParser.TableOptionConnectionContext ctx) {
    final var methodName = "enterTableOptionConnection";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionDataDirectory(
      final MariaDBParser.TableOptionDataDirectoryContext ctx) {
    final var methodName = "enterTableOptionDataDirectory";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionDelay(final MariaDBParser.TableOptionDelayContext ctx) {
    final var methodName = "enterTableOptionDelay";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionEncrypted(final MariaDBParser.TableOptionEncryptedContext ctx) {
    final var methodName = "enterTableOptionEncrypted";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionEncryption(final MariaDBParser.TableOptionEncryptionContext ctx) {
    final var methodName = "enterTableOptionEncryption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionEncryptionKeyId(
      final MariaDBParser.TableOptionEncryptionKeyIdContext ctx) {
    final var methodName = "enterTableOptionEncryptionKeyId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionEngine(final MariaDBParser.TableOptionEngineContext ctx) {
    final var methodName = "enterTableOptionEngine";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionEngineAttribute(
      final MariaDBParser.TableOptionEngineAttributeContext ctx) {
    final var methodName = "enterTableOptionEngineAttribute";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionIndexDirectory(
      final MariaDBParser.TableOptionIndexDirectoryContext ctx) {
    final var methodName = "enterTableOptionIndexDirectory";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionInsertMethod(final MariaDBParser.TableOptionInsertMethodContext ctx) {
    final var methodName = "enterTableOptionInsertMethod";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionKeyBlockSize(final MariaDBParser.TableOptionKeyBlockSizeContext ctx) {
    final var methodName = "enterTableOptionKeyBlockSize";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionMaxRows(final MariaDBParser.TableOptionMaxRowsContext ctx) {
    final var methodName = "enterTableOptionMaxRows";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionMinRows(final MariaDBParser.TableOptionMinRowsContext ctx) {
    final var methodName = "enterTableOptionMinRows";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionPackKeys(final MariaDBParser.TableOptionPackKeysContext ctx) {
    final var methodName = "enterTableOptionPackKeys";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionPageCompressed(
      final MariaDBParser.TableOptionPageCompressedContext ctx) {
    final var methodName = "enterTableOptionPageCompressed";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionPageCompressionLevel(
      final MariaDBParser.TableOptionPageCompressionLevelContext ctx) {
    final var methodName = "enterTableOptionPageCompressionLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionPassword(final MariaDBParser.TableOptionPasswordContext ctx) {
    final var methodName = "enterTableOptionPassword";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionPersistent(final MariaDBParser.TableOptionPersistentContext ctx) {
    final var methodName = "enterTableOptionPersistent";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionRecalculation(
      final MariaDBParser.TableOptionRecalculationContext ctx) {
    final var methodName = "enterTableOptionRecalculation";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionRowFormat(final MariaDBParser.TableOptionRowFormatContext ctx) {
    final var methodName = "enterTableOptionRowFormat";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionSamplePage(final MariaDBParser.TableOptionSamplePageContext ctx) {
    final var methodName = "enterTableOptionSamplePage";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionSecondaryEngineAttribute(
      final MariaDBParser.TableOptionSecondaryEngineAttributeContext ctx) {
    final var methodName = "enterTableOptionSecondaryEngineAttribute";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionStartTransaction(
      final MariaDBParser.TableOptionStartTransactionContext ctx) {
    final var methodName = "enterTableOptionStartTransaction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionTablespace(final MariaDBParser.TableOptionTablespaceContext ctx) {
    final var methodName = "enterTableOptionTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionTableType(final MariaDBParser.TableOptionTableTypeContext ctx) {
    final var methodName = "enterTableOptionTableType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionTransactional(
      final MariaDBParser.TableOptionTransactionalContext ctx) {
    final var methodName = "enterTableOptionTransactional";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionUnion(final MariaDBParser.TableOptionUnionContext ctx) {
    final var methodName = "enterTableOptionUnion";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablePair(final MariaDBParser.TablePairContext ctx) {
    final var methodName = "enterTablePair";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTables(final MariaDBParser.TablesContext ctx) {
    final var methodName = "enterTables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSourceBase(final MariaDBParser.TableSourceBaseContext ctx) {
    final var methodName = "enterTableSourceBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSourceNested(final MariaDBParser.TableSourceNestedContext ctx) {
    final var methodName = "enterTableSourceNested";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSources(final MariaDBParser.TableSourcesContext ctx) {
    final var methodName = "enterTableSources";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSourcesItem(final MariaDBParser.TableSourcesItemContext ctx) {
    final var methodName = "enterTableSourcesItem";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespaceStorage(final MariaDBParser.TablespaceStorageContext ctx) {
    final var methodName = "enterTablespaceStorage";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableType(final MariaDBParser.TableTypeContext ctx) {
    final var methodName = "enterTableType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterThreadType(final MariaDBParser.ThreadTypeContext ctx) {
    final var methodName = "enterThreadType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTimestampValue(final MariaDBParser.TimestampValueContext ctx) {
    final var methodName = "enterTimestampValue";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTlsOption(final MariaDBParser.TlsOptionContext ctx) {
    final var methodName = "enterTlsOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionLevel(final MariaDBParser.TransactionLevelContext ctx) {
    final var methodName = "enterTransactionLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionLevelBase(final MariaDBParser.TransactionLevelBaseContext ctx) {
    final var methodName = "enterTransactionLevelBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionMode(final MariaDBParser.TransactionModeContext ctx) {
    final var methodName = "enterTransactionMode";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionOption(final MariaDBParser.TransactionOptionContext ctx) {
    final var methodName = "enterTransactionOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionStatement(final MariaDBParser.TransactionStatementContext ctx) {
    final var methodName = "enterTransactionStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrimFunctionCall(final MariaDBParser.TrimFunctionCallContext ctx) {
    final var methodName = "enterTrimFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTruncateTable(final MariaDBParser.TruncateTableContext ctx) {
    final var methodName = "enterTruncateTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUdfFunctionCall(final MariaDBParser.UdfFunctionCallContext ctx) {
    final var methodName = "enterUdfFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUid(final MariaDBParser.UidContext ctx) {
    final var methodName = "enterUid";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUidList(final MariaDBParser.UidListContext ctx) {
    final var methodName = "enterUidList";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnaryExpressionAtom(final MariaDBParser.UnaryExpressionAtomContext ctx) {
    final var methodName = "enterUnaryExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnaryOperator(final MariaDBParser.UnaryOperatorContext ctx) {
    final var methodName = "enterUnaryOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUninstallPlugin(final MariaDBParser.UninstallPluginContext ctx) {
    final var methodName = "enterUninstallPlugin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnionParenthesis(final MariaDBParser.UnionParenthesisContext ctx) {
    final var methodName = "enterUnionParenthesis";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnionParenthesisSelect(final MariaDBParser.UnionParenthesisSelectContext ctx) {
    final var methodName = "enterUnionParenthesisSelect";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnionSelect(final MariaDBParser.UnionSelectContext ctx) {
    final var methodName = "enterUnionSelect";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnionStatement(final MariaDBParser.UnionStatementContext ctx) {
    final var methodName = "enterUnionStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueKeyColumnConstraint(
      final MariaDBParser.UniqueKeyColumnConstraintContext ctx) {
    final var methodName = "enterUniqueKeyColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueKeyTableConstraint(
      final MariaDBParser.UniqueKeyTableConstraintContext ctx) {
    final var methodName = "enterUniqueKeyTableConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnlockTables(final MariaDBParser.UnlockTablesContext ctx) {
    final var methodName = "enterUnlockTables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdatedElement(final MariaDBParser.UpdatedElementContext ctx) {
    final var methodName = "enterUpdatedElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdateStatement(final MariaDBParser.UpdateStatementContext ctx) {
    final var methodName = "enterUpdateStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserConnectionOption(final MariaDBParser.UserConnectionOptionContext ctx) {
    final var methodName = "enterUserConnectionOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserLockOption(final MariaDBParser.UserLockOptionContext ctx) {
    final var methodName = "enterUserLockOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserName(final MariaDBParser.UserNameContext ctx) {
    final var methodName = "enterUserName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserPasswordOption(final MariaDBParser.UserPasswordOptionContext ctx) {
    final var methodName = "enterUserPasswordOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserResourceOption(final MariaDBParser.UserResourceOptionContext ctx) {
    final var methodName = "enterUserResourceOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserSpecification(final MariaDBParser.UserSpecificationContext ctx) {
    final var methodName = "enterUserSpecification";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserVariables(final MariaDBParser.UserVariablesContext ctx) {
    final var methodName = "enterUserVariables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUseStatement(final MariaDBParser.UseStatementContext ctx) {
    final var methodName = "enterUseStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUtilityStatement(final MariaDBParser.UtilityStatementContext ctx) {
    final var methodName = "enterUtilityStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUuidSet(final MariaDBParser.UuidSetContext ctx) {
    final var methodName = "enterUuidSet";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValuesFunctionCall(final MariaDBParser.ValuesFunctionCallContext ctx) {
    final var methodName = "enterValuesFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValuesStatement(final MariaDBParser.ValuesStatementContext ctx) {
    final var methodName = "enterValuesStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVariableAssignExpressionAtom(
      final MariaDBParser.VariableAssignExpressionAtomContext ctx) {
    final var methodName = "enterVariableAssignExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVariableClause(final MariaDBParser.VariableClauseContext ctx) {
    final var methodName = "enterVariableClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVisibilityColumnConstraint(
      final MariaDBParser.VisibilityColumnConstraintContext ctx) {
    final var methodName = "enterVisibilityColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWaitNowaitClause(final MariaDBParser.WaitNowaitClauseContext ctx) {
    final var methodName = "enterWaitNowaitClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWeightFunctionCall(final MariaDBParser.WeightFunctionCallContext ctx) {
    final var methodName = "enterWeightFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhileStatement(final MariaDBParser.WhileStatementContext ctx) {
    final var methodName = "enterWhileStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWildDoTableReplication(final MariaDBParser.WildDoTableReplicationContext ctx) {
    final var methodName = "enterWildDoTableReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWildIgnoreTableReplication(
      final MariaDBParser.WildIgnoreTableReplicationContext ctx) {
    final var methodName = "enterWildIgnoreTableReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindowClause(final MariaDBParser.WindowClauseContext ctx) {
    final var methodName = "enterWindowClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindowName(final MariaDBParser.WindowNameContext ctx) {
    final var methodName = "enterWindowName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindowSpec(final MariaDBParser.WindowSpecContext ctx) {
    final var methodName = "enterWindowSpec";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithClause(final MariaDBParser.WithClauseContext ctx) {
    final var methodName = "enterWithClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithLateralStatement(final MariaDBParser.WithLateralStatementContext ctx) {
    final var methodName = "enterWithLateralStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaCommitWork(final MariaDBParser.XaCommitWorkContext ctx) {
    final var methodName = "enterXaCommitWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaEndTransaction(final MariaDBParser.XaEndTransactionContext ctx) {
    final var methodName = "enterXaEndTransaction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaPrepareStatement(final MariaDBParser.XaPrepareStatementContext ctx) {
    final var methodName = "enterXaPrepareStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaRecoverWork(final MariaDBParser.XaRecoverWorkContext ctx) {
    final var methodName = "enterXaRecoverWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaRollbackWork(final MariaDBParser.XaRollbackWorkContext ctx) {
    final var methodName = "enterXaRollbackWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaStartTransaction(final MariaDBParser.XaStartTransactionContext ctx) {
    final var methodName = "enterXaStartTransaction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXid(final MariaDBParser.XidContext ctx) {
    final var methodName = "enterXid";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXuidStringId(final MariaDBParser.XuidStringIdContext ctx) {
    final var methodName = "enterXuidStringId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdministrationStatement(final MariaDBParser.AdministrationStatementContext ctx) {
    final var methodName = "exitAdministrationStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggregateFunctionCall(final MariaDBParser.AggregateFunctionCallContext ctx) {
    final var methodName = "exitAggregateFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggregateWindowedFunction(
      final MariaDBParser.AggregateWindowedFunctionContext ctx) {
    final var methodName = "exitAggregateWindowedFunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddCheckTableConstraint(
      final MariaDBParser.AlterByAddCheckTableConstraintContext ctx) {
    final var methodName = "exitAlterByAddCheckTableConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddColumn(final MariaDBParser.AlterByAddColumnContext ctx) {
    final var methodName = "exitAlterByAddColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddColumns(final MariaDBParser.AlterByAddColumnsContext ctx) {
    final var methodName = "exitAlterByAddColumns";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddDefinitions(final MariaDBParser.AlterByAddDefinitionsContext ctx) {
    final var methodName = "exitAlterByAddDefinitions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddForeignKey(final MariaDBParser.AlterByAddForeignKeyContext ctx) {
    final var methodName = "exitAlterByAddForeignKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddIndex(final MariaDBParser.AlterByAddIndexContext ctx) {
    final var methodName = "exitAlterByAddIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddPartition(final MariaDBParser.AlterByAddPartitionContext ctx) {
    final var methodName = "exitAlterByAddPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddPrimaryKey(final MariaDBParser.AlterByAddPrimaryKeyContext ctx) {
    final var methodName = "exitAlterByAddPrimaryKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddSpecialIndex(final MariaDBParser.AlterByAddSpecialIndexContext ctx) {
    final var methodName = "exitAlterByAddSpecialIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddUniqueKey(final MariaDBParser.AlterByAddUniqueKeyContext ctx) {
    final var methodName = "exitAlterByAddUniqueKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAlterIndexVisibility(
      final MariaDBParser.AlterByAlterIndexVisibilityContext ctx) {
    final var methodName = "exitAlterByAlterIndexVisibility";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAnalyzePartition(final MariaDBParser.AlterByAnalyzePartitionContext ctx) {
    final var methodName = "exitAlterByAnalyzePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByChangeColumn(final MariaDBParser.AlterByChangeColumnContext ctx) {
    final var methodName = "exitAlterByChangeColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByChangeDefault(final MariaDBParser.AlterByChangeDefaultContext ctx) {
    final var methodName = "exitAlterByChangeDefault";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByCheckPartition(final MariaDBParser.AlterByCheckPartitionContext ctx) {
    final var methodName = "exitAlterByCheckPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByCoalescePartition(
      final MariaDBParser.AlterByCoalescePartitionContext ctx) {
    final var methodName = "exitAlterByCoalescePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByConvertCharset(final MariaDBParser.AlterByConvertCharsetContext ctx) {
    final var methodName = "exitAlterByConvertCharset";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDefaultCharset(final MariaDBParser.AlterByDefaultCharsetContext ctx) {
    final var methodName = "exitAlterByDefaultCharset";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDisableKeys(final MariaDBParser.AlterByDisableKeysContext ctx) {
    final var methodName = "exitAlterByDisableKeys";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDiscardPartition(final MariaDBParser.AlterByDiscardPartitionContext ctx) {
    final var methodName = "exitAlterByDiscardPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDiscardTablespace(
      final MariaDBParser.AlterByDiscardTablespaceContext ctx) {
    final var methodName = "exitAlterByDiscardTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropColumn(final MariaDBParser.AlterByDropColumnContext ctx) {
    final var methodName = "exitAlterByDropColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropConstraintCheck(
      final MariaDBParser.AlterByDropConstraintCheckContext ctx) {
    final var methodName = "exitAlterByDropConstraintCheck";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropForeignKey(final MariaDBParser.AlterByDropForeignKeyContext ctx) {
    final var methodName = "exitAlterByDropForeignKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropIndex(final MariaDBParser.AlterByDropIndexContext ctx) {
    final var methodName = "exitAlterByDropIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropPartition(final MariaDBParser.AlterByDropPartitionContext ctx) {
    final var methodName = "exitAlterByDropPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropPrimaryKey(final MariaDBParser.AlterByDropPrimaryKeyContext ctx) {
    final var methodName = "exitAlterByDropPrimaryKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByEnableKeys(final MariaDBParser.AlterByEnableKeysContext ctx) {
    final var methodName = "exitAlterByEnableKeys";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByExchangePartition(
      final MariaDBParser.AlterByExchangePartitionContext ctx) {
    final var methodName = "exitAlterByExchangePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByForce(final MariaDBParser.AlterByForceContext ctx) {
    final var methodName = "exitAlterByForce";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByImportPartition(final MariaDBParser.AlterByImportPartitionContext ctx) {
    final var methodName = "exitAlterByImportPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByImportTablespace(final MariaDBParser.AlterByImportTablespaceContext ctx) {
    final var methodName = "exitAlterByImportTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByLock(final MariaDBParser.AlterByLockContext ctx) {
    final var methodName = "exitAlterByLock";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByModifyColumn(final MariaDBParser.AlterByModifyColumnContext ctx) {
    final var methodName = "exitAlterByModifyColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByOptimizePartition(
      final MariaDBParser.AlterByOptimizePartitionContext ctx) {
    final var methodName = "exitAlterByOptimizePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByOrder(final MariaDBParser.AlterByOrderContext ctx) {
    final var methodName = "exitAlterByOrder";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRebuildPartition(final MariaDBParser.AlterByRebuildPartitionContext ctx) {
    final var methodName = "exitAlterByRebuildPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRemovePartitioning(
      final MariaDBParser.AlterByRemovePartitioningContext ctx) {
    final var methodName = "exitAlterByRemovePartitioning";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRename(final MariaDBParser.AlterByRenameContext ctx) {
    final var methodName = "exitAlterByRename";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRenameColumn(final MariaDBParser.AlterByRenameColumnContext ctx) {
    final var methodName = "exitAlterByRenameColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRenameIndex(final MariaDBParser.AlterByRenameIndexContext ctx) {
    final var methodName = "exitAlterByRenameIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByReorganizePartition(
      final MariaDBParser.AlterByReorganizePartitionContext ctx) {
    final var methodName = "exitAlterByReorganizePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRepairPartition(final MariaDBParser.AlterByRepairPartitionContext ctx) {
    final var methodName = "exitAlterByRepairPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterBySetAlgorithm(final MariaDBParser.AlterBySetAlgorithmContext ctx) {
    final var methodName = "exitAlterBySetAlgorithm";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByTableOption(final MariaDBParser.AlterByTableOptionContext ctx) {
    final var methodName = "exitAlterByTableOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByTruncatePartition(
      final MariaDBParser.AlterByTruncatePartitionContext ctx) {
    final var methodName = "exitAlterByTruncatePartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByUpgradePartitioning(
      final MariaDBParser.AlterByUpgradePartitioningContext ctx) {
    final var methodName = "exitAlterByUpgradePartitioning";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByValidate(final MariaDBParser.AlterByValidateContext ctx) {
    final var methodName = "exitAlterByValidate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterEvent(final MariaDBParser.AlterEventContext ctx) {
    final var methodName = "exitAlterEvent";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterFunction(final MariaDBParser.AlterFunctionContext ctx) {
    final var methodName = "exitAlterFunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterInstance(final MariaDBParser.AlterInstanceContext ctx) {
    final var methodName = "exitAlterInstance";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterLogfileGroup(final MariaDBParser.AlterLogfileGroupContext ctx) {
    final var methodName = "exitAlterLogfileGroup";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterPartition(final MariaDBParser.AlterPartitionContext ctx) {
    final var methodName = "exitAlterPartition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterProcedure(final MariaDBParser.AlterProcedureContext ctx) {
    final var methodName = "exitAlterProcedure";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterSequence(final MariaDBParser.AlterSequenceContext ctx) {
    final var methodName = "exitAlterSequence";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterServer(final MariaDBParser.AlterServerContext ctx) {
    final var methodName = "exitAlterServer";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterSimpleDatabase(final MariaDBParser.AlterSimpleDatabaseContext ctx) {
    final var methodName = "exitAlterSimpleDatabase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterTable(final MariaDBParser.AlterTableContext ctx) {
    final var methodName = "exitAlterTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterTablespace(final MariaDBParser.AlterTablespaceContext ctx) {
    final var methodName = "exitAlterTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterUpgradeName(final MariaDBParser.AlterUpgradeNameContext ctx) {
    final var methodName = "exitAlterUpgradeName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterUserMysqlV56(final MariaDBParser.AlterUserMysqlV56Context ctx) {
    final var methodName = "exitAlterUserMysqlV56";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterUserMysqlV80(final MariaDBParser.AlterUserMysqlV80Context ctx) {
    final var methodName = "exitAlterUserMysqlV80";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterView(final MariaDBParser.AlterViewContext ctx) {
    final var methodName = "exitAlterView";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAnalyzeTable(final MariaDBParser.AnalyzeTableContext ctx) {
    final var methodName = "exitAnalyzeTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAssignmentField(final MariaDBParser.AssignmentFieldContext ctx) {
    final var methodName = "exitAssignmentField";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAtomTableItem(final MariaDBParser.AtomTableItemContext ctx) {
    final var methodName = "exitAtomTableItem";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAuthPlugin(final MariaDBParser.AuthPluginContext ctx) {
    final var methodName = "exitAuthPlugin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAutoIncrementColumnConstraint(
      final MariaDBParser.AutoIncrementColumnConstraintContext ctx) {
    final var methodName = "exitAutoIncrementColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBeginWork(final MariaDBParser.BeginWorkContext ctx) {
    final var methodName = "exitBeginWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBetweenPredicate(final MariaDBParser.BetweenPredicateContext ctx) {
    final var methodName = "exitBetweenPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBinaryComparisonPredicate(
      final MariaDBParser.BinaryComparisonPredicateContext ctx) {
    final var methodName = "exitBinaryComparisonPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBinaryExpressionAtom(final MariaDBParser.BinaryExpressionAtomContext ctx) {
    final var methodName = "exitBinaryExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBinlogStatement(final MariaDBParser.BinlogStatementContext ctx) {
    final var methodName = "exitBinlogStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBitExpressionAtom(final MariaDBParser.BitExpressionAtomContext ctx) {
    final var methodName = "exitBitExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBitOperator(final MariaDBParser.BitOperatorContext ctx) {
    final var methodName = "exitBitOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBlockStatement(final MariaDBParser.BlockStatementContext ctx) {
    final var methodName = "exitBlockStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBooleanLiteral(final MariaDBParser.BooleanLiteralContext ctx) {
    final var methodName = "exitBooleanLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBoolMasterOption(final MariaDBParser.BoolMasterOptionContext ctx) {
    final var methodName = "exitBoolMasterOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCacheIndexStatement(final MariaDBParser.CacheIndexStatementContext ctx) {
    final var methodName = "exitCacheIndexStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCallStatement(final MariaDBParser.CallStatementContext ctx) {
    final var methodName = "exitCallStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseAlternative(final MariaDBParser.CaseAlternativeContext ctx) {
    final var methodName = "exitCaseAlternative";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseExpressionFunctionCall(
      final MariaDBParser.CaseExpressionFunctionCallContext ctx) {
    final var methodName = "exitCaseExpressionFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseFuncAlternative(final MariaDBParser.CaseFuncAlternativeContext ctx) {
    final var methodName = "exitCaseFuncAlternative";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseFunctionCall(final MariaDBParser.CaseFunctionCallContext ctx) {
    final var methodName = "exitCaseFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseStatement(final MariaDBParser.CaseStatementContext ctx) {
    final var methodName = "exitCaseStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChangeMaster(final MariaDBParser.ChangeMasterContext ctx) {
    final var methodName = "exitChangeMaster";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChangeReplicationFilter(final MariaDBParser.ChangeReplicationFilterContext ctx) {
    final var methodName = "exitChangeReplicationFilter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChannelFlushOption(final MariaDBParser.ChannelFlushOptionContext ctx) {
    final var methodName = "exitChannelFlushOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChannelOption(final MariaDBParser.ChannelOptionContext ctx) {
    final var methodName = "exitChannelOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharFunctionCall(final MariaDBParser.CharFunctionCallContext ctx) {
    final var methodName = "exitCharFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharSet(final MariaDBParser.CharSetContext ctx) {
    final var methodName = "exitCharSet";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharsetName(final MariaDBParser.CharsetNameContext ctx) {
    final var methodName = "exitCharsetName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharsetNameBase(final MariaDBParser.CharsetNameBaseContext ctx) {
    final var methodName = "exitCharsetNameBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheckColumnConstraint(final MariaDBParser.CheckColumnConstraintContext ctx) {
    final var methodName = "exitCheckColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChecksumTable(final MariaDBParser.ChecksumTableContext ctx) {
    final var methodName = "exitChecksumTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheckTable(final MariaDBParser.CheckTableContext ctx) {
    final var methodName = "exitCheckTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheckTableConstraint(final MariaDBParser.CheckTableConstraintContext ctx) {
    final var methodName = "exitCheckTableConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheckTableOption(final MariaDBParser.CheckTableOptionContext ctx) {
    final var methodName = "exitCheckTableOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCloseCursor(final MariaDBParser.CloseCursorContext ctx) {
    final var methodName = "exitCloseCursor";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollateColumnConstraint(final MariaDBParser.CollateColumnConstraintContext ctx) {
    final var methodName = "exitCollateColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollateExpressionAtom(final MariaDBParser.CollateExpressionAtomContext ctx) {
    final var methodName = "exitCollateExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollationName(final MariaDBParser.CollationNameContext ctx) {
    final var methodName = "exitCollationName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollectionDataType(final MariaDBParser.CollectionDataTypeContext ctx) {
    final var methodName = "exitCollectionDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollectionOptions(final MariaDBParser.CollectionOptionsContext ctx) {
    final var methodName = "exitCollectionOptions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnCreateTable(final MariaDBParser.ColumnCreateTableContext ctx) {
    final var methodName = "exitColumnCreateTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

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
      ParseTreeStream.parseTreeStream(ctx)
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
  public void exitColumnDeclaration(final MariaDBParser.ColumnDeclarationContext ctx) {
    final var methodName = "exitColumnDeclaration";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.DimensionDataTypeContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.FIELD_TYPE)) {
                  currentField.put(Field.FIELD_TYPE, NotNullSet.getInstance(terminalNodeText));
                } else if (Strings.CI.equals("PRECISION", terminalNodeText)) {
                  currentField.put(
                      Field.FIELD_TYPE,
                      NotNullSet.getInstance(
                          currentField.get(Field.FIELD_TYPE) + " " + terminalNodeText));
                } else if (!Strings.CI.equals(
                    currentField.get(Field.FIELD_TYPE).toString(), terminalNodeText)) {
                  currentField.put(
                      StringUtils.lowerCase(terminalNodeText, Locale.getDefault()),
                      NotNullSet.getInstance(Boolean.TRUE));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.LongVarbinaryDataTypeContext.class)
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
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.LongVarcharDataTypeContext.class)
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
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.NationalStringDataTypeContext.class)
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
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.SimpleDataTypeContext.class)
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
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.SpatialDataTypeContext.class)
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
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.StringDataTypeContext.class)
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
    final var autoIncrementText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
            .streamChildrenByClass(MariaDBParser.AutoIncrementColumnConstraintContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (Strings.CI.equals("AUTO_INCREMENT", autoIncrementText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.AUTO_INCREMENT, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamTextByClass(
            MariaDBParserListenerImpl.input, MariaDBParser.CommentColumnConstraintContext.class)
        .forEach(
            intervalText -> {
              final String value;
              if (StringUtils.upperCase(intervalText.replaceAll("\\s", ""), Locale.getDefault())
                  .startsWith("COMMENT=")) {
                value = ParseTreeHelper.trimSingleQuote(intervalText.split("=", 2)[1]);
              } else if (StringUtils.upperCase(intervalText, Locale.getDefault())
                  .startsWith("COMMENT ")) {
                value = ParseTreeHelper.trimSingleQuote(intervalText.split(" ", 2)[1]);
              } else {
                value = ParseTreeHelper.trimSingleQuote(intervalText);
              }
              if (StringUtils.isNoneBlank(value)) {
                for (final var currentField : currentFieldList) {
                  currentField.put(Field.COMMENT, NotNullSet.getInstance(value));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.DefaultColumnConstraintContext.class)
        .streamTextByClass(MariaDBParserListenerImpl.input, MariaDBParser.DefaultValueContext.class)
        .map(ParseTreeHelper::trimParentheses)
        .forEach(
            intervalText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.DEFAULT, NotNullSet.getInstance(intervalText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.DimensionDataTypeContext.class)
        .streamChildrenByClass(MariaDBParser.LengthOneDimensionContext.class)
        .streamChildrenByClass(MariaDBParser.DecimalLiteralContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.DimensionDataTypeContext.class)
        .streamChildrenByClass(MariaDBParser.LengthTwoOptionalDimensionContext.class)
        .streamChildrenByClass(MariaDBParser.DecimalLiteralContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.PRECISION)) {
                  if (terminalNodeText.contains(".")) {
                    final var terminalNodeSplit = terminalNodeText.split("\\.", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else {
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeText));
                  }
                } else if (!currentField.containsKey(Field.SCALE)) {
                  currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeText));
                }
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.DimensionDataTypeContext.class)
        .streamChildrenByClass(MariaDBParser.LengthTwoDimensionContext.class)
        .streamChildrenByClass(MariaDBParser.DecimalLiteralContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                if (!currentField.containsKey(Field.PRECISION)) {
                  if (terminalNodeText.contains(".")) {
                    final var terminalNodeSplit = terminalNodeText.split("\\.", 0);
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeSplit[0]));
                    currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeSplit[1]));
                  } else {
                    currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeText));
                  }
                } else if (!currentField.containsKey(Field.SCALE)) {
                  currentField.put(Field.SCALE, NotNullSet.getInstance(terminalNodeText));
                }
              }
            });
    if (Strings.CI.equals("INVISIBLE", autoIncrementText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.VISIBLE, NotNullSet.getInstance(Boolean.FALSE));
      }
    }
    var allTerminalNodeTextList = ParseTreeStream.parseTreeStream(ctx).listAllTerminalNodeText();
    final int defaultIndex =
        IntStream.range(0, allTerminalNodeTextList.size())
            .filter(i -> "DEFAULT".equalsIgnoreCase(allTerminalNodeTextList.get(i)))
            .findFirst()
            .orElse(-1);
    final int storedIndex =
        IntStream.range(0, allTerminalNodeTextList.size())
            .filter(i -> "STORED".equalsIgnoreCase(allTerminalNodeTextList.get(i)))
            .findFirst()
            .orElse(-1);
    var nullableText =
        " "
            + String.join(
                " ",
                0 < defaultIndex && defaultIndex < storedIndex
                    ? allTerminalNodeTextList.subList(0, defaultIndex)
                    : 0 < storedIndex && storedIndex < defaultIndex
                        ? allTerminalNodeTextList.subList(0, storedIndex)
                        : 0 < defaultIndex
                            ? allTerminalNodeTextList.subList(0, defaultIndex)
                            : 0 < storedIndex
                                ? allTerminalNodeTextList.subList(0, storedIndex)
                                : allTerminalNodeTextList)
            + " ";
    nullableText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
            .streamChildrenByClass(MariaDBParser.NullColumnConstraintContext.class)
            .streamChildrenByClass(MariaDBParser.NullNotnullContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    nullableText += " ";
    nullableText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
            .streamChildrenByClass(MariaDBParser.CheckColumnConstraintContext.class)
            .streamChildrenByClass(MariaDBParser.PredicateExpressionContext.class)
            .streamChildrenByClass(MariaDBParser.IsNullPredicateContext.class)
            .streamChildrenByClass(MariaDBParser.NullNotnullContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    nullableText += " ";
    if (nullableText.contains(" NOT NULL ")) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.FALSE));
      }
    } else if (nullableText.contains(" NULL ")) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.NULLABLE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    final var primaryKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
            .streamChildrenByClass(MariaDBParser.PrimaryKeyColumnConstraintContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (Strings.CI.equals("PRIMARY KEY", primaryKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.StringDataTypeContext.class)
        .streamChildrenByClass(MariaDBParser.CharsetNameContext.class)
        .streamChildrenByClass(MariaDBParser.CharsetNameBaseContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.CHARSET, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.StringDataTypeContext.class)
        .streamChildrenByClass(MariaDBParser.CollationNameContext.class)
        .streamChildrenByClass(MariaDBParser.UidContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.COLLATION_NAME, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.StringDataTypeContext.class)
        .streamChildrenByClass(MariaDBParser.CollationNameContext.class)
        .streamChildrenByClass(MariaDBParser.UidContext.class)
        .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.COLLATION_NAME, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.CollateColumnConstraintContext.class)
        .streamChildrenByClass(MariaDBParser.CollationNameContext.class)
        .streamChildrenByClass(MariaDBParser.UidContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.COLLATION_NAME, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.StringDataTypeContext.class)
        .streamChildrenByClass(MariaDBParser.LengthOneDimensionContext.class)
        .streamChildrenByClass(MariaDBParser.DecimalLiteralContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeText));
              }
            });
    final var uniqueKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
            .streamChildrenByClass(MariaDBParser.UniqueKeyColumnConstraintContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (Strings.CI.equals("UNIQUE", uniqueKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.VisibilityColumnConstraintContext.class)
        .forEach(
            visibilityColumnConstraintContext -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.VISIBLE, NotNullSet.getInstance(Boolean.TRUE));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MariaDBParser.InvisibilityColumnConstraintContext.class)
        .forEach(
            invisibilityColumnConstraintContext -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.VISIBLE, NotNullSet.getInstance(Boolean.FALSE));
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

    final var currentRelationship = this.getCurrentRelationship(ctx);
    if (currentRelationship != null) {
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(MariaDBParser.UidContext.class)
          .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
          .map(simpleIdContext -> ParseTreeHelper.trimToken(simpleIdContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              simpleIdText -> {
                final Set<String> inheritsList;
                if (currentRelationship.get("column") instanceof Set) {
                  inheritsList = (Set<String>) currentRelationship.get("column");
                } else {
                  inheritsList = new LinkedHashSet<>();
                }
                inheritsList.add(simpleIdText);

                currentRelationship.put("column", NotNullSet.getInstance(inheritsList));
              });
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
          .streamChildrenByClass(MariaDBParser.ReferenceColumnConstraintContext.class)
          .streamChildrenByClass(MariaDBParser.ReferenceDefinitionContext.class)
          .streamChildrenByClass(MariaDBParser.TableNameContext.class)
          .streamChildrenByClass(MariaDBParser.FullIdContext.class)
          .map(fullIdContext -> ParseTreeHelper.trimToken(fullIdContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              fullIdText ->
                  currentRelationship.put(
                      "foreignTable",
                      NotNullSet.getInstance(ParseTreeHelper.trimToken(fullIdText))));
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(MariaDBParser.ColumnDefinitionContext.class)
          .streamChildrenByClass(MariaDBParser.ReferenceColumnConstraintContext.class)
          .streamChildrenByClass(MariaDBParser.ReferenceDefinitionContext.class)
          .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
          .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
          .streamChildrenByClass(MariaDBParser.UidContext.class)
          .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
          .map(simpleIdContext -> ParseTreeHelper.trimToken(simpleIdContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              simpleIdText -> {
                final Set<String> inheritsList;
                if (currentRelationship.get("foreignColumn") instanceof Set) {
                  inheritsList = (Set<String>) currentRelationship.get("foreignColumn");
                } else {
                  inheritsList = new LinkedHashSet<>();
                }
                inheritsList.add(simpleIdText);

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
  public void exitColumnDefinition(final MariaDBParser.ColumnDefinitionContext ctx) {
    final var methodName = "exitColumnDefinition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommentColumnConstraint(final MariaDBParser.CommentColumnConstraintContext ctx) {
    final var methodName = "exitCommentColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommitWork(final MariaDBParser.CommitWorkContext ctx) {
    final var methodName = "exitCommitWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommonTableExpressions(final MariaDBParser.CommonTableExpressionsContext ctx) {
    final var methodName = "exitCommonTableExpressions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComparisonOperator(final MariaDBParser.ComparisonOperatorContext ctx) {
    final var methodName = "exitComparisonOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompoundStatement(final MariaDBParser.CompoundStatementContext ctx) {
    final var methodName = "exitCompoundStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstant(final MariaDBParser.ConstantContext ctx) {
    final var methodName = "exitConstant";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstantExpressionAtom(final MariaDBParser.ConstantExpressionAtomContext ctx) {
    final var methodName = "exitConstantExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstants(final MariaDBParser.ConstantsContext ctx) {
    final var methodName = "exitConstants";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraintDeclaration(final MariaDBParser.ConstraintDeclarationContext ctx) {
    final var methodName = "exitConstraintDeclaration";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    final var primaryKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.PrimaryKeyTableConstraintContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));

    if (Strings.CI.equals("PRIMARY KEY", primaryKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    }

    final var uniqueKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.UniqueKeyTableConstraintContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (Strings.CI.equals("UNIQUE", uniqueKeyText)
        || Strings.CI.equals("CONSTRAINT UNIQUE", uniqueKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    if (Strings.CI.equals("UNIQUE KEY", uniqueKeyText)
        || Strings.CI.equals("UNIQUE INDEX", uniqueKeyText)) {
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
  public void exitConvertedDataType(final MariaDBParser.ConvertedDataTypeContext ctx) {
    final var methodName = "exitConvertedDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopyCreateTable(final MariaDBParser.CopyCreateTableContext ctx) {
    final var methodName = "exitCopyCreateTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

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

    final var likeFound = new MutableBoolean(false);
    ParseTreeStream.parseTreeStream(ctx)
        .forEach(
            copyCreateTableChild -> {
              if (copyCreateTableChild instanceof final TerminalNode terminalNode) {
                likeFound.setValue(Strings.CI.equals("LIKE", terminalNode.getText()));
              }
              if (copyCreateTableChild
                      instanceof final MariaDBParser.TableNameContext tableNameContext
                  && likeFound.booleanValue()) {
                ParseTreeStream.parseTreeStream(tableNameContext)
                    .streamChildrenByClass(MariaDBParser.FullIdContext.class)
                    .streamChildrenByClass(MariaDBParser.UidContext.class)
                    .streamTerminalNodeString()
                    .forEach(
                        terminalNodeText -> {
                          final Set<String> inheritsList;
                          if (currentTable.getAttributes().get(SqlContextImpl.LIKE)
                              instanceof Set) {
                            inheritsList =
                                (Set<String>) currentTable.getAttributes().get(SqlContextImpl.LIKE);
                          } else {
                            inheritsList = new TreeSet<>();
                          }
                          inheritsList.add(terminalNodeText);
                          currentTable
                              .getAttributes()
                              .put(SqlContextImpl.LIKE, NotNullSet.getInstance(inheritsList));
                        });
                ParseTreeStream.parseTreeStream(tableNameContext)
                    .streamChildrenByClass(MariaDBParser.FullIdContext.class)
                    .streamChildrenByClass(MariaDBParser.UidContext.class)
                    .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
                    .streamTerminalNodeString()
                    .forEach(
                        terminalNodeText -> {
                          final Set<String> inheritsList;
                          if (currentTable.getAttributes().get(SqlContextImpl.LIKE)
                              instanceof Set) {
                            inheritsList =
                                (Set<String>) currentTable.getAttributes().get(SqlContextImpl.LIKE);
                          } else {
                            inheritsList = new TreeSet<>();
                          }
                          inheritsList.add(terminalNodeText);
                          currentTable
                              .getAttributes()
                              .put(SqlContextImpl.LIKE, NotNullSet.getInstance(inheritsList));
                        });
              }
            });

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
  public void exitCreateDatabase(final MariaDBParser.CreateDatabaseContext ctx) {
    final var methodName = "exitCreateDatabase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateDatabaseOption(final MariaDBParser.CreateDatabaseOptionContext ctx) {
    final var methodName = "exitCreateDatabaseOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateDefinitions(final MariaDBParser.CreateDefinitionsContext ctx) {
    final var methodName = "exitCreateDefinitions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateEvent(final MariaDBParser.CreateEventContext ctx) {
    final var methodName = "exitCreateEvent";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateFunction(final MariaDBParser.CreateFunctionContext ctx) {
    final var methodName = "exitCreateFunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateIndex(final MariaDBParser.CreateIndexContext ctx) {
    final var methodName = "exitCreateIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateLogfileGroup(final MariaDBParser.CreateLogfileGroupContext ctx) {
    final var methodName = "exitCreateLogfileGroup";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateProcedure(final MariaDBParser.CreateProcedureContext ctx) {
    final var methodName = "exitCreateProcedure";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateRole(final MariaDBParser.CreateRoleContext ctx) {
    final var methodName = "exitCreateRole";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateSequence(final MariaDBParser.CreateSequenceContext ctx) {
    final var methodName = "exitCreateSequence";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateServer(final MariaDBParser.CreateServerContext ctx) {
    final var methodName = "exitCreateServer";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTablespaceInnodb(final MariaDBParser.CreateTablespaceInnodbContext ctx) {
    final var methodName = "exitCreateTablespaceInnodb";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTablespaceNdb(final MariaDBParser.CreateTablespaceNdbContext ctx) {
    final var methodName = "exitCreateTablespaceNdb";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTrigger(final MariaDBParser.CreateTriggerContext ctx) {
    final var methodName = "exitCreateTrigger";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateUdfunction(final MariaDBParser.CreateUdfunctionContext ctx) {
    final var methodName = "exitCreateUdfunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateUserMysqlV56(final MariaDBParser.CreateUserMysqlV56Context ctx) {
    final var methodName = "exitCreateUserMysqlV56";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateUserMysqlV80(final MariaDBParser.CreateUserMysqlV80Context ctx) {
    final var methodName = "exitCreateUserMysqlV80";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateView(final MariaDBParser.CreateViewContext ctx) {
    final var methodName = "exitCreateView";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCteColumnName(final MariaDBParser.CteColumnNameContext ctx) {
    final var methodName = "exitCteColumnName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCteName(final MariaDBParser.CteNameContext ctx) {
    final var methodName = "exitCteName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCurrentSchemaPriviLevel(final MariaDBParser.CurrentSchemaPriviLevelContext ctx) {
    final var methodName = "exitCurrentSchemaPriviLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCurrentTimestamp(final MariaDBParser.CurrentTimestampContext ctx) {
    final var methodName = "exitCurrentTimestamp";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCurrentUserExpression(final MariaDBParser.CurrentUserExpressionContext ctx) {
    final var methodName = "exitCurrentUserExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDataTypeBase(final MariaDBParser.DataTypeBaseContext ctx) {
    final var methodName = "exitDataTypeBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDataTypeFunctionCall(final MariaDBParser.DataTypeFunctionCallContext ctx) {
    final var methodName = "exitDataTypeFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDdlStatement(final MariaDBParser.DdlStatementContext ctx) {
    final var methodName = "exitDdlStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeallocatePrepare(final MariaDBParser.DeallocatePrepareContext ctx) {
    final var methodName = "exitDeallocatePrepare";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecimalLiteral(final MariaDBParser.DecimalLiteralContext ctx) {
    final var methodName = "exitDecimalLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecimalMasterOption(final MariaDBParser.DecimalMasterOptionContext ctx) {
    final var methodName = "exitDecimalMasterOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeclareCondition(final MariaDBParser.DeclareConditionContext ctx) {
    final var methodName = "exitDeclareCondition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeclareCursor(final MariaDBParser.DeclareCursorContext ctx) {
    final var methodName = "exitDeclareCursor";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeclareHandler(final MariaDBParser.DeclareHandlerContext ctx) {
    final var methodName = "exitDeclareHandler";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeclareVariable(final MariaDBParser.DeclareVariableContext ctx) {
    final var methodName = "exitDeclareVariable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefaultAuthConnectionOption(
      final MariaDBParser.DefaultAuthConnectionOptionContext ctx) {
    final var methodName = "exitDefaultAuthConnectionOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefaultColumnConstraint(final MariaDBParser.DefaultColumnConstraintContext ctx) {
    final var methodName = "exitDefaultColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefaultValue(final MariaDBParser.DefaultValueContext ctx) {
    final var methodName = "exitDefaultValue";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefiniteFullTablePrivLevel(
      final MariaDBParser.DefiniteFullTablePrivLevelContext ctx) {
    final var methodName = "exitDefiniteFullTablePrivLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefiniteFullTablePrivLevel2(
      final MariaDBParser.DefiniteFullTablePrivLevel2Context ctx) {
    final var methodName = "exitDefiniteFullTablePrivLevel2";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefiniteSchemaPrivLevel(final MariaDBParser.DefiniteSchemaPrivLevelContext ctx) {
    final var methodName = "exitDefiniteSchemaPrivLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefiniteTablePrivLevel(final MariaDBParser.DefiniteTablePrivLevelContext ctx) {
    final var methodName = "exitDefiniteTablePrivLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeleteStatement(final MariaDBParser.DeleteStatementContext ctx) {
    final var methodName = "exitDeleteStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribeConnection(final MariaDBParser.DescribeConnectionContext ctx) {
    final var methodName = "exitDescribeConnection";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribeStatements(final MariaDBParser.DescribeStatementsContext ctx) {
    final var methodName = "exitDescribeStatements";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDetailRevoke(final MariaDBParser.DetailRevokeContext ctx) {
    final var methodName = "exitDetailRevoke";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDiagnosticsConditionInformationName(
      final MariaDBParser.DiagnosticsConditionInformationNameContext ctx) {
    final var methodName = "exitDiagnosticsConditionInformationName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDiagnosticsStatement(final MariaDBParser.DiagnosticsStatementContext ctx) {
    final var methodName = "exitDiagnosticsStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDimensionDataType(final MariaDBParser.DimensionDataTypeContext ctx) {
    final var methodName = "exitDimensionDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDmlStatement(final MariaDBParser.DmlStatementContext ctx) {
    final var methodName = "exitDmlStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDoDbReplication(final MariaDBParser.DoDbReplicationContext ctx) {
    final var methodName = "exitDoDbReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDoStatement(final MariaDBParser.DoStatementContext ctx) {
    final var methodName = "exitDoStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDoTableReplication(final MariaDBParser.DoTableReplicationContext ctx) {
    final var methodName = "exitDoTableReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDottedId(final MariaDBParser.DottedIdContext ctx) {
    final var methodName = "exitDottedId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropDatabase(final MariaDBParser.DropDatabaseContext ctx) {
    final var methodName = "exitDropDatabase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropEvent(final MariaDBParser.DropEventContext ctx) {
    final var methodName = "exitDropEvent";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropFunction(final MariaDBParser.DropFunctionContext ctx) {
    final var methodName = "exitDropFunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropIndex(final MariaDBParser.DropIndexContext ctx) {
    final var methodName = "exitDropIndex";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropLogfileGroup(final MariaDBParser.DropLogfileGroupContext ctx) {
    final var methodName = "exitDropLogfileGroup";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropProcedure(final MariaDBParser.DropProcedureContext ctx) {
    final var methodName = "exitDropProcedure";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropRole(final MariaDBParser.DropRoleContext ctx) {
    final var methodName = "exitDropRole";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropSequence(final MariaDBParser.DropSequenceContext ctx) {
    final var methodName = "exitDropSequence";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropServer(final MariaDBParser.DropServerContext ctx) {
    final var methodName = "exitDropServer";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropTable(final MariaDBParser.DropTableContext ctx) {
    final var methodName = "exitDropTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropTablespace(final MariaDBParser.DropTablespaceContext ctx) {
    final var methodName = "exitDropTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropTrigger(final MariaDBParser.DropTriggerContext ctx) {
    final var methodName = "exitDropTrigger";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropUser(final MariaDBParser.DropUserContext ctx) {
    final var methodName = "exitDropUser";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropView(final MariaDBParser.DropViewContext ctx) {
    final var methodName = "exitDropView";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitElifAlternative(final MariaDBParser.ElifAlternativeContext ctx) {
    final var methodName = "exitElifAlternative";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEmptyStatement_(final MariaDBParser.EmptyStatement_Context ctx) {
    final var methodName = "exitEmptyStatement_";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnableType(final MariaDBParser.EnableTypeContext ctx) {
    final var methodName = "exitEnableType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEncryptedLiteral(final MariaDBParser.EncryptedLiteralContext ctx) {
    final var methodName = "exitEncryptedLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEngineName(final MariaDBParser.EngineNameContext ctx) {
    final var methodName = "exitEngineName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText ->
                currentTable
                    .getAttributes()
                    .put(SqlContextImpl.ENGINE, NotNullSet.getInstance(terminalNodeText)));
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.EngineNameBaseContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText ->
                currentTable
                    .getAttributes()
                    .put(SqlContextImpl.ENGINE, NotNullSet.getInstance(terminalNodeText)));
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEngineNameBase(final MariaDBParser.EngineNameBaseContext ctx) {
    final var methodName = "exitEngineNameBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    final var methodName = "exitEveryRule";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecuteStatement(final MariaDBParser.ExecuteStatementContext ctx) {
    final var methodName = "exitExecuteStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExistsExpressionAtom(final MariaDBParser.ExistsExpressionAtomContext ctx) {
    final var methodName = "exitExistsExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExplainForConnection(final MariaDBParser.ExplainForConnectionContext ctx) {
    final var methodName = "exitExplainForConnection";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionAtomPredicate(final MariaDBParser.ExpressionAtomPredicateContext ctx) {
    final var methodName = "exitExpressionAtomPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionOrDefault(final MariaDBParser.ExpressionOrDefaultContext ctx) {
    final var methodName = "exitExpressionOrDefault";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressions(final MariaDBParser.ExpressionsContext ctx) {
    final var methodName = "exitExpressions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionsWithDefaults(final MariaDBParser.ExpressionsWithDefaultsContext ctx) {
    final var methodName = "exitExpressionsWithDefaults";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExtractFunctionCall(final MariaDBParser.ExtractFunctionCallContext ctx) {
    final var methodName = "exitExtractFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFetchCursor(final MariaDBParser.FetchCursorContext ctx) {
    final var methodName = "exitFetchCursor";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFileSizeLiteral(final MariaDBParser.FileSizeLiteralContext ctx) {
    final var methodName = "exitFileSizeLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlushStatement(final MariaDBParser.FlushStatementContext ctx) {
    final var methodName = "exitFlushStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlushTableOption(final MariaDBParser.FlushTableOptionContext ctx) {
    final var methodName = "exitFlushTableOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForeignKeyTableConstraint(
      final MariaDBParser.ForeignKeyTableConstraintContext ctx) {
    final var methodName = "exitForeignKeyTableConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

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
            .streamChildrenByClass(MariaDBParser.ReferenceDefinitionContext.class)
            .streamChildrenByClass(MariaDBParser.TableNameContext.class)
            .streamChildrenByClass(MariaDBParser.FullIdContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .streamTerminalNodeString()
            .forEach(
                terminalNodeText ->
                    currentRelationship.put(
                        "foreignTable", NotNullSet.getInstance(terminalNodeText)));
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.ReferenceDefinitionContext.class)
            .streamChildrenByClass(MariaDBParser.TableNameContext.class)
            .streamChildrenByClass(MariaDBParser.FullIdContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
            .streamTerminalNodeString()
            .forEach(
                terminalNodeText ->
                    currentRelationship.put(
                        "foreignTable", NotNullSet.getInstance(terminalNodeText)));
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.ReferenceDefinitionContext.class)
            .streamChildrenByClass(MariaDBParser.FullColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.FullIdContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
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
            .streamChildrenByClass(MariaDBParser.ReferenceDefinitionContext.class)
            .streamChildrenByClass(MariaDBParser.FullColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.FullIdContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
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
            .streamChildrenByClass(MariaDBParser.ReferenceDefinitionContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
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
            .streamChildrenByClass(MariaDBParser.ReferenceDefinitionContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
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
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .map(simpleIdContext -> ParseTreeHelper.trimToken(simpleIdContext.getText()))
            .filter(StringUtils::isNoneBlank)
            .forEach(
                SimpleIdText -> {
                  final Set<String> inheritsList;
                  if (currentRelationship.get("column") instanceof Set) {
                    inheritsList = (Set<String>) currentRelationship.get("column");
                  } else {
                    inheritsList = new LinkedHashSet<>();
                  }
                  inheritsList.add(SimpleIdText);

                  currentRelationship.put("column", NotNullSet.getInstance(inheritsList));
                });
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
            .map(simpleIdContext -> ParseTreeHelper.trimToken(simpleIdContext.getText()))
            .filter(StringUtils::isNoneBlank)
            .forEach(
                SimpleIdText -> {
                  final Set<String> inheritsList;
                  if (currentRelationship.get("column") instanceof Set) {
                    inheritsList = (Set<String>) currentRelationship.get("column");
                  } else {
                    inheritsList = new LinkedHashSet<>();
                  }
                  inheritsList.add(SimpleIdText);

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
  public void exitFormatColumnConstraint(final MariaDBParser.FormatColumnConstraintContext ctx) {
    final var methodName = "exitFormatColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFormatJsonStatement(final MariaDBParser.FormatJsonStatementContext ctx) {
    final var methodName = "exitFormatJsonStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrameBetween(final MariaDBParser.FrameBetweenContext ctx) {
    final var methodName = "exitFrameBetween";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrameClause(final MariaDBParser.FrameClauseContext ctx) {
    final var methodName = "exitFrameClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrameExtent(final MariaDBParser.FrameExtentContext ctx) {
    final var methodName = "exitFrameExtent";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrameRange(final MariaDBParser.FrameRangeContext ctx) {
    final var methodName = "exitFrameRange";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrameUnits(final MariaDBParser.FrameUnitsContext ctx) {
    final var methodName = "exitFrameUnits";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFromClause(final MariaDBParser.FromClauseContext ctx) {
    final var methodName = "exitFromClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFullColumnName(final MariaDBParser.FullColumnNameContext ctx) {
    final var methodName = "exitFullColumnName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFullColumnNameExpressionAtom(
      final MariaDBParser.FullColumnNameExpressionAtomContext ctx) {
    final var methodName = "exitFullColumnNameExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFullDescribeStatement(final MariaDBParser.FullDescribeStatementContext ctx) {
    final var methodName = "exitFullDescribeStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFullId(final MariaDBParser.FullIdContext ctx) {
    final var methodName = "exitFullId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionArg(final MariaDBParser.FunctionArgContext ctx) {
    final var methodName = "exitFunctionArg";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionArgs(final MariaDBParser.FunctionArgsContext ctx) {
    final var methodName = "exitFunctionArgs";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionCallExpressionAtom(
      final MariaDBParser.FunctionCallExpressionAtomContext ctx) {
    final var methodName = "exitFunctionCallExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionNameBase(final MariaDBParser.FunctionNameBaseContext ctx) {
    final var methodName = "exitFunctionNameBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionParameter(final MariaDBParser.FunctionParameterContext ctx) {
    final var methodName = "exitFunctionParameter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneratedColumnConstraint(
      final MariaDBParser.GeneratedColumnConstraintContext ctx) {
    final var methodName = "exitGeneratedColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGetFormatFunctionCall(final MariaDBParser.GetFormatFunctionCallContext ctx) {
    final var methodName = "exitGetFormatFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGlobalPrivLevel(final MariaDBParser.GlobalPrivLevelContext ctx) {
    final var methodName = "exitGlobalPrivLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantProxy(final MariaDBParser.GrantProxyContext ctx) {
    final var methodName = "exitGrantProxy";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantStatement(final MariaDBParser.GrantStatementContext ctx) {
    final var methodName = "exitGrantStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupByClause(final MariaDBParser.GroupByClauseContext ctx) {
    final var methodName = "exitGroupByClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupByItem(final MariaDBParser.GroupByItemContext ctx) {
    final var methodName = "exitGroupByItem";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGtidsUntilOption(final MariaDBParser.GtidsUntilOptionContext ctx) {
    final var methodName = "exitGtidsUntilOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGtuidSet(final MariaDBParser.GtuidSetContext ctx) {
    final var methodName = "exitGtuidSet";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerCloseStatement(final MariaDBParser.HandlerCloseStatementContext ctx) {
    final var methodName = "exitHandlerCloseStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionCode(final MariaDBParser.HandlerConditionCodeContext ctx) {
    final var methodName = "exitHandlerConditionCode";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionException(
      final MariaDBParser.HandlerConditionExceptionContext ctx) {
    final var methodName = "exitHandlerConditionException";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionName(final MariaDBParser.HandlerConditionNameContext ctx) {
    final var methodName = "exitHandlerConditionName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionNotfound(
      final MariaDBParser.HandlerConditionNotfoundContext ctx) {
    final var methodName = "exitHandlerConditionNotfound";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionState(final MariaDBParser.HandlerConditionStateContext ctx) {
    final var methodName = "exitHandlerConditionState";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionWarning(final MariaDBParser.HandlerConditionWarningContext ctx) {
    final var methodName = "exitHandlerConditionWarning";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerOpenStatement(final MariaDBParser.HandlerOpenStatementContext ctx) {
    final var methodName = "exitHandlerOpenStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerReadIndexStatement(
      final MariaDBParser.HandlerReadIndexStatementContext ctx) {
    final var methodName = "exitHandlerReadIndexStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerReadStatement(final MariaDBParser.HandlerReadStatementContext ctx) {
    final var methodName = "exitHandlerReadStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerStatement(final MariaDBParser.HandlerStatementContext ctx) {
    final var methodName = "exitHandlerStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHashAuthOption(final MariaDBParser.HashAuthOptionContext ctx) {
    final var methodName = "exitHashAuthOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHavingClause(final MariaDBParser.HavingClauseContext ctx) {
    final var methodName = "exitHavingClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHelpStatement(final MariaDBParser.HelpStatementContext ctx) {
    final var methodName = "exitHelpStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHexadecimalLiteral(final MariaDBParser.HexadecimalLiteralContext ctx) {
    final var methodName = "exitHexadecimalLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHostName(final MariaDBParser.HostNameContext ctx) {
    final var methodName = "exitHostName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIfExists(final MariaDBParser.IfExistsContext ctx) {
    final var methodName = "exitIfExists";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIfNotExists(final MariaDBParser.IfNotExistsContext ctx) {
    final var methodName = "exitIfNotExists";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIfStatement(final MariaDBParser.IfStatementContext ctx) {
    final var methodName = "exitIfStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIgnoreDbReplication(final MariaDBParser.IgnoreDbReplicationContext ctx) {
    final var methodName = "exitIgnoreDbReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIgnoreTableReplication(final MariaDBParser.IgnoreTableReplicationContext ctx) {
    final var methodName = "exitIgnoreTableReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexColumnName(final MariaDBParser.IndexColumnNameContext ctx) {
    final var methodName = "exitIndexColumnName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexColumnNames(final MariaDBParser.IndexColumnNamesContext ctx) {
    final var methodName = "exitIndexColumnNames";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexDeclaration(final MariaDBParser.IndexDeclarationContext ctx) {
    final var methodName = "exitIndexDeclaration";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexHint(final MariaDBParser.IndexHintContext ctx) {
    final var methodName = "exitIndexHint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexHintType(final MariaDBParser.IndexHintTypeContext ctx) {
    final var methodName = "exitIndexHintType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexOption(final MariaDBParser.IndexOptionContext ctx) {
    final var methodName = "exitIndexOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexType(final MariaDBParser.IndexTypeContext ctx) {
    final var methodName = "exitIndexType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInnerJoin(final MariaDBParser.InnerJoinContext ctx) {
    final var methodName = "exitInnerJoin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInPredicate(final MariaDBParser.InPredicateContext ctx) {
    final var methodName = "exitInPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsertStatement(final MariaDBParser.InsertStatementContext ctx) {
    final var methodName = "exitInsertStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsertStatementValue(final MariaDBParser.InsertStatementValueContext ctx) {
    final var methodName = "exitInsertStatementValue";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInstallPlugin(final MariaDBParser.InstallPluginContext ctx) {
    final var methodName = "exitInstallPlugin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalExpr(final MariaDBParser.IntervalExprContext ctx) {
    final var methodName = "exitIntervalExpr";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalExpressionAtom(final MariaDBParser.IntervalExpressionAtomContext ctx) {
    final var methodName = "exitIntervalExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalSchedule(final MariaDBParser.IntervalScheduleContext ctx) {
    final var methodName = "exitIntervalSchedule";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalType(final MariaDBParser.IntervalTypeContext ctx) {
    final var methodName = "exitIntervalType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalTypeBase(final MariaDBParser.IntervalTypeBaseContext ctx) {
    final var methodName = "exitIntervalTypeBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInvisibilityColumnConstraint(
      final MariaDBParser.InvisibilityColumnConstraintContext ctx) {
    final var methodName = "exitInvisibilityColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIsExpression(final MariaDBParser.IsExpressionContext ctx) {
    final var methodName = "exitIsExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIsNullPredicate(final MariaDBParser.IsNullPredicateContext ctx) {
    final var methodName = "exitIsNullPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIterateStatement(final MariaDBParser.IterateStatementContext ctx) {
    final var methodName = "exitIterateStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonColumn(final MariaDBParser.JsonColumnContext ctx) {
    final var methodName = "exitJsonColumn";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonColumnList(final MariaDBParser.JsonColumnListContext ctx) {
    final var methodName = "exitJsonColumnList";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonExpressionAtom(final MariaDBParser.JsonExpressionAtomContext ctx) {
    final var methodName = "exitJsonExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonMemberOfPredicate(final MariaDBParser.JsonMemberOfPredicateContext ctx) {
    final var methodName = "exitJsonMemberOfPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonOnEmpty(final MariaDBParser.JsonOnEmptyContext ctx) {
    final var methodName = "exitJsonOnEmpty";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonOnError(final MariaDBParser.JsonOnErrorContext ctx) {
    final var methodName = "exitJsonOnError";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonOperator(final MariaDBParser.JsonOperatorContext ctx) {
    final var methodName = "exitJsonOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonTable(final MariaDBParser.JsonTableContext ctx) {
    final var methodName = "exitJsonTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonValueFunctionCall(final MariaDBParser.JsonValueFunctionCallContext ctx) {
    final var methodName = "exitJsonValueFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKeywordsCanBeId(final MariaDBParser.KeywordsCanBeIdContext ctx) {
    final var methodName = "exitKeywordsCanBeId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKillStatement(final MariaDBParser.KillStatementContext ctx) {
    final var methodName = "exitKillStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLateralStatement(final MariaDBParser.LateralStatementContext ctx) {
    final var methodName = "exitLateralStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLeaveStatement(final MariaDBParser.LeaveStatementContext ctx) {
    final var methodName = "exitLeaveStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLengthOneDimension(final MariaDBParser.LengthOneDimensionContext ctx) {
    final var methodName = "exitLengthOneDimension";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLengthTwoDimension(final MariaDBParser.LengthTwoDimensionContext ctx) {
    final var methodName = "exitLengthTwoDimension";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLengthTwoOptionalDimension(
      final MariaDBParser.LengthTwoOptionalDimensionContext ctx) {
    final var methodName = "exitLengthTwoOptionalDimension";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevelInWeightListElement(
      final MariaDBParser.LevelInWeightListElementContext ctx) {
    final var methodName = "exitLevelInWeightListElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevelWeightList(final MariaDBParser.LevelWeightListContext ctx) {
    final var methodName = "exitLevelWeightList";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevelWeightRange(final MariaDBParser.LevelWeightRangeContext ctx) {
    final var methodName = "exitLevelWeightRange";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLikePredicate(final MariaDBParser.LikePredicateContext ctx) {
    final var methodName = "exitLikePredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLimitClause(final MariaDBParser.LimitClauseContext ctx) {
    final var methodName = "exitLimitClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLimitClauseAtom(final MariaDBParser.LimitClauseAtomContext ctx) {
    final var methodName = "exitLimitClauseAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoadDataStatement(final MariaDBParser.LoadDataStatementContext ctx) {
    final var methodName = "exitLoadDataStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoadedTableIndexes(final MariaDBParser.LoadedTableIndexesContext ctx) {
    final var methodName = "exitLoadedTableIndexes";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoadIndexIntoCache(final MariaDBParser.LoadIndexIntoCacheContext ctx) {
    final var methodName = "exitLoadIndexIntoCache";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoadXmlStatement(final MariaDBParser.LoadXmlStatementContext ctx) {
    final var methodName = "exitLoadXmlStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockAction(final MariaDBParser.LockActionContext ctx) {
    final var methodName = "exitLockAction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockClause(final MariaDBParser.LockClauseContext ctx) {
    final var methodName = "exitLockClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockOption(final MariaDBParser.LockOptionContext ctx) {
    final var methodName = "exitLockOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockTableElement(final MariaDBParser.LockTableElementContext ctx) {
    final var methodName = "exitLockTableElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockTables(final MariaDBParser.LockTablesContext ctx) {
    final var methodName = "exitLockTables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLogicalExpression(final MariaDBParser.LogicalExpressionContext ctx) {
    final var methodName = "exitLogicalExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLogicalOperator(final MariaDBParser.LogicalOperatorContext ctx) {
    final var methodName = "exitLogicalOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLongVarbinaryDataType(final MariaDBParser.LongVarbinaryDataTypeContext ctx) {
    final var methodName = "exitLongVarbinaryDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLongVarcharDataType(final MariaDBParser.LongVarcharDataTypeContext ctx) {
    final var methodName = "exitLongVarcharDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoopStatement(final MariaDBParser.LoopStatementContext ctx) {
    final var methodName = "exitLoopStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterBoolOption(final MariaDBParser.MasterBoolOptionContext ctx) {
    final var methodName = "exitMasterBoolOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterDecimalOption(final MariaDBParser.MasterDecimalOptionContext ctx) {
    final var methodName = "exitMasterDecimalOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterLogUntilOption(final MariaDBParser.MasterLogUntilOptionContext ctx) {
    final var methodName = "exitMasterLogUntilOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterRealOption(final MariaDBParser.MasterRealOptionContext ctx) {
    final var methodName = "exitMasterRealOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterStringOption(final MariaDBParser.MasterStringOptionContext ctx) {
    final var methodName = "exitMasterStringOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterUidListOption(final MariaDBParser.MasterUidListOptionContext ctx) {
    final var methodName = "exitMasterUidListOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMathExpressionAtom(final MariaDBParser.MathExpressionAtomContext ctx) {
    final var methodName = "exitMathExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMathOperator(final MariaDBParser.MathOperatorContext ctx) {
    final var methodName = "exitMathOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModule(final MariaDBParser.ModuleContext ctx) {
    final var methodName = "exitModule";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModuleAuthOption(final MariaDBParser.ModuleAuthOptionContext ctx) {
    final var methodName = "exitModuleAuthOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMultipleDeleteStatement(final MariaDBParser.MultipleDeleteStatementContext ctx) {
    final var methodName = "exitMultipleDeleteStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMultipleUpdateStatement(final MariaDBParser.MultipleUpdateStatementContext ctx) {
    final var methodName = "exitMultipleUpdateStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMysqlVariable(final MariaDBParser.MysqlVariableContext ctx) {
    final var methodName = "exitMysqlVariable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMysqlVariableExpressionAtom(
      final MariaDBParser.MysqlVariableExpressionAtomContext ctx) {
    final var methodName = "exitMysqlVariableExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNationalStringDataType(final MariaDBParser.NationalStringDataTypeContext ctx) {
    final var methodName = "exitNationalStringDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNationalVaryingStringDataType(
      final MariaDBParser.NationalVaryingStringDataTypeContext ctx) {
    final var methodName = "exitNationalVaryingStringDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNaturalJoin(final MariaDBParser.NaturalJoinContext ctx) {
    final var methodName = "exitNaturalJoin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNestedExpressionAtom(final MariaDBParser.NestedExpressionAtomContext ctx) {
    final var methodName = "exitNestedExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNestedRowExpressionAtom(final MariaDBParser.NestedRowExpressionAtomContext ctx) {
    final var methodName = "exitNestedRowExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNonAggregateFunctionCall(
      final MariaDBParser.NonAggregateFunctionCallContext ctx) {
    final var methodName = "exitNonAggregateFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNonAggregateWindowedFunction(
      final MariaDBParser.NonAggregateWindowedFunctionContext ctx) {
    final var methodName = "exitNonAggregateWindowedFunction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNotExpression(final MariaDBParser.NotExpressionContext ctx) {
    final var methodName = "exitNotExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNullColumnConstraint(final MariaDBParser.NullColumnConstraintContext ctx) {
    final var methodName = "exitNullColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNullNotnull(final MariaDBParser.NullNotnullContext ctx) {
    final var methodName = "exitNullNotnull";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpenCursor(final MariaDBParser.OpenCursorContext ctx) {
    final var methodName = "exitOpenCursor";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptimizeTable(final MariaDBParser.OptimizeTableContext ctx) {
    final var methodName = "exitOptimizeTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrderByClause(final MariaDBParser.OrderByClauseContext ctx) {
    final var methodName = "exitOrderByClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrderByExpression(final MariaDBParser.OrderByExpressionContext ctx) {
    final var methodName = "exitOrderByExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrReplace(final MariaDBParser.OrReplaceContext ctx) {
    final var methodName = "exitOrReplace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOuterJoin(final MariaDBParser.OuterJoinContext ctx) {
    final var methodName = "exitOuterJoin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOverClause(final MariaDBParser.OverClauseContext ctx) {
    final var methodName = "exitOverClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOwnerStatement(final MariaDBParser.OwnerStatementContext ctx) {
    final var methodName = "exitOwnerStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParenthesisSelect(final MariaDBParser.ParenthesisSelectContext ctx) {
    final var methodName = "exitParenthesisSelect";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionClause(final MariaDBParser.PartitionClauseContext ctx) {
    final var methodName = "exitPartitionClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionComparison(final MariaDBParser.PartitionComparisonContext ctx) {
    final var methodName = "exitPartitionComparison";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionDefinerAtom(final MariaDBParser.PartitionDefinerAtomContext ctx) {
    final var methodName = "exitPartitionDefinerAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionDefinerVector(final MariaDBParser.PartitionDefinerVectorContext ctx) {
    final var methodName = "exitPartitionDefinerVector";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionDefinitions(final MariaDBParser.PartitionDefinitionsContext ctx) {
    final var methodName = "exitPartitionDefinitions";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionFunctionHash(final MariaDBParser.PartitionFunctionHashContext ctx) {
    final var methodName = "exitPartitionFunctionHash";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionFunctionKey(final MariaDBParser.PartitionFunctionKeyContext ctx) {
    final var methodName = "exitPartitionFunctionKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionFunctionList(final MariaDBParser.PartitionFunctionListContext ctx) {
    final var methodName = "exitPartitionFunctionList";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionFunctionRange(final MariaDBParser.PartitionFunctionRangeContext ctx) {
    final var methodName = "exitPartitionFunctionRange";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionListAtom(final MariaDBParser.PartitionListAtomContext ctx) {
    final var methodName = "exitPartitionListAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionListVector(final MariaDBParser.PartitionListVectorContext ctx) {
    final var methodName = "exitPartitionListVector";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionComment(final MariaDBParser.PartitionOptionCommentContext ctx) {
    final var methodName = "exitPartitionOptionComment";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionDataDirectory(
      final MariaDBParser.PartitionOptionDataDirectoryContext ctx) {
    final var methodName = "exitPartitionOptionDataDirectory";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionEngine(final MariaDBParser.PartitionOptionEngineContext ctx) {
    final var methodName = "exitPartitionOptionEngine";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionIndexDirectory(
      final MariaDBParser.PartitionOptionIndexDirectoryContext ctx) {
    final var methodName = "exitPartitionOptionIndexDirectory";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionMaxRows(final MariaDBParser.PartitionOptionMaxRowsContext ctx) {
    final var methodName = "exitPartitionOptionMaxRows";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionMinRows(final MariaDBParser.PartitionOptionMinRowsContext ctx) {
    final var methodName = "exitPartitionOptionMinRows";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionNodeGroup(
      final MariaDBParser.PartitionOptionNodeGroupContext ctx) {
    final var methodName = "exitPartitionOptionNodeGroup";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionTablespace(
      final MariaDBParser.PartitionOptionTablespaceContext ctx) {
    final var methodName = "exitPartitionOptionTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionSimple(final MariaDBParser.PartitionSimpleContext ctx) {
    final var methodName = "exitPartitionSimple";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPasswordConnectionOption(
      final MariaDBParser.PasswordConnectionOptionContext ctx) {
    final var methodName = "exitPasswordConnectionOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPasswordFunctionCall(final MariaDBParser.PasswordFunctionCallContext ctx) {
    final var methodName = "exitPasswordFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPasswordFunctionClause(final MariaDBParser.PasswordFunctionClauseContext ctx) {
    final var methodName = "exitPasswordFunctionClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPasswordModuleOption(final MariaDBParser.PasswordModuleOptionContext ctx) {
    final var methodName = "exitPasswordModuleOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPluginDirConnectionOption(
      final MariaDBParser.PluginDirConnectionOptionContext ctx) {
    final var methodName = "exitPluginDirConnectionOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPositionFunctionCall(final MariaDBParser.PositionFunctionCallContext ctx) {
    final var methodName = "exitPositionFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPreciseSchedule(final MariaDBParser.PreciseScheduleContext ctx) {
    final var methodName = "exitPreciseSchedule";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPredicateExpression(final MariaDBParser.PredicateExpressionContext ctx) {
    final var methodName = "exitPredicateExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPreparedStatement(final MariaDBParser.PreparedStatementContext ctx) {
    final var methodName = "exitPreparedStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrepareStatement(final MariaDBParser.PrepareStatementContext ctx) {
    final var methodName = "exitPrepareStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimaryKeyColumnConstraint(
      final MariaDBParser.PrimaryKeyColumnConstraintContext ctx) {
    final var methodName = "exitPrimaryKeyColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimaryKeyTableConstraint(
      final MariaDBParser.PrimaryKeyTableConstraintContext ctx) {
    final var methodName = "exitPrimaryKeyTableConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

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
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivelegeClause(final MariaDBParser.PrivelegeClauseContext ctx) {
    final var methodName = "exitPrivelegeClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilege(final MariaDBParser.PrivilegeContext ctx) {
    final var methodName = "exitPrivilege";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilegesBase(final MariaDBParser.PrivilegesBaseContext ctx) {
    final var methodName = "exitPrivilegesBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProcedureParameter(final MariaDBParser.ProcedureParameterContext ctx) {
    final var methodName = "exitProcedureParameter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProcedureSqlStatement(final MariaDBParser.ProcedureSqlStatementContext ctx) {
    final var methodName = "exitProcedureSqlStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPurgeBinaryLogs(final MariaDBParser.PurgeBinaryLogsContext ctx) {
    final var methodName = "exitPurgeBinaryLogs";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQueryCreateTable(final MariaDBParser.QueryCreateTableContext ctx) {
    final var methodName = "exitQueryCreateTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

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
      ParseTreeStream.parseTreeStream(ctx)
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
  public void exitQueryExpression(final MariaDBParser.QueryExpressionContext ctx) {
    final var methodName = "exitQueryExpression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQueryExpressionNointo(final MariaDBParser.QueryExpressionNointoContext ctx) {
    final var methodName = "exitQueryExpressionNointo";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuerySpecification(final MariaDBParser.QuerySpecificationContext ctx) {
    final var methodName = "exitQuerySpecification";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuerySpecificationNointo(
      final MariaDBParser.QuerySpecificationNointoContext ctx) {
    final var methodName = "exitQuerySpecificationNointo";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReferenceAction(final MariaDBParser.ReferenceActionContext ctx) {
    final var methodName = "exitReferenceAction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReferenceColumnConstraint(
      final MariaDBParser.ReferenceColumnConstraintContext ctx) {
    final var methodName = "exitReferenceColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReferenceControlType(final MariaDBParser.ReferenceControlTypeContext ctx) {
    final var methodName = "exitReferenceControlType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReferenceDefinition(final MariaDBParser.ReferenceDefinitionContext ctx) {
    final var methodName = "exitReferenceDefinition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRegexpPredicate(final MariaDBParser.RegexpPredicateContext ctx) {
    final var methodName = "exitRegexpPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelayLogUntilOption(final MariaDBParser.RelayLogUntilOptionContext ctx) {
    final var methodName = "exitRelayLogUntilOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReleaseStatement(final MariaDBParser.ReleaseStatementContext ctx) {
    final var methodName = "exitReleaseStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRenameTable(final MariaDBParser.RenameTableContext ctx) {
    final var methodName = "exitRenameTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRenameTableClause(final MariaDBParser.RenameTableClauseContext ctx) {
    final var methodName = "exitRenameTableClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRenameUser(final MariaDBParser.RenameUserContext ctx) {
    final var methodName = "exitRenameUser";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRenameUserClause(final MariaDBParser.RenameUserClauseContext ctx) {
    final var methodName = "exitRenameUserClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRepairTable(final MariaDBParser.RepairTableContext ctx) {
    final var methodName = "exitRepairTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRepeatStatement(final MariaDBParser.RepeatStatementContext ctx) {
    final var methodName = "exitRepeatStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplaceStatement(final MariaDBParser.ReplaceStatementContext ctx) {
    final var methodName = "exitReplaceStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplicationStatement(final MariaDBParser.ReplicationStatementContext ctx) {
    final var methodName = "exitReplicationStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResetMaster(final MariaDBParser.ResetMasterContext ctx) {
    final var methodName = "exitResetMaster";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResetSlave(final MariaDBParser.ResetSlaveContext ctx) {
    final var methodName = "exitResetSlave";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResetStatement(final MariaDBParser.ResetStatementContext ctx) {
    final var methodName = "exitResetStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResignalStatement(final MariaDBParser.ResignalStatementContext ctx) {
    final var methodName = "exitResignalStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReturnStatement(final MariaDBParser.ReturnStatementContext ctx) {
    final var methodName = "exitReturnStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevokeProxy(final MariaDBParser.RevokeProxyContext ctx) {
    final var methodName = "exitRevokeProxy";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRewriteDbReplication(final MariaDBParser.RewriteDbReplicationContext ctx) {
    final var methodName = "exitRewriteDbReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoleName(final MariaDBParser.RoleNameContext ctx) {
    final var methodName = "exitRoleName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoleOption(final MariaDBParser.RoleOptionContext ctx) {
    final var methodName = "exitRoleOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoleRevoke(final MariaDBParser.RoleRevokeContext ctx) {
    final var methodName = "exitRoleRevoke";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollbackStatement(final MariaDBParser.RollbackStatementContext ctx) {
    final var methodName = "exitRollbackStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollbackWork(final MariaDBParser.RollbackWorkContext ctx) {
    final var methodName = "exitRollbackWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoot(final MariaDBParser.RootContext ctx) {
    final var methodName = "exitRoot";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineBehavior(final MariaDBParser.RoutineBehaviorContext ctx) {
    final var methodName = "exitRoutineBehavior";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineBody(final MariaDBParser.RoutineBodyContext ctx) {
    final var methodName = "exitRoutineBody";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineComment(final MariaDBParser.RoutineCommentContext ctx) {
    final var methodName = "exitRoutineComment";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineData(final MariaDBParser.RoutineDataContext ctx) {
    final var methodName = "exitRoutineData";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineLanguage(final MariaDBParser.RoutineLanguageContext ctx) {
    final var methodName = "exitRoutineLanguage";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineSecurity(final MariaDBParser.RoutineSecurityContext ctx) {
    final var methodName = "exitRoutineSecurity";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSavepointStatement(final MariaDBParser.SavepointStatementContext ctx) {
    final var methodName = "exitSavepointStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitScalarFunctionCall(final MariaDBParser.ScalarFunctionCallContext ctx) {
    final var methodName = "exitScalarFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitScalarFunctionName(final MariaDBParser.ScalarFunctionNameContext ctx) {
    final var methodName = "exitScalarFunctionName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectColumnElement(final MariaDBParser.SelectColumnElementContext ctx) {
    final var methodName = "exitSelectColumnElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectElements(final MariaDBParser.SelectElementsContext ctx) {
    final var methodName = "exitSelectElements";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectExpressionElement(final MariaDBParser.SelectExpressionElementContext ctx) {
    final var methodName = "exitSelectExpressionElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectFieldsInto(final MariaDBParser.SelectFieldsIntoContext ctx) {
    final var methodName = "exitSelectFieldsInto";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectFunctionElement(final MariaDBParser.SelectFunctionElementContext ctx) {
    final var methodName = "exitSelectFunctionElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectIntoDumpFile(final MariaDBParser.SelectIntoDumpFileContext ctx) {
    final var methodName = "exitSelectIntoDumpFile";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectIntoTextFile(final MariaDBParser.SelectIntoTextFileContext ctx) {
    final var methodName = "exitSelectIntoTextFile";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectIntoVariables(final MariaDBParser.SelectIntoVariablesContext ctx) {
    final var methodName = "exitSelectIntoVariables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectLinesInto(final MariaDBParser.SelectLinesIntoContext ctx) {
    final var methodName = "exitSelectLinesInto";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectSpec(final MariaDBParser.SelectSpecContext ctx) {
    final var methodName = "exitSelectSpec";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectStarElement(final MariaDBParser.SelectStarElementContext ctx) {
    final var methodName = "exitSelectStarElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSequenceSpec(final MariaDBParser.SequenceSpecContext ctx) {
    final var methodName = "exitSequenceSpec";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSerialDefaultColumnConstraint(
      final MariaDBParser.SerialDefaultColumnConstraintContext ctx) {
    final var methodName = "exitSerialDefaultColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitServerOption(final MariaDBParser.ServerOptionContext ctx) {
    final var methodName = "exitServerOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetAutocommit(final MariaDBParser.SetAutocommitContext ctx) {
    final var methodName = "exitSetAutocommit";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetAutocommitStatement(final MariaDBParser.SetAutocommitStatementContext ctx) {
    final var methodName = "exitSetAutocommitStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetCharset(final MariaDBParser.SetCharsetContext ctx) {
    final var methodName = "exitSetCharset";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetNames(final MariaDBParser.SetNamesContext ctx) {
    final var methodName = "exitSetNames";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetNewValueInsideTrigger(
      final MariaDBParser.SetNewValueInsideTriggerContext ctx) {
    final var methodName = "exitSetNewValueInsideTrigger";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetPassword(final MariaDBParser.SetPasswordContext ctx) {
    final var methodName = "exitSetPassword";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetPasswordStatement(final MariaDBParser.SetPasswordStatementContext ctx) {
    final var methodName = "exitSetPasswordStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetRole(final MariaDBParser.SetRoleContext ctx) {
    final var methodName = "exitSetRole";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetStatementFor(final MariaDBParser.SetStatementForContext ctx) {
    final var methodName = "exitSetStatementFor";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetTransaction(final MariaDBParser.SetTransactionContext ctx) {
    final var methodName = "exitSetTransaction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetTransactionStatement(final MariaDBParser.SetTransactionStatementContext ctx) {
    final var methodName = "exitSetTransactionStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetVariable(final MariaDBParser.SetVariableContext ctx) {
    final var methodName = "exitSetVariable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShortRevoke(final MariaDBParser.ShortRevokeContext ctx) {
    final var methodName = "exitShortRevoke";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowBinLogEvents(final MariaDBParser.ShowBinLogEventsContext ctx) {
    final var methodName = "exitShowBinLogEvents";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowColumns(final MariaDBParser.ShowColumnsContext ctx) {
    final var methodName = "exitShowColumns";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCommonEntity(final MariaDBParser.ShowCommonEntityContext ctx) {
    final var methodName = "exitShowCommonEntity";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCountErrors(final MariaDBParser.ShowCountErrorsContext ctx) {
    final var methodName = "exitShowCountErrors";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCreateDb(final MariaDBParser.ShowCreateDbContext ctx) {
    final var methodName = "exitShowCreateDb";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCreateFullIdObject(final MariaDBParser.ShowCreateFullIdObjectContext ctx) {
    final var methodName = "exitShowCreateFullIdObject";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCreatePackage(final MariaDBParser.ShowCreatePackageContext ctx) {
    final var methodName = "exitShowCreatePackage";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCreateUser(final MariaDBParser.ShowCreateUserContext ctx) {
    final var methodName = "exitShowCreateUser";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowEngine(final MariaDBParser.ShowEngineContext ctx) {
    final var methodName = "exitShowEngine";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowErrors(final MariaDBParser.ShowErrorsContext ctx) {
    final var methodName = "exitShowErrors";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowExplain(final MariaDBParser.ShowExplainContext ctx) {
    final var methodName = "exitShowExplain";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowFilter(final MariaDBParser.ShowFilterContext ctx) {
    final var methodName = "exitShowFilter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowGlobalInfo(final MariaDBParser.ShowGlobalInfoContext ctx) {
    final var methodName = "exitShowGlobalInfo";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowGlobalInfoClause(final MariaDBParser.ShowGlobalInfoClauseContext ctx) {
    final var methodName = "exitShowGlobalInfoClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowGrants(final MariaDBParser.ShowGrantsContext ctx) {
    final var methodName = "exitShowGrants";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowIndexes(final MariaDBParser.ShowIndexesContext ctx) {
    final var methodName = "exitShowIndexes";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowInnoDBStatus(final MariaDBParser.ShowInnoDBStatusContext ctx) {
    final var methodName = "exitShowInnoDBStatus";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowMasterLogs(final MariaDBParser.ShowMasterLogsContext ctx) {
    final var methodName = "exitShowMasterLogs";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowObjectFilter(final MariaDBParser.ShowObjectFilterContext ctx) {
    final var methodName = "exitShowObjectFilter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowOpenTables(final MariaDBParser.ShowOpenTablesContext ctx) {
    final var methodName = "exitShowOpenTables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowPackageStatus(final MariaDBParser.ShowPackageStatusContext ctx) {
    final var methodName = "exitShowPackageStatus";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowProfile(final MariaDBParser.ShowProfileContext ctx) {
    final var methodName = "exitShowProfile";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowProfileType(final MariaDBParser.ShowProfileTypeContext ctx) {
    final var methodName = "exitShowProfileType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowRelayLogEvents(final MariaDBParser.ShowRelayLogEventsContext ctx) {
    final var methodName = "exitShowRelayLogEvents";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowRoutine(final MariaDBParser.ShowRoutineContext ctx) {
    final var methodName = "exitShowRoutine";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowSchemaEntity(final MariaDBParser.ShowSchemaEntityContext ctx) {
    final var methodName = "exitShowSchemaEntity";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowSchemaFilter(final MariaDBParser.ShowSchemaFilterContext ctx) {
    final var methodName = "exitShowSchemaFilter";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowSlaveStatus(final MariaDBParser.ShowSlaveStatusContext ctx) {
    final var methodName = "exitShowSlaveStatus";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowUserstatPlugin(final MariaDBParser.ShowUserstatPluginContext ctx) {
    final var methodName = "exitShowUserstatPlugin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShutdownStatement(final MariaDBParser.ShutdownStatementContext ctx) {
    final var methodName = "exitShutdownStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSignalConditionInformation(
      final MariaDBParser.SignalConditionInformationContext ctx) {
    final var methodName = "exitSignalConditionInformation";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSignalStatement(final MariaDBParser.SignalStatementContext ctx) {
    final var methodName = "exitSignalStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleAuthOption(final MariaDBParser.SimpleAuthOptionContext ctx) {
    final var methodName = "exitSimpleAuthOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleDataType(final MariaDBParser.SimpleDataTypeContext ctx) {
    final var methodName = "exitSimpleDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleDescribeStatement(final MariaDBParser.SimpleDescribeStatementContext ctx) {
    final var methodName = "exitSimpleDescribeStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleFlushOption(final MariaDBParser.SimpleFlushOptionContext ctx) {
    final var methodName = "exitSimpleFlushOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleFunctionCall(final MariaDBParser.SimpleFunctionCallContext ctx) {
    final var methodName = "exitSimpleFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleId(final MariaDBParser.SimpleIdContext ctx) {
    final var methodName = "exitSimpleId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleIndexDeclaration(final MariaDBParser.SimpleIndexDeclarationContext ctx) {
    final var methodName = "exitSimpleIndexDeclaration";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleSelect(final MariaDBParser.SimpleSelectContext ctx) {
    final var methodName = "exitSimpleSelect";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleStrings(final MariaDBParser.SimpleStringsContext ctx) {
    final var methodName = "exitSimpleStrings";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleUserName(final MariaDBParser.SimpleUserNameContext ctx) {
    final var methodName = "exitSimpleUserName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSingleDeleteStatement(final MariaDBParser.SingleDeleteStatementContext ctx) {
    final var methodName = "exitSingleDeleteStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSingleUpdateStatement(final MariaDBParser.SingleUpdateStatementContext ctx) {
    final var methodName = "exitSingleUpdateStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSoundsLikePredicate(final MariaDBParser.SoundsLikePredicateContext ctx) {
    final var methodName = "exitSoundsLikePredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSpatialDataType(final MariaDBParser.SpatialDataTypeContext ctx) {
    final var methodName = "exitSpatialDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSpecialIndexDeclaration(final MariaDBParser.SpecialIndexDeclarationContext ctx) {
    final var methodName = "exitSpecialIndexDeclaration";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSpecificFunctionCall(final MariaDBParser.SpecificFunctionCallContext ctx) {
    final var methodName = "exitSpecificFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSqlGapsUntilOption(final MariaDBParser.SqlGapsUntilOptionContext ctx) {
    final var methodName = "exitSqlGapsUntilOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSqlStatement(final MariaDBParser.SqlStatementContext ctx) {
    final var methodName = "exitSqlStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSqlStatements(final MariaDBParser.SqlStatementsContext ctx) {
    final var methodName = "exitSqlStatements";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStartGroupReplication(final MariaDBParser.StartGroupReplicationContext ctx) {
    final var methodName = "exitStartGroupReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStartSlave(final MariaDBParser.StartSlaveContext ctx) {
    final var methodName = "exitStartSlave";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStartTransaction(final MariaDBParser.StartTransactionContext ctx) {
    final var methodName = "exitStartTransaction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStopGroupReplication(final MariaDBParser.StopGroupReplicationContext ctx) {
    final var methodName = "exitStopGroupReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStopSlave(final MariaDBParser.StopSlaveContext ctx) {
    final var methodName = "exitStopSlave";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStorageColumnConstraint(final MariaDBParser.StorageColumnConstraintContext ctx) {
    final var methodName = "exitStorageColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStraightJoin(final MariaDBParser.StraightJoinContext ctx) {
    final var methodName = "exitStraightJoin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStringAuthOption(final MariaDBParser.StringAuthOptionContext ctx) {
    final var methodName = "exitStringAuthOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStringDataType(final MariaDBParser.StringDataTypeContext ctx) {
    final var methodName = "exitStringDataType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStringLiteral(final MariaDBParser.StringLiteralContext ctx) {
    final var methodName = "exitStringLiteral";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStringMasterOption(final MariaDBParser.StringMasterOptionContext ctx) {
    final var methodName = "exitStringMasterOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubpartitionDefinition(final MariaDBParser.SubpartitionDefinitionContext ctx) {
    final var methodName = "exitSubpartitionDefinition";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubPartitionFunctionHash(
      final MariaDBParser.SubPartitionFunctionHashContext ctx) {
    final var methodName = "exitSubPartitionFunctionHash";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubPartitionFunctionKey(final MariaDBParser.SubPartitionFunctionKeyContext ctx) {
    final var methodName = "exitSubPartitionFunctionKey";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubqueryComparisonPredicate(
      final MariaDBParser.SubqueryComparisonPredicateContext ctx) {
    final var methodName = "exitSubqueryComparisonPredicate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubqueryExpressionAtom(final MariaDBParser.SubqueryExpressionAtomContext ctx) {
    final var methodName = "exitSubqueryExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubqueryTableItem(final MariaDBParser.SubqueryTableItemContext ctx) {
    final var methodName = "exitSubqueryTableItem";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubstrFunctionCall(final MariaDBParser.SubstrFunctionCallContext ctx) {
    final var methodName = "exitSubstrFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableFlushOption(final MariaDBParser.TableFlushOptionContext ctx) {
    final var methodName = "exitTableFlushOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableIndexes(final MariaDBParser.TableIndexesContext ctx) {
    final var methodName = "exitTableIndexes";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableJson(final MariaDBParser.TableJsonContext ctx) {
    final var methodName = "exitTableJson";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableName(final MariaDBParser.TableNameContext ctx) {
    final var methodName = "exitTableName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionAutoextendSize(
      final MariaDBParser.TableOptionAutoextendSizeContext ctx) {
    final var methodName = "exitTableOptionAutoextendSize";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionAutoIncrement(
      final MariaDBParser.TableOptionAutoIncrementContext ctx) {
    final var methodName = "exitTableOptionAutoIncrement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionAverage(final MariaDBParser.TableOptionAverageContext ctx) {
    final var methodName = "exitTableOptionAverage";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionCharset(final MariaDBParser.TableOptionCharsetContext ctx) {
    final var methodName = "exitTableOptionCharset";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText ->
                currentTable
                    .getAttributes()
                    .put(SqlContextImpl.CHARSET, NotNullSet.getInstance(terminalNodeText)));

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MariaDBParser.CharsetNameContext.class)
        .streamChildrenByClass(MariaDBParser.CharsetNameBaseContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText ->
                currentTable
                    .getAttributes()
                    .put(SqlContextImpl.CHARSET, NotNullSet.getInstance(terminalNodeText)));
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionChecksum(final MariaDBParser.TableOptionChecksumContext ctx) {
    final var methodName = "exitTableOptionChecksum";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText ->
                currentTable
                    .getAttributes()
                    .put(SqlContextImpl.CHECKSUM, NotNullSet.getInstance(terminalNodeText)));
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionCollate(final MariaDBParser.TableOptionCollateContext ctx) {
    final var methodName = "exitTableOptionCollate";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    final var collationNameText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));

    if (Strings.CI.equals("COLLATE", collationNameText)) {
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(MariaDBParser.CollationNameContext.class)
          .streamChildrenByClass(MariaDBParser.UidContext.class)
          .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
          .streamTerminalNodeString()
          .forEach(
              terminalNodeText ->
                  currentTable
                      .getAttributes()
                      .put(
                          SqlContextImpl.COLLATION_NAME, NotNullSet.getInstance(terminalNodeText)));
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionComment(final MariaDBParser.TableOptionCommentContext ctx) {
    final var methodName = "exitTableOptionComment";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx.getParent())
        .streamTextByClass(
            MariaDBParserListenerImpl.input, MariaDBParser.TableOptionCommentContext.class)
        .forEach(
            intervalText -> {
              final String value;
              if (StringUtils.upperCase(intervalText.replaceAll("\\s", ""), Locale.getDefault())
                  .startsWith("COMMENT=")) {
                value = ParseTreeHelper.trimSingleQuote(intervalText.split("=", 2)[1]);
              } else if (StringUtils.upperCase(intervalText, Locale.getDefault())
                  .startsWith("COMMENT ")) {
                value = ParseTreeHelper.trimSingleQuote(intervalText.split(" ", 2)[1]);
              } else {
                value = ParseTreeHelper.trimSingleQuote(intervalText);
              }
              if (StringUtils.isNoneBlank(value)) {
                currentTable
                    .getAttributes()
                    .put(SqlContextImpl.COMMENT, NotNullSet.getInstance(value));
              }
            });
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionCompression(final MariaDBParser.TableOptionCompressionContext ctx) {
    final var methodName = "exitTableOptionCompression";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionConnection(final MariaDBParser.TableOptionConnectionContext ctx) {
    final var methodName = "exitTableOptionConnection";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionDataDirectory(
      final MariaDBParser.TableOptionDataDirectoryContext ctx) {
    final var methodName = "exitTableOptionDataDirectory";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionDelay(final MariaDBParser.TableOptionDelayContext ctx) {
    final var methodName = "exitTableOptionDelay";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionEncrypted(final MariaDBParser.TableOptionEncryptedContext ctx) {
    final var methodName = "exitTableOptionEncrypted";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionEncryption(final MariaDBParser.TableOptionEncryptionContext ctx) {
    final var methodName = "exitTableOptionEncryption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionEncryptionKeyId(
      final MariaDBParser.TableOptionEncryptionKeyIdContext ctx) {
    final var methodName = "exitTableOptionEncryptionKeyId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionEngine(final MariaDBParser.TableOptionEngineContext ctx) {
    final var methodName = "exitTableOptionEngine";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionEngineAttribute(
      final MariaDBParser.TableOptionEngineAttributeContext ctx) {
    final var methodName = "exitTableOptionEngineAttribute";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionIndexDirectory(
      final MariaDBParser.TableOptionIndexDirectoryContext ctx) {
    final var methodName = "exitTableOptionIndexDirectory";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionInsertMethod(final MariaDBParser.TableOptionInsertMethodContext ctx) {
    final var methodName = "exitTableOptionInsertMethod";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionKeyBlockSize(final MariaDBParser.TableOptionKeyBlockSizeContext ctx) {
    final var methodName = "exitTableOptionKeyBlockSize";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionMaxRows(final MariaDBParser.TableOptionMaxRowsContext ctx) {
    final var methodName = "exitTableOptionMaxRows";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionMinRows(final MariaDBParser.TableOptionMinRowsContext ctx) {
    final var methodName = "exitTableOptionMinRows";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionPackKeys(final MariaDBParser.TableOptionPackKeysContext ctx) {
    final var methodName = "exitTableOptionPackKeys";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionPageCompressed(
      final MariaDBParser.TableOptionPageCompressedContext ctx) {
    final var methodName = "exitTableOptionPageCompressed";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionPageCompressionLevel(
      final MariaDBParser.TableOptionPageCompressionLevelContext ctx) {
    final var methodName = "exitTableOptionPageCompressionLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionPassword(final MariaDBParser.TableOptionPasswordContext ctx) {
    final var methodName = "exitTableOptionPassword";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionPersistent(final MariaDBParser.TableOptionPersistentContext ctx) {
    final var methodName = "exitTableOptionPersistent";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionRecalculation(
      final MariaDBParser.TableOptionRecalculationContext ctx) {
    final var methodName = "exitTableOptionRecalculation";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionRowFormat(final MariaDBParser.TableOptionRowFormatContext ctx) {
    final var methodName = "exitTableOptionRowFormat";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionSamplePage(final MariaDBParser.TableOptionSamplePageContext ctx) {
    final var methodName = "exitTableOptionSamplePage";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionSecondaryEngineAttribute(
      final MariaDBParser.TableOptionSecondaryEngineAttributeContext ctx) {
    final var methodName = "exitTableOptionSecondaryEngineAttribute";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionStartTransaction(
      final MariaDBParser.TableOptionStartTransactionContext ctx) {
    final var methodName = "exitTableOptionStartTransaction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionTablespace(final MariaDBParser.TableOptionTablespaceContext ctx) {
    final var methodName = "exitTableOptionTablespace";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionTableType(final MariaDBParser.TableOptionTableTypeContext ctx) {
    final var methodName = "exitTableOptionTableType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionTransactional(
      final MariaDBParser.TableOptionTransactionalContext ctx) {
    final var methodName = "exitTableOptionTransactional";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText ->
                currentTable
                    .getAttributes()
                    .put(SqlContextImpl.TRANSACTIONAL, NotNullSet.getInstance(terminalNodeText)));
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionUnion(final MariaDBParser.TableOptionUnionContext ctx) {
    final var methodName = "exitTableOptionUnion";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablePair(final MariaDBParser.TablePairContext ctx) {
    final var methodName = "exitTablePair";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTables(final MariaDBParser.TablesContext ctx) {
    final var methodName = "exitTables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSourceBase(final MariaDBParser.TableSourceBaseContext ctx) {
    final var methodName = "exitTableSourceBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSourceNested(final MariaDBParser.TableSourceNestedContext ctx) {
    final var methodName = "exitTableSourceNested";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSources(final MariaDBParser.TableSourcesContext ctx) {
    final var methodName = "exitTableSources";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSourcesItem(final MariaDBParser.TableSourcesItemContext ctx) {
    final var methodName = "exitTableSourcesItem";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespaceStorage(final MariaDBParser.TablespaceStorageContext ctx) {
    final var methodName = "exitTablespaceStorage";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableType(final MariaDBParser.TableTypeContext ctx) {
    final var methodName = "exitTableType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText ->
                currentTable
                    .getAttributes()
                    .put(SqlContextImpl.TABLE_TYPE, NotNullSet.getInstance(terminalNodeText)));
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitThreadType(final MariaDBParser.ThreadTypeContext ctx) {
    final var methodName = "exitThreadType";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTimestampValue(final MariaDBParser.TimestampValueContext ctx) {
    final var methodName = "exitTimestampValue";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTlsOption(final MariaDBParser.TlsOptionContext ctx) {
    final var methodName = "exitTlsOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionLevel(final MariaDBParser.TransactionLevelContext ctx) {
    final var methodName = "exitTransactionLevel";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionLevelBase(final MariaDBParser.TransactionLevelBaseContext ctx) {
    final var methodName = "exitTransactionLevelBase";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionMode(final MariaDBParser.TransactionModeContext ctx) {
    final var methodName = "exitTransactionMode";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionOption(final MariaDBParser.TransactionOptionContext ctx) {
    final var methodName = "exitTransactionOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionStatement(final MariaDBParser.TransactionStatementContext ctx) {
    final var methodName = "exitTransactionStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrimFunctionCall(final MariaDBParser.TrimFunctionCallContext ctx) {
    final var methodName = "exitTrimFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTruncateTable(final MariaDBParser.TruncateTableContext ctx) {
    final var methodName = "exitTruncateTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUdfFunctionCall(final MariaDBParser.UdfFunctionCallContext ctx) {
    final var methodName = "exitUdfFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUid(final MariaDBParser.UidContext ctx) {
    final var methodName = "exitUid";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUidList(final MariaDBParser.UidListContext ctx) {
    final var methodName = "exitUidList";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnaryExpressionAtom(final MariaDBParser.UnaryExpressionAtomContext ctx) {
    final var methodName = "exitUnaryExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnaryOperator(final MariaDBParser.UnaryOperatorContext ctx) {
    final var methodName = "exitUnaryOperator";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUninstallPlugin(final MariaDBParser.UninstallPluginContext ctx) {
    final var methodName = "exitUninstallPlugin";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnionParenthesis(final MariaDBParser.UnionParenthesisContext ctx) {
    final var methodName = "exitUnionParenthesis";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnionParenthesisSelect(final MariaDBParser.UnionParenthesisSelectContext ctx) {
    final var methodName = "exitUnionParenthesisSelect";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnionSelect(final MariaDBParser.UnionSelectContext ctx) {
    final var methodName = "exitUnionSelect";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnionStatement(final MariaDBParser.UnionStatementContext ctx) {
    final var methodName = "exitUnionStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueKeyColumnConstraint(
      final MariaDBParser.UniqueKeyColumnConstraintContext ctx) {
    final var methodName = "exitUniqueKeyColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueKeyTableConstraint(
      final MariaDBParser.UniqueKeyTableConstraintContext ctx) {
    final var methodName = "exitUniqueKeyTableConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnlockTables(final MariaDBParser.UnlockTablesContext ctx) {
    final var methodName = "exitUnlockTables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdatedElement(final MariaDBParser.UpdatedElementContext ctx) {
    final var methodName = "exitUpdatedElement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdateStatement(final MariaDBParser.UpdateStatementContext ctx) {
    final var methodName = "exitUpdateStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserConnectionOption(final MariaDBParser.UserConnectionOptionContext ctx) {
    final var methodName = "exitUserConnectionOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserLockOption(final MariaDBParser.UserLockOptionContext ctx) {
    final var methodName = "exitUserLockOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserName(final MariaDBParser.UserNameContext ctx) {
    final var methodName = "exitUserName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserPasswordOption(final MariaDBParser.UserPasswordOptionContext ctx) {
    final var methodName = "exitUserPasswordOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserResourceOption(final MariaDBParser.UserResourceOptionContext ctx) {
    final var methodName = "exitUserResourceOption";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserSpecification(final MariaDBParser.UserSpecificationContext ctx) {
    final var methodName = "exitUserSpecification";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserVariables(final MariaDBParser.UserVariablesContext ctx) {
    final var methodName = "exitUserVariables";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUseStatement(final MariaDBParser.UseStatementContext ctx) {
    final var methodName = "exitUseStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUtilityStatement(final MariaDBParser.UtilityStatementContext ctx) {
    final var methodName = "exitUtilityStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUuidSet(final MariaDBParser.UuidSetContext ctx) {
    final var methodName = "exitUuidSet";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValuesFunctionCall(final MariaDBParser.ValuesFunctionCallContext ctx) {
    final var methodName = "exitValuesFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValuesStatement(final MariaDBParser.ValuesStatementContext ctx) {
    final var methodName = "exitValuesStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVariableAssignExpressionAtom(
      final MariaDBParser.VariableAssignExpressionAtomContext ctx) {
    final var methodName = "exitVariableAssignExpressionAtom";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVariableClause(final MariaDBParser.VariableClauseContext ctx) {
    final var methodName = "exitVariableClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVisibilityColumnConstraint(
      final MariaDBParser.VisibilityColumnConstraintContext ctx) {
    final var methodName = "exitVisibilityColumnConstraint";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWaitNowaitClause(final MariaDBParser.WaitNowaitClauseContext ctx) {
    final var methodName = "exitWaitNowaitClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWeightFunctionCall(final MariaDBParser.WeightFunctionCallContext ctx) {
    final var methodName = "exitWeightFunctionCall";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhileStatement(final MariaDBParser.WhileStatementContext ctx) {
    final var methodName = "exitWhileStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWildDoTableReplication(final MariaDBParser.WildDoTableReplicationContext ctx) {
    final var methodName = "exitWildDoTableReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWildIgnoreTableReplication(
      final MariaDBParser.WildIgnoreTableReplicationContext ctx) {
    final var methodName = "exitWildIgnoreTableReplication";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindowClause(final MariaDBParser.WindowClauseContext ctx) {
    final var methodName = "exitWindowClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindowName(final MariaDBParser.WindowNameContext ctx) {
    final var methodName = "exitWindowName";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindowSpec(final MariaDBParser.WindowSpecContext ctx) {
    final var methodName = "exitWindowSpec";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithClause(final MariaDBParser.WithClauseContext ctx) {
    final var methodName = "exitWithClause";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithLateralStatement(final MariaDBParser.WithLateralStatementContext ctx) {
    final var methodName = "exitWithLateralStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaCommitWork(final MariaDBParser.XaCommitWorkContext ctx) {
    final var methodName = "exitXaCommitWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaEndTransaction(final MariaDBParser.XaEndTransactionContext ctx) {
    final var methodName = "exitXaEndTransaction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaPrepareStatement(final MariaDBParser.XaPrepareStatementContext ctx) {
    final var methodName = "exitXaPrepareStatement";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaRecoverWork(final MariaDBParser.XaRecoverWorkContext ctx) {
    final var methodName = "exitXaRecoverWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaRollbackWork(final MariaDBParser.XaRollbackWorkContext ctx) {
    final var methodName = "exitXaRollbackWork";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaStartTransaction(final MariaDBParser.XaStartTransactionContext ctx) {
    final var methodName = "exitXaStartTransaction";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXid(final MariaDBParser.XidContext ctx) {
    final var methodName = "exitXid";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXuidStringId(final MariaDBParser.XuidStringIdContext ctx) {
    final var methodName = "exitXuidStringId";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);
  }

  private List<ObjectField> getCurrentFieldList(final ParserRuleContext ctx) {
    final var methodName = "getCurrentFieldList";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    final var uidChildren =
        ParseTreeStream.parseTreeStream(ctx).listChildrenByClass(MariaDBParser.UidContext.class);

    final var terminalNodeList =
        ParseTreeStream.parseTreeStream(uidChildren)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet());
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
            .streamChildrenByClass(MariaDBParser.DataTypeBaseContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
            .streamChildrenByClass(MariaDBParser.ScalarFunctionNameContext.class)
            .streamChildrenByClass(MariaDBParser.FunctionNameBaseContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.PrimaryKeyTableConstraintContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.UniqueKeyTableConstraintContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.UniqueKeyTableConstraintContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MariaDBParser.UniqueKeyTableConstraintContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MariaDBParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MariaDBParser.UidContext.class)
            .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
            .streamChildrenByClass(MariaDBParser.KeywordsCanBeIdContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));

    final var simpleIdChildren =
        ParseTreeStream.parseTreeStream(uidChildren)
            .listChildrenByClass(MariaDBParser.SimpleIdContext.class);

    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(simpleIdChildren)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(simpleIdChildren)
            .streamChildrenByClass(MariaDBParser.DataTypeBaseContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(simpleIdChildren)
            .streamChildrenByClass(MariaDBParser.KeywordsCanBeIdContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(simpleIdChildren)
            .streamChildrenByClass(MariaDBParser.ScalarFunctionNameContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(simpleIdChildren)
            .streamChildrenByClass(MariaDBParser.ScalarFunctionNameContext.class)
            .streamChildrenByClass(MariaDBParser.FunctionNameBaseContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));

    return terminalNodeList.stream()
        .map(child -> ParseTreeHelper.getField(currentTable, child))
        .collect(Collectors.toList());
  }

  private ObjectRelationship getCurrentRelationship(final ParserRuleContext ctx) {
    final var methodName = "getCurrentRelationshipList";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    var allTerminalNodeTextList = (ParseTreeStream.parseTreeStream(ctx).listAllTerminalNodeText());
    final int constraintIndex =
        IntStream.range(0, allTerminalNodeTextList.size())
            .filter(i -> "CONSTRAINT".equalsIgnoreCase(allTerminalNodeTextList.get(i)))
            .findFirst()
            .orElse(-1);
    final int foreignIndex =
        IntStream.range(0, allTerminalNodeTextList.size())
            .filter(i -> "FOREIGN".equalsIgnoreCase(allTerminalNodeTextList.get(i)))
            .findFirst()
            .orElse(-1);
    if (-1 < constraintIndex && constraintIndex + 1 < foreignIndex) {
      return ParseTreeHelper.getRelationship(
          currentTable,
          String.join("_", allTerminalNodeTextList.subList(constraintIndex + 1, foreignIndex)));
    } else {
      final int keyIndex =
          IntStream.range(0, allTerminalNodeTextList.size())
              .filter(i -> "KEY".equalsIgnoreCase(allTerminalNodeTextList.get(i)))
              .findFirst()
              .orElse(-1);
      final int referencesIndex =
          IntStream.range(0, allTerminalNodeTextList.size())
              .filter(i -> "REFERENCES".equalsIgnoreCase(allTerminalNodeTextList.get(i)))
              .findFirst()
              .orElse(-1);
      if (-1 < keyIndex && keyIndex + 1 < referencesIndex) {
        return ParseTreeHelper.getRelationship(
            currentTable,
            String.join("_", allTerminalNodeTextList.subList(keyIndex + 1, referencesIndex)));
      } else if (-1 < referencesIndex) {
        return ParseTreeHelper.getRelationship(
            currentTable, String.join("_", allTerminalNodeTextList.subList(0, 1)));
      }
    }
    return null;
  }

  private SqlContext getCurrentTable(final ParserRuleContext ctx) {
    final var methodName = "getCurrentTable";
    MariaDBParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final List<String> terminalNodeTextList = new ArrayList<>();
    if (ctx instanceof final MariaDBParser.CopyCreateTableContext copyCreateTableContext) {
      final var likeFound = new MutableBoolean(false);
      ParseTreeStream.parseTreeStream(copyCreateTableContext)
          .forEach(
              copyCreateTableChild -> {
                if (copyCreateTableChild instanceof final TerminalNode terminalNode) {
                  likeFound.setValue(Strings.CI.equals("like", terminalNode.getText()));
                }
                if (copyCreateTableChild
                        instanceof final MariaDBParser.TableNameContext tableNameContext
                    && !likeFound.booleanValue()) {
                  ParseTreeStream.parseTreeStream(tableNameContext)
                      .streamChildrenByClass(MariaDBParser.FullIdContext.class)
                      .streamChildrenByClass(MariaDBParser.UidContext.class)
                      .streamTerminalNodeString()
                      .forEach(terminalNodeTextList::add);
                  ParseTreeStream.parseTreeStream(tableNameContext)
                      .streamChildrenByClass(MariaDBParser.FullIdContext.class)
                      .streamChildrenByClass(MariaDBParser.UidContext.class)
                      .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
                      .streamTerminalNodeString()
                      .forEach(terminalNodeTextList::add);
                }
              });
    }

    var parentContext =
        ParseTreeHelper.getParentContext(ctx, MariaDBParser.ColumnCreateTableContext.class);
    if (parentContext != null && parentContext.children != null) {
      final var uidChildren =
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(MariaDBParser.TableNameContext.class)
              .streamChildrenByClass(MariaDBParser.FullIdContext.class)
              .listChildrenByClass(MariaDBParser.UidContext.class);
      final var simpleIdChildren =
          ParseTreeStream.parseTreeStream(uidChildren)
              .listChildrenByClass(MariaDBParser.SimpleIdContext.class);

      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(simpleIdChildren).streamTerminalNodeString().toList());
      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(MariaDBParser.TableNameContext.class)
              .streamChildrenByClass(MariaDBParser.FullIdContext.class)
              .streamTerminalNodeString()
              .toList());
      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(uidChildren).streamTerminalNodeString().toList());
      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(simpleIdChildren)
              .streamChildrenByClass(MariaDBParser.KeywordsCanBeIdContext.class)
              .streamTerminalNodeString()
              .toList());
      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(simpleIdChildren)
              .streamChildrenByClass(MariaDBParser.ScalarFunctionNameContext.class)
              .streamChildrenByClass(MariaDBParser.FunctionNameBaseContext.class)
              .streamTerminalNodeString()
              .toList());
    }
    parentContext =
        ParseTreeHelper.getParentContext(ctx, MariaDBParser.QueryCreateTableContext.class);
    if (parentContext != null && parentContext.children != null) {
      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(MariaDBParser.TableNameContext.class)
              .streamChildrenByClass(MariaDBParser.FullIdContext.class)
              .streamChildrenByClass(MariaDBParser.UidContext.class)
              .streamChildrenByClass(MariaDBParser.SimpleIdContext.class)
              .streamTerminalNodeString()
              .toList());
    }

    if (terminalNodeTextList.isEmpty()) {
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
  public void visitErrorNode(final ErrorNode node) {
    final var methodName = "visitErrorNode";
    MariaDBParserListenerImpl.traceChildren(methodName, node);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void visitTerminal(final TerminalNode node) {
    final var methodName = "visitTerminal";
    MariaDBParserListenerImpl.traceChildren(methodName, node);

    MariaDBParserListenerImpl.input = node.getSymbol().getInputStream();
  }
}
