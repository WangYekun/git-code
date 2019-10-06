package com.github.hcsp.controlflow;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        int n = new Random().nextInt(100);
        capture.expect(
                Matchers.containsStringIgnoringCase(
                        IntStream.range(-n, n + 1)
                                .filter(i -> i % 2 != 0)
                                .mapToObj(Integer::toString)
                                .collect(Collectors.joining(","))));
        Main.printOddNumbersBetween(-n, n);
    }
}
