package com.nubisoft.nubiweather.DTO.forecastDTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class WeatherForecastsAppDTO {
    @JsonProperty("location")
    private WeatherAppLocationDTO locationDTO;

    @JsonProperty("current")
    private WeatherAppCurrentDTO currentDTO;

}
