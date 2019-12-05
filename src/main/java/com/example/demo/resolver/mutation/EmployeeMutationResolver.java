package com.example.demo.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.Employee;
import com.example.demo.model.input.EmployeeInput;
import com.example.demo.resolver.EmployeeResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EmployeeMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private EmployeeResolver employeeResolver;

    public Employee createEmployee(EmployeeInput employee) {
        return employeeResolver.create(employee);
    }
}
