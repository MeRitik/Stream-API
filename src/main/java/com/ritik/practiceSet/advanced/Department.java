package com.ritik.practiceSet.advanced;

enum Department {
    HR, IT, QA, DEV
}

class Employee {
    private String name;
    private Department department;
    private int salary;

    Employee(String name, Department department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
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
}