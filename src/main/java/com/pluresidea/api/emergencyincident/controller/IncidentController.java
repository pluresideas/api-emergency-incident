package com.pluresidea.api.emergencyincident.controller;

import com.pluresidea.api.emergencyincident.entity.Incident;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/incident")
@RestController
public class IncidentController {


    @GetMapping("/{id}")
    public Incident get(@PathVariable Long id) {

        return new Incident();
    }

}
