package com.pluresidea.api.emergencyincident.service;

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

    public Optional<Incident> findById(Integer id) {
        System.out.println(weatherService.weather());
        return repository.findById(id);
    }

    public Incident save(Incident incident) {
        return repository.save(incident);
    }
}
