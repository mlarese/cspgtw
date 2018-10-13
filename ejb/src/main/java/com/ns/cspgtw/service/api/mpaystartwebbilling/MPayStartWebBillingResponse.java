package com.ns.cspgtw.service.api.mpaystartwebbilling;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_start_web_billing_response", namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
@XmlType(name = "MPayStartWebBillingResponse", propOrder = {
        "transactionId",
        "resultCode",
        "paymentUrl",
        "statusCode"
})
public class MPayStartWebBillingResponse extends AbstractResponse {
    @XmlElement(name = "transaction_id", required = false, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String transactionId;
    @XmlElement(name = "result_code", required = false, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String resultCode;
    @XmlElement(name = "payment_url", required = false, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String paymentUrl;

    public MPayStartWebBillingResponse() {
    }

    @XmlElement(name = "status_code", required = false, namespace = "https://vas.cpgtwhub.mobi/mpaystartwebbilling")
    private String statusCode;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentUrl() {
        return paymentUrl;
    }

    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
