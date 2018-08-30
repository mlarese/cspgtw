package com.ns.cspgtw.proxylayer.timmobile.mpaysplitbilling;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Request")
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
    @XmlElement(name = "TransactionID", required = true)
    private String transactionId;
    @XmlElement(name = "SubTransactionID", required = true)
    private String subTransactionId;
    @XmlElement(name = "ProductID", required = true)
    private String productId;
    @XmlElement(name = "MSISDN", required = true)
    private String msisdn;
    @XmlElement(name = "TransactionType", required = true)
    private String transactionType;
    @XmlElement(name = "MerchantID", required = true)
    private String merchantId;
    @XmlElement(name = "FractionID", required = true)
    private String fractionId;
    @XmlElement(name = "NotifyURL", required = true)
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
