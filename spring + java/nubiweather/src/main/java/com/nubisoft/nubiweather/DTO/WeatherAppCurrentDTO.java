package com.nubisoft.nubiweather.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class WeatherAppCurrentDTO {
    private float temp_c;
    private float temp_f;
    @JsonProperty("condition")
    private WeatherAppConditionDTO condition;
    private float wind_mph;
    private float wind_kph;
    private String wind_dir;
    private float humidity;
    private float pressure_mb;
}
