package com.inc.emrys.rojaya.repositories;

import com.inc.emrys.rojaya.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);
}
