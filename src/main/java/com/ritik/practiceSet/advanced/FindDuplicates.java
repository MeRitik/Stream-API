package com.ritik.practiceSet.advanced;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 3, 2, 6, 6, 5, 11, 4, 2, 2, 3, 4, 1, 4, 3, 2, 1, 4);

        // O(n^2)
        List<Integer> duplicateNumbers = nums.stream()
                .filter(n -> Collections.frequency(nums, n) > 1)
                .distinct()
                .toList();

        System.out.println(duplicateNumbers);

        // O(n)
        nums.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

    }
}
