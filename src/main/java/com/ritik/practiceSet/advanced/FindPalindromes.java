package com.ritik.practiceSet.advanced;

import java.util.Arrays;

public class FindPalindromes {
    /**
     * Find Palindromes – From a list of strings, return palindromes only.
     */

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"level", "hello", "deed", "world", "radar", "java", "madam", "code"};

        Arrays.stream(words)
//                .filter(s -> s.contentEquals(new StringBuilder(s).reverse()))
//                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
//                .filter(s -> new StringBuilder(s).reverse().compareTo(new StringBuilder(s)) == 0)
                .filter(FindPalindromes::isPalindrome)
                .forEach(System.out::println);
    }
}
