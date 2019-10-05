package com.github.hcsp.calculation;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    @CaptureSystemOutput
    public void test(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.matchesRegex("(?s).*5\\s+6\\s+7\\s+8\\s+9\\s+10.*"));
        Solution.printNumberTo10(5);
    }
}
