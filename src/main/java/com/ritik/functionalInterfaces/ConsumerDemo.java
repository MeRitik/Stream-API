package com.ritik.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerDemo {
    /**
     * Represents an operation that accepts a single input argument and returns no
     * result. Unlike most other functional interfaces, {@code Consumer} is expected
     * to operate via side-effects.
     *
     * <p>This is a <a href="package-summary.html">functional interface</a>
     * whose functional method is {@link #accept(Object)}.
     *
     * @param <T> the type of the input to the operation
     *
     * @since 1.8
     */
    public static void main(String[] args) {
        Consumer<Integer> c = System.out::println;
        c.accept(10);
    }

}
