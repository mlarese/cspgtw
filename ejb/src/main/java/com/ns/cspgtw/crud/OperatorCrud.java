package com.ns.cspgtw.crud;

import com.ns.cspgtw.model.Operator;

import javax.persistence.EntityManager;

public class OperatorCrud extends Crud<Operator> {
    public OperatorCrud( EntityManager em) {
        super(Operator.class,em);
    }

}
