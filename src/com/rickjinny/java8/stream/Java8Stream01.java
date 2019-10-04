package com.rickjinny.java8.stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Java8Stream01 {

    public static void main(String[] args) {
        /**
         * 1、创建Stream方法1：通过of()方法
         */
        Stream<Integer> stream1 = Stream.of(9, 8, 7, 6, 5, 4, 3, 2, 1);
        Stream<String> stream2 = Stream.of("aa", "bb", "c");

        /**
         * 2、创建Stream方法2：通过generator()方法。
         * 此方法是生成一个无限长度的Stream, 通过Supplier来生成
         */
        Stream<Double> stream3 = Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        });
        // 使用lambda表达式，来简化一下
        Stream<Double> stream4 = Stream.generate(() -> Math.random());
        // 再简化一下
        Stream<Double> stream5 = Stream.generate(Math::random);

        /**
         * 3、创建Stream方法3：通过iterate()方法
         */
        Stream.iterate(1, item -> item + 1)
                .limit(10)
                .forEach(System.out::println);
        



    }
}
