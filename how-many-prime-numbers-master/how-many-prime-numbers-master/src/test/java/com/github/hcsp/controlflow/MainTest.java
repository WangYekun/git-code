package com.github.hcsp.controlflow;

import java.util.Random;
import java.util.stream.IntStream;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        int n = new Random().nextInt(1000);
        Assertions.assertEquals(
                IntStream.range(1, n).filter(Primes::isPrime).count(), Main.howManyPrimeNumbers(n));
    }
}
