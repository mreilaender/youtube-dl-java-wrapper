package org.ytdl.youtubedl.extension;

import org.ytdl.youtubedl.command.CommandFormatter;

public class Extension implements CommandFormatter {
    private final String OPTION_NAME          = "ext";

    String extension;

    public Extension(String extension) {
        this.extension = extension;
    }

    @Override
    public String format() {
        return String.format(
                "%s=%s",
                OPTION_NAME,
                extension
        );
    }
}
