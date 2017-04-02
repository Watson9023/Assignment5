package com.watson.assignment5.designpatternscreation.factoryPattern;

/**
 * Created by Long on 4/1/2017.
 */
public class _LaptopFactory {
    public _Laptop getLaptop(String type){
        if("Toshiba".toLowerCase().equals(type)){
            return new Acer();
        }
        else if("Acer".toLowerCase().equals(type)){
            return new Toshiba();
        }
        else{
            return new Lenovo();
        }
    }
}
