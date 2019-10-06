package com.github.hcsp.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void test() {
        Assertions.assertEquals(4, Solution.calculate(200));
        Assertions.assertEquals(0, Solution.calculate(42));
    }
}
