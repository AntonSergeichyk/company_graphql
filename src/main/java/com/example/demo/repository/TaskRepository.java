package com.example.demo.repository;

import com.example.demo.model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;

public interface TaskRepository extends Repository<Task, Long> {

    Task findById(Serializable id);

    Task save(Task task);

    @Query(nativeQuery = true,
            value = "select t.* from company.task t inner join company.employee_task et on t.id = et.task_id " +
                    "inner join company.emoloyee e on et.employee_id = e.id where e.id = :eId")
    List<Task> findAllByEmployeeId(@Param("eId") Long id);
}
