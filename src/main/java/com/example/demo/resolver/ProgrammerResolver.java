package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.model.Manager;
import com.example.demo.model.Programmer;
import com.example.demo.model.Task;
import com.example.demo.model.input.ProgrammerInput;
import com.example.demo.service.ProgrammerService;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProgrammerResolver implements GraphQLResolver<Programmer> {

    @Autowired
    private ProgrammerService programmerService;
    @Autowired
    private TaskService taskService;

    public Programmer findById(Long id) {
        return programmerService.get(id);
    }

    public Programmer create(ProgrammerInput programmer) {
        return programmerService.create(programmer);
    }

    public List<Task> getTasks(Programmer programmer) {
        return taskService.getAllByEmployeeId(programmer.getId());
    }
}
