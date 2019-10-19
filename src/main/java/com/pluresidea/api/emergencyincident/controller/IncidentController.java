package com.pluresidea.api.emergencyincident.controller;

import com.pluresidea.api.emergencyincident.dto.IncidentWithWeather;
import com.pluresidea.api.emergencyincident.entity.Incident;
import com.pluresidea.api.emergencyincident.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RequestMapping("/incidents")
@RestController
public class IncidentController {

    private final IncidentService service;

    @Autowired
    public IncidentController(IncidentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Incident> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public IncidentWithWeather get(@PathVariable Integer id) throws ParseException {
        return service.findById(id);
    }

    @PostMapping
    public Incident save(@RequestBody Incident incident) {
        return service.save(incident);
    }

}
