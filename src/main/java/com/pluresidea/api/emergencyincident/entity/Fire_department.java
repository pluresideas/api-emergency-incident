package com.pluresidea.api.emergencyincident.entity;

public class Fire_department {

    private String fd_id;
    private String firecares_id;
    private String name;
    private String shift;
    private String state;
    private String timezone;


    public String getFd_id() {
        return fd_id;
    }

    public String getFirecares_id() {
        return firecares_id;
    }

    public String getName() {
        return name;
    }

    public String getShift() {
        return shift;
    }

    public String getState() {
        return state;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setFd_id(String fd_id) {
        this.fd_id = fd_id;
    }

    public void setFirecares_id(String firecares_id) {
        this.firecares_id = firecares_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
