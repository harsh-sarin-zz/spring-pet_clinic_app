package com.sarin.springtest.springpet_clinic_app.repositories;

import com.sarin.springtest.springpet_clinic_app.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Harsh Sarin
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
