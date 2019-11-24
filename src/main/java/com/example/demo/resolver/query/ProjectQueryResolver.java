package com.example.demo.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.Project;
import com.example.demo.resolver.ProjectResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProjectQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ProjectResolver projectResolver;

    public Project findProjectById(Long id) {
        return projectResolver.findById(id);
    }
}
