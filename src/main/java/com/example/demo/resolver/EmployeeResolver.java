package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeResolver implements GraphQLResolver<Employee> {

    @Autowired
    private EmployeeService employeeService;

    public Employee findById(Long id) {
        return employeeService.get(id);
    }

    public Employee create(Employee employee) {
        return employeeService.create(employee);
    }
}
