package com.watson.assignment5.structural_design_patterns.adapter;

/**
 * Created by Long on 4/1/2017.
 */
public class ClassReporterForTempurature extends CelciusReporter implements TemperatureInformation {
   // @Override
    public double getTemperatureInC() {
        return temperatureInC;
    }

   // @Override
    public double getTemperatureInF() {
        return cToF(temperatureInC);
    }

   // @Override
    public void setTemperatureInC(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }

   // @Override
    public void setTemperatureInF(double temperatureInF) {
        this.temperatureInC = fToC(temperatureInF);
    }

    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }

}
