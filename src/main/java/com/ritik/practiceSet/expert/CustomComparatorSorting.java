package com.ritik.practiceSet.expert;

import java.util.Comparator;
import java.util.List;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}

public class CustomComparatorSorting {
    /**
     * Custom Comparator Sorting
     * Sort products by price desc, then name asc.
     */

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Laptop", 999.99),
                new Product("Phone", 599.99),
                new Product("Tablet", 299.99),
                new Product("Watch", 199.99),
                new Product("Headphones", 199.99),
                new Product("Mouse", 49.99),
                new Product("Keyboard", 79.99)
        );
                
        Comparator<Product> customComparator = Comparator.comparing(Product::getPrice).reversed()
                .thenComparing(Product::getName);

        products.stream()
                .sorted(customComparator)
                .forEach(System.out::println);
    }
}
