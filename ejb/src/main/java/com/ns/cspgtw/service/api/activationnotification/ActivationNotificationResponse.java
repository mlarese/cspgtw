package com.ns.cspgtw.service.api.activationnotification;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "activation_notification_response", namespace = "https://vas.cpgtwhub.mobi/aa_receive")
@XmlType(name = "ActivationNotificationResponse", propOrder = {
        "resultCode"
})
public class ActivationNotificationResponse extends AbstractResponse {
    @XmlElement(name = "result_code", required = true, namespace = "https://vas.cpgtwhub.mobi/aa_receive")
    private Integer resultCode;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }
}
