package com.ritik.practiceSet.intermediate;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinStrings {
    public static void main(String[] args) {
        String[] names = {"Ritik", "Ravi", "Alicia", "Bob", "Charlie", "David"};
        String joined = String.join(", ", names);
        System.out.println(joined);

        String string = Arrays.stream(names)
                .collect(Collectors.joining(", ", "Names: [", "]"));

        System.out.println(string);
    }
}
