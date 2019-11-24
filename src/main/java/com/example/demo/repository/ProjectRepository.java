package com.example.demo.repository;

import com.example.demo.model.Project;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

public interface ProjectRepository extends Repository<Project, Long> {

    Project findById(Serializable id);

    Project save(Project project);
}
