package com.watson.assignment5.structural_design_patterns.bridge;

/**
 * Created by Long on 4/1/2017.
 */
public class smallEngine implements com.watson.assignment5.structural_design_patterns.bridge.Engine {
    int horsepower;

    public smallEngine() {
        horsepower = 100;
    }

   // @Override
    public int go() {
        System.out.println("The small engine is running");
        return horsepower;
    }
}
