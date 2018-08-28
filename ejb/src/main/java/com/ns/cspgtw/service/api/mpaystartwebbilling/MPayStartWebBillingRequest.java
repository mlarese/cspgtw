package com.ns.cspgtw.service.api.mpaystartwebbilling;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_start_web_billing_request", namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
@XmlType(name = "MPayStartWebBillingRequest", propOrder = {
        "cpId",
        "tokenId",
        "msisdn",
        "productDescription",
        "serviceId",
        "callBackUrl",
        "operatorId"
})
public class MPayStartWebBillingRequest extends AbstractRequest {
    @XmlElement(name = "cp_id", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String cpId;
    @XmlElement(name = "token_id", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String tokenId;
    @XmlElement(name = "product_description", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String productDescription;
    @XmlElement(name = "plat_form_id", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String platFormId;
    @XmlElement(name = "msisdn", required = false, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String msisdn;
    @XmlElement(name = "service_id", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String serviceId;
    @XmlElement(name = "call_back_url", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String callBackUrl;
    @XmlElement(name = "operator_id", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String operatorId;

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
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

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) { this.serviceId = serviceId; }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) { this.callBackUrl = callBackUrl; }
}

