package com.ritik.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {

    /***
     * Represents a <b>predicate</b> (boolean-valued function) of one argument.
     * This is a functional interface whose functional method is test(Object).
     */

    public static void main(String[] args) {
        Predicate<Integer> p = (n) -> n > 10;
        Predicate<Integer> q = (n) -> n < 20;
//        System.out.println(p.test(101));

        System.out.println(p.and(q).test(15));
    }

}
