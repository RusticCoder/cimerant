package cimerant.antlr.sql;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;

/**
 * A sequence of {@link ParseTree} elements supporting sequential and parallel aggregate operations.
 */
public class ParseTreeStream implements Stream<ParseTree> {
  /**
   * Create a sequence of {@link ParseTree} elements supporting sequential and parallel aggregate
   * operations from a {@link List} of {@link ParseTree} elements.
   *
   * @param parseTreeChildren the {@link List} of {@link ParseTree} elements.
   * @return a sequence of {@link ParseTree} elements supporting sequential and parallel aggregate
   *     operations.
   */
  public static ParseTreeStream parseTreeStream(final List<ParseTree> parseTreeChildren) {
    return new ParseTreeStream(Objects.requireNonNullElseGet(parseTreeChildren, ArrayList::new));
  }

  /**
   * Create a sequence of {@link ParseTree} elements supporting sequential and parallel aggregate
   * operations from a {@link ParserRuleContext} children.
   *
   * @param parseTree the {@link ParserRuleContext}.
   * @return a sequence of {@link ParseTree} elements supporting sequential and parallel aggregate
   *     operations.
   */
  public static ParseTreeStream parseTreeStream(final ParserRuleContext parseTree) {
    if (parseTree == null) {
      return new ParseTreeStream(new ArrayList<>());
    }
    return new ParseTreeStream(parseTree.children);
  }

  private final List<ParseTree> parseTreeChildren;

  /**
   * A sequence of {@link ParseTree} elements supporting sequential and parallel aggregate
   * operations.
   *
   * @param parseTreeChildren the {@link Stream} of {@link ParseTree} elements
   */
  public ParseTreeStream(final List<ParseTree> parseTreeChildren) {
    this.parseTreeChildren = parseTreeChildren;
  }

  @Override
  public boolean allMatch(final Predicate<? super ParseTree> predicate) {
    return this.parseTreeChildren.stream().allMatch(predicate);
  }

  @Override
  public boolean anyMatch(final Predicate<? super ParseTree> predicate) {
    return this.parseTreeChildren.stream().anyMatch(predicate);
  }

  @Override
  public void close() {
    this.parseTreeChildren.stream().close();
  }

  @Override
  public <R, A> R collect(final Collector<? super ParseTree, A, R> collector) {
    return this.parseTreeChildren.stream().collect(collector);
  }

  @Override
  public <R> R collect(
      final Supplier<R> supplier,
      final BiConsumer<R, ? super ParseTree> accumulator,
      final BiConsumer<R, R> combiner) {
    return this.parseTreeChildren.stream().collect(supplier, accumulator, combiner);
  }

  @Override
  public long count() {
    return this.parseTreeChildren.size();
  }

  @Override
  public Stream<ParseTree> distinct() {
    return this.parseTreeChildren.stream().distinct();
  }

  @Override
  public Stream<ParseTree> filter(final Predicate<? super ParseTree> predicate) {
    return this.parseTreeChildren.stream().filter(predicate);
  }

  @Override
  public Optional<ParseTree> findAny() {
    return this.parseTreeChildren.stream().findAny();
  }

  @Override
  public Optional<ParseTree> findFirst() {
    return this.parseTreeChildren.stream().findFirst();
  }

  @Override
  public <R> Stream<R> flatMap(
      final Function<? super ParseTree, ? extends Stream<? extends R>> mapper) {
    return this.parseTreeChildren.stream().flatMap(mapper);
  }

  @Override
  public DoubleStream flatMapToDouble(
      final Function<? super ParseTree, ? extends DoubleStream> mapper) {
    return this.parseTreeChildren.stream().flatMapToDouble(mapper);
  }

  @Override
  public IntStream flatMapToInt(final Function<? super ParseTree, ? extends IntStream> mapper) {
    return this.parseTreeChildren.stream().flatMapToInt(mapper);
  }

  @Override
  public LongStream flatMapToLong(final Function<? super ParseTree, ? extends LongStream> mapper) {
    return this.parseTreeChildren.stream().flatMapToLong(mapper);
  }

  @Override
  public void forEach(final Consumer<? super ParseTree> action) {
    this.parseTreeChildren.forEach(action);
  }

  @Override
  public void forEachOrdered(final Consumer<? super ParseTree> action) {
    this.parseTreeChildren.stream().forEachOrdered(action);
  }

  @Override
  public boolean isParallel() {
    return this.parseTreeChildren.stream().isParallel();
  }

  @Override
  public Iterator<ParseTree> iterator() {
    return this.parseTreeChildren.stream().iterator();
  }

  @Override
  public Stream<ParseTree> limit(final long maxSize) {
    return this.parseTreeChildren.stream().limit(maxSize);
  }

  /**
   * Returns a {@link List} consisting of all the {@link TerminalNode} children of this stream.
   *
   * @return {@link List} of all the {@link TerminalNode} children of this stream.
   */
  public List<TerminalNode> listAllTerminalNode() {
    final var returnValue =
        this.parseTreeChildren.stream()
            .filter(TerminalNode.class::isInstance)
            .map(terminalNode -> ((TerminalNode) terminalNode))
            .collect(Collectors.toList());
    returnValue.addAll(
        this.parseTreeChildren.stream()
            .filter(ParserRuleContext.class::isInstance)
            .map(parserRuleContext -> ((ParserRuleContext) parserRuleContext).children)
            .filter(Objects::nonNull)
            .map(
                parserRuleContext ->
                    ParseTreeStream.parseTreeStream(parserRuleContext).listAllTerminalNode())
            .filter(Objects::nonNull)
            .flatMap(List::stream)
            .toList());
    return returnValue;
  }

  /**
   * Returns a {@link List} consisting of the {@link String} text of all {@link TerminalNode}
   * children of this stream.
   *
   * @return {@link List} of the {@link String} text of all {@link TerminalNode} children of this
   *     stream.
   */
  public List<String> listAllTerminalNodeText() {
    final var returnValue =
        this.parseTreeChildren.stream()
            .filter(TerminalNode.class::isInstance)
            .map(terminalNode -> ParseTreeHelper.trimToken(terminalNode.getText()))
            .filter(StringUtils::isNoneBlank)
            .collect(Collectors.toList());
    returnValue.addAll(
        this.parseTreeChildren.stream()
            .filter(ParserRuleContext.class::isInstance)
            .map(parserRuleContext -> ((ParserRuleContext) parserRuleContext).children)
            .filter(Objects::nonNull)
            .map(
                parserRuleContext ->
                    new ParseTreeStream(parserRuleContext).listAllTerminalNodeText())
            .flatMap(List::stream)
            .toList());
    return returnValue;
  }

  /**
   * Returns a {@link List} consisting of the {@link ParserRuleContext} children of this stream that
   * match a specific {@link Class}.
   *
   * @param <T> the type of the clazz to be filtered on.
   * @param clazz the {@link Class} to apply to each element to determine if it should be included.
   * @return {@link List} of {@link ParserRuleContext} elements the match the {@link Class}.
   */
  public <T extends ParserRuleContext> List<ParseTree> listChildrenByClass(final Class<T> clazz) {
    return this.parseTreeChildren.stream()
        .filter(clazz::isInstance)
        .map(parserRuleContext -> ((ParserRuleContext) parserRuleContext).children)
        .filter(Objects::nonNull)
        .flatMap(List::stream)
        .collect(Collectors.toList());
  }

  @Override
  public <R> Stream<R> map(final Function<? super ParseTree, ? extends R> mapper) {
    return this.parseTreeChildren.stream().map(mapper);
  }

  @Override
  public DoubleStream mapToDouble(final ToDoubleFunction<? super ParseTree> mapper) {
    return this.parseTreeChildren.stream().mapToDouble(mapper);
  }

  @Override
  public IntStream mapToInt(final ToIntFunction<? super ParseTree> mapper) {
    return this.parseTreeChildren.stream().mapToInt(mapper);
  }

  @Override
  public LongStream mapToLong(final ToLongFunction<? super ParseTree> mapper) {
    return this.parseTreeChildren.stream().mapToLong(mapper);
  }

  @Override
  public Optional<ParseTree> max(final Comparator<? super ParseTree> comparator) {
    return this.parseTreeChildren.stream().max(comparator);
  }

  @Override
  public Optional<ParseTree> min(final Comparator<? super ParseTree> comparator) {
    return this.parseTreeChildren.stream().min(comparator);
  }

  @Override
  public boolean noneMatch(final Predicate<? super ParseTree> predicate) {
    return this.parseTreeChildren.stream().noneMatch(predicate);
  }

  @Override
  public Stream<ParseTree> onClose(final Runnable closeHandler) {
    return this.parseTreeChildren.stream().onClose(closeHandler);
  }

  @Override
  public Stream<ParseTree> parallel() {
    return this.parseTreeChildren.stream().parallel();
  }

  @Override
  public Stream<ParseTree> peek(final Consumer<? super ParseTree> action) {
    return this.parseTreeChildren.stream().peek(action);
  }

  @Override
  public Optional<ParseTree> reduce(final BinaryOperator<ParseTree> accumulator) {
    return this.parseTreeChildren.stream().reduce(accumulator);
  }

  @Override
  public ParseTree reduce(final ParseTree identity, final BinaryOperator<ParseTree> accumulator) {
    return this.parseTreeChildren.stream().reduce(identity, accumulator);
  }

  @Override
  public <U> U reduce(
      final U identity,
      final BiFunction<U, ? super ParseTree, U> accumulator,
      final BinaryOperator<U> combiner) {
    return this.parseTreeChildren.stream().reduce(identity, accumulator, combiner);
  }

  @Override
  public Stream<ParseTree> sequential() {
    return this.parseTreeChildren.stream().sequential();
  }

  @Override
  public Stream<ParseTree> skip(final long n) {
    return this.parseTreeChildren.stream().skip(n);
  }

  @Override
  public Stream<ParseTree> sorted() {
    return this.parseTreeChildren.stream().sorted();
  }

  @Override
  public Stream<ParseTree> sorted(final Comparator<? super ParseTree> comparator) {
    return this.parseTreeChildren.stream().sorted(comparator);
  }

  @Override
  public Spliterator<ParseTree> spliterator() {
    return this.parseTreeChildren.stream().spliterator();
  }

  /**
   * Returns a {@link Stream} consisting of the {@link ParseTree} children of this stream that match
   * a specific {@link Class}.
   *
   * @param <T> the type of the clazz to be filtered on.
   * @param clazz the {@link Class} to apply to each element to determine if it should be included.
   * @return {@link Stream} of {@link ParseTree} elements the match the {@link Class}.
   */
  public <T extends ParserRuleContext> ParseTreeStream streamChildrenByClass(final Class<T> clazz) {
    return new ParseTreeStream(
        this.parseTreeChildren.stream()
            .filter(clazz::isInstance)
            .map(parserRuleContext -> ((ParserRuleContext) parserRuleContext).children)
            .filter(Objects::nonNull)
            .flatMap(List::stream)
            .toList());
  }

  /**
   * Returns a {@link Stream} consisting of {@link String} children of this stream that match {@link
   * TerminalNode}.
   *
   * @return {@link Stream} of {@link String} elements the match the {@link TerminalNode}.
   */
  public Stream<String> streamTerminalNodeString() {
    return this.parseTreeChildren.stream()
        .filter(TerminalNode.class::isInstance)
        .map(terminalNode -> ParseTreeHelper.trimToken(terminalNode.getText()))
        .filter(StringUtils::isNoneBlank);
  }

  /**
   * Returns a {@link Stream} consisting of combined text of all child nodes for each child of this
   * stream that match {@link Class}.
   *
   * @param <T> the type of the clazz to be filtered on.
   * @param input A source of characters for an ANTLR lexer.
   * @param clazz the {@link Class} to apply to each element to determine if the combined text of
   *     all child nodes should be included.
   * @return {@link Stream} of {@link String} combined text that match the {@link Class}.
   */
  public <T extends ParserRuleContext> Stream<String> streamTextByClass(
      final CharStream input, final Class<T> clazz) {
    return this.parseTreeChildren.stream()
        .filter(clazz::isInstance)
        .map(
            parserRuleContext ->
                ParseTreeHelper.getText(input, (ParserRuleContext) parserRuleContext))
        .filter(Objects::nonNull);
  }

  @Override
  public Object[] toArray() {
    return this.parseTreeChildren.toArray();
  }

  @Override
  public <A> A[] toArray(final IntFunction<A[]> generator) {
    return this.parseTreeChildren.toArray(generator);
  }

  @Override
  public Stream<ParseTree> unordered() {
    return this.parseTreeChildren.stream().unordered();
  }
}
