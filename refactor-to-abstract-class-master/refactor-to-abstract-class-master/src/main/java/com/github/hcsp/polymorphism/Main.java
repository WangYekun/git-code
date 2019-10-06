package com.github.hcsp.polymorphism;

public class Main {
    // 请仔细观察`西红柿炒鸡蛋`/`清炒菜心`/`煎鸡蛋`几个类
    // 提取他们的公共代码到`菜`中，完成重构
    // 注意不要修改各个菜的烹饪步骤
    public static void main(String[] args) {
        菜[] 菜们 = new 菜[] {new 西红柿炒鸡蛋(), new 清炒菜心(), new 煎牛排()};
        for (菜 一个菜 : 菜们) {
            一个菜.做一个菜();
        }
    }
}
