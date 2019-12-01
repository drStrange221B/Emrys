package com.inc.emrys.rojaya.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
