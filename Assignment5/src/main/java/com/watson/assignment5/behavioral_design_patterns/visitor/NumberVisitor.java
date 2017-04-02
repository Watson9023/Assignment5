package com.watson.assignment5.behavioral_design_patterns.visitor;

import java.util.List;

/**
 * Created by Long on 4/1/2017.
 */
public interface NumberVisitor {
    public void visit(TwoElement TwoElement);

    public void visit(ThreeElement ThreeElement);

    public void visit(List<NumberElement> elementList);

}
