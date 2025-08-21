package com.ritik.practiceSet.intermediate;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class SumOfIntegers {
    /*
     * Find the sum of a list of integers using reduce.
     */

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> sum = nums.stream().reduce((a, b) -> a + b);
        Optional<Integer> sum2 = nums.stream().reduce(Integer::sum);

        sum.ifPresent(System.out::println);
        sum2.ifPresent(System.out::println);

//        Arrays.stream(int[]) returns an IntStream
        int[] aNums = {12, 23, 134};
        int sum1 = Arrays.stream(aNums)
                .sum();

        System.out.println(sum1);

        IntSummaryStatistics intSummaryStatistics = Arrays.stream(aNums)
                .summaryStatistics();

        System.out.println(intSummaryStatistics);
    }
}
