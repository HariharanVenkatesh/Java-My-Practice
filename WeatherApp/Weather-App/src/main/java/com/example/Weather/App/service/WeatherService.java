package com.example.Weather.App.service;


import com.example.Weather.App.dto.WeatherDTO;
import com.example.Weather.App.model.WeatherTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
//import com.example.Weather.App.repository.WeatherRepo;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class WeatherService {

    @Autowired


    @Value("${weather.api.key}")
    private String apiKey;

    public WeatherDTO getWeather(String city) {

        Map data = fetchWeather(city);

        if (data == null) {
            throw new RuntimeException("API not working");
        }

        String cityName = (String) data.get("cityName");

        double weather = (Double) data.get("temperature");

        String description = (String) data.get("condition");

        WeatherTable entity = new WeatherTable();
        entity.setCityName(cityName);
        entity.setTemperature(weather);
        entity.setDescription(description);

           return new WeatherDTO(
                entity.getCityName(),
                entity.getTemperature(),
                entity.getDescription()
        );
    }

    public Map fetchWeather(String city) {

        String url = "http://localhost:8990/weather?cityName="
                + city;

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, Map.class);
    }
}