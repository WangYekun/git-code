package com.github.hcsp.polymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {
    @Test
    public void test() {
        Assertions.assertEquals(
                95, PriceCalculator.calculatePrice(new Discount95Strategy(), 100, User.dios("屌丝")));
        Assertions.assertEquals(
                100,
                PriceCalculator.calculatePrice(
                        new OnlyVipDiscountStrategy(), 100, User.dios("屌丝")));
        Assertions.assertEquals(
                95,
                PriceCalculator.calculatePrice(new OnlyVipDiscountStrategy(), 100, User.vip("土豪")));
        Assertions.assertEquals(
                100, PriceCalculator.calculatePrice(new NoDiscountStrategy(), 100, User.vip("土豪")));
    }
}
