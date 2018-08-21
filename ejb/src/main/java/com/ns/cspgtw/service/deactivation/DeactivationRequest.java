package com.ns.cspgtw.service.deactivation;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "deactivation_request", namespace = "https://vas.cpgtwhub.mobi/deactivion")
@XmlType(name = "DeactivationRequest", propOrder = {
        "cpId",
        "serviceId",
        "tokenId",
        "msisdn",
        "operatorId",
        "transactionId",
        "authorizationId"
})
public class DeactivationRequest extends AbstractRequest {
    @XmlElement(name = "cp_id", required = true, namespace = "https://vas.cpgtwhub.mobi/deactivion")
    private Integer cpId;
    @XmlElement(name = "service_id", required = true, namespace = "https://vas.cpgtwhub.mobi/deactivion")
    private Integer serviceId;
    @XmlElement(name = "token_id", required = true, namespace = "https://vas.cpgtwhub.mobi/deactivion")
    private Integer tokenId;
    @XmlElement(name = "msisdn", required = true, namespace = "https://vas.cpgtwhub.mobi/deactivion")
    private Integer msisdn;
    @XmlElement(name = "operator_id", required = true, namespace = "https://vas.cpgtwhub.mobi/deactivion")
    private String operatorId;
    @XmlElement(name = "transaction_id", required = true, namespace = "https://vas.cpgtwhub.mobi/deactivion")
    private String transactionId;
    @XmlElement(name = "authorization_id", required = true, namespace = "https://vas.cpgtwhub.mobi/deactivion")
    private String authorizationId;

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
    }
}
