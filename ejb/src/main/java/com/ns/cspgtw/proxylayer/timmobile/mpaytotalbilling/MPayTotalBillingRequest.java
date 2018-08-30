package com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Request")
@XmlType(name = "MPayTotalBillingRequest", propOrder = {
        "productId",
        "msisdn",
        "transactionId",
        "transactionType",
        "merchantId",
        "promoId",
        "notifyUrl"
})
public class MPayTotalBillingRequest extends AbstractRequest {
    @XmlElement(name = "TransactionID", required = true)
    private String transactionId;
    @XmlElement(name = "ProductID", required = true)
    private String productId;
    @XmlElement(name = "MSISDN", required = true)
    private String msisdn;
    @XmlElement(name = "TransactionType", required = true)
    private String transactionType;
    @XmlElement(name = "MerchantID", required = true)
    private String merchantId;
    @XmlElement(name = "PromoID", required = false)
    private String promoId;
    @XmlElement(name = "NotifyURL", required = true)
    private String notifyUrl;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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

    public String getPromoId() {
        return promoId;
    }

    public void setPromoId(String promoId) { this.productId = promoId; }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) { this.notifyUrl = notifyUrl; }

}
