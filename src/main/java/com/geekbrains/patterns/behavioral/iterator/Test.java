package com.geekbrains.patterns.behavioral.iterator;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {

        CustomList<Integer> list = new CustomList<>(1, 2, 3);

        for (int o : list) {
            System.out.println(o);
        }

        list.forEach(System.out::println);
    }
}
