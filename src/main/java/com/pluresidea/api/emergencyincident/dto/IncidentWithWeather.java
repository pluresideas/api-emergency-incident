package com.pluresidea.api.emergencyincident.dto;

import com.pluresidea.api.emergencyincident.entity.Incident;

public class IncidentWithWeather {

    private final Incident incident;
    private final String weather;

    public IncidentWithWeather(Incident incident, String weather) {
        this.incident = incident;
        this.weather = weather;
    }

    public Incident getIncident() {
        return incident;
    }

    public String getWeather() {
        return weather;
    }
}
