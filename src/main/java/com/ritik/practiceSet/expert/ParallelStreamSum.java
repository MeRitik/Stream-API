package com.ritik.practiceSet.expert;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelStreamSum {

    /**
     * Parallel version usually runs faster for large lists, but not always:
     *
     * <br>
     * <li> For small datasets, parallel overhead may make it slower.</li>
     * <li> On multi-core CPUs with big data (like 1M ints), parallel usually wins.</li>
     */
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> nums = Stream.generate(() -> random.nextInt(1, 100)).limit(100000000).toList();

        long startTime = System.nanoTime();
        Optional<Integer> totalSum = nums.stream().reduce(Integer::sum);
        long endTime = System.nanoTime();

        System.out.println("Total sum: " + totalSum.get()); // Total sum: 705098042
        System.out.println("Time taken: " + (endTime - startTime) / 1E6 + " ms"); // Time taken: 1390.2043 ms

        startTime = System.nanoTime();
        Integer totalSum2 = nums.parallelStream().reduce(0, Integer::sum);
        endTime = System.nanoTime();

        System.out.println("Total sum: " + totalSum2); // Total sum: 705098042
        System.out.println("Time taken: " + (endTime - startTime) / 1E6 + " ms"); // Time taken: 384.5223 ms


    }
}
