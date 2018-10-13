package com.ns.cspgtw.proxylayer.timmobile.mpaysplitbilling;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Response")
@XmlType(name = "MPaySplitBillingResponse", propOrder = {
        "resultCode",
        "operator",
        "subTotal",
})
public class MPaySplitBillingResponse extends AbstractResponse {
    @XmlElement(name = "ResultCode", required = true)
    private String resultCode;
    @XmlElement(name = "Operator", required = true)
    private String operator;
    @XmlElement(name = "SubTotal", required = true)
    private String subTotal;

    public MPaySplitBillingResponse() {
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

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }
}
