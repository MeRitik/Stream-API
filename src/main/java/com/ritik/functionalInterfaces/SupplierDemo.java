package com.ritik.functionalInterfaces;

import java.util.function.*;

public class SupplierDemo {

    // BiPredicate, BiConsumer, BiFunction

    public static void main(String[] args) {
        Supplier<String> s = () -> "Hello World!";
        System.out.println(s.get());

        BiConsumer<String, Integer> b = (str, num) -> System.out.println(str + " " + num);
        b.accept(s.get(), 10);

        BiPredicate<String, Integer> p = (str, num) -> str.length() > num;
        System.out.println(p.test(s.get(), 10));

        BiFunction<String, Integer, String> f = (str, num) -> str.substring(0, num);
        System.out.println(f.apply(s.get(), 5));

        UnaryOperator<String> u = String::toUpperCase;
        System.out.println(u.apply(s.get()));

        BinaryOperator<Integer> bop = Integer::sum;
        System.out.println(bop.apply(10, 20));
    }
}
