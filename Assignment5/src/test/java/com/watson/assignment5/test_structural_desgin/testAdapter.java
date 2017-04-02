package com.watson.assignment5.test_structural_desgin;

import com.watson.assignment5.structural_design_patterns.adapter.ClassReporterForTempurature;
import com.watson.assignment5.structural_design_patterns.adapter.TemperatureInformation;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Created by Long on 4/1/2017.
 */
public class testAdapter {
    public testAdapter() {
    }


    @Test
    public void adapterTest() {
        TemperatureInformation tempInfo = new ClassReporterForTempurature();
        tempInfo.setTemperatureInC(0);
        Assert.assertNotNull(tempInfo);
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
