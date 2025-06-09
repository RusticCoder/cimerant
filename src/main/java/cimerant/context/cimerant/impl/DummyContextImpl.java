package cimerant.context.cimerant.impl;

import cimerant.context.cimerant.ObjectRootContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Class describing the template data context. This set of routines is used by the template to set
 * and get 'named' data object to pass them to the template engine to use when rendering a template.
 */
public final class DummyContextImpl extends ObjectContextImpl<Entry<String, Object>> {
  private static final long serialVersionUID = 1L;

  /**
   * Creates an instance.
   *
   * @param rootContext the root context.
   */
  public DummyContextImpl(final ObjectRootContext<?> rootContext) {
    super(
        Map.entry("entity", new HashMap<>()),
        rootContext,
        new ArrayList<>(),
        new ObjectAttributeListImpl(),
        new ObjectFieldListImpl(),
        new ObjectRelationshipListImpl());
  }
}
