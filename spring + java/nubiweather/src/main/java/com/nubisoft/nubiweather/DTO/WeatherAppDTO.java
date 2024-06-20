package com.nubisoft.nubiweather.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class WeatherAppDTO {
    @JsonProperty("location")
    private WeatherAppLocationDTO locationDTO;

    @JsonProperty("current")
    private WeatherAppCurrentDTO currentDTO;
}
