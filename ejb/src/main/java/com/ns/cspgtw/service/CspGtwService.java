package com.ns.cspgtw.service;

import com.ns.cspgtw.service.billing.BillingRequest;
import com.ns.cspgtw.service.billing.BillingResponse;
import com.ns.cspgtw.service.billing.BillingResponseBuilderFactory;
import com.ns.cspgtw.service.builder.Resources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.BindingType;
import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.http.HTTPBinding;

@Stateless
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService( )
@BindingType(value = HTTPBinding.HTTP_BINDING)
@ServiceMode(value = Service.Mode.MESSAGE)

public class CspGtwService {
    private static final Logger logger = LoggerFactory.getLogger(CspGtwService.class);
    @PersistenceContext(unitName = "GTW_PU")
    private EntityManager entityManager;
    @WebResult(name="billing_response", targetNamespace = "https://vas.cpgtwhub.mobi/billing")

    @WebMethod(operationName = "billing_request")
    public BillingResponse billing(
            @XmlElement(required=true)
            @WebParam(name="billing_request", targetNamespace = "https://vas.cpgtwhub.mobi/billing")
            BillingRequest request
    ) {
        BillingResponseBuilderFactory bf = new BillingResponseBuilderFactory(new Resources(entityManager),request);
        return bf.getBuilder().build();
    }
}
