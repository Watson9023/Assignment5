package com.watson.assignment5.behavioral_design_patterns.Strategy;

/**
 * Created by Long on 4/1/2017.
 */
public class hikeStrategy implements _Strategy {
  //  @Override
    public boolean checkTemperature(int temperatureInF) {
        if ((temperatureInF >= 50) && (temperatureInF <= 90)) {
            return true;
        } else {
            return false;
        }
    }
}
