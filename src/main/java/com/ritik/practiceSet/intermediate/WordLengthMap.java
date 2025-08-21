package com.ritik.practiceSet.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLengthMap {
    /*
     * Convert a list of words into a Map<word, length>
     */

    public static void main(String[] args) {
        String[] randomWords = {"Future", "Book", "Apple", "Pencil", "Smile", "Moon", "Cake", "Dance", "Hello", "Star"};

        Map<Integer, List<String>> wordsByLength = Arrays.stream(randomWords)
                .collect(Collectors.groupingBy(String::length, Collectors.toList()));

        wordsByLength.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
