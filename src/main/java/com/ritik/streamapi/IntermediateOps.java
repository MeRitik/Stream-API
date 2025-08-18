package com.ritik.streamapi;

import java.util.Arrays;
import java.util.List;

public class IntermediateOps {

    public static void main(String[] args) {
        // Intermediate Operations transform a stream into another stream.
        // It is lazy, meaning they don't execute until a terminal operation is called.

        List<String> nameSequence = List.of(
                "Iyer.",
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
         * 2. map
         * 3. filter
         * 4. sorted
         * 5. skip
         * 6. limit
         * 7. distinct
         */

    }
}
