package org.ytdl.youtubedl.quality;

import org.ytdl.youtubedl.formatselector.FormatSelector;
import org.ytdl.youtubedl.extension.VideoExtension;
import org.ytdl.youtubedl.extension.Extension;

public class VideoQuality extends Quality {
    private final String BEST   = "bestvideo";
    private final String WORST  = "worstvideo";

    public VideoQuality(FormatSelector formatSelector) {
        super(formatSelector);
        quality = BEST;
    }

    public VideoQuality bestVideo() {
        quality = BEST;
        return this;
    }

    public VideoQuality worstVideo() {
        quality = WORST;
        return this;
    }

    public FormatSelector as3GP() {
        options.add(new Extension(VideoExtension.EXTENSION_3GP.toString()));
        return formatSelector;
    }

    public FormatSelector asFLV() {
        options.add(new Extension(VideoExtension.EXTENSION_FLV.toString()));
        return formatSelector;
    }

    public FormatSelector asMP4() {
        options.add(new Extension(VideoExtension.EXTENSION_MP4.toString()));
        return formatSelector;
    }

    public FormatSelector asWEBM() {
        options.add(new Extension(VideoExtension.EXTENSION_WEBM.toString()));
        return formatSelector;
    }

    public FormatSelector and() {
        return formatSelector;
    }
}
