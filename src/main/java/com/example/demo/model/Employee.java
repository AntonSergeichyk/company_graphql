package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "emoloyee", schema = "company")
public class Employee extends BaseEntity<Long> {

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

//    @Column
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "home_number", column = @Column(name = "work_number")),
//            @AttributeOverride(name = "home_street", column = @Column(name = "work_street"))
//    })
//    private Address workAddress;

    @Column(nullable = false)
    @Embedded
    private Address homeAddress;

    @OneToMany
    @JoinTable(name = "employee_task", schema = "company",
            joinColumns = {@JoinColumn(name = "employee_id")},
            inverseJoinColumns = {@JoinColumn(name = "task_id")})
    private Set<Task> tasks;

    @Column(name = "bookId")
    private Integer bookId;

}
