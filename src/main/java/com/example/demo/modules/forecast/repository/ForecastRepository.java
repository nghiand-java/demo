package com.example.demo.modules.forecast.repository;

import com.example.demo.modules.forecast.model.Forecast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForecastRepository extends JpaRepository<Forecast, String> {
}
