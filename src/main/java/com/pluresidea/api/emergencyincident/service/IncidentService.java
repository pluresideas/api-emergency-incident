package com.pluresidea.api.emergencyincident.service;

import com.pluresidea.api.emergencyincident.clinet.Currently;
import com.pluresidea.api.emergencyincident.clinet.Weather;
import com.pluresidea.api.emergencyincident.clinet.WeatherService;
import com.pluresidea.api.emergencyincident.dto.IncidentWithWeather;
import com.pluresidea.api.emergencyincident.entity.Incident;
import com.pluresidea.api.emergencyincident.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class IncidentService {

    private final IncidentRepository repository;
    private final String darkSkyApiKey;
    private final WeatherService weatherService;

    @Autowired
    public IncidentService(IncidentRepository repository,
                           @Value("${darkSkyApiKey}") String darkSkyApiKey,
                           WeatherService weatherService) {
        this.repository = repository;
        this.darkSkyApiKey = darkSkyApiKey;
        this.weatherService = weatherService;
    }

    public List<Incident> findAll() {
        return repository.findAll();
    }

    public IncidentWithWeather findById(Integer id) {
        Weather weather = weatherService.weather();
        Optional<Incident> incident = repository.findById(id);
        // TODO handle optional
        return new IncidentWithWeather(incident.get(), weather.getCurrently());
    }

    public Incident save(Incident incident) {
        return repository.save(incident);
    }
}
