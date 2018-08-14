package com.ns.gtw.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Billingid {
    private int billingId;
    private BigDecimal billingPrice;
    private String h3GBillingPriceband;
    private Integer timIdPrice;
    private Integer timMpayFractionId;

    @Basic
    @Column(name = "tim_mpay_fraction_id", nullable = true, precision = 4)
    public Integer getTimMpayFractionId() {
        return timMpayFractionId;
    }

    public void setTimMpayFractionId(Integer timMpayFractionId) {
        this.timMpayFractionId = timMpayFractionId;
    }

    private Collection<ServiceBillingid> serviceBillingidsByBillingId;
    private Collection<Transactions> transactionsByBillingId;

    @Id
    @Column(name = "billing_id", nullable = false)
    public int getBillingId() {
        return billingId;
    }

    public void setBillingId(int billingId) {
        this.billingId = billingId;
    }

    @Basic
    @Column(name = "billing_price", nullable = true, precision = 4)
    public BigDecimal getBillingPrice() {
        return billingPrice;
    }

    public void setBillingPrice(BigDecimal billingPrice) {
        this.billingPrice = billingPrice;
    }

    @Basic
    @Column(name = "h3g_billing_priceband", nullable = true, length = 4)
    public String getH3GBillingPriceband() {
        return h3GBillingPriceband;
    }

    public void setH3GBillingPriceband(String h3GBillingPriceband) {
        this.h3GBillingPriceband = h3GBillingPriceband;
    }

    @Basic
    @Column(name = "tim_id_price", nullable = true)
    public Integer getTimIdPrice() {
        return timIdPrice;
    }

    public void setTimIdPrice(Integer timIdPrice) {
        this.timIdPrice = timIdPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Billingid billingid = (Billingid) o;
        return billingId == billingid.billingId &&
                Objects.equals(billingPrice, billingid.billingPrice) &&
                Objects.equals(h3GBillingPriceband, billingid.h3GBillingPriceband) &&
                Objects.equals(timIdPrice, billingid.timIdPrice);
    }

    @Override
    public int hashCode() {

        return Objects.hash(billingId, billingPrice, h3GBillingPriceband, timIdPrice);
    }

    @OneToMany(mappedBy = "billingidByBillingId")
    public Collection<ServiceBillingid> getServiceBillingidsByBillingId() {
        return serviceBillingidsByBillingId;
    }

    public void setServiceBillingidsByBillingId(Collection<ServiceBillingid> serviceBillingidsByBillingId) {
        this.serviceBillingidsByBillingId = serviceBillingidsByBillingId;
    }

    @OneToMany(mappedBy = "billingidByBillingId")
    public Collection<Transactions> getTransactionsByBillingId() {
        return transactionsByBillingId;
    }

    public void setTransactionsByBillingId(Collection<Transactions> transactionsByBillingId) {
        this.transactionsByBillingId = transactionsByBillingId;
    }
}
