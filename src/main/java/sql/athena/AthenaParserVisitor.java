// Generated from sql/athena/AthenaParser.g4 by ANTLR 4.13.1

package sql.athena;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced by {@link
 * AthenaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
public interface AthenaParserVisitor<T> extends ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by {@link AthenaParser#stmt}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStmt(AthenaParser.StmtContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCommand(AthenaParser.CommandContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#ddl_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDdl_command(AthenaParser.Ddl_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#dml_command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDml_command(AthenaParser.Dml_commandContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#select}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSelect(AthenaParser.SelectContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#select_statement}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSelect_statement(AthenaParser.Select_statementContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#all_distinct}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAll_distinct(AthenaParser.All_distinctContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#order_item}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOrder_item(AthenaParser.Order_itemContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#from_item}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFrom_item(AthenaParser.From_itemContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#count}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCount(AthenaParser.CountContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#with_query}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitWith_query(AthenaParser.With_queryContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#grouping_element}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitGrouping_element(AthenaParser.Grouping_elementContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#condition}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCondition(AthenaParser.ConditionContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#insert_into}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitInsert_into(AthenaParser.Insert_intoContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#value_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitValue_list(AthenaParser.Value_listContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#select_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSelect_list(AthenaParser.Select_listContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#select_item}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSelect_item(AthenaParser.Select_itemContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#delete_stmt}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDelete_stmt(AthenaParser.Delete_stmtContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#update}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUpdate(AthenaParser.UpdateContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#merge_into}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitMerge_into(AthenaParser.Merge_intoContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#search_condition}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSearch_condition(AthenaParser.Search_conditionContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#when_clauses}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitWhen_clauses(AthenaParser.When_clausesContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#when_not_matched_clause}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitWhen_not_matched_clause(AthenaParser.When_not_matched_clauseContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#expression_list_}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExpression_list_(AthenaParser.Expression_list_Context ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#column_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitColumn_list(AthenaParser.Column_listContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#when_matched_and_clause}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitWhen_matched_and_clause(AthenaParser.When_matched_and_clauseContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#when_matched_then_clause}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitWhen_matched_then_clause(AthenaParser.When_matched_then_clauseContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#update_delete}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUpdate_delete(AthenaParser.Update_deleteContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#optimize_stmt}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOptimize_stmt(AthenaParser.Optimize_stmtContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#vacuum}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitVacuum(AthenaParser.VacuumContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#target_table}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTarget_table(AthenaParser.Target_tableContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#source_table}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSource_table(AthenaParser.Source_tableContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#explain}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExplain(AthenaParser.ExplainContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#explain_option}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExplain_option(AthenaParser.Explain_optionContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#prepare}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPrepare(AthenaParser.PrepareContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#statement}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStatement(AthenaParser.StatementContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#execute}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExecute(AthenaParser.ExecuteContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#parameter}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitParameter(AthenaParser.ParameterContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#value}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitValue(AthenaParser.ValueContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#deallocate}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDeallocate(AthenaParser.DeallocateContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#unload}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUnload(AthenaParser.UnloadContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#property_list}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitProperty_list(AthenaParser.Property_listContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#property_value}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitProperty_value(AthenaParser.Property_valueContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#predicate}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPredicate(AthenaParser.PredicateContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#alter_database}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlter_database(AthenaParser.Alter_databaseContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#db_schema}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDb_schema(AthenaParser.Db_schemaContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#kv_pair}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitKv_pair(AthenaParser.Kv_pairContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#alter_table_add_cols}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlter_table_add_cols(AthenaParser.Alter_table_add_colsContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#part_col_name_value}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPart_col_name_value(AthenaParser.Part_col_name_valueContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#partition_col_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPartition_col_name(AthenaParser.Partition_col_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#partition_col_value}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPartition_col_value(AthenaParser.Partition_col_valueContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#alter_table_add_part}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlter_table_add_part(AthenaParser.Alter_table_add_partContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#alter_table_drop_part}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlter_table_drop_part(AthenaParser.Alter_table_drop_partContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#partition_spec}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPartition_spec(AthenaParser.Partition_specContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#alter_table_rename_part}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlter_table_rename_part(AthenaParser.Alter_table_rename_partContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#alter_table_replace_part}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlter_table_replace_part(AthenaParser.Alter_table_replace_partContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#alter_table_set_location}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlter_table_set_location(AthenaParser.Alter_table_set_locationContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#alter_table_set_props}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlter_table_set_props(AthenaParser.Alter_table_set_propsContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#create_database}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCreate_database(AthenaParser.Create_databaseContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#create_table}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCreate_table(AthenaParser.Create_tableContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#table_comment}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_comment(AthenaParser.Table_commentContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#row_format}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitRow_format(AthenaParser.Row_formatContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#table_row_format_field_identifier}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_row_format_field_identifier(
      AthenaParser.Table_row_format_field_identifierContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#table_row_format_coll_items_identifier}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_row_format_coll_items_identifier(
      AthenaParser.Table_row_format_coll_items_identifierContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#table_row_format_map_keys_identifier}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_row_format_map_keys_identifier(
      AthenaParser.Table_row_format_map_keys_identifierContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#table_row_format_lines_identifier}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_row_format_lines_identifier(
      AthenaParser.Table_row_format_lines_identifierContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#table_row_null_format}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_row_null_format(AthenaParser.Table_row_null_formatContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#file_format}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFile_format(AthenaParser.File_formatContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#num_buckets}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNum_buckets(AthenaParser.Num_bucketsContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#col_def_with_comment}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCol_def_with_comment(AthenaParser.Col_def_with_commentContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#col_comment}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCol_comment(AthenaParser.Col_commentContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#create_table_as}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCreate_table_as(AthenaParser.Create_table_asContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#property_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitProperty_name(AthenaParser.Property_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#prop_exp}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitProp_exp(AthenaParser.Prop_expContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#create_view}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCreate_view(AthenaParser.Create_viewContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#describe}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDescribe(AthenaParser.DescribeContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#field_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitField_name(AthenaParser.Field_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#describe_view}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDescribe_view(AthenaParser.Describe_viewContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#drop_database}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDrop_database(AthenaParser.Drop_databaseContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#drop_table}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDrop_table(AthenaParser.Drop_tableContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#drop_view}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDrop_view(AthenaParser.Drop_viewContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#msck}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitMsck(AthenaParser.MsckContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#show_columns}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitShow_columns(AthenaParser.Show_columnsContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#show_create_table}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitShow_create_table(AthenaParser.Show_create_tableContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#show_create_view}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitShow_create_view(AthenaParser.Show_create_viewContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#show_databases}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitShow_databases(AthenaParser.Show_databasesContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#show_partitions}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitShow_partitions(AthenaParser.Show_partitionsContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#show_tables}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitShow_tables(AthenaParser.Show_tablesContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#show_tblproperties}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitShow_tblproperties(AthenaParser.Show_tblpropertiesContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#show_views}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitShow_views(AthenaParser.Show_viewsContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#query}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitQuery(AthenaParser.QueryContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#true_false}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTrue_false(AthenaParser.True_falseContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#boolean_expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBoolean_expression(AthenaParser.Boolean_expressionContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#pred}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPred(AthenaParser.PredContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#table_subquery}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_subquery(AthenaParser.Table_subqueryContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#comparison_operator}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitComparison_operator(AthenaParser.Comparison_operatorContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExpression(AthenaParser.ExpressionContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#case_expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCase_expression(AthenaParser.Case_expressionContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#when_expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitWhen_expression(AthenaParser.When_expressionContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#primitive_expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPrimitive_expression(AthenaParser.Primitive_expressionContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#literal}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitLiteral(AthenaParser.LiteralContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#int_number}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitInt_number(AthenaParser.Int_numberContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#number}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNumber(AthenaParser.NumberContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#data_type}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitData_type(AthenaParser.Data_typeContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#primitive_type}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPrimitive_type(AthenaParser.Primitive_typeContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#precision}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPrecision(AthenaParser.PrecisionContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#scale}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitScale(AthenaParser.ScaleContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#struct_col_def}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStruct_col_def(AthenaParser.Struct_col_defContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#col_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCol_name(AthenaParser.Col_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#db_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDb_name(AthenaParser.Db_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#database_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDatabase_name(AthenaParser.Database_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#statement_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStatement_name(AthenaParser.Statement_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#table_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTable_name(AthenaParser.Table_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#view_name}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitView_name(AthenaParser.View_nameContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#destination_table}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDestination_table(AthenaParser.Destination_tableContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#string}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitString(AthenaParser.StringContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#reg_ex}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitReg_ex(AthenaParser.Reg_exContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#alias}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAlias(AthenaParser.AliasContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#target_alias}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTarget_alias(AthenaParser.Target_aliasContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#source_alias}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSource_alias(AthenaParser.Source_aliasContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#id_}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitId_(AthenaParser.Id_Context ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#if_not_exists}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitIf_not_exists(AthenaParser.If_not_existsContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#if_exists}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitIf_exists(AthenaParser.If_existsContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#or_replace}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOr_replace(AthenaParser.Or_replaceContext ctx);

  /**
   * Visit a parse tree produced by {@link AthenaParser#from_in}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFrom_in(AthenaParser.From_inContext ctx);
}
