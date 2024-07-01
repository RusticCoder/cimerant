package cimerant.context.java.util;

import cimerant.context.ContextRoot;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.Set} {@link java.util.Map.Entry} describing the template data context. This set of
 * routines is used by the template to set and get 'named' data object to pass them to the template
 * engine to use when rendering a template.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public interface MapEntrySetContext<K, V>
    extends ContextRoot<Set<Entry<K, V>>>, Set<Entry<ContextRoot<K>, ContextRoot<V>>> {
  /**
   * Returns {@code true} if the context has an iterator over the elements in this context.
   *
   * @return {@code true} if the context has an iterator over the elements in this context.
   */
  boolean hasIterator();
}
