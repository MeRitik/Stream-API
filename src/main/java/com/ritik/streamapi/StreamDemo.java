package com.ritik.streamapi;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamDemo {

    /**
     * Stream is a sequence of elements that supports sequential
     * and parallel aggregate operations. It's a key part of the
     * Java Stream API, introduced in Java 8.
     *
     * <br>
     * <b>Features:</b>
     * <br>
     * 1. Lazy evaluation<br>
     * 2. Functional or Declarative programming<br>
     * 3. Parallel processing<br>
     * 4. Not a Data Structure: It doesn't store elements.
     */

    public static void main(String[] args) {
        // How to use Streams?
        // Source, Intermediate Operations, Terminal Operations

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> s = nums.stream();

        System.out.println(s.filter(n -> n % 2 == 1).count());

//        The stream is consumed after the terminal operation is called.
//        s
//                .filter(n -> n % 2 == 1)
//                .map(n -> n * n)
//                .reduce(Integer::sum)
//                .ifPresent(System.out::println);

//        2. Using Stream.of
//        Stream<List<Integer>> listStream = Stream.of(nums);

//        3. Infinite Streams
        Stream<Integer> s1 = Stream.iterate(0, n -> n + 2);
        s1.limit(10).forEach(System.out::println);

        Stream<Integer> s2 = Stream
                .generate(() -> new Random()
                .nextInt(100))
                .limit(5);

        s2.forEach(System.out::println);

    }
}
