package com.sarin.springtest.springpet_clinic_app.services;

import com.sarin.springtest.springpet_clinic_app.model.Owner;

/**
 * @author Harsh Sarin
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
