package com.sarin.springtest.springpet_clinic_app.services.springdatajpa;

import com.sarin.springtest.springpet_clinic_app.model.Visit;
import com.sarin.springtest.springpet_clinic_app.repositories.VisitRepository;
import com.sarin.springtest.springpet_clinic_app.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Harsh Sarin
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }


    @Override
    public Set<Visit> findAll() {
        Set<Visit> vists = new HashSet<>();
        visitRepository.findAll().forEach(vists::add);
        return vists;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
