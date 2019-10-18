package com.pluresidea.api.emergencyincident.controller;

import com.pluresidea.api.emergencyincident.entity.Incident;
import com.pluresidea.api.emergencyincident.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/incidents")
@RestController
public class IncidentController {

    private final IncidentRepository repository;

    @Autowired
    public IncidentController(IncidentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Incident> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Incident> get(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @PostMapping
    public Incident save(@RequestBody Incident incident) {
        return repository.save(incident);
    }

}
