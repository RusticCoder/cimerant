package cimerant.context.json;

import cimerant.context.cimerant.ObjectRootContext;
import java.util.Map;

/**
 * Interface describing the template data context. This set of routines is used by the template to
 * set and get 'named' data object to pass them to the template engine to use when rendering a
 * template.
 */
public interface JsonRootContext extends ObjectRootContext<Map<String, Object>> {}
