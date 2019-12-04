package com.inc.emrys.rojaya.services.map;

import com.inc.emrys.rojaya.model.Vet;
import com.inc.emrys.rojaya.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return null;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet FindById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}

