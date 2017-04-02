package com.watson.assignment5.structural_design_patterns.proxy;

/**
 * Created by Long on 4/1/2017.
 */
public class slowItem extends Item {
    public slowItem() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
