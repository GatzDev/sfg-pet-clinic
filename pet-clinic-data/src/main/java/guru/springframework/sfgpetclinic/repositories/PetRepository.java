package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PEt;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository  extends CrudRepository<PEt, Long> {
}
