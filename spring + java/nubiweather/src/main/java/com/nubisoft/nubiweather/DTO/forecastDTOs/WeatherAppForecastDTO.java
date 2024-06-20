package com.nubisoft.nubiweather.DTO.forecastDTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WeatherAppForecastDTO {
    private WeatherAppForecastDayPropertyDTO forecastDayPropertyDTO;

}
