package com.company.jsonb.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@MetaClass(name = "jsonb_Address")
@NamePattern("%s %s %s|country,city,address")
public class Address extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -5783890728024152120L;

    @MetaProperty
    private String country;

    @MetaProperty
    private String city;

    @MetaProperty
    private String address;

    public Address() {
    }

    public Address(String country, String city, String address) {
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}