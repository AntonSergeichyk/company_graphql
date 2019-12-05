package com.example.demo.service;

import com.example.demo.model.Address;
import com.example.demo.model.Miting;
import com.example.demo.model.Programmer;
import com.example.demo.model.Task;
import com.example.demo.model.input.ProgrammerInput;
import com.example.demo.repository.ProgrammerRepository;
import lombok.NoArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor
public class ProgrammerService {

    @Autowired
    private ProgrammerRepository programmerRepository;

    public Programmer create(ProgrammerInput programmerInput) {
        Programmer programmer = new Programmer();
        Miting miting = new Miting();
        miting.setId(programmerInput.getMitingId());
        Address address = new Address(programmerInput.getHomeAddress().getNumber(), programmerInput.getHomeAddress().getStreet());
        Set<Task> tasks = programmerInput.getTaskIds().stream().map(it -> new Task()).collect(Collectors.toSet());

        programmer.setMiting(miting);
        programmer.setGender(programmerInput.getGender());
        programmer.setHomeAddress(address);
        programmer.setTasks(tasks);
        programmer.setName(programmerInput.getName());
        programmer.setBookId(programmerInput.getBookId());
        return programmerRepository.save(programmer);
    }

    public Programmer get(Long programmerId) {
        Programmer programmer = programmerRepository.findById(programmerId);
        if (programmer == null) {
            throw new ObjectNotFoundException(programmerId, "Employee");
        }
        return programmer;
    }

    public List<Programmer> getAllByMitingId(Long id) {
        return programmerRepository.findAllByMitingId(id);
    }
}
