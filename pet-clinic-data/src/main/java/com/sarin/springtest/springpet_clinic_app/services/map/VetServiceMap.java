package com.sarin.springtest.springpet_clinic_app.services.map;

import com.sarin.springtest.springpet_clinic_app.model.Speciality;
import com.sarin.springtest.springpet_clinic_app.model.Vet;
import com.sarin.springtest.springpet_clinic_app.services.SpecialityService;
import com.sarin.springtest.springpet_clinic_app.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Harsh Sarin
 */
@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet vet) {
        if(!vet.getSpecialities().isEmpty()) {
            vet.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null) {
                    Speciality saved = specialityService.save(speciality);
                    speciality.setId(saved.getId());
                }
            });
        }
        return super.save(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
