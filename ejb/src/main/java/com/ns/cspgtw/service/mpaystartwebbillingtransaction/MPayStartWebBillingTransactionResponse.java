package com.ns.cspgtw.service.mpaystartwebbillingtransaction;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_start_web_billing_transaction_response")
@XmlType(name = "MPayStartWebBillingTransactionResponse", propOrder = {
        "transactionId",
        "resultCode",
        "paymentUrl",
        "custom"
})
public class MPayStartWebBillingTransactionResponse extends AbstractResponse {
    @XmlElement(name = "transaction_id", required = false)
    private String transactionId;
    @XmlElement(name = "result_code", required = false)
    private String resultCode;
    @XmlElement(name = "payment_url", required = false)
    private String paymentUrl;
    @XmlElement(name = "custom", required = false)
    private String custom;

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

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }
}
