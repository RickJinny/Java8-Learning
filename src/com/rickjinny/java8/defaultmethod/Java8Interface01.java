package com.rickjinny.java8.defaultmethod;

/**
  * Java8以后，允许在接口中定义static方法和default方法。
  * default方法：允许接口中包含具体实现的方法，这种方法被称为"默认方法"，使用default关键字修饰。
  * static不能和default同时使用。
  *
  * 1、接口中的静态方法，只能通过接口名调用，不可以通过实现类的类名或者实现类的对象调用。
  * 2、接口中的default方法，只能通过接口的实现类的对象来调用。
  *
  * 3、由于java支持一个实现类可以实现多个接口，如果多个接口中存在同样的static和default方法会怎么样呢？
  * (1) 如果有两个接口中的静态方法一模一样，并且一个实现类同时实现了这两个接口，此时并不会产生错误，
  *     因为jdk8只能通过接口类调用接口中的静态方法，所以对编译器来说是可以区分的。
  * (2) 如果两个接口中定义了一模一样的默认方法，并且一个实现类同时实现了这两个接口，那么必须在实现类中重写默认方法，否则编译失败。
  */
public interface Java8Interface01 {

    static String staticMethod() {
        return "我是Java8Interface01接口中的静态方法staticMethod";
    }

    default String defaultMethod() {
        return "我是Java8Interface01接口中的默认方法defaultMethod";
    }
}
