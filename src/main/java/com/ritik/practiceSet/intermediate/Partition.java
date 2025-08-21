package com.ritik.practiceSet.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition {
    /**
     * Partition Odd and Even – Partition integers into odd and even lists.
     * <p>
     * boxed(): Returns a Stream consisting of the elements of this stream,
     * each boxed to an Integer.
     */

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Partition by true or false
        Map<Boolean, List<Integer>> partition = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        partition.forEach((k, v) -> System.out.println(k + ": " + v));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0))
                .forEach((k, v) -> System.out.println(k + ": " + v));

        // Partition by remainder
        Map<Integer, List<Integer>> collect = list.stream()
                .collect(Collectors.groupingBy(n -> n % 2));
        collect.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
