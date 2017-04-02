package com.watson.assignment5.behavioral_design_patterns.visitor;
import java.util.List;
/**
 * Created by Long on 4/1/2017.
 */

public class TotalSumVisitor implements NumberVisitor {
    int totalSum = 0;

   //@Override
    public void visit(TwoElement twoElement) {
        int sum = twoElement.a + twoElement.b;
        System.out.println("Adding " + twoElement.a + "+" + twoElement.b + "=" + sum + " to total");
        totalSum += sum;
    }

  // @Override
    public void visit(ThreeElement threeElement) {
        int sum = threeElement.a + threeElement.b + threeElement.c;
        System.out.println("Adding " + threeElement.a +"+" + threeElement.a + "+" + threeElement.b +  "+" + threeElement.b + "+" + threeElement.c + "=" + sum + " to total");
        totalSum += sum;
    }

   // @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement ne : elementList) {
            ne.accept(this);
        }
    }

    public int getTotalSum() {
        return totalSum;
    }
}
