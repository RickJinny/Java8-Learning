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
        System.out.println("3、listB 与 listA 的差集: ");
        list3.parallelStream().forEach(System.out::println);

        /**
         * 第四、两个 List 集合的并集
         */
        List<String> list4 = listA.parallelStream().collect(Collectors.toList());
        List<String> list5 = listB.parallelStream().collect(Collectors.toList());
        list4.addAll(list5);
        System.out.println("4、listA 与 listB 的并集");
        list4.parallelStream().forEachOrdered(System.out::println);

        /**
         * 第五、两个 List 集合去重并集
         */
        List<String> list6 = list4.stream().distinct().collect(Collectors.toList());
        System.out.println("5、得到去重并集 list6");
        list6.parallelStream().forEachOrdered(System.out::println);

        /**
         * 第六、原来的两个集合：listA 和 listB
         */
        System.out.println("原来的listA: ");
        listA.parallelStream().forEachOrdered(System.out::println);
        System.out.println("原来的listB: ");
        listB.parallelStream().forEachOrdered(System.out::println);
    }
}
