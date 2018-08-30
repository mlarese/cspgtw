package com.ns.cspgtw.proxylayer.timmobile.mpayretrievemsisdn;

import com.ns.cspgtw.service.builder.AbstractResponse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Response")
@XmlType(name = "MPayRetrieveMsisdnResponse", propOrder = {
        "resultCode",
        "msisdn"
})
public class MPayRetrieveMsisdnResponse extends AbstractResponse {
    @XmlElement(name = "ResultCode", required = true)
    private String resultCode;
    @XmlElement(name = "MSISDN", required = true)
    private String msisdn;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
}
