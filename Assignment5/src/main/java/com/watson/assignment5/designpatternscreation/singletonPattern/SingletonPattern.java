package com.watson.assignment5.designpatternscreation.singletonPattern;

/**
 * Created by Long on 4/2/2017.
 */
public class SingletonPattern {
    private static SingletonPattern singletonPattern = null;

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }

    public void PrintSingletonPattern() {
        System.out.println("This is a Singleton Pattern");
    }
}
