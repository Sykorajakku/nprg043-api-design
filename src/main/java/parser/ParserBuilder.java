package parser;

public class ParserBuilder<T> {

    public static <T> ParserBuilder<T> builder() {
        return new ParserBuilder<>();
    }

    public ParserBuilder<T> withOption(Option option) {
        return this;
    }

    public Parser<T> build() {
        return new Parser<>();
    }
}
