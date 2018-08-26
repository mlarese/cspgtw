package com.ns.cspgtw.service.mpaystartbillingtransaction;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_complete_billing")
@XmlType(name = "MPayStartBillingTransactionResponse", propOrder = {
        "transactionId",
        "resultCode",
        "identificationUrl",
        "promoId",
        "custom"
})
public class MPayStartBillingTransactionResponse extends AbstractResponse {
    @XmlElement(name = "transaction_id", required = true)
    private String transactionId;
    @XmlElement(name = "result_code", required = true)
    private String resultCode;
    @XmlElement(name = "identification_url", required = true)
    private String identificationUrl;
    @XmlElement(name = "custom", required = false)
    private String custom;
    @XmlElement(name = "promo_id", required = false)
    private String promoId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getIdentificationUrl() {
        return identificationUrl;
    }

    public void setIdentificationUrl(String paymentUrl) {
        this.identificationUrl = identificationUrl;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getPromoId() {
        return promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }
}
