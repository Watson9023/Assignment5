package com.watson.assignment5.structural_design_patterns.adapter;

/**
 * Created by Long on 4/1/2017.
 */
public interface TemperatureInformation {

    public double getTemperatureInF();

    public void setTemperatureInF(double temperatureInF);

    public double getTemperatureInC();

    public void setTemperatureInC(double temperatureInC);
}
