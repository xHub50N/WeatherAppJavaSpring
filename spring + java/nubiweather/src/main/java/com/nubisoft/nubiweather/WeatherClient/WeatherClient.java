package com.nubisoft.nubiweather.WeatherClient;

import com.nubisoft.nubiweather.DTO.currentDTOs.WeatherAppDTO;
import com.nubisoft.nubiweather.DTO.currentDTOs.WeatherForecastDTO;
import com.nubisoft.nubiweather.DTO.forecastDTOs.ForecastDayDTO;
import com.nubisoft.nubiweather.DTO.forecastDTOs.WeatherAppForecastDayPropertyDTO;
import com.nubisoft.nubiweather.DTO.forecastDTOs.WeatherForecastsAppDTO;
import com.nubisoft.nubiweather.models.WeatherDTO;
import com.nubisoft.nubiweather.models.WeatherForecastModelDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

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
    public WeatherForecastModelDTO getForecastWeatherClient(String city)
    {
        WeatherForecastsAppDTO weatherAppDTO = callGetMethod(WEATHER_URL + "forecast.json?key=" + API_KEY + "&q=" + city +
                "&days=2&aqi=no&alerts=no", WeatherForecastsAppDTO.class ,API_KEY);

        return WeatherForecastModelDTO.builder()
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
