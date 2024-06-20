package com.nubisoft.nubiweather.DTO.currentDTOs;

import com.nubisoft.nubiweather.models.WeatherDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class WeatherForecastDTO {
    private List<WeatherDTO> weatherForecast;

}
