package com.ns.cspgtw.service.api.billingasynchresp;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Request")
public class BillingAsynchRespRequest extends AbstractRequest {
    @XmlElement(name = "mt_id", required = true)
    private Integer mtId;
    @XmlElement(name = "ar_errorcode", required = true)
    private String arErrorCode;
    @XmlElement(name = "mt_authcode", required = true)
    private String mtAuthCode;
    @XmlElement(name = "mt_target", required = true)
    private String mtTarget;

    public Integer getMtId() {
        return mtId;
    }

    public void setMtId(Integer mtId) {
        this.mtId = mtId;
    }

    public String getArErrorCode() {
        return arErrorCode;
    }

    public void setArErrorCode(String arErrorCode) {
        this.arErrorCode = arErrorCode;
    }

    public String getMtAuthCode() {
        return mtAuthCode;
    }

    public void setMtAuthCode(String mtAuthCode) {
        this.mtAuthCode = mtAuthCode;
    }

    public String getMtTarget() {
        return mtTarget;
    }

    public void setMtTarget(String mtTarget) {
        this.mtTarget = mtTarget;
    }

}
