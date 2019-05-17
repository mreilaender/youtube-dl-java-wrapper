package org.ytdl.youtubedl;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WithFormatSelectorAudioQualityTest {
    private String url;
    private YouTubeDLWrapper youTubeDLWrapper;

    @Before
    public void setUp() throws Exception {
        url = "some invalid url";
        youTubeDLWrapper = new YouTubeDLWrapper(url);
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToBest_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .bestAudio()
                .and()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'bestaudio\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToBestAndAsAAC_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .bestAudio()
                .asAAC()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'bestaudio[ext=aac]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToBestAndAsM4A_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .bestAudio()
                .asM4A()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'bestaudio[ext=m4a]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToBestAndAsMP3_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .bestAudio()
                .asMP3()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'bestaudio[ext=mp3]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToBestAndAsOOG_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .bestAudio()
                .asOOG()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'bestaudio[ext=oog]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToBestAndAsWAV_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .bestAudio()
                .asWAV()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'bestaudio[ext=wav]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToWorst_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .worstAudio()
                .and()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'worstaudio\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToWorstAndAsAAC_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .worstAudio()
                .asAAC()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'worstaudio[ext=aac]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToWorstAndAsM4A_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .worstAudio()
                .asM4A()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'worstaudio[ext=m4a]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToWorstAndAsMP3_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .worstAudio()
                .asMP3()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'worstaudio[ext=mp3]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToWorstAndAsOOG_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .worstAudio()
                .asOOG()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'worstaudio[ext=oog]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToWorstAndAsWAV_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .audioQuality()
                .worstAudio()
                .asWAV()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'worstaudio[ext=wav]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }
}
