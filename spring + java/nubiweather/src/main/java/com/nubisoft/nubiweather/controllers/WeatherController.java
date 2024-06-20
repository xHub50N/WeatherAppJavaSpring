package com.nubisoft.nubiweather.controllers;

import com.nubisoft.nubiweather.models.WeatherDTO;
import com.nubisoft.nubiweather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/realtime-weather")
    public WeatherDTO getWeather()
    {
        return weatherService.getWeather();
    }
}
