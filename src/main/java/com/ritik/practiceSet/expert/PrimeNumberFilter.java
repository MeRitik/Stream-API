package com.ritik.practiceSet.expert;

import java.util.List;

public class PrimeNumberFilter {
    /**
     * <b>Prime Numbers Filter</b>
     * <br>
     * Given a range of numbers, return primes only.
     */
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        nums.stream()
                .filter(PrimeNumberFilter::isPrime)
                .forEach(System.out::println);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
