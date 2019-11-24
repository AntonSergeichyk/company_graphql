package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.model.Miting;
import com.example.demo.service.MitingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MitingResolver implements GraphQLResolver<Miting> {

    @Autowired
    private MitingService mitingService;

    public Miting findById(Long id) {
        return mitingService.get(id);
    }

    public Miting create(Miting miting) {
        return mitingService.create(miting);
    }
}
