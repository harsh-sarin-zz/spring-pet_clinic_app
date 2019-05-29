package com.sarin.springtest.springpet_clinic_app.repositories;

import com.sarin.springtest.springpet_clinic_app.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Harsh Sarin
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
