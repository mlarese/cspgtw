package com.ns.cspgtw.crud;

import com.ns.cspgtw.model.Billingid;

import javax.persistence.EntityManager;

public class BillingidCrud extends Crud<Billingid> {
    public BillingidCrud(EntityManager em) {
        super(Billingid.class, em);
    }
}
