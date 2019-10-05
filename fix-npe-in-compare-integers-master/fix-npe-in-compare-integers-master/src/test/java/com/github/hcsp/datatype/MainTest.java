package com.github.hcsp.datatype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() throws NoSuchMethodException {
        Assertions.assertEquals(false, Main.compare(123, 456));
        Assertions.assertEquals(true, Main.compare(1234, 1234));
        Assertions.assertEquals(false, Main.compare(123, null));
        Main.class.getDeclaredMethod("compare", int.class, Integer.class);
    }
}
