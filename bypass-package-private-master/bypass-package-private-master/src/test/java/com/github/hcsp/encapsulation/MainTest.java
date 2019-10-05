package com.github.hcsp.encapsulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void bypassPackagePrivate() {
        Assertions.assertEquals(
                "com.github.blindpirate.extensions.CaptureSystemOutputExtension",
                Main.createCaptureSystemOutputExtension().getClass().getName());
        Assertions.assertTrue(
                org.junit.jupiter.api.extension.BeforeEachCallback.class.isAssignableFrom(
                        Main.createCaptureSystemOutputExtension().getClass()));
    }
}
