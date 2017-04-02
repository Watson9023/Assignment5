package com.watson.assignment5.behavioral_design_patterns.chain_of_responsibility;

/**
 * Created by Long on 4/1/2017.
 */
public abstract class planetHandler {
    planetHandler successor;

    public void setSuccessor(planetHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(planetEnum request);
}
