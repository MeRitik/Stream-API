package com.ritik.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        Stream<String> stream = names.stream()
                .filter(n -> n.length() > 3);

        System.out.println("Before terminal operations");
        List<String> result = stream.toList();
        System.out.println("After terminal operation");
        System.out.println(result);
    }
}
