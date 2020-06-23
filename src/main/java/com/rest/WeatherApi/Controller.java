package com.rest.WeatherApi;

import com.rest.WeatherApi.Entity.GetWeather;
import com.rest.WeatherApi.Service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/")
public class Controller {

    @Autowired
    private RestService service;

    @RequestMapping(value="getWeather",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.CREATED)
    GetWeather create(String cityName) {
        return service.getWeatherResponse(cityName);

    }

}