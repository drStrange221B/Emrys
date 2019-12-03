package com.inc.emrys.rojaya.services;

import com.inc.emrys.rojaya.model.Owner;

public interface OwnerServices extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
//    Owner findById(Long id);
//    Owner save(Owner owner);
//    Set<Owner> findAll();


}
