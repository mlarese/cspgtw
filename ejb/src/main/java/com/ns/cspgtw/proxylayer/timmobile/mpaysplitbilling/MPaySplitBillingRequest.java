package com.ns.cspgtw.proxylayer.timmobile.mpaysplitbilling;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_split_billing_request", namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
@XmlType(name = "MPaySplitBillingRequest", propOrder = {
        "subTransactionId",
        "productId",
        "msisdn",
        "transactionId",
        "transactionType",
        "merchantId",
        "fractionId",
        "notifyUrl"
})
public class MPaySplitBillingRequest extends AbstractRequest {
    @XmlElement(name = "transaction_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
    private String transactionId;
    @XmlElement(name = "sub_transaction_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
    private String subTransactionId;
    @XmlElement(name = "product_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
    private String productId;
    @XmlElement(name = "msisdn", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
    private String msisdn;
    @XmlElement(name = "transaction_type", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
    private String transactionType;
    @XmlElement(name = "merchant_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
    private String merchantId;
    @XmlElement(name = "fraction_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
    private String fractionId;
    @XmlElement(name = "notify_url", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
    private String notifyUrl;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSubTransactionId() {
        return subTransactionId;
    }

    public void setSubTransactionId(String subTransactionId) {
        this.subTransactionId = subTransactionId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) { this.msisdn = msisdn; }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) { this.merchantId = merchantId; }

    public String getFractionId() {
        return fractionId;
    }

    public void setFractionId(String fractionId) { this.fractionId = fractionId; }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) { this.notifyUrl = notifyUrl; }

}
