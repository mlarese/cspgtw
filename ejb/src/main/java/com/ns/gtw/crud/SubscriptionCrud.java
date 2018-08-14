package com.ns.gtw.crud;

import com.ns.gtw.model.Subscription;

import javax.persistence.EntityManager;

public class SubscriptionCrud extends Crud<Subscription> {
    public SubscriptionCrud(EntityManager em) {
        super( Subscription.class,em);
    }
}
