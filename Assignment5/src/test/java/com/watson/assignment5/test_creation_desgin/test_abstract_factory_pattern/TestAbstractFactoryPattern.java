package com.watson.assignment5.test_creation_desgin.test_abstract_factory_pattern;


import com.watson.assignment5.designpatternscreation.AbstractFactoryPattern.AbstractFactory;
import com.watson.assignment5.designpatternscreation.AbstractFactoryPattern.Laptop_parts.LaptopParts;
import com.watson.assignment5.designpatternscreation.AbstractFactoryPattern.ManufactureFactory;
import junit.framework.Assert;
import org.junit.*;
/**
 * Created by Long on 4/1/2017.
 */
public class TestAbstractFactoryPattern {


        public TestAbstractFactoryPattern() {
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
        public void AbstractFactoryPatternTest() {
            AbstractFactory abstractFactory = new AbstractFactory();

            ManufactureFactory manufactureFactory = abstractFactory.getManufactureFactory("motherboard");
            LaptopParts computerParts = manufactureFactory.getLaptopParts("WRSi32Cpower");
            Assert.assertEquals(computerParts.toString(), computerParts.toString());

            ManufactureFactory manufactureFactoryCPU = abstractFactory.getManufactureFactory("cpu");
            LaptopParts computerPartsCPU = manufactureFactoryCPU.getLaptopParts("i3");
            Assert.assertEquals(computerPartsCPU.toString(), computerPartsCPU.toString());
        }
    }
