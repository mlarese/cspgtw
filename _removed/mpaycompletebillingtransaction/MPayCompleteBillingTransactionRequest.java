package com.ns.cspgtw.service.mpaycompletebillingtransaction;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_complete_billing_transaction_request", namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayCompleteSubscribe")
@XmlType(name = "BillingRequest", propOrder = {
        "statusCode",
        "transactionId",
        "custom"
})
public class MPayCompleteBillingTransactionRequest extends AbstractRequest {
    @XmlElement(name = "transaction_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayCompleteSubscribe")
    private String transactionId;
    @XmlElement(name = "status_code", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayCompleteSubscribe")
    private String statusCode;
    @XmlElement(name = "custom", required = false, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayCompleteSubscribe")
    private String custom;


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) { this.custom = custom; }

}

