package com.ritik.practiceSet.advanced;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentElement {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 4, 4, 5, 1, 1, 1, 4, 5, 4, 4);

        Integer maxElement = nums.stream()
                .collect(Collectors.toMap(n -> n, n -> 1, Integer::sum))
                .entrySet()
                .stream()
//                .max((a, b) -> a.getValue() - b.getValue())
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .get()
                .getKey();

        Integer maxElement2 = nums.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(maxElement);
        System.out.println(maxElement2);
    }
}
