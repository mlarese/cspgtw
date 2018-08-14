package com.ns.gtw.crud;

import com.ns.gtw.model.Operator;

import javax.persistence.EntityManager;

public class OperatorCrud extends Crud<Operator> {
    public OperatorCrud( EntityManager em) {
        super(Operator.class,em);
    }

}
