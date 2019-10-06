package com.github.hcsp.inheritance;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import com.github.hcsp.test.helper.ProjectSourceFileReader;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StoryTest {
    @Test
    @CaptureSystemOutput
    public void test(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.matchesRegex("(?s).*开始讲故事啦\\s+从前有个老妖怪\\s+故事讲完啦\\s+你还想听吗.*"));
        new MonsterStory().tellStory();
    }

    @Test
    public void hasOverride() {
        Assertions.assertTrue(
                ProjectSourceFileReader.readAsString(MonsterStory.class).contains("@Override"));
    }

    @Test
    public void hasSuper() {
        Assertions.assertTrue(
                ProjectSourceFileReader.readAsString(MonsterStory.class)
                        .contains("super.endStory"));
    }
}
