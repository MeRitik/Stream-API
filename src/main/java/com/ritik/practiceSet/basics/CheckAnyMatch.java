package com.ritik.practiceSet.basics;

import java.util.Arrays;

public class CheckAnyMatch {
    public static void main(String[] args) {
        String[] randomNames = {"Ravi", "Ritik", "Alicia", "Bob", "Charlie", "David"};

        boolean a = Arrays.stream(randomNames)
                .anyMatch(s -> s.startsWith("A"));

        System.out.println(a);
    }
}
