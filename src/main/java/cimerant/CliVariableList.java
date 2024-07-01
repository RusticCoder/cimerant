package cimerant;

import cimerant.CliVariableList.CliVariable;
import cimerant.logger.CimerantLogger;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.commonmark.Extension;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.node.Node;
import org.commonmark.node.Text;
import org.commonmark.parser.Parser;
import org.slf4j.LoggerFactory;

/** List of Command-line Interface Variables. */
public class CliVariableList implements List<CliVariable> {
  /** Command-line Interface Variable. */
  public static class CliVariable {
    private enum Values {
      KEY,
      UNKNOWN,
      VALUE;

      private static Values getEnum(final String value) {
        try {
          final var str =
              RegExUtils.replaceAll(
                  StringUtils.upperCase(value), Pattern.compile("[^a-zA-Z0-9]"), "_");

          if (EnumUtils.isValidEnum(Values.class, str)) {
            return Values.valueOf(str);
          }

          return UNKNOWN;
        } catch (final Exception e) {
          final var logger = LoggerFactory.getLogger(Values.class.getName());
          if (logger.isErrorEnabled()) {
            logger.error(e.getMessage(), e);
          }
          return null;
        }
      }
    }

    private String key = null;
    private final CimerantLogger logger;
    private String value = null;

    /** Creates an instance. */
    public CliVariable() {
      this.logger = (CimerantLogger) LoggerFactory.getLogger(this.getClass().getName());
    }

    /**
     * Returns the CLI variable key.
     *
     * @return the CLI variable key.
     */
    public String getKey() {
      return this.key;
    }

    /**
     * Returns the CLI variable value.
     *
     * @return the CLI variable value.
     */
    public String getValue() {
      return this.value;
    }

    private boolean isEmpty() {
      return StringUtils.isBlank(this.key);
    }

    void setKey(final String key) {
      this.key = key;
    }

    void setValue(final String value) {
      this.value = value;
    }

    private void setValue(final Values type, final String value) {
      try {
        switch (type) {
          case KEY:
            this.setKey(value);
            break;
          case VALUE:
            this.setValue(value);
            break;
          default:
        }
      } catch (final Exception e) {
        if (this.logger.isDebugEnabled()) {
          this.logger.debug(e.getMessage(), e);
        }
      }
    }

    /** Returns a string representation of the object. */
    @Override
    public final String toString() {
      return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
  }

  private static class ParseVariables {
    private final Map<Integer, CliVariable.Values> cliVariableMap = new HashMap<>();
    private final List<CliVariable> cliVariables = new ArrayList<>();
    private final CimerantLogger logger;

    /** Creates an instance. */
    ParseVariables(final String variableList) throws SysError {
      final var moduleCode = ModuleCode.ERR_M06;

      this.logger = (CimerantLogger) LoggerFactory.getLogger(this.getClass().getName());

      try (var reader =
          new InputStreamReader(
              Files.newInputStream(new File(variableList).toPath()), StandardCharsets.UTF_8)) {
        final List<Extension> extensions = Arrays.asList(TablesExtension.create());
        final var document = Parser.builder().extensions(extensions).build().parseReader(reader);
        this.parseNode(document);
      } catch (final Exception e) {
        // 0001 | Unknown error
        if (this.logger.isDebugEnabled()) {
          this.logger.debug(e.getMessage(), e);
        }
        throw new SysError(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, e.getMessage());
      }
    }

    public final boolean add(final CliVariable cliVariable) {
      if (cliVariable != null && !cliVariable.isEmpty()) {
        return this.cliVariables.add(cliVariable);
      }

      return false;
    }

    private void addCliVariable(final List<String> values) {
      final var cliVariable = new CliVariable();
      for (var i = 0; i < values.size(); i++) {
        cliVariable.setValue(this.cliVariableMap.get(i), values.get(i));
      }
      this.add(cliVariable);
    }

    public List<CliVariable> getCliVariables() {
      return this.cliVariables;
    }

    private void parseNode(final Node node) {
      if (node != null) {
        for (final Node nodeChild : Arrays.asList(node.getFirstChild(), node.getNext())) {
          if (nodeChild != null && TableBlock.class.isAssignableFrom(nodeChild.getClass())) {
            this.parseTableBlock((TableBlock) nodeChild);
          }
        }
      }
    }

    private void parseTableBlock(final TableBlock tableBlock) {
      if (tableBlock != null) {
        for (final Node node : Arrays.asList(tableBlock.getFirstChild(), tableBlock.getNext())) {
          if (node != null && TableHead.class.isAssignableFrom(node.getClass())) {
            this.parseTableHead((TableHead) node);
          }
        }
      }
    }

    private void parseTableBody(final TableBody tableBody) {
      if (tableBody != null) {
        for (final Node node : Arrays.asList(tableBody.getFirstChild(), tableBody.getNext())) {
          if (node != null && TableRow.class.isAssignableFrom(node.getClass())) {
            for (final List<String> cliVariable :
                this.parseTableRow((TableRow) node, new ArrayList<>())) {
              this.addCliVariable(cliVariable);
            }
          }
        }
      }
    }

    private List<String> parseTableCell(
        final TableCell tableCell, final List<String> tableCellData) {
      if (tableCell != null) {
        for (final Node node : Arrays.asList(tableCell.getFirstChild(), tableCell.getNext())) {
          if (node != null) {
            if (Text.class.isAssignableFrom(node.getClass())) {
              tableCellData.add(((Text) node).getLiteral());
            } else if (TableCell.class.isAssignableFrom(node.getClass())) {
              this.parseTableCell((TableCell) node, tableCellData);
            }
          }
        }
      }

      return tableCellData;
    }

    private void parseTableHead(final TableHead tableHead) {
      if (tableHead != null) {
        for (final Node node : Arrays.asList(tableHead.getFirstChild(), tableHead.getNext())) {
          if (node != null) {
            if (TableRow.class.isAssignableFrom(node.getClass())) {
              for (final List<String> cliVariable :
                  this.parseTableRow((TableRow) node, new ArrayList<>())) {
                for (var i = 0; i < cliVariable.size(); i++) {
                  try {
                    this.cliVariableMap.put(i, CliVariable.Values.getEnum(cliVariable.get(i)));
                  } catch (final Exception e) {
                    this.cliVariableMap.put(i, null);
                    if (this.logger.isDebugEnabled()) {
                      this.logger.debug(e.getMessage(), e);
                    }
                  }
                }
              }
            } else if (TableBody.class.isAssignableFrom(node.getClass())) {
              this.parseTableBody((TableBody) node);
            }
          }
        }
      }
    }

    private List<List<String>> parseTableRow(
        final TableRow tableRow, final List<List<String>> tableRowData) {
      if (tableRow != null) {
        for (final Node node : Arrays.asList(tableRow.getFirstChild(), tableRow.getNext())) {
          if (node != null) {
            if (TableCell.class.isAssignableFrom(node.getClass())) {
              tableRowData.add(this.parseTableCell((TableCell) node, new ArrayList<>()));
            } else if (TableRow.class.isAssignableFrom(node.getClass())) {
              this.parseTableRow((TableRow) node, tableRowData);
            }
          }
        }
      }

      return tableRowData;
    }
  }

  private final List<CliVariable> cliVariables = new ArrayList<>();

  /** Appends the specified element to the end of this list (optional operation). */
  @Override
  public final boolean add(final CliVariable cliVariable) {
    if (cliVariable != null && !cliVariable.isEmpty()) {
      return this.cliVariables.add(cliVariable);
    }

    return false;
  }

  /** Inserts the specified element at the specified position in this list (optional operation). */
  @Override
  public final void add(final int index, final CliVariable cliVariable) {
    if (cliVariable != null && !cliVariable.isEmpty()) {
      this.cliVariables.add(index, cliVariable);
    }
  }

  /**
   * Appends all of the elements in the specified collection to the end of this list, in the order
   * that they are returned by the specified collection's iterator (optional operation).
   */
  @Override
  public final boolean addAll(final Collection<? extends CliVariable> collection) {
    final List<CliVariable> arrayList = new ArrayList<>();

    if (collection != null && !collection.isEmpty()) {
      for (final CliVariable cliVariable : collection) {
        if (cliVariable != null && !cliVariable.isEmpty()) {
          arrayList.add(cliVariable);
        }
      }
    }

    return this.cliVariables.addAll(arrayList);
  }

  /**
   * Inserts all of the elements in the specified collection into this list at the specified
   * position (optional operation).
   */
  @Override
  public final boolean addAll(final int index, final Collection<? extends CliVariable> collection) {
    final List<CliVariable> arrayList = new ArrayList<>();

    if (collection != null && !collection.isEmpty()) {
      for (final CliVariable cliVariable : collection) {
        if (cliVariable != null && !cliVariable.isEmpty()) {
          arrayList.add(cliVariable);
        }
      }
    }

    return this.cliVariables.addAll(index, arrayList);
  }

  boolean addCliVariablesByVariableList(final String variableList) throws SysError {
    final var parseVariables = new ParseVariables(variableList);
    this.cliVariables.addAll(parseVariables.getCliVariables());
    return !parseVariables.getCliVariables().isEmpty();
  }

  /** Removes all of the elements from this list (optional operation). */
  @Override
  public final void clear() {
    this.cliVariables.clear();
  }

  /** Returns {@code true} if this list contains the specified element. */
  @Override
  public final boolean contains(final Object object) {
    return this.cliVariables.contains(object);
  }

  /** Returns {@code true} if this list contains all of the elements of the specified collection. */
  @Override
  public final boolean containsAll(final Collection<?> collection) {
    return this.cliVariables.containsAll(collection);
  }

  /** Returns the variable at the specified position in this list. */
  @Override
  public final CliVariable get(final int index) {
    return this.cliVariables.get(index);
  }

  /**
   * Returns the index of the first occurrence of the specified element in this list, or -1 if this
   * list does not contain the element.
   */
  @Override
  public final int indexOf(final Object object) {
    return this.cliVariables.indexOf(object);
  }

  /** Returns {@code true} if this list contains no elements. */
  @Override
  public final boolean isEmpty() {
    return this.cliVariables.isEmpty();
  }

  /** Returns an iterator over the elements in this list in proper sequence. */
  @Override
  public final Iterator<CliVariable> iterator() {
    return this.cliVariables.iterator();
  }

  /**
   * Returns the index of the last occurrence of the specified element in this list, or -1 if this
   * list does not contain the element.
   */
  @Override
  public final int lastIndexOf(final Object object) {
    return this.cliVariables.lastIndexOf(object);
  }

  /** Returns a list iterator over the elements in this list (in proper sequence). */
  @Override
  public final ListIterator<CliVariable> listIterator() {
    return this.cliVariables.listIterator();
  }

  /**
   * Returns a list iterator over the elements in this list (in proper sequence), starting at the
   * specified position in the list.
   */
  @Override
  public final ListIterator<CliVariable> listIterator(final int index) {
    return this.cliVariables.listIterator(index);
  }

  /** Removes the element at the specified position in this list (optional operation). */
  @Override
  public final CliVariable remove(final int index) {
    return this.cliVariables.remove(index);
  }

  /**
   * Removes the first occurrence of the specified element from this list, if it is present
   * (optional operation).
   */
  @Override
  public final boolean remove(final Object object) {
    return this.cliVariables.remove(object);
  }

  /**
   * Removes from this list all of its elements that are contained in the specified collection
   * (optional operation).
   */
  @Override
  public final boolean removeAll(final Collection<?> collection) {
    return this.cliVariables.removeAll(collection);
  }

  /**
   * Retains only the elements in this list that are contained in the specified collection (optional
   * operation).
   */
  @Override
  public final boolean retainAll(final Collection<?> collection) {
    return this.cliVariables.retainAll(collection);
  }

  /**
   * Replaces the element at the specified position in this list with the specified element
   * (optional operation).
   */
  @Override
  public final CliVariable set(final int index, final CliVariable cliVariable) {
    return this.cliVariables.set(index, cliVariable);
  }

  /** Returns the number of elements in this list. */
  @Override
  public final int size() {
    return this.cliVariables.size();
  }

  /**
   * Returns a view of the portion of this list between the specified {@code fromIndex}, inclusive,
   * and {@code toIndex}, exclusive.
   */
  @Override
  public final List<CliVariable> subList(final int fromIndex, final int toIndex) {
    return this.cliVariables.subList(fromIndex, toIndex);
  }

  /**
   * Returns an array containing all of the elements in this list in proper sequence (from first to
   * last element).
   */
  @Override
  public final Object[] toArray() {
    return this.cliVariables.toArray();
  }

  /**
   * Returns an array containing all of the elements in this list in proper sequence (from first to
   * last element); the runtime type of the returned array is that of the specified array.
   */
  @Override
  public final <T> T[] toArray(final T[] array) {
    return this.cliVariables.toArray(array);
  }

  /** Returns a string representation of the object. */
  @Override
  public final String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
  }
}
