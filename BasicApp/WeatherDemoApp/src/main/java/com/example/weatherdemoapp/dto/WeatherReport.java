package com.example.weatherdemoapp.dto;

public record WeatherReport(
        String cityName,
        Double temperature,
        ClimateCondition condition
) {
}
