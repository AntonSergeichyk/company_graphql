package com.example.demo.repository;

import com.example.demo.model.Task;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

public interface TaskRepository extends Repository<Task, Long> {

    Task findById(Serializable id);

    Task save(Task task);
}
