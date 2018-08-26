package com.ns.cspgtw.service.api.mpaycompletebilling;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "mpay_complete_billing_request", namespace = "https://vas.cpgtwhub.mobi/mpaycompletebilling")
@XmlType(name = "MPayCompleteBillingRequest", propOrder = {
        "cpId",
        "tokenId",
        "operatorId",
        "transactionId",
        "operatorId",
        "statusCode"
})
public class MPayCompleteBillingRequest extends AbstractRequest {
    @XmlElement(name = "cp_id", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaycompletebilling")
    private Integer cpId;
    @XmlElement(name = "token_id", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaycompletebilling")
    private Integer tokenId;
    @XmlElement(name = "status_code", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaycompletebilling")
    private Integer statusCode;
    @XmlElement(name = "operator_id", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaycompletebilling")
    private String operatorId;
    @XmlElement(name = "transaction_id", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaycompletebilling")
    private String transactionId;


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }



}
