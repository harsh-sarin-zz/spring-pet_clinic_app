package com.sarin.springtest.springpet_clinic_app.services;

import com.sarin.springtest.springpet_clinic_app.model.Owner;

import java.util.Set;

/**
 * @author Harsh Sarin
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
