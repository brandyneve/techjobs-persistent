package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location required")
    @Size(min=3, max=75, message="location must be between 3 and 75 characters")
    private String location;

    @OneToMany(mappedBy = "employer")
    private final List<Job> job = new ArrayList<>();


    public Employer( String location) {
        this.location = location;
    }

    public Employer(){}


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
