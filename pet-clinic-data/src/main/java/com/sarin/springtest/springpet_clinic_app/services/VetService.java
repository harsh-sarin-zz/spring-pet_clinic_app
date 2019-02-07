package com.sarin.springtest.springpet_clinic_app.services;

import com.sarin.springtest.springpet_clinic_app.model.Vet;

import java.util.Set;

/**
 * @author Harsh Sarin
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
