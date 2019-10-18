package com.pluresidea.api.emergencyincident.entity;

import java.util.ArrayList;

public class Incident {

    private Address AddressObject;
    ArrayList< Object > apparatus = new ArrayList < Object > ();
    private Description DescriptionObject;
    private Fire_department Fire_departmentObject;
    private String version;


    // Getter Methods

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

    // Setter Methods

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
