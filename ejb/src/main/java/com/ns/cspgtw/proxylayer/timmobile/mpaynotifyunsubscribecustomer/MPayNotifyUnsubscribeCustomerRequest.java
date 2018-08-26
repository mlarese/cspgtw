package com.ns.cspgtw.proxylayer.timmobile.mpaynotifyunsubscribecustomer;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_unsubscribe_customer_request", namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayNotifyUnsubscribeCustomer")
@XmlType(name = "MPayNotifyUnsubscribeCustomerRequest", propOrder = {
        "merchantId",
        "productId",
        "msisdn"
})
public class MPayNotifyUnsubscribeCustomerRequest extends AbstractRequest {
    @XmlElement(name = "merchant_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayNotifyUnsubscribeCustomer")
    private String merchantId;
    @XmlElement(name = "product_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayNotifyUnsubscribeCustomer")
    private String productId;
    @XmlElement(name = "msisdn", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayNotifyUnsubscribeCustomer")
    private String msisdn;


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
