package com.ritik.practiceSet.intermediate;

import java.util.Arrays;
import java.util.Comparator;

public class SortByLength {
    public static void main(String[] args) {
        String[] names = {"Ritik", "Ravi", "Alicia", "Bob", "Charlie", "David"};
        Arrays.stream(names)
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
