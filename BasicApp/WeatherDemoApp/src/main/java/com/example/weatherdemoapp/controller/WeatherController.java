package com.example.weatherdemoapp.controller;

import com.example.weatherdemoapp.dto.WeatherReport;
import com.example.weatherdemoapp.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService service;

    @GetMapping
    public WeatherReport getWeatherReport(@RequestParam String cityName) {
        return service.getWeatherReport(cityName);
    }
}
