package com.watson.assignment5.test_structural_desgin;

import com.watson.assignment5.structural_design_patterns.proxy.Proxy;
import com.watson.assignment5.structural_design_patterns.proxy.quickItem;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
/**
 * Created by Long on 4/1/2017.
 */
public class testProxy  {

    public testProxy() {
    }


    public void proxyTest() {
        Proxy proxy = new Proxy();

        quickItem quickItem = new quickItem();

        Assert.assertNotSame(quickItem, proxy);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    //@BeforeMethod
    public void setUpMethod() throws Exception {
    }

    //@AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
