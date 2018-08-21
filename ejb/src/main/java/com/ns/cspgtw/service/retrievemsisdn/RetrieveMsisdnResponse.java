package com.ns.cspgtw.service.retrievemsisdn;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "retrieve_msisdn_response")
@XmlType(name = "RetrieveMsisdnResponse", propOrder = {
        "statusCode",
        "resultCode",
        "msisdn"
})
public class RetrieveMsisdnResponse  extends  AbstractResponse{
    private Integer statusCode;
    private Integer resultCode;
    private String msisdn;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getResultCode() {
        return getStatusCode();
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
}
