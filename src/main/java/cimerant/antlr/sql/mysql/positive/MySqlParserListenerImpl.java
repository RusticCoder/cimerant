package cimerant.antlr.sql.mysql.positive;

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
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
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
import org.apache.commons.lang3.Strings;
import org.apache.commons.lang3.mutable.MutableBoolean;
import sql.mysql.positive.MySqlParser;
import sql.mysql.positive.MySqlParserBaseListener;
import sql.mysql.positive.MySqlParserListener;

/**
 * This class provides an empty implementation of {@link MySqlParserListener}, which can be extended
 * to create a listener which only needs to handle a subset of the available methods.
 */
public class MySqlParserListenerImpl extends MySqlParserBaseListener {
  private static CharStream input;
  private static final CimerantLogger logger;

  static {
    logger = CimerantLogger.getLogger(MySqlParserListenerImpl.class.getName());
  }

  private static void traceChildren(final String methodName, final ParseTree ctx) {
    if (MySqlParserListenerImpl.logger.isTraceEnabled()) {
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
  public void enterAddOperator(final MySqlParser.AddOperatorContext ctx) {
    final var methodName = "enterAddOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAdministrationStatement(final MySqlParser.AdministrationStatementContext ctx) {
    final var methodName = "enterAdministrationStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggregateFunctionCall(final MySqlParser.AggregateFunctionCallContext ctx) {
    final var methodName = "enterAggregateFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAggregateWindowedFunction(
      final MySqlParser.AggregateWindowedFunctionContext ctx) {
    final var methodName = "enterAggregateWindowedFunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddCheckTableConstraint(
      final MySqlParser.AlterByAddCheckTableConstraintContext ctx) {
    final var methodName = "enterAlterByAddCheckTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddColumn(final MySqlParser.AlterByAddColumnContext ctx) {
    final var methodName = "enterAlterByAddColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddColumns(final MySqlParser.AlterByAddColumnsContext ctx) {
    final var methodName = "enterAlterByAddColumns";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddDefinitions(final MySqlParser.AlterByAddDefinitionsContext ctx) {
    final var methodName = "enterAlterByAddDefinitions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddForeignKey(final MySqlParser.AlterByAddForeignKeyContext ctx) {
    final var methodName = "enterAlterByAddForeignKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddIndex(final MySqlParser.AlterByAddIndexContext ctx) {
    final var methodName = "enterAlterByAddIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddPartition(final MySqlParser.AlterByAddPartitionContext ctx) {
    final var methodName = "enterAlterByAddPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddPrimaryKey(final MySqlParser.AlterByAddPrimaryKeyContext ctx) {
    final var methodName = "enterAlterByAddPrimaryKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddSpecialIndex(final MySqlParser.AlterByAddSpecialIndexContext ctx) {
    final var methodName = "enterAlterByAddSpecialIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAddUniqueKey(final MySqlParser.AlterByAddUniqueKeyContext ctx) {
    final var methodName = "enterAlterByAddUniqueKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAlterCheckTableConstraint(
      final MySqlParser.AlterByAlterCheckTableConstraintContext ctx) {
    final var methodName = "enterAlterByAlterCheckTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAlterColumnDefault(
      final MySqlParser.AlterByAlterColumnDefaultContext ctx) {
    final var methodName = "enterAlterByAlterColumnDefault";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAlterIndexVisibility(
      final MySqlParser.AlterByAlterIndexVisibilityContext ctx) {
    final var methodName = "enterAlterByAlterIndexVisibility";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByAnalyzePartition(final MySqlParser.AlterByAnalyzePartitionContext ctx) {
    final var methodName = "enterAlterByAnalyzePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByChangeColumn(final MySqlParser.AlterByChangeColumnContext ctx) {
    final var methodName = "enterAlterByChangeColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByChangeDefault(final MySqlParser.AlterByChangeDefaultContext ctx) {
    final var methodName = "enterAlterByChangeDefault";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByCheckPartition(final MySqlParser.AlterByCheckPartitionContext ctx) {
    final var methodName = "enterAlterByCheckPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByCoalescePartition(final MySqlParser.AlterByCoalescePartitionContext ctx) {
    final var methodName = "enterAlterByCoalescePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByConvertCharset(final MySqlParser.AlterByConvertCharsetContext ctx) {
    final var methodName = "enterAlterByConvertCharset";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDefaultCharset(final MySqlParser.AlterByDefaultCharsetContext ctx) {
    final var methodName = "enterAlterByDefaultCharset";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDisableKeys(final MySqlParser.AlterByDisableKeysContext ctx) {
    final var methodName = "enterAlterByDisableKeys";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDiscardPartition(final MySqlParser.AlterByDiscardPartitionContext ctx) {
    final var methodName = "enterAlterByDiscardPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDiscardTablespace(final MySqlParser.AlterByDiscardTablespaceContext ctx) {
    final var methodName = "enterAlterByDiscardTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropColumn(final MySqlParser.AlterByDropColumnContext ctx) {
    final var methodName = "enterAlterByDropColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropConstraintCheck(
      final MySqlParser.AlterByDropConstraintCheckContext ctx) {
    final var methodName = "enterAlterByDropConstraintCheck";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropForeignKey(final MySqlParser.AlterByDropForeignKeyContext ctx) {
    final var methodName = "enterAlterByDropForeignKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropIndex(final MySqlParser.AlterByDropIndexContext ctx) {
    final var methodName = "enterAlterByDropIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropPartition(final MySqlParser.AlterByDropPartitionContext ctx) {
    final var methodName = "enterAlterByDropPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByDropPrimaryKey(final MySqlParser.AlterByDropPrimaryKeyContext ctx) {
    final var methodName = "enterAlterByDropPrimaryKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByEnableKeys(final MySqlParser.AlterByEnableKeysContext ctx) {
    final var methodName = "enterAlterByEnableKeys";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByExchangePartition(final MySqlParser.AlterByExchangePartitionContext ctx) {
    final var methodName = "enterAlterByExchangePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByForce(final MySqlParser.AlterByForceContext ctx) {
    final var methodName = "enterAlterByForce";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByImportPartition(final MySqlParser.AlterByImportPartitionContext ctx) {
    final var methodName = "enterAlterByImportPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByImportTablespace(final MySqlParser.AlterByImportTablespaceContext ctx) {
    final var methodName = "enterAlterByImportTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByLock(final MySqlParser.AlterByLockContext ctx) {
    final var methodName = "enterAlterByLock";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByModifyColumn(final MySqlParser.AlterByModifyColumnContext ctx) {
    final var methodName = "enterAlterByModifyColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByOptimizePartition(final MySqlParser.AlterByOptimizePartitionContext ctx) {
    final var methodName = "enterAlterByOptimizePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByOrder(final MySqlParser.AlterByOrderContext ctx) {
    final var methodName = "enterAlterByOrder";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRebuildPartition(final MySqlParser.AlterByRebuildPartitionContext ctx) {
    final var methodName = "enterAlterByRebuildPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRemovePartitioning(
      final MySqlParser.AlterByRemovePartitioningContext ctx) {
    final var methodName = "enterAlterByRemovePartitioning";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRename(final MySqlParser.AlterByRenameContext ctx) {
    final var methodName = "enterAlterByRename";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRenameColumn(final MySqlParser.AlterByRenameColumnContext ctx) {
    final var methodName = "enterAlterByRenameColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRenameIndex(final MySqlParser.AlterByRenameIndexContext ctx) {
    final var methodName = "enterAlterByRenameIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByReorganizePartition(
      final MySqlParser.AlterByReorganizePartitionContext ctx) {
    final var methodName = "enterAlterByReorganizePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByRepairPartition(final MySqlParser.AlterByRepairPartitionContext ctx) {
    final var methodName = "enterAlterByRepairPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterBySetAlgorithm(final MySqlParser.AlterBySetAlgorithmContext ctx) {
    final var methodName = "enterAlterBySetAlgorithm";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByTableOption(final MySqlParser.AlterByTableOptionContext ctx) {
    final var methodName = "enterAlterByTableOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByTruncatePartition(final MySqlParser.AlterByTruncatePartitionContext ctx) {
    final var methodName = "enterAlterByTruncatePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByUpgradePartitioning(
      final MySqlParser.AlterByUpgradePartitioningContext ctx) {
    final var methodName = "enterAlterByUpgradePartitioning";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterByValidate(final MySqlParser.AlterByValidateContext ctx) {
    final var methodName = "enterAlterByValidate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterEvent(final MySqlParser.AlterEventContext ctx) {
    final var methodName = "enterAlterEvent";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterFunction(final MySqlParser.AlterFunctionContext ctx) {
    final var methodName = "enterAlterFunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterInstance(final MySqlParser.AlterInstanceContext ctx) {
    final var methodName = "enterAlterInstance";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterLogfileGroup(final MySqlParser.AlterLogfileGroupContext ctx) {
    final var methodName = "enterAlterLogfileGroup";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterPartition(final MySqlParser.AlterPartitionContext ctx) {
    final var methodName = "enterAlterPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterProcedure(final MySqlParser.AlterProcedureContext ctx) {
    final var methodName = "enterAlterProcedure";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterServer(final MySqlParser.AlterServerContext ctx) {
    final var methodName = "enterAlterServer";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterSimpleDatabase(final MySqlParser.AlterSimpleDatabaseContext ctx) {
    final var methodName = "enterAlterSimpleDatabase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterTable(final MySqlParser.AlterTableContext ctx) {
    final var methodName = "enterAlterTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterTablespace(final MySqlParser.AlterTablespaceContext ctx) {
    final var methodName = "enterAlterTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterUpgradeName(final MySqlParser.AlterUpgradeNameContext ctx) {
    final var methodName = "enterAlterUpgradeName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterUserMysqlV56(final MySqlParser.AlterUserMysqlV56Context ctx) {
    final var methodName = "enterAlterUserMysqlV56";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterUserMysqlV80(final MySqlParser.AlterUserMysqlV80Context ctx) {
    final var methodName = "enterAlterUserMysqlV80";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAlterView(final MySqlParser.AlterViewContext ctx) {
    final var methodName = "enterAlterView";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAnalyzeTable(final MySqlParser.AnalyzeTableContext ctx) {
    final var methodName = "enterAnalyzeTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAssignmentField(final MySqlParser.AssignmentFieldContext ctx) {
    final var methodName = "enterAssignmentField";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAtomTableItem(final MySqlParser.AtomTableItemContext ctx) {
    final var methodName = "enterAtomTableItem";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAuthOptionClause(final MySqlParser.AuthOptionClauseContext ctx) {
    final var methodName = "enterAuthOptionClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAuthPlugin(final MySqlParser.AuthPluginContext ctx) {
    final var methodName = "enterAuthPlugin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterAutoIncrementColumnConstraint(
      final MySqlParser.AutoIncrementColumnConstraintContext ctx) {
    final var methodName = "enterAutoIncrementColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBeginWork(final MySqlParser.BeginWorkContext ctx) {
    final var methodName = "enterBeginWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBetweenPredicate(final MySqlParser.BetweenPredicateContext ctx) {
    final var methodName = "enterBetweenPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBinaryComparisonPredicate(
      final MySqlParser.BinaryComparisonPredicateContext ctx) {
    final var methodName = "enterBinaryComparisonPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBinaryExpressionAtom(final MySqlParser.BinaryExpressionAtomContext ctx) {
    final var methodName = "enterBinaryExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBinlogStatement(final MySqlParser.BinlogStatementContext ctx) {
    final var methodName = "enterBinlogStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBitExpressionAtom(final MySqlParser.BitExpressionAtomContext ctx) {
    final var methodName = "enterBitExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBitOperator(final MySqlParser.BitOperatorContext ctx) {
    final var methodName = "enterBitOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBlockStatement(final MySqlParser.BlockStatementContext ctx) {
    final var methodName = "enterBlockStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBooleanLiteral(final MySqlParser.BooleanLiteralContext ctx) {
    final var methodName = "enterBooleanLiteral";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterBoolMasterOption(final MySqlParser.BoolMasterOptionContext ctx) {
    final var methodName = "enterBoolMasterOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCacheIndexStatement(final MySqlParser.CacheIndexStatementContext ctx) {
    final var methodName = "enterCacheIndexStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCallStatement(final MySqlParser.CallStatementContext ctx) {
    final var methodName = "enterCallStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseAlternative(final MySqlParser.CaseAlternativeContext ctx) {
    final var methodName = "enterCaseAlternative";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseExpressionFunctionCall(
      final MySqlParser.CaseExpressionFunctionCallContext ctx) {
    final var methodName = "enterCaseExpressionFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseFuncAlternative(final MySqlParser.CaseFuncAlternativeContext ctx) {
    final var methodName = "enterCaseFuncAlternative";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseFunctionCall(final MySqlParser.CaseFunctionCallContext ctx) {
    final var methodName = "enterCaseFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCaseStatement(final MySqlParser.CaseStatementContext ctx) {
    final var methodName = "enterCaseStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChangeMaster(final MySqlParser.ChangeMasterContext ctx) {
    final var methodName = "enterChangeMaster";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChangeReplicationFilter(final MySqlParser.ChangeReplicationFilterContext ctx) {
    final var methodName = "enterChangeReplicationFilter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChannelFlushOption(final MySqlParser.ChannelFlushOptionContext ctx) {
    final var methodName = "enterChannelFlushOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChannelOption(final MySqlParser.ChannelOptionContext ctx) {
    final var methodName = "enterChannelOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharFunctionCall(final MySqlParser.CharFunctionCallContext ctx) {
    final var methodName = "enterCharFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharSet(final MySqlParser.CharSetContext ctx) {
    final var methodName = "enterCharSet";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharsetName(final MySqlParser.CharsetNameContext ctx) {
    final var methodName = "enterCharsetName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCharsetNameBase(final MySqlParser.CharsetNameBaseContext ctx) {
    final var methodName = "enterCharsetNameBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheckColumnConstraint(final MySqlParser.CheckColumnConstraintContext ctx) {
    final var methodName = "enterCheckColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterChecksumTable(final MySqlParser.ChecksumTableContext ctx) {
    final var methodName = "enterChecksumTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheckTable(final MySqlParser.CheckTableContext ctx) {
    final var methodName = "enterCheckTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheckTableConstraint(final MySqlParser.CheckTableConstraintContext ctx) {
    final var methodName = "enterCheckTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCheckTableOption(final MySqlParser.CheckTableOptionContext ctx) {
    final var methodName = "enterCheckTableOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCloseCursor(final MySqlParser.CloseCursorContext ctx) {
    final var methodName = "enterCloseCursor";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollateColumnConstraint(final MySqlParser.CollateColumnConstraintContext ctx) {
    final var methodName = "enterCollateColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollateExpressionAtom(final MySqlParser.CollateExpressionAtomContext ctx) {
    final var methodName = "enterCollateExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollationName(final MySqlParser.CollationNameContext ctx) {
    final var methodName = "enterCollationName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollectionDataType(final MySqlParser.CollectionDataTypeContext ctx) {
    final var methodName = "enterCollectionDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCollectionOptions(final MySqlParser.CollectionOptionsContext ctx) {
    final var methodName = "enterCollectionOptions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnCreateTable(final MySqlParser.ColumnCreateTableContext ctx) {
    final var methodName = "enterColumnCreateTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnDeclaration(final MySqlParser.ColumnDeclarationContext ctx) {
    final var methodName = "enterColumnDeclaration";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterColumnDefinition(final MySqlParser.ColumnDefinitionContext ctx) {
    final var methodName = "enterColumnDefinition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommentColumnConstraint(final MySqlParser.CommentColumnConstraintContext ctx) {
    final var methodName = "enterCommentColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommitWork(final MySqlParser.CommitWorkContext ctx) {
    final var methodName = "enterCommitWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCommonTableExpressions(final MySqlParser.CommonTableExpressionsContext ctx) {
    final var methodName = "enterCommonTableExpressions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterComparisonOperator(final MySqlParser.ComparisonOperatorContext ctx) {
    final var methodName = "enterComparisonOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCompoundStatement(final MySqlParser.CompoundStatementContext ctx) {
    final var methodName = "enterCompoundStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstant(final MySqlParser.ConstantContext ctx) {
    final var methodName = "enterConstant";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstantExpressionAtom(final MySqlParser.ConstantExpressionAtomContext ctx) {
    final var methodName = "enterConstantExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstants(final MySqlParser.ConstantsContext ctx) {
    final var methodName = "enterConstants";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConstraintDeclaration(final MySqlParser.ConstraintDeclarationContext ctx) {
    final var methodName = "enterConstraintDeclaration";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterConvertedDataType(final MySqlParser.ConvertedDataTypeContext ctx) {
    final var methodName = "enterConvertedDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCopyCreateTable(final MySqlParser.CopyCreateTableContext ctx) {
    final var methodName = "enterCopyCreateTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateDatabase(final MySqlParser.CreateDatabaseContext ctx) {
    final var methodName = "enterCreateDatabase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateDatabaseOption(final MySqlParser.CreateDatabaseOptionContext ctx) {
    final var methodName = "enterCreateDatabaseOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateDefinitions(final MySqlParser.CreateDefinitionsContext ctx) {
    final var methodName = "enterCreateDefinitions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateEvent(final MySqlParser.CreateEventContext ctx) {
    final var methodName = "enterCreateEvent";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateFunction(final MySqlParser.CreateFunctionContext ctx) {
    final var methodName = "enterCreateFunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateIndex(final MySqlParser.CreateIndexContext ctx) {
    final var methodName = "enterCreateIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateLogfileGroup(final MySqlParser.CreateLogfileGroupContext ctx) {
    final var methodName = "enterCreateLogfileGroup";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateProcedure(final MySqlParser.CreateProcedureContext ctx) {
    final var methodName = "enterCreateProcedure";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateRole(final MySqlParser.CreateRoleContext ctx) {
    final var methodName = "enterCreateRole";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateServer(final MySqlParser.CreateServerContext ctx) {
    final var methodName = "enterCreateServer";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTablespaceInnodb(final MySqlParser.CreateTablespaceInnodbContext ctx) {
    final var methodName = "enterCreateTablespaceInnodb";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTablespaceNdb(final MySqlParser.CreateTablespaceNdbContext ctx) {
    final var methodName = "enterCreateTablespaceNdb";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateTrigger(final MySqlParser.CreateTriggerContext ctx) {
    final var methodName = "enterCreateTrigger";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateUdfunction(final MySqlParser.CreateUdfunctionContext ctx) {
    final var methodName = "enterCreateUdfunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateUserMysqlV56(final MySqlParser.CreateUserMysqlV56Context ctx) {
    final var methodName = "enterCreateUserMysqlV56";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateUserMysqlV80(final MySqlParser.CreateUserMysqlV80Context ctx) {
    final var methodName = "enterCreateUserMysqlV80";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCreateView(final MySqlParser.CreateViewContext ctx) {
    final var methodName = "enterCreateView";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCteColumnName(final MySqlParser.CteColumnNameContext ctx) {
    final var methodName = "enterCteColumnName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCteName(final MySqlParser.CteNameContext ctx) {
    final var methodName = "enterCteName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCurrentSchemaPriviLevel(final MySqlParser.CurrentSchemaPriviLevelContext ctx) {
    final var methodName = "enterCurrentSchemaPriviLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCurrentTimestamp(final MySqlParser.CurrentTimestampContext ctx) {
    final var methodName = "enterCurrentTimestamp";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCurrentUser(final MySqlParser.CurrentUserContext ctx) {
    final var methodName = "enterCurrentUser";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterCurrentUserExpression(final MySqlParser.CurrentUserExpressionContext ctx) {
    final var methodName = "enterCurrentUserExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDataTypeBase(final MySqlParser.DataTypeBaseContext ctx) {
    final var methodName = "enterDataTypeBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDataTypeFunctionCall(final MySqlParser.DataTypeFunctionCallContext ctx) {
    final var methodName = "enterDataTypeFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDdlStatement(final MySqlParser.DdlStatementContext ctx) {
    final var methodName = "enterDdlStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeallocatePrepare(final MySqlParser.DeallocatePrepareContext ctx) {
    final var methodName = "enterDeallocatePrepare";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecimalLiteral(final MySqlParser.DecimalLiteralContext ctx) {
    final var methodName = "enterDecimalLiteral";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDecimalMasterOption(final MySqlParser.DecimalMasterOptionContext ctx) {
    final var methodName = "enterDecimalMasterOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeclareCondition(final MySqlParser.DeclareConditionContext ctx) {
    final var methodName = "enterDeclareCondition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeclareCursor(final MySqlParser.DeclareCursorContext ctx) {
    final var methodName = "enterDeclareCursor";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeclareHandler(final MySqlParser.DeclareHandlerContext ctx) {
    final var methodName = "enterDeclareHandler";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeclareVariable(final MySqlParser.DeclareVariableContext ctx) {
    final var methodName = "enterDeclareVariable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefaultAuthConnectionOption(
      final MySqlParser.DefaultAuthConnectionOptionContext ctx) {
    final var methodName = "enterDefaultAuthConnectionOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefaultColumnConstraint(final MySqlParser.DefaultColumnConstraintContext ctx) {
    final var methodName = "enterDefaultColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefaultValue(final MySqlParser.DefaultValueContext ctx) {
    final var methodName = "enterDefaultValue";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefiniteFullTablePrivLevel(
      final MySqlParser.DefiniteFullTablePrivLevelContext ctx) {
    final var methodName = "enterDefiniteFullTablePrivLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefiniteFullTablePrivLevel2(
      final MySqlParser.DefiniteFullTablePrivLevel2Context ctx) {
    final var methodName = "enterDefiniteFullTablePrivLevel2";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefiniteSchemaPrivLevel(final MySqlParser.DefiniteSchemaPrivLevelContext ctx) {
    final var methodName = "enterDefiniteSchemaPrivLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDefiniteTablePrivLevel(final MySqlParser.DefiniteTablePrivLevelContext ctx) {
    final var methodName = "enterDefiniteTablePrivLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDeleteStatement(final MySqlParser.DeleteStatementContext ctx) {
    final var methodName = "enterDeleteStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribeConnection(final MySqlParser.DescribeConnectionContext ctx) {
    final var methodName = "enterDescribeConnection";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDescribeStatements(final MySqlParser.DescribeStatementsContext ctx) {
    final var methodName = "enterDescribeStatements";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDetailRevoke(final MySqlParser.DetailRevokeContext ctx) {
    final var methodName = "enterDetailRevoke";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDiagnosticsConditionInformationName(
      final MySqlParser.DiagnosticsConditionInformationNameContext ctx) {
    final var methodName = "enterDiagnosticsConditionInformationName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDiagnosticsStatement(final MySqlParser.DiagnosticsStatementContext ctx) {
    final var methodName = "enterDiagnosticsStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDimensionDataType(final MySqlParser.DimensionDataTypeContext ctx) {
    final var methodName = "enterDimensionDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDmlStatement(final MySqlParser.DmlStatementContext ctx) {
    final var methodName = "enterDmlStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDoDbReplication(final MySqlParser.DoDbReplicationContext ctx) {
    final var methodName = "enterDoDbReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDoStatement(final MySqlParser.DoStatementContext ctx) {
    final var methodName = "enterDoStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDoTableReplication(final MySqlParser.DoTableReplicationContext ctx) {
    final var methodName = "enterDoTableReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDottedId(final MySqlParser.DottedIdContext ctx) {
    final var methodName = "enterDottedId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropDatabase(final MySqlParser.DropDatabaseContext ctx) {
    final var methodName = "enterDropDatabase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropEvent(final MySqlParser.DropEventContext ctx) {
    final var methodName = "enterDropEvent";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropFunction(final MySqlParser.DropFunctionContext ctx) {
    final var methodName = "enterDropFunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropIndex(final MySqlParser.DropIndexContext ctx) {
    final var methodName = "enterDropIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropLogfileGroup(final MySqlParser.DropLogfileGroupContext ctx) {
    final var methodName = "enterDropLogfileGroup";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropProcedure(final MySqlParser.DropProcedureContext ctx) {
    final var methodName = "enterDropProcedure";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropRole(final MySqlParser.DropRoleContext ctx) {
    final var methodName = "enterDropRole";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropServer(final MySqlParser.DropServerContext ctx) {
    final var methodName = "enterDropServer";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropTable(final MySqlParser.DropTableContext ctx) {
    final var methodName = "enterDropTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropTablespace(final MySqlParser.DropTablespaceContext ctx) {
    final var methodName = "enterDropTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropTrigger(final MySqlParser.DropTriggerContext ctx) {
    final var methodName = "enterDropTrigger";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropUser(final MySqlParser.DropUserContext ctx) {
    final var methodName = "enterDropUser";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterDropView(final MySqlParser.DropViewContext ctx) {
    final var methodName = "enterDropView";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterElifAlternative(final MySqlParser.ElifAlternativeContext ctx) {
    final var methodName = "enterElifAlternative";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEmptyStatement_(final MySqlParser.EmptyStatement_Context ctx) {
    final var methodName = "enterEmptyStatement_";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEnableType(final MySqlParser.EnableTypeContext ctx) {
    final var methodName = "enterEnableType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEngineName(final MySqlParser.EngineNameContext ctx) {
    final var methodName = "enterEngineName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEngineNameBase(final MySqlParser.EngineNameBaseContext ctx) {
    final var methodName = "enterEngineNameBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    final var methodName = "enterEveryRule";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExecuteStatement(final MySqlParser.ExecuteStatementContext ctx) {
    final var methodName = "enterExecuteStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExistsExpressionAtom(final MySqlParser.ExistsExpressionAtomContext ctx) {
    final var methodName = "enterExistsExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionAtomPredicate(final MySqlParser.ExpressionAtomPredicateContext ctx) {
    final var methodName = "enterExpressionAtomPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionOrDefault(final MySqlParser.ExpressionOrDefaultContext ctx) {
    final var methodName = "enterExpressionOrDefault";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressions(final MySqlParser.ExpressionsContext ctx) {
    final var methodName = "enterExpressions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExpressionsWithDefaults(final MySqlParser.ExpressionsWithDefaultsContext ctx) {
    final var methodName = "enterExpressionsWithDefaults";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterExtractFunctionCall(final MySqlParser.ExtractFunctionCallContext ctx) {
    final var methodName = "enterExtractFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFetchCursor(final MySqlParser.FetchCursorContext ctx) {
    final var methodName = "enterFetchCursor";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFileSizeLiteral(final MySqlParser.FileSizeLiteralContext ctx) {
    final var methodName = "enterFileSizeLiteral";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlushStatement(final MySqlParser.FlushStatementContext ctx) {
    final var methodName = "enterFlushStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFlushTableOption(final MySqlParser.FlushTableOptionContext ctx) {
    final var methodName = "enterFlushTableOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterForeignKeyTableConstraint(
      final MySqlParser.ForeignKeyTableConstraintContext ctx) {
    final var methodName = "enterForeignKeyTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFormatColumnConstraint(final MySqlParser.FormatColumnConstraintContext ctx) {
    final var methodName = "enterFormatColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrameBetween(final MySqlParser.FrameBetweenContext ctx) {
    final var methodName = "enterFrameBetween";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrameClause(final MySqlParser.FrameClauseContext ctx) {
    final var methodName = "enterFrameClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrameExtent(final MySqlParser.FrameExtentContext ctx) {
    final var methodName = "enterFrameExtent";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrameRange(final MySqlParser.FrameRangeContext ctx) {
    final var methodName = "enterFrameRange";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFrameUnits(final MySqlParser.FrameUnitsContext ctx) {
    final var methodName = "enterFrameUnits";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFromClause(final MySqlParser.FromClauseContext ctx) {
    final var methodName = "enterFromClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFullColumnName(final MySqlParser.FullColumnNameContext ctx) {
    final var methodName = "enterFullColumnName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFullColumnNameExpressionAtom(
      final MySqlParser.FullColumnNameExpressionAtomContext ctx) {
    final var methodName = "enterFullColumnNameExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFullColumnNameList(final MySqlParser.FullColumnNameListContext ctx) {
    final var methodName = "enterFullColumnNameList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFullDescribeStatement(final MySqlParser.FullDescribeStatementContext ctx) {
    final var methodName = "enterFullDescribeStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFullId(final MySqlParser.FullIdContext ctx) {
    final var methodName = "enterFullId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionArg(final MySqlParser.FunctionArgContext ctx) {
    final var methodName = "enterFunctionArg";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionArgs(final MySqlParser.FunctionArgsContext ctx) {
    final var methodName = "enterFunctionArgs";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionCallExpressionAtom(
      final MySqlParser.FunctionCallExpressionAtomContext ctx) {
    final var methodName = "enterFunctionCallExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionNameBase(final MySqlParser.FunctionNameBaseContext ctx) {
    final var methodName = "enterFunctionNameBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterFunctionParameter(final MySqlParser.FunctionParameterContext ctx) {
    final var methodName = "enterFunctionParameter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGeneratedColumnConstraint(
      final MySqlParser.GeneratedColumnConstraintContext ctx) {
    final var methodName = "enterGeneratedColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGetFormatFunctionCall(final MySqlParser.GetFormatFunctionCallContext ctx) {
    final var methodName = "enterGetFormatFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGlobalPrivLevel(final MySqlParser.GlobalPrivLevelContext ctx) {
    final var methodName = "enterGlobalPrivLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantProxy(final MySqlParser.GrantProxyContext ctx) {
    final var methodName = "enterGrantProxy";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGrantStatement(final MySqlParser.GrantStatementContext ctx) {
    final var methodName = "enterGrantStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupByClause(final MySqlParser.GroupByClauseContext ctx) {
    final var methodName = "enterGroupByClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGroupByItem(final MySqlParser.GroupByItemContext ctx) {
    final var methodName = "enterGroupByItem";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGtidsUntilOption(final MySqlParser.GtidsUntilOptionContext ctx) {
    final var methodName = "enterGtidsUntilOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterGtuidSet(final MySqlParser.GtuidSetContext ctx) {
    final var methodName = "enterGtuidSet";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerCloseStatement(final MySqlParser.HandlerCloseStatementContext ctx) {
    final var methodName = "enterHandlerCloseStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionCode(final MySqlParser.HandlerConditionCodeContext ctx) {
    final var methodName = "enterHandlerConditionCode";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionException(
      final MySqlParser.HandlerConditionExceptionContext ctx) {
    final var methodName = "enterHandlerConditionException";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionName(final MySqlParser.HandlerConditionNameContext ctx) {
    final var methodName = "enterHandlerConditionName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionNotfound(final MySqlParser.HandlerConditionNotfoundContext ctx) {
    final var methodName = "enterHandlerConditionNotfound";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionState(final MySqlParser.HandlerConditionStateContext ctx) {
    final var methodName = "enterHandlerConditionState";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerConditionWarning(final MySqlParser.HandlerConditionWarningContext ctx) {
    final var methodName = "enterHandlerConditionWarning";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerOpenStatement(final MySqlParser.HandlerOpenStatementContext ctx) {
    final var methodName = "enterHandlerOpenStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerReadIndexStatement(
      final MySqlParser.HandlerReadIndexStatementContext ctx) {
    final var methodName = "enterHandlerReadIndexStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerReadStatement(final MySqlParser.HandlerReadStatementContext ctx) {
    final var methodName = "enterHandlerReadStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHandlerStatement(final MySqlParser.HandlerStatementContext ctx) {
    final var methodName = "enterHandlerStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHashAuthOption(final MySqlParser.HashAuthOptionContext ctx) {
    final var methodName = "enterHashAuthOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHavingClause(final MySqlParser.HavingClauseContext ctx) {
    final var methodName = "enterHavingClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHelpStatement(final MySqlParser.HelpStatementContext ctx) {
    final var methodName = "enterHelpStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHexadecimalLiteral(final MySqlParser.HexadecimalLiteralContext ctx) {
    final var methodName = "enterHexadecimalLiteral";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterHostName(final MySqlParser.HostNameContext ctx) {
    final var methodName = "enterHostName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIfExists(final MySqlParser.IfExistsContext ctx) {
    final var methodName = "enterIfExists";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIfNotExists(final MySqlParser.IfNotExistsContext ctx) {
    final var methodName = "enterIfNotExists";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIfStatement(final MySqlParser.IfStatementContext ctx) {
    final var methodName = "enterIfStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIgnoreDbReplication(final MySqlParser.IgnoreDbReplicationContext ctx) {
    final var methodName = "enterIgnoreDbReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIgnoreTableReplication(final MySqlParser.IgnoreTableReplicationContext ctx) {
    final var methodName = "enterIgnoreTableReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexColumnName(final MySqlParser.IndexColumnNameContext ctx) {
    final var methodName = "enterIndexColumnName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexColumnNames(final MySqlParser.IndexColumnNamesContext ctx) {
    final var methodName = "enterIndexColumnNames";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexDeclaration(final MySqlParser.IndexDeclarationContext ctx) {
    final var methodName = "enterIndexDeclaration";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexHint(final MySqlParser.IndexHintContext ctx) {
    final var methodName = "enterIndexHint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexHintType(final MySqlParser.IndexHintTypeContext ctx) {
    final var methodName = "enterIndexHintType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexOption(final MySqlParser.IndexOptionContext ctx) {
    final var methodName = "enterIndexOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIndexType(final MySqlParser.IndexTypeContext ctx) {
    final var methodName = "enterIndexType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInnerJoin(final MySqlParser.InnerJoinContext ctx) {
    final var methodName = "enterInnerJoin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInPredicate(final MySqlParser.InPredicateContext ctx) {
    final var methodName = "enterInPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsertStatement(final MySqlParser.InsertStatementContext ctx) {
    final var methodName = "enterInsertStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInsertStatementValue(final MySqlParser.InsertStatementValueContext ctx) {
    final var methodName = "enterInsertStatementValue";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInstallPlugin(final MySqlParser.InstallPluginContext ctx) {
    final var methodName = "enterInstallPlugin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalExpr(final MySqlParser.IntervalExprContext ctx) {
    final var methodName = "enterIntervalExpr";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalExpressionAtom(final MySqlParser.IntervalExpressionAtomContext ctx) {
    final var methodName = "enterIntervalExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalSchedule(final MySqlParser.IntervalScheduleContext ctx) {
    final var methodName = "enterIntervalSchedule";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalType(final MySqlParser.IntervalTypeContext ctx) {
    final var methodName = "enterIntervalType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIntervalTypeBase(final MySqlParser.IntervalTypeBaseContext ctx) {
    final var methodName = "enterIntervalTypeBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterInvisibilityColumnConstraint(
      final MySqlParser.InvisibilityColumnConstraintContext ctx) {
    final var methodName = "enterInvisibilityColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIsExpression(final MySqlParser.IsExpressionContext ctx) {
    final var methodName = "enterIsExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIsNullPredicate(final MySqlParser.IsNullPredicateContext ctx) {
    final var methodName = "enterIsNullPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterIterateStatement(final MySqlParser.IterateStatementContext ctx) {
    final var methodName = "enterIterateStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJoinSpec(final MySqlParser.JoinSpecContext ctx) {
    final var methodName = "enterJoinSpec";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonColumn(final MySqlParser.JsonColumnContext ctx) {
    final var methodName = "enterJsonColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonColumnList(final MySqlParser.JsonColumnListContext ctx) {
    final var methodName = "enterJsonColumnList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonExpressionAtom(final MySqlParser.JsonExpressionAtomContext ctx) {
    final var methodName = "enterJsonExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonMemberOfPredicate(final MySqlParser.JsonMemberOfPredicateContext ctx) {
    final var methodName = "enterJsonMemberOfPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonOnEmpty(final MySqlParser.JsonOnEmptyContext ctx) {
    final var methodName = "enterJsonOnEmpty";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonOnError(final MySqlParser.JsonOnErrorContext ctx) {
    final var methodName = "enterJsonOnError";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonOperator(final MySqlParser.JsonOperatorContext ctx) {
    final var methodName = "enterJsonOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonTable(final MySqlParser.JsonTableContext ctx) {
    final var methodName = "enterJsonTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterJsonValueFunctionCall(final MySqlParser.JsonValueFunctionCallContext ctx) {
    final var methodName = "enterJsonValueFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKeywordsCanBeId(final MySqlParser.KeywordsCanBeIdContext ctx) {
    final var methodName = "enterKeywordsCanBeId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterKillStatement(final MySqlParser.KillStatementContext ctx) {
    final var methodName = "enterKillStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLateralStatement(final MySqlParser.LateralStatementContext ctx) {
    final var methodName = "enterLateralStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLeaveStatement(final MySqlParser.LeaveStatementContext ctx) {
    final var methodName = "enterLeaveStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLengthOneDimension(final MySqlParser.LengthOneDimensionContext ctx) {
    final var methodName = "enterLengthOneDimension";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLengthTwoDimension(final MySqlParser.LengthTwoDimensionContext ctx) {
    final var methodName = "enterLengthTwoDimension";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLengthTwoOptionalDimension(
      final MySqlParser.LengthTwoOptionalDimensionContext ctx) {
    final var methodName = "enterLengthTwoOptionalDimension";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevelInWeightListElement(final MySqlParser.LevelInWeightListElementContext ctx) {
    final var methodName = "enterLevelInWeightListElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevelWeightList(final MySqlParser.LevelWeightListContext ctx) {
    final var methodName = "enterLevelWeightList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLevelWeightRange(final MySqlParser.LevelWeightRangeContext ctx) {
    final var methodName = "enterLevelWeightRange";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLikePredicate(final MySqlParser.LikePredicateContext ctx) {
    final var methodName = "enterLikePredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLimitClause(final MySqlParser.LimitClauseContext ctx) {
    final var methodName = "enterLimitClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLimitClauseAtom(final MySqlParser.LimitClauseAtomContext ctx) {
    final var methodName = "enterLimitClauseAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoadDataStatement(final MySqlParser.LoadDataStatementContext ctx) {
    final var methodName = "enterLoadDataStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoadedTableIndexes(final MySqlParser.LoadedTableIndexesContext ctx) {
    final var methodName = "enterLoadedTableIndexes";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoadIndexIntoCache(final MySqlParser.LoadIndexIntoCacheContext ctx) {
    final var methodName = "enterLoadIndexIntoCache";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoadXmlStatement(final MySqlParser.LoadXmlStatementContext ctx) {
    final var methodName = "enterLoadXmlStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockAction(final MySqlParser.LockActionContext ctx) {
    final var methodName = "enterLockAction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockClause(final MySqlParser.LockClauseContext ctx) {
    final var methodName = "enterLockClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockTableElement(final MySqlParser.LockTableElementContext ctx) {
    final var methodName = "enterLockTableElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLockTables(final MySqlParser.LockTablesContext ctx) {
    final var methodName = "enterLockTables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLogicalExpression(final MySqlParser.LogicalExpressionContext ctx) {
    final var methodName = "enterLogicalExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLogicalOperator(final MySqlParser.LogicalOperatorContext ctx) {
    final var methodName = "enterLogicalOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLongVarbinaryDataType(final MySqlParser.LongVarbinaryDataTypeContext ctx) {
    final var methodName = "enterLongVarbinaryDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLongVarcharDataType(final MySqlParser.LongVarcharDataTypeContext ctx) {
    final var methodName = "enterLongVarcharDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterLoopStatement(final MySqlParser.LoopStatementContext ctx) {
    final var methodName = "enterLoopStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterBoolOption(final MySqlParser.MasterBoolOptionContext ctx) {
    final var methodName = "enterMasterBoolOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterDecimalOption(final MySqlParser.MasterDecimalOptionContext ctx) {
    final var methodName = "enterMasterDecimalOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterLogUntilOption(final MySqlParser.MasterLogUntilOptionContext ctx) {
    final var methodName = "enterMasterLogUntilOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterRealOption(final MySqlParser.MasterRealOptionContext ctx) {
    final var methodName = "enterMasterRealOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterStringOption(final MySqlParser.MasterStringOptionContext ctx) {
    final var methodName = "enterMasterStringOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMasterUidListOption(final MySqlParser.MasterUidListOptionContext ctx) {
    final var methodName = "enterMasterUidListOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMathExpressionAtom(final MySqlParser.MathExpressionAtomContext ctx) {
    final var methodName = "enterMathExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModule(final MySqlParser.ModuleContext ctx) {
    final var methodName = "enterModule";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterModuleAuthOption(final MySqlParser.ModuleAuthOptionContext ctx) {
    final var methodName = "enterModuleAuthOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMultipleDeleteStatement(final MySqlParser.MultipleDeleteStatementContext ctx) {
    final var methodName = "enterMultipleDeleteStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMultipleUpdateStatement(final MySqlParser.MultipleUpdateStatementContext ctx) {
    final var methodName = "enterMultipleUpdateStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMultOperator(final MySqlParser.MultOperatorContext ctx) {
    final var methodName = "enterMultOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMysqlVariable(final MySqlParser.MysqlVariableContext ctx) {
    final var methodName = "enterMysqlVariable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterMysqlVariableExpressionAtom(
      final MySqlParser.MysqlVariableExpressionAtomContext ctx) {
    final var methodName = "enterMysqlVariableExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNationalStringDataType(final MySqlParser.NationalStringDataTypeContext ctx) {
    final var methodName = "enterNationalStringDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNationalVaryingStringDataType(
      final MySqlParser.NationalVaryingStringDataTypeContext ctx) {
    final var methodName = "enterNationalVaryingStringDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNaturalJoin(final MySqlParser.NaturalJoinContext ctx) {
    final var methodName = "enterNaturalJoin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNestedExpressionAtom(final MySqlParser.NestedExpressionAtomContext ctx) {
    final var methodName = "enterNestedExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNestedRowExpressionAtom(final MySqlParser.NestedRowExpressionAtomContext ctx) {
    final var methodName = "enterNestedRowExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNonAggregateFunctionCall(final MySqlParser.NonAggregateFunctionCallContext ctx) {
    final var methodName = "enterNonAggregateFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNonAggregateWindowedFunction(
      final MySqlParser.NonAggregateWindowedFunctionContext ctx) {
    final var methodName = "enterNonAggregateWindowedFunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNotExpression(final MySqlParser.NotExpressionContext ctx) {
    final var methodName = "enterNotExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNullColumnConstraint(final MySqlParser.NullColumnConstraintContext ctx) {
    final var methodName = "enterNullColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterNullNotnull(final MySqlParser.NullNotnullContext ctx) {
    final var methodName = "enterNullNotnull";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOpenCursor(final MySqlParser.OpenCursorContext ctx) {
    final var methodName = "enterOpenCursor";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOptimizeTable(final MySqlParser.OptimizeTableContext ctx) {
    final var methodName = "enterOptimizeTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrderByClause(final MySqlParser.OrderByClauseContext ctx) {
    final var methodName = "enterOrderByClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrderByExpression(final MySqlParser.OrderByExpressionContext ctx) {
    final var methodName = "enterOrderByExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOrReplace(final MySqlParser.OrReplaceContext ctx) {
    final var methodName = "enterOrReplace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOuterJoin(final MySqlParser.OuterJoinContext ctx) {
    final var methodName = "enterOuterJoin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOverClause(final MySqlParser.OverClauseContext ctx) {
    final var methodName = "enterOverClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterOwnerStatement(final MySqlParser.OwnerStatementContext ctx) {
    final var methodName = "enterOwnerStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterParenthesisSelect(final MySqlParser.ParenthesisSelectContext ctx) {
    final var methodName = "enterParenthesisSelect";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionClause(final MySqlParser.PartitionClauseContext ctx) {
    final var methodName = "enterPartitionClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionComparison(final MySqlParser.PartitionComparisonContext ctx) {
    final var methodName = "enterPartitionComparison";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionDefinerAtom(final MySqlParser.PartitionDefinerAtomContext ctx) {
    final var methodName = "enterPartitionDefinerAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionDefinerVector(final MySqlParser.PartitionDefinerVectorContext ctx) {
    final var methodName = "enterPartitionDefinerVector";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionDefinitions(final MySqlParser.PartitionDefinitionsContext ctx) {
    final var methodName = "enterPartitionDefinitions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionFunctionHash(final MySqlParser.PartitionFunctionHashContext ctx) {
    final var methodName = "enterPartitionFunctionHash";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionFunctionKey(final MySqlParser.PartitionFunctionKeyContext ctx) {
    final var methodName = "enterPartitionFunctionKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionFunctionList(final MySqlParser.PartitionFunctionListContext ctx) {
    final var methodName = "enterPartitionFunctionList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionFunctionRange(final MySqlParser.PartitionFunctionRangeContext ctx) {
    final var methodName = "enterPartitionFunctionRange";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionListAtom(final MySqlParser.PartitionListAtomContext ctx) {
    final var methodName = "enterPartitionListAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionListVector(final MySqlParser.PartitionListVectorContext ctx) {
    final var methodName = "enterPartitionListVector";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionComment(final MySqlParser.PartitionOptionCommentContext ctx) {
    final var methodName = "enterPartitionOptionComment";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionDataDirectory(
      final MySqlParser.PartitionOptionDataDirectoryContext ctx) {
    final var methodName = "enterPartitionOptionDataDirectory";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionEngine(final MySqlParser.PartitionOptionEngineContext ctx) {
    final var methodName = "enterPartitionOptionEngine";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionIndexDirectory(
      final MySqlParser.PartitionOptionIndexDirectoryContext ctx) {
    final var methodName = "enterPartitionOptionIndexDirectory";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionMaxRows(final MySqlParser.PartitionOptionMaxRowsContext ctx) {
    final var methodName = "enterPartitionOptionMaxRows";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionMinRows(final MySqlParser.PartitionOptionMinRowsContext ctx) {
    final var methodName = "enterPartitionOptionMinRows";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionNodeGroup(final MySqlParser.PartitionOptionNodeGroupContext ctx) {
    final var methodName = "enterPartitionOptionNodeGroup";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionOptionTablespace(
      final MySqlParser.PartitionOptionTablespaceContext ctx) {
    final var methodName = "enterPartitionOptionTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPartitionSimple(final MySqlParser.PartitionSimpleContext ctx) {
    final var methodName = "enterPartitionSimple";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPasswordConnectionOption(final MySqlParser.PasswordConnectionOptionContext ctx) {
    final var methodName = "enterPasswordConnectionOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPasswordFunctionCall(final MySqlParser.PasswordFunctionCallContext ctx) {
    final var methodName = "enterPasswordFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPasswordFunctionClause(final MySqlParser.PasswordFunctionClauseContext ctx) {
    final var methodName = "enterPasswordFunctionClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPasswordModuleOption(final MySqlParser.PasswordModuleOptionContext ctx) {
    final var methodName = "enterPasswordModuleOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPluginDirConnectionOption(
      final MySqlParser.PluginDirConnectionOptionContext ctx) {
    final var methodName = "enterPluginDirConnectionOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPositionFunctionCall(final MySqlParser.PositionFunctionCallContext ctx) {
    final var methodName = "enterPositionFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPreciseSchedule(final MySqlParser.PreciseScheduleContext ctx) {
    final var methodName = "enterPreciseSchedule";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPredicateExpression(final MySqlParser.PredicateExpressionContext ctx) {
    final var methodName = "enterPredicateExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPreparedStatement(final MySqlParser.PreparedStatementContext ctx) {
    final var methodName = "enterPreparedStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrepareStatement(final MySqlParser.PrepareStatementContext ctx) {
    final var methodName = "enterPrepareStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimaryKeyColumnConstraint(
      final MySqlParser.PrimaryKeyColumnConstraintContext ctx) {
    final var methodName = "enterPrimaryKeyColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrimaryKeyTableConstraint(
      final MySqlParser.PrimaryKeyTableConstraintContext ctx) {
    final var methodName = "enterPrimaryKeyTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivelegeClause(final MySqlParser.PrivelegeClauseContext ctx) {
    final var methodName = "enterPrivelegeClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilege(final MySqlParser.PrivilegeContext ctx) {
    final var methodName = "enterPrivilege";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPrivilegesBase(final MySqlParser.PrivilegesBaseContext ctx) {
    final var methodName = "enterPrivilegesBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProcedureParameter(final MySqlParser.ProcedureParameterContext ctx) {
    final var methodName = "enterProcedureParameter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterProcedureSqlStatement(final MySqlParser.ProcedureSqlStatementContext ctx) {
    final var methodName = "enterProcedureSqlStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterPurgeBinaryLogs(final MySqlParser.PurgeBinaryLogsContext ctx) {
    final var methodName = "enterPurgeBinaryLogs";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQueryCreateTable(final MySqlParser.QueryCreateTableContext ctx) {
    final var methodName = "enterQueryCreateTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQueryExpression(final MySqlParser.QueryExpressionContext ctx) {
    final var methodName = "enterQueryExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQueryExpressionNointo(final MySqlParser.QueryExpressionNointoContext ctx) {
    final var methodName = "enterQueryExpressionNointo";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuerySpecification(final MySqlParser.QuerySpecificationContext ctx) {
    final var methodName = "enterQuerySpecification";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterQuerySpecificationNointo(final MySqlParser.QuerySpecificationNointoContext ctx) {
    final var methodName = "enterQuerySpecificationNointo";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRandomAuthOption(final MySqlParser.RandomAuthOptionContext ctx) {
    final var methodName = "enterRandomAuthOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReferenceAction(final MySqlParser.ReferenceActionContext ctx) {
    final var methodName = "enterReferenceAction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReferenceColumnConstraint(
      final MySqlParser.ReferenceColumnConstraintContext ctx) {
    final var methodName = "enterReferenceColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReferenceControlType(final MySqlParser.ReferenceControlTypeContext ctx) {
    final var methodName = "enterReferenceControlType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReferenceDefinition(final MySqlParser.ReferenceDefinitionContext ctx) {
    final var methodName = "enterReferenceDefinition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRegexpPredicate(final MySqlParser.RegexpPredicateContext ctx) {
    final var methodName = "enterRegexpPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRelayLogUntilOption(final MySqlParser.RelayLogUntilOptionContext ctx) {
    final var methodName = "enterRelayLogUntilOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReleaseStatement(final MySqlParser.ReleaseStatementContext ctx) {
    final var methodName = "enterReleaseStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRenameTable(final MySqlParser.RenameTableContext ctx) {
    final var methodName = "enterRenameTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRenameTableClause(final MySqlParser.RenameTableClauseContext ctx) {
    final var methodName = "enterRenameTableClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRenameUser(final MySqlParser.RenameUserContext ctx) {
    final var methodName = "enterRenameUser";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRenameUserClause(final MySqlParser.RenameUserClauseContext ctx) {
    final var methodName = "enterRenameUserClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRepairTable(final MySqlParser.RepairTableContext ctx) {
    final var methodName = "enterRepairTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRepeatStatement(final MySqlParser.RepeatStatementContext ctx) {
    final var methodName = "enterRepeatStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplaceStatement(final MySqlParser.ReplaceStatementContext ctx) {
    final var methodName = "enterReplaceStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReplicationStatement(final MySqlParser.ReplicationStatementContext ctx) {
    final var methodName = "enterReplicationStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResetMaster(final MySqlParser.ResetMasterContext ctx) {
    final var methodName = "enterResetMaster";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResetSlave(final MySqlParser.ResetSlaveContext ctx) {
    final var methodName = "enterResetSlave";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResetStatement(final MySqlParser.ResetStatementContext ctx) {
    final var methodName = "enterResetStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterResignalStatement(final MySqlParser.ResignalStatementContext ctx) {
    final var methodName = "enterResignalStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterReturnStatement(final MySqlParser.ReturnStatementContext ctx) {
    final var methodName = "enterReturnStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRevokeProxy(final MySqlParser.RevokeProxyContext ctx) {
    final var methodName = "enterRevokeProxy";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRewriteDbReplication(final MySqlParser.RewriteDbReplicationContext ctx) {
    final var methodName = "enterRewriteDbReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoleName(final MySqlParser.RoleNameContext ctx) {
    final var methodName = "enterRoleName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoleOption(final MySqlParser.RoleOptionContext ctx) {
    final var methodName = "enterRoleOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoleRevoke(final MySqlParser.RoleRevokeContext ctx) {
    final var methodName = "enterRoleRevoke";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollbackStatement(final MySqlParser.RollbackStatementContext ctx) {
    final var methodName = "enterRollbackStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRollbackWork(final MySqlParser.RollbackWorkContext ctx) {
    final var methodName = "enterRollbackWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoot(final MySqlParser.RootContext ctx) {
    final var methodName = "enterRoot";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineBehavior(final MySqlParser.RoutineBehaviorContext ctx) {
    final var methodName = "enterRoutineBehavior";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineBody(final MySqlParser.RoutineBodyContext ctx) {
    final var methodName = "enterRoutineBody";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineComment(final MySqlParser.RoutineCommentContext ctx) {
    final var methodName = "enterRoutineComment";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineData(final MySqlParser.RoutineDataContext ctx) {
    final var methodName = "enterRoutineData";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineLanguage(final MySqlParser.RoutineLanguageContext ctx) {
    final var methodName = "enterRoutineLanguage";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterRoutineSecurity(final MySqlParser.RoutineSecurityContext ctx) {
    final var methodName = "enterRoutineSecurity";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSavepointStatement(final MySqlParser.SavepointStatementContext ctx) {
    final var methodName = "enterSavepointStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterScalarFunctionCall(final MySqlParser.ScalarFunctionCallContext ctx) {
    final var methodName = "enterScalarFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterScalarFunctionName(final MySqlParser.ScalarFunctionNameContext ctx) {
    final var methodName = "enterScalarFunctionName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectColumnElement(final MySqlParser.SelectColumnElementContext ctx) {
    final var methodName = "enterSelectColumnElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectElements(final MySqlParser.SelectElementsContext ctx) {
    final var methodName = "enterSelectElements";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectExpressionElement(final MySqlParser.SelectExpressionElementContext ctx) {
    final var methodName = "enterSelectExpressionElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectFieldsInto(final MySqlParser.SelectFieldsIntoContext ctx) {
    final var methodName = "enterSelectFieldsInto";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectFunctionElement(final MySqlParser.SelectFunctionElementContext ctx) {
    final var methodName = "enterSelectFunctionElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectIntoDumpFile(final MySqlParser.SelectIntoDumpFileContext ctx) {
    final var methodName = "enterSelectIntoDumpFile";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectIntoTextFile(final MySqlParser.SelectIntoTextFileContext ctx) {
    final var methodName = "enterSelectIntoTextFile";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectIntoVariables(final MySqlParser.SelectIntoVariablesContext ctx) {
    final var methodName = "enterSelectIntoVariables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectLinesInto(final MySqlParser.SelectLinesIntoContext ctx) {
    final var methodName = "enterSelectLinesInto";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectSpec(final MySqlParser.SelectSpecContext ctx) {
    final var methodName = "enterSelectSpec";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSelectStarElement(final MySqlParser.SelectStarElementContext ctx) {
    final var methodName = "enterSelectStarElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSerialDefaultColumnConstraint(
      final MySqlParser.SerialDefaultColumnConstraintContext ctx) {
    final var methodName = "enterSerialDefaultColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterServerOption(final MySqlParser.ServerOptionContext ctx) {
    final var methodName = "enterServerOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetAutocommit(final MySqlParser.SetAutocommitContext ctx) {
    final var methodName = "enterSetAutocommit";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetAutocommitStatement(final MySqlParser.SetAutocommitStatementContext ctx) {
    final var methodName = "enterSetAutocommitStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetCharset(final MySqlParser.SetCharsetContext ctx) {
    final var methodName = "enterSetCharset";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetNames(final MySqlParser.SetNamesContext ctx) {
    final var methodName = "enterSetNames";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetNewValueInsideTrigger(final MySqlParser.SetNewValueInsideTriggerContext ctx) {
    final var methodName = "enterSetNewValueInsideTrigger";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetPassword(final MySqlParser.SetPasswordContext ctx) {
    final var methodName = "enterSetPassword";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetPasswordStatement(final MySqlParser.SetPasswordStatementContext ctx) {
    final var methodName = "enterSetPasswordStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetRole(final MySqlParser.SetRoleContext ctx) {
    final var methodName = "enterSetRole";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetTransaction(final MySqlParser.SetTransactionContext ctx) {
    final var methodName = "enterSetTransaction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetTransactionStatement(final MySqlParser.SetTransactionStatementContext ctx) {
    final var methodName = "enterSetTransactionStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSetVariable(final MySqlParser.SetVariableContext ctx) {
    final var methodName = "enterSetVariable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShortRevoke(final MySqlParser.ShortRevokeContext ctx) {
    final var methodName = "enterShortRevoke";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowColumns(final MySqlParser.ShowColumnsContext ctx) {
    final var methodName = "enterShowColumns";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCommonEntity(final MySqlParser.ShowCommonEntityContext ctx) {
    final var methodName = "enterShowCommonEntity";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCountErrors(final MySqlParser.ShowCountErrorsContext ctx) {
    final var methodName = "enterShowCountErrors";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCreateDb(final MySqlParser.ShowCreateDbContext ctx) {
    final var methodName = "enterShowCreateDb";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCreateFullIdObject(final MySqlParser.ShowCreateFullIdObjectContext ctx) {
    final var methodName = "enterShowCreateFullIdObject";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowCreateUser(final MySqlParser.ShowCreateUserContext ctx) {
    final var methodName = "enterShowCreateUser";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowEngine(final MySqlParser.ShowEngineContext ctx) {
    final var methodName = "enterShowEngine";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowErrors(final MySqlParser.ShowErrorsContext ctx) {
    final var methodName = "enterShowErrors";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowFilter(final MySqlParser.ShowFilterContext ctx) {
    final var methodName = "enterShowFilter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowGlobalInfo(final MySqlParser.ShowGlobalInfoContext ctx) {
    final var methodName = "enterShowGlobalInfo";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowGlobalInfoClause(final MySqlParser.ShowGlobalInfoClauseContext ctx) {
    final var methodName = "enterShowGlobalInfoClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowGrants(final MySqlParser.ShowGrantsContext ctx) {
    final var methodName = "enterShowGrants";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowIndexes(final MySqlParser.ShowIndexesContext ctx) {
    final var methodName = "enterShowIndexes";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowLogEvents(final MySqlParser.ShowLogEventsContext ctx) {
    final var methodName = "enterShowLogEvents";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowMasterLogs(final MySqlParser.ShowMasterLogsContext ctx) {
    final var methodName = "enterShowMasterLogs";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowObjectFilter(final MySqlParser.ShowObjectFilterContext ctx) {
    final var methodName = "enterShowObjectFilter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowOpenTables(final MySqlParser.ShowOpenTablesContext ctx) {
    final var methodName = "enterShowOpenTables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowProfile(final MySqlParser.ShowProfileContext ctx) {
    final var methodName = "enterShowProfile";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowProfileType(final MySqlParser.ShowProfileTypeContext ctx) {
    final var methodName = "enterShowProfileType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowRoutine(final MySqlParser.ShowRoutineContext ctx) {
    final var methodName = "enterShowRoutine";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowSchemaEntity(final MySqlParser.ShowSchemaEntityContext ctx) {
    final var methodName = "enterShowSchemaEntity";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowSchemaFilter(final MySqlParser.ShowSchemaFilterContext ctx) {
    final var methodName = "enterShowSchemaFilter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShowSlaveStatus(final MySqlParser.ShowSlaveStatusContext ctx) {
    final var methodName = "enterShowSlaveStatus";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterShutdownStatement(final MySqlParser.ShutdownStatementContext ctx) {
    final var methodName = "enterShutdownStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSignalConditionInformation(
      final MySqlParser.SignalConditionInformationContext ctx) {
    final var methodName = "enterSignalConditionInformation";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSignalStatement(final MySqlParser.SignalStatementContext ctx) {
    final var methodName = "enterSignalStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleAuthOption(final MySqlParser.SimpleAuthOptionContext ctx) {
    final var methodName = "enterSimpleAuthOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleDataType(final MySqlParser.SimpleDataTypeContext ctx) {
    final var methodName = "enterSimpleDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleDescribeStatement(final MySqlParser.SimpleDescribeStatementContext ctx) {
    final var methodName = "enterSimpleDescribeStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleFlushOption(final MySqlParser.SimpleFlushOptionContext ctx) {
    final var methodName = "enterSimpleFlushOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleFunctionCall(final MySqlParser.SimpleFunctionCallContext ctx) {
    final var methodName = "enterSimpleFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleId(final MySqlParser.SimpleIdContext ctx) {
    final var methodName = "enterSimpleId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleIndexDeclaration(final MySqlParser.SimpleIndexDeclarationContext ctx) {
    final var methodName = "enterSimpleIndexDeclaration";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleSelect(final MySqlParser.SimpleSelectContext ctx) {
    final var methodName = "enterSimpleSelect";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleStrings(final MySqlParser.SimpleStringsContext ctx) {
    final var methodName = "enterSimpleStrings";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSimpleUserName(final MySqlParser.SimpleUserNameContext ctx) {
    final var methodName = "enterSimpleUserName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSingleDeleteStatement(final MySqlParser.SingleDeleteStatementContext ctx) {
    final var methodName = "enterSingleDeleteStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSingleUpdateStatement(final MySqlParser.SingleUpdateStatementContext ctx) {
    final var methodName = "enterSingleUpdateStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSoundsLikePredicate(final MySqlParser.SoundsLikePredicateContext ctx) {
    final var methodName = "enterSoundsLikePredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSpatialDataType(final MySqlParser.SpatialDataTypeContext ctx) {
    final var methodName = "enterSpatialDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSpecialIndexDeclaration(final MySqlParser.SpecialIndexDeclarationContext ctx) {
    final var methodName = "enterSpecialIndexDeclaration";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSpecificFunctionCall(final MySqlParser.SpecificFunctionCallContext ctx) {
    final var methodName = "enterSpecificFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSqlGapsUntilOption(final MySqlParser.SqlGapsUntilOptionContext ctx) {
    final var methodName = "enterSqlGapsUntilOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSqlStatement(final MySqlParser.SqlStatementContext ctx) {
    final var methodName = "enterSqlStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSqlStatements(final MySqlParser.SqlStatementsContext ctx) {
    final var methodName = "enterSqlStatements";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStartGroupReplication(final MySqlParser.StartGroupReplicationContext ctx) {
    final var methodName = "enterStartGroupReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStartSlave(final MySqlParser.StartSlaveContext ctx) {
    final var methodName = "enterStartSlave";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStartTransaction(final MySqlParser.StartTransactionContext ctx) {
    final var methodName = "enterStartTransaction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStopGroupReplication(final MySqlParser.StopGroupReplicationContext ctx) {
    final var methodName = "enterStopGroupReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStopSlave(final MySqlParser.StopSlaveContext ctx) {
    final var methodName = "enterStopSlave";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStorageColumnConstraint(final MySqlParser.StorageColumnConstraintContext ctx) {
    final var methodName = "enterStorageColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStraightJoin(final MySqlParser.StraightJoinContext ctx) {
    final var methodName = "enterStraightJoin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStringAuthOption(final MySqlParser.StringAuthOptionContext ctx) {
    final var methodName = "enterStringAuthOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStringDataType(final MySqlParser.StringDataTypeContext ctx) {
    final var methodName = "enterStringDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStringLiteral(final MySqlParser.StringLiteralContext ctx) {
    final var methodName = "enterStringLiteral";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterStringMasterOption(final MySqlParser.StringMasterOptionContext ctx) {
    final var methodName = "enterStringMasterOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubpartitionDefinition(final MySqlParser.SubpartitionDefinitionContext ctx) {
    final var methodName = "enterSubpartitionDefinition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubPartitionFunctionHash(final MySqlParser.SubPartitionFunctionHashContext ctx) {
    final var methodName = "enterSubPartitionFunctionHash";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubPartitionFunctionKey(final MySqlParser.SubPartitionFunctionKeyContext ctx) {
    final var methodName = "enterSubPartitionFunctionKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubqueryComparisonPredicate(
      final MySqlParser.SubqueryComparisonPredicateContext ctx) {
    final var methodName = "enterSubqueryComparisonPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubqueryExpressionAtom(final MySqlParser.SubqueryExpressionAtomContext ctx) {
    final var methodName = "enterSubqueryExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubqueryTableItem(final MySqlParser.SubqueryTableItemContext ctx) {
    final var methodName = "enterSubqueryTableItem";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterSubstrFunctionCall(final MySqlParser.SubstrFunctionCallContext ctx) {
    final var methodName = "enterSubstrFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableFlushOption(final MySqlParser.TableFlushOptionContext ctx) {
    final var methodName = "enterTableFlushOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableIndexes(final MySqlParser.TableIndexesContext ctx) {
    final var methodName = "enterTableIndexes";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableJson(final MySqlParser.TableJsonContext ctx) {
    final var methodName = "enterTableJson";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableName(final MySqlParser.TableNameContext ctx) {
    final var methodName = "enterTableName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionAutoextendSize(
      final MySqlParser.TableOptionAutoextendSizeContext ctx) {
    final var methodName = "enterTableOptionAutoextendSize";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionAutoIncrement(final MySqlParser.TableOptionAutoIncrementContext ctx) {
    final var methodName = "enterTableOptionAutoIncrement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionAverage(final MySqlParser.TableOptionAverageContext ctx) {
    final var methodName = "enterTableOptionAverage";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionCharset(final MySqlParser.TableOptionCharsetContext ctx) {
    final var methodName = "enterTableOptionCharset";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionChecksum(final MySqlParser.TableOptionChecksumContext ctx) {
    final var methodName = "enterTableOptionChecksum";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionCollate(final MySqlParser.TableOptionCollateContext ctx) {
    final var methodName = "enterTableOptionCollate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionComment(final MySqlParser.TableOptionCommentContext ctx) {
    final var methodName = "enterTableOptionComment";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionCompression(final MySqlParser.TableOptionCompressionContext ctx) {
    final var methodName = "enterTableOptionCompression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionConnection(final MySqlParser.TableOptionConnectionContext ctx) {
    final var methodName = "enterTableOptionConnection";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionDataDirectory(final MySqlParser.TableOptionDataDirectoryContext ctx) {
    final var methodName = "enterTableOptionDataDirectory";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionDelay(final MySqlParser.TableOptionDelayContext ctx) {
    final var methodName = "enterTableOptionDelay";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionEncryption(final MySqlParser.TableOptionEncryptionContext ctx) {
    final var methodName = "enterTableOptionEncryption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionEncryptionKeyId(
      final MySqlParser.TableOptionEncryptionKeyIdContext ctx) {
    final var methodName = "enterTableOptionEncryptionKeyId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionEngine(final MySqlParser.TableOptionEngineContext ctx) {
    final var methodName = "enterTableOptionEngine";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionEngineAttribute(
      final MySqlParser.TableOptionEngineAttributeContext ctx) {
    final var methodName = "enterTableOptionEngineAttribute";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionIndexDirectory(
      final MySqlParser.TableOptionIndexDirectoryContext ctx) {
    final var methodName = "enterTableOptionIndexDirectory";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionInsertMethod(final MySqlParser.TableOptionInsertMethodContext ctx) {
    final var methodName = "enterTableOptionInsertMethod";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionKeyBlockSize(final MySqlParser.TableOptionKeyBlockSizeContext ctx) {
    final var methodName = "enterTableOptionKeyBlockSize";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionMaxRows(final MySqlParser.TableOptionMaxRowsContext ctx) {
    final var methodName = "enterTableOptionMaxRows";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionMinRows(final MySqlParser.TableOptionMinRowsContext ctx) {
    final var methodName = "enterTableOptionMinRows";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionPackKeys(final MySqlParser.TableOptionPackKeysContext ctx) {
    final var methodName = "enterTableOptionPackKeys";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionPageCompressed(
      final MySqlParser.TableOptionPageCompressedContext ctx) {
    final var methodName = "enterTableOptionPageCompressed";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionPageCompressionLevel(
      final MySqlParser.TableOptionPageCompressionLevelContext ctx) {
    final var methodName = "enterTableOptionPageCompressionLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionPassword(final MySqlParser.TableOptionPasswordContext ctx) {
    final var methodName = "enterTableOptionPassword";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionPersistent(final MySqlParser.TableOptionPersistentContext ctx) {
    final var methodName = "enterTableOptionPersistent";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionRecalculation(final MySqlParser.TableOptionRecalculationContext ctx) {
    final var methodName = "enterTableOptionRecalculation";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionRowFormat(final MySqlParser.TableOptionRowFormatContext ctx) {
    final var methodName = "enterTableOptionRowFormat";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionSamplePage(final MySqlParser.TableOptionSamplePageContext ctx) {
    final var methodName = "enterTableOptionSamplePage";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionSecondaryEngineAttribute(
      final MySqlParser.TableOptionSecondaryEngineAttributeContext ctx) {
    final var methodName = "enterTableOptionSecondaryEngineAttribute";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionStartTransaction(
      final MySqlParser.TableOptionStartTransactionContext ctx) {
    final var methodName = "enterTableOptionStartTransaction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionTablespace(final MySqlParser.TableOptionTablespaceContext ctx) {
    final var methodName = "enterTableOptionTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionTableType(final MySqlParser.TableOptionTableTypeContext ctx) {
    final var methodName = "enterTableOptionTableType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionTransactional(final MySqlParser.TableOptionTransactionalContext ctx) {
    final var methodName = "enterTableOptionTransactional";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionTransactional(MySqlParser.TableOptionTransactionalContext ctx) {
    final var methodName = "exitTableOptionTransactional";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableOptionUnion(final MySqlParser.TableOptionUnionContext ctx) {
    final var methodName = "enterTableOptionUnion";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablePair(final MySqlParser.TablePairContext ctx) {
    final var methodName = "enterTablePair";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTables(final MySqlParser.TablesContext ctx) {
    final var methodName = "enterTables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSourceBase(final MySqlParser.TableSourceBaseContext ctx) {
    final var methodName = "enterTableSourceBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSourceNested(final MySqlParser.TableSourceNestedContext ctx) {
    final var methodName = "enterTableSourceNested";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSources(final MySqlParser.TableSourcesContext ctx) {
    final var methodName = "enterTableSources";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableSourcesItem(final MySqlParser.TableSourcesItemContext ctx) {
    final var methodName = "enterTableSourcesItem";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTablespaceStorage(final MySqlParser.TablespaceStorageContext ctx) {
    final var methodName = "enterTablespaceStorage";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableStatement(final MySqlParser.TableStatementContext ctx) {
    final var methodName = "enterTableStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTableType(final MySqlParser.TableTypeContext ctx) {
    final var methodName = "enterTableType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterThreadType(final MySqlParser.ThreadTypeContext ctx) {
    final var methodName = "enterThreadType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTimestampValue(final MySqlParser.TimestampValueContext ctx) {
    final var methodName = "enterTimestampValue";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTlsOption(final MySqlParser.TlsOptionContext ctx) {
    final var methodName = "enterTlsOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionLevel(final MySqlParser.TransactionLevelContext ctx) {
    final var methodName = "enterTransactionLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionLevelBase(final MySqlParser.TransactionLevelBaseContext ctx) {
    final var methodName = "enterTransactionLevelBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionMode(final MySqlParser.TransactionModeContext ctx) {
    final var methodName = "enterTransactionMode";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionOption(final MySqlParser.TransactionOptionContext ctx) {
    final var methodName = "enterTransactionOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTransactionStatement(final MySqlParser.TransactionStatementContext ctx) {
    final var methodName = "enterTransactionStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTrimFunctionCall(final MySqlParser.TrimFunctionCallContext ctx) {
    final var methodName = "enterTrimFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterTruncateTable(final MySqlParser.TruncateTableContext ctx) {
    final var methodName = "enterTruncateTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUdfFunctionCall(final MySqlParser.UdfFunctionCallContext ctx) {
    final var methodName = "enterUdfFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUid(final MySqlParser.UidContext ctx) {
    final var methodName = "enterUid";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUidList(final MySqlParser.UidListContext ctx) {
    final var methodName = "enterUidList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnaryExpressionAtom(final MySqlParser.UnaryExpressionAtomContext ctx) {
    final var methodName = "enterUnaryExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnaryOperator(final MySqlParser.UnaryOperatorContext ctx) {
    final var methodName = "enterUnaryOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUninstallPlugin(final MySqlParser.UninstallPluginContext ctx) {
    final var methodName = "enterUninstallPlugin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnionParenthesis(final MySqlParser.UnionParenthesisContext ctx) {
    final var methodName = "enterUnionParenthesis";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnionParenthesisSelect(final MySqlParser.UnionParenthesisSelectContext ctx) {
    final var methodName = "enterUnionParenthesisSelect";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnionSelect(final MySqlParser.UnionSelectContext ctx) {
    final var methodName = "enterUnionSelect";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnionStatement(final MySqlParser.UnionStatementContext ctx) {
    final var methodName = "enterUnionStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueKeyColumnConstraint(
      final MySqlParser.UniqueKeyColumnConstraintContext ctx) {
    final var methodName = "enterUniqueKeyColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUniqueKeyTableConstraint(final MySqlParser.UniqueKeyTableConstraintContext ctx) {
    final var methodName = "enterUniqueKeyTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUnlockTables(final MySqlParser.UnlockTablesContext ctx) {
    final var methodName = "enterUnlockTables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdatedElement(final MySqlParser.UpdatedElementContext ctx) {
    final var methodName = "enterUpdatedElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUpdateStatement(final MySqlParser.UpdateStatementContext ctx) {
    final var methodName = "enterUpdateStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserConnectionOption(final MySqlParser.UserConnectionOptionContext ctx) {
    final var methodName = "enterUserConnectionOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserLockOption(final MySqlParser.UserLockOptionContext ctx) {
    final var methodName = "enterUserLockOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserName(final MySqlParser.UserNameContext ctx) {
    final var methodName = "enterUserName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserPasswordOption(final MySqlParser.UserPasswordOptionContext ctx) {
    final var methodName = "enterUserPasswordOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserResourceOption(final MySqlParser.UserResourceOptionContext ctx) {
    final var methodName = "enterUserResourceOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserSpecification(final MySqlParser.UserSpecificationContext ctx) {
    final var methodName = "enterUserSpecification";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUserVariables(final MySqlParser.UserVariablesContext ctx) {
    final var methodName = "enterUserVariables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUseStatement(final MySqlParser.UseStatementContext ctx) {
    final var methodName = "enterUseStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUtilityStatement(final MySqlParser.UtilityStatementContext ctx) {
    final var methodName = "enterUtilityStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterUuidSet(final MySqlParser.UuidSetContext ctx) {
    final var methodName = "enterUuidSet";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValuesFunctionCall(final MySqlParser.ValuesFunctionCallContext ctx) {
    final var methodName = "enterValuesFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterValuesStatement(final MySqlParser.ValuesStatementContext ctx) {
    final var methodName = "enterValuesStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVariableAssignExpressionAtom(
      final MySqlParser.VariableAssignExpressionAtomContext ctx) {
    final var methodName = "enterVariableAssignExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVariableClause(final MySqlParser.VariableClauseContext ctx) {
    final var methodName = "enterVariableClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterVisibilityColumnConstraint(
      final MySqlParser.VisibilityColumnConstraintContext ctx) {
    final var methodName = "enterVisibilityColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWaitNowaitClause(final MySqlParser.WaitNowaitClauseContext ctx) {
    final var methodName = "enterWaitNowaitClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWeightFunctionCall(final MySqlParser.WeightFunctionCallContext ctx) {
    final var methodName = "enterWeightFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWhileStatement(final MySqlParser.WhileStatementContext ctx) {
    final var methodName = "enterWhileStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWildDoTableReplication(final MySqlParser.WildDoTableReplicationContext ctx) {
    final var methodName = "enterWildDoTableReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWildIgnoreTableReplication(
      final MySqlParser.WildIgnoreTableReplicationContext ctx) {
    final var methodName = "enterWildIgnoreTableReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindowClause(final MySqlParser.WindowClauseContext ctx) {
    final var methodName = "enterWindowClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindowName(final MySqlParser.WindowNameContext ctx) {
    final var methodName = "enterWindowName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWindowSpec(final MySqlParser.WindowSpecContext ctx) {
    final var methodName = "enterWindowSpec";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithClause(final MySqlParser.WithClauseContext ctx) {
    final var methodName = "enterWithClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithLateralStatement(final MySqlParser.WithLateralStatementContext ctx) {
    final var methodName = "enterWithLateralStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterWithStatement(final MySqlParser.WithStatementContext ctx) {
    final var methodName = "enterWithStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaCommitWork(final MySqlParser.XaCommitWorkContext ctx) {
    final var methodName = "enterXaCommitWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaEndTransaction(final MySqlParser.XaEndTransactionContext ctx) {
    final var methodName = "enterXaEndTransaction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaPrepareStatement(final MySqlParser.XaPrepareStatementContext ctx) {
    final var methodName = "enterXaPrepareStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaRecoverWork(final MySqlParser.XaRecoverWorkContext ctx) {
    final var methodName = "enterXaRecoverWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaRollbackWork(final MySqlParser.XaRollbackWorkContext ctx) {
    final var methodName = "enterXaRollbackWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXaStartTransaction(final MySqlParser.XaStartTransactionContext ctx) {
    final var methodName = "enterXaStartTransaction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXid(final MySqlParser.XidContext ctx) {
    final var methodName = "enterXid";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void enterXuidStringId(final MySqlParser.XuidStringIdContext ctx) {
    final var methodName = "enterXuidStringId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAddOperator(final MySqlParser.AddOperatorContext ctx) {
    final var methodName = "exitAddOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAdministrationStatement(final MySqlParser.AdministrationStatementContext ctx) {
    final var methodName = "exitAdministrationStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggregateFunctionCall(final MySqlParser.AggregateFunctionCallContext ctx) {
    final var methodName = "exitAggregateFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAggregateWindowedFunction(
      final MySqlParser.AggregateWindowedFunctionContext ctx) {
    final var methodName = "exitAggregateWindowedFunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddCheckTableConstraint(
      final MySqlParser.AlterByAddCheckTableConstraintContext ctx) {
    final var methodName = "exitAlterByAddCheckTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddColumn(final MySqlParser.AlterByAddColumnContext ctx) {
    final var methodName = "exitAlterByAddColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddColumns(final MySqlParser.AlterByAddColumnsContext ctx) {
    final var methodName = "exitAlterByAddColumns";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddDefinitions(final MySqlParser.AlterByAddDefinitionsContext ctx) {
    final var methodName = "exitAlterByAddDefinitions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddForeignKey(final MySqlParser.AlterByAddForeignKeyContext ctx) {
    final var methodName = "exitAlterByAddForeignKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddIndex(final MySqlParser.AlterByAddIndexContext ctx) {
    final var methodName = "exitAlterByAddIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddPartition(final MySqlParser.AlterByAddPartitionContext ctx) {
    final var methodName = "exitAlterByAddPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddPrimaryKey(final MySqlParser.AlterByAddPrimaryKeyContext ctx) {
    final var methodName = "exitAlterByAddPrimaryKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddSpecialIndex(final MySqlParser.AlterByAddSpecialIndexContext ctx) {
    final var methodName = "exitAlterByAddSpecialIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAddUniqueKey(final MySqlParser.AlterByAddUniqueKeyContext ctx) {
    final var methodName = "exitAlterByAddUniqueKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAlterCheckTableConstraint(
      final MySqlParser.AlterByAlterCheckTableConstraintContext ctx) {
    final var methodName = "exitAlterByAlterCheckTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAlterColumnDefault(
      final MySqlParser.AlterByAlterColumnDefaultContext ctx) {
    final var methodName = "exitAlterByAlterColumnDefault";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAlterIndexVisibility(
      final MySqlParser.AlterByAlterIndexVisibilityContext ctx) {
    final var methodName = "exitAlterByAlterIndexVisibility";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByAnalyzePartition(final MySqlParser.AlterByAnalyzePartitionContext ctx) {
    final var methodName = "exitAlterByAnalyzePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByChangeColumn(final MySqlParser.AlterByChangeColumnContext ctx) {
    final var methodName = "exitAlterByChangeColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByChangeDefault(final MySqlParser.AlterByChangeDefaultContext ctx) {
    final var methodName = "exitAlterByChangeDefault";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByCheckPartition(final MySqlParser.AlterByCheckPartitionContext ctx) {
    final var methodName = "exitAlterByCheckPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByCoalescePartition(final MySqlParser.AlterByCoalescePartitionContext ctx) {
    final var methodName = "exitAlterByCoalescePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByConvertCharset(final MySqlParser.AlterByConvertCharsetContext ctx) {
    final var methodName = "exitAlterByConvertCharset";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDefaultCharset(final MySqlParser.AlterByDefaultCharsetContext ctx) {
    final var methodName = "exitAlterByDefaultCharset";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDisableKeys(final MySqlParser.AlterByDisableKeysContext ctx) {
    final var methodName = "exitAlterByDisableKeys";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDiscardPartition(final MySqlParser.AlterByDiscardPartitionContext ctx) {
    final var methodName = "exitAlterByDiscardPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDiscardTablespace(final MySqlParser.AlterByDiscardTablespaceContext ctx) {
    final var methodName = "exitAlterByDiscardTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropColumn(final MySqlParser.AlterByDropColumnContext ctx) {
    final var methodName = "exitAlterByDropColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropConstraintCheck(
      final MySqlParser.AlterByDropConstraintCheckContext ctx) {
    final var methodName = "exitAlterByDropConstraintCheck";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropForeignKey(final MySqlParser.AlterByDropForeignKeyContext ctx) {
    final var methodName = "exitAlterByDropForeignKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropIndex(final MySqlParser.AlterByDropIndexContext ctx) {
    final var methodName = "exitAlterByDropIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropPartition(final MySqlParser.AlterByDropPartitionContext ctx) {
    final var methodName = "exitAlterByDropPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByDropPrimaryKey(final MySqlParser.AlterByDropPrimaryKeyContext ctx) {
    final var methodName = "exitAlterByDropPrimaryKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByEnableKeys(final MySqlParser.AlterByEnableKeysContext ctx) {
    final var methodName = "exitAlterByEnableKeys";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByExchangePartition(final MySqlParser.AlterByExchangePartitionContext ctx) {
    final var methodName = "exitAlterByExchangePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByForce(final MySqlParser.AlterByForceContext ctx) {
    final var methodName = "exitAlterByForce";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByImportPartition(final MySqlParser.AlterByImportPartitionContext ctx) {
    final var methodName = "exitAlterByImportPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByImportTablespace(final MySqlParser.AlterByImportTablespaceContext ctx) {
    final var methodName = "exitAlterByImportTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByLock(final MySqlParser.AlterByLockContext ctx) {
    final var methodName = "exitAlterByLock";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByModifyColumn(final MySqlParser.AlterByModifyColumnContext ctx) {
    final var methodName = "exitAlterByModifyColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByOptimizePartition(final MySqlParser.AlterByOptimizePartitionContext ctx) {
    final var methodName = "exitAlterByOptimizePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByOrder(final MySqlParser.AlterByOrderContext ctx) {
    final var methodName = "exitAlterByOrder";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRebuildPartition(final MySqlParser.AlterByRebuildPartitionContext ctx) {
    final var methodName = "exitAlterByRebuildPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRemovePartitioning(
      final MySqlParser.AlterByRemovePartitioningContext ctx) {
    final var methodName = "exitAlterByRemovePartitioning";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRename(final MySqlParser.AlterByRenameContext ctx) {
    final var methodName = "exitAlterByRename";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRenameColumn(final MySqlParser.AlterByRenameColumnContext ctx) {
    final var methodName = "exitAlterByRenameColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRenameIndex(final MySqlParser.AlterByRenameIndexContext ctx) {
    final var methodName = "exitAlterByRenameIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByReorganizePartition(
      final MySqlParser.AlterByReorganizePartitionContext ctx) {
    final var methodName = "exitAlterByReorganizePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByRepairPartition(final MySqlParser.AlterByRepairPartitionContext ctx) {
    final var methodName = "exitAlterByRepairPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterBySetAlgorithm(final MySqlParser.AlterBySetAlgorithmContext ctx) {
    final var methodName = "exitAlterBySetAlgorithm";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByTableOption(final MySqlParser.AlterByTableOptionContext ctx) {
    final var methodName = "exitAlterByTableOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByTruncatePartition(final MySqlParser.AlterByTruncatePartitionContext ctx) {
    final var methodName = "exitAlterByTruncatePartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByUpgradePartitioning(
      final MySqlParser.AlterByUpgradePartitioningContext ctx) {
    final var methodName = "exitAlterByUpgradePartitioning";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterByValidate(final MySqlParser.AlterByValidateContext ctx) {
    final var methodName = "exitAlterByValidate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterEvent(final MySqlParser.AlterEventContext ctx) {
    final var methodName = "exitAlterEvent";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterFunction(final MySqlParser.AlterFunctionContext ctx) {
    final var methodName = "exitAlterFunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterInstance(final MySqlParser.AlterInstanceContext ctx) {
    final var methodName = "exitAlterInstance";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterLogfileGroup(final MySqlParser.AlterLogfileGroupContext ctx) {
    final var methodName = "exitAlterLogfileGroup";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterPartition(final MySqlParser.AlterPartitionContext ctx) {
    final var methodName = "exitAlterPartition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterProcedure(final MySqlParser.AlterProcedureContext ctx) {
    final var methodName = "exitAlterProcedure";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterServer(final MySqlParser.AlterServerContext ctx) {
    final var methodName = "exitAlterServer";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterSimpleDatabase(final MySqlParser.AlterSimpleDatabaseContext ctx) {
    final var methodName = "exitAlterSimpleDatabase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterTable(final MySqlParser.AlterTableContext ctx) {
    final var methodName = "exitAlterTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterTablespace(final MySqlParser.AlterTablespaceContext ctx) {
    final var methodName = "exitAlterTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterUpgradeName(final MySqlParser.AlterUpgradeNameContext ctx) {
    final var methodName = "exitAlterUpgradeName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterUserMysqlV56(final MySqlParser.AlterUserMysqlV56Context ctx) {
    final var methodName = "exitAlterUserMysqlV56";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterUserMysqlV80(final MySqlParser.AlterUserMysqlV80Context ctx) {
    final var methodName = "exitAlterUserMysqlV80";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAlterView(final MySqlParser.AlterViewContext ctx) {
    final var methodName = "exitAlterView";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAnalyzeTable(final MySqlParser.AnalyzeTableContext ctx) {
    final var methodName = "exitAnalyzeTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAssignmentField(final MySqlParser.AssignmentFieldContext ctx) {
    final var methodName = "exitAssignmentField";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAtomTableItem(final MySqlParser.AtomTableItemContext ctx) {
    final var methodName = "exitAtomTableItem";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAuthOptionClause(final MySqlParser.AuthOptionClauseContext ctx) {
    final var methodName = "exitAuthOptionClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAuthPlugin(final MySqlParser.AuthPluginContext ctx) {
    final var methodName = "exitAuthPlugin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitAutoIncrementColumnConstraint(
      final MySqlParser.AutoIncrementColumnConstraintContext ctx) {
    final var methodName = "exitAutoIncrementColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBeginWork(final MySqlParser.BeginWorkContext ctx) {
    final var methodName = "exitBeginWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBetweenPredicate(final MySqlParser.BetweenPredicateContext ctx) {
    final var methodName = "exitBetweenPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBinaryComparisonPredicate(
      final MySqlParser.BinaryComparisonPredicateContext ctx) {
    final var methodName = "exitBinaryComparisonPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBinaryExpressionAtom(final MySqlParser.BinaryExpressionAtomContext ctx) {
    final var methodName = "exitBinaryExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBinlogStatement(final MySqlParser.BinlogStatementContext ctx) {
    final var methodName = "exitBinlogStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBitExpressionAtom(final MySqlParser.BitExpressionAtomContext ctx) {
    final var methodName = "exitBitExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBitOperator(final MySqlParser.BitOperatorContext ctx) {
    final var methodName = "exitBitOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBlockStatement(final MySqlParser.BlockStatementContext ctx) {
    final var methodName = "exitBlockStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBooleanLiteral(final MySqlParser.BooleanLiteralContext ctx) {
    final var methodName = "exitBooleanLiteral";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitBoolMasterOption(final MySqlParser.BoolMasterOptionContext ctx) {
    final var methodName = "exitBoolMasterOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCacheIndexStatement(final MySqlParser.CacheIndexStatementContext ctx) {
    final var methodName = "exitCacheIndexStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCallStatement(final MySqlParser.CallStatementContext ctx) {
    final var methodName = "exitCallStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseAlternative(final MySqlParser.CaseAlternativeContext ctx) {
    final var methodName = "exitCaseAlternative";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseExpressionFunctionCall(
      final MySqlParser.CaseExpressionFunctionCallContext ctx) {
    final var methodName = "exitCaseExpressionFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseFuncAlternative(final MySqlParser.CaseFuncAlternativeContext ctx) {
    final var methodName = "exitCaseFuncAlternative";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseFunctionCall(final MySqlParser.CaseFunctionCallContext ctx) {
    final var methodName = "exitCaseFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCaseStatement(final MySqlParser.CaseStatementContext ctx) {
    final var methodName = "exitCaseStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChangeMaster(final MySqlParser.ChangeMasterContext ctx) {
    final var methodName = "exitChangeMaster";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChangeReplicationFilter(final MySqlParser.ChangeReplicationFilterContext ctx) {
    final var methodName = "exitChangeReplicationFilter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChannelFlushOption(final MySqlParser.ChannelFlushOptionContext ctx) {
    final var methodName = "exitChannelFlushOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChannelOption(final MySqlParser.ChannelOptionContext ctx) {
    final var methodName = "exitChannelOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharFunctionCall(final MySqlParser.CharFunctionCallContext ctx) {
    final var methodName = "exitCharFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharSet(final MySqlParser.CharSetContext ctx) {
    final var methodName = "exitCharSet";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharsetName(final MySqlParser.CharsetNameContext ctx) {
    final var methodName = "exitCharsetName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCharsetNameBase(final MySqlParser.CharsetNameBaseContext ctx) {
    final var methodName = "exitCharsetNameBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheckColumnConstraint(final MySqlParser.CheckColumnConstraintContext ctx) {
    final var methodName = "exitCheckColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitChecksumTable(final MySqlParser.ChecksumTableContext ctx) {
    final var methodName = "exitChecksumTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheckTable(final MySqlParser.CheckTableContext ctx) {
    final var methodName = "exitCheckTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheckTableConstraint(final MySqlParser.CheckTableConstraintContext ctx) {
    final var methodName = "exitCheckTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCheckTableOption(final MySqlParser.CheckTableOptionContext ctx) {
    final var methodName = "exitCheckTableOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCloseCursor(final MySqlParser.CloseCursorContext ctx) {
    final var methodName = "exitCloseCursor";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollateColumnConstraint(final MySqlParser.CollateColumnConstraintContext ctx) {
    final var methodName = "exitCollateColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollateExpressionAtom(final MySqlParser.CollateExpressionAtomContext ctx) {
    final var methodName = "exitCollateExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollationName(final MySqlParser.CollationNameContext ctx) {
    final var methodName = "exitCollationName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollectionDataType(final MySqlParser.CollectionDataTypeContext ctx) {
    final var methodName = "exitCollectionDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCollectionOptions(final MySqlParser.CollectionOptionsContext ctx) {
    final var methodName = "exitCollectionOptions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitColumnCreateTable(final MySqlParser.ColumnCreateTableContext ctx) {
    final var methodName = "exitColumnCreateTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

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
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(MySqlParser.TableOptionTransactionalContext.class)
          .streamTerminalNodeString()
          .map(StringUtils::upperCase)
          .forEach(
              terminalNodeText -> {
                if (currentTable.getAttributes().containsKey(SqlContextImpl.TRANSACTIONAL)) {
                  currentTable
                      .getAttributes()
                      .put(SqlContextImpl.TRANSACTIONAL, NotNullSet.getInstance(terminalNodeText));
                } else if (Strings.CI.equals("TRANSACTIONAL", terminalNodeText)) {
                  currentTable
                      .getAttributes()
                      .put(SqlContextImpl.TRANSACTIONAL, NotNullSet.getInstance(Boolean.TRUE));
                }
              });
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
  public void exitColumnDeclaration(final MySqlParser.ColumnDeclarationContext ctx) {
    final var methodName = "exitColumnDeclaration";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.DimensionDataTypeContext.class)
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
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.LongVarbinaryDataTypeContext.class)
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
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.LongVarcharDataTypeContext.class)
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
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.NationalStringDataTypeContext.class)
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
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.SimpleDataTypeContext.class)
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
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.SpatialDataTypeContext.class)
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
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.StringDataTypeContext.class)
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
            .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
            .streamChildrenByClass(MySqlParser.AutoIncrementColumnConstraintContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (Strings.CI.equals("AUTO_INCREMENT", autoIncrementText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.AUTO_INCREMENT, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamTextByClass(
            MySqlParserListenerImpl.input, MySqlParser.CommentColumnConstraintContext.class)
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
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.DefaultColumnConstraintContext.class)
        .streamTextByClass(MySqlParserListenerImpl.input, MySqlParser.DefaultValueContext.class)
        .map(ParseTreeHelper::trimParentheses)
        .forEach(
            intervalText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.DEFAULT, NotNullSet.getInstance(intervalText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.DimensionDataTypeContext.class)
        .streamChildrenByClass(MySqlParser.LengthOneDimensionContext.class)
        .streamChildrenByClass(MySqlParser.DecimalLiteralContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.DimensionDataTypeContext.class)
        .streamChildrenByClass(MySqlParser.LengthTwoOptionalDimensionContext.class)
        .streamChildrenByClass(MySqlParser.DecimalLiteralContext.class)
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
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.DimensionDataTypeContext.class)
        .streamChildrenByClass(MySqlParser.LengthTwoDimensionContext.class)
        .streamChildrenByClass(MySqlParser.DecimalLiteralContext.class)
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
    var nullableText = " ";
    nullableText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
            .streamChildrenByClass(MySqlParser.NullColumnConstraintContext.class)
            .streamChildrenByClass(MySqlParser.NullNotnullContext.class)
            .streamTerminalNodeString()
            .map(StringUtils::upperCase)
            .collect(Collectors.joining(" "));
    nullableText += " ";
    nullableText +=
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
            .streamChildrenByClass(MySqlParser.CheckColumnConstraintContext.class)
            .streamChildrenByClass(MySqlParser.PredicateExpressionContext.class)
            .streamChildrenByClass(MySqlParser.IsNullPredicateContext.class)
            .streamChildrenByClass(MySqlParser.NullNotnullContext.class)
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
            .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
            .streamChildrenByClass(MySqlParser.PrimaryKeyColumnConstraintContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (Strings.CI.equals("PRIMARY KEY", primaryKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.StringDataTypeContext.class)
        .streamChildrenByClass(MySqlParser.CharsetNameContext.class)
        .streamChildrenByClass(MySqlParser.CharsetNameBaseContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.CHARSET, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.StringDataTypeContext.class)
        .streamChildrenByClass(MySqlParser.CollationNameContext.class)
        .streamChildrenByClass(MySqlParser.UidContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.COLLATION_NAME, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.StringDataTypeContext.class)
        .streamChildrenByClass(MySqlParser.CollationNameContext.class)
        .streamChildrenByClass(MySqlParser.UidContext.class)
        .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.COLLATION_NAME, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.CollateColumnConstraintContext.class)
        .streamChildrenByClass(MySqlParser.CollationNameContext.class)
        .streamChildrenByClass(MySqlParser.UidContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.COLLATION_NAME, NotNullSet.getInstance(terminalNodeText));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.StringDataTypeContext.class)
        .streamChildrenByClass(MySqlParser.LengthOneDimensionContext.class)
        .streamChildrenByClass(MySqlParser.DecimalLiteralContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.PRECISION, NotNullSet.getInstance(terminalNodeText));
              }
            });
    final var uniqueKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
            .streamChildrenByClass(MySqlParser.UniqueKeyColumnConstraintContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));
    if (Strings.CI.equals("UNIQUE", uniqueKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
      }
    }
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.VisibilityColumnConstraintContext.class)
        .forEach(
            visibilityColumnConstraintContext -> {
              for (final var currentField : currentFieldList) {
                currentField.put(Field.VISIBLE, NotNullSet.getInstance(Boolean.TRUE));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
        .streamChildrenByClass(MySqlParser.InvisibilityColumnConstraintContext.class)
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
          .streamChildrenByClass(MySqlParser.FullColumnNameContext.class)
          .streamChildrenByClass(MySqlParser.UidContext.class)
          .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
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
          .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
          .streamChildrenByClass(MySqlParser.ReferenceColumnConstraintContext.class)
          .streamChildrenByClass(MySqlParser.ReferenceDefinitionContext.class)
          .streamChildrenByClass(MySqlParser.TableNameContext.class)
          .streamChildrenByClass(MySqlParser.FullIdContext.class)
          .map(fullIdContext -> ParseTreeHelper.trimToken(fullIdContext.getText()))
          .filter(StringUtils::isNoneBlank)
          .forEach(
              fullIdText ->
                  currentRelationship.put(
                      "foreignTable",
                      NotNullSet.getInstance(ParseTreeHelper.trimToken(fullIdText))));
      ParseTreeStream.parseTreeStream(ctx)
          .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
          .streamChildrenByClass(MySqlParser.ReferenceColumnConstraintContext.class)
          .streamChildrenByClass(MySqlParser.ReferenceDefinitionContext.class)
          .streamChildrenByClass(MySqlParser.IndexColumnNamesContext.class)
          .streamChildrenByClass(MySqlParser.IndexColumnNameContext.class)
          .streamChildrenByClass(MySqlParser.UidContext.class)
          .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
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
  public void exitColumnDefinition(final MySqlParser.ColumnDefinitionContext ctx) {
    final var methodName = "exitColumnDefinition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommentColumnConstraint(final MySqlParser.CommentColumnConstraintContext ctx) {
    final var methodName = "exitCommentColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommitWork(final MySqlParser.CommitWorkContext ctx) {
    final var methodName = "exitCommitWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCommonTableExpressions(final MySqlParser.CommonTableExpressionsContext ctx) {
    final var methodName = "exitCommonTableExpressions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitComparisonOperator(final MySqlParser.ComparisonOperatorContext ctx) {
    final var methodName = "exitComparisonOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCompoundStatement(final MySqlParser.CompoundStatementContext ctx) {
    final var methodName = "exitCompoundStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstant(final MySqlParser.ConstantContext ctx) {
    final var methodName = "exitConstant";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstantExpressionAtom(final MySqlParser.ConstantExpressionAtomContext ctx) {
    final var methodName = "exitConstantExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstants(final MySqlParser.ConstantsContext ctx) {
    final var methodName = "exitConstants";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitConstraintDeclaration(final MySqlParser.ConstraintDeclarationContext ctx) {
    final var methodName = "exitConstraintDeclaration";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentFieldList = this.getCurrentFieldList(ctx);
    if (currentFieldList == null || currentFieldList.isEmpty()) {
      return;
    }

    final var primaryKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MySqlParser.PrimaryKeyTableConstraintContext.class)
            .streamTerminalNodeString()
            .collect(Collectors.joining(" "));

    if (Strings.CI.equals("PRIMARY KEY", primaryKeyText)) {
      for (final var currentField : currentFieldList) {
        currentField.put(Field.PRIMARY, NotNullSet.getInstance(Boolean.TRUE));
      }
    }

    final var uniqueKeyText =
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MySqlParser.UniqueKeyTableConstraintContext.class)
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
  public void exitConvertedDataType(final MySqlParser.ConvertedDataTypeContext ctx) {
    final var methodName = "exitConvertedDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCopyCreateTable(final MySqlParser.CopyCreateTableContext ctx) {
    final var methodName = "exitCopyCreateTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

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

    final var likeFound = new MutableBoolean(false);
    ParseTreeStream.parseTreeStream(ctx)
        .forEach(
            copyCreateTableChild -> {
              if (copyCreateTableChild instanceof final TerminalNode terminalNode) {
                likeFound.setValue(Strings.CI.equals("LIKE", terminalNode.getText()));
              }
              if (copyCreateTableChild
                      instanceof final MySqlParser.TableNameContext tableNameContext
                  && likeFound.booleanValue()) {
                ParseTreeStream.parseTreeStream(tableNameContext)
                    .streamChildrenByClass(MySqlParser.FullIdContext.class)
                    .streamChildrenByClass(MySqlParser.UidContext.class)
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
                    .streamChildrenByClass(MySqlParser.FullIdContext.class)
                    .streamChildrenByClass(MySqlParser.UidContext.class)
                    .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
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
  public void exitCreateDatabase(final MySqlParser.CreateDatabaseContext ctx) {
    final var methodName = "exitCreateDatabase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateDatabaseOption(final MySqlParser.CreateDatabaseOptionContext ctx) {
    final var methodName = "exitCreateDatabaseOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateDefinitions(final MySqlParser.CreateDefinitionsContext ctx) {
    final var methodName = "exitCreateDefinitions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateEvent(final MySqlParser.CreateEventContext ctx) {
    final var methodName = "exitCreateEvent";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateFunction(final MySqlParser.CreateFunctionContext ctx) {
    final var methodName = "exitCreateFunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateIndex(final MySqlParser.CreateIndexContext ctx) {
    final var methodName = "exitCreateIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateLogfileGroup(final MySqlParser.CreateLogfileGroupContext ctx) {
    final var methodName = "exitCreateLogfileGroup";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateProcedure(final MySqlParser.CreateProcedureContext ctx) {
    final var methodName = "exitCreateProcedure";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateRole(final MySqlParser.CreateRoleContext ctx) {
    final var methodName = "exitCreateRole";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateServer(final MySqlParser.CreateServerContext ctx) {
    final var methodName = "exitCreateServer";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTablespaceInnodb(final MySqlParser.CreateTablespaceInnodbContext ctx) {
    final var methodName = "exitCreateTablespaceInnodb";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTablespaceNdb(final MySqlParser.CreateTablespaceNdbContext ctx) {
    final var methodName = "exitCreateTablespaceNdb";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateTrigger(final MySqlParser.CreateTriggerContext ctx) {
    final var methodName = "exitCreateTrigger";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateUdfunction(final MySqlParser.CreateUdfunctionContext ctx) {
    final var methodName = "exitCreateUdfunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateUserMysqlV56(final MySqlParser.CreateUserMysqlV56Context ctx) {
    final var methodName = "exitCreateUserMysqlV56";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateUserMysqlV80(final MySqlParser.CreateUserMysqlV80Context ctx) {
    final var methodName = "exitCreateUserMysqlV80";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCreateView(final MySqlParser.CreateViewContext ctx) {
    final var methodName = "exitCreateView";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCteColumnName(final MySqlParser.CteColumnNameContext ctx) {
    final var methodName = "exitCteColumnName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCteName(final MySqlParser.CteNameContext ctx) {
    final var methodName = "exitCteName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCurrentSchemaPriviLevel(final MySqlParser.CurrentSchemaPriviLevelContext ctx) {
    final var methodName = "exitCurrentSchemaPriviLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCurrentTimestamp(final MySqlParser.CurrentTimestampContext ctx) {
    final var methodName = "exitCurrentTimestamp";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCurrentUser(final MySqlParser.CurrentUserContext ctx) {
    final var methodName = "exitCurrentUser";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitCurrentUserExpression(final MySqlParser.CurrentUserExpressionContext ctx) {
    final var methodName = "exitCurrentUserExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDataTypeBase(final MySqlParser.DataTypeBaseContext ctx) {
    final var methodName = "exitDataTypeBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDataTypeFunctionCall(final MySqlParser.DataTypeFunctionCallContext ctx) {
    final var methodName = "exitDataTypeFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDdlStatement(final MySqlParser.DdlStatementContext ctx) {
    final var methodName = "exitDdlStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeallocatePrepare(final MySqlParser.DeallocatePrepareContext ctx) {
    final var methodName = "exitDeallocatePrepare";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecimalLiteral(final MySqlParser.DecimalLiteralContext ctx) {
    final var methodName = "exitDecimalLiteral";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDecimalMasterOption(final MySqlParser.DecimalMasterOptionContext ctx) {
    final var methodName = "exitDecimalMasterOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeclareCondition(final MySqlParser.DeclareConditionContext ctx) {
    final var methodName = "exitDeclareCondition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeclareCursor(final MySqlParser.DeclareCursorContext ctx) {
    final var methodName = "exitDeclareCursor";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeclareHandler(final MySqlParser.DeclareHandlerContext ctx) {
    final var methodName = "exitDeclareHandler";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeclareVariable(final MySqlParser.DeclareVariableContext ctx) {
    final var methodName = "exitDeclareVariable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefaultAuthConnectionOption(
      final MySqlParser.DefaultAuthConnectionOptionContext ctx) {
    final var methodName = "exitDefaultAuthConnectionOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefaultColumnConstraint(final MySqlParser.DefaultColumnConstraintContext ctx) {
    final var methodName = "exitDefaultColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefaultValue(final MySqlParser.DefaultValueContext ctx) {
    final var methodName = "exitDefaultValue";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefiniteFullTablePrivLevel(
      final MySqlParser.DefiniteFullTablePrivLevelContext ctx) {
    final var methodName = "exitDefiniteFullTablePrivLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefiniteFullTablePrivLevel2(
      final MySqlParser.DefiniteFullTablePrivLevel2Context ctx) {
    final var methodName = "exitDefiniteFullTablePrivLevel2";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefiniteSchemaPrivLevel(final MySqlParser.DefiniteSchemaPrivLevelContext ctx) {
    final var methodName = "exitDefiniteSchemaPrivLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDefiniteTablePrivLevel(final MySqlParser.DefiniteTablePrivLevelContext ctx) {
    final var methodName = "exitDefiniteTablePrivLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDeleteStatement(final MySqlParser.DeleteStatementContext ctx) {
    final var methodName = "exitDeleteStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribeConnection(final MySqlParser.DescribeConnectionContext ctx) {
    final var methodName = "exitDescribeConnection";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDescribeStatements(final MySqlParser.DescribeStatementsContext ctx) {
    final var methodName = "exitDescribeStatements";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDetailRevoke(final MySqlParser.DetailRevokeContext ctx) {
    final var methodName = "exitDetailRevoke";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDiagnosticsConditionInformationName(
      final MySqlParser.DiagnosticsConditionInformationNameContext ctx) {
    final var methodName = "exitDiagnosticsConditionInformationName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDiagnosticsStatement(final MySqlParser.DiagnosticsStatementContext ctx) {
    final var methodName = "exitDiagnosticsStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDimensionDataType(final MySqlParser.DimensionDataTypeContext ctx) {
    final var methodName = "exitDimensionDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDmlStatement(final MySqlParser.DmlStatementContext ctx) {
    final var methodName = "exitDmlStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDoDbReplication(final MySqlParser.DoDbReplicationContext ctx) {
    final var methodName = "exitDoDbReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDoStatement(final MySqlParser.DoStatementContext ctx) {
    final var methodName = "exitDoStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDoTableReplication(final MySqlParser.DoTableReplicationContext ctx) {
    final var methodName = "exitDoTableReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDottedId(final MySqlParser.DottedIdContext ctx) {
    final var methodName = "exitDottedId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropDatabase(final MySqlParser.DropDatabaseContext ctx) {
    final var methodName = "exitDropDatabase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropEvent(final MySqlParser.DropEventContext ctx) {
    final var methodName = "exitDropEvent";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropFunction(final MySqlParser.DropFunctionContext ctx) {
    final var methodName = "exitDropFunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropIndex(final MySqlParser.DropIndexContext ctx) {
    final var methodName = "exitDropIndex";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropLogfileGroup(final MySqlParser.DropLogfileGroupContext ctx) {
    final var methodName = "exitDropLogfileGroup";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropProcedure(final MySqlParser.DropProcedureContext ctx) {
    final var methodName = "exitDropProcedure";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropRole(final MySqlParser.DropRoleContext ctx) {
    final var methodName = "exitDropRole";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropServer(final MySqlParser.DropServerContext ctx) {
    final var methodName = "exitDropServer";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropTable(final MySqlParser.DropTableContext ctx) {
    final var methodName = "exitDropTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropTablespace(final MySqlParser.DropTablespaceContext ctx) {
    final var methodName = "exitDropTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropTrigger(final MySqlParser.DropTriggerContext ctx) {
    final var methodName = "exitDropTrigger";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropUser(final MySqlParser.DropUserContext ctx) {
    final var methodName = "exitDropUser";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitDropView(final MySqlParser.DropViewContext ctx) {
    final var methodName = "exitDropView";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitElifAlternative(final MySqlParser.ElifAlternativeContext ctx) {
    final var methodName = "exitElifAlternative";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEmptyStatement_(final MySqlParser.EmptyStatement_Context ctx) {
    final var methodName = "exitEmptyStatement_";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEnableType(final MySqlParser.EnableTypeContext ctx) {
    final var methodName = "exitEnableType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEngineName(final MySqlParser.EngineNameContext ctx) {
    final var methodName = "exitEngineName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

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
        .streamChildrenByClass(MySqlParser.EngineNameBaseContext.class)
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
  public void exitEngineNameBase(final MySqlParser.EngineNameBaseContext ctx) {
    final var methodName = "exitEngineNameBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    final var methodName = "exitEveryRule";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExecuteStatement(final MySqlParser.ExecuteStatementContext ctx) {
    final var methodName = "exitExecuteStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExistsExpressionAtom(final MySqlParser.ExistsExpressionAtomContext ctx) {
    final var methodName = "exitExistsExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionAtomPredicate(final MySqlParser.ExpressionAtomPredicateContext ctx) {
    final var methodName = "exitExpressionAtomPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionOrDefault(final MySqlParser.ExpressionOrDefaultContext ctx) {
    final var methodName = "exitExpressionOrDefault";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressions(final MySqlParser.ExpressionsContext ctx) {
    final var methodName = "exitExpressions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExpressionsWithDefaults(final MySqlParser.ExpressionsWithDefaultsContext ctx) {
    final var methodName = "exitExpressionsWithDefaults";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitExtractFunctionCall(final MySqlParser.ExtractFunctionCallContext ctx) {
    final var methodName = "exitExtractFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFetchCursor(final MySqlParser.FetchCursorContext ctx) {
    final var methodName = "exitFetchCursor";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFileSizeLiteral(final MySqlParser.FileSizeLiteralContext ctx) {
    final var methodName = "exitFileSizeLiteral";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlushStatement(final MySqlParser.FlushStatementContext ctx) {
    final var methodName = "exitFlushStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFlushTableOption(final MySqlParser.FlushTableOptionContext ctx) {
    final var methodName = "exitFlushTableOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitForeignKeyTableConstraint(
      final MySqlParser.ForeignKeyTableConstraintContext ctx) {
    final var methodName = "exitForeignKeyTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

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
            .streamChildrenByClass(MySqlParser.ReferenceDefinitionContext.class)
            .streamChildrenByClass(MySqlParser.TableNameContext.class)
            .streamChildrenByClass(MySqlParser.FullIdContext.class)
            .streamChildrenByClass(MySqlParser.UidContext.class)
            .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
            .streamTerminalNodeString()
            .forEach(
                terminalNodeText ->
                    currentRelationship.put(
                        "foreignTable", NotNullSet.getInstance(terminalNodeText)));
        ParseTreeStream.parseTreeStream(ctx)
            .streamChildrenByClass(MySqlParser.ReferenceDefinitionContext.class)
            .streamChildrenByClass(MySqlParser.FullColumnNameContext.class)
            .streamChildrenByClass(MySqlParser.FullIdContext.class)
            .streamChildrenByClass(MySqlParser.UidContext.class)
            .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
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
            .streamChildrenByClass(MySqlParser.ReferenceDefinitionContext.class)
            .streamChildrenByClass(MySqlParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MySqlParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MySqlParser.UidContext.class)
            .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
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
            .streamChildrenByClass(MySqlParser.IndexColumnNamesContext.class)
            .streamChildrenByClass(MySqlParser.IndexColumnNameContext.class)
            .streamChildrenByClass(MySqlParser.UidContext.class)
            .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
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
      }
    }
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFormatColumnConstraint(final MySqlParser.FormatColumnConstraintContext ctx) {
    final var methodName = "exitFormatColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrameBetween(final MySqlParser.FrameBetweenContext ctx) {
    final var methodName = "exitFrameBetween";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrameClause(final MySqlParser.FrameClauseContext ctx) {
    final var methodName = "exitFrameClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrameExtent(final MySqlParser.FrameExtentContext ctx) {
    final var methodName = "exitFrameExtent";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrameRange(final MySqlParser.FrameRangeContext ctx) {
    final var methodName = "exitFrameRange";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFrameUnits(final MySqlParser.FrameUnitsContext ctx) {
    final var methodName = "exitFrameUnits";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFromClause(final MySqlParser.FromClauseContext ctx) {
    final var methodName = "exitFromClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFullColumnName(final MySqlParser.FullColumnNameContext ctx) {
    final var methodName = "exitFullColumnName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFullColumnNameExpressionAtom(
      final MySqlParser.FullColumnNameExpressionAtomContext ctx) {
    final var methodName = "exitFullColumnNameExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFullColumnNameList(final MySqlParser.FullColumnNameListContext ctx) {
    final var methodName = "exitFullColumnNameList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFullDescribeStatement(final MySqlParser.FullDescribeStatementContext ctx) {
    final var methodName = "exitFullDescribeStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFullId(final MySqlParser.FullIdContext ctx) {
    final var methodName = "exitFullId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionArg(final MySqlParser.FunctionArgContext ctx) {
    final var methodName = "exitFunctionArg";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionArgs(final MySqlParser.FunctionArgsContext ctx) {
    final var methodName = "exitFunctionArgs";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionCallExpressionAtom(
      final MySqlParser.FunctionCallExpressionAtomContext ctx) {
    final var methodName = "exitFunctionCallExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionNameBase(final MySqlParser.FunctionNameBaseContext ctx) {
    final var methodName = "exitFunctionNameBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitFunctionParameter(final MySqlParser.FunctionParameterContext ctx) {
    final var methodName = "exitFunctionParameter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGeneratedColumnConstraint(
      final MySqlParser.GeneratedColumnConstraintContext ctx) {
    final var methodName = "exitGeneratedColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGetFormatFunctionCall(final MySqlParser.GetFormatFunctionCallContext ctx) {
    final var methodName = "exitGetFormatFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGlobalPrivLevel(final MySqlParser.GlobalPrivLevelContext ctx) {
    final var methodName = "exitGlobalPrivLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantProxy(final MySqlParser.GrantProxyContext ctx) {
    final var methodName = "exitGrantProxy";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGrantStatement(final MySqlParser.GrantStatementContext ctx) {
    final var methodName = "exitGrantStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupByClause(final MySqlParser.GroupByClauseContext ctx) {
    final var methodName = "exitGroupByClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGroupByItem(final MySqlParser.GroupByItemContext ctx) {
    final var methodName = "exitGroupByItem";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGtidsUntilOption(final MySqlParser.GtidsUntilOptionContext ctx) {
    final var methodName = "exitGtidsUntilOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitGtuidSet(final MySqlParser.GtuidSetContext ctx) {
    final var methodName = "exitGtuidSet";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerCloseStatement(final MySqlParser.HandlerCloseStatementContext ctx) {
    final var methodName = "exitHandlerCloseStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionCode(final MySqlParser.HandlerConditionCodeContext ctx) {
    final var methodName = "exitHandlerConditionCode";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionException(
      final MySqlParser.HandlerConditionExceptionContext ctx) {
    final var methodName = "exitHandlerConditionException";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionName(final MySqlParser.HandlerConditionNameContext ctx) {
    final var methodName = "exitHandlerConditionName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionNotfound(final MySqlParser.HandlerConditionNotfoundContext ctx) {
    final var methodName = "exitHandlerConditionNotfound";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionState(final MySqlParser.HandlerConditionStateContext ctx) {
    final var methodName = "exitHandlerConditionState";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerConditionWarning(final MySqlParser.HandlerConditionWarningContext ctx) {
    final var methodName = "exitHandlerConditionWarning";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerOpenStatement(final MySqlParser.HandlerOpenStatementContext ctx) {
    final var methodName = "exitHandlerOpenStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerReadIndexStatement(
      final MySqlParser.HandlerReadIndexStatementContext ctx) {
    final var methodName = "exitHandlerReadIndexStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerReadStatement(final MySqlParser.HandlerReadStatementContext ctx) {
    final var methodName = "exitHandlerReadStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHandlerStatement(final MySqlParser.HandlerStatementContext ctx) {
    final var methodName = "exitHandlerStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHashAuthOption(final MySqlParser.HashAuthOptionContext ctx) {
    final var methodName = "exitHashAuthOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHavingClause(final MySqlParser.HavingClauseContext ctx) {
    final var methodName = "exitHavingClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHelpStatement(final MySqlParser.HelpStatementContext ctx) {
    final var methodName = "exitHelpStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHexadecimalLiteral(final MySqlParser.HexadecimalLiteralContext ctx) {
    final var methodName = "exitHexadecimalLiteral";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitHostName(final MySqlParser.HostNameContext ctx) {
    final var methodName = "exitHostName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIfExists(final MySqlParser.IfExistsContext ctx) {
    final var methodName = "exitIfExists";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIfNotExists(final MySqlParser.IfNotExistsContext ctx) {
    final var methodName = "exitIfNotExists";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIfStatement(final MySqlParser.IfStatementContext ctx) {
    final var methodName = "exitIfStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIgnoreDbReplication(final MySqlParser.IgnoreDbReplicationContext ctx) {
    final var methodName = "exitIgnoreDbReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIgnoreTableReplication(final MySqlParser.IgnoreTableReplicationContext ctx) {
    final var methodName = "exitIgnoreTableReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexColumnName(final MySqlParser.IndexColumnNameContext ctx) {
    final var methodName = "exitIndexColumnName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexColumnNames(final MySqlParser.IndexColumnNamesContext ctx) {
    final var methodName = "exitIndexColumnNames";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexDeclaration(final MySqlParser.IndexDeclarationContext ctx) {
    final var methodName = "exitIndexDeclaration";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexHint(final MySqlParser.IndexHintContext ctx) {
    final var methodName = "exitIndexHint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexHintType(final MySqlParser.IndexHintTypeContext ctx) {
    final var methodName = "exitIndexHintType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexOption(final MySqlParser.IndexOptionContext ctx) {
    final var methodName = "exitIndexOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIndexType(final MySqlParser.IndexTypeContext ctx) {
    final var methodName = "exitIndexType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInnerJoin(final MySqlParser.InnerJoinContext ctx) {
    final var methodName = "exitInnerJoin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInPredicate(final MySqlParser.InPredicateContext ctx) {
    final var methodName = "exitInPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsertStatement(final MySqlParser.InsertStatementContext ctx) {
    final var methodName = "exitInsertStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInsertStatementValue(final MySqlParser.InsertStatementValueContext ctx) {
    final var methodName = "exitInsertStatementValue";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInstallPlugin(final MySqlParser.InstallPluginContext ctx) {
    final var methodName = "exitInstallPlugin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalExpr(final MySqlParser.IntervalExprContext ctx) {
    final var methodName = "exitIntervalExpr";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalExpressionAtom(final MySqlParser.IntervalExpressionAtomContext ctx) {
    final var methodName = "exitIntervalExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalSchedule(final MySqlParser.IntervalScheduleContext ctx) {
    final var methodName = "exitIntervalSchedule";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalType(final MySqlParser.IntervalTypeContext ctx) {
    final var methodName = "exitIntervalType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIntervalTypeBase(final MySqlParser.IntervalTypeBaseContext ctx) {
    final var methodName = "exitIntervalTypeBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitInvisibilityColumnConstraint(
      final MySqlParser.InvisibilityColumnConstraintContext ctx) {
    final var methodName = "exitInvisibilityColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIsExpression(final MySqlParser.IsExpressionContext ctx) {
    final var methodName = "exitIsExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIsNullPredicate(final MySqlParser.IsNullPredicateContext ctx) {
    final var methodName = "exitIsNullPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitIterateStatement(final MySqlParser.IterateStatementContext ctx) {
    final var methodName = "exitIterateStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJoinSpec(final MySqlParser.JoinSpecContext ctx) {
    final var methodName = "exitJoinSpec";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonColumn(final MySqlParser.JsonColumnContext ctx) {
    final var methodName = "exitJsonColumn";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonColumnList(final MySqlParser.JsonColumnListContext ctx) {
    final var methodName = "exitJsonColumnList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonExpressionAtom(final MySqlParser.JsonExpressionAtomContext ctx) {
    final var methodName = "exitJsonExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonMemberOfPredicate(final MySqlParser.JsonMemberOfPredicateContext ctx) {
    final var methodName = "exitJsonMemberOfPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonOnEmpty(final MySqlParser.JsonOnEmptyContext ctx) {
    final var methodName = "exitJsonOnEmpty";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonOnError(final MySqlParser.JsonOnErrorContext ctx) {
    final var methodName = "exitJsonOnError";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonOperator(final MySqlParser.JsonOperatorContext ctx) {
    final var methodName = "exitJsonOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonTable(final MySqlParser.JsonTableContext ctx) {
    final var methodName = "exitJsonTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitJsonValueFunctionCall(final MySqlParser.JsonValueFunctionCallContext ctx) {
    final var methodName = "exitJsonValueFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKeywordsCanBeId(final MySqlParser.KeywordsCanBeIdContext ctx) {
    final var methodName = "exitKeywordsCanBeId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitKillStatement(final MySqlParser.KillStatementContext ctx) {
    final var methodName = "exitKillStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLateralStatement(final MySqlParser.LateralStatementContext ctx) {
    final var methodName = "exitLateralStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLeaveStatement(final MySqlParser.LeaveStatementContext ctx) {
    final var methodName = "exitLeaveStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLengthOneDimension(final MySqlParser.LengthOneDimensionContext ctx) {
    final var methodName = "exitLengthOneDimension";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLengthTwoDimension(final MySqlParser.LengthTwoDimensionContext ctx) {
    final var methodName = "exitLengthTwoDimension";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLengthTwoOptionalDimension(
      final MySqlParser.LengthTwoOptionalDimensionContext ctx) {
    final var methodName = "exitLengthTwoOptionalDimension";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevelInWeightListElement(final MySqlParser.LevelInWeightListElementContext ctx) {
    final var methodName = "exitLevelInWeightListElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevelWeightList(final MySqlParser.LevelWeightListContext ctx) {
    final var methodName = "exitLevelWeightList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLevelWeightRange(final MySqlParser.LevelWeightRangeContext ctx) {
    final var methodName = "exitLevelWeightRange";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLikePredicate(final MySqlParser.LikePredicateContext ctx) {
    final var methodName = "exitLikePredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLimitClause(final MySqlParser.LimitClauseContext ctx) {
    final var methodName = "exitLimitClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLimitClauseAtom(final MySqlParser.LimitClauseAtomContext ctx) {
    final var methodName = "exitLimitClauseAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoadDataStatement(final MySqlParser.LoadDataStatementContext ctx) {
    final var methodName = "exitLoadDataStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoadedTableIndexes(final MySqlParser.LoadedTableIndexesContext ctx) {
    final var methodName = "exitLoadedTableIndexes";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoadIndexIntoCache(final MySqlParser.LoadIndexIntoCacheContext ctx) {
    final var methodName = "exitLoadIndexIntoCache";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoadXmlStatement(final MySqlParser.LoadXmlStatementContext ctx) {
    final var methodName = "exitLoadXmlStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockAction(final MySqlParser.LockActionContext ctx) {
    final var methodName = "exitLockAction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockClause(final MySqlParser.LockClauseContext ctx) {
    final var methodName = "exitLockClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockTableElement(final MySqlParser.LockTableElementContext ctx) {
    final var methodName = "exitLockTableElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLockTables(final MySqlParser.LockTablesContext ctx) {
    final var methodName = "exitLockTables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLogicalExpression(final MySqlParser.LogicalExpressionContext ctx) {
    final var methodName = "exitLogicalExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLogicalOperator(final MySqlParser.LogicalOperatorContext ctx) {
    final var methodName = "exitLogicalOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLongVarbinaryDataType(final MySqlParser.LongVarbinaryDataTypeContext ctx) {
    final var methodName = "exitLongVarbinaryDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLongVarcharDataType(final MySqlParser.LongVarcharDataTypeContext ctx) {
    final var methodName = "exitLongVarcharDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitLoopStatement(final MySqlParser.LoopStatementContext ctx) {
    final var methodName = "exitLoopStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterBoolOption(final MySqlParser.MasterBoolOptionContext ctx) {
    final var methodName = "exitMasterBoolOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterDecimalOption(final MySqlParser.MasterDecimalOptionContext ctx) {
    final var methodName = "exitMasterDecimalOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterLogUntilOption(final MySqlParser.MasterLogUntilOptionContext ctx) {
    final var methodName = "exitMasterLogUntilOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterRealOption(final MySqlParser.MasterRealOptionContext ctx) {
    final var methodName = "exitMasterRealOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterStringOption(final MySqlParser.MasterStringOptionContext ctx) {
    final var methodName = "exitMasterStringOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMasterUidListOption(final MySqlParser.MasterUidListOptionContext ctx) {
    final var methodName = "exitMasterUidListOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMathExpressionAtom(final MySqlParser.MathExpressionAtomContext ctx) {
    final var methodName = "exitMathExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModule(final MySqlParser.ModuleContext ctx) {
    final var methodName = "exitModule";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitModuleAuthOption(final MySqlParser.ModuleAuthOptionContext ctx) {
    final var methodName = "exitModuleAuthOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMultipleDeleteStatement(final MySqlParser.MultipleDeleteStatementContext ctx) {
    final var methodName = "exitMultipleDeleteStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMultipleUpdateStatement(final MySqlParser.MultipleUpdateStatementContext ctx) {
    final var methodName = "exitMultipleUpdateStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMultOperator(final MySqlParser.MultOperatorContext ctx) {
    final var methodName = "exitMultOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMysqlVariable(final MySqlParser.MysqlVariableContext ctx) {
    final var methodName = "exitMysqlVariable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitMysqlVariableExpressionAtom(
      final MySqlParser.MysqlVariableExpressionAtomContext ctx) {
    final var methodName = "exitMysqlVariableExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNationalStringDataType(final MySqlParser.NationalStringDataTypeContext ctx) {
    final var methodName = "exitNationalStringDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNationalVaryingStringDataType(
      final MySqlParser.NationalVaryingStringDataTypeContext ctx) {
    final var methodName = "exitNationalVaryingStringDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNaturalJoin(final MySqlParser.NaturalJoinContext ctx) {
    final var methodName = "exitNaturalJoin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNestedExpressionAtom(final MySqlParser.NestedExpressionAtomContext ctx) {
    final var methodName = "exitNestedExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNestedRowExpressionAtom(final MySqlParser.NestedRowExpressionAtomContext ctx) {
    final var methodName = "exitNestedRowExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNonAggregateFunctionCall(final MySqlParser.NonAggregateFunctionCallContext ctx) {
    final var methodName = "exitNonAggregateFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNonAggregateWindowedFunction(
      final MySqlParser.NonAggregateWindowedFunctionContext ctx) {
    final var methodName = "exitNonAggregateWindowedFunction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNotExpression(final MySqlParser.NotExpressionContext ctx) {
    final var methodName = "exitNotExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNullColumnConstraint(final MySqlParser.NullColumnConstraintContext ctx) {
    final var methodName = "exitNullColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitNullNotnull(final MySqlParser.NullNotnullContext ctx) {
    final var methodName = "exitNullNotnull";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOpenCursor(final MySqlParser.OpenCursorContext ctx) {
    final var methodName = "exitOpenCursor";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOptimizeTable(final MySqlParser.OptimizeTableContext ctx) {
    final var methodName = "exitOptimizeTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrderByClause(final MySqlParser.OrderByClauseContext ctx) {
    final var methodName = "exitOrderByClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrderByExpression(final MySqlParser.OrderByExpressionContext ctx) {
    final var methodName = "exitOrderByExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOrReplace(final MySqlParser.OrReplaceContext ctx) {
    final var methodName = "exitOrReplace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOuterJoin(final MySqlParser.OuterJoinContext ctx) {
    final var methodName = "exitOuterJoin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOverClause(final MySqlParser.OverClauseContext ctx) {
    final var methodName = "exitOverClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitOwnerStatement(final MySqlParser.OwnerStatementContext ctx) {
    final var methodName = "exitOwnerStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitParenthesisSelect(final MySqlParser.ParenthesisSelectContext ctx) {
    final var methodName = "exitParenthesisSelect";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionClause(final MySqlParser.PartitionClauseContext ctx) {
    final var methodName = "exitPartitionClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionComparison(final MySqlParser.PartitionComparisonContext ctx) {
    final var methodName = "exitPartitionComparison";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionDefinerAtom(final MySqlParser.PartitionDefinerAtomContext ctx) {
    final var methodName = "exitPartitionDefinerAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionDefinerVector(final MySqlParser.PartitionDefinerVectorContext ctx) {
    final var methodName = "exitPartitionDefinerVector";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionDefinitions(final MySqlParser.PartitionDefinitionsContext ctx) {
    final var methodName = "exitPartitionDefinitions";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionFunctionHash(final MySqlParser.PartitionFunctionHashContext ctx) {
    final var methodName = "exitPartitionFunctionHash";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionFunctionKey(final MySqlParser.PartitionFunctionKeyContext ctx) {
    final var methodName = "exitPartitionFunctionKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionFunctionList(final MySqlParser.PartitionFunctionListContext ctx) {
    final var methodName = "exitPartitionFunctionList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionFunctionRange(final MySqlParser.PartitionFunctionRangeContext ctx) {
    final var methodName = "exitPartitionFunctionRange";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionListAtom(final MySqlParser.PartitionListAtomContext ctx) {
    final var methodName = "exitPartitionListAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionListVector(final MySqlParser.PartitionListVectorContext ctx) {
    final var methodName = "exitPartitionListVector";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionComment(final MySqlParser.PartitionOptionCommentContext ctx) {
    final var methodName = "exitPartitionOptionComment";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionDataDirectory(
      final MySqlParser.PartitionOptionDataDirectoryContext ctx) {
    final var methodName = "exitPartitionOptionDataDirectory";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionEngine(final MySqlParser.PartitionOptionEngineContext ctx) {
    final var methodName = "exitPartitionOptionEngine";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionIndexDirectory(
      final MySqlParser.PartitionOptionIndexDirectoryContext ctx) {
    final var methodName = "exitPartitionOptionIndexDirectory";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionMaxRows(final MySqlParser.PartitionOptionMaxRowsContext ctx) {
    final var methodName = "exitPartitionOptionMaxRows";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionMinRows(final MySqlParser.PartitionOptionMinRowsContext ctx) {
    final var methodName = "exitPartitionOptionMinRows";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionNodeGroup(final MySqlParser.PartitionOptionNodeGroupContext ctx) {
    final var methodName = "exitPartitionOptionNodeGroup";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionOptionTablespace(
      final MySqlParser.PartitionOptionTablespaceContext ctx) {
    final var methodName = "exitPartitionOptionTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPartitionSimple(final MySqlParser.PartitionSimpleContext ctx) {
    final var methodName = "exitPartitionSimple";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPasswordConnectionOption(final MySqlParser.PasswordConnectionOptionContext ctx) {
    final var methodName = "exitPasswordConnectionOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPasswordFunctionCall(final MySqlParser.PasswordFunctionCallContext ctx) {
    final var methodName = "exitPasswordFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPasswordFunctionClause(final MySqlParser.PasswordFunctionClauseContext ctx) {
    final var methodName = "exitPasswordFunctionClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPasswordModuleOption(final MySqlParser.PasswordModuleOptionContext ctx) {
    final var methodName = "exitPasswordModuleOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPluginDirConnectionOption(
      final MySqlParser.PluginDirConnectionOptionContext ctx) {
    final var methodName = "exitPluginDirConnectionOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPositionFunctionCall(final MySqlParser.PositionFunctionCallContext ctx) {
    final var methodName = "exitPositionFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPreciseSchedule(final MySqlParser.PreciseScheduleContext ctx) {
    final var methodName = "exitPreciseSchedule";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPredicateExpression(final MySqlParser.PredicateExpressionContext ctx) {
    final var methodName = "exitPredicateExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPreparedStatement(final MySqlParser.PreparedStatementContext ctx) {
    final var methodName = "exitPreparedStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrepareStatement(final MySqlParser.PrepareStatementContext ctx) {
    final var methodName = "exitPrepareStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimaryKeyColumnConstraint(
      final MySqlParser.PrimaryKeyColumnConstraintContext ctx) {
    final var methodName = "exitPrimaryKeyColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrimaryKeyTableConstraint(
      final MySqlParser.PrimaryKeyTableConstraintContext ctx) {
    final var methodName = "exitPrimaryKeyTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

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
  public void exitPrivelegeClause(final MySqlParser.PrivelegeClauseContext ctx) {
    final var methodName = "exitPrivelegeClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilege(final MySqlParser.PrivilegeContext ctx) {
    final var methodName = "exitPrivilege";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPrivilegesBase(final MySqlParser.PrivilegesBaseContext ctx) {
    final var methodName = "exitPrivilegesBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProcedureParameter(final MySqlParser.ProcedureParameterContext ctx) {
    final var methodName = "exitProcedureParameter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitProcedureSqlStatement(final MySqlParser.ProcedureSqlStatementContext ctx) {
    final var methodName = "exitProcedureSqlStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitPurgeBinaryLogs(final MySqlParser.PurgeBinaryLogsContext ctx) {
    final var methodName = "exitPurgeBinaryLogs";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQueryCreateTable(final MySqlParser.QueryCreateTableContext ctx) {
    final var methodName = "exitQueryCreateTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

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
  public void exitQueryExpression(final MySqlParser.QueryExpressionContext ctx) {
    final var methodName = "exitQueryExpression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQueryExpressionNointo(final MySqlParser.QueryExpressionNointoContext ctx) {
    final var methodName = "exitQueryExpressionNointo";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuerySpecification(final MySqlParser.QuerySpecificationContext ctx) {
    final var methodName = "exitQuerySpecification";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitQuerySpecificationNointo(final MySqlParser.QuerySpecificationNointoContext ctx) {
    final var methodName = "exitQuerySpecificationNointo";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRandomAuthOption(final MySqlParser.RandomAuthOptionContext ctx) {
    final var methodName = "exitRandomAuthOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReferenceAction(final MySqlParser.ReferenceActionContext ctx) {
    final var methodName = "exitReferenceAction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReferenceColumnConstraint(
      final MySqlParser.ReferenceColumnConstraintContext ctx) {
    final var methodName = "exitReferenceColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReferenceControlType(final MySqlParser.ReferenceControlTypeContext ctx) {
    final var methodName = "exitReferenceControlType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReferenceDefinition(final MySqlParser.ReferenceDefinitionContext ctx) {
    final var methodName = "exitReferenceDefinition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRegexpPredicate(final MySqlParser.RegexpPredicateContext ctx) {
    final var methodName = "exitRegexpPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRelayLogUntilOption(final MySqlParser.RelayLogUntilOptionContext ctx) {
    final var methodName = "exitRelayLogUntilOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReleaseStatement(final MySqlParser.ReleaseStatementContext ctx) {
    final var methodName = "exitReleaseStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRenameTable(final MySqlParser.RenameTableContext ctx) {
    final var methodName = "exitRenameTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRenameTableClause(final MySqlParser.RenameTableClauseContext ctx) {
    final var methodName = "exitRenameTableClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRenameUser(final MySqlParser.RenameUserContext ctx) {
    final var methodName = "exitRenameUser";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRenameUserClause(final MySqlParser.RenameUserClauseContext ctx) {
    final var methodName = "exitRenameUserClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRepairTable(final MySqlParser.RepairTableContext ctx) {
    final var methodName = "exitRepairTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRepeatStatement(final MySqlParser.RepeatStatementContext ctx) {
    final var methodName = "exitRepeatStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplaceStatement(final MySqlParser.ReplaceStatementContext ctx) {
    final var methodName = "exitReplaceStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReplicationStatement(final MySqlParser.ReplicationStatementContext ctx) {
    final var methodName = "exitReplicationStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResetMaster(final MySqlParser.ResetMasterContext ctx) {
    final var methodName = "exitResetMaster";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResetSlave(final MySqlParser.ResetSlaveContext ctx) {
    final var methodName = "exitResetSlave";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResetStatement(final MySqlParser.ResetStatementContext ctx) {
    final var methodName = "exitResetStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitResignalStatement(final MySqlParser.ResignalStatementContext ctx) {
    final var methodName = "exitResignalStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitReturnStatement(final MySqlParser.ReturnStatementContext ctx) {
    final var methodName = "exitReturnStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRevokeProxy(final MySqlParser.RevokeProxyContext ctx) {
    final var methodName = "exitRevokeProxy";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRewriteDbReplication(final MySqlParser.RewriteDbReplicationContext ctx) {
    final var methodName = "exitRewriteDbReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoleName(final MySqlParser.RoleNameContext ctx) {
    final var methodName = "exitRoleName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoleOption(final MySqlParser.RoleOptionContext ctx) {
    final var methodName = "exitRoleOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoleRevoke(final MySqlParser.RoleRevokeContext ctx) {
    final var methodName = "exitRoleRevoke";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollbackStatement(final MySqlParser.RollbackStatementContext ctx) {
    final var methodName = "exitRollbackStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRollbackWork(final MySqlParser.RollbackWorkContext ctx) {
    final var methodName = "exitRollbackWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoot(final MySqlParser.RootContext ctx) {
    final var methodName = "exitRoot";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineBehavior(final MySqlParser.RoutineBehaviorContext ctx) {
    final var methodName = "exitRoutineBehavior";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineBody(final MySqlParser.RoutineBodyContext ctx) {
    final var methodName = "exitRoutineBody";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineComment(final MySqlParser.RoutineCommentContext ctx) {
    final var methodName = "exitRoutineComment";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineData(final MySqlParser.RoutineDataContext ctx) {
    final var methodName = "exitRoutineData";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineLanguage(final MySqlParser.RoutineLanguageContext ctx) {
    final var methodName = "exitRoutineLanguage";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitRoutineSecurity(final MySqlParser.RoutineSecurityContext ctx) {
    final var methodName = "exitRoutineSecurity";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSavepointStatement(final MySqlParser.SavepointStatementContext ctx) {
    final var methodName = "exitSavepointStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitScalarFunctionCall(final MySqlParser.ScalarFunctionCallContext ctx) {
    final var methodName = "exitScalarFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitScalarFunctionName(final MySqlParser.ScalarFunctionNameContext ctx) {
    final var methodName = "exitScalarFunctionName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectColumnElement(final MySqlParser.SelectColumnElementContext ctx) {
    final var methodName = "exitSelectColumnElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectElements(final MySqlParser.SelectElementsContext ctx) {
    final var methodName = "exitSelectElements";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectExpressionElement(final MySqlParser.SelectExpressionElementContext ctx) {
    final var methodName = "exitSelectExpressionElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectFieldsInto(final MySqlParser.SelectFieldsIntoContext ctx) {
    final var methodName = "exitSelectFieldsInto";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectFunctionElement(final MySqlParser.SelectFunctionElementContext ctx) {
    final var methodName = "exitSelectFunctionElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectIntoDumpFile(final MySqlParser.SelectIntoDumpFileContext ctx) {
    final var methodName = "exitSelectIntoDumpFile";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectIntoTextFile(final MySqlParser.SelectIntoTextFileContext ctx) {
    final var methodName = "exitSelectIntoTextFile";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectIntoVariables(final MySqlParser.SelectIntoVariablesContext ctx) {
    final var methodName = "exitSelectIntoVariables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectLinesInto(final MySqlParser.SelectLinesIntoContext ctx) {
    final var methodName = "exitSelectLinesInto";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectSpec(final MySqlParser.SelectSpecContext ctx) {
    final var methodName = "exitSelectSpec";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSelectStarElement(final MySqlParser.SelectStarElementContext ctx) {
    final var methodName = "exitSelectStarElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSerialDefaultColumnConstraint(
      final MySqlParser.SerialDefaultColumnConstraintContext ctx) {
    final var methodName = "exitSerialDefaultColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitServerOption(final MySqlParser.ServerOptionContext ctx) {
    final var methodName = "exitServerOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetAutocommit(final MySqlParser.SetAutocommitContext ctx) {
    final var methodName = "exitSetAutocommit";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetAutocommitStatement(final MySqlParser.SetAutocommitStatementContext ctx) {
    final var methodName = "exitSetAutocommitStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetCharset(final MySqlParser.SetCharsetContext ctx) {
    final var methodName = "exitSetCharset";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetNames(final MySqlParser.SetNamesContext ctx) {
    final var methodName = "exitSetNames";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetNewValueInsideTrigger(final MySqlParser.SetNewValueInsideTriggerContext ctx) {
    final var methodName = "exitSetNewValueInsideTrigger";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetPassword(final MySqlParser.SetPasswordContext ctx) {
    final var methodName = "exitSetPassword";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetPasswordStatement(final MySqlParser.SetPasswordStatementContext ctx) {
    final var methodName = "exitSetPasswordStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetRole(final MySqlParser.SetRoleContext ctx) {
    final var methodName = "exitSetRole";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetTransaction(final MySqlParser.SetTransactionContext ctx) {
    final var methodName = "exitSetTransaction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetTransactionStatement(final MySqlParser.SetTransactionStatementContext ctx) {
    final var methodName = "exitSetTransactionStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSetVariable(final MySqlParser.SetVariableContext ctx) {
    final var methodName = "exitSetVariable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShortRevoke(final MySqlParser.ShortRevokeContext ctx) {
    final var methodName = "exitShortRevoke";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowColumns(final MySqlParser.ShowColumnsContext ctx) {
    final var methodName = "exitShowColumns";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCommonEntity(final MySqlParser.ShowCommonEntityContext ctx) {
    final var methodName = "exitShowCommonEntity";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCountErrors(final MySqlParser.ShowCountErrorsContext ctx) {
    final var methodName = "exitShowCountErrors";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCreateDb(final MySqlParser.ShowCreateDbContext ctx) {
    final var methodName = "exitShowCreateDb";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCreateFullIdObject(final MySqlParser.ShowCreateFullIdObjectContext ctx) {
    final var methodName = "exitShowCreateFullIdObject";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowCreateUser(final MySqlParser.ShowCreateUserContext ctx) {
    final var methodName = "exitShowCreateUser";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowEngine(final MySqlParser.ShowEngineContext ctx) {
    final var methodName = "exitShowEngine";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowErrors(final MySqlParser.ShowErrorsContext ctx) {
    final var methodName = "exitShowErrors";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowFilter(final MySqlParser.ShowFilterContext ctx) {
    final var methodName = "exitShowFilter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowGlobalInfo(final MySqlParser.ShowGlobalInfoContext ctx) {
    final var methodName = "exitShowGlobalInfo";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowGlobalInfoClause(final MySqlParser.ShowGlobalInfoClauseContext ctx) {
    final var methodName = "exitShowGlobalInfoClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowGrants(final MySqlParser.ShowGrantsContext ctx) {
    final var methodName = "exitShowGrants";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowIndexes(final MySqlParser.ShowIndexesContext ctx) {
    final var methodName = "exitShowIndexes";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowLogEvents(final MySqlParser.ShowLogEventsContext ctx) {
    final var methodName = "exitShowLogEvents";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowMasterLogs(final MySqlParser.ShowMasterLogsContext ctx) {
    final var methodName = "exitShowMasterLogs";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowObjectFilter(final MySqlParser.ShowObjectFilterContext ctx) {
    final var methodName = "exitShowObjectFilter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowOpenTables(final MySqlParser.ShowOpenTablesContext ctx) {
    final var methodName = "exitShowOpenTables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowProfile(final MySqlParser.ShowProfileContext ctx) {
    final var methodName = "exitShowProfile";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowProfileType(final MySqlParser.ShowProfileTypeContext ctx) {
    final var methodName = "exitShowProfileType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowRoutine(final MySqlParser.ShowRoutineContext ctx) {
    final var methodName = "exitShowRoutine";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowSchemaEntity(final MySqlParser.ShowSchemaEntityContext ctx) {
    final var methodName = "exitShowSchemaEntity";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowSchemaFilter(final MySqlParser.ShowSchemaFilterContext ctx) {
    final var methodName = "exitShowSchemaFilter";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShowSlaveStatus(final MySqlParser.ShowSlaveStatusContext ctx) {
    final var methodName = "exitShowSlaveStatus";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitShutdownStatement(final MySqlParser.ShutdownStatementContext ctx) {
    final var methodName = "exitShutdownStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSignalConditionInformation(
      final MySqlParser.SignalConditionInformationContext ctx) {
    final var methodName = "exitSignalConditionInformation";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSignalStatement(final MySqlParser.SignalStatementContext ctx) {
    final var methodName = "exitSignalStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleAuthOption(final MySqlParser.SimpleAuthOptionContext ctx) {
    final var methodName = "exitSimpleAuthOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleDataType(final MySqlParser.SimpleDataTypeContext ctx) {
    final var methodName = "exitSimpleDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleDescribeStatement(final MySqlParser.SimpleDescribeStatementContext ctx) {
    final var methodName = "exitSimpleDescribeStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleFlushOption(final MySqlParser.SimpleFlushOptionContext ctx) {
    final var methodName = "exitSimpleFlushOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleFunctionCall(final MySqlParser.SimpleFunctionCallContext ctx) {
    final var methodName = "exitSimpleFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleId(final MySqlParser.SimpleIdContext ctx) {
    final var methodName = "exitSimpleId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleIndexDeclaration(final MySqlParser.SimpleIndexDeclarationContext ctx) {
    final var methodName = "exitSimpleIndexDeclaration";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleSelect(final MySqlParser.SimpleSelectContext ctx) {
    final var methodName = "exitSimpleSelect";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleStrings(final MySqlParser.SimpleStringsContext ctx) {
    final var methodName = "exitSimpleStrings";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSimpleUserName(final MySqlParser.SimpleUserNameContext ctx) {
    final var methodName = "exitSimpleUserName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSingleDeleteStatement(final MySqlParser.SingleDeleteStatementContext ctx) {
    final var methodName = "exitSingleDeleteStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSingleUpdateStatement(final MySqlParser.SingleUpdateStatementContext ctx) {
    final var methodName = "exitSingleUpdateStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSoundsLikePredicate(final MySqlParser.SoundsLikePredicateContext ctx) {
    final var methodName = "exitSoundsLikePredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSpatialDataType(final MySqlParser.SpatialDataTypeContext ctx) {
    final var methodName = "exitSpatialDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSpecialIndexDeclaration(final MySqlParser.SpecialIndexDeclarationContext ctx) {
    final var methodName = "exitSpecialIndexDeclaration";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSpecificFunctionCall(final MySqlParser.SpecificFunctionCallContext ctx) {
    final var methodName = "exitSpecificFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSqlGapsUntilOption(final MySqlParser.SqlGapsUntilOptionContext ctx) {
    final var methodName = "exitSqlGapsUntilOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSqlStatement(final MySqlParser.SqlStatementContext ctx) {
    final var methodName = "exitSqlStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSqlStatements(final MySqlParser.SqlStatementsContext ctx) {
    final var methodName = "exitSqlStatements";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStartGroupReplication(final MySqlParser.StartGroupReplicationContext ctx) {
    final var methodName = "exitStartGroupReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStartSlave(final MySqlParser.StartSlaveContext ctx) {
    final var methodName = "exitStartSlave";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStartTransaction(final MySqlParser.StartTransactionContext ctx) {
    final var methodName = "exitStartTransaction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStopGroupReplication(final MySqlParser.StopGroupReplicationContext ctx) {
    final var methodName = "exitStopGroupReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStopSlave(final MySqlParser.StopSlaveContext ctx) {
    final var methodName = "exitStopSlave";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStorageColumnConstraint(final MySqlParser.StorageColumnConstraintContext ctx) {
    final var methodName = "exitStorageColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStraightJoin(final MySqlParser.StraightJoinContext ctx) {
    final var methodName = "exitStraightJoin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStringAuthOption(final MySqlParser.StringAuthOptionContext ctx) {
    final var methodName = "exitStringAuthOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStringDataType(final MySqlParser.StringDataTypeContext ctx) {
    final var methodName = "exitStringDataType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStringLiteral(final MySqlParser.StringLiteralContext ctx) {
    final var methodName = "exitStringLiteral";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitStringMasterOption(final MySqlParser.StringMasterOptionContext ctx) {
    final var methodName = "exitStringMasterOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubpartitionDefinition(final MySqlParser.SubpartitionDefinitionContext ctx) {
    final var methodName = "exitSubpartitionDefinition";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubPartitionFunctionHash(final MySqlParser.SubPartitionFunctionHashContext ctx) {
    final var methodName = "exitSubPartitionFunctionHash";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubPartitionFunctionKey(final MySqlParser.SubPartitionFunctionKeyContext ctx) {
    final var methodName = "exitSubPartitionFunctionKey";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubqueryComparisonPredicate(
      final MySqlParser.SubqueryComparisonPredicateContext ctx) {
    final var methodName = "exitSubqueryComparisonPredicate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubqueryExpressionAtom(final MySqlParser.SubqueryExpressionAtomContext ctx) {
    final var methodName = "exitSubqueryExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubqueryTableItem(final MySqlParser.SubqueryTableItemContext ctx) {
    final var methodName = "exitSubqueryTableItem";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitSubstrFunctionCall(final MySqlParser.SubstrFunctionCallContext ctx) {
    final var methodName = "exitSubstrFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableFlushOption(final MySqlParser.TableFlushOptionContext ctx) {
    final var methodName = "exitTableFlushOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableIndexes(final MySqlParser.TableIndexesContext ctx) {
    final var methodName = "exitTableIndexes";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableJson(final MySqlParser.TableJsonContext ctx) {
    final var methodName = "exitTableJson";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableName(final MySqlParser.TableNameContext ctx) {
    final var methodName = "exitTableName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionAutoextendSize(
      final MySqlParser.TableOptionAutoextendSizeContext ctx) {
    final var methodName = "exitTableOptionAutoextendSize";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionAutoIncrement(final MySqlParser.TableOptionAutoIncrementContext ctx) {
    final var methodName = "exitTableOptionAutoIncrement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionAverage(final MySqlParser.TableOptionAverageContext ctx) {
    final var methodName = "exitTableOptionAverage";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionCharset(final MySqlParser.TableOptionCharsetContext ctx) {
    final var methodName = "exitTableOptionCharset";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

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
        .streamChildrenByClass(MySqlParser.CharsetNameContext.class)
        .streamChildrenByClass(MySqlParser.CharsetNameBaseContext.class)
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
  public void exitTableOptionChecksum(final MySqlParser.TableOptionChecksumContext ctx) {
    final var methodName = "exitTableOptionChecksum";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

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
  public void exitTableOptionCollate(final MySqlParser.TableOptionCollateContext ctx) {
    final var methodName = "exitTableOptionCollate";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

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
          .streamChildrenByClass(MySqlParser.CollationNameContext.class)
          .streamChildrenByClass(MySqlParser.UidContext.class)
          .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
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
  public void exitTableOptionComment(final MySqlParser.TableOptionCommentContext ctx) {
    final var methodName = "exitTableOptionComment";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx.getParent())
        .streamTextByClass(
            MySqlParserListenerImpl.input, MySqlParser.TableOptionCommentContext.class)
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
  public void exitTableOptionCompression(final MySqlParser.TableOptionCompressionContext ctx) {
    final var methodName = "exitTableOptionCompression";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionConnection(final MySqlParser.TableOptionConnectionContext ctx) {
    final var methodName = "exitTableOptionConnection";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionDataDirectory(final MySqlParser.TableOptionDataDirectoryContext ctx) {
    final var methodName = "exitTableOptionDataDirectory";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionDelay(final MySqlParser.TableOptionDelayContext ctx) {
    final var methodName = "exitTableOptionDelay";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionEncryption(final MySqlParser.TableOptionEncryptionContext ctx) {
    final var methodName = "exitTableOptionEncryption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionEncryptionKeyId(
      final MySqlParser.TableOptionEncryptionKeyIdContext ctx) {
    final var methodName = "exitTableOptionEncryptionKeyId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionEngine(final MySqlParser.TableOptionEngineContext ctx) {
    final var methodName = "exitTableOptionEngine";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.EngineNameContext.class)
        .streamTerminalNodeString()
        .forEach(
            terminalNodeText ->
                currentTable
                    .getAttributes()
                    .put(SqlContextImpl.ENGINE, NotNullSet.getInstance(terminalNodeText)));
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.EngineNameContext.class)
        .streamChildrenByClass(MySqlParser.EngineNameBaseContext.class)
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
  public void exitTableOptionEngineAttribute(
      final MySqlParser.TableOptionEngineAttributeContext ctx) {
    final var methodName = "exitTableOptionEngineAttribute";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionIndexDirectory(
      final MySqlParser.TableOptionIndexDirectoryContext ctx) {
    final var methodName = "exitTableOptionIndexDirectory";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionInsertMethod(final MySqlParser.TableOptionInsertMethodContext ctx) {
    final var methodName = "exitTableOptionInsertMethod";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionKeyBlockSize(final MySqlParser.TableOptionKeyBlockSizeContext ctx) {
    final var methodName = "exitTableOptionKeyBlockSize";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionMaxRows(final MySqlParser.TableOptionMaxRowsContext ctx) {
    final var methodName = "exitTableOptionMaxRows";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionMinRows(final MySqlParser.TableOptionMinRowsContext ctx) {
    final var methodName = "exitTableOptionMinRows";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionPackKeys(final MySqlParser.TableOptionPackKeysContext ctx) {
    final var methodName = "exitTableOptionPackKeys";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionPageCompressed(
      final MySqlParser.TableOptionPageCompressedContext ctx) {
    final var methodName = "exitTableOptionPageCompressed";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionPageCompressionLevel(
      final MySqlParser.TableOptionPageCompressionLevelContext ctx) {
    final var methodName = "exitTableOptionPageCompressionLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionPassword(final MySqlParser.TableOptionPasswordContext ctx) {
    final var methodName = "exitTableOptionPassword";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionPersistent(final MySqlParser.TableOptionPersistentContext ctx) {
    final var methodName = "exitTableOptionPersistent";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionRecalculation(final MySqlParser.TableOptionRecalculationContext ctx) {
    final var methodName = "exitTableOptionRecalculation";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionRowFormat(final MySqlParser.TableOptionRowFormatContext ctx) {
    final var methodName = "exitTableOptionRowFormat";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionSamplePage(final MySqlParser.TableOptionSamplePageContext ctx) {
    final var methodName = "exitTableOptionSamplePage";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionSecondaryEngineAttribute(
      final MySqlParser.TableOptionSecondaryEngineAttributeContext ctx) {
    final var methodName = "exitTableOptionSecondaryEngineAttribute";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionStartTransaction(
      final MySqlParser.TableOptionStartTransactionContext ctx) {
    final var methodName = "exitTableOptionStartTransaction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionTablespace(final MySqlParser.TableOptionTablespaceContext ctx) {
    final var methodName = "exitTableOptionTablespace";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableOptionTableType(final MySqlParser.TableOptionTableTypeContext ctx) {
    final var methodName = "exitTableOptionTableType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.TableTypeContext.class)
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
  public void exitTableOptionUnion(final MySqlParser.TableOptionUnionContext ctx) {
    final var methodName = "exitTableOptionUnion";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablePair(final MySqlParser.TablePairContext ctx) {
    final var methodName = "exitTablePair";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTables(final MySqlParser.TablesContext ctx) {
    final var methodName = "exitTables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSourceBase(final MySqlParser.TableSourceBaseContext ctx) {
    final var methodName = "exitTableSourceBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSourceNested(final MySqlParser.TableSourceNestedContext ctx) {
    final var methodName = "exitTableSourceNested";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSources(final MySqlParser.TableSourcesContext ctx) {
    final var methodName = "exitTableSources";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableSourcesItem(final MySqlParser.TableSourcesItemContext ctx) {
    final var methodName = "exitTableSourcesItem";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTablespaceStorage(final MySqlParser.TablespaceStorageContext ctx) {
    final var methodName = "exitTablespaceStorage";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableStatement(final MySqlParser.TableStatementContext ctx) {
    final var methodName = "exitTableStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTableType(final MySqlParser.TableTypeContext ctx) {
    final var methodName = "exitTableType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

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
  public void exitThreadType(final MySqlParser.ThreadTypeContext ctx) {
    final var methodName = "exitThreadType";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTimestampValue(final MySqlParser.TimestampValueContext ctx) {
    final var methodName = "exitTimestampValue";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTlsOption(final MySqlParser.TlsOptionContext ctx) {
    final var methodName = "exitTlsOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionLevel(final MySqlParser.TransactionLevelContext ctx) {
    final var methodName = "exitTransactionLevel";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionLevelBase(final MySqlParser.TransactionLevelBaseContext ctx) {
    final var methodName = "exitTransactionLevelBase";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionMode(final MySqlParser.TransactionModeContext ctx) {
    final var methodName = "exitTransactionMode";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionOption(final MySqlParser.TransactionOptionContext ctx) {
    final var methodName = "exitTransactionOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTransactionStatement(final MySqlParser.TransactionStatementContext ctx) {
    final var methodName = "exitTransactionStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTrimFunctionCall(final MySqlParser.TrimFunctionCallContext ctx) {
    final var methodName = "exitTrimFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitTruncateTable(final MySqlParser.TruncateTableContext ctx) {
    final var methodName = "exitTruncateTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUdfFunctionCall(final MySqlParser.UdfFunctionCallContext ctx) {
    final var methodName = "exitUdfFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUid(final MySqlParser.UidContext ctx) {
    final var methodName = "exitUid";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUidList(final MySqlParser.UidListContext ctx) {
    final var methodName = "exitUidList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnaryExpressionAtom(final MySqlParser.UnaryExpressionAtomContext ctx) {
    final var methodName = "exitUnaryExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnaryOperator(final MySqlParser.UnaryOperatorContext ctx) {
    final var methodName = "exitUnaryOperator";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUninstallPlugin(final MySqlParser.UninstallPluginContext ctx) {
    final var methodName = "exitUninstallPlugin";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnionParenthesis(final MySqlParser.UnionParenthesisContext ctx) {
    final var methodName = "exitUnionParenthesis";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnionParenthesisSelect(final MySqlParser.UnionParenthesisSelectContext ctx) {
    final var methodName = "exitUnionParenthesisSelect";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnionSelect(final MySqlParser.UnionSelectContext ctx) {
    final var methodName = "exitUnionSelect";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnionStatement(final MySqlParser.UnionStatementContext ctx) {
    final var methodName = "exitUnionStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueKeyColumnConstraint(
      final MySqlParser.UniqueKeyColumnConstraintContext ctx) {
    final var methodName = "exitUniqueKeyColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUniqueKeyTableConstraint(final MySqlParser.UniqueKeyTableConstraintContext ctx) {
    final var methodName = "exitUniqueKeyTableConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return;
    }

    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.IndexColumnNamesContext.class)
        .streamChildrenByClass(MySqlParser.IndexColumnNameContext.class)
        .streamChildrenByClass(MySqlParser.UidContext.class)
        .filter(TerminalNode.class::isInstance)
        .forEach(
            terminalNode -> {
              final var field = ParseTreeHelper.getField(currentTable, terminalNode);
              if (field != null && !field.containsKey(Field.UNIQUE)) {
                field.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
              }
            });
    ParseTreeStream.parseTreeStream(ctx)
        .streamChildrenByClass(MySqlParser.IndexColumnNamesContext.class)
        .streamChildrenByClass(MySqlParser.IndexColumnNameContext.class)
        .streamChildrenByClass(MySqlParser.UidContext.class)
        .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
        .filter(TerminalNode.class::isInstance)
        .forEach(
            terminalNode -> {
              final var field = ParseTreeHelper.getField(currentTable, terminalNode);
              if (field != null && !field.containsKey(Field.UNIQUE)) {
                field.put(Field.UNIQUE, NotNullSet.getInstance(Boolean.TRUE));
              }
            });
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUnlockTables(final MySqlParser.UnlockTablesContext ctx) {
    final var methodName = "exitUnlockTables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdatedElement(final MySqlParser.UpdatedElementContext ctx) {
    final var methodName = "exitUpdatedElement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUpdateStatement(final MySqlParser.UpdateStatementContext ctx) {
    final var methodName = "exitUpdateStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserConnectionOption(final MySqlParser.UserConnectionOptionContext ctx) {
    final var methodName = "exitUserConnectionOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserLockOption(final MySqlParser.UserLockOptionContext ctx) {
    final var methodName = "exitUserLockOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserName(final MySqlParser.UserNameContext ctx) {
    final var methodName = "exitUserName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserPasswordOption(final MySqlParser.UserPasswordOptionContext ctx) {
    final var methodName = "exitUserPasswordOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserResourceOption(final MySqlParser.UserResourceOptionContext ctx) {
    final var methodName = "exitUserResourceOption";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserSpecification(final MySqlParser.UserSpecificationContext ctx) {
    final var methodName = "exitUserSpecification";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUserVariables(final MySqlParser.UserVariablesContext ctx) {
    final var methodName = "exitUserVariables";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUseStatement(final MySqlParser.UseStatementContext ctx) {
    final var methodName = "exitUseStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUtilityStatement(final MySqlParser.UtilityStatementContext ctx) {
    final var methodName = "exitUtilityStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitUuidSet(final MySqlParser.UuidSetContext ctx) {
    final var methodName = "exitUuidSet";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValuesFunctionCall(final MySqlParser.ValuesFunctionCallContext ctx) {
    final var methodName = "exitValuesFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitValuesStatement(final MySqlParser.ValuesStatementContext ctx) {
    final var methodName = "exitValuesStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVariableAssignExpressionAtom(
      final MySqlParser.VariableAssignExpressionAtomContext ctx) {
    final var methodName = "exitVariableAssignExpressionAtom";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVariableClause(final MySqlParser.VariableClauseContext ctx) {
    final var methodName = "exitVariableClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitVisibilityColumnConstraint(
      final MySqlParser.VisibilityColumnConstraintContext ctx) {
    final var methodName = "exitVisibilityColumnConstraint";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWaitNowaitClause(final MySqlParser.WaitNowaitClauseContext ctx) {
    final var methodName = "exitWaitNowaitClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWeightFunctionCall(final MySqlParser.WeightFunctionCallContext ctx) {
    final var methodName = "exitWeightFunctionCall";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWhileStatement(final MySqlParser.WhileStatementContext ctx) {
    final var methodName = "exitWhileStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWildDoTableReplication(final MySqlParser.WildDoTableReplicationContext ctx) {
    final var methodName = "exitWildDoTableReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWildIgnoreTableReplication(
      final MySqlParser.WildIgnoreTableReplicationContext ctx) {
    final var methodName = "exitWildIgnoreTableReplication";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindowClause(final MySqlParser.WindowClauseContext ctx) {
    final var methodName = "exitWindowClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindowName(final MySqlParser.WindowNameContext ctx) {
    final var methodName = "exitWindowName";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWindowSpec(final MySqlParser.WindowSpecContext ctx) {
    final var methodName = "exitWindowSpec";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithClause(final MySqlParser.WithClauseContext ctx) {
    final var methodName = "exitWithClause";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithLateralStatement(final MySqlParser.WithLateralStatementContext ctx) {
    final var methodName = "exitWithLateralStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitWithStatement(final MySqlParser.WithStatementContext ctx) {
    final var methodName = "exitWithStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaCommitWork(final MySqlParser.XaCommitWorkContext ctx) {
    final var methodName = "exitXaCommitWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaEndTransaction(final MySqlParser.XaEndTransactionContext ctx) {
    final var methodName = "exitXaEndTransaction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaPrepareStatement(final MySqlParser.XaPrepareStatementContext ctx) {
    final var methodName = "exitXaPrepareStatement";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaRecoverWork(final MySqlParser.XaRecoverWorkContext ctx) {
    final var methodName = "exitXaRecoverWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaRollbackWork(final MySqlParser.XaRollbackWorkContext ctx) {
    final var methodName = "exitXaRollbackWork";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXaStartTransaction(final MySqlParser.XaStartTransactionContext ctx) {
    final var methodName = "exitXaStartTransaction";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXid(final MySqlParser.XidContext ctx) {
    final var methodName = "exitXid";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void exitXuidStringId(final MySqlParser.XuidStringIdContext ctx) {
    final var methodName = "exitXuidStringId";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);
  }

  private List<ObjectField> getCurrentFieldList(final ParserRuleContext ctx) {
    final var methodName = "getCurrentFieldList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    var parentContext =
        ParseTreeHelper.getParentContext(ctx, MySqlParser.ColumnDeclarationContext.class);
    if (parentContext == null
        || parentContext.children == null
        || parentContext.children.isEmpty()) {
      parentContext =
          ParseTreeHelper.getParentContext(ctx, MySqlParser.PrimaryKeyTableConstraintContext.class);
      if (parentContext == null
          || parentContext.children == null
          || parentContext.children.isEmpty()) {
        parentContext =
            ParseTreeHelper.getParentContext(
                ctx, MySqlParser.UniqueKeyTableConstraintContext.class);
        if (parentContext == null
            || parentContext.children == null
            || parentContext.children.isEmpty()) {
          parentContext =
              ParseTreeHelper.getParentContext(
                  ctx, MySqlParser.SimpleIndexDeclarationContext.class);
          if (parentContext == null
              || parentContext.children == null
              || parentContext.children.isEmpty()) {
            parentContext =
                ParseTreeHelper.getParentContext(
                    ctx, MySqlParser.ConstraintDeclarationContext.class);
            if (parentContext == null
                || parentContext.children == null
                || parentContext.children.isEmpty()) {
              return null;
            }
          }
        }
      }
    }

    final var terminalNodeList = new HashSet<ParseTree>();

    final var fullColumnNameChildren =
        ParseTreeStream.parseTreeStream(parentContext)
            .listChildrenByClass(MySqlParser.FullColumnNameContext.class);
    final var fullColumnNameUidChildren =
        ParseTreeStream.parseTreeStream(fullColumnNameChildren)
            .listChildrenByClass(MySqlParser.UidContext.class);
    final var fullColumnNameSimpleIdChildren =
        ParseTreeStream.parseTreeStream(fullColumnNameUidChildren)
            .listChildrenByClass(MySqlParser.SimpleIdContext.class);

    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(fullColumnNameChildren)
            .streamChildrenByClass(MySqlParser.DottedIdContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    if (terminalNodeList.isEmpty()) {
      terminalNodeList.addAll(
          ParseTreeStream.parseTreeStream(fullColumnNameSimpleIdChildren)
              .filter(TerminalNode.class::isInstance)
              .collect(Collectors.toSet()));
    }

    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(fullColumnNameChildren)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(fullColumnNameUidChildren)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(fullColumnNameSimpleIdChildren)
            .streamChildrenByClass(MySqlParser.DataTypeBaseContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(fullColumnNameSimpleIdChildren)
            .streamChildrenByClass(MySqlParser.KeywordsCanBeIdContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(fullColumnNameSimpleIdChildren)
            .streamChildrenByClass(MySqlParser.ScalarFunctionNameContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));
    terminalNodeList.addAll(
        ParseTreeStream.parseTreeStream(fullColumnNameSimpleIdChildren)
            .streamChildrenByClass(MySqlParser.ScalarFunctionNameContext.class)
            .streamChildrenByClass(MySqlParser.FunctionNameBaseContext.class)
            .filter(TerminalNode.class::isInstance)
            .collect(Collectors.toSet()));

    Arrays.asList(
            ParseTreeStream.parseTreeStream(parentContext)
                .listChildrenByClass(MySqlParser.UidContext.class),
            ParseTreeStream.parseTreeStream(parentContext)
                .streamChildrenByClass(MySqlParser.IndexColumnNamesContext.class)
                .streamChildrenByClass(MySqlParser.IndexColumnNameContext.class)
                .listChildrenByClass(MySqlParser.UidContext.class),
            ParseTreeStream.parseTreeStream(parentContext)
                .streamChildrenByClass(MySqlParser.PrimaryKeyTableConstraintContext.class)
                .streamChildrenByClass(MySqlParser.IndexColumnNamesContext.class)
                .streamChildrenByClass(MySqlParser.IndexColumnNameContext.class)
                .listChildrenByClass(MySqlParser.UidContext.class),
            ParseTreeStream.parseTreeStream(parentContext)
                .streamChildrenByClass(MySqlParser.UniqueKeyTableConstraintContext.class)
                .streamChildrenByClass(MySqlParser.IndexColumnNamesContext.class)
                .streamChildrenByClass(MySqlParser.IndexColumnNameContext.class)
                .listChildrenByClass(MySqlParser.UidContext.class))
        .forEach(
            uidChildren -> {
              terminalNodeList.addAll(
                  ParseTreeStream.parseTreeStream(uidChildren)
                      .filter(TerminalNode.class::isInstance)
                      .collect(Collectors.toSet()));

              final var simpleIdChildren =
                  ParseTreeStream.parseTreeStream(uidChildren)
                      .listChildrenByClass(MySqlParser.SimpleIdContext.class);
              terminalNodeList.addAll(
                  ParseTreeStream.parseTreeStream(simpleIdChildren)
                      .filter(TerminalNode.class::isInstance)
                      .collect(Collectors.toSet()));
              terminalNodeList.addAll(
                  ParseTreeStream.parseTreeStream(simpleIdChildren)
                      .streamChildrenByClass(MySqlParser.DataTypeBaseContext.class)
                      .filter(TerminalNode.class::isInstance)
                      .collect(Collectors.toSet()));
              terminalNodeList.addAll(
                  ParseTreeStream.parseTreeStream(simpleIdChildren)
                      .streamChildrenByClass(MySqlParser.KeywordsCanBeIdContext.class)
                      .filter(TerminalNode.class::isInstance)
                      .collect(Collectors.toSet()));
              terminalNodeList.addAll(
                  ParseTreeStream.parseTreeStream(simpleIdChildren)
                      .streamChildrenByClass(MySqlParser.ScalarFunctionNameContext.class)
                      .filter(TerminalNode.class::isInstance)
                      .collect(Collectors.toSet()));
              terminalNodeList.addAll(
                  ParseTreeStream.parseTreeStream(simpleIdChildren)
                      .streamChildrenByClass(MySqlParser.ScalarFunctionNameContext.class)
                      .streamChildrenByClass(MySqlParser.FunctionNameBaseContext.class)
                      .filter(TerminalNode.class::isInstance)
                      .collect(Collectors.toSet()));
            });

    return terminalNodeList.stream()
        .map(child -> ParseTreeHelper.getField(currentTable, child))
        .collect(Collectors.toList());
  }

  private ObjectRelationship getCurrentRelationship(final ParserRuleContext ctx) {
    final var methodName = "getCurrentRelationshipList";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final var currentTable = this.getCurrentTable(ctx);
    if (currentTable == null) {
      return null;
    }

    var parentContext =
        ParseTreeHelper.getParentContext(ctx, MySqlParser.ColumnDeclarationContext.class);
    final var terminalNode =
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(MySqlParser.ColumnDefinitionContext.class)
            .streamChildrenByClass(MySqlParser.ReferenceColumnConstraintContext.class)
            .streamChildrenByClass(MySqlParser.ReferenceDefinitionContext.class)
            .filter(TerminalNode.class::isInstance)
            .map(
                foreignTerminalNode -> {
                  final List<ParseTree> returnValue = new ArrayList<>();
                  if (Strings.CI.equalsAny("REFERENCES", foreignTerminalNode.getText())) {
                    returnValue.addAll(
                        ParseTreeStream.parseTreeStream(
                                (ParserRuleContext)
                                    foreignTerminalNode
                                        .getParent()
                                        .getParent()
                                        .getParent()
                                        .getParent())
                            .streamChildrenByClass(MySqlParser.FullColumnNameContext.class)
                            .streamChildrenByClass(MySqlParser.UidContext.class)
                            .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
                            .filter(TerminalNode.class::isInstance)
                            .toList());
                    returnValue.addAll(
                        ParseTreeStream.parseTreeStream(
                                (ParserRuleContext)
                                    foreignTerminalNode
                                        .getParent()
                                        .getParent()
                                        .getParent()
                                        .getParent())
                            .streamChildrenByClass(MySqlParser.FullColumnNameContext.class)
                            .streamChildrenByClass(MySqlParser.UidContext.class)
                            .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
                            .streamChildrenByClass(MySqlParser.ScalarFunctionNameContext.class)
                            .streamChildrenByClass(MySqlParser.FunctionNameBaseContext.class)
                            .filter(TerminalNode.class::isInstance)
                            .toList());
                  }
                  return returnValue;
                })
            .flatMap(List::stream)
            .collect(Collectors.toCollection(ArrayList::new));
    parentContext =
        ParseTreeHelper.getParentContext(ctx, MySqlParser.ForeignKeyTableConstraintContext.class);
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(MySqlParser.UidContext.class)
            .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
            .filter(TerminalNode.class::isInstance)
            .toList());
    terminalNode.addAll(
        ParseTreeStream.parseTreeStream(parentContext)
            .streamChildrenByClass(MySqlParser.ReferenceDefinitionContext.class)
            .streamChildrenByClass(MySqlParser.TableNameContext.class)
            .streamChildrenByClass(MySqlParser.FullIdContext.class)
            .streamChildrenByClass(MySqlParser.UidContext.class)
            .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
            .filter(TerminalNode.class::isInstance)
            .toList());

    if (!terminalNode.isEmpty()) {
      return ParseTreeHelper.getRelationship(currentTable, terminalNode.get(0));
    }
    return null;
  }

  private SqlContext getCurrentTable(final ParserRuleContext ctx) {
    final var methodName = "getCurrentTable";
    MySqlParserListenerImpl.traceChildren(methodName, ctx);

    if (ctx == null || ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }

    final List<String> terminalNodeTextList = new ArrayList<>();
    if (ctx instanceof final MySqlParser.CopyCreateTableContext copyCreateTableContext) {
      final var likeFound = new MutableBoolean(false);
      ParseTreeStream.parseTreeStream(copyCreateTableContext)
          .forEach(
              copyCreateTableChild -> {
                if (copyCreateTableChild instanceof final TerminalNode terminalNode) {
                  likeFound.setValue(Strings.CI.equals("like", terminalNode.getText()));
                }
                if (copyCreateTableChild
                        instanceof final MySqlParser.TableNameContext tableNameContext
                    && !likeFound.booleanValue()) {
                  ParseTreeStream.parseTreeStream(tableNameContext)
                      .streamChildrenByClass(MySqlParser.FullIdContext.class)
                      .streamChildrenByClass(MySqlParser.UidContext.class)
                      .streamTerminalNodeString()
                      .forEach(terminalNodeTextList::add);
                  ParseTreeStream.parseTreeStream(tableNameContext)
                      .streamChildrenByClass(MySqlParser.FullIdContext.class)
                      .streamChildrenByClass(MySqlParser.UidContext.class)
                      .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
                      .streamTerminalNodeString()
                      .forEach(terminalNodeTextList::add);
                }
              });
    }

    var parentContext =
        ParseTreeHelper.getParentContext(ctx, MySqlParser.ColumnCreateTableContext.class);
    if (parentContext != null && parentContext.children != null) {
      final var uidChildren =
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(MySqlParser.TableNameContext.class)
              .streamChildrenByClass(MySqlParser.FullIdContext.class)
              .listChildrenByClass(MySqlParser.UidContext.class);
      final var simpleIdChildren =
          ParseTreeStream.parseTreeStream(uidChildren)
              .listChildrenByClass(MySqlParser.SimpleIdContext.class);

      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(simpleIdChildren).streamTerminalNodeString().toList());
      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(MySqlParser.TableNameContext.class)
              .streamChildrenByClass(MySqlParser.FullIdContext.class)
              .streamTerminalNodeString()
              .toList());
      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(uidChildren).streamTerminalNodeString().toList());
      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(simpleIdChildren)
              .streamChildrenByClass(MySqlParser.KeywordsCanBeIdContext.class)
              .streamTerminalNodeString()
              .toList());
      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(simpleIdChildren)
              .streamChildrenByClass(MySqlParser.ScalarFunctionNameContext.class)
              .streamChildrenByClass(MySqlParser.FunctionNameBaseContext.class)
              .streamTerminalNodeString()
              .toList());
    }
    parentContext =
        ParseTreeHelper.getParentContext(ctx, MySqlParser.QueryCreateTableContext.class);
    if (parentContext != null && parentContext.children != null) {
      terminalNodeTextList.addAll(
          ParseTreeStream.parseTreeStream(parentContext)
              .streamChildrenByClass(MySqlParser.TableNameContext.class)
              .streamChildrenByClass(MySqlParser.FullIdContext.class)
              .streamChildrenByClass(MySqlParser.UidContext.class)
              .streamChildrenByClass(MySqlParser.SimpleIdContext.class)
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
    MySqlParserListenerImpl.traceChildren(methodName, node);
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation does nothing.
   */
  @Override
  public void visitTerminal(final TerminalNode node) {
    final var methodName = "visitTerminal";
    MySqlParserListenerImpl.traceChildren(methodName, node);

    MySqlParserListenerImpl.input = node.getSymbol().getInputStream();
  }
}
