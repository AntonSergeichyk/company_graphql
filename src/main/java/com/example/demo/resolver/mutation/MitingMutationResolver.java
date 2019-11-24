package com.example.demo.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.Miting;
import com.example.demo.resolver.MitingResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MitingMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private MitingResolver mitingResolver;

    public Miting createManager(Miting miting) {
        return mitingResolver.create(miting);
    }
}
