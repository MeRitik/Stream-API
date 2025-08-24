package com.ritik.practiceSet.expert;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class KMostFrequentWords {
    /**
     * <b>K Most Frequent Words</b>
     * <br>
     * Find top k most frequent words from a paragraph.
     */

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry", "date", "banana", "elderberry", "fig", "apple", "grape",
                "banana", "honeydew", "cherry", "apple", "date", "elderberry", "fig", "grape", "banana", "apple"};

        int k = 3;

        Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
//                .sorted((a, b) -> a.getValue().compareTo(b.getValue()))
//                .sorted(Comparator.comparing(Map.Entry::getValue))
                .sorted(Map.Entry.comparingByValue())
                .limit(k)
                .forEach(System.out::println);
    }
}
