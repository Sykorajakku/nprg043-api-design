package parser;

public class OptionDefinitionBuilder {

    private final OptionBuilder optionBuilder;

    public OptionDefinitionBuilder(OptionBuilder optionBuilder) {
        this.optionBuilder = optionBuilder;
    }

    public OptionDefinitionBuilder asShort(String shortOptionName) {
        return this;
    }

    public OptionDefinitionBuilder asLong(String longOptionName) {
        return this;
    }

    public OptionDefinitionBuilder asRequired() {
        return this;
    }

    public OptionParametersBuilder withRequiredParameterSequence() {
        return new OptionParametersBuilder(optionBuilder);
    }

    public OptionParametersBuilder withOptionalParameterSequence() {
        return new OptionParametersBuilder(optionBuilder);
    }

    public Option buildOption() {
        return optionBuilder.build();
    }
}
