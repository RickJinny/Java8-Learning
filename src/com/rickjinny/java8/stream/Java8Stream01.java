package com.rickjinny.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Stream01 {

    private static List<Student> createStudentList() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "第1号学生", 28, "男"));
        list.add(new Student(2, "第2号学生", 19, "女"));
        list.add(new Student(3, "第3号学生", 30, "女"));
        list.add(new Student(4, "第4号学生", 25, "男"));
        list.add(new Student(5, "第5号学生", 22, "女"));
        list.add(new Student(6, "第6号学生", 18, "男"));
        list.add(new Student(7, "第7号学生", 30, "女"));
        list.add(new Student(8, "第8号学生", 26, "女"));
        list.add(new Student(9, "第9号学生", 20, "男"));
        list.add(new Student(10, "第10号学生", 19, "女"));
        return list;
    }

    public static void main(String[] args) {

        // 创建一个学生集合
        List<Student> list = createStudentList();


        /**
         * 1、过滤 age >= 25 的学生
         */
        List<Student> list1 = list.stream()
                                    .filter(student -> student.getAge() >= 25)
                                    .collect(Collectors.toList());
        System.out.println("1、过滤 age >= 25 的学生: " + list1.toString());


        /**
         * 2、按照年龄排序
         */
        List<Student> list2 = list.stream()
                                    .sorted(Comparator.comparingInt(Student::getAge))
                                    .collect(Collectors.toList());
        System.out.println("2、按照年龄排序: " + list2.toString());


        /**
         * 3、返回前 n 个元素
         */
        List<Student> list3 = list.stream()
                                    .limit(3)
                                    .collect(Collectors.toList());
        System.out.println("3、返回前3个元素: " + list3.toString());


        /**
         * 4、去除前 n 个元素
         */
        List<Student> list4 = list.stream()
                                    .skip(8)
                                    .collect(Collectors.toList());
        System.out.println("4、去除前 8 个元素: " + list4.toString());


        /**
         * 5、limit(m).skip(n): 先返回前 m 个元素, 再在前返回的前 m 个元素中，去除 n 个再返回
         */
        List<Student> list5 = list.stream()
                                    .limit(2)
                                    .skip(1)
                                    .collect(Collectors.toList());
        System.out.println("5、limit(m).skip(n): " + list5.toString());


        /**
         * 6、skip(m).limit(n): 先去除前 m 个元素，再返回剩余元素的前 n 个元素
         */
        List<Student> list6 = list.stream()
                                    .skip(1)
                                    .limit(2)
                                    .collect(Collectors.toList());
        System.out.println("6、skip(m).limit(n): " + list6.toString());


        /**
         * 7、map(T -> R): 将流中的每一个元素 T 映射为 R (类似类型转换)
         */
        List<String> list7 = list.stream()
                                    .map(Student::getName)
                                    .collect(Collectors.toList());
        System.out.println("7、将流中的每一个元素 T 映射为 R (类似类型转换): " + list7.toString());

    }
}
