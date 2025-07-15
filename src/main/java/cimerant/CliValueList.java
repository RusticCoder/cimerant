package cimerant;

import cimerant.CliValueList.CliValue;
import cimerant.CliValueList.CliValue.SingleMulti;
import cimerant.logger.CimerantLogger;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
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

/** List of Command-line Interface Values. */
class CliValueList implements List<CliValue> {
  /** Command-line Interface Value. */
  static class CliValue {
    enum SingleMulti {
      COPY,
      MULTI,
      SINGLE;

      private static SingleMulti getEnum(final String value) {
        return SingleMulti.valueOf(StringUtils.upperCase(value, Locale.getDefault()));
      }
    }

    private enum Values {
      FILE_PATTERN,
      OUTPUT_PATH,
      SINGLE_MULTI,
      TEMPLATE,
      UNKNOWN;

      @SuppressWarnings("CPD-START")
      private static Values getEnum(final String value) {
        try {
          final var str =
              RegExUtils.replaceAll(
                  StringUtils.upperCase(value, Locale.getDefault()),
                  Pattern.compile("[^a-zA-Z0-9]"),
                  "_");

          if (EnumUtils.isValidEnum(Values.class, str)) {
            return Values.valueOf(str);
          }

          return UNKNOWN;
        } catch (final Throwable t) {
          final var logger = LoggerFactory.getLogger(Values.class.getName());
          if (logger.isErrorEnabled()) {
            logger.error(t.getMessage(), t);
          }
          return UNKNOWN;
        }
      }
    }

    @SuppressWarnings("CPD-END")
    private final String filePattern;

    private final int lineNumber;
    private final CimerantLogger logger;
    private final String outputPath;
    private final SingleMulti singleMulti;
    private final String template;

    public CliValue(
        final int lineNumber,
        final String singleMulti,
        final String template,
        final String outputPath,
        final String filePattern) {
      this.logger = CimerantLogger.getLogger(this.getClass().getName());

      this.lineNumber = lineNumber;

      SingleMulti singleMultiValue = null;
      try {
        singleMultiValue = SingleMulti.getEnum(singleMulti);
      } catch (final Throwable t) {
        if (this.logger.isDebugEnabled()) {
          this.logger.debug(t.getMessage(), t);
        }
      }
      this.singleMulti = singleMultiValue;

      this.template = StringUtils.stripToNull(template);
      this.outputPath = StringUtils.stripToEmpty(outputPath);
      this.filePattern = StringUtils.stripToNull(filePattern);
    }

    String getFilePattern() {
      return this.getFilePattern(null);
    }

    String getFilePattern(final String prefix) {
      return this.getFilePattern(prefix, null);
    }

    String getFilePattern(final String prefix, final String className) {
      var returnValue = this.filePattern;

      if (StringUtils.isNotBlank(returnValue)) {
        if (StringUtils.isNotBlank(prefix)) {
          returnValue = prefix + File.separator + returnValue;
        }

        if (StringUtils.isNotBlank(className)) {
          returnValue = returnValue.replace("${CLASS_NAME}", className);
        }
      }

      return returnValue;
    }

    public int getLineNumber() {
      return this.lineNumber;
    }

    String getOutputPath() throws IOException {
      return this.outputPath;
    }

    SingleMulti getSingleMulti() {
      return this.singleMulti;
    }

    String getTemplate() {
      return this.template;
    }

    private boolean isEmpty() {
      return StringUtils.isBlank(this.filePattern)
          && StringUtils.isBlank(this.outputPath)
          && this.singleMulti == null
          && StringUtils.isBlank(this.template);
    }

    /** Returns a string representation of the object. */
    @Override
    public final String toString() {
      return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
  }

  private final String basePath;
  private final Map<Integer, CliValue.Values> cliValueMap = new TreeMap<>();
  private final List<CliValue> cliValues = new ArrayList<>();
  private final String inputFile;
  private final FileType inputFileType;
  private int lastIndex;
  private final CimerantLogger logger;

  CliValueList(final String inputFile, final FileType inputFileType, final String basePath) {
    Objects.requireNonNull(inputFile);
    Objects.requireNonNull(basePath);

    this.logger = CimerantLogger.getLogger(this.getClass().getName());
    this.inputFile = inputFile;
    this.inputFileType = inputFileType;
    this.basePath = basePath;
  }

  /** Appends the specified element to the end of this list (optional operation). */
  @Override
  public final boolean add(final CliValue cliValue) {
    if (cliValue != null && !cliValue.isEmpty()) {
      return this.cliValues.add(cliValue);
    }

    return false;
  }

  /** Inserts the specified element at the specified position in this list (optional operation). */
  @Override
  public final void add(final int index, final CliValue cliValue) {
    if (cliValue != null && !cliValue.isEmpty()) {
      this.cliValues.add(index, cliValue);
    }
  }

  /**
   * Appends all of the elements in the specified collection to the end of this list, in the order
   * that they are returned by the specified collection's iterator (optional operation).
   */
  @Override
  public final boolean addAll(final Collection<? extends CliValue> collection) {
    final List<CliValue> arrayList = new ArrayList<>();

    if (collection != null && !collection.isEmpty()) {
      for (final CliValue cliValue : collection) {
        if (cliValue != null && !cliValue.isEmpty()) {
          arrayList.add(cliValue);
        }
      }
    }

    return this.cliValues.addAll(arrayList);
  }

  /**
   * Inserts all of the elements in the specified collection into this list at the specified
   * position (optional operation).
   */
  @Override
  public final boolean addAll(final int index, final Collection<? extends CliValue> collection) {
    final List<CliValue> arrayList = new ArrayList<>();

    if (collection != null && !collection.isEmpty()) {
      for (final CliValue cliValue : collection) {
        if (cliValue != null && !cliValue.isEmpty()) {
          arrayList.add(cliValue);
        }
      }
    }

    return this.cliValues.addAll(index, arrayList);
  }

  private void addCliValue(final List<String> values) {
    Objects.requireNonNull(values);

    final var moduleCode = ModuleCode.ERR_M0300;

    final var lineNumber = this.lastIndex++;
    String singleMulti1 = null;
    String template = null;
    String outputPath = null;
    String filePattern = null;

    for (var i = 0; i < values.size(); i++) {
      if (this.cliValueMap.get(i) == CliValue.Values.SINGLE_MULTI && singleMulti1 != null) {
        try {
          final var singleMulti = SingleMulti.getEnum(values.get(i));
          if ((singleMulti == SingleMulti.SINGLE
                  && SingleMulti.getEnum(singleMulti1) == SingleMulti.MULTI)
              || (singleMulti == SingleMulti.MULTI
                  && SingleMulti.getEnum(singleMulti1) == SingleMulti.SINGLE)) {
            final var s = StatusCode.ERR_0018.getSysError(moduleCode, lineNumber);
            this.logger.error(s.getMessage(), s);
          }
        } catch (final Throwable t) {
          if (this.logger.isDebugEnabled()) {
            this.logger.debug(t.getMessage(), t);
          }
        }
      }

      try {
        switch (this.cliValueMap.get(i)) {
          case TEMPLATE:
            if (template != null) {
              final var s =
                  StatusCode.ERR_0003.getSysError(moduleCode, this.cliValueMap.get(i).toString());
              this.logger.error(s.getMessage(), s);
            } else {
              template = values.get(i);
            }
            break;
          case SINGLE_MULTI:
            if (singleMulti1 != null) {
              final var s =
                  StatusCode.ERR_0003.getSysError(moduleCode, this.cliValueMap.get(i).toString());
              this.logger.error(s.getMessage(), s);
            } else {
              singleMulti1 = values.get(i);
            }
            break;
          case OUTPUT_PATH:
            if (outputPath != null) {
              final var s =
                  StatusCode.ERR_0003.getSysError(moduleCode, this.cliValueMap.get(i).toString());
              this.logger.error(s.getMessage(), s);
            } else {
              outputPath =
                  Paths.get(CliValueList.this.basePath, StringUtils.stripToEmpty(values.get(i)))
                      .toString();
            }
            break;
          case FILE_PATTERN:
            if (filePattern != null) {
              final var s =
                  StatusCode.ERR_0003.getSysError(moduleCode, this.cliValueMap.get(i).toString());
              this.logger.error(s.getMessage(), s);
            } else {
              filePattern = values.get(i);
            }
            break;
          default:
        }
      } catch (final Throwable t) {
        if (this.logger.isDebugEnabled()) {
          this.logger.debug(t.getMessage(), t);
        }
      }
    }

    this.add(
        new CliValue(
            lineNumber,
            singleMulti1 == null ? null : singleMulti1.toString(),
            template,
            outputPath,
            filePattern));
  }

  @SuppressWarnings("CPD-START")
  void addCliValuesByTemplateList(final String templateList) {
    final var moduleCode = ModuleCode.ERR_M0301;

    try (var reader =
        new InputStreamReader(
            Files.newInputStream(new File(templateList).toPath()), StandardCharsets.UTF_8)) {
      final List<Extension> extensions = Arrays.asList(TablesExtension.create());
      final var document = Parser.builder().extensions(extensions).build().parseReader(reader);

      this.parseNode(document);
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (this.logger.isDebugEnabled()) {
        this.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  /** Removes all of the elements from this list (optional operation). */
  @SuppressWarnings("CPD-END")
  @Override
  public final void clear() {
    this.cliValues.clear();
  }

  /** Returns {@code true} if this list contains the specified element. */
  @Override
  public final boolean contains(final Object object) {
    Objects.requireNonNull(object);

    return this.cliValues.contains(object);
  }

  /** Returns {@code true} if this list contains all of the elements of the specified collection. */
  @Override
  public final boolean containsAll(final Collection<?> collection) {
    Objects.requireNonNull(collection);

    return this.cliValues.containsAll(collection);
  }

  /** Returns the value at the specified position in this list. */
  @Override
  public final CliValue get(final int index) {
    return this.cliValues.get(index);
  }

  String getInputFile() {
    return this.inputFile;
  }

  FileType getInputFileType() {
    return this.inputFileType;
  }

  public void increaseIndex() {
    ++this.lastIndex;
  }

  /**
   * Returns the index of the first occurrence of the specified element in this list, or -1 if this
   * list does not contain the element.
   */
  @Override
  public final int indexOf(final Object object) {
    Objects.requireNonNull(object);

    return this.cliValues.indexOf(object);
  }

  /** Returns {@code true} if this list contains no elements. */
  @Override
  public final boolean isEmpty() {
    return this.cliValues.isEmpty();
  }

  /** Returns an iterator over the elements in this list in proper sequence. */
  @Override
  public final Iterator<CliValue> iterator() {
    return this.cliValues.iterator();
  }

  /**
   * Returns the index of the last occurrence of the specified element in this list, or -1 if this
   * list does not contain the element.
   */
  @Override
  public final int lastIndexOf(final Object object) {
    Objects.requireNonNull(object);

    return this.cliValues.lastIndexOf(object);
  }

  /** Returns a list iterator over the elements in this list (in proper sequence). */
  @Override
  public final ListIterator<CliValue> listIterator() {
    return this.cliValues.listIterator();
  }

  /**
   * Returns a list iterator over the elements in this list (in proper sequence), starting at the
   * specified position in the list.
   */
  @Override
  public final ListIterator<CliValue> listIterator(final int index) {
    return this.cliValues.listIterator(index);
  }

  private void parseNode(final Node node) {
    if (node != null) {
      if (node instanceof TableBlock) {
        this.parseTableBlock((TableBlock) node);
      } else {
        this.parseNode(node.getFirstChild());
        this.parseNode(node.getNext());
      }
    }
  }

  private void parseTableBlock(final TableBlock tableBlock) {
    if (tableBlock != null) {
      for (final Node node : Arrays.asList(tableBlock.getFirstChild())) {
        if (node instanceof TableHead) {
          this.parseTableHead((TableHead) node);
        }
      }
    }
  }

  private void parseTableBody(final TableBody tableBody) {
    if (tableBody != null) {
      for (final Node node : Arrays.asList(tableBody.getFirstChild(), tableBody.getNext())) {
        if (node instanceof TableRow) {
          for (final List<String> cliValue :
              this.parseTableRow((TableRow) node, new ArrayList<>())) {
            this.addCliValue(cliValue);
          }
        }
      }
    }
  }

  private List<String> parseTableCell(final TableCell tableCell, final List<String> tableCellData) {
    if (tableCell != null) {
      var node = tableCell.getFirstChild();
      if (node instanceof Text) {
        tableCellData.add(((Text) node).getLiteral());
      } else {
        tableCellData.add(null);
      }

      node = tableCell.getNext();
      if (node instanceof TableCell) {
        this.parseTableCell((TableCell) node, tableCellData);
      }
    }

    return tableCellData;
  }

  private void parseTableHead(final TableHead tableHead) {
    if (tableHead != null) {
      for (final Node node : Arrays.asList(tableHead.getFirstChild(), tableHead.getNext())) {
        if (node != null) {
          if (node instanceof TableRow) {
            for (final List<String> cliValue :
                this.parseTableRow((TableRow) node, new ArrayList<>())) {
              for (var i = 0; i < cliValue.size(); i++) {
                try {
                  this.cliValueMap.put(i, CliValue.Values.getEnum(cliValue.get(i)));
                } catch (final Throwable t) {
                  this.cliValueMap.put(i, null);
                  if (this.logger.isDebugEnabled()) {
                    this.logger.debug(t.getMessage(), t);
                  }
                }
              }
            }
          } else if (node instanceof TableBody) {
            this.parseTableBody((TableBody) node);
          }
        }
      }
    }
  }

  private List<List<String>> parseTableRow(
      final TableRow tableRow, final List<List<String>> tableRowData) {
    Objects.requireNonNull(tableRow);
    Objects.requireNonNull(tableRowData);

    var node = tableRow.getFirstChild();
    if (node instanceof TableCell) {
      tableRowData.add(this.parseTableCell((TableCell) node, new ArrayList<>()));
    }

    node = tableRow.getNext();
    if (node instanceof TableRow) {
      this.parseTableRow((TableRow) node, tableRowData);
    }

    return tableRowData;
  }

  /** Removes the element at the specified position in this list (optional operation). */
  @Override
  public final CliValue remove(final int index) {
    return this.cliValues.remove(index);
  }

  /**
   * Removes the first occurrence of the specified element from this list, if it is present
   * (optional operation).
   */
  @Override
  public final boolean remove(final Object object) {
    Objects.requireNonNull(object);

    return this.cliValues.remove(object);
  }

  /**
   * Removes from this list all of its elements that are contained in the specified collection
   * (optional operation).
   */
  @Override
  public final boolean removeAll(final Collection<?> collection) {
    Objects.requireNonNull(collection);

    return this.cliValues.removeAll(collection);
  }

  /**
   * Retains only the elements in this list that are contained in the specified collection (optional
   * operation).
   */
  @Override
  public final boolean retainAll(final Collection<?> collection) {
    Objects.requireNonNull(collection);

    return this.cliValues.retainAll(collection);
  }

  /**
   * Replaces the element at the specified position in this list with the specified element
   * (optional operation).
   */
  @Override
  public final CliValue set(final int index, final CliValue cliValue) {
    Objects.requireNonNull(cliValue);

    return this.cliValues.set(index, cliValue);
  }

  /** Returns the number of elements in this list. */
  @Override
  public final int size() {
    return this.cliValues.size();
  }

  /**
   * Returns a view of the portion of this list between the specified {@code fromIndex}, inclusive,
   * and {@code toIndex}, exclusive.
   */
  @Override
  public final List<CliValue> subList(final int fromIndex, final int toIndex) {
    return this.cliValues.subList(fromIndex, toIndex);
  }

  /**
   * Returns an array containing all of the elements in this list in proper sequence (from first to
   * last element).
   */
  @Override
  public final Object[] toArray() {
    return this.cliValues.toArray();
  }

  /**
   * Returns an array containing all of the elements in this list in proper sequence (from first to
   * last element); the runtime type of the returned array is that of the specified array.
   */
  @Override
  public final <T> T[] toArray(final T[] array) {
    Objects.requireNonNull(array);

    return this.cliValues.toArray(array);
  }

  /** Returns a string representation of the object. */
  @Override
  public final String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
  }
}
