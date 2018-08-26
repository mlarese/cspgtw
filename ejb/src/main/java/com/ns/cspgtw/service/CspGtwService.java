package com.ns.cspgtw.service;

import com.ns.cspgtw.service.activation.ActivationRequest;
import com.ns.cspgtw.service.activation.ActivationResponse;
import com.ns.cspgtw.service.activation.ActivationResponseBuilderFactory;
import com.ns.cspgtw.service.api.activationnotification.ActivationNotificationRequest;
import com.ns.cspgtw.service.api.activationnotification.ActivationNotificationResponse;
import com.ns.cspgtw.service.api.activationnotification.ActivationNotificationResponseBuilderFactory;
import com.ns.cspgtw.service.api.billing.BillingRequest;
import com.ns.cspgtw.service.api.billing.BillingResponse;
import com.ns.cspgtw.service.api.billing.BillingResponseBuilderFactory;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.api.deactivation.DeactivationRequest;
import com.ns.cspgtw.service.api.deactivation.DeactivationResponse;
import com.ns.cspgtw.service.api.deactivation.DeactivationResponseBuilderFactory;
import com.ns.cspgtw.service.refund.RefundRequest;
import com.ns.cspgtw.service.refund.RefundResponse;
import com.ns.cspgtw.service.refund.RefundResponseBuilderFactory;
import com.ns.cspgtw.service.retrieverefund.RetrieveRefundRequest;
import com.ns.cspgtw.service.retrieverefund.RetrieveRefundResponse;
import com.ns.cspgtw.service.retrieverefund.RetrieveRefundResponseBuilderFactory;
import com.ns.cspgtw.service.api.smscaringdelivery.SmsCaringDeliveryRequest;
import com.ns.cspgtw.service.api.smscaringdelivery.SmsCaringDeliveryResponse;
import com.ns.cspgtw.service.api.smscaringdelivery.SmsCaringDeliveryResponseBuilderFactory;
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
    
    @WebResult(name="activation_response", targetNamespace = "https://vas.cpgtwhub.mobi/activation")
    @WebMethod(operationName = "activation_request")
    public ActivationResponse activation(
            @XmlElement(required=true)
            @WebParam(name="activation_request", targetNamespace = "https://vas.cpgtwhub.mobi/activation")
                    ActivationRequest request
    ) {
        ActivationResponseBuilderFactory bf = new ActivationResponseBuilderFactory(new Resources(entityManager),request);
        return bf.getBuilder().build();
    }

    @WebResult(name="aa_receive_response", targetNamespace = "https://vas.cpgtwhub.mobi/aa_receive")
    @WebMethod(operationName = "aa_receive_request")
    public ActivationNotificationResponse aa_receive(
            @XmlElement(required=true)
            @WebParam(name="aa_receive_request", targetNamespace = "https://vas.cpgtwhub.mobi/aa_receive")
                    ActivationNotificationRequest request
    ) {
        ActivationNotificationResponseBuilderFactory bf = new ActivationNotificationResponseBuilderFactory(new Resources(entityManager),request);
        return bf.getBuilder().build();
    }

    @WebResult(name="deactivion_response", targetNamespace = "https://vas.cpgtwhub.mobi/deactivion")
    @WebMethod(operationName = "deactivion_request")
    public DeactivationResponse deactivion(
            @XmlElement(required=true)
            @WebParam(name="deactivion_request", targetNamespace = "https://vas.cpgtwhub.mobi/deactivion")
                    DeactivationRequest request
    ) {
        DeactivationResponseBuilderFactory bf = new DeactivationResponseBuilderFactory(new Resources(entityManager),request);
        return bf.getBuilder().build();
    }

    @WebResult(name="refund_response", targetNamespace = "https://vas.cpgtwhub.mobi/refund")
    @WebMethod(operationName = "refund_request")
    public RefundResponse refund(
            @XmlElement(required=true)
            @WebParam(name="refund_request", targetNamespace = "https://vas.cpgtwhub.mobi/refund")
                    RefundRequest request
    ) {
        RefundResponseBuilderFactory bf = new RefundResponseBuilderFactory(new Resources(entityManager),request);
        return bf.getBuilder().build();
    }

    @WebResult(name="retrievefund_response", targetNamespace = "https://vas.cpgtwhub.mobi/retrievefund")
    @WebMethod(operationName = "retrievefund_request")
    public RetrieveRefundResponse retrievefund(
            @XmlElement(required=true)
            @WebParam(name="retrievefund_request", targetNamespace = "https://vas.cpgtwhub.mobi/retrievefund")
                    RetrieveRefundRequest request
    ) {
        RetrieveRefundResponseBuilderFactory bf = new RetrieveRefundResponseBuilderFactory(new Resources(entityManager),request);
        return bf.getBuilder().build();
    }

    @WebResult(name="smscaring_response", targetNamespace = "https://vas.cpgtwhub.mobi/smscaring")
    @WebMethod(operationName = "smscaring_request")
    public SmsCaringDeliveryResponse smscaring(
            @XmlElement(required=true)
            @WebParam(name="smscaring_request", targetNamespace = "https://vas.cpgtwhub.mobi/smscaring")
                    SmsCaringDeliveryRequest request
    ) {
        SmsCaringDeliveryResponseBuilderFactory bf = new SmsCaringDeliveryResponseBuilderFactory(new Resources(entityManager),request);
        return bf.getBuilder().build();
    }
}
