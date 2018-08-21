package com.ns.cspgtw.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Cp {
    private int cpId;
    private String cpName;
    private String cpToken;
    private String windPbMtUser;
    private String windPbMtPwd;
    private String timEngCspName;
    private Byte statusId;
    private Timestamp creationDate;
    private String timMpayMerchantId;

    @Basic
    @Column(name = "tim_mpay_merchant_id", nullable = true, length = 20)
    public String getTimMpayMerchantId() {
        return timMpayMerchantId;
    }

    public void setTimMpayMerchantId(String timMpayMerchantId) {
        this.timMpayMerchantId = timMpayMerchantId;
    }

    private Collection<Reporting> reportingsByCpId;
    private Collection<Service> servicesByCpId;

    @Id
    @Column(name = "cp_id", nullable = false)
    public int getCpId() {
        return cpId;
    }

    public void setCpId(int cpId) {
        this.cpId = cpId;
    }

    @Basic
    @Column(name = "cp_name", nullable = false, length = 100)
    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    @Basic
    @Column(name = "cp_token", nullable = true, length = 120)
    public String getCpToken() {
        return cpToken;
    }

    public void setCpToken(String cpToken) {
        this.cpToken = cpToken;
    }

    @Basic
    @Column(name = "wind_pb_mt_user", nullable = false, length = 40)
    public String getWindPbMtUser() {
        return windPbMtUser;
    }

    public void setWindPbMtUser(String windPbMtUser) {
        this.windPbMtUser = windPbMtUser;
    }

    @Basic
    @Column(name = "wind_pb_mt_pwd", nullable = false, length = 50)
    public String getWindPbMtPwd() {
        return windPbMtPwd;
    }

    public void setWindPbMtPwd(String windPbMtPwd) {
        this.windPbMtPwd = windPbMtPwd;
    }

    @Basic
    @Column(name = "tim_eng_csp_name", nullable = true, length = 50)
    public String getTimEngCspName() {
        return timEngCspName;
    }

    public void setTimEngCspName(String timEngCspName) {
        this.timEngCspName = timEngCspName;
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
    @Column(name = "creation_date", nullable = false)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cp cp = (Cp) o;
        return cpId == cp.cpId &&
                Objects.equals(cpName, cp.cpName) &&
                Objects.equals(cpToken, cp.cpToken) &&
                Objects.equals(windPbMtUser, cp.windPbMtUser) &&
                Objects.equals(windPbMtPwd, cp.windPbMtPwd) &&
                Objects.equals(timEngCspName, cp.timEngCspName) &&
                Objects.equals(statusId, cp.statusId) &&
                Objects.equals(creationDate, cp.creationDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cpId, cpName, cpToken, windPbMtUser, windPbMtPwd, timEngCspName, statusId, creationDate);
    }

    @OneToMany(mappedBy = "cpByCpId")
    public Collection<Reporting> getReportingsByCpId() {
        return reportingsByCpId;
    }

    public void setReportingsByCpId(Collection<Reporting> reportingsByCpId) {
        this.reportingsByCpId = reportingsByCpId;
    }

    @OneToMany(mappedBy = "cpByCpId")
    public Collection<Service> getServicesByCpId() {
        return servicesByCpId;
    }

    public void setServicesByCpId(Collection<Service> servicesByCpId) {
        this.servicesByCpId = servicesByCpId;
    }
}
