package com.ns.cspgtw.service.api.deactivationnotification;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "deactivation_notification_request", namespace = "https://vas.cpgtwhub.mobi/ad_command")
@XmlType(name = "DeactivationNotificationRequest", propOrder = {
        "mtCarrier",
        "mtAuthId",
        "idAuth",
        "productId",
        "mtTarget",
        "mtServType",
        "mtParams",
        "msisdn",
        "mtParamName1",
        "mtParamValue1",
        "mtParamName2",
        "mtParamValue2",
        "mtParamName3",
        "mtParamValue3",
        "mtParamName4",
        "mtParamValue4",
        "transactionId",
        "businessId",
        "idCsp",
        "opType"

})
public class DeactivationNotificationRequest extends AbstractRequest {
    @XmlElement(name = "mt_carrier", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private Integer mtCarrier;
    @XmlElement(name = "mt_auth_id", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private Integer mtAuthId;
    @XmlElement(name = "id_auth", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private Integer idAuth;
    @XmlElement(name = "product_id", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private Integer productId;
    @XmlElement(name = "mt_target", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String mtTarget;
    @XmlElement(name = "msisdn", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private Integer msisdn;
    @XmlElement(name = "mt_serv_type", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String mtServType;
    @XmlElement(name = "mt_params", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String mtParams;
    @XmlElement(name = "mt_param_name_1", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String mtParamName1;
    @XmlElement(name = "mt_param_value_1", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String mtParamValue1;
    @XmlElement(name = "mt_param_name_2", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String mtParamName2;
    @XmlElement(name = "mt_param_value_2", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String mtParamValue2;
    @XmlElement(name = "mt_param_name_3", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String mtParamName3;
    @XmlElement(name = "mt_param_value_3", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String mtParamValue3;
    @XmlElement(name = "mt_param_name_4", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String mtParamName4;
    @XmlElement(name = "mt_param_value_4", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String mtParamValue4;
    @XmlElement(name = "transaction_id", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String transactionId;
    @XmlElement(name = "business_id", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String businessId;
    @XmlElement(name = "id_csp", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String idCsp;
    @XmlElement(name = "op_type", required = true, namespace = "https://vas.cpgtwhub.mobi/ad_command")
    private String opType;



    public Integer getMtCarrier() {
        return mtCarrier;
    }

    public void setMtCarrier(Integer mtCarrier) {
        this.mtCarrier = mtCarrier;
    }

    public Integer getMtAuthId() {
        return mtAuthId;
    }

    public void setMtAuthId(Integer mtAuthId) {
        this.mtAuthId = mtAuthId;
    }

    public Integer getIdAuth() {
        return idAuth;
    }

    public void setIdAuth(Integer idAuth) {
        this.idAuth = idAuth;
    }

    public Integer getMsisdn() { return msisdn; }

    public void setMsisdn(Integer msisdn) { this.msisdn = msisdn; }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getMtTarget() {
        return mtTarget;
    }

    public void setMtTarget(String mtTarget) {
        this.mtTarget = mtTarget;
    }

    public String getMtServType() {
        return mtServType;
    }

    public void setMtServType(String mtServType) {
        this.mtServType = mtServType;
    }

    public String getMtParams() {
        return mtParams;
    }

    public void setMtParams(String mtParams) {
        this.mtParams = mtParams;
    }

    public String getMtParamName1() {
        return getMtParamName1();
    }

    public void setMtParamName1(String mtParamName1) {
        this.mtParamName1 = mtParamName1;
    }

    public String getMtParamValue1() {
        return mtParamValue1;
    }

    public void setMtParamValue1(String mtParamValue1) {
        this.mtParamValue1 = mtParamValue1;
    }

    public String getMtParamName2() {
        return getMtParamName2();
    }

    public void setMtParamName2(String mtParamName2) {
        this.mtParamName2 = mtParamName2;
    }

    public String getMtParamValue2() {
        return mtParamValue2;
    }

    public void setMtParamValue2(String mtParamValue2) {
        this.mtParamValue2 = mtParamValue2;
    }

    public String getMtParamName3() {
        return getMtParamName3();
    }

    public void setMtParamName3(String mtParamName3) {
        this.mtParamName3 = mtParamName3;
    }

    public String getMtParamValue3() {
        return mtParamValue3;
    }

    public void setMtParamValue3(String mtParamValue3) {
        this.mtParamValue3 = mtParamValue3;
    }

    public String getMtParamName4() {
        return getMtParamName4();
    }

    public void setMtParamName4(String mtParamName4) {
        this.mtParamName4 = mtParamName4;
    }

    public String getMtParamValue4() {
        return mtParamValue4;
    }

    public void setMtParamValue4(String mtParamValue4) {
        this.mtParamValue4 = mtParamValue4;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String transactionId) {
        this.businessId = businessId;
    }

    public String getIdCsp() {
        return idCsp;
    }

    public void setIdCsp(String idCsp) {
        this.idCsp = idCsp;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }


}
