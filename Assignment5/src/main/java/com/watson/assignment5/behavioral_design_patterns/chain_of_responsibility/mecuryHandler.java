package com.watson.assignment5.behavioral_design_patterns.chain_of_responsibility;

/**
 * Created by Long on 4/1/2017.
 */
public class mecuryHandler extends planetHandler {
    public void handleRequest(planetEnum request) {
        if (request == planetEnum.MERCURY) {
            System.out.println("MercuryHandler handles " + request);
            System.out.println("Mercury is hot.\n");
        } else {
            System.out.println("MercuryHandler doesn't handle " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
