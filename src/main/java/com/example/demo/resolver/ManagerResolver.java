package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.model.Employee;
import com.example.demo.model.Manager;
import com.example.demo.model.Task;
import com.example.demo.model.input.ManagerInput;
import com.example.demo.service.ManagerService;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManagerResolver implements GraphQLResolver<Manager> {

    @Autowired
    private ManagerService managerService;
    @Autowired
    private TaskService taskService;

    public Manager findById(Long id) {
        return managerService.get(id);
    }

    public Manager create(ManagerInput manager) {
        return managerService.create(manager);
    }

    public List<Task> getTasks(Manager manager) {
        return taskService.getAllByEmployeeId(manager.getId());
    }
}
