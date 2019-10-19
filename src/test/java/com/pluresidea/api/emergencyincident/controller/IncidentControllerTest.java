package com.pluresidea.api.emergencyincident.controller;

import com.pluresidea.api.emergencyincident.entity.Address;
import com.pluresidea.api.emergencyincident.entity.Description;
import com.pluresidea.api.emergencyincident.entity.Incident;
import com.pluresidea.api.emergencyincident.repository.IncidentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {"darkSkyApiKey = 123"})
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

        // TODO weather web service needs to be mocked so it si not invoked during the test. ran out of time...
//        Incident inc = new Incident();
//        Address address = new Address();
//        address.setLatitude(37.8267F);
//        address.setLatitude(-122.4233F);
//        address.setAddress_id("100");
//        inc.setAddress(address);
//        Description description = new Description();
//        description.setEvent_opened("2017-05-15T13:19:12-04:00");
//        inc.setDescription(description);
//        Integer savedIncidentId = repository.save(inc).getId();
//
//        Incident incident = restTemplate.getForObject("http://localhost:" + port + "/incidents/" + savedIncidentId, Incident.class);
//
//        assertEquals(savedIncidentId, incident.getId());
    }

    @Test
    public void save() {

        Incident incident = restTemplate.postForObject("http://localhost:" + port + "/incidents/", new Incident(), Incident.class);
        assertNotNull(incident.getId());

        Integer id = repository.getOne(incident.getId()).getId();

        assertEquals(incident.getId(), id);
    }
}