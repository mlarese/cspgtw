package com.ns.gtw.crud;

import com.ns.gtw.model.Transactions;

import javax.persistence.EntityManager;

public class TransactionsCrud extends Crud<Transactions> {
    public TransactionsCrud( EntityManager em) {
        super(Transactions.class,em);
    }

}
