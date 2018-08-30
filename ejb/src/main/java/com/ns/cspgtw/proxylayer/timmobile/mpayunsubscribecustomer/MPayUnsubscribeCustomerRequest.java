package com.ns.cspgtw.proxylayer.timmobile.mpayunsubscribecustomer;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Request")
@XmlType(name = "MPayUnsubscribeCustomerRequest", propOrder = {
        "merchantId",
        "productId",
        "msisdn",
        "transactionId"
})
public class MPayUnsubscribeCustomerRequest extends AbstractRequest {
    @XmlElement(name = "TransactionId", required = true)
    private String transactionId;
    @XmlElement(name = "MerchantId", required = true)
    private String merchantId;
    @XmlElement(name = "ProductId", required = true)
    private String productId;
    @XmlElement(name = "MSISDN", required = true)
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
