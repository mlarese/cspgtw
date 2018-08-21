package com.ns.cspgtw.crud;

import com.ns.cspgtw.model.ServiceBillingid;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ServiceBillingidCrud extends Crud<ServiceBillingid> {
    public ServiceBillingidCrud( EntityManager em) {
        super(ServiceBillingid.class,em);
    }

    public ServiceBillingid findByServiceAndBilling(int serviceId, int billingId) {
            Query q  = getQuery("ServiceBillingid.findByBillingService");
            q   .setParameter("serviceid",serviceId)
                .setParameter("billingid",billingId);

            return (ServiceBillingid) q.getSingleResult();
    }
}
