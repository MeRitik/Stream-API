package com.ritik.practiceSet.advanced;

import java.util.List;
import java.util.stream.Stream;

public class FindNthHighestNum {
    public static void main(String[] args) {
        List<Integer> nums = Stream.iterate(1, n -> 1 + n).limit(25).toList();
        int n = 5;
        nums.stream()
                .sorted()
                .skip(nums.size() - n)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
