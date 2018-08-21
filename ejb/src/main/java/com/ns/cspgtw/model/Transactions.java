package com.ns.cspgtw.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Transactions {
    private int rowId;
    private Integer serviceId;
    private Integer transactionId;
    private String msisdn;
    private Integer billingId;
    private Timestamp creationDate;
    private Service serviceByServiceId;
    private Billingid billingidByBillingId;

    @Id
    @Column(name = "row_id", nullable = false)
    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    @Basic
    @Column(name = "service_id", nullable = true)
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    @Basic
    @Column(name = "transaction_id", nullable = true)
    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    @Basic
    @Column(name = "msisdn", nullable = true, length = 120)
    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @Basic
    @Column(name = "billing_id", nullable = true)
    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    @Basic
    @Column(name = "creation_date", nullable = true)
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
        Transactions that = (Transactions) o;
        return rowId == that.rowId &&
                Objects.equals(serviceId, that.serviceId) &&
                Objects.equals(transactionId, that.transactionId) &&
                Objects.equals(msisdn, that.msisdn) &&
                Objects.equals(billingId, that.billingId) &&
                Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowId, serviceId, transactionId, msisdn, billingId, creationDate);
    }

    @ManyToOne
    @JoinColumn(referencedColumnName = "service_id")
    public Service getServiceByServiceId() {
        return serviceByServiceId;
    }

    public void setServiceByServiceId(Service serviceByServiceId) {
        this.serviceByServiceId = serviceByServiceId;
    }

    @ManyToOne
    @JoinColumn(referencedColumnName = "billing_id")
    public Billingid getBillingidByBillingId() {
        return billingidByBillingId;
    }

    public void setBillingidByBillingId(Billingid billingidByBillingId) {
        this.billingidByBillingId = billingidByBillingId;
    }
}
