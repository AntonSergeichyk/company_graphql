package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskResolver implements GraphQLResolver<Task> {

    @Autowired
    private TaskService taskService;

    public Task findById(Long id) {
        return taskService.get(id);
    }

    public Task create(Task task) {
        return taskService.create(task);
    }
}
