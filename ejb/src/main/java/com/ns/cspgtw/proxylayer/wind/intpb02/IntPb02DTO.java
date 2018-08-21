package com.ns.cspgtw.proxylayer.wind.intpb02;
import com.ns.cspgtw.proxylayer.AbstractProxyInvokerDTO;

public class IntPb02DTO extends AbstractProxyInvokerDTO {
    public static final String url = "https://windhub.purebros.it/cprovider/cdeliver";

    public IntPb02DTO() {
        super();
        setUrl(IntPb02DTO.url);
    }

    public IntPb02DTO(String url) {
        super(url);
    }

    public String getMtUser() {
        return (String) this.get("mt_user");
    }

    public IntPb02DTO setMtUser(String mtUser) {
        this.put("mt_user", mtUser);
        return this;
    }

    public String getMtPass() {
        return (String) this.get("mt_pass");
    }

    public IntPb02DTO setMtPass(String mtPass) {
        this.put("mt_pass", mtPass);
        return this;
    }
    public Integer getMtFormat() {
        return new Integer(this.get("mt_format"));
    }

    public IntPb02DTO setMtFormat(Integer mtFormat) {
        this.put("mt_format", mtFormat.toString());
        return this;
    }
    public IntPb02DTO setMtFormat(String mtFormat) {
        this.put("mt_format", mtFormat);
        return this;
    }

    public Integer getMtUdh() {
        return new Integer( this.get("mt_udh"));
    }

    public IntPb02DTO setMtUdh(Integer mtUdh) {
        this.put("mt_udh", mtUdh.toString());
        return this;
    }

    public IntPb02DTO setMtUdh(String mtUdh) {
        this.put("mt_udh", mtUdh);
        return this;
    }

    public Integer getPbCcid() {
        return new Integer(this.get("pb_ccid"));
    }

    public IntPb02DTO setPbCcid(Integer pbCcid) {
        this.put("pb_ccid", pbCcid.toString());
        return this;
    }

    public String getMtId() {
        return (String) this.get("mt_id");
    }

    public IntPb02DTO setMtId(String mtId) {
        this.put("mt_id", mtId);
        return this;
    }

    public String getMtSource() {
        return (String) this.get("mt_source");
    }

    public IntPb02DTO setMtSource(String mtSource) {
        this.put("mt_source", mtSource);
        return this;
    }

    public String getMtTarget() {
        return (String) this.get("mt_target");
    }
    
    public IntPb02DTO setMtTarget(String mtTarget) {
        this.put("mt_target", mtTarget);
        return this;
    }
    public IntPb02DTO setMtTarget(Integer mtTarget) {
        this.put("mt_target", mtTarget.toString());
        return this;
    }

    public String getMtCarrier() {
        return (String) this.get("mt_carrier");
    }

    public IntPb02DTO setMtCarrier(String mtCarrier) {
        this.put("mt_carrier", mtCarrier);
        return this;
    }

    public Integer getMtBodycount() {
        return new Integer (this.get("mt_bodycount"));
    }

    public IntPb02DTO setMtBodycount(Integer mtBodycount) {
        this.put("mt_bodycount", mtBodycount.toString());
        return this;
    }

    public Integer getMtServtype() {
        return new Integer (this.get("mt_servtype"));
    }

    public IntPb02DTO setMtServtype(Integer mtServtype) {
        this.put("mt_servtype", mtServtype.toString());
        return this;
    }
    public IntPb02DTO setMtServtype(String mtServtype) {
        this.put("mt_servtype", mtServtype);
        return this;
    }

    public IntPb02DTO setMtServtype() {
        this.put("mt_servtype", null);
        return this;
    }

    public String getMtReqsource() {
        return (String) this.get("mt_reqsource");
    }

    public IntPb02DTO setMtReqsource(String mtReqsource) {
        this.put("mt_reqsource", mtReqsource);
        return this;
    }

    public Integer getMtBody1() {
        return new Integer (this.get("mt_body1"));
    }

    public IntPb02DTO setMtBody1(Integer mtBody1) {
        this.put("mt_body1", mtBody1.toString());
        return this;
    }
    public IntPb02DTO setMtBody1(String mtBody1) {
        this.put("mt_body1", mtBody1);
        return this;
    }

    public void reset() {
        this.setMtTarget("")
                .setMtPass("")
                .setMtCarrier("")
                .setMtBody1(0)
                .setMtBodycount(0)
                .setMtFormat(0)
                .setMtId("")
                .setMtReqsource("")
                .setMtServtype(0)
                .setMtSource("")
                .setMtUdh(0)
                .setPbCcid(0);
    }
}
