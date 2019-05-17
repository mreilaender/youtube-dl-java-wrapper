package org.ytdl.youtubedl.formatselector;

import org.ytdl.youtubedl.YouTubeDLWrapper;
import org.ytdl.youtubedl.quality.AudioQuality;
import org.ytdl.youtubedl.command.CommandFormatter;
import org.ytdl.youtubedl.quality.VideoQuality;

import java.util.ArrayList;
import java.util.List;

public class FormatSelector implements CommandFormatter {
    private static final String FORMAT_SELECTOR_FLAG = "-f";
    private static final String FORMAT_SELECTOR_SEPARATOR = "+";

    private YouTubeDLWrapper youTubeDLWrapper;
    private List<CommandFormatter> qualities;

    private CommandFormatter audioQuality;
    private CommandFormatter videoQuality;

    public FormatSelector(YouTubeDLWrapper youTubeDLWrapper) {
        this.youTubeDLWrapper = youTubeDLWrapper;
        qualities = new ArrayList<>();
    }

    public AudioQuality audioQuality() {
        audioQuality = new AudioQuality(this);
        return (AudioQuality) audioQuality;
    }

    public VideoQuality videoQuality() {
        videoQuality = new VideoQuality(this);
        return (VideoQuality) videoQuality;
    }

    public YouTubeDLWrapper and() {
        return youTubeDLWrapper;
    }

    @Override
    public String format() {
        String formatted = FORMAT_SELECTOR_FLAG + " \'";

        if(hasVideoQualitySet()) {
            formatted += videoQuality.format();
        }
        if(hasAudioQualitySet()) {
            if(hasVideoQualitySet()) {
                formatted += FORMAT_SELECTOR_SEPARATOR;
            }
            formatted += audioQuality.format();
        }

        return formatted + "\'";
    }

    private boolean hasAudioQualitySet() {
        return audioQuality != null;
    }

    private boolean hasVideoQualitySet() {
        return videoQuality != null;
    }

    private boolean isFirstCommandFormatter(int i) {
        return i == 0;
    }
}
