package cimerant.context;

import java.io.Serial;
import java.util.TreeSet;

/** An object that represents an attribute. */
public class NotNullSet extends TreeSet<String> {
  @Serial private static final long serialVersionUID = 1L;

  /**
   * Global access point to get a instance of the context, ensuring that only one instance of the
   * context exists.
   *
   * @param object The object to be represented by the {@code NotNullSet}
   * @return a instance of the NotNull{@code NotNullSet}.
   */
  public static NotNullSet getInstance(final Object object) {
    if (object == null) {
      return new NotNullSet();
    }
    if (object instanceof NotNullSet) {
      return (NotNullSet) object;
    }
    if (object instanceof Iterable) {
      return new NotNullSet((Iterable<?>) object);
    }
    return new NotNullSet(object.toString());
  }

  /** Creates an instance. */
  public NotNullSet() {
    super(String.CASE_INSENSITIVE_ORDER);
  }

  /**
   * Creates an instance.
   *
   * @param iterable elements to be added.
   */
  public NotNullSet(final Iterable<?> iterable) {
    super(String.CASE_INSENSITIVE_ORDER);
    for (var item : iterable) {
      if (item != null) {
        this.add(item.toString());
      }
    }
  }

  /**
   * Creates an instance.
   *
   * @param string element to be added.
   */
  public NotNullSet(final String string) {
    super(String.CASE_INSENSITIVE_ORDER);
    if (string != null) {
      this.add(string);
    }
  }

  /**
   * Returns the value to which the specified index, or empty string if this map contains no index.
   *
   * @param index the number of leading elements to skip.
   * @return the value to which the specified index.
   */
  public String get(final int index) {
    return this.stream().skip(index).findFirst().orElse("");
  }

  @Override
  public boolean equals(final Object object) {
    if (object instanceof String) {
      return this.toString().equals(object);
    }
    return super.equals(object);
  }

  @Override
  public String toString() {
    return switch (this.size()) {
      case 0 -> "";
      case 1 -> (this.first() == null ? "" : this.first());
      default -> String.join(", ", this);
    };
  }
}
