package com.nubisoft.nubiweather.service;

import com.nubisoft.nubiweather.models.WeatherDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class WeatherService {
    private RestTemplate restTemplate = new RestTemplate();

    public WeatherDTO getWeather() {
        String response = restTemplate.getForObject("http://api.weatherapi.com/v1/current.json?key=66bde51795a849a0b06143426242006&q=Gliwice&aqi=no", String.class);
        log.info(response);
        return null;
    }

}
