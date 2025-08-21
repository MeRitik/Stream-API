package com.ritik.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {

    public static void main(String[] args) {
        // Intermediate Operations transform a stream into another stream.
        // It is lazy, meaning they don't execute until a terminal operation is called.

        List<String> nameSequence = List.of(
                "Iyer. ",
                "Venu Gopal Iyer.",
                "Muthu Swami Venu Gopal Iyer.",
                "Muthu Swami Venu Gopal Iyer.",
                "Chinna Swami Muthu Swami Venu Gopal Iyer.",
                "Coimbatore Chinna Swami Muthu Swami Venu Gopal Iyer.",
                "Ekaparam Pilaparam Chinna Swami Muthu Swami Venu Gopal Iyer.",
                "Trichipalli Ekaparam Pilaparam Chinna Swami Muthu Swami Venu Gopal Iyer.",
                "Srinivasan Trichipalli Ekaparam Pilaparam Chinna Swami Muthu Swami Venu Gopal Iyer.",
                "Rajshekar Srinivasan Trichipalli Ekaparam Pilaparam Chinna Swami Muthu Swami Venu Gopal Iyer.",
                "Shivavenkata Rajshekar Srinivasan Trichipalli Ekaparam Pilaparam Chinna Swami Muthu Swami Venu Gopal Iyer."
        );

//        nameSequence.stream().filter(n -> n.startsWith("M")).forEach(System.out::println);
//        System.out.println("----------------------------");
//        nameSequence.stream().map(String::toUpperCase).forEach(System.out::println);
//        System.out.println("----------------------------");
//        System.out.println(nameSequence.stream().count());
//        System.out.println(nameSequence.stream().distinct().count());
//        System.out.println("----------------------------");
//        nameSequence.stream().sorted().forEach(System.out::println);
//        System.out.println("----------------------------");


//        nameSequence.stream().skip(5).forEach(System.out::println);

        /*
         * 1. peek
         * 2. map
         * 3. filter
         * 4. sorted
         * 5. skip
         * 6. limit
         * 7. distinct
         * 8. flatMap
         */

        /*
         * peek() vs forEach() in Java Stream:
         *
         * peek():
         * - Intermediate operation that returns a stream
         * - Used for debugging/logging during stream processing
         * - Lazy evaluation (executes only when terminal operation is called)
         * - Cannot modify stream elements (should be used for side effects only)
         *
         * forEach():
         * - Terminal operation that returns void
         * - Ends the stream pipeline
         * - Eager evaluation (executes immediately)
         * - Can modify elements (though not recommended)
         */

//        nameSequence.stream()
//                .map(s -> s.substring(0, s.indexOf(" ")))
//                .peek(String::toUpperCase) // Used for debugging/logging during stream processing
//                .forEach(System.out::println);

        Object[] s1 = nameSequence.stream()
                .map(s -> s.substring(0, s.indexOf(" ")))
                .toArray();

        System.out.println(Arrays.toString(s1));
//        peek.forEach(System.out::println);
//        .map(String::toUpperCase).filter(n -> n.startsWith("M")).sorted().skip(5).limit(3).distinct().forEach(System.out::println);

        List<List<String>> names = List.of(List.of("A", "B", "C"), List.of("D", "E", "F"));
        names.stream().flatMap(List::stream).forEach(System.out::print);

        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java Streams were introduced in Java 8",
                "flatMap is useful"
        );

        sentences.stream()
                .flatMap(s -> Stream.of(s.split(" ")))
//                .flatMap(s -> Arrays.stream(s.split(" "))) // Alternative
                .forEach(System.out::println);

    }
}
