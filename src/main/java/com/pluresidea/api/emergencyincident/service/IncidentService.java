package com.pluresidea.api.emergencyincident.service;

import com.pluresidea.api.emergencyincident.clinet.Currently;
import com.pluresidea.api.emergencyincident.clinet.Weather;
import com.pluresidea.api.emergencyincident.clinet.WeatherService;
import com.pluresidea.api.emergencyincident.dto.IncidentWithWeather;
import com.pluresidea.api.emergencyincident.entity.Incident;
import com.pluresidea.api.emergencyincident.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Component
public class IncidentService {

    private final IncidentRepository repository;
    private final WeatherService weatherService;

    @Autowired
    public IncidentService(IncidentRepository repository,
                           WeatherService weatherService) {
        this.repository = repository;
        this.weatherService = weatherService;
    }

    public List<Incident> findAll() {
        return repository.findAll();
    }

    public IncidentWithWeather findById(Integer id) throws ParseException {

        // TODO better handle optional
        Incident incident = repository.findById(id).get();
        if ( incident != null) {
            Weather weather = weatherService.weather(
                    incident.getAddress().getLatitude(),
                    incident.getAddress().getLongitude(),
                    toTime(incident.getDescription().getEvent_opened()));
            return new IncidentWithWeather(incident, weather.getCurrently());
        }
        return new IncidentWithWeather(new Incident(), new Currently());
    }

    long toTime(String eventOpened) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        return format.parse(eventOpened).getTime()/1000;
    }

    public Incident save(Incident incident) {
        return repository.save(incident);
    }
}
