package com.ns.cspgtw.proxylayer.timmobile.mpaycompletebilling;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Response")
@XmlType(name = "MPayCompleteBillingTransactionResponse", propOrder = {
        "resultCode",
        "msisdn",
        "operator",
        "promoId",
        "custom"
})
public class MPayCompleteBillingTransactionResponse extends AbstractResponse {
    @XmlElement(name = "MSISDN", required = true)
    private String msisdn;
    @XmlElement(name = "ResultCode", required = true)
    private String resultCode;
    @XmlElement(name = "Operator", required = true)
    private String operator;
    @XmlElement(name = "Custom", required = false)
    private String custom;
    @XmlElement(name = "PromoID", required = false)
    private String promoId;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
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
