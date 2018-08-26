package com.ns.cspgtw.proxylayer.timmobile.mpayunsubscribecustomer;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_unsubscribe_customer_response", namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayUnsubscribeCustomer")
@XmlType(name = "MPayUnsubscribeCustomerResponse", propOrder = {
        "resultCode",
        "operator"
})
public class MPayUnsubscribeCustomerResponse extends AbstractResponse {
    @XmlElement(name = "result_code", required = false, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayUnsubscribeCustomer")
    private String resultCode;
    @XmlElement(name = "operator", required = false, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPayUnsubscribeCustomer")
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
