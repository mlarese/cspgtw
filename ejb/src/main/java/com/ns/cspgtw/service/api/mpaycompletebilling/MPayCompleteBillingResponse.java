package com.ns.cspgtw.service.api.mpaycompletebilling;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "mpay_complete_billing_response", namespace = "https://vas.cpgtwhub.mobi/mpaycompletebilling")
@XmlType(name = "MPayCompleteBillingResponse", propOrder = {
        "statusCode",
        "resultCode",
        "msisdn"
})

public class MPayCompleteBillingResponse extends AbstractResponse {
    @XmlElement(name = "status_code", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaycompletebilling")
    private Integer statusCode;
    @XmlElement(name = "result_code", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaycompletebilling")
    private Integer resultCode;
    @XmlElement(name = "msisdn", required = true, namespace = "https://vas.cpgtwhub.mobi/mpaycompletebilling")
    private String msisdn;

    public MPayCompleteBillingResponse() {
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public MPayCompleteBillingResponse(Integer statusCode, Integer resultCode, String resDescription, String transactionId, String chargedAmount) {
        this.statusCode = statusCode;
        this.resultCode = resultCode;
        this.msisdn = msisdn;
    }
}
