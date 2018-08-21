package com.ns.cspgtw.crud;

import com.ns.cspgtw.model.Service;

import javax.persistence.EntityManager;

public class ServiceCrud extends Crud<Service> {
    public ServiceCrud(EntityManager em ) {
        super(Service.class,em);
    }

}
