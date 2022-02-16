package com.eurojee.employeemanagerv2.service;

import com.eurojee.employeemanagerv2.model.Employee;
import com.eurojee.employeemanagerv2.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
/*
REMEMBER:
The JpaRepository will automatically provide the necessary methods such jdbc driver CRUD operations
without having to manually code it from scratch*/

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired // Autowired annotation to bring in dependencies
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
}
