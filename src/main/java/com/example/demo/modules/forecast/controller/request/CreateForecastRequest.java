package com.example.demo.modules.forecast.controller.request;

import com.example.demo.modules.forecast.model.Forecast;

public class CreateForecastRequest {
    public Forecast asForecast() {
        return new Forecast();
    }
}
