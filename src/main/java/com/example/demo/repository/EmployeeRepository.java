package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

public interface EmployeeRepository extends Repository<Employee, Long> {

    Employee findById(Serializable id);

    Employee save(Employee employee);
}
