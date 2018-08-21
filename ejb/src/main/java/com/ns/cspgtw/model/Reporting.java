package com.ns.cspgtw.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Reporting {
    private int rowId;
    private Integer cpId;
    private Integer serviceId;
    private BigDecimal dailyVolumeBilling;
    private Date date;
    private Cp cpByCpId;
    private Service serviceByServiceId;

    @Id
    @Column(name = "row_id", nullable = false)
    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
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
    @Column(name = "service_id", nullable = true)
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    @Basic
    @Column(name = "daily_volume_billing", nullable = true, precision = 4)
    public BigDecimal getDailyVolumeBilling() {
        return dailyVolumeBilling;
    }

    public void setDailyVolumeBilling(BigDecimal dailyVolumeBilling) {
        this.dailyVolumeBilling = dailyVolumeBilling;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reporting reporting = (Reporting) o;
        return rowId == reporting.rowId &&
                Objects.equals(cpId, reporting.cpId) &&
                Objects.equals(serviceId, reporting.serviceId) &&
                Objects.equals(dailyVolumeBilling, reporting.dailyVolumeBilling) &&
                Objects.equals(date, reporting.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowId, cpId, serviceId, dailyVolumeBilling, date);
    }

    @ManyToOne
    @JoinColumn(referencedColumnName = "cp_id")
    public Cp getCpByCpId() {
        return cpByCpId;
    }

    public void setCpByCpId(Cp cpByCpId) {
        this.cpByCpId = cpByCpId;
    }

    @ManyToOne
    @JoinColumn(referencedColumnName = "service_id")
    public Service getServiceByServiceId() {
        return serviceByServiceId;
    }

    public void setServiceByServiceId(Service serviceByServiceId) {
        this.serviceByServiceId = serviceByServiceId;
    }
}
