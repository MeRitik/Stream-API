package com.ritik.functionalInterfaces;

public class Demo {
    // Java 8 introduced Lambda Expressions, Streams, Date & Time API

    public static void main(String[] args) {
        MathOperation addition = (a, b, c) -> a + b + c;
        System.out.println(addition.operation(1, 2, 4));
    }
}

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b, int c);
}