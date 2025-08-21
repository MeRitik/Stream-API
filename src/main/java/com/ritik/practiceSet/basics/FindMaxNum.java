package com.ritik.practiceSet.basics;

import java.util.List;
import java.util.Optional;

public class FindMaxNum {
    public static void main(String[] args) {
        List<Integer> randomNums = List.of(234, 2341, 12, 1, 21, 2, 123);
        Optional<Integer> max = randomNums.stream()
                .max((a, b) -> a - b);

        max.ifPresent(System.out::println);
    }
}
