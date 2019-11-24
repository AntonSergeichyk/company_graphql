package com.example.demo.service;

import com.example.demo.model.Miting;
import com.example.demo.repository.MitingRepository;
import lombok.AllArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MitingService {

    @Autowired
    private MitingRepository mitingRepository;

    public Miting create(Miting miting) {
        return mitingRepository.save(miting);
    }

    public Miting get(Long mitingId) {
        Miting miting = mitingRepository.findById(mitingId);
        if (miting == null) {
            throw new ObjectNotFoundException(mitingId, "Employee");
        }
        return miting;
    }
}
