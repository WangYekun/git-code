package com.github.hcsp.encapsulation;

import com.github.blindpirate.extensions.CaptureSystemOutputExtension;

public class Main {
    public static void main(String[] args) {
        System.out.println(createCaptureSystemOutputExtension().getClass().getName());
    }

    public static Object createCaptureSystemOutputExtension() {
        // 因为CaptureSystemOutputExtension是包级私有的，因此无法直接创建它
        // https://github.com/blindpirate/junit5-capture-system-output-extension/blob/4ee3aa0a0d9b2610b482e4571ecc33828c60248a/src/main/java/com/github/blindpirate/extensions/CaptureSystemOutputExtension.java#L44
        // 想办法绕过这个限制，创建一个这样的实例。提示：你可以创建一些别的类和别的方法，并不一定非要在这个类中完成这件事。祝你好运！
        return new CaptureSystemOutputExtension();
    }
}
