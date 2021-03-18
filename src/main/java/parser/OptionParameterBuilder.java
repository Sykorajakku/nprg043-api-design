package parser;

public class OptionParameterBuilder {

    private final OptionParametersBuilder optionParametersBuilder;

    public OptionParameterBuilder(OptionParametersBuilder optionParametersBuilder) {
        this.optionParametersBuilder = optionParametersBuilder;
    }

    // TODO: add parameter building options

    public OptionParametersBuilder build() {
        return optionParametersBuilder;
    }


}
