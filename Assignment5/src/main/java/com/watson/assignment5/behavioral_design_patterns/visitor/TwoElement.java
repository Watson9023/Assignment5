package com.watson.assignment5.behavioral_design_patterns.visitor;

/**
 * Created by Long on 4/1/2017.
 */
public class TwoElement implements NumberElement {
    int a;
    int b;

    public TwoElement(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //@Override
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }

}
