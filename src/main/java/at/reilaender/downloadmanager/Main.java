package at.reilaender.downloadmanager;

import org.ytdl.youtubedl.YouTubeDLWrapper;

public class Main {
    public static void main(String[] args) {
        final String command =
                new YouTubeDLWrapper("https://www.youtube.com/watch?v=HMora9wIXOM")
                    .withFormatSelector()
                        .videoQuality()
                            .worstVideo()
                            .and()
                        .audioQuality()
                            .asM4A()
                            .and()
                        .format();

        System.out.println(command);
    }
}
