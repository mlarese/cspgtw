package com.ns.gtw.crud;

import com.ns.gtw.model.Service;

import javax.persistence.EntityManager;

public class ServiceCrud extends Crud<Service> {
    public ServiceCrud(EntityManager em ) {
        super(Service.class,em);
    }

}
