package cimerant.context.cimerant.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 */
public final class DummyRootContextImpl extends ObjectRootContextImpl<Entry<String, Object>> {
  private static final long serialVersionUID = 1L;

  /** Creates an instance. */
  public DummyRootContextImpl() {
    super(Map.entry("entity", new HashMap<>()), new ObjectAttributeListImpl());
  }
}
