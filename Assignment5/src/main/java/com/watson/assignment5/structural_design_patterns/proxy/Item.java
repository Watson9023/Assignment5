package com.watson.assignment5.structural_design_patterns.proxy;

import java.util.Date;

/**
 * Created by Long on 4/1/2017.
 */
public abstract class Item {

    public void sayHello() {
        System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
    }
}
