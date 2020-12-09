package com.company.jsonb.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Table(name = "JSONB_COMPANY")
@Entity(name = "jsonb_Company")
@NamePattern("%s|name")
public class Company extends StandardEntity {
    private static final long serialVersionUID = 7935471752135048750L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Convert(converter = JsonConverter.class)
    @ElementCollection
    @OneToMany
    private List<Address> addresses;

    @OneToMany(mappedBy = "company")
    private List<Person> employees;

    public List<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Person> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}