package com.ns.cspgtw.proxylayer.timmobile.mpayunsubscribecustomer;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Response")
@XmlType(name = "MPayUnsubscribeCustomerResponse", propOrder = {
        "resultCode",
        "operator"
})
public class MPayUnsubscribeCustomerResponse extends AbstractResponse {
    @XmlElement(name = "ResultCode", required = false)
    private String resultCode;
    @XmlElement(name = "Operator", required = false)
    private String operator;


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
}
