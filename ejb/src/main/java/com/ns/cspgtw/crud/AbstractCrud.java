package com.ns.cspgtw.crud;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public abstract class AbstractCrud {
    private EntityManager em;

    public AbstractCrud(EntityManager em) {
        this.em = em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public EntityManager getEm() {
        return em;
    }
    public Query getQuery (String query){
        return em.createQuery(query);
    }
}
