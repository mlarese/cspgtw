package com.ns.cspgtw.service.api.retrievemsisdn;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "retrieve_msisdn_request")
@XmlType(name = "RetrieveMsisdnRequest", propOrder = {
        "operatorId",
        "transactionId"

})
public class RetrieveMsisdnRequest extends AbstractRequest {
    @XmlElement(name = "transaction_id", required = true)
    private String transactionId;
    @XmlElement(name = "operator_id", required = true)
    private String operatorId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public RetrieveMsisdnRequest() {
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
}
