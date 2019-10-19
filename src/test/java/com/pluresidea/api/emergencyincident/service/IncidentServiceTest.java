package com.pluresidea.api.emergencyincident.service;

import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class IncidentServiceTest {

    private IncidentService incidentService;

    @Before
    public void setup() {
        incidentService = new IncidentService(null, null);
    }

    @Test
    public void toTime() throws ParseException {

        // Oct 19 2019 18:45:00	GMT +03:00 ~ 1571499900

        long time = incidentService.toTime("2019-10-19T18:45:00+03:00");

        assertEquals(1571499900, time);
    }
}