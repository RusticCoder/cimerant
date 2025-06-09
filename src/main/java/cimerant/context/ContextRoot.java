package cimerant.context;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.velocity.context.Context;

/**
 * Interface describing the template data context. This set of routines is used by the template to
 * set and get 'named' data object to pass them to the template engine to use when rendering a
 * template.
 *
 * @param <E> The base type of the context.
 */
public interface ContextRoot<E> extends Context {
  /**
   * Converts a list of words into back slash lower case, that is each word is made up of lower case
   * characters separated by a back slash.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * backSlashLowerCase(null)            = null
   * backSlashLowerCase("")              = ""
   * backSlashLowerCase("TobackSlashCase")   = "to_backSlash_case"
   * backSlashLowerCase("To.backSlash.Case") = "to_backSlash_case"
   * backSlashLowerCase("to_backSlash_case") = "to_backSlash_case"
   * backSlashLowerCase("to back slash case") = "to_backSlash_Case"
   * </pre>
   *
   * @param arg the list to be converted to back slash lower case, may be null.
   * @return back slash lower case of list, {@code null} if null list input
   */
  String backSlashLowerCase(Object arg);

  /**
   * Converts a list of words into back slash title case, that is each word is made up of title case
   * characters separated by a back slash.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * backSlashtitleCase(null)            = null
   * backSlashtitleCase("")              = ""
   * backSlashtitleCase("tobackSlashCase")   = "To_backSlash_Case"
   * backSlashtitleCase("to.backSlash.case") = "To_backSlash_Case"
   * backSlashtitleCase("to_backSlash_case") = "To_backSlash_Case"
   * backSlashtitleCase("to back slash case") = "To_backSlash_Case"
   * </pre>
   *
   * @param arg the list to be converted to back slash title case, may be null.
   * @return back slash title case of list, {@code null} if null list input
   */
  String backSlashTitleCase(Object arg);

  /**
   * Converts a list of words into back slash upper case, that is each word is made up of upper case
   * characters separated by a back slash.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * backSlashupperCase(null)            = null
   * backSlashupperCase("")              = ""
   * backSlashupperCase("TobackSlashCase")   = "TO_backSlash_CASE"
   * backSlashupperCase("To.backSlash.Case") = "TO_backSlash_CASE"
   * backSlashupperCase("to_back_slash_case") = "TO_backSlash_CASE"
   * backSlashupperCase("to back slash case") = "TO_backSlash_CASE"
   * </pre>
   *
   * @param arg the list to be converted to back slash upper case, may be null.
   * @return back slash upper case of list, {@code null} if null list input
   */
  String backSlashUpperCase(Object arg);

  /**
   * Converts all the delimiter separated words in a list into camel case, that is each word is made
   * up of a title case character and then a series of lower case characters. The first string
   * character will be lower case.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}. Capitalization uses the
   * Unicode title case, normally equivalent to upper case and cannot perform locale-sensitive
   * mappings.
   *
   * <pre>
   * camelCase(null)            = null
   * camelCase("")              = ""
   * camelCase("ToCamelCase")   = "tocamelcase"
   * camelCase("To.Camel.Case") = "to.camel.case"
   * camelCase("to_Camel_case") = "toCamelCase"
   * camelCase("to Camel case") = "toCamelCase"
   * </pre>
   *
   * @param arg the list to be converted to camel case, may be null.
   * @return camel case of list, {@code null} if null list input
   */
  String camelCase(Object arg);

  /**
   * Returns {@code true} if the context has the specified key is in the context.
   *
   * @param key The key to look for.
   * @return Whether the key is in the context.
   */
  boolean contextContainsKey(String key);

  /**
   * Gets the value corresponding to the provided key from the context.
   *
   * @param key The name of the desired value.
   * @return The value corresponding to the provided key.
   */
  Object contextGet(String key);

  /**
   * Returns all the keys for the values in the context.
   *
   * @return All the keys for the values in the context.
   */
  String[] contextGetKeys();

  /**
   * Adds a name/value pair to the context.
   *
   * @param key The name to key the provided value with.
   * @param value The corresponding value.
   * @return The old object or null if there was no old object.
   */
  Object contextPut(String key, Object value);

  /**
   * Removes the value associated with the specified key from the context.
   *
   * @param key The name of the value to remove.
   * @return The value that the key was mapped to, or <code>null</code> if unmapped.
   */
  Object contextRemove(String key);

  /**
   * Converts a list of words into dot lower case, that is each word is made up of lower case
   * characters separated by a dot.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * dotLowerCase(null)            = null
   * dotLowerCase("")              = ""
   * dotLowerCase("TodotCase")   = "to_dot_case"
   * dotLowerCase("To.dot.Case") = "to_dot_case"
   * dotLowerCase("to_dot_case") = "to_dot_case"
   * dotLowerCase("to dot case") = "to_dot_Case"
   * </pre>
   *
   * @param arg the list to be converted to dot lower case, may be null.
   * @return dot lower case of list, {@code null} if null list input
   */
  String dotLowerCase(Object arg);

  /**
   * Converts a list of words into dot title case, that is each word is made up of title case
   * characters separated by a dot.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * dottitleCase(null)            = null
   * dottitleCase("")              = ""
   * dottitleCase("todotCase")   = "To_dot_Case"
   * dottitleCase("to.dot.case") = "To_dot_Case"
   * dottitleCase("to_dot_case") = "To_dot_Case"
   * dottitleCase("to dot case") = "To_dot_Case"
   * </pre>
   *
   * @param arg the list to be converted to dot title case, may be null.
   * @return dot title case of list, {@code null} if null list input
   */
  String dotTitleCase(Object arg);

  /**
   * Converts a list of words into dot upper case, that is each word is made up of upper case
   * characters separated by a dot.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * dotupperCase(null)            = null
   * dotupperCase("")              = ""
   * dotupperCase("TodotCase")   = "TO_dot_CASE"
   * dotupperCase("To.dot.Case") = "TO_dot_CASE"
   * dotupperCase("to_dot_case") = "TO_dot_CASE"
   * dotupperCase("to dot case") = "TO_dot_CASE"
   * </pre>
   *
   * @param arg the list to be converted to dot upper case, may be null.
   * @return dot upper case of list, {@code null} if null list input
   */
  String dotUpperCase(Object arg);

  /**
   * Formats a {@link Date} into a date-time string.
   *
   * @param date the time value to be formatted into a date-time string.
   * @param format the pattern describing the date and time format.
   * @return the formatted date-time string.
   */
  String formatDate(Date date, String format);

  /**
   * Converts a list of words into forward slash lower case, that is each word is made up of lower
   * case characters separated by a forward slash.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * forwardSlashLowerCase(null)            = null
   * forwardSlashLowerCase("")              = ""
   * forwardSlashLowerCase("ToforwardSlashCase")   = "to_forwardSlash_case"
   * forwardSlashLowerCase("To.forwardSlash.Case") = "to_forwardSlash_case"
   * forwardSlashLowerCase("to_forwardSlash_case") = "to_forwardSlash_case"
   * forwardSlashLowerCase("to forward slash case") = "to_forwardSlash_Case"
   * </pre>
   *
   * @param arg the list to be converted to forward slash lower case, may be null.
   * @return forward slash lower case of list, {@code null} if null list input
   */
  String forwardSlashLowerCase(Object arg);

  /**
   * Converts a list of words into forward slash title case, that is each word is made up of title
   * case characters separated by a forward slash.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * forwardSlashtitleCase(null)            = null
   * forwardSlashtitleCase("")              = ""
   * forwardSlashtitleCase("toforwardSlashCase")   = "To_forwardSlash_Case"
   * forwardSlashtitleCase("to.forwardSlash.case") = "To_forwardSlash_Case"
   * forwardSlashtitleCase("to_forwardSlash_case") = "To_forwardSlash_Case"
   * forwardSlashtitleCase("to forward slash case") = "To_forwardSlash_Case"
   * </pre>
   *
   * @param arg the list to be converted to forward slash title case, may be null.
   * @return forward slash title case of list, {@code null} if null list input
   */
  String forwardSlashTitleCase(Object arg);

  /**
   * Converts a list of words into forward slash upper case, that is each word is made up of upper
   * case characters separated by a forward slash.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * forwardSlashupperCase(null)            = null
   * forwardSlashupperCase("")              = ""
   * forwardSlashupperCase("ToforwardSlashCase")   = "TO_forwardSlash_CASE"
   * forwardSlashupperCase("To.forwardSlash.Case") = "TO_forwardSlash_CASE"
   * forwardSlashupperCase("to_forwardSlash_case") = "TO_forwardSlash_CASE"
   * forwardSlashupperCase("to forward slash case") = "TO_forwardSlash_CASE"
   * </pre>
   *
   * @param arg the list to be converted to forward slash upper case, may be null.
   * @return forward slash upper case of list, {@code null} if null list input
   */
  String forwardSlashUpperCase(Object arg);

  /**
   * Returns the class of the associated context.
   *
   * @return the class of the associated context.
   */
  Class<?> getContextClass();

  /**
   * Returns the extension of the file this context will be saved as.
   *
   * @return the extension of the file this context will be saved as.
   */
  String getFileExtension();

  /**
   * Returns the name of the file this context will be saved as.
   *
   * @return the name of the file this context will be saved as.
   */
  String getFileName();

  /**
   * Returns the path this context will be saved to.
   *
   * @return the path this context will be saved to.
   */
  List<String> getFilePath();

  /**
   * Returns the context grouping as defined by the model.
   *
   * <p>Context object within the model can be grouped into a hierarchy.
   *
   * <p>The group hierarchy will be appended to the file path.
   *
   * @return the context grouping as defined by the model.
   */
  List<String> getGrouping();

  /**
   * Returns the name of this object.
   *
   * @return the name of this object.
   */
  String getObjectName();

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
   *
   * @param string the string to determine if it is numeric class.
   * @return is numeric class.
   */
  boolean isNumericClass(String string);

  /**
   * Converts a list of words into kebab lower case, that is each word is made up of lower case
   * characters separated by a dash.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * kebabLowerCase(null)            = null
   * kebabLowerCase("")              = ""
   * kebabLowerCase("ToKebabCase")   = "to-kebab-case"
   * kebabLowerCase("To.Kebab.Case") = "to-kebab-case"
   * kebabLowerCase("to_Kebab_case") = "to-kebab-case"
   * kebabLowerCase("to Kebab case") = "to-Kebab-Case"
   * </pre>
   *
   * @param arg the list to be converted to kebab lower case, may be null.
   * @return kebab lower case of list, {@code null} if null list input
   */
  String kebabLowerCase(Object arg);

  /**
   * Converts a list of words into kebab title case, that is each word is made up of title case
   * characters separated by a dash.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * kebabtitleCase(null)            = null
   * kebabtitleCase("")              = ""
   * kebabtitleCase("toKebabCase")   = "To-Kebab-Case"
   * kebabtitleCase("to.kebab.case") = "To-Kebab-Case"
   * kebabtitleCase("to_kebab_case") = "To-Kebab-Case"
   * kebabtitleCase("to kebab case") = "To-Kebab-Case"
   * </pre>
   *
   * @param arg the list to be converted to kebab title case, may be null.
   * @return kebab title case of list, {@code null} if null list input
   */
  String kebabTitleCase(Object arg);

  /**
   * Converts a list of words into kebab upper case, that is each word is made up of upper case
   * characters separated by a dash.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * kebabupperCase(null)            = null
   * kebabupperCase("")              = ""
   * kebabupperCase("ToKebabCase")   = "TO-KEBAB-CASE"
   * kebabupperCase("To.Kebab.Case") = "TO-KEBAB-CASE"
   * kebabupperCase("to_Kebab_case") = "TO-KEBAB-CASE"
   * kebabupperCase("to Kebab case") = "TO-KEBAB-CASE"
   * </pre>
   *
   * @param arg the list to be converted to kebab upper case, may be null.
   * @return kebab upper case of list, {@code null} if null list input
   */
  String kebabUpperCase(Object arg);

  /**
   * Converts a list to lower case as per {@link String#toLowerCase()}.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <pre>
   * StringUtils.lowerCase(null)  = null
   * StringUtils.lowerCase("")    = ""
   * StringUtils.lowerCase("aBc") = "abc"
   * </pre>
   *
   * <p><strong>Note:</strong> As described in the documentation for {@link String#toLowerCase()},
   * the result of this method is affected by the current locale. For platform-independent case
   * transformations, the method should be used with a specific locale (e.g. {@link
   * Locale#ENGLISH}).
   *
   * @param arg the list to be converted to lower case, may be null.
   * @return lower case of list, {@code null} if null list input
   */
  String lowerCase(Object arg);

  /**
   * Uncapitalizes a string, changing the first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed.
   *
   * <p>For a word based algorithm, see {@link
   * org.apache.commons.lang3.text.WordUtils#uncapitalize(String)}. A {@code null} input list
   * returns {@code null}.
   *
   * <pre>
   * StringUtils.uncapitalize(null)  = null
   * StringUtils.uncapitalize("")    = ""
   * StringUtils.uncapitalize("cat") = "cat"
   * StringUtils.uncapitalize("Cat") = "cat"
   * StringUtils.uncapitalize("CAT") = "cAT"
   * </pre>
   *
   * @param arg the list to be converted first character to lower case, may be null.
   * @return first character to lower case of list, {@code null} if null list input
   */
  String lowerFirst(Object arg);

  /**
   * An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at
   * most one value.
   *
   * @return a object that maps keys to values. A map cannot contain duplicate keys; each key can
   *     map to at most one value.
   */
  Map<String, ?> newMap();

  /**
   * An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at
   * most one value.
   *
   * @return a object that maps keys to values. A map cannot contain duplicate keys; each key can
   *     map to at most one value.
   */
  Map<String, ?> newMap(Map<String, ?> m);

  /**
   * Constructs a new, empty collection that contains no duplicate elements.
   *
   * @return a collection that contains no duplicate elements.
   */
  Set<String> newSet();

  /**
   * Constructs a new, empty collection that contains no duplicate elements.
   *
   * @param iterable collection whose elements will comprise the new set
   * @return a collection that contains no duplicate elements.
   */
  Set<String> newSet(Iterable<?> iterable);

  /**
   * Constructs a new, empty collection that contains no duplicate elements.
   *
   * @param string element to be added.
   * @return a collection that contains no duplicate elements.
   */
  Set<String> newSet(String string);

  /**
   * Converts all the delimiter separated words in a list into pascal case, that is each word is
   * made up of a title case character and then a series of lower case characters. The first string
   * character will be upper case.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}. Capitalization uses the
   * Unicode title case, normally equivalent to upper case and cannot perform locale-sensitive
   * mappings.
   *
   * <pre>
   * pascalCase(null)             = null
   * pascalCase("")               = ""
   * pascalCase("toPascalCase")   = "ToPascalCase"
   * pascalCase("To.Pascal.Case") = "ToPascalCase"
   * pascalCase("to_Pascal_case") = "ToPascalCase"
   * pascalCase("to Pascal case") = "ToPascalCase"
   * </pre>
   *
   * @param arg the list to be converted to pascal case, may be null.
   * @return pascal case of list, {@code null} if null list input
   */
  String pascalCase(Object arg);

  /**
   * Converts a list of words into plural back slash lower case, that is each word is made up of
   * lower case characters separated by a back slash with the last word converted to the plural form
   * of the given word denoting more than one.
   *
   * @param arg the list to be converted to plural back slash lower case, may be null.
   * @return plural back slash lower case of list, {@code null} if null list input
   */
  String pluralBackSlashLowerCase(Object arg);

  /**
   * Converts a list of words into plural back slash title case, that is each word is made up of
   * title case characters separated by a back slash with the last word converted to the plural form
   * of the given word denoting more than one.
   *
   * <p>In title case, the first and last words of the title are capitalized, along with all major
   * words (nouns, pronouns, verbs, adjectives, adverbs, and subordinating conjunctions). Minor
   * words (articles, prepositions, and coordinating conjunctions) are typically not capitalized
   * unless they are the first or last word of the title.
   *
   * @param arg the list to be converted to plural back slash title case, may be null.
   * @return plural back slash title case of list, {@code null} if null list input
   */
  String pluralBackSlashTitleCase(Object arg);

  /**
   * Converts a list of words into plural back slash upper case, that is each word is made up of
   * upper case characters separated by a back slash with the last word converted to the plural form
   * of the given word denoting more than one.
   *
   * @param arg the list to be converted to plural back slash upper case, may be null.
   * @return plural back slash upper case of list, {@code null} if null list input
   */
  String pluralBackSlashUpperCase(Object arg);

  /**
   * Converts all the delimiter separated words in a list into plural camel case, that is each word
   * is made up of a title case character and then a series of lower case characters. The first
   * string character will be lower case with the last word converted to the plural form of the
   * given word denoting more than one.
   *
   * @param arg the list to be converted to plural camel case, may be null.
   * @return plural camel case of list, {@code null} if null list input
   */
  String pluralCamelCase(Object arg);

  /**
   * Converts a list of words into plural dot lower case, that is each word is made up of lower case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   *
   * @param arg the list to be converted to plural dot lower case, may be null.
   * @return plural dot lower case of list, {@code null} if null list input
   */
  String pluralDotLowerCase(Object arg);

  /**
   * Converts a list of words into plural dot title case, that is each word is made up of title case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   *
   * @param arg the list to be converted to plural dot title case, may be null.
   * @return plural dot title case of list, {@code null} if null list input
   */
  String pluralDotTitleCase(Object arg);

  /**
   * Converts a list of words into plural dot upper case, that is each word is made up of upper case
   * characters separated by a dot with the last word converted to the plural form of the given word
   * denoting more than one.
   *
   * @param arg the list to be converted to plural dot upper case, may be null.
   * @return plural dot upper case of list, {@code null} if null list input
   */
  String pluralDotUpperCase(Object arg);

  /**
   * Converts a list of words into plural forward slash lower case, that is each word is made up of
   * lower case characters separated by a forward slash with the last word converted to the plural
   * form of the given word denoting more than one.
   *
   * @param arg the list to be converted to plural forward slash lower case, may be null.
   * @return plural forward slash lower case of list, {@code null} if null list input
   */
  String pluralForwardSlashLowerCase(Object arg);

  /**
   * Converts a list of words into plural forward slash title case, that is each word is made up of
   * title case characters separated by a forward slash with the last word converted to the plural
   * form of the given word denoting more than one.
   *
   * @param arg the list to be converted to plural forward slash title case, may be null.
   * @return plural forward slash title case of list, {@code null} if null list input
   */
  String pluralForwardSlashTitleCase(Object arg);

  /**
   * Converts a list of words into plural forward slash upper case, that is each word is made up of
   * upper case characters separated by a forward slash with the last word converted to the plural
   * form of the given word denoting more than one.
   *
   * @param arg the list to be converted to plural forward slash upper case, may be null.
   * @return plural forward slash upper case of list, {@code null} if null list input
   */
  String pluralForwardSlashUpperCase(Object arg);

  /**
   * Converts a list of words into plural kebab lower case, that is each word is made up of lower
   * case characters separated by a dash with the last word converted to the plural form of the
   * given word denoting more than one.
   *
   * @param arg the list to be converted to plural kebab lower case, may be null.
   * @return plural kebab lower case of list, {@code null} if null list input
   */
  String pluralKebabLowerCase(Object arg);

  /**
   * Converts a list of words into plural kebab title case, that is each word is made up of title
   * case characters separated by a dash with the last word converted to the plural form of the
   * given word denoting more than one.
   *
   * @param arg the list to be converted to plural kebab title case, may be null.
   * @return plural kebab title case of list, {@code null} if null list input
   */
  String pluralKebabTitleCase(Object arg);

  /**
   * Converts a list of words into plural kebab upper case, that is each word is made up of upper
   * case characters separated by a dash with the last word converted to the plural form of the
   * given word denoting more than one.
   *
   * @param arg the list to be converted to plural kebab upper case, may be null.
   * @return plural kebab upper case of list, {@code null} if null list input
   */
  String pluralKebabUpperCase(Object arg);

  /**
   * Converts a list to plural lower case as per {@link String#toLowerCase()} with the last word
   * converted to the plural form of the given word denoting more than one.
   *
   * @param arg the list to be converted to plural lower case, may be null.
   * @return plural lower case of list, {@code null} if null list input
   */
  String pluralLowerCase(Object arg);

  /**
   * Uncapitalizes a string, changing the plural first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed with the last word converted to
   * the plural form of the given word denoting more than one.
   *
   * @param arg the list to be converted to plural first character to lower case, may be null.
   * @return plural first character to lower case of list, {@code null} if null list input
   */
  String pluralLowerFirst(Object arg);

  /**
   * Converts all the delimiter separated words in a list into plural pascal case, that is each word
   * is made up of a title case character and then a series of lower case characters. The first
   * string character will be upper case with the last word converted to the plural form of the
   * given word denoting more than one.
   *
   * @param arg the list to be converted to plural pascal case, may be null.
   * @return plural pascal case of list, {@code null} if null list input
   */
  String pluralPascalCase(Object arg);

  /**
   * Converts a list of words into plural snake lower case, that is each word is made up of lower
   * case characters separated by a underscore with the last word converted to the plural form of
   * the given word denoting more than one.
   *
   * @param arg the list to be converted to plural snake lower case, may be null.
   * @return plural snake lower case of list, {@code null} if null list input
   */
  String pluralSnakeLowerCase(Object arg);

  /**
   * Converts a list of words into plural snake title case, that is each word is made up of title
   * case characters separated by a underscore with the last word converted to the plural form of
   * the given word denoting more than one.
   *
   * @param arg the list to be converted to plural snake title case, may be null.
   * @return plural snake title case of list, {@code null} if null list input
   */
  String pluralSnakeTitleCase(Object arg);

  /**
   * Converts a list of words into plural snake upper case, that is each word is made up of upper
   * case characters separated by a underscore with the last word converted to the plural form of
   * the given word denoting more than one.
   *
   * @param arg the list to be converted to plural snake upper case, may be null.
   * @return plural snake upper case of list, {@code null} if null list input
   */
  String pluralSnakeUpperCase(Object arg);

  /**
   * Converts a list of words to the plural capitalization style commonly used for the titles of
   * books, articles, songs, etc. with the last word converted to the plural form of the given word
   * denoting more than one.
   *
   * @param arg the list to be converted to plural capitalization style commonly used for the titles
   *     of books, may be null.
   * @return plural capitalization style commonly used for the titles of books of list, {@code null}
   *     if null list input
   */
  String pluralTitleCase(Object arg);

  /**
   * Converts a list to plural upper case as per {@link String#toUpperCase()} with the last word
   * converted to the plural form of the given word denoting more than one.
   *
   * @param arg the list to be converted to plural upper case, may be null.
   * @return plural upper case of list, {@code null} if null list input
   */
  String pluralUpperCase(Object arg);

  /**
   * Capitalizes a plural string changing the first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed with the last word converted to
   * the plural form of the given word denoting more than one.
   *
   * @param arg the list to be converted to plural upper first, may be null.
   * @return plural upper first of list, {@code null} if null list input
   */
  String pluralUpperFirst(Object arg);

  /**
   * Set the extension of the file this context will be saved as.
   *
   * @param fileExtension the extension of the file this context will be saved as.
   */
  void setFileExtension(String fileExtension);

  /**
   * Set the name of the file this context will be saved as.
   *
   * @param fileName the name of the file this context will be saved as.
   */
  void setFileName(String fileName);

  /**
   * Set the path this context will be saved to.
   *
   * @param filePath the path this context will be saved to.
   */
  void setFilePath(List<String> filePath);

  /**
   * Set the path this context will be saved to.
   *
   * @param filePath the path this context will be saved to.
   */
  void setFilePath(String[] filePath);

  /**
   * Set the context grouping.
   *
   * @param groupings the context grouping.
   */
  void setGrouping(List<String> groupings);

  /**
   * Set the context grouping.
   *
   * @param groupings the context grouping.
   */
  void setGrouping(String[] groupings);

  /**
   * Set the name of this object.
   *
   * @param objectName the name of this object.
   */
  void setObjectName(String objectName);

  /**
   * Converts a list of words into singular back slash lower case, that is each word is made up of
   * lower case characters separated by a back slash with the last word converted to the singular
   * form of the given word denoting only one.
   *
   * @param arg the list to be converted to singular back slash lower case, may be null.
   * @return singular back slash lower case of list, {@code null} if null list input
   */
  String singularBackSlashLowerCase(Object arg);

  /**
   * Converts a list of words into singular back slash title case, that is each word is made up of
   * title case characters separated by a back slash with the last word converted to the singular
   * form of the given word denoting only one.
   *
   * @param arg the list to be converted to singular back slash title case, may be null.
   * @return singular back slash title case of list, {@code null} if null list input
   */
  String singularBackSlashTitleCase(Object arg);

  /**
   * Converts a list of words into singular back slash upper case, that is each word is made up of
   * upper case characters separated by a back slash with the last word converted to the singular
   * form of the given word denoting only one.
   *
   * @param arg the list to be converted to singular back slash upper case, may be null.
   * @return singular back slash upper case of list, {@code null} if null list input
   */
  String singularBackSlashUpperCase(Object arg);

  /**
   * Converts all the delimiter separated words in a list into singular camel case, that is each
   * word is made up of a title case character and then a series of lower case characters. The first
   * String character will be lower case with the last word converted to the singular form of the
   * given word denoting only one.
   *
   * @param arg the list to be converted to singular camel case, may be null.
   * @return singular camel case of list, {@code null} if null list input
   */
  String singularCamelCase(Object arg);

  /**
   * Converts a list of words into singular dot lower case, that is each word is made up of lower
   * case characters separated by a dot with the last word converted to the singular form of the
   * given word denoting only one.
   *
   * @param arg the list to be converted to singular dot lower case, may be null.
   * @return singular dot lower case of list, {@code null} if null list input
   */
  String singularDotLowerCase(Object arg);

  /**
   * Converts a list of words into singular dot title case, that is each word is made up of title
   * case characters separated by a dot with the last word converted to the singular form of the
   * given word denoting only one.
   *
   * @param arg the list to be converted to singular dot title case, may be null.
   * @return singular dot title case of list, {@code null} if null list input
   */
  String singularDotTitleCase(Object arg);

  /**
   * Converts a list of words into singular dot upper case, that is each word is made up of upper
   * case characters separated by a dot with the last word converted to the singular form of the
   * given word denoting only one.
   *
   * @param arg the list to be converted to singular dot upper case, may be null.
   * @return singular dot upper case of list, {@code null} if null list input
   */
  String singularDotUpperCase(Object arg);

  /**
   * Converts a list of words into singular forward slash lower case, that is each word is made up
   * of lower case characters separated by a forward slash with the last word converted to the
   * singular form of the given word denoting only one.
   *
   * @param arg the list to be converted to singular forward slash lower case, may be null.
   * @return singular forward slash lower case of list, {@code null} if null list input
   */
  String singularForwardSlashLowerCase(Object arg);

  /**
   * Converts a list of words into singular forward slash title case, that is each word is made up
   * of title case characters separated by a forward slash with the last word converted to the
   * singular form of the given word denoting only one.
   *
   * @param arg the list to be converted to singular forward slash title case, may be null.
   * @return singular forward slash title case of list, {@code null} if null list input
   */
  String singularForwardSlashTitleCase(Object arg);

  /**
   * Converts a list of words into singular forward slash upper case, that is each word is made up
   * of upper case characters separated by a forward slash with the last word converted to the
   * singular form of the given word denoting only one.
   *
   * @param arg the list to be converted to singular forward slash upper case, may be null.
   * @return singular forward slash upper case of list, {@code null} if null list input
   */
  String singularForwardSlashUpperCase(Object arg);

  /**
   * Converts a list of words into singular kebab lower case, that is each word is made up of lower
   * case characters separated by a dash with the last word converted to the singular form of the
   * given word denoting only one.
   *
   * @param arg the list to be converted to singular kebab lower case, may be null.
   * @return singular kebab lower case of list, {@code null} if null list input
   */
  String singularKebabLowerCase(Object arg);

  /**
   * Converts a list of words into singular kebab title case, that is each word is made up of title
   * case characters separated by a dash with the last word converted to the singular form of the
   * given word denoting only one.
   *
   * @param arg the list to be converted to singular kebab title case, may be null.
   * @return singular kebab title case of list, {@code null} if null list input
   */
  String singularKebabTitleCase(Object arg);

  /**
   * Converts a list of words into singular kebab upper case, that is each word is made up of upper
   * case characters separated by a dash with the last word converted to the singular form of the
   * given word denoting only one.
   *
   * @param arg the list to be converted to singular kebab upper case, may be null.
   * @return singular kebab upper case of list, {@code null} if null list input
   */
  String singularKebabUpperCase(Object arg);

  /**
   * Converts a list to singular lower case as per {@link String#toLowerCase()} with the last word
   * converted to the singular form of the given word denoting only one.
   *
   * @param arg the list to be converted to singular lower case, may be null.
   * @return singular lower case of list, {@code null} if null list input
   */
  String singularLowerCase(Object arg);

  /**
   * Uncapitalizes a string, changing the first character to lower case as per {@link
   * Character#toLowerCase(int)}. No other characters are changed with the last word converted to
   * the singular form of the given word denoting only one.
   *
   * @param arg the list to be converted to singular lower case first character, may be null.
   * @return singular lower case first character of list, {@code null} if null list input
   */
  String singularLowerFirst(Object arg);

  /**
   * Converts all the delimiter separated words in a list into singular pascal case, that is each
   * word is made up of a title case character and then a series of lower case characters. The first
   * String character will be upper case with the last word converted to the singular form of the
   * given word denoting only one.
   *
   * @param arg the list to be converted to singular pascal case, may be null.
   * @return singular pascal case of list, {@code null} if null list input
   */
  String singularPascalCase(Object arg);

  /**
   * Converts a list of words into singular snake lower case, that is each word is made up of lower
   * case characters separated by a underscore with the last word converted to the singular form of
   * the given word denoting only one.
   *
   * @param arg the list to be converted to singular snake lower case, may be null.
   * @return singular snake lower case of list, {@code null} if null list input
   */
  String singularSnakeLowerCase(Object arg);

  /**
   * Converts a list of words into singular snake title case, that is each word is made up of title
   * case characters separated by a underscore with the last word converted to the singular form of
   * the given word denoting only one.
   *
   * @param arg the list to be converted to singular snake title case, may be null.
   * @return singular snake title case of list, {@code null} if null list input
   */
  String singularSnakeTitleCase(Object arg);

  /**
   * Converts a list of words into singular snake upper case, that is each word is made up of upper
   * case characters separated by a underscore with the last word converted to the singular form of
   * the given word denoting only one.
   *
   * @param arg the list to be converted to singular snake upper case, may be null.
   * @return singular snake upper case of list, {@code null} if null list input
   */
  String singularSnakeUpperCase(Object arg);

  /**
   * Converts a list of words to the capitalization style commonly used for the singular titles of
   * books, articles, songs, etc. with the last word converted to the singular form of the given
   * word denoting only one.
   *
   * @param arg the list to be converted to singular titles of books, may be null.
   * @return singular titles of books of list, {@code null} if null list input
   */
  String singularTitleCase(Object arg);

  /**
   * Converts a list to singular upper case as per {@link String#toUpperCase()} with the last word
   * converted to the singular form of the given word denoting only one.
   *
   * @param arg the list to be converted to singular upper case, may be null.
   * @return singular upper case of list, {@code null} if null list input
   */
  String singularUpperCase(Object arg);

  /**
   * Capitalizes a string changing the singular first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed with the last word converted to
   * the singular form of the given word denoting only one.
   *
   * @param arg the list to be converted to singular first character to title case, may be null.
   * @return singular first character to title case of list, {@code null} if null list input
   */
  String singularUpperFirst(Object arg);

  /**
   * Converts a list of words into snake lower case, that is each word is made up of lower case
   * characters separated by a underscore.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * snakeLowerCase(null)            = null
   * snakeLowerCase("")              = ""
   * snakeLowerCase("TosnakeCase")   = "to_snake_case"
   * snakeLowerCase("To.snake.Case") = "to_snake_case"
   * snakeLowerCase("to_snake_case") = "to_snake_case"
   * snakeLowerCase("to snake case") = "to_snake_Case"
   * </pre>
   *
   * @param arg the list to be converted to snake lower case, may be null.
   * @return snake lower case of list, {@code null} if null list input
   */
  String snakeLowerCase(Object arg);

  /**
   * Converts a list of words into snake title case, that is each word is made up of title case
   * characters separated by a underscore.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * snaketitleCase(null)            = null
   * snaketitleCase("")              = ""
   * snaketitleCase("tosnakeCase")   = "To_Snake_Case"
   * snaketitleCase("to.snake.case") = "To_Snake_Case"
   * snaketitleCase("to_snake_case") = "To_Snake_Case"
   * snaketitleCase("to snake case") = "To_Snake_Case"
   * </pre>
   *
   * @param arg the list to be converted to snake title case, may be null.
   * @return snake title case of list, {@code null} if null list input
   */
  String snakeTitleCase(Object arg);

  /**
   * Converts a list of words into snake upper case, that is each word is made up of upper case
   * characters separated by a underscore.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <p>A input list with only delimiter characters returns {@code ""}.
   *
   * <pre>
   * snakeupperCase(null)            = null
   * snakeupperCase("")              = ""
   * snakeupperCase("TosnakeCase")   = "TO_SNAKE_CASE"
   * snakeupperCase("To.snake.Case") = "TO_SNAKE_CASE"
   * snakeupperCase("to_snake_case") = "TO_SNAKE_CASE"
   * snakeupperCase("to snake case") = "TO_SNAKE_CASE"
   * </pre>
   *
   * @param arg the list to be converted to snake upper case, may be null.
   * @return snake upper case of list, {@code null} if null list input
   */
  String snakeUpperCase(Object arg);

  /**
   * Converts a list of words to the capitalization style commonly used for the titles of books,
   * articles, songs, etc.
   *
   * <p>In title case, the first and last words of the title are capitalized, along with all major
   * words (nouns, pronouns, verbs, adjectives, adverbs, and subordinating conjunctions). Minor
   * words (articles, prepositions, and coordinating conjunctions) are typically not capitalized
   * unless they are the first or last word of the title.
   *
   * @param arg the list to be converted to title case, may be null.
   * @return title case of list, {@code null} if null list input
   */
  String titleCase(Object arg);

  /**
   * Converts a list to upper case as per {@link String#toUpperCase()}.
   *
   * <p>A {@code null} input list returns {@code null}.
   *
   * <pre>
   * StringUtils.upperCase(null)  = null
   * StringUtils.upperCase("")    = ""
   * StringUtils.upperCase("aBc") = "ABC"
   * </pre>
   *
   * <p><strong>Note:</strong> As described in the documentation for {@link String#toUpperCase()},
   * the result of this method is affected by the current locale. For platform-independent case
   * transformations, the method should be used with a specific locale (e.g. {@link
   * Locale#ENGLISH}).
   *
   * @param arg the list to be converted to upper case, may be null.
   * @return upper case of list, {@code null} if null list input
   */
  String upperCase(Object arg);

  /**
   * Capitalizes a string changing the first character to title case as per {@link
   * Character#toTitleCase(int)}. No other characters are changed.
   *
   * <p>For a word based algorithm, see {@link
   * org.apache.commons.lang3.text.WordUtils#capitalize(String)}. A {@code null} input list returns
   * {@code null}.
   *
   * <pre>
   * StringUtils.capitalize(null)  = null
   * StringUtils.capitalize("")    = ""
   * StringUtils.capitalize("cat") = "Cat"
   * StringUtils.capitalize("cAt") = "CAt"
   * StringUtils.capitalize("'cat'") = "'cat'"
   * </pre>
   *
   * @param arg the list to be converted to upper first, may be null.
   * @return upper first of list, {@code null} if null list input
   */
  String upperFirst(Object arg);
}
