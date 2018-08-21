package com.ns.cspgtw.proxylayer.wind;

import com.ns.cspgtw.proxylayer.AbstractProxyInvokerDTO;

public class intProv03DTO extends AbstractProxyInvokerDTO {

    public void reset() {
        this
                .setArErrorcode(0)
                .setMtAuthcode("")
                .setMtId("")
                .setMtTarget("");
    }

    public String getMtId() {
        return (String) this.get("mt_id");
    }
    
    public intProv03DTO setMtId(String mtId) {
        this.put("mt_id", mtId);
        return this;
    }

    public Integer getArErrorcode() {
        return new Integer (this.get("ar_errorcode"));
    }

    public intProv03DTO setArErrorcode(Integer arErrorcode) {
        this.put("ar_errorcode", arErrorcode.toString());
        return this;
    }
    public String getMtAuthcode() {
        return (String) this.get("mt_authcode");
    }

    public intProv03DTO setMtAuthcode(String mtAuthcode) {
        this.put("mt_authcode", mtAuthcode);
        return this;
    }

    public String getMtTarget() {
        return (String) this.get("mt_target");
    }

    public intProv03DTO setMtTarget(String mtTarget) {
        this.put("mt_target", mtTarget);
        return this;
    }
}
