package com.rickjinny.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Java8Stream04 {

    public static void main(String[] args) {
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



        /**
         * 1、把学生的年龄都变为20
         */
        // 原来是 for 缓存遍历
        for (Student student : list) {
            student.setAge(20);
        }
        // 使用 Java8 的 forEach
        list.forEach(s -> s.setAge(20));

        /**
         * 2、把女学生的年龄改为20
         */
        list.stream()
                .filter(s -> s.getSex().equals("女"))
                .forEach(s -> s.setAge(20));
    }
}
