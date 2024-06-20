package com.nubisoft.nubiweather.controllers;

import com.nubisoft.nubiweather.DTO.currentDTOs.WeatherListDTO;
import com.nubisoft.nubiweather.DTO.currentDTOs.WeatherForecastDTO;
import com.nubisoft.nubiweather.DTO.forecastDTOs.WeatherForecastsListDTO;
import com.nubisoft.nubiweather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/realtime-weather")
    public WeatherListDTO getCurrentWeather()
    {
        return weatherService.getCombinedWeather();
    }

    @GetMapping("/forecast-weather")
    public WeatherForecastsListDTO getForecastWeather()
    {
        return weatherService.getForecastWeatherService();
    }
}
