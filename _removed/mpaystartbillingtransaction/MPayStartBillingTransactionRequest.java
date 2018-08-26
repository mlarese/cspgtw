package com.ns.cspgtw.service.mpaystartbillingtransaction;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_start_billing_transaction-request", namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayStartWebBillingTransaction")
@XmlType(name = "BillingRequest", propOrder = {
        "merchantId",
        "productId",
        "productDescription",
        "operator",
        "msisdn",
        "custom",
        "callBackUrl"
})
public class MPayStartBillingTransactionRequest extends AbstractRequest {
    @XmlElement(name = "merchant_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayStartWebBillingTransaction")
    private String merchantId;
    @XmlElement(name = "product_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayStartWebBillingTransaction")
    private String productId;
    @XmlElement(name = "product_description", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayStartWebBillingTransaction")
    private String productDescription;
    @XmlElement(name = "operator", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayStartWebBillingTransaction")
    private String operator;
    @XmlElement(name = "msisdn", required = false, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayStartWebBillingTransaction")
    private String msisdn;
    @XmlElement(name = "custom", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayStartWebBillingTransaction")
    private String custom;
    @XmlElement(name = "call_back_url", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayStartWebBillingTransaction")
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) { this.operator = operator; }

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

