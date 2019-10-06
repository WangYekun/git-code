package com.github.hcsp.polymorphism;

public class Sub extends Base {
    @Override
    public void print(ParamBase param) {
        System.out.println("I am Sub, the param is ParamBase");
    }

    @Override
    public void print(ParamSub param) {
        System.out.println("I am Sub, the param is ParamSub");
    }
}
