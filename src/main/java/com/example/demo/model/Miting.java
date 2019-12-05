package com.example.demo.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "miting", schema = "company")
public class Miting extends BaseEntity<Long>{

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "miting")
    private Set<Programmer> programmers;
}
