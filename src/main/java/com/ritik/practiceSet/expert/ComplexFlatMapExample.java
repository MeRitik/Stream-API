package com.ritik.practiceSet.expert;

import java.util.List;

class Project {
    private String name;

    public Project(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class EmployeeWithProject {
    private String name;
    private List<Project> projects;

    public EmployeeWithProject(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }
    public List<Project> getProjects() {
        return projects;
    }
}

public class ComplexFlatMapExample {
    public static void main(String[] args) {
        List<EmployeeWithProject> employees = List.of(
                new EmployeeWithProject("Alice", List.of(new Project("AI"), new Project("ML"))),
                new EmployeeWithProject("Bob", List.of(new Project("Blockchain"), new Project("Cloud"))),
                new EmployeeWithProject("Charlie", List.of(new Project("Web"), new Project("Mobile")))
        );

        // Flatten all projects from employees
        List<Project> allProjects = employees.stream()
                .flatMap(emp -> emp.getProjects().stream())
                .toList();

        allProjects.forEach(project -> System.out.println(project.getName()));
    }
}
