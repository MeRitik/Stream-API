package com.ritik.practiceSet.intermediate;

import java.util.Comparator;
import java.util.List;

public class FindShortestString {
    public static void main(String[] args) {
        List<String> names = List.of("Ritik", "Mayank", "Ravi", "Alicia", "Bob", "Charlie", "David");
        names.stream()
                .min((a, b) -> a.length() - b.length())
                .ifPresent(System.out::println);

        names.stream()
                .max(Comparator.comparingInt(String::length).reversed())
                .ifPresent(System.out::println);

    }
}
