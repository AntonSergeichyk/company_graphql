package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "emoloyee", schema = "company")
public abstract class Employee extends BaseEntity<Long> {

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

    @ManyToMany
    @JoinTable(name = "employee_task", schema = "company",
            joinColumns = {@JoinColumn(name = "employee_id")},
            inverseJoinColumns = {@JoinColumn(name = "task_id")})
    private Set<Task> tasks;

    @Column(name = "bookId")
    private Integer bookId;

}
