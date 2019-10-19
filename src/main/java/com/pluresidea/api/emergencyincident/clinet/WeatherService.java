package com.pluresidea.api.emergencyincident.clinet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {

    private static final String WEATHER_SERVICE_URL = "https://api.darksky.net/forecast/%s/%s,%s,%s";

    private final RestTemplate restClient;
    private final String darkSkyApiKey;


    @Autowired
    public WeatherService(RestTemplate restClient, @Value("${darkSkyApiKey}") String darkSkyApiKey) {
        this.restClient = restClient;
        this.darkSkyApiKey = darkSkyApiKey;
    }

    public Weather weather(String latitude,String longitude,long time) {

        String url = String.format(WEATHER_SERVICE_URL, darkSkyApiKey, latitude, longitude, time);
        Weather rsp = restClient.getForObject(url, Weather.class);
        return rsp;
    }
}
