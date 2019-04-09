package com.sarin.springtest.springpet_clinic_app.services.map;

import com.sarin.springtest.springpet_clinic_app.model.Pet;
import com.sarin.springtest.springpet_clinic_app.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Harsh Sarin
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
