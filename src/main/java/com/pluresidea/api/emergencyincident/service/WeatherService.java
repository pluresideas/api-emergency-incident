package com.pluresidea.api.emergencyincident.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {

    private final RestTemplate restClient;

    @Autowired
    public WeatherService(RestTemplate restClient) {
        this.restClient = restClient;
    }

    public String weather() {

        ResponseEntity<String> rsp = restClient.getForEntity(
                "https://api.darksky.net/forecast/9669d3c89c15ae4a0295a9e5c7aa8d91/37.8267,-122.4233", String.class);

        return rsp.getBody();
    }
}
