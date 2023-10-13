package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity{

    private LocalDate date;
    private String description;
    private PEt pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PEt getPet() {
        return pet;
    }

    public void setPet(PEt pet) {
        this.pet = pet;
    }
}
