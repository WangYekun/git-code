package com.github.hcsp.polymorphism;

public class Base {
    public void print(ParamBase param) {
        System.out.println("I am Base, the param is ParamBase");
    }

    public void print(ParamSub param) {
        System.out.println("I am Base, the param is ParamSub");
    }
}
