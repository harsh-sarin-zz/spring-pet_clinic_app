package com.sarin.springtest.springpet_clinic_app.model;

import java.io.Serializable;

/**
 * @author Harsh Sarin
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
