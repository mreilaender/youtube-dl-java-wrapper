package org.ytdl.youtubedl;


import org.ytdl.youtubedl.command.Command;
import org.ytdl.youtubedl.command.CommandFormatter;
import org.ytdl.youtubedl.formatselector.FormatSelector;

import java.util.ArrayList;
import java.util.List;

public class YouTubeDLWrapper implements Command, CommandFormatter {
    private static final String YOUTUBE_DL_COMMAND = "youtube-dl";
    private static final String COMMAND_ARGUMENT_SEPARATOR = " ";

    private List<CommandFormatter> arguments;

    private String url;

    public YouTubeDLWrapper(String url) {
        this.url = url;
        arguments = new ArrayList<>();
    }

    public FormatSelector withFormatSelector() {
        FormatSelector formatSelector = new FormatSelector(this);
        arguments.add(formatSelector);
        return formatSelector;
    }

    @Override
    public String format() {
        String formatted = YOUTUBE_DL_COMMAND + " ";

        int i = 0;
        for (CommandFormatter quality: arguments) {
            if(!isFirstCommandFormatter(i)) {
                formatted += COMMAND_ARGUMENT_SEPARATOR;
            }
            formatted += quality.format();
            ++i;
        }

        return formatted + " " + url;
    }

    @Override
    public String getCommand() {
        return YOUTUBE_DL_COMMAND;
    }

    private boolean hasArguments() {
        return !arguments.isEmpty();
    }

    private boolean isFirstCommandFormatter(int i) {
        return i == 0;
    }
}
