package com.ns.cspgtw.proxylayer.wind;

import com.ns.cspgtw.proxylayer.AbstractProxyInvokerDTO;

public class IntProv03DTO extends AbstractProxyInvokerDTO {
    public static final String url = "https://windhub.purebros.it/cprovider/cdeliver";

    public IntProv03DTO() {
        super(IntProv03DTO.url);
    }

    public IntProv03DTO(String url) {
        super(url);
    }

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

    public IntProv03DTO setMtId(String mtId) {
        this.put("mt_id", mtId);
        return this;
    }

    public IntProv03DTO setMtId(Integer mtId) {
        this.put("mt_id", mtId.toString());
        return this;
    }

    public Integer getArErrorcode() {
        return new Integer (this.get("ar_errorcode"));
    }

    public IntProv03DTO setArErrorcode(Integer arErrorcode) {
        this.put("ar_errorcode", arErrorcode.toString());
        return this;
    }
    public IntProv03DTO setArErrorcode(String arErrorcode) {
        this.put("ar_errorcode", arErrorcode);
        return this;
    }

    public String getMtAuthcode() {
        return (String) this.get("mt_authcode");
    }

    public IntProv03DTO setMtAuthcode(String mtAuthcode) {
        this.put("mt_authcode", mtAuthcode);
        return this;
    }

    public String getMtTarget() {
        return (String) this.get("mt_target");
    }

    public IntProv03DTO setMtTarget(String mtTarget) {
        this.put("mt_target", mtTarget);
        return this;
    }
}
