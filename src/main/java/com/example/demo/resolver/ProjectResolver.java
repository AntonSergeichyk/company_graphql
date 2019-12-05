package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.model.Manager;
import com.example.demo.model.Project;
import com.example.demo.model.input.ProjectInput;
import com.example.demo.service.ManagerService;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectResolver implements GraphQLResolver<Project> {

    @Autowired
    private ProjectService progectService;
    @Autowired
    private ManagerService managerService;

    public Project findById(Long id) {
        return progectService.get(id);
    }

    public Project create(ProjectInput project) {
        return progectService.create(project);
    }

    public List<Manager> getManagers(Project project) {
        return managerService.getAllByProjectId(project.getId());
    }
}
