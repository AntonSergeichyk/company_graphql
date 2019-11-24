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
@Table(name = "programmer", schema = "company")
public class Programmer extends Employee {

    @ManyToOne
    @JoinColumn(name = "miting_id")
    private Miting miting;
}
