package com.watson.assignment5.test_creation_desgin.test_singleton_pattern;

import com.watson.assignment5.designpatternscreation.singletonPattern.SingletonPattern;
import junit.framework.Assert;
import org.junit.*;

/**
 * Created by Long on 4/2/2017.
 */
public class testSingletonPattern {
    public testSingletonPattern() {
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
    public void SingletonPatternTest() {
        //SingletonPattern singletonPattern
        Assert.assertEquals(SingletonPattern.getInstance(), SingletonPattern.getInstance());
    }
}
