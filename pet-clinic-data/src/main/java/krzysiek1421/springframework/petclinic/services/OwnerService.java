package krzysiek1421.springframework.petclinic.services;

import krzysiek1421.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
