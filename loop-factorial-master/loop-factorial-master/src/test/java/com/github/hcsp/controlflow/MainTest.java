package com.github.hcsp.controlflow;

import java.util.Random;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        int n = new Random().nextInt(10);
        Assertions.assertEquals((int) CombinatoricsUtils.factorial(n), Main.factorial(n));
        Assertions.assertEquals(1, Main.factorial(0));
    }
}
