package com.inc.emrys.rojaya.model;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="type")
public class PetType extends BaseEntity {

    @Column(name="name")
    private String name;

    @Builder
    public PetType(String name, Long id) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
