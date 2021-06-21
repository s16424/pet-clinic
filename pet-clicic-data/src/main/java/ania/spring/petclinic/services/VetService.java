package ania.spring.petclinic.services;

import ania.spring.petclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{

    Vet findByLastName(String lastName);

}
