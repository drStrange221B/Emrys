package com.inc.emrys.rojaya.repositories;

import com.inc.emrys.rojaya.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
