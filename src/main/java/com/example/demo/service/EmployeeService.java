package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.model.input.EmployeeInput;
import com.example.demo.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee create(EmployeeInput employeeInput) {
        Employee employee = new Employee();
        Address address = new Address(employeeInput.getHomeAddress().getNumber(), employeeInput.getHomeAddress().getStreet());
        Set<Task> tasks = employeeInput.getTaskIds().stream().map(it -> new Task()).collect(Collectors.toSet());

        employee.setGender(employeeInput.getGender());
        employee.setHomeAddress(address);
        employee.setTasks(tasks);
        employee.setName(employeeInput.getName());
        employee.setBookId(employeeInput.getBookId());

        return employeeRepository.save(employee);
    }

    public Employee get(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId);
        if (employee == null) {
            throw new ObjectNotFoundException(employeeId, "Employee");
        }
        return employee;
    }

}
