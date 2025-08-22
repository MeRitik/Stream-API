package com.ritik.practiceSet.intermediate;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    /**
     * Given a sentence, count the frequency of each word.
     * <p>
     * args of toMap()
     * keyMapper – a mapping function to produce keys
     * valueMapper – a mapping function to produce values
     * mergeFunction – a merge function, used to resolve collisions between
     * values associated with the same key, as supplied to
     * Map.merge(Object, Object, BiFunction)
     */
    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy fox and the quick brown dog";
        Map<String, Integer> freq = Arrays.stream(sentence.split(" "))
                .collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));

        freq.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
