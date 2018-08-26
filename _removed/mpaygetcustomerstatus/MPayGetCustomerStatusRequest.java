package com.ns.cspgtw.service.mpaygetcustomerstatus;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_get_customer_status_request")
@XmlType(name = "BillingRequest", propOrder = {
        "merchantId",
        "msisdn"
})
public class MPayGetCustomerStatusRequest extends AbstractRequest {
    @XmlElement(name = "merchant_id", required = true)
    private String merchantId;
    @XmlElement(name = "msisdn", required = true)
    private String msisdn;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
}
