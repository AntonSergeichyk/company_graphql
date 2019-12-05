package com.example.demo.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "employees")
@Builder
@Entity
@Table(name = "task", schema = "company")
public class Task extends BaseEntity<Long>{

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name = "employee_task", schema = "company",
            joinColumns = {@JoinColumn(name = "task_id")},
            inverseJoinColumns = {@JoinColumn(name = "employee_id")})
    private Set<Employee> employees;
}
