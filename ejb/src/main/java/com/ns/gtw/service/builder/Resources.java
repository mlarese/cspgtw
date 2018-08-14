package com.ns.gtw.service.builder;

import com.ns.gtw.crud.*;
import com.ns.gtw.proxylayer.ProxyInvokeResult;
import com.ns.gtw.proxylayer.ProxyInvoker;
import com.ns.gtw.proxylayer.ProxyInvokerDTO;
import com.ns.gtw.proxylayer.ProxyInvokerImp;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.IOException;
import java.net.URISyntaxException;

public class Resources {
    private BillingidCrud billingidCrud=null;
    private CountryCrud countryCrud=null;
    private CpCrud cpCrud=null;
    private OperatorCrud operatorCrud=null;
    private ReportingCrud reportingCrud=null;
    private ServiceBillingidCrud serviceBillingidCrud=null;
    private ServiceCrud serviceCrud=null;
    private SubscriptionCrud subscriptionCrud=null;
    private TransactionsCrud transactionsCrud=null;
    private EntityManager entityManager;
    private ProxyInvoker invoker = null;

    public ProxyInvoker getInvoker() {
        if(invoker == null) invoker = new ProxyInvokerImp();
        return invoker;
    }

    public ProxyInvokeResult invokeProxy(ProxyInvokerDTO dto) throws Exception {
        return getInvoker().invoke(dto);
    }
    public BillingidCrud getBillingidCrud() {
        if(billingidCrud==null) billingidCrud = new BillingidCrud(entityManager);
        return billingidCrud;
    }

    public CountryCrud getCountryCrud() {
        if(countryCrud==null) countryCrud = new CountryCrud(entityManager);
        return countryCrud;
    }

    public CpCrud getCpCrud() {
        if(cpCrud==null) cpCrud = new CpCrud(entityManager);
        return cpCrud;
    }

    public OperatorCrud getOperatorCrud() {
        if(operatorCrud==null) operatorCrud = new OperatorCrud(entityManager);
        return operatorCrud;
    }

    public ReportingCrud getReportingCrud() {
        if(reportingCrud==null) reportingCrud = new ReportingCrud(entityManager);
        return reportingCrud;
    }

    public ServiceBillingidCrud getServiceBillingidCrud() {
        if(serviceBillingidCrud==null) serviceBillingidCrud = new ServiceBillingidCrud(entityManager);
        return serviceBillingidCrud;
    }

    public ServiceCrud getServiceCrud() {
        if(serviceCrud==null) serviceCrud = new ServiceCrud(entityManager);
        return serviceCrud;
    }

    public SubscriptionCrud getSubscriptionCrud() {
        if(subscriptionCrud==null) subscriptionCrud = new SubscriptionCrud(entityManager);
        return subscriptionCrud;
    }

    public TransactionsCrud getTransactionsCrud() {
        if(transactionsCrud==null) transactionsCrud = new TransactionsCrud(entityManager);
        return transactionsCrud;
    }

    public Query getQuery (String queryName) {
        return getEntityManager().createNamedQuery(queryName);
    }

    public Resources(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
