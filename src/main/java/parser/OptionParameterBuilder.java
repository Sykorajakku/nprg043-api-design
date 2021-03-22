package parser;

import parser.exceptions.ParameterException;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class OptionParameterBuilder {

    private final OptionParametersBuilder optionParametersBuilder;

    public OptionParameterBuilder(OptionParametersBuilder optionParametersBuilder) {
        this.optionParametersBuilder = optionParametersBuilder;
    }

    public OptionParameterBuilder withAllowedParameterValues(String ... allowedParameters) {
        return null;
    }

    public OptionParameterBuilder withAllowedParameterFilter(Predicate<String> predicate) {
        return null;
    }

    public <C> OptionParameterBuilder withTypeConvertor(Function<String, C> convertor) {
        return null;
    }

    public OptionParameterBuilder withExplicitExceptionHandler(Consumer<ParameterException> parameterExceptionConsumer) {
        return null;
    }

    public OptionParametersBuilder build() {
        return optionParametersBuilder;
    }


}
