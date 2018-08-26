package com.ns.cspgtw.service.mpaysendcaringmessage;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_send_caring_message_response")
@XmlType(name = "MPaySendCaringMessageResponse", propOrder = {
        "resultCode",
        "operator"
})
public class MPaySendCaringMessageResponse extends AbstractResponse {
    @XmlElement(name = "result_code", required = true)
    private String resultCode;
    @XmlElement(name = "operator", required = false)
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
