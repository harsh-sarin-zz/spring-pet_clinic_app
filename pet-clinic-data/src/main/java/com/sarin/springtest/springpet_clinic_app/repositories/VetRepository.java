package com.sarin.springtest.springpet_clinic_app.repositories;

import com.sarin.springtest.springpet_clinic_app.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Harsh Sarin
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
