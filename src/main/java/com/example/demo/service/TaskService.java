package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.model.input.TaskInput;
import com.example.demo.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task create(TaskInput taskInput) {

        return taskRepository.save(Task.builder()
                            .name(taskInput.getName())
                            .build());
    }

    public Task get(Long taskId) {
        Task task = taskRepository.findById(taskId);
        if (task == null) {
            throw new ObjectNotFoundException(taskId, "Employee");
        }
        return task;
    }

    public List<Task> getAllByEmployeeId(Long id) {
        return taskRepository.findAllByEmployeeId(id);
    }
}
