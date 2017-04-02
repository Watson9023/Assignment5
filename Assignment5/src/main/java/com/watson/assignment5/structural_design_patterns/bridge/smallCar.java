package com.watson.assignment5.structural_design_patterns.bridge;

/**
 * Created by Long on 4/1/2017.
 */
public class smallCar extends Vehicles {
    public smallCar(Engine engine) {
        this.weightInKilos = 600;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\nThe small car is driving");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
}
