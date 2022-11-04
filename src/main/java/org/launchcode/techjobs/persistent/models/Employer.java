package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "Name is required.")
    @Size(min=3,max=75, message="Name must be between 3 and 75 characters.")
    private String location;

    public Employer (String l) {
        super();
        this.location = l;
    }
    public Employer() {

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
