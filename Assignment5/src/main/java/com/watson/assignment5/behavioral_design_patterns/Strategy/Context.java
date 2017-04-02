package com.watson.assignment5.behavioral_design_patterns.Strategy;

/**
 * Created by Long on 4/1/2017.
 */
public class Context {
    int temperatureInF;
    _Strategy strategy;

    public Context(int temperatureInF, _Strategy strategy) {
        this.temperatureInF = temperatureInF;
        this.strategy = strategy;
    }

    public void setStrategy(_Strategy strategy) {
        this.strategy = strategy;
    }

    public int getTemperatureInF() {
        return temperatureInF;
    }

    public boolean getResult() {
        return strategy.checkTemperature(temperatureInF);
    }
}
