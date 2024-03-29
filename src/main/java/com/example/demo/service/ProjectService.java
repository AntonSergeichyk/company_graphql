package com.example.demo.service;

import com.example.demo.model.Project;
import com.example.demo.model.input.ProjectInput;
import com.example.demo.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project create(ProjectInput projectInput) {
        return projectRepository.save(Project.builder()
                                .name(projectInput.getName())
                                .build());
    }

    public Project get(Long projectId) {
        Project project = projectRepository.findById(projectId);
        if (project == null) {
            throw new ObjectNotFoundException(projectId, "Employee");
        }
        return project;
    }
}
