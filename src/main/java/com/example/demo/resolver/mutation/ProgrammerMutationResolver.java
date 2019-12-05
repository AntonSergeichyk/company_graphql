package com.example.demo.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.Programmer;
import com.example.demo.model.input.ProgrammerInput;
import com.example.demo.resolver.ProgrammerResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProgrammerMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private ProgrammerResolver programmerResolver;

    public Programmer createProgrammer(ProgrammerInput programmer) {
        return programmerResolver.create(programmer);
    }
}
