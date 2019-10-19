package com.pluresidea.api.emergencyincident.controller;

import com.pluresidea.api.emergencyincident.entity.Incident;
import com.pluresidea.api.emergencyincident.repository.IncidentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IncidentControllerTest {

    @Autowired
    private IncidentRepository repository;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getAll() {

        //TODO the repeat of below....
    }

    @Test
    public void get() {

        Integer savedIncidentId = repository.save(new Incident()).getId();

        Incident incident = restTemplate.getForObject("http://localhost:" + port + "/incidents/" + savedIncidentId, Incident.class);

        assertEquals(savedIncidentId, incident.getId());
    }

    @Test
    public void save() {

        Incident incident = restTemplate.postForObject("http://localhost:" + port + "/incidents/", new Incident(), Incident.class);
        assertNotNull(incident.getId());

        Integer id = repository.getOne(incident.getId()).getId();

        assertEquals(incident.getId(), id);
    }
}