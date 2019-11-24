package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.model.Manager;
import com.example.demo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManagerResolver implements GraphQLResolver<Manager> {

    @Autowired
    private ManagerService managerService;

    public Manager findById(Long id) {
        return managerService.get(id);
    }

    public Manager create(Manager manager) {
        return managerService.create(manager);
    }
}
