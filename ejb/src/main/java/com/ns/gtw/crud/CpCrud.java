package com.ns.gtw.crud;

import com.ns.gtw.model.Cp;

import javax.persistence.EntityManager;

public class CpCrud extends Crud<Cp> {
    public CpCrud(EntityManager em) {
        super(Cp.class,em);
    }
}
