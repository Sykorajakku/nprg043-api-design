package parser;

public class OptionParametersBuilder {

    private final OptionBuilder optionBuilder;

    public OptionParametersBuilder(OptionBuilder optionBuilder) {
        this.optionBuilder = optionBuilder;
    }

    public OptionParameterBuilder parameterBuilder() {
        return new OptionParameterBuilder(this);
    }

    public OptionParametersBuilder withSimpleStringParameter() {
        return this;
    }

    public Option buildOption() {
        return optionBuilder.build(); // pass all definitions, do checks
    }

}
