package com.example.demo.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.Manager;
import com.example.demo.resolver.ManagerResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ManagerMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private ManagerResolver managerResolver;

    public Manager createManager(Manager manager) {
        return managerResolver.create(manager);
    }
}
