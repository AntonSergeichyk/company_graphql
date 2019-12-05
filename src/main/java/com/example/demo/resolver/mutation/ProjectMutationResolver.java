package com.example.demo.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.Project;
import com.example.demo.model.input.ProjectInput;
import com.example.demo.resolver.ProjectResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProjectMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private ProjectResolver projectResolver;

    public Project createProject(ProjectInput project) {
        return projectResolver.create(project);
    }
}
