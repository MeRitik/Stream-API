package com.ritik.practiceSet.basics;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class CountElements {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> nums = Stream.generate(() -> random.nextInt(1, 10))
                .limit(25)
                .toList();

        long count = nums.stream().count();
        long distinctCount = nums.stream().distinct().count();

        System.out.println(nums);
        System.out.println(count);
        System.out.println(distinctCount);
    }
}
