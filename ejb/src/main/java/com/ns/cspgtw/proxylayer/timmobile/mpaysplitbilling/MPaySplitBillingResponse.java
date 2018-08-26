package com.ns.cspgtw.proxylayer.timmobile.mpaysplitbilling;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_split_billing_response", namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
@XmlType(name = "MPaySplitBillingResponse", propOrder = {
        "resultCode",
        "operator",
        "subTotal",
})
public class MPaySplitBillingResponse extends AbstractResponse {
    @XmlElement(name = "result_code", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
    private String resultCode;
    @XmlElement(name = "operator", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
    private String operator;
    @XmlElement(name = "sub_total", required = true, namespace = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling")
    private String subTotal;


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

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }
}
