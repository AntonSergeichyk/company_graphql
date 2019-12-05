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
@Table(name = "project", schema = "company")
public class Project extends BaseEntity<Long> {

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "project")
    private Set<Manager> managers;
}
