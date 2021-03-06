package com.github.hcsp.multithread;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class ProducerConsumerTest {
    @Test
    @CaptureSystemOutput
    public void test(CaptureSystemOutput.OutputCapture capture) throws Exception {
        capture.expect(
                Matchers.matchesRegex("(?s).*(Producing -?\\d+\\s+Consuming -?\\d+\\s+){10}.*"));
        Boss.main(null);
    }
}
