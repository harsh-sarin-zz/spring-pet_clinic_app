package com.sarin.springtest.springpet_clinic_app.repositories;

import com.sarin.springtest.springpet_clinic_app.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Harsh Sarin
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
