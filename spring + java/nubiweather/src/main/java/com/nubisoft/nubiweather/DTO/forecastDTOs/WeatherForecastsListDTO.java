package com.nubisoft.nubiweather.DTO.forecastDTOs;

import com.nubisoft.nubiweather.models.WeatherDTO;
import com.nubisoft.nubiweather.models.WeatherForecastModelDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class WeatherForecastsListDTO {
    private List<WeatherForecastModelDTO> currentWeather;

}
