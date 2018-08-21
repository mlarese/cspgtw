package com.ns.cspgtw.service.billing;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "billing_request", namespace = "https://vas.cpgtwhub.mobi/billing")
@XmlType(name = "BillingRequest", propOrder = {
        "cpId",
        "tokenId",
        "operatorId",
        "transactionId",
        "autorizationId",
        "msisdn",
        "billingId",
        "amount",
        "minAmount",
        "transactionType",
        "mobilePay",
        "subTransactionId",
        "serviceId"
})
public class BillingRequest extends AbstractRequest {
    @XmlElement(name = "cp_id", required = true, namespace = "https://vas.cpgtwhub.mobi/billing")
    private Integer cpId;
    @XmlElement(name = "token_id", required = true, namespace = "https://vas.cpgtwhub.mobi/billing")
    private Integer tokenId;
    @XmlElement(name = "autorization_id", required = true, namespace = "https://vas.cpgtwhub.mobi/billing")
    private Integer autorizationId;
    @XmlElement(name = "msisdn", required = true, namespace = "https://vas.cpgtwhub.mobi/billing")
    private Integer msisdn;
    @XmlElement(name = "billing_id", required = false, namespace = "https://vas.cpgtwhub.mobi/billing")
    private Integer billingId;
    @XmlElement(name = "operator_id", required = true, namespace = "https://vas.cpgtwhub.mobi/billing")
    private Integer operatorId;
    @XmlElement(name = "transaction_id", required = true, namespace = "https://vas.cpgtwhub.mobi/billing")
    private String transactionId;
    @XmlElement(name = "amount", required = false, namespace = "https://vas.cpgtwhub.mobi/billing")
    private String amount;
    @XmlElement(name = "min_amount", required = false, namespace = "https://vas.cpgtwhub.mobi/billing")
    private String minAmount;

    @XmlElement(name = "transaction_type", required = false, namespace = "https://vas.cpgtwhub.mobi/billing")
    private String transactionType;

    @XmlElement(name = "mobile_pay", required = false, namespace = "https://vas.cpgtwhub.mobi/billing")
    private Integer mobilePay;

    @XmlElement(name = "sub_transaction_id", required = false, namespace = "https://vas.cpgtwhub.mobi/billing")
    private String subTransactionId;

    @XmlElement(name = "service_id", required = false, namespace = "https://vas.cpgtwhub.mobi/billing")
    private Integer serviceId;


    public Integer getOperatorId() {
        return operatorId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }



    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getMobilePay() {
        return mobilePay;
    }

    public void setMobilePay(Integer mobilePay) {
        this.mobilePay = mobilePay;
    }

    public String getSubTransactionId() {
        return subTransactionId;
    }

    public void setSubTransactionId(String subTransactionId) {
        this.subTransactionId = subTransactionId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

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

    public Integer getAutorizationId() {
        return autorizationId;
    }

    public void setAutorizationId(Integer autorizationId) {
        this.autorizationId = autorizationId;
    }

    public Integer getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(Integer msisdn) {
        this.msisdn = msisdn;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }


}
