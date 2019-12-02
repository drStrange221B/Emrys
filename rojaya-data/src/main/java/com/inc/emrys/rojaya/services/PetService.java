package com.inc.emrys.rojaya.services;

import com.inc.emrys.rojaya.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
