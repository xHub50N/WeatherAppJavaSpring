package com.nubisoft.nubiweather.WeatherClient;

import com.nubisoft.nubiweather.DTO.WeatherAppDTO;
import com.nubisoft.nubiweather.models.WeatherDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String WEATHER_URL = "http://api.weatherapi.com/v1/";
    private static final String API_KEY = "66bde51795a849a0b06143426242006";

    public WeatherDTO getCurrentWeatherClient(String city)
    {
        WeatherAppDTO weatherAppDTO =  callGetMethod(WEATHER_URL + "current.json?key=" + API_KEY + "&q=" + city + "&aqi=no", WeatherAppDTO.class);

        return WeatherDTO.builder()
                .name(weatherAppDTO.getLocationDTO().getName())
                .country(weatherAppDTO.getLocationDTO().getCountry())
                .localtime(weatherAppDTO.getLocationDTO().getLocaltime())
                .text(weatherAppDTO.getCurrentDTO().getCondition().getText())
                .temp_c(weatherAppDTO.getCurrentDTO().getTemp_c())
                .wind_kph(weatherAppDTO.getCurrentDTO().getWind_kph())
                .humidity(weatherAppDTO.getCurrentDTO().getHumidity())
                .build();
    }
    public WeatherDTO getForecastWeatherClient(String city)
    {
        WeatherAppDTO weatherAppDTO = callGetMethod(WEATHER_URL + "forecast.json?key=" + API_KEY + "&q=" + "Gliwice" +
                "&days=2&aqi=no&alerts=no", WeatherAppDTO.class ,API_KEY);

        return WeatherDTO.builder()
                .name(weatherAppDTO.getLocationDTO().getName())
                .country(weatherAppDTO.getLocationDTO().getCountry())
                .localtime(weatherAppDTO.getLocationDTO().getLocaltime())
                .text(weatherAppDTO.getCurrentDTO().getCondition().getText())
                .temp_c(weatherAppDTO.getCurrentDTO().getTemp_c())
                .wind_kph(weatherAppDTO.getCurrentDTO().getWind_kph())
                .humidity(weatherAppDTO.getCurrentDTO().getHumidity())
                .build();
    }
    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects)
    {
        return restTemplate.getForObject(url, responseType, objects);
    }
}
