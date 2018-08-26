package com.ns.cspgtw.proxylayer.timmobile.mpayretrievemsisdn;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "m_pay_start_web_billing_transaction_request")
@XmlType(name = "MPayRetrieveMsisdnRequest", propOrder = {
        "transactionId",
        "custom"
})
public class MPayRetrieveMsisdnRequest extends AbstractRequest {
    @XmlElement(name = "transaction_id", required = true)
    private String transactionId;
    @XmlElement(name = "custom", required = true)
    private String custom;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) { this.custom = custom; }

}
