package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Skill required")
    @Size(min=3, max=75, message="location must be between 3 and 255 characters")
    private String description;

    public Skill( String skillDescription) {
        this.description = skillDescription;
    }

    public Skill(){}

    public String getdescription() {
        return description;
    }

    public void setdescription(String skillDescription) {
        this.description = skillDescription;
    }
}
