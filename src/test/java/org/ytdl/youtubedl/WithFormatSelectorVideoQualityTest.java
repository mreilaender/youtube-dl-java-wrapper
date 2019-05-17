package org.ytdl.youtubedl;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WithFormatSelectorVideoQualityTest {
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
                .videoQuality()
                .bestVideo()
                .and()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'bestvideo\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndVideoQualitySetToBestAndAs3GP_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                    .videoQuality()
                    .bestVideo()
                    .as3GP()
                    .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'bestvideo[ext=3gp]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndVideoQualitySetToBestAndAsFLV_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .videoQuality()
                .bestVideo()
                .asFLV()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'bestvideo[ext=flv]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndVideoQualitySetToBestAndAsMP4_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .videoQuality()
                .bestVideo()
                .asMP4()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'bestvideo[ext=mp4]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndVideoQualitySetToBestAndAsWEBM_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .videoQuality()
                .bestVideo()
                .asWEBM()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'bestvideo[ext=webm]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndAudioQualitySetToWorst_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .videoQuality()
                .worstVideo()
                .and()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'worstvideo\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndVideoQualitySetToWorstAndAs3GP_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .videoQuality()
                .worstVideo()
                .as3GP()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'worstvideo[ext=3gp]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndVideoQualitySetToWorstAndAsFLV_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .videoQuality()
                .worstVideo()
                .asFLV()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'worstvideo[ext=flv]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndVideoQualitySetToWorstAndAsMP4_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .videoQuality()
                .worstVideo()
                .asMP4()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'worstvideo[ext=mp4]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }

    @Test
    public void withFormatSelectorAndVideoQualitySetToWorstAndAsWEBM_shouldCreateCommand() {
        final String command = youTubeDLWrapper
                .withFormatSelector()
                .videoQuality()
                .worstVideo()
                .asWEBM()
                .and()
                .format();

        final String expectedCommand = "youtube-dl -f \'worstvideo[ext=webm]\' " + url;

        assertThat(command, is(equalTo(expectedCommand)));
    }
}
