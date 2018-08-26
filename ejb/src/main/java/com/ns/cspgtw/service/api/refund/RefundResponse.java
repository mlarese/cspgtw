package com.ns.cspgtw.service.api.refund;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "refund_response", namespace = "https://vas.cpgtwhub.mobi/refund")
@XmlType(name = "RefundResponse", propOrder = {
        "statusCode",
        "resultCode",
        "resDescription",
        "transactionId",
        "authorizationId"
})
public class RefundResponse extends AbstractResponse {
    @XmlElement(name = "status_code", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private Integer statusCode;
    @XmlElement(name = "result_code", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private Integer resultCode;
    @XmlElement(name = "res_description", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String resDescription;
    @XmlElement(name = "transaction_id", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String transactionId;
    @XmlElement(name = "authorization_id", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String authorizationId;

    public Integer getStatusCode() {
        return statusCode;
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

    public String getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
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
