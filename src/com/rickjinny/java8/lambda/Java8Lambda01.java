package com.rickjinny.java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Lambda表达式：可以理解为是可传递的匿名函数的一种方式。Lambda表达式，也叫做闭包。
 * 它没有名称，但它有参数列表、函数主体、返回类型、抛出异常的列表。
 * 1、匿名：它不像普通方法一样，有一个明确的名称。
 * 2、函数：Lambda函数有参数列表、函数主体、返回类型，还可能有可以抛出的异常列表。
 * 3、传递：Lambda表达式可以作为参数传递给方法或存储在变量中。
 * 4、简洁：无需像匿名类那样写很多模板代码。
 *
 * 格式：使用操作符"->"，该操作符称为箭头操作符或者Lambda操作符，"->"将Lambda表达式拆分成两个部分
 *      左侧：Lambda表达式的参数列表;
 *      右侧：Lambda表达式中所需要执行的功能，即Lambda体。
 */
public class Java8Lambda01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(3);
        list.add(14);
        list.add(25);
        // 使用Lambda表达式的形式
        list.forEach(e -> System.out.print(e + ","));

        list.sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        });
    }
}
