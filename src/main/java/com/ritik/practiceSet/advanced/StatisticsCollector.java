package com.ritik.practiceSet.advanced;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StatisticsCollector {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics intSummaryStatistics = nums.stream()
                .mapToInt(n -> n)
//                .mapToInt(Integer::intValue)
//                .mapToInt(Integer::valueOf)
                .summaryStatistics();

        IntSummaryStatistics stats = nums.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));


        System.out.println(intSummaryStatistics);
        System.out.println(stats);
    }
}
