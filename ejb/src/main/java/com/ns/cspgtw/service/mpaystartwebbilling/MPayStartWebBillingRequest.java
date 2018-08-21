package com.ns.cspgtw.service.mpaystartwebbilling;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_start_web_billing_request")
public class MPayStartWebBillingRequest extends AbstractRequest {
    @XmlElement(name = "cp_id", required = true)
    private Integer cpId;

    @XmlElement(name = "token_id", required = true)
    private Integer tokenId;

    @XmlElement(name = "operator_id", required = true)
    private String operatorId;

    @XmlElement(name = "service_id", required = true)
    private Integer serviceId;

    @XmlElement(name = "product_description", required = true)
    private String productDescription;

    @XmlElement(name = "msisdn", required = true)
    private String msisdn;

    @XmlElement(name = "callback_url", required = true)
    private String callbackUrl;

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
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

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

}
