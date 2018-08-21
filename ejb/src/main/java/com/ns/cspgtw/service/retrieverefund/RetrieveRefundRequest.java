package com.ns.cspgtw.service.retrieverefund;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "retrieve_refund_request", namespace = "https://vas.cpgtwhub.mobi/retrievefund")
@XmlType (name = "RetrieveFundRequest", propOrder = {
        "cpId",
        "tokenId",
        "serviceId",
        "msisdn",
        "operatorId",
        "transactionId"
})
public class RetrieveRefundRequest extends AbstractRequest {
    @XmlElement(name = "cp_id", required = true, namespace = "https://vas.cpgtwhub.mobi/retrievefund")
    private Integer cpId;
    @XmlElement(name = "token_id", required = true, namespace = "https://vas.cpgtwhub.mobi/retrievefund")
    private Integer tokenId;
    @XmlElement(name = "service_id", required = true, namespace = "https://vas.cpgtwhub.mobi/retrievefund")
    private Integer serviceId;
    @XmlElement(name = "msisdn", required = true, namespace = "https://vas.cpgtwhub.mobi/retrievefund")
    private Integer msisdn;
    @XmlElement(name = "operator_id", required = true, namespace = "https://vas.cpgtwhub.mobi/retrievefund")
    private String operatorId;
    @XmlElement(name = "transaction_id", required = true, namespace = "https://vas.cpgtwhub.mobi/retrievefund")
    private String transactionId;

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(Integer msisdn) {
        this.msisdn = msisdn;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
