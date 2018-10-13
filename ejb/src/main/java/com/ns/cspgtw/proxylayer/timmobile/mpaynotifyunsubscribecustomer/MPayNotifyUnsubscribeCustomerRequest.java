package com.ns.cspgtw.proxylayer.timmobile.mpaynotifyunsubscribecustomer;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Request")
@XmlType(name = "MPayNotifyUnsubscribeCustomerRequest", propOrder = {
        "merchantId",
        "productId",
        "msisdn"
})
public class MPayNotifyUnsubscribeCustomerRequest extends AbstractRequest {
    @XmlElement(name = "MerchantId", required = true)
    private String merchantId;
    @XmlElement(name = "ProductId", required = true)
    private String productId;
    @XmlElement(name = "MSISDN", required = true)
    private String msisdn;


    public MPayNotifyUnsubscribeCustomerRequest() {
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
