package com.example.demo.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.Manager;
import com.example.demo.resolver.ManagerResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ManagerQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ManagerResolver managerResolver;

    public Manager findManagerById(Long id) {
        return managerResolver.findById(id);
    }
}
