package com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_split_billing_request", namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
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
    @XmlElement(name = "transaction_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
    private String transactionId;
    @XmlElement(name = "product_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
    private String productId;
    @XmlElement(name = "msisdn", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
    private String msisdn;
    @XmlElement(name = "transaction_type", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
    private String transactionType;
    @XmlElement(name = "merchant_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
    private String merchantId;
    @XmlElement(name = "promo_id", required = false, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
    private String promoId;
    @XmlElement(name = "notify_url", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
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
