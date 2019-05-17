package org.ytdl.youtubedl.quality;

import org.ytdl.youtubedl.extension.AudioExtension;
import org.ytdl.youtubedl.extension.Extension;
import org.ytdl.youtubedl.formatselector.FormatSelector;

public class AudioQuality extends Quality {
    private final String BEST   = "bestaudio";
    private final String WORST  = "worstaudio";

    public AudioQuality(FormatSelector formatSelector) {
        super(formatSelector);
        quality = BEST;
    }

    public AudioQuality bestAudio() {
        quality = BEST;
        return this;
    }

    public AudioQuality worstAudio() {
        quality = WORST;
        return this;
    }

    public FormatSelector asAAC() {
        options.add(new Extension(AudioExtension.EXTENSION_AAC.toString()));
        return formatSelector;
    }

    public FormatSelector asM4A() {
        options.add(new Extension(AudioExtension.EXTENSION_M4A.toString()));
        return formatSelector;
    }

    public FormatSelector asMP3() {
        options.add(new Extension(AudioExtension.EXTENSION_MP3.toString()));
        return formatSelector;
    }

    public FormatSelector asOOG() {
        options.add(new Extension(AudioExtension.EXTENSION_OOG.toString()));
        return formatSelector;
    }

    public FormatSelector asWAV() {
        options.add(new Extension(AudioExtension.EXTENSION_WAV.toString()));
        return formatSelector;
    }
}
