package com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Response")
@XmlType(name = "MPayStartWebBillingTransactionResponse", propOrder = {
        "transactionId",
        "resultCode",
        "paymentUrl",
        "statusCode"
})
public class MPayStartWebBillingTransactionResponse extends AbstractResponse {
    @XmlElement(name = "TransactionId", required = false)
    private String transactionId;
    @XmlElement(name = "ResultCode", required = true)
    private String resultCode;
    @XmlElement(name = "PaymentUrl", required = false)
    private String paymentUrl;
    @XmlElement(name = "StatusCode", required = false)
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
