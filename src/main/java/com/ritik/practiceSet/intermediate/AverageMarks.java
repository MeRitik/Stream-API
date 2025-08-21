package com.ritik.practiceSet.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageMarks {
    /*
     * Given a list of student marks, calculate the average.
     */

    public static void main(String[] args) {
        int[] marks = {89, 78, 68, 87, 98, 76, 97};
        Arrays.stream(marks)
                .average()
                .ifPresent(System.out::println);

        List<Integer> marks2 = List.of(89, 78, 68, 87, 98, 76, 97);
        marks2.stream()
                .mapToInt(Integer::intValue) // Converts to IntStream
                .average()
                .ifPresent(System.out::println);

        Double avg = marks2.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg);
    }
}
