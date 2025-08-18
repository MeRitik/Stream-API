package com.ritik.functionalInterfaces;

import java.util.List;

public class MethodReferenceDemo {
    // Method Reference: Use method without invoking & in place of lambda
    // expression (::)
    public static void main(String[] args) {
        List<String> students = List.of("Ritik", "Raj", "Ravi");
        students.forEach(System.out::println);

        // Constructor Reference
        List<String> names = List.of("A", "B", "C");
        List<MobilePhone> list = names.stream().map(MobilePhone::new).toList();
        list.forEach(MobilePhone::print);

        List<String> list1 = list.stream().map(MobilePhone::getName).toList();
        System.out.println("----------------------------");
        list1.forEach(System.out::println);
    }
}


class MobilePhone {
    String name;

    MobilePhone(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("MobilePhone{" + "name=" + name + '}');
    }

    public String getName() {
        return "Phone: " + name;
    }
}