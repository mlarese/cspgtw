package com.ns.cspgtw.crud;

import com.ns.cspgtw.model.Subscription;

import javax.persistence.EntityManager;

public class SubscriptionCrud extends Crud<Subscription> {
    public SubscriptionCrud(EntityManager em) {
        super( Subscription.class,em);
    }
}
