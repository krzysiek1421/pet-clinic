package krzysiek1421.springframework.petclinic.services;

import krzysiek1421.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
