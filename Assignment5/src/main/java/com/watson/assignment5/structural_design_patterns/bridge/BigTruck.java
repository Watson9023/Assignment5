package com.watson.assignment5.structural_design_patterns.bridge;

/**
 * Created by Long on 4/1/2017.
 */
public class BigTruck extends Vehicles {
    public BigTruck(Engine engine) {
        this.weightInKilos = 3000;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\nThe big bus is driving");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
}
