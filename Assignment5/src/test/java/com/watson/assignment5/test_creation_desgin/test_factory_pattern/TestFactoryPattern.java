package com.watson.assignment5.test_creation_desgin.test_factory_pattern;

import com.watson.assignment5.designpatternscreation.factoryPattern._LaptopFactory;
import junit.framework.Assert;
import org.junit.*;

/**
 * Created by Long on 4/1/2017.
 */
public class TestFactoryPattern {
   // public class TestFactoryPattern {

        public TestFactoryPattern() {
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
        public void FactoryPatternTest() {
            _LaptopFactory  laptopFactory= new _LaptopFactory ();
            Assert.assertNotSame(laptopFactory.getLaptop("Toshiba"),laptopFactory.getLaptop("Acer"));
        }
    }


