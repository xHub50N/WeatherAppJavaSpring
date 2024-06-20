package com.nubisoft.nubiweather.models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WeatherDTO {
    private String name;
    private String country;
    private String localtime;
    private String text;
    private float temp_c;
    private float wind_kph;
    private String wind_dir;
    private float humidity;
    private float pressure_mb;
}
