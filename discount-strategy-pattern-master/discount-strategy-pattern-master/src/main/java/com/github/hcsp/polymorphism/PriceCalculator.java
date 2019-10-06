package com.github.hcsp.polymorphism;

public class PriceCalculator {
    // 使用策略模式重构这个方法，实现三个策略：
    // NoDiscountStrategy 不打折
    // Discount95Strategy 全场95折
    // OnlyVipDiscountStrategy 只有VIP打95折，其他人保持原价
    // 重构后的方法签名：
    // public static int calculatePrice(DiscountStrategy strategy, int price, User user)
    public static int calculatePrice(String discountStrategy, int price, User user) {
        switch (discountStrategy) {
            case "NoDiscount":
                return price;
            case "Discount95":
                return (int) (price * 0.95);
            case "OnlyVip":
                {
                    if (user.isVip()) {
                        return (int) (price * 0.95);
                    } else {
                        return price;
                    }
                }
            default:
                throw new IllegalStateException("Should not be here!");
        }
    }
}
