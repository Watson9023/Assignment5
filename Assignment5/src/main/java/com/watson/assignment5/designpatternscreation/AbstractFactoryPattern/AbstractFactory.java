package com.watson.assignment5.designpatternscreation.AbstractFactoryPattern;

/**
 * Created by Long on 4/1/2017.
 */
public class AbstractFactory {

    public ManufactureFactory getManufactureFactory(String type) {
        if ("motherboard".toLowerCase().equals(type)) {
            return new MotherBoardFactory();
        } else {
            return new CpuFactory();
        }
    }
}
