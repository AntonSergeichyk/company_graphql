package com.example.demo.repository;

import com.example.demo.model.Manager;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

public interface ManagerRepository extends Repository<Manager, Long> {

    Manager findById(Serializable id);

    Manager save(Manager manager);

    List<Manager> findAllByProjectId(Long id);
}
