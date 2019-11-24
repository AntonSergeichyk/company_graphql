package com.example.demo.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.Miting;
import com.example.demo.resolver.MitingResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MitingQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private MitingResolver mitingResolver;

    public Miting findMitingById(Long id) {
        return mitingResolver.findById(id);
    }
}
