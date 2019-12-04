package com.inc.emrys.rojaya.services;

import com.inc.emrys.rojaya.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);



}
