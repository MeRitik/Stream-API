package com.ritik.practiceSet.basics;

import java.util.Arrays;

public class UppercaseStrings {

    public static void main(String[] args) {
        String[] names = {"Alicia", "Bob", "Charlie", "David"};
        String[] array = Arrays.stream(names)
                .map(String::toUpperCase)
                .toArray(String[]::new);

        for (String s : array) {
            System.out.println(s);
        }
    }
}
