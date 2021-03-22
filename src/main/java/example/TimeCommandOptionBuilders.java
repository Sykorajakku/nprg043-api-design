package example;

import parser.Option;
import parser.OptionBuilder;

import java.io.File;

public class TimeCommandOptionBuilders {

    public static final Option PORTABILITY_OPTION =
        OptionBuilder.builder()
            .asShort("p")
            .asLong("portability")
            .withHelpDescription("Use the portable output format.")
        .buildOption();

    public static final Option APPEND_OPTION =
        OptionBuilder.builder()
            .asShort("a")
            .asLong("append")
            .withHelpDescription("(Used together with -o.) Do not overwrite but append.")
        .buildOption();

    public static final Option VERBOSE_OPTION =
        OptionBuilder.builder()
            .asShort("v")
            .asLong("verbose")
            .withHelpDescription("Give very verbose output about all the program knows about.")
        .buildOption();

    public static final Option OUTPUT_OPTION =
        OptionBuilder.builder()
            .asShort("o")
            .asLong("output")
            .withHelpDescription("Do not send the results to stderr, but overwrite the specified file.")
            .withRequiredParameterSequence()
                .parameterBuilder()
                    .withTypeConvertor(File::new)
                .build()
        .buildOption();

    public static final Option FORMAT_OPTION =
        OptionBuilder.builder()
            .asShort("f")
            .asLong("format")
            .withRequiredParameterSequence()
                .withSimpleStringParameter()
        .buildOption();

}
