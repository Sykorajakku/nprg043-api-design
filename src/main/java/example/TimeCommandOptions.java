package example;

import parser.annotations.BooleanOptionTarget;
import parser.annotations.OptionParameterTarget;

import java.io.File;

public class TimeCommandOptions {

    @BooleanOptionTarget(optionName = "p")
    public boolean portability;

    @BooleanOptionTarget(optionName = "a")
    public boolean append;

    @BooleanOptionTarget(optionName = "v")
    public boolean verbose;

    @OptionParameterTarget(optionName = "o", index = 0)
    public File errorsOutputFile;

    @OptionParameterTarget(optionName = "f", index = 0)
    public String timeFormat;
}
