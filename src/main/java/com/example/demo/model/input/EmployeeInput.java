package com.example.demo.model.input;

import com.example.demo.model.Gender;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class EmployeeInput {

    private String name;
    private Gender gender;
    private AddressInput homeAddress;
    private Set<Long> taskIds;
    private Integer bookId;

}
