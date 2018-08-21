package com.ns.cspgtw.service.deactivation;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "deactivation_response", namespace = "https://vas.cpgtwhub.mobi/deactivion")
@XmlType(name = "DeactivationResponse", propOrder = {
        "statusCode",
        "resultCode",
        "resDescription",
        "transactionId"
})
public class DeactivationResponse extends AbstractResponse {
    @XmlElement(name = "status_code", required = true, namespace = "https://vas.cpgtwhub.mobi/deactivion")
    private Integer statusCode;
    @XmlElement(name = "result_code", required = true, namespace = "https://vas.cpgtwhub.mobi/deactivion")
    private Integer resultCode;
    @XmlElement(name = "res_description", required = true, namespace = "https://vas.cpgtwhub.mobi/deactivion")
    private String resDescription;
    @XmlElement(name = "transaction_id", required = true, namespace = "https://vas.cpgtwhub.mobi/deactivion")
    private String transactionId;

    public Integer getStatusCode() {
        return statusCode;
    }

    public DeactivationResponse(Integer statusCode, Integer resultCode, String resDescription, String transactionId) {
        this.statusCode = statusCode;
        this.resultCode = resultCode;
        this.resDescription = resDescription;
        this.transactionId = transactionId;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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
