package com.ritik.practiceSet.intermediate;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Top3LargestNums {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = Stream.generate(() -> random.nextInt(1, 100))
                .limit(25)
                .toList();

        System.out.println(list);

        list.stream()
                .sorted((a, b) -> b - a)
                .limit(3)
                .forEach(System.out::println);
    }
}
