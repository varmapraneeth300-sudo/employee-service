package com.devops.project.service;

import com.devops.project.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    private final Map<Long, Employee> db = new HashMap<>();

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(db.values());
    }

    public Employee getEmployee(Long id) {
        return db.get(id);
    }

    public Employee addEmployee(Employee emp) {
        db.put(emp.getId(), emp);
        return emp;
    }

    public Employee updateEmployee(Long id, Employee emp) {
        db.put(id, emp);
        return emp;
    }

    public void deleteEmployee(Long id) {
        db.remove(id);
    }
}