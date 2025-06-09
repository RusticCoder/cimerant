// Generated from sql/athena/AthenaParser.g4 by ANTLR 4.13.1

package sql.athena;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/** This interface defines a complete listener for a parse tree produced by {@link AthenaParser}. */
public interface AthenaParserListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link AthenaParser#stmt}.
   *
   * @param ctx the parse tree
   */
  void enterStmt(AthenaParser.StmtContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#stmt}.
   *
   * @param ctx the parse tree
   */
  void exitStmt(AthenaParser.StmtContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#command}.
   *
   * @param ctx the parse tree
   */
  void enterCommand(AthenaParser.CommandContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#command}.
   *
   * @param ctx the parse tree
   */
  void exitCommand(AthenaParser.CommandContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#ddl_command}.
   *
   * @param ctx the parse tree
   */
  void enterDdl_command(AthenaParser.Ddl_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#ddl_command}.
   *
   * @param ctx the parse tree
   */
  void exitDdl_command(AthenaParser.Ddl_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#dml_command}.
   *
   * @param ctx the parse tree
   */
  void enterDml_command(AthenaParser.Dml_commandContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#dml_command}.
   *
   * @param ctx the parse tree
   */
  void exitDml_command(AthenaParser.Dml_commandContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#select}.
   *
   * @param ctx the parse tree
   */
  void enterSelect(AthenaParser.SelectContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#select}.
   *
   * @param ctx the parse tree
   */
  void exitSelect(AthenaParser.SelectContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#select_statement}.
   *
   * @param ctx the parse tree
   */
  void enterSelect_statement(AthenaParser.Select_statementContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#select_statement}.
   *
   * @param ctx the parse tree
   */
  void exitSelect_statement(AthenaParser.Select_statementContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#all_distinct}.
   *
   * @param ctx the parse tree
   */
  void enterAll_distinct(AthenaParser.All_distinctContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#all_distinct}.
   *
   * @param ctx the parse tree
   */
  void exitAll_distinct(AthenaParser.All_distinctContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#order_item}.
   *
   * @param ctx the parse tree
   */
  void enterOrder_item(AthenaParser.Order_itemContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#order_item}.
   *
   * @param ctx the parse tree
   */
  void exitOrder_item(AthenaParser.Order_itemContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#from_item}.
   *
   * @param ctx the parse tree
   */
  void enterFrom_item(AthenaParser.From_itemContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#from_item}.
   *
   * @param ctx the parse tree
   */
  void exitFrom_item(AthenaParser.From_itemContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#count}.
   *
   * @param ctx the parse tree
   */
  void enterCount(AthenaParser.CountContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#count}.
   *
   * @param ctx the parse tree
   */
  void exitCount(AthenaParser.CountContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#with_query}.
   *
   * @param ctx the parse tree
   */
  void enterWith_query(AthenaParser.With_queryContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#with_query}.
   *
   * @param ctx the parse tree
   */
  void exitWith_query(AthenaParser.With_queryContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#grouping_element}.
   *
   * @param ctx the parse tree
   */
  void enterGrouping_element(AthenaParser.Grouping_elementContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#grouping_element}.
   *
   * @param ctx the parse tree
   */
  void exitGrouping_element(AthenaParser.Grouping_elementContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#condition}.
   *
   * @param ctx the parse tree
   */
  void enterCondition(AthenaParser.ConditionContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#condition}.
   *
   * @param ctx the parse tree
   */
  void exitCondition(AthenaParser.ConditionContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#insert_into}.
   *
   * @param ctx the parse tree
   */
  void enterInsert_into(AthenaParser.Insert_intoContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#insert_into}.
   *
   * @param ctx the parse tree
   */
  void exitInsert_into(AthenaParser.Insert_intoContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#value_list}.
   *
   * @param ctx the parse tree
   */
  void enterValue_list(AthenaParser.Value_listContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#value_list}.
   *
   * @param ctx the parse tree
   */
  void exitValue_list(AthenaParser.Value_listContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#select_list}.
   *
   * @param ctx the parse tree
   */
  void enterSelect_list(AthenaParser.Select_listContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#select_list}.
   *
   * @param ctx the parse tree
   */
  void exitSelect_list(AthenaParser.Select_listContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#select_item}.
   *
   * @param ctx the parse tree
   */
  void enterSelect_item(AthenaParser.Select_itemContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#select_item}.
   *
   * @param ctx the parse tree
   */
  void exitSelect_item(AthenaParser.Select_itemContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#delete_stmt}.
   *
   * @param ctx the parse tree
   */
  void enterDelete_stmt(AthenaParser.Delete_stmtContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#delete_stmt}.
   *
   * @param ctx the parse tree
   */
  void exitDelete_stmt(AthenaParser.Delete_stmtContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#update}.
   *
   * @param ctx the parse tree
   */
  void enterUpdate(AthenaParser.UpdateContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#update}.
   *
   * @param ctx the parse tree
   */
  void exitUpdate(AthenaParser.UpdateContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#merge_into}.
   *
   * @param ctx the parse tree
   */
  void enterMerge_into(AthenaParser.Merge_intoContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#merge_into}.
   *
   * @param ctx the parse tree
   */
  void exitMerge_into(AthenaParser.Merge_intoContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#search_condition}.
   *
   * @param ctx the parse tree
   */
  void enterSearch_condition(AthenaParser.Search_conditionContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#search_condition}.
   *
   * @param ctx the parse tree
   */
  void exitSearch_condition(AthenaParser.Search_conditionContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#when_clauses}.
   *
   * @param ctx the parse tree
   */
  void enterWhen_clauses(AthenaParser.When_clausesContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#when_clauses}.
   *
   * @param ctx the parse tree
   */
  void exitWhen_clauses(AthenaParser.When_clausesContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#when_not_matched_clause}.
   *
   * @param ctx the parse tree
   */
  void enterWhen_not_matched_clause(AthenaParser.When_not_matched_clauseContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#when_not_matched_clause}.
   *
   * @param ctx the parse tree
   */
  void exitWhen_not_matched_clause(AthenaParser.When_not_matched_clauseContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#expression_list_}.
   *
   * @param ctx the parse tree
   */
  void enterExpression_list_(AthenaParser.Expression_list_Context ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#expression_list_}.
   *
   * @param ctx the parse tree
   */
  void exitExpression_list_(AthenaParser.Expression_list_Context ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#column_list}.
   *
   * @param ctx the parse tree
   */
  void enterColumn_list(AthenaParser.Column_listContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#column_list}.
   *
   * @param ctx the parse tree
   */
  void exitColumn_list(AthenaParser.Column_listContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#when_matched_and_clause}.
   *
   * @param ctx the parse tree
   */
  void enterWhen_matched_and_clause(AthenaParser.When_matched_and_clauseContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#when_matched_and_clause}.
   *
   * @param ctx the parse tree
   */
  void exitWhen_matched_and_clause(AthenaParser.When_matched_and_clauseContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#when_matched_then_clause}.
   *
   * @param ctx the parse tree
   */
  void enterWhen_matched_then_clause(AthenaParser.When_matched_then_clauseContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#when_matched_then_clause}.
   *
   * @param ctx the parse tree
   */
  void exitWhen_matched_then_clause(AthenaParser.When_matched_then_clauseContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#update_delete}.
   *
   * @param ctx the parse tree
   */
  void enterUpdate_delete(AthenaParser.Update_deleteContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#update_delete}.
   *
   * @param ctx the parse tree
   */
  void exitUpdate_delete(AthenaParser.Update_deleteContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#optimize_stmt}.
   *
   * @param ctx the parse tree
   */
  void enterOptimize_stmt(AthenaParser.Optimize_stmtContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#optimize_stmt}.
   *
   * @param ctx the parse tree
   */
  void exitOptimize_stmt(AthenaParser.Optimize_stmtContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#vacuum}.
   *
   * @param ctx the parse tree
   */
  void enterVacuum(AthenaParser.VacuumContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#vacuum}.
   *
   * @param ctx the parse tree
   */
  void exitVacuum(AthenaParser.VacuumContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#target_table}.
   *
   * @param ctx the parse tree
   */
  void enterTarget_table(AthenaParser.Target_tableContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#target_table}.
   *
   * @param ctx the parse tree
   */
  void exitTarget_table(AthenaParser.Target_tableContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#source_table}.
   *
   * @param ctx the parse tree
   */
  void enterSource_table(AthenaParser.Source_tableContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#source_table}.
   *
   * @param ctx the parse tree
   */
  void exitSource_table(AthenaParser.Source_tableContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#explain}.
   *
   * @param ctx the parse tree
   */
  void enterExplain(AthenaParser.ExplainContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#explain}.
   *
   * @param ctx the parse tree
   */
  void exitExplain(AthenaParser.ExplainContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#explain_option}.
   *
   * @param ctx the parse tree
   */
  void enterExplain_option(AthenaParser.Explain_optionContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#explain_option}.
   *
   * @param ctx the parse tree
   */
  void exitExplain_option(AthenaParser.Explain_optionContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#prepare}.
   *
   * @param ctx the parse tree
   */
  void enterPrepare(AthenaParser.PrepareContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#prepare}.
   *
   * @param ctx the parse tree
   */
  void exitPrepare(AthenaParser.PrepareContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#statement}.
   *
   * @param ctx the parse tree
   */
  void enterStatement(AthenaParser.StatementContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#statement}.
   *
   * @param ctx the parse tree
   */
  void exitStatement(AthenaParser.StatementContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#execute}.
   *
   * @param ctx the parse tree
   */
  void enterExecute(AthenaParser.ExecuteContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#execute}.
   *
   * @param ctx the parse tree
   */
  void exitExecute(AthenaParser.ExecuteContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#parameter}.
   *
   * @param ctx the parse tree
   */
  void enterParameter(AthenaParser.ParameterContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#parameter}.
   *
   * @param ctx the parse tree
   */
  void exitParameter(AthenaParser.ParameterContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#value}.
   *
   * @param ctx the parse tree
   */
  void enterValue(AthenaParser.ValueContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#value}.
   *
   * @param ctx the parse tree
   */
  void exitValue(AthenaParser.ValueContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#deallocate}.
   *
   * @param ctx the parse tree
   */
  void enterDeallocate(AthenaParser.DeallocateContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#deallocate}.
   *
   * @param ctx the parse tree
   */
  void exitDeallocate(AthenaParser.DeallocateContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#unload}.
   *
   * @param ctx the parse tree
   */
  void enterUnload(AthenaParser.UnloadContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#unload}.
   *
   * @param ctx the parse tree
   */
  void exitUnload(AthenaParser.UnloadContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#property_list}.
   *
   * @param ctx the parse tree
   */
  void enterProperty_list(AthenaParser.Property_listContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#property_list}.
   *
   * @param ctx the parse tree
   */
  void exitProperty_list(AthenaParser.Property_listContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#property_value}.
   *
   * @param ctx the parse tree
   */
  void enterProperty_value(AthenaParser.Property_valueContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#property_value}.
   *
   * @param ctx the parse tree
   */
  void exitProperty_value(AthenaParser.Property_valueContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#predicate}.
   *
   * @param ctx the parse tree
   */
  void enterPredicate(AthenaParser.PredicateContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#predicate}.
   *
   * @param ctx the parse tree
   */
  void exitPredicate(AthenaParser.PredicateContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#alter_database}.
   *
   * @param ctx the parse tree
   */
  void enterAlter_database(AthenaParser.Alter_databaseContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#alter_database}.
   *
   * @param ctx the parse tree
   */
  void exitAlter_database(AthenaParser.Alter_databaseContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#db_schema}.
   *
   * @param ctx the parse tree
   */
  void enterDb_schema(AthenaParser.Db_schemaContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#db_schema}.
   *
   * @param ctx the parse tree
   */
  void exitDb_schema(AthenaParser.Db_schemaContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#kv_pair}.
   *
   * @param ctx the parse tree
   */
  void enterKv_pair(AthenaParser.Kv_pairContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#kv_pair}.
   *
   * @param ctx the parse tree
   */
  void exitKv_pair(AthenaParser.Kv_pairContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#alter_table_add_cols}.
   *
   * @param ctx the parse tree
   */
  void enterAlter_table_add_cols(AthenaParser.Alter_table_add_colsContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#alter_table_add_cols}.
   *
   * @param ctx the parse tree
   */
  void exitAlter_table_add_cols(AthenaParser.Alter_table_add_colsContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#part_col_name_value}.
   *
   * @param ctx the parse tree
   */
  void enterPart_col_name_value(AthenaParser.Part_col_name_valueContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#part_col_name_value}.
   *
   * @param ctx the parse tree
   */
  void exitPart_col_name_value(AthenaParser.Part_col_name_valueContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#partition_col_name}.
   *
   * @param ctx the parse tree
   */
  void enterPartition_col_name(AthenaParser.Partition_col_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#partition_col_name}.
   *
   * @param ctx the parse tree
   */
  void exitPartition_col_name(AthenaParser.Partition_col_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#partition_col_value}.
   *
   * @param ctx the parse tree
   */
  void enterPartition_col_value(AthenaParser.Partition_col_valueContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#partition_col_value}.
   *
   * @param ctx the parse tree
   */
  void exitPartition_col_value(AthenaParser.Partition_col_valueContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#alter_table_add_part}.
   *
   * @param ctx the parse tree
   */
  void enterAlter_table_add_part(AthenaParser.Alter_table_add_partContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#alter_table_add_part}.
   *
   * @param ctx the parse tree
   */
  void exitAlter_table_add_part(AthenaParser.Alter_table_add_partContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#alter_table_drop_part}.
   *
   * @param ctx the parse tree
   */
  void enterAlter_table_drop_part(AthenaParser.Alter_table_drop_partContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#alter_table_drop_part}.
   *
   * @param ctx the parse tree
   */
  void exitAlter_table_drop_part(AthenaParser.Alter_table_drop_partContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#partition_spec}.
   *
   * @param ctx the parse tree
   */
  void enterPartition_spec(AthenaParser.Partition_specContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#partition_spec}.
   *
   * @param ctx the parse tree
   */
  void exitPartition_spec(AthenaParser.Partition_specContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#alter_table_rename_part}.
   *
   * @param ctx the parse tree
   */
  void enterAlter_table_rename_part(AthenaParser.Alter_table_rename_partContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#alter_table_rename_part}.
   *
   * @param ctx the parse tree
   */
  void exitAlter_table_rename_part(AthenaParser.Alter_table_rename_partContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#alter_table_replace_part}.
   *
   * @param ctx the parse tree
   */
  void enterAlter_table_replace_part(AthenaParser.Alter_table_replace_partContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#alter_table_replace_part}.
   *
   * @param ctx the parse tree
   */
  void exitAlter_table_replace_part(AthenaParser.Alter_table_replace_partContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#alter_table_set_location}.
   *
   * @param ctx the parse tree
   */
  void enterAlter_table_set_location(AthenaParser.Alter_table_set_locationContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#alter_table_set_location}.
   *
   * @param ctx the parse tree
   */
  void exitAlter_table_set_location(AthenaParser.Alter_table_set_locationContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#alter_table_set_props}.
   *
   * @param ctx the parse tree
   */
  void enterAlter_table_set_props(AthenaParser.Alter_table_set_propsContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#alter_table_set_props}.
   *
   * @param ctx the parse tree
   */
  void exitAlter_table_set_props(AthenaParser.Alter_table_set_propsContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#create_database}.
   *
   * @param ctx the parse tree
   */
  void enterCreate_database(AthenaParser.Create_databaseContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#create_database}.
   *
   * @param ctx the parse tree
   */
  void exitCreate_database(AthenaParser.Create_databaseContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#create_table}.
   *
   * @param ctx the parse tree
   */
  void enterCreate_table(AthenaParser.Create_tableContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#create_table}.
   *
   * @param ctx the parse tree
   */
  void exitCreate_table(AthenaParser.Create_tableContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#table_comment}.
   *
   * @param ctx the parse tree
   */
  void enterTable_comment(AthenaParser.Table_commentContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#table_comment}.
   *
   * @param ctx the parse tree
   */
  void exitTable_comment(AthenaParser.Table_commentContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#row_format}.
   *
   * @param ctx the parse tree
   */
  void enterRow_format(AthenaParser.Row_formatContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#row_format}.
   *
   * @param ctx the parse tree
   */
  void exitRow_format(AthenaParser.Row_formatContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#table_row_format_field_identifier}.
   *
   * @param ctx the parse tree
   */
  void enterTable_row_format_field_identifier(
      AthenaParser.Table_row_format_field_identifierContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#table_row_format_field_identifier}.
   *
   * @param ctx the parse tree
   */
  void exitTable_row_format_field_identifier(
      AthenaParser.Table_row_format_field_identifierContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#table_row_format_coll_items_identifier}.
   *
   * @param ctx the parse tree
   */
  void enterTable_row_format_coll_items_identifier(
      AthenaParser.Table_row_format_coll_items_identifierContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#table_row_format_coll_items_identifier}.
   *
   * @param ctx the parse tree
   */
  void exitTable_row_format_coll_items_identifier(
      AthenaParser.Table_row_format_coll_items_identifierContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#table_row_format_map_keys_identifier}.
   *
   * @param ctx the parse tree
   */
  void enterTable_row_format_map_keys_identifier(
      AthenaParser.Table_row_format_map_keys_identifierContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#table_row_format_map_keys_identifier}.
   *
   * @param ctx the parse tree
   */
  void exitTable_row_format_map_keys_identifier(
      AthenaParser.Table_row_format_map_keys_identifierContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#table_row_format_lines_identifier}.
   *
   * @param ctx the parse tree
   */
  void enterTable_row_format_lines_identifier(
      AthenaParser.Table_row_format_lines_identifierContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#table_row_format_lines_identifier}.
   *
   * @param ctx the parse tree
   */
  void exitTable_row_format_lines_identifier(
      AthenaParser.Table_row_format_lines_identifierContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#table_row_null_format}.
   *
   * @param ctx the parse tree
   */
  void enterTable_row_null_format(AthenaParser.Table_row_null_formatContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#table_row_null_format}.
   *
   * @param ctx the parse tree
   */
  void exitTable_row_null_format(AthenaParser.Table_row_null_formatContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#file_format}.
   *
   * @param ctx the parse tree
   */
  void enterFile_format(AthenaParser.File_formatContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#file_format}.
   *
   * @param ctx the parse tree
   */
  void exitFile_format(AthenaParser.File_formatContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#num_buckets}.
   *
   * @param ctx the parse tree
   */
  void enterNum_buckets(AthenaParser.Num_bucketsContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#num_buckets}.
   *
   * @param ctx the parse tree
   */
  void exitNum_buckets(AthenaParser.Num_bucketsContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#col_def_with_comment}.
   *
   * @param ctx the parse tree
   */
  void enterCol_def_with_comment(AthenaParser.Col_def_with_commentContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#col_def_with_comment}.
   *
   * @param ctx the parse tree
   */
  void exitCol_def_with_comment(AthenaParser.Col_def_with_commentContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#col_comment}.
   *
   * @param ctx the parse tree
   */
  void enterCol_comment(AthenaParser.Col_commentContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#col_comment}.
   *
   * @param ctx the parse tree
   */
  void exitCol_comment(AthenaParser.Col_commentContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#create_table_as}.
   *
   * @param ctx the parse tree
   */
  void enterCreate_table_as(AthenaParser.Create_table_asContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#create_table_as}.
   *
   * @param ctx the parse tree
   */
  void exitCreate_table_as(AthenaParser.Create_table_asContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#property_name}.
   *
   * @param ctx the parse tree
   */
  void enterProperty_name(AthenaParser.Property_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#property_name}.
   *
   * @param ctx the parse tree
   */
  void exitProperty_name(AthenaParser.Property_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#prop_exp}.
   *
   * @param ctx the parse tree
   */
  void enterProp_exp(AthenaParser.Prop_expContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#prop_exp}.
   *
   * @param ctx the parse tree
   */
  void exitProp_exp(AthenaParser.Prop_expContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#create_view}.
   *
   * @param ctx the parse tree
   */
  void enterCreate_view(AthenaParser.Create_viewContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#create_view}.
   *
   * @param ctx the parse tree
   */
  void exitCreate_view(AthenaParser.Create_viewContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#describe}.
   *
   * @param ctx the parse tree
   */
  void enterDescribe(AthenaParser.DescribeContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#describe}.
   *
   * @param ctx the parse tree
   */
  void exitDescribe(AthenaParser.DescribeContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#field_name}.
   *
   * @param ctx the parse tree
   */
  void enterField_name(AthenaParser.Field_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#field_name}.
   *
   * @param ctx the parse tree
   */
  void exitField_name(AthenaParser.Field_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#describe_view}.
   *
   * @param ctx the parse tree
   */
  void enterDescribe_view(AthenaParser.Describe_viewContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#describe_view}.
   *
   * @param ctx the parse tree
   */
  void exitDescribe_view(AthenaParser.Describe_viewContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#drop_database}.
   *
   * @param ctx the parse tree
   */
  void enterDrop_database(AthenaParser.Drop_databaseContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#drop_database}.
   *
   * @param ctx the parse tree
   */
  void exitDrop_database(AthenaParser.Drop_databaseContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#drop_table}.
   *
   * @param ctx the parse tree
   */
  void enterDrop_table(AthenaParser.Drop_tableContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#drop_table}.
   *
   * @param ctx the parse tree
   */
  void exitDrop_table(AthenaParser.Drop_tableContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#drop_view}.
   *
   * @param ctx the parse tree
   */
  void enterDrop_view(AthenaParser.Drop_viewContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#drop_view}.
   *
   * @param ctx the parse tree
   */
  void exitDrop_view(AthenaParser.Drop_viewContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#msck}.
   *
   * @param ctx the parse tree
   */
  void enterMsck(AthenaParser.MsckContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#msck}.
   *
   * @param ctx the parse tree
   */
  void exitMsck(AthenaParser.MsckContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#show_columns}.
   *
   * @param ctx the parse tree
   */
  void enterShow_columns(AthenaParser.Show_columnsContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#show_columns}.
   *
   * @param ctx the parse tree
   */
  void exitShow_columns(AthenaParser.Show_columnsContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#show_create_table}.
   *
   * @param ctx the parse tree
   */
  void enterShow_create_table(AthenaParser.Show_create_tableContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#show_create_table}.
   *
   * @param ctx the parse tree
   */
  void exitShow_create_table(AthenaParser.Show_create_tableContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#show_create_view}.
   *
   * @param ctx the parse tree
   */
  void enterShow_create_view(AthenaParser.Show_create_viewContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#show_create_view}.
   *
   * @param ctx the parse tree
   */
  void exitShow_create_view(AthenaParser.Show_create_viewContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#show_databases}.
   *
   * @param ctx the parse tree
   */
  void enterShow_databases(AthenaParser.Show_databasesContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#show_databases}.
   *
   * @param ctx the parse tree
   */
  void exitShow_databases(AthenaParser.Show_databasesContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#show_partitions}.
   *
   * @param ctx the parse tree
   */
  void enterShow_partitions(AthenaParser.Show_partitionsContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#show_partitions}.
   *
   * @param ctx the parse tree
   */
  void exitShow_partitions(AthenaParser.Show_partitionsContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#show_tables}.
   *
   * @param ctx the parse tree
   */
  void enterShow_tables(AthenaParser.Show_tablesContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#show_tables}.
   *
   * @param ctx the parse tree
   */
  void exitShow_tables(AthenaParser.Show_tablesContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#show_tblproperties}.
   *
   * @param ctx the parse tree
   */
  void enterShow_tblproperties(AthenaParser.Show_tblpropertiesContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#show_tblproperties}.
   *
   * @param ctx the parse tree
   */
  void exitShow_tblproperties(AthenaParser.Show_tblpropertiesContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#show_views}.
   *
   * @param ctx the parse tree
   */
  void enterShow_views(AthenaParser.Show_viewsContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#show_views}.
   *
   * @param ctx the parse tree
   */
  void exitShow_views(AthenaParser.Show_viewsContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#query}.
   *
   * @param ctx the parse tree
   */
  void enterQuery(AthenaParser.QueryContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#query}.
   *
   * @param ctx the parse tree
   */
  void exitQuery(AthenaParser.QueryContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#true_false}.
   *
   * @param ctx the parse tree
   */
  void enterTrue_false(AthenaParser.True_falseContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#true_false}.
   *
   * @param ctx the parse tree
   */
  void exitTrue_false(AthenaParser.True_falseContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#boolean_expression}.
   *
   * @param ctx the parse tree
   */
  void enterBoolean_expression(AthenaParser.Boolean_expressionContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#boolean_expression}.
   *
   * @param ctx the parse tree
   */
  void exitBoolean_expression(AthenaParser.Boolean_expressionContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#pred}.
   *
   * @param ctx the parse tree
   */
  void enterPred(AthenaParser.PredContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#pred}.
   *
   * @param ctx the parse tree
   */
  void exitPred(AthenaParser.PredContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#table_subquery}.
   *
   * @param ctx the parse tree
   */
  void enterTable_subquery(AthenaParser.Table_subqueryContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#table_subquery}.
   *
   * @param ctx the parse tree
   */
  void exitTable_subquery(AthenaParser.Table_subqueryContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#comparison_operator}.
   *
   * @param ctx the parse tree
   */
  void enterComparison_operator(AthenaParser.Comparison_operatorContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#comparison_operator}.
   *
   * @param ctx the parse tree
   */
  void exitComparison_operator(AthenaParser.Comparison_operatorContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#expression}.
   *
   * @param ctx the parse tree
   */
  void enterExpression(AthenaParser.ExpressionContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#expression}.
   *
   * @param ctx the parse tree
   */
  void exitExpression(AthenaParser.ExpressionContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#case_expression}.
   *
   * @param ctx the parse tree
   */
  void enterCase_expression(AthenaParser.Case_expressionContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#case_expression}.
   *
   * @param ctx the parse tree
   */
  void exitCase_expression(AthenaParser.Case_expressionContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#when_expression}.
   *
   * @param ctx the parse tree
   */
  void enterWhen_expression(AthenaParser.When_expressionContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#when_expression}.
   *
   * @param ctx the parse tree
   */
  void exitWhen_expression(AthenaParser.When_expressionContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#primitive_expression}.
   *
   * @param ctx the parse tree
   */
  void enterPrimitive_expression(AthenaParser.Primitive_expressionContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#primitive_expression}.
   *
   * @param ctx the parse tree
   */
  void exitPrimitive_expression(AthenaParser.Primitive_expressionContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#literal}.
   *
   * @param ctx the parse tree
   */
  void enterLiteral(AthenaParser.LiteralContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#literal}.
   *
   * @param ctx the parse tree
   */
  void exitLiteral(AthenaParser.LiteralContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#int_number}.
   *
   * @param ctx the parse tree
   */
  void enterInt_number(AthenaParser.Int_numberContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#int_number}.
   *
   * @param ctx the parse tree
   */
  void exitInt_number(AthenaParser.Int_numberContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#number}.
   *
   * @param ctx the parse tree
   */
  void enterNumber(AthenaParser.NumberContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#number}.
   *
   * @param ctx the parse tree
   */
  void exitNumber(AthenaParser.NumberContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#data_type}.
   *
   * @param ctx the parse tree
   */
  void enterData_type(AthenaParser.Data_typeContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#data_type}.
   *
   * @param ctx the parse tree
   */
  void exitData_type(AthenaParser.Data_typeContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#primitive_type}.
   *
   * @param ctx the parse tree
   */
  void enterPrimitive_type(AthenaParser.Primitive_typeContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#primitive_type}.
   *
   * @param ctx the parse tree
   */
  void exitPrimitive_type(AthenaParser.Primitive_typeContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#precision}.
   *
   * @param ctx the parse tree
   */
  void enterPrecision(AthenaParser.PrecisionContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#precision}.
   *
   * @param ctx the parse tree
   */
  void exitPrecision(AthenaParser.PrecisionContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#scale}.
   *
   * @param ctx the parse tree
   */
  void enterScale(AthenaParser.ScaleContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#scale}.
   *
   * @param ctx the parse tree
   */
  void exitScale(AthenaParser.ScaleContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#struct_col_def}.
   *
   * @param ctx the parse tree
   */
  void enterStruct_col_def(AthenaParser.Struct_col_defContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#struct_col_def}.
   *
   * @param ctx the parse tree
   */
  void exitStruct_col_def(AthenaParser.Struct_col_defContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#col_name}.
   *
   * @param ctx the parse tree
   */
  void enterCol_name(AthenaParser.Col_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#col_name}.
   *
   * @param ctx the parse tree
   */
  void exitCol_name(AthenaParser.Col_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#db_name}.
   *
   * @param ctx the parse tree
   */
  void enterDb_name(AthenaParser.Db_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#db_name}.
   *
   * @param ctx the parse tree
   */
  void exitDb_name(AthenaParser.Db_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#database_name}.
   *
   * @param ctx the parse tree
   */
  void enterDatabase_name(AthenaParser.Database_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#database_name}.
   *
   * @param ctx the parse tree
   */
  void exitDatabase_name(AthenaParser.Database_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#statement_name}.
   *
   * @param ctx the parse tree
   */
  void enterStatement_name(AthenaParser.Statement_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#statement_name}.
   *
   * @param ctx the parse tree
   */
  void exitStatement_name(AthenaParser.Statement_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#table_name}.
   *
   * @param ctx the parse tree
   */
  void enterTable_name(AthenaParser.Table_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#table_name}.
   *
   * @param ctx the parse tree
   */
  void exitTable_name(AthenaParser.Table_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#view_name}.
   *
   * @param ctx the parse tree
   */
  void enterView_name(AthenaParser.View_nameContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#view_name}.
   *
   * @param ctx the parse tree
   */
  void exitView_name(AthenaParser.View_nameContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#destination_table}.
   *
   * @param ctx the parse tree
   */
  void enterDestination_table(AthenaParser.Destination_tableContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#destination_table}.
   *
   * @param ctx the parse tree
   */
  void exitDestination_table(AthenaParser.Destination_tableContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#string}.
   *
   * @param ctx the parse tree
   */
  void enterString(AthenaParser.StringContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#string}.
   *
   * @param ctx the parse tree
   */
  void exitString(AthenaParser.StringContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#reg_ex}.
   *
   * @param ctx the parse tree
   */
  void enterReg_ex(AthenaParser.Reg_exContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#reg_ex}.
   *
   * @param ctx the parse tree
   */
  void exitReg_ex(AthenaParser.Reg_exContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#alias}.
   *
   * @param ctx the parse tree
   */
  void enterAlias(AthenaParser.AliasContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#alias}.
   *
   * @param ctx the parse tree
   */
  void exitAlias(AthenaParser.AliasContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#target_alias}.
   *
   * @param ctx the parse tree
   */
  void enterTarget_alias(AthenaParser.Target_aliasContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#target_alias}.
   *
   * @param ctx the parse tree
   */
  void exitTarget_alias(AthenaParser.Target_aliasContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#source_alias}.
   *
   * @param ctx the parse tree
   */
  void enterSource_alias(AthenaParser.Source_aliasContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#source_alias}.
   *
   * @param ctx the parse tree
   */
  void exitSource_alias(AthenaParser.Source_aliasContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#id_}.
   *
   * @param ctx the parse tree
   */
  void enterId_(AthenaParser.Id_Context ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#id_}.
   *
   * @param ctx the parse tree
   */
  void exitId_(AthenaParser.Id_Context ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#if_not_exists}.
   *
   * @param ctx the parse tree
   */
  void enterIf_not_exists(AthenaParser.If_not_existsContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#if_not_exists}.
   *
   * @param ctx the parse tree
   */
  void exitIf_not_exists(AthenaParser.If_not_existsContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#if_exists}.
   *
   * @param ctx the parse tree
   */
  void enterIf_exists(AthenaParser.If_existsContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#if_exists}.
   *
   * @param ctx the parse tree
   */
  void exitIf_exists(AthenaParser.If_existsContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#or_replace}.
   *
   * @param ctx the parse tree
   */
  void enterOr_replace(AthenaParser.Or_replaceContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#or_replace}.
   *
   * @param ctx the parse tree
   */
  void exitOr_replace(AthenaParser.Or_replaceContext ctx);

  /**
   * Enter a parse tree produced by {@link AthenaParser#from_in}.
   *
   * @param ctx the parse tree
   */
  void enterFrom_in(AthenaParser.From_inContext ctx);

  /**
   * Exit a parse tree produced by {@link AthenaParser#from_in}.
   *
   * @param ctx the parse tree
   */
  void exitFrom_in(AthenaParser.From_inContext ctx);

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @return a instance of the context.
   */
  cimerant.context.sql.SqlRootContext getRootContext();
}
