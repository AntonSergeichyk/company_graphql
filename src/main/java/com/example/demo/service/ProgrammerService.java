package com.example.demo.service;

import com.example.demo.model.Programmer;
import com.example.demo.repository.ProgrammerRepository;
import lombok.NoArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ProgrammerService {

    @Autowired
    private ProgrammerRepository programmerRepository;

    public Programmer create(Programmer programmer) {
        return programmerRepository.save(programmer);
    }

    public Programmer get(Long programmerId) {
        Programmer programmer = programmerRepository.findById(programmerId);
        if (programmer == null) {
            throw new ObjectNotFoundException(programmerId, "Employee");
        }
        return programmer;
    }
}
