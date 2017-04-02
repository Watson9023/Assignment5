
package com.watson.assignment5.test_behavioral_design_patterns;

import com.watson.assignment5.behavioral_design_patterns.visitor.NumberElement;
import com.watson.assignment5.behavioral_design_patterns.visitor.ThreeElement;
import com.watson.assignment5.behavioral_design_patterns.visitor.TwoElement;
import junit.framework.TestSuite;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertNotNull;


/**
 * Created by Long/watson on 4/1/2017.
 */
public class testVisitor extends TestSuite{

    public testVisitor() {
    }

    @Test
    public void visitorTest () {

        TwoElement two1 = new TwoElement(3, 3);
        TwoElement two2 = new TwoElement(2, 7);
        ThreeElement three1 = new ThreeElement(3, 4, 5);

        List<NumberElement> numberElements = new ArrayList<NumberElement>();
        numberElements.add(two1);
        numberElements.add(two2);
        numberElements.add(three1);

        assertNotNull(numberElements);

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeClass
    public static void setUpMethod() throws Exception {
    }

    @AfterClass
    public static void tearDownMethod() throws Exception {
    }

}

