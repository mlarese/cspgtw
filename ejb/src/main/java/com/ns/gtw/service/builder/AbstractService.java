package com.ns.gtw.service.builder;

import javax.persistence.EntityManager;

abstract public class AbstractService {
    public Resources getResources (EntityManager em){
        return new Resources(em);
    }
}
