package com.example.demo.modules.forecast.service.impl;

import com.example.demo.modules.forecast.controller.request.CreateForecastRequest;
import com.example.demo.modules.forecast.repository.ForecastRepository;
import com.example.demo.modules.forecast.service.ForecastService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ForecastServiceImpl implements ForecastService {

    private final ForecastRepository forecastRepository;

    @Override
    public void createForecast(CreateForecastRequest request) {
        forecastRepository.save(request.asForecast());
    }
}
