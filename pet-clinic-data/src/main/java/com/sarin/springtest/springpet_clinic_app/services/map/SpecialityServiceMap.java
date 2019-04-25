package com.sarin.springtest.springpet_clinic_app.services.map;

import com.sarin.springtest.springpet_clinic_app.model.Speciality;
import com.sarin.springtest.springpet_clinic_app.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Harsh Sarin
 */
@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
