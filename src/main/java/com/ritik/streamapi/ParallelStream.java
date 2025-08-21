package com.ritik.streamapi;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        // A type of stream that enables parallel processing of elements
        // allowing multiple threads to process parts of the stream simultaneously

        // This can improve the performance for large datasets significantly as
        // the workload is distributed across multiple threads.
//        long startTime = System.currentTimeMillis();
//        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
//        List<Long> facts = list.stream().map(ParallelStream::factorial).toList();
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("Time taken: " + (endTime - startTime) + " ms");

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> facts = list.parallelStream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken (using Parallel Streams_: " + (endTime - startTime) + " ms");

        // Parallel Streams are most effective for CPU-intensive or
        // large datasets where tasks are independent
        // They may add overhead for simple tasks or small datasets.

        System.out.println("------------------------------------------------");

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        AtomicInteger sum = new AtomicInteger(0);
        nums.parallelStream().map(sum::addAndGet).sequential().forEach(System.out::println);

    }


    private static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
