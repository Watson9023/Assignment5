package com.watson.assignment5.structural_design_patterns.adapter;

/**
 * Created by Long on 4/1/2017.
 */
public  class ObjectReporterForTemprature implements TemperatureInformation {
    CelciusReporter celciusReporter;

    public ObjectReporterForTemprature() {
        celciusReporter = new CelciusReporter();
    }

    //@Override
    public double getTemperatureInC() {
        return celciusReporter.getTemperature();
    }

   // @Override
    public double getTemperatureInF() {
        return cToF(celciusReporter.getTemperature());
    }

   // @Override
    public void setTemperatureInC(double temperatureInC) {
        celciusReporter.setTemperature(temperatureInC);
    }

   // @Override
    public void setTemperatureInF(double temperatureInF) {
        celciusReporter.setTemperature(fToC(temperatureInF));
    }

    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }

}
