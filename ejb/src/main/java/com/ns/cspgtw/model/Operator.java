package com.ns.cspgtw.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Operator {
    private int operatorId;
    private String operatorName;
    private String windMtCarrier;
    private Integer countryId;
    private Country countryByCountryId;

    @Id
    @Column(name = "operator_id", nullable = false)
    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    @Basic
    @Column(name = "operator_name", nullable = false, length = 50)
    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    @Basic
    @Column(name = "wind_mt_carrier", nullable = false, length = 50)
    public String getWindMtCarrier() {
        return windMtCarrier;
    }

    public void setWindMtCarrier(String windMtCarrier) {
        this.windMtCarrier = windMtCarrier;
    }

    @Basic
    @Column(name = "country_id", nullable = true)
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operator operator = (Operator) o;
        return operatorId == operator.operatorId &&
                Objects.equals(operatorName, operator.operatorName) &&
                Objects.equals(windMtCarrier, operator.windMtCarrier) &&
                Objects.equals(countryId, operator.countryId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(operatorId, operatorName, windMtCarrier, countryId);
    }

    @ManyToOne
    @JoinColumn(referencedColumnName = "country_id")
    public Country getCountryByCountryId() {
        return countryByCountryId;
    }

    public void setCountryByCountryId(Country countryByCountryId) {
        this.countryByCountryId = countryByCountryId;
    }
}
