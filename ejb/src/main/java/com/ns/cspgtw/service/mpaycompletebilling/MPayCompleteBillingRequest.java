package com.ns.cspgtw.service.mpaycompletebilling;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_complete_billing_request")
public class MPayCompleteBillingRequest extends AbstractRequest {
    @XmlElement(name = "cp_id", required = true)
    private Integer cpId;
    @XmlElement(name = "status_code", required = true)
    private Integer statusCode;
    @XmlElement(name = "token_id", required = true)
    private Integer tokenId;
    @XmlElement(name = "operator_id", required = true)
    private String operatorId;
    @XmlElement(name = "transaction_id", required = true)
    private String transactionId;

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
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
}
