package com.ns.cspgtw.service.mpaysubscriptionrenewal;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_subscription_renewal_request")
@XmlType(name = "MPaySubscriptionRenewalRequest", propOrder = {
        "merchantId",
        "productId",
        "msisdn",
        "transactionId",
        "notifyUrl"
})
public class MPaySubscriptionRenewalRequest extends AbstractRequest {
    @XmlElement(name = "transaction_id", required = true)
    private String transactionId;
    @XmlElement(name = "merchant_id", required = true)
    private String merchantId;
    @XmlElement(name = "product_id", required = true)
    private String productId;
    @XmlElement(name = "msisdn", required = true)
    private String msisdn;
    @XmlElement(name = "notify_url", required = false)
    private String notifyUrl;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
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

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}
