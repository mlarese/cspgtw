package com.ns.cspgtw.service.mpaysendcaringmessage;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_sending_caring_message_request")
@XmlType(name = "MPayStartWebBillingTransactionRequest", propOrder = {
        "merchantId",
        "productId",
        "msisdn",
        "messageType",
        "messageValue",
        "transactionId"
})
public class MPaySendCaringMessageRequest extends AbstractRequest {
    @XmlElement(name = "transaction_id", required = true)
    private String transactionId;
    @XmlElement(name = "merchant_id", required = true)
    private String merchantId;
    @XmlElement(name = "product_id", required = true)
    private String productId;
    @XmlElement(name = "message_type", required = true)
    private String messageType;
    @XmlElement(name = "message_value", required = false)
    private String messageValue;
    @XmlElement(name = "msisdn", required = true)
    private String msisdn;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageValue() {
        return messageValue;
    }

    public void setMessageValue(String messageValue) {
        this.messageValue = messageValue;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) { this.msisdn = msisdn; }

}
