package com.example.demo.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.Programmer;
import com.example.demo.resolver.ProgrammerResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProgrammerQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ProgrammerResolver programmerResolver;

    public Programmer findProgrammerById(Long id) {
        return programmerResolver.findById(id);
    }
}
