package com.watson.assignment5.behavioral_design_patterns.visitor;

/**
 * Created by Long on 4/1/2017.
 */
public class ThreeElement implements NumberElement {


        int a;
        int b;
        int c;

        public ThreeElement(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
}

    // @Override
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }
    }



