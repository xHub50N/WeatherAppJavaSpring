package com.nubisoft.nubiweather.service;

import com.nubisoft.nubiweather.DTO.WeatherListDTO;
import com.nubisoft.nubiweather.DTO.WeatherForecastDTO;
import com.nubisoft.nubiweather.WeatherClient.WeatherClient;
import com.nubisoft.nubiweather.models.WeatherDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;
    private static final ArrayList<String> ARRAY_LIST_OF_CITIES = new ArrayList<>(Arrays.asList("Gliwice", "Hamburg"));

    public WeatherListDTO getCombinedWeather() {
        List<WeatherDTO> currentWeather = ARRAY_LIST_OF_CITIES.stream()
                .map(weatherClient::getCurrentWeatherClient)
                .collect(Collectors.toList());
        ;
        return WeatherListDTO.builder()
                .currentWeather(currentWeather)
                .build();
    }

    public WeatherForecastDTO getForecastWeatherService() {
        List<WeatherDTO> currentWeather = ARRAY_LIST_OF_CITIES.stream()
                .map(weatherClient::getForecastWeatherClient)
                .collect(Collectors.toList());

        return WeatherForecastDTO.builder()
                .weatherForecast(currentWeather)
                .build();
    }

}
