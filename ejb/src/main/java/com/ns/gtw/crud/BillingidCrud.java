package com.ns.gtw.crud;

import com.ns.gtw.model.Billingid;

import javax.persistence.EntityManager;

public class BillingidCrud extends Crud<Billingid> {
    public BillingidCrud(EntityManager em) {
        super(Billingid.class, em);
    }
}
