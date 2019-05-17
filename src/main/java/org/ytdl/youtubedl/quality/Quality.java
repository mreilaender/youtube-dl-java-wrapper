package org.ytdl.youtubedl.quality;

import org.ytdl.youtubedl.formatselector.FormatSelector;
import org.ytdl.youtubedl.command.CommandFormatter;

import java.util.ArrayList;
import java.util.List;

public abstract class Quality implements CommandFormatter {
    final String EXTENSION_SEPARATOR = ",";
    List<CommandFormatter> options;
    FormatSelector formatSelector;

    String quality;

    Quality(FormatSelector formatSelector) {
        this.formatSelector = formatSelector;
        options = new ArrayList<>();
    }

    @Override
    public String format() {
        String formatted = quality + "";
        if(hasOptions()) {
            formatted += "[";
            int index = 0;
            for(CommandFormatter commandFormatter: options) {
                if(!isFirstCommandFormatter(index)) {
                    formatted += EXTENSION_SEPARATOR;
                }
                formatted += commandFormatter.format();
                ++index;
            }
            formatted += "]";
        }
        return formatted;
    }

    public FormatSelector and() {
        return formatSelector;
    }

    private boolean hasOptions() {
        return !options.isEmpty();
    }

    private boolean isFirstCommandFormatter(int index) {
        return index == 0;
    }
}
