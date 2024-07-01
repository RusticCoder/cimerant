package cimerant.context.java.util;

import cimerant.context.ContextRoot;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.Iterator} {@link java.util.Map.Entry} describing the template data context. This set of
 * routines is used by the template to set and get 'named' data object to pass them to the template
 * engine to use when rendering a template.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public interface MapEntryIteratorContext<K, V>
    extends ContextRoot<Iterator<Entry<K, V>>>, Iterator<Entry<ContextRoot<K>, ContextRoot<V>>> {}
