package com.inc.emrys.rojaya.services;

import com.inc.emrys.rojaya.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    public Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);




}
