package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.model.Project;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectResolver implements GraphQLResolver<Project> {

    @Autowired
    private ProjectService progectService;

    public Project findById(Long id) {
        return progectService.get(id);
    }

    public Project create(Project project) {
        return progectService.create(project);
    }
}
