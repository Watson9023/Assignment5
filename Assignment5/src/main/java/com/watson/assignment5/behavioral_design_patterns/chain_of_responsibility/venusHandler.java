package com.watson.assignment5.behavioral_design_patterns.chain_of_responsibility;

/**
 * Created by Long on 4/1/2017.
 */
public class venusHandler extends planetHandler {
    public void handleRequest(planetEnum request) {
        if (request == planetEnum.VENUS) {
            System.out.println("VenusHandler handles " + request);
            System.out.println("Venus is poisonous.\n");
        } else {
            System.out.println("VenusHandler doesn't handle " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
