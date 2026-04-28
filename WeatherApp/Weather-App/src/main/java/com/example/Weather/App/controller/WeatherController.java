package com.example.Weather.App.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Weather.App.dto.WeatherDTO;
import com.example.Weather.App.service.WeatherService;


@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService service;

    @GetMapping("/{city}")
    public WeatherDTO getWeather(@PathVariable String city) {
        return service.getWeather(city);
    }
}



