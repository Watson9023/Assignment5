package com.watson.assignment5.test_creation_desgin.test_prototype_pattern;

import com.watson.assignment5.designpatternscreation.prototypePattern.Vehicle;
import junit.framework.Assert;
import org.junit.*;
/**
 * Created by Long on 4/1/2017.
 */
public class TestPrototypePattern {

    public TestPrototypePattern() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

   @AfterClass
    public static void tearDownClass() {
    }

   @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void PrototypePatternTest() {
       Vehicle v1 = new Vehicle("VW");
      Vehicle v2 = (Vehicle) v1.doClone();
        Assert.assertEquals(v1.toString(),v2.toString());
    }

}
