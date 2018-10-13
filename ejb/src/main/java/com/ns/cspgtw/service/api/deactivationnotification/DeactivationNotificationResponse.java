package com.ns.cspgtw.service.api.deactivationnotification;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Response")
@XmlType(name = "DeactivationNotificationResponse", propOrder = {
        "resultCode"
})

public class DeactivationNotificationResponse extends AbstractResponse {
    private int resultCode;

    public DeactivationNotificationResponse() {
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }
}
