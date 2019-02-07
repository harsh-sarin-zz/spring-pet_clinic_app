package com.sarin.springtest.springpet_clinic_app.services;

import com.sarin.springtest.springpet_clinic_app.model.Pet;

import java.util.Set;

/**
 * @author Harsh Sarin
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
