package com.rickjinny.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 两个 List 集合，使用 Java8 的 Stream 流：
 * 交、差、并、去重
 */
public class Java8Stream03 {

    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("11");
        listA.add("22");
        listA.add("33");
        listA.add("44");
        listA.add("55");
        listA.add("66");

        List<String> listB = new ArrayList<>();
        listB.add("44");
        listB.add("55");
        listB.add("77");
        listB.add("88");
        listB.add("99");

        /**
         * 第一、两个 List 集合的交集: listA 与 listB 的交集
         */
        List<String> list1 = listA.stream().filter(item -> listB.contains(item)).collect(Collectors.toList());
        System.out.println("1、listA 与 listB 的交集: ");
        list1.parallelStream().forEach(System.out::println);

        /**
         * 第二、两个 List 集合的差集: listA - listB
         */
        List<String> list2 = listA.stream().filter(item -> !listB.contains(item)).collect(Collectors.toList());
        System.out.println("2、listA 与 listB 的差集: ");
        list2.parallelStream().forEach(System.out::println);

        /**
         * 第三、两个 List 集合的差集: listB - listA
         */
        List<String> list3 = listB.stream().filter(item -> !listA.contains(item)).collect(Collectors.toList());
        System.out.println("2、listB 与 listA 的差集: ");
        list3.parallelStream().forEach(System.out::println);

        /**
         * 第四、两个 List 集合的并集
         */

    }
}
