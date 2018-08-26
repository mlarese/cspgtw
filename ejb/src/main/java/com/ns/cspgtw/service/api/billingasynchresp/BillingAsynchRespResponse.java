package com.ns.cspgtw.service.api.billingasynchresp;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "billing_asynch_resp_response")
public class BillingAsynchRespResponse extends AbstractResponse {
    private Integer resultCode;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }
}
