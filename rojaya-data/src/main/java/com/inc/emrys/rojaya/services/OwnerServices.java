package com.inc.emrys.rojaya.services;

import com.inc.emrys.rojaya.model.Owner;

import java.util.Set;

public interface OwnerServices {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();


}
