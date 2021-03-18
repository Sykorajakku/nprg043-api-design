package example;

import parser.Option;
import parser.OptionBuilder;

public class OptionBuilderExample {

        public static final Option VERSION_OPTION = OptionBuilder.builder()
                .asLong("version")
                .asShort("v")
                .asRequired()
                .withOptionalParameterSequence()
                    .parameterBuilder()
                    .build()
                .buildOption();

        public static final Option FLAG_OPTION = OptionBuilder.builder()
                .asShort("f")
                .buildOption();
}
