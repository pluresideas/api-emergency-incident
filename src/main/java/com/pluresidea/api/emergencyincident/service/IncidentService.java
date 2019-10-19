package com.pluresidea.api.emergencyincident.service;

import com.pluresidea.api.emergencyincident.clinet.Weather;
import com.pluresidea.api.emergencyincident.clinet.WeatherService;
import com.pluresidea.api.emergencyincident.dto.IncidentWithWeather;
import com.pluresidea.api.emergencyincident.entity.Incident;
import com.pluresidea.api.emergencyincident.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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

    public IncidentWithWeather findById(Integer id) {
        Weather weather = weatherService.weather("37.8267", "-122.4233", 971161627);
        Optional<Incident> incident = repository.findById(id);
        // TODO handle optional
        return new IncidentWithWeather(incident.get(), weather.getCurrently());
    }

    public Incident save(Incident incident) {
        return repository.save(incident);
    }
}
