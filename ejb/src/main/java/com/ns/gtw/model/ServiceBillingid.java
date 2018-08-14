package com.ns.gtw.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NamedQuery(name = "ServiceBillingid.findByBillingService", query = "SELECT s FROM ServiceBillingid s WHERE s.billingId = :billingid and s.serviceId = :serviceid")
@Table(name = "service_billingid", schema = "gtw")
public class ServiceBillingid {
    private int rowId;
    private Integer serviceId;
    private Integer billingId;
    private String windBillServiceType;
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
    @Column(name = "billing_id", nullable = true)
    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    @Basic
    @Column(name = "wind_bill_service_type", nullable = true, length = 20)
    public String getWindBillServiceType() {
        return windBillServiceType;
    }

    public void setWindBillServiceType(String windBillServiceType) {
        this.windBillServiceType = windBillServiceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceBillingid that = (ServiceBillingid) o;
        return rowId == that.rowId &&
                Objects.equals(serviceId, that.serviceId) &&
                Objects.equals(billingId, that.billingId) &&
                Objects.equals(windBillServiceType, that.windBillServiceType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowId, serviceId, billingId, windBillServiceType);
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
