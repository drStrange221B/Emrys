package com.inc.emrys.rojaya.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="type")
public class PetType extends BaseEntity {

    @Column(name="name")
    private String name;


    @Override
    public String toString() {
        return name;
    }
}
