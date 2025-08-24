package com.ritik.practiceSet.expert;

public class Employee {
    public String name;
    public int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + '}';
    }

    public int getAge() {
        return this.age;
    }
}
