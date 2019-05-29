package com.sarin.springtest.springpet_clinic_app.repositories;

import com.sarin.springtest.springpet_clinic_app.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Harsh Sarin
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
