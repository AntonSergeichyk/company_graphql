package com.example.demo.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.Task;
import com.example.demo.model.input.TaskInput;
import com.example.demo.resolver.TaskResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TaskMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private TaskResolver taskResolver;

    public Task createTask(TaskInput task) {
        return taskResolver.create(task);
    }
}
