package org.ytdl.youtubedl.extension;

public enum AudioExtension {
    EXTENSION_AAC("aac"),
    EXTENSION_M4A("m4a"),
    EXTENSION_MP3("mp3"),
    EXTENSION_OOG("oog"),
    EXTENSION_WAV("wav");

    private String extension;

    AudioExtension(String audioExtension) {
        this.extension = audioExtension;
    }

    @Override
    public String toString() {
        return extension;
    }
}
