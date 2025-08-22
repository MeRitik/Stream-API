package com.ritik.practiceSet.intermediate;

import java.util.Arrays;
import java.util.List;

public class FindDistinctSquares {
    public static void main(String[] args) {
        int[] nums = {1, 4, 9, 8, 1, 9, 3, 4, 8, 16, 18, 16};
        Arrays.stream(nums)
                .distinct()
                .filter(n -> {
                    int root = (int) Math.sqrt(n);
                    return root * root == n;
                })
                .forEach(System.out::println);
    }
}
