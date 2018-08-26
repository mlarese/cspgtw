package com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_split_billing_response", namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
@XmlType(name = "MPayTotalBillingResponse", propOrder = {
        "resultCode",
        "operator",
        "promoId",
})
public class MPayTotalBillingResponse extends AbstractResponse {
    @XmlElement(name = "result_code", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
    private String resultCode;
    @XmlElement(name = "operator", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
    private String operator;
    @XmlElement(name = "promo_id", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling")
    private String promoId;


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

    public String getPromoId() {
        return promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }
}
