package com.watson.assignment5.test_structural_desgin;

import com.watson.assignment5.structural_design_patterns.bridge.BigTruck;
import com.watson.assignment5.structural_design_patterns.bridge.Vehicles;
import com.watson.assignment5.structural_design_patterns.bridge.smallCar;
import com.watson.assignment5.structural_design_patterns.bridge.smallEngine;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Created by Long on 4/1/2017.
 */
public class testBridge {

    public class BridgeTest {

        public BridgeTest() {
        }


         @Test
        public void bridgeTest() {
            Vehicles vehicle1 = new BigTruck(new smallEngine());
            Vehicles vehicle2 = new smallCar(new smallEngine());
            Assert.assertNotSame(vehicle1, vehicle2);
        }
        //public static void
        @BeforeClass
        public  void setUpClass() throws Exception {
        }
        //public static void
        @AfterClass
        public  void tearDownClass() throws Exception {
        }

       // @BeforeMethod
        public void setUpMethod() throws Exception {
        }

      //  @AfterMethod
        public void tearDownMethod() throws Exception {
        }
    }
}