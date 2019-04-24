package com.sarin.springtest.springpet_clinic_app.model;

/**
 * @author Harsh Sarin
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
