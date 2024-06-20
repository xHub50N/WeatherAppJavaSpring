package com.nubisoft.nubiweather.controllers;

import com.nubisoft.nubiweather.DTO.WeatherListDTO;
import com.nubisoft.nubiweather.DTO.WeatherForecastDTO;
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
    public WeatherForecastDTO getForecastWeather()
    {
        return weatherService.getForecastWeatherService();
    }
}
