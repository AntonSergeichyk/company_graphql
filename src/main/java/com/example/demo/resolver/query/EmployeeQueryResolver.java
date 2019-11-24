package com.example.demo.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.Employee;
import com.example.demo.resolver.EmployeeResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EmployeeQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private EmployeeResolver employeeResolver;

    public Employee findEmployeeById(Long id) {
        return employeeResolver.findById(id);
    }
}
