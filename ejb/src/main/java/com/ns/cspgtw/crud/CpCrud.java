package com.ns.cspgtw.crud;

import com.ns.cspgtw.model.Cp;

import javax.persistence.EntityManager;

public class CpCrud extends Crud<Cp> {
    public CpCrud(EntityManager em) {
        super(Cp.class,em);
    }
}
