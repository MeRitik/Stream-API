package com.ritik.practiceSet.expert;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class PrimeNumberFilter {
    /**
     * <b>Prime Numbers Filter</b>
     * <br>
     * Given a range of numbers, return primes only.
     */
    public static void main(String[] args) {
//        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        Random random = new Random();
        List<Integer> nums = Stream.generate(() -> random.nextInt(2, 10000000)).limit(1000000).toList();

        long startTime = System.nanoTime();
        nums.stream()
                .filter(PrimeNumberFilter::isPrime)
                .toList();
        long endTime = System.nanoTime() - startTime;
        System.out.println("Time taken using Stream: " + endTime / 1E6 + " ms");

        startTime = System.nanoTime();
        nums.parallelStream()
                .filter(PrimeNumberFilter::isPrime)
                .toList();
        endTime = System.nanoTime() - startTime;
        System.out.println("Time taken using Parallel Stream: " + endTime / 1E6 + " ms");

    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
