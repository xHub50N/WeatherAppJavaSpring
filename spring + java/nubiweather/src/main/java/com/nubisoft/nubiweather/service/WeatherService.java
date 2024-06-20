package com.nubisoft.nubiweather.service;

import com.nubisoft.nubiweather.WeatherClient.WeatherClient;
import com.nubisoft.nubiweather.models.WeatherDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;
    private static final ArrayList<String> ARRAY_LIST_OF_CITIES = new ArrayList<>(Arrays.asList("Gliwice", "Hamburg"));
    
    public WeatherDTO getCurrentWeatherService() {
        return weatherClient.getCurrentWeatherClient("Gliwice");
    }

    public WeatherDTO getForecastWeatherService() {
        return weatherClient.getForecastWeatherClient("Gliwice");
    }

}
