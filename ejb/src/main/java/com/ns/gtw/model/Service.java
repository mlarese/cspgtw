package com.ns.gtw.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Service {
    private int serviceId;
    private Integer cpId;
    private String cpServiceName;
    private String cpActivateUrl;
    private String cpDeactUrl;
    private String cpBillResponseUrl;
    private Integer windSiteId;
    private String windMtFormat;
    private String windMtUdh;
    private String windMtReqsource;
    private String windMtSource;


    private String windCaringServiceType;
    private String windDeactServiceType;
    private String timServiceName;
    private Integer timMpayProductId;

    private String postbackUrl;
    private Byte statusId;
    private Timestamp creationDate;
    private Timestamp lastModifyDate;
    private Collection<Reporting> reportingsByServiceId;
    private Cp cpByCpId;
    private Collection<ServiceBillingid> serviceBillingidsByServiceId;
    private Collection<Subscription> subscriptionsByServiceId;
    private Collection<Transactions> transactionsByServiceId;

    @Id
    @Column(name = "service_id", nullable = false)
    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }


    @Basic
    @Column(name = "wind_mt_source", nullable = true, length = 100)
    public String getWindMtSource() {
        return windMtSource;
    }

    public void setWindMtSource(String windMtSource) {
        this.windMtSource = windMtSource;
    }

    @Basic
    @Column(name = "tim_mpay_product_id", nullable = true)
    public Integer getTimMpayProductId() {
        return timMpayProductId;
    }

    public void setTimMpayProductId(Integer timMpayProductId) {
        this.timMpayProductId = timMpayProductId;
    }


    @Basic
    @Column(name = "cp_id", nullable = true)
    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    @Basic
    @Column(name = "cp_service_name", nullable = true, length = 100)
    public String getCpServiceName() {
        return cpServiceName;
    }

    public void setCpServiceName(String cpServiceName) {
        this.cpServiceName = cpServiceName;
    }

    @Basic
    @Column(name = "cp_activate_url", nullable = true, length = 200)
    public String getCpActivateUrl() {
        return cpActivateUrl;
    }

    public void setCpActivateUrl(String cpActivateUrl) {
        this.cpActivateUrl = cpActivateUrl;
    }

    @Basic
    @Column(name = "cp_deact_url", nullable = true, length = 200)
    public String getCpDeactUrl() {
        return cpDeactUrl;
    }

    public void setCpDeactUrl(String cpDeactUrl) {
        this.cpDeactUrl = cpDeactUrl;
    }

    @Basic
    @Column(name = "cp_bill_response_url", nullable = true, length = 200)
    public String getCpBillResponseUrl() {
        return cpBillResponseUrl;
    }

    public void setCpBillResponseUrl(String cpBillResponseUrl) {
        this.cpBillResponseUrl = cpBillResponseUrl;
    }

    @Basic
    @Column(name = "wind_site_id", nullable = true)
    public Integer getWindSiteId() {
        return windSiteId;
    }

    public void setWindSiteId(Integer windSiteId) {
        this.windSiteId = windSiteId;
    }

    @Basic
    @Column(name = "wind_mt_format", nullable = true, length = 10)
    public String getWindMtFormat() {
        return windMtFormat;
    }

    public void setWindMtFormat(String windMtFormat) {
        this.windMtFormat = windMtFormat;
    }

    @Basic
    @Column(name = "wind_mt_udh", nullable = true, length = 20)
    public String getWindMtUdh() {
        return windMtUdh;
    }

    public void setWindMtUdh(String windMtUdh) {
        this.windMtUdh = windMtUdh;
    }

    @Basic
    @Column(name = "wind_mt_reqsource", nullable = true, length = 20)
    public String getWindMtReqsource() {
        return windMtReqsource;
    }

    public void setWindMtReqsource(String windMtReqsource) {
        this.windMtReqsource = windMtReqsource;
    }

    @Basic
    @Column(name = "wind_caring_service_type", nullable = true, length = 20)
    public String getWindCaringServiceType() {
        return windCaringServiceType;
    }

    public void setWindCaringServiceType(String windCaringServiceType) {
        this.windCaringServiceType = windCaringServiceType;
    }

    @Basic
    @Column(name = "wind_deact_service_type", nullable = true, length = 20)
    public String getWindDeactServiceType() {
        return windDeactServiceType;
    }

    public void setWindDeactServiceType(String windDeactServiceType) {
        this.windDeactServiceType = windDeactServiceType;
    }

    @Basic
    @Column(name = "tim_service_name", nullable = true, length = 100)
    public String getTimServiceName() {
        return timServiceName;
    }

    public void setTimServiceName(String timServiceName) {
        this.timServiceName = timServiceName;
    }

    @Basic
    @Column(name = "postback_url", nullable = true, length = 200)
    public String getPostbackUrl() {
        return postbackUrl;
    }

    public void setPostbackUrl(String postbackUrl) {
        this.postbackUrl = postbackUrl;
    }

    @Basic
    @Column(name = "status_id", nullable = true)
    public Byte getStatusId() {
        return statusId;
    }

    public void setStatusId(Byte statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "creation_date", nullable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "last_modify_date", nullable = true)
    public Timestamp getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Timestamp lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return serviceId == service.serviceId &&
                Objects.equals(cpId, service.cpId) &&
                Objects.equals(cpServiceName, service.cpServiceName) &&
                Objects.equals(cpActivateUrl, service.cpActivateUrl) &&
                Objects.equals(cpDeactUrl, service.cpDeactUrl) &&
                Objects.equals(cpBillResponseUrl, service.cpBillResponseUrl) &&
                Objects.equals(windSiteId, service.windSiteId) &&
                Objects.equals(windMtFormat, service.windMtFormat) &&
                Objects.equals(windMtUdh, service.windMtUdh) &&
                Objects.equals(windMtReqsource, service.windMtReqsource) &&
                Objects.equals(windCaringServiceType, service.windCaringServiceType) &&
                Objects.equals(windDeactServiceType, service.windDeactServiceType) &&
                Objects.equals(timServiceName, service.timServiceName) &&
                Objects.equals(postbackUrl, service.postbackUrl) &&
                Objects.equals(statusId, service.statusId) &&
                Objects.equals(creationDate, service.creationDate) &&
                Objects.equals(lastModifyDate, service.lastModifyDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(serviceId, cpId, cpServiceName, cpActivateUrl, cpDeactUrl, cpBillResponseUrl, windSiteId, windMtFormat, windMtUdh, windMtReqsource, windCaringServiceType, windDeactServiceType, timServiceName, postbackUrl, statusId, creationDate, lastModifyDate);
    }

    @OneToMany(mappedBy = "serviceByServiceId")
    public Collection<Reporting> getReportingsByServiceId() {
        return reportingsByServiceId;
    }

    public void setReportingsByServiceId(Collection<Reporting> reportingsByServiceId) {
        this.reportingsByServiceId = reportingsByServiceId;
    }

    @ManyToOne
    @JoinColumn(referencedColumnName = "cp_id")
    public Cp getCpByCpId() {
        return cpByCpId;
    }

    public void setCpByCpId(Cp cpByCpId) {
        this.cpByCpId = cpByCpId;
    }

    @OneToMany(mappedBy = "serviceByServiceId")
    public Collection<ServiceBillingid> getServiceBillingidsByServiceId() {
        return serviceBillingidsByServiceId;
    }

    public void setServiceBillingidsByServiceId(Collection<ServiceBillingid> serviceBillingidsByServiceId) {
        this.serviceBillingidsByServiceId = serviceBillingidsByServiceId;
    }

    @OneToMany(mappedBy = "serviceByServiceId")
    public Collection<Subscription> getSubscriptionsByServiceId() {
        return subscriptionsByServiceId;
    }

    public void setSubscriptionsByServiceId(Collection<Subscription> subscriptionsByServiceId) {
        this.subscriptionsByServiceId = subscriptionsByServiceId;
    }

    @OneToMany(mappedBy = "serviceByServiceId")
    public Collection<Transactions> getTransactionsByServiceId() {
        return transactionsByServiceId;
    }

    public void setTransactionsByServiceId(Collection<Transactions> transactionsByServiceId) {
        this.transactionsByServiceId = transactionsByServiceId;
    }
}
