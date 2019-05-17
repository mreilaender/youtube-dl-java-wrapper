package org.ytdl.youtubedl.extension;

public enum VideoExtension {
    EXTENSION_3GP("3gp"), EXTENSION_FLV("flv"), EXTENSION_MP4("mp4"), EXTENSION_WEBM("webm");

    String extension;

    VideoExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return extension;
    }
}
