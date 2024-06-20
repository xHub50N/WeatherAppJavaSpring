package com.nubisoft.nubiweather.models;

import com.nubisoft.nubiweather.DTO.forecastDTOs.ForecastDayDTO;
import com.nubisoft.nubiweather.DTO.forecastDTOs.WeatherAppForecastDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class WeatherForecastModelDTO {
    private String name;
    private String country;
    private String localtime;
    private String text;
    private float temp_c;
    private float wind_kph;
    private String wind_dir;
    private float humidity;
    private float pressure_mb;
    private List<ForecastDayDTO> forecasts;
}
