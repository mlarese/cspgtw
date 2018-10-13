package com.ns.cspgtw.service.api.activationnotification;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "activation_notification_request", namespace = "https://vas.cpgtwhub.mobi/aa_receive")
@XmlType(name = "ActivationNotificationRequest", propOrder = {
        "mtId",
        "arErrorCode",
        "mtAuthCode",
        "mtTarget"
})
public class ActivationNotificationRequest extends AbstractRequest {
    @XmlElement(name = "mt_id", required = true, namespace = "https://vas.cpgtwhub.mobi/aa_receive")
    private Integer mtId;
    @XmlElement(name = "ar_errorcode", required = true, namespace = "https://vas.cpgtwhub.mobi/aa_receive")
    private String arErrorCode;
    @XmlElement(name = "mt_authcode", required = true, namespace = "https://vas.cpgtwhub.mobi/aa_receive")
    private String mtAuthCode;
    @XmlElement(name = "mt_target", required = true, namespace = "https://vas.cpgtwhub.mobi/aa_receive")
    private String mtTarget;

    public ActivationNotificationRequest() {
    }

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
