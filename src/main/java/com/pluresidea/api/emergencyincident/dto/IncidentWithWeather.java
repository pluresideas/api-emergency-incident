package com.pluresidea.api.emergencyincident.dto;

import com.pluresidea.api.emergencyincident.clinet.Currently;
import com.pluresidea.api.emergencyincident.entity.Incident;

public class IncidentWithWeather {

    private final Incident incident;
    private final Currently weather;

    public IncidentWithWeather(Incident incident, Currently weather) {
        this.incident = incident;
        this.weather = weather;
    }

    public Incident getIncident() {
        return incident;
    }

    public Currently getWeather() {
        return weather;
    }
}
