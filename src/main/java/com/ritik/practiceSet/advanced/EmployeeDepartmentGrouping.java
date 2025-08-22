package com.ritik.practiceSet.advanced;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDepartmentGrouping {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", Department.QA),
                new Employee("Bob", Department.IT),
                new Employee("Charlie", Department.DEV),
                new Employee("Diana", Department.HR),
                new Employee("Eve", Department.QA),
                new Employee("Frank", Department.DEV),
                new Employee("Grace", Department.IT),
                new Employee("Henry", Department.HR)
        );

        Map<Department, List<Employee>> groupedEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedEmployees.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
