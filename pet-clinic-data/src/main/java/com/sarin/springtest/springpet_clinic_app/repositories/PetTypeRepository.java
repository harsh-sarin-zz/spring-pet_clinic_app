package com.sarin.springtest.springpet_clinic_app.repositories;

import com.sarin.springtest.springpet_clinic_app.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Harsh Sarin
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
