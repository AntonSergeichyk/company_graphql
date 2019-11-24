package com.example.demo.repository;

import com.example.demo.model.Miting;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

public interface MitingRepository extends Repository<Miting, Long> {

    Miting findById(Serializable id);

    Miting save(Miting miting);
}
