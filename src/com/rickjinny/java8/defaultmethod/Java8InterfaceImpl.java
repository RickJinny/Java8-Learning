package com.rickjinny.java8.defaultmethod;

public class Java8InterfaceImpl implements Java8Interface01, Java8Interface02 {

    @Override
    public String defaultMethod() {
        return "我是实现类Java8InterfaceImpl中的defaultMethod方法";
    }
}
