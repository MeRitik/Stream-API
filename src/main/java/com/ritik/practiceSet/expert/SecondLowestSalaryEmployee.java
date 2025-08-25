package com.ritik.practiceSet.expert;

import java.util.Comparator;
import java.util.List;

public class SecondLowestSalaryEmployee {
    public static void main(String[] args) {
        List<EmployeeWithSalary> employees = List.of(
                new EmployeeWithSalary("John Smith", 75000),
                new EmployeeWithSalary("Emma Johnson", 82000),
                new EmployeeWithSalary("Michael Brown", 65000),
                new EmployeeWithSalary("Sarah Davis", 90000),
                new EmployeeWithSalary("David Wilson", 78000),
                new EmployeeWithSalary("Lisa Anderson", 85000),
                new EmployeeWithSalary("James Taylor", 70000),
                new EmployeeWithSalary("Jennifer Martin", 95000),
                new EmployeeWithSalary("Robert Thomas", 68000),
                new EmployeeWithSalary("Maria Garcia", 88000)
        );

        employees.stream()
                .sorted(Comparator.comparingInt(EmployeeWithSalary::getSalary))
                .limit(2)
                .skip(1)
                .forEach(System.out::println);

    }
}
