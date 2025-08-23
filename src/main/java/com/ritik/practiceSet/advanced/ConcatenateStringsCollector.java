package com.ritik.practiceSet.advanced;

import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStringsCollector {
    public static void main(String[] args) {
        List<String> names = List.of("Ritik", "Mayank", "Ravi", "Alicia", "Bob", "Charlie", "David");

        String joinedNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining());

        System.out.println(joinedNames);
    }
}
