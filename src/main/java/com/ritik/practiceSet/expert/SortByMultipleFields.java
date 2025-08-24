package com.ritik.practiceSet.expert;

import java.util.Comparator;
import java.util.List;

enum Department {
    HR, DEV, IT // 0, 1, 2 respectively. Department.HR.ordinal() to get the values
}

class EmployeeSort {
    public String name;
    public Department dept;
    public int salary;
    
    public EmployeeSort(String name, Department dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", dept=" + dept + ", salary=" + salary + '}';
    }
    
    public Department getDept() {
        return this.dept;
    }
    
    public int getSalary() {
        return this.salary;
    }
}

public class SortByMultipleFields {
    /**
     * Sort Employees by Multiple Fields
     * First by dept, then by salary.
     */

    public static void main(String[] args) {
        List<EmployeeSort> employees = List.of(
                new EmployeeSort("Alice", Department.DEV, 190000),
                new EmployeeSort("Bob", Department.HR, 85000),
                new EmployeeSort("Charlie", Department.IT, 120000),
                new EmployeeSort("David", Department.DEV, 150000),
                new EmployeeSort("Eve", Department.HR, 95000),
                new EmployeeSort("Frank", Department.IT, 110000),
                new EmployeeSort("Grace", Department.DEV, 180000),
                new EmployeeSort("Henry", Department.IT, 130000)
        );

        List<EmployeeSort> list = employees.stream()
                .sorted(Comparator.comparing(EmployeeSort::getDept).thenComparing(EmployeeSort::getSalary))
                .toList();

        list.forEach(System.out::println);
    }
}
