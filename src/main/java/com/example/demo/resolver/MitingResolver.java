package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.model.Miting;
import com.example.demo.model.Programmer;
import com.example.demo.model.input.MitingInput;
import com.example.demo.service.MitingService;
import com.example.demo.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MitingResolver implements GraphQLResolver<Miting> {

    @Autowired
    private MitingService mitingService;
    @Autowired
    private ProgrammerService programmerService;

    public Miting findById(Long id) {
        return mitingService.get(id);
    }

    public Miting create(MitingInput miting) {
        return mitingService.create(miting);
    }

    public List<Programmer> getProgrammers(Miting miting) {
        return programmerService.getAllByMitingId(miting.getId());
    }
}
