package com.devops.project.model;

import lombok.Data;

@Data
public class Employee {

    private Long id;
    private String name;
    private String role;

    public Employee() {}

    public Employee(Long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
}