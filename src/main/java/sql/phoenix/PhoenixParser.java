// Generated from sql/phoenix/PhoenixParser.g4 by ANTLR 4.13.1

package sql.phoenix;

import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PhoenixParser extends Parser {
  static {
    RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int ADD = 1,
      ALL = 2,
      ALTER = 3,
      AND = 4,
      ANY = 5,
      APPROX_COUNT_DISTINCT = 6,
      ARRAY = 7,
      AS = 8,
      ASC = 9,
      ASYNC = 10,
      AVG = 11,
      BETWEEN = 12,
      BIGINT = 13,
      BINARY = 14,
      BY = 15,
      CACHE = 16,
      CASCADE = 17,
      CASE = 18,
      CAST = 19,
      CHAR = 20,
      CLOSE = 21,
      COLUMN = 22,
      CONSTANT = 23,
      CONSTRAINT = 24,
      COUNT = 25,
      CREATE = 26,
      CURRENT = 27,
      CURSOR = 28,
      CYCLE = 29,
      DATE = 30,
      DECIMAL = 31,
      DECLARE = 32,
      DEFAULT = 33,
      DEFAULTVALUE = 34,
      DELETE = 35,
      DESC = 36,
      DISABLE = 37,
      DISTINCT = 38,
      DOUBLE = 39,
      DROP = 40,
      DUPLICATE = 41,
      ELSE = 42,
      END = 43,
      EXISTS = 44,
      EXPLAIN = 45,
      FALSE = 46,
      FETCH = 47,
      FIRST = 48,
      FIRST_VALUE = 49,
      FIRST_VALUES = 50,
      FLOAT = 51,
      FOR = 52,
      FROM = 53,
      FUNCTION = 54,
      GRANT = 55,
      GROUP = 56,
      HAVING = 57,
      IF = 58,
      IGNORE = 59,
      ILIKE = 60,
      IN = 61,
      INCLUDE = 62,
      INCREMENT = 63,
      INDEX = 64,
      INNER = 65,
      INTEGER = 66,
      INTO = 67,
      IS = 68,
      JAR = 69,
      JOIN = 70,
      KEY = 71,
      LAST = 72,
      LAST_VALUE = 73,
      LAST_VALUES = 74,
      LEFT = 75,
      LIKE = 76,
      LIMIT = 77,
      LOCAL = 78,
      MAX = 79,
      MAXVALUE = 80,
      MIN = 81,
      MINVALUE = 82,
      NEXT = 83,
      NO_CACHE = 84,
      NO_CHILD_PARENT_JOIN_OPTIMIZATION = 85,
      NO_INDEX = 86,
      NO_SEEK_TO_COLUMN = 87,
      NO_STAR_JOIN = 88,
      NOT = 89,
      NTH_VALUE = 90,
      NULL_ = 91,
      NULLS = 92,
      OFFSET = 93,
      ON = 94,
      ONLY = 95,
      OPEN = 96,
      OR = 97,
      ORDER = 98,
      OUTER = 99,
      PERCENT_RANK = 100,
      PERCENTILE_CONT = 101,
      PERCENTILE_DISC = 102,
      PRIMARY = 103,
      RANGE_SCAN = 104,
      REBUILD = 105,
      RETURNS = 106,
      REVOKE = 107,
      RIGHT = 108,
      ROW = 109,
      ROW_TIMESTAMP = 110,
      ROWS = 111,
      SCHEMA = 112,
      SEEK_TO_COLUMN = 113,
      SELECT = 114,
      SEQUENCE = 115,
      SERIAL = 116,
      SET = 117,
      SKIP_SCAN = 118,
      SMALL = 119,
      SMALLINT = 120,
      SPLIT = 121,
      START = 122,
      STATISTICS = 123,
      STDDEV_POP = 124,
      STDDEV_SAMP = 125,
      SUM = 126,
      TABLE = 127,
      TABLESAMPLE = 128,
      TEMPORARY = 129,
      THEN = 130,
      TIME = 131,
      TIMESTAMP = 132,
      TINYINT = 133,
      TO = 134,
      TRUE = 135,
      UNION = 136,
      UNSIGNED_DATE = 137,
      UNSIGNED_DOUBLE = 138,
      UNSIGNED_FLOAT = 139,
      UNSIGNED_INT = 140,
      UNSIGNED_LONG = 141,
      UNSIGNED_SMALLINT = 142,
      UNSIGNED_TIME = 143,
      UNSIGNED_TIMESTAMP = 144,
      UNSIGNED_TINYINT = 145,
      UNUSABLE = 146,
      UPDATE = 147,
      UPSERT = 148,
      USABLE = 149,
      USE = 150,
      USE_DATA_OVER_INDEX_TABLE = 151,
      USE_INDEX_OVER_DATA_TABLE = 152,
      USE_SORT_MERGE_JOIN = 153,
      USING = 154,
      VALUE = 155,
      VALUES = 156,
      VARBINARY = 157,
      VARCHAR = 158,
      VIEW = 159,
      WHEN = 160,
      WHERE = 161,
      WITH = 162,
      SEMI = 163,
      COLON = 164,
      COMMA = 165,
      DOT = 166,
      LP = 167,
      RP = 168,
      STAR = 169,
      DIV = 170,
      MOD = 171,
      PLUS = 172,
      MINUS = 173,
      PIPEPIPE = 174,
      LSB = 175,
      RSC = 176,
      EQ = 177,
      NE = 178,
      NE2 = 179,
      GT = 180,
      GE = 181,
      LT = 182,
      LE = 183,
      QM = 184,
      WHITE_SPACE = 185,
      SQL_COMMENT = 186,
      LINE_COMMENT = 187,
      HINT_START = 188,
      HINT_END = 189,
      DOUBLE_QUOTE_ID = 190,
      SINGLE_QUOTE = 191,
      ID = 192,
      STRING_LITERAL = 193,
      DECIMAL_LITERAL = 194,
      FLOAT_LITERAL = 195,
      REAL_LITERAL = 196,
      CHAR_LITERAL = 197;
  public static final int RULE_phoenix_file = 0,
      RULE_batch = 1,
      RULE_sql_command = 2,
      RULE_ddl_command = 3,
      RULE_dml_command = 4,
      RULE_other_command = 5,
      RULE_alter_command = 6,
      RULE_alter_index_command = 7,
      RULE_create_function_command = 8,
      RULE_create_index_command = 9,
      RULE_create_schema_command = 10,
      RULE_create_sequence_command = 11,
      RULE_create_table_command = 12,
      RULE_create_view_command = 13,
      RULE_constraint = 14,
      RULE_constraint_column_list = 15,
      RULE_constraint_column = 16,
      RULE_constraint_name = 17,
      RULE_new_table_ref = 18,
      RULE_table_options = 19,
      RULE_existing_table_ref = 20,
      RULE_expression_asc_desc_list = 21,
      RULE_split_point_list = 22,
      RULE_split_point = 23,
      RULE_index_options = 24,
      RULE_options_list = 25,
      RULE_options_ = 26,
      RULE_option = 27,
      RULE_func_argument_list = 28,
      RULE_func_argument = 29,
      RULE_class_name = 30,
      RULE_jar_path = 31,
      RULE_drop_table_command = 32,
      RULE_drop_view_command = 33,
      RULE_drop_schema_command = 34,
      RULE_drop_sequence_command = 35,
      RULE_drop_index_command = 36,
      RULE_drop_function_command = 37,
      RULE_index_name = 38,
      RULE_func_name = 39,
      RULE_if_exists = 40,
      RULE_if_not_exists = 41,
      RULE_table_ref = 42,
      RULE_use_command = 43,
      RULE_explain_command = 44,
      RULE_update_statistics_command = 45,
      RULE_declare_cursor_command = 46,
      RULE_open_cursor_command = 47,
      RULE_fetch_next_command = 48,
      RULE_close_command = 49,
      RULE_grant_command = 50,
      RULE_revoke_command = 51,
      RULE_on_schema_table = 52,
      RULE_permission_string = 53,
      RULE_user_string = 54,
      RULE_cursor_name = 55,
      RULE_guide_post_options = 56,
      RULE_upsert_values_command = 57,
      RULE_column_ref_list = 58,
      RULE_column_def_list = 59,
      RULE_upsert_select_command = 60,
      RULE_delete_command = 61,
      RULE_order_by_clause = 62,
      RULE_limit_clause = 63,
      RULE_order_list = 64,
      RULE_where_clause = 65,
      RULE_select_command = 66,
      RULE_select_statement = 67,
      RULE_union_list = 68,
      RULE_union = 69,
      RULE_join_list = 70,
      RULE_join_item = 71,
      RULE_row_rows = 72,
      RULE_bind_parameter_number = 73,
      RULE_order = 74,
      RULE_first_last = 75,
      RULE_first_next = 76,
      RULE_bind_parameter = 77,
      RULE_number = 78,
      RULE_hint = 79,
      RULE_hint_name = 80,
      RULE_scan_hint = 81,
      RULE_index_hint = 82,
      RULE_cache_hint = 83,
      RULE_small_hint = 84,
      RULE_join_hint = 85,
      RULE_seek_to_column_hint = 86,
      RULE_serial_hint = 87,
      RULE_select_expression = 88,
      RULE_family_name = 89,
      RULE_quoted_name = 90,
      RULE_column_alias = 91,
      RULE_alias = 92,
      RULE_name = 93,
      RULE_table_spec = 94,
      RULE_aliased_table_ref = 95,
      RULE_table_alias = 96,
      RULE_positive_decimal = 97,
      RULE_schema_name = 98,
      RULE_table_name = 99,
      RULE_column_def = 100,
      RULE_column_ref = 101,
      RULE_column_name = 102,
      RULE_data_type = 103,
      RULE_asc_desc = 104,
      RULE_any_all = 105,
      RULE_join_type = 106,
      RULE_expression = 107,
      RULE_comp_op = 108,
      RULE_expression_list = 109,
      RULE_literal = 110,
      RULE_string = 111,
      RULE_numeric = 112,
      RULE_integer = 113,
      RULE_decimal = 114,
      RULE_true_false = 115,
      RULE_case = 116,
      RULE_case_when = 117,
      RULE_row_value_constructor = 118,
      RULE_cast = 119,
      RULE_sequence = 120,
      RULE_sequence_ref = 121,
      RULE_sequence_name = 122,
      RULE_array_constructor = 123,
      RULE_dimension_int = 124,
      RULE_precision_int = 125,
      RULE_scale_int = 126,
      RULE_sql_data_type = 127,
      RULE_hbase_data_type = 128;

  private static String[] makeRuleNames() {
    return new String[] {
      "phoenix_file",
      "batch",
      "sql_command",
      "ddl_command",
      "dml_command",
      "other_command",
      "alter_command",
      "alter_index_command",
      "create_function_command",
      "create_index_command",
      "create_schema_command",
      "create_sequence_command",
      "create_table_command",
      "create_view_command",
      "constraint",
      "constraint_column_list",
      "constraint_column",
      "constraint_name",
      "new_table_ref",
      "table_options",
      "existing_table_ref",
      "expression_asc_desc_list",
      "split_point_list",
      "split_point",
      "index_options",
      "options_list",
      "options_",
      "option",
      "func_argument_list",
      "func_argument",
      "class_name",
      "jar_path",
      "drop_table_command",
      "drop_view_command",
      "drop_schema_command",
      "drop_sequence_command",
      "drop_index_command",
      "drop_function_command",
      "index_name",
      "func_name",
      "if_exists",
      "if_not_exists",
      "table_ref",
      "use_command",
      "explain_command",
      "update_statistics_command",
      "declare_cursor_command",
      "open_cursor_command",
      "fetch_next_command",
      "close_command",
      "grant_command",
      "revoke_command",
      "on_schema_table",
      "permission_string",
      "user_string",
      "cursor_name",
      "guide_post_options",
      "upsert_values_command",
      "column_ref_list",
      "column_def_list",
      "upsert_select_command",
      "delete_command",
      "order_by_clause",
      "limit_clause",
      "order_list",
      "where_clause",
      "select_command",
      "select_statement",
      "union_list",
      "union",
      "join_list",
      "join_item",
      "row_rows",
      "bind_parameter_number",
      "order",
      "first_last",
      "first_next",
      "bind_parameter",
      "number",
      "hint",
      "hint_name",
      "scan_hint",
      "index_hint",
      "cache_hint",
      "small_hint",
      "join_hint",
      "seek_to_column_hint",
      "serial_hint",
      "select_expression",
      "family_name",
      "quoted_name",
      "column_alias",
      "alias",
      "name",
      "table_spec",
      "aliased_table_ref",
      "table_alias",
      "positive_decimal",
      "schema_name",
      "table_name",
      "column_def",
      "column_ref",
      "column_name",
      "data_type",
      "asc_desc",
      "any_all",
      "join_type",
      "expression",
      "comp_op",
      "expression_list",
      "literal",
      "string",
      "numeric",
      "integer",
      "decimal",
      "true_false",
      "case",
      "case_when",
      "row_value_constructor",
      "cast",
      "sequence",
      "sequence_ref",
      "sequence_name",
      "array_constructor",
      "dimension_int",
      "precision_int",
      "scale_int",
      "sql_data_type",
      "hbase_data_type"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null,
      "'ADD'",
      "'ALL'",
      "'ALTER'",
      "'AND'",
      "'ANY'",
      "'APPROX_COUNT_DISTINCT'",
      "'ARRAY'",
      "'AS'",
      "'ASC'",
      "'ASYNC'",
      "'AVG'",
      "'BETWEEN'",
      "'BIGINT'",
      "'BINARY'",
      "'BY'",
      "'CACHE'",
      "'CASCADE'",
      "'CASE'",
      "'CAST'",
      "'CHAR'",
      "'CLOSE'",
      "'COLUMN'",
      "'CONSTANT'",
      "'CONSTRAINT'",
      "'COUNT'",
      "'CREATE'",
      "'CURRENT'",
      "'CURSOR'",
      "'CYCLE'",
      "'DATE'",
      "'DECIMAL'",
      "'DECLARE'",
      "'DEFAULT'",
      "'DEFAULTVALUE'",
      "'DELETE'",
      "'DESC'",
      "'DISABLE'",
      "'DISTINCT'",
      "'DOUBLE'",
      "'DROP'",
      "'DUPLICATE'",
      "'ELSE'",
      "'END'",
      "'EXISTS'",
      "'EXPLAIN'",
      "'FALSE'",
      "'FETCH'",
      "'FIRST'",
      "'FIRST_VALUE'",
      "'FIRST_VALUES'",
      "'FLOAT'",
      "'FOR'",
      "'FROM'",
      "'FUNCTION'",
      "'GRANT'",
      "'GROUP'",
      "'HAVING'",
      "'IF'",
      "'IGNORE'",
      "'ILIKE'",
      "'IN'",
      "'INCLUDE'",
      "'INCREMENT'",
      "'INDEX'",
      "'INNER'",
      "'INTEGER'",
      "'INTO'",
      "'IS'",
      "'JAR'",
      "'JOIN'",
      "'KEY'",
      "'LAST'",
      "'LAST_VALUE'",
      "'LAST_VALUES'",
      "'LEFT'",
      "'LIKE'",
      "'LIMIT'",
      "'LOCAL'",
      "'MAX'",
      "'MAXVALUE'",
      "'MIN'",
      "'MINVALUE'",
      "'NEXT'",
      "'NO_CACHE'",
      "'NO_CHILD_PARENT_JOIN_OPTIMIZATION'",
      "'NO_INDEX'",
      "'NO_SEEK_TO_COLUMN'",
      "'NO_STAR_JOIN'",
      "'NOT'",
      "'NTH_VALUE'",
      "'NULL'",
      "'NULLS'",
      "'OFFSET'",
      "'ON'",
      "'ONLY'",
      "'OPEN'",
      "'OR'",
      "'ORDER'",
      "'OUTER'",
      "'PERCENT_RANK'",
      "'PERCENTILE_CONT'",
      "'PERCENTILE_DISC'",
      "'PRIMARY'",
      "'RANGE_SCAN'",
      "'REBUILD'",
      "'RETURNS'",
      "'REVOKE'",
      "'RIGHT'",
      "'ROW'",
      "'ROW_TIMESTAMP'",
      "'ROWS'",
      "'SCHEMA'",
      "'SEEK_TO_COLUMN'",
      "'SELECT'",
      "'SEQUENCE'",
      "'SERIAL'",
      "'SET'",
      "'SKIP_SCAN'",
      "'SMALL'",
      "'SMALLINT'",
      "'SPLIT'",
      "'START'",
      "'STATISTICS'",
      "'STDDEV_POP'",
      "'STDDEV_SAMP'",
      "'SUM'",
      "'TABLE'",
      "'TABLESAMPLE'",
      "'TEMPORARY'",
      "'THEN'",
      "'TIME'",
      "'TIMESTAMP'",
      "'TINYINT'",
      "'TO'",
      "'TRUE'",
      "'UNION'",
      "'UNSIGNED_DATE'",
      "'UNSIGNED_DOUBLE'",
      "'UNSIGNED_FLOAT'",
      "'UNSIGNED_INT'",
      "'UNSIGNED_LONG'",
      "'UNSIGNED_SMALLINT'",
      "'UNSIGNED_TIME'",
      "'UNSIGNED_TIMESTAMP'",
      "'UNSIGNED_TINYINT'",
      "'UNUSABLE'",
      "'UPDATE'",
      "'UPSERT'",
      "'USABLE'",
      "'USE'",
      "'USE_DATA_OVER_INDEX_TABLE'",
      "'USE_INDEX_OVER_DATA_TABLE'",
      "'USE_SORT_MERGE_JOIN'",
      "'USING'",
      "'VALUE'",
      "'VALUES'",
      "'VARBINARY'",
      "'VARCHAR'",
      "'VIEW'",
      "'WHEN'",
      "'WHERE'",
      "'WITH'",
      "';'",
      "':'",
      "','",
      "'.'",
      "'('",
      "')'",
      "'*'",
      "'/'",
      "'%'",
      "'+'",
      "'-'",
      "'||'",
      "'['",
      "']'",
      "'='",
      "'<>'",
      "'!='",
      "'>'",
      "'>='",
      "'<'",
      "'<='",
      "'?'",
      null,
      null,
      null,
      "'/*+'",
      "'*/'",
      null,
      "'''"
    };
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      "ADD",
      "ALL",
      "ALTER",
      "AND",
      "ANY",
      "APPROX_COUNT_DISTINCT",
      "ARRAY",
      "AS",
      "ASC",
      "ASYNC",
      "AVG",
      "BETWEEN",
      "BIGINT",
      "BINARY",
      "BY",
      "CACHE",
      "CASCADE",
      "CASE",
      "CAST",
      "CHAR",
      "CLOSE",
      "COLUMN",
      "CONSTANT",
      "CONSTRAINT",
      "COUNT",
      "CREATE",
      "CURRENT",
      "CURSOR",
      "CYCLE",
      "DATE",
      "DECIMAL",
      "DECLARE",
      "DEFAULT",
      "DEFAULTVALUE",
      "DELETE",
      "DESC",
      "DISABLE",
      "DISTINCT",
      "DOUBLE",
      "DROP",
      "DUPLICATE",
      "ELSE",
      "END",
      "EXISTS",
      "EXPLAIN",
      "FALSE",
      "FETCH",
      "FIRST",
      "FIRST_VALUE",
      "FIRST_VALUES",
      "FLOAT",
      "FOR",
      "FROM",
      "FUNCTION",
      "GRANT",
      "GROUP",
      "HAVING",
      "IF",
      "IGNORE",
      "ILIKE",
      "IN",
      "INCLUDE",
      "INCREMENT",
      "INDEX",
      "INNER",
      "INTEGER",
      "INTO",
      "IS",
      "JAR",
      "JOIN",
      "KEY",
      "LAST",
      "LAST_VALUE",
      "LAST_VALUES",
      "LEFT",
      "LIKE",
      "LIMIT",
      "LOCAL",
      "MAX",
      "MAXVALUE",
      "MIN",
      "MINVALUE",
      "NEXT",
      "NO_CACHE",
      "NO_CHILD_PARENT_JOIN_OPTIMIZATION",
      "NO_INDEX",
      "NO_SEEK_TO_COLUMN",
      "NO_STAR_JOIN",
      "NOT",
      "NTH_VALUE",
      "NULL_",
      "NULLS",
      "OFFSET",
      "ON",
      "ONLY",
      "OPEN",
      "OR",
      "ORDER",
      "OUTER",
      "PERCENT_RANK",
      "PERCENTILE_CONT",
      "PERCENTILE_DISC",
      "PRIMARY",
      "RANGE_SCAN",
      "REBUILD",
      "RETURNS",
      "REVOKE",
      "RIGHT",
      "ROW",
      "ROW_TIMESTAMP",
      "ROWS",
      "SCHEMA",
      "SEEK_TO_COLUMN",
      "SELECT",
      "SEQUENCE",
      "SERIAL",
      "SET",
      "SKIP_SCAN",
      "SMALL",
      "SMALLINT",
      "SPLIT",
      "START",
      "STATISTICS",
      "STDDEV_POP",
      "STDDEV_SAMP",
      "SUM",
      "TABLE",
      "TABLESAMPLE",
      "TEMPORARY",
      "THEN",
      "TIME",
      "TIMESTAMP",
      "TINYINT",
      "TO",
      "TRUE",
      "UNION",
      "UNSIGNED_DATE",
      "UNSIGNED_DOUBLE",
      "UNSIGNED_FLOAT",
      "UNSIGNED_INT",
      "UNSIGNED_LONG",
      "UNSIGNED_SMALLINT",
      "UNSIGNED_TIME",
      "UNSIGNED_TIMESTAMP",
      "UNSIGNED_TINYINT",
      "UNUSABLE",
      "UPDATE",
      "UPSERT",
      "USABLE",
      "USE",
      "USE_DATA_OVER_INDEX_TABLE",
      "USE_INDEX_OVER_DATA_TABLE",
      "USE_SORT_MERGE_JOIN",
      "USING",
      "VALUE",
      "VALUES",
      "VARBINARY",
      "VARCHAR",
      "VIEW",
      "WHEN",
      "WHERE",
      "WITH",
      "SEMI",
      "COLON",
      "COMMA",
      "DOT",
      "LP",
      "RP",
      "STAR",
      "DIV",
      "MOD",
      "PLUS",
      "MINUS",
      "PIPEPIPE",
      "LSB",
      "RSC",
      "EQ",
      "NE",
      "NE2",
      "GT",
      "GE",
      "LT",
      "LE",
      "QM",
      "WHITE_SPACE",
      "SQL_COMMENT",
      "LINE_COMMENT",
      "HINT_START",
      "HINT_END",
      "DOUBLE_QUOTE_ID",
      "SINGLE_QUOTE",
      "ID",
      "STRING_LITERAL",
      "DECIMAL_LITERAL",
      "FLOAT_LITERAL",
      "REAL_LITERAL",
      "CHAR_LITERAL"
    };
  }

  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated public static final String[] tokenNames;

  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override
  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  @Override
  public String getGrammarFileName() {
    return "PhoenixParser.g4";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public PhoenixParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Phoenix_fileContext extends ParserRuleContext {
    public TerminalNode EOF() {
      return getToken(PhoenixParser.EOF, 0);
    }

    public List<BatchContext> batch() {
      return getRuleContexts(BatchContext.class);
    }

    public BatchContext batch(int i) {
      return getRuleContext(BatchContext.class, i);
    }

    public Phoenix_fileContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_phoenix_file;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterPhoenix_file(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitPhoenix_file(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitPhoenix_file(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Phoenix_fileContext phoenix_file() throws RecognitionException {
    Phoenix_fileContext _localctx = new Phoenix_fileContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_phoenix_file);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(261);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36205857114947592L) != 0)
            || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 24769797950801921L) != 0)) {
          {
            {
              setState(258);
              batch();
            }
          }
          setState(263);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(264);
        match(EOF);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class BatchContext extends ParserRuleContext {
    public Sql_commandContext sql_command() {
      return getRuleContext(Sql_commandContext.class, 0);
    }

    public TerminalNode SEMI() {
      return getToken(PhoenixParser.SEMI, 0);
    }

    public BatchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_batch;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterBatch(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitBatch(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitBatch(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BatchContext batch() throws RecognitionException {
    BatchContext _localctx = new BatchContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_batch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(266);
        sql_command();
        setState(268);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == SEMI) {
          {
            setState(267);
            match(SEMI);
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Sql_commandContext extends ParserRuleContext {
    public Ddl_commandContext ddl_command() {
      return getRuleContext(Ddl_commandContext.class, 0);
    }

    public Dml_commandContext dml_command() {
      return getRuleContext(Dml_commandContext.class, 0);
    }

    public Other_commandContext other_command() {
      return getRuleContext(Other_commandContext.class, 0);
    }

    public Sql_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_sql_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSql_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSql_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSql_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Sql_commandContext sql_command() throws RecognitionException {
    Sql_commandContext _localctx = new Sql_commandContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_sql_command);
    try {
      setState(273);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case ALTER:
        case CREATE:
        case DROP:
          enterOuterAlt(_localctx, 1);
          {
            setState(270);
            ddl_command();
          }
          break;
        case DELETE:
        case SELECT:
        case UPSERT:
          enterOuterAlt(_localctx, 2);
          {
            setState(271);
            dml_command();
          }
          break;
        case CLOSE:
        case DECLARE:
        case EXPLAIN:
        case FETCH:
        case GRANT:
        case OPEN:
        case REVOKE:
        case UPDATE:
        case USE:
          enterOuterAlt(_localctx, 3);
          {
            setState(272);
            other_command();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Ddl_commandContext extends ParserRuleContext {
    public Alter_commandContext alter_command() {
      return getRuleContext(Alter_commandContext.class, 0);
    }

    public Alter_index_commandContext alter_index_command() {
      return getRuleContext(Alter_index_commandContext.class, 0);
    }

    public Create_function_commandContext create_function_command() {
      return getRuleContext(Create_function_commandContext.class, 0);
    }

    public Create_index_commandContext create_index_command() {
      return getRuleContext(Create_index_commandContext.class, 0);
    }

    public Create_schema_commandContext create_schema_command() {
      return getRuleContext(Create_schema_commandContext.class, 0);
    }

    public Create_sequence_commandContext create_sequence_command() {
      return getRuleContext(Create_sequence_commandContext.class, 0);
    }

    public Create_table_commandContext create_table_command() {
      return getRuleContext(Create_table_commandContext.class, 0);
    }

    public Create_view_commandContext create_view_command() {
      return getRuleContext(Create_view_commandContext.class, 0);
    }

    public Drop_function_commandContext drop_function_command() {
      return getRuleContext(Drop_function_commandContext.class, 0);
    }

    public Drop_index_commandContext drop_index_command() {
      return getRuleContext(Drop_index_commandContext.class, 0);
    }

    public Drop_schema_commandContext drop_schema_command() {
      return getRuleContext(Drop_schema_commandContext.class, 0);
    }

    public Drop_sequence_commandContext drop_sequence_command() {
      return getRuleContext(Drop_sequence_commandContext.class, 0);
    }

    public Drop_table_commandContext drop_table_command() {
      return getRuleContext(Drop_table_commandContext.class, 0);
    }

    public Drop_view_commandContext drop_view_command() {
      return getRuleContext(Drop_view_commandContext.class, 0);
    }

    public Ddl_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_ddl_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDdl_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDdl_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDdl_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Ddl_commandContext ddl_command() throws RecognitionException {
    Ddl_commandContext _localctx = new Ddl_commandContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_ddl_command);
    try {
      setState(289);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(275);
            alter_command();
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(276);
            alter_index_command();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(277);
            create_function_command();
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(278);
            create_index_command();
          }
          break;
        case 5:
          enterOuterAlt(_localctx, 5);
          {
            setState(279);
            create_schema_command();
          }
          break;
        case 6:
          enterOuterAlt(_localctx, 6);
          {
            setState(280);
            create_sequence_command();
          }
          break;
        case 7:
          enterOuterAlt(_localctx, 7);
          {
            setState(281);
            create_table_command();
          }
          break;
        case 8:
          enterOuterAlt(_localctx, 8);
          {
            setState(282);
            create_view_command();
          }
          break;
        case 9:
          enterOuterAlt(_localctx, 9);
          {
            setState(283);
            drop_function_command();
          }
          break;
        case 10:
          enterOuterAlt(_localctx, 10);
          {
            setState(284);
            drop_index_command();
          }
          break;
        case 11:
          enterOuterAlt(_localctx, 11);
          {
            setState(285);
            drop_schema_command();
          }
          break;
        case 12:
          enterOuterAlt(_localctx, 12);
          {
            setState(286);
            drop_sequence_command();
          }
          break;
        case 13:
          enterOuterAlt(_localctx, 13);
          {
            setState(287);
            drop_table_command();
          }
          break;
        case 14:
          enterOuterAlt(_localctx, 14);
          {
            setState(288);
            drop_view_command();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Dml_commandContext extends ParserRuleContext {
    public Select_commandContext select_command() {
      return getRuleContext(Select_commandContext.class, 0);
    }

    public Upsert_values_commandContext upsert_values_command() {
      return getRuleContext(Upsert_values_commandContext.class, 0);
    }

    public Upsert_select_commandContext upsert_select_command() {
      return getRuleContext(Upsert_select_commandContext.class, 0);
    }

    public Delete_commandContext delete_command() {
      return getRuleContext(Delete_commandContext.class, 0);
    }

    public Dml_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_dml_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDml_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDml_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDml_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Dml_commandContext dml_command() throws RecognitionException {
    Dml_commandContext _localctx = new Dml_commandContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_dml_command);
    try {
      setState(295);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(291);
            select_command();
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(292);
            upsert_values_command();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(293);
            upsert_select_command();
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(294);
            delete_command();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Other_commandContext extends ParserRuleContext {
    public Use_commandContext use_command() {
      return getRuleContext(Use_commandContext.class, 0);
    }

    public Explain_commandContext explain_command() {
      return getRuleContext(Explain_commandContext.class, 0);
    }

    public Update_statistics_commandContext update_statistics_command() {
      return getRuleContext(Update_statistics_commandContext.class, 0);
    }

    public Declare_cursor_commandContext declare_cursor_command() {
      return getRuleContext(Declare_cursor_commandContext.class, 0);
    }

    public Fetch_next_commandContext fetch_next_command() {
      return getRuleContext(Fetch_next_commandContext.class, 0);
    }

    public Close_commandContext close_command() {
      return getRuleContext(Close_commandContext.class, 0);
    }

    public Open_cursor_commandContext open_cursor_command() {
      return getRuleContext(Open_cursor_commandContext.class, 0);
    }

    public Grant_commandContext grant_command() {
      return getRuleContext(Grant_commandContext.class, 0);
    }

    public Revoke_commandContext revoke_command() {
      return getRuleContext(Revoke_commandContext.class, 0);
    }

    public Other_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_other_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterOther_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitOther_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitOther_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Other_commandContext other_command() throws RecognitionException {
    Other_commandContext _localctx = new Other_commandContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_other_command);
    try {
      setState(306);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case USE:
          enterOuterAlt(_localctx, 1);
          {
            setState(297);
            use_command();
          }
          break;
        case EXPLAIN:
          enterOuterAlt(_localctx, 2);
          {
            setState(298);
            explain_command();
          }
          break;
        case UPDATE:
          enterOuterAlt(_localctx, 3);
          {
            setState(299);
            update_statistics_command();
          }
          break;
        case DECLARE:
          enterOuterAlt(_localctx, 4);
          {
            setState(300);
            declare_cursor_command();
          }
          break;
        case FETCH:
          enterOuterAlt(_localctx, 5);
          {
            setState(301);
            fetch_next_command();
          }
          break;
        case CLOSE:
          enterOuterAlt(_localctx, 6);
          {
            setState(302);
            close_command();
          }
          break;
        case OPEN:
          enterOuterAlt(_localctx, 7);
          {
            setState(303);
            open_cursor_command();
          }
          break;
        case GRANT:
          enterOuterAlt(_localctx, 8);
          {
            setState(304);
            grant_command();
          }
          break;
        case REVOKE:
          enterOuterAlt(_localctx, 9);
          {
            setState(305);
            revoke_command();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Alter_commandContext extends ParserRuleContext {
    public TerminalNode ALTER() {
      return getToken(PhoenixParser.ALTER, 0);
    }

    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public TerminalNode ADD() {
      return getToken(PhoenixParser.ADD, 0);
    }

    public Column_def_listContext column_def_list() {
      return getRuleContext(Column_def_listContext.class, 0);
    }

    public TerminalNode DROP() {
      return getToken(PhoenixParser.DROP, 0);
    }

    public TerminalNode COLUMN() {
      return getToken(PhoenixParser.COLUMN, 0);
    }

    public Column_ref_listContext column_ref_list() {
      return getRuleContext(Column_ref_listContext.class, 0);
    }

    public TerminalNode SET() {
      return getToken(PhoenixParser.SET, 0);
    }

    public Options_Context options_() {
      return getRuleContext(Options_Context.class, 0);
    }

    public TerminalNode TABLE() {
      return getToken(PhoenixParser.TABLE, 0);
    }

    public TerminalNode VIEW() {
      return getToken(PhoenixParser.VIEW, 0);
    }

    public If_not_existsContext if_not_exists() {
      return getRuleContext(If_not_existsContext.class, 0);
    }

    public If_existsContext if_exists() {
      return getRuleContext(If_existsContext.class, 0);
    }

    public Alter_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_alter_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterAlter_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitAlter_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitAlter_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Alter_commandContext alter_command() throws RecognitionException {
    Alter_commandContext _localctx = new Alter_commandContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_alter_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(308);
        match(ALTER);
        setState(310);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == TABLE || _la == VIEW) {
          {
            setState(309);
            _la = _input.LA(1);
            if (!(_la == TABLE || _la == VIEW)) {
              _errHandler.recoverInline(this);
            } else {
              if (_input.LA(1) == Token.EOF) matchedEOF = true;
              _errHandler.reportMatch(this);
              consume();
            }
          }
        }

        setState(312);
        table_ref();
        setState(329);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case ADD:
            {
              setState(313);
              match(ADD);
              setState(315);
              _errHandler.sync(this);
              _la = _input.LA(1);
              if (_la == IF) {
                {
                  setState(314);
                  if_not_exists();
                }
              }

              setState(317);
              column_def_list();
              setState(319);
              _errHandler.sync(this);
              _la = _input.LA(1);
              if (_la == DOUBLE_QUOTE_ID || _la == ID) {
                {
                  setState(318);
                  options_();
                }
              }
            }
            break;
          case DROP:
            {
              setState(321);
              match(DROP);
              setState(322);
              match(COLUMN);
              setState(324);
              _errHandler.sync(this);
              _la = _input.LA(1);
              if (_la == IF) {
                {
                  setState(323);
                  if_exists();
                }
              }

              setState(326);
              column_ref_list();
            }
            break;
          case SET:
            {
              setState(327);
              match(SET);
              setState(328);
              options_();
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Alter_index_commandContext extends ParserRuleContext {
    public TerminalNode ALTER() {
      return getToken(PhoenixParser.ALTER, 0);
    }

    public TerminalNode INDEX() {
      return getToken(PhoenixParser.INDEX, 0);
    }

    public Index_nameContext index_name() {
      return getRuleContext(Index_nameContext.class, 0);
    }

    public TerminalNode ON() {
      return getToken(PhoenixParser.ON, 0);
    }

    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public TerminalNode DISABLE() {
      return getToken(PhoenixParser.DISABLE, 0);
    }

    public TerminalNode REBUILD() {
      return getToken(PhoenixParser.REBUILD, 0);
    }

    public TerminalNode UNUSABLE() {
      return getToken(PhoenixParser.UNUSABLE, 0);
    }

    public TerminalNode USABLE() {
      return getToken(PhoenixParser.USABLE, 0);
    }

    public If_existsContext if_exists() {
      return getRuleContext(If_existsContext.class, 0);
    }

    public Alter_index_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_alter_index_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterAlter_index_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitAlter_index_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitAlter_index_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Alter_index_commandContext alter_index_command() throws RecognitionException {
    Alter_index_commandContext _localctx = new Alter_index_commandContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_alter_index_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(331);
        match(ALTER);
        setState(332);
        match(INDEX);
        setState(334);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(333);
            if_exists();
          }
        }

        setState(336);
        index_name();
        setState(337);
        match(ON);
        setState(338);
        table_ref();
        setState(339);
        _la = _input.LA(1);
        if (!(_la == DISABLE
            || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 19791209299969L) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Create_function_commandContext extends ParserRuleContext {
    public TerminalNode CREATE() {
      return getToken(PhoenixParser.CREATE, 0);
    }

    public TerminalNode FUNCTION() {
      return getToken(PhoenixParser.FUNCTION, 0);
    }

    public Func_nameContext func_name() {
      return getRuleContext(Func_nameContext.class, 0);
    }

    public TerminalNode LP() {
      return getToken(PhoenixParser.LP, 0);
    }

    public Func_argument_listContext func_argument_list() {
      return getRuleContext(Func_argument_listContext.class, 0);
    }

    public TerminalNode RP() {
      return getToken(PhoenixParser.RP, 0);
    }

    public TerminalNode RETURNS() {
      return getToken(PhoenixParser.RETURNS, 0);
    }

    public Data_typeContext data_type() {
      return getRuleContext(Data_typeContext.class, 0);
    }

    public TerminalNode AS() {
      return getToken(PhoenixParser.AS, 0);
    }

    public Class_nameContext class_name() {
      return getRuleContext(Class_nameContext.class, 0);
    }

    public TerminalNode TEMPORARY() {
      return getToken(PhoenixParser.TEMPORARY, 0);
    }

    public TerminalNode USING() {
      return getToken(PhoenixParser.USING, 0);
    }

    public TerminalNode JAR() {
      return getToken(PhoenixParser.JAR, 0);
    }

    public Jar_pathContext jar_path() {
      return getRuleContext(Jar_pathContext.class, 0);
    }

    public Create_function_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_create_function_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterCreate_function_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitCreate_function_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitCreate_function_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Create_function_commandContext create_function_command()
      throws RecognitionException {
    Create_function_commandContext _localctx = new Create_function_commandContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_create_function_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(341);
        match(CREATE);
        setState(343);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == TEMPORARY) {
          {
            setState(342);
            match(TEMPORARY);
          }
        }

        setState(345);
        match(FUNCTION);
        setState(346);
        func_name();
        setState(347);
        match(LP);
        setState(348);
        func_argument_list();
        setState(349);
        match(RP);
        setState(350);
        match(RETURNS);
        setState(351);
        data_type();
        setState(352);
        match(AS);
        setState(353);
        class_name();
        setState(357);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == USING) {
          {
            setState(354);
            match(USING);
            setState(355);
            match(JAR);
            setState(356);
            jar_path();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Create_index_commandContext extends ParserRuleContext {
    public TerminalNode CREATE() {
      return getToken(PhoenixParser.CREATE, 0);
    }

    public TerminalNode INDEX() {
      return getToken(PhoenixParser.INDEX, 0);
    }

    public Index_nameContext index_name() {
      return getRuleContext(Index_nameContext.class, 0);
    }

    public List<TerminalNode> ON() {
      return getTokens(PhoenixParser.ON);
    }

    public TerminalNode ON(int i) {
      return getToken(PhoenixParser.ON, i);
    }

    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public List<TerminalNode> LP() {
      return getTokens(PhoenixParser.LP);
    }

    public TerminalNode LP(int i) {
      return getToken(PhoenixParser.LP, i);
    }

    public Expression_asc_desc_listContext expression_asc_desc_list() {
      return getRuleContext(Expression_asc_desc_listContext.class, 0);
    }

    public List<TerminalNode> RP() {
      return getTokens(PhoenixParser.RP);
    }

    public TerminalNode RP(int i) {
      return getToken(PhoenixParser.RP, i);
    }

    public TerminalNode LOCAL() {
      return getToken(PhoenixParser.LOCAL, 0);
    }

    public If_not_existsContext if_not_exists() {
      return getRuleContext(If_not_existsContext.class, 0);
    }

    public TerminalNode INCLUDE() {
      return getToken(PhoenixParser.INCLUDE, 0);
    }

    public Column_ref_listContext column_ref_list() {
      return getRuleContext(Column_ref_listContext.class, 0);
    }

    public TerminalNode ASYNC() {
      return getToken(PhoenixParser.ASYNC, 0);
    }

    public Index_optionsContext index_options() {
      return getRuleContext(Index_optionsContext.class, 0);
    }

    public TerminalNode SPLIT() {
      return getToken(PhoenixParser.SPLIT, 0);
    }

    public Split_point_listContext split_point_list() {
      return getRuleContext(Split_point_listContext.class, 0);
    }

    public Create_index_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_create_index_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterCreate_index_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitCreate_index_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitCreate_index_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Create_index_commandContext create_index_command() throws RecognitionException {
    Create_index_commandContext _localctx = new Create_index_commandContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_create_index_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(359);
        match(CREATE);
        setState(361);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == LOCAL) {
          {
            setState(360);
            match(LOCAL);
          }
        }

        setState(363);
        match(INDEX);
        setState(365);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(364);
            if_not_exists();
          }
        }

        setState(367);
        index_name();
        setState(368);
        match(ON);
        setState(369);
        table_ref();
        setState(370);
        match(LP);
        setState(371);
        expression_asc_desc_list();
        setState(372);
        match(RP);
        setState(378);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == INCLUDE) {
          {
            setState(373);
            match(INCLUDE);
            setState(374);
            match(LP);
            setState(375);
            column_ref_list();
            setState(376);
            match(RP);
          }
        }

        setState(381);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ASYNC) {
          {
            setState(380);
            match(ASYNC);
          }
        }

        setState(384);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == DOUBLE_QUOTE_ID || _la == ID) {
          {
            setState(383);
            index_options();
          }
        }

        setState(389);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == SPLIT) {
          {
            setState(386);
            match(SPLIT);
            setState(387);
            match(ON);
            setState(388);
            split_point_list();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Create_schema_commandContext extends ParserRuleContext {
    public TerminalNode CREATE() {
      return getToken(PhoenixParser.CREATE, 0);
    }

    public TerminalNode SCHEMA() {
      return getToken(PhoenixParser.SCHEMA, 0);
    }

    public Schema_nameContext schema_name() {
      return getRuleContext(Schema_nameContext.class, 0);
    }

    public If_not_existsContext if_not_exists() {
      return getRuleContext(If_not_existsContext.class, 0);
    }

    public Create_schema_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_create_schema_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterCreate_schema_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitCreate_schema_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitCreate_schema_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Create_schema_commandContext create_schema_command() throws RecognitionException {
    Create_schema_commandContext _localctx = new Create_schema_commandContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_create_schema_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(391);
        match(CREATE);
        setState(392);
        match(SCHEMA);
        setState(394);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(393);
            if_not_exists();
          }
        }

        setState(396);
        schema_name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Create_sequence_commandContext extends ParserRuleContext {
    public TerminalNode CREATE() {
      return getToken(PhoenixParser.CREATE, 0);
    }

    public TerminalNode SEQUENCE() {
      return getToken(PhoenixParser.SEQUENCE, 0);
    }

    public Sequence_refContext sequence_ref() {
      return getRuleContext(Sequence_refContext.class, 0);
    }

    public If_not_existsContext if_not_exists() {
      return getRuleContext(If_not_existsContext.class, 0);
    }

    public TerminalNode START() {
      return getToken(PhoenixParser.START, 0);
    }

    public List<Bind_parameter_numberContext> bind_parameter_number() {
      return getRuleContexts(Bind_parameter_numberContext.class);
    }

    public Bind_parameter_numberContext bind_parameter_number(int i) {
      return getRuleContext(Bind_parameter_numberContext.class, i);
    }

    public TerminalNode INCREMENT() {
      return getToken(PhoenixParser.INCREMENT, 0);
    }

    public TerminalNode MINVALUE() {
      return getToken(PhoenixParser.MINVALUE, 0);
    }

    public TerminalNode MAXVALUE() {
      return getToken(PhoenixParser.MAXVALUE, 0);
    }

    public TerminalNode CYCLE() {
      return getToken(PhoenixParser.CYCLE, 0);
    }

    public TerminalNode CACHE() {
      return getToken(PhoenixParser.CACHE, 0);
    }

    public TerminalNode WITH() {
      return getToken(PhoenixParser.WITH, 0);
    }

    public TerminalNode BY() {
      return getToken(PhoenixParser.BY, 0);
    }

    public Create_sequence_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_create_sequence_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterCreate_sequence_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitCreate_sequence_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitCreate_sequence_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Create_sequence_commandContext create_sequence_command()
      throws RecognitionException {
    Create_sequence_commandContext _localctx = new Create_sequence_commandContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_create_sequence_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(398);
        match(CREATE);
        setState(399);
        match(SEQUENCE);
        setState(401);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(400);
            if_not_exists();
          }
        }

        setState(403);
        sequence_ref();
        setState(409);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == START) {
          {
            setState(404);
            match(START);
            setState(406);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == WITH) {
              {
                setState(405);
                match(WITH);
              }
            }

            setState(408);
            bind_parameter_number();
          }
        }

        setState(416);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == INCREMENT) {
          {
            setState(411);
            match(INCREMENT);
            setState(413);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == BY) {
              {
                setState(412);
                match(BY);
              }
            }

            setState(415);
            bind_parameter_number();
          }
        }

        setState(420);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == MINVALUE) {
          {
            setState(418);
            match(MINVALUE);
            setState(419);
            bind_parameter_number();
          }
        }

        setState(424);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == MAXVALUE) {
          {
            setState(422);
            match(MAXVALUE);
            setState(423);
            bind_parameter_number();
          }
        }

        setState(427);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == CYCLE) {
          {
            setState(426);
            match(CYCLE);
          }
        }

        setState(431);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == CACHE) {
          {
            setState(429);
            match(CACHE);
            setState(430);
            bind_parameter_number();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Create_table_commandContext extends ParserRuleContext {
    public TerminalNode CREATE() {
      return getToken(PhoenixParser.CREATE, 0);
    }

    public TerminalNode TABLE() {
      return getToken(PhoenixParser.TABLE, 0);
    }

    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public List<TerminalNode> LP() {
      return getTokens(PhoenixParser.LP);
    }

    public TerminalNode LP(int i) {
      return getToken(PhoenixParser.LP, i);
    }

    public Column_def_listContext column_def_list() {
      return getRuleContext(Column_def_listContext.class, 0);
    }

    public List<TerminalNode> RP() {
      return getTokens(PhoenixParser.RP);
    }

    public TerminalNode RP(int i) {
      return getToken(PhoenixParser.RP, i);
    }

    public If_not_existsContext if_not_exists() {
      return getRuleContext(If_not_existsContext.class, 0);
    }

    public ConstraintContext constraint() {
      return getRuleContext(ConstraintContext.class, 0);
    }

    public Table_optionsContext table_options() {
      return getRuleContext(Table_optionsContext.class, 0);
    }

    public TerminalNode SPLIT() {
      return getToken(PhoenixParser.SPLIT, 0);
    }

    public TerminalNode ON() {
      return getToken(PhoenixParser.ON, 0);
    }

    public Split_point_listContext split_point_list() {
      return getRuleContext(Split_point_listContext.class, 0);
    }

    public Create_table_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_create_table_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterCreate_table_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitCreate_table_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitCreate_table_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Create_table_commandContext create_table_command() throws RecognitionException {
    Create_table_commandContext _localctx = new Create_table_commandContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_create_table_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(433);
        match(CREATE);
        setState(434);
        match(TABLE);
        setState(436);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(435);
            if_not_exists();
          }
        }

        setState(438);
        table_ref();
        setState(439);
        match(LP);
        setState(440);
        column_def_list();
        setState(442);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == CONSTRAINT) {
          {
            setState(441);
            constraint();
          }
        }

        setState(444);
        match(RP);
        setState(446);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == DOUBLE_QUOTE_ID || _la == ID) {
          {
            setState(445);
            table_options();
          }
        }

        setState(454);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == SPLIT) {
          {
            setState(448);
            match(SPLIT);
            setState(449);
            match(ON);
            setState(450);
            match(LP);
            setState(451);
            split_point_list();
            setState(452);
            match(RP);
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Create_view_commandContext extends ParserRuleContext {
    public TerminalNode CREATE() {
      return getToken(PhoenixParser.CREATE, 0);
    }

    public TerminalNode VIEW() {
      return getToken(PhoenixParser.VIEW, 0);
    }

    public New_table_refContext new_table_ref() {
      return getRuleContext(New_table_refContext.class, 0);
    }

    public If_not_existsContext if_not_exists() {
      return getRuleContext(If_not_existsContext.class, 0);
    }

    public TerminalNode LP() {
      return getToken(PhoenixParser.LP, 0);
    }

    public Column_def_listContext column_def_list() {
      return getRuleContext(Column_def_listContext.class, 0);
    }

    public TerminalNode RP() {
      return getToken(PhoenixParser.RP, 0);
    }

    public TerminalNode AS() {
      return getToken(PhoenixParser.AS, 0);
    }

    public TerminalNode SELECT() {
      return getToken(PhoenixParser.SELECT, 0);
    }

    public TerminalNode STAR() {
      return getToken(PhoenixParser.STAR, 0);
    }

    public TerminalNode FROM() {
      return getToken(PhoenixParser.FROM, 0);
    }

    public Existing_table_refContext existing_table_ref() {
      return getRuleContext(Existing_table_refContext.class, 0);
    }

    public Table_optionsContext table_options() {
      return getRuleContext(Table_optionsContext.class, 0);
    }

    public TerminalNode WHERE() {
      return getToken(PhoenixParser.WHERE, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public Create_view_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_create_view_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterCreate_view_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitCreate_view_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitCreate_view_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Create_view_commandContext create_view_command() throws RecognitionException {
    Create_view_commandContext _localctx = new Create_view_commandContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_create_view_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(456);
        match(CREATE);
        setState(457);
        match(VIEW);
        setState(459);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(458);
            if_not_exists();
          }
        }

        setState(461);
        new_table_ref();
        setState(466);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == LP) {
          {
            setState(462);
            match(LP);
            setState(463);
            column_def_list();
            setState(464);
            match(RP);
          }
        }

        setState(477);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == AS) {
          {
            setState(468);
            match(AS);
            setState(469);
            match(SELECT);
            setState(470);
            match(STAR);
            setState(471);
            match(FROM);
            setState(472);
            existing_table_ref();
            setState(475);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == WHERE) {
              {
                setState(473);
                match(WHERE);
                setState(474);
                expression(0);
              }
            }
          }
        }

        setState(480);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == DOUBLE_QUOTE_ID || _la == ID) {
          {
            setState(479);
            table_options();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ConstraintContext extends ParserRuleContext {
    public TerminalNode CONSTRAINT() {
      return getToken(PhoenixParser.CONSTRAINT, 0);
    }

    public Constraint_nameContext constraint_name() {
      return getRuleContext(Constraint_nameContext.class, 0);
    }

    public TerminalNode PRIMARY() {
      return getToken(PhoenixParser.PRIMARY, 0);
    }

    public TerminalNode KEY() {
      return getToken(PhoenixParser.KEY, 0);
    }

    public TerminalNode LP() {
      return getToken(PhoenixParser.LP, 0);
    }

    public Constraint_column_listContext constraint_column_list() {
      return getRuleContext(Constraint_column_listContext.class, 0);
    }

    public TerminalNode RP() {
      return getToken(PhoenixParser.RP, 0);
    }

    public ConstraintContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_constraint;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterConstraint(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitConstraint(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitConstraint(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ConstraintContext constraint() throws RecognitionException {
    ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_constraint);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(482);
        match(CONSTRAINT);
        setState(483);
        constraint_name();
        setState(484);
        match(PRIMARY);
        setState(485);
        match(KEY);
        setState(486);
        match(LP);
        setState(487);
        constraint_column_list();
        setState(488);
        match(RP);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Constraint_column_listContext extends ParserRuleContext {
    public List<Constraint_columnContext> constraint_column() {
      return getRuleContexts(Constraint_columnContext.class);
    }

    public Constraint_columnContext constraint_column(int i) {
      return getRuleContext(Constraint_columnContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Constraint_column_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_constraint_column_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterConstraint_column_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitConstraint_column_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitConstraint_column_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Constraint_column_listContext constraint_column_list() throws RecognitionException {
    Constraint_column_listContext _localctx = new Constraint_column_listContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_constraint_column_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(490);
        constraint_column();
        setState(495);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(491);
              match(COMMA);
              setState(492);
              constraint_column();
            }
          }
          setState(497);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Constraint_columnContext extends ParserRuleContext {
    public Column_nameContext column_name() {
      return getRuleContext(Column_nameContext.class, 0);
    }

    public Asc_descContext asc_desc() {
      return getRuleContext(Asc_descContext.class, 0);
    }

    public TerminalNode ROW_TIMESTAMP() {
      return getToken(PhoenixParser.ROW_TIMESTAMP, 0);
    }

    public Constraint_columnContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_constraint_column;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterConstraint_column(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitConstraint_column(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitConstraint_column(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Constraint_columnContext constraint_column() throws RecognitionException {
    Constraint_columnContext _localctx = new Constraint_columnContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_constraint_column);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(498);
        column_name();
        setState(500);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ASC || _la == DESC) {
          {
            setState(499);
            asc_desc();
          }
        }

        setState(503);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ROW_TIMESTAMP) {
          {
            setState(502);
            match(ROW_TIMESTAMP);
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Constraint_nameContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class, 0);
    }

    public Constraint_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_constraint_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterConstraint_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitConstraint_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitConstraint_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Constraint_nameContext constraint_name() throws RecognitionException {
    Constraint_nameContext _localctx = new Constraint_nameContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_constraint_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(505);
        name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class New_table_refContext extends ParserRuleContext {
    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public New_table_refContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_new_table_ref;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterNew_table_ref(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitNew_table_ref(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitNew_table_ref(this);
      else return visitor.visitChildren(this);
    }
  }

  public final New_table_refContext new_table_ref() throws RecognitionException {
    New_table_refContext _localctx = new New_table_refContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_new_table_ref);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(507);
        table_ref();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Table_optionsContext extends ParserRuleContext {
    public Options_Context options_() {
      return getRuleContext(Options_Context.class, 0);
    }

    public Table_optionsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_table_options;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterTable_options(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitTable_options(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitTable_options(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Table_optionsContext table_options() throws RecognitionException {
    Table_optionsContext _localctx = new Table_optionsContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_table_options);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(509);
        options_();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Existing_table_refContext extends ParserRuleContext {
    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public Existing_table_refContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_existing_table_ref;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterExisting_table_ref(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitExisting_table_ref(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitExisting_table_ref(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Existing_table_refContext existing_table_ref() throws RecognitionException {
    Existing_table_refContext _localctx = new Existing_table_refContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_existing_table_ref);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(511);
        table_ref();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Expression_asc_desc_listContext extends ParserRuleContext {
    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public List<Asc_descContext> asc_desc() {
      return getRuleContexts(Asc_descContext.class);
    }

    public Asc_descContext asc_desc(int i) {
      return getRuleContext(Asc_descContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Expression_asc_desc_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expression_asc_desc_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterExpression_asc_desc_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitExpression_asc_desc_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitExpression_asc_desc_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Expression_asc_desc_listContext expression_asc_desc_list()
      throws RecognitionException {
    Expression_asc_desc_listContext _localctx =
        new Expression_asc_desc_listContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_expression_asc_desc_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(513);
        expression(0);
        setState(515);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ASC || _la == DESC) {
          {
            setState(514);
            asc_desc();
          }
        }

        setState(524);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(517);
              match(COMMA);
              setState(518);
              expression(0);
              setState(520);
              _errHandler.sync(this);
              _la = _input.LA(1);
              if (_la == ASC || _la == DESC) {
                {
                  setState(519);
                  asc_desc();
                }
              }
            }
          }
          setState(526);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Split_point_listContext extends ParserRuleContext {
    public List<Split_pointContext> split_point() {
      return getRuleContexts(Split_pointContext.class);
    }

    public Split_pointContext split_point(int i) {
      return getRuleContext(Split_pointContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Split_point_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_split_point_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSplit_point_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSplit_point_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSplit_point_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Split_point_listContext split_point_list() throws RecognitionException {
    Split_point_listContext _localctx = new Split_point_listContext(_ctx, getState());
    enterRule(_localctx, 44, RULE_split_point_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(527);
        split_point();
        setState(532);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(528);
              match(COMMA);
              setState(529);
              split_point();
            }
          }
          setState(534);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Split_pointContext extends ParserRuleContext {
    public LiteralContext literal() {
      return getRuleContext(LiteralContext.class, 0);
    }

    public Bind_parameterContext bind_parameter() {
      return getRuleContext(Bind_parameterContext.class, 0);
    }

    public Split_pointContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_split_point;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSplit_point(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSplit_point(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSplit_point(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Split_pointContext split_point() throws RecognitionException {
    Split_pointContext _localctx = new Split_pointContext(_ctx, getState());
    enterRule(_localctx, 46, RULE_split_point);
    try {
      setState(537);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case FALSE:
        case NULL_:
        case TRUE:
        case MINUS:
        case STRING_LITERAL:
        case DECIMAL_LITERAL:
          enterOuterAlt(_localctx, 1);
          {
            setState(535);
            literal();
          }
          break;
        case COLON:
        case QM:
          enterOuterAlt(_localctx, 2);
          {
            setState(536);
            bind_parameter();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Index_optionsContext extends ParserRuleContext {
    public Options_listContext options_list() {
      return getRuleContext(Options_listContext.class, 0);
    }

    public Index_optionsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_index_options;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterIndex_options(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitIndex_options(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitIndex_options(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Index_optionsContext index_options() throws RecognitionException {
    Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
    enterRule(_localctx, 48, RULE_index_options);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(539);
        options_list();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Options_listContext extends ParserRuleContext {
    public List<Options_Context> options_() {
      return getRuleContexts(Options_Context.class);
    }

    public Options_Context options_(int i) {
      return getRuleContext(Options_Context.class, i);
    }

    public Options_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_options_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterOptions_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitOptions_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitOptions_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Options_listContext options_list() throws RecognitionException {
    Options_listContext _localctx = new Options_listContext(_ctx, getState());
    enterRule(_localctx, 50, RULE_options_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(542);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(541);
              options_();
            }
          }
          setState(544);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == DOUBLE_QUOTE_ID || _la == ID);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Options_Context extends ParserRuleContext {
    public List<OptionContext> option() {
      return getRuleContexts(OptionContext.class);
    }

    public OptionContext option(int i) {
      return getRuleContext(OptionContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Options_Context(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_options_;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterOptions_(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitOptions_(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitOptions_(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Options_Context options_() throws RecognitionException {
    Options_Context _localctx = new Options_Context(_ctx, getState());
    enterRule(_localctx, 52, RULE_options_);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(546);
        option();
        setState(551);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(547);
              match(COMMA);
              setState(548);
              option();
            }
          }
          setState(553);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class OptionContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class, 0);
    }

    public TerminalNode EQ() {
      return getToken(PhoenixParser.EQ, 0);
    }

    public LiteralContext literal() {
      return getRuleContext(LiteralContext.class, 0);
    }

    public Family_nameContext family_name() {
      return getRuleContext(Family_nameContext.class, 0);
    }

    public TerminalNode DOT() {
      return getToken(PhoenixParser.DOT, 0);
    }

    public OptionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_option;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterOption(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitOption(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitOption(this);
      else return visitor.visitChildren(this);
    }
  }

  public final OptionContext option() throws RecognitionException {
    OptionContext _localctx = new OptionContext(_ctx, getState());
    enterRule(_localctx, 54, RULE_option);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(557);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
          case 1:
            {
              setState(554);
              family_name();
              setState(555);
              match(DOT);
            }
            break;
        }
        setState(559);
        name();
        setState(560);
        match(EQ);
        setState(561);
        literal();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Func_argument_listContext extends ParserRuleContext {
    public List<Func_argumentContext> func_argument() {
      return getRuleContexts(Func_argumentContext.class);
    }

    public Func_argumentContext func_argument(int i) {
      return getRuleContext(Func_argumentContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Func_argument_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_func_argument_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterFunc_argument_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitFunc_argument_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitFunc_argument_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Func_argument_listContext func_argument_list() throws RecognitionException {
    Func_argument_listContext _localctx = new Func_argument_listContext(_ctx, getState());
    enterRule(_localctx, 56, RULE_func_argument_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(563);
        func_argument();
        setState(568);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(564);
              match(COMMA);
              setState(565);
              func_argument();
            }
          }
          setState(570);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Func_argumentContext extends ParserRuleContext {
    public Data_typeContext data_type() {
      return getRuleContext(Data_typeContext.class, 0);
    }

    public TerminalNode CONSTANT() {
      return getToken(PhoenixParser.CONSTANT, 0);
    }

    public TerminalNode DEFAULTVALUE() {
      return getToken(PhoenixParser.DEFAULTVALUE, 0);
    }

    public List<TerminalNode> EQ() {
      return getTokens(PhoenixParser.EQ);
    }

    public TerminalNode EQ(int i) {
      return getToken(PhoenixParser.EQ, i);
    }

    public List<StringContext> string() {
      return getRuleContexts(StringContext.class);
    }

    public StringContext string(int i) {
      return getRuleContext(StringContext.class, i);
    }

    public TerminalNode MINVALUE() {
      return getToken(PhoenixParser.MINVALUE, 0);
    }

    public TerminalNode MAXVALUE() {
      return getToken(PhoenixParser.MAXVALUE, 0);
    }

    public Func_argumentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_func_argument;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterFunc_argument(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitFunc_argument(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitFunc_argument(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Func_argumentContext func_argument() throws RecognitionException {
    Func_argumentContext _localctx = new Func_argumentContext(_ctx, getState());
    enterRule(_localctx, 58, RULE_func_argument);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(571);
        data_type();
        setState(573);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == CONSTANT) {
          {
            setState(572);
            match(CONSTANT);
          }
        }

        setState(578);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == DEFAULTVALUE) {
          {
            setState(575);
            match(DEFAULTVALUE);
            setState(576);
            match(EQ);
            setState(577);
            string();
          }
        }

        setState(583);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == MINVALUE) {
          {
            setState(580);
            match(MINVALUE);
            setState(581);
            match(EQ);
            setState(582);
            string();
          }
        }

        setState(588);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == MAXVALUE) {
          {
            setState(585);
            match(MAXVALUE);
            setState(586);
            match(EQ);
            setState(587);
            string();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Class_nameContext extends ParserRuleContext {
    public StringContext string() {
      return getRuleContext(StringContext.class, 0);
    }

    public Class_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_class_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterClass_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitClass_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitClass_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Class_nameContext class_name() throws RecognitionException {
    Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
    enterRule(_localctx, 60, RULE_class_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(590);
        string();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Jar_pathContext extends ParserRuleContext {
    public StringContext string() {
      return getRuleContext(StringContext.class, 0);
    }

    public Jar_pathContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_jar_path;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterJar_path(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitJar_path(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitJar_path(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Jar_pathContext jar_path() throws RecognitionException {
    Jar_pathContext _localctx = new Jar_pathContext(_ctx, getState());
    enterRule(_localctx, 62, RULE_jar_path);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(592);
        string();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Drop_table_commandContext extends ParserRuleContext {
    public TerminalNode DROP() {
      return getToken(PhoenixParser.DROP, 0);
    }

    public TerminalNode TABLE() {
      return getToken(PhoenixParser.TABLE, 0);
    }

    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public If_existsContext if_exists() {
      return getRuleContext(If_existsContext.class, 0);
    }

    public TerminalNode CASCADE() {
      return getToken(PhoenixParser.CASCADE, 0);
    }

    public Drop_table_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_drop_table_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDrop_table_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDrop_table_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDrop_table_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Drop_table_commandContext drop_table_command() throws RecognitionException {
    Drop_table_commandContext _localctx = new Drop_table_commandContext(_ctx, getState());
    enterRule(_localctx, 64, RULE_drop_table_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(594);
        match(DROP);
        setState(595);
        match(TABLE);
        setState(597);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(596);
            if_exists();
          }
        }

        setState(599);
        table_ref();
        setState(601);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == CASCADE) {
          {
            setState(600);
            match(CASCADE);
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Drop_view_commandContext extends ParserRuleContext {
    public TerminalNode DROP() {
      return getToken(PhoenixParser.DROP, 0);
    }

    public TerminalNode VIEW() {
      return getToken(PhoenixParser.VIEW, 0);
    }

    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public If_existsContext if_exists() {
      return getRuleContext(If_existsContext.class, 0);
    }

    public TerminalNode CASCADE() {
      return getToken(PhoenixParser.CASCADE, 0);
    }

    public Drop_view_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_drop_view_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDrop_view_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDrop_view_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDrop_view_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Drop_view_commandContext drop_view_command() throws RecognitionException {
    Drop_view_commandContext _localctx = new Drop_view_commandContext(_ctx, getState());
    enterRule(_localctx, 66, RULE_drop_view_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(603);
        match(DROP);
        setState(604);
        match(VIEW);
        setState(606);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(605);
            if_exists();
          }
        }

        setState(608);
        table_ref();
        setState(610);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == CASCADE) {
          {
            setState(609);
            match(CASCADE);
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Drop_schema_commandContext extends ParserRuleContext {
    public TerminalNode DROP() {
      return getToken(PhoenixParser.DROP, 0);
    }

    public TerminalNode SCHEMA() {
      return getToken(PhoenixParser.SCHEMA, 0);
    }

    public Schema_nameContext schema_name() {
      return getRuleContext(Schema_nameContext.class, 0);
    }

    public If_existsContext if_exists() {
      return getRuleContext(If_existsContext.class, 0);
    }

    public Drop_schema_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_drop_schema_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDrop_schema_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDrop_schema_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDrop_schema_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Drop_schema_commandContext drop_schema_command() throws RecognitionException {
    Drop_schema_commandContext _localctx = new Drop_schema_commandContext(_ctx, getState());
    enterRule(_localctx, 68, RULE_drop_schema_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(612);
        match(DROP);
        setState(613);
        match(SCHEMA);
        setState(615);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(614);
            if_exists();
          }
        }

        setState(617);
        schema_name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Drop_sequence_commandContext extends ParserRuleContext {
    public TerminalNode DROP() {
      return getToken(PhoenixParser.DROP, 0);
    }

    public TerminalNode SEQUENCE() {
      return getToken(PhoenixParser.SEQUENCE, 0);
    }

    public Sequence_refContext sequence_ref() {
      return getRuleContext(Sequence_refContext.class, 0);
    }

    public If_existsContext if_exists() {
      return getRuleContext(If_existsContext.class, 0);
    }

    public Drop_sequence_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_drop_sequence_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDrop_sequence_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDrop_sequence_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDrop_sequence_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Drop_sequence_commandContext drop_sequence_command() throws RecognitionException {
    Drop_sequence_commandContext _localctx = new Drop_sequence_commandContext(_ctx, getState());
    enterRule(_localctx, 70, RULE_drop_sequence_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(619);
        match(DROP);
        setState(620);
        match(SEQUENCE);
        setState(622);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(621);
            if_exists();
          }
        }

        setState(624);
        sequence_ref();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Drop_index_commandContext extends ParserRuleContext {
    public TerminalNode DROP() {
      return getToken(PhoenixParser.DROP, 0);
    }

    public TerminalNode INDEX() {
      return getToken(PhoenixParser.INDEX, 0);
    }

    public Index_nameContext index_name() {
      return getRuleContext(Index_nameContext.class, 0);
    }

    public TerminalNode ON() {
      return getToken(PhoenixParser.ON, 0);
    }

    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public If_existsContext if_exists() {
      return getRuleContext(If_existsContext.class, 0);
    }

    public Drop_index_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_drop_index_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDrop_index_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDrop_index_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDrop_index_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Drop_index_commandContext drop_index_command() throws RecognitionException {
    Drop_index_commandContext _localctx = new Drop_index_commandContext(_ctx, getState());
    enterRule(_localctx, 72, RULE_drop_index_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(626);
        match(DROP);
        setState(627);
        match(INDEX);
        setState(629);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(628);
            if_exists();
          }
        }

        setState(631);
        index_name();
        setState(632);
        match(ON);
        setState(633);
        table_ref();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Drop_function_commandContext extends ParserRuleContext {
    public TerminalNode DROP() {
      return getToken(PhoenixParser.DROP, 0);
    }

    public TerminalNode FUNCTION() {
      return getToken(PhoenixParser.FUNCTION, 0);
    }

    public Func_nameContext func_name() {
      return getRuleContext(Func_nameContext.class, 0);
    }

    public If_existsContext if_exists() {
      return getRuleContext(If_existsContext.class, 0);
    }

    public Drop_function_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_drop_function_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDrop_function_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDrop_function_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDrop_function_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Drop_function_commandContext drop_function_command() throws RecognitionException {
    Drop_function_commandContext _localctx = new Drop_function_commandContext(_ctx, getState());
    enterRule(_localctx, 74, RULE_drop_function_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(635);
        match(DROP);
        setState(636);
        match(FUNCTION);
        setState(638);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == IF) {
          {
            setState(637);
            if_exists();
          }
        }

        setState(640);
        func_name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Index_nameContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class, 0);
    }

    public Index_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_index_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterIndex_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitIndex_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitIndex_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Index_nameContext index_name() throws RecognitionException {
    Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
    enterRule(_localctx, 76, RULE_index_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(642);
        name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Func_nameContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class, 0);
    }

    public Func_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_func_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterFunc_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitFunc_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitFunc_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Func_nameContext func_name() throws RecognitionException {
    Func_nameContext _localctx = new Func_nameContext(_ctx, getState());
    enterRule(_localctx, 78, RULE_func_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(644);
        name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class If_existsContext extends ParserRuleContext {
    public TerminalNode IF() {
      return getToken(PhoenixParser.IF, 0);
    }

    public TerminalNode EXISTS() {
      return getToken(PhoenixParser.EXISTS, 0);
    }

    public If_existsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_if_exists;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterIf_exists(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitIf_exists(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitIf_exists(this);
      else return visitor.visitChildren(this);
    }
  }

  public final If_existsContext if_exists() throws RecognitionException {
    If_existsContext _localctx = new If_existsContext(_ctx, getState());
    enterRule(_localctx, 80, RULE_if_exists);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(646);
        match(IF);
        setState(647);
        match(EXISTS);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class If_not_existsContext extends ParserRuleContext {
    public TerminalNode IF() {
      return getToken(PhoenixParser.IF, 0);
    }

    public TerminalNode NOT() {
      return getToken(PhoenixParser.NOT, 0);
    }

    public TerminalNode EXISTS() {
      return getToken(PhoenixParser.EXISTS, 0);
    }

    public If_not_existsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_if_not_exists;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterIf_not_exists(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitIf_not_exists(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitIf_not_exists(this);
      else return visitor.visitChildren(this);
    }
  }

  public final If_not_existsContext if_not_exists() throws RecognitionException {
    If_not_existsContext _localctx = new If_not_existsContext(_ctx, getState());
    enterRule(_localctx, 82, RULE_if_not_exists);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(649);
        match(IF);
        setState(650);
        match(NOT);
        setState(651);
        match(EXISTS);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Table_refContext extends ParserRuleContext {
    public Table_nameContext table_name() {
      return getRuleContext(Table_nameContext.class, 0);
    }

    public Schema_nameContext schema_name() {
      return getRuleContext(Schema_nameContext.class, 0);
    }

    public TerminalNode DOT() {
      return getToken(PhoenixParser.DOT, 0);
    }

    public Table_refContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_table_ref;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterTable_ref(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitTable_ref(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitTable_ref(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Table_refContext table_ref() throws RecognitionException {
    Table_refContext _localctx = new Table_refContext(_ctx, getState());
    enterRule(_localctx, 84, RULE_table_ref);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(656);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 63, _ctx)) {
          case 1:
            {
              setState(653);
              schema_name();
              setState(654);
              match(DOT);
            }
            break;
        }
        setState(658);
        table_name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Use_commandContext extends ParserRuleContext {
    public TerminalNode USE() {
      return getToken(PhoenixParser.USE, 0);
    }

    public Schema_nameContext schema_name() {
      return getRuleContext(Schema_nameContext.class, 0);
    }

    public TerminalNode DEFAULT() {
      return getToken(PhoenixParser.DEFAULT, 0);
    }

    public Use_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_use_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterUse_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitUse_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitUse_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Use_commandContext use_command() throws RecognitionException {
    Use_commandContext _localctx = new Use_commandContext(_ctx, getState());
    enterRule(_localctx, 86, RULE_use_command);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(660);
        match(USE);
        setState(663);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case DOUBLE_QUOTE_ID:
          case ID:
            {
              setState(661);
              schema_name();
            }
            break;
          case DEFAULT:
            {
              setState(662);
              match(DEFAULT);
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Explain_commandContext extends ParserRuleContext {
    public TerminalNode EXPLAIN() {
      return getToken(PhoenixParser.EXPLAIN, 0);
    }

    public Select_commandContext select_command() {
      return getRuleContext(Select_commandContext.class, 0);
    }

    public Upsert_select_commandContext upsert_select_command() {
      return getRuleContext(Upsert_select_commandContext.class, 0);
    }

    public Delete_commandContext delete_command() {
      return getRuleContext(Delete_commandContext.class, 0);
    }

    public Explain_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_explain_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterExplain_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitExplain_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitExplain_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Explain_commandContext explain_command() throws RecognitionException {
    Explain_commandContext _localctx = new Explain_commandContext(_ctx, getState());
    enterRule(_localctx, 88, RULE_explain_command);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(665);
        match(EXPLAIN);
        setState(669);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case SELECT:
            {
              setState(666);
              select_command();
            }
            break;
          case UPSERT:
            {
              setState(667);
              upsert_select_command();
            }
            break;
          case DELETE:
            {
              setState(668);
              delete_command();
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Update_statistics_commandContext extends ParserRuleContext {
    public TerminalNode UPDATE() {
      return getToken(PhoenixParser.UPDATE, 0);
    }

    public TerminalNode STATISTICS() {
      return getToken(PhoenixParser.STATISTICS, 0);
    }

    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public TerminalNode SET() {
      return getToken(PhoenixParser.SET, 0);
    }

    public Guide_post_optionsContext guide_post_options() {
      return getRuleContext(Guide_post_optionsContext.class, 0);
    }

    public TerminalNode ALL() {
      return getToken(PhoenixParser.ALL, 0);
    }

    public TerminalNode INDEX() {
      return getToken(PhoenixParser.INDEX, 0);
    }

    public TerminalNode COLUMN() {
      return getToken(PhoenixParser.COLUMN, 0);
    }

    public Update_statistics_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_update_statistics_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterUpdate_statistics_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitUpdate_statistics_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitUpdate_statistics_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Update_statistics_commandContext update_statistics_command()
      throws RecognitionException {
    Update_statistics_commandContext _localctx =
        new Update_statistics_commandContext(_ctx, getState());
    enterRule(_localctx, 90, RULE_update_statistics_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(671);
        match(UPDATE);
        setState(672);
        match(STATISTICS);
        setState(673);
        table_ref();
        setState(675);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & 4611686018428436481L) != 0)) {
          {
            setState(674);
            _la = _input.LA(1);
            if (!(((((_la - 2)) & ~0x3f) == 0
                && ((1L << (_la - 2)) & 4611686018428436481L) != 0))) {
              _errHandler.recoverInline(this);
            } else {
              if (_input.LA(1) == Token.EOF) matchedEOF = true;
              _errHandler.reportMatch(this);
              consume();
            }
          }
        }

        setState(679);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == SET) {
          {
            setState(677);
            match(SET);
            setState(678);
            guide_post_options();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Declare_cursor_commandContext extends ParserRuleContext {
    public TerminalNode DECLARE() {
      return getToken(PhoenixParser.DECLARE, 0);
    }

    public TerminalNode CURSOR() {
      return getToken(PhoenixParser.CURSOR, 0);
    }

    public Cursor_nameContext cursor_name() {
      return getRuleContext(Cursor_nameContext.class, 0);
    }

    public TerminalNode FOR() {
      return getToken(PhoenixParser.FOR, 0);
    }

    public Select_statementContext select_statement() {
      return getRuleContext(Select_statementContext.class, 0);
    }

    public Declare_cursor_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_declare_cursor_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDeclare_cursor_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDeclare_cursor_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDeclare_cursor_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Declare_cursor_commandContext declare_cursor_command() throws RecognitionException {
    Declare_cursor_commandContext _localctx = new Declare_cursor_commandContext(_ctx, getState());
    enterRule(_localctx, 92, RULE_declare_cursor_command);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(681);
        match(DECLARE);
        setState(682);
        match(CURSOR);
        setState(683);
        cursor_name();
        setState(684);
        match(FOR);
        setState(685);
        select_statement();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Open_cursor_commandContext extends ParserRuleContext {
    public TerminalNode OPEN() {
      return getToken(PhoenixParser.OPEN, 0);
    }

    public TerminalNode CURSOR() {
      return getToken(PhoenixParser.CURSOR, 0);
    }

    public Cursor_nameContext cursor_name() {
      return getRuleContext(Cursor_nameContext.class, 0);
    }

    public Open_cursor_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_open_cursor_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterOpen_cursor_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitOpen_cursor_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitOpen_cursor_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Open_cursor_commandContext open_cursor_command() throws RecognitionException {
    Open_cursor_commandContext _localctx = new Open_cursor_commandContext(_ctx, getState());
    enterRule(_localctx, 94, RULE_open_cursor_command);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(687);
        match(OPEN);
        setState(688);
        match(CURSOR);
        setState(689);
        cursor_name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Fetch_next_commandContext extends ParserRuleContext {
    public TerminalNode FETCH() {
      return getToken(PhoenixParser.FETCH, 0);
    }

    public TerminalNode NEXT() {
      return getToken(PhoenixParser.NEXT, 0);
    }

    public TerminalNode FROM() {
      return getToken(PhoenixParser.FROM, 0);
    }

    public Cursor_nameContext cursor_name() {
      return getRuleContext(Cursor_nameContext.class, 0);
    }

    public NumberContext number() {
      return getRuleContext(NumberContext.class, 0);
    }

    public TerminalNode ROWS() {
      return getToken(PhoenixParser.ROWS, 0);
    }

    public Fetch_next_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_fetch_next_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterFetch_next_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitFetch_next_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitFetch_next_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Fetch_next_commandContext fetch_next_command() throws RecognitionException {
    Fetch_next_commandContext _localctx = new Fetch_next_commandContext(_ctx, getState());
    enterRule(_localctx, 96, RULE_fetch_next_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(691);
        match(FETCH);
        setState(692);
        match(NEXT);
        setState(696);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == DECIMAL_LITERAL) {
          {
            setState(693);
            number();
            setState(694);
            match(ROWS);
          }
        }

        setState(698);
        match(FROM);
        setState(699);
        cursor_name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Close_commandContext extends ParserRuleContext {
    public TerminalNode CLOSE() {
      return getToken(PhoenixParser.CLOSE, 0);
    }

    public Cursor_nameContext cursor_name() {
      return getRuleContext(Cursor_nameContext.class, 0);
    }

    public Close_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_close_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterClose_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitClose_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitClose_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Close_commandContext close_command() throws RecognitionException {
    Close_commandContext _localctx = new Close_commandContext(_ctx, getState());
    enterRule(_localctx, 98, RULE_close_command);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(701);
        match(CLOSE);
        setState(702);
        cursor_name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Grant_commandContext extends ParserRuleContext {
    public TerminalNode GRANT() {
      return getToken(PhoenixParser.GRANT, 0);
    }

    public Permission_stringContext permission_string() {
      return getRuleContext(Permission_stringContext.class, 0);
    }

    public TerminalNode TO() {
      return getToken(PhoenixParser.TO, 0);
    }

    public User_stringContext user_string() {
      return getRuleContext(User_stringContext.class, 0);
    }

    public On_schema_tableContext on_schema_table() {
      return getRuleContext(On_schema_tableContext.class, 0);
    }

    public TerminalNode GROUP() {
      return getToken(PhoenixParser.GROUP, 0);
    }

    public Grant_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_grant_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterGrant_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitGrant_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitGrant_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Grant_commandContext grant_command() throws RecognitionException {
    Grant_commandContext _localctx = new Grant_commandContext(_ctx, getState());
    enterRule(_localctx, 100, RULE_grant_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(704);
        match(GRANT);
        setState(705);
        permission_string();
        setState(707);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ON) {
          {
            setState(706);
            on_schema_table();
          }
        }

        setState(709);
        match(TO);
        setState(711);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == GROUP) {
          {
            setState(710);
            match(GROUP);
          }
        }

        setState(713);
        user_string();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Revoke_commandContext extends ParserRuleContext {
    public TerminalNode REVOKE() {
      return getToken(PhoenixParser.REVOKE, 0);
    }

    public TerminalNode FROM() {
      return getToken(PhoenixParser.FROM, 0);
    }

    public User_stringContext user_string() {
      return getRuleContext(User_stringContext.class, 0);
    }

    public On_schema_tableContext on_schema_table() {
      return getRuleContext(On_schema_tableContext.class, 0);
    }

    public TerminalNode GROUP() {
      return getToken(PhoenixParser.GROUP, 0);
    }

    public Revoke_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_revoke_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterRevoke_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitRevoke_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitRevoke_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Revoke_commandContext revoke_command() throws RecognitionException {
    Revoke_commandContext _localctx = new Revoke_commandContext(_ctx, getState());
    enterRule(_localctx, 102, RULE_revoke_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(715);
        match(REVOKE);
        setState(717);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ON) {
          {
            setState(716);
            on_schema_table();
          }
        }

        setState(719);
        match(FROM);
        setState(721);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == GROUP) {
          {
            setState(720);
            match(GROUP);
          }
        }

        setState(723);
        user_string();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class On_schema_tableContext extends ParserRuleContext {
    public TerminalNode ON() {
      return getToken(PhoenixParser.ON, 0);
    }

    public TerminalNode SCHEMA() {
      return getToken(PhoenixParser.SCHEMA, 0);
    }

    public Schema_nameContext schema_name() {
      return getRuleContext(Schema_nameContext.class, 0);
    }

    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public On_schema_tableContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_on_schema_table;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterOn_schema_table(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitOn_schema_table(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitOn_schema_table(this);
      else return visitor.visitChildren(this);
    }
  }

  public final On_schema_tableContext on_schema_table() throws RecognitionException {
    On_schema_tableContext _localctx = new On_schema_tableContext(_ctx, getState());
    enterRule(_localctx, 104, RULE_on_schema_table);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(725);
        match(ON);
        setState(729);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case SCHEMA:
            {
              setState(726);
              match(SCHEMA);
              setState(727);
              schema_name();
            }
            break;
          case DOUBLE_QUOTE_ID:
          case ID:
            {
              setState(728);
              table_ref();
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Permission_stringContext extends ParserRuleContext {
    public StringContext string() {
      return getRuleContext(StringContext.class, 0);
    }

    public Permission_stringContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_permission_string;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterPermission_string(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitPermission_string(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitPermission_string(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Permission_stringContext permission_string() throws RecognitionException {
    Permission_stringContext _localctx = new Permission_stringContext(_ctx, getState());
    enterRule(_localctx, 106, RULE_permission_string);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(731);
        string();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class User_stringContext extends ParserRuleContext {
    public StringContext string() {
      return getRuleContext(StringContext.class, 0);
    }

    public User_stringContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_user_string;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterUser_string(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitUser_string(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitUser_string(this);
      else return visitor.visitChildren(this);
    }
  }

  public final User_stringContext user_string() throws RecognitionException {
    User_stringContext _localctx = new User_stringContext(_ctx, getState());
    enterRule(_localctx, 108, RULE_user_string);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(733);
        string();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Cursor_nameContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class, 0);
    }

    public Cursor_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_cursor_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterCursor_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitCursor_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitCursor_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Cursor_nameContext cursor_name() throws RecognitionException {
    Cursor_nameContext _localctx = new Cursor_nameContext(_ctx, getState());
    enterRule(_localctx, 110, RULE_cursor_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(735);
        name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Guide_post_optionsContext extends ParserRuleContext {
    public List<NameContext> name() {
      return getRuleContexts(NameContext.class);
    }

    public NameContext name(int i) {
      return getRuleContext(NameContext.class, i);
    }

    public List<TerminalNode> EQ() {
      return getTokens(PhoenixParser.EQ);
    }

    public TerminalNode EQ(int i) {
      return getToken(PhoenixParser.EQ, i);
    }

    public List<LiteralContext> literal() {
      return getRuleContexts(LiteralContext.class);
    }

    public LiteralContext literal(int i) {
      return getRuleContext(LiteralContext.class, i);
    }

    public Family_nameContext family_name() {
      return getRuleContext(Family_nameContext.class, 0);
    }

    public TerminalNode DOT() {
      return getToken(PhoenixParser.DOT, 0);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Guide_post_optionsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_guide_post_options;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterGuide_post_options(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitGuide_post_options(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitGuide_post_options(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Guide_post_optionsContext guide_post_options() throws RecognitionException {
    Guide_post_optionsContext _localctx = new Guide_post_optionsContext(_ctx, getState());
    enterRule(_localctx, 112, RULE_guide_post_options);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(740);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
          case 1:
            {
              setState(737);
              family_name();
              setState(738);
              match(DOT);
            }
            break;
        }
        setState(742);
        name();
        setState(743);
        match(EQ);
        setState(744);
        literal();
        setState(752);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(745);
              match(COMMA);
              setState(746);
              name();
              setState(747);
              match(EQ);
              setState(748);
              literal();
            }
          }
          setState(754);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Upsert_values_commandContext extends ParserRuleContext {
    public TerminalNode UPSERT() {
      return getToken(PhoenixParser.UPSERT, 0);
    }

    public TerminalNode INTO() {
      return getToken(PhoenixParser.INTO, 0);
    }

    public Table_nameContext table_name() {
      return getRuleContext(Table_nameContext.class, 0);
    }

    public TerminalNode VALUES() {
      return getToken(PhoenixParser.VALUES, 0);
    }

    public List<TerminalNode> LP() {
      return getTokens(PhoenixParser.LP);
    }

    public TerminalNode LP(int i) {
      return getToken(PhoenixParser.LP, i);
    }

    public List<LiteralContext> literal() {
      return getRuleContexts(LiteralContext.class);
    }

    public LiteralContext literal(int i) {
      return getRuleContext(LiteralContext.class, i);
    }

    public List<TerminalNode> RP() {
      return getTokens(PhoenixParser.RP);
    }

    public TerminalNode RP(int i) {
      return getToken(PhoenixParser.RP, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public TerminalNode ON() {
      return getToken(PhoenixParser.ON, 0);
    }

    public TerminalNode DUPLICATE() {
      return getToken(PhoenixParser.DUPLICATE, 0);
    }

    public TerminalNode KEY() {
      return getToken(PhoenixParser.KEY, 0);
    }

    public Column_ref_listContext column_ref_list() {
      return getRuleContext(Column_ref_listContext.class, 0);
    }

    public Column_def_listContext column_def_list() {
      return getRuleContext(Column_def_listContext.class, 0);
    }

    public TerminalNode IGNORE() {
      return getToken(PhoenixParser.IGNORE, 0);
    }

    public TerminalNode UPDATE() {
      return getToken(PhoenixParser.UPDATE, 0);
    }

    public Column_refContext column_ref() {
      return getRuleContext(Column_refContext.class, 0);
    }

    public TerminalNode EQ() {
      return getToken(PhoenixParser.EQ, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public Upsert_values_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_upsert_values_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterUpsert_values_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitUpsert_values_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitUpsert_values_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Upsert_values_commandContext upsert_values_command() throws RecognitionException {
    Upsert_values_commandContext _localctx = new Upsert_values_commandContext(_ctx, getState());
    enterRule(_localctx, 114, RULE_upsert_values_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(755);
        match(UPSERT);
        setState(756);
        match(INTO);
        setState(757);
        table_name();
        setState(765);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == LP) {
          {
            setState(758);
            match(LP);
            setState(761);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 76, _ctx)) {
              case 1:
                {
                  setState(759);
                  column_ref_list();
                }
                break;
              case 2:
                {
                  setState(760);
                  column_def_list();
                }
                break;
            }
            setState(763);
            match(RP);
          }
        }

        setState(767);
        match(VALUES);
        setState(768);
        match(LP);
        setState(769);
        literal();
        setState(774);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(770);
              match(COMMA);
              setState(771);
              literal();
            }
          }
          setState(776);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(777);
        match(RP);
        setState(789);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ON) {
          {
            setState(778);
            match(ON);
            setState(779);
            match(DUPLICATE);
            setState(780);
            match(KEY);
            setState(787);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
              case IGNORE:
                {
                  setState(781);
                  match(IGNORE);
                }
                break;
              case UPDATE:
                {
                  setState(782);
                  match(UPDATE);
                  setState(783);
                  column_ref();
                  setState(784);
                  match(EQ);
                  setState(785);
                  expression(0);
                }
                break;
              default:
                throw new NoViableAltException(this);
            }
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Column_ref_listContext extends ParserRuleContext {
    public List<Column_refContext> column_ref() {
      return getRuleContexts(Column_refContext.class);
    }

    public Column_refContext column_ref(int i) {
      return getRuleContext(Column_refContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Column_ref_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_column_ref_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterColumn_ref_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitColumn_ref_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitColumn_ref_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Column_ref_listContext column_ref_list() throws RecognitionException {
    Column_ref_listContext _localctx = new Column_ref_listContext(_ctx, getState());
    enterRule(_localctx, 116, RULE_column_ref_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(791);
        column_ref();
        setState(796);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(792);
              match(COMMA);
              setState(793);
              column_ref();
            }
          }
          setState(798);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Column_def_listContext extends ParserRuleContext {
    public List<Column_defContext> column_def() {
      return getRuleContexts(Column_defContext.class);
    }

    public Column_defContext column_def(int i) {
      return getRuleContext(Column_defContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Column_def_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_column_def_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterColumn_def_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitColumn_def_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitColumn_def_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Column_def_listContext column_def_list() throws RecognitionException {
    Column_def_listContext _localctx = new Column_def_listContext(_ctx, getState());
    enterRule(_localctx, 118, RULE_column_def_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(799);
        column_def();
        setState(804);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(800);
              match(COMMA);
              setState(801);
              column_def();
            }
          }
          setState(806);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Upsert_select_commandContext extends ParserRuleContext {
    public TerminalNode UPSERT() {
      return getToken(PhoenixParser.UPSERT, 0);
    }

    public TerminalNode INTO() {
      return getToken(PhoenixParser.INTO, 0);
    }

    public Table_nameContext table_name() {
      return getRuleContext(Table_nameContext.class, 0);
    }

    public Select_commandContext select_command() {
      return getRuleContext(Select_commandContext.class, 0);
    }

    public HintContext hint() {
      return getRuleContext(HintContext.class, 0);
    }

    public TerminalNode LP() {
      return getToken(PhoenixParser.LP, 0);
    }

    public TerminalNode RP() {
      return getToken(PhoenixParser.RP, 0);
    }

    public Column_ref_listContext column_ref_list() {
      return getRuleContext(Column_ref_listContext.class, 0);
    }

    public Column_def_listContext column_def_list() {
      return getRuleContext(Column_def_listContext.class, 0);
    }

    public Upsert_select_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_upsert_select_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterUpsert_select_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitUpsert_select_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitUpsert_select_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Upsert_select_commandContext upsert_select_command() throws RecognitionException {
    Upsert_select_commandContext _localctx = new Upsert_select_commandContext(_ctx, getState());
    enterRule(_localctx, 120, RULE_upsert_select_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(807);
        match(UPSERT);
        setState(809);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == HINT_START) {
          {
            setState(808);
            hint();
          }
        }

        setState(811);
        match(INTO);
        setState(812);
        table_name();
        setState(820);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == LP) {
          {
            setState(813);
            match(LP);
            setState(816);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 84, _ctx)) {
              case 1:
                {
                  setState(814);
                  column_ref_list();
                }
                break;
              case 2:
                {
                  setState(815);
                  column_def_list();
                }
                break;
            }
            setState(818);
            match(RP);
          }
        }

        setState(822);
        select_command();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Delete_commandContext extends ParserRuleContext {
    public TerminalNode DELETE() {
      return getToken(PhoenixParser.DELETE, 0);
    }

    public TerminalNode FROM() {
      return getToken(PhoenixParser.FROM, 0);
    }

    public Table_nameContext table_name() {
      return getRuleContext(Table_nameContext.class, 0);
    }

    public HintContext hint() {
      return getRuleContext(HintContext.class, 0);
    }

    public Where_clauseContext where_clause() {
      return getRuleContext(Where_clauseContext.class, 0);
    }

    public Order_by_clauseContext order_by_clause() {
      return getRuleContext(Order_by_clauseContext.class, 0);
    }

    public Limit_clauseContext limit_clause() {
      return getRuleContext(Limit_clauseContext.class, 0);
    }

    public Delete_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_delete_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDelete_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDelete_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDelete_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Delete_commandContext delete_command() throws RecognitionException {
    Delete_commandContext _localctx = new Delete_commandContext(_ctx, getState());
    enterRule(_localctx, 122, RULE_delete_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(824);
        match(DELETE);
        setState(826);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == HINT_START) {
          {
            setState(825);
            hint();
          }
        }

        setState(828);
        match(FROM);
        setState(829);
        table_name();
        setState(831);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == WHERE) {
          {
            setState(830);
            where_clause();
          }
        }

        setState(834);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ORDER) {
          {
            setState(833);
            order_by_clause();
          }
        }

        setState(837);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == LIMIT) {
          {
            setState(836);
            limit_clause();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Order_by_clauseContext extends ParserRuleContext {
    public TerminalNode ORDER() {
      return getToken(PhoenixParser.ORDER, 0);
    }

    public TerminalNode BY() {
      return getToken(PhoenixParser.BY, 0);
    }

    public Order_listContext order_list() {
      return getRuleContext(Order_listContext.class, 0);
    }

    public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_order_by_clause;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterOrder_by_clause(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitOrder_by_clause(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitOrder_by_clause(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Order_by_clauseContext order_by_clause() throws RecognitionException {
    Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
    enterRule(_localctx, 124, RULE_order_by_clause);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(839);
        match(ORDER);
        setState(840);
        match(BY);
        setState(841);
        order_list();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Limit_clauseContext extends ParserRuleContext {
    public TerminalNode LIMIT() {
      return getToken(PhoenixParser.LIMIT, 0);
    }

    public Bind_parameter_numberContext bind_parameter_number() {
      return getRuleContext(Bind_parameter_numberContext.class, 0);
    }

    public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_limit_clause;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterLimit_clause(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitLimit_clause(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitLimit_clause(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Limit_clauseContext limit_clause() throws RecognitionException {
    Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
    enterRule(_localctx, 126, RULE_limit_clause);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(843);
        match(LIMIT);
        setState(844);
        bind_parameter_number();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Order_listContext extends ParserRuleContext {
    public List<OrderContext> order() {
      return getRuleContexts(OrderContext.class);
    }

    public OrderContext order(int i) {
      return getRuleContext(OrderContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Order_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_order_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterOrder_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitOrder_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitOrder_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Order_listContext order_list() throws RecognitionException {
    Order_listContext _localctx = new Order_listContext(_ctx, getState());
    enterRule(_localctx, 128, RULE_order_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(846);
        order();
        setState(851);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(847);
              match(COMMA);
              setState(848);
              order();
            }
          }
          setState(853);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Where_clauseContext extends ParserRuleContext {
    public TerminalNode WHERE() {
      return getToken(PhoenixParser.WHERE, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public Where_clauseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_where_clause;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterWhere_clause(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitWhere_clause(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitWhere_clause(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Where_clauseContext where_clause() throws RecognitionException {
    Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
    enterRule(_localctx, 130, RULE_where_clause);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(854);
        match(WHERE);
        setState(855);
        expression(0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Select_commandContext extends ParserRuleContext {
    public Select_statementContext select_statement() {
      return getRuleContext(Select_statementContext.class, 0);
    }

    public Union_listContext union_list() {
      return getRuleContext(Union_listContext.class, 0);
    }

    public Order_by_clauseContext order_by_clause() {
      return getRuleContext(Order_by_clauseContext.class, 0);
    }

    public Limit_clauseContext limit_clause() {
      return getRuleContext(Limit_clauseContext.class, 0);
    }

    public TerminalNode OFFSET() {
      return getToken(PhoenixParser.OFFSET, 0);
    }

    public List<Bind_parameter_numberContext> bind_parameter_number() {
      return getRuleContexts(Bind_parameter_numberContext.class);
    }

    public Bind_parameter_numberContext bind_parameter_number(int i) {
      return getRuleContext(Bind_parameter_numberContext.class, i);
    }

    public TerminalNode FETCH() {
      return getToken(PhoenixParser.FETCH, 0);
    }

    public First_nextContext first_next() {
      return getRuleContext(First_nextContext.class, 0);
    }

    public TerminalNode ONLY() {
      return getToken(PhoenixParser.ONLY, 0);
    }

    public List<Row_rowsContext> row_rows() {
      return getRuleContexts(Row_rowsContext.class);
    }

    public Row_rowsContext row_rows(int i) {
      return getRuleContext(Row_rowsContext.class, i);
    }

    public Select_commandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_select_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSelect_command(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSelect_command(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSelect_command(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Select_commandContext select_command() throws RecognitionException {
    Select_commandContext _localctx = new Select_commandContext(_ctx, getState());
    enterRule(_localctx, 132, RULE_select_command);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(857);
        select_statement();
        setState(859);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == UNION) {
          {
            setState(858);
            union_list();
          }
        }

        setState(862);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ORDER) {
          {
            setState(861);
            order_by_clause();
          }
        }

        setState(865);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == LIMIT) {
          {
            setState(864);
            limit_clause();
          }
        }

        setState(872);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == OFFSET) {
          {
            setState(867);
            match(OFFSET);
            setState(868);
            bind_parameter_number();
            setState(870);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == ROW || _la == ROWS) {
              {
                setState(869);
                row_rows();
              }
            }
          }
        }

        setState(882);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 97, _ctx)) {
          case 1:
            {
              setState(874);
              match(FETCH);
              setState(875);
              first_next();
              setState(876);
              bind_parameter_number();
              setState(878);
              _errHandler.sync(this);
              _la = _input.LA(1);
              if (_la == ROW || _la == ROWS) {
                {
                  setState(877);
                  row_rows();
                }
              }

              setState(880);
              match(ONLY);
            }
            break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Select_statementContext extends ParserRuleContext {
    public TerminalNode SELECT() {
      return getToken(PhoenixParser.SELECT, 0);
    }

    public List<Select_expressionContext> select_expression() {
      return getRuleContexts(Select_expressionContext.class);
    }

    public Select_expressionContext select_expression(int i) {
      return getRuleContext(Select_expressionContext.class, i);
    }

    public TerminalNode FROM() {
      return getToken(PhoenixParser.FROM, 0);
    }

    public Table_specContext table_spec() {
      return getRuleContext(Table_specContext.class, 0);
    }

    public HintContext hint() {
      return getRuleContext(HintContext.class, 0);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Join_listContext join_list() {
      return getRuleContext(Join_listContext.class, 0);
    }

    public Where_clauseContext where_clause() {
      return getRuleContext(Where_clauseContext.class, 0);
    }

    public TerminalNode GROUP() {
      return getToken(PhoenixParser.GROUP, 0);
    }

    public TerminalNode BY() {
      return getToken(PhoenixParser.BY, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public TerminalNode HAVING() {
      return getToken(PhoenixParser.HAVING, 0);
    }

    public TerminalNode DISTINCT() {
      return getToken(PhoenixParser.DISTINCT, 0);
    }

    public TerminalNode ALL() {
      return getToken(PhoenixParser.ALL, 0);
    }

    public Select_statementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_select_statement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSelect_statement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSelect_statement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSelect_statement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Select_statementContext select_statement() throws RecognitionException {
    Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
    enterRule(_localctx, 134, RULE_select_statement);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(884);
        match(SELECT);
        setState(886);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == HINT_START) {
          {
            setState(885);
            hint();
          }
        }

        setState(889);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ALL || _la == DISTINCT) {
          {
            setState(888);
            _la = _input.LA(1);
            if (!(_la == ALL || _la == DISTINCT)) {
              _errHandler.recoverInline(this);
            } else {
              if (_input.LA(1) == Token.EOF) matchedEOF = true;
              _errHandler.reportMatch(this);
              consume();
            }
          }
        }

        setState(891);
        select_expression();
        setState(896);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(892);
              match(COMMA);
              setState(893);
              select_expression();
            }
          }
          setState(898);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(899);
        match(FROM);
        setState(900);
        table_spec();
        setState(902);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 8796093023265L) != 0)) {
          {
            setState(901);
            join_list();
          }
        }

        setState(905);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == WHERE) {
          {
            setState(904);
            where_clause();
          }
        }

        setState(917);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == GROUP) {
          {
            setState(907);
            match(GROUP);
            setState(908);
            match(BY);
            setState(909);
            expression(0);
            setState(914);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
              {
                {
                  setState(910);
                  match(COMMA);
                  setState(911);
                  expression(0);
                }
              }
              setState(916);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
        }

        setState(921);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == HAVING) {
          {
            setState(919);
            match(HAVING);
            setState(920);
            expression(0);
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Union_listContext extends ParserRuleContext {
    public List<UnionContext> union() {
      return getRuleContexts(UnionContext.class);
    }

    public UnionContext union(int i) {
      return getRuleContext(UnionContext.class, i);
    }

    public Union_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_union_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterUnion_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitUnion_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitUnion_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Union_listContext union_list() throws RecognitionException {
    Union_listContext _localctx = new Union_listContext(_ctx, getState());
    enterRule(_localctx, 136, RULE_union_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(924);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(923);
              union();
            }
          }
          setState(926);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == UNION);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class UnionContext extends ParserRuleContext {
    public TerminalNode UNION() {
      return getToken(PhoenixParser.UNION, 0);
    }

    public TerminalNode ALL() {
      return getToken(PhoenixParser.ALL, 0);
    }

    public Select_statementContext select_statement() {
      return getRuleContext(Select_statementContext.class, 0);
    }

    public UnionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_union;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterUnion(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitUnion(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitUnion(this);
      else return visitor.visitChildren(this);
    }
  }

  public final UnionContext union() throws RecognitionException {
    UnionContext _localctx = new UnionContext(_ctx, getState());
    enterRule(_localctx, 138, RULE_union);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(928);
        match(UNION);
        setState(929);
        match(ALL);
        setState(930);
        select_statement();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Join_listContext extends ParserRuleContext {
    public List<Join_itemContext> join_item() {
      return getRuleContexts(Join_itemContext.class);
    }

    public Join_itemContext join_item(int i) {
      return getRuleContext(Join_itemContext.class, i);
    }

    public Join_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_join_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterJoin_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitJoin_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitJoin_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Join_listContext join_list() throws RecognitionException {
    Join_listContext _localctx = new Join_listContext(_ctx, getState());
    enterRule(_localctx, 140, RULE_join_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(933);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(932);
              join_item();
            }
          }
          setState(935);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 8796093023265L) != 0));
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Join_itemContext extends ParserRuleContext {
    public TerminalNode JOIN() {
      return getToken(PhoenixParser.JOIN, 0);
    }

    public Table_specContext table_spec() {
      return getRuleContext(Table_specContext.class, 0);
    }

    public TerminalNode ON() {
      return getToken(PhoenixParser.ON, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public Join_typeContext join_type() {
      return getRuleContext(Join_typeContext.class, 0);
    }

    public Join_itemContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_join_item;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterJoin_item(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitJoin_item(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitJoin_item(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Join_itemContext join_item() throws RecognitionException {
    Join_itemContext _localctx = new Join_itemContext(_ctx, getState());
    enterRule(_localctx, 142, RULE_join_item);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(938);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 8796093023233L) != 0)) {
          {
            setState(937);
            join_type();
          }
        }

        setState(940);
        match(JOIN);
        setState(941);
        table_spec();
        setState(942);
        match(ON);
        setState(943);
        expression(0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Row_rowsContext extends ParserRuleContext {
    public TerminalNode ROW() {
      return getToken(PhoenixParser.ROW, 0);
    }

    public TerminalNode ROWS() {
      return getToken(PhoenixParser.ROWS, 0);
    }

    public Row_rowsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_row_rows;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterRow_rows(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitRow_rows(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitRow_rows(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Row_rowsContext row_rows() throws RecognitionException {
    Row_rowsContext _localctx = new Row_rowsContext(_ctx, getState());
    enterRule(_localctx, 144, RULE_row_rows);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(945);
        _la = _input.LA(1);
        if (!(_la == ROW || _la == ROWS)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Bind_parameter_numberContext extends ParserRuleContext {
    public Bind_parameterContext bind_parameter() {
      return getRuleContext(Bind_parameterContext.class, 0);
    }

    public NumberContext number() {
      return getRuleContext(NumberContext.class, 0);
    }

    public Bind_parameter_numberContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_bind_parameter_number;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterBind_parameter_number(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitBind_parameter_number(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitBind_parameter_number(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Bind_parameter_numberContext bind_parameter_number() throws RecognitionException {
    Bind_parameter_numberContext _localctx = new Bind_parameter_numberContext(_ctx, getState());
    enterRule(_localctx, 146, RULE_bind_parameter_number);
    try {
      setState(949);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case COLON:
        case QM:
          enterOuterAlt(_localctx, 1);
          {
            setState(947);
            bind_parameter();
          }
          break;
        case DECIMAL_LITERAL:
          enterOuterAlt(_localctx, 2);
          {
            setState(948);
            number();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class OrderContext extends ParserRuleContext {
    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public Asc_descContext asc_desc() {
      return getRuleContext(Asc_descContext.class, 0);
    }

    public TerminalNode NULLS() {
      return getToken(PhoenixParser.NULLS, 0);
    }

    public First_lastContext first_last() {
      return getRuleContext(First_lastContext.class, 0);
    }

    public OrderContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_order;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterOrder(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitOrder(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitOrder(this);
      else return visitor.visitChildren(this);
    }
  }

  public final OrderContext order() throws RecognitionException {
    OrderContext _localctx = new OrderContext(_ctx, getState());
    enterRule(_localctx, 148, RULE_order);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(951);
        expression(0);
        setState(953);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ASC || _la == DESC) {
          {
            setState(952);
            asc_desc();
          }
        }

        setState(957);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == NULLS) {
          {
            setState(955);
            match(NULLS);
            setState(956);
            first_last();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class First_lastContext extends ParserRuleContext {
    public TerminalNode FIRST() {
      return getToken(PhoenixParser.FIRST, 0);
    }

    public TerminalNode LAST() {
      return getToken(PhoenixParser.LAST, 0);
    }

    public First_lastContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_first_last;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterFirst_last(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitFirst_last(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitFirst_last(this);
      else return visitor.visitChildren(this);
    }
  }

  public final First_lastContext first_last() throws RecognitionException {
    First_lastContext _localctx = new First_lastContext(_ctx, getState());
    enterRule(_localctx, 150, RULE_first_last);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(959);
        _la = _input.LA(1);
        if (!(_la == FIRST || _la == LAST)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class First_nextContext extends ParserRuleContext {
    public TerminalNode FIRST() {
      return getToken(PhoenixParser.FIRST, 0);
    }

    public TerminalNode NEXT() {
      return getToken(PhoenixParser.NEXT, 0);
    }

    public First_nextContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_first_next;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterFirst_next(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitFirst_next(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitFirst_next(this);
      else return visitor.visitChildren(this);
    }
  }

  public final First_nextContext first_next() throws RecognitionException {
    First_nextContext _localctx = new First_nextContext(_ctx, getState());
    enterRule(_localctx, 152, RULE_first_next);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(961);
        _la = _input.LA(1);
        if (!(_la == FIRST || _la == NEXT)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Bind_parameterContext extends ParserRuleContext {
    public TerminalNode QM() {
      return getToken(PhoenixParser.QM, 0);
    }

    public TerminalNode COLON() {
      return getToken(PhoenixParser.COLON, 0);
    }

    public NumberContext number() {
      return getRuleContext(NumberContext.class, 0);
    }

    public Bind_parameterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_bind_parameter;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterBind_parameter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitBind_parameter(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitBind_parameter(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Bind_parameterContext bind_parameter() throws RecognitionException {
    Bind_parameterContext _localctx = new Bind_parameterContext(_ctx, getState());
    enterRule(_localctx, 154, RULE_bind_parameter);
    try {
      setState(966);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case QM:
          enterOuterAlt(_localctx, 1);
          {
            setState(963);
            match(QM);
          }
          break;
        case COLON:
          enterOuterAlt(_localctx, 2);
          {
            setState(964);
            match(COLON);
            setState(965);
            number();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class NumberContext extends ParserRuleContext {
    public TerminalNode DECIMAL_LITERAL() {
      return getToken(PhoenixParser.DECIMAL_LITERAL, 0);
    }

    public NumberContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_number;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterNumber(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitNumber(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitNumber(this);
      else return visitor.visitChildren(this);
    }
  }

  public final NumberContext number() throws RecognitionException {
    NumberContext _localctx = new NumberContext(_ctx, getState());
    enterRule(_localctx, 156, RULE_number);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(968);
        match(DECIMAL_LITERAL);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class HintContext extends ParserRuleContext {
    public TerminalNode HINT_START() {
      return getToken(PhoenixParser.HINT_START, 0);
    }

    public Hint_nameContext hint_name() {
      return getRuleContext(Hint_nameContext.class, 0);
    }

    public TerminalNode HINT_END() {
      return getToken(PhoenixParser.HINT_END, 0);
    }

    public HintContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_hint;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterHint(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitHint(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitHint(this);
      else return visitor.visitChildren(this);
    }
  }

  public final HintContext hint() throws RecognitionException {
    HintContext _localctx = new HintContext(_ctx, getState());
    enterRule(_localctx, 158, RULE_hint);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(970);
        match(HINT_START);
        setState(971);
        hint_name();
        setState(972);
        match(HINT_END);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Hint_nameContext extends ParserRuleContext {
    public Scan_hintContext scan_hint() {
      return getRuleContext(Scan_hintContext.class, 0);
    }

    public Index_hintContext index_hint() {
      return getRuleContext(Index_hintContext.class, 0);
    }

    public Cache_hintContext cache_hint() {
      return getRuleContext(Cache_hintContext.class, 0);
    }

    public Small_hintContext small_hint() {
      return getRuleContext(Small_hintContext.class, 0);
    }

    public Join_hintContext join_hint() {
      return getRuleContext(Join_hintContext.class, 0);
    }

    public Seek_to_column_hintContext seek_to_column_hint() {
      return getRuleContext(Seek_to_column_hintContext.class, 0);
    }

    public Serial_hintContext serial_hint() {
      return getRuleContext(Serial_hintContext.class, 0);
    }

    public Hint_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_hint_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterHint_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitHint_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitHint_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Hint_nameContext hint_name() throws RecognitionException {
    Hint_nameContext _localctx = new Hint_nameContext(_ctx, getState());
    enterRule(_localctx, 160, RULE_hint_name);
    try {
      setState(981);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case RANGE_SCAN:
        case SKIP_SCAN:
          enterOuterAlt(_localctx, 1);
          {
            setState(974);
            scan_hint();
          }
          break;
        case INDEX:
        case NO_INDEX:
        case USE_DATA_OVER_INDEX_TABLE:
        case USE_INDEX_OVER_DATA_TABLE:
          enterOuterAlt(_localctx, 2);
          {
            setState(975);
            index_hint();
          }
          break;
        case NO_CACHE:
          enterOuterAlt(_localctx, 3);
          {
            setState(976);
            cache_hint();
          }
          break;
        case SMALL:
          enterOuterAlt(_localctx, 4);
          {
            setState(977);
            small_hint();
          }
          break;
        case NO_CHILD_PARENT_JOIN_OPTIMIZATION:
        case NO_STAR_JOIN:
        case USE_SORT_MERGE_JOIN:
          enterOuterAlt(_localctx, 5);
          {
            setState(978);
            join_hint();
          }
          break;
        case NO_SEEK_TO_COLUMN:
        case SEEK_TO_COLUMN:
          enterOuterAlt(_localctx, 6);
          {
            setState(979);
            seek_to_column_hint();
          }
          break;
        case SERIAL:
          enterOuterAlt(_localctx, 7);
          {
            setState(980);
            serial_hint();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Scan_hintContext extends ParserRuleContext {
    public TerminalNode SKIP_SCAN() {
      return getToken(PhoenixParser.SKIP_SCAN, 0);
    }

    public TerminalNode RANGE_SCAN() {
      return getToken(PhoenixParser.RANGE_SCAN, 0);
    }

    public Scan_hintContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_scan_hint;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterScan_hint(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitScan_hint(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitScan_hint(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Scan_hintContext scan_hint() throws RecognitionException {
    Scan_hintContext _localctx = new Scan_hintContext(_ctx, getState());
    enterRule(_localctx, 162, RULE_scan_hint);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(983);
        _la = _input.LA(1);
        if (!(_la == RANGE_SCAN || _la == SKIP_SCAN)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Index_hintContext extends ParserRuleContext {
    public TerminalNode INDEX() {
      return getToken(PhoenixParser.INDEX, 0);
    }

    public TerminalNode NO_INDEX() {
      return getToken(PhoenixParser.NO_INDEX, 0);
    }

    public TerminalNode USE_INDEX_OVER_DATA_TABLE() {
      return getToken(PhoenixParser.USE_INDEX_OVER_DATA_TABLE, 0);
    }

    public TerminalNode USE_DATA_OVER_INDEX_TABLE() {
      return getToken(PhoenixParser.USE_DATA_OVER_INDEX_TABLE, 0);
    }

    public Index_hintContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_index_hint;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterIndex_hint(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitIndex_hint(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitIndex_hint(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Index_hintContext index_hint() throws RecognitionException {
    Index_hintContext _localctx = new Index_hintContext(_ctx, getState());
    enterRule(_localctx, 164, RULE_index_hint);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(985);
        _la = _input.LA(1);
        if (!(_la == INDEX
            || _la == NO_INDEX
            || _la == USE_DATA_OVER_INDEX_TABLE
            || _la == USE_INDEX_OVER_DATA_TABLE)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Cache_hintContext extends ParserRuleContext {
    public TerminalNode NO_CACHE() {
      return getToken(PhoenixParser.NO_CACHE, 0);
    }

    public Cache_hintContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_cache_hint;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterCache_hint(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitCache_hint(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitCache_hint(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Cache_hintContext cache_hint() throws RecognitionException {
    Cache_hintContext _localctx = new Cache_hintContext(_ctx, getState());
    enterRule(_localctx, 166, RULE_cache_hint);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(987);
        match(NO_CACHE);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Small_hintContext extends ParserRuleContext {
    public TerminalNode SMALL() {
      return getToken(PhoenixParser.SMALL, 0);
    }

    public Small_hintContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_small_hint;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSmall_hint(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSmall_hint(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSmall_hint(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Small_hintContext small_hint() throws RecognitionException {
    Small_hintContext _localctx = new Small_hintContext(_ctx, getState());
    enterRule(_localctx, 168, RULE_small_hint);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(989);
        match(SMALL);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Join_hintContext extends ParserRuleContext {
    public TerminalNode USE_SORT_MERGE_JOIN() {
      return getToken(PhoenixParser.USE_SORT_MERGE_JOIN, 0);
    }

    public TerminalNode NO_STAR_JOIN() {
      return getToken(PhoenixParser.NO_STAR_JOIN, 0);
    }

    public TerminalNode NO_CHILD_PARENT_JOIN_OPTIMIZATION() {
      return getToken(PhoenixParser.NO_CHILD_PARENT_JOIN_OPTIMIZATION, 0);
    }

    public Join_hintContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_join_hint;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterJoin_hint(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitJoin_hint(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitJoin_hint(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Join_hintContext join_hint() throws RecognitionException {
    Join_hintContext _localctx = new Join_hintContext(_ctx, getState());
    enterRule(_localctx, 170, RULE_join_hint);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(991);
        _la = _input.LA(1);
        if (!(_la == NO_CHILD_PARENT_JOIN_OPTIMIZATION
            || _la == NO_STAR_JOIN
            || _la == USE_SORT_MERGE_JOIN)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Seek_to_column_hintContext extends ParserRuleContext {
    public TerminalNode SEEK_TO_COLUMN() {
      return getToken(PhoenixParser.SEEK_TO_COLUMN, 0);
    }

    public TerminalNode NO_SEEK_TO_COLUMN() {
      return getToken(PhoenixParser.NO_SEEK_TO_COLUMN, 0);
    }

    public Seek_to_column_hintContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_seek_to_column_hint;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSeek_to_column_hint(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSeek_to_column_hint(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSeek_to_column_hint(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Seek_to_column_hintContext seek_to_column_hint() throws RecognitionException {
    Seek_to_column_hintContext _localctx = new Seek_to_column_hintContext(_ctx, getState());
    enterRule(_localctx, 172, RULE_seek_to_column_hint);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(993);
        _la = _input.LA(1);
        if (!(_la == NO_SEEK_TO_COLUMN || _la == SEEK_TO_COLUMN)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Serial_hintContext extends ParserRuleContext {
    public TerminalNode SERIAL() {
      return getToken(PhoenixParser.SERIAL, 0);
    }

    public Serial_hintContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_serial_hint;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSerial_hint(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSerial_hint(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSerial_hint(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Serial_hintContext serial_hint() throws RecognitionException {
    Serial_hintContext _localctx = new Serial_hintContext(_ctx, getState());
    enterRule(_localctx, 174, RULE_serial_hint);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(995);
        match(SERIAL);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Select_expressionContext extends ParserRuleContext {
    public TerminalNode STAR() {
      return getToken(PhoenixParser.STAR, 0);
    }

    public Family_nameContext family_name() {
      return getRuleContext(Family_nameContext.class, 0);
    }

    public TerminalNode DOT() {
      return getToken(PhoenixParser.DOT, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public Column_aliasContext column_alias() {
      return getRuleContext(Column_aliasContext.class, 0);
    }

    public TerminalNode AS() {
      return getToken(PhoenixParser.AS, 0);
    }

    public Select_expressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_select_expression;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSelect_expression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSelect_expression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSelect_expression(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Select_expressionContext select_expression() throws RecognitionException {
    Select_expressionContext _localctx = new Select_expressionContext(_ctx, getState());
    enterRule(_localctx, 176, RULE_select_expression);
    int _la;
    try {
      setState(1009);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 116, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(997);
            match(STAR);
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(998);
            family_name();
            setState(999);
            match(DOT);
            setState(1000);
            match(STAR);
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(1002);
            expression(0);
            setState(1007);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == AS || _la == DOUBLE_QUOTE_ID || _la == ID) {
              {
                setState(1004);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == AS) {
                  {
                    setState(1003);
                    match(AS);
                  }
                }

                setState(1006);
                column_alias();
              }
            }
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Family_nameContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class, 0);
    }

    public Family_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_family_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterFamily_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitFamily_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitFamily_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Family_nameContext family_name() throws RecognitionException {
    Family_nameContext _localctx = new Family_nameContext(_ctx, getState());
    enterRule(_localctx, 178, RULE_family_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1011);
        name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Quoted_nameContext extends ParserRuleContext {
    public TerminalNode DOUBLE_QUOTE_ID() {
      return getToken(PhoenixParser.DOUBLE_QUOTE_ID, 0);
    }

    public Quoted_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_quoted_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterQuoted_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitQuoted_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitQuoted_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Quoted_nameContext quoted_name() throws RecognitionException {
    Quoted_nameContext _localctx = new Quoted_nameContext(_ctx, getState());
    enterRule(_localctx, 180, RULE_quoted_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1013);
        match(DOUBLE_QUOTE_ID);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Column_aliasContext extends ParserRuleContext {
    public AliasContext alias() {
      return getRuleContext(AliasContext.class, 0);
    }

    public Column_aliasContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_column_alias;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterColumn_alias(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitColumn_alias(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitColumn_alias(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Column_aliasContext column_alias() throws RecognitionException {
    Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
    enterRule(_localctx, 182, RULE_column_alias);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1015);
        alias();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AliasContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class, 0);
    }

    public AliasContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_alias;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterAlias(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitAlias(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitAlias(this);
      else return visitor.visitChildren(this);
    }
  }

  public final AliasContext alias() throws RecognitionException {
    AliasContext _localctx = new AliasContext(_ctx, getState());
    enterRule(_localctx, 184, RULE_alias);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1017);
        name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class NameContext extends ParserRuleContext {
    public TerminalNode ID() {
      return getToken(PhoenixParser.ID, 0);
    }

    public Quoted_nameContext quoted_name() {
      return getRuleContext(Quoted_nameContext.class, 0);
    }

    public NameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitName(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitName(this);
      else return visitor.visitChildren(this);
    }
  }

  public final NameContext name() throws RecognitionException {
    NameContext _localctx = new NameContext(_ctx, getState());
    enterRule(_localctx, 186, RULE_name);
    try {
      setState(1021);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case ID:
          enterOuterAlt(_localctx, 1);
          {
            setState(1019);
            match(ID);
          }
          break;
        case DOUBLE_QUOTE_ID:
          enterOuterAlt(_localctx, 2);
          {
            setState(1020);
            quoted_name();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Table_specContext extends ParserRuleContext {
    public Aliased_table_refContext aliased_table_ref() {
      return getRuleContext(Aliased_table_refContext.class, 0);
    }

    public TerminalNode LP() {
      return getToken(PhoenixParser.LP, 0);
    }

    public Select_commandContext select_command() {
      return getRuleContext(Select_commandContext.class, 0);
    }

    public TerminalNode RP() {
      return getToken(PhoenixParser.RP, 0);
    }

    public Table_aliasContext table_alias() {
      return getRuleContext(Table_aliasContext.class, 0);
    }

    public TerminalNode AS() {
      return getToken(PhoenixParser.AS, 0);
    }

    public Table_specContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_table_spec;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterTable_spec(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitTable_spec(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitTable_spec(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Table_specContext table_spec() throws RecognitionException {
    Table_specContext _localctx = new Table_specContext(_ctx, getState());
    enterRule(_localctx, 188, RULE_table_spec);
    int _la;
    try {
      setState(1033);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case DOUBLE_QUOTE_ID:
        case ID:
          enterOuterAlt(_localctx, 1);
          {
            setState(1023);
            aliased_table_ref();
          }
          break;
        case LP:
          enterOuterAlt(_localctx, 2);
          {
            setState(1024);
            match(LP);
            setState(1025);
            select_command();
            setState(1026);
            match(RP);
            setState(1031);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == AS || _la == DOUBLE_QUOTE_ID || _la == ID) {
              {
                setState(1028);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == AS) {
                  {
                    setState(1027);
                    match(AS);
                  }
                }

                setState(1030);
                table_alias();
              }
            }
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Aliased_table_refContext extends ParserRuleContext {
    public Table_refContext table_ref() {
      return getRuleContext(Table_refContext.class, 0);
    }

    public Table_aliasContext table_alias() {
      return getRuleContext(Table_aliasContext.class, 0);
    }

    public List<TerminalNode> LP() {
      return getTokens(PhoenixParser.LP);
    }

    public TerminalNode LP(int i) {
      return getToken(PhoenixParser.LP, i);
    }

    public List<Column_defContext> column_def() {
      return getRuleContexts(Column_defContext.class);
    }

    public Column_defContext column_def(int i) {
      return getRuleContext(Column_defContext.class, i);
    }

    public List<TerminalNode> RP() {
      return getTokens(PhoenixParser.RP);
    }

    public TerminalNode RP(int i) {
      return getToken(PhoenixParser.RP, i);
    }

    public TerminalNode TABLESAMPLE() {
      return getToken(PhoenixParser.TABLESAMPLE, 0);
    }

    public Positive_decimalContext positive_decimal() {
      return getRuleContext(Positive_decimalContext.class, 0);
    }

    public TerminalNode AS() {
      return getToken(PhoenixParser.AS, 0);
    }

    public TerminalNode COMMA() {
      return getToken(PhoenixParser.COMMA, 0);
    }

    public Aliased_table_refContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_aliased_table_ref;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterAliased_table_ref(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitAliased_table_ref(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitAliased_table_ref(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Aliased_table_refContext aliased_table_ref() throws RecognitionException {
    Aliased_table_refContext _localctx = new Aliased_table_refContext(_ctx, getState());
    enterRule(_localctx, 190, RULE_aliased_table_ref);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1035);
        table_ref();
        setState(1040);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == AS || _la == DOUBLE_QUOTE_ID || _la == ID) {
          {
            setState(1037);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == AS) {
              {
                setState(1036);
                match(AS);
              }
            }

            setState(1039);
            table_alias();
          }
        }

        setState(1050);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == LP) {
          {
            setState(1042);
            match(LP);
            setState(1043);
            column_def();
            setState(1046);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == COMMA) {
              {
                setState(1044);
                match(COMMA);
                setState(1045);
                column_def();
              }
            }

            setState(1048);
            match(RP);
          }
        }

        setState(1057);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == TABLESAMPLE) {
          {
            setState(1052);
            match(TABLESAMPLE);
            setState(1053);
            match(LP);
            setState(1054);
            positive_decimal();
            setState(1055);
            match(RP);
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Table_aliasContext extends ParserRuleContext {
    public AliasContext alias() {
      return getRuleContext(AliasContext.class, 0);
    }

    public Table_aliasContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_table_alias;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterTable_alias(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitTable_alias(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitTable_alias(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Table_aliasContext table_alias() throws RecognitionException {
    Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
    enterRule(_localctx, 192, RULE_table_alias);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1059);
        alias();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Positive_decimalContext extends ParserRuleContext {
    public NumberContext number() {
      return getRuleContext(NumberContext.class, 0);
    }

    public Positive_decimalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_positive_decimal;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterPositive_decimal(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitPositive_decimal(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitPositive_decimal(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Positive_decimalContext positive_decimal() throws RecognitionException {
    Positive_decimalContext _localctx = new Positive_decimalContext(_ctx, getState());
    enterRule(_localctx, 194, RULE_positive_decimal);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1061);
        number();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Schema_nameContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class, 0);
    }

    public Schema_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_schema_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSchema_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSchema_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSchema_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Schema_nameContext schema_name() throws RecognitionException {
    Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
    enterRule(_localctx, 196, RULE_schema_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1063);
        name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Table_nameContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class, 0);
    }

    public Table_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_table_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterTable_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitTable_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitTable_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Table_nameContext table_name() throws RecognitionException {
    Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
    enterRule(_localctx, 198, RULE_table_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1065);
        name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Column_defContext extends ParserRuleContext {
    public Column_refContext column_ref() {
      return getRuleContext(Column_refContext.class, 0);
    }

    public Data_typeContext data_type() {
      return getRuleContext(Data_typeContext.class, 0);
    }

    public TerminalNode NULL_() {
      return getToken(PhoenixParser.NULL_, 0);
    }

    public TerminalNode DEFAULT() {
      return getToken(PhoenixParser.DEFAULT, 0);
    }

    public LiteralContext literal() {
      return getRuleContext(LiteralContext.class, 0);
    }

    public TerminalNode PRIMARY() {
      return getToken(PhoenixParser.PRIMARY, 0);
    }

    public TerminalNode KEY() {
      return getToken(PhoenixParser.KEY, 0);
    }

    public TerminalNode NOT() {
      return getToken(PhoenixParser.NOT, 0);
    }

    public Asc_descContext asc_desc() {
      return getRuleContext(Asc_descContext.class, 0);
    }

    public TerminalNode ROW_TIMESTAMP() {
      return getToken(PhoenixParser.ROW_TIMESTAMP, 0);
    }

    public Column_defContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_column_def;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterColumn_def(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitColumn_def(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitColumn_def(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Column_defContext column_def() throws RecognitionException {
    Column_defContext _localctx = new Column_defContext(_ctx, getState());
    enterRule(_localctx, 200, RULE_column_def);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1067);
        column_ref();
        setState(1068);
        data_type();
        setState(1073);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == NOT || _la == NULL_) {
          {
            setState(1070);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == NOT) {
              {
                setState(1069);
                match(NOT);
              }
            }

            setState(1072);
            match(NULL_);
          }
        }

        setState(1077);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == DEFAULT) {
          {
            setState(1075);
            match(DEFAULT);
            setState(1076);
            literal();
          }
        }

        setState(1087);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == PRIMARY) {
          {
            setState(1079);
            match(PRIMARY);
            setState(1080);
            match(KEY);
            setState(1082);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == ASC || _la == DESC) {
              {
                setState(1081);
                asc_desc();
              }
            }

            setState(1085);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == ROW_TIMESTAMP) {
              {
                setState(1084);
                match(ROW_TIMESTAMP);
              }
            }
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Column_refContext extends ParserRuleContext {
    public Column_nameContext column_name() {
      return getRuleContext(Column_nameContext.class, 0);
    }

    public Family_nameContext family_name() {
      return getRuleContext(Family_nameContext.class, 0);
    }

    public TerminalNode DOT() {
      return getToken(PhoenixParser.DOT, 0);
    }

    public Column_refContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_column_ref;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterColumn_ref(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitColumn_ref(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitColumn_ref(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Column_refContext column_ref() throws RecognitionException {
    Column_refContext _localctx = new Column_refContext(_ctx, getState());
    enterRule(_localctx, 202, RULE_column_ref);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1092);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 132, _ctx)) {
          case 1:
            {
              setState(1089);
              family_name();
              setState(1090);
              match(DOT);
            }
            break;
        }
        setState(1094);
        column_name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Column_nameContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class, 0);
    }

    public Column_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_column_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterColumn_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitColumn_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitColumn_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Column_nameContext column_name() throws RecognitionException {
    Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
    enterRule(_localctx, 204, RULE_column_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1096);
        name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Data_typeContext extends ParserRuleContext {
    public Sql_data_typeContext sql_data_type() {
      return getRuleContext(Sql_data_typeContext.class, 0);
    }

    public Hbase_data_typeContext hbase_data_type() {
      return getRuleContext(Hbase_data_typeContext.class, 0);
    }

    public TerminalNode ARRAY() {
      return getToken(PhoenixParser.ARRAY, 0);
    }

    public TerminalNode LSB() {
      return getToken(PhoenixParser.LSB, 0);
    }

    public Dimension_intContext dimension_int() {
      return getRuleContext(Dimension_intContext.class, 0);
    }

    public TerminalNode RSC() {
      return getToken(PhoenixParser.RSC, 0);
    }

    public Data_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_data_type;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterData_type(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitData_type(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitData_type(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Data_typeContext data_type() throws RecognitionException {
    Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
    enterRule(_localctx, 206, RULE_data_type);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1100);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case BIGINT:
          case BINARY:
          case CHAR:
          case DATE:
          case DECIMAL:
          case DOUBLE:
          case FLOAT:
          case INTEGER:
          case SMALLINT:
          case TIME:
          case TIMESTAMP:
          case TINYINT:
          case VARBINARY:
          case VARCHAR:
            {
              setState(1098);
              sql_data_type();
            }
            break;
          case UNSIGNED_DATE:
          case UNSIGNED_DOUBLE:
          case UNSIGNED_FLOAT:
          case UNSIGNED_INT:
          case UNSIGNED_LONG:
          case UNSIGNED_SMALLINT:
          case UNSIGNED_TIME:
          case UNSIGNED_TIMESTAMP:
          case UNSIGNED_TINYINT:
            {
              setState(1099);
              hbase_data_type();
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
        setState(1109);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ARRAY) {
          {
            setState(1102);
            match(ARRAY);
            setState(1107);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == LSB) {
              {
                setState(1103);
                match(LSB);
                setState(1104);
                dimension_int();
                setState(1105);
                match(RSC);
              }
            }
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Asc_descContext extends ParserRuleContext {
    public TerminalNode ASC() {
      return getToken(PhoenixParser.ASC, 0);
    }

    public TerminalNode DESC() {
      return getToken(PhoenixParser.DESC, 0);
    }

    public Asc_descContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_asc_desc;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterAsc_desc(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitAsc_desc(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitAsc_desc(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Asc_descContext asc_desc() throws RecognitionException {
    Asc_descContext _localctx = new Asc_descContext(_ctx, getState());
    enterRule(_localctx, 208, RULE_asc_desc);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1111);
        _la = _input.LA(1);
        if (!(_la == ASC || _la == DESC)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Any_allContext extends ParserRuleContext {
    public TerminalNode ANY() {
      return getToken(PhoenixParser.ANY, 0);
    }

    public TerminalNode ALL() {
      return getToken(PhoenixParser.ALL, 0);
    }

    public Any_allContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_any_all;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterAny_all(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitAny_all(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitAny_all(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Any_allContext any_all() throws RecognitionException {
    Any_allContext _localctx = new Any_allContext(_ctx, getState());
    enterRule(_localctx, 210, RULE_any_all);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1113);
        _la = _input.LA(1);
        if (!(_la == ALL || _la == ANY)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Join_typeContext extends ParserRuleContext {
    public TerminalNode INNER() {
      return getToken(PhoenixParser.INNER, 0);
    }

    public TerminalNode LEFT() {
      return getToken(PhoenixParser.LEFT, 0);
    }

    public TerminalNode RIGHT() {
      return getToken(PhoenixParser.RIGHT, 0);
    }

    public TerminalNode OUTER() {
      return getToken(PhoenixParser.OUTER, 0);
    }

    public Join_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_join_type;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterJoin_type(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitJoin_type(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitJoin_type(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Join_typeContext join_type() throws RecognitionException {
    Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
    enterRule(_localctx, 212, RULE_join_type);
    int _la;
    try {
      setState(1120);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case INNER:
          enterOuterAlt(_localctx, 1);
          {
            setState(1115);
            match(INNER);
          }
          break;
        case LEFT:
        case RIGHT:
          enterOuterAlt(_localctx, 2);
          {
            setState(1116);
            _la = _input.LA(1);
            if (!(_la == LEFT || _la == RIGHT)) {
              _errHandler.recoverInline(this);
            } else {
              if (_input.LA(1) == Token.EOF) matchedEOF = true;
              _errHandler.reportMatch(this);
              consume();
            }
            setState(1118);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == OUTER) {
              {
                setState(1117);
                match(OUTER);
              }
            }
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExpressionContext extends ParserRuleContext {
    public LiteralContext literal() {
      return getRuleContext(LiteralContext.class, 0);
    }

    public Bind_parameterContext bind_parameter() {
      return getRuleContext(Bind_parameterContext.class, 0);
    }

    public Column_nameContext column_name() {
      return getRuleContext(Column_nameContext.class, 0);
    }

    public Table_nameContext table_name() {
      return getRuleContext(Table_nameContext.class, 0);
    }

    public List<TerminalNode> DOT() {
      return getTokens(PhoenixParser.DOT);
    }

    public TerminalNode DOT(int i) {
      return getToken(PhoenixParser.DOT, i);
    }

    public Schema_nameContext schema_name() {
      return getRuleContext(Schema_nameContext.class, 0);
    }

    public TerminalNode MINUS() {
      return getToken(PhoenixParser.MINUS, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public TerminalNode EXISTS() {
      return getToken(PhoenixParser.EXISTS, 0);
    }

    public TerminalNode LP() {
      return getToken(PhoenixParser.LP, 0);
    }

    public Select_commandContext select_command() {
      return getRuleContext(Select_commandContext.class, 0);
    }

    public TerminalNode RP() {
      return getToken(PhoenixParser.RP, 0);
    }

    public TerminalNode NOT() {
      return getToken(PhoenixParser.NOT, 0);
    }

    public TerminalNode ID() {
      return getToken(PhoenixParser.ID, 0);
    }

    public Expression_listContext expression_list() {
      return getRuleContext(Expression_listContext.class, 0);
    }

    public Row_value_constructorContext row_value_constructor() {
      return getRuleContext(Row_value_constructorContext.class, 0);
    }

    public CaseContext case_() {
      return getRuleContext(CaseContext.class, 0);
    }

    public Case_whenContext case_when() {
      return getRuleContext(Case_whenContext.class, 0);
    }

    public CastContext cast() {
      return getRuleContext(CastContext.class, 0);
    }

    public SequenceContext sequence() {
      return getRuleContext(SequenceContext.class, 0);
    }

    public Array_constructorContext array_constructor() {
      return getRuleContext(Array_constructorContext.class, 0);
    }

    public TerminalNode PIPEPIPE() {
      return getToken(PhoenixParser.PIPEPIPE, 0);
    }

    public TerminalNode STAR() {
      return getToken(PhoenixParser.STAR, 0);
    }

    public TerminalNode DIV() {
      return getToken(PhoenixParser.DIV, 0);
    }

    public TerminalNode MOD() {
      return getToken(PhoenixParser.MOD, 0);
    }

    public TerminalNode PLUS() {
      return getToken(PhoenixParser.PLUS, 0);
    }

    public Comp_opContext comp_op() {
      return getRuleContext(Comp_opContext.class, 0);
    }

    public TerminalNode LIKE() {
      return getToken(PhoenixParser.LIKE, 0);
    }

    public TerminalNode ILIKE() {
      return getToken(PhoenixParser.ILIKE, 0);
    }

    public TerminalNode BETWEEN() {
      return getToken(PhoenixParser.BETWEEN, 0);
    }

    public TerminalNode AND() {
      return getToken(PhoenixParser.AND, 0);
    }

    public TerminalNode OR() {
      return getToken(PhoenixParser.OR, 0);
    }

    public Any_allContext any_all() {
      return getRuleContext(Any_allContext.class, 0);
    }

    public TerminalNode IS() {
      return getToken(PhoenixParser.IS, 0);
    }

    public TerminalNode NULL_() {
      return getToken(PhoenixParser.NULL_, 0);
    }

    public TerminalNode IN() {
      return getToken(PhoenixParser.IN, 0);
    }

    public ExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expression;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ExpressionContext expression() throws RecognitionException {
    return expression(0);
  }

  private ExpressionContext expression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
    ExpressionContext _prevctx = _localctx;
    int _startState = 214;
    enterRecursionRule(_localctx, 214, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(1159);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 141, _ctx)) {
          case 1:
            {
              setState(1123);
              literal();
            }
            break;
          case 2:
            {
              setState(1124);
              bind_parameter();
            }
            break;
          case 3:
            {
              setState(1133);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 139, _ctx)) {
                case 1:
                  {
                    setState(1128);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 138, _ctx)) {
                      case 1:
                        {
                          setState(1125);
                          schema_name();
                          setState(1126);
                          match(DOT);
                        }
                        break;
                    }
                    setState(1130);
                    table_name();
                    setState(1131);
                    match(DOT);
                  }
                  break;
              }
              setState(1135);
              column_name();
            }
            break;
          case 4:
            {
              setState(1136);
              match(MINUS);
              setState(1137);
              expression(21);
            }
            break;
          case 5:
            {
              setState(1139);
              _errHandler.sync(this);
              _la = _input.LA(1);
              if (_la == NOT) {
                {
                  setState(1138);
                  match(NOT);
                }
              }

              setState(1141);
              match(EXISTS);
              setState(1142);
              match(LP);
              setState(1143);
              select_command();
              setState(1144);
              match(RP);
            }
            break;
          case 6:
            {
              setState(1146);
              match(ID);
              setState(1147);
              match(LP);
              setState(1148);
              expression_list();
              setState(1149);
              match(RP);
            }
            break;
          case 7:
            {
              setState(1151);
              match(NOT);
              setState(1152);
              expression(9);
            }
            break;
          case 8:
            {
              setState(1153);
              row_value_constructor();
            }
            break;
          case 9:
            {
              setState(1154);
              case_();
            }
            break;
          case 10:
            {
              setState(1155);
              case_when();
            }
            break;
          case 11:
            {
              setState(1156);
              cast();
            }
            break;
          case 12:
            {
              setState(1157);
              sequence();
            }
            break;
          case 13:
            {
              setState(1158);
              array_constructor();
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(1219);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 147, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(1217);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 146, _ctx)) {
                case 1:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(1161);
                    if (!(precpred(_ctx, 20)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                    setState(1162);
                    match(PIPEPIPE);
                    setState(1163);
                    expression(21);
                  }
                  break;
                case 2:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(1164);
                    if (!(precpred(_ctx, 19)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                    setState(1165);
                    _la = _input.LA(1);
                    if (!(((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & 7L) != 0))) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(1166);
                    expression(20);
                  }
                  break;
                case 3:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(1167);
                    if (!(precpred(_ctx, 18)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                    setState(1168);
                    _la = _input.LA(1);
                    if (!(_la == PLUS || _la == MINUS)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(1169);
                    expression(19);
                  }
                  break;
                case 4:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(1170);
                    if (!(precpred(_ctx, 17)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                    setState(1171);
                    comp_op();
                    setState(1172);
                    expression(18);
                  }
                  break;
                case 5:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(1174);
                    if (!(precpred(_ctx, 15)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                    setState(1175);
                    _la = _input.LA(1);
                    if (!(_la == ILIKE || _la == LIKE)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(1176);
                    expression(16);
                  }
                  break;
                case 6:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(1177);
                    if (!(precpred(_ctx, 12)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                    setState(1179);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                      {
                        setState(1178);
                        match(NOT);
                      }
                    }

                    setState(1181);
                    match(BETWEEN);
                    setState(1182);
                    expression(0);
                    setState(1183);
                    match(AND);
                    setState(1184);
                    expression(13);
                  }
                  break;
                case 7:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(1186);
                    if (!(precpred(_ctx, 8)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                    setState(1187);
                    match(AND);
                    setState(1188);
                    expression(9);
                  }
                  break;
                case 8:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(1189);
                    if (!(precpred(_ctx, 7)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                    setState(1190);
                    match(OR);
                    setState(1191);
                    expression(8);
                  }
                  break;
                case 9:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(1192);
                    if (!(precpred(_ctx, 16)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                    setState(1193);
                    comp_op();
                    setState(1194);
                    any_all();
                    setState(1195);
                    match(LP);
                    {
                      setState(1196);
                      select_command();
                    }
                    setState(1197);
                    match(RP);
                  }
                  break;
                case 10:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(1199);
                    if (!(precpred(_ctx, 14)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                    setState(1200);
                    match(IS);
                    setState(1202);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                      {
                        setState(1201);
                        match(NOT);
                      }
                    }

                    setState(1204);
                    match(NULL_);
                  }
                  break;
                case 11:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(1205);
                    if (!(precpred(_ctx, 13)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                    setState(1207);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                      {
                        setState(1206);
                        match(NOT);
                      }
                    }

                    setState(1209);
                    match(IN);
                    setState(1210);
                    match(LP);
                    setState(1213);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                      case SELECT:
                        {
                          setState(1211);
                          select_command();
                        }
                        break;
                      case ARRAY:
                      case CASE:
                      case CAST:
                      case CURRENT:
                      case EXISTS:
                      case FALSE:
                      case NEXT:
                      case NOT:
                      case NULL_:
                      case TRUE:
                      case COLON:
                      case LP:
                      case MINUS:
                      case QM:
                      case DOUBLE_QUOTE_ID:
                      case ID:
                      case STRING_LITERAL:
                      case DECIMAL_LITERAL:
                        {
                          setState(1212);
                          expression_list();
                        }
                        break;
                      default:
                        throw new NoViableAltException(this);
                    }
                    setState(1215);
                    match(RP);
                  }
                  break;
              }
            }
          }
          setState(1221);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 147, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Comp_opContext extends ParserRuleContext {
    public TerminalNode EQ() {
      return getToken(PhoenixParser.EQ, 0);
    }

    public TerminalNode GT() {
      return getToken(PhoenixParser.GT, 0);
    }

    public TerminalNode GE() {
      return getToken(PhoenixParser.GE, 0);
    }

    public TerminalNode LT() {
      return getToken(PhoenixParser.LT, 0);
    }

    public TerminalNode LE() {
      return getToken(PhoenixParser.LE, 0);
    }

    public TerminalNode NE() {
      return getToken(PhoenixParser.NE, 0);
    }

    public TerminalNode NE2() {
      return getToken(PhoenixParser.NE2, 0);
    }

    public Comp_opContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_comp_op;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterComp_op(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitComp_op(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitComp_op(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Comp_opContext comp_op() throws RecognitionException {
    Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
    enterRule(_localctx, 216, RULE_comp_op);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1222);
        _la = _input.LA(1);
        if (!(((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & 127L) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Expression_listContext extends ParserRuleContext {
    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Expression_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expression_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterExpression_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitExpression_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitExpression_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Expression_listContext expression_list() throws RecognitionException {
    Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
    enterRule(_localctx, 218, RULE_expression_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1224);
        expression(0);
        setState(1229);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(1225);
              match(COMMA);
              setState(1226);
              expression(0);
            }
          }
          setState(1231);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class LiteralContext extends ParserRuleContext {
    public StringContext string() {
      return getRuleContext(StringContext.class, 0);
    }

    public NumericContext numeric() {
      return getRuleContext(NumericContext.class, 0);
    }

    public True_falseContext true_false() {
      return getRuleContext(True_falseContext.class, 0);
    }

    public TerminalNode NULL_() {
      return getToken(PhoenixParser.NULL_, 0);
    }

    public LiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_literal;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitLiteral(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitLiteral(this);
      else return visitor.visitChildren(this);
    }
  }

  public final LiteralContext literal() throws RecognitionException {
    LiteralContext _localctx = new LiteralContext(_ctx, getState());
    enterRule(_localctx, 220, RULE_literal);
    try {
      setState(1236);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case STRING_LITERAL:
          enterOuterAlt(_localctx, 1);
          {
            setState(1232);
            string();
          }
          break;
        case MINUS:
        case DECIMAL_LITERAL:
          enterOuterAlt(_localctx, 2);
          {
            setState(1233);
            numeric();
          }
          break;
        case FALSE:
        case TRUE:
          enterOuterAlt(_localctx, 3);
          {
            setState(1234);
            true_false();
          }
          break;
        case NULL_:
          enterOuterAlt(_localctx, 4);
          {
            setState(1235);
            match(NULL_);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class StringContext extends ParserRuleContext {
    public TerminalNode STRING_LITERAL() {
      return getToken(PhoenixParser.STRING_LITERAL, 0);
    }

    public StringContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_string;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterString(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitString(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitString(this);
      else return visitor.visitChildren(this);
    }
  }

  public final StringContext string() throws RecognitionException {
    StringContext _localctx = new StringContext(_ctx, getState());
    enterRule(_localctx, 222, RULE_string);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1238);
        match(STRING_LITERAL);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class NumericContext extends ParserRuleContext {
    public IntegerContext integer() {
      return getRuleContext(IntegerContext.class, 0);
    }

    public DecimalContext decimal() {
      return getRuleContext(DecimalContext.class, 0);
    }

    public NumericContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_numeric;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterNumeric(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitNumeric(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitNumeric(this);
      else return visitor.visitChildren(this);
    }
  }

  public final NumericContext numeric() throws RecognitionException {
    NumericContext _localctx = new NumericContext(_ctx, getState());
    enterRule(_localctx, 224, RULE_numeric);
    try {
      setState(1242);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 150, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(1240);
            integer();
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(1241);
            decimal();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class IntegerContext extends ParserRuleContext {
    public TerminalNode DECIMAL_LITERAL() {
      return getToken(PhoenixParser.DECIMAL_LITERAL, 0);
    }

    public TerminalNode MINUS() {
      return getToken(PhoenixParser.MINUS, 0);
    }

    public IntegerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_integer;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterInteger(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitInteger(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitInteger(this);
      else return visitor.visitChildren(this);
    }
  }

  public final IntegerContext integer() throws RecognitionException {
    IntegerContext _localctx = new IntegerContext(_ctx, getState());
    enterRule(_localctx, 226, RULE_integer);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1245);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == MINUS) {
          {
            setState(1244);
            match(MINUS);
          }
        }

        setState(1247);
        match(DECIMAL_LITERAL);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class DecimalContext extends ParserRuleContext {
    public List<NumberContext> number() {
      return getRuleContexts(NumberContext.class);
    }

    public NumberContext number(int i) {
      return getRuleContext(NumberContext.class, i);
    }

    public TerminalNode MINUS() {
      return getToken(PhoenixParser.MINUS, 0);
    }

    public TerminalNode DOT() {
      return getToken(PhoenixParser.DOT, 0);
    }

    public DecimalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_decimal;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDecimal(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDecimal(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDecimal(this);
      else return visitor.visitChildren(this);
    }
  }

  public final DecimalContext decimal() throws RecognitionException {
    DecimalContext _localctx = new DecimalContext(_ctx, getState());
    enterRule(_localctx, 228, RULE_decimal);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1250);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == MINUS) {
          {
            setState(1249);
            match(MINUS);
          }
        }

        setState(1252);
        number();
        setState(1255);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 153, _ctx)) {
          case 1:
            {
              setState(1253);
              match(DOT);
              setState(1254);
              number();
            }
            break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class True_falseContext extends ParserRuleContext {
    public TerminalNode TRUE() {
      return getToken(PhoenixParser.TRUE, 0);
    }

    public TerminalNode FALSE() {
      return getToken(PhoenixParser.FALSE, 0);
    }

    public True_falseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_true_false;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterTrue_false(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitTrue_false(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitTrue_false(this);
      else return visitor.visitChildren(this);
    }
  }

  public final True_falseContext true_false() throws RecognitionException {
    True_falseContext _localctx = new True_falseContext(_ctx, getState());
    enterRule(_localctx, 230, RULE_true_false);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1257);
        _la = _input.LA(1);
        if (!(_la == FALSE || _la == TRUE)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class CaseContext extends ParserRuleContext {
    public TerminalNode CASE() {
      return getToken(PhoenixParser.CASE, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public List<TerminalNode> WHEN() {
      return getTokens(PhoenixParser.WHEN);
    }

    public TerminalNode WHEN(int i) {
      return getToken(PhoenixParser.WHEN, i);
    }

    public List<TerminalNode> THEN() {
      return getTokens(PhoenixParser.THEN);
    }

    public TerminalNode THEN(int i) {
      return getToken(PhoenixParser.THEN, i);
    }

    public TerminalNode END() {
      return getToken(PhoenixParser.END, 0);
    }

    public TerminalNode ELSE() {
      return getToken(PhoenixParser.ELSE, 0);
    }

    public CaseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_case;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterCase(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitCase(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitCase(this);
      else return visitor.visitChildren(this);
    }
  }

  public final CaseContext case_() throws RecognitionException {
    CaseContext _localctx = new CaseContext(_ctx, getState());
    enterRule(_localctx, 232, RULE_case);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1259);
        match(CASE);
        setState(1260);
        expression(0);
        setState(1261);
        match(WHEN);
        setState(1262);
        expression(0);
        setState(1263);
        match(THEN);
        setState(1264);
        expression(0);
        setState(1272);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == WHEN) {
          {
            {
              setState(1265);
              match(WHEN);
              setState(1266);
              expression(0);
              setState(1267);
              match(THEN);
              setState(1268);
              expression(0);
            }
          }
          setState(1274);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(1277);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ELSE) {
          {
            setState(1275);
            match(ELSE);
            setState(1276);
            expression(0);
          }
        }

        setState(1279);
        match(END);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Case_whenContext extends ParserRuleContext {
    public TerminalNode CASE() {
      return getToken(PhoenixParser.CASE, 0);
    }

    public List<TerminalNode> WHEN() {
      return getTokens(PhoenixParser.WHEN);
    }

    public TerminalNode WHEN(int i) {
      return getToken(PhoenixParser.WHEN, i);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public List<TerminalNode> THEN() {
      return getTokens(PhoenixParser.THEN);
    }

    public TerminalNode THEN(int i) {
      return getToken(PhoenixParser.THEN, i);
    }

    public TerminalNode END() {
      return getToken(PhoenixParser.END, 0);
    }

    public TerminalNode ELSE() {
      return getToken(PhoenixParser.ELSE, 0);
    }

    public Case_whenContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_case_when;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterCase_when(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitCase_when(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitCase_when(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Case_whenContext case_when() throws RecognitionException {
    Case_whenContext _localctx = new Case_whenContext(_ctx, getState());
    enterRule(_localctx, 234, RULE_case_when);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1281);
        match(CASE);
        setState(1282);
        match(WHEN);
        setState(1283);
        expression(0);
        setState(1284);
        match(THEN);
        setState(1285);
        expression(0);
        setState(1291);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == WHEN) {
          {
            setState(1286);
            match(WHEN);
            setState(1287);
            expression(0);
            setState(1288);
            match(THEN);
            setState(1289);
            expression(0);
          }
        }

        setState(1295);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ELSE) {
          {
            setState(1293);
            match(ELSE);
            setState(1294);
            expression(0);
          }
        }

        setState(1297);
        match(END);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Row_value_constructorContext extends ParserRuleContext {
    public TerminalNode LP() {
      return getToken(PhoenixParser.LP, 0);
    }

    public Expression_listContext expression_list() {
      return getRuleContext(Expression_listContext.class, 0);
    }

    public TerminalNode RP() {
      return getToken(PhoenixParser.RP, 0);
    }

    public Row_value_constructorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_row_value_constructor;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterRow_value_constructor(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitRow_value_constructor(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitRow_value_constructor(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Row_value_constructorContext row_value_constructor() throws RecognitionException {
    Row_value_constructorContext _localctx = new Row_value_constructorContext(_ctx, getState());
    enterRule(_localctx, 236, RULE_row_value_constructor);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1299);
        match(LP);
        setState(1300);
        expression_list();
        setState(1301);
        match(RP);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class CastContext extends ParserRuleContext {
    public TerminalNode CAST() {
      return getToken(PhoenixParser.CAST, 0);
    }

    public TerminalNode LP() {
      return getToken(PhoenixParser.LP, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public TerminalNode AS() {
      return getToken(PhoenixParser.AS, 0);
    }

    public Data_typeContext data_type() {
      return getRuleContext(Data_typeContext.class, 0);
    }

    public TerminalNode RP() {
      return getToken(PhoenixParser.RP, 0);
    }

    public CastContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_cast;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterCast(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitCast(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitCast(this);
      else return visitor.visitChildren(this);
    }
  }

  public final CastContext cast() throws RecognitionException {
    CastContext _localctx = new CastContext(_ctx, getState());
    enterRule(_localctx, 238, RULE_cast);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1303);
        match(CAST);
        setState(1304);
        match(LP);
        setState(1305);
        expression(0);
        setState(1306);
        match(AS);
        setState(1307);
        data_type();
        setState(1308);
        match(RP);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SequenceContext extends ParserRuleContext {
    public TerminalNode FOR() {
      return getToken(PhoenixParser.FOR, 0);
    }

    public Sequence_refContext sequence_ref() {
      return getRuleContext(Sequence_refContext.class, 0);
    }

    public TerminalNode NEXT() {
      return getToken(PhoenixParser.NEXT, 0);
    }

    public TerminalNode CURRENT() {
      return getToken(PhoenixParser.CURRENT, 0);
    }

    public TerminalNode VALUE() {
      return getToken(PhoenixParser.VALUE, 0);
    }

    public NumberContext number() {
      return getRuleContext(NumberContext.class, 0);
    }

    public TerminalNode VALUES() {
      return getToken(PhoenixParser.VALUES, 0);
    }

    public SequenceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_sequence;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSequence(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSequence(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSequence(this);
      else return visitor.visitChildren(this);
    }
  }

  public final SequenceContext sequence() throws RecognitionException {
    SequenceContext _localctx = new SequenceContext(_ctx, getState());
    enterRule(_localctx, 240, RULE_sequence);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1310);
        _la = _input.LA(1);
        if (!(_la == CURRENT || _la == NEXT)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
        setState(1315);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case VALUE:
            {
              setState(1311);
              match(VALUE);
            }
            break;
          case DECIMAL_LITERAL:
            {
              setState(1312);
              number();
              setState(1313);
              match(VALUES);
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
        setState(1317);
        match(FOR);
        setState(1318);
        sequence_ref();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Sequence_refContext extends ParserRuleContext {
    public Sequence_nameContext sequence_name() {
      return getRuleContext(Sequence_nameContext.class, 0);
    }

    public Schema_nameContext schema_name() {
      return getRuleContext(Schema_nameContext.class, 0);
    }

    public TerminalNode DOT() {
      return getToken(PhoenixParser.DOT, 0);
    }

    public Sequence_refContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_sequence_ref;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSequence_ref(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSequence_ref(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSequence_ref(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Sequence_refContext sequence_ref() throws RecognitionException {
    Sequence_refContext _localctx = new Sequence_refContext(_ctx, getState());
    enterRule(_localctx, 242, RULE_sequence_ref);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1323);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 159, _ctx)) {
          case 1:
            {
              setState(1320);
              schema_name();
              setState(1321);
              match(DOT);
            }
            break;
        }
        setState(1325);
        sequence_name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Sequence_nameContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class, 0);
    }

    public Sequence_nameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_sequence_name;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSequence_name(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSequence_name(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSequence_name(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Sequence_nameContext sequence_name() throws RecognitionException {
    Sequence_nameContext _localctx = new Sequence_nameContext(_ctx, getState());
    enterRule(_localctx, 244, RULE_sequence_name);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1327);
        name();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Array_constructorContext extends ParserRuleContext {
    public TerminalNode ARRAY() {
      return getToken(PhoenixParser.ARRAY, 0);
    }

    public TerminalNode LSB() {
      return getToken(PhoenixParser.LSB, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public TerminalNode RSC() {
      return getToken(PhoenixParser.RSC, 0);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(PhoenixParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(PhoenixParser.COMMA, i);
    }

    public Array_constructorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_array_constructor;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterArray_constructor(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitArray_constructor(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitArray_constructor(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Array_constructorContext array_constructor() throws RecognitionException {
    Array_constructorContext _localctx = new Array_constructorContext(_ctx, getState());
    enterRule(_localctx, 246, RULE_array_constructor);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1329);
        match(ARRAY);
        setState(1330);
        match(LSB);
        setState(1331);
        expression(0);
        setState(1336);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(1332);
              match(COMMA);
              setState(1333);
              expression(0);
            }
          }
          setState(1338);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(1339);
        match(RSC);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Dimension_intContext extends ParserRuleContext {
    public IntegerContext integer() {
      return getRuleContext(IntegerContext.class, 0);
    }

    public Dimension_intContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_dimension_int;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterDimension_int(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitDimension_int(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitDimension_int(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Dimension_intContext dimension_int() throws RecognitionException {
    Dimension_intContext _localctx = new Dimension_intContext(_ctx, getState());
    enterRule(_localctx, 248, RULE_dimension_int);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1341);
        integer();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Precision_intContext extends ParserRuleContext {
    public IntegerContext integer() {
      return getRuleContext(IntegerContext.class, 0);
    }

    public Precision_intContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_precision_int;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterPrecision_int(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitPrecision_int(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitPrecision_int(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Precision_intContext precision_int() throws RecognitionException {
    Precision_intContext _localctx = new Precision_intContext(_ctx, getState());
    enterRule(_localctx, 250, RULE_precision_int);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1343);
        integer();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Scale_intContext extends ParserRuleContext {
    public IntegerContext integer() {
      return getRuleContext(IntegerContext.class, 0);
    }

    public Scale_intContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_scale_int;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterScale_int(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitScale_int(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitScale_int(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Scale_intContext scale_int() throws RecognitionException {
    Scale_intContext _localctx = new Scale_intContext(_ctx, getState());
    enterRule(_localctx, 252, RULE_scale_int);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1345);
        integer();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Sql_data_typeContext extends ParserRuleContext {
    public TerminalNode CHAR() {
      return getToken(PhoenixParser.CHAR, 0);
    }

    public TerminalNode LP() {
      return getToken(PhoenixParser.LP, 0);
    }

    public Precision_intContext precision_int() {
      return getRuleContext(Precision_intContext.class, 0);
    }

    public TerminalNode RP() {
      return getToken(PhoenixParser.RP, 0);
    }

    public TerminalNode VARCHAR() {
      return getToken(PhoenixParser.VARCHAR, 0);
    }

    public TerminalNode DECIMAL() {
      return getToken(PhoenixParser.DECIMAL, 0);
    }

    public TerminalNode COMMA() {
      return getToken(PhoenixParser.COMMA, 0);
    }

    public Scale_intContext scale_int() {
      return getRuleContext(Scale_intContext.class, 0);
    }

    public TerminalNode TINYINT() {
      return getToken(PhoenixParser.TINYINT, 0);
    }

    public TerminalNode SMALLINT() {
      return getToken(PhoenixParser.SMALLINT, 0);
    }

    public TerminalNode INTEGER() {
      return getToken(PhoenixParser.INTEGER, 0);
    }

    public TerminalNode BIGINT() {
      return getToken(PhoenixParser.BIGINT, 0);
    }

    public TerminalNode FLOAT() {
      return getToken(PhoenixParser.FLOAT, 0);
    }

    public TerminalNode DOUBLE() {
      return getToken(PhoenixParser.DOUBLE, 0);
    }

    public TerminalNode TIMESTAMP() {
      return getToken(PhoenixParser.TIMESTAMP, 0);
    }

    public TerminalNode DATE() {
      return getToken(PhoenixParser.DATE, 0);
    }

    public TerminalNode TIME() {
      return getToken(PhoenixParser.TIME, 0);
    }

    public TerminalNode BINARY() {
      return getToken(PhoenixParser.BINARY, 0);
    }

    public TerminalNode VARBINARY() {
      return getToken(PhoenixParser.VARBINARY, 0);
    }

    public Sql_data_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_sql_data_type;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterSql_data_type(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitSql_data_type(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitSql_data_type(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Sql_data_typeContext sql_data_type() throws RecognitionException {
    Sql_data_typeContext _localctx = new Sql_data_typeContext(_ctx, getState());
    enterRule(_localctx, 254, RULE_sql_data_type);
    int _la;
    try {
      setState(1385);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case CHAR:
          enterOuterAlt(_localctx, 1);
          {
            setState(1347);
            match(CHAR);
            setState(1348);
            match(LP);
            setState(1349);
            precision_int();
            setState(1350);
            match(RP);
          }
          break;
        case VARCHAR:
          enterOuterAlt(_localctx, 2);
          {
            setState(1352);
            match(VARCHAR);
            setState(1357);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == LP) {
              {
                setState(1353);
                match(LP);
                setState(1354);
                precision_int();
                setState(1355);
                match(RP);
              }
            }
          }
          break;
        case DECIMAL:
          enterOuterAlt(_localctx, 3);
          {
            setState(1359);
            match(DECIMAL);
            setState(1364);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == MINUS || _la == DECIMAL_LITERAL) {
              {
                setState(1360);
                precision_int();
                setState(1361);
                match(COMMA);
                setState(1362);
                scale_int();
              }
            }
          }
          break;
        case TINYINT:
          enterOuterAlt(_localctx, 4);
          {
            setState(1366);
            match(TINYINT);
          }
          break;
        case SMALLINT:
          enterOuterAlt(_localctx, 5);
          {
            setState(1367);
            match(SMALLINT);
          }
          break;
        case INTEGER:
          enterOuterAlt(_localctx, 6);
          {
            setState(1368);
            match(INTEGER);
          }
          break;
        case BIGINT:
          enterOuterAlt(_localctx, 7);
          {
            setState(1369);
            match(BIGINT);
          }
          break;
        case FLOAT:
          enterOuterAlt(_localctx, 8);
          {
            setState(1370);
            match(FLOAT);
          }
          break;
        case DOUBLE:
          enterOuterAlt(_localctx, 9);
          {
            setState(1371);
            match(DOUBLE);
          }
          break;
        case TIMESTAMP:
          enterOuterAlt(_localctx, 10);
          {
            setState(1372);
            match(TIMESTAMP);
          }
          break;
        case DATE:
          enterOuterAlt(_localctx, 11);
          {
            setState(1373);
            match(DATE);
          }
          break;
        case TIME:
          enterOuterAlt(_localctx, 12);
          {
            setState(1374);
            match(TIME);
          }
          break;
        case BINARY:
          enterOuterAlt(_localctx, 13);
          {
            setState(1375);
            match(BINARY);
            setState(1376);
            match(LP);
            setState(1377);
            precision_int();
            setState(1378);
            match(RP);
          }
          break;
        case VARBINARY:
          enterOuterAlt(_localctx, 14);
          {
            setState(1380);
            match(VARBINARY);
            setState(1381);
            match(LP);
            setState(1382);
            precision_int();
            setState(1383);
            match(RP);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Hbase_data_typeContext extends ParserRuleContext {
    public TerminalNode UNSIGNED_TIMESTAMP() {
      return getToken(PhoenixParser.UNSIGNED_TIMESTAMP, 0);
    }

    public TerminalNode UNSIGNED_DATE() {
      return getToken(PhoenixParser.UNSIGNED_DATE, 0);
    }

    public TerminalNode UNSIGNED_TIME() {
      return getToken(PhoenixParser.UNSIGNED_TIME, 0);
    }

    public TerminalNode UNSIGNED_TINYINT() {
      return getToken(PhoenixParser.UNSIGNED_TINYINT, 0);
    }

    public TerminalNode UNSIGNED_SMALLINT() {
      return getToken(PhoenixParser.UNSIGNED_SMALLINT, 0);
    }

    public TerminalNode UNSIGNED_INT() {
      return getToken(PhoenixParser.UNSIGNED_INT, 0);
    }

    public TerminalNode UNSIGNED_LONG() {
      return getToken(PhoenixParser.UNSIGNED_LONG, 0);
    }

    public TerminalNode UNSIGNED_FLOAT() {
      return getToken(PhoenixParser.UNSIGNED_FLOAT, 0);
    }

    public TerminalNode UNSIGNED_DOUBLE() {
      return getToken(PhoenixParser.UNSIGNED_DOUBLE, 0);
    }

    public Hbase_data_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_hbase_data_type;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).enterHbase_data_type(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof PhoenixParserListener)
        ((PhoenixParserListener) listener).exitHbase_data_type(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof PhoenixParserVisitor)
        return ((PhoenixParserVisitor<? extends T>) visitor).visitHbase_data_type(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Hbase_data_typeContext hbase_data_type() throws RecognitionException {
    Hbase_data_typeContext _localctx = new Hbase_data_typeContext(_ctx, getState());
    enterRule(_localctx, 256, RULE_hbase_data_type);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1387);
        _la = _input.LA(1);
        if (!(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 511L) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 107:
        return expression_sempred((ExpressionContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 20);
      case 1:
        return precpred(_ctx, 19);
      case 2:
        return precpred(_ctx, 18);
      case 3:
        return precpred(_ctx, 17);
      case 4:
        return precpred(_ctx, 15);
      case 5:
        return precpred(_ctx, 12);
      case 6:
        return precpred(_ctx, 8);
      case 7:
        return precpred(_ctx, 7);
      case 8:
        return precpred(_ctx, 16);
      case 9:
        return precpred(_ctx, 14);
      case 10:
        return precpred(_ctx, 13);
    }
    return true;
  }

  public static final String _serializedATN =
      "\u0004\u0001\u00c5\u056e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"
          + "\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"
          + "\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"
          + "\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"
          + "\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"
          + "\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"
          + "\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"
          + "\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"
          + "\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"
          + "\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"
          + "\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"
          + "\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"
          + "\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"
          + ",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"
          + "1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"
          + "6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"
          + ";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"
          + "@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"
          + "E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"
          + "J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"
          + "O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"
          + "T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"
          + "Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"
          + "^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"
          + "c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"
          + "h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"
          + "m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"
          + "r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"
          + "w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"
          + "|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"
          + "\u0080\u0001\u0000\u0005\u0000\u0104\b\u0000\n\u0000\f\u0000\u0107\t\u0000"
          + "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u010d\b\u0001"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0112\b\u0002\u0001\u0003"
          + "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"
          + "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"
          + "\u0001\u0003\u0003\u0003\u0122\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"
          + "\u0001\u0004\u0003\u0004\u0128\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"
          + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"
          + "\u0003\u0005\u0133\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0137\b"
          + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u013c\b\u0006\u0001"
          + "\u0006\u0001\u0006\u0003\u0006\u0140\b\u0006\u0001\u0006\u0001\u0006\u0001"
          + "\u0006\u0003\u0006\u0145\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"
          + "\u0006\u014a\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u014f"
          + "\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"
          + "\b\u0001\b\u0003\b\u0158\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"
          + "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0166\b\b\u0001"
          + "\t\u0001\t\u0003\t\u016a\b\t\u0001\t\u0001\t\u0003\t\u016e\b\t\u0001\t"
          + "\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"
          + "\t\u0001\t\u0003\t\u017b\b\t\u0001\t\u0003\t\u017e\b\t\u0001\t\u0003\t"
          + "\u0181\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0186\b\t\u0001\n\u0001\n\u0001"
          + "\n\u0003\n\u018b\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"
          + "\u0003\u000b\u0192\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"
          + "\u0197\b\u000b\u0001\u000b\u0003\u000b\u019a\b\u000b\u0001\u000b\u0001"
          + "\u000b\u0003\u000b\u019e\b\u000b\u0001\u000b\u0003\u000b\u01a1\b\u000b"
          + "\u0001\u000b\u0001\u000b\u0003\u000b\u01a5\b\u000b\u0001\u000b\u0001\u000b"
          + "\u0003\u000b\u01a9\b\u000b\u0001\u000b\u0003\u000b\u01ac\b\u000b\u0001"
          + "\u000b\u0001\u000b\u0003\u000b\u01b0\b\u000b\u0001\f\u0001\f\u0001\f\u0003"
          + "\f\u01b5\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u01bb\b\f\u0001\f"
          + "\u0001\f\u0003\f\u01bf\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0003\f\u01c7\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u01cc\b\r\u0001\r"
          + "\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u01d3\b\r\u0001\r\u0001\r\u0001"
          + "\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u01dc\b\r\u0003\r\u01de\b\r"
          + "\u0001\r\u0003\r\u01e1\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"
          + "\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"
          + "\u0001\u000f\u0005\u000f\u01ee\b\u000f\n\u000f\f\u000f\u01f1\t\u000f\u0001"
          + "\u0010\u0001\u0010\u0003\u0010\u01f5\b\u0010\u0001\u0010\u0003\u0010\u01f8"
          + "\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"
          + "\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0204"
          + "\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0209\b\u0015"
          + "\u0005\u0015\u020b\b\u0015\n\u0015\f\u0015\u020e\t\u0015\u0001\u0016\u0001"
          + "\u0016\u0001\u0016\u0005\u0016\u0213\b\u0016\n\u0016\f\u0016\u0216\t\u0016"
          + "\u0001\u0017\u0001\u0017\u0003\u0017\u021a\b\u0017\u0001\u0018\u0001\u0018"
          + "\u0001\u0019\u0004\u0019\u021f\b\u0019\u000b\u0019\f\u0019\u0220\u0001"
          + "\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0226\b\u001a\n\u001a\f\u001a"
          + "\u0229\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u022e\b"
          + "\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"
          + "\u001c\u0001\u001c\u0005\u001c\u0237\b\u001c\n\u001c\f\u001c\u023a\t\u001c"
          + "\u0001\u001d\u0001\u001d\u0003\u001d\u023e\b\u001d\u0001\u001d\u0001\u001d"
          + "\u0001\u001d\u0003\u001d\u0243\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"
          + "\u0003\u001d\u0248\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"
          + "\u024d\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 "
          + "\u0001 \u0001 \u0003 \u0256\b \u0001 \u0001 \u0003 \u025a\b \u0001!\u0001"
          + "!\u0001!\u0003!\u025f\b!\u0001!\u0001!\u0003!\u0263\b!\u0001\"\u0001\""
          + "\u0001\"\u0003\"\u0268\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003"
          + "#\u026f\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u0276\b$\u0001$\u0001"
          + "$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u027f\b%\u0001%\u0001%\u0001"
          + "&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"
          + ")\u0001*\u0001*\u0001*\u0003*\u0291\b*\u0001*\u0001*\u0001+\u0001+\u0001"
          + "+\u0003+\u0298\b+\u0001,\u0001,\u0001,\u0001,\u0003,\u029e\b,\u0001-\u0001"
          + "-\u0001-\u0001-\u0003-\u02a4\b-\u0001-\u0001-\u0003-\u02a8\b-\u0001.\u0001"
          + ".\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u00010\u0001"
          + "0\u00010\u00010\u00010\u00030\u02b9\b0\u00010\u00010\u00010\u00011\u0001"
          + "1\u00011\u00012\u00012\u00012\u00032\u02c4\b2\u00012\u00012\u00032\u02c8"
          + "\b2\u00012\u00012\u00013\u00013\u00033\u02ce\b3\u00013\u00013\u00033\u02d2"
          + "\b3\u00013\u00013\u00014\u00014\u00014\u00014\u00034\u02da\b4\u00015\u0001"
          + "5\u00016\u00016\u00017\u00017\u00018\u00018\u00018\u00038\u02e5\b8\u0001"
          + "8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00058\u02ef\b8\n8"
          + "\f8\u02f2\t8\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u02fa\b"
          + "9\u00019\u00019\u00039\u02fe\b9\u00019\u00019\u00019\u00019\u00019\u0005"
          + "9\u0305\b9\n9\f9\u0308\t9\u00019\u00019\u00019\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00019\u00039\u0314\b9\u00039\u0316\b9\u0001:\u0001:\u0001"
          + ":\u0005:\u031b\b:\n:\f:\u031e\t:\u0001;\u0001;\u0001;\u0005;\u0323\b;"
          + "\n;\f;\u0326\t;\u0001<\u0001<\u0003<\u032a\b<\u0001<\u0001<\u0001<\u0001"
          + "<\u0001<\u0003<\u0331\b<\u0001<\u0001<\u0003<\u0335\b<\u0001<\u0001<\u0001"
          + "=\u0001=\u0003=\u033b\b=\u0001=\u0001=\u0001=\u0003=\u0340\b=\u0001=\u0003"
          + "=\u0343\b=\u0001=\u0003=\u0346\b=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001"
          + "?\u0001?\u0001@\u0001@\u0001@\u0005@\u0352\b@\n@\f@\u0355\t@\u0001A\u0001"
          + "A\u0001A\u0001B\u0001B\u0003B\u035c\bB\u0001B\u0003B\u035f\bB\u0001B\u0003"
          + "B\u0362\bB\u0001B\u0001B\u0001B\u0003B\u0367\bB\u0003B\u0369\bB\u0001"
          + "B\u0001B\u0001B\u0001B\u0003B\u036f\bB\u0001B\u0001B\u0003B\u0373\bB\u0001"
          + "C\u0001C\u0003C\u0377\bC\u0001C\u0003C\u037a\bC\u0001C\u0001C\u0001C\u0005"
          + "C\u037f\bC\nC\fC\u0382\tC\u0001C\u0001C\u0001C\u0003C\u0387\bC\u0001C"
          + "\u0003C\u038a\bC\u0001C\u0001C\u0001C\u0001C\u0001C\u0005C\u0391\bC\n"
          + "C\fC\u0394\tC\u0003C\u0396\bC\u0001C\u0001C\u0003C\u039a\bC\u0001D\u0004"
          + "D\u039d\bD\u000bD\fD\u039e\u0001E\u0001E\u0001E\u0001E\u0001F\u0004F\u03a6"
          + "\bF\u000bF\fF\u03a7\u0001G\u0003G\u03ab\bG\u0001G\u0001G\u0001G\u0001"
          + "G\u0001G\u0001H\u0001H\u0001I\u0001I\u0003I\u03b6\bI\u0001J\u0001J\u0003"
          + "J\u03ba\bJ\u0001J\u0001J\u0003J\u03be\bJ\u0001K\u0001K\u0001L\u0001L\u0001"
          + "M\u0001M\u0001M\u0003M\u03c7\bM\u0001N\u0001N\u0001O\u0001O\u0001O\u0001"
          + "O\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u03d6\bP\u0001"
          + "Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0001T\u0001T\u0001U\u0001U\u0001"
          + "V\u0001V\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"
          + "X\u0003X\u03ed\bX\u0001X\u0003X\u03f0\bX\u0003X\u03f2\bX\u0001Y\u0001"
          + "Y\u0001Z\u0001Z\u0001[\u0001[\u0001\\\u0001\\\u0001]\u0001]\u0003]\u03fe"
          + "\b]\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u0405\b^\u0001^\u0003^\u0408"
          + "\b^\u0003^\u040a\b^\u0001_\u0001_\u0003_\u040e\b_\u0001_\u0003_\u0411"
          + "\b_\u0001_\u0001_\u0001_\u0001_\u0003_\u0417\b_\u0001_\u0001_\u0003_\u041b"
          + "\b_\u0001_\u0001_\u0001_\u0001_\u0001_\u0003_\u0422\b_\u0001`\u0001`\u0001"
          + "a\u0001a\u0001b\u0001b\u0001c\u0001c\u0001d\u0001d\u0001d\u0003d\u042f"
          + "\bd\u0001d\u0003d\u0432\bd\u0001d\u0001d\u0003d\u0436\bd\u0001d\u0001"
          + "d\u0001d\u0003d\u043b\bd\u0001d\u0003d\u043e\bd\u0003d\u0440\bd\u0001"
          + "e\u0001e\u0001e\u0003e\u0445\be\u0001e\u0001e\u0001f\u0001f\u0001g\u0001"
          + "g\u0003g\u044d\bg\u0001g\u0001g\u0001g\u0001g\u0001g\u0003g\u0454\bg\u0003"
          + "g\u0456\bg\u0001h\u0001h\u0001i\u0001i\u0001j\u0001j\u0001j\u0003j\u045f"
          + "\bj\u0003j\u0461\bj\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0003k\u0469"
          + "\bk\u0001k\u0001k\u0001k\u0003k\u046e\bk\u0001k\u0001k\u0001k\u0001k\u0003"
          + "k\u0474\bk\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001"
          + "k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0003"
          + "k\u0488\bk\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001"
          + "k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0003"
          + "k\u049c\bk\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001"
          + "k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001"
          + "k\u0001k\u0001k\u0003k\u04b3\bk\u0001k\u0001k\u0001k\u0003k\u04b8\bk\u0001"
          + "k\u0001k\u0001k\u0001k\u0003k\u04be\bk\u0001k\u0001k\u0005k\u04c2\bk\n"
          + "k\fk\u04c5\tk\u0001l\u0001l\u0001m\u0001m\u0001m\u0005m\u04cc\bm\nm\f"
          + "m\u04cf\tm\u0001n\u0001n\u0001n\u0001n\u0003n\u04d5\bn\u0001o\u0001o\u0001"
          + "p\u0001p\u0003p\u04db\bp\u0001q\u0003q\u04de\bq\u0001q\u0001q\u0001r\u0003"
          + "r\u04e3\br\u0001r\u0001r\u0001r\u0003r\u04e8\br\u0001s\u0001s\u0001t\u0001"
          + "t\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0005"
          + "t\u04f7\bt\nt\ft\u04fa\tt\u0001t\u0001t\u0003t\u04fe\bt\u0001t\u0001t"
          + "\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001"
          + "u\u0003u\u050c\bu\u0001u\u0001u\u0003u\u0510\bu\u0001u\u0001u\u0001v\u0001"
          + "v\u0001v\u0001v\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001"
          + "x\u0001x\u0001x\u0001x\u0001x\u0003x\u0524\bx\u0001x\u0001x\u0001x\u0001"
          + "y\u0001y\u0001y\u0003y\u052c\by\u0001y\u0001y\u0001z\u0001z\u0001{\u0001"
          + "{\u0001{\u0001{\u0001{\u0005{\u0537\b{\n{\f{\u053a\t{\u0001{\u0001{\u0001"
          + "|\u0001|\u0001}\u0001}\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f"
          + "\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f"
          + "\u0001\u007f\u0003\u007f\u054e\b\u007f\u0001\u007f\u0001\u007f\u0001\u007f"
          + "\u0001\u007f\u0001\u007f\u0003\u007f\u0555\b\u007f\u0001\u007f\u0001\u007f"
          + "\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f"
          + "\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f"
          + "\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f"
          + "\u056a\b\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0000\u0001\u00d6\u0081"
          + "\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"
          + "\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"
          + "\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"
          + "\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"
          + "\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"
          + "\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"
          + "\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"
          + "\u00fc\u00fe\u0100\u0000\u0015\u0002\u0000\u007f\u007f\u009f\u009f\u0004"
          + "\u0000%%ii\u0092\u0092\u0095\u0095\u0003\u0000\u0002\u0002\u0016\u0016"
          + "@@\u0002\u0000\u0002\u0002&&\u0002\u0000mmoo\u0002\u000000HH\u0002\u0000"
          + "00SS\u0002\u0000hhvv\u0003\u0000@@VV\u0097\u0098\u0003\u0000UUXX\u0099"
          + "\u0099\u0002\u0000WWqq\u0002\u0000\t\t$$\u0002\u0000\u0002\u0002\u0005"
          + "\u0005\u0002\u0000KKll\u0001\u0000\u00a9\u00ab\u0001\u0000\u00ac\u00ad"
          + "\u0002\u0000<<LL\u0001\u0000\u00b1\u00b7\u0002\u0000..\u0087\u0087\u0002"
          + "\u0000\u001b\u001bSS\u0001\u0000\u0089\u0091\u05d0\u0000\u0105\u0001\u0000"
          + "\u0000\u0000\u0002\u010a\u0001\u0000\u0000\u0000\u0004\u0111\u0001\u0000"
          + "\u0000\u0000\u0006\u0121\u0001\u0000\u0000\u0000\b\u0127\u0001\u0000\u0000"
          + "\u0000\n\u0132\u0001\u0000\u0000\u0000\f\u0134\u0001\u0000\u0000\u0000"
          + "\u000e\u014b\u0001\u0000\u0000\u0000\u0010\u0155\u0001\u0000\u0000\u0000"
          + "\u0012\u0167\u0001\u0000\u0000\u0000\u0014\u0187\u0001\u0000\u0000\u0000"
          + "\u0016\u018e\u0001\u0000\u0000\u0000\u0018\u01b1\u0001\u0000\u0000\u0000"
          + "\u001a\u01c8\u0001\u0000\u0000\u0000\u001c\u01e2\u0001\u0000\u0000\u0000"
          + "\u001e\u01ea\u0001\u0000\u0000\u0000 \u01f2\u0001\u0000\u0000\u0000\""
          + "\u01f9\u0001\u0000\u0000\u0000$\u01fb\u0001\u0000\u0000\u0000&\u01fd\u0001"
          + "\u0000\u0000\u0000(\u01ff\u0001\u0000\u0000\u0000*\u0201\u0001\u0000\u0000"
          + "\u0000,\u020f\u0001\u0000\u0000\u0000.\u0219\u0001\u0000\u0000\u00000"
          + "\u021b\u0001\u0000\u0000\u00002\u021e\u0001\u0000\u0000\u00004\u0222\u0001"
          + "\u0000\u0000\u00006\u022d\u0001\u0000\u0000\u00008\u0233\u0001\u0000\u0000"
          + "\u0000:\u023b\u0001\u0000\u0000\u0000<\u024e\u0001\u0000\u0000\u0000>"
          + "\u0250\u0001\u0000\u0000\u0000@\u0252\u0001\u0000\u0000\u0000B\u025b\u0001"
          + "\u0000\u0000\u0000D\u0264\u0001\u0000\u0000\u0000F\u026b\u0001\u0000\u0000"
          + "\u0000H\u0272\u0001\u0000\u0000\u0000J\u027b\u0001\u0000\u0000\u0000L"
          + "\u0282\u0001\u0000\u0000\u0000N\u0284\u0001\u0000\u0000\u0000P\u0286\u0001"
          + "\u0000\u0000\u0000R\u0289\u0001\u0000\u0000\u0000T\u0290\u0001\u0000\u0000"
          + "\u0000V\u0294\u0001\u0000\u0000\u0000X\u0299\u0001\u0000\u0000\u0000Z"
          + "\u029f\u0001\u0000\u0000\u0000\\\u02a9\u0001\u0000\u0000\u0000^\u02af"
          + "\u0001\u0000\u0000\u0000`\u02b3\u0001\u0000\u0000\u0000b\u02bd\u0001\u0000"
          + "\u0000\u0000d\u02c0\u0001\u0000\u0000\u0000f\u02cb\u0001\u0000\u0000\u0000"
          + "h\u02d5\u0001\u0000\u0000\u0000j\u02db\u0001\u0000\u0000\u0000l\u02dd"
          + "\u0001\u0000\u0000\u0000n\u02df\u0001\u0000\u0000\u0000p\u02e4\u0001\u0000"
          + "\u0000\u0000r\u02f3\u0001\u0000\u0000\u0000t\u0317\u0001\u0000\u0000\u0000"
          + "v\u031f\u0001\u0000\u0000\u0000x\u0327\u0001\u0000\u0000\u0000z\u0338"
          + "\u0001\u0000\u0000\u0000|\u0347\u0001\u0000\u0000\u0000~\u034b\u0001\u0000"
          + "\u0000\u0000\u0080\u034e\u0001\u0000\u0000\u0000\u0082\u0356\u0001\u0000"
          + "\u0000\u0000\u0084\u0359\u0001\u0000\u0000\u0000\u0086\u0374\u0001\u0000"
          + "\u0000\u0000\u0088\u039c\u0001\u0000\u0000\u0000\u008a\u03a0\u0001\u0000"
          + "\u0000\u0000\u008c\u03a5\u0001\u0000\u0000\u0000\u008e\u03aa\u0001\u0000"
          + "\u0000\u0000\u0090\u03b1\u0001\u0000\u0000\u0000\u0092\u03b5\u0001\u0000"
          + "\u0000\u0000\u0094\u03b7\u0001\u0000\u0000\u0000\u0096\u03bf\u0001\u0000"
          + "\u0000\u0000\u0098\u03c1\u0001\u0000\u0000\u0000\u009a\u03c6\u0001\u0000"
          + "\u0000\u0000\u009c\u03c8\u0001\u0000\u0000\u0000\u009e\u03ca\u0001\u0000"
          + "\u0000\u0000\u00a0\u03d5\u0001\u0000\u0000\u0000\u00a2\u03d7\u0001\u0000"
          + "\u0000\u0000\u00a4\u03d9\u0001\u0000\u0000\u0000\u00a6\u03db\u0001\u0000"
          + "\u0000\u0000\u00a8\u03dd\u0001\u0000\u0000\u0000\u00aa\u03df\u0001\u0000"
          + "\u0000\u0000\u00ac\u03e1\u0001\u0000\u0000\u0000\u00ae\u03e3\u0001\u0000"
          + "\u0000\u0000\u00b0\u03f1\u0001\u0000\u0000\u0000\u00b2\u03f3\u0001\u0000"
          + "\u0000\u0000\u00b4\u03f5\u0001\u0000\u0000\u0000\u00b6\u03f7\u0001\u0000"
          + "\u0000\u0000\u00b8\u03f9\u0001\u0000\u0000\u0000\u00ba\u03fd\u0001\u0000"
          + "\u0000\u0000\u00bc\u0409\u0001\u0000\u0000\u0000\u00be\u040b\u0001\u0000"
          + "\u0000\u0000\u00c0\u0423\u0001\u0000\u0000\u0000\u00c2\u0425\u0001\u0000"
          + "\u0000\u0000\u00c4\u0427\u0001\u0000\u0000\u0000\u00c6\u0429\u0001\u0000"
          + "\u0000\u0000\u00c8\u042b\u0001\u0000\u0000\u0000\u00ca\u0444\u0001\u0000"
          + "\u0000\u0000\u00cc\u0448\u0001\u0000\u0000\u0000\u00ce\u044c\u0001\u0000"
          + "\u0000\u0000\u00d0\u0457\u0001\u0000\u0000\u0000\u00d2\u0459\u0001\u0000"
          + "\u0000\u0000\u00d4\u0460\u0001\u0000\u0000\u0000\u00d6\u0487\u0001\u0000"
          + "\u0000\u0000\u00d8\u04c6\u0001\u0000\u0000\u0000\u00da\u04c8\u0001\u0000"
          + "\u0000\u0000\u00dc\u04d4\u0001\u0000\u0000\u0000\u00de\u04d6\u0001\u0000"
          + "\u0000\u0000\u00e0\u04da\u0001\u0000\u0000\u0000\u00e2\u04dd\u0001\u0000"
          + "\u0000\u0000\u00e4\u04e2\u0001\u0000\u0000\u0000\u00e6\u04e9\u0001\u0000"
          + "\u0000\u0000\u00e8\u04eb\u0001\u0000\u0000\u0000\u00ea\u0501\u0001\u0000"
          + "\u0000\u0000\u00ec\u0513\u0001\u0000\u0000\u0000\u00ee\u0517\u0001\u0000"
          + "\u0000\u0000\u00f0\u051e\u0001\u0000\u0000\u0000\u00f2\u052b\u0001\u0000"
          + "\u0000\u0000\u00f4\u052f\u0001\u0000\u0000\u0000\u00f6\u0531\u0001\u0000"
          + "\u0000\u0000\u00f8\u053d\u0001\u0000\u0000\u0000\u00fa\u053f\u0001\u0000"
          + "\u0000\u0000\u00fc\u0541\u0001\u0000\u0000\u0000\u00fe\u0569\u0001\u0000"
          + "\u0000\u0000\u0100\u056b\u0001\u0000\u0000\u0000\u0102\u0104\u0003\u0002"
          + "\u0001\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000"
          + "\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"
          + "\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"
          + "\u0000\u0000\u0108\u0109\u0005\u0000\u0000\u0001\u0109\u0001\u0001\u0000"
          + "\u0000\u0000\u010a\u010c\u0003\u0004\u0002\u0000\u010b\u010d\u0005\u00a3"
          + "\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"
          + "\u0000\u0000\u010d\u0003\u0001\u0000\u0000\u0000\u010e\u0112\u0003\u0006"
          + "\u0003\u0000\u010f\u0112\u0003\b\u0004\u0000\u0110\u0112\u0003\n\u0005"
          + "\u0000\u0111\u010e\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000"
          + "\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0005\u0001\u0000\u0000"
          + "\u0000\u0113\u0122\u0003\f\u0006\u0000\u0114\u0122\u0003\u000e\u0007\u0000"
          + "\u0115\u0122\u0003\u0010\b\u0000\u0116\u0122\u0003\u0012\t\u0000\u0117"
          + "\u0122\u0003\u0014\n\u0000\u0118\u0122\u0003\u0016\u000b\u0000\u0119\u0122"
          + "\u0003\u0018\f\u0000\u011a\u0122\u0003\u001a\r\u0000\u011b\u0122\u0003"
          + "J%\u0000\u011c\u0122\u0003H$\u0000\u011d\u0122\u0003D\"\u0000\u011e\u0122"
          + "\u0003F#\u0000\u011f\u0122\u0003@ \u0000\u0120\u0122\u0003B!\u0000\u0121"
          + "\u0113\u0001\u0000\u0000\u0000\u0121\u0114\u0001\u0000\u0000\u0000\u0121"
          + "\u0115\u0001\u0000\u0000\u0000\u0121\u0116\u0001\u0000\u0000\u0000\u0121"
          + "\u0117\u0001\u0000\u0000\u0000\u0121\u0118\u0001\u0000\u0000\u0000\u0121"
          + "\u0119\u0001\u0000\u0000\u0000\u0121\u011a\u0001\u0000\u0000\u0000\u0121"
          + "\u011b\u0001\u0000\u0000\u0000\u0121\u011c\u0001\u0000\u0000\u0000\u0121"
          + "\u011d\u0001\u0000\u0000\u0000\u0121\u011e\u0001\u0000\u0000\u0000\u0121"
          + "\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122"
          + "\u0007\u0001\u0000\u0000\u0000\u0123\u0128\u0003\u0084B\u0000\u0124\u0128"
          + "\u0003r9\u0000\u0125\u0128\u0003x<\u0000\u0126\u0128\u0003z=\u0000\u0127"
          + "\u0123\u0001\u0000\u0000\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0127"
          + "\u0125\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128"
          + "\t\u0001\u0000\u0000\u0000\u0129\u0133\u0003V+\u0000\u012a\u0133\u0003"
          + "X,\u0000\u012b\u0133\u0003Z-\u0000\u012c\u0133\u0003\\.\u0000\u012d\u0133"
          + "\u0003`0\u0000\u012e\u0133\u0003b1\u0000\u012f\u0133\u0003^/\u0000\u0130"
          + "\u0133\u0003d2\u0000\u0131\u0133\u0003f3\u0000\u0132\u0129\u0001\u0000"
          + "\u0000\u0000\u0132\u012a\u0001\u0000\u0000\u0000\u0132\u012b\u0001\u0000"
          + "\u0000\u0000\u0132\u012c\u0001\u0000\u0000\u0000\u0132\u012d\u0001\u0000"
          + "\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u0132\u012f\u0001\u0000"
          + "\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000"
          + "\u0000\u0000\u0133\u000b\u0001\u0000\u0000\u0000\u0134\u0136\u0005\u0003"
          + "\u0000\u0000\u0135\u0137\u0007\u0000\u0000\u0000\u0136\u0135\u0001\u0000"
          + "\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"
          + "\u0000\u0000\u0138\u0149\u0003T*\u0000\u0139\u013b\u0005\u0001\u0000\u0000"
          + "\u013a\u013c\u0003R)\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c"
          + "\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f"
          + "\u0003v;\u0000\u013e\u0140\u00034\u001a\u0000\u013f\u013e\u0001\u0000"
          + "\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u014a\u0001\u0000"
          + "\u0000\u0000\u0141\u0142\u0005(\u0000\u0000\u0142\u0144\u0005\u0016\u0000"
          + "\u0000\u0143\u0145\u0003P(\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0144"
          + "\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146"
          + "\u014a\u0003t:\u0000\u0147\u0148\u0005u\u0000\u0000\u0148\u014a\u0003"
          + "4\u001a\u0000\u0149\u0139\u0001\u0000\u0000\u0000\u0149\u0141\u0001\u0000"
          + "\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\r\u0001\u0000\u0000"
          + "\u0000\u014b\u014c\u0005\u0003\u0000\u0000\u014c\u014e\u0005@\u0000\u0000"
          + "\u014d\u014f\u0003P(\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f"
          + "\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151"
          + "\u0003L&\u0000\u0151\u0152\u0005^\u0000\u0000\u0152\u0153\u0003T*\u0000"
          + "\u0153\u0154\u0007\u0001\u0000\u0000\u0154\u000f\u0001\u0000\u0000\u0000"
          + "\u0155\u0157\u0005\u001a\u0000\u0000\u0156\u0158\u0005\u0081\u0000\u0000"
          + "\u0157\u0156\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000"
          + "\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u00056\u0000\u0000\u015a"
          + "\u015b\u0003N\'\u0000\u015b\u015c\u0005\u00a7\u0000\u0000\u015c\u015d"
          + "\u00038\u001c\u0000\u015d\u015e\u0005\u00a8\u0000\u0000\u015e\u015f\u0005"
          + "j\u0000\u0000\u015f\u0160\u0003\u00ceg\u0000\u0160\u0161\u0005\b\u0000"
          + "\u0000\u0161\u0165\u0003<\u001e\u0000\u0162\u0163\u0005\u009a\u0000\u0000"
          + "\u0163\u0164\u0005E\u0000\u0000\u0164\u0166\u0003>\u001f\u0000\u0165\u0162"
          + "\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0011"
          + "\u0001\u0000\u0000\u0000\u0167\u0169\u0005\u001a\u0000\u0000\u0168\u016a"
          + "\u0005N\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001"
          + "\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0005"
          + "@\u0000\u0000\u016c\u016e\u0003R)\u0000\u016d\u016c\u0001\u0000\u0000"
          + "\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000"
          + "\u0000\u016f\u0170\u0003L&\u0000\u0170\u0171\u0005^\u0000\u0000\u0171"
          + "\u0172\u0003T*\u0000\u0172\u0173\u0005\u00a7\u0000\u0000\u0173\u0174\u0003"
          + "*\u0015\u0000\u0174\u017a\u0005\u00a8\u0000\u0000\u0175\u0176\u0005>\u0000"
          + "\u0000\u0176\u0177\u0005\u00a7\u0000\u0000\u0177\u0178\u0003t:\u0000\u0178"
          + "\u0179\u0005\u00a8\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a"
          + "\u0175\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b"
          + "\u017d\u0001\u0000\u0000\u0000\u017c\u017e\u0005\n\u0000\u0000\u017d\u017c"
          + "\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0180"
          + "\u0001\u0000\u0000\u0000\u017f\u0181\u00030\u0018\u0000\u0180\u017f\u0001"
          + "\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0185\u0001"
          + "\u0000\u0000\u0000\u0182\u0183\u0005y\u0000\u0000\u0183\u0184\u0005^\u0000"
          + "\u0000\u0184\u0186\u0003,\u0016\u0000\u0185\u0182\u0001\u0000\u0000\u0000"
          + "\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0013\u0001\u0000\u0000\u0000"
          + "\u0187\u0188\u0005\u001a\u0000\u0000\u0188\u018a\u0005p\u0000\u0000\u0189"
          + "\u018b\u0003R)\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001"
          + "\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0003"
          + "\u00c4b\u0000\u018d\u0015\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u001a"
          + "\u0000\u0000\u018f\u0191\u0005s\u0000\u0000\u0190\u0192\u0003R)\u0000"
          + "\u0191\u0190\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000"
          + "\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0199\u0003\u00f2y\u0000\u0194"
          + "\u0196\u0005z\u0000\u0000\u0195\u0197\u0005\u00a2\u0000\u0000\u0196\u0195"
          + "\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198"
          + "\u0001\u0000\u0000\u0000\u0198\u019a\u0003\u0092I\u0000\u0199\u0194\u0001"
          + "\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u01a0\u0001"
          + "\u0000\u0000\u0000\u019b\u019d\u0005?\u0000\u0000\u019c\u019e\u0005\u000f"
          + "\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000"
          + "\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0003\u0092"
          + "I\u0000\u01a0\u019b\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000"
          + "\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005R\u0000\u0000"
          + "\u01a3\u01a5\u0003\u0092I\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4"
          + "\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6"
          + "\u01a7\u0005P\u0000\u0000\u01a7\u01a9\u0003\u0092I\u0000\u01a8\u01a6\u0001"
          + "\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001"
          + "\u0000\u0000\u0000\u01aa\u01ac\u0005\u001d\u0000\u0000\u01ab\u01aa\u0001"
          + "\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01af\u0001"
          + "\u0000\u0000\u0000\u01ad\u01ae\u0005\u0010\u0000\u0000\u01ae\u01b0\u0003"
          + "\u0092I\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"
          + "\u0000\u0000\u01b0\u0017\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005\u001a"
          + "\u0000\u0000\u01b2\u01b4\u0005\u007f\u0000\u0000\u01b3\u01b5\u0003R)\u0000"
          + "\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000"
          + "\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0003T*\u0000\u01b7\u01b8"
          + "\u0005\u00a7\u0000\u0000\u01b8\u01ba\u0003v;\u0000\u01b9\u01bb\u0003\u001c"
          + "\u000e\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"
          + "\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be\u0005\u00a8"
          + "\u0000\u0000\u01bd\u01bf\u0003&\u0013\u0000\u01be\u01bd\u0001\u0000\u0000"
          + "\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c6\u0001\u0000\u0000"
          + "\u0000\u01c0\u01c1\u0005y\u0000\u0000\u01c1\u01c2\u0005^\u0000\u0000\u01c2"
          + "\u01c3\u0005\u00a7\u0000\u0000\u01c3\u01c4\u0003,\u0016\u0000\u01c4\u01c5"
          + "\u0005\u00a8\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c0"
          + "\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u0019"
          + "\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005\u001a\u0000\u0000\u01c9\u01cb"
          + "\u0005\u009f\u0000\u0000\u01ca\u01cc\u0003R)\u0000\u01cb\u01ca\u0001\u0000"
          + "\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000"
          + "\u0000\u0000\u01cd\u01d2\u0003$\u0012\u0000\u01ce\u01cf\u0005\u00a7\u0000"
          + "\u0000\u01cf\u01d0\u0003v;\u0000\u01d0\u01d1\u0005\u00a8\u0000\u0000\u01d1"
          + "\u01d3\u0001\u0000\u0000\u0000\u01d2\u01ce\u0001\u0000\u0000\u0000\u01d2"
          + "\u01d3\u0001\u0000\u0000\u0000\u01d3\u01dd\u0001\u0000\u0000\u0000\u01d4"
          + "\u01d5\u0005\b\u0000\u0000\u01d5\u01d6\u0005r\u0000\u0000\u01d6\u01d7"
          + "\u0005\u00a9\u0000\u0000\u01d7\u01d8\u00055\u0000\u0000\u01d8\u01db\u0003"
          + "(\u0014\u0000\u01d9\u01da\u0005\u00a1\u0000\u0000\u01da\u01dc\u0003\u00d6"
          + "k\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000"
          + "\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u01d4\u0001\u0000\u0000"
          + "\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000"
          + "\u0000\u01df\u01e1\u0003&\u0013\u0000\u01e0\u01df\u0001\u0000\u0000\u0000"
          + "\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u001b\u0001\u0000\u0000\u0000"
          + "\u01e2\u01e3\u0005\u0018\u0000\u0000\u01e3\u01e4\u0003\"\u0011\u0000\u01e4"
          + "\u01e5\u0005g\u0000\u0000\u01e5\u01e6\u0005G\u0000\u0000\u01e6\u01e7\u0005"
          + "\u00a7\u0000\u0000\u01e7\u01e8\u0003\u001e\u000f\u0000\u01e8\u01e9\u0005"
          + "\u00a8\u0000\u0000\u01e9\u001d\u0001\u0000\u0000\u0000\u01ea\u01ef\u0003"
          + " \u0010\u0000\u01eb\u01ec\u0005\u00a5\u0000\u0000\u01ec\u01ee\u0003 \u0010"
          + "\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000"
          + "\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000"
          + "\u0000\u01f0\u001f\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000"
          + "\u0000\u01f2\u01f4\u0003\u00ccf\u0000\u01f3\u01f5\u0003\u00d0h\u0000\u01f4"
          + "\u01f3\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5"
          + "\u01f7\u0001\u0000\u0000\u0000\u01f6\u01f8\u0005n\u0000\u0000\u01f7\u01f6"
          + "\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8!\u0001"
          + "\u0000\u0000\u0000\u01f9\u01fa\u0003\u00ba]\u0000\u01fa#\u0001\u0000\u0000"
          + "\u0000\u01fb\u01fc\u0003T*\u0000\u01fc%\u0001\u0000\u0000\u0000\u01fd"
          + "\u01fe\u00034\u001a\u0000\u01fe\'\u0001\u0000\u0000\u0000\u01ff\u0200"
          + "\u0003T*\u0000\u0200)\u0001\u0000\u0000\u0000\u0201\u0203\u0003\u00d6"
          + "k\u0000\u0202\u0204\u0003\u00d0h\u0000\u0203\u0202\u0001\u0000\u0000\u0000"
          + "\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u020c\u0001\u0000\u0000\u0000"
          + "\u0205\u0206\u0005\u00a5\u0000\u0000\u0206\u0208\u0003\u00d6k\u0000\u0207"
          + "\u0209\u0003\u00d0h\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209"
          + "\u0001\u0000\u0000\u0000\u0209\u020b\u0001\u0000\u0000\u0000\u020a\u0205"
          + "\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a"
          + "\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d+\u0001"
          + "\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0214\u0003"
          + ".\u0017\u0000\u0210\u0211\u0005\u00a5\u0000\u0000\u0211\u0213\u0003.\u0017"
          + "\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000\u0000"
          + "\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000"
          + "\u0000\u0215-\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000"
          + "\u0217\u021a\u0003\u00dcn\u0000\u0218\u021a\u0003\u009aM\u0000\u0219\u0217"
          + "\u0001\u0000\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u021a/\u0001"
          + "\u0000\u0000\u0000\u021b\u021c\u00032\u0019\u0000\u021c1\u0001\u0000\u0000"
          + "\u0000\u021d\u021f\u00034\u001a\u0000\u021e\u021d\u0001\u0000\u0000\u0000"
          + "\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000"
          + "\u0220\u0221\u0001\u0000\u0000\u0000\u02213\u0001\u0000\u0000\u0000\u0222"
          + "\u0227\u00036\u001b\u0000\u0223\u0224\u0005\u00a5\u0000\u0000\u0224\u0226"
          + "\u00036\u001b\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u0229\u0001"
          + "\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001"
          + "\u0000\u0000\u0000\u02285\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000"
          + "\u0000\u0000\u022a\u022b\u0003\u00b2Y\u0000\u022b\u022c\u0005\u00a6\u0000"
          + "\u0000\u022c\u022e\u0001\u0000\u0000\u0000\u022d\u022a\u0001\u0000\u0000"
          + "\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"
          + "\u0000\u022f\u0230\u0003\u00ba]\u0000\u0230\u0231\u0005\u00b1\u0000\u0000"
          + "\u0231\u0232\u0003\u00dcn\u0000\u02327\u0001\u0000\u0000\u0000\u0233\u0238"
          + "\u0003:\u001d\u0000\u0234\u0235\u0005\u00a5\u0000\u0000\u0235\u0237\u0003"
          + ":\u001d\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0237\u023a\u0001\u0000"
          + "\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000"
          + "\u0000\u0000\u02399\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000"
          + "\u0000\u023b\u023d\u0003\u00ceg\u0000\u023c\u023e\u0005\u0017\u0000\u0000"
          + "\u023d\u023c\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000"
          + "\u023e\u0242\u0001\u0000\u0000\u0000\u023f\u0240\u0005\"\u0000\u0000\u0240"
          + "\u0241\u0005\u00b1\u0000\u0000\u0241\u0243\u0003\u00deo\u0000\u0242\u023f"
          + "\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0247"
          + "\u0001\u0000\u0000\u0000\u0244\u0245\u0005R\u0000\u0000\u0245\u0246\u0005"
          + "\u00b1\u0000\u0000\u0246\u0248\u0003\u00deo\u0000\u0247\u0244\u0001\u0000"
          + "\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024c\u0001\u0000"
          + "\u0000\u0000\u0249\u024a\u0005P\u0000\u0000\u024a\u024b\u0005\u00b1\u0000"
          + "\u0000\u024b\u024d\u0003\u00deo\u0000\u024c\u0249\u0001\u0000\u0000\u0000"
          + "\u024c\u024d\u0001\u0000\u0000\u0000\u024d;\u0001\u0000\u0000\u0000\u024e"
          + "\u024f\u0003\u00deo\u0000\u024f=\u0001\u0000\u0000\u0000\u0250\u0251\u0003"
          + "\u00deo\u0000\u0251?\u0001\u0000\u0000\u0000\u0252\u0253\u0005(\u0000"
          + "\u0000\u0253\u0255\u0005\u007f\u0000\u0000\u0254\u0256\u0003P(\u0000\u0255"
          + "\u0254\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256"
          + "\u0257\u0001\u0000\u0000\u0000\u0257\u0259\u0003T*\u0000\u0258\u025a\u0005"
          + "\u0011\u0000\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u0259\u025a\u0001"
          + "\u0000\u0000\u0000\u025aA\u0001\u0000\u0000\u0000\u025b\u025c\u0005(\u0000"
          + "\u0000\u025c\u025e\u0005\u009f\u0000\u0000\u025d\u025f\u0003P(\u0000\u025e"
          + "\u025d\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f"
          + "\u0260\u0001\u0000\u0000\u0000\u0260\u0262\u0003T*\u0000\u0261\u0263\u0005"
          + "\u0011\u0000\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0262\u0263\u0001"
          + "\u0000\u0000\u0000\u0263C\u0001\u0000\u0000\u0000\u0264\u0265\u0005(\u0000"
          + "\u0000\u0265\u0267\u0005p\u0000\u0000\u0266\u0268\u0003P(\u0000\u0267"
          + "\u0266\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268"
          + "\u0269\u0001\u0000\u0000\u0000\u0269\u026a\u0003\u00c4b\u0000\u026aE\u0001"
          + "\u0000\u0000\u0000\u026b\u026c\u0005(\u0000\u0000\u026c\u026e\u0005s\u0000"
          + "\u0000\u026d\u026f\u0003P(\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026e"
          + "\u026f\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270"
          + "\u0271\u0003\u00f2y\u0000\u0271G\u0001\u0000\u0000\u0000\u0272\u0273\u0005"
          + "(\u0000\u0000\u0273\u0275\u0005@\u0000\u0000\u0274\u0276\u0003P(\u0000"
          + "\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000"
          + "\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u0003L&\u0000\u0278\u0279"
          + "\u0005^\u0000\u0000\u0279\u027a\u0003T*\u0000\u027aI\u0001\u0000\u0000"
          + "\u0000\u027b\u027c\u0005(\u0000\u0000\u027c\u027e\u00056\u0000\u0000\u027d"
          + "\u027f\u0003P(\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027e\u027f\u0001"
          + "\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0281\u0003"
          + "N\'\u0000\u0281K\u0001\u0000\u0000\u0000\u0282\u0283\u0003\u00ba]\u0000"
          + "\u0283M\u0001\u0000\u0000\u0000\u0284\u0285\u0003\u00ba]\u0000\u0285O"
          + "\u0001\u0000\u0000\u0000\u0286\u0287\u0005:\u0000\u0000\u0287\u0288\u0005"
          + ",\u0000\u0000\u0288Q\u0001\u0000\u0000\u0000\u0289\u028a\u0005:\u0000"
          + "\u0000\u028a\u028b\u0005Y\u0000\u0000\u028b\u028c\u0005,\u0000\u0000\u028c"
          + "S\u0001\u0000\u0000\u0000\u028d\u028e\u0003\u00c4b\u0000\u028e\u028f\u0005"
          + "\u00a6\u0000\u0000\u028f\u0291\u0001\u0000\u0000\u0000\u0290\u028d\u0001"
          + "\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0292\u0001"
          + "\u0000\u0000\u0000\u0292\u0293\u0003\u00c6c\u0000\u0293U\u0001\u0000\u0000"
          + "\u0000\u0294\u0297\u0005\u0096\u0000\u0000\u0295\u0298\u0003\u00c4b\u0000"
          + "\u0296\u0298\u0005!\u0000\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0297"
          + "\u0296\u0001\u0000\u0000\u0000\u0298W\u0001\u0000\u0000\u0000\u0299\u029d"
          + "\u0005-\u0000\u0000\u029a\u029e\u0003\u0084B\u0000\u029b\u029e\u0003x"
          + "<\u0000\u029c\u029e\u0003z=\u0000\u029d\u029a\u0001\u0000\u0000\u0000"
          + "\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029c\u0001\u0000\u0000\u0000"
          + "\u029eY\u0001\u0000\u0000\u0000\u029f\u02a0\u0005\u0093\u0000\u0000\u02a0"
          + "\u02a1\u0005{\u0000\u0000\u02a1\u02a3\u0003T*\u0000\u02a2\u02a4\u0007"
          + "\u0002\u0000\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001"
          + "\u0000\u0000\u0000\u02a4\u02a7\u0001\u0000\u0000\u0000\u02a5\u02a6\u0005"
          + "u\u0000\u0000\u02a6\u02a8\u0003p8\u0000\u02a7\u02a5\u0001\u0000\u0000"
          + "\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8[\u0001\u0000\u0000\u0000"
          + "\u02a9\u02aa\u0005 \u0000\u0000\u02aa\u02ab\u0005\u001c\u0000\u0000\u02ab"
          + "\u02ac\u0003n7\u0000\u02ac\u02ad\u00054\u0000\u0000\u02ad\u02ae\u0003"
          + "\u0086C\u0000\u02ae]\u0001\u0000\u0000\u0000\u02af\u02b0\u0005`\u0000"
          + "\u0000\u02b0\u02b1\u0005\u001c\u0000\u0000\u02b1\u02b2\u0003n7\u0000\u02b2"
          + "_\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005/\u0000\u0000\u02b4\u02b8\u0005"
          + "S\u0000\u0000\u02b5\u02b6\u0003\u009cN\u0000\u02b6\u02b7\u0005o\u0000"
          + "\u0000\u02b7\u02b9\u0001\u0000\u0000\u0000\u02b8\u02b5\u0001\u0000\u0000"
          + "\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000"
          + "\u0000\u02ba\u02bb\u00055\u0000\u0000\u02bb\u02bc\u0003n7\u0000\u02bc"
          + "a\u0001\u0000\u0000\u0000\u02bd\u02be\u0005\u0015\u0000\u0000\u02be\u02bf"
          + "\u0003n7\u0000\u02bfc\u0001\u0000\u0000\u0000\u02c0\u02c1\u00057\u0000"
          + "\u0000\u02c1\u02c3\u0003j5\u0000\u02c2\u02c4\u0003h4\u0000\u02c3\u02c2"
          + "\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c5"
          + "\u0001\u0000\u0000\u0000\u02c5\u02c7\u0005\u0086\u0000\u0000\u02c6\u02c8"
          + "\u00058\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001"
          + "\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca\u0003"
          + "l6\u0000\u02cae\u0001\u0000\u0000\u0000\u02cb\u02cd\u0005k\u0000\u0000"
          + "\u02cc\u02ce\u0003h4\u0000\u02cd\u02cc\u0001\u0000\u0000\u0000\u02cd\u02ce"
          + "\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d1"
          + "\u00055\u0000\u0000\u02d0\u02d2\u00058\u0000\u0000\u02d1\u02d0\u0001\u0000"
          + "\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000"
          + "\u0000\u0000\u02d3\u02d4\u0003l6\u0000\u02d4g\u0001\u0000\u0000\u0000"
          + "\u02d5\u02d9\u0005^\u0000\u0000\u02d6\u02d7\u0005p\u0000\u0000\u02d7\u02da"
          + "\u0003\u00c4b\u0000\u02d8\u02da\u0003T*\u0000\u02d9\u02d6\u0001\u0000"
          + "\u0000\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02dai\u0001\u0000\u0000"
          + "\u0000\u02db\u02dc\u0003\u00deo\u0000\u02dck\u0001\u0000\u0000\u0000\u02dd"
          + "\u02de\u0003\u00deo\u0000\u02dem\u0001\u0000\u0000\u0000\u02df\u02e0\u0003"
          + "\u00ba]\u0000\u02e0o\u0001\u0000\u0000\u0000\u02e1\u02e2\u0003\u00b2Y"
          + "\u0000\u02e2\u02e3\u0005\u00a6\u0000\u0000\u02e3\u02e5\u0001\u0000\u0000"
          + "\u0000\u02e4\u02e1\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000"
          + "\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e7\u0003\u00ba]\u0000"
          + "\u02e7\u02e8\u0005\u00b1\u0000\u0000\u02e8\u02f0\u0003\u00dcn\u0000\u02e9"
          + "\u02ea\u0005\u00a5\u0000\u0000\u02ea\u02eb\u0003\u00ba]\u0000\u02eb\u02ec"
          + "\u0005\u00b1\u0000\u0000\u02ec\u02ed\u0003\u00dcn\u0000\u02ed\u02ef\u0001"
          + "\u0000\u0000\u0000\u02ee\u02e9\u0001\u0000\u0000\u0000\u02ef\u02f2\u0001"
          + "\u0000\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001"
          + "\u0000\u0000\u0000\u02f1q\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000"
          + "\u0000\u0000\u02f3\u02f4\u0005\u0094\u0000\u0000\u02f4\u02f5\u0005C\u0000"
          + "\u0000\u02f5\u02fd\u0003\u00c6c\u0000\u02f6\u02f9\u0005\u00a7\u0000\u0000"
          + "\u02f7\u02fa\u0003t:\u0000\u02f8\u02fa\u0003v;\u0000\u02f9\u02f7\u0001"
          + "\u0000\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"
          + "\u0000\u0000\u0000\u02fb\u02fc\u0005\u00a8\u0000\u0000\u02fc\u02fe\u0001"
          + "\u0000\u0000\u0000\u02fd\u02f6\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001"
          + "\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0300\u0005"
          + "\u009c\u0000\u0000\u0300\u0301\u0005\u00a7\u0000\u0000\u0301\u0306\u0003"
          + "\u00dcn\u0000\u0302\u0303\u0005\u00a5\u0000\u0000\u0303\u0305\u0003\u00dc"
          + "n\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0305\u0308\u0001\u0000\u0000"
          + "\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000"
          + "\u0000\u0307\u0309\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000\u0000"
          + "\u0000\u0309\u0315\u0005\u00a8\u0000\u0000\u030a\u030b\u0005^\u0000\u0000"
          + "\u030b\u030c\u0005)\u0000\u0000\u030c\u0313\u0005G\u0000\u0000\u030d\u0314"
          + "\u0005;\u0000\u0000\u030e\u030f\u0005\u0093\u0000\u0000\u030f\u0310\u0003"
          + "\u00cae\u0000\u0310\u0311\u0005\u00b1\u0000\u0000\u0311\u0312\u0003\u00d6"
          + "k\u0000\u0312\u0314\u0001\u0000\u0000\u0000\u0313\u030d\u0001\u0000\u0000"
          + "\u0000\u0313\u030e\u0001\u0000\u0000\u0000\u0314\u0316\u0001\u0000\u0000"
          + "\u0000\u0315\u030a\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000"
          + "\u0000\u0316s\u0001\u0000\u0000\u0000\u0317\u031c\u0003\u00cae\u0000\u0318"
          + "\u0319\u0005\u00a5\u0000\u0000\u0319\u031b\u0003\u00cae\u0000\u031a\u0318"
          + "\u0001\u0000\u0000\u0000\u031b\u031e\u0001\u0000\u0000\u0000\u031c\u031a"
          + "\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031du\u0001"
          + "\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031f\u0324\u0003"
          + "\u00c8d\u0000\u0320\u0321\u0005\u00a5\u0000\u0000\u0321\u0323\u0003\u00c8"
          + "d\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0323\u0326\u0001\u0000\u0000"
          + "\u0000\u0324\u0322\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000"
          + "\u0000\u0325w\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000\u0000\u0000"
          + "\u0327\u0329\u0005\u0094\u0000\u0000\u0328\u032a\u0003\u009eO\u0000\u0329"
          + "\u0328\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a"
          + "\u032b\u0001\u0000\u0000\u0000\u032b\u032c\u0005C\u0000\u0000\u032c\u0334"
          + "\u0003\u00c6c\u0000\u032d\u0330\u0005\u00a7\u0000\u0000\u032e\u0331\u0003"
          + "t:\u0000\u032f\u0331\u0003v;\u0000\u0330\u032e\u0001\u0000\u0000\u0000"
          + "\u0330\u032f\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000"
          + "\u0332\u0333\u0005\u00a8\u0000\u0000\u0333\u0335\u0001\u0000\u0000\u0000"
          + "\u0334\u032d\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000"
          + "\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0337\u0003\u0084B\u0000\u0337"
          + "y\u0001\u0000\u0000\u0000\u0338\u033a\u0005#\u0000\u0000\u0339\u033b\u0003"
          + "\u009eO\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000"
          + "\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u033d\u00055\u0000"
          + "\u0000\u033d\u033f\u0003\u00c6c\u0000\u033e\u0340\u0003\u0082A\u0000\u033f"
          + "\u033e\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340"
          + "\u0342\u0001\u0000\u0000\u0000\u0341\u0343\u0003|>\u0000\u0342\u0341\u0001"
          + "\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0345\u0001"
          + "\u0000\u0000\u0000\u0344\u0346\u0003~?\u0000\u0345\u0344\u0001\u0000\u0000"
          + "\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346{\u0001\u0000\u0000\u0000"
          + "\u0347\u0348\u0005b\u0000\u0000\u0348\u0349\u0005\u000f\u0000\u0000\u0349"
          + "\u034a\u0003\u0080@\u0000\u034a}\u0001\u0000\u0000\u0000\u034b\u034c\u0005"
          + "M\u0000\u0000\u034c\u034d\u0003\u0092I\u0000\u034d\u007f\u0001\u0000\u0000"
          + "\u0000\u034e\u0353\u0003\u0094J\u0000\u034f\u0350\u0005\u00a5\u0000\u0000"
          + "\u0350\u0352\u0003\u0094J\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0352"
          + "\u0355\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353"
          + "\u0354\u0001\u0000\u0000\u0000\u0354\u0081\u0001\u0000\u0000\u0000\u0355"
          + "\u0353\u0001\u0000\u0000\u0000\u0356\u0357\u0005\u00a1\u0000\u0000\u0357"
          + "\u0358\u0003\u00d6k\u0000\u0358\u0083\u0001\u0000\u0000\u0000\u0359\u035b"
          + "\u0003\u0086C\u0000\u035a\u035c\u0003\u0088D\u0000\u035b\u035a\u0001\u0000"
          + "\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u035e\u0001\u0000"
          + "\u0000\u0000\u035d\u035f\u0003|>\u0000\u035e\u035d\u0001\u0000\u0000\u0000"
          + "\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0361\u0001\u0000\u0000\u0000"
          + "\u0360\u0362\u0003~?\u0000\u0361\u0360\u0001\u0000\u0000\u0000\u0361\u0362"
          + "\u0001\u0000\u0000\u0000\u0362\u0368\u0001\u0000\u0000\u0000\u0363\u0364"
          + "\u0005]\u0000\u0000\u0364\u0366\u0003\u0092I\u0000\u0365\u0367\u0003\u0090"
          + "H\u0000\u0366\u0365\u0001\u0000\u0000\u0000\u0366\u0367\u0001\u0000\u0000"
          + "\u0000\u0367\u0369\u0001\u0000\u0000\u0000\u0368\u0363\u0001\u0000\u0000"
          + "\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u0372\u0001\u0000\u0000"
          + "\u0000\u036a\u036b\u0005/\u0000\u0000\u036b\u036c\u0003\u0098L\u0000\u036c"
          + "\u036e\u0003\u0092I\u0000\u036d\u036f\u0003\u0090H\u0000\u036e\u036d\u0001"
          + "\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f\u0370\u0001"
          + "\u0000\u0000\u0000\u0370\u0371\u0005_\u0000\u0000\u0371\u0373\u0001\u0000"
          + "\u0000\u0000\u0372\u036a\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000"
          + "\u0000\u0000\u0373\u0085\u0001\u0000\u0000\u0000\u0374\u0376\u0005r\u0000"
          + "\u0000\u0375\u0377\u0003\u009eO\u0000\u0376\u0375\u0001\u0000\u0000\u0000"
          + "\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0379\u0001\u0000\u0000\u0000"
          + "\u0378\u037a\u0007\u0003\u0000\u0000\u0379\u0378\u0001\u0000\u0000\u0000"
          + "\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000"
          + "\u037b\u0380\u0003\u00b0X\u0000\u037c\u037d\u0005\u00a5\u0000\u0000\u037d"
          + "\u037f\u0003\u00b0X\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037f\u0382"
          + "\u0001\u0000\u0000\u0000\u0380\u037e\u0001\u0000\u0000\u0000\u0380\u0381"
          + "\u0001\u0000\u0000\u0000\u0381\u0383\u0001\u0000\u0000\u0000\u0382\u0380"
          + "\u0001\u0000\u0000\u0000\u0383\u0384\u00055\u0000\u0000\u0384\u0386\u0003"
          + "\u00bc^\u0000\u0385\u0387\u0003\u008cF\u0000\u0386\u0385\u0001\u0000\u0000"
          + "\u0000\u0386\u0387\u0001\u0000\u0000\u0000\u0387\u0389\u0001\u0000\u0000"
          + "\u0000\u0388\u038a\u0003\u0082A\u0000\u0389\u0388\u0001\u0000\u0000\u0000"
          + "\u0389\u038a\u0001\u0000\u0000\u0000\u038a\u0395\u0001\u0000\u0000\u0000"
          + "\u038b\u038c\u00058\u0000\u0000\u038c\u038d\u0005\u000f\u0000\u0000\u038d"
          + "\u0392\u0003\u00d6k\u0000\u038e\u038f\u0005\u00a5\u0000\u0000\u038f\u0391"
          + "\u0003\u00d6k\u0000\u0390\u038e\u0001\u0000\u0000\u0000\u0391\u0394\u0001"
          + "\u0000\u0000\u0000\u0392\u0390\u0001\u0000\u0000\u0000\u0392\u0393\u0001"
          + "\u0000\u0000\u0000\u0393\u0396\u0001\u0000\u0000\u0000\u0394\u0392\u0001"
          + "\u0000\u0000\u0000\u0395\u038b\u0001\u0000\u0000\u0000\u0395\u0396\u0001"
          + "\u0000\u0000\u0000\u0396\u0399\u0001\u0000\u0000\u0000\u0397\u0398\u0005"
          + "9\u0000\u0000\u0398\u039a\u0003\u00d6k\u0000\u0399\u0397\u0001\u0000\u0000"
          + "\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u0087\u0001\u0000\u0000"
          + "\u0000\u039b\u039d\u0003\u008aE\u0000\u039c\u039b\u0001\u0000\u0000\u0000"
          + "\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u039c\u0001\u0000\u0000\u0000"
          + "\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u0089\u0001\u0000\u0000\u0000"
          + "\u03a0\u03a1\u0005\u0088\u0000\u0000\u03a1\u03a2\u0005\u0002\u0000\u0000"
          + "\u03a2\u03a3\u0003\u0086C\u0000\u03a3\u008b\u0001\u0000\u0000\u0000\u03a4"
          + "\u03a6\u0003\u008eG\u0000\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a7"
          + "\u0001\u0000\u0000\u0000\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a7\u03a8"
          + "\u0001\u0000\u0000\u0000\u03a8\u008d\u0001\u0000\u0000\u0000\u03a9\u03ab"
          + "\u0003\u00d4j\u0000\u03aa\u03a9\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001"
          + "\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03ad\u0005"
          + "F\u0000\u0000\u03ad\u03ae\u0003\u00bc^\u0000\u03ae\u03af\u0005^\u0000"
          + "\u0000\u03af\u03b0\u0003\u00d6k\u0000\u03b0\u008f\u0001\u0000\u0000\u0000"
          + "\u03b1\u03b2\u0007\u0004\u0000\u0000\u03b2\u0091\u0001\u0000\u0000\u0000"
          + "\u03b3\u03b6\u0003\u009aM\u0000\u03b4\u03b6\u0003\u009cN\u0000\u03b5\u03b3"
          + "\u0001\u0000\u0000\u0000\u03b5\u03b4\u0001\u0000\u0000\u0000\u03b6\u0093"
          + "\u0001\u0000\u0000\u0000\u03b7\u03b9\u0003\u00d6k\u0000\u03b8\u03ba\u0003"
          + "\u00d0h\u0000\u03b9\u03b8\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000"
          + "\u0000\u0000\u03ba\u03bd\u0001\u0000\u0000\u0000\u03bb\u03bc\u0005\\\u0000"
          + "\u0000\u03bc\u03be\u0003\u0096K\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000"
          + "\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u0095\u0001\u0000\u0000\u0000"
          + "\u03bf\u03c0\u0007\u0005\u0000\u0000\u03c0\u0097\u0001\u0000\u0000\u0000"
          + "\u03c1\u03c2\u0007\u0006\u0000\u0000\u03c2\u0099\u0001\u0000\u0000\u0000"
          + "\u03c3\u03c7\u0005\u00b8\u0000\u0000\u03c4\u03c5\u0005\u00a4\u0000\u0000"
          + "\u03c5\u03c7\u0003\u009cN\u0000\u03c6\u03c3\u0001\u0000\u0000\u0000\u03c6"
          + "\u03c4\u0001\u0000\u0000\u0000\u03c7\u009b\u0001\u0000\u0000\u0000\u03c8"
          + "\u03c9\u0005\u00c2\u0000\u0000\u03c9\u009d\u0001\u0000\u0000\u0000\u03ca"
          + "\u03cb\u0005\u00bc\u0000\u0000\u03cb\u03cc\u0003\u00a0P\u0000\u03cc\u03cd"
          + "\u0005\u00bd\u0000\u0000\u03cd\u009f\u0001\u0000\u0000\u0000\u03ce\u03d6"
          + "\u0003\u00a2Q\u0000\u03cf\u03d6\u0003\u00a4R\u0000\u03d0\u03d6\u0003\u00a6"
          + "S\u0000\u03d1\u03d6\u0003\u00a8T\u0000\u03d2\u03d6\u0003\u00aaU\u0000"
          + "\u03d3\u03d6\u0003\u00acV\u0000\u03d4\u03d6\u0003\u00aeW\u0000\u03d5\u03ce"
          + "\u0001\u0000\u0000\u0000\u03d5\u03cf\u0001\u0000\u0000\u0000\u03d5\u03d0"
          + "\u0001\u0000\u0000\u0000\u03d5\u03d1\u0001\u0000\u0000\u0000\u03d5\u03d2"
          + "\u0001\u0000\u0000\u0000\u03d5\u03d3\u0001\u0000\u0000\u0000\u03d5\u03d4"
          + "\u0001\u0000\u0000\u0000\u03d6\u00a1\u0001\u0000\u0000\u0000\u03d7\u03d8"
          + "\u0007\u0007\u0000\u0000\u03d8\u00a3\u0001\u0000\u0000\u0000\u03d9\u03da"
          + "\u0007\b\u0000\u0000\u03da\u00a5\u0001\u0000\u0000\u0000\u03db\u03dc\u0005"
          + "T\u0000\u0000\u03dc\u00a7\u0001\u0000\u0000\u0000\u03dd\u03de\u0005w\u0000"
          + "\u0000\u03de\u00a9\u0001\u0000\u0000\u0000\u03df\u03e0\u0007\t\u0000\u0000"
          + "\u03e0\u00ab\u0001\u0000\u0000\u0000\u03e1\u03e2\u0007\n\u0000\u0000\u03e2"
          + "\u00ad\u0001\u0000\u0000\u0000\u03e3\u03e4\u0005t\u0000\u0000\u03e4\u00af"
          + "\u0001\u0000\u0000\u0000\u03e5\u03f2\u0005\u00a9\u0000\u0000\u03e6\u03e7"
          + "\u0003\u00b2Y\u0000\u03e7\u03e8\u0005\u00a6\u0000\u0000\u03e8\u03e9\u0005"
          + "\u00a9\u0000\u0000\u03e9\u03f2\u0001\u0000\u0000\u0000\u03ea\u03ef\u0003"
          + "\u00d6k\u0000\u03eb\u03ed\u0005\b\u0000\u0000\u03ec\u03eb\u0001\u0000"
          + "\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000"
          + "\u0000\u0000\u03ee\u03f0\u0003\u00b6[\u0000\u03ef\u03ec\u0001\u0000\u0000"
          + "\u0000\u03ef\u03f0\u0001\u0000\u0000\u0000\u03f0\u03f2\u0001\u0000\u0000"
          + "\u0000\u03f1\u03e5\u0001\u0000\u0000\u0000\u03f1\u03e6\u0001\u0000\u0000"
          + "\u0000\u03f1\u03ea\u0001\u0000\u0000\u0000\u03f2\u00b1\u0001\u0000\u0000"
          + "\u0000\u03f3\u03f4\u0003\u00ba]\u0000\u03f4\u00b3\u0001\u0000\u0000\u0000"
          + "\u03f5\u03f6\u0005\u00be\u0000\u0000\u03f6\u00b5\u0001\u0000\u0000\u0000"
          + "\u03f7\u03f8\u0003\u00b8\\\u0000\u03f8\u00b7\u0001\u0000\u0000\u0000\u03f9"
          + "\u03fa\u0003\u00ba]\u0000\u03fa\u00b9\u0001\u0000\u0000\u0000\u03fb\u03fe"
          + "\u0005\u00c0\u0000\u0000\u03fc\u03fe\u0003\u00b4Z\u0000\u03fd\u03fb\u0001"
          + "\u0000\u0000\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fe\u00bb\u0001"
          + "\u0000\u0000\u0000\u03ff\u040a\u0003\u00be_\u0000\u0400\u0401\u0005\u00a7"
          + "\u0000\u0000\u0401\u0402\u0003\u0084B\u0000\u0402\u0407\u0005\u00a8\u0000"
          + "\u0000\u0403\u0405\u0005\b\u0000\u0000\u0404\u0403\u0001\u0000\u0000\u0000"
          + "\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000"
          + "\u0406\u0408\u0003\u00c0`\u0000\u0407\u0404\u0001\u0000\u0000\u0000\u0407"
          + "\u0408\u0001\u0000\u0000\u0000\u0408\u040a\u0001\u0000\u0000\u0000\u0409"
          + "\u03ff\u0001\u0000\u0000\u0000\u0409\u0400\u0001\u0000\u0000\u0000\u040a"
          + "\u00bd\u0001\u0000\u0000\u0000\u040b\u0410\u0003T*\u0000\u040c\u040e\u0005"
          + "\b\u0000\u0000\u040d\u040c\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000"
          + "\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0411\u0003\u00c0"
          + "`\u0000\u0410\u040d\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000"
          + "\u0000\u0411\u041a\u0001\u0000\u0000\u0000\u0412\u0413\u0005\u00a7\u0000"
          + "\u0000\u0413\u0416\u0003\u00c8d\u0000\u0414\u0415\u0005\u00a5\u0000\u0000"
          + "\u0415\u0417\u0003\u00c8d\u0000\u0416\u0414\u0001\u0000\u0000\u0000\u0416"
          + "\u0417\u0001\u0000\u0000\u0000\u0417\u0418\u0001\u0000\u0000\u0000\u0418"
          + "\u0419\u0005\u00a8\u0000\u0000\u0419\u041b\u0001\u0000\u0000\u0000\u041a"
          + "\u0412\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b"
          + "\u0421\u0001\u0000\u0000\u0000\u041c\u041d\u0005\u0080\u0000\u0000\u041d"
          + "\u041e\u0005\u00a7\u0000\u0000\u041e\u041f\u0003\u00c2a\u0000\u041f\u0420"
          + "\u0005\u00a8\u0000\u0000\u0420\u0422\u0001\u0000\u0000\u0000\u0421\u041c"
          + "\u0001\u0000\u0000\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422\u00bf"
          + "\u0001\u0000\u0000\u0000\u0423\u0424\u0003\u00b8\\\u0000\u0424\u00c1\u0001"
          + "\u0000\u0000\u0000\u0425\u0426\u0003\u009cN\u0000\u0426\u00c3\u0001\u0000"
          + "\u0000\u0000\u0427\u0428\u0003\u00ba]\u0000\u0428\u00c5\u0001\u0000\u0000"
          + "\u0000\u0429\u042a\u0003\u00ba]\u0000\u042a\u00c7\u0001\u0000\u0000\u0000"
          + "\u042b\u042c\u0003\u00cae\u0000\u042c\u0431\u0003\u00ceg\u0000\u042d\u042f"
          + "\u0005Y\u0000\u0000\u042e\u042d\u0001\u0000\u0000\u0000\u042e\u042f\u0001"
          + "\u0000\u0000\u0000\u042f\u0430\u0001\u0000\u0000\u0000\u0430\u0432\u0005"
          + "[\u0000\u0000\u0431\u042e\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000"
          + "\u0000\u0000\u0432\u0435\u0001\u0000\u0000\u0000\u0433\u0434\u0005!\u0000"
          + "\u0000\u0434\u0436\u0003\u00dcn\u0000\u0435\u0433\u0001\u0000\u0000\u0000"
          + "\u0435\u0436\u0001\u0000\u0000\u0000\u0436\u043f\u0001\u0000\u0000\u0000"
          + "\u0437\u0438\u0005g\u0000\u0000\u0438\u043a\u0005G\u0000\u0000\u0439\u043b"
          + "\u0003\u00d0h\u0000\u043a\u0439\u0001\u0000\u0000\u0000\u043a\u043b\u0001"
          + "\u0000\u0000\u0000\u043b\u043d\u0001\u0000\u0000\u0000\u043c\u043e\u0005"
          + "n\u0000\u0000\u043d\u043c\u0001\u0000\u0000\u0000\u043d\u043e\u0001\u0000"
          + "\u0000\u0000\u043e\u0440\u0001\u0000\u0000\u0000\u043f\u0437\u0001\u0000"
          + "\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u00c9\u0001\u0000"
          + "\u0000\u0000\u0441\u0442\u0003\u00b2Y\u0000\u0442\u0443\u0005\u00a6\u0000"
          + "\u0000\u0443\u0445\u0001\u0000\u0000\u0000\u0444\u0441\u0001\u0000\u0000"
          + "\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000"
          + "\u0000\u0446\u0447\u0003\u00ccf\u0000\u0447\u00cb\u0001\u0000\u0000\u0000"
          + "\u0448\u0449\u0003\u00ba]\u0000\u0449\u00cd\u0001\u0000\u0000\u0000\u044a"
          + "\u044d\u0003\u00fe\u007f\u0000\u044b\u044d\u0003\u0100\u0080\u0000\u044c"
          + "\u044a\u0001\u0000\u0000\u0000\u044c\u044b\u0001\u0000\u0000\u0000\u044d"
          + "\u0455\u0001\u0000\u0000\u0000\u044e\u0453\u0005\u0007\u0000\u0000\u044f"
          + "\u0450\u0005\u00af\u0000\u0000\u0450\u0451\u0003\u00f8|\u0000\u0451\u0452"
          + "\u0005\u00b0\u0000\u0000\u0452\u0454\u0001\u0000\u0000\u0000\u0453\u044f"
          + "\u0001\u0000\u0000\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454\u0456"
          + "\u0001\u0000\u0000\u0000\u0455\u044e\u0001\u0000\u0000\u0000\u0455\u0456"
          + "\u0001\u0000\u0000\u0000\u0456\u00cf\u0001\u0000\u0000\u0000\u0457\u0458"
          + "\u0007\u000b\u0000\u0000\u0458\u00d1\u0001\u0000\u0000\u0000\u0459\u045a"
          + "\u0007\f\u0000\u0000\u045a\u00d3\u0001\u0000\u0000\u0000\u045b\u0461\u0005"
          + "A\u0000\u0000\u045c\u045e\u0007\r\u0000\u0000\u045d\u045f\u0005c\u0000"
          + "\u0000\u045e\u045d\u0001\u0000\u0000\u0000\u045e\u045f\u0001\u0000\u0000"
          + "\u0000\u045f\u0461\u0001\u0000\u0000\u0000\u0460\u045b\u0001\u0000\u0000"
          + "\u0000\u0460\u045c\u0001\u0000\u0000\u0000\u0461\u00d5\u0001\u0000\u0000"
          + "\u0000\u0462\u0463\u0006k\uffff\uffff\u0000\u0463\u0488\u0003\u00dcn\u0000"
          + "\u0464\u0488\u0003\u009aM\u0000\u0465\u0466\u0003\u00c4b\u0000\u0466\u0467"
          + "\u0005\u00a6\u0000\u0000\u0467\u0469\u0001\u0000\u0000\u0000\u0468\u0465"
          + "\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u046a"
          + "\u0001\u0000\u0000\u0000\u046a\u046b\u0003\u00c6c\u0000\u046b\u046c\u0005"
          + "\u00a6\u0000\u0000\u046c\u046e\u0001\u0000\u0000\u0000\u046d\u0468\u0001"
          + "\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u046f\u0001"
          + "\u0000\u0000\u0000\u046f\u0488\u0003\u00ccf\u0000\u0470\u0471\u0005\u00ad"
          + "\u0000\u0000\u0471\u0488\u0003\u00d6k\u0015\u0472\u0474\u0005Y\u0000\u0000"
          + "\u0473\u0472\u0001\u0000\u0000\u0000\u0473\u0474\u0001\u0000\u0000\u0000"
          + "\u0474\u0475\u0001\u0000\u0000\u0000\u0475\u0476\u0005,\u0000\u0000\u0476"
          + "\u0477\u0005\u00a7\u0000\u0000\u0477\u0478\u0003\u0084B\u0000\u0478\u0479"
          + "\u0005\u00a8\u0000\u0000\u0479\u0488\u0001\u0000\u0000\u0000\u047a\u047b"
          + "\u0005\u00c0\u0000\u0000\u047b\u047c\u0005\u00a7\u0000\u0000\u047c\u047d"
          + "\u0003\u00dam\u0000\u047d\u047e\u0005\u00a8\u0000\u0000\u047e\u0488\u0001"
          + "\u0000\u0000\u0000\u047f\u0480\u0005Y\u0000\u0000\u0480\u0488\u0003\u00d6"
          + "k\t\u0481\u0488\u0003\u00ecv\u0000\u0482\u0488\u0003\u00e8t\u0000\u0483"
          + "\u0488\u0003\u00eau\u0000\u0484\u0488\u0003\u00eew\u0000\u0485\u0488\u0003"
          + "\u00f0x\u0000\u0486\u0488\u0003\u00f6{\u0000\u0487\u0462\u0001\u0000\u0000"
          + "\u0000\u0487\u0464\u0001\u0000\u0000\u0000\u0487\u046d\u0001\u0000\u0000"
          + "\u0000\u0487\u0470\u0001\u0000\u0000\u0000\u0487\u0473\u0001\u0000\u0000"
          + "\u0000\u0487\u047a\u0001\u0000\u0000\u0000\u0487\u047f\u0001\u0000\u0000"
          + "\u0000\u0487\u0481\u0001\u0000\u0000\u0000\u0487\u0482\u0001\u0000\u0000"
          + "\u0000\u0487\u0483\u0001\u0000\u0000\u0000\u0487\u0484\u0001\u0000\u0000"
          + "\u0000\u0487\u0485\u0001\u0000\u0000\u0000\u0487\u0486\u0001\u0000\u0000"
          + "\u0000\u0488\u04c3\u0001\u0000\u0000\u0000\u0489\u048a\n\u0014\u0000\u0000"
          + "\u048a\u048b\u0005\u00ae\u0000\u0000\u048b\u04c2\u0003\u00d6k\u0015\u048c"
          + "\u048d\n\u0013\u0000\u0000\u048d\u048e\u0007\u000e\u0000\u0000\u048e\u04c2"
          + "\u0003\u00d6k\u0014\u048f\u0490\n\u0012\u0000\u0000\u0490\u0491\u0007"
          + "\u000f\u0000\u0000\u0491\u04c2\u0003\u00d6k\u0013\u0492\u0493\n\u0011"
          + "\u0000\u0000\u0493\u0494\u0003\u00d8l\u0000\u0494\u0495\u0003\u00d6k\u0012"
          + "\u0495\u04c2\u0001\u0000\u0000\u0000\u0496\u0497\n\u000f\u0000\u0000\u0497"
          + "\u0498\u0007\u0010\u0000\u0000\u0498\u04c2\u0003\u00d6k\u0010\u0499\u049b"
          + "\n\f\u0000\u0000\u049a\u049c\u0005Y\u0000\u0000\u049b\u049a\u0001\u0000"
          + "\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u049d\u0001\u0000"
          + "\u0000\u0000\u049d\u049e\u0005\f\u0000\u0000\u049e\u049f\u0003\u00d6k"
          + "\u0000\u049f\u04a0\u0005\u0004\u0000\u0000\u04a0\u04a1\u0003\u00d6k\r"
          + "\u04a1\u04c2\u0001\u0000\u0000\u0000\u04a2\u04a3\n\b\u0000\u0000\u04a3"
          + "\u04a4\u0005\u0004\u0000\u0000\u04a4\u04c2\u0003\u00d6k\t\u04a5\u04a6"
          + "\n\u0007\u0000\u0000\u04a6\u04a7\u0005a\u0000\u0000\u04a7\u04c2\u0003"
          + "\u00d6k\b\u04a8\u04a9\n\u0010\u0000\u0000\u04a9\u04aa\u0003\u00d8l\u0000"
          + "\u04aa\u04ab\u0003\u00d2i\u0000\u04ab\u04ac\u0005\u00a7\u0000\u0000\u04ac"
          + "\u04ad\u0003\u0084B\u0000\u04ad\u04ae\u0005\u00a8\u0000\u0000\u04ae\u04c2"
          + "\u0001\u0000\u0000\u0000\u04af\u04b0\n\u000e\u0000\u0000\u04b0\u04b2\u0005"
          + "D\u0000\u0000\u04b1\u04b3\u0005Y\u0000\u0000\u04b2\u04b1\u0001\u0000\u0000"
          + "\u0000\u04b2\u04b3\u0001\u0000\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000"
          + "\u0000\u04b4\u04c2\u0005[\u0000\u0000\u04b5\u04b7\n\r\u0000\u0000\u04b6"
          + "\u04b8\u0005Y\u0000\u0000\u04b7\u04b6\u0001\u0000\u0000\u0000\u04b7\u04b8"
          + "\u0001\u0000\u0000\u0000\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u04ba"
          + "\u0005=\u0000\u0000\u04ba\u04bd\u0005\u00a7\u0000\u0000\u04bb\u04be\u0003"
          + "\u0084B\u0000\u04bc\u04be\u0003\u00dam\u0000\u04bd\u04bb\u0001\u0000\u0000"
          + "\u0000\u04bd\u04bc\u0001\u0000\u0000\u0000\u04be\u04bf\u0001\u0000\u0000"
          + "\u0000\u04bf\u04c0\u0005\u00a8\u0000\u0000\u04c0\u04c2\u0001\u0000\u0000"
          + "\u0000\u04c1\u0489\u0001\u0000\u0000\u0000\u04c1\u048c\u0001\u0000\u0000"
          + "\u0000\u04c1\u048f\u0001\u0000\u0000\u0000\u04c1\u0492\u0001\u0000\u0000"
          + "\u0000\u04c1\u0496\u0001\u0000\u0000\u0000\u04c1\u0499\u0001\u0000\u0000"
          + "\u0000\u04c1\u04a2\u0001\u0000\u0000\u0000\u04c1\u04a5\u0001\u0000\u0000"
          + "\u0000\u04c1\u04a8\u0001\u0000\u0000\u0000\u04c1\u04af\u0001\u0000\u0000"
          + "\u0000\u04c1\u04b5\u0001\u0000\u0000\u0000\u04c2\u04c5\u0001\u0000\u0000"
          + "\u0000\u04c3\u04c1\u0001\u0000\u0000\u0000\u04c3\u04c4\u0001\u0000\u0000"
          + "\u0000\u04c4\u00d7\u0001\u0000\u0000\u0000\u04c5\u04c3\u0001\u0000\u0000"
          + "\u0000\u04c6\u04c7\u0007\u0011\u0000\u0000\u04c7\u00d9\u0001\u0000\u0000"
          + "\u0000\u04c8\u04cd\u0003\u00d6k\u0000\u04c9\u04ca\u0005\u00a5\u0000\u0000"
          + "\u04ca\u04cc\u0003\u00d6k\u0000\u04cb\u04c9\u0001\u0000\u0000\u0000\u04cc"
          + "\u04cf\u0001\u0000\u0000\u0000\u04cd\u04cb\u0001\u0000\u0000\u0000\u04cd"
          + "\u04ce\u0001\u0000\u0000\u0000\u04ce\u00db\u0001\u0000\u0000\u0000\u04cf"
          + "\u04cd\u0001\u0000\u0000\u0000\u04d0\u04d5\u0003\u00deo\u0000\u04d1\u04d5"
          + "\u0003\u00e0p\u0000\u04d2\u04d5\u0003\u00e6s\u0000\u04d3\u04d5\u0005["
          + "\u0000\u0000\u04d4\u04d0\u0001\u0000\u0000\u0000\u04d4\u04d1\u0001\u0000"
          + "\u0000\u0000\u04d4\u04d2\u0001\u0000\u0000\u0000\u04d4\u04d3\u0001\u0000"
          + "\u0000\u0000\u04d5\u00dd\u0001\u0000\u0000\u0000\u04d6\u04d7\u0005\u00c1"
          + "\u0000\u0000\u04d7\u00df\u0001\u0000\u0000\u0000\u04d8\u04db\u0003\u00e2"
          + "q\u0000\u04d9\u04db\u0003\u00e4r\u0000\u04da\u04d8\u0001\u0000\u0000\u0000"
          + "\u04da\u04d9\u0001\u0000\u0000\u0000\u04db\u00e1\u0001\u0000\u0000\u0000"
          + "\u04dc\u04de\u0005\u00ad\u0000\u0000\u04dd\u04dc\u0001\u0000\u0000\u0000"
          + "\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u04df\u0001\u0000\u0000\u0000"
          + "\u04df\u04e0\u0005\u00c2\u0000\u0000\u04e0\u00e3\u0001\u0000\u0000\u0000"
          + "\u04e1\u04e3\u0005\u00ad\u0000\u0000\u04e2\u04e1\u0001\u0000\u0000\u0000"
          + "\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u04e4\u0001\u0000\u0000\u0000"
          + "\u04e4\u04e7\u0003\u009cN\u0000\u04e5\u04e6\u0005\u00a6\u0000\u0000\u04e6"
          + "\u04e8\u0003\u009cN\u0000\u04e7\u04e5\u0001\u0000\u0000\u0000\u04e7\u04e8"
          + "\u0001\u0000\u0000\u0000\u04e8\u00e5\u0001\u0000\u0000\u0000\u04e9\u04ea"
          + "\u0007\u0012\u0000\u0000\u04ea\u00e7\u0001\u0000\u0000\u0000\u04eb\u04ec"
          + "\u0005\u0012\u0000\u0000\u04ec\u04ed\u0003\u00d6k\u0000\u04ed\u04ee\u0005"
          + "\u00a0\u0000\u0000\u04ee\u04ef\u0003\u00d6k\u0000\u04ef\u04f0\u0005\u0082"
          + "\u0000\u0000\u04f0\u04f8\u0003\u00d6k\u0000\u04f1\u04f2\u0005\u00a0\u0000"
          + "\u0000\u04f2\u04f3\u0003\u00d6k\u0000\u04f3\u04f4\u0005\u0082\u0000\u0000"
          + "\u04f4\u04f5\u0003\u00d6k\u0000\u04f5\u04f7\u0001\u0000\u0000\u0000\u04f6"
          + "\u04f1\u0001\u0000\u0000\u0000\u04f7\u04fa\u0001\u0000\u0000\u0000\u04f8"
          + "\u04f6\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9"
          + "\u04fd\u0001\u0000\u0000\u0000\u04fa\u04f8\u0001\u0000\u0000\u0000\u04fb"
          + "\u04fc\u0005*\u0000\u0000\u04fc\u04fe\u0003\u00d6k\u0000\u04fd\u04fb\u0001"
          + "\u0000\u0000\u0000\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe\u04ff\u0001"
          + "\u0000\u0000\u0000\u04ff\u0500\u0005+\u0000\u0000\u0500\u00e9\u0001\u0000"
          + "\u0000\u0000\u0501\u0502\u0005\u0012\u0000\u0000\u0502\u0503\u0005\u00a0"
          + "\u0000\u0000\u0503\u0504\u0003\u00d6k\u0000\u0504\u0505\u0005\u0082\u0000"
          + "\u0000\u0505\u050b\u0003\u00d6k\u0000\u0506\u0507\u0005\u00a0\u0000\u0000"
          + "\u0507\u0508\u0003\u00d6k\u0000\u0508\u0509\u0005\u0082\u0000\u0000\u0509"
          + "\u050a\u0003\u00d6k\u0000\u050a\u050c\u0001\u0000\u0000\u0000\u050b\u0506"
          + "\u0001\u0000\u0000\u0000\u050b\u050c\u0001\u0000\u0000\u0000\u050c\u050f"
          + "\u0001\u0000\u0000\u0000\u050d\u050e\u0005*\u0000\u0000\u050e\u0510\u0003"
          + "\u00d6k\u0000\u050f\u050d\u0001\u0000\u0000\u0000\u050f\u0510\u0001\u0000"
          + "\u0000\u0000\u0510\u0511\u0001\u0000\u0000\u0000\u0511\u0512\u0005+\u0000"
          + "\u0000\u0512\u00eb\u0001\u0000\u0000\u0000\u0513\u0514\u0005\u00a7\u0000"
          + "\u0000\u0514\u0515\u0003\u00dam\u0000\u0515\u0516\u0005\u00a8\u0000\u0000"
          + "\u0516\u00ed\u0001\u0000\u0000\u0000\u0517\u0518\u0005\u0013\u0000\u0000"
          + "\u0518\u0519\u0005\u00a7\u0000\u0000\u0519\u051a\u0003\u00d6k\u0000\u051a"
          + "\u051b\u0005\b\u0000\u0000\u051b\u051c\u0003\u00ceg\u0000\u051c\u051d"
          + "\u0005\u00a8\u0000\u0000\u051d\u00ef\u0001\u0000\u0000\u0000\u051e\u0523"
          + "\u0007\u0013\u0000\u0000\u051f\u0524\u0005\u009b\u0000\u0000\u0520\u0521"
          + "\u0003\u009cN\u0000\u0521\u0522\u0005\u009c\u0000\u0000\u0522\u0524\u0001"
          + "\u0000\u0000\u0000\u0523\u051f\u0001\u0000\u0000\u0000\u0523\u0520\u0001"
          + "\u0000\u0000\u0000\u0524\u0525\u0001\u0000\u0000\u0000\u0525\u0526\u0005"
          + "4\u0000\u0000\u0526\u0527\u0003\u00f2y\u0000\u0527\u00f1\u0001\u0000\u0000"
          + "\u0000\u0528\u0529\u0003\u00c4b\u0000\u0529\u052a\u0005\u00a6\u0000\u0000"
          + "\u052a\u052c\u0001\u0000\u0000\u0000\u052b\u0528\u0001\u0000\u0000\u0000"
          + "\u052b\u052c\u0001\u0000\u0000\u0000\u052c\u052d\u0001\u0000\u0000\u0000"
          + "\u052d\u052e\u0003\u00f4z\u0000\u052e\u00f3\u0001\u0000\u0000\u0000\u052f"
          + "\u0530\u0003\u00ba]\u0000\u0530\u00f5\u0001\u0000\u0000\u0000\u0531\u0532"
          + "\u0005\u0007\u0000\u0000\u0532\u0533\u0005\u00af\u0000\u0000\u0533\u0538"
          + "\u0003\u00d6k\u0000\u0534\u0535\u0005\u00a5\u0000\u0000\u0535\u0537\u0003"
          + "\u00d6k\u0000\u0536\u0534\u0001\u0000\u0000\u0000\u0537\u053a\u0001\u0000"
          + "\u0000\u0000\u0538\u0536\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000"
          + "\u0000\u0000\u0539\u053b\u0001\u0000\u0000\u0000\u053a\u0538\u0001\u0000"
          + "\u0000\u0000\u053b\u053c\u0005\u00b0\u0000\u0000\u053c\u00f7\u0001\u0000"
          + "\u0000\u0000\u053d\u053e\u0003\u00e2q\u0000\u053e\u00f9\u0001\u0000\u0000"
          + "\u0000\u053f\u0540\u0003\u00e2q\u0000\u0540\u00fb\u0001\u0000\u0000\u0000"
          + "\u0541\u0542\u0003\u00e2q\u0000\u0542\u00fd\u0001\u0000\u0000\u0000\u0543"
          + "\u0544\u0005\u0014\u0000\u0000\u0544\u0545\u0005\u00a7\u0000\u0000\u0545"
          + "\u0546\u0003\u00fa}\u0000\u0546\u0547\u0005\u00a8\u0000\u0000\u0547\u056a"
          + "\u0001\u0000\u0000\u0000\u0548\u054d\u0005\u009e\u0000\u0000\u0549\u054a"
          + "\u0005\u00a7\u0000\u0000\u054a\u054b\u0003\u00fa}\u0000\u054b\u054c\u0005"
          + "\u00a8\u0000\u0000\u054c\u054e\u0001\u0000\u0000\u0000\u054d\u0549\u0001"
          + "\u0000\u0000\u0000\u054d\u054e\u0001\u0000\u0000\u0000\u054e\u056a\u0001"
          + "\u0000\u0000\u0000\u054f\u0554\u0005\u001f\u0000\u0000\u0550\u0551\u0003"
          + "\u00fa}\u0000\u0551\u0552\u0005\u00a5\u0000\u0000\u0552\u0553\u0003\u00fc"
          + "~\u0000\u0553\u0555\u0001\u0000\u0000\u0000\u0554\u0550\u0001\u0000\u0000"
          + "\u0000\u0554\u0555\u0001\u0000\u0000\u0000\u0555\u056a\u0001\u0000\u0000"
          + "\u0000\u0556\u056a\u0005\u0085\u0000\u0000\u0557\u056a\u0005x\u0000\u0000"
          + "\u0558\u056a\u0005B\u0000\u0000\u0559\u056a\u0005\r\u0000\u0000\u055a"
          + "\u056a\u00053\u0000\u0000\u055b\u056a\u0005\'\u0000\u0000\u055c\u056a"
          + "\u0005\u0084\u0000\u0000\u055d\u056a\u0005\u001e\u0000\u0000\u055e\u056a"
          + "\u0005\u0083\u0000\u0000\u055f\u0560\u0005\u000e\u0000\u0000\u0560\u0561"
          + "\u0005\u00a7\u0000\u0000\u0561\u0562\u0003\u00fa}\u0000\u0562\u0563\u0005"
          + "\u00a8\u0000\u0000\u0563\u056a\u0001\u0000\u0000\u0000\u0564\u0565\u0005"
          + "\u009d\u0000\u0000\u0565\u0566\u0005\u00a7\u0000\u0000\u0566\u0567\u0003"
          + "\u00fa}\u0000\u0567\u0568\u0005\u00a8\u0000\u0000\u0568\u056a\u0001\u0000"
          + "\u0000\u0000\u0569\u0543\u0001\u0000\u0000\u0000\u0569\u0548\u0001\u0000"
          + "\u0000\u0000\u0569\u054f\u0001\u0000\u0000\u0000\u0569\u0556\u0001\u0000"
          + "\u0000\u0000\u0569\u0557\u0001\u0000\u0000\u0000\u0569\u0558\u0001\u0000"
          + "\u0000\u0000\u0569\u0559\u0001\u0000\u0000\u0000\u0569\u055a\u0001\u0000"
          + "\u0000\u0000\u0569\u055b\u0001\u0000\u0000\u0000\u0569\u055c\u0001\u0000"
          + "\u0000\u0000\u0569\u055d\u0001\u0000\u0000\u0000\u0569\u055e\u0001\u0000"
          + "\u0000\u0000\u0569\u055f\u0001\u0000\u0000\u0000\u0569\u0564\u0001\u0000"
          + "\u0000\u0000\u056a\u00ff\u0001\u0000\u0000\u0000\u056b\u056c\u0007\u0014"
          + "\u0000\u0000\u056c\u0101\u0001\u0000\u0000\u0000\u00a4\u0105\u010c\u0111"
          + "\u0121\u0127\u0132\u0136\u013b\u013f\u0144\u0149\u014e\u0157\u0165\u0169"
          + "\u016d\u017a\u017d\u0180\u0185\u018a\u0191\u0196\u0199\u019d\u01a0\u01a4"
          + "\u01a8\u01ab\u01af\u01b4\u01ba\u01be\u01c6\u01cb\u01d2\u01db\u01dd\u01e0"
          + "\u01ef\u01f4\u01f7\u0203\u0208\u020c\u0214\u0219\u0220\u0227\u022d\u0238"
          + "\u023d\u0242\u0247\u024c\u0255\u0259\u025e\u0262\u0267\u026e\u0275\u027e"
          + "\u0290\u0297\u029d\u02a3\u02a7\u02b8\u02c3\u02c7\u02cd\u02d1\u02d9\u02e4"
          + "\u02f0\u02f9\u02fd\u0306\u0313\u0315\u031c\u0324\u0329\u0330\u0334\u033a"
          + "\u033f\u0342\u0345\u0353\u035b\u035e\u0361\u0366\u0368\u036e\u0372\u0376"
          + "\u0379\u0380\u0386\u0389\u0392\u0395\u0399\u039e\u03a7\u03aa\u03b5\u03b9"
          + "\u03bd\u03c6\u03d5\u03ec\u03ef\u03f1\u03fd\u0404\u0407\u0409\u040d\u0410"
          + "\u0416\u041a\u0421\u042e\u0431\u0435\u043a\u043d\u043f\u0444\u044c\u0453"
          + "\u0455\u045e\u0460\u0468\u046d\u0473\u0487\u049b\u04b2\u04b7\u04bd\u04c1"
          + "\u04c3\u04cd\u04d4\u04da\u04dd\u04e2\u04e7\u04f8\u04fd\u050b\u050f\u0523"
          + "\u052b\u0538\u054d\u0554\u0569";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
