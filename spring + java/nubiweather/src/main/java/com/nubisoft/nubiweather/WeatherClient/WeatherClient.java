package com.nubisoft.nubiweather.WeatherClient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String WEATHER_URL = "http://api.weatherapi.com/v1/";
    private static final String API_KEY = "66bde51795a849a0b06143426242006";

    public String getCurrentWeatherClient(String city)
    {
        return restTemplate.getForObject(WEATHER_URL + "current.json?key=" + API_KEY + "&q=" + city + "&aqi=no", String.class);
    }
    public String getForecastWeatherClient(String city)
    {
        return restTemplate.getForObject(WEATHER_URL + "forecast.json?key=" + API_KEY + "&q=" + city + "&days=2&aqi=no&alerts=no", String.class);
    }
}
