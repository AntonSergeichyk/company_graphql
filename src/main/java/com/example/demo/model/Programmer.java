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
@Table(name = "programmer", schema = "company")
public class Programmer extends Employee {

    @ManyToOne
    @JoinColumn(name = "miting_id")
    private Miting miting;
}
