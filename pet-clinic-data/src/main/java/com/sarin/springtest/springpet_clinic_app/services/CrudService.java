package com.sarin.springtest.springpet_clinic_app.services;

import java.util.Set;

/**
 * @author Harsh Sarin
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
