package com.pluresidea.api.emergencyincident.entity;

public class Extended_data {
    private float dispatch_duration;
    private float event_duration;
    private float response_time;


    public float getDispatch_duration() {
        return dispatch_duration;
    }

    public float getEvent_duration() {
        return event_duration;
    }

    public float getResponse_time() {
        return response_time;
    }

    public void setDispatch_duration(float dispatch_duration) {
        this.dispatch_duration = dispatch_duration;
    }

    public void setEvent_duration(float event_duration) {
        this.event_duration = event_duration;
    }

    public void setResponse_time(float response_time) {
        this.response_time = response_time;
    }
}
