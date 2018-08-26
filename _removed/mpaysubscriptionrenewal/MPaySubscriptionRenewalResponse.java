package com.ns.cspgtw.service.mpaysubscriptionrenewal;

import com.ns.cspgtw.service.builder.AbstractRequest;
import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_subscription_renewal_response")
@XmlType(name = "MPaySubscriptionRenewalResponse", propOrder = {
        "resultCode",
        "operator",
        "promoId"
})
public class MPaySubscriptionRenewalResponse extends AbstractRequest {
    @XmlElement(name = "operator", required = true)
    private String operator;
    @XmlElement(name = "result_code", required = true)
    private String resultCode;
    @XmlElement(name = "promo_id", required = false)
    private String promoId;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getPromoId() {
        return promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }
}
