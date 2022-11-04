package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Skill field must be complete.")
    @Size(min=3,max=150, message = "Skill must be between 3 and 150 characters.")
    private String description;

    public Skill (String d){
        super();
        this.description =d;

    }
    public Skill(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}