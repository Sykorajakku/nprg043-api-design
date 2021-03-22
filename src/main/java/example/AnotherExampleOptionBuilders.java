package example;

import parser.Option;
import parser.OptionBuilder;

public class AnotherExampleOptionBuilders {

        public static final Option VERSION_OPTION = OptionBuilder.builder()
                .asLong("copy")
                .asShort("c")
                .asRequired()
                .withOptionalParameterSequence()
                    .withSimpleStringParameter()
                    .withSimpleStringParameter()
                .buildOption();

        public static final Option FLAG_OPTION = OptionBuilder.builder()
                .asShort("f")
                .buildOption();
}
