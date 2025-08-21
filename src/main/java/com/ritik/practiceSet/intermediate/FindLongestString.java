package com.ritik.practiceSet.intermediate;

import java.util.Comparator;
import java.util.List;

public class FindLongestString {
    public static void main(String[] args) {
        List<String> names = List.of("Ritik", "Ravi", "Alicia", "Bob", "Charlie", "David");
        names.stream()
                .max((a, b) -> a.length() - b.length())
                .ifPresent(System.out::println);

        names.stream()
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

    }
}
