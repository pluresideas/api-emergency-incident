package com.pluresidea.api.emergencyincident.repository;

import com.pluresidea.api.emergencyincident.ApiEmergencyIncidentApplication;
import com.pluresidea.api.emergencyincident.entity.Incident;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiEmergencyIncidentApplication.class)
class IncidentRepositoryTest {

    @Autowired
    private IncidentRepository repository;

    @Test
    public void incidentRepository_returns_savedIncident() {

        Incident savedIncident = repository.save(new Incident());

        Incident retrievedIncident = repository.getOne(savedIncident.getId());

        assertNotNull(savedIncident.getId());
        assertEquals(savedIncident.getId(), retrievedIncident.getId());
    }
}