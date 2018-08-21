package com.ns.cspgtw.crud;

import com.ns.cspgtw.model.Transactions;

import javax.persistence.EntityManager;

public class TransactionsCrud extends Crud<Transactions> {
    public TransactionsCrud( EntityManager em) {
        super(Transactions.class,em);
    }

}
