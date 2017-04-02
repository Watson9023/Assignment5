package com.watson.assignment5.behavioral_design_patterns.chain_of_responsibility;

/**
 * Created by Long on 4/1/2017.
 */
public class earthHandler extends planetHandler {

    public void handleRequest(planetEnum request) {
        if (request == planetEnum.EARTH) {
            System.out.println("EarthHandler handles " + request);
            System.out.println("Earth is comfortable.\n");
        } else {
            System.out.println("EarthHandler doesn't handle " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
