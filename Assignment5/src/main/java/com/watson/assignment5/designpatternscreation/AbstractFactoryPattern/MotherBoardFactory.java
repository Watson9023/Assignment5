package com.watson.assignment5.designpatternscreation.AbstractFactoryPattern;

import com.watson.assignment5.designpatternscreation.AbstractFactoryPattern.Laptop_parts.HardRockJ4F;
import com.watson.assignment5.designpatternscreation.AbstractFactoryPattern.Laptop_parts.LaptopParts;
import com.watson.assignment5.designpatternscreation.AbstractFactoryPattern.Laptop_parts.WRSi32Cpower;

/**
 * Created by Long on 4/1/2017.
 */
public  class MotherBoardFactory extends ManufactureFactory {
    //@Override
    public LaptopParts getLaptopParts(String type) {
        if ("WRSi32Cpower".equals(type)) {
            return new WRSi32Cpower();
        } else {
            return new HardRockJ4F();
        }
    }
}
