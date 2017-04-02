package com.watson.assignment5.designpatternscreation.AbstractFactoryPattern;

import com.watson.assignment5.designpatternscreation.AbstractFactoryPattern.Laptop_parts.I3Cpu;
import com.watson.assignment5.designpatternscreation.AbstractFactoryPattern.Laptop_parts.I6Cpu;
import com.watson.assignment5.designpatternscreation.AbstractFactoryPattern.Laptop_parts.LaptopParts;
/**
 * Created by Long on 4/1/2017.
 */
public class CpuFactory extends ManufactureFactory{
    @Override
    public LaptopParts getLaptopParts(String type) {
        if ("i5".equals(type)) {
            return new I3Cpu();
        } else {
            return new I6Cpu();
        }
    }
}
