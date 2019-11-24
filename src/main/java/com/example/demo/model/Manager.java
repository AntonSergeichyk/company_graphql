package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "employee_id")
@Entity
@Table(name = "manager", schema = "company")
public class Manager extends Employee{

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
