package cimerant.context.sql.impl;

import cimerant.context.cimerant.ObjectAttributeList;
import cimerant.context.cimerant.ObjectFieldList;
import cimerant.context.cimerant.ObjectRelationshipList;
import cimerant.context.cimerant.ObjectRootContext;
import cimerant.context.cimerant.impl.ObjectAttributeListImpl;
import cimerant.context.cimerant.impl.ObjectContextImpl;
import cimerant.context.cimerant.impl.ObjectFieldListImpl;
import cimerant.context.cimerant.impl.ObjectRelationshipListImpl;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.sql.SqlContext;
import cimerant.context.sql.SqlRootContext;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 */
public final class SqlContextImpl extends ObjectContextImpl<Entry<String, Object>>
    implements SqlContext {
  public static class Field {
    /** Constant for SQL column type array. */
    public static final String ARRAY = "array";

    /** Constant for SQL column type auto increment. */
    public static final String AUTO_INCREMENT = "autoIncrement";

    /** Constant for SQL column type char set. */
    public static final String CHARSET = "charset";

    /** Constant for SQL column type clustered. */
    public static final String CLUSTERED = "clustered";

    /** Constant for SQL column type collate. */
    public static final String COLLATION_NAME = "collate";

    /** Constant for SQL column type comment. */
    public static final String COMMENT = "comment";

    /** Constant for SQL column type default. */
    public static final String DEFAULT = "default";

    /** Constant for SQL column type deferrable. */
    public static final String DEFERRABLE = "deferrable";

    /** Constant for SQL column type deferred. */
    public static final String DEFERRED = "deferred";

    /** Constant for SQL column type. */
    public static final String FIELD_TYPE = "fieldType";

    /** Constant for SQL column type identity. */
    public static final String IDENTITY = "identity";

    /** Constant for SQL column type increment. */
    public static final String INCREMENT = "increment";

    /** Constant for SQL column type max size. */
    public static final String MAX_SIZE = "maxSize";

    /** Constant for SQL column type nullable. */
    public static final String NULLABLE = "nullable";

    /** Constant for SQL column type precision. */
    public static final String PRECISION = "precision";

    /** Constant for SQL column type primary. */
    public static final String PRIMARY = "primary";

    /** Constant for SQL column type row guid. */
    public static final String ROWGUIDCOL = "rowguidcol";

    /** Constant for SQL column type scale. */
    public static final String SCALE = "scale";

    /** Constant for SQL column type seed. */
    public static final String SEED = "seed";

    /** Constant for SQL column type time zone. */
    public static final String TIMEZONE = "timezone";

    /** Constant for SQL column type unique. */
    public static final String UNIQUE = "unique";

    /** Constant for SQL column type unsigned. */
    public static final String UNSIGNED = "unsigned";

    /** Constant for SQL column type varying. */
    public static final String VARYING = "varying";

    /** Constant for SQL column type visible. */
    public static final String VISIBLE = "visible";

    private Field() {}
  }

  private static class TableName implements Map.Entry<String, Object> {
    private final String key;
    private final List<String> value;

    private TableName(final List<String> fullyQualifiedTableName) {
      this.key = fullyQualifiedTableName.remove(fullyQualifiedTableName.size() - 1);
      this.value = fullyQualifiedTableName;
    }

    @Override
    public String getKey() {
      return this.key;
    }

    @Override
    public List<String> getValue() {
      return this.value;
    }

    @Override
    public int hashCode() {
      return Objects.hash(
          StringUtils.upperCase(
              String.join("", this.getValue()) + this.getKey(), Locale.getDefault()));
    }

    @Override
    public List<String> setValue(final Object value) {
      throw new UnsupportedOperationException("setValue");
    }
  }

  private static final long serialVersionUID = 1L;

  /** Constant for SQL table type block chain. */
  public static final String BLOCKCHAIN = "blockchain";

  /** Constant for SQL table type char set. */
  public static final String CHARSET = "charset";

  /** Constant for SQL table type checksum. */
  public static final String CHECKSUM = "checksum";

  /** Constant for SQL table type collate. */
  public static final String COLLATION_NAME = "collate";

  /** Constant for SQL table type comment. */
  public static final String COMMENT = "comment";

  /** Constant for SQL table type deferrable. */
  public static final String DEFERRABLE = "deferrable";

  /** Constant for SQL table type disableWal. */
  public static final String DISABLE_WAL = "disableWal";

  /** Constant for SQL table type engine. */
  public static final String ENGINE = "engine";

  /** Constant for SQL table type external. */
  public static final String EXTERNAL = "external";

  /** Constant for SQL table type foreign. */
  public static final String FOREIGN = "foreign";

  /** Constant for SQL table type inherits. */
  public static final String INHERITS = "inherits";

  /** Constant for SQL table type like. */
  public static final String LIKE = "like";

  /** Constant for SQL table type nullable. */
  public static final String NULLABLE = "nullable";

  /** Constant for SQL table type queue. */
  public static final String QUEUE = "queue";

  /** Constant for SQL table type stored as. */
  public static final String STORED_AS = "storedAs";

  /** Constant for SQL table type. */
  public static final String TABLE_TYPE = "tableType";

  /** Constant for SQL table type temporary. */
  public static final String TEMP = "temp";

  /** Constant for SQL table type transactional. */
  public static final String TRANSACTIONAL = "transactional";

  /** Constant for SQL table type unlogged. */
  public static final String UNLOGGED = "unlogged";

  /** Constant for SQL table type varying. */
  public static final String VARYING = "varying";

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param parent the context parent.
   * @param fullyQualifiedTableName name of the table.
   * @return a instance of the context.
   */
  public static SqlContext getInstance(
      final SqlRootContext parent, final List<String> fullyQualifiedTableName) {
    Objects.requireNonNull(parent);
    Objects.requireNonNull(fullyQualifiedTableName);

    final ObjectAttributeList attributes = new ObjectAttributeListImpl();
    attributes.putAll(parent.getAttributes());

    if (fullyQualifiedTableName.isEmpty()) {
      return null;
    }
    return ContextRootImpl.registerInstance(
        new SqlContextImpl(
            new TableName(fullyQualifiedTableName),
            parent,
            fullyQualifiedTableName,
            attributes,
            new ObjectFieldListImpl(),
            new ObjectRelationshipListImpl()));
  }

  /** Creates an instance. */
  private SqlContextImpl(
      final TableName contextObject,
      final ObjectRootContext<?> rootContext,
      final List<String> parentGroupings,
      final ObjectAttributeList attributes,
      final ObjectFieldList fields,
      final ObjectRelationshipList relationships) {
    super(contextObject, rootContext, parentGroupings, attributes, fields, relationships);
  }
}
