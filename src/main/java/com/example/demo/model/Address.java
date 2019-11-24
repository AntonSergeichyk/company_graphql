package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class Address {

    @Column(name = "home_number", insertable=false, updatable=false)
    private String number;

    @Column(name = "home_street", insertable=false, updatable=false)
    private String street;

}
