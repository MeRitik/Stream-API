package com.ritik.practiceSet.advanced;

enum Department {
    HR, IT, QA, DEV
}

enum Gender {
    MALE, FEMALE
}

public class Employee {
    private String name;
    private Department department;
    private int salary;
    private Gender gender = Gender.MALE;

    Employee(String name, Department department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    Employee(String name, Department department, int salary, Gender gender) {
        this(name, department, salary);
        this.gender = gender;
    }

    Employee(String name, Department department) {
        this(name, department, 0);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public Department getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public Gender getGender() {
        return this.gender;
    }
}