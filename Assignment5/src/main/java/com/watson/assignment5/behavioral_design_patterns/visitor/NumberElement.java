package com.watson.assignment5.behavioral_design_patterns.visitor;

/**
 * Created by Long on 4/1/2017.
 */
public interface NumberElement {
    public void accept(NumberVisitor visitor);
}
