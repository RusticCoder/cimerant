package cimerant.context.java.util.impl;

import cimerant.Cimerant;
import cimerant.ModuleCode;
import cimerant.StatusCode;
import cimerant.SysError;
import cimerant.context.ContextRoot;
import cimerant.context.impl.ContextRootImpl;
import cimerant.context.java.util.MapEntryContext;
import cimerant.logger.CimerantLogger;
import java.util.Map;
import java.util.Objects;

/**
 * Wrapper interface bridging the gap between {@link org.apache.velocity.context.Context} and {@link
 * java.util.Map.Entry} describing the template data context. This set of routines is used by the
 * template to set and get 'named' data object to pass them to the template engine to use when
 * rendering a template.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public final class MapEntryContextImpl<K, V> extends ContextRootImpl<Map.Entry<K, V>>
    implements MapEntryContext<K, V> {
  private static final CimerantLogger logger;
  private static final long serialVersionUID = 1L;

  static {
    logger = CimerantLogger.getLogger(MapEntryContextImpl.class.getName());
  }

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param <K> the type of keys maintained by this map
   * @param <V> the type of mapped values
   * @param contextObject The base context object.
   * @return a instance of the context.
   */
  public static <K, V> MapEntryContext<K, V> getInstance(final Map.Entry<K, V> contextObject) {
    final var moduleCode = ModuleCode.ERR_M1200;

    try {
      Objects.requireNonNull(contextObject);

      return ContextRootImpl.registerInstance(new MapEntryContextImpl<>(contextObject));
    } catch (final SysError s) {
      throw s;
    } catch (final Throwable t) {
      // 0001 | Unknown error
      if (MapEntryContextImpl.logger.isDebugEnabled()) {
        MapEntryContextImpl.logger.debug(t.getMessage(), t);
      }
      throw SysError.getInstance(Cimerant.SYSTEM_CODE, moduleCode, StatusCode.ERR_0001, t);
    }
  }

  /**
   * Creates an instance.
   *
   * @param contextObject The base context object.
   */
  private MapEntryContextImpl(final Map.Entry<K, V> contextObject) {
    super(contextObject);
  }

  /** Returns the key specified in the context, or {@code null} if this context contains no key. */
  @Override
  public ContextRoot<K> getKey() {
    return ContextRootImpl.getInstance(this.getContextObject().getKey());
  }

  /**
   * Returns the value specified in the context, or {@code null} if this context contains no value.
   */
  @Override
  public ContextRoot<V> getValue() {
    return ContextRootImpl.getInstance(this.getContextObject().getValue());
  }

  /** Returns {@code true} if the context has the key corresponding to this entry. */
  @Override
  public boolean hasKey() {
    return this.getContextObject().getKey() != null;
  }

  /** Returns {@code true} if the context has the value corresponding to this entry. */
  @Override
  public boolean hasValue() {
    return this.getContextObject().getValue() != null;
  }

  /** Unsupported Operation. */
  @Override
  public ContextRoot<V> setValue(final ContextRoot<V> value) {
    throw new UnsupportedOperationException("setValue");
  }
}
