package com.nubisoft.nubiweather.DTO;

import lombok.Getter;

@Getter
public class WeatherAppCurrentDTO {
    private WeatherAppConditionDTO conditionDTO;
    private float temp_c;
    private float temp_f;
    private float wind_mph;
    private float wind_kph;
    private String wind_dir;
    private float humidity;
    private float pressure_mb;
}
