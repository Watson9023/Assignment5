package com.watson.assignment5.test_behavioral_design_patterns;

import com.watson.assignment5.behavioral_design_patterns.Strategy.Context;
import com.watson.assignment5.behavioral_design_patterns.Strategy._Strategy;
import com.watson.assignment5.behavioral_design_patterns.Strategy.skiStrategy;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Long on 4/1/2017.
 */
public class testStrategy  {
    public testStrategy() {
    }


    @Test
    public void testStrategy() {
        int temperatureInF = 60;

        _Strategy skiStrategy = new skiStrategy();
        Context context = new Context(temperatureInF, skiStrategy);

        Assert.assertNotNull(context);
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
}
