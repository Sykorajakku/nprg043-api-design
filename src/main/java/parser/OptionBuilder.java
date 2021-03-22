package parser;

public class OptionBuilder {

    public static OptionDefinitionBuilder builder() {
        OptionBuilder optionBuilder = new OptionBuilder();
        return new OptionDefinitionBuilder(optionBuilder);
    }

    public Option build() {
        return new Option();
    }
}
