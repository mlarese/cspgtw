package com.ns.cspgtw.proxylayer.timmobile.mpayunsubscribecustomer;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_unsubscribe_customer_request", namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayUnsubscribeCustomer")
@XmlType(name = "MPayUnsubscribeCustomerRequest", propOrder = {
        "merchantId",
        "productId",
        "msisdn",
        "transactionId"
})
public class MPayUnsubscribeCustomerRequest extends AbstractRequest {
    @XmlElement(name = "transaction_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayUnsubscribeCustomer")
    private String transactionId;
    @XmlElement(name = "merchant_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayUnsubscribeCustomer")
    private String merchantId;
    @XmlElement(name = "product_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayUnsubscribeCustomer")
    private String productId;
    @XmlElement(name = "msisdn", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayUnsubscribeCustomer")
    private String msisdn;

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

    public void setMsisdn(String msisdn) { this.msisdn = msisdn; }

}
