package cimerant.context.impl;

import cimerant.context.ContextRoot;
import cimerant.context.java.lang.impl.StringContextImpl;
import cimerant.context.java.util.impl.CollectionContextImpl;
import cimerant.context.java.util.impl.MapContextImpl;
import cimerant.context.java.util.impl.MapEntryContextImpl;
import cimerant.context.java.util.impl.SetContextImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.StreamWriteConstraints;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
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

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 *
 * @param <E> The base type of the context.
 */
public class ContextRootImpl<E> extends VelocityContext implements ContextRoot<E> {
  private static volatile HashMap<Class<?>, HashMap<Integer, ContextRoot<?>>> instances =
      new HashMap<>();
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

  /** Removes all of the mappings from the map. The map will be empty after this call returns. */
  public static void clearInstances() {
    ContextRootImpl.instances.clear();
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
    Objects.requireNonNull(contextObject);

    ContextRoot<E> returnValue;
    if (contextObject.getClass() == Collection.class) {
      returnValue =
          (ContextRoot<E>) CollectionContextImpl.getInstance((Collection<E>) contextObject);
    } else if (contextObject.getClass() == Map.class
        || contextObject.getClass() == Map.Entry.class
        || contextObject.getClass() == Set.class) {
      returnValue = ContextRootImpl.getInstance(contextObject);
    } else if (contextObject.getClass() == String.class) {
      returnValue = (ContextRoot<E>) StringContextImpl.getInstance((String) contextObject);
    } else {
      returnValue = ContextRootImpl.registerInstance(new ContextRootImpl<>(contextObject));
    }
    return returnValue;
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

    if (ContextRootImpl.instances.get(contextObject.getClass()) == null) {
      ContextRootImpl.instances.put(contextObject.getClass(), new HashMap<>());
    }

    final var hashCode = ((ContextRootImpl<?>) contextObject).getContextObject().hashCode();

    if (ContextRootImpl.instances.get(contextObject.getClass()).get(hashCode) == null) {
      synchronized (ContextRootImpl.class) {
        if (ContextRootImpl.instances.get(contextObject.getClass()).get(hashCode) == null) {
          ContextRootImpl.instances.get(contextObject.getClass()).put(hashCode, contextObject);
        }
      }
    }

    return (T) ContextRootImpl.instances.get(contextObject.getClass()).get(hashCode);
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
  public String backSlashLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.backSlashLowerCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into back slash lower case, that is each word is made up of lower
   * case characters separated by a back slash.
   */
  @Override
  public String backSlashLowerCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("\\", this.words(string)).toLowerCase(Locale.getDefault());
  }

  /**
   * Converts a list of words into back slash title case, that is each word is made up of title case
   * characters separated by a back slash.
   */
  @Override
  public String backSlashTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.backSlashTitleCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into back slash title case, that is each word is made up of title
   * case characters separated by a back slash.
   */
  @Override
  public String backSlashTitleCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("\\", this.wordsUpperFirst(string));
  }

  /**
   * Converts a list of words into back slash upper case, that is each word is made up of upper case
   * characters separated by a back slash.
   */
  @Override
  public String backSlashUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.backSlashUpperCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into back slash upper case, that is each word is made up of upper
   * case characters separated by a back slash.
   */
  @Override
  public String backSlashUpperCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("\\", this.words(string)).toUpperCase(Locale.getDefault());
  }

  /**
   * Converts a list into camelCase, that is each word is made up of a title case character and then
   * a series of lower case characters. The first String character will be lower case.
   */
  @Override
  public String camelCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.camelCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts all the delimiter separated words in a String into camelCase, that is each word is
   * made up of a title case character and then a series of lower case characters. The first String
   * character will be lower case.
   */
  @Override
  public String camelCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return CaseUtils.toCamelCase(this.defineWords(string), false, ' ');
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
   * A word is defined as a series of lower case alphanumeric characters proceeded by a upper case
   * character; one of the following characters "_", "-", ".", "/", "\", or a space. <br>
   * Words are then separated by a single space.
   *
   * @param string The string to define into words
   * @return A string of defined words
   */
  private String defineWords(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }

    var returnValue = string;
    if (StringUtils.isMixedCase(returnValue)) {
      returnValue = returnValue.replaceAll("([a-zA-Z0-9])([A-Z]+)", "$1 $2");
    }

    returnValue = returnValue.replaceAll("[\\_\\-\\.\\/\\s\\\\]", " ");
    returnValue = returnValue.replace("  ", " ");

    return returnValue.trim();
  }

  /**
   * Converts a list of words into dot lower case, that is each word is made up of lower case
   * characters separated by a dot.
   */
  @Override
  public String dotLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.dotLowerCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into dot lower case, that is each word is made up of lower case
   * characters separated by a dot.
   */
  @Override
  public String dotLowerCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join(".", this.words(string)).toLowerCase(Locale.getDefault());
  }

  /**
   * Converts a list of words into dot title case, that is each word is made up of title case
   * characters separated by a dot.
   */
  @Override
  public String dotTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.dotTitleCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into dot title case, that is each word is made up of title case
   * characters separated by a dot.
   */
  @Override
  public String dotTitleCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join(".", this.wordsUpperFirst(string));
  }

  /**
   * Converts a list of words into dot upper case, that is each word is made up of upper case
   * characters separated by a dot.
   */
  @Override
  public String dotUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.dotUpperCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into dot upper case, that is each word is made up of upper case
   * characters separated by a dot.
   */
  @Override
  public String dotUpperCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join(".", this.words(string)).toUpperCase(Locale.getDefault());
  }

  /**
   * Converts a list of words into forward slash lower case, that is each word is made up of lower
   * case characters separated by a forward slash.
   */
  @Override
  public String forwardSlashLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.forwardSlashLowerCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into forward slash lower case, that is each word is made up of lower
   * case characters separated by a forward slash.
   */
  @Override
  public String forwardSlashLowerCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("/", this.words(string)).toLowerCase(Locale.getDefault());
  }

  /**
   * Converts a list of words into forward slash title case, that is each word is made up of title
   * case characters separated by a forward slash.
   */
  @Override
  public String forwardSlashTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.forwardSlashTitleCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into forward slash title case, that is each word is made up of title
   * case characters separated by a forward slash.
   */
  @Override
  public String forwardSlashTitleCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("/", this.wordsUpperFirst(string));
  }

  /**
   * Converts a list of words into forward slash upper case, that is each word is made up of upper
   * case characters separated by a forward slash.
   */
  @Override
  public String forwardSlashUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.forwardSlashUpperCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into forward slash upper case, that is each word is made up of upper
   * case characters separated by a forward slash.
   */
  @Override
  public String forwardSlashUpperCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("/", this.words(string)).toUpperCase(Locale.getDefault());
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
      this.filePath = new LinkedList<>();
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
      this.grouping = new LinkedList<>();
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
    return this.getClass() == CollectionContextImpl.class;
  }

  /**
   * Returns {@code true} if this a map context.
   *
   * @return {@code true} if this a map context.
   */
  public boolean isMapContext() {
    return this.getClass() == MapContextImpl.class;
  }

  /**
   * Returns {@code true} if this a map entry context.
   *
   * @return {@code true} if this a map entry context.
   */
  public boolean isMapEntryContext() {
    return this.getClass() == MapEntryContextImpl.class;
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
    return this.getClass() == SetContextImpl.class;
  }

  /**
   * Returns {@code true} if this a string context.
   *
   * @return {@code true} if this a string context.
   */
  public boolean isStringContext() {
    return this.getClass() == StringContextImpl.class;
  }

  /**
   * Converts a list of words into kebab lower case, that is each word is made up of lower case
   * characters separated by a dash.
   */
  @Override
  public String kebabLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.kebabLowerCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into kebab lower case, that is each word is made up of lower case
   * characters separated by a dash.
   */
  @Override
  public String kebabLowerCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("-", this.words(string)).toLowerCase(Locale.getDefault());
  }

  /**
   * Converts a list of words into kebab title case, that is each word is made up of title case
   * characters separated by a dash.
   */
  @Override
  public String kebabTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.kebabTitleCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into kebab title case, that is each word is made up of title case
   * characters separated by a dash.
   */
  @Override
  public String kebabTitleCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("-", this.wordsUpperFirst(string));
  }

  /**
   * Converts a list of words into kebab upper case, that is each word is made up of upper case
   * characters separated by a dash.
   */
  @Override
  public String kebabUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.kebabUpperCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into kebab upper case, that is each word is made up of upper case
   * characters separated by a dash.
   */
  @Override
  public String kebabUpperCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("-", this.words(string)).toUpperCase(Locale.getDefault());
  }

  /** Converts a list to lower case as per {@link String#toLowerCase()}. */
  @Override
  public String lowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.lowerCase(StringUtils.join(string, "_"));
  }

  /** Converts a String to lower case as per {@link String#toLowerCase()}. */
  @Override
  public String lowerCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return StringUtils.lowerCase(string);
  }

  /**
   * Uncapitalizes a list, changing the first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed.
   */
  @Override
  public String lowerFirst(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.lowerFirst(StringUtils.join(string, "_"));
  }

  /**
   * Uncapitalizes a String, changing the first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed.
   */
  @Override
  public String lowerFirst(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return StringUtils.uncapitalize(string);
  }

  /**
   * Converts a list into pascalCase, that is each word is made up of a title case character and
   * then a series of lower case characters. The first String character will be upper case.
   */
  @Override
  public String pascalCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.pascalCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts all the delimiter separated words in a String into pascalCase, that is each word is
   * made up of a title case character and then a series of lower case characters. The first String
   * character will be upper case.
   */
  @Override
  public String pascalCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return CaseUtils.toCamelCase(this.defineWords(string), true, ' ');
  }

  private String plural(final String word) {
    var newWord = English.plural(word, 2);

    if (newWord.equals(word) && !newWord.endsWith("s")) {
      newWord = newWord + 's';
    }

    return newWord;
  }

  /**
   * Converts a list of words into back slash lower case, that is each word is made up of lower case
   * characters separated by a back slash with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralBackSlashLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.backSlashLowerCase(string);
  }

  /**
   * Converts a string of words into back slash lower case, that is each word is made up of lower
   * case characters separated by a back slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralBackSlashLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.backSlashLowerCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into back slash title case, that is each word is made up of title case
   * characters separated by a back slash with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralBackSlashTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.backSlashTitleCase(string);
  }

  /**
   * Converts a string of words into back slash title case, that is each word is made up of title
   * case characters separated by a back slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralBackSlashTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.backSlashTitleCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into back slash upper case, that is each word is made up of upper case
   * characters separated by a back slash with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralBackSlashUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.backSlashUpperCase(string);
  }

  /**
   * Converts a string of words into back slash upper case, that is each word is made up of upper
   * case characters separated by a back slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralBackSlashUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.backSlashUpperCase(Arrays.asList(words));
  }

  /**
   * Converts a list into camelCase, that is each word is made up of a title case character and then
   * a series of lower case characters. The first String character will be lower case with the last
   * word converted to the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralCamelCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.camelCase(string);
  }

  /**
   * Converts all the delimiter separated words in a String into camelCase, that is each word is
   * made up of a title case character and then a series of lower case characters. The first String
   * character will be lower case with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralCamelCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.camelCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into dot lower case, that is each word is made up of lower case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralDotLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.dotLowerCase(string);
  }

  /**
   * Converts a string of words into dot lower case, that is each word is made up of lower case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralDotLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.dotLowerCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into dot title case, that is each word is made up of title case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralDotTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.dotTitleCase(string);
  }

  /**
   * Converts a string of words into dot title case, that is each word is made up of title case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralDotTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.dotTitleCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into dot upper case, that is each word is made up of upper case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralDotUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.dotUpperCase(string);
  }

  /**
   * Converts a string of words into dot upper case, that is each word is made up of upper case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralDotUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.dotUpperCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into forward slash lower case, that is each word is made up of lower
   * case characters separated by a forward slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralForwardSlashLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.forwardSlashLowerCase(string);
  }

  /**
   * Converts a string of words into forward slash lower case, that is each word is made up of lower
   * case characters separated by a forward slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralForwardSlashLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.forwardSlashLowerCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into forward slash title case, that is each word is made up of title
   * case characters separated by a forward slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralForwardSlashTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.forwardSlashTitleCase(string);
  }

  /**
   * Converts a string of words into forward slash title case, that is each word is made up of title
   * case characters separated by a forward slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralForwardSlashTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.forwardSlashTitleCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into forward slash upper case, that is each word is made up of upper
   * case characters separated by a forward slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralForwardSlashUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.forwardSlashUpperCase(string);
  }

  /**
   * Converts a string of words into forward slash upper case, that is each word is made up of upper
   * case characters separated by a forward slash with the last word converted to the plural form of
   * the given word denoting more than one.
   */
  @Override
  public String pluralForwardSlashUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.forwardSlashUpperCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into kebab lower case, that is each word is made up of lower case
   * characters separated by a dash with the last word converted to the plural form of the given
   * word denoting more than one.
   */
  @Override
  public String pluralKebabLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.kebabLowerCase(string);
  }

  /**
   * Converts a string of words into kebab lower case, that is each word is made up of lower case
   * characters separated by a dash with the last word converted to the plural form of the given
   * word denoting more than one.
   */
  @Override
  public String pluralKebabLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.kebabLowerCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into kebab title case, that is each word is made up of title case
   * characters separated by a dash with the last word converted to the plural form of the given
   * word denoting more than one.
   */
  @Override
  public String pluralKebabTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.kebabTitleCase(string);
  }

  /**
   * Converts a string of words into kebab title case, that is each word is made up of title case
   * characters separated by a dash with the last word converted to the plural form of the given
   * word denoting more than one.
   */
  @Override
  public String pluralKebabTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.kebabTitleCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into kebab upper case, that is each word is made up of upper case
   * characters separated by a dash with the last word converted to the plural form of the given
   * word denoting more than one.
   */
  @Override
  public String pluralKebabUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.kebabUpperCase(string);
  }

  /**
   * Converts a string of words into kebab upper case, that is each word is made up of upper case
   * characters separated by a dash with the last word converted to the plural form of the given
   * word denoting more than one.
   */
  @Override
  public String pluralKebabUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.kebabUpperCase(Arrays.asList(words));
  }

  /**
   * Converts a list to lower case as per {@link String#toLowerCase()} with the last word converted
   * to the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.lowerCase(string);
  }

  /**
   * Converts a String to lower case as per {@link String#toLowerCase()} with the last word
   * converted to the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.lowerCase(Arrays.asList(words));
  }

  /**
   * Uncapitalizes a list, changing the first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed with the last word converted to
   * the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralLowerFirst(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.lowerFirst(string);
  }

  /**
   * Uncapitalizes a String, changing the first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed with the last word converted to
   * the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralLowerFirst(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.lowerFirst(Arrays.asList(words));
  }

  /**
   * Converts a list into pascalCase, that is each word is made up of a title case character and
   * then a series of lower case characters. The first String character will be upper case with the
   * last word converted to the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralPascalCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.pascalCase(string);
  }

  /**
   * Converts all the delimiter separated words in a String into pascalCase, that is each word is
   * made up of a title case character and then a series of lower case characters. The first String
   * character will be upper case with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralPascalCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.pascalCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into snake lower case, that is each word is made up of lower case
   * characters separated by a underscore with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralSnakeLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.snakeLowerCase(string);
  }

  /**
   * Converts a string of words into snake lower case, that is each word is made up of lower case
   * characters separated by a underscore with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralSnakeLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.snakeLowerCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into snake title case, that is each word is made up of title case
   * characters separated by a underscore with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralSnakeTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.snakeTitleCase(string);
  }

  /**
   * Converts a string of words into snake title case, that is each word is made up of title case
   * characters separated by a underscore with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralSnakeTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.snakeTitleCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into snake upper case, that is each word is made up of upper case
   * characters separated by a underscore with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralSnakeUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.snakeUpperCase(string);
  }

  /**
   * Converts a string of words into snake upper case, that is each word is made up of upper case
   * characters separated by a underscore with the last word converted to the plural form of the
   * given word denoting more than one.
   */
  @Override
  public String pluralSnakeUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.snakeUpperCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words to the capitalization style commonly used for the titles of books,
   * articles, songs, etc. with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.titleCase(string);
  }

  /**
   * Converts a string of words to the capitalization style commonly used for the titles of books,
   * articles, songs, etc. with the last word converted to the plural form of the given word
   * denoting more than one.
   */
  @Override
  public String pluralTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.titleCase(Arrays.asList(words));
  }

  /**
   * Converts a list to upper case as per {@link String#toUpperCase()} with the last word converted
   * to the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.upperCase(string);
  }

  /**
   * Converts a String to upper case as per {@link String#toUpperCase()} with the last word
   * converted to the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.upperCase(Arrays.asList(words));
  }

  /**
   * Capitalizes a list changing the first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed with the last word converted to
   * the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralUpperFirst(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.plural(string.get(string.size() - 1)));
    return this.upperFirst(string);
  }

  /**
   * Capitalizes a String changing the first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed with the last word converted to
   * the plural form of the given word denoting more than one.
   */
  @Override
  public String pluralUpperFirst(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.plural(words[words.length - 1]);
    }
    return this.upperFirst(Arrays.asList(words));
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
    this.filePath = filePath;
  }

  /** Set the context grouping. */
  @Override
  public void setGrouping(final List<String> groupings) {
    this.grouping = groupings;
  }

  /** Set the name of this object. */
  @Override
  public void setObjectName(final String objectName) {
    this.objectName = objectName;
  }

  private String singular(final String word) {
    var newWord = English.plural(word, 1);

    if (newWord.equals(word) && newWord.endsWith("s")) {
      newWord = newWord.replaceAll(".$", "");
    }

    return newWord;
  }

  /**
   * Converts a list of words into back slash lower case, that is each word is made up of lower case
   * characters separated by a back slash with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularBackSlashLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.backSlashLowerCase(string);
  }

  /**
   * Converts a string of words into back slash lower case, that is each word is made up of lower
   * case characters separated by a back slash with the last word converted to the singular form of
   * the given word denoting only one.
   */
  @Override
  public String singularBackSlashLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.backSlashLowerCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into back slash title case, that is each word is made up of title case
   * characters separated by a back slash with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularBackSlashTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.backSlashTitleCase(string);
  }

  /**
   * Converts a string of words into back slash title case, that is each word is made up of title
   * case characters separated by a back slash with the last word converted to the singular form of
   * the given word denoting only one.
   */
  @Override
  public String singularBackSlashTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.backSlashTitleCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into back slash upper case, that is each word is made up of upper case
   * characters separated by a back slash with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularBackSlashUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.backSlashUpperCase(string);
  }

  /**
   * Converts a string of words into back slash upper case, that is each word is made up of upper
   * case characters separated by a back slash with the last word converted to the singular form of
   * the given word denoting only one.
   */
  @Override
  public String singularBackSlashUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.backSlashUpperCase(Arrays.asList(words));
  }

  /**
   * Converts a list into camelCase, that is each word is made up of a title case character and then
   * a series of lower case characters. The first String character will be lower case with the last
   * word converted to the singular form of the given word denoting only one.
   */
  @Override
  public String singularCamelCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.camelCase(string);
  }

  /**
   * Converts all the delimiter separated words in a String into camelCase, that is each word is
   * made up of a title case character and then a series of lower case characters. The first String
   * character will be lower case with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularCamelCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.camelCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into dot lower case, that is each word is made up of lower case
   * characters separated by a dot with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularDotLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.dotLowerCase(string);
  }

  /**
   * Converts a string of words into dot lower case, that is each word is made up of lower case
   * characters separated by a dot with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularDotLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.dotLowerCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into dot title case, that is each word is made up of title case
   * characters separated by a dot with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularDotTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.dotTitleCase(string);
  }

  /**
   * Converts a string of words into dot title case, that is each word is made up of title case
   * characters separated by a dot with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularDotTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.dotTitleCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into dot upper case, that is each word is made up of upper case
   * characters separated by a dot with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularDotUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.dotUpperCase(string);
  }

  /**
   * Converts a string of words into dot upper case, that is each word is made up of upper case
   * characters separated by a dot with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularDotUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.dotUpperCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into forward slash lower case, that is each word is made up of lower
   * case characters separated by a forward slash with the last word converted to the singular form
   * of the given word denoting only one.
   */
  @Override
  public String singularForwardSlashLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.forwardSlashLowerCase(string);
  }

  /**
   * Converts a string of words into forward slash lower case, that is each word is made up of lower
   * case characters separated by a forward slash with the last word converted to the singular form
   * of the given word denoting only one.
   */
  @Override
  public String singularForwardSlashLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.forwardSlashLowerCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into forward slash title case, that is each word is made up of title
   * case characters separated by a forward slash with the last word converted to the singular form
   * of the given word denoting only one.
   */
  @Override
  public String singularForwardSlashTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.forwardSlashTitleCase(string);
  }

  /**
   * Converts a string of words into forward slash title case, that is each word is made up of title
   * case characters separated by a forward slash with the last word converted to the singular form
   * of the given word denoting only one.
   */
  @Override
  public String singularForwardSlashTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.forwardSlashTitleCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into forward slash upper case, that is each word is made up of upper
   * case characters separated by a forward slash with the last word converted to the singular form
   * of the given word denoting only one.
   */
  @Override
  public String singularForwardSlashUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.forwardSlashUpperCase(string);
  }

  /**
   * Converts a string of words into forward slash upper case, that is each word is made up of upper
   * case characters separated by a forward slash with the last word converted to the singular form
   * of the given word denoting only one.
   */
  @Override
  public String singularForwardSlashUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.forwardSlashUpperCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into kebab lower case, that is each word is made up of lower case
   * characters separated by a dash with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularKebabLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.kebabLowerCase(string);
  }

  /**
   * Converts a string of words into kebab lower case, that is each word is made up of lower case
   * characters separated by a dash with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularKebabLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.kebabLowerCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into kebab title case, that is each word is made up of title case
   * characters separated by a dash with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularKebabTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.kebabTitleCase(string);
  }

  /**
   * Converts a string of words into kebab title case, that is each word is made up of title case
   * characters separated by a dash with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularKebabTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.kebabTitleCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into kebab upper case, that is each word is made up of upper case
   * characters separated by a dash with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularKebabUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.kebabUpperCase(string);
  }

  /**
   * Converts a string of words into kebab upper case, that is each word is made up of upper case
   * characters separated by a dash with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularKebabUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.kebabUpperCase(Arrays.asList(words));
  }

  /**
   * Converts a list to lower case as per {@link String#toLowerCase()} with the last word converted
   * to the singular form of the given word denoting only one.
   */
  @Override
  public String singularLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.lowerCase(string);
  }

  /**
   * Converts a String to lower case as per {@link String#toLowerCase()} with the last word
   * converted to the singular form of the given word denoting only one.
   */
  @Override
  public String singularLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.lowerCase(Arrays.asList(words));
  }

  /**
   * Uncapitalizes a list, changing the first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed with the last word converted to
   * the singular form of the given word denoting only one.
   */
  @Override
  public String singularLowerFirst(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.lowerFirst(string);
  }

  /**
   * Uncapitalizes a String, changing the first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed with the last word converted to
   * the singular form of the given word denoting only one.
   */
  @Override
  public String singularLowerFirst(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.lowerFirst(Arrays.asList(words));
  }

  /**
   * Converts a list into pascalCase, that is each word is made up of a title case character and
   * then a series of lower case characters. The first String character will be upper case with the
   * last word converted to the singular form of the given word denoting only one.
   */
  @Override
  public String singularPascalCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.pascalCase(string);
  }

  /**
   * Converts all the delimiter separated words in a String into pascalCase, that is each word is
   * made up of a title case character and then a series of lower case characters. The first String
   * character will be upper case with the last word converted to the singular form of the given
   * word denoting only one.
   */
  @Override
  public String singularPascalCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.pascalCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into snake lower case, that is each word is made up of lower case
   * characters separated by a underscore with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularSnakeLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.snakeLowerCase(string);
  }

  /**
   * Converts a string of words into snake lower case, that is each word is made up of lower case
   * characters separated by a underscore with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularSnakeLowerCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.snakeLowerCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into snake title case, that is each word is made up of title case
   * characters separated by a underscore with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularSnakeTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.snakeTitleCase(string);
  }

  /**
   * Converts a string of words into snake title case, that is each word is made up of title case
   * characters separated by a underscore with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularSnakeTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.snakeTitleCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words into snake upper case, that is each word is made up of upper case
   * characters separated by a underscore with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularSnakeUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.snakeUpperCase(string);
  }

  /**
   * Converts a string of words into snake upper case, that is each word is made up of upper case
   * characters separated by a underscore with the last word converted to the singular form of the
   * given word denoting only one.
   */
  @Override
  public String singularSnakeUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.snakeUpperCase(Arrays.asList(words));
  }

  /**
   * Converts a list of words to the capitalization style commonly used for the titles of books,
   * articles, songs, etc. with the last word converted to the singular form of the given word
   * denoting only one.
   */
  @Override
  public String singularTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.titleCase(string);
  }

  /**
   * Converts a string of words to the capitalization style commonly used for the titles of books,
   * articles, songs, etc. with the last word converted to the singular form of the given word
   * denoting only one.
   */
  @Override
  public String singularTitleCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.titleCase(Arrays.asList(words));
  }

  /**
   * Converts a list to upper case as per {@link String#toUpperCase()} with the last word converted
   * to the singular form of the given word denoting only one.
   */
  @Override
  public String singularUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.upperCase(string);
  }

  /**
   * Converts a String to upper case as per {@link String#toUpperCase()} with the last word
   * converted to the singular form of the given word denoting only one.
   */
  @Override
  public String singularUpperCase(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.upperCase(Arrays.asList(words));
  }

  /**
   * Capitalizes a list changing the first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed with the last word converted to
   * the singular form of the given word denoting only one.
   */
  @Override
  public String singularUpperFirst(final List<String> string) {
    if (string == null) {
      return "";
    }
    string.set(string.size() - 1, this.singular(string.get(string.size() - 1)));
    return this.upperFirst(string);
  }

  /**
   * Capitalizes a String changing the first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed with the last word converted to
   * the singular form of the given word denoting only one.
   */
  @Override
  public String singularUpperFirst(final String string) {
    if (string == null) {
      return "";
    }
    final var words = this.words(string);
    if (0 < words.length) {
      words[words.length - 1] = this.singular(words[words.length - 1]);
    }
    return this.upperFirst(Arrays.asList(words));
  }

  /**
   * Converts a list of words into snake lower case, that is each word is made up of lower case
   * characters separated by a underscore.
   */
  @Override
  public String snakeLowerCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.snakeLowerCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into snake lower case, that is each word is made up of lower case
   * characters separated by a underscore.
   */
  @Override
  public String snakeLowerCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("_", this.words(string)).toLowerCase(Locale.getDefault());
  }

  /**
   * Converts a list of words into snake title case, that is each word is made up of title case
   * characters separated by a underscore.
   */
  @Override
  public String snakeTitleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.snakeTitleCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into snake title case, that is each word is made up of title case
   * characters separated by a underscore.
   */
  @Override
  public String snakeTitleCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("_", this.wordsUpperFirst(string));
  }

  /**
   * Converts a list of words into snake upper case, that is each word is made up of upper case
   * characters separated by a underscore.
   */
  @Override
  public String snakeUpperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.snakeUpperCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words into snake upper case, that is each word is made up of upper case
   * characters separated by a underscore.
   */
  @Override
  public String snakeUpperCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join("_", this.words(string)).toUpperCase(Locale.getDefault());
  }

  /**
   * Converts a list of words to the capitalization style commonly used for the titles of books,
   * articles, songs, etc.
   */
  @Override
  public String titleCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.titleCase(StringUtils.join(string, "_"));
  }

  /**
   * Converts a string of words to the capitalization style commonly used for the titles of books,
   * articles, songs, etc.
   */
  @Override
  public String titleCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return String.join(" ", this.wordsUpperFirst(string));
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
  public String upperCase(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.upperCase(StringUtils.join(string, "_"));
  }

  /** Converts a String to upper case as per {@link String#toUpperCase()}. */
  @Override
  public String upperCase(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return StringUtils.upperCase(string);
  }

  /**
   * Capitalizes a list changing the first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed.
   */
  @Override
  public String upperFirst(final List<String> string) {
    if (string == null) {
      return "";
    }
    return this.upperFirst(StringUtils.join(string, "_"));
  }

  /**
   * Capitalizes a String changing the first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed.
   */
  @Override
  public String upperFirst(final String string) {
    if (StringUtils.isBlank(string)) {
      return "";
    }
    return StringUtils.capitalize(string);
  }

  /**
   * This method splits a String into words on the following characters "_", "-", ".", "/", "\", or
   * a space.
   *
   * @param string The string to split into words
   * @return An array of words
   */
  private String[] words(final String string) {
    if (StringUtils.isBlank(string)) {
      return ArrayUtils.EMPTY_STRING_ARRAY;
    }

    return this.defineWords(string).split(" ");
  }

  /**
   * This method splits a String into words on the following characters "_", "-", ".", "/", "\", or
   * a space.
   *
   * @param string The string to split into words
   * @return An array of words
   */
  private String[] wordsUpperFirst(final String string) {
    if (StringUtils.isBlank(string)) {
      return ArrayUtils.EMPTY_STRING_ARRAY;
    }
    return Arrays.stream(this.words(string))
        .map(String::toLowerCase)
        .map(StringUtils::capitalize)
        .collect(Collectors.toList())
        .toArray(new String[0]);
  }
}
