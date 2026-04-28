package com.example.weatherdemoapp.service;

import com.example.weatherdemoapp.dto.ClimateCondition;
import com.example.weatherdemoapp.dto.WeatherReport;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WeatherService {

    public WeatherReport getWeatherReport(String cityName) {

        return new WeatherReport(cityName, RandomUtils.nextDouble(20, 40), ClimateCondition.RAINY);

    }
}
