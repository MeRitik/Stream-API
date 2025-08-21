package com.ritik.practiceSet.basics;

import java.util.List;
import java.util.stream.Stream;

public class FilterEvenNums {
    public static void main(String[] args) {
        List<Integer> integers = Stream.iterate(1, n -> n + 1).limit(25).toList();

        // Filter Even Nums
        List<Integer> evenNums = integers.stream().filter(n -> n % 2 == 0).toList();
        evenNums.forEach(System.out::println);
    }
}
