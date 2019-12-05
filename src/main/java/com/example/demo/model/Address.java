package com.example.demo.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Embeddable
public class Address {

    @Column(name = "home_number", insertable=false, updatable=false)
    private String number;

    @Column(name = "home_street", insertable=false, updatable=false)
    private String street;

}
