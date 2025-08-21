package com.ritik.practiceSet.basics;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> duplicateNums = List.of(1, 3, 1, 3, 2, 45, 1, 3, 2, 45, 12, 19);
        duplicateNums.stream()
                .distinct()
                .sorted() // optional
                .forEach(System.out::println);

        Set<Integer> distinctNums = duplicateNums.stream()
                .collect(Collectors.toSet());

        System.out.println(distinctNums);
    }
}
