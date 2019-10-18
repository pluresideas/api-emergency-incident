package com.pluresidea.api.emergencyincident.entity;

import javax.persistence.*;

@Entity
public class Description {

    @Id @GeneratedValue
    private int id;

    @Lob
    @Column( length = 100000 )
    private String comments;
    private String day_of_week;
    private String event_closed;
    private String event_id;
    private String event_opened;

    @OneToOne(cascade = CascadeType.PERSIST)
    Extended_data Extended_dataObject;

    private String first_unit_arrived;
    private String first_unit_dispatched;
    private String first_unit_enroute;
    private float hour_of_day;
    private String incident_number;
    private String loi_search_complete;
    private String subtype;
    private String type;

    public String getComments() {
        return comments;
    }

    public String getDay_of_week() {
        return day_of_week;
    }

    public String getEvent_closed() {
        return event_closed;
    }

    public String getEvent_id() {
        return event_id;
    }

    public String getEvent_opened() {
        return event_opened;
    }

    public Extended_data getExtended_data() {
        return Extended_dataObject;
    }

    public String getFirst_unit_arrived() {
        return first_unit_arrived;
    }

    public String getFirst_unit_dispatched() {
        return first_unit_dispatched;
    }

    public String getFirst_unit_enroute() {
        return first_unit_enroute;
    }

    public float getHour_of_day() {
        return hour_of_day;
    }

    public String getIncident_number() {
        return incident_number;
    }

    public String getLoi_search_complete() {
        return loi_search_complete;
    }

    public String getSubtype() {
        return subtype;
    }

    public String getType() {
        return type;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    public void setEvent_closed(String event_closed) {
        this.event_closed = event_closed;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public void setEvent_opened(String event_opened) {
        this.event_opened = event_opened;
    }

    public void setExtended_data(Extended_data extended_dataObject) {
        this.Extended_dataObject = extended_dataObject;
    }

    public void setFirst_unit_arrived(String first_unit_arrived) {
        this.first_unit_arrived = first_unit_arrived;
    }

    public void setFirst_unit_dispatched(String first_unit_dispatched) {
        this.first_unit_dispatched = first_unit_dispatched;
    }

    public void setFirst_unit_enroute(String first_unit_enroute) {
        this.first_unit_enroute = first_unit_enroute;
    }

    public void setHour_of_day(float hour_of_day) {
        this.hour_of_day = hour_of_day;
    }

    public void setIncident_number(String incident_number) {
        this.incident_number = incident_number;
    }

    public void setLoi_search_complete(String loi_search_complete) {
        this.loi_search_complete = loi_search_complete;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setType(String type) {
        this.type = type;
    }
}
