package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.PEt;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetMapService extends AbstractMapService<PEt, Long> implements CrudService<PEt, Long> {

    @Override
    public Set<PEt> findAll() {
        return super.findAll();
    }

    @Override
    public PEt findById(Long id) {
        return super.findById( id);
    }

    @Override
    public PEt save(PEt object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(PEt object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);
    }
}
