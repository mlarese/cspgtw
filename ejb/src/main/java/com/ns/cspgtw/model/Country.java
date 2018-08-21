package com.ns.cspgtw.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Country {
    private int countryId;
    private String country;
    private Collection<Operator> operatorsByCountryId;

    @Id
    @Column(name = "country_id", nullable = false)
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "country", nullable = false, length = 70)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return countryId == country1.countryId &&
                Objects.equals(country, country1.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countryId, country);
    }

    @OneToMany(mappedBy = "countryByCountryId")
    public Collection<Operator> getOperatorsByCountryId() {
        return operatorsByCountryId;
    }

    public void setOperatorsByCountryId(Collection<Operator> operatorsByCountryId) {
        this.operatorsByCountryId = operatorsByCountryId;
    }
}
