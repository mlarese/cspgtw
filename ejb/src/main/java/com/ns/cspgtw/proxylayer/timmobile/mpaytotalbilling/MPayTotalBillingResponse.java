package com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Response")
@XmlType(name = "MPayTotalBillingResponse", propOrder = {
        "resultCode",
        "operator",
        "promoId",
})
public class MPayTotalBillingResponse extends AbstractResponse {
    @XmlElement(name = "ResultCode", required = true)
    private String resultCode;
    @XmlElement(name = "Operator", required = true)
    private String operator;
    @XmlElement(name = "PromoID", required = true)
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
