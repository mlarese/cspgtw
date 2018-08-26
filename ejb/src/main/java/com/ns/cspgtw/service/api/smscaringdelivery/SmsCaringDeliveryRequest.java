package com.ns.cspgtw.service.api.smscaringdelivery;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "sms_caring_delivery_request", namespace = "https://vas.cpgtwhub.mobi/smscaring")
@XmlType(name = "SmsCaringDeliveryRequest", propOrder = {
        "cpId",
        "operatorId",
        "cpTransactionId",
        "msisdn",
        "body",
})
public class SmsCaringDeliveryRequest extends AbstractRequest {
    @XmlElement(name = "cp_id", required = true, namespace = "https://vas.cpgtwhub.mobi/smscaring")
    private Integer cpId;
    @XmlElement(name = "operator_id", required = true, namespace = "https://vas.cpgtwhub.mobi/smscaring")
    private String operatorId;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    @XmlElement(name = "cp_transaction_id", required = true, namespace = "https://vas.cpgtwhub.mobi/smscaring")
    private String cpTransactionId;
    @XmlElement(name = "msisdn", required = true, namespace = "https://vas.cpgtwhub.mobi/smscaring")
    private Integer msisdn;
    @XmlElement(name = "body", required = true, namespace = "https://vas.cpgtwhub.mobi/smscaring")
    private String body;
    @XmlElement(name = "service_id", required = true, namespace = "https://vas.cpgtwhub.mobi/smscaring")
    private Integer serviceId;
    @XmlElement(name = "token_id", required = true, namespace = "https://vas.cpgtwhub.mobi/smscaring")
    private Integer tokenId;


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getCpId() { return cpId; }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Integer getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(Integer msisdn) {
        this.msisdn = msisdn;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getCpTransactionId() {
        return cpTransactionId;
    }

    public void setCpTransactionId(String cpTransactionId) {
        this.cpTransactionId = cpTransactionId;
    }
}
