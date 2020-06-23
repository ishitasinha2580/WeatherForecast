package com.rest.WeatherApi.Service;

import com.rest.WeatherApi.Entity.GetWeather;
import com.rest.WeatherApi.RestTemplateClass;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.Map;

@Service
public class RestServiceUsage implements RestService {

    @Autowired
    RestTemplateClass restTemplate;

    public GetWeather getWeatherResponse(String cityName) {
        try {
            Map<String,String> reqParams= new HashMap<>();
            reqParams.put("cityName",cityName);
            GetWeather response = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q={cityName}&appid=240c162dbe599cc9bc44041e5c74ea32&units=metric",GetWeather.class,reqParams);
            return response;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}