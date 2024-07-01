package cimerant.context.java.util;

import cimerant.context.ContextRoot;
import java.util.ListIterator;
import java.util.Map.Entry;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.ListIterator} {@link java.util.Map.Entry} describing the template data context. This
 * set of routines is used by the template to set and get 'named' data object to pass them to the
 * template engine to use when rendering a template.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public interface MapEntryListIteratorContext<K, V>
    extends ContextRoot<ListIterator<Entry<K, V>>>,
        ListIterator<Entry<ContextRoot<K>, ContextRoot<V>>> {}
