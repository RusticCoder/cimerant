// Generated from sql/phoenix/PhoenixParser.g4 by ANTLR 4.13.1

package sql.phoenix;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by {@link PhoenixParser}.
 */
public interface PhoenixParserListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link PhoenixParser#phoenix_file}.
   *
   * @param ctx the parse tree
   */
  void enterPhoenix_file(PhoenixParser.Phoenix_fileContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#phoenix_file}.
   *
   * @param ctx the parse tree
   */
  void exitPhoenix_file(PhoenixParser.Phoenix_fileContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#batch}.
   *
   * @param ctx the parse tree
   */
  void enterBatch(PhoenixParser.BatchContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#batch}.
   *
   * @param ctx the parse tree
   */
  void exitBatch(PhoenixParser.BatchContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#sql_command}.
   *
   * @param ctx the parse tree
   */
  void enterSql_command(PhoenixParser.Sql_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#sql_command}.
   *
   * @param ctx the parse tree
   */
  void exitSql_command(PhoenixParser.Sql_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#ddl_command}.
   *
   * @param ctx the parse tree
   */
  void enterDdl_command(PhoenixParser.Ddl_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#ddl_command}.
   *
   * @param ctx the parse tree
   */
  void exitDdl_command(PhoenixParser.Ddl_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#dml_command}.
   *
   * @param ctx the parse tree
   */
  void enterDml_command(PhoenixParser.Dml_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#dml_command}.
   *
   * @param ctx the parse tree
   */
  void exitDml_command(PhoenixParser.Dml_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#other_command}.
   *
   * @param ctx the parse tree
   */
  void enterOther_command(PhoenixParser.Other_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#other_command}.
   *
   * @param ctx the parse tree
   */
  void exitOther_command(PhoenixParser.Other_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#alter_command}.
   *
   * @param ctx the parse tree
   */
  void enterAlter_command(PhoenixParser.Alter_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#alter_command}.
   *
   * @param ctx the parse tree
   */
  void exitAlter_command(PhoenixParser.Alter_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#alter_index_command}.
   *
   * @param ctx the parse tree
   */
  void enterAlter_index_command(PhoenixParser.Alter_index_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#alter_index_command}.
   *
   * @param ctx the parse tree
   */
  void exitAlter_index_command(PhoenixParser.Alter_index_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#create_function_command}.
   *
   * @param ctx the parse tree
   */
  void enterCreate_function_command(PhoenixParser.Create_function_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#create_function_command}.
   *
   * @param ctx the parse tree
   */
  void exitCreate_function_command(PhoenixParser.Create_function_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#create_index_command}.
   *
   * @param ctx the parse tree
   */
  void enterCreate_index_command(PhoenixParser.Create_index_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#create_index_command}.
   *
   * @param ctx the parse tree
   */
  void exitCreate_index_command(PhoenixParser.Create_index_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#create_schema_command}.
   *
   * @param ctx the parse tree
   */
  void enterCreate_schema_command(PhoenixParser.Create_schema_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#create_schema_command}.
   *
   * @param ctx the parse tree
   */
  void exitCreate_schema_command(PhoenixParser.Create_schema_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#create_sequence_command}.
   *
   * @param ctx the parse tree
   */
  void enterCreate_sequence_command(PhoenixParser.Create_sequence_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#create_sequence_command}.
   *
   * @param ctx the parse tree
   */
  void exitCreate_sequence_command(PhoenixParser.Create_sequence_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#create_table_command}.
   *
   * @param ctx the parse tree
   */
  void enterCreate_table_command(PhoenixParser.Create_table_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#create_table_command}.
   *
   * @param ctx the parse tree
   */
  void exitCreate_table_command(PhoenixParser.Create_table_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#create_view_command}.
   *
   * @param ctx the parse tree
   */
  void enterCreate_view_command(PhoenixParser.Create_view_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#create_view_command}.
   *
   * @param ctx the parse tree
   */
  void exitCreate_view_command(PhoenixParser.Create_view_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#constraint}.
   *
   * @param ctx the parse tree
   */
  void enterConstraint(PhoenixParser.ConstraintContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#constraint}.
   *
   * @param ctx the parse tree
   */
  void exitConstraint(PhoenixParser.ConstraintContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#constraint_column_list}.
   *
   * @param ctx the parse tree
   */
  void enterConstraint_column_list(PhoenixParser.Constraint_column_listContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#constraint_column_list}.
   *
   * @param ctx the parse tree
   */
  void exitConstraint_column_list(PhoenixParser.Constraint_column_listContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#constraint_column}.
   *
   * @param ctx the parse tree
   */
  void enterConstraint_column(PhoenixParser.Constraint_columnContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#constraint_column}.
   *
   * @param ctx the parse tree
   */
  void exitConstraint_column(PhoenixParser.Constraint_columnContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#constraint_name}.
   *
   * @param ctx the parse tree
   */
  void enterConstraint_name(PhoenixParser.Constraint_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#constraint_name}.
   *
   * @param ctx the parse tree
   */
  void exitConstraint_name(PhoenixParser.Constraint_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#new_table_ref}.
   *
   * @param ctx the parse tree
   */
  void enterNew_table_ref(PhoenixParser.New_table_refContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#new_table_ref}.
   *
   * @param ctx the parse tree
   */
  void exitNew_table_ref(PhoenixParser.New_table_refContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#table_options}.
   *
   * @param ctx the parse tree
   */
  void enterTable_options(PhoenixParser.Table_optionsContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#table_options}.
   *
   * @param ctx the parse tree
   */
  void exitTable_options(PhoenixParser.Table_optionsContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#existing_table_ref}.
   *
   * @param ctx the parse tree
   */
  void enterExisting_table_ref(PhoenixParser.Existing_table_refContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#existing_table_ref}.
   *
   * @param ctx the parse tree
   */
  void exitExisting_table_ref(PhoenixParser.Existing_table_refContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#expression_asc_desc_list}.
   *
   * @param ctx the parse tree
   */
  void enterExpression_asc_desc_list(PhoenixParser.Expression_asc_desc_listContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#expression_asc_desc_list}.
   *
   * @param ctx the parse tree
   */
  void exitExpression_asc_desc_list(PhoenixParser.Expression_asc_desc_listContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#split_point_list}.
   *
   * @param ctx the parse tree
   */
  void enterSplit_point_list(PhoenixParser.Split_point_listContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#split_point_list}.
   *
   * @param ctx the parse tree
   */
  void exitSplit_point_list(PhoenixParser.Split_point_listContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#split_point}.
   *
   * @param ctx the parse tree
   */
  void enterSplit_point(PhoenixParser.Split_pointContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#split_point}.
   *
   * @param ctx the parse tree
   */
  void exitSplit_point(PhoenixParser.Split_pointContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#index_options}.
   *
   * @param ctx the parse tree
   */
  void enterIndex_options(PhoenixParser.Index_optionsContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#index_options}.
   *
   * @param ctx the parse tree
   */
  void exitIndex_options(PhoenixParser.Index_optionsContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#options_list}.
   *
   * @param ctx the parse tree
   */
  void enterOptions_list(PhoenixParser.Options_listContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#options_list}.
   *
   * @param ctx the parse tree
   */
  void exitOptions_list(PhoenixParser.Options_listContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#options_}.
   *
   * @param ctx the parse tree
   */
  void enterOptions_(PhoenixParser.Options_Context ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#options_}.
   *
   * @param ctx the parse tree
   */
  void exitOptions_(PhoenixParser.Options_Context ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#option}.
   *
   * @param ctx the parse tree
   */
  void enterOption(PhoenixParser.OptionContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#option}.
   *
   * @param ctx the parse tree
   */
  void exitOption(PhoenixParser.OptionContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#func_argument_list}.
   *
   * @param ctx the parse tree
   */
  void enterFunc_argument_list(PhoenixParser.Func_argument_listContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#func_argument_list}.
   *
   * @param ctx the parse tree
   */
  void exitFunc_argument_list(PhoenixParser.Func_argument_listContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#func_argument}.
   *
   * @param ctx the parse tree
   */
  void enterFunc_argument(PhoenixParser.Func_argumentContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#func_argument}.
   *
   * @param ctx the parse tree
   */
  void exitFunc_argument(PhoenixParser.Func_argumentContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#class_name}.
   *
   * @param ctx the parse tree
   */
  void enterClass_name(PhoenixParser.Class_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#class_name}.
   *
   * @param ctx the parse tree
   */
  void exitClass_name(PhoenixParser.Class_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#jar_path}.
   *
   * @param ctx the parse tree
   */
  void enterJar_path(PhoenixParser.Jar_pathContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#jar_path}.
   *
   * @param ctx the parse tree
   */
  void exitJar_path(PhoenixParser.Jar_pathContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#drop_table_command}.
   *
   * @param ctx the parse tree
   */
  void enterDrop_table_command(PhoenixParser.Drop_table_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#drop_table_command}.
   *
   * @param ctx the parse tree
   */
  void exitDrop_table_command(PhoenixParser.Drop_table_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#drop_view_command}.
   *
   * @param ctx the parse tree
   */
  void enterDrop_view_command(PhoenixParser.Drop_view_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#drop_view_command}.
   *
   * @param ctx the parse tree
   */
  void exitDrop_view_command(PhoenixParser.Drop_view_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#drop_schema_command}.
   *
   * @param ctx the parse tree
   */
  void enterDrop_schema_command(PhoenixParser.Drop_schema_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#drop_schema_command}.
   *
   * @param ctx the parse tree
   */
  void exitDrop_schema_command(PhoenixParser.Drop_schema_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#drop_sequence_command}.
   *
   * @param ctx the parse tree
   */
  void enterDrop_sequence_command(PhoenixParser.Drop_sequence_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#drop_sequence_command}.
   *
   * @param ctx the parse tree
   */
  void exitDrop_sequence_command(PhoenixParser.Drop_sequence_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#drop_index_command}.
   *
   * @param ctx the parse tree
   */
  void enterDrop_index_command(PhoenixParser.Drop_index_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#drop_index_command}.
   *
   * @param ctx the parse tree
   */
  void exitDrop_index_command(PhoenixParser.Drop_index_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#drop_function_command}.
   *
   * @param ctx the parse tree
   */
  void enterDrop_function_command(PhoenixParser.Drop_function_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#drop_function_command}.
   *
   * @param ctx the parse tree
   */
  void exitDrop_function_command(PhoenixParser.Drop_function_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#index_name}.
   *
   * @param ctx the parse tree
   */
  void enterIndex_name(PhoenixParser.Index_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#index_name}.
   *
   * @param ctx the parse tree
   */
  void exitIndex_name(PhoenixParser.Index_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#func_name}.
   *
   * @param ctx the parse tree
   */
  void enterFunc_name(PhoenixParser.Func_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#func_name}.
   *
   * @param ctx the parse tree
   */
  void exitFunc_name(PhoenixParser.Func_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#if_exists}.
   *
   * @param ctx the parse tree
   */
  void enterIf_exists(PhoenixParser.If_existsContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#if_exists}.
   *
   * @param ctx the parse tree
   */
  void exitIf_exists(PhoenixParser.If_existsContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#if_not_exists}.
   *
   * @param ctx the parse tree
   */
  void enterIf_not_exists(PhoenixParser.If_not_existsContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#if_not_exists}.
   *
   * @param ctx the parse tree
   */
  void exitIf_not_exists(PhoenixParser.If_not_existsContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#table_ref}.
   *
   * @param ctx the parse tree
   */
  void enterTable_ref(PhoenixParser.Table_refContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#table_ref}.
   *
   * @param ctx the parse tree
   */
  void exitTable_ref(PhoenixParser.Table_refContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#use_command}.
   *
   * @param ctx the parse tree
   */
  void enterUse_command(PhoenixParser.Use_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#use_command}.
   *
   * @param ctx the parse tree
   */
  void exitUse_command(PhoenixParser.Use_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#explain_command}.
   *
   * @param ctx the parse tree
   */
  void enterExplain_command(PhoenixParser.Explain_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#explain_command}.
   *
   * @param ctx the parse tree
   */
  void exitExplain_command(PhoenixParser.Explain_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#update_statistics_command}.
   *
   * @param ctx the parse tree
   */
  void enterUpdate_statistics_command(PhoenixParser.Update_statistics_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#update_statistics_command}.
   *
   * @param ctx the parse tree
   */
  void exitUpdate_statistics_command(PhoenixParser.Update_statistics_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#declare_cursor_command}.
   *
   * @param ctx the parse tree
   */
  void enterDeclare_cursor_command(PhoenixParser.Declare_cursor_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#declare_cursor_command}.
   *
   * @param ctx the parse tree
   */
  void exitDeclare_cursor_command(PhoenixParser.Declare_cursor_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#open_cursor_command}.
   *
   * @param ctx the parse tree
   */
  void enterOpen_cursor_command(PhoenixParser.Open_cursor_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#open_cursor_command}.
   *
   * @param ctx the parse tree
   */
  void exitOpen_cursor_command(PhoenixParser.Open_cursor_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#fetch_next_command}.
   *
   * @param ctx the parse tree
   */
  void enterFetch_next_command(PhoenixParser.Fetch_next_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#fetch_next_command}.
   *
   * @param ctx the parse tree
   */
  void exitFetch_next_command(PhoenixParser.Fetch_next_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#close_command}.
   *
   * @param ctx the parse tree
   */
  void enterClose_command(PhoenixParser.Close_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#close_command}.
   *
   * @param ctx the parse tree
   */
  void exitClose_command(PhoenixParser.Close_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#grant_command}.
   *
   * @param ctx the parse tree
   */
  void enterGrant_command(PhoenixParser.Grant_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#grant_command}.
   *
   * @param ctx the parse tree
   */
  void exitGrant_command(PhoenixParser.Grant_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#revoke_command}.
   *
   * @param ctx the parse tree
   */
  void enterRevoke_command(PhoenixParser.Revoke_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#revoke_command}.
   *
   * @param ctx the parse tree
   */
  void exitRevoke_command(PhoenixParser.Revoke_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#on_schema_table}.
   *
   * @param ctx the parse tree
   */
  void enterOn_schema_table(PhoenixParser.On_schema_tableContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#on_schema_table}.
   *
   * @param ctx the parse tree
   */
  void exitOn_schema_table(PhoenixParser.On_schema_tableContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#permission_string}.
   *
   * @param ctx the parse tree
   */
  void enterPermission_string(PhoenixParser.Permission_stringContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#permission_string}.
   *
   * @param ctx the parse tree
   */
  void exitPermission_string(PhoenixParser.Permission_stringContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#user_string}.
   *
   * @param ctx the parse tree
   */
  void enterUser_string(PhoenixParser.User_stringContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#user_string}.
   *
   * @param ctx the parse tree
   */
  void exitUser_string(PhoenixParser.User_stringContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#cursor_name}.
   *
   * @param ctx the parse tree
   */
  void enterCursor_name(PhoenixParser.Cursor_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#cursor_name}.
   *
   * @param ctx the parse tree
   */
  void exitCursor_name(PhoenixParser.Cursor_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#guide_post_options}.
   *
   * @param ctx the parse tree
   */
  void enterGuide_post_options(PhoenixParser.Guide_post_optionsContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#guide_post_options}.
   *
   * @param ctx the parse tree
   */
  void exitGuide_post_options(PhoenixParser.Guide_post_optionsContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#upsert_values_command}.
   *
   * @param ctx the parse tree
   */
  void enterUpsert_values_command(PhoenixParser.Upsert_values_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#upsert_values_command}.
   *
   * @param ctx the parse tree
   */
  void exitUpsert_values_command(PhoenixParser.Upsert_values_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#column_ref_list}.
   *
   * @param ctx the parse tree
   */
  void enterColumn_ref_list(PhoenixParser.Column_ref_listContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#column_ref_list}.
   *
   * @param ctx the parse tree
   */
  void exitColumn_ref_list(PhoenixParser.Column_ref_listContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#column_def_list}.
   *
   * @param ctx the parse tree
   */
  void enterColumn_def_list(PhoenixParser.Column_def_listContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#column_def_list}.
   *
   * @param ctx the parse tree
   */
  void exitColumn_def_list(PhoenixParser.Column_def_listContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#upsert_select_command}.
   *
   * @param ctx the parse tree
   */
  void enterUpsert_select_command(PhoenixParser.Upsert_select_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#upsert_select_command}.
   *
   * @param ctx the parse tree
   */
  void exitUpsert_select_command(PhoenixParser.Upsert_select_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#delete_command}.
   *
   * @param ctx the parse tree
   */
  void enterDelete_command(PhoenixParser.Delete_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#delete_command}.
   *
   * @param ctx the parse tree
   */
  void exitDelete_command(PhoenixParser.Delete_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#order_by_clause}.
   *
   * @param ctx the parse tree
   */
  void enterOrder_by_clause(PhoenixParser.Order_by_clauseContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#order_by_clause}.
   *
   * @param ctx the parse tree
   */
  void exitOrder_by_clause(PhoenixParser.Order_by_clauseContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#limit_clause}.
   *
   * @param ctx the parse tree
   */
  void enterLimit_clause(PhoenixParser.Limit_clauseContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#limit_clause}.
   *
   * @param ctx the parse tree
   */
  void exitLimit_clause(PhoenixParser.Limit_clauseContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#order_list}.
   *
   * @param ctx the parse tree
   */
  void enterOrder_list(PhoenixParser.Order_listContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#order_list}.
   *
   * @param ctx the parse tree
   */
  void exitOrder_list(PhoenixParser.Order_listContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#where_clause}.
   *
   * @param ctx the parse tree
   */
  void enterWhere_clause(PhoenixParser.Where_clauseContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#where_clause}.
   *
   * @param ctx the parse tree
   */
  void exitWhere_clause(PhoenixParser.Where_clauseContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#select_command}.
   *
   * @param ctx the parse tree
   */
  void enterSelect_command(PhoenixParser.Select_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#select_command}.
   *
   * @param ctx the parse tree
   */
  void exitSelect_command(PhoenixParser.Select_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#select_statement}.
   *
   * @param ctx the parse tree
   */
  void enterSelect_statement(PhoenixParser.Select_statementContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#select_statement}.
   *
   * @param ctx the parse tree
   */
  void exitSelect_statement(PhoenixParser.Select_statementContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#union_list}.
   *
   * @param ctx the parse tree
   */
  void enterUnion_list(PhoenixParser.Union_listContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#union_list}.
   *
   * @param ctx the parse tree
   */
  void exitUnion_list(PhoenixParser.Union_listContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#union}.
   *
   * @param ctx the parse tree
   */
  void enterUnion(PhoenixParser.UnionContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#union}.
   *
   * @param ctx the parse tree
   */
  void exitUnion(PhoenixParser.UnionContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#join_list}.
   *
   * @param ctx the parse tree
   */
  void enterJoin_list(PhoenixParser.Join_listContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#join_list}.
   *
   * @param ctx the parse tree
   */
  void exitJoin_list(PhoenixParser.Join_listContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#join_item}.
   *
   * @param ctx the parse tree
   */
  void enterJoin_item(PhoenixParser.Join_itemContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#join_item}.
   *
   * @param ctx the parse tree
   */
  void exitJoin_item(PhoenixParser.Join_itemContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#row_rows}.
   *
   * @param ctx the parse tree
   */
  void enterRow_rows(PhoenixParser.Row_rowsContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#row_rows}.
   *
   * @param ctx the parse tree
   */
  void exitRow_rows(PhoenixParser.Row_rowsContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#bind_parameter_number}.
   *
   * @param ctx the parse tree
   */
  void enterBind_parameter_number(PhoenixParser.Bind_parameter_numberContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#bind_parameter_number}.
   *
   * @param ctx the parse tree
   */
  void exitBind_parameter_number(PhoenixParser.Bind_parameter_numberContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#order}.
   *
   * @param ctx the parse tree
   */
  void enterOrder(PhoenixParser.OrderContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#order}.
   *
   * @param ctx the parse tree
   */
  void exitOrder(PhoenixParser.OrderContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#first_last}.
   *
   * @param ctx the parse tree
   */
  void enterFirst_last(PhoenixParser.First_lastContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#first_last}.
   *
   * @param ctx the parse tree
   */
  void exitFirst_last(PhoenixParser.First_lastContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#first_next}.
   *
   * @param ctx the parse tree
   */
  void enterFirst_next(PhoenixParser.First_nextContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#first_next}.
   *
   * @param ctx the parse tree
   */
  void exitFirst_next(PhoenixParser.First_nextContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#bind_parameter}.
   *
   * @param ctx the parse tree
   */
  void enterBind_parameter(PhoenixParser.Bind_parameterContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#bind_parameter}.
   *
   * @param ctx the parse tree
   */
  void exitBind_parameter(PhoenixParser.Bind_parameterContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#number}.
   *
   * @param ctx the parse tree
   */
  void enterNumber(PhoenixParser.NumberContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#number}.
   *
   * @param ctx the parse tree
   */
  void exitNumber(PhoenixParser.NumberContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#hint}.
   *
   * @param ctx the parse tree
   */
  void enterHint(PhoenixParser.HintContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#hint}.
   *
   * @param ctx the parse tree
   */
  void exitHint(PhoenixParser.HintContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#hint_name}.
   *
   * @param ctx the parse tree
   */
  void enterHint_name(PhoenixParser.Hint_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#hint_name}.
   *
   * @param ctx the parse tree
   */
  void exitHint_name(PhoenixParser.Hint_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#scan_hint}.
   *
   * @param ctx the parse tree
   */
  void enterScan_hint(PhoenixParser.Scan_hintContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#scan_hint}.
   *
   * @param ctx the parse tree
   */
  void exitScan_hint(PhoenixParser.Scan_hintContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#index_hint}.
   *
   * @param ctx the parse tree
   */
  void enterIndex_hint(PhoenixParser.Index_hintContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#index_hint}.
   *
   * @param ctx the parse tree
   */
  void exitIndex_hint(PhoenixParser.Index_hintContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#cache_hint}.
   *
   * @param ctx the parse tree
   */
  void enterCache_hint(PhoenixParser.Cache_hintContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#cache_hint}.
   *
   * @param ctx the parse tree
   */
  void exitCache_hint(PhoenixParser.Cache_hintContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#small_hint}.
   *
   * @param ctx the parse tree
   */
  void enterSmall_hint(PhoenixParser.Small_hintContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#small_hint}.
   *
   * @param ctx the parse tree
   */
  void exitSmall_hint(PhoenixParser.Small_hintContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#join_hint}.
   *
   * @param ctx the parse tree
   */
  void enterJoin_hint(PhoenixParser.Join_hintContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#join_hint}.
   *
   * @param ctx the parse tree
   */
  void exitJoin_hint(PhoenixParser.Join_hintContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#seek_to_column_hint}.
   *
   * @param ctx the parse tree
   */
  void enterSeek_to_column_hint(PhoenixParser.Seek_to_column_hintContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#seek_to_column_hint}.
   *
   * @param ctx the parse tree
   */
  void exitSeek_to_column_hint(PhoenixParser.Seek_to_column_hintContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#serial_hint}.
   *
   * @param ctx the parse tree
   */
  void enterSerial_hint(PhoenixParser.Serial_hintContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#serial_hint}.
   *
   * @param ctx the parse tree
   */
  void exitSerial_hint(PhoenixParser.Serial_hintContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#select_expression}.
   *
   * @param ctx the parse tree
   */
  void enterSelect_expression(PhoenixParser.Select_expressionContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#select_expression}.
   *
   * @param ctx the parse tree
   */
  void exitSelect_expression(PhoenixParser.Select_expressionContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#family_name}.
   *
   * @param ctx the parse tree
   */
  void enterFamily_name(PhoenixParser.Family_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#family_name}.
   *
   * @param ctx the parse tree
   */
  void exitFamily_name(PhoenixParser.Family_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#quoted_name}.
   *
   * @param ctx the parse tree
   */
  void enterQuoted_name(PhoenixParser.Quoted_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#quoted_name}.
   *
   * @param ctx the parse tree
   */
  void exitQuoted_name(PhoenixParser.Quoted_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#column_alias}.
   *
   * @param ctx the parse tree
   */
  void enterColumn_alias(PhoenixParser.Column_aliasContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#column_alias}.
   *
   * @param ctx the parse tree
   */
  void exitColumn_alias(PhoenixParser.Column_aliasContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#alias}.
   *
   * @param ctx the parse tree
   */
  void enterAlias(PhoenixParser.AliasContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#alias}.
   *
   * @param ctx the parse tree
   */
  void exitAlias(PhoenixParser.AliasContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#name}.
   *
   * @param ctx the parse tree
   */
  void enterName(PhoenixParser.NameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#name}.
   *
   * @param ctx the parse tree
   */
  void exitName(PhoenixParser.NameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#table_spec}.
   *
   * @param ctx the parse tree
   */
  void enterTable_spec(PhoenixParser.Table_specContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#table_spec}.
   *
   * @param ctx the parse tree
   */
  void exitTable_spec(PhoenixParser.Table_specContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#aliased_table_ref}.
   *
   * @param ctx the parse tree
   */
  void enterAliased_table_ref(PhoenixParser.Aliased_table_refContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#aliased_table_ref}.
   *
   * @param ctx the parse tree
   */
  void exitAliased_table_ref(PhoenixParser.Aliased_table_refContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#table_alias}.
   *
   * @param ctx the parse tree
   */
  void enterTable_alias(PhoenixParser.Table_aliasContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#table_alias}.
   *
   * @param ctx the parse tree
   */
  void exitTable_alias(PhoenixParser.Table_aliasContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#positive_decimal}.
   *
   * @param ctx the parse tree
   */
  void enterPositive_decimal(PhoenixParser.Positive_decimalContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#positive_decimal}.
   *
   * @param ctx the parse tree
   */
  void exitPositive_decimal(PhoenixParser.Positive_decimalContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#schema_name}.
   *
   * @param ctx the parse tree
   */
  void enterSchema_name(PhoenixParser.Schema_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#schema_name}.
   *
   * @param ctx the parse tree
   */
  void exitSchema_name(PhoenixParser.Schema_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#table_name}.
   *
   * @param ctx the parse tree
   */
  void enterTable_name(PhoenixParser.Table_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#table_name}.
   *
   * @param ctx the parse tree
   */
  void exitTable_name(PhoenixParser.Table_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#column_def}.
   *
   * @param ctx the parse tree
   */
  void enterColumn_def(PhoenixParser.Column_defContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#column_def}.
   *
   * @param ctx the parse tree
   */
  void exitColumn_def(PhoenixParser.Column_defContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#column_ref}.
   *
   * @param ctx the parse tree
   */
  void enterColumn_ref(PhoenixParser.Column_refContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#column_ref}.
   *
   * @param ctx the parse tree
   */
  void exitColumn_ref(PhoenixParser.Column_refContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#column_name}.
   *
   * @param ctx the parse tree
   */
  void enterColumn_name(PhoenixParser.Column_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#column_name}.
   *
   * @param ctx the parse tree
   */
  void exitColumn_name(PhoenixParser.Column_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#data_type}.
   *
   * @param ctx the parse tree
   */
  void enterData_type(PhoenixParser.Data_typeContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#data_type}.
   *
   * @param ctx the parse tree
   */
  void exitData_type(PhoenixParser.Data_typeContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#asc_desc}.
   *
   * @param ctx the parse tree
   */
  void enterAsc_desc(PhoenixParser.Asc_descContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#asc_desc}.
   *
   * @param ctx the parse tree
   */
  void exitAsc_desc(PhoenixParser.Asc_descContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#any_all}.
   *
   * @param ctx the parse tree
   */
  void enterAny_all(PhoenixParser.Any_allContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#any_all}.
   *
   * @param ctx the parse tree
   */
  void exitAny_all(PhoenixParser.Any_allContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#join_type}.
   *
   * @param ctx the parse tree
   */
  void enterJoin_type(PhoenixParser.Join_typeContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#join_type}.
   *
   * @param ctx the parse tree
   */
  void exitJoin_type(PhoenixParser.Join_typeContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#expression}.
   *
   * @param ctx the parse tree
   */
  void enterExpression(PhoenixParser.ExpressionContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#expression}.
   *
   * @param ctx the parse tree
   */
  void exitExpression(PhoenixParser.ExpressionContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#comp_op}.
   *
   * @param ctx the parse tree
   */
  void enterComp_op(PhoenixParser.Comp_opContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#comp_op}.
   *
   * @param ctx the parse tree
   */
  void exitComp_op(PhoenixParser.Comp_opContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#expression_list}.
   *
   * @param ctx the parse tree
   */
  void enterExpression_list(PhoenixParser.Expression_listContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#expression_list}.
   *
   * @param ctx the parse tree
   */
  void exitExpression_list(PhoenixParser.Expression_listContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#literal}.
   *
   * @param ctx the parse tree
   */
  void enterLiteral(PhoenixParser.LiteralContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#literal}.
   *
   * @param ctx the parse tree
   */
  void exitLiteral(PhoenixParser.LiteralContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#string}.
   *
   * @param ctx the parse tree
   */
  void enterString(PhoenixParser.StringContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#string}.
   *
   * @param ctx the parse tree
   */
  void exitString(PhoenixParser.StringContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#numeric}.
   *
   * @param ctx the parse tree
   */
  void enterNumeric(PhoenixParser.NumericContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#numeric}.
   *
   * @param ctx the parse tree
   */
  void exitNumeric(PhoenixParser.NumericContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#integer}.
   *
   * @param ctx the parse tree
   */
  void enterInteger(PhoenixParser.IntegerContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#integer}.
   *
   * @param ctx the parse tree
   */
  void exitInteger(PhoenixParser.IntegerContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#decimal}.
   *
   * @param ctx the parse tree
   */
  void enterDecimal(PhoenixParser.DecimalContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#decimal}.
   *
   * @param ctx the parse tree
   */
  void exitDecimal(PhoenixParser.DecimalContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#true_false}.
   *
   * @param ctx the parse tree
   */
  void enterTrue_false(PhoenixParser.True_falseContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#true_false}.
   *
   * @param ctx the parse tree
   */
  void exitTrue_false(PhoenixParser.True_falseContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#case_}.
   *
   * @param ctx the parse tree
   */
  void enterCase(PhoenixParser.CaseContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#case_}.
   *
   * @param ctx the parse tree
   */
  void exitCase(PhoenixParser.CaseContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#case_when}.
   *
   * @param ctx the parse tree
   */
  void enterCase_when(PhoenixParser.Case_whenContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#case_when}.
   *
   * @param ctx the parse tree
   */
  void exitCase_when(PhoenixParser.Case_whenContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#row_value_constructor}.
   *
   * @param ctx the parse tree
   */
  void enterRow_value_constructor(PhoenixParser.Row_value_constructorContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#row_value_constructor}.
   *
   * @param ctx the parse tree
   */
  void exitRow_value_constructor(PhoenixParser.Row_value_constructorContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#cast}.
   *
   * @param ctx the parse tree
   */
  void enterCast(PhoenixParser.CastContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#cast}.
   *
   * @param ctx the parse tree
   */
  void exitCast(PhoenixParser.CastContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#sequence}.
   *
   * @param ctx the parse tree
   */
  void enterSequence(PhoenixParser.SequenceContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#sequence}.
   *
   * @param ctx the parse tree
   */
  void exitSequence(PhoenixParser.SequenceContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#sequence_ref}.
   *
   * @param ctx the parse tree
   */
  void enterSequence_ref(PhoenixParser.Sequence_refContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#sequence_ref}.
   *
   * @param ctx the parse tree
   */
  void exitSequence_ref(PhoenixParser.Sequence_refContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#sequence_name}.
   *
   * @param ctx the parse tree
   */
  void enterSequence_name(PhoenixParser.Sequence_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#sequence_name}.
   *
   * @param ctx the parse tree
   */
  void exitSequence_name(PhoenixParser.Sequence_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#array_constructor}.
   *
   * @param ctx the parse tree
   */
  void enterArray_constructor(PhoenixParser.Array_constructorContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#array_constructor}.
   *
   * @param ctx the parse tree
   */
  void exitArray_constructor(PhoenixParser.Array_constructorContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#dimension_int}.
   *
   * @param ctx the parse tree
   */
  void enterDimension_int(PhoenixParser.Dimension_intContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#dimension_int}.
   *
   * @param ctx the parse tree
   */
  void exitDimension_int(PhoenixParser.Dimension_intContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#precision_int}.
   *
   * @param ctx the parse tree
   */
  void enterPrecision_int(PhoenixParser.Precision_intContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#precision_int}.
   *
   * @param ctx the parse tree
   */
  void exitPrecision_int(PhoenixParser.Precision_intContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#scale_int}.
   *
   * @param ctx the parse tree
   */
  void enterScale_int(PhoenixParser.Scale_intContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#scale_int}.
   *
   * @param ctx the parse tree
   */
  void exitScale_int(PhoenixParser.Scale_intContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#sql_data_type}.
   *
   * @param ctx the parse tree
   */
  void enterSql_data_type(PhoenixParser.Sql_data_typeContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#sql_data_type}.
   *
   * @param ctx the parse tree
   */
  void exitSql_data_type(PhoenixParser.Sql_data_typeContext ctx);

  /**
   * Enter a parse tree produced by {@link PhoenixParser#hbase_data_type}.
   *
   * @param ctx the parse tree
   */
  void enterHbase_data_type(PhoenixParser.Hbase_data_typeContext ctx);

  /**
   * Exit a parse tree produced by {@link PhoenixParser#hbase_data_type}.
   *
   * @param ctx the parse tree
   */
  void exitHbase_data_type(PhoenixParser.Hbase_data_typeContext ctx);

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @return a instance of the context.
   */
  cimerant.context.sql.SqlRootContext getRootContext();
}
