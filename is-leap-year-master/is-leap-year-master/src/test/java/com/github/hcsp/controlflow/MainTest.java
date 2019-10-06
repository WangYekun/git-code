package com.github.hcsp.controlflow;

import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        int a = new Random().nextInt(10);
        Assertions.assertTrue(Main.isLeapYear(a * 400));
        Assertions.assertTrue(Main.isLeapYear(a * 100 + 4));
        Assertions.assertFalse(Main.isLeapYear(a * 400 + 3));
        Assertions.assertFalse(Main.isLeapYear(a * 400 + 100));
    }
}
