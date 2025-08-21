package com.ritik.practiceSet.basics;

import java.util.Arrays;
import java.util.Comparator;

public class SortNames {
    public static void main(String[] args) {
        String[] namesInRandomOrder = {"Raj", "Ravi", "Alicia", "Bob", "Charlie", "David"};
        Arrays.stream(namesInRandomOrder)
//                .sorted(Comparator.comparing(String::length))
                .sorted()
                .forEach(System.out::println);
    }
}
