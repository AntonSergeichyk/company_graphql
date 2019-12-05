package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@PrimaryKeyJoinColumn(name = "employee_id")
@Entity
@Table(name = "manager", schema = "company")
public class Manager extends Employee{

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
