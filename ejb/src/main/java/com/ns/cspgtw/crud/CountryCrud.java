package com.ns.cspgtw.crud;

import com.ns.cspgtw.model.Country;

import javax.persistence.EntityManager;

public class CountryCrud extends Crud<Country> {
    public CountryCrud(EntityManager em) {
        super(Country.class, em);
    }
}
