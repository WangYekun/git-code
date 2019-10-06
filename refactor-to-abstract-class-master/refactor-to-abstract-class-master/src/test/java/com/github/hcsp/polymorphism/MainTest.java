package com.github.hcsp.polymorphism;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import com.github.hcsp.test.helper.ProjectSourceFileReader;
import java.util.stream.Stream;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void 做西红柿炒鸡蛋(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(
                Matchers.matchesRegex(
                        "(?s).*洗炒锅\\s+倒油\\s+放鸡蛋\\s+放西红柿\\s+炒啊炒啊炒\\s+放盐\\s+香喷喷的西红柿炒鸡蛋出锅啦\\s+.*"));
        菜 一个菜 = new 西红柿炒鸡蛋();
        一个菜.做一个菜();
    }

    @Test
    @CaptureSystemOutput
    public void 做清炒菜心(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(
                Matchers.matchesRegex(
                        "(?s).*洗炒锅\\s+倒一点点油\\s+放青菜\\s+炒啊炒啊炒\\s+放酱油\\s+放盐\\s+香喷喷的清炒菜心出锅啦\\s+.*"));
        菜 一个菜 = new 清炒菜心();
        一个菜.做一个菜();
    }

    @Test
    @CaptureSystemOutput
    public void 做煎牛排(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(
                Matchers.matchesRegex(
                        "(?s).*洗煎锅\\s+倒油\\s+放牛排\\s+煎啊煎啊煎\\s+放胡椒粉\\s+放盐\\s+香喷喷的煎牛排出锅啦\\s+.*"));
        菜 一个菜 = new 煎牛排();
        一个菜.做一个菜();
    }

    @Test
    public void hasOverries() {
        Assertions.assertTrue(
                Stream.of(西红柿炒鸡蛋.class, 清炒菜心.class, 煎牛排.class)
                        .map(ProjectSourceFileReader::readAsString)
                        .allMatch(code -> code.contains("@Override")));
    }
}
