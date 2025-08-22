package com.ritik.practiceSet.advanced;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighestPaidEmployeePerDept {

    /**
     * Find Highest Paid Employee per Dept – Use Collectors.groupingBy + maxBy.
     */
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", Department.HR, 10000),
                new Employee("Bob", Department.IT, 20000),
                new Employee("Charlie", Department.DEV, 30000),
                new Employee("Diana", Department.HR, 40000),
                new Employee("Eve", Department.IT, 50000),
                new Employee("Frank", Department.DEV, 60000),
                new Employee("Grace", Department.HR, 70000),
                new Employee("Henry", Department.IT, 80000),
                new Employee("Ivy", Department.DEV, 90000),
                new Employee("Jack", Department.HR, 100000)
        );

        Map<Department, Optional<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));

        collect.forEach((k, v) -> System.out.println(k + ": " + v.get()));
    }
}
