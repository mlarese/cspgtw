package com.ns.cspgtw.service.api.smscaringdelivery;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "sms_caring_delivery_response", namespace = "https://vas.cpgtwhub.mobi/smscaring")
@XmlType(name = "SmsCaringDeliveryResponse", propOrder = {
        "statusCode",
        "resultCode",
        "resDescription",
        "gtwTransactionId"
})
public class SmsCaringDeliveryResponse extends AbstractResponse {
    @XmlElement(name = "status_code", required = true, namespace = "https://vas.cpgtwhub.mobi/smscaring")
    private Integer statusCode;
    @XmlElement(name = "result_code", required = true, namespace = "https://vas.cpgtwhub.mobi/smscaring")
    private Integer resultCode;
    @XmlElement(name = "res_description", required = true, namespace = "https://vas.cpgtwhub.mobi/smscaring")
    private String resDescription;
    @XmlElement(name = "gtw_transaction", required = true, namespace = "https://vas.cpgtwhub.mobi/smscaring")
    private String gtwTransactionId;

    public SmsCaringDeliveryResponse(Integer statusCode, Integer resultCode, String resDescription, String gtwTransactionId) {
        this.statusCode = statusCode;
        this.resultCode = resultCode;
        this.resDescription = resDescription;
        this.gtwTransactionId = gtwTransactionId;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getGtwTransactionId() {
        return gtwTransactionId;
    }

    public void setGtwTransactionId(String gtwTransactionId) {
        this.gtwTransactionId = gtwTransactionId;
    }

    public String getResDescription() {
        return resDescription;
    }

    public void setResDescription(String resDescription) {
        this.resDescription = resDescription;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }
}
