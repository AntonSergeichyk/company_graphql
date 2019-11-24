package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.model.Programmer;
import com.example.demo.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProgrammerResolver implements GraphQLResolver<Programmer> {

    @Autowired
    private ProgrammerService programmerService;

    public Programmer findById(Long id) {
        return programmerService.get(id);
    }

    public Programmer create(Programmer programmer) {
        return programmerService.create(programmer);
    }
}
