package com.github.hcsp.controlflow;

import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        Random r = new Random();
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        m[0][0] = r.nextInt(100);
        m[1][1] = r.nextInt(100);
        m[2][2] = r.nextInt(100);
        Assertions.assertEquals(m[0][0] + m[1][1] + m[2][2], Main.diagonalSum(m));
    }
}
