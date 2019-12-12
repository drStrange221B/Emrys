package com.inc.emrys.rojaya.services;

import com.inc.emrys.rojaya.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    public Owner findByLastName(String lastName);



}
