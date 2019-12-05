package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.model.Employee;
import com.example.demo.model.Task;
import com.example.demo.model.input.EmployeeInput;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeResolver implements GraphQLResolver<Employee> {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private TaskService taskService;

    public Employee findById(Long id) {
        return employeeService.get(id);
    }

    public Employee create(EmployeeInput employee) {
        return employeeService.create(employee);
    }

    public List<Task> getTasks(Employee employee) {
        return taskService.getAllByEmployeeId(employee.getId());
    }
}
