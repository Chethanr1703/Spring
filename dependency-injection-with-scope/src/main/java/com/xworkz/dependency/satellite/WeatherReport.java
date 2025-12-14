package com.xworkz.dependency.satellite;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class WeatherReport {

    public WeatherReport() {
        System.out.println("WeatherReport default cons invoked");
    }

    @Value("8")
    private int reportId;

    @Value("Rain Forecast")
    private String forecast;

    @Autowired
    private Satellite satellite;
}
