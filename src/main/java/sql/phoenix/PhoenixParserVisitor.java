// Generated from sql/phoenix/PhoenixParser.g4 by ANTLR 4.13.1

package sql.phoenix;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced by {@link
 * PhoenixParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
public interface PhoenixParserVisitor<T> extends ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by {@link PhoenixParser#phoenix_file}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPhoenix_file(PhoenixParser.Phoenix_fileContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#batch}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBatch(PhoenixParser.BatchContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#sql_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSql_command(PhoenixParser.Sql_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#ddl_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDdl_command(PhoenixParser.Ddl_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#dml_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDml_command(PhoenixParser.Dml_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#other_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOther_command(PhoenixParser.Other_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#alter_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlter_command(PhoenixParser.Alter_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#alter_index_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlter_index_command(PhoenixParser.Alter_index_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#create_function_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCreate_function_command(PhoenixParser.Create_function_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#create_index_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCreate_index_command(PhoenixParser.Create_index_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#create_schema_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCreate_schema_command(PhoenixParser.Create_schema_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#create_sequence_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCreate_sequence_command(PhoenixParser.Create_sequence_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#create_table_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCreate_table_command(PhoenixParser.Create_table_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#create_view_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCreate_view_command(PhoenixParser.Create_view_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#constraint}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitConstraint(PhoenixParser.ConstraintContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#constraint_column_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitConstraint_column_list(PhoenixParser.Constraint_column_listContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#constraint_column}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitConstraint_column(PhoenixParser.Constraint_columnContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#constraint_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitConstraint_name(PhoenixParser.Constraint_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#new_table_ref}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNew_table_ref(PhoenixParser.New_table_refContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#table_options}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_options(PhoenixParser.Table_optionsContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#existing_table_ref}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExisting_table_ref(PhoenixParser.Existing_table_refContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#expression_asc_desc_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExpression_asc_desc_list(PhoenixParser.Expression_asc_desc_listContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#split_point_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSplit_point_list(PhoenixParser.Split_point_listContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#split_point}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSplit_point(PhoenixParser.Split_pointContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#index_options}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitIndex_options(PhoenixParser.Index_optionsContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#options_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOptions_list(PhoenixParser.Options_listContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#options_}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOptions_(PhoenixParser.Options_Context ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#option}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOption(PhoenixParser.OptionContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#func_argument_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFunc_argument_list(PhoenixParser.Func_argument_listContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#func_argument}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFunc_argument(PhoenixParser.Func_argumentContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#class_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitClass_name(PhoenixParser.Class_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#jar_path}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitJar_path(PhoenixParser.Jar_pathContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#drop_table_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDrop_table_command(PhoenixParser.Drop_table_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#drop_view_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDrop_view_command(PhoenixParser.Drop_view_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#drop_schema_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDrop_schema_command(PhoenixParser.Drop_schema_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#drop_sequence_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDrop_sequence_command(PhoenixParser.Drop_sequence_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#drop_index_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDrop_index_command(PhoenixParser.Drop_index_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#drop_function_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDrop_function_command(PhoenixParser.Drop_function_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#index_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitIndex_name(PhoenixParser.Index_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#func_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFunc_name(PhoenixParser.Func_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#if_exists}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitIf_exists(PhoenixParser.If_existsContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#if_not_exists}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitIf_not_exists(PhoenixParser.If_not_existsContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#table_ref}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_ref(PhoenixParser.Table_refContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#use_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUse_command(PhoenixParser.Use_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#explain_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExplain_command(PhoenixParser.Explain_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#update_statistics_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUpdate_statistics_command(PhoenixParser.Update_statistics_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#declare_cursor_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDeclare_cursor_command(PhoenixParser.Declare_cursor_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#open_cursor_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOpen_cursor_command(PhoenixParser.Open_cursor_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#fetch_next_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFetch_next_command(PhoenixParser.Fetch_next_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#close_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitClose_command(PhoenixParser.Close_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#grant_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitGrant_command(PhoenixParser.Grant_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#revoke_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitRevoke_command(PhoenixParser.Revoke_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#on_schema_table}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOn_schema_table(PhoenixParser.On_schema_tableContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#permission_string}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPermission_string(PhoenixParser.Permission_stringContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#user_string}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUser_string(PhoenixParser.User_stringContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#cursor_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCursor_name(PhoenixParser.Cursor_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#guide_post_options}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitGuide_post_options(PhoenixParser.Guide_post_optionsContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#upsert_values_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUpsert_values_command(PhoenixParser.Upsert_values_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#column_ref_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitColumn_ref_list(PhoenixParser.Column_ref_listContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#column_def_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitColumn_def_list(PhoenixParser.Column_def_listContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#upsert_select_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUpsert_select_command(PhoenixParser.Upsert_select_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#delete_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDelete_command(PhoenixParser.Delete_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#order_by_clause}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOrder_by_clause(PhoenixParser.Order_by_clauseContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#limit_clause}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitLimit_clause(PhoenixParser.Limit_clauseContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#order_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOrder_list(PhoenixParser.Order_listContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#where_clause}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitWhere_clause(PhoenixParser.Where_clauseContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#select_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSelect_command(PhoenixParser.Select_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#select_statement}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSelect_statement(PhoenixParser.Select_statementContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#union_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUnion_list(PhoenixParser.Union_listContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#union}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUnion(PhoenixParser.UnionContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#join_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitJoin_list(PhoenixParser.Join_listContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#join_item}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitJoin_item(PhoenixParser.Join_itemContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#row_rows}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitRow_rows(PhoenixParser.Row_rowsContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#bind_parameter_number}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBind_parameter_number(PhoenixParser.Bind_parameter_numberContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#order}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOrder(PhoenixParser.OrderContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#first_last}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFirst_last(PhoenixParser.First_lastContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#first_next}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFirst_next(PhoenixParser.First_nextContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#bind_parameter}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBind_parameter(PhoenixParser.Bind_parameterContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#number}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNumber(PhoenixParser.NumberContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#hint}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitHint(PhoenixParser.HintContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#hint_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitHint_name(PhoenixParser.Hint_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#scan_hint}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitScan_hint(PhoenixParser.Scan_hintContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#index_hint}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitIndex_hint(PhoenixParser.Index_hintContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#cache_hint}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCache_hint(PhoenixParser.Cache_hintContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#small_hint}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSmall_hint(PhoenixParser.Small_hintContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#join_hint}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitJoin_hint(PhoenixParser.Join_hintContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#seek_to_column_hint}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSeek_to_column_hint(PhoenixParser.Seek_to_column_hintContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#serial_hint}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSerial_hint(PhoenixParser.Serial_hintContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#select_expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSelect_expression(PhoenixParser.Select_expressionContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#family_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFamily_name(PhoenixParser.Family_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#quoted_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitQuoted_name(PhoenixParser.Quoted_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#column_alias}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitColumn_alias(PhoenixParser.Column_aliasContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#alias}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlias(PhoenixParser.AliasContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitName(PhoenixParser.NameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#table_spec}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_spec(PhoenixParser.Table_specContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#aliased_table_ref}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAliased_table_ref(PhoenixParser.Aliased_table_refContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#table_alias}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_alias(PhoenixParser.Table_aliasContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#positive_decimal}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPositive_decimal(PhoenixParser.Positive_decimalContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#schema_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSchema_name(PhoenixParser.Schema_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#table_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_name(PhoenixParser.Table_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#column_def}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitColumn_def(PhoenixParser.Column_defContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#column_ref}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitColumn_ref(PhoenixParser.Column_refContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#column_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitColumn_name(PhoenixParser.Column_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#data_type}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitData_type(PhoenixParser.Data_typeContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#asc_desc}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAsc_desc(PhoenixParser.Asc_descContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#any_all}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAny_all(PhoenixParser.Any_allContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#join_type}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitJoin_type(PhoenixParser.Join_typeContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExpression(PhoenixParser.ExpressionContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#comp_op}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitComp_op(PhoenixParser.Comp_opContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#expression_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExpression_list(PhoenixParser.Expression_listContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#literal}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitLiteral(PhoenixParser.LiteralContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#string}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitString(PhoenixParser.StringContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#numeric}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNumeric(PhoenixParser.NumericContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#integer}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitInteger(PhoenixParser.IntegerContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#decimal}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDecimal(PhoenixParser.DecimalContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#true_false}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTrue_false(PhoenixParser.True_falseContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#case_}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCase(PhoenixParser.CaseContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#case_when}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCase_when(PhoenixParser.Case_whenContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#row_value_constructor}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitRow_value_constructor(PhoenixParser.Row_value_constructorContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#cast}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCast(PhoenixParser.CastContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#sequence}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSequence(PhoenixParser.SequenceContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#sequence_ref}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSequence_ref(PhoenixParser.Sequence_refContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#sequence_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSequence_name(PhoenixParser.Sequence_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#array_constructor}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitArray_constructor(PhoenixParser.Array_constructorContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#dimension_int}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDimension_int(PhoenixParser.Dimension_intContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#precision_int}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPrecision_int(PhoenixParser.Precision_intContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#scale_int}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitScale_int(PhoenixParser.Scale_intContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#sql_data_type}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSql_data_type(PhoenixParser.Sql_data_typeContext ctx);

  /**
   * Visit a parse tree produced by {@link PhoenixParser#hbase_data_type}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitHbase_data_type(PhoenixParser.Hbase_data_typeContext ctx);
}
