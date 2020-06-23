package com.rest.WeatherApi.Service;

import com.rest.WeatherApi.Entity.GetWeather;

public interface RestService {
    public GetWeather getWeatherResponse(String cityName);
}
