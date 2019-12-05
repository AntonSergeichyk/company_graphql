package com.example.demo.repository;

import com.example.demo.model.Programmer;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

public interface ProgrammerRepository extends Repository<Programmer, Long> {

    Programmer findById(Serializable id);

    Programmer save(Programmer programmer);

    List<Programmer> findAllByMitingId(Long id);
}
