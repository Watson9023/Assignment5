package com.watson.assignment5.designpatternscreation.prototypePattern;

/**
 * Created by Long on 4/1/2017.
 */
public class Vehicle implements protoType{
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

   // @Override
    public protoType doClone() {
        return new Vehicle(name);
    }

    @Override
    public String toString() {
        return "This vehicle is named " + name;
    }

}
