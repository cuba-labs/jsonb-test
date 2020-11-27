package com.company.jsonb.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "JSONB_PERSON")
@Entity(name = "jsonb_Person")
@NamePattern("%s|name")
public class Person extends BaseIntIdentityIdEntity {
    private static final long serialVersionUID = -7106902234790260947L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Convert(converter = JsonConverter.class)
    @Column(name = "ADDRESS", columnDefinition = "jsonb")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}