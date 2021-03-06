package com.pluresidea.api.emergencyincident.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Incident {

    private @Id @GeneratedValue Integer id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Address AddressObject;

    private ArrayList< Object > apparatus = new ArrayList < Object > ();

    @OneToOne(cascade = CascadeType.PERSIST)
    private Description DescriptionObject;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Fire_department Fire_departmentObject;

    private String version;

    public Integer getId(){
        return id;
    }

    public Address getAddress() {
        return AddressObject;
    }

    public Description getDescription() {
        return DescriptionObject;
    }

    public Fire_department getFire_department() {
        return Fire_departmentObject;
    }

    public String getVersion() {
        return version;
    }

    public void setAddress(Address addressObject) {
        this.AddressObject = addressObject;
    }

    public void setDescription(Description descriptionObject) {
        this.DescriptionObject = descriptionObject;
    }

    public void setFire_department(Fire_department fire_departmentObject) {
        this.Fire_departmentObject = fire_departmentObject;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
