package com.ns.gtw.crud;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class Crud<T> extends AbstractCrud{
    Class <T> clazz;
    public Crud(Class<T>  clazz, EntityManager em) {
        super(em);
        this.clazz = clazz;
    }

    public Query getQuery (String queryName) {
        return getEm().createNamedQuery(queryName);
    }

    public T find(Long id) {
        return getEm().find(clazz, id);
    }
    public T find(Integer id) {
        return getEm().find(clazz, id);
    }

    public T find(String id) {
        return getEm().find(clazz, id);
    }
    public void insert(T op) {
        getEm().persist(op);
    }

    public void update(T op) {
        getEm().merge(op);
    }

    public void delete(Long id) {
        T op = find(id);
        delete(op);
    }

    public void delete(T op) {
        getEm().remove(op);
    }

    public List<T>findAll() {
        return getQuery("select o from Operator o").getResultList();
    }

}
