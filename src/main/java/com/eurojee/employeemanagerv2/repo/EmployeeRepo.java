package com.eurojee.employeemanagerv2.repo;

import com.eurojee.employeemanagerv2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    /*JpaRepository will help access the library of methods to access employee list without having to create new methods again.
    when you extend the JpaRepository you have to provide the class for this instance the employee class and provide the data type of primary key
    which is Long type.*/
}
