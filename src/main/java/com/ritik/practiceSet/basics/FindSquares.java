package com.ritik.practiceSet.basics;

import java.util.List;
import java.util.stream.Stream;

public class FindSquares {
    public static void main(String[] args) {
        List<Integer> nums = Stream.iterate(1, n -> n + 1)
                .limit(25)
                .toList();

        List<Integer> squares = nums.stream()
                .map(n -> n * n)
                .toList();

        squares.forEach(System.out::println);
    }
}
