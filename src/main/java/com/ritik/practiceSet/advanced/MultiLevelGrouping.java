package com.ritik.practiceSet.advanced;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultiLevelGrouping {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", Department.HR, 10000, Gender.FEMALE),
                new Employee("Bob", Department.IT, 20000, Gender.MALE),
                new Employee("Charlie", Department.DEV, 30000, Gender.MALE),
                new Employee("Diana", Department.HR, 40000, Gender.FEMALE),
                new Employee("Eve", Department.IT, 50000, Gender.FEMALE),
                new Employee("Frank", Department.DEV, 60000, Gender.MALE),
                new Employee("Grace", Department.HR, 70000, Gender.FEMALE),
                new Employee("Henry", Department.IT, 80000, Gender.MALE),
                new Employee("Ivy", Department.DEV, 90000, Gender.FEMALE),
                new Employee("Jack", Department.HR, 100000, Gender.MALE)
        );

        Map<Department, Map<Gender, List<Employee>>> groupByDeptGender = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender)));

        groupByDeptGender.forEach((k, v) -> {
            System.out.println(k);
            v.forEach((k2, v2) -> {
                System.out.println(k2);
                v2.forEach(System.out::println);
            });
            System.out.println();
        });
    }
}
