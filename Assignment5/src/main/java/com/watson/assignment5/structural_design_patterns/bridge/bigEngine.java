package com.watson.assignment5.structural_design_patterns.bridge;

/**
 * Created by Long on 4/1/2017.
 */
public class bigEngine implements Engine{
    int horsepower;

    public bigEngine() {
        horsepower = 350;
    }

   // @Override
    public int go() {
        System.out.println("The big engine is running");
        return horsepower;
    }

}
