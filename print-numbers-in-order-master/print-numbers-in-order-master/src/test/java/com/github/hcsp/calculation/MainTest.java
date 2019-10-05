package com.github.hcsp.calculation;

import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        int a = new Random().nextInt(1000);
        Assertions.assertEquals(
                String.format("%d>%d>%d", a + 1, a, a - 1),
                Main.printNumbersInOrder(a, a - 1, a + 1));
        Assertions.assertEquals(
                String.format("%d>%d>%d", a + 1, a, a - 1),
                Main.printNumbersInOrder(a, a + 1, a - 1));
    }
}
