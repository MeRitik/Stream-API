package com.ritik.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collectors are used to collect the results of a stream into
        // a data structure. It is a factory class for creating various
        // collectors. It is a utility class.

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        String joinedNames = names.stream()
                .collect(Collectors.joining(", ", "Names: ", "."));

//        String joinedNames = String.join("", names);

        System.out.println(joinedNames);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Integer, List<Integer>> collect = nums.stream()
                .collect(Collectors.groupingBy(n -> n % 3));

        collect.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

        nums.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0))
                .forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

        IntSummaryStatistics collect1 = nums.stream()
                .collect(Collectors.summarizingInt(n -> n));
        System.out.println(collect1);

        Double collect2 = nums.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(collect2);

        // Group by length of words
        Map<Integer, List<String>> collect3 = names.stream()
                .collect(Collectors.groupingBy(String::length));
        collect3.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

        // Group Anagrams
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = new ArrayList<>();
        Arrays.stream(words)
                .collect(Collectors.groupingBy(CollectorsDemo::getFreq))
                .forEach((k, v) -> res.add(v));

        List<String> collect4 = Arrays.stream(words)
                .collect(Collectors.mapping(String::toUpperCase, Collectors.toList()));
        System.out.println(collect4);

    }

    static String getFreq(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return Arrays.toString(freq);
    }

}

