package com.ritik.practiceSet.advanced;

import java.util.stream.Collectors;

public class SortCharacters {
    public static void main(String[] args) {
        String sentence = "A quick brown fox jumps over the lazy dog";
        String sortedSentenceChars = sentence.chars()
//                .filter(Character::isLetter)
//                .map(Character::toLowerCase)
                .sorted()
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        String sortedSentence = sentence.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(sortedSentenceChars);
        System.out.println(sortedSentence);

    }
}
