package com.sarin.springtest.springpet_clinic_app.bootstrap;

import com.sarin.springtest.springpet_clinic_app.model.Owner;
import com.sarin.springtest.springpet_clinic_app.model.Vet;
import com.sarin.springtest.springpet_clinic_app.services.OwnerService;
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

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
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
