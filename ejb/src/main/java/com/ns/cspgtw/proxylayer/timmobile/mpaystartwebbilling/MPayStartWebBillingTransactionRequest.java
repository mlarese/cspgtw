package com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Request")
@XmlType(name = "MPayStartWebBillingTransactionRequest", propOrder = {
        "merchantId",
        "productId",
        "msisdn",
        "productDescription",
        "custom",
        "callBackUrl"
})
public class MPayStartWebBillingTransactionRequest extends AbstractRequest {
    @XmlElement(name = "MerchantId", required = true)
    private String merchantId;
    @XmlElement(name = "ProdcutId", required = true)
    private String productId;
    @XmlElement(name = "ProductDescription", required = true)
    private String productDescription;
    @XmlElement(name = "PlatFormId", required = true)
    private String platFormId;
    @XmlElement(name = "MSISDN", required = false)
    private String msisdn;
    @XmlElement(name = "Custom", required = true)
    private String custom;
    @XmlElement(name = "CallBackUrl", required = true)
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

    public MPayStartWebBillingTransactionRequest() {
    }

    public void setCustom(String custom) { this.custom = custom; }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) { this.callBackUrl = callBackUrl; }
}

