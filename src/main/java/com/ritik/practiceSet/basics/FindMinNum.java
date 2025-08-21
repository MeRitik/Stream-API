package com.ritik.practiceSet.basics;

import java.util.List;
import java.util.Optional;

public class FindMinNum {
    public static void main(String[] args) {
        List<Integer> randomNums = List.of(234, 231, 12, 1, 21, 2, 123);
        Optional<Integer> min = randomNums.stream()
                .min((a, b) -> a - b);

        Optional<Integer> min2 = randomNums.stream()
                .max((a, b) -> b - a);

        min.ifPresent(System.out::println);
        min2.ifPresent(System.out::println);
    }
}
