package com.inc.emrys.rojaya.repositories;

import com.inc.emrys.rojaya.model.PetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository<PetType, Long> {
}
