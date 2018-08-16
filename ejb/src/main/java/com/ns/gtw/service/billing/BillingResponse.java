package com.ns.gtw.service.billing;

import com.ns.gtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "billing_response", namespace = "https://vas.cpgtwhub.mobi/billing")
@XmlType(name = "", propOrder = {
        "statusCode",
        "resultCode",
        "resDescription",
        "transactionId",
        "chargedAmount"
})

public class BillingResponse extends AbstractResponse {
    @XmlElement(name = "status_code", required = true, namespace = "https://vas.cpgtwhub.mobi/billing")
    private Integer statusCode;
    @XmlElement(name = "result_code", required = true, namespace = "https://vas.cpgtwhub.mobi/billing")
    private Integer resultCode;
    @XmlElement(name = "res_description", required = true, namespace = "https://vas.cpgtwhub.mobi/billing")
    private String resDescription;
    @XmlElement(name = "transaction_id", required = true, namespace = "https://vas.cpgtwhub.mobi/billing")
    private String transactionId;
    @XmlElement(name = "charged_amount", required = true, namespace = "https://vas.cpgtwhub.mobi/billing")
    private String chargedAmount;

    public BillingResponse() {
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getResDescription() {
        return resDescription;
    }

    public void setResDescription(String resDescription) {
        this.resDescription = resDescription;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getChargedAmount() {
        return chargedAmount;
    }

    public void setChargedAmount(String chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public BillingResponse(Integer statusCode, Integer resultCode, String resDescription, String transactionId, String chargedAmount) {
        this.statusCode = statusCode;
        this.resultCode = resultCode;
        this.resDescription = resDescription;
        this.transactionId = transactionId;
        this.chargedAmount = chargedAmount;
    }
}
