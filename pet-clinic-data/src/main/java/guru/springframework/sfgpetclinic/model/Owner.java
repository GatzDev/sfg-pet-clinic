package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Owner extends Person{

    private Set<PEt> pets;

    public Set<PEt> getPets() {
        return pets;
    }

    public void setPets(Set<PEt> pets) {
        this.pets = pets;
    }
}
