package com.github.hcsp.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinalTest {
    @Test
    public void test() {
        Assertions.assertEquals(Base.class, Sub.class.getSuperclass());
    }
}
