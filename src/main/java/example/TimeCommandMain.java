package example;

import parser.Option;
import parser.Parser;
import parser.ParserBuilder;

import static example.TimeCommandOptionBuilders.*;

public class TimeCommandMain {

     public static void main(String[] args) {

          Parser<TimeCommandOptions> parser = ParserBuilder.<TimeCommandOptions>builder()
             .withOption(FORMAT_OPTION)
             .withOption(PORTABILITY_OPTION)
             .withOption(OUTPUT_OPTION)
             .withOption(APPEND_OPTION)
             .withOption(VERBOSE_OPTION)
          .build();

          TimeCommandOptions options = new TimeCommandOptions();
          parser.parse(args, options);
     }
}
