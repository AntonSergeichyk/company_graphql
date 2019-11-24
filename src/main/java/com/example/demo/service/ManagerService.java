package com.example.demo.service;

import com.example.demo.model.Manager;
import com.example.demo.repository.ManagerRepository;
import lombok.AllArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;


    public Manager create(Manager manager) {
        return managerRepository.save(manager);
    }

    public Manager get(Long managerId) {
        Manager manager = managerRepository.findById(managerId);
        if (manager == null) {
            throw new ObjectNotFoundException(managerId, "Employee");
        }
        return manager;
    }
}
