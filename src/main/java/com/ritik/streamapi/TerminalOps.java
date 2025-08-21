package com.ritik.streamapi;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class TerminalOps {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. collect
        Set<Integer> st = nums.stream().sorted().limit(5).collect(Collectors.toSet());
        List<Integer> list = nums.stream().skip(5).toList(); // Unmodifiable

        // 2. forEach
//        nums.stream().filter(n -> n % 3 == 0).forEach(System.out::println);

        // 3. reduce
//        nums.stream().reduce(Integer::sum).ifPresent(System.out::println); // Optional

        // 4. count

        // 5. anyMatch, allMatch, noneMatch
//        boolean ex = nums.stream().anyMatch(n -> n > 10);
//        System.out.println(ex);

        // 6. findFirst, findAny(Better in Parallel) - Both returns an Optional
        nums.stream().filter(n -> n > 4).findFirst().ifPresent(System.out::println);
        System.out.println("-------------------------------------------------------");
        nums.stream().filter(n -> n > 7).findAny().ifPresent(System.out::println);

        List<String> names = List.of("Ritik", "Raj", "Ravi");
        names.stream()
                .filter(n -> n.length() > 3)
                .forEach(System.out::println);

        // max, min returns OptionalInt

        // Counting occurrence of a character
        String s = "Hello World!";
        long count = s.chars().filter(ch -> ch == 'e').count();

        // s.chars() returns a IntStream
        System.out.println(count);

        /*
         * A **stateless operation** does **not** require knowledge of the stream's previous or subsequent elements. Each element is processed independently, and results do not depend on others.
         * **Examples of stateless operations:**
         * - `filter(Predicate)`
         * - `map(Function)`
         * - `flatMap(Function)`
         * - `peek(Consumer)`
         *
         *
         *
         * A **stateful operation** requires knowledge of the entire stream, or a significant portion, before it can produce a result for any element. It has to examine and sometimes store elements to produce its output.
            **Examples of stateful operations:**
            - `sorted()`
            - `distinct()`
            - `limit(long n)`
            - `skip(long n)`

        */

        List<Integer> nums1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        nums1.parallelStream()
                .forEachOrdered(System.out::println);
//                .forEach(System.out::println);
    }
}
