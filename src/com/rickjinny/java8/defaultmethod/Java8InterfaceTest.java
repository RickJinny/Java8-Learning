package com.rickjinny.java8.defaultmethod;

public class Java8InterfaceTest {

    public static void main(String[] args) {
        /**
          * 1、接口中的静态方法，只能通过接口名调用，不可以通过实现类的类名或者实现类的对象调用。
          */
        String staticMethodResult = Java8Interface01.staticMethod();
        System.out.println(staticMethodResult);

        /**
          * 2、接口中的default方法，只能通过接口的实现类的对象来调用。
          * 如果实现类中重写了default方法，则会执行实现类中的default方法;
          * 如果实现类中没有重写default方法，则会执行接口中的default方法;
          */
        Java8Interface01 java8Interface = new Java8InterfaceImpl();
        String defaultMethodResult = java8Interface.defaultMethod();
        System.out.println(defaultMethodResult);
    }
}
