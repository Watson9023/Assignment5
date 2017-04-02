package com.watson.assignment5.structural_design_patterns.adapter;

/**
 * Created by Long on 4/1/2017.
 */
public class CelciusReporter {
    double temperatureInC;

    public CelciusReporter() {
    }

    public double getTemperature() {
        return temperatureInC;
    }

    public void setTemperature(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }

}
