package com.ritik.practiceSet.intermediate;

import java.util.Arrays;

public class CheckAllMatch {
    /*
     * Check All Match – Check if all strings in a list contain only lowercase letters.
     */

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Earl", "Frank", "George"};
        String[] lowerNames = {"alice", "bob", "charlie", "david"};
        boolean allLowerCaseNames = Arrays.stream(names)
                .allMatch(s -> s.matches("[a-z]+"));

        boolean allLower = Arrays.stream(lowerNames)
                .allMatch(s -> s.matches("[a-z]+"));

        boolean b = Arrays.stream(lowerNames)
                .allMatch(s -> s.equals(s.toLowerCase()));

        boolean b1 = Arrays.stream(lowerNames)
                .allMatch(s -> s.chars().allMatch(Character::isLowerCase));

        System.out.println(allLowerCaseNames);
        System.out.println(allLower);
        System.out.println(b);
        System.out.println(b1);
    }
}
