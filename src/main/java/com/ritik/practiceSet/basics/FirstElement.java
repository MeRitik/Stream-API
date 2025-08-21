package com.ritik.practiceSet.basics;

import java.util.List;

public class FirstElement {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1729, 12, 523);
        nums.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }

}
