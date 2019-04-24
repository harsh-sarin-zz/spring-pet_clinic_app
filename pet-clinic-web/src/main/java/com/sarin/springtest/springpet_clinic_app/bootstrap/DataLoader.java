package com.sarin.springtest.springpet_clinic_app.bootstrap;

import com.sarin.springtest.springpet_clinic_app.model.Owner;
import com.sarin.springtest.springpet_clinic_app.model.PetType;
import com.sarin.springtest.springpet_clinic_app.model.Vet;
import com.sarin.springtest.springpet_clinic_app.services.OwnerService;
import com.sarin.springtest.springpet_clinic_app.services.PetTypeService;
import com.sarin.springtest.springpet_clinic_app.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Harsh Sarin
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Bad dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType lion = new PetType();
        lion.setName("Strong lion");
        PetType savedLionPetType = petTypeService.save(lion);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Keaton");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Gallagher");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Jack");
        vet1.setLastName("Jackal");
        vetService.save(vet1);


    }
}
