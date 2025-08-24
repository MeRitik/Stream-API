package com.ritik.practiceSet.expert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {

        List<String> strs = List.of("eat", "tea", "tan", "ate", "nat", "bat");

        strs.stream()
//                .collect(Collectors.groupingBy(GroupAnagrams::getFreq))
                .collect(Collectors.groupingBy(GroupAnagrams::getFreq2))
                .forEach((k, v) -> System.out.println(v));
    }

    static String getFreq(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return Arrays.toString(freq);
    }

    static String getFreq2(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}
