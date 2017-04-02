package com.watson.assignment5.test_behavioral_design_patterns;

import com.watson.assignment5.behavioral_design_patterns.chain_of_responsibility.*;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Long on 4/1/2017.
 */
public class TestchainOfResponsibility {
   // public ChainOfResponsibilityTest() {
    //}


    @Test
    public void chainOfResponsibilityTest() {

        planetHandler chain = setUpChain();
        chain.handleRequest(planetEnum.VENUS);
        chain.handleRequest(planetEnum.MERCURY);
        chain.handleRequest(planetEnum.EARTH);
        chain.handleRequest(planetEnum.JUPITER);

        Assert.assertNotNull(chain);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

   // @BeforeMethod
    public void setUpMethod() throws Exception {
    }

   // @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    private planetHandler setUpChain() {
        planetHandler mercuryHandler = new mecuryHandler();
        planetHandler venusHandler = new venusHandler();
        planetHandler earthHandler = new earthHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);

        return mercuryHandler;
    }
}
