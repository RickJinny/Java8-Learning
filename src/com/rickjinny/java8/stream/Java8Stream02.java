package com.rickjinny.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Stream02 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "BB", "CC", "DD");
        Stream<String> stream1 = list.stream();
    }
}
