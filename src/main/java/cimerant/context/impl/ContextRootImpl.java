package cimerant.context.impl;

import cimerant.Cimerant;
import cimerant.ModuleCode;
import cimerant.StatusCode;
import cimerant.SysError;
import cimerant.context.ContextRoot;
import cimerant.context.NotNullMap;
import cimerant.context.NotNullSet;
import cimerant.context.java.lang.impl.StringContextImpl;
import cimerant.context.java.util.impl.CollectionContextImpl;
import cimerant.context.java.util.impl.MapContextImpl;
import cimerant.context.java.util.impl.MapEntryContextImpl;
import cimerant.context.java.util.impl.SetContextImpl;
import cimerant.logger.CimerantLogger;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.StreamWriteConstraints;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;
import org.apache.velocity.VelocityContext;
import org.atteo.evo.inflector.English;
import org.slf4j.LoggerFactory;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 *
 * @param <E> The base type of the context.
 */
public class ContextRootImpl<E> extends VelocityContext implements ContextRoot<E> {
  private static volatile Map<Class<?>, Map<Integer, ContextRoot<?>>> instances = new HashMap<>();
  private static final CimerantLogger logger;
  private static final List<String> NUMBERS =
      Arrays.asList(
          "AtomicInteger",
          "AtomicLong",
          "BigDecimal",
          "BigInteger",
          "Byte",
          "Double",
          "DoubleAccumulator",
          "DoubleAdder",
          "Float",
          "int",
          "Integer",
          "Long",
          "LongAccumulator",
          "LongAdder",
          "Number",
          "Short");
  private static final long serialVersionUID = 1L;

  static {
    logger = (CimerantLogger) LoggerFactory.getLogger(ContextRootImpl.class.getName());
  }

  /** Removes all of the mappings from the map. The map will be empty after this call returns. */
  public static void clearInstances() {
    ContextRootImpl.instances.clear();
  }

  /**
   * A word is defined as a series of lower case alphanumeric characters proceeded by a upper case
   * character; one of the following characters "_", "-", ".", "/", "\", or a space. <br>
   * Words are then separated by a single space.
   *
   * @param string The string to define into words
   * @return A string of defined words
   */
  private static String defineWords(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }

    var returnValue = string;
    if (StringUtils.isMixedCase(returnValue)) {
      returnValue = returnValue.replaceAll("([a-zA-Z0-9])([A-Z]+)", "$1 $2");
    }

    returnValue = returnValue.replaceAll("[\\_\\-\\.\\/\\s\\\\]", " ");
    returnValue = returnValue.replace("  ", " ");

    return StringUtils.trimToEmpty(returnValue);
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param <E> The base type of the context.
   * @param contextObject The base context object.
   * @return a instance of the context.
   */
  @SuppressWarnings("unchecked")
  public static <E> ContextRoot<E> getInstance(final E contextObject) {
    final var moduleCode = ModuleCode.ERR_M0700;

    try {
      Objects.requireNonNull(contextObject);

      ContextRoot<E> returnValue;
      if (contextObject instanceof Collection) {
        returnValue =
            (ContextRoot<E>) CollectionContextImpl.getInstance((Collection<E>) contextObject);
      } else if (contextObject instanceof Map
          || contextObject instanceof Map.Entry
          || contextObject instanceof Set) {
        returnValue = ContextRootImpl.getInstance(contextObject);
      } else if (contextObject instanceof final String string) {
        returnValue = (ContextRoot<E>) StringContextImpl.getInstance(string);
      } else {
        returnValue = ContextRootImpl.registerInstance(new ContextRootImpl<>(contextObject));
      }
      return returnValue;
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (ContextRootImpl.logger.isDebugEnabled()) {
        ContextRootImpl.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  private static String objectToString(final Object arg) {
    if (arg == null || StringUtils.isEmpty(arg.toString())) {
      return "";
    }
    if (arg.getClass().isArray()) {
      return StringUtils.join(Arrays.asList(arg), " ");
    }
    if (arg instanceof Iterable) {
      return StringUtils.join((Iterable<?>) arg, " ");
    }

    return arg.toString();
  }

  private static String plural(final String word) {
    var newWord = English.plural(word, 2);

    if (newWord.equals(word) && !newWord.endsWith("s")) {
      newWord = newWord + 's';
    }

    return newWord;
  }

  /**
   * Register only one instance of the context.
   *
   * @param <T> The type of context.
   * @param contextObject The context object to be registered.
   * @return only one instance of the context.
   */
  @SuppressWarnings("unchecked")
  public static <T extends ContextRoot<?>> T registerInstance(final T contextObject) {
    Objects.requireNonNull(contextObject);

    synchronized (ContextRootImpl.class) {
      if (ContextRootImpl.instances.get(contextObject.getClass()) == null) {
        ContextRootImpl.instances.put(contextObject.getClass(), new HashMap<>());
      }
    }

    final var contextObjectClass = ContextRootImpl.instances.get(contextObject.getClass());
    final var hashCode = ((ContextRootImpl<?>) contextObject).getContextObject().hashCode();
    synchronized (ContextRootImpl.class) {
      if (contextObjectClass.get(hashCode) == null) {
        contextObjectClass.put(hashCode, contextObject);
      }
    }

    return (T) contextObjectClass.get(hashCode);
  }

  private static String singular(final String word) {
    var newWord = English.plural(word, 1);

    if (newWord.equals(word) && newWord.endsWith("s")) {
      newWord = newWord.replaceAll(".$", "");
    }

    return newWord;
  }

  /**
   * This method splits a String into words on the following characters "_", "-", ".", "/", "\", or
   * a space.
   *
   * @param string The string to split into words
   * @return An array of words
   */
  private static String[] words(final String string) {
    if (StringUtils.isBlank(string)) {
      return ArrayUtils.EMPTY_STRING_ARRAY;
    }
    return ContextRootImpl.defineWords(string).split(" ", 0);
  }

  private static List<String> wordsPluralLast(final Object arg) {
    if (arg == null || StringUtils.isEmpty(arg.toString())) {
      return Collections.<String>emptyList();
    }

    final String[] list;
    if (arg.getClass().isArray()) {
      list = ContextRootImpl.words(StringUtils.join(Arrays.asList(arg), " "));
    } else if (arg instanceof Iterable) {
      list = ContextRootImpl.words(StringUtils.join((Iterable<?>) arg, " "));
    } else {
      list = ContextRootImpl.words(arg.toString());
    }

    list[list.length - 1] = ContextRootImpl.plural(list[list.length - 1]);

    return Arrays.asList(list);
  }

  private static Object wordsSingularLast(final Object arg) {
    if (arg == null || StringUtils.isEmpty(arg.toString())) {
      return Collections.<String>emptyList();
    }

    final String[] list;
    if (arg.getClass().isArray()) {
      list = ContextRootImpl.words(StringUtils.join(Arrays.asList(arg), " "));
    } else if (arg instanceof Iterable) {
      list = ContextRootImpl.words(StringUtils.join((Iterable<?>) arg, " "));
    } else {
      list = ContextRootImpl.words(arg.toString());
    }

    list[list.length - 1] = ContextRootImpl.singular(list[list.length - 1]);

    return Arrays.asList(list);
  }

  /**
   * This method splits a String into words on the following characters "_", "-", ".", "/", "\", or
   * a space.
   *
   * @param string The string to split into words
   * @return An array of words
   */
  private static String[] wordsUpperFirst(final String string) {
    if (StringUtils.isBlank(string)) {
      return ArrayUtils.EMPTY_STRING_ARRAY;
    }
    return Arrays.stream(ContextRootImpl.words(string))
        .map(String::toLowerCase)
        .map(StringUtils::capitalize)
        .collect(Collectors.toList())
        .toArray(new String[0]);
  }

  /** The context object. */
  private final E contextObject;

  /** The extension of the file. */
  private String fileExtension;

  /** The name of the file. */
  private String fileName;

  /** The path of the file. */
  private List<String> filePath;

  /** The grouping for this context. */
  private List<String> grouping;

  /** The name of the object. */
  private String objectName = null;

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  protected ContextRootImpl(final E contextObject) {
    Objects.requireNonNull(contextObject);

    this.contextObject = contextObject;
  }

  /**
   * Converts a list of words into back slash lower case, that is each word is made up of lower case
   * characters separated by a back slash.
   */
  @Override
  public String backSlashLowerCase(final Object arg) {
    return StringUtils.lowerCase(
        String.join("\\", ContextRootImpl.words(ContextRootImpl.objectToString(arg))),
        Locale.getDefault());
  }

  /**
   * Converts a list of words into back slash title case, that is each word is made up of title case
   * characters separated by a back slash.
   */
  @Override
  public String backSlashTitleCase(final Object arg) {
    return String.join("\\", ContextRootImpl.wordsUpperFirst(ContextRootImpl.objectToString(arg)));
  }

  /**
   * Converts a list of words into back slash upper case, that is each word is made up of upper case
   * characters separated by a back slash.
   */
  @Override
  public String backSlashUpperCase(final Object arg) {
    return StringUtils.upperCase(
        String.join("\\", ContextRootImpl.words(ContextRootImpl.objectToString(arg))),
        Locale.getDefault());
  }

  /**
   * Converts a list into camelCase, that is each word is made up of a title case character and then
   * a series of lower case characters. The first String character will be lower case.
   */
  @Override
  public String camelCase(final Object arg) {
    return CaseUtils.toCamelCase(
        ContextRootImpl.defineWords(ContextRootImpl.objectToString(arg)), false, ' ');
  }

  /** Returns {@code true} if the context has the specified key is in the context. */
  @Override
  public boolean contextContainsKey(final String key) {
    return this.containsKey(key);
  }

  /** Gets the value corresponding to the provided key from the context. */
  @Override
  public Object contextGet(final String key) {
    return this.get(key);
  }

  /** Returns all the keys for the values in the context. */
  @Override
  public String[] contextGetKeys() {
    return this.getKeys();
  }

  /** Adds a name/value pair to the context. */
  @Override
  public Object contextPut(final String key, final Object value) {
    return this.put(key, value);
  }

  /** Removes the value associated with the specified key from the context. */
  @Override
  public Object contextRemove(final String key) {
    return this.remove(key);
  }

  /**
   * Converts a list of words into dot lower case, that is each word is made up of lower case
   * characters separated by a dot.
   */
  @Override
  public String dotLowerCase(final Object arg) {
    return StringUtils.lowerCase(
        String.join(".", ContextRootImpl.words(ContextRootImpl.objectToString(arg))),
        Locale.getDefault());
  }

  /**
   * Converts a list of words into dot title case, that is each word is made up of title case
   * characters separated by a dot.
   */
  @Override
  public String dotTitleCase(final Object arg) {
    return String.join(".", ContextRootImpl.wordsUpperFirst(ContextRootImpl.objectToString(arg)));
  }

  /**
   * Converts a list of words into dot upper case, that is each word is made up of upper case
   * characters separated by a dot.
   */
  @Override
  public String dotUpperCase(final Object arg) {
    return StringUtils.upperCase(
        String.join(".", ContextRootImpl.words(ContextRootImpl.objectToString(arg))),
        Locale.getDefault());
  }

  @Override
  public String formatDate(final Date date, final String format) {
    return new SimpleDateFormat(format).format(date);
  }

  /**
   * Converts a list of words into forward slash lower case, that is each word is made up of lower
   * case characters separated by a forward slash.
   */
  @Override
  public String forwardSlashLowerCase(final Object arg) {
    return StringUtils.lowerCase(
        String.join("/", ContextRootImpl.words(ContextRootImpl.objectToString(arg))),
        Locale.getDefault());
  }

  /**
   * Converts a list of words into forward slash title case, that is each word is made up of title
   * case characters separated by a forward slash.
   */
  @Override
  public String forwardSlashTitleCase(final Object arg) {
    return String.join("/", ContextRootImpl.wordsUpperFirst(ContextRootImpl.objectToString(arg)));
  }

  /**
   * Converts a list of words into forward slash upper case, that is each word is made up of upper
   * case characters separated by a forward slash.
   */
  @Override
  public String forwardSlashUpperCase(final Object arg) {
    return StringUtils.upperCase(
        String.join("/", ContextRootImpl.words(ContextRootImpl.objectToString(arg))),
        Locale.getDefault());
  }

  /**
   * Returns the class specified in the context, or {@code null} if this context contains no class.
   */
  @Override
  public Class<?> getContextClass() {
    return this.contextObject.getClass();
  }

  /**
   * Get the associated context.
   *
   * @return the associated context.
   */
  public E getContextObject() {
    return this.contextObject;
  }

  /**
   * Returns the extension of the file this context will be saved as specified in the context, or
   * {@code null} if this context contains no extension.
   */
  @Override
  public String getFileExtension() {
    return this.fileExtension;
  }

  /**
   * Returns the name of the file this context will be saved as specified in the context, or {@code
   * null} if this context contains no file name.
   */
  @Override
  public String getFileName() {
    if (StringUtils.isBlank(this.fileName)) {
      return "";
    }
    return this.fileName;
  }

  /**
   * Returns the path this context will be saved to as specified in the context, or {@code null} if
   * this context contains no file path.
   */
  @Override
  public List<String> getFilePath() {
    if (this.filePath == null) {
      this.filePath = new ArrayList<>();
    }
    return this.filePath;
  }

  /**
   * Returns the grouping as defined by the model specified in the context, or {@code null} if this
   * context contains no grouping.
   */
  @Override
  public List<String> getGrouping() {
    if (this.grouping == null) {
      this.grouping = new ArrayList<>();
    }
    return this.grouping;
  }

  /**
   * Returns the name of this object specified in the context, or {@code null} if this context
   * contains no object name.
   */
  @Override
  public String getObjectName() {
    if (StringUtils.isBlank(this.objectName)) {
      return this.getFileName();
    }
    return this.objectName;
  }

  /**
   * Returns {@code true} if this a collection context.
   *
   * @return {@code true} if this a collection context.
   */
  public boolean isCollectionContext() {
    return this instanceof CollectionContextImpl;
  }

  /**
   * Returns {@code true} if this a map context.
   *
   * @return {@code true} if this a map context.
   */
  public boolean isMapContext() {
    return this instanceof MapContextImpl;
  }

  /**
   * Returns {@code true} if this a map entry context.
   *
   * @return {@code true} if this a map entry context.
   */
  public boolean isMapEntryContext() {
    return this instanceof MapEntryContextImpl;
  }

  /**
   * Does the string passed in match one of the following.
   *
   * <ul>
   *   <li>AtomicInteger
   *   <li>AtomicLong
   *   <li>BigDecimal
   *   <li>BigInteger
   *   <li>Byte
   *   <li>Double
   *   <li>DoubleAccumulator
   *   <li>DoubleAdder
   *   <li>Float
   *   <li>int
   *   <li>Integer
   *   <li>Long
   *   <li>LongAccumulator
   *   <li>LongAdder
   *   <li>Number
   *   <li>Short
   * </ul>
   */
  @Override
  public boolean isNumericClass(final String string) {
    return ContextRootImpl.NUMBERS.stream().anyMatch(string::equalsIgnoreCase);
  }

  /**
   * Returns {@code true} if this a set context.
   *
   * @return {@code true} if this a set context.
   */
  public boolean isSetContext() {
    return this instanceof SetContextImpl;
  }

  /**
   * Returns {@code true} if this a string context.
   *
   * @return {@code true} if this a string context.
   */
  public boolean isStringContext() {
    return this instanceof StringContextImpl;
  }

  /**
   * Converts a list of words into kebab lower case, that is each word is made up of lower case
   * characters separated by a dash.
   */
  @Override
  public String kebabLowerCase(final Object arg) {
    return StringUtils.lowerCase(
        String.join("-", ContextRootImpl.words(ContextRootImpl.objectToString(arg))),
        Locale.getDefault());
  }

  /**
   * Converts a list of words into kebab title case, that is each word is made up of title case
   * characters separated by a dash.
   */
  @Override
  public String kebabTitleCase(final Object arg) {
    return String.join("-", ContextRootImpl.wordsUpperFirst(ContextRootImpl.objectToString(arg)));
  }

  /**
   * Converts a list of words into kebab upper case, that is each word is made up of upper case
   * characters separated by a dash.
   */
  @Override
  public String kebabUpperCase(final Object arg) {
    return StringUtils.upperCase(
        String.join("-", ContextRootImpl.words(ContextRootImpl.objectToString(arg))),
        Locale.getDefault());
  }

  /** Converts a list to lower case as per {@link String#toLowerCase()}. */
  @Override
  public String lowerCase(final Object arg) {
    return StringUtils.lowerCase(ContextRootImpl.objectToString(arg), Locale.getDefault());
  }

  /**
   * Uncapitalizes a list, changing the first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed.
   */
  @Override
  public String lowerFirst(final Object arg) {
    return StringUtils.uncapitalize(ContextRootImpl.objectToString(arg));
  }

  @Override
  public Map<String, ?> newMap() {
    return new NotNullMap<>();
  }

  @Override
  public Map<String, ?> newMap(final Map<String, ?> m) {
    return new NotNullMap<>(m);
  }

  @Override
  public Set<String> newSet() {
    return new NotNullSet();
  }

  @Override
  public Set<String> newSet(final Iterable<?> iterable) {
    return new NotNullSet(iterable);
  }

  @Override
  public Set<String> newSet(final String string) {
    return new NotNullSet(string);
  }

  /**
   * Converts a list into pascalCase, that is each word is made up of a title case character and
   * then a series of lower case characters. The first String character will be upper case.
   */
  @Override
  public String pascalCase(final Object arg) {
    return CaseUtils.toCamelCase(
        ContextRootImpl.defineWords(ContextRootImpl.objectToString(arg)), true, ' ');
  }

  /**
   * Converts a list of words into back slash lower case, that is each word is made up of lower case
   * characters separated by a back slash with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralBackSlashLowerCase(final Object arg) {
    return this.backSlashLowerCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into back slash title case, that is each word is made up of title case
   * characters separated by a back slash with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralBackSlashTitleCase(final Object arg) {
    return this.backSlashTitleCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into back slash upper case, that is each word is made up of upper case
   * characters separated by a back slash with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralBackSlashUpperCase(final Object arg) {
    return this.backSlashUpperCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list into camelCase, that is each word is made up of a title case character and then
   * a series of lower case characters. The first String character will be lower case with the last
   * word converted to the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralCamelCase(final Object arg) {
    return this.camelCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into dot lower case, that is each word is made up of lower case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralDotLowerCase(final Object arg) {
    return this.dotLowerCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into dot title case, that is each word is made up of title case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralDotTitleCase(final Object arg) {
    return this.dotTitleCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into dot upper case, that is each word is made up of upper case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralDotUpperCase(final Object arg) {
    return this.dotUpperCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into forward slash lower case, that is each word is made up of lower
   * case characters separated by a forward slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralForwardSlashLowerCase(final Object arg) {
    return this.forwardSlashLowerCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into forward slash title case, that is each word is made up of title
   * case characters separated by a forward slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralForwardSlashTitleCase(final Object arg) {
    return this.forwardSlashTitleCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into forward slash upper case, that is each word is made up of upper
   * case characters separated by a forward slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralForwardSlashUpperCase(final Object arg) {
    return this.forwardSlashUpperCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into kebab lower case, that is each word is made up of lower case
   * characters separated by a dash with the last word converted to the plural form of the given
   * word denoting more than one.
   */
  @Override
  public String pluralKebabLowerCase(final Object arg) {
    return this.kebabLowerCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into kebab title case, that is each word is made up of title case
   * characters separated by a dash with the last word converted to the plural form of the given
   * word denoting more than one.
   */
  @Override
  public String pluralKebabTitleCase(final Object arg) {
    return this.kebabTitleCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into kebab upper case, that is each word is made up of upper case
   * characters separated by a dash with the last word converted to the plural form of the given
   * word denoting more than one.
   */
  @Override
  public String pluralKebabUpperCase(final Object arg) {
    return this.kebabUpperCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list to lower case as per {@link String#toLowerCase()} with the last word converted
   * to the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralLowerCase(final Object arg) {
    return this.lowerCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Uncapitalizes a list, changing the first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed with the last word converted to
   * the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralLowerFirst(final Object arg) {
    return this.lowerFirst(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list into pascalCase, that is each word is made up of a title case character and
   * then a series of lower case characters. The first String character will be upper case with the
   * last word converted to the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralPascalCase(final Object arg) {
    return this.pascalCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into snake lower case, that is each word is made up of lower case
   * characters separated by a underscore with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralSnakeLowerCase(final Object arg) {
    return this.snakeLowerCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into snake title case, that is each word is made up of title case
   * characters separated by a underscore with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralSnakeTitleCase(final Object arg) {
    return this.snakeTitleCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words into snake upper case, that is each word is made up of upper case
   * characters separated by a underscore with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralSnakeUpperCase(final Object arg) {
    return this.snakeUpperCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list of words to the capitalization style commonly used for the titles of books,
   * articles, songs, etc. with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralTitleCase(final Object arg) {
    return this.titleCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Converts a list to upper case as per {@link String#toUpperCase()} with the last word converted
   * to the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralUpperCase(final Object arg) {
    return this.upperCase(ContextRootImpl.wordsPluralLast(arg));
  }

  /**
   * Capitalizes a list changing the first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed with the last word converted to
   * the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralUpperFirst(final Object arg) {
    return this.upperFirst(ContextRootImpl.wordsPluralLast(arg));
  }

  /** Set the extension of the file this context will be saved as. */
  @Override
  public void setFileExtension(final String fileExtension) {
    this.fileExtension = StringUtils.strip(fileExtension, ".");
  }

  /** Set the name of the file this context will be saved as. */
  @Override
  public void setFileName(final String fileName) {
    this.fileName = StringUtils.stripEnd(fileName, ".");
  }

  /** Set the path this context will be saved to. */
  @Override
  public void setFilePath(final List<String> filePath) {
    this.filePath = new ArrayList<>(filePath);
  }

  /** Set the path this context will be saved to. */
  @Override
  public void setFilePath(final String[] filePath) {
    this.filePath = Arrays.asList(filePath);
  }

  /** Set the context grouping. */
  @Override
  public void setGrouping(final List<String> groupings) {
    this.grouping = new ArrayList<>(groupings);
  }

  /** Set the context grouping. */
  @Override
  public void setGrouping(final String[] groupings) {
    this.grouping = Arrays.asList(groupings);
  }

  /** Set the name of this object. */
  @Override
  public void setObjectName(final String objectName) {
    this.objectName = objectName;
  }

  /**
   * Converts a list of words into back slash lower case, that is each word is made up of lower case
   * characters separated by a back slash with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularBackSlashLowerCase(final Object arg) {
    return this.backSlashLowerCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into back slash title case, that is each word is made up of title case
   * characters separated by a back slash with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularBackSlashTitleCase(final Object arg) {
    return this.backSlashTitleCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into back slash upper case, that is each word is made up of upper case
   * characters separated by a back slash with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularBackSlashUpperCase(final Object arg) {
    return this.backSlashUpperCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list into camelCase, that is each word is made up of a title case character and then
   * a series of lower case characters. The first String character will be lower case with the last
   * word converted to the singular form of the given word denoting only one.
   */
  @Override
  public String singularCamelCase(final Object arg) {
    return this.camelCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into dot lower case, that is each word is made up of lower case
   * characters separated by a dot with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularDotLowerCase(final Object arg) {
    return this.dotLowerCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into dot title case, that is each word is made up of title case
   * characters separated by a dot with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularDotTitleCase(final Object arg) {
    return this.dotTitleCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into dot upper case, that is each word is made up of upper case
   * characters separated by a dot with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularDotUpperCase(final Object arg) {
    return this.dotUpperCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into forward slash lower case, that is each word is made up of lower
   * case characters separated by a forward slash with the last word converted to the singular form
   * of the given word denoting only one.
   */
  @Override
  public String singularForwardSlashLowerCase(final Object arg) {
    return this.forwardSlashLowerCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into forward slash title case, that is each word is made up of title
   * case characters separated by a forward slash with the last word converted to the singular form
   * of the given word denoting only one.
   */
  @Override
  public String singularForwardSlashTitleCase(final Object arg) {
    return this.forwardSlashTitleCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into forward slash upper case, that is each word is made up of upper
   * case characters separated by a forward slash with the last word converted to the singular form
   * of the given word denoting only one.
   */
  @Override
  public String singularForwardSlashUpperCase(final Object arg) {
    return this.forwardSlashUpperCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into kebab lower case, that is each word is made up of lower case
   * characters separated by a dash with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularKebabLowerCase(final Object arg) {
    return this.kebabLowerCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into kebab title case, that is each word is made up of title case
   * characters separated by a dash with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularKebabTitleCase(final Object arg) {
    return this.kebabTitleCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into kebab upper case, that is each word is made up of upper case
   * characters separated by a dash with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularKebabUpperCase(final Object arg) {
    return this.kebabUpperCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list to lower case as per {@link String#toLowerCase()} with the last word converted
   * to the singular form of the given word denoting only one.
   */
  @Override
  public String singularLowerCase(final Object arg) {
    return this.lowerCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Uncapitalizes a list, changing the first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed with the last word converted to
   * the singular form of the given word denoting only one.
   */
  @Override
  public String singularLowerFirst(final Object arg) {
    return this.lowerFirst(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list into pascalCase, that is each word is made up of a title case character and
   * then a series of lower case characters. The first String character will be upper case with the
   * last word converted to the singular form of the given word denoting only one.
   */
  @Override
  public String singularPascalCase(final Object arg) {
    return this.pascalCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into snake lower case, that is each word is made up of lower case
   * characters separated by a underscore with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularSnakeLowerCase(final Object arg) {
    return this.snakeLowerCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into snake title case, that is each word is made up of title case
   * characters separated by a underscore with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularSnakeTitleCase(final Object arg) {
    return this.snakeTitleCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into snake upper case, that is each word is made up of upper case
   * characters separated by a underscore with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularSnakeUpperCase(final Object arg) {
    return this.snakeUpperCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words to the capitalization style commonly used for the titles of books,
   * articles, songs, etc. with the last word converted to the singular form of the given word
   * denoting only one.
   */
  @Override
  public String singularTitleCase(final Object arg) {
    return this.titleCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list to upper case as per {@link String#toUpperCase()} with the last word converted
   * to the singular form of the given word denoting only one.
   */
  @Override
  public String singularUpperCase(final Object arg) {
    return this.upperCase(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Capitalizes a list changing the first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed with the last word converted to
   * the singular form of the given word denoting only one.
   */
  @Override
  public String singularUpperFirst(final Object arg) {
    return this.upperFirst(ContextRootImpl.wordsSingularLast(arg));
  }

  /**
   * Converts a list of words into snake lower case, that is each word is made up of lower case
   * characters separated by a underscore.
   */
  @Override
  public String snakeLowerCase(final Object arg) {
    return StringUtils.lowerCase(
        String.join("_", ContextRootImpl.words(ContextRootImpl.objectToString(arg))),
        Locale.getDefault());
  }

  /**
   * Converts a list of words into snake title case, that is each word is made up of title case
   * characters separated by a underscore.
   */
  @Override
  public String snakeTitleCase(final Object arg) {
    return String.join("_", ContextRootImpl.wordsUpperFirst(ContextRootImpl.objectToString(arg)));
  }

  /**
   * Converts a list of words into snake upper case, that is each word is made up of upper case
   * characters separated by a underscore.
   */
  @Override
  public String snakeUpperCase(final Object arg) {
    return StringUtils.upperCase(
        String.join("_", ContextRootImpl.words(ContextRootImpl.objectToString(arg))),
        Locale.getDefault());
  }

  /**
   * Converts a list of words to the capitalization style commonly used for the titles of books,
   * articles, songs, etc.
   */
  @Override
  public String titleCase(final Object arg) {
    return String.join(" ", ContextRootImpl.wordsUpperFirst(ContextRootImpl.objectToString(arg)));
  }

  /**
   * Returns a JSON representation of the contents of this object.
   *
   * @return a JSON representation of the contents of this object.
   */
  public String toJson() {
    try {
      final var jsonFactory =
          new ObjectMapper()
              .getFactory()
              .setStreamWriteConstraints(
                  StreamWriteConstraints.builder().maxNestingDepth(5000).build());
      final var ow = new ObjectMapper(jsonFactory).writer().withDefaultPrettyPrinter();
      return ow.writeValueAsString(this);
    } catch (final JsonProcessingException e) {
      return super.toString() + System.lineSeparator() + e.getMessage();
    }
  }

  /** Converts a list to upper case as per {@link String#toUpperCase()}. */
  @Override
  public String upperCase(final Object arg) {
    return StringUtils.upperCase(ContextRootImpl.objectToString(arg), Locale.getDefault());
  }

  /**
   * Capitalizes a list changing the first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed.
   */
  @Override
  public String upperFirst(final Object arg) {
    return StringUtils.capitalize(ContextRootImpl.objectToString(arg));
  }
}
