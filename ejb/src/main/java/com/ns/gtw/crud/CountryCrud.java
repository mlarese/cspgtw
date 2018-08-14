package com.ns.gtw.crud;

import com.ns.gtw.model.Country;

import javax.persistence.EntityManager;

public class CountryCrud extends Crud<Country> {
    public CountryCrud(EntityManager em) {
        super(Country.class, em);
    }
}
