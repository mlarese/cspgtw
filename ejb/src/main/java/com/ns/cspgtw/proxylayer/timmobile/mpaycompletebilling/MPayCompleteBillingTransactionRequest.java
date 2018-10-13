package com.ns.cspgtw.proxylayer.timmobile.mpaycompletebilling;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Request")
@XmlType(name = "MPayCompleteBillingTransactionRequest", propOrder = {
        "statusCode",
        "transactionId",
        "custom"
})
public class MPayCompleteBillingTransactionRequest extends AbstractRequest {
    @XmlElement(name = "TransactionId", required = true)
    private String transactionId;
    @XmlElement(name = "StatusCode", required = true)
    private String statusCode;
    @XmlElement(name = "Custom", required = false)
    private String custom;

    public MPayCompleteBillingTransactionRequest() {
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) { this.custom = custom; }

}

