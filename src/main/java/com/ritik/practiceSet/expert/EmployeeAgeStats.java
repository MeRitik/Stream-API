package com.ritik.practiceSet.expert;

import java.util.IntSummaryStatistics;
import java.util.List;

public class EmployeeAgeStats {

    /**
     * <b>Employee Age Stats</b>
     * <br>
     * Find min, max, avg age of employees.
     */

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 19),
                new Employee("Bob", 45),
                new Employee("Charlie", 32),
                new Employee("David", 28),
                new Employee("Eve", 51),
                new Employee("Frank", 23)
        );

        IntSummaryStatistics intSummaryStatistics = employees.stream()
                .mapToInt(Employee::getAge)
                .summaryStatistics();

        System.out.println(intSummaryStatistics);
    }
}
