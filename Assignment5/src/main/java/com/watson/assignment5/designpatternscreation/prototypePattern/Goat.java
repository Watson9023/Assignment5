package com.watson.assignment5.designpatternscreation.prototypePattern;

/**
 * Created by Long on 4/1/2017.
 */
public class Goat implements protoType {
    String sound;

    public Goat(String sound) {
        this.sound = sound;
    }

   // @Override
    public protoType doClone() {
        return new Goat(sound);
    }

    @Override
    public String toString() {
        return "This cat says " + sound;
    }
}
