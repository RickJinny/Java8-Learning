package com.rickjinny.java8.defaultmethod;

public interface Java8Interface02 {

    static String staticMethod() {
        return "我是Java8Interface02接口中的静态方法staticMethod";
    }

    default String defaultMethod() {
        return "我是Java8Interface02接口中的默认方法defaultMethod";
    }
}
