package com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_start_web_billing_transaction_request")
@XmlType(name = "MPayStartWebBillingTransactionRequest", propOrder = {
        "merchantId",
        "productId",
        "msisdn",
        "productDescription",
        "custom",
        "callBackUrl"
})
public class MPayStartWebBillingTransactionRequest extends AbstractRequest {
    @XmlElement(name = "merchant_id", required = true)
    private String merchantId;
    @XmlElement(name = "product_id", required = true)
    private String productId;
    @XmlElement(name = "product_description", required = true)
    private String productDescription;
    @XmlElement(name = "plat_form_id", required = true)
    private String platFormId;
    @XmlElement(name = "msisdn", required = false)
    private String msisdn;
    @XmlElement(name = "custom", required = true)
    private String custom;
    @XmlElement(name = "call_back_url", required = true)
    private String callBackUrl;

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

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getPlatFormId() {
        return platFormId;
    }

    public void setPlatFormId(String platFormId) { this.platFormId = platFormId; }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) { this.msisdn = msisdn; }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) { this.custom = custom; }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) { this.callBackUrl = callBackUrl; }
}

