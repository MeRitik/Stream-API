package com.ritik.streamapi;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x * 2;
        Function<Integer, Integer> g = x -> x + 1;
        System.out.println(f.apply(5));
        System.out.println(f.andThen(f).andThen(f).andThen(f).apply(5));
        System.out.println(f.compose(g).compose(g).compose(f).apply(5));

        System.out.println(Function.identity().apply(5)); // Returns 5
    }
}
