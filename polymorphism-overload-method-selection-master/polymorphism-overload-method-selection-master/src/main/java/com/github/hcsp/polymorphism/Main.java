package com.github.hcsp.polymorphism;

public class Main {
    // 猜一下输出结果是什么，然后运行一下看看是不是和你预期相符
    // 请修改下面的代码，使之输出
    // "I am Sub, the param is ParamSub"
    public static void main(String[] args) {
        Base object = new Sub();
        ParamBase param = new ParamSub();
        object.print(param);
    }
}
