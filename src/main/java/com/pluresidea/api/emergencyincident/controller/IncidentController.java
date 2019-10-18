package com.pluresidea.api.emergencyincident.controller;

import com.pluresidea.api.emergencyincident.entity.Incident;
import com.pluresidea.api.emergencyincident.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/incident")
@RestController
public class IncidentController {

    private final IncidentRepository repository;

    @Autowired
    public IncidentController(IncidentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public Incident get(@PathVariable Long id) {
        return new Incident();
    }

    @PostMapping("")
    public Incident save(@RequestBody Incident incident) {
        return repository.save(incident);
    }

}
