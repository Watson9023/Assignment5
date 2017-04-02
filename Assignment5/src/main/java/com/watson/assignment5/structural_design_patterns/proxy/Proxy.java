package com.watson.assignment5.structural_design_patterns.proxy;

import java.util.Date;

/**
 * Created by Long on 4/1/2017.
 */
public class Proxy {
   slowItem slowItem;

    public Proxy() {
        System.out.println("Creating proxy at " + new Date());
    }

    public void sayHello() {
        if (slowItem == null) {
            slowItem = new slowItem();
        }
        slowItem.sayHello();
    }

}
