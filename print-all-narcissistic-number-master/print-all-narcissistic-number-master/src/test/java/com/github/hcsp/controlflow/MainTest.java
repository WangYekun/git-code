package com.github.hcsp.controlflow;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsStringIgnoringCase("153"));
        capture.expect(Matchers.containsStringIgnoringCase("370"));
        capture.expect(Matchers.containsStringIgnoringCase("371"));
        capture.expect(Matchers.containsStringIgnoringCase("407"));
        Main.printNarcissisticNumber();
    }
}
