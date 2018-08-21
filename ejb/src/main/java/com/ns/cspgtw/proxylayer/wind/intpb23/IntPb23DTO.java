package com.ns.cspgtw.proxylayer.wind.intpb23;

import com.ns.cspgtw.proxylayer.AbstractProxyInvokerDTO;

public class IntPb23DTO extends AbstractProxyInvokerDTO {

    public static final String url = "https://windhub.purebros.it/cprovider/DeactivationNotification";

    public void reset() {
        setMtAuthid(0);
        setMtCarrier("");
        setMtParamName1("");
        setMtParamName2("");
        setMtParamName3("");
        setMtParamName4("");
        setMtParams(4);
        setMtParamValue1("");
        setMtParamValue2("");
        setMtParamValue3("");
        setMtParamValue4("");
        setMtPass("");
        setMtServtype(0);
        setMtTarget("");
        setMtUser("");
    }

    public IntPb23DTO() {
        super();
        setUrl(IntPb23DTO.url);

    }

    public IntPb23DTO(String url) {
        super(url);

    }

    public String getMtUser() {
        return (String) this.get("mt_user");
    }

    public IntPb23DTO setMtUser(String mtUser) {
        this.put("mt_user",  mtUser);
        return this;
    }


    public String getMtPass() {
        return (String) this.get("mt_pass");
    }

    public IntPb23DTO setMtPass(String mtPass) {
        this.put("mt_pass", mtPass);
        return this;
    }

    public String getMtTarget() {
        return (String) this.get("mt_target");
    }

    public IntPb23DTO setMtTarget(String mtTarget) {
        this.put("mt_target", mtTarget);
        return this;
    }

    public IntPb23DTO setMtTarget(Integer mtTarget) {
        this.put("mt_target", mtTarget.toString());
        return this;
    }

    public String getMtCarrier() {
        return (String) this.get("mt_carrier");
    }

    public IntPb23DTO setMtCarrier(String mtCarrier) {
        this.put("mt_carrier", mtCarrier);
        return this;
    }

    public Integer getMtServtype() {
        return new Integer( this.get("mt_servtype") );
    }

    public IntPb23DTO setMtServtype(Integer mtServtype) {
        this.put("mt_servtype" , mtServtype.toString());
        return this;
    }

    public IntPb23DTO setMtServtype(String mtServtype) {
        this.put("mt_servtype" , mtServtype);
        return this;
    }

    public Integer getMtAuthid() {
        return new Integer( (String) this.get("mt_authID"));
    }

    public IntPb23DTO setMtAuthid(Integer mtAuthid) {
        this.put("mt_authID", mtAuthid.toString());
        return this;
    }
    public IntPb23DTO setMtAuthid(String mtAuthid) {
        this.put("mt_authID", mtAuthid);
        return this;
    }

    public Integer getMtParams() {
        return new Integer( this.get("mt_params"));
    }

    public IntPb23DTO setMtParams(Integer mtParams) {
        this.put("mt_params", mtParams.toString());
        return this;
    }

    public String getMtParamName1() {
        return (String) this.get("mt_paramName1");
    }

    public IntPb23DTO setMtParamName1(String mtParamName1) {
        this.put("mt_paramName1", mtParamName1);
        return this;
    }

    public String getMtParamValue1() {
        return (String) this.get("mt_paramValue1");
    }

    public IntPb23DTO setMtParamValue1(String mtParamValue1) {
        this.put("mt_paramValue1", mtParamValue1);
        return this;
    }

    public String getMtParamName2() {
        return (String) this.get("mt_paramName2");
    }

    public IntPb23DTO setMtParamName2(String mtParamName2) {
        this.put("mt_paramName2", mtParamName2);
        return this;
    }

    public String getMtParamValue2() {
        return (String) this.get("mt_paramValue2");
    }

    public IntPb23DTO setMtParamValue2(String mtParamValue2) {
        this.put("mt_paramValue2", mtParamValue2);
        return this;
    }

    public String getMtParamName3() {
        return (String) this.get("mt_paramName3");
    }

    public IntPb23DTO setMtParamName3(String mtParamName3) {
        this.put("mt_paramName3", mtParamName3);
        return this;
    }

    public String getMtParamValue3() {
        return (String) this.get("mt_paramValue3");
    }

    public IntPb23DTO setMtParamValue3(String mtParamValue3) {
        this.put("mt_paramValue3", mtParamValue3);
        return this;
    }

    public String getMtParamName4() {
        return (String) this.get("mt_paramName4");
    }

    public IntPb23DTO setMtParamName4(String mtParamName4) {
        this.put("mt_paramName4", mtParamName4);
        return this;
    }

    public String getMtParamValue4() {
        return (String) this.get("mt_paramValue4");
    }

    public IntPb23DTO setMtParamValue4(String mtParamValue4) {
        this.put("mt_paramValue4", mtParamValue4);
        return this;
    }

}
