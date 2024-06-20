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
        for(String city : ARRAY_LIST_OF_CITIES) {
            String response = weatherClient.getCurrentWeatherClient(city);
            log.info(response);
        }
        return null;
    }

    public WeatherDTO getForecastWeatherService() {
        for(String city : ARRAY_LIST_OF_CITIES) {
            String response = weatherClient.getForecastWeatherClient(city);
            log.info(response);
        }
        return null;
    }

}
