package com.example.demo.service;

import com.example.demo.model.Address;
import com.example.demo.model.Manager;
import com.example.demo.model.Project;
import com.example.demo.model.Task;
import com.example.demo.model.input.ManagerInput;
import com.example.demo.repository.ManagerRepository;
import lombok.AllArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;


    public Manager create(ManagerInput managerInput) {
        Manager manager = new Manager();
        Project project = new Project();
        project.setId(managerInput.getProjectId());
        Address address = new Address(managerInput.getHomeAddress().getNumber(), managerInput.getHomeAddress().getStreet());
        Set<Task> tasks = managerInput.getTaskIds().stream().map(it -> new Task()).collect(Collectors.toSet());

        manager.setProject(project);
        manager.setGender(managerInput.getGender());
        manager.setHomeAddress(address);
        manager.setTasks(tasks);
        manager.setName(managerInput.getName());
        manager.setBookId(managerInput.getBookId());

        return managerRepository.save(manager);
    }

    public Manager get(Long managerId) {
        Manager manager = managerRepository.findById(managerId);
        if (manager == null) {
            throw new ObjectNotFoundException(managerId, "Employee");
        }
        return manager;
    }

    public List<Manager> getAllByProjectId(Long id) {
        return managerRepository.findAllByProjectId(id);
    }

}
