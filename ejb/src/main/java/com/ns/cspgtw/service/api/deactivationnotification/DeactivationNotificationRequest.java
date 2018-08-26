package com.ns.cspgtw.service.api.deactivationnotification;

import com.ns.cspgtw.service.builder.AbstractRequest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "deactivation_notification_request", namespace = "https://vas.cpgtwhub.mobi/refund")
@XmlType(name = "DeactivationNotificationRequest", propOrder = {
        "mtCarrier",
        "mtAuthId",
        "idAuth",
        "productId",
        "mtTarget",
        "mtServType",
        "mtParams",
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
    @XmlElement(name = "mt_carrier", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private Integer mtCarrier;
    @XmlElement(name = "mt_auth_id", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private Integer mtAuthId;
    @XmlElement(name = "id_auth", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private Integer idAuth;
    @XmlElement(name = "product_id", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private Integer productId;
    @XmlElement(name = "mt_target", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String mtTarget;
    @XmlElement(name = "mt_serv_type", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String mtServType;
    @XmlElement(name = "mt_params", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String mtParams;
    @XmlElement(name = "mt_param_name_1", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String mtParamName1;
    @XmlElement(name = "mt_param_value_1", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String mtParamValue1;
    @XmlElement(name = "mt_param_name_2", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String mtParamName2;
    @XmlElement(name = "mt_param_value_2", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String mtParamValue2;
    @XmlElement(name = "mt_param_name_3", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String mtParamName3;
    @XmlElement(name = "mt_param_value_3", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String mtParamValue3;
    @XmlElement(name = "mt_param_name_4", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String mtParamName4;
    @XmlElement(name = "mt_param_value_4", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String mtParamValue4;
    @XmlElement(name = "transaction_id", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String transactionId;
    @XmlElement(name = "business_id", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String businessId;
    @XmlElement(name = "id_csp", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String idCsp;
    @XmlElement(name = "op_type", required = true, namespace = "https://vas.cpgtwhub.mobi/refund")
    private String opType;



    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(Integer msisdn) {
        this.msisdn = msisdn;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
