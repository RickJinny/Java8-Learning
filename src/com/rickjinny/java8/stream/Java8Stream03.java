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
        listA.add("44");
        listA.add("55");
        listA.add("77");
        listA.add("88");
        listA.add("99");

        /**
         * 两个 List 集合的交集: listA 与 listB 的交集
         */
        List<String> list1 = listA.stream().filter(item -> listB.contains(item)).collect(Collectors.toList());
        System.out.println("1、listA 与 listB 的交集");
        list1.parallelStream().forEach(System.out::print);



    }
}
