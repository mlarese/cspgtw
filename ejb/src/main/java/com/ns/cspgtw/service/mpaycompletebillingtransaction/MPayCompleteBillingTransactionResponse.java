package com.ns.cspgtw.service.mpaycompletebillingtransaction;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_complete_billing_transaction_response" , namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayCompleteSubscribe")
@XmlType(name = "MPayCompleteBillingTransactionResponse", propOrder = {
        "resultCode",
        "msisdn",
        "operator",
        "promoId",
        "custom"
})
public class MPayCompleteBillingTransactionResponse extends AbstractResponse {
    @XmlElement(name = "msisdn", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayCompleteSubscribe")
    private String msisdn;
    @XmlElement(name = "result_code", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayCompleteSubscribe")
    private String resultCode;
    @XmlElement(name = "operator", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayCompleteSubscribe")
    private String operator;
    @XmlElement(name = "custom", required = false, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayCompleteSubscribe")
    private String custom;
    @XmlElement(name = "promoId", required = false, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayCompleteSubscribe")
    private String promoId;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String transactionId) {
        this.msisdn = msisdn;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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

    public String getPromoId() {
        return promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }
}
