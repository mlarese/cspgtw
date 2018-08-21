package com.ns.cspgtw.service.builder;

import javax.persistence.EntityManager;

abstract public class AbstractService {
    public Resources getResources (EntityManager em){
        return new Resources(em);
    }
}
