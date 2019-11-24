package com.example.demo.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.Task;
import com.example.demo.resolver.TaskResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TaskQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private TaskResolver taskResolver;

    public Task findTaskById(Long id) {
        return taskResolver.findById(id);
    }
}
