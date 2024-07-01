package cimerant.context.json;

import cimerant.context.cimerant.ObjectContext;
import java.util.Map.Entry;

/**
 * Interface describing the template data context. This set of routines is used by the template to
 * set and get 'named' data object to pass them to the template engine to use when rendering a
 * template.
 */
public interface JsonContext extends ObjectContext<Entry<String, Object>> {}
