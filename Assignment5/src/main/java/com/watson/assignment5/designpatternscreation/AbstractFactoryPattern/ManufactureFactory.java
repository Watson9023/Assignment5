package com.watson.assignment5.designpatternscreation.AbstractFactoryPattern;

import com.watson.assignment5.designpatternscreation.AbstractFactoryPattern.Laptop_parts.LaptopParts;

/**
 * Created by Long on 4/1/2017.
 */
public abstract class ManufactureFactory {
    public abstract LaptopParts getLaptopParts(String type);
}
