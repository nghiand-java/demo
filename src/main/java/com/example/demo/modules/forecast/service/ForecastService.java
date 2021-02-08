package com.example.demo.modules.forecast.service;

import com.example.demo.modules.forecast.controller.request.CreateForecastRequest;

public interface ForecastService {

    public void createForecast(CreateForecastRequest request);
}
