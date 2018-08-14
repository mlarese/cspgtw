package com.ns.gtw.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Subscription {
    private int rowId;
    private Integer authorizationId;
    private Integer serviceId;
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
    @Column(name = "authorization_id", nullable = true)
    public Integer getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(Integer authorizationId) {
        this.authorizationId = authorizationId;
    }

    @Basic
    @Column(name = "service_id", nullable = true)
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return rowId == that.rowId &&
                Objects.equals(authorizationId, that.authorizationId) &&
                Objects.equals(serviceId, that.serviceId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowId, authorizationId, serviceId);
    }

    @ManyToOne
    @JoinColumn( referencedColumnName = "service_id")
    public Service getServiceByServiceId() {
        return serviceByServiceId;
    }

    public void setServiceByServiceId(Service serviceByServiceId) {
        this.serviceByServiceId = serviceByServiceId;
    }
}
