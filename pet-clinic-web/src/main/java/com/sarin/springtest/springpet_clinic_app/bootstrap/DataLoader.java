package com.sarin.springtest.springpet_clinic_app.bootstrap;

import com.sarin.springtest.springpet_clinic_app.model.*;
import com.sarin.springtest.springpet_clinic_app.services.OwnerService;
import com.sarin.springtest.springpet_clinic_app.services.PetTypeService;
import com.sarin.springtest.springpet_clinic_app.services.SpecialityService;
import com.sarin.springtest.springpet_clinic_app.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author Harsh Sarin
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0) {
            load();
        }
    }

    private void load() {
        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType lion = new PetType();
        lion.setName("lion");
        PetType savedLionPetType = petTypeService.save(lion);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Keaton");
        owner1.setAddress("1234 Sun Blvd");
        owner1.setCity("New York");
        owner1.setTelephone("323232323");
        ownerService.save(owner1);

        Pet dudesPet = new Pet();
        dudesPet.setName("Dude dog");
        dudesPet.setPetType(savedDogPetType);
        dudesPet.setBirthDate(LocalDate.now());
        dudesPet.setOwner(owner1);
        owner1.getPets().add(dudesPet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Gallagher");
        owner2.setAddress("1234 Rain Blvd");
        owner2.setCity("Seattle");
        owner2.setTelephone("23232033");
        ownerService.save(owner2);

        Pet dudeksPet = new Pet();
        dudeksPet.setName("Dude lion");
        dudeksPet.setPetType(savedLionPetType);
        dudeksPet.setBirthDate(LocalDate.now());
        dudeksPet.setOwner(owner2);
        owner2.getPets().add(dudeksPet);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Vet vet1 = new Vet();
        vet1.setFirstName("Jack");
        vet1.setLastName("Jackal");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);
    }
}
